package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation;

import DA.a;
import Vg.f;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
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
import ru.ozon.app.android.product.common.ProductWidgetDTO;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.utils.ComposerActionAndRedirectActionHandlerAppenderKt;
import ru.ozon.app.android.product.utils.GoCheckoutActionHandlerAppenderKt;
import ru.ozon.app.android.product.utils.ShareLinkActionHandlerAppenderKt;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper.ProductToManyMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di.DaggerSkuGrid3Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di.SkuGrid3Component;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;
import ru.ozon.composer.ui.widget.h;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ThinViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/di/SkuGrid3Component;", "Lru/ozon/app/android/product/common/ProductWidgetDTO;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/product/common/ProductWidgetDTO;Lru/ozon/app/android/product/common/product/ProductVO;)Lru/ozon/composer/ui/widget/h;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductToManyMapper;", "mapper", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuGrid3ThinViewMapper extends WidgetViewMapper2<SkuGrid3Component, ProductWidgetDTO, ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Class<? extends f>> customActionHandlers = ShareLinkActionHandlerAppenderKt.appendShareLinkActionHandler(ComposerActionAndRedirectActionHandlerAppenderKt.appendComposerActionAndRedirectActionHandler(GoCheckoutActionHandlerAppenderKt.appendGoCheckout(FavoriteCustomComposerActionHandlerUtils.INSTANCE.getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES())));
    private final int layout = R$layout.sku_grid3_thin_product_view;

    @NotNull
    private final Function2<View, ComposerReferences, SkuGrid3ViewHolder> holderProducer = new SkuGrid3ThinViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ThinViewMapper$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "customActionHandlers", "Ljava/util/Set;", "getCustomActionHandlers", "()Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends f>> getCustomActionHandlers() {
            return SkuGrid3ThinViewMapper.customActionHandlers;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SkuGrid3Component widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSkuGrid3Component.factory().create((RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), (CartAtomBinderComponentApi) c7475g.getComponent(CartAtomBinderComponentApi.class), (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (VideoCoverComponentApi) c7475g.getComponent(VideoCoverComponentApi.class), (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (CartComponentApi) c7475g.getComponent(CartComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class), (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ProductWidgetDTO) && ((ProductWidgetDTO) state).getProductContainer().getIsThin();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new Grid3OffsetDecorator(context, SkuGrid3ViewHolder.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SkuGrid3ViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SkuGrid3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SkuGrid3Component.class), new a(storage, 9));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProductToManyMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull ProductWidgetDTO state, @NotNull ProductVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.c.f94871b;
    }
}
