package j3;

import android.net.Uri;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.AbstractC5881z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import ru.ozon.app.android.video.player.performance.PlayerNamespace;

/* renamed from: j3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7275q {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f69182g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f69183a;

    /* renamed from: b, reason: collision with root package name */
    public final f f69184b;

    /* renamed from: c, reason: collision with root package name */
    public final e f69185c;

    /* renamed from: d, reason: collision with root package name */
    public final s f69186d;

    /* renamed from: e, reason: collision with root package name */
    public final c f69187e;

    /* renamed from: f, reason: collision with root package name */
    public final g f69188f;

    /* renamed from: j3.q$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f69202a;

        /* renamed from: b, reason: collision with root package name */
        public final long f69203b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f69204c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f69205d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f69206e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f69207f;

        static {
            new b(new a());
            Pk0.h.f(0, 1, 2, 3, 4);
            m3.N.L(5);
            m3.N.L(6);
            m3.N.L(7);
        }

        b(a aVar) {
            long unused = aVar.f69208a;
            int i11 = m3.N.f74289a;
            long unused2 = aVar.f69209b;
            this.f69202a = aVar.f69208a;
            this.f69203b = aVar.f69209b;
            this.f69204c = aVar.f69210c;
            this.f69205d = aVar.f69211d;
            this.f69206e = aVar.f69212e;
            this.f69207f = aVar.f69213f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f69202a == bVar.f69202a && this.f69203b == bVar.f69203b && this.f69204c == bVar.f69204c && this.f69205d == bVar.f69205d && this.f69206e == bVar.f69206e && this.f69207f == bVar.f69207f;
        }

        public final int hashCode() {
            long j11 = this.f69202a;
            int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
            long j12 = this.f69203b;
            return ((((((((i11 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.f69204c ? 1 : 0)) * 31) + (this.f69205d ? 1 : 0)) * 31) + (this.f69206e ? 1 : 0)) * 31) + (this.f69207f ? 1 : 0);
        }

        /* renamed from: j3.q$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f69208a;

            /* renamed from: b, reason: collision with root package name */
            private long f69209b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f69210c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f69211d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f69212e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f69213f;

            public a() {
                this.f69209b = Long.MIN_VALUE;
            }

            a(c cVar) {
                this.f69208a = cVar.f69202a;
                this.f69209b = cVar.f69203b;
                this.f69210c = cVar.f69204c;
                this.f69211d = cVar.f69205d;
                this.f69212e = cVar.f69206e;
                this.f69213f = cVar.f69207f;
            }
        }
    }

    @Deprecated
    /* renamed from: j3.q$c */
    public static final class c extends b {
        static {
            new c(new b.a());
        }
    }

    /* renamed from: j3.q$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f69240a;

        /* renamed from: b, reason: collision with root package name */
        public final String f69241b;

        /* renamed from: c, reason: collision with root package name */
        public final d f69242c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C7251G> f69243d;

        /* renamed from: e, reason: collision with root package name */
        public final String f69244e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC5880y<i> f69245f;

        /* renamed from: g, reason: collision with root package name */
        public final PlayerNamespace f69246g;

        /* renamed from: h, reason: collision with root package name */
        public final long f69247h;

        static {
            Pk0.h.f(0, 1, 2, 3, 4);
            m3.N.L(5);
            m3.N.L(6);
            m3.N.L(7);
        }

        private f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(Uri uri, String str, d dVar, List list, String str2, AbstractC5880y abstractC5880y, PlayerNamespace playerNamespace, long j11) {
            this.f69240a = uri;
            this.f69241b = u.m(str);
            this.f69242c = dVar;
            this.f69243d = list;
            this.f69244e = str2;
            this.f69245f = abstractC5880y;
            int i11 = AbstractC5880y.f59142c;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            for (int i12 = 0; i12 < abstractC5880y.size(); i12++) {
                i iVar = (i) abstractC5880y.get(i12);
                iVar.getClass();
                aVar.e(i.a.a(new i.a(iVar)));
            }
            aVar.j();
            this.f69246g = playerNamespace;
            this.f69247h = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f69240a.equals(fVar.f69240a) && Objects.equals(this.f69241b, fVar.f69241b) && Objects.equals(this.f69242c, fVar.f69242c) && this.f69243d.equals(fVar.f69243d) && Objects.equals(this.f69244e, fVar.f69244e) && this.f69245f.equals(fVar.f69245f) && Objects.equals(this.f69246g, fVar.f69246g) && this.f69247h == fVar.f69247h;
        }

        public final int hashCode() {
            int hashCode = this.f69240a.hashCode() * 31;
            String str = this.f69241b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f69242c;
            int hashCode3 = (this.f69243d.hashCode() + ((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 961)) * 31;
            String str2 = this.f69244e;
            int hashCode4 = (this.f69245f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            return (int) (((hashCode4 + (this.f69246g != null ? r2.hashCode() : 0)) * 31) + this.f69247h);
        }
    }

    /* renamed from: j3.q$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f69248a = new g();

        static {
            m3.N.L(0);
            m3.N.L(1);
            m3.N.L(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Deprecated
    /* renamed from: j3.q$h */
    /* loaded from: classes8.dex */
    public static final class h extends i {
    }

    /* renamed from: j3.q$i */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f69249a;

        /* renamed from: b, reason: collision with root package name */
        public final String f69250b;

        /* renamed from: c, reason: collision with root package name */
        public final String f69251c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69252d;

        /* renamed from: e, reason: collision with root package name */
        public final int f69253e;

        /* renamed from: f, reason: collision with root package name */
        public final String f69254f;

        /* renamed from: g, reason: collision with root package name */
        public final String f69255g;

        /* renamed from: j3.q$i$a */
        /* loaded from: classes8.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f69256a;

            /* renamed from: b, reason: collision with root package name */
            private String f69257b;

            /* renamed from: c, reason: collision with root package name */
            private String f69258c;

            /* renamed from: d, reason: collision with root package name */
            private int f69259d;

            /* renamed from: e, reason: collision with root package name */
            private int f69260e;

            /* renamed from: f, reason: collision with root package name */
            private String f69261f;

            /* renamed from: g, reason: collision with root package name */
            private String f69262g;

            a(i iVar) {
                this.f69256a = iVar.f69249a;
                this.f69257b = iVar.f69250b;
                this.f69258c = iVar.f69251c;
                this.f69259d = iVar.f69252d;
                this.f69260e = iVar.f69253e;
                this.f69261f = iVar.f69254f;
                this.f69262g = iVar.f69255g;
            }

            static h a(a aVar) {
                return new h(aVar);
            }
        }

        static {
            Pk0.h.f(0, 1, 2, 3, 4);
            m3.N.L(5);
            m3.N.L(6);
        }

        i(a aVar) {
            this.f69249a = aVar.f69256a;
            this.f69250b = aVar.f69257b;
            this.f69251c = aVar.f69258c;
            this.f69252d = aVar.f69259d;
            this.f69253e = aVar.f69260e;
            this.f69254f = aVar.f69261f;
            this.f69255g = aVar.f69262g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f69249a.equals(iVar.f69249a) && Objects.equals(this.f69250b, iVar.f69250b) && Objects.equals(this.f69251c, iVar.f69251c) && this.f69252d == iVar.f69252d && this.f69253e == iVar.f69253e && Objects.equals(this.f69254f, iVar.f69254f) && Objects.equals(this.f69255g, iVar.f69255g);
        }

        public final int hashCode() {
            int hashCode = this.f69249a.hashCode() * 31;
            String str = this.f69250b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f69251c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f69252d) * 31) + this.f69253e) * 31;
            String str3 = this.f69254f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f69255g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    static {
        new a().a();
        m3.N.L(0);
        m3.N.L(1);
        m3.N.L(2);
        m3.N.L(3);
        m3.N.L(4);
        m3.N.L(5);
    }

    C7275q(String str, c cVar, f fVar, e eVar, s sVar, g gVar) {
        this.f69183a = str;
        this.f69184b = fVar;
        this.f69185c = eVar;
        this.f69186d = sVar;
        this.f69187e = cVar;
        this.f69188f = gVar;
    }

    public final a a() {
        return new a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7275q)) {
            return false;
        }
        C7275q c7275q = (C7275q) obj;
        return Objects.equals(this.f69183a, c7275q.f69183a) && this.f69187e.equals(c7275q.f69187e) && Objects.equals(this.f69184b, c7275q.f69184b) && this.f69185c.equals(c7275q.f69185c) && Objects.equals(this.f69186d, c7275q.f69186d) && Objects.equals(this.f69188f, c7275q.f69188f);
    }

    public final int hashCode() {
        int hashCode = this.f69183a.hashCode() * 31;
        f fVar = this.f69184b;
        int hashCode2 = (this.f69186d.hashCode() + ((this.f69187e.hashCode() + ((this.f69185c.hashCode() + ((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f69188f.getClass();
        return hashCode2;
    }

    /* renamed from: j3.q$d */
    /* loaded from: classes8.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f69214a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f69215b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC5881z<String, String> f69216c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f69217d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f69218e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f69219f;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC5880y<Integer> f69220g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f69221h;

        static {
            Pk0.h.f(0, 1, 2, 3, 4);
            m3.N.L(5);
            m3.N.L(6);
            m3.N.L(7);
        }

        d(a aVar) {
            G10.a.h((aVar.f69227f && aVar.f69223b == null) ? false : true);
            UUID uuid = aVar.f69222a;
            uuid.getClass();
            this.f69214a = uuid;
            this.f69215b = aVar.f69223b;
            AbstractC5881z unused = aVar.f69224c;
            this.f69216c = aVar.f69224c;
            this.f69217d = aVar.f69225d;
            this.f69219f = aVar.f69227f;
            this.f69218e = aVar.f69226e;
            AbstractC5880y unused2 = aVar.f69228g;
            this.f69220g = aVar.f69228g;
            this.f69221h = aVar.f69229h != null ? Arrays.copyOf(aVar.f69229h, aVar.f69229h.length) : null;
        }

        public final a b() {
            return new a(this);
        }

        public final byte[] c() {
            byte[] bArr = this.f69221h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f69214a.equals(dVar.f69214a) && Objects.equals(this.f69215b, dVar.f69215b) && Objects.equals(this.f69216c, dVar.f69216c) && this.f69217d == dVar.f69217d && this.f69219f == dVar.f69219f && this.f69218e == dVar.f69218e && this.f69220g.equals(dVar.f69220g) && Arrays.equals(this.f69221h, dVar.f69221h);
        }

        public final int hashCode() {
            int hashCode = this.f69214a.hashCode() * 31;
            Uri uri = this.f69215b;
            return Arrays.hashCode(this.f69221h) + ((this.f69220g.hashCode() + ((((((((this.f69216c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f69217d ? 1 : 0)) * 31) + (this.f69219f ? 1 : 0)) * 31) + (this.f69218e ? 1 : 0)) * 31)) * 31);
        }

        /* renamed from: j3.q$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f69222a;

            /* renamed from: b, reason: collision with root package name */
            private Uri f69223b;

            /* renamed from: c, reason: collision with root package name */
            private AbstractC5881z<String, String> f69224c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f69225d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f69226e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f69227f;

            /* renamed from: g, reason: collision with root package name */
            private AbstractC5880y<Integer> f69228g;

            /* renamed from: h, reason: collision with root package name */
            private byte[] f69229h;

            a() {
                this.f69224c = AbstractC5881z.p();
                this.f69226e = true;
                this.f69228g = AbstractC5880y.v();
            }

            a(d dVar) {
                this.f69222a = dVar.f69214a;
                this.f69223b = dVar.f69215b;
                this.f69224c = dVar.f69216c;
                this.f69225d = dVar.f69217d;
                this.f69226e = dVar.f69218e;
                this.f69227f = dVar.f69219f;
                this.f69228g = dVar.f69220g;
                this.f69229h = dVar.f69221h;
            }
        }
    }

    /* renamed from: j3.q$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f69230a;

        /* renamed from: b, reason: collision with root package name */
        public final long f69231b;

        /* renamed from: c, reason: collision with root package name */
        public final long f69232c;

        /* renamed from: d, reason: collision with root package name */
        public final float f69233d;

        /* renamed from: e, reason: collision with root package name */
        public final float f69234e;

        static {
            new a().f();
            m3.N.L(0);
            m3.N.L(1);
            m3.N.L(2);
            m3.N.L(3);
            m3.N.L(4);
        }

        e(a aVar) {
            long j11 = aVar.f69235a;
            long j12 = aVar.f69236b;
            long j13 = aVar.f69237c;
            float f7 = aVar.f69238d;
            float f11 = aVar.f69239e;
            this.f69230a = j11;
            this.f69231b = j12;
            this.f69232c = j13;
            this.f69233d = f7;
            this.f69234e = f11;
        }

        public final a a() {
            return new a(this);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f69230a == eVar.f69230a && this.f69231b == eVar.f69231b && this.f69232c == eVar.f69232c && this.f69233d == eVar.f69233d && this.f69234e == eVar.f69234e;
        }

        public final int hashCode() {
            long j11 = this.f69230a;
            long j12 = this.f69231b;
            int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f69232c;
            int i12 = (i11 + ((int) ((j13 >>> 32) ^ j13))) * 31;
            float f7 = this.f69233d;
            int floatToIntBits = (i12 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f11 = this.f69234e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        /* renamed from: j3.q$e$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f69235a;

            /* renamed from: b, reason: collision with root package name */
            private long f69236b;

            /* renamed from: c, reason: collision with root package name */
            private long f69237c;

            /* renamed from: d, reason: collision with root package name */
            private float f69238d;

            /* renamed from: e, reason: collision with root package name */
            private float f69239e;

            public a() {
                this.f69235a = -9223372036854775807L;
                this.f69236b = -9223372036854775807L;
                this.f69237c = -9223372036854775807L;
                this.f69238d = -3.4028235E38f;
                this.f69239e = -3.4028235E38f;
            }

            public final e f() {
                return new e(this);
            }

            public final void g(long j11) {
                this.f69237c = j11;
            }

            public final void h(float f7) {
                this.f69239e = f7;
            }

            public final void i(long j11) {
                this.f69236b = j11;
            }

            public final void j(float f7) {
                this.f69238d = f7;
            }

            public final void k(long j11) {
                this.f69235a = j11;
            }

            a(e eVar) {
                this.f69235a = eVar.f69230a;
                this.f69236b = eVar.f69231b;
                this.f69237c = eVar.f69232c;
                this.f69238d = eVar.f69233d;
                this.f69239e = eVar.f69234e;
            }
        }
    }

    /* renamed from: j3.q$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f69189a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f69190b;

        /* renamed from: c, reason: collision with root package name */
        private String f69191c;

        /* renamed from: d, reason: collision with root package name */
        private b.a f69192d;

        /* renamed from: e, reason: collision with root package name */
        private d.a f69193e;

        /* renamed from: f, reason: collision with root package name */
        private List<C7251G> f69194f;

        /* renamed from: g, reason: collision with root package name */
        private String f69195g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC5880y<i> f69196h;

        /* renamed from: i, reason: collision with root package name */
        private PlayerNamespace f69197i;

        /* renamed from: j, reason: collision with root package name */
        private long f69198j;

        /* renamed from: k, reason: collision with root package name */
        private s f69199k;

        /* renamed from: l, reason: collision with root package name */
        private e.a f69200l;

        /* renamed from: m, reason: collision with root package name */
        private g f69201m;

        public a() {
            this.f69192d = new b.a();
            this.f69193e = new d.a();
            this.f69194f = Collections.EMPTY_LIST;
            this.f69196h = AbstractC5880y.v();
            this.f69200l = new e.a();
            this.f69201m = g.f69248a;
            this.f69198j = -9223372036854775807L;
        }

        public final C7275q a() {
            f fVar;
            d dVar;
            G10.a.h(this.f69193e.f69223b == null || this.f69193e.f69222a != null);
            Uri uri = this.f69190b;
            if (uri != null) {
                String str = this.f69191c;
                if (this.f69193e.f69222a != null) {
                    d.a aVar = this.f69193e;
                    aVar.getClass();
                    dVar = new d(aVar);
                } else {
                    dVar = null;
                }
                fVar = new f(uri, str, dVar, this.f69194f, this.f69195g, this.f69196h, this.f69197i, this.f69198j);
            } else {
                fVar = null;
            }
            String str2 = this.f69189a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar2 = this.f69192d;
            aVar2.getClass();
            c cVar = new c(aVar2);
            e.a aVar3 = this.f69200l;
            aVar3.getClass();
            e eVar = new e(aVar3);
            s sVar = this.f69199k;
            if (sVar == null) {
                sVar = s.f69265I;
            }
            return new C7275q(str3, cVar, fVar, eVar, sVar, this.f69201m);
        }

        public final void b(String str) {
            this.f69195g = str;
        }

        public final void c(e eVar) {
            this.f69200l = new e.a(eVar);
        }

        public final void d(String str) {
            str.getClass();
            this.f69189a = str;
        }

        public final void e(String str) {
            this.f69191c = str;
        }

        public final void f(List list) {
            this.f69194f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
        }

        public final void g(List list) {
            this.f69196h = AbstractC5880y.n(list);
        }

        public final void h(PlayerNamespace playerNamespace) {
            this.f69197i = playerNamespace;
        }

        public final void i(Uri uri) {
            this.f69190b = uri;
        }

        public final void j(String str) {
            this.f69190b = str == null ? null : Uri.parse(str);
        }

        a(C7275q c7275q) {
            this();
            d.a aVar;
            this.f69192d = new b.a(c7275q.f69187e);
            this.f69189a = c7275q.f69183a;
            this.f69199k = c7275q.f69186d;
            this.f69200l = new e.a(c7275q.f69185c);
            this.f69201m = c7275q.f69188f;
            f fVar = c7275q.f69184b;
            if (fVar != null) {
                this.f69195g = fVar.f69244e;
                this.f69191c = fVar.f69241b;
                this.f69190b = fVar.f69240a;
                this.f69194f = fVar.f69243d;
                this.f69196h = fVar.f69245f;
                this.f69197i = fVar.f69246g;
                d dVar = fVar.f69242c;
                if (dVar != null) {
                    aVar = dVar.b();
                } else {
                    aVar = new d.a();
                }
                this.f69193e = aVar;
                this.f69198j = fVar.f69247h;
            }
        }
    }
}
