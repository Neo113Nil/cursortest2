package air.com.playtika.android.common;

import air.com.playtika.android.common.GameRenderer;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import androidx.core.util.Consumer;
import com.getcapacitor.MessageHandler;

/* loaded from: classes8.dex */
public class GameSurfaceView implements SurfaceHolder.Callback {
    private static final String TAG = "GameSurfaceView";
    private final GameRenderer gameRenderer;
    private final InputMethodManager imm;
    private final InitOptions options;
    private final SharedSdkContext sharedSdkContext;
    public final GameView view;
    private MessageHandler messageHandler = null;
    private boolean isShuttingDown = false;

    private int getAndroidInputType(int i) {
        return i != 1 ? 145 : 2;
    }

    public static class GameView extends SurfaceView {
        private GameSurfaceView gameSurfaceView;
        private UniversalDelInputConnection inputConnection;
        public int inputType;

        public GameView(Context context) {
            super(context);
            this.inputType = 145;
        }

        public GameView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.inputType = 145;
        }

        protected void initView(GameSurfaceView gameSurfaceView) {
            this.gameSurfaceView = gameSurfaceView;
            this.inputConnection = new UniversalDelInputConnection(this, false);
        }

        @Override // android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            editorInfo.inputType = this.inputType;
            editorInfo.initialSelStart = 0;
            editorInfo.initialSelEnd = 0;
            editorInfo.imeOptions = 301989888;
            return this.inputConnection;
        }

        @Override // android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == 4) {
                return super.dispatchKeyEvent(keyEvent);
            }
            Key key = toKey(keyEvent.getKeyCode());
            if (keyEvent.getKeyCode() == 0 && keyEvent.getAction() == 2) {
                this.gameSurfaceView.sendTextInput(keyEvent.getCharacters());
                return true;
            }
            if (key == Key.Unknown && keyEvent.getAction() == 1) {
                this.gameSurfaceView.sendTextInput(String.valueOf((char) keyEvent.getUnicodeChar()));
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.View
        public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
            DisplayCutout displayCutout;
            if (Build.VERSION.SDK_INT >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
                final int safeInsetTop = displayCutout.getSafeInsetTop();
                final int safeInsetRight = displayCutout.getSafeInsetRight();
                final int safeInsetBottom = displayCutout.getSafeInsetBottom();
                final int safeInsetLeft = displayCutout.getSafeInsetLeft();
                this.gameSurfaceView.send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$GameView$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((GameRenderer.RenderHandler) obj).handleSafeInsets(safeInsetTop, safeInsetRight, safeInsetBottom, safeInsetLeft);
                    }
                });
            }
            return super.onApplyWindowInsets(windowInsets);
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i, KeyEvent keyEvent) {
            Key key = toKey(i);
            if (key != Key.Unknown) {
                this.gameSurfaceView.sendKeyUp(key.getId());
                return true;
            }
            return super.onKeyUp(i, keyEvent);
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            Key key = toKey(i);
            if (key != Key.Unknown) {
                this.gameSurfaceView.sendKeyDown(key.getId());
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        private Key toKey(int i) {
            if (i == 61) {
                return Key.Tab;
            }
            if (i == 112) {
                return Key.Delete;
            }
            if (i == 66) {
                return Key.Enter;
            }
            if (i == 67) {
                return Key.BackSpace;
            }
            return Key.Unknown;
        }
    }

    public GameSurfaceView(GameView gameView, SharedSdkContext sharedSdkContext, InitOptions initOptions) {
        this.sharedSdkContext = sharedSdkContext;
        this.options = initOptions;
        this.view = gameView;
        gameView.initView(this);
        gameView.setFocusableInTouchMode(true);
        gameView.getHolder().addCallback(this);
        gameView.setOnTouchListener(new View.OnTouchListener() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$new$0;
                lambda$new$0 = GameSurfaceView.this.lambda$new$0(view, motionEvent);
                return lambda$new$0;
            }
        });
        GameActivity activity = sharedSdkContext.getActivity();
        this.imm = (InputMethodManager) activity.getSystemService("input_method");
        GameRenderer gameRenderer = new GameRenderer(gameView.getHolder(), activity);
        this.gameRenderer = gameRenderer;
        gameRenderer.start();
        Log.d(TAG, "waitUntilReady start");
        gameRenderer.waitUntilReady();
        Log.d(TAG, "waitUntilReady end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void queueEvent(final Runnable runnable) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda22
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).post(runnable);
            }
        });
    }

    public void send(Consumer<GameRenderer.RenderHandler> consumer) {
        GameRenderer.RenderHandler handler;
        GameRenderer gameRenderer = this.gameRenderer;
        if (gameRenderer == null || this.isShuttingDown || (handler = gameRenderer.getHandler()) == null) {
            return;
        }
        consumer.accept(handler);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d(TAG, "surfaceCreated holder=" + surfaceHolder);
        final Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        Log.d(TAG, "surface size " + surfaceFrame.width() + "x" + surfaceFrame.height());
        CommonHelper.surfaceCreated.set(true);
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda21
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                GameSurfaceView.this.lambda$surfaceCreated$2(surfaceFrame, (GameRenderer.RenderHandler) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$surfaceCreated$2(Rect rect, GameRenderer.RenderHandler renderHandler) {
        renderHandler.sendSurfaceCreated(rect.width(), rect.height(), this.sharedSdkContext, this.options);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, final int i2, final int i3) {
        Log.d(TAG, "surfaceChanged fmt=" + i + " size=" + i2 + "x" + i3 + " holder=" + surfaceHolder);
        CommonHelper.surfaceReady.set(true);
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendSurfaceChanged(i2, i3);
            }
        });
        executeScript("window.__onNativeWindowResized && window.__onNativeWindowResized(" + i2 + "," + i3 + ")", null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d(TAG, "surfaceDestroyed holder=" + surfaceHolder);
        CommonHelper.surfaceCreated.set(false);
        CommonHelper.surfaceReady.set(false);
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda23
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendSurfaceDestroyed();
            }
        });
    }

    public void doResume() {
        CommonHelper.paused.set(false);
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda17
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendDoResume();
            }
        });
    }

    public void doPause() {
        CommonHelper.paused.set(true);
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda11
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendDoPause();
            }
        });
    }

    public void doShutdown() {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendShutdown();
            }
        });
        this.isShuttingDown = true;
    }

    public void handleIntent(final String str) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda6
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendIntent(str);
            }
        });
    }

    public void reloadNativeApp(final SharedSdkContext sharedSdkContext) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda19
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendReloadApp(SharedSdkContext.this);
            }
        });
    }

    public void debugConfigReady(final String str) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendDebugConfigReady(str);
            }
        });
    }

    public void setDefaultAudioStreamValues(final int i, final int i2) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendSetDefaultAudioStreamValues(i, i2);
            }
        });
    }

    public void executeScript(String str, ValueCallback<String> valueCallback) {
        executeScript(str, valueCallback, false);
    }

    public void executeScript(final String str, ValueCallback<String> valueCallback, final boolean z) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda15
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendExecuteScript(str, z);
            }
        });
    }

    public void lowMemory() {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda18
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendLowMemory();
            }
        });
    }

    public void postMessage(String str) {
        MessageHandler messageHandler = this.messageHandler;
        if (messageHandler != null) {
            messageHandler.postMessage(str);
        }
    }

    public void sendKeyUp(final int i) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda16
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendKeyUp(i);
            }
        });
    }

    public void sendKeyDown(final int i) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda14
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendKeyDown(i);
            }
        });
    }

    public void sendTextInput(final String str) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda20
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendTextInput(str);
            }
        });
    }

    public void sendKeyboardVisibilityChanged(final int i) {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda13
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendKeyboardVisibilityChanged(i);
            }
        });
    }

    public void showKeyboard(int i) {
        this.view.requestFocus();
        this.view.inputType = getAndroidInputType(i);
        this.imm.restartInput(this.view);
        this.imm.showSoftInput(this.view, 0);
    }

    public void hideKeyboard() {
        this.imm.hideSoftInputFromWindow(this.view.getWindowToken(), 2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        final float x = motionEvent.getX(0);
        final float y = motionEvent.getY(0);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda7
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((GameRenderer.RenderHandler) obj).sendActionDown(x, y);
                }
            });
        } else if (action == 1) {
            send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda8
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((GameRenderer.RenderHandler) obj).sendActionUp(x, y);
                }
            });
        } else if (action == 2) {
            int pointerCount = motionEvent.getPointerCount();
            while (true) {
                if (i >= pointerCount) {
                    break;
                }
                if (motionEvent.getPointerId(i) == 0) {
                    send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda9
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            ((GameRenderer.RenderHandler) obj).sendActionMove(x, y);
                        }
                    });
                    break;
                }
                i++;
            }
        } else if (action == 5) {
            if ((motionEvent.getAction() >> 8) == 0) {
                send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda10
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((GameRenderer.RenderHandler) obj).sendActionDown(x, y);
                    }
                });
            }
        } else if (action == 6 && (motionEvent.getAction() >> 8) == 0) {
            send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda12
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((GameRenderer.RenderHandler) obj).sendActionUp(x, y);
                }
            });
        }
        return true;
    }

    public void doBackPressed() {
        send(new Consumer() { // from class: air.com.playtika.android.common.GameSurfaceView$$ExternalSyntheticLambda5
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((GameRenderer.RenderHandler) obj).sendBackPressed();
            }
        });
    }
}
