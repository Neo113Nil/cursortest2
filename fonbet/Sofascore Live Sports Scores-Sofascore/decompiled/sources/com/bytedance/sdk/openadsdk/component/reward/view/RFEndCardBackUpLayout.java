package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.pcc.sf adContext;
    private PAGLogoView adLogo;
    private nac ivIcon;
    private boolean mInit;
    private dax rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.wh.kj tvDesc;
    private com.bytedance.sdk.openadsdk.core.wh.kj tvDownload;
    private TextView tvTitle;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.nac.xf);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.wh.kj kjVar, of ofVar) {
        if (kjVar == null) {
            return;
        }
        String lc = ofVar.lc();
        if (TextUtils.isEmpty(lc)) {
            return;
        }
        kjVar.setText(lc);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.wh.oo ooVar, of ofVar) {
        if (ooVar == null || ofVar.zk() == null || TextUtils.isEmpty(ofVar.zk().pcc())) {
            return;
        }
        com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(ofVar.zk(), ooVar, ofVar);
    }

    private void bindTitleData(TextView textView, of ofVar, String str) {
        if (textView != null) {
            if (ofVar.xfm() == null || TextUtils.isEmpty(ofVar.xfm().sf())) {
                textView.setText(str);
            } else {
                textView.setText(ofVar.xfm().sf());
            }
        }
    }

    private void initData(final of ofVar, com.bytedance.sdk.openadsdk.core.wh.kj kjVar) {
        setDownloadButtonData(kjVar, ofVar, -1);
        bindIconData(this.ivIcon, ofVar);
        dax daxVar = this.rbScore;
        if (daxVar != null) {
            rj.pcc((TextView) null, daxVar, ofVar);
            if (ofVar.xfm() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (ofVar.xfm() == null || TextUtils.isEmpty(ofVar.xfm().sf())) {
                boolean isEmpty = TextUtils.isEmpty(ofVar.ofe());
                TextView textView = this.tvTitle;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(ofVar.ofe());
                }
            } else {
                this.tvTitle.setText(ofVar.xfm().sf());
            }
        }
        if (this.tvDesc != null) {
            String gmh = ofVar.gmh();
            boolean isEmpty2 = TextUtils.isEmpty(gmh);
            com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = this.tvDesc;
            if (isEmpty2) {
                kjVar2.setVisibility(8);
            } else {
                kjVar2.setText(gmh);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                        IABLandingPageActivity.pcc(RFEndCardBackUpLayout.this.adContext.rnn, ofVar, RFEndCardBackUpLayout.this.adContext.vj);
                    } else {
                        TTWebsiteActivity.pcc(RFEndCardBackUpLayout.this.adContext.rnn, ofVar, RFEndCardBackUpLayout.this.adContext.vj);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(rj.sf(context, 16.0f), 0, rj.sf(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(vjVar, layoutParams);
        if (this.adContext.zsj == 2) {
            com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
            vjVar2.setOrientation(0);
            vjVar.addView(vjVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(vjVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(vjVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(vjVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.adContext;
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(sfVar.rnn, sfVar.sf);
        createPAGLogoViewByMaterial.setId(520093757);
        vjVar.addView(createPAGLogoViewByMaterial);
        createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                    IABLandingPageActivity.pcc(RFEndCardBackUpLayout.this.adContext.rnn, RFEndCardBackUpLayout.this.adContext.sf, RFEndCardBackUpLayout.this.adContext.vj);
                } else {
                    TTWebsiteActivity.pcc(RFEndCardBackUpLayout.this.adContext.rnn, RFEndCardBackUpLayout.this.adContext.sf, RFEndCardBackUpLayout.this.adContext.vj);
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.wh.vj vjVar) {
        of ofVar = this.adContext.sf;
        if (ofVar != null) {
            List<of> vj = ofVar.oo().vj();
            for (int i = 0; i < vj.size() && i < 3; i++) {
                initSingleCardInThreeCardStyle(vjVar, vj.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.wh.vj vjVar) {
        of ofVar = this.adContext.sf;
        if (ofVar != null) {
            List<of> vj = ofVar.oo().vj();
            for (int i = 0; i < vj.size() && i < 2; i++) {
                initSingleCardInTwoCardStyle(vjVar, vj.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.wh.vj vjVar, int i) {
        of ofVar = this.adContext.sf;
        if (ofVar != null) {
            List<of> vj = ofVar.oo().vj();
            for (int i2 = 0; i2 < vj.size() && i2 < i && i2 < 3; i2++) {
                initSingleCardInTwoCardStyleLandscape(vjVar, vj.get(i2), i2, i);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.wh.vj vjVar, of ofVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setOrientation(1);
        vjVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? rj.sf(context, 12.0f) : 0, 0, 0);
        vjVar2.setBackground(new pcc(context));
        vjVar.addView(vjVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar3.setOrientation(0);
        vjVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = rj.sf(context, 20.0f);
        layoutParams2.leftMargin = rj.sf(context, 17.0f);
        layoutParams2.rightMargin = rj.sf(context, 30.0f);
        vjVar2.addView(vjVar3, layoutParams2);
        nac nacVar = new nac(context);
        vjVar3.addView(nacVar, new FrameLayout.LayoutParams(rj.sf(context, 70.0f), rj.sf(context, 63.0f)));
        bindIconData(nacVar, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar4 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = rj.sf(context, 7.0f);
        vjVar3.addView(vjVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar.setEllipsize(truncateAt);
        kjVar.setTextSize(18.0f);
        kjVar.setTextColor(Color.parseColor("#161823"));
        kjVar.setGravity(8388611);
        kjVar.setTypeface(null, 1);
        vjVar4.addView(kjVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(kjVar, ofVar, ofVar.ofe());
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar2.setSingleLine(true);
        kjVar2.setEllipsize(truncateAt);
        kjVar2.setTextSize(16.0f);
        kjVar2.setTextColor(Color.parseColor("#80161823"));
        vjVar4.addView(kjVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(kjVar2, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar5 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar5.setOrientation(0);
        vjVar5.setGravity(16);
        vjVar4.addView(vjVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar3.setTextSize(16.0f);
        kjVar3.setTextColor(Color.parseColor("#80161823"));
        vjVar5.addView(kjVar3, new ViewGroup.LayoutParams(-2, -2));
        dax daxVar = new dax(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = rj.sf(context, 8.0f);
        vjVar5.addView(daxVar, layoutParams4);
        rj.pcc(kjVar3, daxVar, ofVar, 18);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar4.setGravity(17);
        kjVar4.setId(520093707);
        kjVar4.setText(tz.pcc(context, "tt_video_download_apk"));
        kjVar4.setTextColor(-1);
        kjVar4.setTextSize(2, 16.0f);
        kjVar4.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, rj.sf(context, 36.0f));
        layoutParams5.setMargins(rj.sf(context, 20.0f), rj.sf(context, 22.0f), rj.sf(context, 20.0f), rj.sf(context, 20.0f));
        vjVar2.addView(kjVar4, layoutParams5);
        setDownloadButtonData(kjVar4, ofVar, i);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.wh.vj vjVar, of ofVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setOrientation(1);
        vjVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? rj.sf(context, 12.0f) : 0, 0, 0);
        vjVar2.setBackground(new pcc(context));
        vjVar.addView(vjVar2, layoutParams);
        nac nacVar = new nac(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(rj.sf(context, 70.0f), rj.sf(context, 63.0f));
        layoutParams2.setMargins(0, rj.sf(context, 24.0f), 0, rj.sf(context, 12.0f));
        vjVar2.addView(nacVar, layoutParams2);
        bindIconData(nacVar, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar.setEllipsize(truncateAt);
        kjVar.setTextSize(18.0f);
        kjVar.setTextColor(Color.parseColor("#161823"));
        kjVar.setGravity(17);
        kjVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(rj.sf(context, 56.0f), 0, rj.sf(context, 56.0f), 0);
        vjVar2.addView(kjVar, layoutParams3);
        bindTitleData(kjVar, ofVar, ofVar.ofe());
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar2.setSingleLine(true);
        kjVar2.setEllipsize(truncateAt);
        kjVar2.setTextSize(16.0f);
        kjVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(rj.sf(context, 56.0f), rj.sf(context, 4.0f), rj.sf(context, 56.0f), 0);
        vjVar2.addView(kjVar2, layoutParams4);
        bindDescData(kjVar2, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar3.setOrientation(0);
        vjVar3.setGravity(16);
        vjVar2.addView(vjVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar3.setTextSize(16.0f);
        kjVar3.setTextColor(Color.parseColor("#80161823"));
        vjVar3.addView(kjVar3, new ViewGroup.LayoutParams(-2, -2));
        dax daxVar = new dax(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = rj.sf(context, 8.0f);
        vjVar3.addView(daxVar, layoutParams5);
        rj.pcc(kjVar3, daxVar, ofVar, 18);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar4.setGravity(17);
        kjVar4.setId(520093707);
        kjVar4.setText(tz.pcc(context, "tt_video_download_apk"));
        kjVar4.setTextColor(-1);
        kjVar4.setTextSize(2, 16.0f);
        kjVar4.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, rj.sf(context, 36.0f));
        layoutParams6.setMargins(rj.sf(context, 20.0f), rj.sf(context, 36.0f), rj.sf(context, 20.0f), rj.sf(context, 20.0f));
        vjVar2.addView(kjVar4, layoutParams6);
        setDownloadButtonData(kjVar4, ofVar, i);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.wh.vj vjVar, of ofVar, int i, int i2) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setOrientation(1);
        vjVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(rj.sf(context, 12.0f), 0, 0, 0);
        }
        vjVar2.setBackground(new pcc(context));
        vjVar.addView(vjVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar3.setOrientation(0);
        vjVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = rj.sf(context, 20.0f);
        layoutParams2.leftMargin = rj.sf(context, 17.0f);
        layoutParams2.rightMargin = rj.sf(context, 30.0f);
        vjVar2.addView(vjVar3, layoutParams2);
        nac nacVar = new nac(context);
        vjVar3.addView(nacVar, new FrameLayout.LayoutParams(rj.sf(context, 44.0f), rj.sf(context, 44.0f)));
        bindIconData(nacVar, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar4 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = rj.sf(context, 7.0f);
        vjVar3.addView(vjVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar.setEllipsize(truncateAt);
        kjVar.setTextSize(18.0f);
        kjVar.setTextColor(Color.parseColor("#161823"));
        kjVar.setGravity(8388611);
        kjVar.setTypeface(null, 1);
        vjVar4.addView(kjVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(kjVar, ofVar, ofVar.ofe());
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar5 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar5.setOrientation(0);
        vjVar5.setGravity(16);
        vjVar4.addView(vjVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar2.setTextSize(16.0f);
        kjVar2.setTextColor(Color.parseColor("#80161823"));
        vjVar5.addView(kjVar2, new ViewGroup.LayoutParams(-2, -2));
        dax daxVar = new dax(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = rj.sf(context, 8.0f);
        vjVar5.addView(daxVar, layoutParams4);
        rj.pcc(kjVar2, daxVar, ofVar, 18);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        if (i2 == 2) {
            kjVar3.setSingleLine(true);
        } else {
            kjVar3.setLines(2);
        }
        kjVar3.setEllipsize(truncateAt);
        kjVar3.setTextSize(16.0f);
        kjVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i3;
        layoutParams5.leftMargin = i3;
        layoutParams5.topMargin = rj.sf(context, 12.0f);
        vjVar2.addView(kjVar3, layoutParams5);
        bindDescData(kjVar3, ofVar);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar4.setGravity(17);
        kjVar4.setId(520093707);
        kjVar4.setText(tz.pcc(context, "tt_video_download_apk"));
        kjVar4.setTextColor(-1);
        kjVar4.setTextSize(2, 16.0f);
        kjVar4.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, rj.sf(context, 36.0f));
        layoutParams6.setMargins(rj.sf(context, 20.0f), rj.sf(context, 22.0f), rj.sf(context, 20.0f), rj.sf(context, 20.0f));
        vjVar2.addView(kjVar4, layoutParams6);
        setDownloadButtonData(kjVar4, ofVar, i);
    }

    private void initViews() {
        com.bytedance.sdk.openadsdk.core.model.pcc oo;
        List<of> vj;
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        boolean z = this.adContext.sf.xb() && (kjVar = this.adContext.ywp) != null && kjVar.rnn();
        if (z) {
            if (com.bytedance.sdk.openadsdk.core.hc.wh.pcc.gm.pcc()) {
                initViewsForUGen(true);
                return;
            } else if (this.shownAdCount > 1) {
                initOneSlotMultipleAdsLayout();
                return;
            }
        }
        of ofVar = this.adContext.sf;
        if (ofVar.on()) {
            initViewsForVast();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.hc.wh.pcc.gm.pcc()) {
            initViewsForUGen(false);
            return;
        }
        if (z && (oo = ofVar.oo()) != null && (vj = oo.vj()) != null && !vj.isEmpty()) {
            ofVar = vj.get(0);
        }
        initViewsDefault(ofVar);
        initData(ofVar, this.tvDownload);
    }

    private void initViewsDefault(of ofVar) {
        Context context = getContext();
        boolean z = ofVar.ial() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setGravity(1);
        vjVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(rj.sf(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int sf = rj.sf(context, 24.0f);
        layoutParams.rightMargin = sf;
        layoutParams.leftMargin = sf;
        addView(vjVar, layoutParams);
        nac nacVar = new nac(context);
        this.ivIcon = nacVar;
        nacVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(rj.sf(context, 80.0f), rj.sf(context, 80.0f));
        layoutParams2.bottomMargin = rj.sf(context, 12.0f);
        vjVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.tvTitle = kjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(rj.sf(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        vjVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.tvDesc = kjVar2;
        kjVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = rj.sf(context, 8.0f);
        vjVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new dax(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, rj.sf(context, 16.0f));
        layoutParams4.topMargin = rj.sf(context, 12.0f);
        this.rbScore.setVisibility(8);
        vjVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.tvDownload = kjVar3;
        kjVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(tz.pcc(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, rj.sf(context, 44.0f));
        layoutParams5.topMargin = rj.sf(context, 54.0f);
        vjVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, ofVar);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = rj.sf(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = rj.sf(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = rj.sf(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForUGen(boolean z) {
        addView(new com.bytedance.sdk.openadsdk.core.hc.wh.pcc.gm(this.adContext, z));
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(com.bytedance.sdk.openadsdk.utils.nac.ork);
        ooVar.setVisibility(8);
        addView(ooVar, new FrameLayout.LayoutParams(-1, -1));
        View qfVar = new com.bytedance.sdk.component.vy.qf(context, true, qf.gm.VAST_ENDCARD);
        qfVar.setVisibility(8);
        qfVar.setId(com.bytedance.sdk.openadsdk.utils.nac.vh);
        addView(qfVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.wh.kj kjVar, of ofVar, int i) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.gm.vj pcc2 = sfVar.jsj.pcc(sfVar, ofVar);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.adContext;
        pcc2.pcc(com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(sfVar2.rnn, sfVar2.vj));
        if (i != -1) {
            HashMap hashMap = new HashMap();
            int i2 = i + 1;
            hashMap.put("ad_show_order", Integer.valueOf(i2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i2);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            pcc2.pcc(hashMap);
        }
        kjVar.setOnClickListener(pcc2);
        kjVar.setOnTouchListener(pcc2);
        CharSequence bgf = ofVar.bgf();
        if (TextUtils.isEmpty(bgf)) {
            return;
        }
        kjVar.setText(bgf);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.adContext = sfVar;
        if (sfVar.sf.on()) {
            initViews();
        }
    }

    public void setShownAdCount(int i) {
        this.shownAdCount = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            initViews();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc extends Drawable {
        private final int gm;
        Path pcc = new Path();
        private final Drawable sf;

        public pcc(Context context) {
            this.sf = tz.gm(context, "tt_ad_bg_header_gradient");
            this.gm = rj.sf(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.clipPath(this.pcc);
            canvas.drawColor(-1);
            this.sf.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            float f = i3;
            this.sf.setBounds(i, i2, i3, (int) (((1.0f * f) / this.sf.getIntrinsicWidth()) * this.sf.getIntrinsicHeight()));
            this.pcc.reset();
            Path path = this.pcc;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, i4);
            int i5 = this.gm;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }
}
