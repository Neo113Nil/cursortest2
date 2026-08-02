package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes13.dex */
public interface aabe extends IInterface {

    public static abstract class aab extends Binder implements aabe {

        /* renamed from: com.huawei.hms.hihealth.aabe$aab$aab, reason: collision with other inner class name */
        public static class C0158aab implements aabe {
            private IBinder aab;

            public C0158aab(IBinder iBinder) {
                this.aab = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }
        }

        public static aabe aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IAuthControllerManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aabe)) ? new C0158aab(iBinder) : (aabe) queryLocalInterface;
        }
    }
}
