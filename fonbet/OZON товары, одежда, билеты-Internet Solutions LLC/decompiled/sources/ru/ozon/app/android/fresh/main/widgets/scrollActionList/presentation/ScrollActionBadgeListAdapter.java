package ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter$BadgeViewHolder;", "", "shouldPreCreateBadgeView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter$BadgeViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter$BadgeViewHolder;", "Z", "Lkotlin/jvm/functions/Function1;", "Companion", "BadgeViewHolder", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScrollActionBadgeListAdapter extends t<BadgeDTO, BadgeViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final boolean shouldPreCreateBadgeView;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter$BadgeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "view", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeViewHolder extends RecyclerView.C {

        @NotNull
        private final BadgeView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BadgeViewHolder(@NotNull BadgeView view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @NotNull
        public final BadgeView getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionBadgeListAdapter$Companion;", "", "<init>", "()V", "BADGE_TAG", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollActionBadgeListAdapter(boolean z11, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new GenericDiffUtil());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.shouldPreCreateBadgeView = z11;
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BadgeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeDTO badgeDTO = getCurrentList().get(position);
        holder.getView().setLocatorTag("scrollActionListBadge");
        BadgeView view = holder.getView();
        Intrinsics.f(badgeDTO);
        BadgeHolderKt.bind(view, badgeDTO, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BadgeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        BadgeView badgeView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.shouldPreCreateBadgeView) {
            badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), parent.getContext());
            if (badgeView == null) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                badgeView = new BadgeView(context, null, 0, 0, 14, null);
            }
        } else {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            badgeView = new BadgeView(context2, null, 0, 0, 14, null);
        }
        return new BadgeViewHolder(badgeView);
    }
}
