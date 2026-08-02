package w9;

import aa.b;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.a0;
import ba.d;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.g;
import com.logrocket.core.graphics.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xg.q;
import xg.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Window.Callback {
    public static final a0 q = new a0(6);

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f25022a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f25023b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f25024c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f25025d;

    /* renamed from: f, reason: collision with root package name */
    public final int f25027f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25028g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25029h;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f25031k;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f25035o;

    /* renamed from: e, reason: collision with root package name */
    public final d f25026e = new d("window-callback");

    /* renamed from: i, reason: collision with root package name */
    public boolean f25030i = false;
    public boolean j = false;

    /* renamed from: l, reason: collision with root package name */
    public float f25032l = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f25033m = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f25034n = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f25036p = false;

    public a(Window window, Window.Callback callback, LogRocketCore logRocketCore, f fVar, int i5, boolean z5) {
        this.f25022a = callback;
        this.f25023b = new WeakReference(logRocketCore);
        this.f25024c = new WeakReference(window);
        this.f25025d = new WeakReference(fVar);
        this.f25029h = i5;
        this.f25035o = z5;
        b.o(window.getWindowManager());
        aa.a e7 = b.e();
        this.f25027f = e7.f87b;
        this.f25028g = e7.f86a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0016, B:10:0x0021, B:12:0x0025, B:14:0x0065, B:16:0x0069, B:18:0x0072, B:20:0x0095, B:21:0x00b2, B:23:0x00b6, B:28:0x002b, B:30:0x0032, B:32:0x004d, B:34:0x00a2), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(q qVar, View view) {
        try {
            if (qVar.e() == 3) {
                this.f25034n = new ArrayList();
                this.j = false;
            }
            if (qVar.e() == 1 && view != null) {
                WeakReference weakReference = this.f25031k;
                if (weakReference == null || weakReference.get() != view) {
                    if (this.f25032l < 0.0f || Math.abs(r0 - ((t) qVar.f6816b).C()) > this.f25028g * 0.2d || Math.abs(this.f25033m - ((t) qVar.f6816b).D()) > this.f25027f * 0.2d) {
                        this.f25034n = new ArrayList();
                        this.j = false;
                        this.f25031k = new WeakReference(view);
                        if (!this.j) {
                            this.f25032l = ((t) qVar.f6816b).C();
                            this.f25033m = ((t) qVar.f6816b).D();
                            this.f25034n.add(Double.valueOf(((t) qVar.f6816b).y()));
                        }
                    }
                }
                if (!this.j && this.f25034n.size() >= 5) {
                    ArrayList arrayList = this.f25034n;
                    if (((Double) arrayList.get(arrayList.size() - 5)).doubleValue() > ((t) qVar.f6816b).y() - 2000.0d) {
                        this.j = true;
                        qVar.d();
                        t.p((t) qVar.f6816b);
                    }
                }
                if (!this.j) {
                }
            }
        } finally {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.dispatchKeyShortcutEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback;
        if (!this.f25030i) {
            g gVar = (g) this.f25023b.get();
            f fVar = (f) this.f25025d.get();
            if (gVar != null && fVar != null) {
                if (motionEvent.getAction() == 0) {
                    this.f25036p = false;
                }
                if (!this.f25036p) {
                    try {
                        try {
                            u9.f fVar2 = new u9.f(motionEvent, (Window) this.f25024c.get(), gVar.f6462a.c(), fVar, this.f25029h);
                            motionEvent = motionEvent;
                            if (!fVar2.f24100m || this.f25035o) {
                                q b10 = fVar2.b();
                                if (b10 != null) {
                                    View view = (View) fVar2.f24096h.peekFirst();
                                    int e7 = b10.e();
                                    a0 a0Var = q;
                                    if (e7 == 1 && view != null) {
                                        a0Var.D(fVar2, motionEvent);
                                    } else if (b10.e() == 2) {
                                        a0Var.G(motionEvent);
                                    }
                                    a(b10, view);
                                    gVar.b(5, b10, null, b10.e() == 1, null);
                                }
                            } else {
                                this.f25036p = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            motionEvent = motionEvent;
                            this.f25026e.e("Failed to capture touch event", th);
                            callback = this.f25022a;
                            if (callback == null) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        callback = this.f25022a;
        if (callback == null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.dispatchTrackballEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onCreatePanelMenu(i5, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i5) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onCreatePanelView(i5);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onMenuItemSelected(i5, menuItem);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i5, Menu menu) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onMenuOpened(i5, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i5, Menu menu) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onPanelClosed(i5, menu);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onPreparePanel(i5, view, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onSearchRequested();
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z5) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            callback.onWindowFocusChanged(z5);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.f25022a;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.f25022a;
        if (callback != null) {
            return callback.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) {
        Window.Callback callback2 = this.f25022a;
        if (callback2 != null) {
            return callback2.onWindowStartingActionMode(callback, i5);
        }
        return null;
    }
}
