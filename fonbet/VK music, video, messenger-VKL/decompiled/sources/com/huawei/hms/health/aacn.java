package com.huawei.hms.health;

import com.huawei.hms.health.aaco;
import com.huawei.hms.hihealth.HiHealthKitClient;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class aacn<R extends aaco> implements HiHealthKitClient.aabg {
    private WeakReference<R> aab;

    public aacn(WeakReference<R> weakReference) {
        this.aab = weakReference;
    }

    public void aab() {
        WeakReference<R> weakReference = this.aab;
        if (weakReference == null) {
            aabz.aab("HealthServiceDisconnectedListener", "mWeakReference is null");
            return;
        }
        R r = weakReference.get();
        if (r != null) {
            aack aackVar = (aack) r;
            aackVar.aab((com.huawei.hms.hihealth.aabl) null);
            aackVar.aab((com.huawei.hms.hihealth.aabc) null);
            aackVar.aab((com.huawei.hms.hihealth.aabg) null);
            aackVar.aab((com.huawei.hms.hihealth.aabp) null);
            aackVar.aab((com.huawei.hms.hihealth.aabe) null);
            aackVar.aab((com.huawei.hms.hihealth.aabj) null);
            aackVar.aab((com.huawei.hms.hihealth.aabn) null);
            aackVar.aab((com.huawei.hms.hihealth.aabi) null);
            aabz.aabb("ControllerImpl", "clearBinder");
        }
    }
}
