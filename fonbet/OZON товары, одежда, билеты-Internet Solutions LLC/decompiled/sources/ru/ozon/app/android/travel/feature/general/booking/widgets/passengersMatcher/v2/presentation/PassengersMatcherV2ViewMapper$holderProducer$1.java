package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PassengersMatcherV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PassengersMatcherV2WidgetViewHolder> {
    final /* synthetic */ PassengersMatcherV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassengersMatcherV2ViewMapper$holderProducer$1(PassengersMatcherV2ViewMapper passengersMatcherV2ViewMapper) {
        super(2);
        this.this$0 = passengersMatcherV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PassengersMatcherV2WidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        return new PassengersMatcherV2WidgetViewHolder(view, references, this.this$0.component().getCustomActionHandlersStoreFactory(), TravelPageStorageUtilsKt.getTravelPageStorageHolder(references).getPageStorage(), this.this$0.component().getTokenizedAnalytics());
    }
}
