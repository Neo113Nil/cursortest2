package ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.DeliveryV6SectionsViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/DeliveryV6SectionsViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DeliveryV6SectionsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, DeliveryV6SectionsViewHolder> {
    final /* synthetic */ DeliveryV6SectionsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6SectionsViewMapper$holderProducer$1(DeliveryV6SectionsViewMapper deliveryV6SectionsViewMapper) {
        super(2);
        this.this$0 = deliveryV6SectionsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final DeliveryV6SectionsViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        return new DeliveryV6SectionsViewHolder((RecyclerView) view, this.this$0.component().getTokenizedAnalytics(), composerReferences, this.this$0.component().getHandlersInhibitor());
    }
}
