package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lya {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final y3b f;
    public final String g;
    public final int h;

    public lya(int i, String str, String str2, int i2, String str3, y3b y3bVar, String str4, int i3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = y3bVar;
        this.g = str4;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lya)) {
            return false;
        }
        lya lyaVar = (lya) obj;
        return this.a == lyaVar.a && this.b.equals(lyaVar.b) && Intrinsics.c(this.c, lyaVar.c) && this.d == lyaVar.d && this.e.equals(lyaVar.e) && this.f == lyaVar.f && this.g.equals(lyaVar.g) && this.h == lyaVar.h;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.h) + dmi.c((this.f.hashCode() + dmi.c(wv8.a(this.d, (c + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "LeaguePlayerTransactionsData(playerId=", ", playerName=", this.b, ", playerPosition=");
        w1l.q(this.d, this.c, ", teamLogoId=", ", teamFromName=", t);
        t.append(this.e);
        t.append(", transactionType=");
        t.append(this.f);
        t.append(", date=");
        t.append(this.g);
        t.append(", transferId=");
        t.append(this.h);
        t.append(")");
        return t.toString();
    }
}
