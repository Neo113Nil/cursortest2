package ru.ozon.uni.android.ds.compose.component.input;

import D1.InterfaceC2801g;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsInputBaseImplKt$InputBody$3 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> $decorationBox;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsInputBaseImplKt$InputBody$3(InterfaceC6511n<? super Function2<? super InterfaceC3967k, ? super Integer, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
        super(3);
        this.$decorationBox = interfaceC6511n;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke((Function2<? super InterfaceC3967k, ? super Integer, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Function2<? super InterfaceC3967k, ? super Integer, Unit> it, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.F(it) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        d.b i12 = InterfaceC6250b.a.i();
        InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> interfaceC6511n = this.$decorationBox;
        e.a aVar = e.f40358c0;
        Y b11 = X.b(C5179b.f(), i12, interfaceC3967k, 48);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, aVar);
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
        Function2 f11 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(f11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        interfaceC6511n.invoke(it, interfaceC3967k, Integer.valueOf(i11 & 14));
        interfaceC3967k.f();
    }
}
