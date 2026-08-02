package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import K1.T;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.common.SingleLineTextKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DecorationBoxKt$DecorationBox$1$4$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ T $valueTextStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DecorationBoxKt$DecorationBox$1$4$1(e eVar, String str, long j11, T t2) {
        super(2);
        this.$placeholderModifier = eVar;
        this.$placeholder = str;
        this.$placeholderColor = j11;
        this.$valueTextStyle = t2;
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
        e eVar = this.$placeholderModifier;
        String str = this.$placeholder;
        long j11 = this.$placeholderColor;
        T t2 = this.$valueTextStyle;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, eVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        SingleLineTextKt.m1704SingleLineTextsW7UJKQ(str, j11, t2, null, interfaceC3967k, 0, 8);
        interfaceC3967k.f();
    }
}
