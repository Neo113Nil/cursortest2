package androidx.media3.transformer;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import xsna.m6g;

/* compiled from: ExportResult.java */
/* loaded from: classes12.dex */
public final class t {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;
    public final int h;

    @Nullable
    public final m6g i;
    public final int j;
    public final int k;
    public final int l;

    @Nullable
    public final String m;

    @Nullable
    public final String n;
    public final int o;

    @Nullable
    public final ExportException p;
    public final ImmutableList<b> q;

    /* compiled from: ExportResult.java */
    public static final class a {
        public ImmutableList.a<b> a;
        public long b;
        public long c;
        public int d;
        public int e;
        public int f;

        @Nullable
        public String g;

        @Nullable
        public String h;
        public int i;

        @Nullable
        public m6g j;
        public int k;
        public int l;
        public int m;

        @Nullable
        public String n;

        @Nullable
        public String o;
        public int p;

        @Nullable
        public ExportException q;

        public final t a() {
            return new t(this.a.g(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }

        public final void b() {
            this.a = new ImmutableList.a<>();
            this.b = C.TIME_UNSET;
            this.c = -1L;
            this.d = -2147483647;
            this.e = -1;
            this.f = -2147483647;
            this.g = null;
            this.i = -2147483647;
            this.j = null;
            this.k = -1;
            this.l = -1;
            this.m = 0;
            this.n = null;
            this.p = 0;
            this.q = null;
        }
    }

    /* compiled from: ExportResult.java */
    public static final class b {
        public final long a;

        @Nullable
        public final androidx.media3.common.a b;

        @Nullable
        public final androidx.media3.common.a c;

        @Nullable
        public final String d;

        @Nullable
        public final String e;

        public b(long j, @Nullable androidx.media3.common.a aVar, @Nullable androidx.media3.common.a aVar2, @Nullable String str, @Nullable String str2) {
            this.a = j;
            this.b = aVar;
            this.c = aVar2;
            this.d = str;
            this.e = str2;
        }
    }

    public t() {
        throw null;
    }

    public t(com.google.common.collect.g gVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, m6g m6gVar, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.q = gVar;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = m6gVar;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = exportException;
        a(str2, i8, gVar, 1);
        a(str4, i8, gVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@Nullable String str, int i, com.google.common.collect.g gVar, int i2) {
        if (str == null || i == 1) {
            return;
        }
        char c = 0;
        ImmutableList.b listIterator = gVar.listIterator(0);
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            if ((i2 == 1 ? bVar.d : bVar.e) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Objects.equals(this.q, tVar.q) && this.a == tVar.a && this.b == tVar.b && this.c == tVar.c && this.d == tVar.d && this.e == tVar.e && Objects.equals(this.f, tVar.f) && Objects.equals(this.g, tVar.g) && this.h == tVar.h && Objects.equals(this.i, tVar.i) && this.j == tVar.j && this.k == tVar.k && this.l == tVar.l && Objects.equals(this.m, tVar.m) && Objects.equals(this.n, tVar.n) && this.o == tVar.o && Objects.equals(this.p, tVar.p);
    }

    public final int hashCode() {
        return Objects.hashCode(this.p) + ((((Objects.hashCode(this.n) + ((Objects.hashCode(this.m) + ((((((((Objects.hashCode(this.i) + ((((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
