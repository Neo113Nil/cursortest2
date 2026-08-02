package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Am.b;
import Sc.s;
import Vg.d;
import WZ.l;
import WZ.t;
import Wc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.view.performance.vhlisteners.AsyncPageWidgetViewHolder;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiNewPageUpdate;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncConfig;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 w2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u00042\u00020\u0005:\u0001wBc\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010&J#\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b%\u0010'J\u000f\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020$2\u0006\u0010!\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010)J\u0017\u00101\u001a\u00020$2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020$H\u0016¢\u0006\u0004\b3\u0010)J\u000f\u00104\u001a\u00020$H\u0016¢\u0006\u0004\b4\u0010)J3\u0010;\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u00022\n\u00107\u001a\u000605j\u0002`62\u000e\u0010:\u001a\n\u0018\u000108j\u0004\u0018\u0001`9H\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020=H\u0096\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020$H\u0096\u0001¢\u0006\u0004\bA\u0010)J*\u0010G\u001a\u00020$2\u0006\u0010>\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010F\u001a\u00020EH\u0096\u0001¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020$2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020$2\u0006\u0010M\u001a\u00020I2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020$H\u0002¢\u0006\u0004\bR\u0010)J\u000f\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020$H\u0002¢\u0006\u0004\bV\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ZR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010]R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010^R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020$0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010e\u001a\u0012\u0012\b\u0012\u00060cj\u0002`d\u0012\u0004\u0012\u00020$0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010bR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010j\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR*\u0010v\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020$\u0018\u00010_8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/app/android/composer/view/performance/vhlisteners/AsyncPageWidgetViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5MultiFrameBindDelegate;", "multiFrameBindDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "cardViewModel", "favoriteProductDelegate", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5MultiFrameBindDelegate;LVg/d;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;LWZ/l;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Ll20/d;)V", "onAttach", "()V", "onViewInVisibleBounds", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onViewOutOfVisibleBounds", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "onDetach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "onBoarding", "", "onboardingKey", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "subscribeToOnboarding", "", "isScreenVisible", "()Z", "subscribeToFavoriteFeature", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/multiFrameBinding/HotelsSearchResultsV5MultiFrameBindDelegate;", "LVg/d;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackViewHandler", "", "onboardingVerticalMargin", "I", "onboardingHorizontalMargin", "onboardingCornerRadius", "F", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoriteUnauthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5CardWidgetViewHolder extends k<HotelsSearchResultsV5CardVO> implements FavoriteProductDelegate, AsyncPageWidgetViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsSearchResultsV5CardViewModel cardViewModel;

    @NotNull
    private final HotelsSearchResultsV5CardView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteProductDelegate favoriteProductDelegate;

    @NotNull
    private final HotelFavoritesForAuthorizedFeatureActivator favoriteUnauthorizedFeatureActivator;

    @NotNull
    private final HotelsSearchResultsV5MultiFrameBindDelegate multiFrameBindDelegate;
    private OnBoardingDelegate onBoardingDelegate;
    private final float onboardingCornerRadius;
    private final int onboardingHorizontalMargin;
    private final int onboardingVerticalMargin;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function1<t, Unit> trackViewHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AtomAction selectAction;
            HotelsSearchResultsV5CardVO boundData = HotelsSearchResultsV5CardWidgetViewHolder.this.getBoundData();
            if (boundData == null || (selectAction = boundData.getSelectAction()) == null) {
                return;
            }
            HotelsSearchResultsV5CardWidgetViewHolder.this.actionHandler.invoke(selectAction);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardWidgetViewHolder$Companion;", "", "<init>", "()V", "FULL_VISIBLE_VIEW_PERCENT", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsSearchResultsV5CardWidgetViewHolder(@NotNull HotelsSearchResultsV5CardView containerView, @NotNull ComposerReferences refs, @NotNull HotelsSearchResultsV5MultiFrameBindDelegate multiFrameBindDelegate, @NotNull d customActionHandlersStoreFactory, @NotNull HotelsSearchResultsV5CardViewModel cardViewModel, @NotNull FavoriteProductDelegate favoriteProductDelegate, @NotNull l tokenizedAnalytics, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull FeatureChecker featureChecker, @NotNull AuthStateStorage authStateStorage, @NotNull HotelFavoriteUnauthorizedAnalytics favoriteUnauthorizedAnalytics) {
        super(containerView);
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(multiFrameBindDelegate, "multiFrameBindDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(cardViewModel, "cardViewModel");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(favoriteUnauthorizedAnalytics, "favoriteUnauthorizedAnalytics");
        this.containerView = containerView;
        this.refs = refs;
        this.multiFrameBindDelegate = multiFrameBindDelegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.cardViewModel = cardViewModel;
        this.favoriteProductDelegate = favoriteProductDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onboardingViewModel = onboardingViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new HotelsSearchResultsV5CardWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.trackViewHandler = new HotelsSearchResultsV5CardWidgetViewHolder$trackViewHandler$1(this);
        this.onboardingVerticalMargin = UiExtKt.toPx(4, getContext());
        this.onboardingHorizontalMargin = UiExtKt.toPx(8, getContext());
        this.onboardingCornerRadius = ResourceExtKt.toPxF(10, getContext());
        this.favoriteUnauthorizedFeatureActivator = new HotelFavoritesForAuthorizedFeatureActivator(featureChecker, authStateStorage.isAuthenticated(), authStateStorage.getAuthState());
        containerView.setOnClickListener(new b(this, 6));
        containerView.initAdapter(this, new AnonymousClass2());
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        containerView.getHotelsSearchResultsV5FavoriteButtonWrapper().setOnClickListener(new HotelFavoriteUnauthorizedClickDelegate(asNotificationLayoutManager$default, buildHandler, refs.getContainer().g(), favoriteUnauthorizedAnalytics));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder, View view) {
        AtomAction selectAction;
        HotelsSearchResultsV5CardVO boundData = hotelsSearchResultsV5CardWidgetViewHolder.getBoundData();
        if (boundData == null || (selectAction = boundData.getSelectAction()) == null) {
            return;
        }
        hotelsSearchResultsV5CardWidgetViewHolder.actionHandler.invoke(selectAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(OnBoardingDTO vo) {
        if (isScreenVisible()) {
            String onboardingKey = vo.getOnboardingKey();
            if (onboardingKey == null) {
                onboardingKey = "hotels_search_results_v5_onboarding_key";
            }
            String str = onboardingKey;
            PriceAtomView hotelsSearchResultsV5CardMainPricePV = this.containerView.getHotelsSearchResultsV5CardMainPricePV();
            FlexboxLayout hotelsSearchResultsV5CardPriceContentFl = this.containerView.getHotelsSearchResultsV5CardPriceContentFl();
            int left = hotelsSearchResultsV5CardPriceContentFl.getLeft();
            int top = hotelsSearchResultsV5CardPriceContentFl.getTop();
            ComposerExtKt.withPageTag(this.refs.getContainer(), new HotelsSearchResultsV5CardWidgetViewHolder$bindOnBoarding$1(this, str, vo, left, top, hotelsSearchResultsV5CardMainPricePV.getWidth() + left, hotelsSearchResultsV5CardMainPricePV.getHeight() + top));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding, String onboardingKey) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.refs, this.itemView, onBoarding, this, this.onboardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new HotelsSearchResultsV5CardWidgetViewHolder$initDelegate$1$1(this));
        onBoardingDelegateImpl.setOnUnbindListener(new HotelsSearchResultsV5CardWidgetViewHolder$initDelegate$1$2(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    private final boolean isScreenVisible() {
        List<ComponentCallbacksC5392m> r02;
        G d11 = this.refs.getContainer().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = (d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02);
        return (componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null;
    }

    private final void subscribeToFavoriteFeature() {
        C2399j.C(new C(new C2408n0(C5427n.a(this.favoriteUnauthorizedFeatureActivator.isFeatureActivatedFlow(), getLifecycle(), AbstractC5434v.b.STARTED), new HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1(this, null)), new HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2(null)), K.a(this));
    }

    private final void subscribeToOnboarding() {
        final InterfaceC2395h o11 = C2399j.o(C5427n.a(this.cardViewModel.getOnboardingSharedFlow(), getLifecycle(), AbstractC5434v.b.STARTED));
        C2399j.C(new C2408n0(new InterfaceC2395h<HotelsSearchResultsV5CardViewModel.OnboardingEvent>() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$$inlined$filter$1$2", f = "HotelsSearchResultsV5CardWidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                HotelsSearchResultsV5CardViewModel.OnboardingEvent onboardingEvent = (HotelsSearchResultsV5CardViewModel.OnboardingEvent) obj;
                                HotelsSearchResultsV5CardVO boundData = this.this$0.getBoundData();
                                if (boundData != null && onboardingEvent.getRecipientId() == boundData.getId()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super HotelsSearchResultsV5CardViewModel.OnboardingEvent> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2(this, null)), K.a(this));
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favoriteProductDelegate.attachFavButtonView(button);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favoriteProductDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favoriteProductDelegate.detachFavButtonView();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.favoriteProductDelegate.attachFavButtonView(this.containerView.getFavoriteButtonPFMBV());
        subscribeToOnboarding();
        this.multiFrameBindDelegate.onAttach();
        subscribeToFavoriteFeature();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.multiFrameBindDelegate.onDetach();
        this.favoriteProductDelegate.detachFavButtonView();
        ComposerExtKt.withPageTag(this.refs.getContainer(), new HotelsSearchResultsV5CardWidgetViewHolder$onDetach$1(this));
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.multiFrameBindDelegate.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.multiFrameBindDelegate.onRecycle();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        HotelsSearchResultsV5CardVO boundData = getBoundData();
        if (boundData != null) {
            this.cardViewModel.addVisibleCardId(boundData.getId());
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        HotelsSearchResultsV5CardVO boundData = getBoundData();
        if (boundData != null) {
            this.cardViewModel.deleteVisibleCardId(boundData.getId());
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        HotelsSearchResultsV5CardVO boundData;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        if (info.a().d().isEmpty() || o.a(this.containerView, info, false) < 1.0f || (boundData = getBoundData()) == null) {
            return;
        }
        this.cardViewModel.onCardIsOnTheScreen(boundData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favoriteProductDelegate.setOnFavoriteClick(function1);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsSearchResultsV5CardVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsSearchResultsV5CardWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsSearchResultsV5CardVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload == HotelsSearchResultsV5CardPayloads.CHANGE_STATE) {
            this.containerView.showNewState(item, this.actionHandler, this.trackViewHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsSearchResultsV5CardVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.cardViewModel.addLayoutTraceId(String.valueOf(hashCode()));
        AsyncConfig asyncConfig = item.getAsyncConfig();
        if (asyncConfig != null && this.cardViewModel.shouldSendRequest(asyncConfig.getAsyncData())) {
            this.refs.getController().update(new HotelsSearchResultsV5LoadingNoUiNewPageUpdate(asyncConfig));
        }
        this.multiFrameBindDelegate.bind(item, this.actionHandler);
        this.containerView.setFavoriteButton(item, new HotelsSearchResultsV5CardWidgetViewHolder$bind$2$1(this, item));
        this.containerView.showNewState(item, this.actionHandler, this.trackViewHandler);
    }
}
