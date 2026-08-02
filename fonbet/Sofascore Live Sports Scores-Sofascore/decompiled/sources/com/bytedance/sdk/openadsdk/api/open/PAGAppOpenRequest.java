package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int pcc;

    public int getTimeout() {
        return this.pcc;
    }

    public void setTimeout(int i) {
        this.pcc = i;
    }
}
