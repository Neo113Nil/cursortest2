package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate;

import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.multiframe.BinderFrameWrapper;
import ru.ozon.app.android.product.multiframe.MultiFrameBinderDelegate;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u00030\rj\u0006\u0012\u0002\b\u0003`\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00042\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0002\b\u00030\rj\u0006\u0012\u0002\b\u0003`\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010!\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u00030\rj\u0006\u0012\u0002\b\u0003`\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;", "", "Lru/ozon/app/android/product/multiframe/BinderFrameWrapper;", "Lru/ozon/app/android/product/common/product/ProductVO;", "binders", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Ljava/util/Set;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LVg/c;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroid/view/ViewGroup;", "itemView", "", "multiFrameInit", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "viewHolder", "multiFrameBind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "multiFrameRecycle", "()V", "multiFrameDetach", "multiFrameAttach", "(Lru/ozon/composer/ui/widget/k;)V", "", "offscreenOffsetPercent", "multiFrameOnOffscreenPositionChanged", "(F)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "applyRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ljava/util/Set;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "LVg/c;", "Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;", "frameBinderDelegate", "Lru/ozon/app/android/product/multiframe/MultiFrameBinderDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollMultiFrameDelegate implements ScrollMultiFrameDelegate {

    @NotNull
    private final Set<BinderFrameWrapper<ProductVO>> binders;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final MultiFrameBinderDelegate<ProductVO> frameBinderDelegate;

    public SkuScrollMultiFrameDelegate(@NotNull Set<BinderFrameWrapper<ProductVO>> binders, @NotNull FrameBinder frameBinder, @NotNull c customActionHandlersStore) {
        Intrinsics.checkNotNullParameter(binders, "binders");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.binders = binders;
        this.frameBinder = frameBinder;
        this.customActionHandlersStore = customActionHandlersStore;
        this.frameBinderDelegate = new MultiFrameBinderDelegate<>(binders, frameBinder);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void applyRecycler(RecyclerView recyclerView) {
        this.frameBinderDelegate.applyRecycler(recyclerView);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void multiFrameAttach(@NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.frameBinderDelegate.onAttach(widgetViewHolder);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void multiFrameBind(@NotNull ProductVO item, @NotNull d info, @NotNull k<?> viewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.frameBinderDelegate.bind(item, info, viewHolder);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void multiFrameDetach() {
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().detach();
        }
        this.frameBinderDelegate.onDetach();
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void multiFrameInit(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        FrameBinder frameBinder = this.frameBinder;
        View itemView2 = widgetViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        frameBinder.init(itemView2);
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().init(widgetViewHolder, composerReferences, this.customActionHandlersStore, itemView);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void multiFrameOnOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinderDelegate.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate
    public void multiFrameRecycle() {
        Iterator<T> it = this.binders.iterator();
        while (it.hasNext()) {
            ((BinderFrameWrapper) it.next()).getBinder().recycle();
        }
        this.frameBinderDelegate.onRecycle();
    }
}
