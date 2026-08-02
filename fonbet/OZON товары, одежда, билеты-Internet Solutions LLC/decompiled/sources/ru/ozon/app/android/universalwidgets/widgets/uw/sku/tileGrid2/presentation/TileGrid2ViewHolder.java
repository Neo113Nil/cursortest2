package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import Sc.InterfaceC4008j;
import Vg.c;
import a00.C4908c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dY.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandlerLazyImpl;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.common.SelectedIconStateInfo;
import ru.ozon.app.android.favorites.common.SelectedProcessor;
import ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2ProductMapperKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.AdultImagesModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2Payload;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.TileGrid2BindStrategy;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy.TileGrid2BindStrategyPicker;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.tileitems.TileGrid2RecyclerAtomDecorator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapterMain;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils.TouchDelegateComposite;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonsViewHolderUtils;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2RootView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uikit.recycler.delegate.ItemListLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0004\u0089\u0001 \u0001\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u00042\u00020\u0005BÙ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040!¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010:J\u000f\u0010=\u001a\u000208H\u0016¢\u0006\u0004\b=\u0010:J\u0017\u0010@\u001a\u0002082\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u0002082\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u000208H\u0016¢\u0006\u0004\bF\u0010:J#\u0010J\u001a\u0002082\u0006\u0010G\u001a\u00020\u00022\n\u0010?\u001a\u00060Hj\u0002`IH\u0014¢\u0006\u0004\bJ\u0010KJ+\u0010J\u001a\u0002082\u0006\u0010G\u001a\u00020\u00022\n\u0010?\u001a\u00060Hj\u0002`I2\u0006\u0010L\u001a\u00020\u0004H\u0014¢\u0006\u0004\bJ\u0010MJ3\u0010T\u001a\u0002082\u0006\u0010G\u001a\u00020\u00022\n\u0010P\u001a\u00060Nj\u0002`O2\u000e\u0010S\u001a\n\u0018\u00010Qj\u0004\u0018\u0001`RH\u0016¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u0002082\u0006\u0010G\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0004H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u0002082\u0006\u0010X\u001a\u00020\u0002H\u0002¢\u0006\u0004\bY\u0010ZJ\u001b\u0010[\u001a\u0002082\n\u0010?\u001a\u00060Hj\u0002`IH\u0002¢\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u0002082\u0006\u0010G\u001a\u00020\u0002H\u0002¢\u0006\u0004\b_\u0010ZJ\u000f\u0010`\u001a\u000208H\u0002¢\u0006\u0004\b`\u0010:J\u000f\u0010a\u001a\u000208H\u0002¢\u0006\u0004\ba\u0010:J\u001b\u0010d\u001a\u0004\u0018\u0001082\b\u0010c\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bd\u0010eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010iR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010jR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010kR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010lR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010mR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010nR\u0018\u0010\u001a\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010oR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010pR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010qR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010rR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010sR\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010tR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010uR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010vR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010wR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010xR\u0016\u00103\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010yR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010zR\u001b\u0010~\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010z\u001a\u0004\b|\u0010}R\u001e\u0010\u0082\u0001\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010G\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bG\u0010\u0083\u0001R,\u0010\u0087\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002080\u0086\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009f\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010z\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R \u0010¤\u0001\u001a\u00030 \u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¡\u0001\u0010z\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001¨\u0006¬\u0001"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "viewBinding", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "messagesProcessor", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategyPicker;", "bindStrategyPicker", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate;", "gallerySwipeViewDelegate", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper;", "galleryImagePrefetchHelperLazy", "", "isGalleryImagePrefetchEnabled", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "offlineWidgetsHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ProductMapper;", "tileGrid2ProductMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;", "overlayBinder", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "Lru/ozon/app/android/favorites/common/SelectedProcessor;", "selectedProcessorProvider", "<init>", "(Landroid/view/View;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;Lru/ozon/app/android/product/TileActionSheetHandlerFactory;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategyPicker;Lru/ozon/app/android/videocover/VideoTileDelegate;LVg/c;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate;Lru/ozon/app/android/video/preload/PlayerPreloader;LSc/j;ZLru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ProductMapper;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayBinder;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;LSc/j;)V", "", "onAttach", "()V", "onDetach", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Ll20/d;)V", "payload", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "bindProduct", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Ljava/lang/Object;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "processProductClick", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)V", "bindActionHandlers", "(Ll20/d;)V", "setRootLocatorIfExists", "()Lkotlin/Unit;", "invalidateOffsetIfNeed", "onAdultConfirmed", "subscribeSelectedProduct", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "checkbox", "onCheckboxClick", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;)Lkotlin/Unit;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategyPicker;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "LVg/c;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GallerySwipeViewDelegate;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Z", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ProductMapper;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "LSc/j;", "galleryImagePrefetchHelper$delegate", "getGalleryImagePrefetchHelper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper;", "galleryImagePrefetchHelper", "preCreateViewEnabled$delegate", "getPreCreateViewEnabled", "()Z", "preCreateViewEnabled", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2Payload;", "Lkotlin/Function0;", "paylaodBindings", "Ljava/util/Map;", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$actionListener$1", "actionListener", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$actionListener$1;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "atomActionSheetHandler", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "touchDelegateComposite", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "topRightButtonsAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "contentAdapter", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "Landroid/view/View$OnTouchListener;", "contentElementsTouchListener$delegate", "getContentElementsTouchListener", "()Landroid/view/View$OnTouchListener;", "contentElementsTouchListener", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2$1", "rightButtonsBlankSpaceListener$delegate", "getRightButtonsBlankSpaceListener", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2$1;", "rightButtonsBlankSpaceListener", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/tileitems/TileGrid2RecyclerAtomDecorator;", "contentElementsRvDecorator", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/tileitems/TileGrid2RecyclerAtomDecorator;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "getBindStrategy", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/strategy/TileGrid2BindStrategy;", "bindStrategy", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes7.dex */
public final class TileGrid2ViewHolder extends k<TileGrid2VO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final TileGrid2ViewHolder$actionListener$1 actionListener;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AtomActionSheetHandler atomActionSheetHandler;

    @NotNull
    private final TileGrid2BindStrategyPicker bindStrategyPicker;

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final View containerView;

    @NotNull
    private final TileContentItemsAdapter contentAdapter;

    @NotNull
    private final TileGrid2RecyclerAtomDecorator contentElementsRvDecorator;

    /* renamed from: contentElementsTouchListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contentElementsTouchListener;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: galleryImagePrefetchHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j galleryImagePrefetchHelper;
    private final GallerySwipeViewDelegate gallerySwipeViewDelegate;

    @NotNull
    private final TileGrid2ImageCache imageCache;
    private final TileGrid2ImageSizeCalculator imageSizeCalculator;
    private final boolean isGalleryImagePrefetchEnabled;
    private TileGrid2VO item;

    @NotNull
    private final MessagesProcessor messagesProcessor;
    private final PdpOfflineScreenWidgetsData offlineWidgetsHandler;

    @NotNull
    private final Map<TileGrid2Payload, Function0<Unit>> paylaodBindings;

    @NotNull
    private final PlayerPreloader playerPreloader;

    /* renamed from: preCreateViewEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preCreateViewEnabled;

    @NotNull
    private final ComposerReferences references;

    /* renamed from: rightButtonsBlankSpaceListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightButtonsBlankSpaceListener;

    @NotNull
    private final InterfaceC4008j<SelectedProcessor> selectedProcessorProvider;

    @NotNull
    private final TileGrid2ProductMapper tileGrid2ProductMapper;
    private final TopRightButtonAdapter topRightButtonsAdapter;
    private final TouchDelegateComposite touchDelegateComposite;
    private final VideoTileDelegate videoTileDelegate;

    @NotNull
    private final TileGrid2BaseViewBinding viewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener, ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder$actionListener$1] */
    public TileGrid2ViewHolder(@NotNull View containerView, @NotNull TileGrid2BaseViewBinding viewBinding, @NotNull MessagesProcessor messagesProcessor, @NotNull ComposerReferences references, @NotNull ActionSheetEventHandler actionSheetEventHandler, TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, @NotNull TileActionSheetHandlerFactory sheetHandlerFactory, @NotNull TileGrid2BindStrategyPicker bindStrategyPicker, VideoTileDelegate videoTileDelegate, @NotNull c customActionHandlersStore, @NotNull FeatureChecker featureChecker, GallerySwipeViewDelegate gallerySwipeViewDelegate, @NotNull PlayerPreloader playerPreloader, @NotNull InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> galleryImagePrefetchHelperLazy, boolean z11, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull TileGrid2ProductMapper tileGrid2ProductMapper, @NotNull TileOverlayBinder overlayBinder, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull AdultHandler adultHandler, @NotNull TileGrid2ImageCache imageCache, TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator, @NotNull InterfaceC4008j<? extends SelectedProcessor> selectedProcessorProvider) {
        super(containerView);
        ComposerReferences composerReferences;
        TileGrid2RecyclerAtomDecorator tileGrid2RecyclerAtomDecorator;
        GallerySwipeViewDelegate gallerySwipeViewDelegate2;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(messagesProcessor, "messagesProcessor");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(sheetHandlerFactory, "sheetHandlerFactory");
        Intrinsics.checkNotNullParameter(bindStrategyPicker, "bindStrategyPicker");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(galleryImagePrefetchHelperLazy, "galleryImagePrefetchHelperLazy");
        Intrinsics.checkNotNullParameter(tileGrid2ProductMapper, "tileGrid2ProductMapper");
        Intrinsics.checkNotNullParameter(overlayBinder, "overlayBinder");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(selectedProcessorProvider, "selectedProcessorProvider");
        this.containerView = containerView;
        this.viewBinding = viewBinding;
        this.messagesProcessor = messagesProcessor;
        this.references = references;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.bindStrategyPicker = bindStrategyPicker;
        this.videoTileDelegate = videoTileDelegate;
        this.customActionHandlersStore = customActionHandlersStore;
        this.featureChecker = featureChecker;
        this.gallerySwipeViewDelegate = gallerySwipeViewDelegate;
        this.playerPreloader = playerPreloader;
        this.isGalleryImagePrefetchEnabled = z11;
        this.offlineWidgetsHandler = pdpOfflineScreenWidgetsData;
        this.tileGrid2ProductMapper = tileGrid2ProductMapper;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.adultHandler = adultHandler;
        this.imageCache = imageCache;
        this.imageSizeCalculator = tileGrid2ImageSizeCalculator;
        this.selectedProcessorProvider = selectedProcessorProvider;
        this.galleryImagePrefetchHelper = galleryImagePrefetchHelperLazy;
        this.preCreateViewEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2ViewHolder$preCreateViewEnabled$2(this));
        this.paylaodBindings = U.j(new Pair(TileGrid2Payload.TOP_RIGHT_BUTTONS_CHANGED, new TileGrid2ViewHolder$paylaodBindings$1(this)), new Pair(TileGrid2Payload.BADGES_CHANGED, new TileGrid2ViewHolder$paylaodBindings$2(this)), new Pair(TileGrid2Payload.MAIN_STATE_CHANGED, new TileGrid2ViewHolder$paylaodBindings$3(this)), new Pair(TileGrid2Payload.BRAND_LOGO_CHANGED, new TileGrid2ViewHolder$paylaodBindings$4(this)), new Pair(TileGrid2Payload.GALLERY_CHANGED, new TileGrid2ViewHolder$paylaodBindings$5(this)), new Pair(TileGrid2Payload.BACKGROUND_CHANGED, new TileGrid2ViewHolder$paylaodBindings$6(this)), new Pair(TileGrid2Payload.COUNT_BUTTON_CHANGED, new TileGrid2ViewHolder$paylaodBindings$7(this)));
        ?? r02 = new ActionListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder$actionListener$1
            @Override // ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener
            public void onErrorReceived(String errorMessage) {
                MessagesProcessor messagesProcessor2;
                ComposerReferences composerReferences2;
                ComposerReferences composerReferences3;
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                messagesProcessor2 = TileGrid2ViewHolder.this.messagesProcessor;
                composerReferences2 = TileGrid2ViewHolder.this.references;
                C4908c g10 = composerReferences2.getContainer().g();
                composerReferences3 = TileGrid2ViewHolder.this.references;
                messagesProcessor2.showError(g10, composerReferences3.getContainer().i(), errorMessage);
            }

            @Override // ru.ozon.app.android.favorites.domain.bottomsheet.ActionListener
            public void onMessageReceived(String message, Long duration, Integer icon, String actionTitle, String actionDeeplink) {
                MessagesProcessor messagesProcessor2;
                ComposerReferences composerReferences2;
                ComposerReferences composerReferences3;
                Intrinsics.checkNotNullParameter(message, "message");
                messagesProcessor2 = TileGrid2ViewHolder.this.messagesProcessor;
                composerReferences2 = TileGrid2ViewHolder.this.references;
                C4908c g10 = composerReferences2.getContainer().g();
                composerReferences3 = TileGrid2ViewHolder.this.references;
                messagesProcessor2.showMessage(g10, composerReferences3.getContainer().i(), message, duration, icon, actionTitle, actionDeeplink);
            }
        };
        this.actionListener = r02;
        this.atomActionSheetHandler = sheetHandlerFactory.create(references, r02);
        RecyclerView topRightButtonsRv = viewBinding.getTopRightButtonsDelegate().getTopRightButtonsRv();
        TouchDelegateComposite touchDelegateComposite = topRightButtonsRv != null ? new TouchDelegateComposite(topRightButtonsRv) : null;
        this.touchDelegateComposite = touchDelegateComposite;
        TopRightButtonAdapterMain topRightButtonAdapterMain = topRightButtonsViewHolderUtils != null ? new TopRightButtonAdapterMain(topRightButtonsViewHolderUtils, this, references, touchDelegateComposite, new TileGrid2ViewHolder$topRightButtonsAdapter$1$1(this)) : null;
        this.topRightButtonsAdapter = topRightButtonAdapterMain;
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        TileContentItemsAdapter tileContentItemsAdapter = new TileContentItemsAdapter(disposableActionHandler != null ? disposableActionHandler.getHandler() : null);
        this.contentAdapter = tileContentItemsAdapter;
        this.contentElementsTouchListener = LazyUtilsKt.unsafeLazy(new TileGrid2ViewHolder$contentElementsTouchListener$2(this));
        this.rightButtonsBlankSpaceListener = LazyUtilsKt.unsafeLazy(new TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2(this));
        TileGrid2RecyclerAtomDecorator tileGrid2RecyclerAtomDecorator2 = new TileGrid2RecyclerAtomDecorator();
        this.contentElementsRvDecorator = tileGrid2RecyclerAtomDecorator2;
        if (gallerySwipeViewDelegate != null) {
            tileGrid2RecyclerAtomDecorator = tileGrid2RecyclerAtomDecorator2;
            gallerySwipeViewDelegate2 = gallerySwipeViewDelegate;
            gallerySwipeViewDelegate2.init(references, this, videoTileDelegate, getPreCreateViewEnabled(), new TileGrid2ViewHolder$1$1(getContainerView()), blurMoleculeDelegate, imageCache, tileGrid2ImageSizeCalculator);
            composerReferences = references;
        } else {
            composerReferences = references;
            tileGrid2RecyclerAtomDecorator = tileGrid2RecyclerAtomDecorator2;
            gallerySwipeViewDelegate2 = gallerySwipeViewDelegate;
        }
        final RecyclerView topRightButtonsRv2 = viewBinding.getTopRightButtonsDelegate().getTopRightButtonsRv();
        if (topRightButtonsRv2 != null) {
            topRightButtonsRv2.setLayoutManager(new LinearLayoutManager(topRightButtonsRv2.getContext(), 1, false));
            topRightButtonsRv2.setHasFixedSize(true);
            topRightButtonsRv2.setOnTouchListener(new View.OnTouchListener() { // from class: dY.a
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$8$lambda$3$lambda$1;
                    lambda$8$lambda$3$lambda$1 = TileGrid2ViewHolder.lambda$8$lambda$3$lambda$1(TileGrid2ViewHolder.this, topRightButtonsRv2, view, motionEvent);
                    return lambda$8$lambda$3$lambda$1;
                }
            });
            if (!topRightButtonsRv2.isLaidOut() || topRightButtonsRv2.isLayoutRequested()) {
                topRightButtonsRv2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder$lambda$8$lambda$3$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        view.setTouchDelegate(TileGrid2ViewHolder.this.touchDelegateComposite);
                    }
                });
            } else {
                topRightButtonsRv2.setTouchDelegate(this.touchDelegateComposite);
            }
        }
        viewBinding.getTopRightButtonsDelegate().init(composerReferences);
        viewBinding.getContentElementsVAL().setAdapter(tileContentItemsAdapter);
        viewBinding.getContentElementsVAL().setItemAnimator(null);
        viewBinding.getContentElementsVAL().setLayoutManager(new ItemListLayoutManager(getContext()));
        viewBinding.getContentElementsVAL().setNestedScrollingEnabled(false);
        viewBinding.getContentElementsVAL().addItemDecoration(tileGrid2RecyclerAtomDecorator);
        viewBinding.getContentElementsVAL().setOnTouchListener(new View.OnTouchListener() { // from class: dY.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$8$lambda$4;
                lambda$8$lambda$4 = TileGrid2ViewHolder.lambda$8$lambda$4(TileGrid2ViewHolder.this, view, motionEvent);
                return lambda$8$lambda$4;
            }
        });
        viewBinding.getContentElementsVAL().setOnClickListener(new View.OnClickListener() { // from class: dY.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TileGrid2ViewHolder.lambda$8$lambda$5(TileGrid2ViewHolder.this, view);
            }
        });
        getContainerView().setOnClickListener(new d(0, this));
        getContainerView().setContentDescription("grid");
        if (z11 && gallerySwipeViewDelegate2 != null) {
            gallerySwipeViewDelegate2.addOnPositionChangedListener(new GallerySwipeViewDelegate.OnPositionChangedListener() { // from class: dY.e
                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate.OnPositionChangedListener
                public final void onPositionChanged(int i11, int i12) {
                    TileGrid2ViewHolder.lambda$8$lambda$7(TileGrid2ViewHolder.this, i11, i12);
                }
            });
        }
        blurMoleculeDelegate.setOnAdultConfirmed(new TileGrid2ViewHolder$1$7(this));
        getBindStrategy().init(this, viewBinding, topRightButtonAdapterMain, tileContentItemsAdapter, overlayBinder);
    }

    private final void bindActionHandlers(l20.d info) {
        this.atomActionSheetHandler.setWidgetViewItem(getViewItem());
        this.atomActionSheetHandler.setTrackingData(getTrackingData());
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
        DisposableActionHandlerLazyImpl disposableActionHandlerLazyImpl = new DisposableActionHandlerLazyImpl(new TileGrid2ViewHolder$bindActionHandlers$1(this, info));
        this.actionHandler = disposableActionHandlerLazyImpl;
        TopRightButtonAdapter topRightButtonAdapter = this.topRightButtonsAdapter;
        if (topRightButtonAdapter != null) {
            topRightButtonAdapter.setActionHandler(disposableActionHandlerLazyImpl.getHandler());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableActionHandler bindActionHandlers$createActionHandler(TileGrid2ViewHolder tileGrid2ViewHolder, l20.d dVar) {
        ActionHandler.Builder builder = new ActionHandler.Builder(tileGrid2ViewHolder.references, tileGrid2ViewHolder);
        T00.a b11 = dVar.b();
        ActionHandler.Builder onPreProcess = builder.setCurrentPageUrl(b11 != null ? b11.c() : null).customActionHandlers(new TileGrid2ViewHolder$bindActionHandlers$createActionHandler$1(tileGrid2ViewHolder)).onPreProcess(new TileGrid2ViewHolder$bindActionHandlers$createActionHandler$2(tileGrid2ViewHolder.atomActionSheetHandler));
        TileGrid2VO tileGrid2VO = tileGrid2ViewHolder.item;
        if (tileGrid2VO != null) {
            return onPreProcess.buildDisposableHandlerForListWidgets(tileGrid2VO.getId(), tileGrid2ViewHolder.getLifecycle(), tileGrid2ViewHolder.actionSheetEventHandler);
        }
        Intrinsics.n("item");
        throw null;
    }

    private final void bindProduct(TileGrid2VO item, Object payload) {
        List list = payload instanceof List ? (List) payload : null;
        if (CollectionExtKt.isNullOrEmpty(list)) {
            return;
        }
        getBindStrategy().prepare(item, (CountButtonViewModel) getWidgetViewModel(), this.actionHandler);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Function0<Unit> function0 = this.paylaodBindings.get(it.next());
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TileGrid2BindStrategy getBindStrategy() {
        return this.bindStrategyPicker.getActiveStrategy();
    }

    private final View.OnTouchListener getContentElementsTouchListener() {
        return (View.OnTouchListener) this.contentElementsTouchListener.getValue();
    }

    private final TileGrid2GalleryImagePrefetchHelper getGalleryImagePrefetchHelper() {
        return (TileGrid2GalleryImagePrefetchHelper) this.galleryImagePrefetchHelper.getValue();
    }

    private final boolean getPreCreateViewEnabled() {
        return ((Boolean) this.preCreateViewEnabled.getValue()).booleanValue();
    }

    private final TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2.AnonymousClass1 getRightButtonsBlankSpaceListener() {
        return (TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2.AnonymousClass1) this.rightButtonsBlankSpaceListener.getValue();
    }

    private final void invalidateOffsetIfNeed(TileGrid2VO item) {
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO != null) {
            if (tileGrid2VO == null) {
                Intrinsics.n("item");
                throw null;
            }
            if (Intrinsics.d(tileGrid2VO.getKebab(), item.getKebab())) {
                return;
            }
            this.viewBinding.getContentElementsVAL().invalidateItemDecorations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$8$lambda$3$lambda$1(TileGrid2ViewHolder tileGrid2ViewHolder, RecyclerView recyclerView, View view, MotionEvent motionEvent) {
        TouchDelegateComposite touchDelegateComposite = tileGrid2ViewHolder.touchDelegateComposite;
        if (touchDelegateComposite != null) {
            Intrinsics.f(motionEvent);
            if (touchDelegateComposite.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2.AnonymousClass1 rightButtonsBlankSpaceListener = tileGrid2ViewHolder.getRightButtonsBlankSpaceListener();
        Intrinsics.f(motionEvent);
        return rightButtonsBlankSpaceListener.onInterceptTouchEvent(recyclerView, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$8$lambda$4(TileGrid2ViewHolder tileGrid2ViewHolder, View view, MotionEvent motionEvent) {
        return tileGrid2ViewHolder.getContentElementsTouchListener().onTouch(view, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$5(TileGrid2ViewHolder tileGrid2ViewHolder, View view) {
        tileGrid2ViewHolder.getContainerView().performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$6(TileGrid2ViewHolder tileGrid2ViewHolder, View view) {
        TileGrid2VO tileGrid2VO = tileGrid2ViewHolder.item;
        if (tileGrid2VO != null) {
            tileGrid2ViewHolder.processProductClick(tileGrid2VO);
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$7(TileGrid2ViewHolder tileGrid2ViewHolder, int i11, int i12) {
        TileGrid2GalleryImagePrefetchHelper galleryImagePrefetchHelper = tileGrid2ViewHolder.getGalleryImagePrefetchHelper();
        Context context = tileGrid2ViewHolder.viewBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TileGrid2VO tileGrid2VO = tileGrid2ViewHolder.item;
        if (tileGrid2VO != null) {
            galleryImagePrefetchHelper.onGalleryItemPositionChanged(context, tileGrid2VO, i11, i12);
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdultConfirmed() {
        GallerySwipeViewDelegate gallerySwipeViewDelegate;
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        AdultImagesModel adultImagesModel = tileGrid2VO.getGalleryModel().getAdultImagesModel();
        if (adultImagesModel.getBlurMolecule() != null) {
            List<TileGrid2GalleryModel.GalleryItem> imageItems = adultImagesModel.getImageItems();
            GallerySwipeViewDelegate gallerySwipeViewDelegate2 = this.gallerySwipeViewDelegate;
            if (!Intrinsics.d(imageItems, gallerySwipeViewDelegate2 != null ? gallerySwipeViewDelegate2.getItems() : null) && (gallerySwipeViewDelegate = this.gallerySwipeViewDelegate) != null) {
                boolean isUserAnAdult = this.adultHandler.isUserAnAdult();
                TileGrid2VO tileGrid2VO2 = this.item;
                if (tileGrid2VO2 == null) {
                    Intrinsics.n("item");
                    throw null;
                }
                gallerySwipeViewDelegate.bind(adultImagesModel, isUserAnAdult, tileGrid2VO2.getTheme());
            }
            getBindStrategy().bindTopRightButtons();
            getBindStrategy().bindLogo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit onCheckboxClick(TileGrid2CheckBoxVO checkbox) {
        SelectedIconStateInfo mapToSelectedInfoIconState;
        if (checkbox == null || (mapToSelectedInfoIconState = TileGrid2ProductMapperKt.mapToSelectedInfoIconState(checkbox)) == null) {
            return null;
        }
        this.selectedProcessorProvider.getValue().onSelectionChanged(mapToSelectedInfoIconState);
        return Unit.f71690a;
    }

    private final void processProductClick(TileGrid2VO product) {
        Function1<AtomAction, Unit> handler;
        AtomActionDTO action;
        AtomAction atomAction;
        PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;
        if (product.getIsCheckboxTile()) {
            onCheckboxClick(TileGrid2ProductMapperKt.topRightCheckbox(product));
            return;
        }
        if (product.getGalleryModel().getAdultImagesModel().getBlurMolecule() == null && (pdpOfflineScreenWidgetsData = this.offlineWidgetsHandler) != null) {
            pdpOfflineScreenWidgetsData.save(this.tileGrid2ProductMapper.mapToPdp(product));
        }
        VideoTileDelegate videoTileDelegate = this.videoTileDelegate;
        if (videoTileDelegate != null) {
            videoTileDelegate.onVideoTileClicked(product.getGalleryModel().getAdultImagesModel().getImageItems());
        }
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler == null || (handler = disposableActionHandler.getHandler()) == null || (action = product.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, product.getTrackingInfo())) == null) {
            return;
        }
        this.playerPreloader.tryToPreloadPdpVideo(atomAction);
        handler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setRootLocatorIfExists() {
        TestInfo testInfo;
        String automatizationId;
        TileGrid2VO boundData = getBoundData();
        if (boundData == null || (testInfo = boundData.getTestInfo()) == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return null;
        }
        this.viewBinding.getRoot().setContentDescription(automatizationId);
        return Unit.f71690a;
    }

    private final void subscribeSelectedProduct() {
        this.selectedProcessorProvider.getValue().startProcessing(new TileGrid2ViewHolder$subscribeSelectedProduct$1(this));
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getBindStrategy().onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.atomActionSheetHandler.clear();
        getBindStrategy().onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        getBindStrategy().onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        getBindStrategy().onRecycle();
        TileGrid2VO tileGrid2VO = this.item;
        if (tileGrid2VO == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (tileGrid2VO.getIsCheckboxTile()) {
            this.selectedProcessorProvider.getValue().stopProcessing();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        getBindStrategy().onViewInVisibleBounds();
        setRootLocatorIfExists();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        getBindStrategy().onViewOutOfVisibleBounds();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        if (this.isGalleryImagePrefetchEnabled) {
            TileGrid2GalleryImagePrefetchHelper galleryImagePrefetchHelper = getGalleryImagePrefetchHelper();
            TileGrid2VO tileGrid2VO = this.item;
            if (tileGrid2VO == null) {
                Intrinsics.n("item");
                throw null;
            }
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            galleryImagePrefetchHelper.onWidgetVisibleAreaChanged(tileGrid2VO, o.a(itemView, info, false));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TileGrid2VO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TileGrid2ViewHolder) item, trackingData, viewedPond);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null), null, 2, null);
        }
        getBindStrategy().trackView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TileGrid2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        invalidateOffsetIfNeed(item);
        View containerView = getContainerView();
        TileGrid2RootView tileGrid2RootView = containerView instanceof TileGrid2RootView ? (TileGrid2RootView) containerView : null;
        if (tileGrid2RootView != null) {
            tileGrid2RootView.setAccesibilityTileID(item.getAccesibilityTileID());
        }
        this.item = item;
        if (item.getIsCheckboxTile()) {
            subscribeSelectedProduct();
        }
        bindActionHandlers(info);
        this.contentElementsRvDecorator.setNeedRightOffsetForFirstItem(item.getKebab() != null);
        getBindStrategy().bind(item, (CountButtonViewModel) getWidgetViewModel(), this.actionHandler);
        final View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        G.a(itemView, new Runnable() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TileGrid2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.item = item;
        bindProduct(item, payload);
    }
}
