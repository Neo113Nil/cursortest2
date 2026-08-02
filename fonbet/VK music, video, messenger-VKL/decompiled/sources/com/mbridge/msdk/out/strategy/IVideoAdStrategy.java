package com.mbridge.msdk.out.strategy;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.video.bt.module.orglistener.g;

/* loaded from: classes13.dex */
public interface IVideoAdStrategy extends IBaseVideoAdStrategy {
    void clearBitmapCache();

    boolean isReady();

    void load();

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void loadFormSelfFilling();

    void setIVRewardEnable(int i, double d);

    void setIVRewardEnable(int i, int i2);

    void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener);

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void setRewardPlus(boolean z);

    void setRewardVideoListener(g gVar);

    void show();

    void show(Activity activity);

    void show(Activity activity, String str);

    void show(Activity activity, String str, String str2);

    void show(String str);

    void show(String str, String str2);
}
