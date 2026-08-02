package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes13.dex */
public interface aabn extends IInterface {

    public static abstract class aab extends Binder implements aabn {

        /* renamed from: com.huawei.hms.hihealth.aabn$aab$aab, reason: collision with other inner class name */
        public static class C0164aab implements aabn {
            private IBinder aab;

            public C0164aab(IBinder iBinder) {
                this.aab = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }
        }

        public static aabn aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IHealthRecordsControllerManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aabn)) ? new C0164aab(iBinder) : (aabn) queryLocalInterface;
        }
    }
}
