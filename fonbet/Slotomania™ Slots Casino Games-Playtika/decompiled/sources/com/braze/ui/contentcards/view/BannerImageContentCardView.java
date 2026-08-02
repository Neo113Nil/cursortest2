package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerImageContentCardView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/contentcards/view/BannerImageContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/BannerImageCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindViewHolder", "", "viewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "card", "Lcom/braze/models/cards/Card;", "createViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "ViewHolder", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public class BannerImageContentCardView extends BaseContentCardView<BannerImageCard> {
    @Override // com.braze.ui.contentcards.view.BaseContentCardView, com.braze.ui.widget.BaseCardView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView, com.braze.ui.widget.BaseCardView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerImageContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* compiled from: BannerImageContentCardView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/braze/ui/contentcards/view/BannerImageContentCardView$ViewHolder;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Lcom/braze/ui/contentcards/view/BannerImageContentCardView;Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class ViewHolder extends ContentCardViewHolder {
        private final ImageView imageView;
        final /* synthetic */ BannerImageContentCardView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(BannerImageContentCardView this$0, View view) {
            super(view, this$0.getIsUnreadCardVisualIndicatorEnabled());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = this$0;
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_banner_image_card_image);
        }

        public final ImageView getImageView() {
            return this.imageView;
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_banner_image_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        setViewBackground(view);
        return new ViewHolder(this, view);
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        if (card instanceof BannerImageCard) {
            super.bindViewHolder(viewHolder, card);
            BannerImageCard bannerImageCard = (BannerImageCard) card;
            setOptionalCardImage(((ViewHolder) viewHolder).getImageView(), bannerImageCard.getAspectRatio(), bannerImageCard.getImageUrl(), card);
        }
    }
}
