package p3;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f80066a;

    /* renamed from: b, reason: collision with root package name */
    public final long f80067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80068c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f80069d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f80070e;

    /* renamed from: f, reason: collision with root package name */
    public final long f80071f;

    /* renamed from: g, reason: collision with root package name */
    public final long f80072g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80073h;

    /* renamed from: i, reason: collision with root package name */
    public final int f80074i;

    static {
        j3.r.a("media3.datasource");
    }

    /* synthetic */ i(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12, int i13) {
        this(uri, j11, i11, bArr, map, j12, j13, str, i12);
    }

    public static String b(int i11) {
        if (i11 == 1) {
            return "GET";
        }
        if (i11 == 2) {
            return "POST";
        }
        if (i11 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final a a() {
        return new a(this);
    }

    public final boolean c(int i11) {
        return (this.f80074i & i11) == i11;
    }

    public final i d(long j11, long j12) {
        if (j11 == 0 && this.f80072g == j12) {
            return this;
        }
        long j13 = this.f80071f + j11;
        return new i(this.f80066a, this.f80067b, this.f80068c, this.f80069d, this.f80070e, j13, j12, this.f80073h, this.f80074i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(b(this.f80068c));
        sb2.append(" ");
        sb2.append(this.f80066a);
        sb2.append(", ");
        sb2.append(this.f80071f);
        sb2.append(", ");
        sb2.append(this.f80072g);
        sb2.append(", ");
        sb2.append(this.f80073h);
        sb2.append(", ");
        return K00.b.e(this.f80074i, "]", sb2);
    }

    public i(Uri uri, long j11, long j12) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j11, j12, null, 0);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Uri f80075a;

        /* renamed from: b, reason: collision with root package name */
        private long f80076b;

        /* renamed from: c, reason: collision with root package name */
        private int f80077c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f80078d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f80079e;

        /* renamed from: f, reason: collision with root package name */
        private long f80080f;

        /* renamed from: g, reason: collision with root package name */
        private long f80081g;

        /* renamed from: h, reason: collision with root package name */
        private String f80082h;

        /* renamed from: i, reason: collision with root package name */
        private int f80083i;

        public a() {
            this.f80077c = 1;
            this.f80079e = Collections.EMPTY_MAP;
            this.f80081g = -1L;
        }

        public final i a() {
            if (this.f80075a != null) {
                return new i(this.f80075a, this.f80076b, this.f80077c, this.f80078d, this.f80079e, this.f80080f, this.f80081g, this.f80082h, this.f80083i, 0);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        public final void b(int i11) {
            this.f80083i = i11;
        }

        public final void c(byte[] bArr) {
            this.f80078d = bArr;
        }

        public final void d() {
            this.f80077c = 2;
        }

        public final void e(Map map) {
            this.f80079e = map;
        }

        public final void f(String str) {
            this.f80082h = str;
        }

        public final void g(long j11) {
            this.f80081g = j11;
        }

        public final void h(long j11) {
            this.f80080f = j11;
        }

        public final void i(Uri uri) {
            this.f80075a = uri;
        }

        public final void j(String str) {
            this.f80075a = Uri.parse(str);
        }

        public final void k(long j11) {
            this.f80076b = j11;
        }

        a(i iVar) {
            this.f80075a = iVar.f80066a;
            this.f80076b = iVar.f80067b;
            this.f80077c = iVar.f80068c;
            this.f80078d = iVar.f80069d;
            this.f80079e = iVar.f80070e;
            this.f80080f = iVar.f80071f;
            this.f80081g = iVar.f80072g;
            this.f80082h = iVar.f80073h;
            this.f80083i = iVar.f80074i;
        }
    }

    private i(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12) {
        G10.a.c(j11 + j12 >= 0);
        G10.a.c(j12 >= 0);
        G10.a.c(j13 > 0 || j13 == -1);
        uri.getClass();
        this.f80066a = uri;
        this.f80067b = j11;
        this.f80068c = i11;
        this.f80069d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f80070e = Collections.unmodifiableMap(new HashMap(map));
        this.f80071f = j12;
        this.f80072g = j13;
        this.f80073h = str;
        this.f80074i = i12;
    }
}
