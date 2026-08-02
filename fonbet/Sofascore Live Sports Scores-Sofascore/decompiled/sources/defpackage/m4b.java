package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m4b {
    public final int a;
    public final y3b b;
    public final gv9 c;
    public final x3b d;
    public final gv9 e;
    public final boolean f;
    public final String g;

    public m4b(int i, y3b y3bVar, gv9 gv9Var, x3b x3bVar, gv9 gv9Var2, boolean z, String str) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = y3bVar;
        this.c = gv9Var;
        this.d = x3bVar;
        this.e = gv9Var2;
        this.f = z;
        this.g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [gv9] */
    public static m4b a(m4b m4bVar, y3b y3bVar, b7 b7Var, x3b x3bVar, boolean z, int i) {
        int i2 = m4bVar.a;
        if ((i & 2) != 0) {
            y3bVar = m4bVar.b;
        }
        y3b y3bVar2 = y3bVar;
        b7 b7Var2 = b7Var;
        if ((i & 4) != 0) {
            b7Var2 = m4bVar.c;
        }
        b7 b7Var3 = b7Var2;
        if ((i & 8) != 0) {
            x3bVar = m4bVar.d;
        }
        x3b x3bVar2 = x3bVar;
        gv9 gv9Var = m4bVar.e;
        if ((i & 32) != 0) {
            z = m4bVar.f;
        }
        String str = m4bVar.g;
        m4bVar.getClass();
        b7Var3.getClass();
        gv9Var.getClass();
        return new m4b(i2, y3bVar2, b7Var3, x3bVar2, gv9Var, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4b)) {
            return false;
        }
        m4b m4bVar = (m4b) obj;
        return this.a == m4bVar.a && this.b == m4bVar.b && Intrinsics.c(this.c, m4bVar.c) && Intrinsics.c(this.d, m4bVar.d) && Intrinsics.c(this.e, m4bVar.e) && this.f == m4bVar.f && this.g.equals(m4bVar.g);
    }

    public final int hashCode() {
        int d = ljg.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        x3b x3bVar = this.d;
        return this.g.hashCode() + dmi.e(ljg.d((d + (x3bVar == null ? 0 : x3bVar.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeagueTransactionsState(uniqueTournamentId=");
        sb.append(this.a);
        sb.append(", transactionType=");
        sb.append(this.b);
        sb.append(", teams=");
        sb.append(this.c);
        sb.append(", selectedTeam=");
        sb.append(this.d);
        sb.append(", transactionsTypes=");
        sb.append(this.e);
        sb.append(", isManualRefreshing=");
        sb.append(this.f);
        sb.append(", sportSlug=");
        return mz1.o(sb, this.g, ")");
    }
}
