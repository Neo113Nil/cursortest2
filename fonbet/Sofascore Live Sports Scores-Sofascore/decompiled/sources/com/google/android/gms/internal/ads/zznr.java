package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznr {
    public final long a;
    public final zzbf b;
    public final int c;
    public final zzxo d;
    public final long e;
    public final zzbf f;
    public final int g;
    public final zzxo h;
    public final long i;
    public final long j;

    public zznr(long j, zzbf zzbfVar, int i, zzxo zzxoVar, long j2, zzbf zzbfVar2, int i2, zzxo zzxoVar2, long j3, long j4) {
        this.a = j;
        this.b = zzbfVar;
        this.c = i;
        this.d = zzxoVar;
        this.e = j2;
        this.f = zzbfVar2;
        this.g = i2;
        this.h = zzxoVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznr.class == obj.getClass()) {
            zznr zznrVar = (zznr) obj;
            if (this.a == zznrVar.a && this.c == zznrVar.c && this.e == zznrVar.e && this.g == zznrVar.g && this.i == zznrVar.i && this.j == zznrVar.j && Objects.equals(this.b, zznrVar.b) && Objects.equals(this.d, zznrVar.d) && Objects.equals(this.f, zznrVar.f) && Objects.equals(this.h, zznrVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
