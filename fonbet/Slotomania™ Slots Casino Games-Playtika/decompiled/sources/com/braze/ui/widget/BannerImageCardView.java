package com.braze.ui.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.braze.models.cards.BannerImageCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes5.dex */
public class BannerImageCardView extends BaseFeedCardView<BannerImageCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BannerImageCardView.class);
    private float mAspectRatio;
    private IAction mCardAction;
    private final ImageView mImage;

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

    public BannerImageCardView(Context context) {
        this(context, null);
    }

    public BannerImageCardView(Context context, BannerImageCard bannerImageCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R.id.com_braze_banner_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (bannerImageCard != null) {
            setCard(bannerImageCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_banner_image_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final BannerImageCard bannerImageCard) {
        if (bannerImageCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = bannerImageCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, bannerImageCard.getImageUrl(), this.mAspectRatio, bannerImageCard);
        this.mCardAction = getUriActionForCard(bannerImageCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.BannerImageCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerImageCardView.this.m5236lambda$onSetCard$0$combrazeuiwidgetBannerImageCardView(bannerImageCard, view);
            }
        });
    }

    /* renamed from: lambda$onSetCard$0$com-braze-ui-widget-BannerImageCardView, reason: not valid java name */
    /* synthetic */ void m5236lambda$onSetCard$0$combrazeuiwidgetBannerImageCardView(BannerImageCard bannerImageCard, View view) {
        handleCardClick(this.applicationContext, bannerImageCard, this.mCardAction);
    }
}
