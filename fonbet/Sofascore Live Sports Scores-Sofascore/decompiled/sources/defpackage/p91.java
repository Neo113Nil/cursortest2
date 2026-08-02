package defpackage;

import com.sofascore.model.newNetwork.statistics.PlayerHand;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p91 {
    public final int a;
    public final Integer b;
    public final String c;
    public final String d;
    public final PlayerHand e;
    public final String f;

    public p91(int i, Integer num, String str, String str2, PlayerHand playerHand, String str3) {
        str.getClass();
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = playerHand;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p91)) {
            return false;
        }
        p91 p91Var = (p91) obj;
        return this.a == p91Var.a && this.b.equals(p91Var.b) && Intrinsics.c(this.c, p91Var.c) && Intrinsics.c(this.d, p91Var.d) && this.e == p91Var.e && Intrinsics.c(this.f, p91Var.f);
    }

    public final int hashCode() {
        int c = dmi.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        PlayerHand playerHand = this.e;
        int hashCode2 = (hashCode + (playerHand == null ? 0 : playerHand.hashCode())) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = fc6.r("BaseballPlayer(id=", ", teamId=", ", name=", this.b, this.a);
        bf3.v(r, this.c, ", jerseyNumber=", this.d, ", hand=");
        r.append(this.e);
        r.append(", position=");
        r.append(this.f);
        r.append(")");
        return r.toString();
    }
}
