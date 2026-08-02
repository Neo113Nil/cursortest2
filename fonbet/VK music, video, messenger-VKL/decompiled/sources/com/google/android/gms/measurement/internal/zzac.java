package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.ivz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new ivz0();

    @Nullable
    public String b;
    public String c;
    public zzkw d;
    public long e;
    public boolean f;

    @Nullable
    public String g;

    @Nullable
    public final zzaw h;
    public long i;

    @Nullable
    public zzaw j;
    public final long k;

    @Nullable
    public final zzaw l;

    public zzac(zzac zzacVar) {
        exc0.i(zzacVar);
        this.b = zzacVar.b;
        this.c = zzacVar.c;
        this.d = zzacVar.d;
        this.e = zzacVar.e;
        this.f = zzacVar.f;
        this.g = zzacVar.g;
        this.h = zzacVar.h;
        this.i = zzacVar.i;
        this.j = zzacVar.j;
        this.k = zzacVar.k;
        this.l = zzacVar.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.p(parcel, 4, this.d, i, false);
        long j = this.e;
        ozg0.v(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.p(parcel, 8, this.h, i, false);
        long j2 = this.i;
        ozg0.v(parcel, 9, 8);
        parcel.writeLong(j2);
        ozg0.p(parcel, 10, this.j, i, false);
        ozg0.v(parcel, 11, 8);
        parcel.writeLong(this.k);
        ozg0.p(parcel, 12, this.l, i, false);
        ozg0.x(w, parcel);
    }

    public zzac(@Nullable String str, String str2, zzkw zzkwVar, long j, boolean z, @Nullable String str3, @Nullable zzaw zzawVar, long j2, @Nullable zzaw zzawVar2, long j3, @Nullable zzaw zzawVar3) {
        this.b = str;
        this.c = str2;
        this.d = zzkwVar;
        this.e = j;
        this.f = z;
        this.g = str3;
        this.h = zzawVar;
        this.i = j2;
        this.j = zzawVar2;
        this.k = j3;
        this.l = zzawVar3;
    }
}
