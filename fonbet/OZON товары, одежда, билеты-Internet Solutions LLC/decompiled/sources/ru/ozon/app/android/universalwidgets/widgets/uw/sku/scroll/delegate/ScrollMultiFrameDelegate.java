package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u00030\u0002j\u0006\u0012\u0002\b\u0003`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0002\b\u00030\u0002j\u0006\u0012\u0002\b\u0003`\u0003H&¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0002j\u0006\u0012\u0002\b\u0003`\u0003H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH&¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;", "", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroid/view/ViewGroup;", "itemView", "", "multiFrameInit", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;)V", "multiFrameAttach", "(Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/product/common/product/ProductVO;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "viewHolder", "multiFrameBind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "", "offscreenOffsetPercent", "multiFrameOnOffscreenPositionChanged", "(F)V", "multiFrameRecycle", "()V", "multiFrameDetach", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "applyRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ScrollMultiFrameDelegate {
    void applyRecycler(RecyclerView recyclerView);

    void multiFrameAttach(@NotNull k<?> widgetViewHolder);

    void multiFrameBind(@NotNull ProductVO item, @NotNull d info, @NotNull k<?> viewHolder);

    void multiFrameDetach();

    void multiFrameInit(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, ViewGroup itemView);

    void multiFrameOnOffscreenPositionChanged(float offscreenOffsetPercent);

    void multiFrameRecycle();
}
