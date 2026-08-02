package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.e;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b2f extends a3 {
    public h90 A;
    public final e1d B;
    public boolean C;
    public final int[] D;
    public Function0 k;
    public g2f l;
    public String m;
    public final View n;
    public final boolean o;
    public final e2f p;
    public final WindowManager q;
    public final WindowManager.LayoutParams r;
    public f2f s;
    public ema t;
    public final e1d u;
    public final e1d v;
    public x6a w;
    public final ay4 x;
    public final Rect y;
    public final a5f z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b2f(Function0 function0, g2f g2fVar, String str, View view, kx4 kx4Var, f2f f2fVar, UUID uuid, boolean z) {
        super(view.getContext(), null, 6, r2);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        e2f d2fVar = i >= 30 ? new d2f(i2) : i >= 29 ? new c2f(i2) : new e2f(i2);
        this.k = function0;
        this.l = g2fVar;
        this.m = str;
        this.n = view;
        this.o = z;
        this.p = d2fVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.q = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        g2f g2fVar2 = this.l;
        boolean c = t20.c(view);
        boolean z2 = g2fVar2.b;
        int i3 = g2fVar2.a;
        if (z2 && c) {
            i3 |= 8192;
        } else if (z2 && !c) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.l.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.r = layoutParams;
        this.s = f2fVar;
        this.t = ema.a;
        this.u = e.f(null);
        this.v = e.f(null);
        this.x = goh.b(new vce(this, 11));
        this.y = new Rect();
        this.z = new a5f(new p20(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, qha.w(view));
        setTag(R.id.view_tree_view_model_store_owner, sha.u(view));
        setTag(R.id.view_tree_saved_state_registry_owner, rha.q(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(kx4Var.H0(8.0f));
        setOutlineProvider(new yy2(4));
        this.B = e.f(vc3.a);
        this.D = new int[2];
    }

    private final Function2<of3, Integer, Unit> getContent() {
        return (Function2) ((eoh) this.B).getValue();
    }

    private final x6a getDisplayBounds() {
        int i = this.l.a & 512;
        View view = this.n;
        Rect rect = this.y;
        e2f e2fVar = this.p;
        if (i == 0) {
            e2fVar.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            e2fVar.g(rect, view);
        }
        return new x6a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dma getParentLayoutCoordinates() {
        return (dma) ((eoh) this.v).getValue();
    }

    private final void setContent(Function2<? super of3, ? super Integer, Unit> function2) {
        ((eoh) this.B).setValue(function2);
    }

    private final void setParentLayoutCoordinates(dma dmaVar) {
        ((eoh) this.v).setValue(dmaVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-857613600);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new z2(this, i, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.l.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.k;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.a3
    public final void g(int i, int i2, int i3, int i4, boolean z) {
        super.g(i, i2, i3, i4, z);
        this.l.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.p.getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui() {
        return this.r;
    }

    @NotNull
    public final ema getParentLayoutDirection() {
        return this.t;
    }

    @Nullable
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final c7a m14getPopupContentSizebOM6tXw() {
        return (c7a) ((eoh) this.u).getValue();
    }

    @NotNull
    public final f2f getPositionProvider() {
        return this.s;
    }

    @Override // defpackage.a3
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    @NotNull
    public final String getTestTag() {
        return this.m;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.a3
    public final void h(int i, int i2) {
        this.l.getClass();
        x6a displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void m(mg3 mg3Var, Function2 function2) {
        setParentCompositionContext(mg3Var);
        setContent(function2);
        this.C = true;
    }

    public final void n(Function0 function0, g2f g2fVar, String str, ema emaVar) {
        int i;
        this.k = function0;
        this.m = str;
        if (!Intrinsics.c(this.l, g2fVar)) {
            g2fVar.getClass();
            this.l = g2fVar;
            boolean c = t20.c(this.n);
            boolean z = g2fVar.b;
            int i2 = g2fVar.a;
            if (z && c) {
                i2 |= 8192;
            } else if (z && !c) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.r;
            layoutParams.flags = i2;
            this.p.getClass();
            this.q.updateViewLayout(this, layoutParams);
        }
        int ordinal = emaVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                zzl.b();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void o() {
        dma parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.f()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long e = parentLayoutCoordinates.e();
            long I = this.o ? parentLayoutCoordinates.I(0L) : parentLayoutCoordinates.w(0L);
            x6a b = y6a.b((Math.round(Float.intBitsToFloat((int) (I >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (I & 4294967295L)))), e);
            if (b.equals(this.w)) {
                return;
            }
            this.w = b;
            q();
        }
    }

    @Override // defpackage.a3, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z.j();
        if (!this.l.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        h90 h90Var = this.A;
        if (h90Var == null) {
            h90 h90Var2 = new h90(this.k, 0);
            this.A = h90Var2;
            h90Var = h90Var2;
        }
        z9.x(this, h90Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a5f a5fVar = this.z;
        imf imfVar = (imf) a5fVar.i;
        if (imfVar != null) {
            imfVar.f();
        }
        a5fVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            z9.y(this, this.A);
        }
        this.A = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getX() >= getWidth() || motionEvent.getY() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.k;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function02 = this.k;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    public final void p(dma dmaVar) {
        setParentLayoutCoordinates(dmaVar);
        o();
    }

    public final void q() {
        c7a m14getPopupContentSizebOM6tXw;
        x6a x6aVar = this.w;
        if (x6aVar == null || (m14getPopupContentSizebOM6tXw = m14getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m14getPopupContentSizebOM6tXw.a;
        x6a displayBounds = getDisplayBounds();
        long b = (displayBounds.b() & 4294967295L) | (displayBounds.d() << 32);
        esf esfVar = new esf();
        esfVar.a = 0L;
        this.z.i(this, tyd.l, new a2f(esfVar, this, x6aVar, b, j));
        long j2 = esfVar.a;
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.l.e;
        e2f e2fVar = this.p;
        if (z) {
            e2fVar.i(this, (int) (b >> 32), (int) (b & 4294967295L));
        }
        e2fVar.getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(@NotNull ema emaVar) {
        this.t = emaVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m15setPopupContentSizefhxjrPA(@Nullable c7a c7aVar) {
        ((eoh) this.u).setValue(c7aVar);
    }

    public final void setPositionProvider(@NotNull f2f f2fVar) {
        this.s = f2fVar;
    }

    public final void setTestTag(@NotNull String str) {
        this.m = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    @NotNull
    public a3 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
