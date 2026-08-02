package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzbmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbmk> CREATOR = new zzbml();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final com.google.android.gms.ads.internal.client.zzfw f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;

    public zzbmk(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions Y0(zzbmk zzbmkVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbmkVar == null) {
            return builder.build();
        }
        int i = zzbmkVar.a;
        int i2 = 2;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbmkVar.g);
                    builder.setMediaAspectRatio(zzbmkVar.h);
                    builder.enableCustomClickGestureDirection(zzbmkVar.i, zzbmkVar.j);
                    int i3 = zzbmkVar.k;
                    if (i3 != 0) {
                        if (i3 == 2) {
                            i2 = 3;
                        }
                        builder.zzi(i2);
                    }
                    i2 = 1;
                    builder.zzi(i2);
                }
                builder.setReturnUrlsForImageAssets(zzbmkVar.b);
                builder.setRequestMultipleImages(zzbmkVar.d);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmkVar.f;
            if (zzfwVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfwVar));
            }
        }
        builder.setAdChoicesPlacement(zzbmkVar.e);
        builder.setReturnUrlsForImageAssets(zzbmkVar.b);
        builder.setRequestMultipleImages(zzbmkVar.d);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.l(parcel, 6, this.f, i, false);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.h);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.i);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(this.k);
        SafeParcelWriter.t(parcel, s);
    }

    public zzbmk(int i, boolean z, int i2, boolean z2, int i3, com.google.android.gms.ads.internal.client.zzfw zzfwVar, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = zzfwVar;
        this.g = z3;
        this.h = i4;
        this.j = z4;
        this.i = i5;
        this.k = i6;
    }
}
