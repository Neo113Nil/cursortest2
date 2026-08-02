package n0;

import D1.AbstractC2810k0;
import D1.I0;
import D1.InterfaceC2821v;
import D1.J0;
import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8360A extends e.c implements I0, InterfaceC2821v {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76052c = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f76053a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC2810k0 f76054b;

    /* renamed from: n0.A$a */
    public static final class a {
    }

    private final C8361B I1() {
        if (isAttached()) {
            I0 a11 = J0.a(this, C8361B.f76055c);
            if (a11 instanceof C8361B) {
                return (C8361B) a11;
            }
        }
        return null;
    }

    public final void J1(boolean z11) {
        C8361B I12;
        if (z11 == this.f76053a) {
            return;
        }
        if (z11) {
            AbstractC2810k0 abstractC2810k0 = this.f76054b;
            if (abstractC2810k0 != null && abstractC2810k0.I() && (I12 = I1()) != null) {
                I12.I1(this.f76054b);
            }
        } else {
            C8361B I13 = I1();
            if (I13 != null) {
                I13.I1(null);
            }
        }
        this.f76053a = z11;
    }

    @Override // D1.I0
    @NotNull
    public final Object K0() {
        return f76052c;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        C8361B I12;
        this.f76054b = abstractC2810k0;
        if (this.f76053a) {
            if (!abstractC2810k0.I()) {
                C8361B I13 = I1();
                if (I13 != null) {
                    I13.I1(null);
                    return;
                }
                return;
            }
            AbstractC2810k0 abstractC2810k02 = this.f76054b;
            if (abstractC2810k02 == null || !abstractC2810k02.I() || (I12 = I1()) == null) {
                return;
            }
            I12.I1(this.f76054b);
        }
    }
}
