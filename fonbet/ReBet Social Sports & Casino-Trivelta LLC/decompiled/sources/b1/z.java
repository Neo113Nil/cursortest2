package b1;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: i, reason: collision with root package name */
    public static final z f24647i = new c().a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f24648j = Z.K0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24649k = Z.K0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24650l = Z.K0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24651m = Z.K0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24652n = Z.K0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f24653o = Z.K0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f24654a;

    /* renamed from: b, reason: collision with root package name */
    public final h f24655b;

    /* renamed from: c, reason: collision with root package name */
    public final h f24656c;

    /* renamed from: d, reason: collision with root package name */
    public final g f24657d;

    /* renamed from: e, reason: collision with root package name */
    public final C2333B f24658e;

    /* renamed from: f, reason: collision with root package name */
    public final d f24659f;

    /* renamed from: g, reason: collision with root package name */
    public final e f24660g;

    /* renamed from: h, reason: collision with root package name */
    public final i f24661h;

    public static final class b {
        public abstract int hashCode();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f24662a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f24663b;

        /* renamed from: c, reason: collision with root package name */
        public String f24664c;

        /* renamed from: d, reason: collision with root package name */
        public d.a f24665d;

        /* renamed from: e, reason: collision with root package name */
        public f.a f24666e;

        /* renamed from: f, reason: collision with root package name */
        public List f24667f;

        /* renamed from: g, reason: collision with root package name */
        public String f24668g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC3445z f24669h;

        /* renamed from: i, reason: collision with root package name */
        public b f24670i;

        /* renamed from: j, reason: collision with root package name */
        public Object f24671j;

        /* renamed from: k, reason: collision with root package name */
        public long f24672k;

        /* renamed from: l, reason: collision with root package name */
        public C2333B f24673l;

        /* renamed from: m, reason: collision with root package name */
        public g.a f24674m;

        /* renamed from: n, reason: collision with root package name */
        public i f24675n;

        public z a() {
            h hVar;
            AbstractC4134a.g(this.f24666e.f24719b == null || this.f24666e.f24718a != null);
            Uri uri = this.f24663b;
            if (uri != null) {
                hVar = new h(uri, this.f24664c, this.f24666e.f24718a != null ? this.f24666e.i() : null, this.f24670i, this.f24667f, this.f24668g, this.f24669h, this.f24671j, this.f24672k);
            } else {
                hVar = null;
            }
            String str = this.f24662a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e h10 = this.f24665d.h();
            g f10 = this.f24674m.f();
            C2333B c2333b = this.f24673l;
            if (c2333b == null) {
                c2333b = C2333B.f24192H;
            }
            return new z(str2, h10, hVar, f10, c2333b, this.f24675n);
        }

        public c b(d dVar) {
            this.f24665d = dVar.a();
            return this;
        }

        public c c(g gVar) {
            this.f24674m = gVar.a();
            return this;
        }

        public c d(String str) {
            this.f24662a = (String) AbstractC4134a.e(str);
            return this;
        }

        public c e(C2333B c2333b) {
            this.f24673l = c2333b;
            return this;
        }

        public c f(List list) {
            this.f24667f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c g(List list) {
            this.f24669h = AbstractC3445z.o(list);
            return this;
        }

        public c h(Object obj) {
            this.f24671j = obj;
            return this;
        }

        public c i(Uri uri) {
            this.f24663b = uri;
            return this;
        }

        public c j(String str) {
            return i(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f24665d = new d.a();
            this.f24666e = new f.a();
            this.f24667f = Collections.EMPTY_LIST;
            this.f24669h = AbstractC3445z.t();
            this.f24674m = new g.a();
            this.f24675n = i.f24759d;
            this.f24672k = -9223372036854775807L;
        }

        public c(z zVar) {
            this();
            f.a aVar;
            this.f24665d = zVar.f24659f.a();
            this.f24662a = zVar.f24654a;
            this.f24673l = zVar.f24658e;
            this.f24674m = zVar.f24657d.a();
            this.f24675n = zVar.f24661h;
            h hVar = zVar.f24655b;
            if (hVar != null) {
                this.f24668g = hVar.f24754f;
                this.f24664c = hVar.f24750b;
                this.f24663b = hVar.f24749a;
                this.f24667f = hVar.f24753e;
                this.f24669h = hVar.f24755g;
                this.f24671j = hVar.f24757i;
                f fVar = hVar.f24751c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f24666e = aVar;
                this.f24670i = hVar.f24752d;
                this.f24672k = hVar.f24758j;
            }
        }
    }

    public static class d {

        /* renamed from: i, reason: collision with root package name */
        public static final d f24676i = new a().g();

        /* renamed from: j, reason: collision with root package name */
        public static final String f24677j = Z.K0(0);

        /* renamed from: k, reason: collision with root package name */
        public static final String f24678k = Z.K0(1);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24679l = Z.K0(2);

        /* renamed from: m, reason: collision with root package name */
        public static final String f24680m = Z.K0(3);

        /* renamed from: n, reason: collision with root package name */
        public static final String f24681n = Z.K0(4);

        /* renamed from: o, reason: collision with root package name */
        public static final String f24682o = Z.K0(5);

        /* renamed from: p, reason: collision with root package name */
        public static final String f24683p = Z.K0(6);

        /* renamed from: q, reason: collision with root package name */
        public static final String f24684q = Z.K0(7);

        /* renamed from: a, reason: collision with root package name */
        public final long f24685a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24686b;

        /* renamed from: c, reason: collision with root package name */
        public final long f24687c;

        /* renamed from: d, reason: collision with root package name */
        public final long f24688d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f24689e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f24690f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f24691g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f24692h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f24693a;

            /* renamed from: b, reason: collision with root package name */
            public long f24694b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f24695c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f24696d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f24697e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f24698f;

            public d g() {
                return new d(this);
            }

            public e h() {
                return new e(this);
            }

            public a i(long j10) {
                AbstractC4134a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f24694b = j10;
                return this;
            }

            public a j(long j10) {
                return k(Z.a1(j10));
            }

            public a k(long j10) {
                AbstractC4134a.a(j10 >= 0);
                this.f24693a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f24697e = z10;
                return this;
            }

            public a() {
                this.f24694b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f24693a = dVar.f24686b;
                this.f24694b = dVar.f24688d;
                this.f24695c = dVar.f24689e;
                this.f24696d = dVar.f24690f;
                this.f24697e = dVar.f24691g;
                this.f24698f = dVar.f24692h;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24686b == dVar.f24686b && this.f24688d == dVar.f24688d && this.f24689e == dVar.f24689e && this.f24690f == dVar.f24690f && this.f24691g == dVar.f24691g && this.f24692h == dVar.f24692h;
        }

        public int hashCode() {
            long j10 = this.f24686b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f24688d;
            return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f24689e ? 1 : 0)) * 31) + (this.f24690f ? 1 : 0)) * 31) + (this.f24691g ? 1 : 0)) * 31) + (this.f24692h ? 1 : 0);
        }

        public d(a aVar) {
            this.f24685a = Z.J1(aVar.f24693a);
            this.f24687c = Z.J1(aVar.f24694b);
            this.f24686b = aVar.f24693a;
            this.f24688d = aVar.f24694b;
            this.f24689e = aVar.f24695c;
            this.f24690f = aVar.f24696d;
            this.f24691g = aVar.f24697e;
            this.f24692h = aVar.f24698f;
        }
    }

    public static final class e extends d {

        /* renamed from: r, reason: collision with root package name */
        public static final e f24699r = new d.a().h();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* renamed from: k, reason: collision with root package name */
        public static final String f24700k = Z.K0(0);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24701l = Z.K0(1);

        /* renamed from: m, reason: collision with root package name */
        public static final String f24702m = Z.K0(2);

        /* renamed from: n, reason: collision with root package name */
        public static final String f24703n = Z.K0(3);

        /* renamed from: o, reason: collision with root package name */
        public static final String f24704o = Z.K0(4);

        /* renamed from: p, reason: collision with root package name */
        public static final String f24705p = Z.K0(5);

        /* renamed from: q, reason: collision with root package name */
        public static final String f24706q = Z.K0(6);

        /* renamed from: r, reason: collision with root package name */
        public static final String f24707r = Z.K0(7);

        /* renamed from: a, reason: collision with root package name */
        public final UUID f24708a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f24709b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f24710c;

        /* renamed from: d, reason: collision with root package name */
        public final com.google.common.collect.B f24711d;

        /* renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.B f24712e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f24713f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f24714g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f24715h;

        /* renamed from: i, reason: collision with root package name */
        public final AbstractC3445z f24716i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC3445z f24717j;
        private final byte[] keySetId;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f24708a.equals(fVar.f24708a) && Objects.equals(this.f24710c, fVar.f24710c) && Objects.equals(this.f24712e, fVar.f24712e) && this.f24713f == fVar.f24713f && this.f24715h == fVar.f24715h && this.f24714g == fVar.f24714g && this.f24717j.equals(fVar.f24717j) && Arrays.equals(this.keySetId, fVar.keySetId);
        }

        public int hashCode() {
            int hashCode = this.f24708a.hashCode() * 31;
            Uri uri = this.f24710c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f24712e.hashCode()) * 31) + (this.f24713f ? 1 : 0)) * 31) + (this.f24715h ? 1 : 0)) * 31) + (this.f24714g ? 1 : 0)) * 31) + this.f24717j.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        }

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public UUID f24718a;

            /* renamed from: b, reason: collision with root package name */
            public Uri f24719b;

            /* renamed from: c, reason: collision with root package name */
            public com.google.common.collect.B f24720c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f24721d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f24722e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f24723f;

            /* renamed from: g, reason: collision with root package name */
            public AbstractC3445z f24724g;
            private byte[] keySetId;

            public f i() {
                return new f(this);
            }

            public a() {
                this.f24720c = com.google.common.collect.B.m();
                this.f24722e = true;
                this.f24724g = AbstractC3445z.t();
            }

            public a(f fVar) {
                this.f24718a = fVar.f24708a;
                this.f24719b = fVar.f24710c;
                this.f24720c = fVar.f24712e;
                this.f24721d = fVar.f24713f;
                this.f24722e = fVar.f24714g;
                this.f24723f = fVar.f24715h;
                this.f24724g = fVar.f24717j;
                this.keySetId = fVar.keySetId;
            }
        }

        public f(a aVar) {
            AbstractC4134a.g((aVar.f24723f && aVar.f24719b == null) ? false : true);
            UUID uuid = (UUID) AbstractC4134a.e(aVar.f24718a);
            this.f24708a = uuid;
            this.f24709b = uuid;
            this.f24710c = aVar.f24719b;
            this.f24711d = aVar.f24720c;
            this.f24712e = aVar.f24720c;
            this.f24713f = aVar.f24721d;
            this.f24715h = aVar.f24723f;
            this.f24714g = aVar.f24722e;
            this.f24716i = aVar.f24724g;
            this.f24717j = aVar.f24724g;
            this.keySetId = aVar.keySetId != null ? Arrays.copyOf(aVar.keySetId, aVar.keySetId.length) : null;
        }
    }

    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f24725f = new a().f();

        /* renamed from: g, reason: collision with root package name */
        public static final String f24726g = Z.K0(0);

        /* renamed from: h, reason: collision with root package name */
        public static final String f24727h = Z.K0(1);

        /* renamed from: i, reason: collision with root package name */
        public static final String f24728i = Z.K0(2);

        /* renamed from: j, reason: collision with root package name */
        public static final String f24729j = Z.K0(3);

        /* renamed from: k, reason: collision with root package name */
        public static final String f24730k = Z.K0(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f24731a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24732b;

        /* renamed from: c, reason: collision with root package name */
        public final long f24733c;

        /* renamed from: d, reason: collision with root package name */
        public final float f24734d;

        /* renamed from: e, reason: collision with root package name */
        public final float f24735e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f24736a;

            /* renamed from: b, reason: collision with root package name */
            public long f24737b;

            /* renamed from: c, reason: collision with root package name */
            public long f24738c;

            /* renamed from: d, reason: collision with root package name */
            public float f24739d;

            /* renamed from: e, reason: collision with root package name */
            public float f24740e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f24738c = j10;
                return this;
            }

            public a h(float f10) {
                this.f24740e = f10;
                return this;
            }

            public a i(long j10) {
                this.f24737b = j10;
                return this;
            }

            public a j(float f10) {
                this.f24739d = f10;
                return this;
            }

            public a k(long j10) {
                this.f24736a = j10;
                return this;
            }

            public a() {
                this.f24736a = -9223372036854775807L;
                this.f24737b = -9223372036854775807L;
                this.f24738c = -9223372036854775807L;
                this.f24739d = -3.4028235E38f;
                this.f24740e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f24736a = gVar.f24731a;
                this.f24737b = gVar.f24732b;
                this.f24738c = gVar.f24733c;
                this.f24739d = gVar.f24734d;
                this.f24740e = gVar.f24735e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f24731a == gVar.f24731a && this.f24732b == gVar.f24732b && this.f24733c == gVar.f24733c && this.f24734d == gVar.f24734d && this.f24735e == gVar.f24735e;
        }

        public int hashCode() {
            long j10 = this.f24731a;
            long j11 = this.f24732b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f24733c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f24734d;
            int floatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f24735e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        public g(a aVar) {
            this(aVar.f24736a, aVar.f24737b, aVar.f24738c, aVar.f24739d, aVar.f24740e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f24731a = j10;
            this.f24732b = j11;
            this.f24733c = j12;
            this.f24734d = f10;
            this.f24735e = f11;
        }
    }

    public static final class h {

        /* renamed from: k, reason: collision with root package name */
        public static final String f24741k = Z.K0(0);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24742l = Z.K0(1);

        /* renamed from: m, reason: collision with root package name */
        public static final String f24743m = Z.K0(2);

        /* renamed from: n, reason: collision with root package name */
        public static final String f24744n = Z.K0(3);

        /* renamed from: o, reason: collision with root package name */
        public static final String f24745o = Z.K0(4);

        /* renamed from: p, reason: collision with root package name */
        public static final String f24746p = Z.K0(5);

        /* renamed from: q, reason: collision with root package name */
        public static final String f24747q = Z.K0(6);

        /* renamed from: r, reason: collision with root package name */
        public static final String f24748r = Z.K0(7);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f24749a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24750b;

        /* renamed from: c, reason: collision with root package name */
        public final f f24751c;

        /* renamed from: d, reason: collision with root package name */
        public final b f24752d;

        /* renamed from: e, reason: collision with root package name */
        public final List f24753e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24754f;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC3445z f24755g;

        /* renamed from: h, reason: collision with root package name */
        public final List f24756h;

        /* renamed from: i, reason: collision with root package name */
        public final Object f24757i;

        /* renamed from: j, reason: collision with root package name */
        public final long f24758j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f24749a.equals(hVar.f24749a) && Objects.equals(this.f24750b, hVar.f24750b) && Objects.equals(this.f24751c, hVar.f24751c) && Objects.equals(this.f24752d, hVar.f24752d) && this.f24753e.equals(hVar.f24753e) && Objects.equals(this.f24754f, hVar.f24754f) && this.f24755g.equals(hVar.f24755g) && Objects.equals(this.f24757i, hVar.f24757i) && this.f24758j == hVar.f24758j;
        }

        public int hashCode() {
            int hashCode = this.f24749a.hashCode() * 31;
            String str = this.f24750b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f24751c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f24753e.hashCode()) * 31;
            String str2 = this.f24754f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24755g.hashCode()) * 31;
            return (int) (((hashCode4 + (this.f24757i != null ? r1.hashCode() : 0)) * 31) + this.f24758j);
        }

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC3445z abstractC3445z, Object obj, long j10) {
            this.f24749a = uri;
            this.f24750b = AbstractC2335D.u(str);
            this.f24751c = fVar;
            this.f24752d = bVar;
            this.f24753e = list;
            this.f24754f = str2;
            this.f24755g = abstractC3445z;
            AbstractC3445z.a k10 = AbstractC3445z.k();
            for (int i10 = 0; i10 < abstractC3445z.size(); i10++) {
                k10.a(((k) abstractC3445z.get(i10)).a().j());
            }
            this.f24756h = k10.m();
            this.f24757i = obj;
            this.f24758j = j10;
        }
    }

    public static final class i {

        /* renamed from: d, reason: collision with root package name */
        public static final i f24759d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        public static final String f24760e = Z.K0(0);

        /* renamed from: f, reason: collision with root package name */
        public static final String f24761f = Z.K0(1);

        /* renamed from: g, reason: collision with root package name */
        public static final String f24762g = Z.K0(2);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f24763a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24764b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f24765c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f24766a;

            /* renamed from: b, reason: collision with root package name */
            public String f24767b;

            /* renamed from: c, reason: collision with root package name */
            public Bundle f24768c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f24763a, iVar.f24763a) && Objects.equals(this.f24764b, iVar.f24764b)) {
                if ((this.f24765c == null) == (iVar.f24765c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f24763a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f24764b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f24765c != null ? 1 : 0);
        }

        public i(a aVar) {
            this.f24763a = aVar.f24766a;
            this.f24764b = aVar.f24767b;
            this.f24765c = aVar.f24768c;
        }
    }

    public static final class j extends k {
        public j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* renamed from: h, reason: collision with root package name */
        public static final String f24769h = Z.K0(0);

        /* renamed from: i, reason: collision with root package name */
        public static final String f24770i = Z.K0(1);

        /* renamed from: j, reason: collision with root package name */
        public static final String f24771j = Z.K0(2);

        /* renamed from: k, reason: collision with root package name */
        public static final String f24772k = Z.K0(3);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24773l = Z.K0(4);

        /* renamed from: m, reason: collision with root package name */
        public static final String f24774m = Z.K0(5);

        /* renamed from: n, reason: collision with root package name */
        public static final String f24775n = Z.K0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f24776a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24777b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24778c;

        /* renamed from: d, reason: collision with root package name */
        public final int f24779d;

        /* renamed from: e, reason: collision with root package name */
        public final int f24780e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24781f;

        /* renamed from: g, reason: collision with root package name */
        public final String f24782g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f24783a;

            /* renamed from: b, reason: collision with root package name */
            public String f24784b;

            /* renamed from: c, reason: collision with root package name */
            public String f24785c;

            /* renamed from: d, reason: collision with root package name */
            public int f24786d;

            /* renamed from: e, reason: collision with root package name */
            public int f24787e;

            /* renamed from: f, reason: collision with root package name */
            public String f24788f;

            /* renamed from: g, reason: collision with root package name */
            public String f24789g;

            public k i() {
                return new k(this);
            }

            public final j j() {
                return new j(this);
            }

            public a k(String str) {
                this.f24789g = str;
                return this;
            }

            public a l(String str) {
                this.f24788f = str;
                return this;
            }

            public a m(String str) {
                this.f24785c = str;
                return this;
            }

            public a n(String str) {
                this.f24784b = AbstractC2335D.u(str);
                return this;
            }

            public a o(int i10) {
                this.f24787e = i10;
                return this;
            }

            public a p(int i10) {
                this.f24786d = i10;
                return this;
            }

            public a(Uri uri) {
                this.f24783a = uri;
            }

            public a(k kVar) {
                this.f24783a = kVar.f24776a;
                this.f24784b = kVar.f24777b;
                this.f24785c = kVar.f24778c;
                this.f24786d = kVar.f24779d;
                this.f24787e = kVar.f24780e;
                this.f24788f = kVar.f24781f;
                this.f24789g = kVar.f24782g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f24776a.equals(kVar.f24776a) && Objects.equals(this.f24777b, kVar.f24777b) && Objects.equals(this.f24778c, kVar.f24778c) && this.f24779d == kVar.f24779d && this.f24780e == kVar.f24780e && Objects.equals(this.f24781f, kVar.f24781f) && Objects.equals(this.f24782g, kVar.f24782g);
        }

        public int hashCode() {
            int hashCode = this.f24776a.hashCode() * 31;
            String str = this.f24777b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24778c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24779d) * 31) + this.f24780e) * 31;
            String str3 = this.f24781f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24782g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public k(a aVar) {
            this.f24776a = aVar.f24783a;
            this.f24777b = aVar.f24784b;
            this.f24778c = aVar.f24785c;
            this.f24779d = aVar.f24786d;
            this.f24780e = aVar.f24787e;
            this.f24781f = aVar.f24788f;
            this.f24782g = aVar.f24789g;
        }
    }

    public static z b(Uri uri) {
        return new c().i(uri).a();
    }

    public static z c(String str) {
        return new c().j(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Objects.equals(this.f24654a, zVar.f24654a) && this.f24659f.equals(zVar.f24659f) && Objects.equals(this.f24655b, zVar.f24655b) && Objects.equals(this.f24657d, zVar.f24657d) && Objects.equals(this.f24658e, zVar.f24658e) && Objects.equals(this.f24661h, zVar.f24661h);
    }

    public int hashCode() {
        int hashCode = this.f24654a.hashCode() * 31;
        h hVar = this.f24655b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f24657d.hashCode()) * 31) + this.f24659f.hashCode()) * 31) + this.f24658e.hashCode()) * 31) + this.f24661h.hashCode();
    }

    public z(String str, e eVar, h hVar, g gVar, C2333B c2333b, i iVar) {
        this.f24654a = str;
        this.f24655b = hVar;
        this.f24656c = hVar;
        this.f24657d = gVar;
        this.f24658e = c2333b;
        this.f24659f = eVar;
        this.f24660g = eVar;
        this.f24661h = iVar;
    }
}
