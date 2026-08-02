package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardView$gradientBackground$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ HotelsSearchResultsV5CardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardView$gradientBackground$2(HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView) {
        super(0);
        this.this$0 = hotelsSearchResultsV5CardView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        DesignSystemDimensProvider designSystemDimensProvider;
        GradientDrawable gradientDrawable = new GradientDrawable();
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView = this.this$0;
        gradientDrawable.setShape(0);
        designSystemDimensProvider = hotelsSearchResultsV5CardView.dsProvider;
        gradientDrawable.setCornerRadius(designSystemDimensProvider.getRadius24());
        return gradientDrawable;
    }
}
