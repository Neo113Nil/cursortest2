package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5342a;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f5343f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5344g;

    public /* synthetic */ x(IBinder iBinder, String str, int i5) {
        this.f5342a = i5;
        this.f5343f = iBinder;
        this.f5344g = str;
    }

    public Parcel N(Parcel parcel, int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5343f.transact(i5, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel O() {
        switch (this.f5342a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f5344g);
                return obtain;
            case 4:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f5344g);
                return obtain2;
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f5344g);
                return obtain3;
        }
    }

    public void P(Parcel parcel, int i5) {
        Parcel obtain;
        switch (this.f5342a) {
            case 0:
                obtain = Parcel.obtain();
                try {
                    this.f5343f.transact(i5, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f5343f.transact(i5, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void Q(Parcel parcel) {
        try {
            this.f5343f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel R() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5344g);
        return obtain;
    }

    public Parcel S(Parcel parcel, int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5343f.transact(i5, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void T(Parcel parcel, int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5343f.transact(i5, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5344g);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f5342a) {
        }
        return this.f5343f;
    }

    public void e(Parcel parcel, int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5343f.transact(i5, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel f(Parcel parcel, int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5343f.transact(i5, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }
}
