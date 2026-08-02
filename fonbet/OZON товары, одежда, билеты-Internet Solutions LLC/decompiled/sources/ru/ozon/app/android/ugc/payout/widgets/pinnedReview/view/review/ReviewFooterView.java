package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.FooterControlDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.button.UncontainedIconLabelButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedIconLabelButtonHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010 \u001a\u00020\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001a¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewFooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "like", "dislike", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "separatorView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "likeButton", "Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "getLikeButton", "()Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "dislikeButton", "getDislikeButton", "additionalButton$delegate", "LSc/j;", "getAdditionalButton", "additionalButton", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ReviewFooterView extends ConstraintLayout {

    /* renamed from: additionalButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j additionalButton;

    @NotNull
    private final UncontainedIconLabelButtonView dislikeButton;

    @NotNull
    private final UncontainedIconLabelButtonView likeButton;

    @NotNull
    private final View separatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.reviewFooterSeparator);
        view.setLayoutParams(new ConstraintLayout.b(0, Dimens.INSTANCE.getDP_1()));
        view.setBackgroundColor(a.getColor(context, R$color.graphic_neutral));
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, view);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, view);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, view);
        dVar.f(this);
        this.separatorView = view;
        UncontainedIconLabelButtonView uncontainedIconLabelButtonView = new UncontainedIconLabelButtonView(context, null, 0, 0, 14, null);
        uncontainedIconLabelButtonView.setId(R$id.reviewLikeButton);
        uncontainedIconLabelButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.likeButton = uncontainedIconLabelButtonView;
        UncontainedIconLabelButtonView uncontainedIconLabelButtonView2 = new UncontainedIconLabelButtonView(context, null, 0, 0, 14, null);
        uncontainedIconLabelButtonView2.setId(R$id.reviewDislikeButton);
        uncontainedIconLabelButtonView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.dislikeButton = uncontainedIconLabelButtonView2;
        this.additionalButton = LazyUtilsKt.unsafeLazy(new ReviewFooterView$additionalButton$2(context));
        addViews();
    }

    private final void addViews() {
        addView(this.likeButton);
        addView(this.dislikeButton);
        addView(this.separatorView);
    }

    protected final void bind(FooterControlDTO like, FooterControlDTO dislike, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = null;
        UncontainedIconLabelButtonHolderKt.bindOrGone(this.likeButton, (like == null || !like.isSelected()) ? like != null ? like.getNormal() : null : like.getSelected(), actionHandler);
        UncontainedIconLabelButtonView uncontainedIconLabelButtonView = this.dislikeButton;
        if (dislike != null && dislike.isSelected()) {
            uncontainedIconLabelButtonDTO = dislike.getSelected();
        } else if (dislike != null) {
            uncontainedIconLabelButtonDTO = dislike.getNormal();
        }
        UncontainedIconLabelButtonHolderKt.bindOrGone(uncontainedIconLabelButtonView, uncontainedIconLabelButtonDTO, actionHandler);
    }

    @NotNull
    protected final UncontainedIconLabelButtonView getAdditionalButton() {
        return (UncontainedIconLabelButtonView) this.additionalButton.getValue();
    }

    @NotNull
    protected final UncontainedIconLabelButtonView getDislikeButton() {
        return this.dislikeButton;
    }

    @NotNull
    protected final UncontainedIconLabelButtonView getLikeButton() {
        return this.likeButton;
    }

    @NotNull
    protected final View getSeparatorView() {
        return this.separatorView;
    }
}
