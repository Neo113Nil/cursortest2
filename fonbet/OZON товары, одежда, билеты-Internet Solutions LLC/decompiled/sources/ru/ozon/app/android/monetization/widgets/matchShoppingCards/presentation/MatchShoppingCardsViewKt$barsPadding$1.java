package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import Z1.d;
import a00.C4911f;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import b00.f;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.C9915y;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$barsPadding$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ boolean $isTeensModeEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$barsPadding$1(boolean z11) {
        super(3);
        this.$isTeensModeEnabled = z11;
    }

    private static final InterfaceC9914x invoke$lambda$1(InterfaceC3978p0<InterfaceC9914x> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(187850887);
        d dVar = (d) interfaceC3967k.m(K0.e());
        ComponentCallbacksC5392m c11 = ((C4911f) interfaceC3967k.m(f.d())).c();
        interfaceC3967k.o(890205125);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            float f7 = 0;
            C11 = n1.f(new C9915y(f7, f7, f7, f7), D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(890208254);
        boolean F11 = interfaceC3967k.F(c11) | interfaceC3967k.n(dVar) | interfaceC3967k.p(this.$isTeensModeEnabled);
        boolean z11 = this.$isTeensModeEnabled;
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new MatchShoppingCardsViewKt$barsPadding$1$1$1(c11, dVar, z11, interfaceC3978p0, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, dVar, (Function2) C12);
        e e11 = T.e(composed, invoke$lambda$1(interfaceC3978p0));
        interfaceC3967k.k();
        return e11;
    }
}
