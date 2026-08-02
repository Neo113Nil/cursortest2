package rj0;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import P0.C3753m;
import P0.p2;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import bj0.C5680b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.E;
import u0.InterfaceC9890C;

/* loaded from: classes3.dex */
public final class b {

    /* JADX WARN: Incorrect field signature: TT; */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f83588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC9287a f83589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;TT;)V */
        a(Function1 function1, InterfaceC9287a interfaceC9287a) {
            super(0);
            this.f83588b = function1;
            this.f83589c = interfaceC9287a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f83588b.invoke(this.f83589c);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* renamed from: rj0.b$b, reason: collision with other inner class name */
    static final class C1430b extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC9287a f83590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        C1430b(InterfaceC9287a interfaceC9287a) {
            super(3);
            this.f83590b = interfaceC9287a;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9890C Button = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p2.b(this.f83590b.getText(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 0, 0, 131070);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f83591b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<T> f83592c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f83593d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f83594e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f83595f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e eVar, List<? extends T> list, Function1<? super T, Unit> function1, int i11, int i12) {
            super(2);
            this.f83591b = eVar;
            this.f83592c = list;
            this.f83593d = function1;
            this.f83594e = i11;
            this.f83595f = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f83594e | 1);
            e eVar = this.f83591b;
            b.a(eVar, this.f83592c, this.f83593d, interfaceC3967k, e11, this.f83595f);
            return Unit.f71690a;
        }
    }

    public static final <T extends InterfaceC9287a> void a(e eVar, @NotNull List<? extends T> menuItems, @NotNull Function1<? super T, Unit> onItemClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        e eVar3;
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        C3969l u11 = interfaceC3967k.u(-1980560816);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = i11 | (u11.n(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i15 = 256;
        int i16 = i13 | (u11.F(menuItems) ? 32 : 16) | (u11.F(onItemClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i16 & 147) == 146 && u11.b()) {
            u11.j();
            eVar3 = eVar2;
        } else {
            e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
            int i17 = 6;
            C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, eVar4);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            i.b(u11, f7, -1135877128);
            Iterator<T> it = menuItems.iterator();
            while (it.hasNext()) {
                InterfaceC9287a interfaceC9287a = (InterfaceC9287a) it.next();
                e.a aVar = e.f40358c0;
                e e11 = a0.e(C5680b.a(i17, u11, aVar, interfaceC9287a.a()), 1.0f);
                u11.o(715280116);
                boolean F11 = ((i16 & 896) == i15) | u11.F(interfaceC9287a);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new a(onItemClick, interfaceC9287a);
                    u11.x(C11);
                }
                u11.k();
                C3753m.a((Function0) C11, e11, false, null, null, null, null, a1.c.c(-1885581523, new C1430b(interfaceC9287a), u11), u11, 805306368, 508);
                E.a(u11, a0.f(aVar, 4));
                i16 = i16;
                i17 = i17;
                i15 = 256;
            }
            u11.k();
            u11.f();
            eVar3 = eVar4;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(eVar3, menuItems, onItemClick, i11, i12));
        }
    }
}
