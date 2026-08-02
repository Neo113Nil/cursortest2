package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgo {
    public final long a;
    public final String b;
    public final int c;

    public zzbgo(int i, long j, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgo)) {
            return false;
        }
        zzbgo zzbgoVar = (zzbgo) obj;
        return zzbgoVar.a == this.a && zzbgoVar.c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
