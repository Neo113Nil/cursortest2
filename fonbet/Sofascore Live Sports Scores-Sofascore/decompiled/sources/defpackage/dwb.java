package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dwb implements fwb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dwb(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwb)) {
            return false;
        }
        dwb dwbVar = (dwb) obj;
        return Intrinsics.c(this.a, dwbVar.a) && Intrinsics.c(this.b, dwbVar.b) && Intrinsics.c(this.c, dwbVar.c) && Intrinsics.c(this.d, dwbVar.d);
    }

    @Override // defpackage.fwb
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int c = dmi.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return fc6.o(mz1.s("MatchOfTheWeekOddsItem(title=", this.a, ", odds=", this.b, ", url="), this.c, ", standardOdds=", this.d, ")");
    }
}
