package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view;

import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseItemDependencyHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseScrollViewHolderFactory;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/view/WiseSkuScrollAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;", "dependencyHolder", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;I)V", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseItemDependencyHolder;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseSkuScrollAdapter extends i<WiseSkuScrollElement, BindableViewHolder<WiseSkuScrollElement>> {

    @NotNull
    private final WiseItemDependencyHolder dependencyHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiseSkuScrollAdapter(@NotNull J lifecycleOwner, @NotNull WiseItemDependencyHolder dependencyHolder) {
        super(new GenericDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(dependencyHolder, "dependencyHolder");
        this.dependencyHolder = dependencyHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        WiseScrollViewHolderFactory wiseScrollViewHolderFactory = WiseScrollViewHolderFactory.INSTANCE;
        List<WiseSkuScrollElement> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        return wiseScrollViewHolderFactory.getItemViewType((WiseSkuScrollElement) C7714v.Q(position, currentList));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BindableViewHolder<WiseSkuScrollElement> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        WiseSkuScrollElement item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.dependencyHolder.getWidgetInfo());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BindableViewHolder<WiseSkuScrollElement> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return WiseScrollViewHolderFactory.INSTANCE.createHolder(viewType, parent, this.dependencyHolder);
    }
}
