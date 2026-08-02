package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Bi.b;
import De.C2860c;
import F3.G;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.mlkit_common.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cardImages.ImagesAdapter;
import ru.ozon.app.android.travel.molecules.utils.RoundedFrameLayout;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeView;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.app.android.travel.utils.utils.OnSnapPositionChangeListener;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ{\u0010-\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001d2\u001a\u0010$\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\u0016J\u0015\u00102\u001a\u00020\b2\u0006\u0010\u0007\u001a\u000201¢\u0006\u0004\b2\u00103R\u0014\u00104\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u00108\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u00109\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0018\u0010>\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010@R$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010@R,\u0010$\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010AR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010BR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010gR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010gR\u0014\u0010y\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010pR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelCardView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "vo", "", "bindContentGroup", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;)V", "bindPriceGroup", "", "hasPrice", "bindV1LayoutVariant", "(Z)V", "bindV2LayoutVariant", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "bindFavoriteButton", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "hidePriceGroup", "()V", "isVisible", "toggleContentGroup", "Landroidx/lifecycle/J;", "lifecycleOwner", "subscribeToFavoriteFeature", "(Landroidx/lifecycle/J;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "onClickEvent", "Lkotlin/Function2;", "LWZ/t;", "", "onSlideImageEvent", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favoriteProductDelegate", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "setup", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Landroidx/lifecycle/J;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "onAttach", "onDetach", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;)V", "dp2", "I", "dp4", "dp6", "dp8", "dp10", "", "dpf14", "F", "dpf16", "item", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "previousImageScrollPosition", "Ljava/lang/Integer;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cardImages/ImagesAdapter;", "imageAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cardImages/ImagesAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "imagesLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/x;", "snapHelper", "Landroidx/recyclerview/widget/x;", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "onPositionChangeListener", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "Lkotlin/Function0;", "clickCardListener", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/SwipeDetector;", "swipeDetector", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/SwipeDetector;", "Landroidx/recyclerview/widget/RecyclerView;", "imagesRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeView;", "awardBadgeAB", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeView;", "Lru/ozon/app/android/travel/molecules/utils/RoundedFrameLayout;", "imagesRTSFL", "Lru/ozon/app/android/travel/molecules/utils/RoundedFrameLayout;", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "indicator", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsMapInfoV4CardTitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "hotelsMapInfoV4CardFavoriteWrapper", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "hotelsMapInfoV4CardFavoriteBv", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsMapInfoV4CardRatingBv", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/android/atom/icon/IconView;", "hotelsMapInfoV3CardReviewIconIv", "Lru/ozon/uni/android/atom/icon/IconView;", "hotelsMapInfoV3CardReviewTav", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "hotelsMapInfoV4CardPricePav", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "hotelsMapInfoV4CardPriceTav", "hotelsMapInfoV4CardMilesBv", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PlaceholderHelper;", "placeholderHelper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/PlaceholderHelper;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelCardView extends ConstraintLayoutWithBorder {
    private AnalyticData analyticData;

    @NotNull
    private final AwardBadgeView awardBadgeAB;

    @NotNull
    private final Function0<Unit> clickCardListener;
    private final int dp10;
    private final int dp2;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private final float dpf14;
    private final float dpf16;
    private FavoriteProductV4Delegate favoriteProductDelegate;
    private HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator;

    @NotNull
    private final IconView hotelsMapInfoV3CardReviewIconIv;

    @NotNull
    private final TextAtomV2View hotelsMapInfoV3CardReviewTav;

    @NotNull
    private final ProductFavoriteMoleculeV4ButtonView hotelsMapInfoV4CardFavoriteBv;

    @NotNull
    private final TouchEventsThiefFrameLayout hotelsMapInfoV4CardFavoriteWrapper;

    @NotNull
    private final BadgeView hotelsMapInfoV4CardMilesBv;

    @NotNull
    private final PriceAtomView hotelsMapInfoV4CardPricePav;

    @NotNull
    private final TextAtomV2View hotelsMapInfoV4CardPriceTav;

    @NotNull
    private final BadgeView hotelsMapInfoV4CardRatingBv;

    @NotNull
    private final TextAtomV2View hotelsMapInfoV4CardTitleTav;
    private ImagesAdapter imageAdapter;

    @NotNull
    private final LinearLayoutManager imagesLayoutManager;

    @NotNull
    private final RoundedFrameLayout imagesRTSFL;

    @NotNull
    private final RecyclerView imagesRv;

    @NotNull
    private final DottedIndicatorView indicator;
    private HotelsMapInfoV4VO.CardState item;
    private Function1<? super AtomAction, Unit> onAction;
    private Function1<? super HotelsMapInfoV4VO.Card, Unit> onClickEvent;

    @NotNull
    private final OnSnapPositionChangeListener onPositionChangeListener;
    private Function2<? super t, ? super Integer, Unit> onSlideImageEvent;

    @NotNull
    private final PlaceholderHelper placeholderHelper;
    private Integer previousImageScrollPosition;

    @NotNull
    private final x snapHelper;

    @NotNull
    private final SwipeDetector swipeDetector;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant.values().length];
            try {
                iArr[HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant.f94092V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant.f94093V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelCardView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = UiExtKt.toPx(4, context);
        this.dp4 = px2;
        int px3 = UiExtKt.toPx(6, context);
        this.dp6 = px3;
        int px4 = UiExtKt.toPx(8, context);
        this.dp8 = px4;
        int px5 = UiExtKt.toPx(10, context);
        this.dp10 = px5;
        this.dpf14 = ResourceExtKt.toPxF(14, context);
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        this.imagesLayoutManager = new LinearLayoutManager(context, 0, false);
        x xVar = new x();
        this.snapHelper = xVar;
        this.onPositionChangeListener = new OnSnapPositionChangeListener(xVar, 0, new HotelCardView$onPositionChangeListener$1(this));
        this.clickCardListener = new HotelCardView$clickCardListener$1(this);
        this.swipeDetector = new SwipeDetector(context, null, 2, null);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.hotelsMapInfoV4CardImagesRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        xVar.attachToRecyclerView(recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.imagesRv = recyclerView;
        AwardBadgeView awardBadgeView = new AwardBadgeView(context, null, 0, 6, null);
        awardBadgeView.setId(R$id.hotelsMapInfoV4CardAwardBadgeAB);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = px5;
        awardBadgeView.setLayoutParams(bVar);
        this.awardBadgeAB = awardBadgeView;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context, null, 0, 6, null);
        roundedFrameLayout.setId(R$id.hotelsMapInfoV4CardImagesRBOFL);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(UiExtKt.toPx(130, context), UiExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context));
        bVar2.setMarginEnd(px);
        bVar2.f41656t = 0;
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        roundedFrameLayout.setLayoutParams(bVar2);
        roundedFrameLayout.addView(recyclerView);
        roundedFrameLayout.addView(awardBadgeView);
        addView(roundedFrameLayout);
        this.imagesRTSFL = roundedFrameLayout;
        DottedIndicatorView dottedIndicatorView = new DottedIndicatorView(context, null, 2, null);
        int px6 = UiExtKt.toPx(4, context);
        dottedIndicatorView.setId(R$id.hotelsMapInfoV4CardIndicator);
        dottedIndicatorView.setDotColor(ThemeExtKt.themeColor(context, R$attr.graphicTertiaryOnLight));
        dottedIndicatorView.setHighlightedDotColor(ThemeExtKt.themeColor(context, R$attr.bgDarkKey));
        dottedIndicatorView.setDotRadius(px);
        dottedIndicatorView.setHighlightedDotLength(px * 2);
        dottedIndicatorView.setSpacing(px);
        DottedIndicatorView.enableBackground$default(dottedIndicatorView, null, 1, null);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        int i11 = R$id.hotelsMapInfoV4CardImagesRBOFL;
        bVar3.f41656t = i11;
        bVar3.f41658v = i11;
        bVar3.f41642l = i11;
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = px6;
        dottedIndicatorView.setLayoutParams(bVar3);
        addView(dottedIndicatorView);
        this.indicator = dottedIndicatorView;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.hotelsMapInfoV4CardTitleTav, 0, -2);
        ((ViewGroup.MarginLayoutParams) d11).topMargin = px3;
        d11.setMarginStart(px4);
        d11.setMarginEnd(px4);
        d11.f41595B = px3;
        d11.f41636i = 0;
        d11.f41655s = R$id.hotelsMapInfoV4CardImagesRBOFL;
        d11.f41657u = R$id.hotelsMapInfoV4CardFavoriteWrapper;
        d11.f41617X = true;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.hotelsMapInfoV4CardTitleTav = textAtomV2View;
        TouchEventsThiefFrameLayout touchEventsThiefFrameLayout = new TouchEventsThiefFrameLayout(context, null, 0, 0, 14, null);
        touchEventsThiefFrameLayout.setId(R$id.hotelsMapInfoV4CardFavoriteWrapper);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.setMarginEnd(px3);
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = px3;
        bVar4.f41658v = 0;
        bVar4.f41636i = 0;
        touchEventsThiefFrameLayout.setLayoutParams(bVar4);
        addView(touchEventsThiefFrameLayout);
        this.hotelsMapInfoV4CardFavoriteWrapper = touchEventsThiefFrameLayout;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
        productFavoriteMoleculeV4ButtonView.setId(R$id.hotelsMapInfoV4CardFavoriteBv);
        productFavoriteMoleculeV4ButtonView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        touchEventsThiefFrameLayout.addView(productFavoriteMoleculeV4ButtonView);
        this.hotelsMapInfoV4CardFavoriteBv = productFavoriteMoleculeV4ButtonView;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.hotelsMapInfoV4CardRatingBv, -2, -2);
        ((ViewGroup.MarginLayoutParams) a11).topMargin = px;
        int i12 = R$id.hotelsMapInfoV4CardTitleTav;
        a11.f41656t = i12;
        a11.f41638j = i12;
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.hotelsMapInfoV4CardRatingBv = badgeView;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        iconView = iconView == null ? new IconView(context, null, 0, 6, null) : iconView;
        iconView.setId(R$id.hotelsMapInfoV3CardReviewIconIv);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        bVar5.setMarginStart(px2);
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = px;
        bVar5.f41655s = R$id.hotelsMapInfoV4CardRatingBv;
        bVar5.f41638j = R$id.hotelsMapInfoV4CardTitleTav;
        bVar5.f41594A = 0;
        iconView.setLayoutParams(bVar5);
        addView(iconView);
        this.hotelsMapInfoV3CardReviewIconIv = iconView;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View2.setId(R$id.hotelsMapInfoV3CardReviewTav);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(0, -2);
        bVar6.setMarginStart(px);
        bVar6.setMarginEnd(px3);
        int i13 = R$id.hotelsMapInfoV3CardReviewIconIv;
        bVar6.f41655s = i13;
        bVar6.f41658v = R$id.hotelsMapInfoV4CardTitleTav;
        bVar6.f41636i = i13;
        bVar6.f41642l = i13;
        textAtomV2View2.setLayoutParams(bVar6);
        addView(textAtomV2View2);
        this.hotelsMapInfoV3CardReviewTav = textAtomV2View2;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.hotelsMapInfoV4CardPricePav, -2, -2);
        b11.f41656t = R$id.hotelsMapInfoV4CardTitleTav;
        b11.f41662z = px3;
        b11.f41616W = true;
        b11.f41598E = 0.0f;
        b11.f41603J = 2;
        priceAtomView.setLayoutParams(b11);
        addView(priceAtomView);
        this.hotelsMapInfoV4CardPricePav = priceAtomView;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View3, R$id.hotelsMapInfoV4CardPriceTav, -2, -2);
        addView(textAtomV2View3);
        this.hotelsMapInfoV4CardPriceTav = textAtomV2View3;
        BadgeView badgeView2 = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        Im.a.c(badgeView2, R$id.hotelsMapInfoV4CardMilesBv, -2, -2);
        addView(badgeView2);
        this.hotelsMapInfoV4CardMilesBv = badgeView2;
        this.placeholderHelper = new PlaceholderHelper(this);
        setElevation(px4);
        setPadding(px, px, px, px);
        setRadius(pxF);
        setOnClickListener(new CC.a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$33(HotelCardView hotelCardView, View view) {
        hotelCardView.clickCardListener.invoke();
    }

    private final void bindContentGroup(HotelsMapInfoV4VO.Card vo) {
        ImagesAdapter imagesAdapter = this.imageAdapter;
        if (imagesAdapter != null) {
            imagesAdapter.submitList(vo.getImages());
        }
        TextHolderKt.bindOrGone$default(this.hotelsMapInfoV4CardTitleTav, vo.getTitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.hotelsMapInfoV4CardRatingBv, vo.getRating(), new HotelCardView$bindContentGroup$1$1(this));
        IconHolderKt.bindOrGone$default(this.hotelsMapInfoV3CardReviewIconIv, vo.getReviewsIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.hotelsMapInfoV3CardReviewTav, vo.getReviewsText(), null, 2, null);
        bindFavoriteButton(vo.getFavoriteButton());
        this.imagesRTSFL.setCornerRadius(this.dpf14);
        if (vo.getIsOzonChoice()) {
            this.awardBadgeAB.bindOrGone(vo.getAwardBadgeVI());
        } else {
            ViewExtKt.gone(this.awardBadgeAB);
        }
    }

    private final void bindFavoriteButton(FavoriteProductModel favoriteButton) {
        if (favoriteButton == null) {
            this.hotelsMapInfoV4CardFavoriteBv.bindFavoriteOrGone(null);
            return;
        }
        this.hotelsMapInfoV4CardFavoriteBv.setVisibility(0);
        AnalyticData analyticData = this.analyticData;
        if (analyticData == null) {
            return;
        }
        FavoriteProductV4Delegate favoriteProductV4Delegate = this.favoriteProductDelegate;
        if (favoriteProductV4Delegate != null) {
            favoriteProductV4Delegate.bindFavoriteProductButton(this.hotelsMapInfoV4CardFavoriteBv, favoriteButton, analyticData);
        }
        this.hotelsMapInfoV4CardFavoriteWrapper.setTouchEventOneTimePassEnabled(favoriteButton.getIsFavorite());
    }

    private final void bindPriceGroup(HotelsMapInfoV4VO.Card vo) {
        PriceAtomHolderKt.bindOrGone(this.hotelsMapInfoV4CardPricePav, vo.getPrice(), new HotelCardView$bindPriceGroup$1$1(this));
        TextHolderKt.bindOrGone$default(this.hotelsMapInfoV4CardPriceTav, vo.getPriceText(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.hotelsMapInfoV4CardMilesBv, vo.getBadgeText(), new HotelCardView$bindPriceGroup$1$2(this));
    }

    private final void bindV1LayoutVariant(boolean hasPrice) {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelCardView$bindV1LayoutVariant$1(this, hasPrice));
    }

    private final void bindV2LayoutVariant(boolean hasPrice) {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelCardView$bindV2LayoutVariant$1(this, hasPrice));
    }

    private final void hidePriceGroup() {
        this.hotelsMapInfoV4CardPricePav.setVisibility(8);
        this.hotelsMapInfoV4CardPriceTav.setVisibility(8);
        this.hotelsMapInfoV4CardMilesBv.setVisibility(8);
    }

    private final void subscribeToFavoriteFeature(J lifecycleOwner) {
        InterfaceC2395h<Boolean> isFeatureActivatedFlow;
        HotelFavoritesForAuthorizedFeatureActivator hotelFavoritesForAuthorizedFeatureActivator = this.favoritesForAuthorizedFeatureActivator;
        if (hotelFavoritesForAuthorizedFeatureActivator == null || (isFeatureActivatedFlow = hotelFavoritesForAuthorizedFeatureActivator.isFeatureActivatedFlow()) == null) {
            return;
        }
        C2399j.C(new C(new C2408n0(C5427n.a(isFeatureActivatedFlow, lifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED), new HotelCardView$subscribeToFavoriteFeature$1(this, null)), new HotelCardView$subscribeToFavoriteFeature$2(null)), K.a(lifecycleOwner));
    }

    private final void toggleContentGroup(boolean isVisible) {
        this.imagesRTSFL.setVisibility(isVisible ? 0 : 8);
        this.indicator.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardTitleTav.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardFavoriteBv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV4CardRatingBv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV3CardReviewIconIv.setVisibility(isVisible ? 0 : 8);
        this.hotelsMapInfoV3CardReviewTav.setVisibility(isVisible ? 0 : 8);
    }

    public final void bind(@NotNull HotelsMapInfoV4VO.CardState vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.item = vo;
        if (vo instanceof HotelsMapInfoV4VO.Loader) {
            toggleContentGroup(false);
            hidePriceGroup();
            this.placeholderHelper.toggleContentPlaceholder(true);
            this.placeholderHelper.togglePricePlaceholder(true);
            return;
        }
        if (vo instanceof HotelsMapInfoV4VO.PriceLoader) {
            toggleContentGroup(true);
            hidePriceGroup();
            this.placeholderHelper.toggleContentPlaceholder(false);
            this.placeholderHelper.togglePricePlaceholder(true);
            bindContentGroup(((HotelsMapInfoV4VO.PriceLoader) vo).getPartialState());
            return;
        }
        if (!(vo instanceof HotelsMapInfoV4VO.Card)) {
            throw new o();
        }
        toggleContentGroup(true);
        this.placeholderHelper.toggleContentPlaceholder(false);
        this.placeholderHelper.togglePricePlaceholder(false);
        HotelsMapInfoV4VO.Card card = (HotelsMapInfoV4VO.Card) vo;
        boolean z11 = card.getPrice() != null;
        int i11 = WhenMappings.$EnumSwitchMapping$0[card.getLayoutVariant().ordinal()];
        if (i11 == 1) {
            bindV1LayoutVariant(z11);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            bindV2LayoutVariant(z11);
        }
        bindContentGroup(card);
        bindPriceGroup(card);
    }

    public final void onAttach(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        FavoriteProductV4Delegate favoriteProductV4Delegate = this.favoriteProductDelegate;
        if (favoriteProductV4Delegate != null) {
            favoriteProductV4Delegate.attachFavButtonView(this.hotelsMapInfoV4CardFavoriteBv);
        }
        this.imagesRv.addOnScrollListener(this.onPositionChangeListener);
        subscribeToFavoriteFeature(lifecycleOwner);
    }

    public final void onDetach() {
        FavoriteProductV4Delegate favoriteProductV4Delegate = this.favoriteProductDelegate;
        if (favoriteProductV4Delegate != null) {
            favoriteProductV4Delegate.detachFavButtonView();
        }
        this.imagesRv.removeOnScrollListener(this.onPositionChangeListener);
        ImagesAdapter imagesAdapter = this.imageAdapter;
        if (imagesAdapter != null) {
            imagesAdapter.submitList(null);
        }
        this.previousImageScrollPosition = null;
    }

    public final void setup(@NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super HotelsMapInfoV4VO.Card, Unit> onClickEvent, @NotNull Function2<? super t, ? super Integer, Unit> onSlideImageEvent, @NotNull FavoriteProductV4Delegate favoriteProductDelegate, @NotNull AnalyticData analyticData, @NotNull J lifecycleOwner, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(onSlideImageEvent, "onSlideImageEvent");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.onAction = onAction;
        this.onClickEvent = onClickEvent;
        this.onSlideImageEvent = onSlideImageEvent;
        this.favoriteProductDelegate = favoriteProductDelegate;
        this.analyticData = analyticData;
        this.favoritesForAuthorizedFeatureActivator = favoritesForAuthorizedFeatureActivator;
        final RecyclerView recyclerView = this.imagesRv;
        recyclerView.setLayoutManager(this.imagesLayoutManager);
        ImagesAdapter imagesAdapter = new ImagesAdapter(lifecycleOwner, this.clickCardListener);
        this.imageAdapter = imagesAdapter;
        recyclerView.setAdapter(imagesAdapter);
        this.indicator.attachTo(recyclerView);
        recyclerView.addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelCardView$setup$1$2
            private boolean isHorizontalSwipe;
            private Float startEventX;
            private Float startEventY;

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent event) {
                SwipeDetector swipeDetector;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction();
                if (action == 0) {
                    this.startEventX = Float.valueOf(event.getX());
                    this.startEventY = Float.valueOf(event.getY());
                    RecyclerView.this.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action == 1) {
                    swipeDetector = this.swipeDetector;
                    this.isHorizontalSwipe = swipeDetector.detectHorizontalSwipe(this.startEventX, this.startEventY, event.getX(), event.getY());
                    RecyclerView.this.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        });
        this.hotelsMapInfoV4CardFavoriteWrapper.setOnClickListener(favoriteUnauthorizedClickDelegate);
    }
}
