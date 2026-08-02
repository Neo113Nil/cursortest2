package com.mbridge.msdk.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {
    private boolean P;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                String str = "";
                try {
                    int[] iArr = new int[2];
                    MBridgeClickMiniCardView.this.p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(c.n().d(), (float) iArr[1]));
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                }
                f.a().a((WebView) MBridgeClickMiniCardView.this.p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBridgeClickMiniCardView(Context context) {
        super(context);
        this.P = false;
    }

    private void setContentLayoutParams(View view) {
        int g = v0.g(this.a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((g * 0.7f) + 0.5f);
        layoutParams.height = (int) ((v0.f(this.a) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public String getURL() {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            r0 = rewardTemplateMode != null ? rewardTemplateMode.h() : null;
            if (!TextUtils.isEmpty(r0) && r0.contains(".zip")) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(r0);
                if (!TextUtils.isEmpty(h5ResAddress)) {
                    return h5ResAddress;
                }
            }
        }
        return r0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void j() {
        super.j();
        if (this.e) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            setContentLayoutParams(this.m);
            setClickable(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.e) {
            setContentLayoutParams(this.m);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i, int i2) {
        View findViewById = ((Activity) this.a).getWindow().findViewById(R.id.content);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i <= 0 || i2 <= 0 || i > width || i2 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.m.setLayoutParams(layoutParams);
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.P = true;
        resizeMiniCard(i3, i4);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v0.a(getContext(), i));
            gradientDrawable.setColor(-1);
            this.p.setBackground(gradientDrawable);
            this.p.setClipToOutline(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new a());
            e eVar = new e();
            eVar.a("type", 3);
            d.b().a("2000133", this.b, eVar);
        }
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = false;
    }
}
