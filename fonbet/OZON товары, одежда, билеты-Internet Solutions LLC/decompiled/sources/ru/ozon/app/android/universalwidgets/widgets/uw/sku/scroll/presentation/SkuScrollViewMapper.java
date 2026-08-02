package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation;

import A00.a;
import Vg.f;
import android.view.View;
import java.util.ArrayList;
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
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.common.events.AtomButtonUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteCustomComposerActionHandlerUtils;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.common.CommonProductWidgetDTO;
import ru.ozon.app.android.product.common.ProductWidgetVO;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.utils.ComposerActionAndRedirectActionHandlerAppenderKt;
import ru.ozon.app.android.product.utils.GoCheckoutActionHandlerAppenderKt;
import ru.ozon.app.android.product.utils.ShareLinkActionHandlerAppenderKt;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.DaggerSkuScrollComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R6\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0%0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R.\u0010+\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001a¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/di/SkuScrollComponent;", "Lru/ozon/app/android/product/common/CommonProductWidgetDTO;", "Lru/ozon/app/android/product/common/ProductWidgetVO;", "<init>", "()V", "Lru/ozon/app/android/common/events/AtomButtonUpdate;", "update", "oldVO", "updateProducts", "(Lru/ozon/app/android/common/events/AtomButtonUpdate;Lru/ozon/app/android/product/common/ProductWidgetVO;)Lru/ozon/app/android/product/common/ProductWidgetVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollWidgetViewHolder;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuScrollViewMapper extends WidgetViewMapper2<SkuScrollComponent, CommonProductWidgetDTO, ProductWidgetVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Class<? extends f>> customActionHandler = ShareLinkActionHandlerAppenderKt.appendShareLinkActionHandler(ComposerActionAndRedirectActionHandlerAppenderKt.appendComposerActionAndRedirectActionHandler(GoCheckoutActionHandlerAppenderKt.appendGoCheckout(FavoriteCustomComposerActionHandlerUtils.INSTANCE.getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES())));

    @NotNull
    private final Function2<CommonProductWidgetDTO, d, List<ProductWidgetVO>> mapper = new SkuScrollViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_scroll_layout;

    @NotNull
    private final Function2<View, ComposerReferences, ScrollWidgetViewHolder> holderProducer = new SkuScrollViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(AtomButtonUpdate.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, ProductWidgetVO, ProductWidgetVO> updateConsumer = new SkuScrollViewMapper$updateConsumer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollViewMapper$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "customActionHandler", "Ljava/util/Set;", "getCustomActionHandler", "()Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends f>> getCustomActionHandler() {
            return SkuScrollViewMapper.customActionHandler;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductWidgetVO updateProducts(AtomButtonUpdate update, ProductWidgetVO oldVO) {
        Long y02 = h.y0(update.getId());
        List<ProductVO> products = oldVO.getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        boolean z11 = false;
        for (ProductVO productVO : products) {
            long skuId = productVO.getSkuId();
            if (y02 != null && skuId == y02.longValue()) {
                productVO = ProductVO.copy$default(productVO, 0L, null, 0L, null, false, false, null, null, null, null, update.getAtom(), null, null, null, null, false, null, null, null, 0.0f, 0, 0, null, null, 0L, null, null, null, null, null, null, 0, -1025, null);
                z11 = true;
            }
            arrayList.add(productVO);
        }
        if (z11) {
            return ProductWidgetVO.copy$default(oldVO, 0L, arrayList, null, null, false, 29, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SkuScrollComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSkuScrollComponent.factory().create((RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), (CartAtomBinderComponentApi) c7475g.getComponent(CartAtomBinderComponentApi.class), (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (VideoCoverComponentApi) c7475g.getComponent(VideoCoverComponentApi.class), (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (CartComponentApi) c7475g.getComponent(CartComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class), (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ScrollWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CommonProductWidgetDTO, d, List<ProductWidgetVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, ProductWidgetVO, ProductWidgetVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SkuScrollComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SkuScrollComponent.class), new FU.a(storage, 4));
    }
}
