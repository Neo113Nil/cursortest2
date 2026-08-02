package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J+\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010 \u001a\u00020\u000e2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001d¢\u0006\u0004\b \u0010!R$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter$BadgeViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter$BadgeViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter$BadgeViewHolder;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "", "previousList", "currentList", "onCurrentListChanged", "(Ljava/util/List;Ljava/util/List;)V", "", "list", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "submitList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/RecyclerView;", "BadgeDiffer", "BadgeViewHolder", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewBadgeListAdapter extends t<BadgeDTO, BadgeViewHolder> {
    private Function1<? super AtomAction, Unit> actionHandler;
    private RecyclerView recyclerView;

    /* renamed from: BadgeDiffer, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter$BadgeDiffer;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Z", "areContentsTheSame", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListAdapter$BadgeDiffer, reason: from kotlin metadata */
    public static final class Companion extends i.d<BadgeDTO> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull BadgeDTO oldItem, @NotNull BadgeDTO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getText(), newItem.getText()) && oldItem.getStyle() == newItem.getStyle();
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull BadgeDTO oldItem, @NotNull BadgeDTO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getText(), newItem.getText());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter$BadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeViewHolder extends RecyclerView.C {
        public static final int $stable = BadgeView.$stable;

        @NotNull
        private final BadgeView badgeView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BadgeViewHolder(@NotNull BadgeView badgeView) {
            super(badgeView);
            Intrinsics.checkNotNullParameter(badgeView, "badgeView");
            this.badgeView = badgeView;
        }

        @NotNull
        public final BadgeView getBadgeView() {
            return this.badgeView;
        }
    }

    public ReviewBadgeListAdapter() {
        super(INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.t
    public void onCurrentListChanged(@NotNull List<BadgeDTO> previousList, @NotNull List<BadgeDTO> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        super.onCurrentListChanged(previousList, currentList);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
        this.actionHandler = null;
    }

    public final void submitList(List<BadgeDTO> list, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        super.submitList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BadgeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeView badgeView = holder.getBadgeView();
        BadgeDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        BadgeHolderKt.bind(badgeView, item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BadgeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new BadgeViewHolder(badgeView);
    }
}
