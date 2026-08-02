package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/PaintDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardView$paintBackground$2 extends AbstractC7737t implements Function0<PaintDrawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HotelsSearchResultsV5CardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardView$paintBackground$2(Context context, HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView) {
        super(0);
        this.$context = context;
        this.this$0 = hotelsSearchResultsV5CardView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaintDrawable invoke() {
        DesignSystemDimensProvider designSystemDimensProvider;
        PaintDrawable paintDrawable = new PaintDrawable(ThemeExtKt.themeColor(this.$context, R$attr.layerFloor1));
        designSystemDimensProvider = this.this$0.dsProvider;
        paintDrawable.setCornerRadius(designSystemDimensProvider.getRadius24());
        return paintDrawable;
    }
}
