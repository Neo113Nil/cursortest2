package ru.ozon.uni.foundation.components.input;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import i1.C6981a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.foundation.utils.EmptyInteractionSource;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FoundationInputKt$getTrailingIcon$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $systemRightContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FoundationInputKt$getTrailingIcon$1(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.$systemRightContent = function2;
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
        e.a aVar = e.f40358c0;
        EnumC9909s enumC9909s = EnumC9909s.Min;
        e a11 = C6981a.a(M.c(M.a(aVar, enumC9909s), enumC9909s), 0.4f);
        Function2<InterfaceC3967k, Integer, Unit> function2 = this.$systemRightContent;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, a11);
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
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        Ek.a.g(f11, interfaceC3967k, 1441970585);
        if (function2 != null) {
            function2.invoke(interfaceC3967k, 0);
        }
        interfaceC3967k.k();
        e d13 = a0.d(aVar);
        EmptyInteractionSource emptyInteractionSource = EmptyInteractionSource.INSTANCE;
        interfaceC3967k.o(1441983987);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = FoundationInputKt$getTrailingIcon$1$1$1$1.INSTANCE;
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        C5185h.a(i.b(d13, emptyInteractionSource, null, false, null, null, (Function0) C11, 28), interfaceC3967k, 0);
        interfaceC3967k.f();
    }
}
