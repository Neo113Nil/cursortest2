package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w3l extends x3l {
    public final l3l a;
    public final int b;
    public final int c;

    public w3l(l3l l3lVar, int i, int i2) {
        this.a = l3lVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3l)) {
            return false;
        }
        w3l w3lVar = (w3l) obj;
        return this.a.equals(w3lVar.a) && this.b == w3lVar.b && this.c == w3lVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(weeklyChallengeUiModel=");
        sb.append(this.a);
        sb.append(", weeklyStreakCount=");
        sb.append(this.b);
        sb.append(", previousWeeklyStreakCount=");
        return fc6.h(this.c, ")", sb);
    }
}
