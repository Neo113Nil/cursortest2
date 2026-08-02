package com.braze.ui.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.ShortNewsCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes6.dex */
public class ShortNewsCardView extends BaseFeedCardView<ShortNewsCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) ShortNewsCardView.class);
    private final float mAspectRatio;
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
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

    public ShortNewsCardView(Context context) {
        this(context, null);
    }

    public ShortNewsCardView(Context context, ShortNewsCard shortNewsCard) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mDescription = (TextView) findViewById(R.id.com_braze_short_news_card_description);
        this.mTitle = (TextView) findViewById(R.id.com_braze_short_news_card_title);
        this.mDomain = (TextView) findViewById(R.id.com_braze_short_news_card_domain);
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R.id.com_braze_short_news_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (shortNewsCard != null) {
            setCard(shortNewsCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_short_news_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final ShortNewsCard shortNewsCard) {
        this.mDescription.setText(shortNewsCard.getDescription());
        setOptionalTextView(this.mTitle, shortNewsCard.getTitle());
        setOptionalTextView(this.mDomain, shortNewsCard.getDomain());
        this.mCardAction = getUriActionForCard(shortNewsCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.ShortNewsCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortNewsCardView.this.m5238lambda$onSetCard$0$combrazeuiwidgetShortNewsCardView(shortNewsCard, view);
            }
        });
        setImageViewToUrl(this.mImage, shortNewsCard.getImageUrl(), 1.0f, shortNewsCard);
    }

    /* renamed from: lambda$onSetCard$0$com-braze-ui-widget-ShortNewsCardView, reason: not valid java name */
    /* synthetic */ void m5238lambda$onSetCard$0$combrazeuiwidgetShortNewsCardView(ShortNewsCard shortNewsCard, View view) {
        handleCardClick(this.applicationContext, shortNewsCard, this.mCardAction);
    }
}
