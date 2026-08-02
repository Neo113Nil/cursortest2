package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.oo;
import com.bytedance.sdk.openadsdk.core.wh.vj;
import com.bytedance.sdk.openadsdk.core.widget.wh;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class TopLayoutDislike2 extends vj implements pcc<TopLayoutDislike2> {
    vj container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private oo mCloseBackupBtn;
    private oo mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private vj mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private sf mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.qf.pcc.pcc("#FFD813");
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.qf.pcc.pcc("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }

    private ImageView getCommonRingBGImageView() {
        oo ooVar = new oo(getContext());
        int sf = rj.sf(getContext(), 5.0f);
        ooVar.setPadding(sf, sf, sf, sf);
        ooVar.setScaleType(ImageView.ScaleType.CENTER);
        ooVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
        return ooVar;
    }

    private void initListener(final of ofVar) {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.sf(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable pcc;
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    ImageView imageView2 = TopLayoutDislike2.this.mSkipIV;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    if (imageView2 != null) {
                        boolean z = topLayoutDislike2.mIsSoundMute;
                        TopLayoutDislike2 topLayoutDislike22 = TopLayoutDislike2.this;
                        pcc = z ? tz.gm(topLayoutDislike22.getContext(), "tt_reward_full_mute") : tz.gm(topLayoutDislike22.getContext(), "tt_reward_full_unmute");
                    } else {
                        boolean z2 = topLayoutDislike2.mIsSoundMute;
                        TopLayoutDislike2 topLayoutDislike23 = TopLayoutDislike2.this;
                        pcc = z2 ? vh.pcc(topLayoutDislike23.getContext(), "tt_mute_wrapper") : vh.pcc(topLayoutDislike23.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(pcc);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.pcc(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.pcc(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.pcc(view2);
                        }
                    }
                });
            }
        }
        oo ooVar = this.mCloseBtn;
        if (ooVar != null) {
            ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.gm(view2);
                    }
                }
            });
        }
        oo ooVar2 = this.mCloseBackupBtn;
        if (ooVar2 != null) {
            ooVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.gm(view2);
                        com.bytedance.sdk.openadsdk.component.oo.sf.pcc("force_button_tracker", "click", ofVar);
                    }
                }
            });
        }
        vj vjVar = this.mPlayableNextAd;
        if (vjVar != null) {
            vjVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.oo(view2);
                    }
                }
            });
        }
    }

    private void initProgressBar(of ofVar) {
        qy vh;
        qy.sf nac;
        if (ofVar == null || ofVar.oo() == null || ofVar.oo().vh() == null || (vh = ofVar.oo().vh()) == null || vh.nac() == null || (nac = vh.nac()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(nac.sf())) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.qf.pcc.pcc(nac.sf());
        }
        if (!TextUtils.isEmpty(nac.gm())) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.qf.pcc.pcc(nac.gm());
        }
        if (nac.oo() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.mProgressSize = rj.sf(getContext(), 1.0f);
        } else {
            this.mProgressSize = rj.sf(getContext(), nac.oo());
        }
        if (nac.vj() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.mProgressRadiusSize = rj.sf(getContext(), nac.vj());
        }
        this.mProgressType = nac.pcc();
    }

    private void initView(of ofVar) {
        vj vjVar = new vj(getContext());
        this.container = vjVar;
        vjVar.setOrientation(0);
        int sf = rj.sf(getContext(), 16.0f);
        int sf2 = rj.sf(getContext(), 12.0f);
        int sf3 = rj.sf(getContext(), 24.0f);
        int sf4 = rj.sf(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sf4, sf4);
        layoutParams.topMargin = sf3;
        layoutParams.leftMargin = sf;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(sf4, sf4);
        layoutParams2.leftMargin = sf2;
        layoutParams2.topMargin = sf3;
        this.mImgSound.setId(nac.sw);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        kj kjVar = new kj(getContext());
        this.mTextViewCountDown = kjVar;
        kjVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.sf());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, rj.sf(getContext(), 28.0f));
        layoutParams4.topMargin = sf3;
        layoutParams4.rightMargin = sf;
        this.mTextViewCountDown.setPadding(sf2, 0, sf2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        vj vjVar2 = new vj(getContext());
        this.mPlayableNextAd = vjVar2;
        vjVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, sf4);
        layoutParams5.topMargin = sf3;
        if (ofVar == null || !ofVar.jkt()) {
            layoutParams5.rightMargin = sf;
        } else {
            layoutParams5.rightMargin = rj.sf(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.sf());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new kj(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, rj.sf(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(sf2, 0, 0, 0);
        String tz = atb.tz(ofVar);
        if (TextUtils.isEmpty(tz)) {
            this.mNextAdTextTv.setText(tz.sf(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(tz);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        oo ooVar = new oo(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(sf2, sf2);
        layoutParams7.rightMargin = sf2;
        ooVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        ooVar.setLayoutParams(layoutParams7);
        ooVar.setImageResource(tz.oo(lu.pcc(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(ooVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(sf4, sf4);
        layoutParams8.topMargin = sf3;
        layoutParams8.rightMargin = sf;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        oo sf5 = wh.sf(getContext());
        this.mCloseBtn = sf5;
        sf5.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = sf3;
        layoutParams9.rightMargin = sf3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(tz.pcc(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        oo pcc = wh.pcc(getContext(), this.container);
        this.mCloseBackupBtn = pcc;
        pcc.setId(nac.st);
        this.mCloseBackupBtn.setContentDescription(tz.pcc(getContext(), "tt_close_backup_button_text"));
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(rj.sf(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(sf4, sf4);
            layoutParams10.topMargin = sf3;
            layoutParams10.rightMargin = sf;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.pcc("ring").pcc(this.mProgressSize).pcc(this.mProgressColor).sf(this.mProgressBgColor).sf(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(getContext());
        gmVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar = this.mProgressRing;
        if (pccVar != null) {
            gmVar.addView(pccVar);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.pcc("line").pcc(this.mProgressSize).pcc(this.mProgressColor).sf(this.mProgressBgColor).sf(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            gmVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(gmVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar2 = this.mProgressBar;
        if (pccVar2 != null) {
            addView(pccVar2);
        }
        addView(this.container);
    }

    private void updateTime(boolean z) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (z) {
            textView.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            textView.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public View getCloseBackupButton() {
        return this.mCloseBackupBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TopLayoutDislike2 load(@NonNull of ofVar) {
        boolean z;
        initProgressBar(ofVar);
        initView(ofVar);
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(tz.oo(lu.pcc(), "tt_reward_full_feedback"));
        if (!com.bytedance.sdk.openadsdk.core.settings.vh.sf().jr(String.valueOf(ofVar.kot())) || ofVar.bg() == 5 || ofVar.bg() == 6) {
            this.mSkipIV.setImageResource(tz.oo(lu.pcc(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(tz.oo(lu.pcc(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = ofVar.kez() == null ? 0 : ((int) ofVar.kez().d) * ofVar.kez().r;
        if (lo.oo(ofVar) && ofVar.yt() != null) {
            this.videoDuration = (int) ofVar.yt().sf();
        } else if (lo.kj(ofVar) && ofVar.yt() != null) {
            this.videoDuration = (int) ofVar.yt().oo();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (ofVar.hh() != 8 || ofVar.gqd() == null) {
            this.skipTime = ofVar.quq();
        } else {
            this.skipTime = ofVar.bm();
        }
        if (atb.gm(ofVar)) {
            this.skipTime = ofVar.ys();
            this.videoDuration = ofVar.jk();
        } else {
            int i = this.skipTime;
            if (i != -1 && i < this.videoDuration) {
                z = false;
                this.shouldShowSkipTime = z;
                if (ofVar.on()) {
                    this.mImgDislike.setVisibility(8);
                    this.isVast = true;
                }
                this.mTextViewCountDown.setVisibility(4);
                this.mTextViewCountDown.setText("");
                this.mTextViewCountDown.setEnabled(false);
                this.mTextViewCountDown.setClickable(false);
                initListener(ofVar);
                return this;
            }
        }
        z = true;
        this.shouldShowSkipTime = z;
        if (ofVar.on()) {
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener(ofVar);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        int i2 = this.mProgressType;
        if (i2 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar = this.mProgressRing;
            if (i < 0) {
                pccVar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            pccVar.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar2 = this.mProgressBar;
            if (i < 0) {
                pccVar2.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                pccVar2.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTextViewCountDown;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setListener(sf sfVar) {
        this.mTopListener = sfVar;
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowDislike(boolean z) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowEndCardNextAd(boolean z, of ofVar) {
        vj vjVar = this.mPlayableNextAd;
        if (vjVar != null) {
            vjVar.setVisibility(z ? 0 : 8);
            if (this.mNextAdTextTv == null || !z || ofVar == null || ofVar.nfv() == null) {
                return;
            }
            String gm = ofVar.nfv().gm();
            if (TextUtils.isEmpty(gm)) {
                return;
            }
            this.mNextAdTextTv.setText(gm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowPlayableNextAd(boolean z, of ofVar) {
        vj vjVar = this.mPlayableNextAd;
        if (vjVar != null) {
            vjVar.setVisibility(z ? 0 : 8);
            if (this.mNextAdTextTv == null || !z) {
                return;
            }
            String tz = atb.tz(ofVar);
            if (TextUtils.isEmpty(tz)) {
                this.mNextAdTextTv.setText(tz.sf(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(tz);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowSkip(boolean z) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        this.mSkipIV.setVisibility((z && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowSound(boolean z) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSkipEnable(boolean z) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSkipText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTextViewCountDown;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSoundMute(boolean z) {
        this.mIsSoundMute = z;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z ? tz.gm(getContext(), "tt_reward_full_mute") : tz.gm(getContext(), "tt_reward_full_unmute") : z ? vh.pcc(getContext(), "tt_mute_wrapper") : vh.pcc(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i = this.skipTime;
            int parseInt = i == 0 ? Integer.parseInt(str) : i - (this.videoDuration - Integer.parseInt(str));
            if (parseInt <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(parseInt + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar = this.mProgressRing;
        if (pccVar != null) {
            pccVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar2 = this.mProgressBar;
        if (pccVar2 != null) {
            pccVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar = this.mProgressRing;
        if (pccVar != null) {
            pccVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc pccVar2 = this.mProgressBar;
        if (pccVar2 != null) {
            pccVar2.setVisibility(8);
        }
    }

    public void clickDislike() {
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }
}
