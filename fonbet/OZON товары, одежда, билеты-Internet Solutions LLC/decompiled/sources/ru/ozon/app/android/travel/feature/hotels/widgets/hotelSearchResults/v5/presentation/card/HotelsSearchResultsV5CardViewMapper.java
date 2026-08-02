package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import A00.a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di.HotelsSearchResultsV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010$\u001a\f\u0012\u0004\u0012\u00020\u00020\"j\u0002`#2\n\u0010!\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b$\u0010%R(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0&0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R<\u0010/\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040-j\b\u0012\u0004\u0012\u00020\u0004`.0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R0\u00106\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000603j\u0002`4\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00102¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;)Ljava/lang/Object;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsSearchResultsV5CardViewMapper extends WidgetViewMapper2<HotelsSearchResultsV5Component, HotelsSearchResultsV5DTO, HotelsSearchResultsV5CardVO> {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(HotelsSearchResultsV5CardUpdate.class, HotelsSearchResultsV5ScrollWidgetKeyUpdate.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<HotelsSearchResultsV5CardVO>> holderProducer = new HotelsSearchResultsV5CardViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsSearchResultsV5DTO) && !((HotelsSearchResultsV5DTO) state).getHotels().isEmpty();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView = new HotelsSearchResultsV5CardView(context);
        hotelsSearchResultsV5CardView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return hotelsSearchResultsV5CardView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<HotelsSearchResultsV5CardDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new HotelsSearchResultsV5CardDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotelsSearchResultsV5CardVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsSearchResultsV5DTO, d, List<HotelsSearchResultsV5CardVO>> getMapper() {
        return component().getHotelsSearchResultsV5CardsMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsSearchResultsV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsSearchResultsV5Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull HotelsSearchResultsV5CardVO oldItem, @NotNull HotelsSearchResultsV5CardVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return HotelsSearchResultsV5CardPayloads.CHANGE_STATE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsSearchResultsV5CardVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsSearchResultsV5CardVO oldItem) {
        Object obj;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsSearchResultsV5CardUpdate) {
            Iterator<T> it = ((HotelsSearchResultsV5CardUpdate) update).getHotels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((HotelsSearchResultsV5CardVO) obj).getId() == oldItem.getId()) {
                    break;
                }
            }
            HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO = (HotelsSearchResultsV5CardVO) obj;
            if (hotelsSearchResultsV5CardVO != null) {
                PriceDTO mainPrice = hotelsSearchResultsV5CardVO.getMainPrice();
                TextDTO priceDescription = hotelsSearchResultsV5CardVO.getPriceDescription();
                PriceDTO marketingPrice = hotelsSearchResultsV5CardVO.getMarketingPrice();
                BadgeDTO premiumBadge = hotelsSearchResultsV5CardVO.getPremiumBadge();
                String cardBackgroundColor = hotelsSearchResultsV5CardVO.getCardBackgroundColor();
                HotelsSearchResultsV5CardVO.ItemHeaderVO marketingHeader = hotelsSearchResultsV5CardVO.getMarketingHeader();
                StockBar stockBar = hotelsSearchResultsV5CardVO.getStockBar();
                boolean isShimmerState = hotelsSearchResultsV5CardVO.getIsShimmerState();
                TextDTO priceErrorMessage = hotelsSearchResultsV5CardVO.getPriceErrorMessage();
                boolean isPriceErrorMessageVisible = hotelsSearchResultsV5CardVO.getIsPriceErrorMessageVisible();
                t viewEvent = hotelsSearchResultsV5CardVO.getViewEvent();
                AtomAction selectAction = hotelsSearchResultsV5CardVO.getSelectAction();
                boolean canShowOnboarding = hotelsSearchResultsV5CardVO.getCanShowOnboarding();
                HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant layoutVariant = hotelsSearchResultsV5CardVO.getLayoutVariant();
                return HotelsSearchResultsV5CardVO.copy$default(oldItem, 0L, null, null, null, null, mainPrice, priceDescription, marketingPrice, premiumBadge, hotelsSearchResultsV5CardVO.getImageBadges(), hotelsSearchResultsV5CardVO.getIsImageBadgesVisible(), selectAction, cardBackgroundColor, marketingHeader, stockBar, isShimmerState, viewEvent, priceErrorMessage, isPriceErrorMessageVisible, null, null, canShowOnboarding, null, null, hotelsSearchResultsV5CardVO.getRemainingOptions(), layoutVariant, hotelsSearchResultsV5CardVO.getAwardBadge(), 14155807, null);
            }
        }
        return null;
    }
}
