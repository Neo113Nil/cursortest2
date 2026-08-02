package sf;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class D implements Comparable<D> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f98654b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9684j f98655a;

    public static final class a {
        @NotNull
        public static D a(@NotNull String str, boolean z11) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i11 = tf.c.f99490f;
            Intrinsics.checkNotNullParameter(str, "<this>");
            C9681g c9681g = new C9681g();
            c9681g.H0(str);
            return tf.c.l(c9681g, z11);
        }

        public static D b(File file) {
            String str = D.f98654b;
            Intrinsics.checkNotNullParameter(file, "<this>");
            String file2 = file.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString()");
            return a(file2, false);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f98654b = separator;
    }

    public D(@NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f98655a = bytes;
    }

    @NotNull
    public final C9684j a() {
        return this.f98655a;
    }

    @NotNull
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        int h11 = tf.c.h(this);
        C9684j c9684j = this.f98655a;
        if (h11 == -1) {
            h11 = 0;
        } else if (h11 < c9684j.g() && c9684j.n(h11) == 92) {
            h11++;
        }
        int g10 = c9684j.g();
        int i11 = h11;
        while (h11 < g10) {
            if (c9684j.n(h11) == 47 || c9684j.n(h11) == 92) {
                arrayList.add(c9684j.D(i11, h11));
                i11 = h11 + 1;
            }
            h11++;
        }
        if (i11 < c9684j.g()) {
            arrayList.add(c9684j.D(i11, c9684j.g()));
        }
        return arrayList;
    }

    @NotNull
    public final String c() {
        int d11 = tf.c.d(this);
        C9684j c9684j = this.f98655a;
        if (d11 != -1) {
            c9684j = C9684j.E(c9684j, d11 + 1, 0, 2);
        } else if (j() != null && c9684j.g() == 2) {
            c9684j = C9684j.f98719d;
        }
        return c9684j.H();
    }

    @Override // java.lang.Comparable
    public final int compareTo(D d11) {
        D other = d11;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f98655a.compareTo(other.f98655a);
    }

    @NotNull
    public final D d() {
        return a.a(this.f98655a.H(), true);
    }

    public final D e() {
        C9684j c9684j;
        C9684j c9684j2;
        C9684j c9684j3;
        C9684j c9684j4;
        C9684j prefix;
        c9684j = tf.c.f99488d;
        C9684j c9684j5 = this.f98655a;
        if (Intrinsics.d(c9684j5, c9684j)) {
            return null;
        }
        c9684j2 = tf.c.f99485a;
        if (Intrinsics.d(c9684j5, c9684j2)) {
            return null;
        }
        c9684j3 = tf.c.f99486b;
        if (Intrinsics.d(c9684j5, c9684j3) || tf.c.g(this)) {
            return null;
        }
        int d11 = tf.c.d(this);
        if (d11 == 2 && j() != null) {
            if (c9684j5.g() == 3) {
                return null;
            }
            return new D(C9684j.E(c9684j5, 0, 3, 1));
        }
        if (d11 == 1) {
            prefix = tf.c.f99486b;
            c9684j5.getClass();
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (c9684j5.u(0, prefix, prefix.g())) {
                return null;
            }
        }
        if (d11 == -1 && j() != null) {
            if (c9684j5.g() == 2) {
                return null;
            }
            return new D(C9684j.E(c9684j5, 0, 2, 1));
        }
        if (d11 != -1) {
            return d11 == 0 ? new D(C9684j.E(c9684j5, 0, 1, 1)) : new D(C9684j.E(c9684j5, 0, d11, 1));
        }
        c9684j4 = tf.c.f99488d;
        return new D(c9684j4);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D) && Intrinsics.d(((D) obj).f98655a, this.f98655a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        r12 = tf.c.k(r11);
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D f(@NotNull D other) {
        C9684j c9684j;
        C9684j k11;
        C9684j c9684j2;
        Intrinsics.checkNotNullParameter(other, "other");
        int h11 = tf.c.h(this);
        C9684j c9684j3 = this.f98655a;
        D d11 = h11 == -1 ? null : new D(c9684j3.D(0, h11));
        other.getClass();
        int h12 = tf.c.h(other);
        C9684j c9684j4 = other.f98655a;
        if (!Intrinsics.d(d11, h12 != -1 ? new D(c9684j4.D(0, h12)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList b11 = b();
        ArrayList b12 = other.b();
        int min = Math.min(b11.size(), b12.size());
        int i11 = 0;
        while (i11 < min && Intrinsics.d(b11.get(i11), b12.get(i11))) {
            i11++;
        }
        if (i11 == min && c9684j3.g() == c9684j4.g()) {
            return a.a(".", false);
        }
        List subList = b12.subList(i11, b12.size());
        c9684j = tf.c.f99489e;
        if (subList.indexOf(c9684j) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C9681g c9681g = new C9681g();
        k11 = tf.c.k(other);
        if (k11 == null && k11 == null) {
            k11 = tf.c.n(f98654b);
        }
        int size = b12.size();
        for (int i12 = i11; i12 < size; i12++) {
            c9684j2 = tf.c.f99489e;
            c9681g.X(c9684j2);
            c9681g.X(k11);
        }
        int size2 = b11.size();
        while (i11 < size2) {
            c9681g.X((C9684j) b11.get(i11));
            c9681g.X(k11);
            i11++;
        }
        return tf.c.l(c9681g, false);
    }

    @NotNull
    public final D g(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C9681g c9681g = new C9681g();
        c9681g.H0(child);
        return tf.c.j(this, tf.c.l(c9681g, false), false);
    }

    @NotNull
    public final File h() {
        return new File(this.f98655a.H());
    }

    public final int hashCode() {
        return this.f98655a.hashCode();
    }

    @NotNull
    public final Path i() {
        Path path = Paths.get(this.f98655a.H(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(toString())");
        return path;
    }

    public final Character j() {
        C9684j c9684j;
        c9684j = tf.c.f99485a;
        C9684j c9684j2 = this.f98655a;
        if (C9684j.l(c9684j2, c9684j) != -1 || c9684j2.g() < 2 || c9684j2.n(1) != 58) {
            return null;
        }
        char n11 = (char) c9684j2.n(0);
        if (('a' > n11 || n11 >= '{') && ('A' > n11 || n11 >= '[')) {
            return null;
        }
        return Character.valueOf(n11);
    }

    @NotNull
    public final String toString() {
        return this.f98655a.H();
    }
}
