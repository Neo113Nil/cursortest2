package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    @SafeParcelable.Field
    public final int zza;

    @SafeParcelable.Field
    public final int zzb;

    @SafeParcelable.Field
    public final String zzc;

    @SafeParcelable.Field
    public final long zzd;

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = j;
    }

    public static zzt zza(JSONObject jSONObject) throws JSONException {
        return new zzt(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(InAppPurchaseMetaData.KEY_CURRENCY), jSONObject.getLong(U3.i.X));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.m(parcel, 3, this.zzc, false);
        long j = this.zzd;
        SafeParcelWriter.r(parcel, 4, 8);
        parcel.writeLong(j);
        SafeParcelWriter.t(parcel, s);
    }
}
