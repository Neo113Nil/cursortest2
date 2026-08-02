package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView$layerDrawable$2$1", "invoke", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView$layerDrawable$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardView$layerDrawable$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ HotelsSearchResultsV5CardView this$0;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"ru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView$layerDrawable$2$1", "Landroid/graphics/drawable/LayerDrawable;", "updateBounds", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView$layerDrawable$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LayerDrawable {
        AnonymousClass1(Drawable[] drawableArr) {
            super(drawableArr);
        }

        public final void updateBounds() {
            onBoundsChange(getBounds());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardView$layerDrawable$2(HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView) {
        super(0);
        this.this$0 = hotelsSearchResultsV5CardView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        GradientDrawable gradientBackground;
        PaintDrawable paintBackground;
        gradientBackground = this.this$0.getGradientBackground();
        paintBackground = this.this$0.getPaintBackground();
        return new AnonymousClass1(new Drawable[]{gradientBackground, paintBackground});
    }
}
