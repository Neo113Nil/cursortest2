package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.hihealth.aabc;
import com.huawei.hms.hihealth.data.DataCollector;
import com.huawei.hms.hihealth.data.DataType;
import com.huawei.hms.hihealth.data.Record;
import java.util.List;

/* loaded from: classes13.dex */
public interface aabg extends IInterface {

    public static abstract class aab extends Binder implements aabg {

        /* renamed from: com.huawei.hms.hihealth.aabg$aab$aab, reason: collision with other inner class name */
        public static class C0159aab implements aabg {
            private IBinder aab;

            public C0159aab(IBinder iBinder) {
                this.aab = iBinder;
            }

            @Override // com.huawei.hms.hihealth.aabg
            public List<Record> aab(DataType dataType) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataType, 0);
                    this.aab.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Record.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aaba(DataCollector dataCollector) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataCollector, 0);
                    this.aab.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public List<Record> aabb() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    this.aab.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Record.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aab(DataCollector dataCollector) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataCollector, 0);
                    this.aab.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aaba(DataType dataType) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataType, 0);
                    this.aab.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aabb(DataType dataType) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataType, 0);
                    this.aab.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aab(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataType, 0);
                    obtain.writeStrongInterface(aabcVar);
                    obtain.writeStrongInterface(aabbVar);
                    this.aab.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aaba(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, dataType, 0);
                    obtain.writeStrongInterface(aabcVar);
                    obtain.writeStrongInterface(aabbVar);
                    this.aab.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aab(Record record) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(obtain, record, 0);
                    this.aab.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static aabg aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aabg)) ? new C0159aab(iBinder) : (aabg) queryLocalInterface;
        }
    }

    List<Record> aab(DataType dataType) throws RemoteException;

    void aab(DataCollector dataCollector) throws RemoteException;

    void aab(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException;

    void aab(Record record) throws RemoteException;

    void aaba(DataCollector dataCollector) throws RemoteException;

    void aaba(DataType dataType) throws RemoteException;

    void aaba(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException;

    List<Record> aabb() throws RemoteException;

    void aabb(DataType dataType) throws RemoteException;
}
