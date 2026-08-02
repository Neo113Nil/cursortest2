package ru.ozon.app.android.pdp.compose.layout;

import D1.InterfaceC2801g;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class RowComponentsKt$AdaptiveScrollRow$1$1$contentPlaceables$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ C5179b.e $contentArrangement;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $endContent;
    final /* synthetic */ boolean $isFits;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $startContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RowComponentsKt$AdaptiveScrollRow$1$1$contentPlaceables$1(boolean z11, C5179b.e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22) {
        super(2);
        this.$isFits = z11;
        this.$contentArrangement = eVar;
        this.$startContent = function2;
        this.$endContent = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        if (!this.$isFits) {
            interfaceC3967k.o(980124777);
            d.b l11 = InterfaceC6250b.a.l();
            e a11 = z.a(e.f40358c0, z.b(interfaceC3967k));
            Function2<InterfaceC3967k, Integer, Unit> function2 = this.$startContent;
            Function2<InterfaceC3967k, Integer, Unit> function22 = this.$endContent;
            Y b11 = X.b(C5179b.f(), l11, interfaceC3967k, 48);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f7 = c.f(interfaceC3967k, a11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a12);
            } else {
                interfaceC3967k.e();
            }
            Function2 f11 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                a.d(f11, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
            function2.invoke(interfaceC3967k, 0);
            function22.invoke(interfaceC3967k, 0);
            interfaceC3967k.f();
            interfaceC3967k.k();
            return;
        }
        interfaceC3967k.o(979805570);
        d.b l12 = InterfaceC6250b.a.l();
        e e11 = a0.e(e.f40358c0, 1.0f);
        C5179b.e eVar = this.$contentArrangement;
        Function2<InterfaceC3967k, Integer, Unit> function23 = this.$startContent;
        Function2<InterfaceC3967k, Integer, Unit> function24 = this.$endContent;
        Y b12 = X.b(eVar, l12, interfaceC3967k, 48);
        int I12 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        e f12 = c.f(interfaceC3967k, e11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a13 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a13);
        } else {
            interfaceC3967k.e();
        }
        Function2 f13 = C3173b.f(interfaceC3967k, b12, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            a.d(f13, I12, interfaceC3967k, I12);
        }
        F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
        function23.invoke(interfaceC3967k, 0);
        function24.invoke(interfaceC3967k, 0);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
