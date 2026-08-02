package ru.ozon.app.android.product.binders;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0012\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\bH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0006J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00028\u0001\"\b\b\u0001\u0010$*\u00020#2\b\b\u0001\u0010&\u001a\u00020%H\u0004¢\u0006\u0004\b'\u0010(R\"\u0010)\u001a\u00020#8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0014\u001a\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\"R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110D8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Product", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Ll20/c;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "recycle", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "bindVO", "(Ll20/c;)V", "Landroid/view/View;", "T", "", "id", "findViewById", "(I)Landroid/view/View;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "setLifecycleOwner", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "setComposerReferences", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "LVg/c;", "getCustomActionHandlersStore", "()LVg/c;", "setCustomActionHandlersStore", "(LVg/c;)V", "Ll20/c;", "getProduct", "()Ll20/c;", "setProduct", "Lkotlin/Function0;", "onAdultDialogCompleted", "Lkotlin/jvm/functions/Function0;", "getOnAdultDialogCompleted", "()Lkotlin/jvm/functions/Function0;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ProductPropertyBinder<Product extends c> {
    protected ComposerReferences composerReferences;
    protected Vg.c customActionHandlersStore;
    protected J lifecycleOwner;

    @NotNull
    private final Function0<Unit> onAdultDialogCompleted = new ProductPropertyBinder$onAdultDialogCompleted$1(this);
    protected Product product;
    protected View rootView;

    public static /* synthetic */ void init$default(ProductPropertyBinder productPropertyBinder, k kVar, ComposerReferences composerReferences, Vg.c cVar, ViewGroup viewGroup, int i11, Object obj) {
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

    public void bind(@NotNull Product product, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        setProduct(product);
    }

    public final void bindVO(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "product");
        setProduct(product);
    }

    public void detach() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final <T extends View> T findViewById(int id2) {
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
    protected final Vg.c getCustomActionHandlersStore() {
        Vg.c cVar = this.customActionHandlersStore;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("customActionHandlersStore");
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
    protected final Product getProduct() {
        Product product = this.product;
        if (product != null) {
            return product;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, java.lang.Object] */
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull Vg.c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        ViewGroup viewGroup = itemView;
        if (itemView == null) {
            ?? itemView2 = widgetViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            viewGroup = itemView2;
        }
        setRootView(viewGroup);
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

    protected final void setCustomActionHandlersStore(@NotNull Vg.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.customActionHandlersStore = cVar;
    }

    protected final void setLifecycleOwner(@NotNull J j11) {
        Intrinsics.checkNotNullParameter(j11, "<set-?>");
        this.lifecycleOwner = j11;
    }

    protected final void setProduct(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<set-?>");
        this.product = product;
    }

    protected final void setRootView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rootView = view;
    }
}
