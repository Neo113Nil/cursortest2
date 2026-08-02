package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.compose;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.TitleSubtitleVO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TitleSubtitleV2ComposableKt$TitleSubtitleComposable$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ TitleSubtitleVO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TitleSubtitleV2ComposableKt$TitleSubtitleComposable$1(TitleSubtitleVO titleSubtitleVO) {
        super(3);
        this.$item = titleSubtitleVO;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        DsTextAtomKt.DsTextAtom(this.$item.getTitle(), null, interfaceC3967k, 0, 2);
        TextDTO subtitle = this.$item.getSubtitle();
        if (subtitle == null) {
            return;
        }
        DsTextAtomKt.DsTextAtom(subtitle, null, interfaceC3967k, 0, 2);
    }
}
