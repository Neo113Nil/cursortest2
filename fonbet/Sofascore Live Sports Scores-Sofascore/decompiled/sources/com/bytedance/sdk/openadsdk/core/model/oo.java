package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {

    @NonNull
    private com.bytedance.sdk.openadsdk.core.gbb.oo pcc = new com.bytedance.sdk.openadsdk.core.gbb.oo();
    private Set<com.bytedance.sdk.openadsdk.core.gbb.ork> sf = new HashSet();

    public void pcc(com.bytedance.sdk.openadsdk.core.gbb.oo ooVar) {
        if (ooVar == null) {
            ooVar = new com.bytedance.sdk.openadsdk.core.gbb.oo();
        }
        this.pcc = ooVar;
    }

    public void sf(Set<com.bytedance.sdk.openadsdk.core.gbb.ork> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.sf.addAll(set);
    }

    @NonNull
    public com.bytedance.sdk.openadsdk.core.gbb.oo pcc() {
        return this.pcc;
    }

    public void pcc(Set<com.bytedance.sdk.openadsdk.core.gbb.ork> set) {
        this.sf = set;
    }

    public void pcc(of ofVar) {
        com.bytedance.sdk.openadsdk.core.gbb.oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(ofVar);
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.gbb.ork> sf() {
        return this.sf;
    }
}
