package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.bq70;
import xsna.e701;
import xsna.h201;
import xsna.o100;
import xsna.okw;
import xsna.ozg0;
import xsna.stz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    public final String b;
    public final String c;

    @Nullable
    public final e701 d;

    @Nullable
    public final NotificationOptions e;
    public final boolean f;
    public final boolean g;
    public static final o100 h = new o100("CastMediaOptions", null);

    @NonNull
    public static final Parcelable.Creator<CastMediaOptions> CREATOR = new stz0();

    public CastMediaOptions(String str, String str2, @Nullable IBinder iBinder, @Nullable NotificationOptions notificationOptions, boolean z, boolean z2) {
        e701 h201Var;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            h201Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            h201Var = queryLocalInterface instanceof e701 ? (e701) queryLocalInterface : new h201(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
        }
        this.d = h201Var;
        this.e = notificationOptions;
        this.f = z;
        this.g = z2;
    }

    @Nullable
    public final okw i() {
        e701 e701Var = this.d;
        if (e701Var == null) {
            return null;
        }
        try {
            return (okw) bq70.g(e701Var.zzf());
        } catch (RemoteException unused) {
            h.b("Unable to call %s on %s.", "getWrappedClientObject", e701.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        e701 e701Var = this.d;
        ozg0.h(parcel, 4, e701Var == null ? null : e701Var.asBinder());
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
