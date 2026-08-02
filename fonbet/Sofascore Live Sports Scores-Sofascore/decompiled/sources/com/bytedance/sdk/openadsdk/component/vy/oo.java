package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import com.unity3d.services.UnityAdsConstants;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends gm {
    private final com.bytedance.sdk.openadsdk.core.wh.oo dax;
    private final dax gbb;
    private final com.bytedance.sdk.openadsdk.core.wh.gm hc;
    private final com.bytedance.sdk.openadsdk.core.wh.kj jr;
    private final com.bytedance.sdk.openadsdk.core.wh.vj nac;

    public oo(Context context, of ofVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int sf = rj.sf(context, 8.0f);
        int sf2 = rj.sf(context, 9.0f);
        int sf3 = rj.sf(context, 10.0f);
        int sf4 = rj.sf(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.gm gmVar = new com.bytedance.sdk.openadsdk.core.widget.gm(context);
        this.tmg = gmVar;
        gmVar.setPadding(sf2, 0, sf2, 0);
        this.tmg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(rj.sf(context, 32.0f), rj.sf(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, sf3, sf3);
        this.tmg.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        this.hc = gmVar2;
        gmVar2.setBackgroundColor(-1);
        gmVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, rj.sf(context, 107.0f));
        layoutParams2.addRule(12);
        gmVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(0);
        vjVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        vjVar.setLayoutParams(layoutParams3);
        gmVar2.addView(vjVar);
        nac nacVar = new nac(context);
        this.wh = nacVar;
        nacVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(sf4, sf4);
        layoutParams4.rightMargin = sf;
        layoutParams4.setMarginEnd(sf);
        this.wh.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.qf = kjVar;
        kjVar.setId(520093761);
        this.qf.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = this.qf;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kjVar2.setEllipsize(truncateAt);
        this.qf.setMaxLines(2);
        this.qf.setTextColor(Color.parseColor("#161823"));
        this.qf.setTextSize(30.0f);
        vjVar.addView(this.wh);
        vjVar.addView(this.qf);
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, gmVar2.getId());
        layoutParams5.addRule(10);
        gmVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.pcc = ooVar;
        ooVar.setId(520093754);
        this.pcc.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gmVar3.addView(this.pcc, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar4 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        this.sf = gmVar4;
        gmVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        gmVar3.addView(this.sf, layoutParams6);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.gm = ooVar2;
        ooVar2.setId(520093756);
        gmVar3.addView(this.gm, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vj = kjVar3;
        kjVar3.setId(520093717);
        this.vj.setBackground(vh.pcc(context, Color.parseColor("#b3000000"), 24));
        this.vj.setEllipsize(truncateAt);
        this.vj.setGravity(17);
        this.vj.setSingleLine(true);
        this.vj.setText(tz.pcc(context, "tt_video_download_apk"));
        this.vj.setTextColor(-1);
        this.vj.setTextSize(1, 16.0f);
        this.vj.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(rj.sf(context, 236.0f), rj.sf(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = rj.sf(context, 32.0f);
        gmVar3.addView(this.vj, layoutParams7);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        this.nac = vjVar2;
        vjVar2.setOrientation(0);
        vjVar2.setGravity(16);
        vjVar2.setBackground(new pcc(context));
        vjVar2.setPadding(rj.sf(context, 16.0f), rj.sf(context, 8.0f), rj.sf(context, 16.0f), rj.sf(context, 8.0f));
        RelativeLayout.LayoutParams c = w1l.c(-2, -2, 10);
        c.topMargin = rj.sf(context, 90.0f);
        vjVar2.setLayoutParams(c);
        nac nacVar2 = new nac(context);
        this.dax = nacVar2;
        vjVar2.addView(nacVar2, new LinearLayout.LayoutParams(rj.sf(context, 36.0f), rj.sf(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar3 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.leftMargin = rj.sf(context, 8.0f);
        vjVar2.addView(vjVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar4 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.jr = kjVar4;
        kjVar4.setTextColor(-1);
        vjVar3.addView(kjVar4, new LinearLayout.LayoutParams(-2, -2));
        dax daxVar = new dax(context, true);
        this.gbb = daxVar;
        vjVar3.addView(daxVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, ofVar);
        this.oo = createPAGLogoViewByMaterial;
        createPAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams9.gravity = 83;
        gmVar3.addView(this.oo, layoutParams9);
        addView(gmVar3);
        addView(this.tmg);
        addView(gmVar2);
        addView(this.kj);
        addView(vjVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.oo getAdIconView() {
        return this.dax;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.kj getAdTitleTextView() {
        return this.jr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.vj getOverlayLayout() {
        return this.nac;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public dax getScoreBar() {
        return this.gbb;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public View getUserInfo() {
        return this.hc;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc extends Drawable {
        private static final int vj = Color.parseColor("#b0000000");
        private static final int wh = Color.parseColor("#40000000");
        private final boolean oo;
        private final RectF pcc = new RectF();
        private final Paint sf = new Paint();
        private final Path gm = new Path();

        public pcc(Context context) {
            this.oo = com.bytedance.sdk.component.adexpress.oo.sf.pcc(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.drawPath(this.gm, this.sf);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(@NonNull Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.pcc.set(rect);
            this.gm.reset();
            int height = rect.height() / 2;
            Path path = this.gm;
            RectF rectF = this.pcc;
            if (this.oo) {
                float f = height;
                fArr = new float[]{f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f};
            } else {
                float f2 = height;
                fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f3 = rect.right;
            boolean z = this.oo;
            this.sf.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{z ? wh : vj, z ? vj : wh}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }
}
