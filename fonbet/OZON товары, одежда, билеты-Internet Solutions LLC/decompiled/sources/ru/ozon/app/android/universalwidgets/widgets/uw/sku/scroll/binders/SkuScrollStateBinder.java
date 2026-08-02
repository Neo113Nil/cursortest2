package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import FM.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Vg.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.factories.DefaultAtomsFactory;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.decorators.ScrollProductsContainerStateDecorator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollStateBinder$Companion$factory$2;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JA\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0002\b\u00030\u0005j\u0006\u0012\u0002\b\u0003`\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollStateBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "<init>", "()V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "stateVrc$delegate", "LSc/j;", "getStateVrc", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "stateVrc", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollStateBinder extends ProductPropertyBinder<ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final InterfaceC4008j<SkuScrollStateBinder$Companion$factory$2.AnonymousClass1> factory$delegate = LazyUtilsKt.unsafeLazy(SkuScrollStateBinder$Companion$factory$2.INSTANCE);

    @NotNull
    private final AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, Companion.getFactory(), 7, null);

    /* renamed from: stateVrc$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j stateVrc = k.a(n.NONE, new SkuScrollStateBinder$stateVrc$2(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/binders/SkuScrollStateBinder$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/atoms/v3/factories/DefaultAtomsFactory;", "factory$delegate", "LSc/j;", "getFactory", "()Lru/ozon/app/android/atoms/v3/factories/DefaultAtomsFactory;", "factory", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultAtomsFactory getFactory() {
            return (DefaultAtomsFactory) SkuScrollStateBinder.factory$delegate.getValue();
        }

        private Companion() {
        }
    }

    private final VerticalAtomsLayout getStateVrc() {
        return (VerticalAtomsLayout) this.stateVrc.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(SkuScrollStateBinder skuScrollStateBinder, View view) {
        skuScrollStateBinder.getRootView().performClick();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull ru.ozon.composer.ui.widget.k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        getStateVrc().setOnClickListener(new a(this, 4));
        this.atomsAdapter.setOnAction(new SkuScrollStateBinder$init$2(this));
        VerticalAtomsLayout stateVrc = getStateVrc();
        stateVrc.setAdapter(this.atomsAdapter);
        Context applicationContext = stateVrc.getRootView().getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        stateVrc.setDecorator(new ScrollProductsContainerStateDecorator(applicationContext));
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((SkuScrollStateBinder) product, info, holder);
        List<AtomDTO> state = product.getState();
        if (state != null) {
            AtomsAdapter atomsAdapter = this.atomsAdapter;
            Context context = getRootView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, state);
        }
        VerticalAtomsLayout stateVrc = getStateVrc();
        ViewGroup.LayoutParams layoutParams = stateVrc.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = product.getStateHeight();
        stateVrc.setLayoutParams(layoutParams);
    }
}
