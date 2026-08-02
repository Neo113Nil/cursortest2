package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGBiddingRequest {
    private PAGBannerSize pcc = null;
    private String sf = null;
    private String gm = null;

    public String getAdxId() {
        return this.gm;
    }

    public PAGBannerSize getBannerSize() {
        return this.pcc;
    }

    public String getSlotId() {
        return this.sf;
    }

    public void setAdxId(String str) {
        this.gm = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.pcc = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.sf = str;
    }
}
