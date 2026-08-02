package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.data.LotteryInformationDTO;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.di.LotteryInformationWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/di/LotteryInformationWidgetComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryInformationWidgetKt$LotteryInformationWidget$1$3$component$2 extends AbstractC7737t implements Function0<LotteryInformationWidgetComponent> {
    final /* synthetic */ j<LotteryInformationDTO, LotteryInformationVI> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryInformationWidgetKt$LotteryInformationWidget$1$3$component$2(j<LotteryInformationDTO, LotteryInformationVI> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LotteryInformationWidgetComponent invoke() {
        return (LotteryInformationWidgetComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(LotteryInformationWidgetComponent.class);
    }
}
