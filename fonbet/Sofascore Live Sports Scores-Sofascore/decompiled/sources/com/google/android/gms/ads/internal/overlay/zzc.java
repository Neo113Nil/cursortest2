package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public final String zzb;

    @SafeParcelable.Field
    public final String zzc;

    @SafeParcelable.Field
    public final String zzd;

    @SafeParcelable.Field
    public final String zze;

    @SafeParcelable.Field
    public final String zzf;

    @SafeParcelable.Field
    public final String zzg;

    @SafeParcelable.Field
    public final Intent zzh;

    @SafeParcelable.Field
    public final zzaa zzi;

    @SafeParcelable.Field
    public final boolean zzj;

    @SafeParcelable.Field
    public final Bundle zzk;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param Intent intent, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z, @SafeParcelable.Param Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzaa) ObjectWrapper.Z1(IObjectWrapper.Stub.S1(iBinder));
        this.zzj = z;
        this.zzk = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, str, false);
        SafeParcelWriter.m(parcel, 3, this.zzb, false);
        SafeParcelWriter.m(parcel, 4, this.zzc, false);
        SafeParcelWriter.m(parcel, 5, this.zzd, false);
        SafeParcelWriter.m(parcel, 6, this.zze, false);
        SafeParcelWriter.m(parcel, 7, this.zzf, false);
        SafeParcelWriter.m(parcel, 8, this.zzg, false);
        SafeParcelWriter.l(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.f(parcel, 10, new ObjectWrapper(this.zzi));
        boolean z = this.zzj;
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.b(parcel, 12, this.zzk);
        SafeParcelWriter.t(parcel, s);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new ObjectWrapper(zzaaVar), false, new Bundle());
    }

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, new ObjectWrapper(zzaaVar), false, new Bundle());
    }
}
