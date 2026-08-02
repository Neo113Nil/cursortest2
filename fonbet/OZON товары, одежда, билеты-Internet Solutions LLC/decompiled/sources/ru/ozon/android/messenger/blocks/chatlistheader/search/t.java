package ru.ozon.android.messenger.blocks.chatlistheader.search;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class t extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Function0 function0) {
        super(3);
        this.f84851b = function0;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        H AnimatedVisibility = h11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        androidx.compose.ui.e l02 = T.j(androidx.compose.ui.e.f40358c0, 0.0f, 0.0f, 15, 0.0f, 11).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
        interfaceC3967k2.o(-2000291886);
        Function0<Unit> function0 = this.f84851b;
        boolean n11 = interfaceC3967k2.n(function0);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new s(function0);
            interfaceC3967k2.x(C11);
        }
        interfaceC3967k2.k();
        androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(l02, false, null, null, (Function0) C11, 7);
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_300;
        Boolean bool = Boolean.FALSE;
        UniTheme uniTheme = UniTheme.INSTANCE;
        DsIconAtomKt.DsIconAtom(new IconDTO(iconSize, bool, null, null, new CommonAtomIconDTO(uniTheme.getIconTokens().getIc_s_cross().getId(), uniTheme.getColorTokens().getGraphicTertiary().getId()), null, null, null, null, null, null, null, null, null, null, null, 65516, null), c11, interfaceC3967k2, IconDTO.$stable, 0);
        return Unit.f71690a;
    }
}
