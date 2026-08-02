package com.braze.ui.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes8.dex */
public class CaptionedImageCardView extends BaseFeedCardView<CaptionedImageCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) CaptionedImageCardView.class);
    private float mAspectRatio;
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

    public CaptionedImageCardView(Context context) {
        this(context, null);
    }

    public CaptionedImageCardView(Context context, CaptionedImageCard captionedImageCard) {
        super(context);
        this.mAspectRatio = 1.3333334f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R.id.com_braze_captioned_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        this.mTitle = (TextView) findViewById(R.id.com_braze_captioned_image_title);
        this.mDescription = (TextView) findViewById(R.id.com_braze_captioned_image_description);
        this.mDomain = (TextView) findViewById(R.id.com_braze_captioned_image_card_domain);
        if (captionedImageCard != null) {
            setCard(captionedImageCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_captioned_image_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final CaptionedImageCard captionedImageCard) {
        this.mTitle.setText(captionedImageCard.getTitle());
        this.mDescription.setText(captionedImageCard.getDescription());
        setOptionalTextView(this.mDomain, captionedImageCard.getDomain());
        this.mCardAction = getUriActionForCard(captionedImageCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.CaptionedImageCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptionedImageCardView.this.m5237lambda$onSetCard$0$combrazeuiwidgetCaptionedImageCardView(captionedImageCard, view);
            }
        });
        this.mAspectRatio = captionedImageCard.getAspectRatio();
        setImageViewToUrl(this.mImage, captionedImageCard.getImageUrl(), this.mAspectRatio, captionedImageCard);
    }

    /* renamed from: lambda$onSetCard$0$com-braze-ui-widget-CaptionedImageCardView, reason: not valid java name */
    /* synthetic */ void m5237lambda$onSetCard$0$combrazeuiwidgetCaptionedImageCardView(CaptionedImageCard captionedImageCard, View view) {
        handleCardClick(this.applicationContext, captionedImageCard, this.mCardAction);
    }
}
