package com.huawei.hms.health;

import xsna.c680;

/* loaded from: classes13.dex */
class aabc implements c680 {
    final /* synthetic */ aaba aab;

    public aabc(aaba aabaVar) {
        this.aab = aabaVar;
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        aabz.aabc("HealthKitAuthHubFragment", "can not get auth url");
        this.aab.aaba("");
    }
}
