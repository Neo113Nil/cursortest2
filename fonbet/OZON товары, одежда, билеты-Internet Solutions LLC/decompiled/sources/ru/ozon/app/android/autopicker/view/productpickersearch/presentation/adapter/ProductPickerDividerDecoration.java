package ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/ProductPickerDividerDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "startDividerOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "", "drawFor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "defaultMargin", "I", "isTree", "Z", "()Z", "setTree", "(Z)V", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerDividerDecoration extends CustomDividerDecoration {
    private final int defaultMargin;
    private boolean isTree;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductPickerDividerDecoration(@NotNull Context context) {
        super(context, 1, 0, true, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultMargin = ResourceExtKt.toPx(16);
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        if (childAdapterPosition == -1) {
            return false;
        }
        if (this.isTree) {
            return true;
        }
        RecyclerView.g adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter");
        ProductPickerSearchAdapter productPickerSearchAdapter = (ProductPickerSearchAdapter) adapter;
        boolean z11 = productPickerSearchAdapter.getCurrentList().get(childAdapterPosition).getType() == Type.RADIO || productPickerSearchAdapter.getCurrentList().get(childAdapterPosition).getType() == Type.CHECKBOX;
        int i11 = childAdapterPosition + 1;
        return z11 && (i11 != productPickerSearchAdapter.getCurrentList().size() && productPickerSearchAdapter.getCurrentList().get(i11).getType() != Type.CAPTION);
    }

    public final void setTree(boolean z11) {
        this.isTree = z11;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public int startDividerOffset(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        RecyclerView.g adapter = parent.getAdapter();
        Intrinsics.g(adapter, "null cannot be cast to non-null type ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter");
        return ((ProductPickerSearchAdapter) adapter).getCurrentList().get(parent.getChildAdapterPosition(child)).getOffset() * this.defaultMargin;
    }
}
