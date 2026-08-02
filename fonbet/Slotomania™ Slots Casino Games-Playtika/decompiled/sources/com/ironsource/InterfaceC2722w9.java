package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2722w9 {
    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidFailedToShow(IronSourceError ironSourceError);

    void onAdInstanceDidReward(String str, int i);

    void onAdInstanceDidShow();
}
