package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4508q6 {
    void a();

    void a(Activity activity, String str);

    void a(LevelPlayAdError levelPlayAdError);

    LevelPlayAdInfo b();

    InterfaceC4394k0 c();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
