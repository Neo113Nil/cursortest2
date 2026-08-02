package ru.ozon.app.android.pdp.widgets.badgeList.presentation.scrollable;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00052\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListAdapter$BadgeViewViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListAdapter$BadgeViewViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListAdapter$BadgeViewViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "", "Lru/ozon/uni/atoms/data/badge/Badge;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "badges", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "setBadges", "(Ljava/util/List;)V", "BadgeViewViewHolder", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollableBadgeListAdapter extends RecyclerView.g<BadgeViewViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<Badge> badges;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListAdapter$BadgeViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "view", "<init>", "(Lru/ozon/app/android/pdp/widgets/badgeList/presentation/scrollable/ScrollableBadgeListAdapter;Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/atoms/data/badge/Badge;", "item", "", "bind", "(Lru/ozon/uni/atoms/data/badge/Badge;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BadgeViewViewHolder extends RecyclerView.C {
        final /* synthetic */ ScrollableBadgeListAdapter this$0;

        @NotNull
        private final BadgeView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BadgeViewViewHolder(@NotNull ScrollableBadgeListAdapter scrollableBadgeListAdapter, BadgeView view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = scrollableBadgeListAdapter;
            this.view = view;
        }

        public final void bind(@NotNull Badge item) {
            Intrinsics.checkNotNullParameter(item, "item");
            BadgeHolderKt.bind(this.view, item, (Function1<? super AtomAction, Unit>) this.this$0.actionHandler);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableBadgeListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.badges = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.badges.size();
    }

    public final void setBadges(@NotNull List<Badge> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.badges, value)) {
            return;
        }
        this.badges = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BadgeViewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.badges.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BadgeViewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        q qVar = q.f64554a;
        d b11 = N.b(BadgeView.class);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new BadgeViewViewHolder(this, (BadgeView) qVar.g(b11, context));
    }
}
