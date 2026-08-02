package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcce extends zzccg {
    public final String a;
    public final int b;

    public zzcce(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcce)) {
            return false;
        }
        zzcce zzcceVar = (zzcce) obj;
        if (Objects.a(this.a, zzcceVar.a)) {
            if (Objects.a(Integer.valueOf(this.b), Integer.valueOf(zzcceVar.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final String zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final int zzb() {
        return this.b;
    }
}
