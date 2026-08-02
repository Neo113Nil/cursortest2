package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ghg implements alg {
    public final String a;
    public final String b;
    public final boolean c;

    public ghg(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.fkg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.alg
    public final long b() {
        return -1L;
    }

    @Override // defpackage.fkg
    public final String c() {
        return this.a;
    }

    @Override // defpackage.fkg
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghg)) {
            return false;
        }
        ghg ghgVar = (ghg) obj;
        return Intrinsics.c(this.a, ghgVar.a) && Intrinsics.c(this.b, ghgVar.b) && this.c == ghgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(-1L) + dmi.e(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return wt3.p(mz1.s("SASVideoTrackingEvent(eventName=", this.a, ", eventUrl=", this.b, ", isConsumable="), this.c, ", eventOffset=-1)");
    }
}
