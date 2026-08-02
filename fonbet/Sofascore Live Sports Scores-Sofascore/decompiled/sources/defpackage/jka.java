package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jka implements Comparable {

    @NotNull
    public static final ika e = new ika(null);
    public static final jka f = new jka(2, 4, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jka(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jka jkaVar = (jka) obj;
        jkaVar.getClass();
        return this.d - jkaVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jka jkaVar = obj instanceof jka ? (jka) obj : null;
        return jkaVar != null && this.d == jkaVar.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
