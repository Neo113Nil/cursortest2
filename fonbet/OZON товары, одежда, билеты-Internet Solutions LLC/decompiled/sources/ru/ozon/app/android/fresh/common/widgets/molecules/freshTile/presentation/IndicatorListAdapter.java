package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter$IndicatorViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter$IndicatorViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter$IndicatorViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "newItems", "submit", "(Ljava/util/List;)V", "items", "Ljava/util/List;", "IndicatorViewHolder", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IndicatorListAdapter extends RecyclerView.g<IndicatorViewHolder> {

    @NotNull
    private List<BadgeDTO> items = K.f71697a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorListAdapter$IndicatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/BadgeViewWrapper;", "view", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/BadgeViewWrapper;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/BadgeViewWrapper;", "getView", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/BadgeViewWrapper;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndicatorViewHolder extends RecyclerView.C {

        @NotNull
        private final BadgeViewWrapper view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicatorViewHolder(@NotNull BadgeViewWrapper view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @NotNull
        public final BadgeViewWrapper getView() {
            return this.view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void submit(List<BadgeDTO> newItems) {
        if (newItems == null) {
            newItems = K.f71697a;
        }
        i.c a11 = i.a(new IndicatorDiffUtilCallback(newItems, this.items), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.items = newItems;
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull IndicatorViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeDTO badgeDTO = (BadgeDTO) C7714v.Q(position, this.items);
        if (badgeDTO != null) {
            holder.getView().bind(badgeDTO);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public IndicatorViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new IndicatorViewHolder(new BadgeViewWrapper(context, null, 0, 0, 14, null));
    }
}
