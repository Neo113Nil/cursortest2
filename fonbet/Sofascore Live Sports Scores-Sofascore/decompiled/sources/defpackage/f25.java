package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.sofascore.results.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f25 extends cc3 {
    public Function0 e;
    public z15 f;
    public final View g;
    public final w15 h;
    public boolean i;

    public f25(Function0 function0, z15 z15Var, View view, ema emaVar, kx4 kx4Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), z15Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.e = function0;
        this.f = z15Var;
        this.g = view;
        Window window = getWindow();
        if (window == null) {
            a70.r("Dialog has no window");
            throw null;
        }
        z15 z15Var2 = this.f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = z15Var2.g;
            window2.setAttributes(attributes);
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        bea.L(window, this.f.e);
        window.setGravity(17);
        if (!this.f.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                d90.a.a(attributes2);
            }
            if (i2 >= 30) {
                e90 e90Var = e90.a;
                e90Var.b(attributes2, 0);
                e90Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        w15 w15Var = new w15(getContext(), window);
        setTitle(this.f.f);
        w15Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        w15Var.setClipChildren(false);
        w15Var.setElevation(kx4Var.H0(8.0f));
        w15Var.setOutlineProvider(new yy2(1));
        this.h = w15Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(w15Var);
        w15Var.setTag(R.id.view_tree_lifecycle_owner, qha.w(view));
        w15Var.setTag(R.id.view_tree_view_model_store_owner, sha.u(view));
        w15Var.setTag(R.id.view_tree_saved_state_registry_owner, rha.q(view));
        e(this.e, this.f, emaVar);
        s6a.o(getOnBackPressedDispatcher(), this, new d00(this, i));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof w15) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(Function0 function0, z15 z15Var, ema emaVar) {
        int i;
        this.e = function0;
        this.f = z15Var;
        rzg rzgVar = z15Var.c;
        boolean c = t20.c(this.g);
        int ordinal = rzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c = true;
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                c = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(c ? 8192 : -8193, 8192);
        int ordinal2 = emaVar.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                zzl.b();
                return;
            }
            i = 1;
        }
        w15 w15Var = this.h;
        w15Var.setLayoutDirection(i);
        boolean z = z15Var.e;
        boolean z2 = z15Var.d;
        Window window2 = w15Var.k;
        boolean z3 = (w15Var.o && z2 == w15Var.m && z == w15Var.n) ? false : true;
        w15Var.m = z2;
        w15Var.n = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !w15Var.o) {
                window2.setLayout(i2, -2);
                w15Var.o = true;
            }
        }
        setCanceledOnTouchOutside(z15Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f.b) {
            w15 w15Var = this.h;
            w15Var.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = w15Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + w15Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + w15Var.getTop();
                int height = childAt.getHeight() + top;
                int b = wzb.b(motionEvent.getX());
                if (left <= b) {
                    if (b <= width) {
                        int b2 = wzb.b(motionEvent.getY());
                        if (top <= b2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.i = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.i = false;
                    return onTouchEvent;
                }
            } else if (this.i) {
                this.e.invoke();
                this.i = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.i = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
