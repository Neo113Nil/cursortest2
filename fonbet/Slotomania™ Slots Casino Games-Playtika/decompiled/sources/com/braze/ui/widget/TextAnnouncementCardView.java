package com.braze.ui.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) TextAnnouncementCardView.class);
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    @Override // com.braze.ui.feed.view.BaseFeedCardView, com.braze.ui.widget.BaseCardView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView, com.braze.ui.widget.BaseCardView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TextAnnouncementCardView(Context context) {
        this(context, null);
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(R.id.com_braze_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R.id.com_braze_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R.id.com_braze_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_text_announcement_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.TextAnnouncementCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextAnnouncementCardView.this.m5239lambda$onSetCard$0$combrazeuiwidgetTextAnnouncementCardView(textAnnouncementCard, view);
            }
        });
    }

    /* renamed from: lambda$onSetCard$0$com-braze-ui-widget-TextAnnouncementCardView, reason: not valid java name */
    /* synthetic */ void m5239lambda$onSetCard$0$combrazeuiwidgetTextAnnouncementCardView(TextAnnouncementCard textAnnouncementCard, View view) {
        handleCardClick(this.applicationContext, textAnnouncementCard, this.mCardAction);
    }
}
