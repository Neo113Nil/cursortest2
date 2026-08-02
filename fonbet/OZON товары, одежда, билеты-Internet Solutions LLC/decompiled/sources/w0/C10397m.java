package w0;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;
import x0.C10582K;
import x0.C10600e;
import x0.Z;
import x0.a0;

/* renamed from: w0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10397m implements InterfaceC10396l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final O f103278a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10394j f103279b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a0 f103280c;

    /* renamed from: w0.m$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f103282c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Z g10 = C10397m.this.f103279b.g();
                int i11 = this.f103282c;
                C10600e d11 = g10.d(i11);
                int b11 = i11 - d11.b();
                ((C4912a) ((C10393i) d11.c()).a()).invoke(r.f103289a, Integer.valueOf(b11), interfaceC3967k2, 6);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: w0.m$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f103285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Object obj, int i12) {
            super(2);
            this.f103284c = i11;
            this.f103285d = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            Object obj = this.f103285d;
            C10397m.this.f(this.f103284c, obj, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public C10397m(@NotNull O o11, @NotNull C10394j c10394j, @NotNull a0 a0Var) {
        this.f103278a = o11;
        this.f103279b = c10394j;
        this.f103280c = a0Var;
    }

    @Override // w0.InterfaceC10396l
    @NotNull
    public final androidx.compose.foundation.lazy.layout.h a() {
        return this.f103280c;
    }

    @Override // x0.InterfaceC10620y
    public final int b(@NotNull Object obj) {
        return this.f103280c.b(obj);
    }

    @Override // x0.InterfaceC10620y
    public final Object c(int i11) {
        C10600e d11 = this.f103279b.g().d(i11);
        return ((AbstractC10611p.a) d11.c()).getType().invoke(Integer.valueOf(i11 - d11.b()));
    }

    @Override // x0.InterfaceC10620y
    @NotNull
    public final Object d(int i11) {
        Object d11 = this.f103280c.d(i11);
        return d11 == null ? this.f103279b.h(i11) : d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10397m)) {
            return false;
        }
        return Intrinsics.d(this.f103279b, ((C10397m) obj).f103279b);
    }

    @Override // x0.InterfaceC10620y
    public final void f(int i11, @NotNull Object obj, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        Object obj2;
        C3969l u11 = interfaceC3967k.u(1493551140);
        int i14 = (u11.r(i11) ? 4 : 2) | i12 | (u11.F(obj) ? 32 : 16) | (u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i14 & 147) == 146 && u11.b()) {
            u11.j();
            i13 = i11;
            obj2 = obj;
        } else {
            i13 = i11;
            obj2 = obj;
            C10582K.a(obj2, i13, this.f103278a.t(), a1.c.c(726189336, new a(i11), u11), u11, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(i13, obj2, i12));
        }
    }

    @Override // x0.InterfaceC10620y
    public final int getItemCount() {
        return this.f103279b.g().e();
    }

    @Override // w0.InterfaceC10396l
    @NotNull
    public final N h() {
        return this.f103279b.k();
    }

    public final int hashCode() {
        return this.f103279b.hashCode();
    }
}
