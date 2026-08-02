package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view;

import android.content.Context;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewFooter;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewFooterView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedIconLabelButtonHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewFooterView;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewFooterView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setupConstraints", "", "bind", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewFooterView extends ReviewFooterView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedReviewFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        addView(getAdditionalButton());
        setupConstraints();
    }

    public final void bind(@NotNull PinnedReviewFooter footer, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bind(footer.getLike(), footer.getDislike(), actionHandler);
        UncontainedIconLabelButtonHolderKt.bindOrGone(getAdditionalButton(), footer.getAllReviews(), actionHandler);
    }

    protected void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, getLikeButton());
        int id2 = getLikeButton().getId();
        int id3 = getSeparatorView().getId();
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom(dVar, id2, id3, dimens.getDP_4());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, getDislikeButton().getId(), getLikeButton().getId(), dimens.getDP_12());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom(dVar, getDislikeButton().getId(), getSeparatorView().getId(), dimens.getDP_4());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, getAdditionalButton());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToBottom(dVar, getAdditionalButton().getId(), getSeparatorView().getId(), dimens.getDP_4());
        dVar.f(this);
    }
}
