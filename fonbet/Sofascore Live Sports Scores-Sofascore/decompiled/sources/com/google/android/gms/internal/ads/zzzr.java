package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzr {
    public static final zzzr d = new zzzr(new zzbg[0]);
    public final int a;
    public final s b;
    public int c;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
    }

    public zzzr(zzbg... zzbgVarArr) {
        this.b = zzgxm.y(zzbgVarArr);
        this.a = zzbgVarArr.length;
        int i = 0;
        while (i < this.b.d) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                s sVar = this.b;
                if (i3 < sVar.d) {
                    if (((zzbg) sVar.get(i)).equals(this.b.get(i3))) {
                        zzeh.f("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final zzbg a(int i) {
        return (zzbg) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzzr.class != obj.getClass()) {
            return false;
        }
        zzzr zzzrVar = (zzzr) obj;
        return this.a == zzzrVar.a && this.b.equals(zzzrVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
