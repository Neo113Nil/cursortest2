package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4597v6 {
    void a();

    void a(IronSourceError ironSourceError);

    void a(LevelPlayAdInfo levelPlayAdInfo);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    void c(IronSourceError ironSourceError);

    default void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
    }
}
