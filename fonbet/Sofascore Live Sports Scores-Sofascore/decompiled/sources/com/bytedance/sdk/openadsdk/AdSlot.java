package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jr;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.mwm;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private String dax;
    private int fum;
    private boolean gbb;
    private int gm;
    private String gpj;
    private boolean hc;
    private String jr;
    private int jsj;
    private String kj;
    private int lo;
    private String lu;
    private Map<String, Object> mk;
    private String nac;
    private int of;
    private float oo;
    private String ork;
    private String pcc;
    private boolean qf;
    private boolean qy;
    private int sf;
    private int tmg;
    private long tsz;
    private int tz;
    private String vh;
    private float vj;
    private int vy;
    private int wh;
    private int yt;

    private AdSlot() {
        this.hc = true;
        this.gbb = false;
        this.lo = 0;
        this.fum = 0;
        this.tz = 0;
        this.yt = 1;
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public int getAdCount() {
        return this.wh;
    }

    public String getAdId() {
        return this.dax;
    }

    public int getBannerType() {
        return this.yt;
    }

    public String getBidAdm() {
        return this.jr;
    }

    public int getCacheScene() {
        return this.jsj;
    }

    public long getCacheTime() {
        return this.tsz;
    }

    public String getCodeId() {
        return this.pcc;
    }

    public String getCreativeId() {
        return this.nac;
    }

    public int getDurationSlotType() {
        return this.of;
    }

    public float getExpressViewAcceptedHeight() {
        return this.vj;
    }

    public float getExpressViewAcceptedWidth() {
        return this.oo;
    }

    public String getExt() {
        return this.lu;
    }

    public int getImgAcceptedHeight() {
        return this.gm;
    }

    public int getImgAcceptedWidth() {
        return this.sf;
    }

    public int getIsRotateBanner() {
        return this.lo;
    }

    public String getMediaExtra() {
        return this.ork;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.mk;
    }

    public int getRewardAmount() {
        return this.vy;
    }

    public String getRewardName() {
        return this.kj;
    }

    public int getRotateOrder() {
        return this.tz;
    }

    public int getRotateTime() {
        return this.fum;
    }

    public String getUserData() {
        return this.gpj;
    }

    public String getUserID() {
        return this.vh;
    }

    public boolean isAutoPlay() {
        return this.hc;
    }

    public boolean isExpressAd() {
        return this.gbb;
    }

    public boolean isPreload() {
        return this.qy;
    }

    public boolean isSupportDeepLink() {
        return this.qf;
    }

    public void setAdCount(int i) {
        this.wh = i;
    }

    public void setCacheScene(int i) {
        this.jsj = i;
    }

    public void setCacheTime(long j) {
        this.tsz = j;
    }

    public void setDurationSlotType(int i) {
        this.of = i;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.oo = f;
        this.vj = f2;
    }

    public void setIsRotateBanner(int i) {
        this.lo = i;
    }

    public void setPreload(boolean z) {
        this.qy = z;
    }

    public void setRotateOrder(int i) {
        this.tz = i;
    }

    public void setRotateTime(int i) {
        this.fum = i;
    }

    public void setUserData(String str) {
        this.gpj = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.pcc);
            jSONObject.put("mAdCount", this.wh);
            jSONObject.put("mIsAutoPlay", this.hc);
            jSONObject.put("mImgAcceptedWidth", this.sf);
            jSONObject.put("mImgAcceptedHeight", this.gm);
            jSONObject.put("mExpressViewAcceptedWidth", this.oo);
            jSONObject.put("mExpressViewAcceptedHeight", this.vj);
            jSONObject.put("mSupportDeepLink", this.qf);
            jSONObject.put("mRewardName", this.kj);
            jSONObject.put("mRewardAmount", this.vy);
            jSONObject.put("mMediaExtra", this.ork);
            jSONObject.put("mUserID", this.vh);
            jSONObject.put("mNativeAdType", this.tmg);
            jSONObject.put("mIsExpressAd", this.gbb);
            jSONObject.put("mAdId", this.dax);
            jSONObject.put("mCreativeId", this.nac);
            jSONObject.put("mExt", this.lu);
            jSONObject.put("mBidAdm", this.jr);
            jSONObject.put("mUserData", this.gpj);
            jSONObject.put("mDurationSlotType", this.of);
            jSONObject.put("mBannerType", this.yt);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        private String dax;
        private int fum;
        private String gbb;
        private boolean hc;
        private String jr;
        private String kj;
        private String lu;
        private String nac;
        private int ork;
        private String pcc;
        private float tmg;
        private float vh;
        private int sf = 640;
        private int gm = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean oo = true;
        private int vj = 1;
        private final String wh = "";
        private final int qf = 0;
        private String vy = "defaultUser";
        private boolean gpj = true;
        private Map<String, Object> lo = null;
        private int tz = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.pcc = this.pcc;
            adSlot.wh = this.vj;
            adSlot.qf = true;
            adSlot.sf = this.sf;
            adSlot.gm = this.gm;
            float f = this.vh;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                adSlot.oo = this.sf;
                adSlot.vj = this.gm;
            } else {
                adSlot.oo = f;
                adSlot.vj = this.tmg;
            }
            adSlot.kj = "";
            adSlot.vy = 0;
            adSlot.ork = this.kj;
            adSlot.vh = this.vy;
            adSlot.tmg = this.ork;
            adSlot.hc = this.gpj;
            adSlot.gbb = this.hc;
            adSlot.jr = this.gbb;
            adSlot.dax = this.jr;
            adSlot.nac = this.dax;
            adSlot.lu = this.nac;
            adSlot.gpj = this.lu;
            adSlot.mk = this.lo;
            adSlot.of = this.fum;
            adSlot.yt = this.tz;
            return adSlot;
        }

        public Builder isExpressAd(boolean z) {
            this.hc = z;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.vj = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.jr = str;
            return this;
        }

        public Builder setBannerType(int i) {
            this.tz = i;
            return this;
        }

        public Builder setCodeId(String str) {
            this.pcc = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.dax = str;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.fum = i;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.vh = f;
            this.tmg = f2;
            return this;
        }

        public Builder setExt(String str) {
            this.nac = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.sf = i;
            this.gm = i2;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.gpj = z;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.kj = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.ork = i;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.lo = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.lu = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.vy = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (jr.gm()) {
                mwm.a(str);
            }
            this.gbb = str;
            return this;
        }

        public Builder setRewardAmount(int i) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z) {
            return this;
        }
    }
}
