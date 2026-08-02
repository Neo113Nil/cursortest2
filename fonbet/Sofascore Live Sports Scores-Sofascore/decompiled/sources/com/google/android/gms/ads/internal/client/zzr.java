package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public final int zzb;

    @SafeParcelable.Field
    public final int zzc;

    @SafeParcelable.Field
    public final boolean zzd;

    @SafeParcelable.Field
    public final int zze;

    @SafeParcelable.Field
    public final int zzf;

    @SafeParcelable.Field
    public final zzr[] zzg;

    @SafeParcelable.Field
    public final boolean zzh;

    @SafeParcelable.Field
    public final boolean zzi;

    @SafeParcelable.Field
    public boolean zzj;

    @SafeParcelable.Field
    public boolean zzk;

    @SafeParcelable.Field
    public boolean zzl;

    @SafeParcelable.Field
    public boolean zzm;

    @SafeParcelable.Field
    public boolean zzn;

    @SafeParcelable.Field
    public boolean zzo;

    @SafeParcelable.Field
    public boolean zzp;

    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(Context context, AdSize[] adSizeArr) {
        int width;
        int height;
        int i;
        int i2;
        String sb;
        int i3;
        double d;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        this.zzo = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzp = com.google.android.gms.ads.zzc.zzi(adSize);
        if (isFluid) {
            AdSize adSize2 = AdSize.BANNER;
            width = adSize2.getWidth();
            this.zze = width;
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            width = adSize.getWidth();
            this.zze = width;
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (this.zzo) {
            width = adSize.getWidth();
            this.zze = width;
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            width = adSize.getWidth();
            this.zze = width;
            height = adSize.getHeight();
            this.zzb = height;
        }
        int i4 = width;
        int i5 = height;
        boolean z = i4 == -1;
        boolean z2 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            zzay.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r12.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzay.zza();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i6 = displayMetrics2.heightPixels;
                        int i7 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i8 = displayMetrics2.heightPixels;
                        int i9 = displayMetrics2.widthPixels;
                        if (i8 == i6 && i9 == i7) {
                            int i10 = displayMetrics.widthPixels;
                            zzay.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i3 = i10 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i3;
                            d = i3 / displayMetrics.density;
                            i = (int) d;
                            if (d - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i3 = displayMetrics.widthPixels;
            this.zzf = i3;
            d = i3 / displayMetrics.density;
            i = (int) d;
            if (d - i >= 0.01d) {
            }
        } else {
            zzay.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, i4);
            i = i4;
        }
        if (z2) {
            int i11 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i2 = i11 <= 400 ? 32 : i11 <= 720 ? 50 : 90;
        } else {
            i2 = i5;
        }
        zzay.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, i2);
        if (z || z2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + fn0.a(i, 1) + 3);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("_as");
            this.zza = sb2.toString();
        } else {
            if (this.zzn || this.zzo) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + fn0.a(i4, 1) + 3);
                sb3.append(i4);
                sb3.append("x");
                sb3.append(i5);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (isFluid) {
                sb = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = sb;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzr[length];
            for (int i12 = 0; i12 < adSizeArr.length; i12++) {
                this.zzg[i12] = new zzr(context, adSizeArr[i12]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        int i = (int) (f / f2);
        return (int) ((i <= 400 ? 32 : i <= 720 ? 50 : 90) * f2);
    }

    public static zzr zzb() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static zzr zzc() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, str, false);
        int i2 = this.zzb;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.zzc;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i3);
        boolean z = this.zzd;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.zze;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(i4);
        int i5 = this.zzf;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(i5);
        SafeParcelWriter.p(parcel, 8, this.zzg, i);
        boolean z2 = this.zzh;
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.zzi;
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzj;
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzk;
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzl;
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzm;
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzn;
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzo;
        SafeParcelWriter.r(parcel, 16, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.zzp;
        SafeParcelWriter.r(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public zzr(String str, int i, int i2, boolean z, int i3, int i4, zzr[] zzrVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzrVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
        this.zzp = z10;
    }
}
