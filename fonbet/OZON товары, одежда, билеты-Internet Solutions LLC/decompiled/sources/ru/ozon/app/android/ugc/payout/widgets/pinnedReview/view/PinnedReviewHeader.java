package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewHeaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewHeader;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewHeaderView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setupConstraints", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewHeader extends ReviewHeaderView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedReviewHeader(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        addView(getDoteDividerIv());
        TextAtomV2View titleTav = getTitleTav();
        ViewGroup.LayoutParams layoutParams = titleTav.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = Dimens.INSTANCE.getDP_16();
        titleTav.setLayoutParams(layoutParams);
        setupConstraints();
    }

    protected void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, getAvatarIcv());
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, getAvatarIcv());
        int id2 = getRatingView().getId();
        int id3 = getAvatarIcv().getId();
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, id2, id3, dimens.getDP_8());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop$default(dVar, getRatingView().getId(), getAvatarIcv().getId(), 0, 4, null);
        dVar.d0(getTitleTav().getId(), 2);
        dVar.c0(0.0f, getTitleTav().getId());
        dVar.C(getTitleTav().getId(), true);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToStart$default(dVar, getTitleTav().getId(), getRatingView().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToStart$default(dVar, getTitleTav().getId(), getDoteDividerIv().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom$default(dVar, getTitleTav().getId(), getAvatarIcv().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, getDoteDividerIv().getId(), getTitleTav().getId(), dimens.getDP_4());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop$default(dVar, getDoteDividerIv().getId(), getTitleTav().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom$default(dVar, getDoteDividerIv().getId(), getTitleTav().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToStart$default(dVar, getDoteDividerIv().getId(), getDateTav().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, getDateTav().getId(), getDoteDividerIv().getId(), dimens.getDP_4());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop$default(dVar, getDateTav().getId(), getTitleTav().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom$default(dVar, getDateTav().getId(), getTitleTav().getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToEnd(dVar, getDateTav().getId(), 0, dimens.getDP_8());
        dVar.f(this);
    }
}
