package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4WidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class InfoPopupV4ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, InfoPopupV4WidgetViewHolder> {
    final /* synthetic */ InfoPopupV4ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupV4ViewMapper$holderProducer$1(InfoPopupV4ViewMapper infoPopupV4ViewMapper) {
        super(2);
        this.this$0 = infoPopupV4ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InfoPopupV4WidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        return new InfoPopupV4WidgetViewHolder(refs, this.this$0.component().getCustomActionHandlersStoreFactory(), (InfoPopupV4View) view, tokenizedAnalytics);
    }
}
