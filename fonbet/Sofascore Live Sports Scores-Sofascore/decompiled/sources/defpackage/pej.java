package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pej {
    public static final long b = t6a.g(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ pej(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return (g(j) <= g(j2)) & (f(j2) <= f(j));
    }

    public static boolean b(Object obj, long j) {
        return (obj instanceof pej) && j == ((pej) obj).a;
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final boolean d(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int e(long j) {
        return f(j) - g(j);
    }

    public static final int f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean h(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return wv8.j(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return b(obj, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
