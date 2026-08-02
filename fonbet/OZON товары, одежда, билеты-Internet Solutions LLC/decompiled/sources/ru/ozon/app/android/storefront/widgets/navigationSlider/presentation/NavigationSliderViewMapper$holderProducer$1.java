package ru.ozon.app.android.storefront.widgets.navigationSlider.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NavigationSliderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NavigationSliderWidgetViewHolder> {
    final /* synthetic */ NavigationSliderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderViewMapper$holderProducer$1(NavigationSliderViewMapper navigationSliderViewMapper) {
        super(2);
        this.this$0 = navigationSliderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NavigationSliderWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        return new NavigationSliderWidgetViewHolder(view, this.this$0.component().getAdultHandler(), ref.getContainer().i(), this.this$0.component().getFeatureChecker(), ref);
    }
}
