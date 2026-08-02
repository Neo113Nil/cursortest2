package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wtj {
    public final int a;
    public final huj b;
    public final huj c;
    public final String d;
    public final int e;
    public final int f;
    public final Integer g;
    public final String h;

    public wtj(int i, huj hujVar, huj hujVar2, String str, int i2, int i3, Integer num, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = hujVar;
        this.c = hujVar2;
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = num;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtj)) {
            return false;
        }
        wtj wtjVar = (wtj) obj;
        return this.a == wtjVar.a && this.b.equals(wtjVar.b) && this.c.equals(wtjVar.c) && Intrinsics.c(this.d, wtjVar.d) && this.e == wtjVar.e && this.f == wtjVar.f && Intrinsics.c(this.g, wtjVar.g) && Intrinsics.c(this.h, wtjVar.h);
    }

    public final int hashCode() {
        int a = wv8.a(this.f, wv8.a(this.e, dmi.c((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31), 31);
        Integer num = this.g;
        return this.h.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackerEventUiModel(id=");
        sb.append(this.a);
        sb.append(", homeTeam=");
        sb.append(this.b);
        sb.append(", awayTeam=");
        sb.append(this.c);
        sb.append(", eventStatus=");
        sb.append(this.d);
        sb.append(", homeTeamScore=");
        me4.q(sb, this.e, ", awayTeamScore=", this.f, ", winnerCode=");
        sb.append(this.g);
        sb.append(", sport=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
