package air.com.playtika.android.common;

import air.com.playtika.android.common.GameSurfaceView;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;
import com.getcapacitor.ViewBridge;
import com.getkeepsafe.relinker.ReLinker;
import com.ironsource.X3;
import io.sentry.Attachment;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroid;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SentryRuntime;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class GameActivity extends BridgeActivity {
    private static final String TAG = "GameActivity";
    private SharedSdkContext sharedSdkContext = null;
    private GameSurfaceView gameSurfaceView = null;
    private Boolean bridgeInitialized = false;
    private Long sessionStart = Long.valueOf(System.currentTimeMillis());
    private Long lastEventTime = 0L;
    private int sentryLogAttachNativePercent = 100;
    private String intentConfig = null;

    protected abstract String GetSentryDsn();

    protected abstract String GetSentryMarket();

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.sharedSdkContext.onActivityResult(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.sharedSdkContext = new SharedSdkContext(this);
        InitializeSentry();
        hideSystemUi();
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.this.lambda$onCreate$1(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(final Bundle bundle) {
        loadNativeLibrary();
        final InitOptions initOptions = new InitOptions(System.getProperty("os.name"), System.getProperty("os.arch"), this.sharedSdkContext.GetUserAgent(), this.sharedSdkContext.GetFilesDirAbsolutePath(), this.sharedSdkContext.GetCacheDirAbsolutePath(), this.sharedSdkContext.GetApiLevel());
        runOnUiThread(new Runnable() { // from class: air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.this.lambda$onCreate$0(bundle, initOptions);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: CreateLong, reason: merged with bridge method [inline-methods] */
    public void lambda$onCreate$0(final Bundle bundle, InitOptions initOptions) {
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(32);
        setVolumeControlStream(3);
        GameSurfaceView.GameView gameView = (GameSurfaceView.GameView) findViewById(R.id.game_view);
        GameSurfaceView gameSurfaceView = new GameSurfaceView(gameView, this.sharedSdkContext, initOptions);
        this.gameSurfaceView = gameSurfaceView;
        this.sharedSdkContext.attachGameSurfaceView(gameSurfaceView);
        gameView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: air.com.playtika.android.common.GameActivity.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                GameActivity.this.onGameSurfaceCreated(bundle);
            }
        });
    }

    protected void onGameSurfaceCreated(Bundle bundle) {
        if (this.bridgeInitialized.booleanValue()) {
            return;
        }
        this.bridgeInitialized = true;
        init(bundle, GetPlugins(), true);
        if ((getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        final View rootView = getWindow().getDecorView().findViewById(android.R.id.content).getRootView();
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: air.com.playtika.android.common.GameActivity.2
            int previousHeightDiff = 0;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int i;
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                int height = rootView.getRootView().getHeight();
                int i2 = rect.bottom;
                rootView.getRootWindowInsets().getStableInsetBottom();
                int i3 = height - i2;
                if (i3 > 100 && i3 != this.previousHeightDiff) {
                    GameActivity.this.gameSurfaceView.sendKeyboardVisibilityChanged(i3);
                    i = 0 - i3;
                } else {
                    int i4 = this.previousHeightDiff;
                    if (i3 != i4 && i4 - i3 > 100) {
                        GameActivity.this.gameSurfaceView.sendKeyboardVisibilityChanged(0);
                    }
                    i = 0;
                }
                WebView webView = GameActivity.this.sharedSdkContext.getWebView();
                if (webView != null) {
                    webView.layout(0, i, rootView.getWidth(), height - i3);
                }
                this.previousHeightDiff = i3;
            }
        });
        setDefaultAudioStreamValues(this);
        String str = this.intentConfig;
        if (str != null) {
            this.gameSurfaceView.handleIntent(str);
        }
        onResume();
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String dataString = intent.getDataString();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                if (obj != null) {
                    try {
                        if (!jSONObject.has(str)) {
                            jSONObject.put(str, obj.toString());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if ((dataString == null || dataString.isEmpty()) && jSONObject.length() <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("dataString", dataString);
            jSONObject2.put("dict", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        String jSONObject3 = jSONObject2.toString();
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView == null) {
            this.intentConfig = jSONObject3;
        } else {
            gameSurfaceView.handleIntent(jSONObject3);
        }
    }

    @Override // com.getcapacitor.BridgeActivity
    protected ViewBridge createViewBridge() {
        return new NativeViewBridge(this.gameSurfaceView);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.gameSurfaceView.lowMemory();
    }

    public GameSurfaceView getGLSurfaceView() {
        return this.gameSurfaceView;
    }

    public void hideSystemUi() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Log.d(TAG, "onWindowFocusChanged() hasFocus=" + z);
        if (z) {
            hideSystemUi();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Log.d(TAG, String.format("onMultiWindowModeChanged isInMultiWindowMode=%s", Boolean.valueOf(z)));
        if (z) {
            setRequestedOrientation(-1);
        }
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.executeScript("window.__onMultiWindowModeChanged && window.__onMultiWindowModeChanged(" + z + ")", null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        Log.d(TAG, String.format("onPictureInPictureModeChanged isInPictureInPictureMode=%s", Boolean.valueOf(z)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged");
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.sessionStart = Long.valueOf(System.currentTimeMillis());
        Log.d(TAG, "onResume()");
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.doResume();
        }
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
        GameSurfaceView gameSurfaceView = this.gameSurfaceView;
        if (gameSurfaceView != null) {
            gameSurfaceView.doPause();
        }
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        SharedSdkContext.onAppDestroyed();
        this.gameSurfaceView.doShutdown();
        super.onDestroy();
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        GameSurfaceView gameSurfaceView;
        if (this.sharedSdkContext.getWebView() == null && (gameSurfaceView = this.gameSurfaceView) != null) {
            gameSurfaceView.doBackPressed();
        }
    }

    void reloadCapacitorBridge() {
        this.bridge.reload();
    }

    private void loadNativeLibrary() {
        try {
            ReLinker.loadLibrary(this, "native-lib");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String GetVersion() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 1).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "Undefined";
        }
    }

    private void InitializeSentry() {
        SentryAndroid.init(this, (Sentry.OptionsConfiguration<SentryAndroidOptions>) new Sentry.OptionsConfiguration() { // from class: air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda4
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                GameActivity.this.lambda$InitializeSentry$4((SentryAndroidOptions) sentryOptions);
            }
        });
        Sentry.setTag("version", GetVersion());
        Sentry.setTag("market", GetSentryMarket());
        Sentry.setTag(SentryRuntime.TYPE, "True");
        Sentry.setTag("native", "True");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$InitializeSentry$4(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setDsn(GetSentryDsn());
        sentryAndroidOptions.setMaxBreadcrumbs(10);
        sentryAndroidOptions.setRelease(GetVersion());
        if ((getApplicationInfo().flags & 2) != 0) {
            sentryAndroidOptions.setEnvironment(X3.i.q);
        } else {
            sentryAndroidOptions.setEnvironment("production");
        }
        sentryAndroidOptions.setSendDefaultPii(true);
        sentryAndroidOptions.setBeforeBreadcrumb(new SentryOptions.BeforeBreadcrumbCallback() { // from class: air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda2
            @Override // io.sentry.SentryOptions.BeforeBreadcrumbCallback
            public final Breadcrumb execute(Breadcrumb breadcrumb, Hint hint) {
                return GameActivity.lambda$InitializeSentry$2(breadcrumb, hint);
            }
        });
        try {
            this.sentryLogAttachNativePercent = Integer.parseInt(this.sharedSdkContext.GetKeyValueFromAccountStorage("SentryLogAttachNativePercent", "100"));
        } catch (Exception unused) {
            this.sentryLogAttachNativePercent = 100;
        }
        final Attachment attachment = new Attachment(getFilesDir().getAbsolutePath() + "/shared.log");
        sentryAndroidOptions.setBeforeSend(new SentryOptions.BeforeSendCallback() { // from class: air.com.playtika.android.common.GameActivity$$ExternalSyntheticLambda3
            @Override // io.sentry.SentryOptions.BeforeSendCallback
            public final SentryEvent execute(SentryEvent sentryEvent, Hint hint) {
                SentryEvent lambda$InitializeSentry$3;
                lambda$InitializeSentry$3 = GameActivity.this.lambda$InitializeSentry$3(attachment, sentryEvent, hint);
                return lambda$InitializeSentry$3;
            }
        });
        sentryAndroidOptions.setAnrEnabled(true);
        sentryAndroidOptions.setEnableScopeSync(true);
    }

    static /* synthetic */ Breadcrumb lambda$InitializeSentry$2(Breadcrumb breadcrumb, Hint hint) {
        if (breadcrumb.getLevel() == SentryLevel.ERROR || breadcrumb.getLevel() == SentryLevel.FATAL || breadcrumb.getCategory().equals(NotificationCompat.CATEGORY_NAVIGATION)) {
            return breadcrumb;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SentryEvent lambda$InitializeSentry$3(Attachment attachment, SentryEvent sentryEvent, Hint hint) {
        this.sharedSdkContext.getSentryEventHandler().handleEvent(sentryEvent);
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (valueOf.longValue() - this.lastEventTime.longValue() < 60000) {
            return null;
        }
        this.lastEventTime = valueOf;
        sentryEvent.setTag("appResumedTime", getDurationTagValue(Long.valueOf((valueOf.longValue() - this.sessionStart.longValue()) / 1000)));
        if (sentryEvent.isCrashed() && Math.round(Math.random() * 100.0d) < this.sentryLogAttachNativePercent) {
            hint.addAttachment(attachment);
        }
        return sentryEvent;
    }

    void setDefaultAudioStreamValues(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null || property2 == null) {
            return;
        }
        this.gameSurfaceView.setDefaultAudioStreamValues(Integer.parseInt(property), Integer.parseInt(property2));
    }

    private static String getDurationTagValue(Long l) {
        String str;
        if (l.longValue() >= 60) {
            str = "greaterThan15m";
        } else {
            str = String.format("%ds", Long.valueOf((l.longValue() / 20) * 20));
        }
        if (l.longValue() >= 60 && l.longValue() < 300) {
            str = String.format("%dm", Long.valueOf(l.longValue() / 60));
        }
        return (l.longValue() < 300 || l.longValue() >= 900) ? str : String.format("%dm", Long.valueOf((l.longValue() / 180) * 3));
    }

    protected ArrayList<Class<? extends Plugin>> GetPlugins() {
        return new ArrayList<>();
    }
}
