package com.braze.ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.braze.models.cards.Card;
import com.braze.models.cards.ICardListener;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.BrazeFeedManager;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.braze.ui.widget.BaseCardView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes7.dex */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BaseCardView.class);

    @Override // com.braze.ui.widget.BaseCardView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    protected abstract int getLayoutResource();

    @Override // com.braze.ui.widget.BaseCardView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected abstract void onSetCard(T t);

    public BaseFeedCardView(Context context) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        this.imageSwitcher = (BrazeImageSwitcher) findViewById(R.id.com_braze_newsfeed_item_read_indicator_image_switcher);
        if (this.imageSwitcher != null) {
            this.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.braze.ui.feed.view.BaseFeedCardView$$ExternalSyntheticLambda0
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    return BaseFeedCardView.this.m5212lambda$new$0$combrazeuifeedviewBaseFeedCardView();
                }
            });
        }
        if (getIsUnreadCardVisualIndicatorEnabled() || this.imageSwitcher == null) {
            return;
        }
        this.imageSwitcher.setVisibility(8);
    }

    /* renamed from: lambda$new$0$com-braze-ui-feed-view-BaseFeedCardView, reason: not valid java name */
    /* synthetic */ View m5212lambda$new$0$combrazeuifeedviewBaseFeedCardView() {
        return new ImageView(this.applicationContext);
    }

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(R.id.com_braze_stubbed_feed_image_view);
    }

    public void setCard(T t) {
        this.card = t;
        onSetCard(this.card);
        this.card.setListener(new ICardListener() { // from class: com.braze.ui.feed.view.BaseFeedCardView$$ExternalSyntheticLambda1
            @Override // com.braze.models.cards.ICardListener
            public final void onCardUpdate() {
                BaseFeedCardView.this.m5213lambda$setCard$1$combrazeuifeedviewBaseFeedCardView();
            }
        });
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    /* renamed from: lambda$setCard$1$com-braze-ui-feed-view-BaseFeedCardView, reason: not valid java name */
    /* synthetic */ void m5213lambda$setCard$1$combrazeuifeedviewBaseFeedCardView() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    public Card getCard() {
        return this.card;
    }

    @Override // com.braze.ui.widget.BaseCardView
    protected boolean isClickHandled(Context context, Card card, IAction iAction) {
        return BrazeFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iAction);
    }
}
