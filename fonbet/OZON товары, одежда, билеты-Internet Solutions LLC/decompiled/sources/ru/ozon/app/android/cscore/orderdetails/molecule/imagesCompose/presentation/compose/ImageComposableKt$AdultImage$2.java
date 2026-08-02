package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ImageComposableKt$AdultImage$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ComposableImageVO $item;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $showIcon;
    final /* synthetic */ ImageSlotSize $slotSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComposableKt$AdultImage$2(ComposableImageVO composableImageVO, ImageSlotSize imageSlotSize, e eVar, boolean z11, int i11, int i12) {
        super(2);
        this.$item = composableImageVO;
        this.$slotSize = imageSlotSize;
        this.$modifier = eVar;
        this.$showIcon = z11;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ImageComposableKt.AdultImage(this.$item, this.$slotSize, this.$modifier, this.$showIcon, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
