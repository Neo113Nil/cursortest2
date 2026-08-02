package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqw {
    public static final zzqw d = new zzqv().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ zzqw(zzqv zzqvVar) {
        this.a = zzqvVar.a;
        this.b = zzqvVar.b;
        this.c = zzqvVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzqw.class != obj.getClass()) {
            return false;
        }
        zzqw zzqwVar = (zzqw) obj;
        return this.a == zzqwVar.a && this.b == zzqwVar.b && this.c == zzqwVar.c;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) << 2;
        boolean z = this.b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.c ? 1 : 0);
    }
}
