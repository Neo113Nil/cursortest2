package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nvj {
    public final String a;
    public final boolean b;

    public nvj(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvj)) {
            return false;
        }
        nvj nvjVar = (nvj) obj;
        return Intrinsics.c(this.a, nvjVar.a) && this.b == nvjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransferSection(name=" + this.a + ", isNationalTeamSection=" + this.b + ")";
    }
}
