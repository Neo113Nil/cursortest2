package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i, @Nullable String str);

    default void onInitFailed(int i, @Nullable String str, Map<String, Object> map) {
        onInitFailed(i, str);
    }

    void onInitSuccess();

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}
