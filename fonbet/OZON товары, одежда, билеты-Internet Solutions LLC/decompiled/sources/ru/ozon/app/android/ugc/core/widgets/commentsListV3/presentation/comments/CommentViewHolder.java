package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.comments;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$drawable;
import ru.ozon.app.android.ugc.core.databinding.ItemSingleReviewCommentV3Binding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsVH;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010 J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b%\u0010 J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b&\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/comments/CommentViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsVH;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewCommentV3Binding;", "binding", "Lkotlin/Function1;", "", "replyTo", "", "deleteComment", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewCommentV3Binding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;", "indicatorVO", "bindIndicator", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "setDate", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "text", "setComment", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "setActive", "(Z)V", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;)V", "onViewInVisibleBounds", "()V", "comment", "bindSocialHeader", "setActions", "bindBackground", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewCommentV3Binding;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "", "indicatorPadding", "I", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView$delegate", "LSc/j;", "getIndicatorView", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentViewHolder extends CommentsVH<CommentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSingleReviewCommentV3Binding binding;

    @NotNull
    private final Function1<String, Unit> deleteComment;
    private final int indicatorPadding;

    /* renamed from: indicatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j indicatorView;
    private CommentVO item;

    @NotNull
    private final Function1<CommentVO, Unit> replyTo;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommentViewHolder(@NotNull ItemSingleReviewCommentV3Binding binding, @NotNull Function1<? super CommentVO, Unit> replyTo, @NotNull Function1<? super String, Unit> deleteComment, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(replyTo, "replyTo");
        Intrinsics.checkNotNullParameter(deleteComment, "deleteComment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.replyTo = replyTo;
        this.deleteComment = deleteComment;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.indicatorPadding = Dimens.INSTANCE.getDP_12();
        this.indicatorView = k.b(new CommentViewHolder$indicatorView$2(this));
    }

    private final void bindIndicator(CommentVO.AuthorVO.ConfirmedIndicatorVO indicatorVO) {
        if (indicatorVO == null) {
            this.binding.commentCl.removeView(getIndicatorView());
            return;
        }
        IndicatorView indicatorView = getIndicatorView();
        IndicatorHolderKt.bind$default(indicatorView, indicatorVO.getIndicator(), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = indicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String fillColor = indicatorVO.getFillColor();
        Context context2 = indicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        indicatorView.setIconColor(styleParser.parseColorInt(context, fillColor, ResourceExtKt.color(context2, R$color.graphic_ozon)));
        Context context3 = indicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        String borderColor = indicatorVO.getBorderColor();
        Context context4 = indicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        indicatorView.setBorderColor(styleParser.parseColorInt(context3, borderColor, ResourceExtKt.color(context4, R$color.layer_floor_1)));
        Context context5 = indicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        String borderColor2 = indicatorVO.getBorderColor();
        Context context6 = indicatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        indicatorView.setBackColor(Integer.valueOf(styleParser.parseColorInt(context5, borderColor2, ResourceExtKt.color(context6, R$color.layer_floor_1))));
        final ItemSingleReviewCommentV3Binding itemSingleReviewCommentV3Binding = this.binding;
        final CellView cellView = itemSingleReviewCommentV3Binding.socialHeader;
        cellView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.comments.CommentViewHolder$bindIndicator$lambda$11$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IndicatorView indicatorView2;
                int i11;
                int i12;
                IndicatorView indicatorView3;
                if (cellView.getMeasuredWidth() <= 0 || cellView.getMeasuredHeight() <= 0) {
                    return;
                }
                cellView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CellView cellView2 = (CellView) cellView;
                ConstraintLayout constraintLayout = itemSingleReviewCommentV3Binding.commentCl;
                indicatorView2 = this.getIndicatorView();
                if (constraintLayout.findViewById(indicatorView2.getId()) == null) {
                    ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
                    bVar.f41656t = cellView2.getId();
                    bVar.f41636i = cellView2.getId();
                    int width = cellView2.getLeftBlock().getIconView().getWidth();
                    i11 = this.indicatorPadding;
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = width - i11;
                    int height = cellView2.getLeftBlock().getIconView().getHeight();
                    i12 = this.indicatorPadding;
                    ((ViewGroup.MarginLayoutParams) bVar).topMargin = height - i12;
                    ConstraintLayout constraintLayout2 = itemSingleReviewCommentV3Binding.commentCl;
                    indicatorView3 = this.getIndicatorView();
                    constraintLayout2.addView(indicatorView3, bVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorView getIndicatorView() {
        return (IndicatorView) this.indicatorView.getValue();
    }

    private final void setActive(boolean active) {
        ItemSingleReviewCommentV3Binding itemSingleReviewCommentV3Binding = this.binding;
        itemSingleReviewCommentV3Binding.dateTv.setEnabled(active);
        itemSingleReviewCommentV3Binding.commentTv.setEnabled(active);
        itemSingleReviewCommentV3Binding.answerBtn.setEnabled(active);
        itemSingleReviewCommentV3Binding.reportedBtn.setEnabled(active);
        itemSingleReviewCommentV3Binding.deleteBtn.setEnabled(active);
        itemSingleReviewCommentV3Binding.socialHeader.setEnabled(active);
    }

    private final void setComment(TextDTO text) {
        TextAtomV2View commentTv = this.binding.commentTv;
        Intrinsics.checkNotNullExpressionValue(commentTv, "commentTv");
        TextHolderKt.bindOrGone$default(commentTv, text, null, 2, null);
    }

    private final void setDate(TextDTO date) {
        TextAtomV2View dateTv = this.binding.dateTv;
        Intrinsics.checkNotNullExpressionValue(dateTv, "dateTv");
        TextHolderKt.bindOrGone$default(dateTv, date, null, 2, null);
    }

    public final void bindBackground(@NotNull CommentVO comment) {
        int i11;
        Intrinsics.checkNotNullParameter(comment, "comment");
        ConstraintLayout constraintLayout = this.binding.commentCl;
        if (comment.getIsNested()) {
            Intrinsics.f(constraintLayout);
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            constraintLayout.setLayoutParams(marginLayoutParams);
            constraintLayout.setBackground(a.getDrawable(constraintLayout.getContext(), (!comment.getIsLastNested() || comment.getIsLast()) ? ru.ozon.uni.core.R$color.layer_floor_1 : R$drawable.bg_rounded_bottom_corners));
            return;
        }
        Intrinsics.f(constraintLayout);
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = Dimens.INSTANCE.getDP_4();
        constraintLayout.setLayoutParams(marginLayoutParams2);
        Context context = constraintLayout.getContext();
        if (comment.getHasAnswers()) {
            if (comment.getIsFirst()) {
                ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = 0;
                Unit unit = Unit.f71690a;
                constraintLayout.setLayoutParams(marginLayoutParams3);
                i11 = ru.ozon.uni.core.R$color.layer_floor_1;
            } else {
                i11 = R$drawable.bg_round_top_corners;
            }
        } else if (comment.getIsFirst()) {
            ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.topMargin = 0;
            Unit unit2 = Unit.f71690a;
            constraintLayout.setLayoutParams(marginLayoutParams4);
            i11 = !comment.getIsLast() ? R$drawable.bg_rounded_bottom_corners : ru.ozon.uni.core.R$color.layer_floor_1;
        } else {
            i11 = comment.getIsLast() ? R$drawable.bg_round_top_corners : R$drawable.bg_rounded_all_corners;
        }
        constraintLayout.setBackground(a.getDrawable(context, i11));
    }

    public final void bindSocialHeader(@NotNull CommentVO comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        CommentVO.AuthorVO.SocialHeaderVO socialHeader = comment.getAuthor().getSocialHeader();
        CellView socialHeader2 = this.binding.socialHeader;
        Intrinsics.checkNotNullExpressionValue(socialHeader2, "socialHeader");
        CellHolderKt.bind(socialHeader2, socialHeader.getIsSubscribed() ? socialHeader.getSubscribed() : socialHeader.getSubscribe(), this.actionHandler);
        bindIndicator(comment.getAuthor().getConfirmedIndicator());
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        CommentVO commentVO = this.item;
        if (commentVO == null || (tokenizedEvent = commentVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
    }

    public final void setActions(@NotNull CommentVO comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        ItemSingleReviewCommentV3Binding itemSingleReviewCommentV3Binding = this.binding;
        ButtonV3View answerBtn = itemSingleReviewCommentV3Binding.answerBtn;
        Intrinsics.checkNotNullExpressionValue(answerBtn, "answerBtn");
        ButtonV3HolderKt.bindOrGone$default(answerBtn, comment.getAnswerButton(), null, 2, null);
        ButtonV3DTO answerButton = comment.getAnswerButton();
        boolean z11 = false;
        if (answerButton != null ? Intrinsics.d(answerButton.isDisabled(), Boolean.TRUE) : false) {
            itemSingleReviewCommentV3Binding.answerBtn.setOnClickListener(null);
        } else {
            ButtonV3View answerBtn2 = itemSingleReviewCommentV3Binding.answerBtn;
            Intrinsics.checkNotNullExpressionValue(answerBtn2, "answerBtn");
            ViewExtKt.setOnClickListenerThrottle$default(answerBtn2, 0L, new CommentViewHolder$setActions$1$1(this, comment), 1, null);
        }
        IconButtonV3View reportBtn = itemSingleReviewCommentV3Binding.reportBtn;
        Intrinsics.checkNotNullExpressionValue(reportBtn, "reportBtn");
        IconButtonV3HolderKt.bindOrGone(reportBtn, comment.getReportButton(), this.actionHandler);
        IconButtonV3View reportedBtn = itemSingleReviewCommentV3Binding.reportedBtn;
        Intrinsics.checkNotNullExpressionValue(reportedBtn, "reportedBtn");
        IconButtonV3DTO reportedButton = comment.getReportedButton();
        if (comment.getReportButton() == null && comment.getDeleteButton() == null) {
            z11 = true;
        }
        IconButtonV3HolderKt.bindOrGone(reportedBtn, z11 ? reportedButton : null, this.actionHandler);
        IconButtonV3View deleteBtn = itemSingleReviewCommentV3Binding.deleteBtn;
        Intrinsics.checkNotNullExpressionValue(deleteBtn, "deleteBtn");
        IconButtonV3HolderKt.bindOrGone(deleteBtn, comment.getDeleteButton(), this.actionHandler);
        IconButtonV3View deleteBtn2 = itemSingleReviewCommentV3Binding.deleteBtn;
        Intrinsics.checkNotNullExpressionValue(deleteBtn2, "deleteBtn");
        ViewExtKt.setOnClickListenerThrottle$default(deleteBtn2, 0L, new CommentViewHolder$setActions$1$3(comment, this), 1, null);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsVH
    public void bind(@NotNull CommentVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        View separatorView = this.binding.separatorView;
        Intrinsics.checkNotNullExpressionValue(separatorView, "separatorView");
        ViewExtKt.showOrGone(separatorView, Boolean.valueOf(item.getWithSeparator()));
        bindBackground(item);
        bindSocialHeader(item);
        setDate(item.getDate());
        setComment(item.getText());
        setActions(item);
        setActive(item.getIsPublished());
    }
}
