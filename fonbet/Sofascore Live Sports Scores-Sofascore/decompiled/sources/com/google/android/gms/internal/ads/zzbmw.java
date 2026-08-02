package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmw extends NativeAd.Image {
    public final zzbmv a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbmw(zzbmv zzbmvVar) {
        Drawable drawable;
        IObjectWrapper zza;
        this.a = zzbmvVar;
        Uri uri = null;
        try {
            zza = zzbmvVar.zza();
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        if (zza != null) {
            drawable = (Drawable) ObjectWrapper.Z1(zza);
            this.b = drawable;
            uri = this.a.zzb();
            this.c = uri;
            double d = this.a.zzc();
            this.d = d;
            int i = -1;
            int i2 = this.a.zzd();
            this.e = i2;
            i = this.a.zze();
            this.f = i;
        }
        drawable = null;
        this.b = drawable;
        uri = this.a.zzb();
        this.c = uri;
        double d2 = this.a.zzc();
        this.d = d2;
        int i3 = -1;
        int i22 = this.a.zzd();
        this.e = i22;
        i3 = this.a.zze();
        this.f = i3;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f;
    }
}
