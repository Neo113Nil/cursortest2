package com.huawei.hms.health;

import android.os.RemoteException;
import com.huawei.hms.health.aace;
import com.huawei.hms.hihealth.data.SamplePoint;
import com.huawei.hms.hihealth.options.OnActivityRecordListener;
import com.huawei.hms.hihealth.options.aab;
import java.util.List;

/* loaded from: classes13.dex */
class aacf extends aab.AbstractBinderC0166aab {
    final /* synthetic */ aace.aaba aab;

    public aacf(aace.aaba aabaVar) {
        this.aab = aabaVar;
    }

    @Override // com.huawei.hms.hihealth.options.aab
    public void onReceive(List<SamplePoint> list) throws RemoteException {
        OnActivityRecordListener onActivityRecordListener;
        onActivityRecordListener = this.aab.aabb;
        onActivityRecordListener.onReceive(list);
    }

    @Override // com.huawei.hms.hihealth.options.aab
    public void onStatusChange(int i) throws RemoteException {
        OnActivityRecordListener onActivityRecordListener;
        onActivityRecordListener = this.aab.aabb;
        onActivityRecordListener.onStatusChange(i);
    }
}
