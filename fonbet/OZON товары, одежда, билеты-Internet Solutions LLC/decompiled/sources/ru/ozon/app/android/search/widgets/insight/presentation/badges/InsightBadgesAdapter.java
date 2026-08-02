package ru.ozon.app.android.search.widgets.insight.presentation.badges;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgesAdapter;", "Ljk0/i;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgeViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/badge/BadgeView;", "createContainerView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/badge/BadgeView;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgeViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/widgets/insight/presentation/badges/InsightBadgeViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsightBadgesAdapter extends i<BadgeDTO, InsightBadgeViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InsightBadgesAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner) {
        super(new InsightBadgesDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
    }

    private final BadgeView createContainerView(ViewGroup parent) {
        BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), parent.getContext());
        if (badgeView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            badgeView = new BadgeView(context, null, 0, 0, 14, null);
        }
        badgeView.setLayoutParams(new RecyclerView.p(-2, -2));
        return badgeView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull InsightBadgeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public InsightBadgeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new InsightBadgeViewHolder(createContainerView(parent));
    }
}
