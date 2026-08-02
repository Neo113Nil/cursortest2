package ru.ozon.uni.android.ds.compose.component.cell;

import D1.InterfaceC2801g;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import Z1.h;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellAtomKt$CenterBlock$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Locator $locator;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ CellDTO.CenterBlock $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsCellAtomKt$CenterBlock$1$1(Locator locator, CellDTO.CenterBlock centerBlock, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$locator = locator;
        this.$this_with = centerBlock;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TextDTO asTextDto;
        TextDTO asTextDto2;
        float m1847getDp2D9Ej5fM;
        e.a aVar;
        float dpOrZero;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar2 = e.f40358c0;
        e testTag = AtomLocatorKt.testTag(aVar2, this.$locator);
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        e h11 = T.h(testTag, 0.0f, dsSpacings.m1847getDp2D9Ej5fM(), 1);
        CellDTO.CenterBlock centerBlock = this.$this_with;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
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
        asTextDto = DsCellAtomKt.getAsTextDto(centerBlock.getTitle());
        BadgeDTO titleBadge = centerBlock.getTitleBadge();
        CommonAtomIconDTO titleIcon = centerBlock.getTitleIcon();
        DsCellAtomKt.m1699TitleRowWithBadgeAndIconHYR8e34(asTextDto, titleBadge, titleIcon != null ? DsCellAtomKt.getAsIconDto(titleIcon) : null, function1, null, dsSpacings.m1854getDp4D9Ej5fM(), interfaceC3967k, 196608, 16);
        CellDTO.CellText subtitle = centerBlock.getSubtitle();
        interfaceC3967k.o(-1058290445);
        if (subtitle == null) {
            aVar = aVar2;
        } else {
            asTextDto2 = DsCellAtomKt.getAsTextDto(subtitle);
            CommonCellSettings.LayoutPadding titleSpaceBetween = centerBlock.getTitleSpaceBetween();
            if (titleSpaceBetween != null) {
                dpOrZero = DsCellAtomKt.getDpOrZero(titleSpaceBetween);
                h a13 = h.a(dpOrZero);
                h hVar = a13.d() > 0.0f ? a13 : null;
                if (hVar != null) {
                    m1847getDp2D9Ej5fM = hVar.d();
                    float f11 = m1847getDp2D9Ej5fM;
                    aVar = aVar2;
                    DsTextAtomKt.DsTextAtom(asTextDto2, T.j(aVar, 0.0f, f11, 0.0f, 0.0f, 13), interfaceC3967k, 0, 0);
                }
            }
            m1847getDp2D9Ej5fM = dsSpacings.m1847getDp2D9Ej5fM();
            float f112 = m1847getDp2D9Ej5fM;
            aVar = aVar2;
            DsTextAtomKt.DsTextAtom(asTextDto2, T.j(aVar, 0.0f, f112, 0.0f, 0.0f, 13), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        List<BadgeDTO> badgeList = centerBlock.getBadgeList();
        interfaceC3967k.o(-1058280337);
        if (badgeList != null) {
            interfaceC3967k.o(-1058279146);
            if (!badgeList.isEmpty()) {
                B.a(T.j(aVar, 0.0f, dsSpacings.m1859getDp6D9Ej5fM(), 0.0f, 0.0f, 13), C5179b.n(dsSpacings.m1854getDp4D9Ej5fM()), C5179b.n(dsSpacings.m1854getDp4D9Ej5fM()), 0, 0, null, a1.c.c(-1377518890, new DsCellAtomKt$CenterBlock$1$1$1$2$1(badgeList), interfaceC3967k), interfaceC3967k, 1573302, 56);
            }
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
