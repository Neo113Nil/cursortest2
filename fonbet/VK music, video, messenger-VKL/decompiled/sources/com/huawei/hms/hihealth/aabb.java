package com.huawei.hms.hihealth;

import android.app.Activity;
import android.content.Intent;
import com.huawei.hms.health.aabz;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import xsna.c680;

/* loaded from: classes13.dex */
class aabb implements c680 {
    final /* synthetic */ HuaweiIdAuthService aab;
    final /* synthetic */ HiHealthKitClient aaba;

    public aabb(HiHealthKitClient hiHealthKitClient, HuaweiIdAuthService huaweiIdAuthService) {
        this.aaba = hiHealthKitClient;
        this.aab = huaweiIdAuthService;
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        Activity activity;
        aabz.aabb("HiHealthKitClient", "silentSignIn failed, begin sign in");
        Intent signInIntent = this.aab.getSignInIntent();
        activity = this.aaba.aabd;
        activity.startActivityForResult(signInIntent, 1);
    }
}
