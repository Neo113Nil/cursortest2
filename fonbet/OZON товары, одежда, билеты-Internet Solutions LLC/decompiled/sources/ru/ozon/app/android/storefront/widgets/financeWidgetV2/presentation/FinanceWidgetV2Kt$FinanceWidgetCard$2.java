package ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.data.FinanceWidgetCardDTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class FinanceWidgetV2Kt$FinanceWidgetCard$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ FinanceWidgetCardDTO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FinanceWidgetV2Kt$FinanceWidgetCard$2(FinanceWidgetCardDTO financeWidgetCardDTO, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$state = financeWidgetCardDTO;
        this.$actionHandler = function1;
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
        e e11 = a0.e(aVar, 1.0f);
        d.b i12 = InterfaceC6250b.a.i();
        FinanceWidgetCardDTO financeWidgetCardDTO = this.$state;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        Y b11 = X.b(C5179b.f(), i12, interfaceC3967k, 48);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, e11);
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
        UniTheme uniTheme = UniTheme.INSTANCE;
        e j11 = T.j(aVar, uniTheme.getPaddings().getPadding400(), 0.0f, uniTheme.getPaddings().getPadding200(), 0.0f, 10);
        C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I12 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        e f12 = c.f(interfaceC3967k, j11);
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
        Function2 c11 = P.c(interfaceC3967k, a12, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            a.d(c11, I12, interfaceC3967k, I12);
        }
        F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
        TextDTO title = financeWidgetCardDTO.getTitle();
        interfaceC3967k.o(-10156522);
        if (title != null) {
            DsTextAtomKt.DsTextAtom(title, T.j(aVar, 0.0f, 0.0f, 0.0f, uniTheme.getPaddings().getPadding100(), 7), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(financeWidgetCardDTO.getMainText(), null, interfaceC3967k, 0, 2);
        interfaceC3967k.f();
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
        }
        E.a(interfaceC3967k, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
        float padding300 = uniTheme.getPaddings().getPadding300();
        if (financeWidgetCardDTO.getChevronIcon() != null) {
            interfaceC3967k.o(-469939171);
            DsIconAtomKt.DsIconAtom(financeWidgetCardDTO.getChevronIcon(), T.j(aVar, 0.0f, 0.0f, padding300, 0.0f, 11), interfaceC3967k, IconDTO.$stable, 0);
            interfaceC3967k.k();
        } else if (financeWidgetCardDTO.getImage() != null) {
            interfaceC3967k.o(-469933334);
            DsImageAtomKt.DsImageAtom(financeWidgetCardDTO.getImage(), null, interfaceC3967k, 0, 2);
            interfaceC3967k.k();
        } else if (financeWidgetCardDTO.getActionButton() != null) {
            interfaceC3967k.o(-469930674);
            DsButtonAtomKt.DsButtonAtom(financeWidgetCardDTO.getActionButton(), T.j(aVar, 0.0f, 0.0f, padding300, 0.0f, 11), false, function1, interfaceC3967k, 0, 4);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1682748682);
            interfaceC3967k.k();
        }
        interfaceC3967k.f();
    }
}
