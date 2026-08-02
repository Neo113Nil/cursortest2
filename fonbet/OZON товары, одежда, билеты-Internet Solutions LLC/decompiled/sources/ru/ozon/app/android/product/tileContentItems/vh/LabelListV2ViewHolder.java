package ru.ozon.app.android.product.tileContentItems.vh;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.labelList.presentation.view.LabelListView;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/tileContentItems/vh/LabelListV2ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "view", "<init>", "(Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;)V", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "vo", "", "bind", "(Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;)V", "Lru/ozon/app/android/product/labelList/presentation/view/LabelListView;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LabelListV2ViewHolder extends RecyclerView.C {

    @NotNull
    private final LabelListView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListV2ViewHolder(@NotNull LabelListView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull LabelListVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.view.bind(vo);
    }
}
