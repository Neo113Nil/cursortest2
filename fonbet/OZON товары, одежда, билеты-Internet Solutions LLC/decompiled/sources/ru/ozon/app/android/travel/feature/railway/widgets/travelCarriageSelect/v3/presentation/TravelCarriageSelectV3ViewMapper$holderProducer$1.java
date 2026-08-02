package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3WidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelCarriageSelectV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelCarriageSelectV3WidgetViewHolder> {
    final /* synthetic */ TravelCarriageSelectV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCarriageSelectV3ViewMapper$holderProducer$1(TravelCarriageSelectV3ViewMapper travelCarriageSelectV3ViewMapper) {
        super(2);
        this.this$0 = travelCarriageSelectV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelCarriageSelectV3WidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        TravelCarriageSelectV3View travelCarriageSelectV3View = (TravelCarriageSelectV3View) view;
        return new TravelCarriageSelectV3WidgetViewHolder(travelCarriageSelectV3View, new TravelCarriageSelectV3MultiFrameBindDelegate(this.this$0.component().getTravelCarriageSelectV3ViewStateBinder(), this.this$0.component().getFrameBinder(), ref, travelCarriageSelectV3View), ref, this.this$0.component().getCustomActionHandlersStoreFactory());
    }
}
