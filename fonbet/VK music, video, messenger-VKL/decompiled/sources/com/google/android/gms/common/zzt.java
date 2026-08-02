package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.bq70;
import xsna.fr01;
import xsna.fs01;
import xsna.hh01;
import xsna.oq01;
import xsna.ozg0;
import xsna.vnv;
import xsna.yi01;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new oq01();
    public final String b;
    public final yi01 c;
    public final boolean d;
    public final boolean e;

    public zzt(String str, yi01 yi01Var, boolean z, boolean z2) {
        this.b = str;
        this.c = yi01Var;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        yi01 yi01Var = this.c;
        if (yi01Var == null) {
            yi01Var = null;
        }
        ozg0.h(parcel, 2, yi01Var);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.b = str;
        yi01 yi01Var = null;
        if (iBinder != null) {
            try {
                int i = hh01.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                vnv zzd = (queryLocalInterface instanceof fs01 ? (fs01) queryLocalInterface : new fr01(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) bq70.g(zzd);
                if (bArr != null) {
                    yi01Var = new yi01(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.c = yi01Var;
        this.d = z;
        this.e = z2;
    }
}
