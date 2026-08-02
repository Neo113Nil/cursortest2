package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.widget.BaseCardView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseContentCardView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J4\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u0002J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0004¨\u0006 "}, d2 = {"Lcom/braze/ui/contentcards/view/BaseContentCardView;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/braze/models/cards/Card;", "Lcom/braze/ui/widget/BaseCardView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createViewHolder", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "viewGroup", "Landroid/view/ViewGroup;", "bindViewHolder", "", "viewHolder", "card", "setOptionalCardImage", "imageView", "Landroid/widget/ImageView;", "cardAspectRatio", "", "cardImageUrl", "", "cardAltImageText", "isClickHandled", "", "cardAction", "Lcom/braze/ui/actions/IAction;", "safeSetClipToOutline", "setViewBackground", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

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
        final UriAction uriActionForCard = BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.contentcards.view.BaseContentCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseContentCardView.bindViewHolder$lambda$0(BaseContentCardView.this, card, uriActionForCard, view);
            }
        });
        viewHolder.setActionHintVisible(uriActionForCard != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewHolder$lambda$0(BaseContentCardView baseContentCardView, Card card, UriAction uriAction, View view) {
        baseContentCardView.handleCardClick(baseContentCardView.applicationContext, card, uriAction);
    }

    public final void setOptionalCardImage(ImageView imageView, float cardAspectRatio, String cardImageUrl, String cardAltImageText, Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (imageView == null || cardImageUrl == null) {
            return;
        }
        setImageViewToUrl(imageView, cardImageUrl, cardAspectRatio, card);
        if (cardAltImageText != null) {
            imageView.setContentDescription(cardAltImageText);
        }
    }

    @Override // com.braze.ui.widget.BaseCardView
    protected boolean isClickHandled(Context context, Card card, IAction cardAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        return contentCardsActionListener != null && contentCardsActionListener.onContentCardClicked(context, card, cardAction);
    }

    protected final void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    protected final void setViewBackground(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(getResources().getDrawable(R.drawable.com_braze_content_card_background, null));
        view.setForeground(getResources().getDrawable(R.drawable.com_braze_content_card_scrim, null));
    }
}
