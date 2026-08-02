package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.hihealth.data.AppLangItem;
import com.huawei.hms.hihealth.data.ScopeLangItem;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public interface aabj extends IInterface {

    public static abstract class aab extends Binder implements aabj {

        /* renamed from: com.huawei.hms.hihealth.aabj$aab$aab, reason: collision with other inner class name */
        public static class C0162aab implements aabj {
            private IBinder aab;

            public C0162aab(IBinder iBinder) {
                this.aab = iBinder;
            }

            @Override // com.huawei.hms.hihealth.aabj
            public List<AppLangItem> aab(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.aab.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(AppLangItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public Map aaba(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    obtain.writeStringList(list);
                    this.aab.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            @Override // com.huawei.hms.hihealth.aabj
            public Map aab(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    obtain.writeStringList(list);
                    this.aab.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public void aab(String str, List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    this.aab.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public void aab(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    obtain.writeInt(z ? 1 : 0);
                    this.aab.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public ScopeLangItem aab(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.aab.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    ScopeLangItem createFromParcel = obtain2.readInt() != 0 ? ScopeLangItem.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public static aabj aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IConsentsControllerManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aabj)) ? new C0162aab(iBinder) : (aabj) queryLocalInterface;
        }
    }

    ScopeLangItem aab(String str, String str2) throws RemoteException;

    List<AppLangItem> aab(String str, int i) throws RemoteException;

    Map aab(List<String> list) throws RemoteException;

    void aab(String str, List<String> list) throws RemoteException;

    void aab(boolean z) throws RemoteException;

    Map aaba(List<String> list) throws RemoteException;
}
