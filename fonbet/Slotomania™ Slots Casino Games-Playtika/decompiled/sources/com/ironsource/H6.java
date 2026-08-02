package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes4.dex */
public interface H6 {
    void a();

    void a(Activity activity);

    void a(IronSourceError ironSourceError);

    void a(LevelPlayAdInfo levelPlayAdInfo);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    void c(IronSourceError ironSourceError);

    void c(LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
