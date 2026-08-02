package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yvc implements lic {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public yvc(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yvc.class == obj.getClass()) {
            yvc yvcVar = (yvc) obj;
            if (this.a == yvcVar.a && this.b == yvcVar.b && this.c == yvcVar.c && this.d == yvcVar.d && this.e == yvcVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return jaa.F(this.e) + ((jaa.F(this.d) + ((jaa.F(this.c) + ((jaa.F(this.b) + ((jaa.F(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
