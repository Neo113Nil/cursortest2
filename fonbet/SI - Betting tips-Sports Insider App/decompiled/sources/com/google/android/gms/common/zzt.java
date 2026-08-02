package com.google.android.gms.common;

import a3.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c6.l;
import c6.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j0;
import g6.k0;
import h8.b;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new a(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f4634a;

    /* renamed from: b, reason: collision with root package name */
    public final m f4635b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4636c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4637d;

    public zzt(String str, m mVar, boolean z5, boolean z7) {
        this.f4634a = str;
        this.f4635b = mVar;
        this.f4636c = z5;
        this.f4637d = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 1, this.f4634a, false);
        m mVar = this.f4635b;
        if (mVar == null) {
            w0.m("GoogleCertificatesQuery", "certificate binder is null");
            mVar = null;
        }
        b.I(parcel, 2, mVar);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4636c ? 1 : 0);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4637d ? 1 : 0);
        b.W(parcel, V);
    }

    public zzt(String str, IBinder iBinder, boolean z5, boolean z7) {
        k0 j0Var;
        this.f4634a = str;
        m mVar = null;
        if (iBinder != null) {
            try {
                int i5 = l.f3676g;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof k0) {
                    j0Var = (k0) queryLocalInterface;
                } else {
                    j0Var = new j0(iBinder, "com.google.android.gms.common.internal.ICertData", 4);
                }
                t6.a d10 = j0Var.d();
                byte[] bArr = d10 == null ? null : (byte[]) t6.b.W(d10);
                if (bArr != null) {
                    mVar = new m(bArr);
                } else {
                    w0.d("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                w0.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.f4635b = mVar;
        this.f4636c = z5;
        this.f4637d = z7;
    }
}
