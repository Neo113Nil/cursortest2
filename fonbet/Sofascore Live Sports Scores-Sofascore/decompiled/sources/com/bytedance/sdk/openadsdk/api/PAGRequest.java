package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGRequest {
    private Bundle gm = null;
    private String pcc;
    private Map<String, Object> sf;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        Bundle bundle2 = this.gm;
        if (bundle2 == null) {
            bundle2 = new Bundle();
            this.gm = bundle2;
        }
        bundle2.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.pcc;
    }

    public Map<String, Object> getExtraInfo() {
        return this.sf;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.gm;
    }

    public void setAdString(String str) {
        this.pcc = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.sf = map;
    }
}
