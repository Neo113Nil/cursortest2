package com.bytedance.sdk.openadsdk.jr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.qf;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends qf {
    public sf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pcc(context);
    }

    private void pcc(Context context) {
        setId(nac.ln);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(getContext());
        ooVar.setId(nac.oyx);
        ooVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ooVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        ooVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        ooVar.setBackgroundColor(Color.parseColor("#7f000000"));
        ooVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(ooVar);
        qf qfVar = new qf(context);
        qfVar.setId(nac.eko);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        qfVar.setLayoutParams(layoutParams);
        addView(qfVar);
        int sf = rj.sf(context, 20.0f);
        kj kjVar = new kj(context);
        kjVar.setId(nac.ri);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.setMargins(sf, 0, sf, 0);
        kjVar.setLayoutParams(layoutParams2);
        kjVar.setMaxLines(2);
        kjVar.setMinHeight(rj.sf(context, 40.0f));
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        kjVar.setTextColor(-1);
        kjVar.setTextSize(2, 14.0f);
        kjVar.setBackground(vh.pcc(context, "tt_ad_cover_btn_begin_bg"));
        kjVar.setGravity(17);
        int sf2 = rj.sf(context, 10.0f);
        int sf3 = rj.sf(context, 2.0f);
        kjVar.setPadding(sf2, sf3, sf2, sf3);
        kjVar.setVisibility(8);
        qfVar.addView(kjVar);
    }

    public sf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sf(Context context) {
        this(context, null);
    }
}
