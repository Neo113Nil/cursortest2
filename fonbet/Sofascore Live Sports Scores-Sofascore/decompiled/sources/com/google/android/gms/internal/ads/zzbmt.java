package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmt extends zzbeu implements zzbmv {
    public zzbmt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zza() {
        return x5n.i(S1(J(), 1));
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Uri zzb() {
        Parcel S1 = S1(J(), 2);
        Uri uri = (Uri) zzbew.b(S1, Uri.CREATOR);
        S1.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final double zzc() {
        Parcel S1 = S1(J(), 3);
        double readDouble = S1.readDouble();
        S1.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zzd() {
        Parcel S1 = S1(J(), 4);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zze() {
        Parcel S1 = S1(J(), 5);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Map zzf() {
        Parcel S1 = S1(J(), 6);
        HashMap readHashMap = S1.readHashMap(zzbew.a);
        S1.recycle();
        return readHashMap;
    }
}
