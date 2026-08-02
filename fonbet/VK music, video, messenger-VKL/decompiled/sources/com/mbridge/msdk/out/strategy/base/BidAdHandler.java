package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class BidAdHandler extends BaseAdHandler {
    protected IBidVideoAdStrategy componentBidVideoAdStrategy;
    protected IBidVideoAdStrategy legacyBidVideoAdStrategy;

    public BidAdHandler(String str, String str2) {
        super(str, str2);
    }

    public void clearVideoCache() {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.clearVideoCache();
        } else {
            this.legacyBidVideoAdStrategy.clearVideoCache();
        }
    }

    public String getCreativeIdWithUnitId() {
        return a.c().d() ? this.componentBidVideoAdStrategy.getCreativeIdWithUnitId() : this.legacyBidVideoAdStrategy.getCreativeIdWithUnitId();
    }

    public String getRequestId() {
        return a.c().d() ? this.componentBidVideoAdStrategy.getRequestId() : this.legacyBidVideoAdStrategy.getRequestId();
    }

    public boolean isBidReady() {
        return a.c().d() ? this.componentBidVideoAdStrategy.isBidReady() : this.legacyBidVideoAdStrategy.isBidReady();
    }

    public void loadFromBid(String str) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.loadFromBid(str);
        } else {
            this.legacyBidVideoAdStrategy.loadFromBid(str);
        }
    }

    public void playVideoMute(int i) {
        this.componentBidVideoAdStrategy.playVideoMute(i);
        this.legacyBidVideoAdStrategy.playVideoMute(i);
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.componentBidVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
        this.legacyBidVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        this.componentBidVideoAdStrategy.setExtraInfo(jSONObject);
        this.legacyBidVideoAdStrategy.setExtraInfo(jSONObject);
    }

    public void setIVRewardEnable(int i, int i2) {
        this.componentBidVideoAdStrategy.setIVRewardEnable(i, i2);
        this.legacyBidVideoAdStrategy.setIVRewardEnable(i, i2);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.componentBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        this.legacyBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
    }

    public void setRewardPlus(boolean z) {
        this.componentBidVideoAdStrategy.setRewardPlus(z);
        this.legacyBidVideoAdStrategy.setRewardPlus(z);
    }

    public void setRewardVideoListener(g gVar) {
        this.componentBidVideoAdStrategy.setRewardVideoListener(gVar);
        this.legacyBidVideoAdStrategy.setRewardVideoListener(gVar);
    }

    public void showFromBid() {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid();
        } else {
            this.legacyBidVideoAdStrategy.showFromBid();
        }
    }

    public BidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void setIVRewardEnable(int i, double d) {
        this.componentBidVideoAdStrategy.setIVRewardEnable(i, d);
        this.legacyBidVideoAdStrategy.setIVRewardEnable(i, d);
    }

    public void showFromBid(Activity activity) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity);
        }
    }

    public void showFromBid(String str) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(str);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(str);
        }
    }

    public void showFromBid(String str, String str2) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(str, str2);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(str, str2);
        }
    }

    public void showFromBid(Activity activity, String str) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity, str);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity, str);
        }
    }

    public void showFromBid(Activity activity, String str, String str2) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity, str, str2);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity, str, str2);
        }
    }
}
