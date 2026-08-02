package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Je.InterfaceC3394a;
import Je.e;
import a00.C4908c;
import android.content.Context;
import androidx.core.graphics.c;
import androidx.core.view.C5353y0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.helpers.ComposerContainersUpdater;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding.HotelsMapInfoOnboardingBinder;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons.ControlPanelBinder;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.polygons.PolygonPlacemarkProvider;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards.CardsAdapter;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PlacemarkProvider;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.WindowInsetsWrapper;
import ru.ozon.app.android.travel.utils.helpers.BackPressedHelper;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import we0.C10551g;
import we0.m;
import we0.n;
import we0.q;
import we0.r;
import we0.u;
import we0.v;
import xe.B0;
import xe.C10727i;
import ye0.InterfaceC10889a;

@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010!\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010!\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\f2\u0006\u0010!\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J+\u00101\u001a\u001e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-j\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/`0H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020.03H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020.03H\u0002¢\u0006\u0004\b6\u00105JS\u0010<\u001a\r\u0012\t\u0012\u00070.¢\u0006\u0002\b;032\"\u00107\u001a\u001e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-j\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/`02\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020908H\u0082@¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u000209H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010\u001eJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010!\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ!\u0010I\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\f2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010!\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\f2\u0006\u0010!\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\f2\u0006\u0010!\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\f2\u0006\u0010!\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^J-\u0010d\u001a\u00020\f2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_032\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020KH\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\fH\u0002¢\u0006\u0004\bf\u0010\u001eJ\u000f\u0010g\u001a\u00020\fH\u0002¢\u0006\u0004\bg\u0010\u001eJ\u000f\u0010h\u001a\u00020\fH\u0002¢\u0006\u0004\bh\u0010\u001eJ\u0017\u0010k\u001a\u00020\f2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\fH\u0002¢\u0006\u0004\bm\u0010\u001eJ\u0017\u0010o\u001a\u00020\f2\u0006\u0010n\u001a\u00020aH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\f2\u0006\u0010!\u001a\u00020qH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\f2\u0006\u0010u\u001a\u00020tH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\fH\u0002¢\u0006\u0004\bx\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010yR$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010zR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010{R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010|R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010}R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010~R \u0010\u0081\u0001\u001a\u000b \u0080\u0001*\u0004\u0018\u00010\u007f0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R#\u0010\u009c\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010zR\"\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010zR\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001RC\u0010¦\u0001\u001a.\u0012\u0005\u0012\u00030¤\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020/0¥\u00010-j\u0016\u0012\u0005\u0012\u00030¤\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020/0¥\u0001`08\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001¨\u0006¨\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4Wrapper;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder;", "onboardingBinder", "Ll10/i;", "container", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View;", "hotelsMapInfoView", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "viewModel", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/onboarding/HotelsMapInfoOnboardingBinder;Ll10/i;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;Landroidx/lifecycle/v;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;)V", "observeActions", "()V", "onDestroy", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$InitState;", "action", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$InitState;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$RefreshState;", "refreshState", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$RefreshState;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$Move;", "moveCamera", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$Move;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$DrawPins;", "drawPins", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$DrawPins;)V", "Ljava/util/HashMap;", "", "Lwe0/u;", "Lkotlin/collections/HashMap;", "getCurrentPinsOnMapExceptDistrictLabels", "()Ljava/util/HashMap;", "", "getCurrentPinIdsOnMapExceptDistrictLabels", "()Ljava/util/List;", "getCurrentPolygonsIdsOnMap", "toDelete", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "newPins", "Lkotlin/jvm/internal/EnhancedNullability;", "getPinsToInsertAndDelete", "(Ljava/util/HashMap;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "pin", "addPin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;)V", "cancelDrawing", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$ToggleNotification;", "toggleNotification", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$ToggleNotification;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "item", "Lwe0/i;", "lastVisibleArea", "bindMap", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;Lwe0/i;)V", "", "isFinished", "sendMapReadyEvent", "(Z)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "card", "processCardClickEvent", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$UpdatePin;", "updatePin", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$UpdatePin;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$ToggleCard;", "toggleCard", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$ToggleCard;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$TogglePolygons;", "togglePolygons", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$TogglePolygons;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$TogglePolygonsPanel;", "togglePolygonsPanel", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$TogglePolygonsPanel;)V", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO$Polygon;", "polygons", "", "polygonAlpha", "isLabelsVisible", "addPolygons", "(Ljava/util/List;IZ)V", "removePolygons", "removePolygonLabels", "hideDistricts", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "model", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "hideNotification", "offset", "updateTopOffset", "(I)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$ToggleLoader;", "toggleLoader", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapAction$ToggleLoader;)V", "Landroidx/core/view/y0;", "insets", "updateInsets", "(Landroidx/core/view/y0;)V", "showErrorNotification", "Ll10/i;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "Landroidx/lifecycle/v;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroidx/lifecycle/J;", "viewOwner", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PlacemarkProvider;", "placemarkProvider", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/pins/PlacemarkProvider;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/ControlPanelBinder;", "polygonsControlPanel", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/ControlPanelBinder;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonPlacemarkProvider;", "mapPolygonsPlacemarkProvider", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/polygons/PolygonPlacemarkProvider;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/helpers/ComposerContainersUpdater;", "composerContainersUpdater", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/helpers/ComposerContainersUpdater;", "Lru/ozon/app/android/travel/utils/helpers/BackPressedHelper;", "backPressedHelper", "Lru/ozon/app/android/travel/utils/helpers/BackPressedHelper;", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "notificationBar", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter;", "cardsAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cards/CardsAdapter;", "Lwe0/m;", "onMapClickListener", "onPinClickListener", "Lxe/B0;", "drawingJob", "Lxe/B0;", "LJe/a;", "mutex", "LJe/a;", "", "", "pinsToDrawing", "Ljava/util/HashMap;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4Wrapper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BackPressedHelper backPressedHelper;

    @NotNull
    private final CardsAdapter cardsAdapter;

    @NotNull
    private final ComposerContainersUpdater composerContainersUpdater;

    @NotNull
    private final i container;
    private final Context context;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;
    private B0 drawingJob;

    @NotNull
    private final HotelsMapInfoV4View hotelsMapInfoView;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private final PolygonPlacemarkProvider mapPolygonsPlacemarkProvider;

    @NotNull
    private final InterfaceC3394a mutex;
    private NotificationBar notificationBar;

    @NotNull
    private final Function1<m, Unit> onMapClickListener;

    @NotNull
    private final Function1<HotelsMapInfoV4VO.Pin, Unit> onPinClickListener;

    @NotNull
    private final HashMap<Float, List<u>> pinsToDrawing;

    @NotNull
    private final PlacemarkProvider placemarkProvider;

    @NotNull
    private final ControlPanelBinder polygonsControlPanel;

    @NotNull
    private final HotelsMapInfoV4ViewModel viewModel;

    @NotNull
    private final J viewOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsMapInfoV4Wrapper(@NotNull AnalyticData analyticData, @NotNull ProductFavoriteDelegateProvider favoriteProductDelegateProvider, @NotNull HotelsMapInfoOnboardingBinder onboardingBinder, @NotNull i container, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull HotelsMapInfoV4View hotelsMapInfoView, @NotNull HotelsMapInfoV4ViewModel viewModel, @NotNull AbstractC5434v lifecycle, @NotNull CoroutineDispatcherProvider dispatchersProvider, @NotNull HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator, HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate) {
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(favoriteProductDelegateProvider, "favoriteProductDelegateProvider");
        Intrinsics.checkNotNullParameter(onboardingBinder, "onboardingBinder");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(hotelsMapInfoView, "hotelsMapInfoView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(favoritesForAuthorizedFeatureActivator, "favoritesForAuthorizedFeatureActivator");
        this.container = container;
        this.actionHandler = actionHandler;
        this.hotelsMapInfoView = hotelsMapInfoView;
        this.viewModel = viewModel;
        this.lifecycle = lifecycle;
        this.dispatchersProvider = dispatchersProvider;
        Context context = hotelsMapInfoView.getContext();
        this.context = context;
        C4908c g10 = container.Q().g();
        this.viewOwner = g10;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.placemarkProvider = new PlacemarkProvider(context);
        this.polygonsControlPanel = new ControlPanelBinder(hotelsMapInfoView, onboardingBinder);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        PolygonPlacemarkProvider polygonPlacemarkProvider = new PolygonPlacemarkProvider(context);
        polygonPlacemarkProvider.setOnPinClickListener(new HotelsMapInfoV4Wrapper$mapPolygonsPlacemarkProvider$1$1(this));
        this.mapPolygonsPlacemarkProvider = polygonPlacemarkProvider;
        ComposerContainersUpdater composerContainersUpdater = new ComposerContainersUpdater(container.Z(), new HotelsMapInfoV4Wrapper$composerContainersUpdater$2(this), new HotelsMapInfoV4Wrapper$composerContainersUpdater$3(hotelsMapInfoView), new HotelsMapInfoV4Wrapper$composerContainersUpdater$1(this));
        this.composerContainersUpdater = composerContainersUpdater;
        this.backPressedHelper = new BackPressedHelper(actionHandler, container.Q().a(), container.Q().g());
        CardsAdapter cardsAdapter = new CardsAdapter(actionHandler, new HotelsMapInfoV4Wrapper$cardsAdapter$1(this), new HotelsMapInfoV4Wrapper$cardsAdapter$2(this), favoriteProductDelegateProvider, analyticData, g10, container, favoritesForAuthorizedFeatureActivator, hotelFavoriteUnauthorizedClickDelegate);
        hotelsMapInfoView.setupCardsRv(cardsAdapter);
        hotelsMapInfoView.setOnSwipeDownListener(new HotelsMapInfoV4Wrapper$cardsAdapter$3$1$1(this));
        hotelsMapInfoView.setOnSlideCardListener(new HotelsMapInfoV4Wrapper$cardsAdapter$3$1$2(this));
        this.cardsAdapter = cardsAdapter;
        this.onMapClickListener = new HotelsMapInfoV4Wrapper$onMapClickListener$1(this);
        this.onPinClickListener = new HotelsMapInfoV4Wrapper$onPinClickListener$1(this);
        this.mutex = e.a();
        HashMap<Float, List<u>> hashMap = new HashMap<>(4);
        hashMap.put(Float.valueOf(3.0f), new ArrayList());
        hashMap.put(Float.valueOf(5.0f), new ArrayList(1));
        hashMap.put(Float.valueOf(2.0f), new ArrayList(50));
        hashMap.put(Float.valueOf(1.0f), new ArrayList(100));
        this.pinsToDrawing = hashMap;
        composerContainersUpdater.setOnLayoutChangeListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPin(HotelsMapInfoV4VO.Pin pin) {
        HashMap<Float, List<u>> hashMap = this.pinsToDrawing;
        Float valueOf = Float.valueOf(pin.getZIndex());
        List<u> list = hashMap.get(valueOf);
        if (list == null) {
            list = new ArrayList<>();
            hashMap.put(valueOf, list);
        }
        List<u> list2 = list;
        u provide = this.placemarkProvider.provide(pin);
        if (provide != null) {
            list2.add(provide);
        }
        this.pinsToDrawing.put(Float.valueOf(pin.getZIndex()), list2);
    }

    private final void addPolygons(List<DistrictsVO.Polygon> polygons, int polygonAlpha, boolean isLabelsVisible) {
        ArrayList arrayList = new ArrayList();
        for (DistrictsVO.Polygon polygon : polygons) {
            if (isLabelsVisible) {
                arrayList.add(this.mapPolygonsPlacemarkProvider.provide(polygon.getLabel()));
            }
            InterfaceC10889a e11 = this.hotelsMapInfoView.getController().e();
            String id2 = polygon.getId();
            List<m> path = polygon.getPath();
            List<List<m>> excludedPath = polygon.getExcludedPath();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Integer parseColor = styleParser.parseColor(context, polygon.getStrokeColor());
            int i11 = 0;
            int intValue = parseColor != null ? parseColor.intValue() : 0;
            float strokeWidth = polygon.getStrokeWidth();
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            Integer parseColor2 = styleParser.parseColor(context2, polygon.getFillColor());
            if (parseColor2 != null) {
                i11 = c.f(parseColor2.intValue(), polygonAlpha);
            }
            e11.c(new v(id2, path, excludedPath, intValue, strokeWidth, i11));
        }
        if (isLabelsVisible) {
            this.hotelsMapInfoView.getController().b().h(4L, arrayList);
        } else {
            removePolygonLabels();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MapAction.InitState action) {
        WindowInsetsWrapper insetsWrapper;
        C5353y0 insets;
        this.backPressedHelper.addCallback(action.getVo().getOnBackPressedAction());
        this.placemarkProvider.setPinTypes(action.getVo().getPinTypes().getHighRanked(), action.getVo().getPinTypes().getLowRanked());
        this.placemarkProvider.setOnPinClickListener(this.onPinClickListener);
        this.placemarkProvider.toggleIndivisibleClusters(action.getVo().getIsNewVersion());
        this.placemarkProvider.setPinTitleTemplates(action.getVo().getPinTypes().getHighRanked().getSinglePinTemplateTitle(), action.getVo().getPinTypes().getHighRanked().getClusterPinTemplateTitle());
        bindMap(action.getVo(), action.getLastVisibleArea());
        ControlPanelBinder controlPanelBinder = this.polygonsControlPanel;
        DistrictsVO districts = action.getVo().getDistricts();
        controlPanelBinder.bindOrGone(districts != null ? districts.getPanel() : null, this.actionHandler);
        if (!action.getIsRestore() || (insetsWrapper = action.getVo().getInsetsWrapper()) == null || (insets = insetsWrapper.getInsets()) == null) {
            return;
        }
        updateInsets(insets);
    }

    private final void bindMap(HotelsMapInfoV4VO item, we0.i lastVisibleArea) {
        try {
            ve0.b controller = this.hotelsMapInfoView.getController();
            this.hotelsMapInfoView.updateActiveZone(controller, new HotelsMapInfoV4Wrapper$bindMap$1$1(lastVisibleArea, item, controller, this));
        } catch (Throwable th2) {
            ThrowableExtKt.log(th2, "error during bindMap");
        }
    }

    private final void cancelDrawing() {
        B0 b02 = this.drawingJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.drawingJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawPins(MapAction.DrawPins action) {
        cancelDrawing();
        this.drawingJob = C10727i.c(H.a(this.lifecycle), null, null, new HotelsMapInfoV4Wrapper$drawPins$1(this, action, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getCurrentPinIdsOnMapExceptDistrictLabels() {
        List<u> placemarks = MapExtKt.getPlacemarks(this.hotelsMapInfoView.getController());
        ArrayList arrayList = new ArrayList();
        for (u uVar : placemarks) {
            Object k11 = uVar.k();
            String e11 = (k11 instanceof Integer ? (Integer) k11 : null) != null ? uVar.e() : null;
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap<String, u> getCurrentPinsOnMapExceptDistrictLabels() {
        List<u> placemarks = MapExtKt.getPlacemarks(this.hotelsMapInfoView.getController());
        HashMap<String, u> hashMap = new HashMap<>();
        for (Object obj : placemarks) {
            u uVar = (u) obj;
            Object k11 = uVar.k();
            if ((k11 instanceof Integer ? (Integer) k11 : null) != null) {
                hashMap.put(uVar.e(), obj);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getCurrentPolygonsIdsOnMap() {
        ArrayList a11 = this.hotelsMapInfoView.getController().e().a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).c());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getPinsToInsertAndDelete(HashMap<String, u> hashMap, Map<String, HotelsMapInfoV4VO.Pin> map, d<? super List<String>> dVar) {
        return C10727i.f(this.dispatchersProvider.getDefault(), new HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2(this, map, hashMap, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideDistricts() {
        removePolygons();
        this.polygonsControlPanel.togglePanel(false);
    }

    private final void hideNotification() {
        NotificationBar notificationBar = this.notificationBar;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
        this.notificationBar = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveCamera(MapAction.Move action) {
        ve0.b controller = this.hotelsMapInfoView.getController();
        MapExtKt.move(controller, MapExtKt.position(controller, action.getBounds()), new HotelsMapInfoV4Wrapper$moveCamera$1$1(this, controller));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCardClickEvent(HotelsMapInfoV4VO.Card card) {
        this.viewModel.onEvent(new MapEvent.OnClickCard(card));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshState(MapAction.RefreshState action) {
        this.backPressedHelper.addCallback(action.getVo().getOnBackPressedAction());
        this.placemarkProvider.setPinTypes(action.getVo().getPinTypes().getHighRanked(), action.getVo().getPinTypes().getLowRanked());
        this.hotelsMapInfoView.getController().b().clear();
        ControlPanelBinder controlPanelBinder = this.polygonsControlPanel;
        DistrictsVO districts = action.getVo().getDistricts();
        controlPanelBinder.bindOrGone(districts != null ? districts.getPanel() : null, this.actionHandler);
        this.polygonsControlPanel.togglePanel(false);
        removePolygons();
        n visibleRegion = action.getVo().getVisibleRegion();
        if (visibleRegion != null) {
            ve0.b controller = this.hotelsMapInfoView.getController();
            C10551g position = MapExtKt.position(this.hotelsMapInfoView.getController(), visibleRegion);
            if (action.getIsNeedToMoveCamera()) {
                MapExtKt.move(controller, position, new HotelsMapInfoV4Wrapper$refreshState$lambda$7$$inlined$moveCameraIfNeeded$1(this));
            } else {
                this.viewModel.onEvent(new MapEvent.OnMapReady(MapExtKt.getZoom(this.hotelsMapInfoView.getController()), MapExtKt.getVisibleArea(this.hotelsMapInfoView.getController()), MapExtKt.getPosition(this.hotelsMapInfoView.getController()).c(), getCurrentPinIdsOnMapExceptDistrictLabels(), getCurrentPolygonsIdsOnMap()));
            }
        }
    }

    private final void removePolygonLabels() {
        List<u> a11 = this.hotelsMapInfoView.getController().b().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a11) {
            if (((u) obj).k() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u) it.next()).e());
        }
        this.hotelsMapInfoView.getController().b().l(arrayList2);
    }

    private final void removePolygons() {
        ye0.b.a(this.hotelsMapInfoView.getController().e());
        removePolygonLabels();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMapReadyEvent(boolean isFinished) {
        if (!isFinished) {
            ThrowableExtKt.log(new IllegalStateException("Map moving was interrupted"), "error during bindMap");
        }
        ve0.b controller = this.hotelsMapInfoView.getController();
        this.viewModel.onEvent(new MapEvent.OnMapReady(MapExtKt.getPosition(controller).e(), MapExtKt.getVisibleArea(controller), MapExtKt.getPosition(controller).c(), getCurrentPinIdsOnMapExceptDistrictLabels(), getCurrentPolygonsIdsOnMap()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification() {
        NotificationBarUtilsKt.showDefaultError(this.container.Q());
    }

    private final void showNotification(NotificationDTO model) {
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(this.container.Z(), null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar make = NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, model, this.viewOwner, this.actionHandler);
        this.notificationBar = make;
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleCard(MapAction.ToggleCard action) {
        this.hotelsMapInfoView.resetPositionChangeListener();
        List<HotelsMapInfoV4VO.CardState> cards = action.getCards();
        if (cards == null || cards.isEmpty()) {
            HotelsMapInfoV4View.toggleCards$default(this.hotelsMapInfoView, false, null, 2, null);
        } else {
            this.cardsAdapter.submitList(action.getCards(), new HR.a(0, action, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleCard$lambda$19(MapAction.ToggleCard toggleCard, HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
        if (toggleCard.getSavedRvState() != null) {
            C10727i.c(H.a(hotelsMapInfoV4Wrapper.lifecycle), hotelsMapInfoV4Wrapper.dispatchersProvider.getMain(), null, new HotelsMapInfoV4Wrapper$toggleCard$1$1(hotelsMapInfoV4Wrapper, toggleCard, null), 2);
        } else {
            HotelsMapInfoV4View.toggleCards$default(hotelsMapInfoV4Wrapper.hotelsMapInfoView, true, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleLoader(MapAction.ToggleLoader action) {
        this.hotelsMapInfoView.toggleLoader(action.getIsVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleNotification(MapAction.ToggleNotification action) {
        hideNotification();
        NotificationDTO dto = action.getDto();
        if (dto != null) {
            showNotification(dto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void togglePolygons(MapAction.TogglePolygons action) {
        if (action.getIsVisible()) {
            addPolygons(action.getPolygons(), action.getPolygonAlpha(), action.getIsLabelsVisible());
        } else {
            removePolygons();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void togglePolygonsPanel(MapAction.TogglePolygonsPanel action) {
        this.polygonsControlPanel.togglePanel(action.getIsVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInsets(C5353y0 insets) {
        this.hotelsMapInfoView.getController().setLogoConfig(new q(r.LEFT_BOTTOM, (Pair<Integer, Integer>) new Pair(0, Integer.valueOf(ResourceExtKt.toDp(insets.f(2).f42129d)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePin(MapAction.UpdatePin action) {
        C10727i.c(H.a(this.lifecycle), null, null, new HotelsMapInfoV4Wrapper$updatePin$1(this, action, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTopOffset(int offset) {
        this.polygonsControlPanel.updateTopMargin(offset);
        this.hotelsMapInfoView.updateLoaderTopMargin(offset);
    }

    public final void observeActions() {
        C10727i.c(H.a(this.lifecycle), null, null, new HotelsMapInfoV4Wrapper$observeActions$1(this, null), 3);
        HotelsMapInfoV4View hotelsMapInfoV4View = this.hotelsMapInfoView;
        C10727i.c(H.a(this.lifecycle), null, null, new HotelsMapInfoV4Wrapper$observeActions$2$1(hotelsMapInfoV4View, this, null), 3);
        C10727i.c(H.a(this.lifecycle), null, null, new HotelsMapInfoV4Wrapper$observeActions$2$2(hotelsMapInfoV4View, this, null), 3);
    }

    public final void onDestroy() {
        cancelDrawing();
        this.backPressedHelper.removeCallback();
        this.composerContainersUpdater.removeOnLayoutChangeListeners();
        this.polygonsControlPanel.onStop();
        this.placemarkProvider.onDestroy();
    }
}
