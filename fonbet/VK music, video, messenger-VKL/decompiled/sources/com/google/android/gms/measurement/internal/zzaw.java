package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.k001;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new k001();
    public final String b;
    public final zzau c;
    public final String d;
    public final long e;

    public zzaw(zzaw zzawVar, long j) {
        exc0.i(zzawVar);
        this.b = zzawVar.b;
        this.c = zzawVar.c;
        this.d = zzawVar.d;
        this.e = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder a = xe9.a("origin=", this.d, ",name=", this.b, ",params=");
        a.append(valueOf);
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k001.a(this, parcel, i);
    }

    public zzaw(String str, zzau zzauVar, String str2, long j) {
        this.b = str;
        this.c = zzauVar;
        this.d = str2;
        this.e = j;
    }
}
