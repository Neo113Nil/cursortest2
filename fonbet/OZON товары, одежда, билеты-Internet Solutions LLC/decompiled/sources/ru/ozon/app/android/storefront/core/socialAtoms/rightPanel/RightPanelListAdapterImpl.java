package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import WZ.l;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListAdapterImpl;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListAdapter;", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemCount", "()I", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "DiffCallback", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RightPanelListAdapterImpl extends RightPanelListAdapter {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListAdapterImpl$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;)Z", "areContentsTheSame", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiffCallback extends i.d<RightPanelItemVO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull RightPanelItemVO oldItem, @NotNull RightPanelItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull RightPanelItemVO oldItem, @NotNull RightPanelItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getClass().equals(newItem.getClass());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RightPanelListAdapterImpl(@NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RightPanelItemVO rightPanelItemVO = getCurrentList().get(position);
        boolean z11 = position == getShimmersCount() - 1;
        if (holder instanceof RightPanelItemViewHolder) {
            Intrinsics.g(rightPanelItemVO, "null cannot be cast to non-null type ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemVO");
            ((RightPanelItemViewHolder) holder).bind(rightPanelItemVO, z11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RightPanelItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new RightPanelItemViewHolder(parent, this.tokenizedAnalytics, this.onAction, null, 8, null);
    }
}
