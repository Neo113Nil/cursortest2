package com.braze.ui.widget;

import android.content.Context;
import android.view.MotionEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes7.dex */
public class DefaultCardView extends BaseFeedCardView<Card> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultCardView.class);

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

    public DefaultCardView(Context context) {
        this(context, null);
    }

    public DefaultCardView(Context context, Card card) {
        super(context);
        if (card != null) {
            setCard(card);
        }
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_default_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(Card card) {
        BrazeLogger.w(TAG, "onSetCard called for blank view with: " + card.toString());
    }
}
