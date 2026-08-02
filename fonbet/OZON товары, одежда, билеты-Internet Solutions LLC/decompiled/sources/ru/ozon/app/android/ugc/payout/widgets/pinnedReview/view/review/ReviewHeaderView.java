package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import F3.G;
import OV.a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewHeaderVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewHeaderView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001b\u0010)\u001a\u00020$8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "actionHandler", "bindAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "bind", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/icon/IconView;", "avatarIcv", "Lru/ozon/uni/android/atom/icon/IconView;", "getAvatarIcv", "()Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "Lru/ozon/uni/android/atom/rating/RatingView;", "getRatingView", "()Lru/ozon/uni/android/atom/rating/RatingView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "dateTav", "getDateTav", "Landroidx/appcompat/widget/AppCompatImageView;", "doteDividerIv$delegate", "LSc/j;", "getDoteDividerIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "doteDividerIv", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ReviewHeaderView extends ConstraintLayout {

    @NotNull
    private final IconView avatarIcv;

    @NotNull
    private final TextAtomV2View dateTav;

    /* renamed from: doteDividerIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j doteDividerIv;

    @NotNull
    private final RatingView ratingView;

    @NotNull
    private final TextAtomV2View titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.reviewAvatarIconView);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.avatarIcv = iconView;
        AttributeSet attributeSet = null;
        int i11 = 0;
        RatingView ratingView = new RatingView(context, attributeSet, i11, 0, 14, null);
        ratingView.setId(R$id.reviewRatingView);
        ratingView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.ratingView = ratingView;
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet, i11, i12, defaultConstructorMarker);
        textAtomV2View.setId(R$id.reviewTitleTav);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setLines(1);
        textAtomV2View.setEllipsize(TextUtils.TruncateAt.END);
        textAtomV2View.setGravity(16);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet, i11, i12, defaultConstructorMarker);
        G.g(textAtomV2View2, R$id.reviewDateTav, -2, -2);
        this.dateTav = textAtomV2View2;
        this.doteDividerIv = LazyUtilsKt.unsafeLazy(new ReviewHeaderView$doteDividerIv$2(context));
        addViews();
    }

    private final void addViews() {
        addView(this.avatarIcv);
        addView(this.ratingView);
        addView(this.titleTav);
        addView(this.dateTav);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindAction(final AtomAction action, final Function1<? super AtomAction, Unit> actionHandler) {
        this.avatarIcv.setOnClickListener(new a(actionHandler, action, 0));
        this.titleTav.setOnTouchListener(new View.OnTouchListener() { // from class: OV.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean bindAction$lambda$7;
                bindAction$lambda$7 = ReviewHeaderView.bindAction$lambda$7(Function1.this, action, view, motionEvent);
                return bindAction$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindAction$lambda$7(Function1 function1, AtomAction atomAction, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || view.hasFocus()) {
            return false;
        }
        function1.invoke(atomAction);
        return false;
    }

    public final void bind(@NotNull ReviewHeaderVO header, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconHolderKt.bind$default(this.avatarIcv, header.getImage(), null, 2, null);
        RatingView ratingView = this.ratingView;
        DsRatingHolderKt.bind$default(ratingView, header.getRating(), null, 2, null);
        ratingView.setSeparateClickable(false);
        TextHolderKt.bind$default(this.titleTav, header.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.dateTav, header.getDate(), null, 2, null);
        AtomAction action = header.getAction();
        if (action != null) {
            bindAction(action, actionHandler);
        }
    }

    @NotNull
    protected final IconView getAvatarIcv() {
        return this.avatarIcv;
    }

    @NotNull
    protected final TextAtomV2View getDateTav() {
        return this.dateTav;
    }

    @NotNull
    protected final AppCompatImageView getDoteDividerIv() {
        return (AppCompatImageView) this.doteDividerIv.getValue();
    }

    @NotNull
    protected final RatingView getRatingView() {
        return this.ratingView;
    }

    @NotNull
    protected final TextAtomV2View getTitleTav() {
        return this.titleTav;
    }
}
