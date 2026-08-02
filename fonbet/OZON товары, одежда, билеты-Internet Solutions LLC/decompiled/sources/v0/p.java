package v0;

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

/* loaded from: classes.dex */
final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f101552a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10173m f101553b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.a f101554c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a0 f101555d;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f101557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f101557c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p pVar = p.this;
                Z g10 = pVar.f101553b.g();
                int i11 = this.f101557c;
                C10600e d11 = g10.d(i11);
                int b11 = i11 - d11.b();
                ((C4912a) ((C10169i) d11.c()).a()).invoke(pVar.e(), Integer.valueOf(b11), interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f101559c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f101560d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Object obj, int i12) {
            super(2);
            this.f101559c = i11;
            this.f101560d = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            Object obj = this.f101560d;
            p.this.f(this.f101559c, obj, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public p(@NotNull I i11, @NotNull C10173m c10173m, @NotNull androidx.compose.foundation.lazy.a aVar, @NotNull a0 a0Var) {
        this.f101552a = i11;
        this.f101553b = c10173m;
        this.f101554c = aVar;
        this.f101555d = a0Var;
    }

    @Override // v0.o
    @NotNull
    public final androidx.compose.foundation.lazy.layout.h a() {
        return this.f101555d;
    }

    @Override // x0.InterfaceC10620y
    public final int b(@NotNull Object obj) {
        return this.f101555d.b(obj);
    }

    @Override // x0.InterfaceC10620y
    public final Object c(int i11) {
        C10600e d11 = this.f101553b.g().d(i11);
        return ((AbstractC10611p.a) d11.c()).getType().invoke(Integer.valueOf(i11 - d11.b()));
    }

    @Override // x0.InterfaceC10620y
    @NotNull
    public final Object d(int i11) {
        Object d11 = this.f101555d.d(i11);
        return d11 == null ? this.f101553b.h(i11) : d11;
    }

    @Override // v0.o
    @NotNull
    public final androidx.compose.foundation.lazy.a e() {
        return this.f101554c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return Intrinsics.d(this.f101553b, ((p) obj).f101553b);
    }

    @Override // x0.InterfaceC10620y
    public final void f(int i11, @NotNull Object obj, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        Object obj2;
        C3969l u11 = interfaceC3967k.u(-462424778);
        int i14 = (u11.r(i11) ? 4 : 2) | i12 | (u11.F(obj) ? 32 : 16) | (u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i14 & 147) == 146 && u11.b()) {
            u11.j();
            i13 = i11;
            obj2 = obj;
        } else {
            i13 = i11;
            obj2 = obj;
            C10582K.a(obj2, i13, this.f101552a.w(), a1.c.c(-824725566, new a(i11), u11), u11, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(i13, obj2, i12));
        }
    }

    @Override // v0.o
    @NotNull
    public final kotlin.collections.K g() {
        this.f101553b.getClass();
        return kotlin.collections.K.f71697a;
    }

    @Override // x0.InterfaceC10620y
    public final int getItemCount() {
        return this.f101553b.g().e();
    }

    public final int hashCode() {
        return this.f101553b.hashCode();
    }
}
