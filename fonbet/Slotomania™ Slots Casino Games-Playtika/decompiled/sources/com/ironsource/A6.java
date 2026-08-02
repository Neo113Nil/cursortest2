package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes5.dex */
public interface A6 {
    void a(Activity activity);

    void a(C2594p6 c2594p6);

    void a(C2594p6 c2594p6, IronSourceError ironSourceError);

    void a(C2594p6 c2594p6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C2594p6 c2594p6, IronSourceError ironSourceError);

    void b(C2594p6 c2594p6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C2594p6 c2594p6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
