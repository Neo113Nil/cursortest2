package com.bytedance.sdk.component.adexpress.dynamic.oo;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.mz1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    public static final Map<String, Integer> pcc;
    private String gm;
    private wh oo;
    private String sf;
    private wh vj;
    private String wh;

    static {
        HashMap hashMap = new HashMap();
        pcc = hashMap;
        hashMap.put("root", 8);
        hashMap.put("footer", 6);
        hashMap.put("empty", 6);
        hashMap.put("title", 0);
        hashMap.put("subtitle", 0);
        hashMap.put("source", 0);
        hashMap.put("score-count", 0);
        hashMap.put("text_star", 0);
        hashMap.put("text", 0);
        hashMap.put("tag-group", 17);
        hashMap.put("app-version", 0);
        hashMap.put("development-name", 0);
        hashMap.put("privacy-detail", 23);
        hashMap.put("image", 1);
        hashMap.put("image-wide", 1);
        hashMap.put("image-square", 1);
        hashMap.put("image-long", 1);
        hashMap.put("image-splash", 1);
        hashMap.put("image-cover", 1);
        hashMap.put("app-icon", 1);
        hashMap.put("icon-download", 1);
        hashMap.put("logoad", 4);
        hashMap.put("logounion", 5);
        hashMap.put("logo-union", 9);
        hashMap.put("dislike", 3);
        hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 3);
        hashMap.put("close-fill", 3);
        hashMap.put("webview-close", 22);
        hashMap.put("feedback-dislike", 12);
        hashMap.put("button", 2);
        hashMap.put("downloadWithIcon", 2);
        hashMap.put("downloadButton", 2);
        hashMap.put("fillButton", 2);
        hashMap.put("laceButton", 2);
        hashMap.put("cardButton", 2);
        hashMap.put("colourMixtureButton", 2);
        hashMap.put("arrowButton", 1);
        hashMap.put("download-progress-button", 2);
        hashMap.put("vessel", 6);
        hashMap.put("image-group", 6);
        hashMap.put("custom-component-vessel", 6);
        hashMap.put("carousel", 24);
        hashMap.put("carousel-vessel", 26);
        hashMap.put("leisure-interact", 25);
        hashMap.put("video-hd", 7);
        hashMap.put("video", 7);
        hashMap.put("video-vd", 7);
        hashMap.put("video-sq", 7);
        hashMap.put("muted", 10);
        hashMap.put("star", 11);
        hashMap.put("skip-countdowns", 19);
        hashMap.put("skip-with-countdowns-skip-btn", 21);
        hashMap.put("skip-with-countdowns-video-countdown", 13);
        hashMap.put("skip-with-countdowns-skip-countdown", 20);
        hashMap.put("skip-with-time", 14);
        hashMap.put("skip-with-time-countdown", 13);
        hashMap.put("skip-with-time-skip-btn", 15);
        hashMap.put("skip", 27);
        hashMap.put("timedown", 13);
        hashMap.put("icon", 16);
        hashMap.put("scoreCountWithIcon", 6);
        hashMap.put("split-line", 18);
        hashMap.put("creative-playable-bait", 0);
        hashMap.put("score-count-type-2", 0);
        hashMap.put("lottie", 28);
    }

    public String gm() {
        return this.gm;
    }

    public String oo() {
        return this.wh;
    }

    public int pcc() {
        if (TextUtils.isEmpty(this.sf)) {
            return 0;
        }
        if (this.sf.equals("logo")) {
            String str = this.sf + this.gm;
            this.sf = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.sf.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = pcc;
        if (map.get(this.sf) != null) {
            return map.get(this.sf).intValue();
        }
        return -1;
    }

    public wh qf() {
        return this.vj;
    }

    public String sf() {
        return this.sf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutBrick{type='");
        sb.append(this.sf);
        sb.append("', data='");
        sb.append(this.gm);
        sb.append("', value=");
        sb.append(this.oo);
        sb.append(", themeValue=");
        sb.append(this.vj);
        sb.append(", dataExtraInfo='");
        return mz1.o(sb, this.wh, "'}");
    }

    public wh vj() {
        return this.oo;
    }

    public int wh() {
        return this.oo.qc();
    }

    public void gm(String str) {
        this.wh = str;
    }

    public void sf(String str) {
        this.gm = str;
    }

    public void sf(wh whVar) {
        this.vj = whVar;
    }

    public void pcc(String str) {
        this.sf = str;
    }

    public void pcc(wh whVar) {
        this.oo = whVar;
    }
}
