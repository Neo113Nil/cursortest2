package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.holders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/holders/RateBaseViewHolder;", "Landroid/view/View;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "item", "", "position", "", "bindItem", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;I)V", "onCreateViewHolder", "()V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RateBaseViewHolder<T extends View> extends RecyclerView.C {

    @NotNull
    private final T containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateBaseViewHolder(@NotNull T containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public abstract void bindItem(@NotNull RateSection item, int position);

    @NotNull
    public T getContainerView() {
        return this.containerView;
    }

    public void onCreateViewHolder() {
    }
}
