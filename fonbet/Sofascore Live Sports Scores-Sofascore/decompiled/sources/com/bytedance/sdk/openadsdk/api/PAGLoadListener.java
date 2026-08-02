package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface PAGLoadListener<Ad> extends qf {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.qf
    void onError(int i, String str);
}
