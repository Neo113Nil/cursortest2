package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmg extends zzbmu {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;
    public final Map f;

    public zzbmg(Drawable drawable, Uri uri, double d, int i, int i2, HashMap hashMap) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
        this.f = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zza() {
        return new ObjectWrapper(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Uri zzb() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final double zzc() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zzd() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final int zze() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final Map zzf() {
        return this.f;
    }
}
