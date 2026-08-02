package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.ui.R;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ShortNewsContentCardView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/ShortNewsCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindViewHolder", "", "viewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "card", "Lcom/braze/models/cards/Card;", "createViewHolder", "viewGroup", "Landroid/view/ViewGroup;", k.M, "ViewHolder", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {
    private static final float ASPECT_RATIO = 1.0f;

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
    public ShortNewsContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* compiled from: ShortNewsContentCardView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$ViewHolder;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "title", "getTitle", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ ShortNewsContentCardView this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ShortNewsContentCardView this$0, View view) {
            super(view, this$0.getIsUnreadCardVisualIndicatorEnabled());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = this$0;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_short_news_card_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_short_news_card_description);
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_short_news_card_image);
        }

        public final TextView getTitle() {
            return this.title;
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_short_news_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        setViewBackground(view);
        return new ViewHolder(this, view);
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        if (card instanceof ShortNewsCard) {
            super.bindViewHolder(viewHolder, card);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            TextView title = viewHolder2.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((ShortNewsCard) card).getTitle());
            }
            TextView description = viewHolder2.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((ShortNewsCard) card).getDescription());
            }
            ShortNewsCard shortNewsCard = (ShortNewsCard) card;
            String domain = shortNewsCard.getDomain();
            String url = (domain == null || StringsKt.isBlank(domain)) ? card.getUrl() : shortNewsCard.getDomain();
            if (url != null) {
                viewHolder2.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder2.getImageView(), 1.0f, shortNewsCard.getImageUrl(), card);
            safeSetClipToOutline(viewHolder2.getImageView());
            viewHolder.itemView.setContentDescription(((Object) shortNewsCard.getTitle()) + " . " + shortNewsCard.getDescription());
        }
    }
}
