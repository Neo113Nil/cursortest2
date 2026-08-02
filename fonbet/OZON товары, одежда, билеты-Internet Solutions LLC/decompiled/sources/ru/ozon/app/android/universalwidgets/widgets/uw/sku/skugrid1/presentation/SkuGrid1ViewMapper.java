package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.presentation;

import A00.a;
import Vg.f;
import android.content.Context;
import android.view.View;
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
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteCustomComposerActionHandlerUtils;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.common.ProductWidgetDTO;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.utils.ComposerActionAndRedirectActionHandlerAppenderKt;
import ru.ozon.app.android.product.utils.GoCheckoutActionHandlerAppenderKt;
import ru.ozon.app.android.product.utils.ShareLinkActionHandlerAppenderKt;
import ru.ozon.app.android.uikit.R$bool;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.ProductViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductToManyMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.DaggerSkuGrid1Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001*B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R0\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/presentation/SkuGrid1ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/di/SkuGrid1Component;", "Lru/ozon/app/android/product/common/ProductWidgetDTO;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "getLayout", "(Landroid/content/Context;)I", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/ProductViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "mapper", "()Ljava/lang/Integer;", "layout", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuGrid1ViewMapper extends WidgetViewMapper2<SkuGrid1Component, ProductWidgetDTO, ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Class<? extends f>> customActionHandlers = ShareLinkActionHandlerAppenderKt.appendShareLinkActionHandler(ComposerActionAndRedirectActionHandlerAppenderKt.appendComposerActionAndRedirectActionHandler(GoCheckoutActionHandlerAppenderKt.appendGoCheckout(FavoriteCustomComposerActionHandlerUtils.INSTANCE.getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES())));

    @NotNull
    private final Function2<View, ComposerReferences, ProductViewHolder> holderProducer = new SkuGrid1ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(AtomButtonUpdate.class);
    private final Function2<a.J.InterfaceC0007a, ProductVO, ProductVO> updateConsumer = SkuGrid1ViewMapper$updateConsumer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/presentation/SkuGrid1ViewMapper$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "customActionHandlers", "Ljava/util/Set;", "getCustomActionHandlers", "()Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends f>> getCustomActionHandlers() {
            return SkuGrid1ViewMapper.customActionHandlers;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SkuGrid1Component widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSkuGrid1Component.factory().create((RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), (CartAtomBinderComponentApi) c7475g.getComponent(CartAtomBinderComponentApi.class), (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (VideoCoverComponentApi) c7475g.getComponent(VideoCoverComponentApi.class), (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (CartComponentApi) c7475g.getComponent(CartComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class), (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ProductViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(getLayout(component().getContext()));
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public Function2<a.J.InterfaceC0007a, ProductVO, ProductVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SkuGrid1Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SkuGrid1Component.class), new BL.a(storage, 3));
    }

    private final int getLayout(Context context) {
        try {
            return context.getResources().getBoolean(R$bool.isTablet) ? R$layout.sku_grid_1_widget_item_tablet : R$layout.sku_grid_1_widget_item;
        } catch (Exception unused) {
            return R$layout.sku_grid_1_widget_item;
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProductToManyMapper getMapper() {
        return component().getMapper();
    }
}
