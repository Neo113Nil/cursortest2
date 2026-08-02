package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e8h {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final vd4 e;
    public final String f;
    public final String g;

    public e8h(String str, String str2, int i, long j, vd4 vd4Var, String str3, String str4) {
        me4.p(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = vd4Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8h)) {
            return false;
        }
        e8h e8hVar = (e8h) obj;
        return Intrinsics.c(this.a, e8hVar.a) && Intrinsics.c(this.b, e8hVar.b) && this.c == e8hVar.c && this.d == e8hVar.d && this.e.equals(e8hVar.e) && this.f.equals(e8hVar.f) && Intrinsics.c(this.g, e8hVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dmi.c((this.e.hashCode() + ljg.c(wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return lnb.q(sb, this.g, ')');
    }
}
