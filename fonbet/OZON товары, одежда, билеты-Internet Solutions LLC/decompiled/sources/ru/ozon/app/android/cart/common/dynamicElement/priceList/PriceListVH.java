package ru.ozon.app.android.cart.common.dynamicElement.priceList;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6969b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/priceList/PriceListVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "priceList", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$PriceList;", "item", "", "bind", "(Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$PriceList;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lhk0/b;", "atomsAdapter", "Lhk0/b;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceListVH extends RecyclerView.C {

    @NotNull
    private final C6969b atomsAdapter;

    @NotNull
    private final RecyclerView priceList;

    private PriceListVH(RecyclerView recyclerView) {
        super(recyclerView);
        this.priceList = recyclerView;
        C6969b c6969b = new C6969b(new AtomItemViewHolderDelegate(null, null, null, 7, null));
        this.atomsAdapter = c6969b;
        recyclerView.setAdapter(c6969b);
    }

    public final void bind(@NotNull DynamicElementVO.PriceList item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.atomsAdapter.submitList(item.getList());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PriceListVH(@NotNull Context context) {
        this(r0);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new HorizontalPriceListLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipChildren(false);
    }
}
