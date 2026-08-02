package y0;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;
import x0.C10582K;
import x0.C10600e;
import x0.InterfaceC10620y;

/* loaded from: classes8.dex */
public final class F implements InterfaceC10620y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f105644a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC10611p<C10811s> f105645b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0.a0 f105646c;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f105648c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f105648c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                x0.Z g10 = F.this.f105645b.g();
                int i11 = this.f105648c;
                C10600e d11 = g10.d(i11);
                ((C10811s) d11.c()).a().invoke(P.f105706a, Integer.valueOf(i11 - d11.b()), interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f105650c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f105651d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Object obj, int i12) {
            super(2);
            this.f105650c = i11;
            this.f105651d = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            Object obj = this.f105651d;
            F.this.f(this.f105650c, obj, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public F(@NotNull b0 b0Var, @NotNull AbstractC10611p abstractC10611p, @NotNull x0.a0 a0Var) {
        this.f105644a = b0Var;
        this.f105645b = abstractC10611p;
        this.f105646c = a0Var;
    }

    @Override // x0.InterfaceC10620y
    public final int b(@NotNull Object obj) {
        return this.f105646c.b(obj);
    }

    @Override // x0.InterfaceC10620y
    @NotNull
    public final Object d(int i11) {
        Object d11 = this.f105646c.d(i11);
        return d11 == null ? this.f105645b.h(i11) : d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        return Intrinsics.d(this.f105645b, ((F) obj).f105645b);
    }

    @Override // x0.InterfaceC10620y
    public final void f(int i11, @NotNull Object obj, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        Object obj2;
        C3969l u11 = interfaceC3967k.u(-1201380429);
        int i14 = (u11.r(i11) ? 4 : 2) | i12 | (u11.F(obj) ? 32 : 16) | (u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i14 & 147) == 146 && u11.b()) {
            u11.j();
            i13 = i11;
            obj2 = obj;
        } else {
            i13 = i11;
            obj2 = obj;
            C10582K.a(obj2, i13, this.f105644a.G(), a1.c.c(1142237095, new a(i11), u11), u11, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(i13, obj2, i12));
        }
    }

    @Override // x0.InterfaceC10620y
    public final int getItemCount() {
        return this.f105645b.g().e();
    }

    public final int hashCode() {
        return this.f105645b.hashCode();
    }
}
