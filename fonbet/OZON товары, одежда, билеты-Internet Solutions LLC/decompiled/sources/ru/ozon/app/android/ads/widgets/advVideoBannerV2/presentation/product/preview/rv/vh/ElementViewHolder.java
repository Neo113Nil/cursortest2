package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0001H$¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "element", "", "bindElement", "(Ljava/lang/Object;)V", "item", "bind", "", "canHandle", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ElementViewHolder<T> extends RecyclerView.C {

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElementViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    protected abstract void bind(@NotNull T item);

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindElement(@NotNull Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (canHandle(element)) {
            bind(element);
        } else {
            ViewExtKt.gone(getContainerView());
        }
    }

    protected abstract boolean canHandle(@NotNull Object item);

    @NotNull
    protected View getContainerView() {
        return this.containerView;
    }
}
