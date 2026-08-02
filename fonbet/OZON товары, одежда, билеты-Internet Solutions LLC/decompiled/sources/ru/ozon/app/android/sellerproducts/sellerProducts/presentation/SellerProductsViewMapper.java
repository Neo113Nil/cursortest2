package ru.ozon.app.android.sellerproducts.sellerProducts.presentation;

import A00.a;
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
import ru.ozon.app.android.common.events.AtomButtonUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.SingleFrameBinder;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteCustomComposerActionHandlerUtils;
import ru.ozon.app.android.sellerproducts.R$layout;
import ru.ozon.app.android.sellerproducts.di.SellerProductsComponent;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.CommonProductWidgetDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.GoCheckoutActionHandlerAppenderKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVOKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductToManyMapper;
import ru.ozon.app.android.storefront.domain.events.OnAdultDialogSubmited;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070%0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/presentation/SellerProductsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/sellerproducts/di/SellerProductsComponent;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/sellerproducts/sellerProducts/presentation/ProductViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/composer/view/multiframebinder/SingleFrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/SingleFrameBinder;", "frameBinder", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "getMapper", "()Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "mapper", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SellerProductsViewMapper extends WidgetViewMapper2<SellerProductsComponent, CommonProductWidgetDTO, ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Class<? extends f>> customActionHandlers = GoCheckoutActionHandlerAppenderKt.appendComposerActionAndRedirectActionHandler(GoCheckoutActionHandlerAppenderKt.appendGoCheckout(FavoriteCustomComposerActionHandlerUtils.INSTANCE.getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES()));
    private final int layout = R$layout.view_seller_product_horizontal;

    @NotNull
    private final Function2<View, ComposerReferences, ProductViewHolder> holderProducer = new SellerProductsViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AtomButtonUpdate.class, OnAdultDialogSubmited.class);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/presentation/SellerProductsViewMapper$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "customActionHandlers", "Ljava/util/Set;", "getCustomActionHandlers", "()Ljava/util/Set;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends f>> getCustomActionHandlers() {
            return SellerProductsViewMapper.customActionHandlers;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleFrameBinder getFrameBinder() {
        return new SingleFrameBinder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SellerProductsComponent widgetComponent$lambda$0(C7475g c7475g) {
        return SellerProductsComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ProductItemDecoration(context, ProductVO.Type.LIST, null, new ProductItemDecoration.DecorationConfig.Horizontal(1, Integer.valueOf(R$attr.graphicNeutral), 136, 0, SellerProductsViewMapper$getDecorators$1.INSTANCE, 8, null), null, null, 52, null));
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
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerProductsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SellerProductsComponent.class), new BD.a(storage, 16));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProductToManyMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ProductVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ProductVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof AtomButtonUpdate ? ProductVOKt.updateButtonIfNeeded(oldItem, (AtomButtonUpdate) update) : update instanceof OnAdultDialogSubmited ? ProductVOKt.updateAdultProductIfNeedIt(oldItem, (OnAdultDialogSubmited) update) : oldItem;
    }
}
