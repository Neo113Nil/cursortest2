package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.di.BannerWithActionComponent;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/di/BannerWithActionComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BannerWithActionWidgetKt$bannerWithActionWidget$1$2$component$2 extends AbstractC7737t implements Function0<BannerWithActionComponent> {
    final /* synthetic */ j<BannerWithActionDTO, BannerWithActionVO> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerWithActionWidgetKt$bannerWithActionWidget$1$2$component$2(j<BannerWithActionDTO, BannerWithActionVO> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BannerWithActionComponent invoke() {
        return (BannerWithActionComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(BannerWithActionComponent.class);
    }
}
