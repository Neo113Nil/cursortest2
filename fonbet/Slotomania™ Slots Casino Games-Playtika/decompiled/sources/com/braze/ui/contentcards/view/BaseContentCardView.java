package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.widget.BaseCardView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseContentCardView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH&J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0005J*\u0010\u0016\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0004¨\u0006\u001e"}, d2 = {"Lcom/braze/ui/contentcards/view/BaseContentCardView;", "T", "Lcom/braze/models/cards/Card;", "Lcom/braze/ui/widget/BaseCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindViewHolder", "", "viewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "card", "createViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "isClickHandled", "", "cardAction", "Lcom/braze/ui/actions/IAction;", "safeSetClipToOutline", "imageView", "Landroid/widget/ImageView;", "setOptionalCardImage", "cardAspectRatio", "", "cardImageUrl", "", "setViewBackground", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    @Override // com.braze.ui.widget.BaseCardView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.braze.ui.widget.BaseCardView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void bindViewHolder(ContentCardViewHolder viewHolder, final Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        viewHolder.setPinnedIconVisible(card.getIsPinned());
        viewHolder.setUnreadBarVisible(this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.getIsIndicatorHighlightedInternal());
        BaseCardView.Companion companion = BaseCardView.INSTANCE;
        final UriAction uriActionForCard = BaseCardView.getUriActionForCard(card);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.contentcards.view.BaseContentCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseContentCardView.m5211bindViewHolder$lambda0(BaseContentCardView.this, card, uriActionForCard, view);
            }
        });
        viewHolder.setActionHintVisible(uriActionForCard != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewHolder$lambda-0, reason: not valid java name */
    public static final void m5211bindViewHolder$lambda0(BaseContentCardView this$0, Card card, UriAction uriAction, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(card, "$card");
        this$0.handleCardClick(this$0.applicationContext, card, uriAction);
    }

    public final void setOptionalCardImage(ImageView imageView, float cardAspectRatio, String cardImageUrl, Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (imageView == null || cardImageUrl == null) {
            return;
        }
        setImageViewToUrl(imageView, cardImageUrl, cardAspectRatio, card);
    }

    @Override // com.braze.ui.widget.BaseCardView
    protected boolean isClickHandled(Context context, Card card, IAction cardAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        return contentCardsActionListener != null && contentCardsActionListener.onContentCardClicked(context, card, cardAction);
    }

    protected final void safeSetClipToOutline(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setClipToOutline(true);
    }

    protected final void setViewBackground(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(getResources().getDrawable(R.drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(R.drawable.com_braze_content_card_scrim));
    }
}
