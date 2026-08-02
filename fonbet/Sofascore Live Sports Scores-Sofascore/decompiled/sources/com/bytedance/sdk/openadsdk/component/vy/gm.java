package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm extends com.bytedance.sdk.openadsdk.core.wh.qf {
    com.bytedance.sdk.openadsdk.core.wh.oo gm;
    final qf kj;
    PAGLogoView oo;
    com.bytedance.sdk.openadsdk.core.wh.kj ork;
    com.bytedance.sdk.openadsdk.core.wh.oo pcc;
    com.bytedance.sdk.openadsdk.core.wh.kj qf;
    com.bytedance.sdk.openadsdk.core.wh.gm sf;
    com.bytedance.sdk.openadsdk.core.widget.gm tmg;
    com.bytedance.sdk.openadsdk.core.wh.kj vh;
    com.bytedance.sdk.openadsdk.core.wh.kj vj;
    nac vy;
    nac wh;

    public gm(Context context) {
        super(context);
        this.kj = new qf(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.wh.oo getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.oo;
    }

    public abstract com.bytedance.sdk.openadsdk.core.wh.kj getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.wh.oo getBackImage() {
        return this.pcc;
    }

    public com.bytedance.sdk.openadsdk.core.wh.kj getClickButton() {
        return this.vj;
    }

    public com.bytedance.sdk.openadsdk.core.wh.kj getContent() {
        return this.vh;
    }

    public com.bytedance.sdk.openadsdk.core.widget.gm getDspAdChoice() {
        return this.tmg;
    }

    public nac getHostAppIcon() {
        return this.wh;
    }

    public com.bytedance.sdk.openadsdk.core.wh.kj getHostAppName() {
        return this.qf;
    }

    public nac getIconOnlyView() {
        return this.vy;
    }

    public com.bytedance.sdk.openadsdk.core.wh.oo getImageView() {
        return this.gm;
    }

    public com.bytedance.sdk.openadsdk.core.wh.vj getOverlayLayout() {
        return null;
    }

    public abstract dax getScoreBar();

    public com.bytedance.sdk.openadsdk.core.wh.kj getTitle() {
        return this.ork;
    }

    public com.bytedance.sdk.openadsdk.core.wh.kj getTopCountDown() {
        qf qfVar = this.kj;
        if (qfVar != null) {
            return qfVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        qf qfVar = this.kj;
        if (qfVar != null) {
            return qfVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.wh.oo getTopSkip() {
        qf qfVar = this.kj;
        if (qfVar != null) {
            return qfVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.wh.gm getVideoContainer() {
        return this.sf;
    }
}
