package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import D1.InterfaceC2801g;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.selectionControls.radio.DsRadioAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import u0.E;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class ThemeChooserContentKt$ThemeItem$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ThemeChooserDTO.ThemeSelector $themeSelector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThemeChooserContentKt$ThemeItem$2(ThemeChooserDTO.ThemeSelector themeSelector) {
        super(2);
        this.$themeSelector = themeSelector;
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
        Paddings paddings = Paddings.PADDING_300;
        e h11 = T.h(aVar, 0.0f, paddings.m1867getDpD9Ej5fM(), 1);
        d.a g10 = InterfaceC6250b.a.g();
        ThemeChooserDTO.ThemeSelector themeSelector = this.$themeSelector;
        C5194q a11 = C5193p.a(C5179b.g(), g10, interfaceC3967k, 48);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, h11);
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
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        DsImageAtomKt.DsImageAtom(themeSelector.getThemeImage(), T.h(aVar, Paddings.PADDING_500.m1867getDpD9Ej5fM(), 0.0f, 2), interfaceC3967k, 0, 0);
        E.a(interfaceC3967k, a0.f(aVar, paddings.m1867getDpD9Ej5fM()));
        DsTextAtomKt.DsTextAtom(themeSelector.getTitle(), T.h(aVar, Paddings.PADDING_200.m1867getDpD9Ej5fM(), 0.0f, 2), interfaceC3967k, 0, 0);
        E.a(interfaceC3967k, a0.f(aVar, paddings.m1867getDpD9Ej5fM()));
        DsRadioAtomKt.DsRadioAtom(themeSelector.getRadio(), null, null, null, interfaceC3967k, RadioDTO.$stable, 14);
        interfaceC3967k.f();
    }
}
