package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import defpackage.fn0;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahl {
    public static final zzahl c = new zzahl(0, 0);
    public final long a;
    public final long b;

    public zzahl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.a == zzahlVar.a && this.b == zzahlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        fn0.t(j, "[timeUs=", ", position=", sb);
        return lnb.l(j2, U3.j.e, sb);
    }
}
