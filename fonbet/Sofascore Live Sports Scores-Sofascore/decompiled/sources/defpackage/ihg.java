package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ihg implements fkg {
    public final String a;
    public final String b;
    public final long c;
    public final double d;

    public ihg(String str, String str2, long j, double d) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = d;
    }

    @Override // defpackage.fkg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.fkg
    public final String c() {
        return this.a;
    }

    @Override // defpackage.fkg
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihg)) {
            return false;
        }
        ihg ihgVar = (ihg) obj;
        return Intrinsics.c(this.a, ihgVar.a) && Intrinsics.c(this.b, ihgVar.b) && this.c == ihgVar.c && Double.compare(this.d, ihgVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + ljg.c(dmi.e(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, true), 31, this.c);
    }

    public final String toString() {
        StringBuilder s = mz1.s("SASViewabilityTrackingEvent(eventName=", this.a, ", eventUrl=", this.b, ", isEventConsumable=true, expositionTime=");
        s.append(this.c);
        s.append(", area=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
