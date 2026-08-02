package defpackage;

import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzx;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jgn implements zzajg {
    public final long a;
    public final long b;
    public final boolean c;
    public final zzx d;

    public jgn(long j, long j2, boolean z, zzx zzxVar) {
        boolean z2 = true;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET && j > j2) {
            z2 = false;
        }
        zzguk.a(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = zzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jgn.class == obj.getClass()) {
            jgn jgnVar = (jgn) obj;
            if (this.a == jgnVar.a && this.b == jgnVar.b && this.c == jgnVar.c && Objects.equals(this.d, jgnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) + ((Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        zzx zzxVar = this.d;
        return (((hashCode * 31) + (this.c ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        long j = this.a;
        Object valueOf = j == C.TIME_UNSET ? "UNSET" : Long.valueOf(j);
        long j2 = this.b;
        String obj = valueOf.toString();
        String m = j2 == C.TIME_UNSET ? "" : x5n.m(j2, ", endTimeMs=", new StringBuilder(String.valueOf(j2).length() + 12));
        zzx zzxVar = this.d;
        String concat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == this.c ? ", hidden" : "";
        StringBuilder sb = new StringBuilder(str.length() + m.length() + obj.length() + 21 + concat.length());
        bf3.v(sb, "Chapter: startTimeMs=", obj, m, str);
        sb.append(concat);
        return sb.toString();
    }
}
