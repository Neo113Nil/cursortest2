package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzblh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblh> CREATOR = new zzbli();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzfw zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzblh(int i, boolean z, int i2, boolean z2, int i3, com.google.android.gms.ads.internal.client.zzfw zzfwVar, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzfwVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NativeAdOptions zza(zzblh zzblhVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblhVar == null) {
            return builder.build();
        }
        int i = zzblhVar.zza;
        int i2 = 2;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzblhVar.zzg);
                    builder.setMediaAspectRatio(zzblhVar.zzh);
                    builder.enableCustomClickGestureDirection(zzblhVar.zzi, zzblhVar.zzj);
                    int i3 = zzblhVar.zzk;
                    if (i3 != 0) {
                        if (i3 == 2) {
                            i2 = 3;
                        }
                        builder.zzi(i2);
                    }
                    i2 = 1;
                    builder.zzi(i2);
                }
                builder.setReturnUrlsForImageAssets(zzblhVar.zzb);
                builder.setRequestMultipleImages(zzblhVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzblhVar.zzf;
            if (zzfwVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfwVar));
            }
        }
        builder.setAdChoicesPlacement(zzblhVar.zze);
        builder.setReturnUrlsForImageAssets(zzblhVar.zzb);
        builder.setRequestMultipleImages(zzblhVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Deprecated
    public zzblh(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
