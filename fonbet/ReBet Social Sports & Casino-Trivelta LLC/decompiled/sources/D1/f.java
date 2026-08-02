package D1;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2335D;
import b1.P;
import com.google.common.collect.A;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import com.google.common.collect.C3427g;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import e1.U;
import e1.Z;
import h1.C4418n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final Ra.g f2347f = Ra.g.g(",");

    /* renamed from: a, reason: collision with root package name */
    public final b f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2349b;

    /* renamed from: c, reason: collision with root package name */
    public final d f2350c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2352e;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2353a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2354b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2355c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2356d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC3445z f2357e;

        public static final class a {

            /* renamed from: d, reason: collision with root package name */
            public String f2361d;

            /* renamed from: a, reason: collision with root package name */
            public int f2358a = -2147483647;

            /* renamed from: b, reason: collision with root package name */
            public int f2359b = -2147483647;

            /* renamed from: c, reason: collision with root package name */
            public long f2360c = -9223372036854775807L;

            /* renamed from: e, reason: collision with root package name */
            public AbstractC3445z f2362e = AbstractC3445z.t();

            public b f() {
                return new b(this);
            }

            public a g(int i10) {
                AbstractC4134a.a(i10 >= 0 || i10 == -2147483647);
                this.f2358a = i10;
                return this;
            }

            public a h(List list) {
                this.f2362e = AbstractC3445z.o(list);
                return this;
            }

            public a i(long j10) {
                AbstractC4134a.a(j10 >= 0 || j10 == -9223372036854775807L);
                this.f2360c = j10;
                return this;
            }

            public a j(String str) {
                this.f2361d = str;
                return this;
            }

            public a k(int i10) {
                AbstractC4134a.a(i10 >= 0 || i10 == -2147483647);
                this.f2359b = i10;
                return this;
            }
        }

        public void a(C3427g c3427g) {
            ArrayList arrayList = new ArrayList();
            if (this.f2353a != -2147483647) {
                arrayList.add("br=" + this.f2353a);
            }
            if (this.f2354b != -2147483647) {
                arrayList.add("tb=" + this.f2354b);
            }
            if (this.f2355c != -9223372036854775807L) {
                arrayList.add("d=" + this.f2355c);
            }
            if (!TextUtils.isEmpty(this.f2356d)) {
                arrayList.add("ot=" + this.f2356d);
            }
            arrayList.addAll(this.f2357e);
            if (arrayList.isEmpty()) {
                return;
            }
            c3427g.k("CMCD-Object", arrayList);
        }

        public b(a aVar) {
            this.f2353a = aVar.f2358a;
            this.f2354b = aVar.f2359b;
            this.f2355c = aVar.f2360c;
            this.f2356d = aVar.f2361d;
            this.f2357e = aVar.f2362e;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f2363a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2364b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2365c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2366d;

        /* renamed from: e, reason: collision with root package name */
        public final String f2367e;

        /* renamed from: f, reason: collision with root package name */
        public final String f2368f;

        /* renamed from: g, reason: collision with root package name */
        public final AbstractC3445z f2369g;

        public static final class a {

            /* renamed from: d, reason: collision with root package name */
            public boolean f2373d;

            /* renamed from: e, reason: collision with root package name */
            public String f2374e;

            /* renamed from: f, reason: collision with root package name */
            public String f2375f;

            /* renamed from: a, reason: collision with root package name */
            public long f2370a = -9223372036854775807L;

            /* renamed from: b, reason: collision with root package name */
            public long f2371b = -2147483647L;

            /* renamed from: c, reason: collision with root package name */
            public long f2372c = -9223372036854775807L;

            /* renamed from: g, reason: collision with root package name */
            public AbstractC3445z f2376g = AbstractC3445z.t();

            public c h() {
                return new c(this);
            }

            public a i(long j10) {
                if (j10 == -9223372036854775807L) {
                    this.f2370a = j10;
                    return this;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f2370a = ((j10 + 50) / 100) * 100;
                return this;
            }

            public a j(List list) {
                this.f2376g = AbstractC3445z.o(list);
                return this;
            }

            public a k(long j10) {
                if (j10 == -9223372036854775807L) {
                    this.f2372c = j10;
                    return this;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f2372c = ((j10 + 50) / 100) * 100;
                return this;
            }

            public a l(long j10) {
                if (j10 == -2147483647L) {
                    this.f2371b = j10;
                    return this;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException();
                }
                this.f2371b = ((j10 + 50) / 100) * 100;
                return this;
            }

            public a m(String str) {
                this.f2374e = str == null ? null : Uri.encode(str);
                return this;
            }

            public a n(String str) {
                this.f2375f = str;
                return this;
            }

            public a o(boolean z10) {
                this.f2373d = z10;
                return this;
            }
        }

        public void a(C3427g c3427g) {
            ArrayList arrayList = new ArrayList();
            if (this.f2363a != -9223372036854775807L) {
                arrayList.add("bl=" + this.f2363a);
            }
            if (this.f2364b != -2147483647L) {
                arrayList.add("mtp=" + this.f2364b);
            }
            if (this.f2365c != -9223372036854775807L) {
                arrayList.add("dl=" + this.f2365c);
            }
            if (this.f2366d) {
                arrayList.add("su");
            }
            if (!TextUtils.isEmpty(this.f2367e)) {
                arrayList.add(Z.G("%s=\"%s\"", "nor", this.f2367e));
            }
            if (!TextUtils.isEmpty(this.f2368f)) {
                arrayList.add(Z.G("%s=\"%s\"", "nrr", this.f2368f));
            }
            arrayList.addAll(this.f2369g);
            if (arrayList.isEmpty()) {
                return;
            }
            c3427g.k("CMCD-Request", arrayList);
        }

        public c(a aVar) {
            this.f2363a = aVar.f2370a;
            this.f2364b = aVar.f2371b;
            this.f2365c = aVar.f2372c;
            this.f2366d = aVar.f2373d;
            this.f2367e = aVar.f2374e;
            this.f2368f = aVar.f2375f;
            this.f2369g = aVar.f2376g;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f2377a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2378b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2379c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2380d;

        /* renamed from: e, reason: collision with root package name */
        public final float f2381e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC3445z f2382f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public String f2383a;

            /* renamed from: b, reason: collision with root package name */
            public String f2384b;

            /* renamed from: c, reason: collision with root package name */
            public String f2385c;

            /* renamed from: d, reason: collision with root package name */
            public String f2386d;

            /* renamed from: e, reason: collision with root package name */
            public float f2387e = -3.4028235E38f;

            /* renamed from: f, reason: collision with root package name */
            public AbstractC3445z f2388f = AbstractC3445z.t();

            public d g() {
                return new d(this);
            }

            public a h(String str) {
                AbstractC4134a.a(str == null || str.length() <= 64);
                this.f2383a = str;
                return this;
            }

            public a i(List list) {
                this.f2388f = AbstractC3445z.o(list);
                return this;
            }

            public a j(float f10) {
                AbstractC4134a.a(f10 > 0.0f || f10 == -3.4028235E38f);
                this.f2387e = f10;
                return this;
            }

            public a k(String str) {
                AbstractC4134a.a(str == null || str.length() <= 64);
                this.f2384b = str;
                return this;
            }

            public a l(String str) {
                this.f2386d = str;
                return this;
            }

            public a m(String str) {
                this.f2385c = str;
                return this;
            }
        }

        public void a(C3427g c3427g) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f2377a)) {
                arrayList.add(Z.G("%s=\"%s\"", "cid", this.f2377a));
            }
            if (!TextUtils.isEmpty(this.f2378b)) {
                arrayList.add(Z.G("%s=\"%s\"", "sid", this.f2378b));
            }
            if (!TextUtils.isEmpty(this.f2379c)) {
                arrayList.add("sf=" + this.f2379c);
            }
            if (!TextUtils.isEmpty(this.f2380d)) {
                arrayList.add("st=" + this.f2380d);
            }
            float f10 = this.f2381e;
            if (f10 != -3.4028235E38f && f10 != 1.0f) {
                arrayList.add(Z.G("%s=%.2f", "pr", Float.valueOf(f10)));
            }
            arrayList.addAll(this.f2382f);
            if (arrayList.isEmpty()) {
                return;
            }
            c3427g.k("CMCD-Session", arrayList);
        }

        public d(a aVar) {
            this.f2377a = aVar.f2383a;
            this.f2378b = aVar.f2384b;
            this.f2379c = aVar.f2385c;
            this.f2380d = aVar.f2386d;
            this.f2381e = aVar.f2387e;
            this.f2382f = aVar.f2388f;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f2389a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2390b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC3445z f2391c;

        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f2393b;

            /* renamed from: a, reason: collision with root package name */
            public int f2392a = -2147483647;

            /* renamed from: c, reason: collision with root package name */
            public AbstractC3445z f2394c = AbstractC3445z.t();

            public e d() {
                return new e(this);
            }

            public a e(boolean z10) {
                this.f2393b = z10;
                return this;
            }

            public a f(List list) {
                this.f2394c = AbstractC3445z.o(list);
                return this;
            }

            public a g(int i10) {
                AbstractC4134a.a(i10 >= 0 || i10 == -2147483647);
                if (i10 != -2147483647) {
                    i10 = ((i10 + 50) / 100) * 100;
                }
                this.f2392a = i10;
                return this;
            }
        }

        public void a(C3427g c3427g) {
            ArrayList arrayList = new ArrayList();
            if (this.f2389a != -2147483647) {
                arrayList.add("rtp=" + this.f2389a);
            }
            if (this.f2390b) {
                arrayList.add("bs");
            }
            arrayList.addAll(this.f2391c);
            if (arrayList.isEmpty()) {
                return;
            }
            c3427g.k("CMCD-Status", arrayList);
        }

        public e(a aVar) {
            this.f2389a = aVar.f2392a;
            this.f2390b = aVar.f2393b;
            this.f2391c = aVar.f2394c;
        }
    }

    /* renamed from: D1.f$f, reason: collision with other inner class name */
    public static final class C0047f {

        /* renamed from: m, reason: collision with root package name */
        public static final Pattern f2395m = Pattern.compile(".*-.*");

        /* renamed from: a, reason: collision with root package name */
        public final D1.e f2396a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2397b;

        /* renamed from: c, reason: collision with root package name */
        public y f2398c;

        /* renamed from: f, reason: collision with root package name */
        public Boolean f2401f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2402g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2403h;

        /* renamed from: j, reason: collision with root package name */
        public String f2405j;

        /* renamed from: k, reason: collision with root package name */
        public String f2406k;

        /* renamed from: l, reason: collision with root package name */
        public String f2407l;

        /* renamed from: d, reason: collision with root package name */
        public long f2399d = -9223372036854775807L;

        /* renamed from: e, reason: collision with root package name */
        public float f2400e = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public long f2404i = -9223372036854775807L;

        public C0047f(D1.e eVar, String str) {
            this.f2396a = eVar;
            this.f2397b = str;
        }

        public static String b(androidx.media3.common.a aVar) {
            String c10 = AbstractC2335D.c(aVar.f20539k);
            String n10 = AbstractC2335D.n(aVar.f20539k);
            if (c10 != null && n10 != null) {
                return "av";
            }
            int k10 = AbstractC2335D.k(aVar.f20543o);
            if (k10 == -1) {
                k10 = AbstractC2335D.k(aVar.f20542n);
            }
            if (k10 == 1) {
                return "a";
            }
            if (k10 == 2) {
                return "v";
            }
            return null;
        }

        public static boolean c(String str) {
            return Objects.equals(str, X9.m.f13664a);
        }

        public static boolean d(String str) {
            return Objects.equals(str, "a") || Objects.equals(str, "v") || Objects.equals(str, "av");
        }

        public f a() {
            int i10;
            int i11;
            int i12;
            boolean c10 = c(this.f2405j);
            if (!c10) {
                AbstractC4134a.j(this.f2398c, "Track selection must be set");
            }
            if (this.f2405j == null) {
                this.f2405j = b(((y) AbstractC4134a.e(this.f2398c)).r());
            }
            boolean d10 = d(this.f2405j);
            if (d10) {
                AbstractC4134a.h(this.f2399d != -9223372036854775807L, "Buffered duration must be set");
                AbstractC4134a.h(this.f2404i != -9223372036854775807L, "Chunk duration must be set");
            }
            A c11 = this.f2396a.f2345c.c();
            m0 it = c11.s().iterator();
            while (it.hasNext()) {
                o(c11.get((String) it.next()));
            }
            if (c10) {
                i10 = -2147483647;
                i11 = -2147483647;
                i12 = -2147483647;
            } else {
                y yVar = (y) AbstractC4134a.e(this.f2398c);
                int i13 = yVar.r().f20538j;
                i10 = Z.k(i13, 1000);
                P m10 = yVar.m();
                for (int i14 = 0; i14 < m10.f24395a; i14++) {
                    i13 = Math.max(i13, m10.a(i14).f20538j);
                }
                i12 = Z.k(i13, 1000);
                r6 = yVar.a() != -2147483647L ? Z.l(yVar.a(), 1000L) : -2147483647L;
                i11 = this.f2396a.f2345c.b(i10);
            }
            b.a aVar = new b.a();
            if (this.f2396a.a()) {
                aVar.g(i10);
            }
            if (this.f2396a.q()) {
                aVar.k(i12);
            }
            if (d10 && this.f2396a.j()) {
                aVar.i(Z.J1(this.f2404i));
            }
            if (this.f2396a.k()) {
                aVar.j(this.f2405j);
            }
            if (c11.n("CMCD-Object")) {
                aVar.h(c11.get("CMCD-Object"));
            }
            c.a aVar2 = new c.a();
            if (d10) {
                if (this.f2396a.b()) {
                    aVar2.i(Z.J1(this.f2399d));
                }
                if (this.f2396a.e()) {
                    aVar2.k(Z.J1((long) (this.f2399d / this.f2400e)));
                }
            }
            if (this.f2396a.g()) {
                aVar2.l(r6);
            }
            if (this.f2396a.n()) {
                aVar2.o(this.f2402g || this.f2403h);
            }
            if (this.f2396a.h()) {
                aVar2.m(this.f2406k);
            }
            if (this.f2396a.i()) {
                aVar2.n(this.f2407l);
            }
            if (c11.n("CMCD-Request")) {
                aVar2.j(c11.get("CMCD-Request"));
            }
            d.a aVar3 = new d.a();
            if (this.f2396a.d()) {
                aVar3.h(this.f2396a.f2344b);
            }
            if (this.f2396a.m()) {
                aVar3.k(this.f2396a.f2343a);
            }
            if (this.f2396a.p()) {
                aVar3.m(this.f2397b);
            }
            if (this.f2401f != null && this.f2396a.o()) {
                aVar3.l(((Boolean) AbstractC4134a.e(this.f2401f)).booleanValue() ? "l" : "v");
            }
            if (this.f2396a.l()) {
                aVar3.j(this.f2400e);
            }
            if (c11.n("CMCD-Session")) {
                aVar3.i(c11.get("CMCD-Session"));
            }
            e.a aVar4 = new e.a();
            if (this.f2396a.f()) {
                aVar4.g(i11);
            }
            if (this.f2396a.c()) {
                aVar4.e(this.f2402g);
            }
            if (c11.n("CMCD-Status")) {
                aVar4.f(c11.get("CMCD-Status"));
            }
            return new f(aVar.f(), aVar2.h(), aVar3.g(), aVar4.d(), this.f2396a.f2346d);
        }

        public C0047f e(long j10) {
            AbstractC4134a.a(j10 >= 0);
            this.f2399d = j10;
            return this;
        }

        public C0047f f(long j10) {
            AbstractC4134a.a(j10 >= 0);
            this.f2404i = j10;
            return this;
        }

        public C0047f g(boolean z10) {
            this.f2402g = z10;
            return this;
        }

        public C0047f h(boolean z10) {
            this.f2403h = z10;
            return this;
        }

        public C0047f i(boolean z10) {
            this.f2401f = Boolean.valueOf(z10);
            return this;
        }

        public C0047f j(String str) {
            this.f2406k = str;
            return this;
        }

        public C0047f k(String str) {
            this.f2407l = str;
            return this;
        }

        public C0047f l(String str) {
            this.f2405j = str;
            return this;
        }

        public C0047f m(float f10) {
            AbstractC4134a.a(f10 == -3.4028235E38f || f10 > 0.0f);
            this.f2400e = f10;
            return this;
        }

        public C0047f n(y yVar) {
            this.f2398c = yVar;
            return this;
        }

        public final void o(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC4134a.g(f2395m.matcher(Z.A1((String) it.next(), "=")[0]).matches());
            }
        }
    }

    public static Uri b(Uri uri) {
        return uri.getQueryParameter("CMCD") != null ? U.e(uri, "CMCD") : uri;
    }

    public C4418n a(C4418n c4418n) {
        C3427g F10 = C3427g.F();
        this.f2348a.a(F10);
        this.f2349b.a(F10);
        this.f2350c.a(F10);
        this.f2351d.a(F10);
        if (this.f2352e != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = F10.asMap().values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) it.next());
            }
            Collections.sort(arrayList);
            return c4418n.a().i(c4418n.f47554a.buildUpon().appendQueryParameter("CMCD", f2347f.d(arrayList)).build()).a();
        }
        B.a a10 = B.a();
        for (String str : F10.j()) {
            List list = F10.get(str);
            Collections.sort(list);
            a10.f(str, f2347f.d(list));
        }
        return c4418n.g(a10.c());
    }

    public f(b bVar, c cVar, d dVar, e eVar, int i10) {
        this.f2348a = bVar;
        this.f2349b = cVar;
        this.f2350c = dVar;
        this.f2351d = eVar;
        this.f2352e = i10;
    }
}
