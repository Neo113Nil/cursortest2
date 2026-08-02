package com.huawei.hms.health;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.HealthRecordDeleteOptions;
import com.huawei.hms.hihealth.options.HealthRecordInsertOptions;
import com.huawei.hms.hihealth.options.HealthRecordReadOptions;
import com.huawei.hms.hihealth.options.HealthRecordUpdateOptions;
import com.huawei.hms.hihealth.result.HealthRecordResult;
import java.lang.reflect.Type;
import xsna.eh40;
import xsna.jls0;
import xsna.qsg0;
import xsna.yxo;

/* loaded from: classes13.dex */
public class aacm {
    private static volatile aacm aab;
    private static volatile HealthKitApiInvoker aaba;

    public Task<Void> aab(HealthRecordDeleteOptions healthRecordDeleteOptions) {
        return aacq.aab(new eh40(2, new HealthKitApiInvoker(aaba), healthRecordDeleteOptions));
    }

    public Task<String> aab(HealthRecordInsertOptions healthRecordInsertOptions) {
        return aacq.aab(new jls0(1, new HealthKitApiInvoker(aaba), healthRecordInsertOptions));
    }

    public Task<HealthRecordResult> aab(HealthRecordReadOptions healthRecordReadOptions) {
        return aacq.aab(new yxo(2, new HealthKitApiInvoker(aaba), healthRecordReadOptions));
    }

    public Task<Void> aab(HealthRecordUpdateOptions healthRecordUpdateOptions) {
        return aacq.aab(new qsg0(2, new HealthKitApiInvoker(aaba), healthRecordUpdateOptions));
    }

    public static aacm aab() {
        if (aab == null) {
            synchronized (aacm.class) {
                try {
                    if (aab == null) {
                        aab = new aacm();
                        aaba = aaci.aabc().aaba();
                    }
                } finally {
                }
            }
        }
        return aab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HealthRecordResult aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordReadOptions healthRecordReadOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("getHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordReadOptions));
        return (HealthRecordResult) aacs.aab(aaci.aabc().aaba(healthKitApiInvoker), (Type) HealthRecordResult.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordInsertOptions healthRecordInsertOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("addHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordInsertOptions));
        return aaci.aabc().aab(healthKitApiInvoker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordDeleteOptions healthRecordDeleteOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("deleteHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordDeleteOptions));
        aaci.aabc().aab(healthKitApiInvoker);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void aab(HealthKitApiInvoker healthKitApiInvoker, HealthRecordUpdateOptions healthRecordUpdateOptions) throws Exception {
        healthKitApiInvoker.setInterfaceProvider("HealthRecordsController");
        healthKitApiInvoker.setInterfaceInvoked("updateHealthRecord");
        healthKitApiInvoker.setRequestBody(aacs.aab(healthRecordUpdateOptions));
        aaci.aabc().aab(healthKitApiInvoker);
        return null;
    }
}
