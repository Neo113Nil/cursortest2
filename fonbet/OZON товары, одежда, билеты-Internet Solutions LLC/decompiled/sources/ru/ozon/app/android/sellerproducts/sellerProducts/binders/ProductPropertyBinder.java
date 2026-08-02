package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\r2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010 *\u00020\u001f2\b\b\u0001\u0010\"\u001a\u00020!H\u0004¢\u0006\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u001f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0007\u001a\u00020\u00068\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R&\u0010\n\u001a\u00060\bj\u0002`\t8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\n\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0011\u001a\u00020\u00108\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u001eR \u0010A\u001a\b\u0012\u0004\u0012\u00020\r0@8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "recycle", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "bindVO", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;)V", "Landroid/view/View;", "T", "", "id", "findViewById", "(I)Landroid/view/View;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "setLifecycleOwner", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "setComposerReferences", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "LVg/c;", "getCustomActionHandlersStore", "()LVg/c;", "setCustomActionHandlersStore", "(LVg/c;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "getProduct", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "setProduct", "Lkotlin/Function0;", "onAdultDialogCompleted", "Lkotlin/jvm/functions/Function0;", "getOnAdultDialogCompleted", "()Lkotlin/jvm/functions/Function0;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProductPropertyBinder {
    protected ComposerReferences composerReferences;
    protected c customActionHandlersStore;
    protected J lifecycleOwner;

    @NotNull
    private final Function0<Unit> onAdultDialogCompleted = ProductPropertyBinder$onAdultDialogCompleted$1.INSTANCE;
    protected ProductVO product;
    protected View rootView;

    public static /* synthetic */ void init$default(ProductPropertyBinder productPropertyBinder, k kVar, ComposerReferences composerReferences, c cVar, ViewGroup viewGroup, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i11 & 8) != 0) {
            viewGroup = null;
        }
        productPropertyBinder.init(kVar, composerReferences, cVar, viewGroup);
    }

    public void attach(@NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        setProduct(product);
    }

    public final void bindVO(@NotNull ProductVO product) {
        Intrinsics.checkNotNullParameter(product, "product");
        setProduct(product);
    }

    public void detach() {
    }

    @NotNull
    protected final <T extends View> T findViewById(int id2) {
        T t2 = (T) getRootView().findViewById(id2);
        Intrinsics.checkNotNullExpressionValue(t2, "findViewById(...)");
        return t2;
    }

    @NotNull
    protected final ComposerReferences getComposerReferences() {
        ComposerReferences composerReferences = this.composerReferences;
        if (composerReferences != null) {
            return composerReferences;
        }
        Intrinsics.n("composerReferences");
        throw null;
    }

    @NotNull
    protected final J getLifecycleOwner() {
        J j11 = this.lifecycleOwner;
        if (j11 != null) {
            return j11;
        }
        Intrinsics.n("lifecycleOwner");
        throw null;
    }

    @NotNull
    protected Function0<Unit> getOnAdultDialogCompleted() {
        return this.onAdultDialogCompleted;
    }

    @NotNull
    protected final ProductVO getProduct() {
        ProductVO productVO = this.product;
        if (productVO != null) {
            return productVO;
        }
        Intrinsics.n(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final View getRootView() {
        View view = this.rootView;
        if (view != null) {
            return view;
        }
        Intrinsics.n("rootView");
        throw null;
    }

    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        View view = itemView;
        if (itemView == null) {
            View itemView2 = widgetViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            view = itemView2;
        }
        setRootView(view);
        setLifecycleOwner(widgetViewHolder);
        setComposerReferences(composerReferences);
        setCustomActionHandlersStore(customActionHandlersStore);
    }

    public void onViewInVisibleBounds() {
    }

    public void onViewOutOfVisibleBounds() {
    }

    public void recycle() {
    }

    protected final void setComposerReferences(@NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "<set-?>");
        this.composerReferences = composerReferences;
    }

    protected final void setCustomActionHandlersStore(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.customActionHandlersStore = cVar;
    }

    protected final void setLifecycleOwner(@NotNull J j11) {
        Intrinsics.checkNotNullParameter(j11, "<set-?>");
        this.lifecycleOwner = j11;
    }

    protected final void setProduct(@NotNull ProductVO productVO) {
        Intrinsics.checkNotNullParameter(productVO, "<set-?>");
        this.product = productVO;
    }

    protected final void setRootView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rootView = view;
    }
}
