package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import A00.a;
import Sc.InterfaceC4008j;
import Tc.b;
import Vg.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import h20.InterfaceC6786a;
import j10.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile.ShareLinkBloggerFromTileActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.delivery.customActionsHandlers.gocheckout.GoCheckoutActionHandler;
import ru.ozon.app.android.favorites.common.SelectedStateChangedEvent;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteMoleculeModel;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteCustomComposerActionHandlerUtils;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForRefreshResultActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeleteListingModal.ClassifiedOpenDeleteListingModalActionHandler;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2MapperKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2Payload;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator.TileGrid2MarginsDecoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoTransformedBitmapCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.ComposerRefrencesExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 h2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001:\u0001hB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00182\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020 2\n\u0010$\u001a\u00060\"j\u0002`#2\u0006\u0010&\u001a\u00020%2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\"0'j\u0002`(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u00100J\u001b\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00102\u001a\u000201¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b7\u00106J\u0013\u00109\u001a\u000208*\u00020\u0003H\u0004¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020*2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010A\u001a\u0002088\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010DR\u001b\u0010G\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010CR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010KR\u001b\u0010N\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010F\u001a\u0004\bN\u0010CR\u001b\u0010P\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bP\u0010CR\u001b\u0010S\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010F\u001a\u0004\bR\u0010CR6\u0010W\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060Uj\u0002`V\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003030T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR,\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020[0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010ZR(\u0010_\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0^038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020d0c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006k²\u0006\f\u0010j\u001a\u00020i8\nX\u008a\u0084\u0002²\u0006\f\u0010j\u001a\u00020i8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2WidgetV2Component;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "<init>", "()V", "Landroid/view/View;", "view", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "createViewBinding", "(Landroid/view/View;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BaseViewBinding;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)Lru/ozon/composer/ui/widget/h;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Ll10/i;", "container", "viewItem", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "getDecorations", "", "isThinWidget", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;)Z", "setupContainer", "(Ll10/i;)V", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecycler", "prepareComposerRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "isThinView", "Z", "()Z", "Ll10/i;", "isThinEnabled$delegate", "LSc/j;", "isThinEnabled", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;", "brandLogoCache$delegate", "getBrandLogoCache", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;", "brandLogoCache", "isGalleryImagePrefetchEnabled$delegate", "isGalleryImagePrefetchEnabled", "isPdpOfflineModeEnabled$delegate", "isPdpOfflineModeEnabled", "scrollWidgetKeyByPositionEnabled$delegate", "getScrollWidgetKeyByPositionEnabled", "scrollWidgetKeyByPositionEnabled", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "Companion", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2GalleryImagePrefetchHelper;", "galleryImagePrefetchHelper", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TileGrid2ViewMapper extends WidgetViewMapper2<TileGrid2WidgetV2Component, TileGrid2VO, TileGrid2VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Class<? extends f>> customActionHandlers;
    private i container;
    private final boolean isThinView;

    /* renamed from: isThinEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isThinEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2ViewMapper$isThinEnabled$2(this));

    /* renamed from: brandLogoCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j brandLogoCache = LazyUtilsKt.unsafeLazy(TileGrid2ViewMapper$brandLogoCache$2.INSTANCE);

    /* renamed from: isGalleryImagePrefetchEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isGalleryImagePrefetchEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2ViewMapper$isGalleryImagePrefetchEnabled$2(this));

    /* renamed from: isPdpOfflineModeEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isPdpOfflineModeEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2ViewMapper$isPdpOfflineModeEnabled$2(this));

    /* renamed from: scrollWidgetKeyByPositionEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollWidgetKeyByPositionEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2ViewMapper$scrollWidgetKeyByPositionEnabled$2(this));

    @NotNull
    private final Function2<TileGrid2VO, d, List<TileGrid2VO>> mapper = new TileGrid2ViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, TileGrid2ViewHolder> holderProducer = new TileGrid2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(SelectedStateChangedEvent.class);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2ViewMapper$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "customActionHandlers", "Ljava/util/Set;", "getCustomActionHandlers", "()Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends f>> getCustomActionHandlers() {
            return TileGrid2ViewMapper.customActionHandlers;
        }

        private Companion() {
        }
    }

    static {
        LinkedHashSet X02 = C7714v.X0(FavoriteCustomComposerActionHandlerUtils.INSTANCE.getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES());
        X02.add(GoCheckoutActionHandler.class);
        X02.add(ShareLinkActionHandler.class);
        X02.add(ClassifiedOpenDeleteListingModalActionHandler.class);
        X02.add(OpenDeeplinkForRefreshResultActionHandler.class);
        X02.add(ComposerActionAndRedirectActionHandler.class);
        X02.add(ShareLinkBloggerFromTileActionHandler.class);
        customActionHandlers = X02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileGrid2GalleryImagePrefetchHelper constructLayout$lambda$3$lambda$2(InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BrandLogoTransformedBitmapCache getBrandLogoCache() {
        return (BrandLogoTransformedBitmapCache) this.brandLogoCache.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getScrollWidgetKeyByPositionEnabled() {
        return ((Boolean) this.scrollWidgetKeyByPositionEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isGalleryImagePrefetchEnabled() {
        return ((Boolean) this.isGalleryImagePrefetchEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPdpOfflineModeEnabled() {
        return ((Boolean) this.isPdpOfflineModeEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThinEnabled() {
        return ((Boolean) this.isThinEnabled.getValue()).booleanValue();
    }

    private final void prepareComposerRecycler(RecyclerView composerRecycler) {
        if (isGalleryImagePrefetchEnabled()) {
            prepareComposerRecycler$lambda$5(component().getGalleryImagePrefetchHelperLazy()).prepare(composerRecycler);
        }
    }

    private static final TileGrid2GalleryImagePrefetchHelper prepareComposerRecycler$lambda$5(InterfaceC4008j<TileGrid2GalleryImagePrefetchHelper> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    private final void setupContainer(i container) {
        this.container = container;
        final AbstractC5434v lifecycle = container.K().f().getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            this.container = null;
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ViewMapper$setupContainer$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.container = null;
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        View requireView = references.getContainer().j().requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
        prepareComposerRecycler(ComposerViewExtensionKt.composerRecyclerView(requireView));
        if (isGalleryImagePrefetchEnabled()) {
            final AbstractC5434v c11 = U7.d.c(references);
            if (c11.b() == AbstractC5434v.b.DESTROYED) {
                constructLayout$lambda$3$lambda$2(component().getGalleryImagePrefetchHelperLazy()).onClear();
            } else {
                c11.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ViewMapper$constructLayout$$inlined$whenDestroyed$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(J owner) {
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        TileGrid2ViewMapper.constructLayout$lambda$3$lambda$2(this.component().getGalleryImagePrefetchHelperLazy()).onClear();
                        AbstractC5434v.this.e(this);
                    }
                });
            }
        }
        component().getImagePrefetchInfoProviderStorage().addProvider(N.b(TileGrid2VO.class), component().getPrefetchInfoProvider());
        ComposerRefrencesExtKt.observePageRefresh(references, new TileGrid2ViewMapper$constructLayout$2(this));
    }

    @NotNull
    public abstract TileGrid2BaseViewBinding createViewBinding(@NotNull View view);

    @NotNull
    public abstract List<RecyclerView.n> getDecorations(@NotNull Context context);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public final List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.p0(getDecorations(context), C7714v.a0(TileGrid2MarginsDecoration.INSTANCE));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TileGrid2ViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TileGrid2VO, d, List<TileGrid2VO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getCountButtonViewModelProvider();
    }

    /* renamed from: isThinView, reason: from getter */
    public boolean getIsThinView() {
        return this.isThinView;
    }

    protected final boolean isThinWidget(@NotNull TileGrid2VO tileGrid2VO) {
        List<Object> topRightButtons;
        Intrinsics.checkNotNullParameter(tileGrid2VO, "<this>");
        List<TileGrid2GalleryModel.GalleryItem> imageItems = tileGrid2VO.getGalleryModel().getAdultImagesModel().getImageItems();
        if (!isThinEnabled() || (topRightButtons = tileGrid2VO.getTopRightButtons()) == null || topRightButtons.size() != 1) {
            return false;
        }
        List<Object> topRightButtons2 = tileGrid2VO.getTopRightButtons();
        if (((topRightButtons2 != null ? C7714v.M(topRightButtons2) : null) instanceof FavoriteMoleculeModel) && tileGrid2VO.getLeftBottomBadge() == null && tileGrid2VO.getSecondLeftBottomBadge() == null) {
            return imageItems.isEmpty() || (imageItems.size() == 1 && (C7714v.K(imageItems) instanceof TileGrid2GalleryModel.GalleryItem.ImageItem));
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TileGrid2WidgetV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TileGrid2WidgetV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull TileGrid2VO oldItem, @NotNull TileGrid2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        b builder = C7714v.B();
        if (!Intrinsics.d(oldItem.getTopRightButtons(), newItem.getTopRightButtons()) || oldItem.getTopRightButtonsAnimationEnabled() != newItem.getTopRightButtonsAnimationEnabled()) {
            builder.add(TileGrid2Payload.TOP_RIGHT_BUTTONS_CHANGED);
        }
        if (!Intrinsics.d(oldItem.getLeftBottomBadge(), newItem.getLeftBottomBadge()) || !Intrinsics.d(oldItem.getSecondLeftBottomBadge(), newItem.getSecondLeftBottomBadge()) || oldItem.getBadgesInCorner() != newItem.getBadgesInCorner()) {
            builder.add(TileGrid2Payload.BADGES_CHANGED);
        }
        if (!Intrinsics.d(oldItem.getContentElements(), newItem.getContentElements()) || !Intrinsics.d(oldItem.getKebab(), newItem.getKebab()) || !Intrinsics.d(oldItem.getOverlayItem(), newItem.getOverlayItem()) || oldItem.getTileWidgetId() != newItem.getTileWidgetId() || !Intrinsics.d(oldItem.getWishlistKey(), newItem.getWishlistKey()) || !Intrinsics.d(oldItem.getSelectionKey(), newItem.getSelectionKey()) || oldItem.getButtonMode() != newItem.getButtonMode() || !Intrinsics.d(oldItem.getRatingMolecule(), newItem.getRatingMolecule())) {
            builder.add(TileGrid2Payload.MAIN_STATE_CHANGED);
        }
        if (!Intrinsics.d(oldItem.getCountButton(), newItem.getCountButton())) {
            builder.add(TileGrid2Payload.COUNT_BUTTON_CHANGED);
        }
        if (!Intrinsics.d(oldItem.getBrandLogo(), newItem.getBrandLogo())) {
            builder.add(TileGrid2Payload.BRAND_LOGO_CHANGED);
        }
        if (!Intrinsics.d(oldItem.getGalleryModel(), newItem.getGalleryModel())) {
            builder.add(TileGrid2Payload.GALLERY_CHANGED);
        }
        if (!Intrinsics.d(oldItem.getBackgroundColor(), newItem.getBackgroundColor()) || !Intrinsics.d(oldItem.getIslandBackgroundColor(), newItem.getIslandBackgroundColor())) {
            builder.add(TileGrid2Payload.BACKGROUND_CHANGED);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public ru.ozon.composer.ui.widget.h getWidgetSpan(@NotNull TileGrid2VO state, @NotNull TileGrid2VO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public TileGrid2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TileGrid2VO oldItem) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SelectedStateChangedEvent) {
            SelectedStateChangedEvent selectedStateChangedEvent = (SelectedStateChangedEvent) update;
            if (Intrinsics.d(String.valueOf(selectedStateChangedEvent.getSku()), oldItem.getTileId())) {
                List<Object> topRightButtons = oldItem.getTopRightButtons();
                if (topRightButtons != null) {
                    List<Object> list = topRightButtons;
                    ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                    for (Object obj : list) {
                        if (obj instanceof TopRightButtonCheckBox) {
                            obj = TopRightButtonCheckBox.copy$default((TopRightButtonCheckBox) obj, selectedStateChangedEvent.getIsSelected(), null, 2, null);
                        } else if (obj instanceof TileGrid2CheckBoxVO) {
                            TileGrid2CheckBoxVO tileGrid2CheckBoxVO = (TileGrid2CheckBoxVO) obj;
                            obj = TileGrid2CheckBoxVO.copy$default(tileGrid2CheckBoxVO, CheckBoxDTO.copy$default(tileGrid2CheckBoxVO.getAtomDTO(), null, TileGrid2MapperKt.toCheckBoxDTOStatus(selectedStateChangedEvent.getIsSelected()), null, null, null, null, null, null, null, null, 1021, null), null, 2, null);
                        }
                        arrayList2.add(obj);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return TileGrid2VO.copy$default(oldItem, 0L, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, false, false, null, 0, 0, null, null, null, 0L, null, null, null, null, null, false, false, 2147483583, null);
            }
        }
        return oldItem;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        super.constructLayout(container, viewItem);
        setupContainer(container);
    }
}
