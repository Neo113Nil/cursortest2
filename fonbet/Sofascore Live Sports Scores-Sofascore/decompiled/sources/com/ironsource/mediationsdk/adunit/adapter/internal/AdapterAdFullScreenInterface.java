package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface AdapterAdFullScreenInterface<Listener extends AdapterAdListener> {
    void destroyAd(@NotNull AdData adData);

    boolean isAdAvailable(@NotNull AdData adData);

    void loadAd(@NotNull AdData adData, @NotNull Context context, @NotNull Listener listener);

    void showAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull Listener listener);
}
