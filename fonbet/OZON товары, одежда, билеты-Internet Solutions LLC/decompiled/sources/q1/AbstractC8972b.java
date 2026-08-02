package q1;

import Z1.s;
import k1.C7460f;
import k1.C7461g;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7784B;
import l1.C7785C;
import l1.C7809a0;
import l1.InterfaceC7802U;
import l1.r0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8972b {
    private C7809a0 colorFilter;
    private r0 layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;

    @NotNull
    private s layoutDirection = s.Ltr;

    @NotNull
    private final Function1<InterfaceC8412e, Unit> drawLambda = new a();

    /* renamed from: q1.b$a */
    static final class a extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            AbstractC8972b.this.onDraw(interfaceC8412e);
            return Unit.f71690a;
        }
    }

    private final void configureAlpha(float f7) {
        if (this.alpha == f7) {
            return;
        }
        if (!applyAlpha(f7)) {
            if (f7 == 1.0f) {
                r0 r0Var = this.layerPaint;
                if (r0Var != null) {
                    r0Var.setAlpha(f7);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f7);
                this.useLayer = true;
            }
        }
        this.alpha = f7;
    }

    private final void configureColorFilter(C7809a0 c7809a0) {
        if (Intrinsics.d(this.colorFilter, c7809a0)) {
            return;
        }
        if (!applyColorFilter(c7809a0)) {
            if (c7809a0 == null) {
                r0 r0Var = this.layerPaint;
                if (r0Var != null) {
                    r0Var.c(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().c(c7809a0);
                this.useLayer = true;
            }
        }
        this.colorFilter = c7809a0;
    }

    private final void configureLayoutDirection(s sVar) {
        if (this.layoutDirection != sVar) {
            applyLayoutDirection(sVar);
            this.layoutDirection = sVar;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m443drawx_KDEd0$default(AbstractC8972b abstractC8972b, InterfaceC8412e interfaceC8412e, long j11, float f7, C7809a0 c7809a0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i11 & 2) != 0) {
            f7 = 1.0f;
        }
        float f11 = f7;
        if ((i11 & 4) != 0) {
            c7809a0 = null;
        }
        abstractC8972b.m444drawx_KDEd0(interfaceC8412e, j11, f11, c7809a0);
    }

    private final r0 obtainPaint() {
        r0 r0Var = this.layerPaint;
        if (r0Var != null) {
            return r0Var;
        }
        C7784B a11 = C7785C.a();
        this.layerPaint = a11;
        return a11;
    }

    protected boolean applyAlpha(float f7) {
        return false;
    }

    protected boolean applyColorFilter(C7809a0 c7809a0) {
        return false;
    }

    protected boolean applyLayoutDirection(@NotNull s sVar) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m444drawx_KDEd0(@NotNull InterfaceC8412e interfaceC8412e, long j11, float f7, C7809a0 c7809a0) {
        configureAlpha(f7);
        configureColorFilter(c7809a0);
        configureLayoutDirection(interfaceC8412e.getLayoutDirection());
        float f11 = C7464j.f(interfaceC8412e.i()) - C7464j.f(j11);
        float d11 = C7464j.d(interfaceC8412e.i()) - C7464j.d(j11);
        interfaceC8412e.w0().f().c(0.0f, 0.0f, f11, d11);
        if (f7 > 0.0f) {
            try {
                if (C7464j.f(j11) > 0.0f && C7464j.d(j11) > 0.0f) {
                    if (this.useLayer) {
                        C7460f a11 = C7461g.a(0L, C7465k.a(C7464j.f(j11), C7464j.d(j11)));
                        InterfaceC7802U a12 = interfaceC8412e.w0().a();
                        try {
                            a12.b(a11, obtainPaint());
                            onDraw(interfaceC8412e);
                            a12.p();
                        } catch (Throwable th2) {
                            a12.p();
                            throw th2;
                        }
                    } else {
                        onDraw(interfaceC8412e);
                    }
                }
            } catch (Throwable th3) {
                interfaceC8412e.w0().f().c(-0.0f, -0.0f, -f11, -d11);
                throw th3;
            }
        }
        interfaceC8412e.w0().f().c(-0.0f, -0.0f, -f11, -d11);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo14getIntrinsicSizeNHjbRc();

    protected abstract void onDraw(@NotNull InterfaceC8412e interfaceC8412e);
}
