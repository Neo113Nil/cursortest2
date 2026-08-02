package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposableKt$ReviewGalleryItemContent$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ReviewGalleryPreviewV2VO.ItemVO $item;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewComposableKt$ReviewGalleryItemContent$3(e eVar, ReviewGalleryPreviewV2VO.ItemVO itemVO, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$item = itemVO;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReviewGalleryPreviewComposableKt.ReviewGalleryItemContent(this.$modifier, this.$item, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
