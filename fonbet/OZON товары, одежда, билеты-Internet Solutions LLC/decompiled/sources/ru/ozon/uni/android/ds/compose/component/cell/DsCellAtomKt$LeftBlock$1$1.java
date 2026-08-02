package ru.ozon.uni.android.ds.compose.component.cell;

import D1.InterfaceC2801g;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
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
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellAtomKt$LeftBlock$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Locator $locator;
    final /* synthetic */ CellDTO.LeftBlock $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellAtomKt$LeftBlock$1$1(Locator locator, CellDTO.LeftBlock leftBlock) {
        super(2);
        this.$locator = locator;
        this.$this_with = leftBlock;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        C5179b.e asAddonItemsHorizontalArrangement;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e j11 = T.j(AtomLocatorKt.testTag(e.f40358c0, this.$locator), 0.0f, FoundationMapperKt.getDp(this.$this_with.getTopPadding()), FoundationMapperKt.getDp(this.$this_with.getPaddingToCenter()), 0.0f, 9);
        InterfaceC6250b.c addonContentVerticalAlignment$uni_release = DsCell.INSTANCE.getAddonContentVerticalAlignment$uni_release();
        asAddonItemsHorizontalArrangement = DsCellAtomKt.getAsAddonItemsHorizontalArrangement(this.$this_with.getHorizontalSpaceBetween());
        CellDTO.LeftBlock leftBlock = this.$this_with;
        Y b11 = X.b(asAddonItemsHorizontalArrangement, addonContentVerticalAlignment$uni_release, interfaceC3967k, 48);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, j11);
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
        AtomDTO control = leftBlock.getControl();
        interfaceC3967k.o(-79087682);
        if (control != null) {
            DsCellAtomKt.ControlAtom(control, null, interfaceC3967k, 0, 2);
        }
        interfaceC3967k.k();
        IconDTO icon = leftBlock.getIcon();
        interfaceC3967k.o(-79084361);
        if (icon != null) {
            DsIconAtomKt.DsIconAtom(icon, null, interfaceC3967k, 0, 2);
        }
        interfaceC3967k.k();
        ImageDTO image = leftBlock.getImage();
        interfaceC3967k.o(-79081222);
        if (image != null) {
            DsImageAtomKt.DsImageAtom(image, null, interfaceC3967k, 0, 2);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
