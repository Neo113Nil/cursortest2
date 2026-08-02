package com.google.android.gms.internal.ads;

import defpackage.ljg;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzakg {
    public final long a;
    public final long b;
    public final int c;

    public zzakg(long j, long j2, int i) {
        zzguk.a(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakg.class == obj.getClass()) {
            zzakg zzakgVar = (zzakg) obj;
            if (this.a == zzakgVar.a && this.b == zzakgVar.b && this.c == zzakgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = zzfm.a;
        Locale locale = Locale.US;
        StringBuilder o = ljg.o("Segment: startTimeMs=", this.a, ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
