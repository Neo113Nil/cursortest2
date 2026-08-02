package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bqf implements cqf {
    public final int a;
    public final String b;

    public bqf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqf)) {
            return false;
        }
        bqf bqfVar = (bqf) obj;
        return this.a == bqfVar.a && this.b.equals(bqfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "Singles(teamId=", ", teamName=", this.b, ")");
    }
}
