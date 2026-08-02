package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views;

import U7.d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter$BadgeViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter$BadgeViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter$BadgeViewHolder;I)V", "BadgeDiffer", "BadgeViewHolder", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeListAdapter extends t<BadgeDTO, BadgeViewHolder> {

    /* renamed from: BadgeDiffer, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter$BadgeDiffer;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Z", "areContentsTheSame", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.BadgeListAdapter$BadgeDiffer, reason: from kotlin metadata */
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
            return Intrinsics.d(oldItem.getText(), newItem.getText()) && oldItem.getBadgeStyle() == newItem.getBadgeStyle() && Intrinsics.d(oldItem.getLeftIcon(), newItem.getLeftIcon()) && oldItem.getSize() == newItem.getSize();
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull BadgeDTO oldItem, @NotNull BadgeDTO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(d.e(oldItem.getText(), oldItem.getLeftIcon()), newItem.getText() + newItem.getLeftIcon());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter$BadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public BadgeListAdapter() {
        super(INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BadgeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeView badgeView = holder.getBadgeView();
        BadgeDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        BadgeHolderKt.bind$default(badgeView, item, (Function1) null, 2, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BadgeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new BadgeViewHolder(new BadgeView(context, null, 0, 0, 14, null));
    }
}
