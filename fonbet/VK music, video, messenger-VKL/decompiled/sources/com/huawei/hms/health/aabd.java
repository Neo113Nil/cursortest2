package com.huawei.hms.health;

import xsna.cc80;

/* loaded from: classes13.dex */
class aabd implements cc80<String> {
    final /* synthetic */ aaba aab;

    public aabd(aaba aabaVar) {
        this.aab = aabaVar;
    }

    @Override // xsna.cc80
    public void onSuccess(String str) {
        aabz.aabb("HealthKitAuthHubFragment", "get auth url success");
        this.aab.aaba(str);
    }
}
