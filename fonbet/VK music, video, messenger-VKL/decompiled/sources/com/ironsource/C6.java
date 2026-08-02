package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public interface C6 {
    void a(Activity activity);

    void a(C4525r6 c4525r6);

    void a(C4525r6 c4525r6, IronSourceError ironSourceError);

    void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C4525r6 c4525r6, IronSourceError ironSourceError);

    void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
