package t2;

import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: t2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6429x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65611a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65614d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65615e;

    /* renamed from: f, reason: collision with root package name */
    public final String f65616f;

    /* renamed from: g, reason: collision with root package name */
    public final String f65617g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65618h;

    /* renamed from: i, reason: collision with root package name */
    public final C2357k f65619i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65620j;

    /* renamed from: k, reason: collision with root package name */
    public final int f65621k;

    /* renamed from: l, reason: collision with root package name */
    public final int f65622l;

    /* renamed from: m, reason: collision with root package name */
    public final String f65623m;

    /* renamed from: n, reason: collision with root package name */
    public final String f65624n;

    /* renamed from: o, reason: collision with root package name */
    public final int f65625o;

    /* renamed from: p, reason: collision with root package name */
    public final C6427w0 f65626p;

    /* renamed from: q, reason: collision with root package name */
    public final int f65627q;

    /* renamed from: r, reason: collision with root package name */
    public final int f65628r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC3445z f65629s;

    /* renamed from: t2.x0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC3445z.a f65630a;

        /* renamed from: b, reason: collision with root package name */
        public long f65631b;

        /* renamed from: c, reason: collision with root package name */
        public long f65632c;

        /* renamed from: d, reason: collision with root package name */
        public int f65633d;

        /* renamed from: e, reason: collision with root package name */
        public int f65634e;

        /* renamed from: f, reason: collision with root package name */
        public int f65635f;

        /* renamed from: g, reason: collision with root package name */
        public String f65636g;

        /* renamed from: h, reason: collision with root package name */
        public String f65637h;

        /* renamed from: i, reason: collision with root package name */
        public int f65638i;

        /* renamed from: j, reason: collision with root package name */
        public C2357k f65639j;

        /* renamed from: k, reason: collision with root package name */
        public int f65640k;

        /* renamed from: l, reason: collision with root package name */
        public int f65641l;

        /* renamed from: m, reason: collision with root package name */
        public int f65642m;

        /* renamed from: n, reason: collision with root package name */
        public String f65643n;

        /* renamed from: o, reason: collision with root package name */
        public String f65644o;

        /* renamed from: p, reason: collision with root package name */
        public int f65645p;

        /* renamed from: q, reason: collision with root package name */
        public C6427w0 f65646q;

        public b() {
            c();
        }

        public b a(List list) {
            this.f65630a.k(list);
            return this;
        }

        public C6429x0 b() {
            return new C6429x0(this.f65630a.m(), this.f65631b, this.f65632c, this.f65633d, this.f65634e, this.f65635f, this.f65636g, this.f65637h, this.f65638i, this.f65639j, this.f65640k, this.f65641l, this.f65642m, this.f65643n, this.f65644o, this.f65645p, this.f65646q);
        }

        public void c() {
            this.f65630a = new AbstractC3445z.a();
            this.f65631b = -9223372036854775807L;
            this.f65632c = -1L;
            this.f65633d = -2147483647;
            this.f65634e = -1;
            this.f65635f = -2147483647;
            this.f65636g = null;
            this.f65638i = -2147483647;
            this.f65639j = null;
            this.f65640k = -1;
            this.f65641l = -1;
            this.f65642m = 0;
            this.f65643n = null;
            this.f65645p = 0;
            this.f65646q = null;
        }

        public b d(String str) {
            this.f65636g = str;
            return this;
        }

        public b e(String str) {
            this.f65637h = str;
            return this;
        }

        public b f(int i10) {
            AbstractC4134a.a(i10 > 0 || i10 == -2147483647);
            this.f65633d = i10;
            return this;
        }

        public b g(int i10) {
            AbstractC4134a.a(i10 > 0 || i10 == -2147483647);
            this.f65638i = i10;
            return this;
        }

        public b h(int i10) {
            AbstractC4134a.a(i10 > 0 || i10 == -1);
            this.f65634e = i10;
            return this;
        }

        public b i(C2357k c2357k) {
            this.f65639j = c2357k;
            return this;
        }

        public b j(long j10) {
            AbstractC4134a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f65631b = j10;
            return this;
        }

        public b k(C6427w0 c6427w0) {
            this.f65646q = c6427w0;
            return this;
        }

        public b l(long j10) {
            AbstractC4134a.b(j10 > 0 || j10 == -1, "Invalid file size = " + j10);
            this.f65632c = j10;
            return this;
        }

        public b m(int i10) {
            AbstractC4134a.a(i10 > 0 || i10 == -1);
            this.f65640k = i10;
            return this;
        }

        public b n(int i10) {
            this.f65645p = i10;
            return this;
        }

        public b o(int i10) {
            AbstractC4134a.a(i10 > 0 || i10 == -2147483647);
            this.f65635f = i10;
            return this;
        }

        public b p(String str) {
            this.f65643n = str;
            return this;
        }

        public b q(int i10) {
            AbstractC4134a.a(i10 >= 0);
            this.f65642m = i10;
            return this;
        }

        public b r(String str) {
            this.f65644o = str;
            return this;
        }

        public b s(int i10) {
            AbstractC4134a.a(i10 > 0 || i10 == -1);
            this.f65641l = i10;
            return this;
        }
    }

    /* renamed from: t2.x0$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final b1.z f65647a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65648b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f65649c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.a f65650d;

        /* renamed from: e, reason: collision with root package name */
        public final String f65651e;

        /* renamed from: f, reason: collision with root package name */
        public final String f65652f;

        public c(b1.z zVar, long j10, androidx.media3.common.a aVar, androidx.media3.common.a aVar2, String str, String str2) {
            this.f65647a = zVar;
            this.f65648b = j10;
            this.f65649c = aVar;
            this.f65650d = aVar2;
            this.f65651e = str;
            this.f65652f = str2;
        }
    }

    public static int a(String str, int i10, List list, int i11) {
        int i12 = 0;
        if (str == null) {
            return 0;
        }
        if (i10 == 1) {
            return i11 == 1 ? 2 : 3;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if ((i11 == 1 ? cVar.f65651e : cVar.f65652f) == null) {
                if (i12 == 1) {
                    return 3;
                }
                i12 = 2;
            } else {
                if (i12 == 2) {
                    return 3;
                }
                i12 = 1;
            }
        }
        return i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6429x0)) {
            return false;
        }
        C6429x0 c6429x0 = (C6429x0) obj;
        return Objects.equals(this.f65629s, c6429x0.f65629s) && this.f65611a == c6429x0.f65611a && this.f65612b == c6429x0.f65612b && this.f65613c == c6429x0.f65613c && this.f65614d == c6429x0.f65614d && this.f65615e == c6429x0.f65615e && Objects.equals(this.f65616f, c6429x0.f65616f) && Objects.equals(this.f65617g, c6429x0.f65617g) && this.f65618h == c6429x0.f65618h && Objects.equals(this.f65619i, c6429x0.f65619i) && this.f65620j == c6429x0.f65620j && this.f65621k == c6429x0.f65621k && this.f65622l == c6429x0.f65622l && Objects.equals(this.f65623m, c6429x0.f65623m) && Objects.equals(this.f65624n, c6429x0.f65624n) && this.f65625o == c6429x0.f65625o && Objects.equals(this.f65626p, c6429x0.f65626p);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Objects.hashCode(this.f65629s) * 31) + ((int) this.f65611a)) * 31) + ((int) this.f65612b)) * 31) + this.f65613c) * 31) + this.f65614d) * 31) + this.f65615e) * 31) + Objects.hashCode(this.f65616f)) * 31) + Objects.hashCode(this.f65617g)) * 31) + this.f65618h) * 31) + Objects.hashCode(this.f65619i)) * 31) + this.f65620j) * 31) + this.f65621k) * 31) + this.f65622l) * 31) + Objects.hashCode(this.f65623m)) * 31) + Objects.hashCode(this.f65624n)) * 31) + this.f65625o) * 31) + Objects.hashCode(this.f65626p);
    }

    public C6429x0(AbstractC3445z abstractC3445z, long j10, long j11, int i10, int i11, int i12, String str, String str2, int i13, C2357k c2357k, int i14, int i15, int i16, String str3, String str4, int i17, C6427w0 c6427w0) {
        this.f65629s = abstractC3445z;
        this.f65611a = j10;
        this.f65612b = j11;
        this.f65613c = i10;
        this.f65614d = i11;
        this.f65615e = i12;
        this.f65616f = str;
        this.f65617g = str2;
        this.f65618h = i13;
        this.f65619i = c2357k;
        this.f65620j = i14;
        this.f65621k = i15;
        this.f65622l = i16;
        this.f65623m = str3;
        this.f65624n = str4;
        this.f65625o = i17;
        this.f65626p = c6427w0;
        this.f65628r = a(str2, i17, abstractC3445z, 1);
        this.f65627q = a(str4, i17, abstractC3445z, 2);
    }
}
