package ru.ozon.uni.android.ds.compose.component.cell;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorAtomKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import t0.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellAtomKt$RightBlock$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ Locator $locator;
    final /* synthetic */ Function0<Unit> $onAction;
    final /* synthetic */ CellDTO.RightBlock $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellAtomKt$RightBlock$1$1(Locator locator, CellDTO.RightBlock rightBlock, q qVar, Function0<Unit> function0) {
        super(2);
        this.$locator = locator;
        this.$this_with = rightBlock;
        this.$interactionSource = qVar;
        this.$onAction = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Throwable] */
    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        C5179b.e asAddonItemsHorizontalArrangement;
        C5187j c5187j;
        e eVar;
        ?? r32;
        Function0<Unit> function0;
        int i12;
        e eVar2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((i11 & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
            return;
        }
        e.a aVar = e.f40358c0;
        e j11 = T.j(AtomLocatorKt.testTag(aVar, this.$locator), FoundationMapperKt.getDp(this.$this_with.getPaddingToCenter()), FoundationMapperKt.getDp(this.$this_with.getTopPadding()), 0.0f, 0.0f, 12);
        InterfaceC6250b.c addonContentVerticalAlignment$uni_release = DsCell.INSTANCE.getAddonContentVerticalAlignment$uni_release();
        asAddonItemsHorizontalArrangement = DsCellAtomKt.getAsAddonItemsHorizontalArrangement(this.$this_with.getHorizontalSpaceBetween());
        CellDTO.RightBlock rightBlock = this.$this_with;
        q qVar = this.$interactionSource;
        Function0<Unit> function02 = this.$onAction;
        Y b11 = X.b(asAddonItemsHorizontalArrangement, addonContentVerticalAlignment$uni_release, interfaceC3967k2, 48);
        int I11 = interfaceC3967k2.I();
        A0 d11 = interfaceC3967k2.d();
        e f7 = c.f(interfaceC3967k2, j11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a11);
        } else {
            interfaceC3967k2.e();
        }
        Function2 f11 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
            a.d(f11, I11, interfaceC3967k2, I11);
        }
        F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
        BadgeDTO badge = rightBlock.getBadge();
        interfaceC3967k2.o(188267485);
        C5187j c5187j2 = C5187j.f39515a;
        if (badge == null) {
            function0 = function02;
            c5187j = c5187j2;
            eVar = null;
            r32 = 0;
        } else {
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            e f13 = c.f(interfaceC3967k2, aVar);
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d13 = C2454a.d(interfaceC3967k2, f12, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                a.d(d13, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f13, InterfaceC2801g.a.f());
            interfaceC3967k2.o(-1553424604);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = DsCellAtomKt$RightBlock$1$1$1$1$1$1$1.INSTANCE;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DsBadgeAtomKt.DsBadgeAtom(badge, null, (Function1) C11, interfaceC3967k2, 384, 2);
            c5187j = c5187j2;
            eVar = null;
            r32 = 0;
            function0 = function02;
            C5185h.a(i.b(c5187j2.b(aVar), qVar, null, false, null, I1.i.a(0), function0, 12), interfaceC3967k2, 0);
            interfaceC3967k2.f();
            Unit unit = Unit.f71690a;
        }
        interfaceC3967k2.k();
        IndicatorDTO indicator = rightBlock.getIndicator();
        interfaceC3967k2.o(188290077);
        if (indicator != null) {
            DsIndicatorAtomKt.DsIndicatorAtom(indicator, eVar, interfaceC3967k2, r32, 2);
            Unit unit2 = Unit.f71690a;
        }
        interfaceC3967k2.k();
        IconDTO icon = rightBlock.getIcon();
        interfaceC3967k2.o(188293646);
        if (icon != null) {
            DsIconAtomKt.DsIconAtom(icon, eVar, interfaceC3967k2, r32, 2);
            Unit unit3 = Unit.f71690a;
        }
        interfaceC3967k2.k();
        ?? r52 = eVar;
        ButtonV3DTO button = rightBlock.getButton();
        interfaceC3967k2.o(188297336);
        if (button == null) {
            i12 = r32;
            eVar2 = r52;
        } else {
            V f14 = C5185h.f(InterfaceC6250b.a.o(), r32);
            int I13 = interfaceC3967k2.I();
            A0 d14 = interfaceC3967k2.d();
            e f15 = c.f(interfaceC3967k2, aVar);
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw r52;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a13);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d15 = C2454a.d(interfaceC3967k2, f14, interfaceC3967k2, d14);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                a.d(d15, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f15, InterfaceC2801g.a.f());
            int i13 = r32;
            DsButtonAtomKt.DsButtonAtom(button, null, false, null, interfaceC3967k, 0, 14);
            interfaceC3967k2 = interfaceC3967k;
            i12 = i13;
            eVar2 = r52;
            C5185h.a(i.b(c5187j.b(aVar), qVar, null, false, null, I1.i.a(i13), function0, 12), interfaceC3967k2, i12);
            interfaceC3967k2.f();
            Unit unit4 = Unit.f71690a;
        }
        interfaceC3967k2.k();
        ImageDTO image = rightBlock.getImage();
        interfaceC3967k2.o(188316657);
        if (image != null) {
            DsImageAtomKt.DsImageAtom(image, eVar2, interfaceC3967k2, i12, 2);
            Unit unit5 = Unit.f71690a;
        }
        interfaceC3967k2.k();
        AtomDTO control = rightBlock.getControl();
        interfaceC3967k2.o(188319957);
        if (control != null) {
            DsCellAtomKt.ControlAtom(control, eVar2, interfaceC3967k2, i12, 2);
            Unit unit6 = Unit.f71690a;
        }
        interfaceC3967k2.k();
        interfaceC3967k2.f();
    }
}
