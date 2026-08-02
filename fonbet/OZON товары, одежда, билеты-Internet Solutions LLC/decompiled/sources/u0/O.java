package u0;

import S0.InterfaceC3967k;
import androidx.compose.ui.platform.C5236c1;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C1.m<J> f99639a = new C1.m<>(a.f99640b);

    static final class a extends AbstractC7737t implements Function0<J> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f99640b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            return new C9903l();
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f99641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J j11) {
            super(3);
            this.f99641b = j11;
        }

        @Override // fd.InterfaceC6511n
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            num.intValue();
            interfaceC3967k2.o(788931215);
            J j11 = this.f99641b;
            boolean n11 = interfaceC3967k2.n(j11);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new H(j11);
                interfaceC3967k2.x(C11);
            }
            H h11 = (H) C11;
            interfaceC3967k2.k();
            return h11;
        }
    }

    static final class c extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<J, Unit> f99642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super J, Unit> function1) {
            super(3);
            this.f99642b = function1;
        }

        @Override // fd.InterfaceC6511n
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            num.intValue();
            interfaceC3967k2.o(-1608161351);
            Function1<J, Unit> function1 = this.f99642b;
            boolean n11 = interfaceC3967k2.n(function1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C9897f(function1);
                interfaceC3967k2.x(C11);
            }
            C9897f c9897f = (C9897f) C11;
            interfaceC3967k2.k();
            return c9897f;
        }
    }

    static final class d extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f99643b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(J j11) {
            super(3);
            this.f99643b = j11;
        }

        @Override // fd.InterfaceC6511n
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            num.intValue();
            interfaceC3967k2.o(-1415685722);
            J j11 = this.f99643b;
            boolean n11 = interfaceC3967k2.n(j11);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C9907p(j11);
                interfaceC3967k2.x(C11);
            }
            C9907p c9907p = (C9907p) C11;
            interfaceC3967k2.k();
            return c9907p;
        }
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull J j11) {
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new b(j11));
    }

    @NotNull
    public static final C1.m<J> b() {
        return f99639a;
    }

    @NotNull
    public static final androidx.compose.ui.e c(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super J, Unit> function1) {
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new c(function1));
    }

    @NotNull
    public static final androidx.compose.ui.e d(@NotNull androidx.compose.ui.e eVar, @NotNull J j11) {
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new d(j11));
    }
}
