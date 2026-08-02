package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/inputlist/InputViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "item", "", "bindItem", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class InputViewHolder extends RecyclerView.C {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
    }

    public abstract void bindItem(@NotNull DocsDeliveryFormVO.Input item);
}
