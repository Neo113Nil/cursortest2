package com.huawei.hms.health;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.health.aacg;
import com.huawei.hms.hihealth.data.CommonRequest;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.iqa0;
import xsna.prl0;

/* loaded from: classes13.dex */
public class aacg {
    private static volatile aacg aab;
    private static volatile HealthKitApiInvoker aaba;

    public Task<List<String>> aab(String str) {
        aabz.aabb("AuthManagerImpl", "enter queryAuthInfoByAppId");
        return aacq.aab(new iqa0(2, new HealthKitApiInvoker(aaba), str));
    }

    public Task<List<String>> aaba(String str) {
        aabz.aabb("AuthManagerImpl", "enter queryAuthInfoByPkgName");
        return aacq.aab(new prl0(2, new HealthKitApiInvoker(aaba), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List aaba(HealthKitApiInvoker healthKitApiInvoker, String str) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("AuthController");
        healthKitApiInvoker.setInterfaceInvoked("queryAuthInfoByPkgName");
        healthKitApiInvoker.setRequestBody(str);
        return aacs.aab(aaci.aabc().aab(healthKitApiInvoker), String.class);
    }

    public Task<String> aab(final String str, final String str2) {
        aabz.aabb("AuthManagerImpl", "enter checkFingerprint");
        final HealthKitApiInvoker healthKitApiInvoker = new HealthKitApiInvoker(aaba);
        return aacq.aab(new Callable() { // from class: xsna.jcy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String aab2;
                aab2 = aacg.aab(HealthKitApiInvoker.this, str, str2);
                return aab2;
            }
        });
    }

    public static aacg aab() {
        if (aab == null) {
            synchronized (aacg.class) {
                try {
                    if (aab == null) {
                        aab = new aacg();
                        aaba = aaci.aabc().aaba();
                    }
                } finally {
                }
            }
        }
        return aab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String aab(HealthKitApiInvoker healthKitApiInvoker, String str, String str2) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("AuthController");
        healthKitApiInvoker.setInterfaceInvoked("checkFingerprint");
        CommonRequest commonRequest = new CommonRequest();
        commonRequest.setAppId(str);
        commonRequest.setPkgName(str2);
        healthKitApiInvoker.setRequestBody(aacs.aab(commonRequest));
        return aaci.aabc().aab(healthKitApiInvoker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List aab(HealthKitApiInvoker healthKitApiInvoker, String str) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("AuthController");
        healthKitApiInvoker.setInterfaceInvoked("queryAuthInfoByAppId");
        healthKitApiInvoker.setRequestBody(str);
        return aacs.aab(aaci.aabc().aab(healthKitApiInvoker), String.class);
    }
}
