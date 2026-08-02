package ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation;

import Pc.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import jk0.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductVO;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020!H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R6\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00190?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010I\u001a\n\u0018\u00010Gj\u0004\u0018\u0001`H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010Q\u001a\n\u0018\u00010Oj\u0004\u0018\u0001`P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010Y\u001a\n\u0018\u00010Wj\u0004\u0018\u0001`X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductsAdapter;", "Ljk0/d;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/utils/CartPriceAtomBinder;", "cartPriceAtomBinder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favMoleculeDelegateProvider", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;LPc/a;Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;)V", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "item", "", "widgetStateId", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductViewHolder;", "holderScroll", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollProductViewHolder;I)V", "getItemViewType", "(I)I", "", "getItemId", "(I)J", "getItemCount", "()I", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "LPc/a;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "Lru/ozon/composer/ui/widget/l;", "getWidgetViewItem", "()Lru/ozon/composer/ui/widget/l;", "setWidgetViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "setWidgetInfo", "(Ll20/d;)V", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "setViewedPond", "(Lru/ozon/composer/ui/widget/f;)V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScrollProductsAdapter extends d<ScrollProductViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AdultListDelegateProvider adultListDelegateProvider;

    @NotNull
    private final a<CartPriceAtomBinder> cartPriceAtomBinder;

    @NotNull
    private final ProductFavoriteDelegateProvider favMoleculeDelegateProvider;

    @NotNull
    private List<ProductVO> items;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final l tokenizedAnalytics;
    private c trackingData;
    private f viewedPond;
    private l20.d widgetInfo;
    private ru.ozon.composer.ui.widget.l widgetViewItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollProductsAdapter(@NotNull ComposerReferences ref, @NotNull J lifecycleOwner, @NotNull AdultListDelegateProvider adultListDelegateProvider, @NotNull a<CartPriceAtomBinder> cartPriceAtomBinder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, @NotNull ProductFavoriteDelegateProvider favMoleculeDelegateProvider) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        Intrinsics.checkNotNullParameter(cartPriceAtomBinder, "cartPriceAtomBinder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(favMoleculeDelegateProvider, "favMoleculeDelegateProvider");
        this.ref = ref;
        this.lifecycleOwner = lifecycleOwner;
        this.adultListDelegateProvider = adultListDelegateProvider;
        this.cartPriceAtomBinder = cartPriceAtomBinder;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.favMoleculeDelegateProvider = favMoleculeDelegateProvider;
        this.items = K.f71697a;
    }

    private final void trackView(ProductVO item, String widgetStateId) {
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            ru.ozon.composer.ui.widget.l lVar = this.widgetViewItem;
            t tokenizedEvent = TrackingInfoMapperKt.toTokenizedEvent(trackingInfo, lVar != null ? Long.valueOf(lVar.f()) : null, ActionType.VIEW.INSTANCE.getType());
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                f fVar = this.viewedPond;
                if (fVar != null) {
                    fVar.d(Long.valueOf(item.getId()), widgetStateId);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.productsRv;
    }

    public final void setItems(@NotNull List<ProductVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }

    public final void setViewedPond(f fVar) {
        this.viewedPond = fVar;
    }

    public final void setWidgetInfo(l20.d dVar) {
        this.widgetInfo = dVar;
    }

    public final void setWidgetViewItem(ru.ozon.composer.ui.widget.l lVar) {
        this.widgetViewItem = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ScrollProductViewHolder holderScroll, int position) {
        String str;
        Intrinsics.checkNotNullParameter(holderScroll, "holderScroll");
        holderScroll.bind(this.items.get(position));
        ProductVO productVO = this.items.get(position);
        l20.d dVar = this.widgetInfo;
        if (dVar == null || (str = dVar.d()) == null) {
            str = "";
        }
        trackView(productVO, str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ScrollProductViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = ViewGroupExtKt.inflate(parent, R$layout.view_product_express);
        c cVar = this.trackingData;
        J j11 = this.lifecycleOwner;
        ComposerReferences composerReferences = this.ref;
        AdultListDelegate adultListDelegate = this.adultListDelegateProvider.get();
        CartPriceAtomBinder cartPriceAtomBinder = this.cartPriceAtomBinder.get();
        Intrinsics.checkNotNullExpressionValue(cartPriceAtomBinder, "get(...)");
        return new ScrollProductViewHolder(inflate, cVar, j11, composerReferences, adultListDelegate, cartPriceAtomBinder, this.actionHandler, this.tokenizedAnalytics, this.adultHandler, this.widgetViewItem, this.favMoleculeDelegateProvider.get(this.ref));
    }
}
