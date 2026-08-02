package z3;

import android.net.Uri;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.AbstractC5881z;
import com.google.common.collect.B;
import g.C6594f;
import j3.C7270l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f107022d;

    /* renamed from: e, reason: collision with root package name */
    public final long f107023e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f107024f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f107025g;

    /* renamed from: h, reason: collision with root package name */
    public final long f107026h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f107027i;

    /* renamed from: j, reason: collision with root package name */
    public final int f107028j;

    /* renamed from: k, reason: collision with root package name */
    public final long f107029k;

    /* renamed from: l, reason: collision with root package name */
    public final int f107030l;

    /* renamed from: m, reason: collision with root package name */
    public final long f107031m;

    /* renamed from: n, reason: collision with root package name */
    public final long f107032n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f107033o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f107034p;

    /* renamed from: q, reason: collision with root package name */
    public final C7270l f107035q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC5880y f107036r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC5880y f107037s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC5881z f107038t;

    /* renamed from: u, reason: collision with root package name */
    public final long f107039u;

    /* renamed from: v, reason: collision with root package name */
    public final g f107040v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC5880y<b> f107041w;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f107046a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f107047b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f107048c;

        /* renamed from: d, reason: collision with root package name */
        public final long f107049d;

        /* renamed from: e, reason: collision with root package name */
        public final long f107050e;

        /* renamed from: f, reason: collision with root package name */
        public final long f107051f;

        /* renamed from: g, reason: collision with root package name */
        public final long f107052g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f107053h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f107054i;

        /* renamed from: j, reason: collision with root package name */
        public final long f107055j;

        /* renamed from: k, reason: collision with root package name */
        public final long f107056k;

        /* renamed from: l, reason: collision with root package name */
        public final AbstractC5880y<String> f107057l;

        /* renamed from: m, reason: collision with root package name */
        public final AbstractC5880y<String> f107058m;

        /* renamed from: n, reason: collision with root package name */
        public final AbstractC5880y<a> f107059n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f107060o;

        /* renamed from: p, reason: collision with root package name */
        public final String f107061p;

        /* renamed from: q, reason: collision with root package name */
        public final String f107062q;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final String f107063a;

            /* renamed from: c, reason: collision with root package name */
            private Uri f107065c;

            /* renamed from: d, reason: collision with root package name */
            private Uri f107066d;

            /* renamed from: j, reason: collision with root package name */
            private boolean f107072j;

            /* renamed from: o, reason: collision with root package name */
            private Boolean f107077o;

            /* renamed from: p, reason: collision with root package name */
            private String f107078p;

            /* renamed from: q, reason: collision with root package name */
            private String f107079q;

            /* renamed from: b, reason: collision with root package name */
            private final HashMap f107064b = new HashMap();

            /* renamed from: e, reason: collision with root package name */
            private long f107067e = -9223372036854775807L;

            /* renamed from: f, reason: collision with root package name */
            private long f107068f = -9223372036854775807L;

            /* renamed from: g, reason: collision with root package name */
            private long f107069g = -9223372036854775807L;

            /* renamed from: h, reason: collision with root package name */
            private long f107070h = -9223372036854775807L;

            /* renamed from: i, reason: collision with root package name */
            private ArrayList f107071i = new ArrayList();

            /* renamed from: k, reason: collision with root package name */
            private long f107073k = -9223372036854775807L;

            /* renamed from: l, reason: collision with root package name */
            private long f107074l = -9223372036854775807L;

            /* renamed from: m, reason: collision with root package name */
            private ArrayList f107075m = new ArrayList();

            /* renamed from: n, reason: collision with root package name */
            private ArrayList f107076n = new ArrayList();

            public a(String str) {
                this.f107063a = str;
            }

            public final b a() {
                Uri uri = this.f107066d;
                if ((uri != null || this.f107065c == null) && (uri == null || this.f107065c != null)) {
                    return null;
                }
                long j11 = this.f107067e;
                if (j11 == -9223372036854775807L) {
                    return null;
                }
                Uri uri2 = this.f107065c;
                long j12 = this.f107068f;
                long j13 = this.f107069g;
                long j14 = this.f107070h;
                ArrayList arrayList = this.f107071i;
                boolean z11 = this.f107072j;
                long j15 = this.f107073k;
                long j16 = this.f107074l;
                ArrayList arrayList2 = this.f107075m;
                ArrayList arrayList3 = this.f107076n;
                ArrayList arrayList4 = new ArrayList(this.f107064b.values());
                Boolean bool = this.f107077o;
                boolean z12 = bool == null || bool.booleanValue();
                String str = this.f107078p;
                if (str == null) {
                    str = "POINT";
                }
                String str2 = str;
                String str3 = this.f107079q;
                if (str3 == null) {
                    str3 = "HIGHLIGHT";
                }
                return new b(this.f107063a, uri2, uri, j11, j12, j13, j14, arrayList, z11, j15, j16, arrayList2, arrayList3, arrayList4, z12, str2, str3);
            }

            public final void b(Uri uri) {
                if (uri == null) {
                    return;
                }
                Uri uri2 = this.f107066d;
                if (uri2 != null) {
                    G10.a.b("Can't change assetListUri from " + this.f107066d + " to " + uri, uri2.equals(uri));
                }
                this.f107066d = uri;
            }

            public final void c(Uri uri) {
                if (uri == null) {
                    return;
                }
                Uri uri2 = this.f107065c;
                if (uri2 != null) {
                    G10.a.b("Can't change assetUri from " + this.f107065c + " to " + uri, uri2.equals(uri));
                }
                this.f107065c = uri;
            }

            public final void d(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a aVar = (a) arrayList.get(i11);
                    String str = aVar.f107042a;
                    HashMap hashMap = this.f107064b;
                    a aVar2 = (a) hashMap.get(str);
                    if (aVar2 != null) {
                        boolean equals = aVar2.equals(aVar);
                        StringBuilder b11 = C6594f.b("Can't change ", str, " from ");
                        b11.append(aVar2.f107045d);
                        b11.append(" ");
                        b11.append(aVar2.f107044c);
                        b11.append(" to ");
                        b11.append(aVar.f107045d);
                        b11.append(" ");
                        b11.append(aVar.f107044c);
                        G10.a.b(b11.toString(), equals);
                    }
                    hashMap.put(str, aVar);
                }
            }

            public final void e(Boolean bool) {
                if (bool == null) {
                    return;
                }
                Boolean bool2 = this.f107077o;
                if (bool2 != null) {
                    G10.a.b("Can't change contentMayVary from " + this.f107077o + " to " + bool, bool2.equals(bool));
                }
                this.f107077o = bool;
            }

            public final void f(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!this.f107071i.isEmpty()) {
                    G10.a.b("Can't change cue from " + String.join(", ", this.f107071i) + " to " + String.join(", ", arrayList), this.f107071i.equals(arrayList));
                }
                this.f107071i = arrayList;
            }

            public final void g(long j11) {
                if (j11 == -9223372036854775807L) {
                    return;
                }
                long j12 = this.f107069g;
                if (j12 != -9223372036854775807L) {
                    G10.a.b("Can't change durationUs from " + this.f107069g + " to " + j11, j12 == j11);
                }
                this.f107069g = j11;
            }

            public final void h(long j11) {
                if (j11 == -9223372036854775807L) {
                    return;
                }
                long j12 = this.f107068f;
                if (j12 != -9223372036854775807L) {
                    G10.a.b("Can't change endDateUnixUs from " + this.f107068f + " to " + j11, j12 == j11);
                }
                this.f107068f = j11;
            }

            public final void i(boolean z11) {
                if (z11) {
                    this.f107072j = true;
                }
            }

            public final void j(long j11) {
                if (j11 == -9223372036854775807L) {
                    return;
                }
                long j12 = this.f107070h;
                if (j12 != -9223372036854775807L) {
                    G10.a.b("Can't change plannedDurationUs from " + this.f107070h + " to " + j11, j12 == j11);
                }
                this.f107070h = j11;
            }

            public final void k(long j11) {
                if (j11 == -9223372036854775807L) {
                    return;
                }
                long j12 = this.f107074l;
                if (j12 != -9223372036854775807L) {
                    G10.a.b("Can't change playoutLimitUs from " + this.f107074l + " to " + j11, j12 == j11);
                }
                this.f107074l = j11;
            }

            public final void l(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!this.f107076n.isEmpty()) {
                    G10.a.b("Can't change restrictions from " + String.join(", ", this.f107076n) + " to " + String.join(", ", arrayList), this.f107076n.equals(arrayList));
                }
                this.f107076n = arrayList;
            }

            public final void m(long j11) {
                if (j11 == -9223372036854775807L) {
                    return;
                }
                long j12 = this.f107073k;
                if (j12 != -9223372036854775807L) {
                    G10.a.b("Can't change resumeOffsetUs from " + this.f107073k + " to " + j11, j12 == j11);
                }
                this.f107073k = j11;
            }

            public final void n(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!this.f107075m.isEmpty()) {
                    G10.a.b("Can't change snapTypes from " + String.join(", ", this.f107075m) + " to " + String.join(", ", arrayList), this.f107075m.equals(arrayList));
                }
                this.f107075m = arrayList;
            }

            public final void o(long j11) {
                if (j11 == -9223372036854775807L) {
                    return;
                }
                long j12 = this.f107067e;
                if (j12 != -9223372036854775807L) {
                    G10.a.b("Can't change startDateUnixUs from " + this.f107067e + " to " + j11, j12 == j11);
                }
                this.f107067e = j11;
            }

            public final void p(String str) {
                if (str == null) {
                    return;
                }
                String str2 = this.f107078p;
                if (str2 != null) {
                    G10.a.b("Can't change timelineOccupies from " + this.f107078p + " to " + str, str2.equals(str));
                }
                this.f107078p = str;
            }

            public final void q(String str) {
                if (str == null) {
                    return;
                }
                String str2 = this.f107079q;
                if (str2 != null) {
                    G10.a.b("Can't change timelineStyle from " + this.f107079q + " to " + str, str2.equals(str));
                }
                this.f107079q = str;
            }
        }

        public b(String str, Uri uri, Uri uri2, long j11, long j12, long j13, long j14, ArrayList arrayList, boolean z11, long j15, long j16, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z12, String str2, String str3) {
            G10.a.c((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f107046a = str;
            this.f107047b = uri;
            this.f107048c = uri2;
            this.f107049d = j11;
            this.f107050e = j12;
            this.f107051f = j13;
            this.f107052g = j14;
            this.f107053h = arrayList;
            this.f107054i = z11;
            this.f107055j = j15;
            this.f107056k = j16;
            this.f107057l = AbstractC5880y.n(arrayList2);
            this.f107058m = AbstractC5880y.n(arrayList3);
            this.f107059n = AbstractC5880y.F(new z3.f(), arrayList4);
            this.f107060o = z12;
            this.f107061p = str2;
            this.f107062q = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f107049d == bVar.f107049d && this.f107050e == bVar.f107050e && this.f107051f == bVar.f107051f && this.f107052g == bVar.f107052g && this.f107054i == bVar.f107054i && this.f107055j == bVar.f107055j && this.f107056k == bVar.f107056k && this.f107060o == bVar.f107060o && Objects.equals(this.f107046a, bVar.f107046a) && Objects.equals(this.f107047b, bVar.f107047b) && Objects.equals(this.f107048c, bVar.f107048c) && Objects.equals(this.f107053h, bVar.f107053h) && Objects.equals(this.f107057l, bVar.f107057l) && Objects.equals(this.f107058m, bVar.f107058m) && Objects.equals(this.f107059n, bVar.f107059n) && Objects.equals(this.f107061p, bVar.f107061p) && Objects.equals(this.f107062q, bVar.f107062q);
        }

        public final int hashCode() {
            Long valueOf = Long.valueOf(this.f107049d);
            Long valueOf2 = Long.valueOf(this.f107050e);
            Long valueOf3 = Long.valueOf(this.f107051f);
            Long valueOf4 = Long.valueOf(this.f107052g);
            Boolean valueOf5 = Boolean.valueOf(this.f107054i);
            Long valueOf6 = Long.valueOf(this.f107055j);
            Long valueOf7 = Long.valueOf(this.f107056k);
            AbstractC5880y<a> abstractC5880y = this.f107059n;
            Boolean valueOf8 = Boolean.valueOf(this.f107060o);
            return Objects.hash(this.f107046a, this.f107047b, this.f107048c, valueOf, valueOf2, valueOf3, valueOf4, this.f107053h, valueOf5, valueOf6, valueOf7, this.f107057l, this.f107058m, abstractC5880y, valueOf8, this.f107061p, this.f107062q);
        }
    }

    public static final class c extends f {

        /* renamed from: l, reason: collision with root package name */
        public final boolean f107080l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f107081m;

        public c(String str, C2323e c2323e, long j11, int i11, long j12, C7270l c7270l, String str2, String str3, long j13, long j14, boolean z11, boolean z12, boolean z13) {
            super(str, c2323e, j11, i11, j12, c7270l, str2, str3, j13, j14, z11);
            this.f107080l = z12;
            this.f107081m = z13;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f107082a;

        /* renamed from: b, reason: collision with root package name */
        public final long f107083b;

        /* renamed from: c, reason: collision with root package name */
        public final int f107084c;

        public d(Uri uri, long j11, int i11) {
            this.f107082a = uri;
            this.f107083b = j11;
            this.f107084c = i11;
        }
    }

    public static class f implements Comparable<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final String f107087a;

        /* renamed from: b, reason: collision with root package name */
        public final C2323e f107088b;

        /* renamed from: c, reason: collision with root package name */
        public final long f107089c;

        /* renamed from: d, reason: collision with root package name */
        public final int f107090d;

        /* renamed from: e, reason: collision with root package name */
        public final long f107091e;

        /* renamed from: f, reason: collision with root package name */
        public final C7270l f107092f;

        /* renamed from: g, reason: collision with root package name */
        public final String f107093g;

        /* renamed from: h, reason: collision with root package name */
        public final String f107094h;

        /* renamed from: i, reason: collision with root package name */
        public final long f107095i;

        /* renamed from: j, reason: collision with root package name */
        public final long f107096j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f107097k;

        f(String str, C2323e c2323e, long j11, int i11, long j12, C7270l c7270l, String str2, String str3, long j13, long j14, boolean z11) {
            this.f107087a = str;
            this.f107088b = c2323e;
            this.f107089c = j11;
            this.f107090d = i11;
            this.f107091e = j12;
            this.f107092f = c7270l;
            this.f107093g = str2;
            this.f107094h = str3;
            this.f107095i = j13;
            this.f107096j = j14;
            this.f107097k = z11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l11) {
            Long l12 = l11;
            long longValue = l12.longValue();
            long j11 = this.f107091e;
            if (j11 > longValue) {
                return 1;
            }
            return j11 < l12.longValue() ? -1 : 0;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final long f107098a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f107099b;

        /* renamed from: c, reason: collision with root package name */
        public final long f107100c;

        /* renamed from: d, reason: collision with root package name */
        public final long f107101d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f107102e;

        public g(long j11, boolean z11, long j12, long j13, boolean z12) {
            this.f107098a = j11;
            this.f107099b = z11;
            this.f107100c = j12;
            this.f107101d = j13;
            this.f107102e = z12;
        }
    }

    public e(int i11, String str, List<String> list, long j11, boolean z11, long j12, boolean z12, int i12, long j13, int i13, long j14, long j15, boolean z13, boolean z14, boolean z15, C7270l c7270l, List<C2323e> list2, List<c> list3, g gVar, Map<Uri, d> map, List<b> list4) {
        super(str, list, z13);
        this.f107022d = i11;
        this.f107026h = j12;
        this.f107025g = z11;
        this.f107027i = z12;
        this.f107028j = i12;
        this.f107029k = j13;
        this.f107030l = i13;
        this.f107031m = j14;
        this.f107032n = j15;
        this.f107033o = z14;
        this.f107034p = z15;
        this.f107035q = c7270l;
        this.f107036r = AbstractC5880y.n(list2);
        this.f107037s = AbstractC5880y.n(list3);
        this.f107038t = AbstractC5881z.h(map);
        this.f107041w = AbstractC5880y.n(list4);
        if (!list3.isEmpty()) {
            c cVar = (c) B.b(list3);
            this.f107039u = cVar.f107091e + cVar.f107089c;
        } else if (list2.isEmpty()) {
            this.f107039u = 0L;
        } else {
            C2323e c2323e = (C2323e) B.b(list2);
            this.f107039u = c2323e.f107091e + c2323e.f107089c;
        }
        this.f107023e = j11 != -9223372036854775807L ? j11 >= 0 ? Math.min(this.f107039u, j11) : Math.max(0L, this.f107039u + j11) : -9223372036854775807L;
        this.f107024f = j11 >= 0;
        this.f107040v = gVar;
    }

    @Override // D3.r
    public final h a(List list) {
        return this;
    }

    /* renamed from: z3.e$e, reason: collision with other inner class name */
    public static final class C2323e extends f {

        /* renamed from: l, reason: collision with root package name */
        public final String f107085l;

        /* renamed from: m, reason: collision with root package name */
        public final AbstractC5880y f107086m;

        public C2323e(String str, String str2, long j11, String str3, long j12) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j11, j12, false, AbstractC5880y.v());
        }

        public C2323e(String str, C2323e c2323e, String str2, long j11, int i11, long j12, C7270l c7270l, String str3, String str4, long j13, long j14, boolean z11, List<c> list) {
            super(str, c2323e, j11, i11, j12, c7270l, str3, str4, j13, j14, z11);
            this.f107085l = str2;
            this.f107086m = AbstractC5880y.n(list);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f107042a;

        /* renamed from: b, reason: collision with root package name */
        public final int f107043b;

        /* renamed from: c, reason: collision with root package name */
        private final double f107044c;

        /* renamed from: d, reason: collision with root package name */
        private final String f107045d;

        public a(String str, double d11) {
            this.f107042a = str;
            this.f107043b = 2;
            this.f107044c = d11;
            this.f107045d = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f107043b == aVar.f107043b && Double.compare(this.f107044c, aVar.f107044c) == 0 && Objects.equals(this.f107042a, aVar.f107042a) && Objects.equals(this.f107045d, aVar.f107045d);
        }

        public final int hashCode() {
            return Objects.hash(this.f107042a, Integer.valueOf(this.f107043b), Double.valueOf(this.f107044c), this.f107045d);
        }

        public a(String str, String str2, int i11) {
            boolean z11 = true;
            if (i11 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z11 = false;
            }
            G10.a.h(z11);
            this.f107042a = str;
            this.f107043b = i11;
            this.f107045d = str2;
            this.f107044c = 0.0d;
        }
    }
}
