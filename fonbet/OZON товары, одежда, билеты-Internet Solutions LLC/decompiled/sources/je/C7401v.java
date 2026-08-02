package je;

import je.r0;
import ke.C7669a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;

/* renamed from: je.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7401v extends AbstractC7402w implements InterfaceC7399t, ne.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Y f69931b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f69932c;

    /* renamed from: je.v$a */
    /* loaded from: classes10.dex */
    public static final class a {
        public static C7401v a(K0 type, boolean z11) {
            boolean z12;
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof C7401v) {
                return (C7401v) type;
            }
            int i11 = 0;
            if (!(type.H0() instanceof ke.s) && !(type.H0().p() instanceof td.i0) && !(type instanceof ke.j) && !(type instanceof C7385i0)) {
                z12 = false;
            } else if (type instanceof C7385i0) {
                z12 = H0.g(type);
            } else {
                InterfaceC9842h p11 = type.H0().p();
                wd.a0 a0Var = p11 instanceof wd.a0 ? (wd.a0) p11 : null;
                if (a0Var != null && !a0Var.K0()) {
                    z12 = true;
                } else if (z11 && (type.H0().p() instanceof td.i0)) {
                    z12 = H0.g(type);
                } else {
                    Intrinsics.checkNotNullParameter(type, "type");
                    z12 = !C7372c.a(C7669a.a(false, null, null, 24), C7363H.b(type), r0.c.b.f69924a);
                }
            }
            if (!z12) {
                return null;
            }
            if (type instanceof AbstractC7360E) {
                AbstractC7360E abstractC7360E = (AbstractC7360E) type;
                Intrinsics.d(abstractC7360E.P0().H0(), abstractC7360E.Q0().H0());
            }
            return new C7401v(i11, C7363H.b(type).L0(false), z11);
        }
    }

    public /* synthetic */ C7401v(int i11, Y y11, boolean z11) {
        this(y11, z11);
    }

    @Override // je.InterfaceC7399t
    public final boolean C0() {
        Y y11 = this.f69931b;
        return (y11.H0() instanceof ke.s) || (y11.H0().p() instanceof td.i0);
    }

    @Override // je.AbstractC7402w, je.N
    public final boolean I0() {
        return false;
    }

    @Override // je.InterfaceC7399t
    @NotNull
    public final K0 N(@NotNull N replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return C7373c0.a(replacement.K0(), this.f69932c);
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final Y L0(boolean z11) {
        return z11 ? this.f69931b.L0(z11) : this;
    }

    @Override // je.Y
    @NotNull
    /* renamed from: P0 */
    public final Y N0(@NotNull o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C7401v(this.f69931b.N0(newAttributes), this.f69932c);
    }

    @Override // je.AbstractC7402w
    @NotNull
    protected final Y Q0() {
        return this.f69931b;
    }

    @Override // je.AbstractC7402w
    public final AbstractC7402w S0(Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C7401v(delegate, this.f69932c);
    }

    @NotNull
    public final Y T0() {
        return this.f69931b;
    }

    @Override // je.Y
    @NotNull
    public final String toString() {
        return this.f69931b + " & Any";
    }

    private C7401v(Y y11, boolean z11) {
        this.f69931b = y11;
        this.f69932c = z11;
    }
}
