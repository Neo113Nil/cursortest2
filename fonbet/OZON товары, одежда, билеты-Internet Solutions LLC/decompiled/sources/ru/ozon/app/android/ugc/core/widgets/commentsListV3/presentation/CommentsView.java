package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import AI.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.databinding.ItemSingleReviewCommentErrorBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014J\u0018\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "emptyView", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/EmptyStateView;", "errorViewBinding", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewCommentErrorBinding;", "commentsRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "getCommentsRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "bindEmptyState", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "bindAndShowErrorState", "retryLoadComments", "Lkotlin/Function0;", "showOrGoneEmptyState", "emptyState", "show", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsView extends FrameLayout {

    @NotNull
    private final RecyclerView commentsRecycler;

    @NotNull
    private final EmptyStateView emptyView;

    @NotNull
    private final ItemSingleReviewCommentErrorBinding errorViewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        EmptyStateView emptyStateView = new EmptyStateView(context);
        ViewExtKt.gone(emptyStateView);
        this.emptyView = emptyStateView;
        ItemSingleReviewCommentErrorBinding inflate = ItemSingleReviewCommentErrorBinding.inflate(LayoutInflater.from(context), this, true);
        LinearLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.gone(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        this.errorViewBinding = inflate;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, Dimens.INSTANCE.getDP_1()));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        this.commentsRecycler = recyclerView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(recyclerView);
        addView(emptyStateView);
    }

    public final void bindAndShowErrorState(@NotNull Function0<Unit> retryLoadComments) {
        Intrinsics.checkNotNullParameter(retryLoadComments, "retryLoadComments");
        LinearLayout constraintLayout = this.errorViewBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
        this.errorViewBinding.commentErrorRetry.setOnClickListener(new a(retryLoadComments, 3));
        ViewExtKt.gone(this.emptyView);
        ViewExtKt.gone(this.commentsRecycler);
    }

    public final void bindEmptyState(@NotNull CommentsListDTO.EmptyStateDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.emptyView.bind(item);
    }

    @NotNull
    public final RecyclerView getCommentsRecycler() {
        return this.commentsRecycler;
    }

    public final void showOrGoneEmptyState(CommentsListDTO.EmptyStateDTO emptyState, boolean show) {
        this.emptyView.bindOrGone(emptyState, show);
        ViewExtKt.showOrGone(this.commentsRecycler, Boolean.valueOf(!show));
        LinearLayout constraintLayout = this.errorViewBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.gone(constraintLayout);
    }
}
