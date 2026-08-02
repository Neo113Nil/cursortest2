package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e4j {
    public final f4j a;
    public final int b;
    public final int c;

    public e4j(f4j f4jVar, int i, int i2) {
        this.a = f4jVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4j)) {
            return false;
        }
        e4j e4jVar = (e4j) obj;
        return this.a.equals(e4jVar.a) && this.b == e4jVar.b && this.c == e4jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamTrophiesUiModel(team=");
        sb.append(this.a);
        sb.append(", totalTrophies=");
        sb.append(this.b);
        sb.append(", majorTrophies=");
        return fc6.h(this.c, ")", sb);
    }
}
