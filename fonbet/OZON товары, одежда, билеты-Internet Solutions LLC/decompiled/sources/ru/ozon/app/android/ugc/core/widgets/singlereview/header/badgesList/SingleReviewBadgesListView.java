package ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgesList;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListAdapter;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListItemDecoration;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgesList/SingleReviewBadgesListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "updateGradientVisibility", "()V", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter;", "badgesAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "badgesLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$t;", "badgesScrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "", "lastBadgeIndex", "I", "Landroidx/recyclerview/widget/RecyclerView;", "badgesRv", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "leftGradient", "Landroid/view/View;", "rightGradient", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewBadgesListView extends FrameLayout {

    @NotNull
    private final ReviewBadgeListAdapter badgesAdapter;

    @NotNull
    private final LinearLayoutManager badgesLayoutManager;

    @NotNull
    private final RecyclerView badgesRv;

    @NotNull
    private final RecyclerView.t badgesScrollListener;
    private int lastBadgeIndex;

    @NotNull
    private final View leftGradient;

    @NotNull
    private final View rightGradient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewBadgesListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ReviewBadgeListAdapter reviewBadgeListAdapter = new ReviewBadgeListAdapter();
        this.badgesAdapter = reviewBadgeListAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.badgesLayoutManager = linearLayoutManager;
        RecyclerView.t tVar = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgesList.SingleReviewBadgesListView$badgesScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                SingleReviewBadgesListView.this.updateGradientVisibility();
            }
        };
        this.badgesScrollListener = tVar;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.reviewBodyBadgesRv);
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(reviewBadgeListAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.addOnScrollListener(tVar);
        Dimens dimens = Dimens.INSTANCE;
        recyclerView.addItemDecoration(new ReviewBadgeListItemDecoration(dimens.getDP_4(), 0, 2, null));
        this.badgesRv = recyclerView;
        View view = new View(context);
        view.setId(R$id.reviewBodyBadgesLeftGradient);
        view.setBackgroundResource(R$drawable.bg_review_badges_gradient_start);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimens.getDP_32(), -1);
        layoutParams.gravity = 3;
        view.setLayoutParams(layoutParams);
        this.leftGradient = view;
        View view2 = new View(context);
        view2.setId(R$id.reviewBodyBadgesRightGradient);
        view2.setBackgroundResource(R$drawable.bg_review_badges_gradient_end);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimens.getDP_32(), -1);
        layoutParams2.gravity = 5;
        view2.setLayoutParams(layoutParams2);
        this.rightGradient = view2;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setLayoutParams(new RecyclerView.p(-1, -2));
        setPadding(dimens.getDP_16(), dimens.getDP_8(), dimens.getDP_16(), getPaddingBottom());
        addView(recyclerView);
        addView(view);
        addView(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGradientVisibility() {
        int findFirstCompletelyVisibleItemPosition = this.badgesLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.badgesLayoutManager.findLastCompletelyVisibleItemPosition();
        ViewExtKt.showOrGone(this.leftGradient, Boolean.valueOf(findFirstCompletelyVisibleItemPosition != 0));
        ViewExtKt.showOrGone(this.rightGradient, Boolean.valueOf(findLastCompletelyVisibleItemPosition != this.lastBadgeIndex));
    }

    public final void bind(@NotNull List<BadgeDTO> badges, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.badgesAdapter.submitList(badges, actionHandler);
        this.lastBadgeIndex = badges.size() - 1;
    }
}
