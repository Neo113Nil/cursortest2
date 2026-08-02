package h1;

import android.net.Uri;
import b1.AbstractC2332A;
import com.twilio.voice.VoiceURLConnection;
import e1.AbstractC4134a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4418n {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f47554a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47555b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47556c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f47557d;

    /* renamed from: e, reason: collision with root package name */
    public final long f47558e;

    /* renamed from: f, reason: collision with root package name */
    public final long f47559f;

    /* renamed from: g, reason: collision with root package name */
    public final long f47560g;

    /* renamed from: h, reason: collision with root package name */
    public final String f47561h;
    public final byte[] httpBody;

    /* renamed from: i, reason: collision with root package name */
    public final int f47562i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f47563j;

    /* renamed from: h1.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Uri f47564a;

        /* renamed from: b, reason: collision with root package name */
        public long f47565b;

        /* renamed from: c, reason: collision with root package name */
        public int f47566c;

        /* renamed from: d, reason: collision with root package name */
        public Map f47567d;

        /* renamed from: e, reason: collision with root package name */
        public long f47568e;

        /* renamed from: f, reason: collision with root package name */
        public long f47569f;

        /* renamed from: g, reason: collision with root package name */
        public String f47570g;

        /* renamed from: h, reason: collision with root package name */
        public int f47571h;
        private byte[] httpBody;

        /* renamed from: i, reason: collision with root package name */
        public Object f47572i;

        public C4418n a() {
            AbstractC4134a.j(this.f47564a, "The uri must be set.");
            return new C4418n(this.f47564a, this.f47565b, this.f47566c, this.httpBody, this.f47567d, this.f47568e, this.f47569f, this.f47570g, this.f47571h, this.f47572i);
        }

        public b b(int i10) {
            this.f47571h = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public b d(int i10) {
            this.f47566c = i10;
            return this;
        }

        public b e(Map map) {
            this.f47567d = map;
            return this;
        }

        public b f(String str) {
            this.f47570g = str;
            return this;
        }

        public b g(long j10) {
            this.f47569f = j10;
            return this;
        }

        public b h(long j10) {
            this.f47568e = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f47564a = uri;
            return this;
        }

        public b j(String str) {
            this.f47564a = Uri.parse(str);
            return this;
        }

        public b k(long j10) {
            this.f47565b = j10;
            return this;
        }

        public b() {
            this.f47566c = 1;
            this.f47567d = Collections.EMPTY_MAP;
            this.f47569f = -1L;
        }

        public b(C4418n c4418n) {
            this.f47564a = c4418n.f47554a;
            this.f47565b = c4418n.f47555b;
            this.f47566c = c4418n.f47556c;
            this.httpBody = c4418n.httpBody;
            this.f47567d = c4418n.f47557d;
            this.f47568e = c4418n.f47559f;
            this.f47569f = c4418n.f47560g;
            this.f47570g = c4418n.f47561h;
            this.f47571h = c4418n.f47562i;
            this.f47572i = c4418n.f47563j;
        }
    }

    static {
        AbstractC2332A.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return VoiceURLConnection.METHOD_TYPE_POST;
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f47556c);
    }

    public boolean d(int i10) {
        return (this.f47562i & i10) == i10;
    }

    public C4418n e(long j10) {
        long j11 = this.f47560g;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public C4418n f(long j10, long j11) {
        return (j10 == 0 && this.f47560g == j11) ? this : new C4418n(this.f47554a, this.f47555b, this.f47556c, this.httpBody, this.f47557d, this.f47559f + j10, j11, this.f47561h, this.f47562i, this.f47563j);
    }

    public C4418n g(Map map) {
        HashMap hashMap = new HashMap(this.f47557d);
        hashMap.putAll(map);
        return new C4418n(this.f47554a, this.f47555b, this.f47556c, this.httpBody, hashMap, this.f47559f, this.f47560g, this.f47561h, this.f47562i, this.f47563j);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f47554a + ", " + this.f47559f + ", " + this.f47560g + ", " + this.f47561h + ", " + this.f47562i + "]";
    }

    public C4418n(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C4418n(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    public C4418n(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    public C4418n(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        AbstractC4134a.a(j13 >= 0);
        AbstractC4134a.a(j11 >= 0);
        AbstractC4134a.a(j12 > 0 || j12 == -1);
        this.f47554a = (Uri) AbstractC4134a.e(uri);
        this.f47555b = j10;
        this.f47556c = i10;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f47557d = Collections.unmodifiableMap(new HashMap(map));
        this.f47559f = j11;
        this.f47558e = j13;
        this.f47560g = j12;
        this.f47561h = str;
        this.f47562i = i11;
        this.f47563j = obj;
    }
}
