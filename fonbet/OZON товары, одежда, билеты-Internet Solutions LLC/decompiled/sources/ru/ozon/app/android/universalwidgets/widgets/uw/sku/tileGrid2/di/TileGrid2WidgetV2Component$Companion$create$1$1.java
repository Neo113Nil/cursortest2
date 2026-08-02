package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import java.util.HashMap;
import k20.C7475g;
import kotlin.Metadata;
import l20.c;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.delegate.FavoriteToggleProductButtonDelegateProvider;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessorImpl;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModelImpl;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.tileselector.di.TileSelectorComponentApi;
import ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsManagerProviderKt;
import ru.ozon.app.android.ugcratingmolecule.presentation.factory.UgcRatingDelegateFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component$Companion$create$1$1;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ProductMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.TileGrid2RootBgColorCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.provider.TileGrid2ImageCacheProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonViewHolderFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonsViewHolderBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

@Metadata(d1 = {"\u0000á\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010L\u001a\u00020H8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010KR\u001a\u0010N\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010S\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020R0W8\u0006¢\u0006\f\n\u0004\bX\u0010:\u001a\u0004\bY\u0010ZR \u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u00020a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010g\u001a\u00020f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR \u0010l\u001a\b\u0012\u0004\u0012\u00020k0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010:\u001a\u0004\bm\u0010ZR\u001b\u0010r\u001a\u00020n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bo\u0010:\u001a\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bt\u0010:\u001a\u0004\bu\u0010vR \u0010y\u001a\b\u0012\u0004\u0012\u00020x0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010:\u001a\u0004\bz\u0010ZR9\u0010\u007f\u001a\u001e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020}0{j\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020}`~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\u00030\u0083\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010:\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010:\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R$\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010[8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010^\u001a\u0005\b\u0097\u0001\u0010`R \u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¤\u0001\u001a\u00030¡\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u001f\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010½\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010É\u0001\u001a\u00030Æ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001d\u0010Ö\u0001\u001a\b0Ò\u0001j\u0003`Ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030ß\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001¨\u0006ã\u0001"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2WidgetV2Component$Companion$create$1$1", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2WidgetV2Component;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "favoriteComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoriteComponentApi;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/di/SelectionsCoreComponentApi;", "selectionsCoreComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/di/SelectionsCoreComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/tileselector/di/TileSelectorComponentApi;", "tileSelectorComponentApi", "Lru/ozon/app/android/tileselector/di/TileSelectorComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "videoCoverComponentApi", "Lru/ozon/app/android/videocover/di/VideoCoverComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "retainImagePrefetchComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainImagePrefetchComponentApi;", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "pdpScreenStorageComponentApi", "Lru/ozon/app/android/offline/di/PdpOfflineScreenComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateProvider;", "favoriteToggleProductButtonDelegateProvider$delegate", "LSc/j;", "getFavoriteToggleProductButtonDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoriteToggleProductButton/delegate/FavoriteToggleProductButtonDelegateProvider;", "favoriteToggleProductButtonDelegateProvider", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "getFavoriteEventManager", "()Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "productFavMoleculeDelegateProvider$delegate", "getProductFavMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "productFavMoleculeDelegateProvider", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "selectionProductsEventManager", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "getSelectionProductsEventManager", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductsEventManager;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "defaultSelectedProductsManager", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "getDefaultSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "LSc/j;", "selectedProductsManager", "getSelectedProductsManager", "()LSc/j;", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "LPc/a;", "getTopRightButtonsViewHolderUtils", "()LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "getImageSizeCalculator", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImagePrefetchInfoProvider;", "prefetchInfoProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImagePrefetchInfoProvider;", "getPrefetchInfoProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper;", "galleryImagePrefetchHelperLazy", "getGalleryImagePrefetchHelperLazy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "tileGrid2RootBgColorCache$delegate", "getTileGrid2RootBgColorCache", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "tileGrid2RootBgColorCache", "Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor$delegate", "getTileDislikeInteractor", "()Lru/ozon/app/android/domain/tiles/dislike/TileDislikeInteractor;", "tileDislikeInteractor", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "wishlistServiceLazy", "getWishlistServiceLazy", "Ljava/util/HashMap;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "Lkotlin/collections/HashMap;", "selectionProductsEventsMap", "Ljava/util/HashMap;", "getSelectionProductsEventsMap", "()Ljava/util/HashMap;", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider$delegate", "getBlurDelegateProvider", "()Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/ugcratingmolecule/presentation/factory/UgcRatingDelegateFactory;", "ratingDelegateFactory$delegate", "getRatingDelegateFactory", "()Lru/ozon/app/android/ugcratingmolecule/presentation/factory/UgcRatingDelegateFactory;", "ratingDelegateFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/provider/TileGrid2ImageCacheProvider;", "cacheProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/provider/TileGrid2ImageCacheProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "getImageCache", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "countButtonViewModelProvider", "getCountButtonViewModelProvider", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "getMessagesProcessor", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "messagesProcessor", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "getSheetHandlerFactory", "()Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "getSelectedProcessorProvider", "()Lru/ozon/app/android/favorites/common/SelectedProcessor;", "selectedProcessorProvider", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "getVideoTileDelegate", "()Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Ll20/c;", "getImagePrefetchInfoProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "imagePrefetchInfoProviderStorage", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "getOnboardingRepository", "()Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "getOfflineScreenWidgetsData", "()Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineScreenWidgetsData", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ProductMapper;", "getTileGrid2ProductMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ProductMapper;", "tileGrid2ProductMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "getFavoritesComposerActionHandler", "()Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesComposerActionHandler;", "favoritesComposerActionHandler", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2WidgetV2Component$Companion$create$1$1 implements TileGrid2WidgetV2Component {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final ActionV2Repository actionV2Repository;

    /* renamed from: blurDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j blurDelegateProvider;
    private final TileGrid2ImageCacheProvider cacheProvider;
    private final CartServiceApi cartServiceApi;
    private final ContextComponentDependencies contextDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final a<CountButtonViewModel> countButtonViewModelProvider;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final SelectedProductsManager defaultSelectedProductsManager;
    private final FavoriteComponentApi favoriteComponentApi;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final FavoriteEventManager favoriteEventManager;
    private final FavoriteManager favoriteManager;

    /* renamed from: favoriteToggleProductButtonDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j favoriteToggleProductButtonDelegateProvider;
    private final InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> galleryImagePrefetchHelperLazy;
    private final TileGrid2ImageCache imageCache;
    private final TileGrid2ImageSizeCalculator imageSizeCalculator;
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final OnboardingComponentApi onboardingComponentApi;
    private final PdpOfflineScreenComponentApi pdpScreenStorageComponentApi;
    private final TileGrid2ImagePrefetchInfoProvider prefetchInfoProvider;

    /* renamed from: productFavMoleculeDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productFavMoleculeDelegateProvider;

    /* renamed from: ratingDelegateFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j ratingDelegateFactory;
    private final RetainComposerComponentApi retainComponentApi;
    private final RetainImagePrefetchComponentApi retainImagePrefetchComponentApi;
    private final InterfaceC4008j<SelectedProductsManager> selectedProductsManager;
    private final SelectionProductsEventManager selectionProductsEventManager;
    private final HashMap<SelectionProductsTileKey, SelectionProductEvent> selectionProductsEventsMap;
    private final SelectionsCoreComponentApi selectionsCoreComponentApi;

    /* renamed from: tileDislikeInteractor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tileDislikeInteractor;

    /* renamed from: tileGrid2RootBgColorCache$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tileGrid2RootBgColorCache;
    private final TileSelectorComponentApi tileSelectorComponentApi;
    private final a<TopRightButtonsViewHolderUtils> topRightButtonsViewHolderUtils;
    private final VideoComponentApi videoComponentApi;
    private final VideoCoverComponentApi videoCoverComponentApi;
    private final InterfaceC4008j<WishlistService> wishlistServiceLazy;

    TileGrid2WidgetV2Component$Companion$create$1$1(C7475g c7475g) {
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
        SelectionsCoreComponentApi selectionsCoreComponentApi = (SelectionsCoreComponentApi) c7475g.getComponent(SelectionsCoreComponentApi.class);
        this.selectionsCoreComponentApi = selectionsCoreComponentApi;
        FavoriteCoreComponentApi favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.favoriteCoreComponentApi = favoriteCoreComponentApi;
        TileSelectorComponentApi tileSelectorComponentApi = (TileSelectorComponentApi) c7475g.getComponent(TileSelectorComponentApi.class);
        this.tileSelectorComponentApi = tileSelectorComponentApi;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.videoCoverComponentApi = (VideoCoverComponentApi) c7475g.getComponent(VideoCoverComponentApi.class);
        ActionComponentApi actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.actionComponentApi = actionComponentApi;
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainImagePrefetchComponentApi = (RetainImagePrefetchComponentApi) c7475g.getComponent(RetainImagePrefetchComponentApi.class);
        this.onboardingComponentApi = (OnboardingComponentApi) c7475g.getComponent(OnboardingComponentApi.class);
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComponentApi = retainComposerComponentApi;
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.videoComponentApi = (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class);
        this.pdpScreenStorageComponentApi = (PdpOfflineScreenComponentApi) c7475g.getComponent(PdpOfflineScreenComponentApi.class);
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.contextDependencies = contextComponentDependencies;
        this.favoriteToggleProductButtonDelegateProvider = k.b(new TileGrid2WidgetV2Component$Companion$create$1$1$favoriteToggleProductButtonDelegateProvider$2(this));
        this.actionV2Repository = actionComponentApi.getActionRepository();
        this.favoriteEventManager = favoriteCoreComponentApi.getFavEventManager();
        this.productFavMoleculeDelegateProvider = k.b(new TileGrid2WidgetV2Component$Companion$create$1$1$productFavMoleculeDelegateProvider$2(this));
        this.selectionProductsEventManager = selectionsCoreComponentApi.getSelectionProductsEventManager();
        SelectedProductsManager selectedProductsManager = favoriteCoreComponentApi.getSelectedProductsManager();
        this.defaultSelectedProductsManager = selectedProductsManager;
        this.selectedProductsManager = SelectedProductsManagerProviderKt.provideSelectedProductsManager(tileSelectorComponentApi.getSelectedProductsManagerProvider(), retainComposerComponentApi, selectedProductsManager);
        this.topRightButtonsViewHolderUtils = new a() { // from class: cY.c
            @Override // Pc.a
            public final Object get() {
                TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils;
                topRightButtonsViewHolderUtils = TileGrid2WidgetV2Component$Companion$create$1$1.topRightButtonsViewHolderUtils$lambda$0(TileGrid2WidgetV2Component$Companion$create$1$1.this);
                return topRightButtonsViewHolderUtils;
            }
        };
        this.imageSizeCalculator = new TileGrid2ImageSizeCalculator(getFeatureService());
        this.prefetchInfoProvider = new TileGrid2ImagePrefetchInfoProvider(getImageSizeCalculator());
        this.galleryImagePrefetchHelperLazy = k.b(new TileGrid2WidgetV2Component$Companion$create$1$1$galleryImagePrefetchHelperLazy$1(this));
        this.tileGrid2RootBgColorCache = k.b(TileGrid2WidgetV2Component$Companion$create$1$1$tileGrid2RootBgColorCache$2.INSTANCE);
        this.tileDislikeInteractor = LazyUtilsKt.unsafeLazy(new TileGrid2WidgetV2Component$Companion$create$1$1$tileDislikeInteractor$2(c7475g));
        this.wishlistServiceLazy = LazyUtilsKt.unsafeLazy(new TileGrid2WidgetV2Component$Companion$create$1$1$wishlistServiceLazy$1(this));
        this.selectionProductsEventsMap = new HashMap<>();
        this.blurDelegateProvider = LazyUtilsKt.unsafeLazy(new TileGrid2WidgetV2Component$Companion$create$1$1$blurDelegateProvider$2(this));
        this.ratingDelegateFactory = LazyUtilsKt.unsafeLazy(new TileGrid2WidgetV2Component$Companion$create$1$1$ratingDelegateFactory$2(c7475g));
        TileGrid2ImageCacheProvider tileGrid2ImageCacheProvider = new TileGrid2ImageCacheProvider(getFeatureService(), contextComponentDependencies.getContext());
        this.cacheProvider = tileGrid2ImageCacheProvider;
        this.imageCache = tileGrid2ImageCacheProvider.provide();
        this.countButtonViewModelProvider = new a() { // from class: cY.d
            @Override // Pc.a
            public final Object get() {
                CountButtonViewModel countButtonViewModelProvider$lambda$1;
                countButtonViewModelProvider$lambda$1 = TileGrid2WidgetV2Component$Companion$create$1$1.countButtonViewModelProvider$lambda$1(TileGrid2WidgetV2Component$Companion$create$1$1.this);
                return countButtonViewModelProvider$lambda$1;
            }
        };
        this.favoriteManager = favoriteCoreComponentApi.getFavoriteManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountButtonViewModel countButtonViewModelProvider$lambda$1(TileGrid2WidgetV2Component$Companion$create$1$1 tileGrid2WidgetV2Component$Companion$create$1$1) {
        return new CountButtonViewModelImpl(tileGrid2WidgetV2Component$Companion$create$1$1.getCartService(), tileGrid2WidgetV2Component$Companion$create$1$1.getTokenizedAnalytics());
    }

    private final FavoriteToggleProductButtonDelegateProvider getFavoriteToggleProductButtonDelegateProvider() {
        return (FavoriteToggleProductButtonDelegateProvider) this.favoriteToggleProductButtonDelegateProvider.getValue();
    }

    private final FavoritesComposerActionHandler getFavoritesComposerActionHandler() {
        return new FavoritesComposerActionHandler(this.actionV2Repository, this.favoriteEventManager, this.favoriteCoreComponentApi.getFavoriteManager(), this.favoriteCoreComponentApi.getWishlistEventManager(), getFeatureChecker());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils$lambda$0(TileGrid2WidgetV2Component$Companion$create$1$1 tileGrid2WidgetV2Component$Companion$create$1$1) {
        return new TopRightButtonsViewHolderUtils(new TopRightButtonViewHolderFactory(tileGrid2WidgetV2Component$Companion$create$1$1.getProductFavMoleculeDelegateProvider(), tileGrid2WidgetV2Component$Companion$create$1$1.getFavoriteToggleProductButtonDelegateProvider(), tileGrid2WidgetV2Component$Companion$create$1$1.getFeatureChecker()), new TopRightButtonsViewHolderBinder());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public ActionSheetEventHandler getActionSheetEventHandler() {
        return this.actionComponentApi.getActionSheetEventHandler();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public AdultHandler getAdultHandler() {
        return this.accountComponentApi.getAdultHandler();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public BlurDelegateProvider getBlurDelegateProvider() {
        return (BlurDelegateProvider) this.blurDelegateProvider.getValue();
    }

    public CartService getCartService() {
        return this.cartServiceApi.getCartService();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public a<CountButtonViewModel> getCountButtonViewModelProvider() {
        return this.countButtonViewModelProvider;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public FavoriteManager getFavoriteManager() {
        return this.favoriteManager;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public FeatureService getFeatureService() {
        return this.networkComponentApi.getFeatureService();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> getGalleryImagePrefetchHelperLazy() {
        return this.galleryImagePrefetchHelperLazy;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileGrid2ImageCache getImageCache() {
        return this.imageCache;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
        return this.retainImagePrefetchComponentApi.getImagePrefetchInfoProviderStorage();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileGrid2ImageSizeCalculator getImageSizeCalculator() {
        return this.imageSizeCalculator;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public MessagesProcessor getMessagesProcessor() {
        return new MessagesProcessorImpl(this.navigationComponentApi.getOzonRouter());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public PdpOfflineScreenWidgetsData getOfflineScreenWidgetsData() {
        return this.pdpScreenStorageComponentApi.pdpEmptyScreenService();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public CommonOnboardingRepository getOnboardingRepository() {
        return this.onboardingComponentApi.getOnboardingRepository();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public PlayerPreloader getPlayerPreloader() {
        return this.videoComponentApi.getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileGrid2ImagePrefetchInfoProvider getPrefetchInfoProvider() {
        return this.prefetchInfoProvider;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public FavoriteDelegateProvider getProductFavMoleculeDelegateProvider() {
        return (FavoriteDelegateProvider) this.productFavMoleculeDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public UgcRatingDelegateFactory getRatingDelegateFactory() {
        return (UgcRatingDelegateFactory) this.ratingDelegateFactory.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public SelectedProcessor getSelectedProcessorProvider() {
        return this.favoriteCoreComponentApi.getSelectedProcessorProvider().get(this.selectedProductsManager);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public SelectionProductsEventManager getSelectionProductsEventManager() {
        return this.selectionProductsEventManager;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public HashMap<SelectionProductsTileKey, SelectionProductEvent> getSelectionProductsEventsMap() {
        return this.selectionProductsEventsMap;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileActionSheetHandlerFactory getSheetHandlerFactory() {
        return new TileActionSheetHandlerFactory(this.favoriteCoreComponentApi.getFavoriteInteractor(), this.favoriteEventManager, this.favoriteCoreComponentApi.getFavoritesListsInteractor(), this.actionV2Repository, this.accountComponentApi.getSubscriptionServiceProvider(), getFavoritesComposerActionHandler());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileDislikeInteractor getTileDislikeInteractor() {
        return (TileDislikeInteractor) this.tileDislikeInteractor.getValue();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileGrid2ProductMapper getTileGrid2ProductMapper() {
        return new TileGrid2ProductMapper();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public TileGrid2RootBgColorCache getTileGrid2RootBgColorCache() {
        return (TileGrid2RootBgColorCache) this.tileGrid2RootBgColorCache.getValue();
    }

    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public a<TopRightButtonsViewHolderUtils> getTopRightButtonsViewHolderUtils() {
        return this.topRightButtonsViewHolderUtils;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public VideoTileDelegate getVideoTileDelegate() {
        return this.videoCoverComponentApi.getVideoTileDelegate();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component
    public InterfaceC4008j<WishlistService> getWishlistServiceLazy() {
        return this.wishlistServiceLazy;
    }
}
