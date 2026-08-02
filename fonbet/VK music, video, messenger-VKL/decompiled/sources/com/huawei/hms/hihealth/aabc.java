package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.hihealth.data.ActivityRecord;
import com.huawei.hms.hihealth.data.ComponentInfo;

/* loaded from: classes13.dex */
public interface aabc extends IInterface {

    public static abstract class aab extends Binder implements aabc {

        /* renamed from: com.huawei.hms.hihealth.aabc$aab$aab, reason: collision with other inner class name */
        public static class C0157aab implements aabc {
            private IBinder aab;

            public C0157aab(IBinder iBinder) {
                this.aab = iBinder;
            }

            @Override // com.huawei.hms.hihealth.aabc
            public void aab(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
                    obtain.writeString(str);
                    this.aab.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabc
            public ComponentInfo aabe() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
                    this.aab.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    ComponentInfo createFromParcel = obtain2.readInt() != 0 ? ComponentInfo.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            @Override // com.huawei.hms.hihealth.aabc
            public void aab(ActivityRecord activityRecord, ComponentInfo componentInfo, com.huawei.hms.hihealth.options.aab aabVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
                    if (activityRecord != null) {
                        obtain.writeInt(1);
                        activityRecord.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (componentInfo != null) {
                        obtain.writeInt(1);
                        componentInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(aabVar);
                    this.aab.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public static aabc aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aabc)) ? new C0157aab(iBinder) : (aabc) queryLocalInterface;
        }
    }

    public static class aaba {
        public static /* synthetic */ void aab(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    void aab(ActivityRecord activityRecord, ComponentInfo componentInfo, com.huawei.hms.hihealth.options.aab aabVar) throws RemoteException;

    void aab(String str) throws RemoteException;

    ComponentInfo aabe() throws RemoteException;
}
