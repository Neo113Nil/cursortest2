package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4377w9 {
    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidFailedToShow(@NotNull IronSourceError ironSourceError);

    void onAdInstanceDidReward(@Nullable String str, int i);

    void onAdInstanceDidShow();
}
