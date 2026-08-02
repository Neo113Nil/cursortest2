package ru.ozon.app.android.ugc.core.widgets.singlereview.aspects;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListAdapter;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/aspects/SingleReviewAspectsView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "aspectsAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter;", "aspectsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "bind", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewAspectsView extends RecyclerView {

    @NotNull
    private final ReviewBadgeListAdapter aspectsAdapter;

    @NotNull
    private final LinearLayoutManager aspectsLayoutManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewAspectsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ReviewBadgeListAdapter reviewBadgeListAdapter = new ReviewBadgeListAdapter();
        this.aspectsAdapter = reviewBadgeListAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.aspectsLayoutManager = linearLayoutManager;
        setId(R$id.reviewBodyAspectsRv);
        setOverScrollMode(2);
        setNestedScrollingEnabled(false);
        setItemAnimator(null);
        setAdapter(reviewBadgeListAdapter);
        setLayoutManager(linearLayoutManager);
        setLayoutParams(new RecyclerView.p(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        addItemDecoration(new MarginItemDecoration(dimens.getDP_4(), dimens.getDP_16()));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setLayoutParams(new RecyclerView.p(-1, -2));
        setPadding(getPaddingLeft(), dimens.getDP_10(), getPaddingRight(), dimens.getDP_10());
    }

    public final void bind(@NotNull List<BadgeDTO> badges, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.aspectsAdapter.submitList(badges, actionHandler);
    }
}
