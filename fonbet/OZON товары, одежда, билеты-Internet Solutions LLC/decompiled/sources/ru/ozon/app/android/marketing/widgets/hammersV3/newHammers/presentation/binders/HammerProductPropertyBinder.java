package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersBodyView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u001e¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductPropertyBinder;", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroid/view/ViewGroup;", "itemView", "", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "hammerProduct", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "recycle", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "bindVO", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyView;", "rootView", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyView;", "getRootView", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyView;", "setRootView", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersBodyView;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "setLifecycleOwner", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "setComposerReferences", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "hammerV3Product", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "getHammerV3Product", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3BodyVO;", "setHammerV3Product", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class HammerProductPropertyBinder {
    private ComposerReferences composerReferences;
    private HammersV3BodyVO hammerV3Product;
    private J lifecycleOwner;
    private HammersBodyView rootView;

    public void attach(@NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void bind(@NotNull HammersV3BodyVO hammerProduct, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(hammerProduct, "hammerProduct");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.hammerV3Product = hammerProduct;
    }

    public final void bindVO(@NotNull HammersV3BodyVO product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.hammerV3Product = product;
    }

    public void detach() {
    }

    protected final HammersV3BodyVO getHammerV3Product() {
        return this.hammerV3Product;
    }

    protected final J getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    protected final HammersBodyView getRootView() {
        return this.rootView;
    }

    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        HammersBodyView hammersBodyView = null;
        HammersBodyView hammersBodyView2 = itemView instanceof HammersBodyView ? (HammersBodyView) itemView : null;
        if (hammersBodyView2 == null) {
            View view = widgetViewHolder.itemView;
            if (view instanceof HammersBodyView) {
                hammersBodyView = (HammersBodyView) view;
            }
        } else {
            hammersBodyView = hammersBodyView2;
        }
        this.rootView = hammersBodyView;
        this.lifecycleOwner = widgetViewHolder;
        this.composerReferences = composerReferences;
    }

    public void onViewInVisibleBounds() {
    }

    public void onViewOutOfVisibleBounds() {
    }

    public void recycle() {
    }
}
