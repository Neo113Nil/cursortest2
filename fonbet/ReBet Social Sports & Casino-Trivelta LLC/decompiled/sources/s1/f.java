package s1;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.B;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import s1.f;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: d, reason: collision with root package name */
    public final int f64464d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64465e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64466f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f64467g;

    /* renamed from: h, reason: collision with root package name */
    public final long f64468h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f64469i;

    /* renamed from: j, reason: collision with root package name */
    public final int f64470j;

    /* renamed from: k, reason: collision with root package name */
    public final long f64471k;

    /* renamed from: l, reason: collision with root package name */
    public final int f64472l;

    /* renamed from: m, reason: collision with root package name */
    public final long f64473m;

    /* renamed from: n, reason: collision with root package name */
    public final long f64474n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f64475o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f64476p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f64477q;

    /* renamed from: r, reason: collision with root package name */
    public final List f64478r;

    /* renamed from: s, reason: collision with root package name */
    public final List f64479s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f64480t;

    /* renamed from: u, reason: collision with root package name */
    public final long f64481u;

    /* renamed from: v, reason: collision with root package name */
    public final h f64482v;

    /* renamed from: w, reason: collision with root package name */
    public final AbstractC3445z f64483w;

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f64488a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f64489b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f64490c;

        /* renamed from: d, reason: collision with root package name */
        public final long f64491d;

        /* renamed from: e, reason: collision with root package name */
        public final long f64492e;

        /* renamed from: f, reason: collision with root package name */
        public final long f64493f;

        /* renamed from: g, reason: collision with root package name */
        public final long f64494g;

        /* renamed from: h, reason: collision with root package name */
        public final List f64495h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f64496i;

        /* renamed from: j, reason: collision with root package name */
        public final long f64497j;

        /* renamed from: k, reason: collision with root package name */
        public final long f64498k;

        /* renamed from: l, reason: collision with root package name */
        public final AbstractC3445z f64499l;

        /* renamed from: m, reason: collision with root package name */
        public final AbstractC3445z f64500m;

        /* renamed from: n, reason: collision with root package name */
        public final AbstractC3445z f64501n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f64502o;

        /* renamed from: p, reason: collision with root package name */
        public final String f64503p;

        /* renamed from: q, reason: collision with root package name */
        public final String f64504q;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f64505a;

            /* renamed from: c, reason: collision with root package name */
            public Uri f64507c;

            /* renamed from: d, reason: collision with root package name */
            public Uri f64508d;

            /* renamed from: j, reason: collision with root package name */
            public boolean f64514j;

            /* renamed from: o, reason: collision with root package name */
            public Boolean f64519o;

            /* renamed from: p, reason: collision with root package name */
            public String f64520p;

            /* renamed from: q, reason: collision with root package name */
            public String f64521q;

            /* renamed from: b, reason: collision with root package name */
            public final Map f64506b = new HashMap();

            /* renamed from: e, reason: collision with root package name */
            public long f64509e = -9223372036854775807L;

            /* renamed from: f, reason: collision with root package name */
            public long f64510f = -9223372036854775807L;

            /* renamed from: g, reason: collision with root package name */
            public long f64511g = -9223372036854775807L;

            /* renamed from: h, reason: collision with root package name */
            public long f64512h = -9223372036854775807L;

            /* renamed from: i, reason: collision with root package name */
            public List f64513i = new ArrayList();

            /* renamed from: k, reason: collision with root package name */
            public long f64515k = -9223372036854775807L;

            /* renamed from: l, reason: collision with root package name */
            public long f64516l = -9223372036854775807L;

            /* renamed from: m, reason: collision with root package name */
            public List f64517m = new ArrayList();

            /* renamed from: n, reason: collision with root package name */
            public List f64518n = new ArrayList();

            public a(String str) {
                this.f64505a = str;
            }

            public c a() {
                Uri uri = this.f64508d;
                if ((uri != null || this.f64507c == null) && (uri == null || this.f64507c != null)) {
                    return null;
                }
                long j10 = this.f64509e;
                if (j10 == -9223372036854775807L) {
                    return null;
                }
                String str = this.f64505a;
                Uri uri2 = this.f64507c;
                long j11 = this.f64510f;
                long j12 = this.f64511g;
                long j13 = this.f64512h;
                List list = this.f64513i;
                boolean z10 = this.f64514j;
                long j14 = this.f64515k;
                long j15 = this.f64516l;
                List list2 = this.f64517m;
                List list3 = this.f64518n;
                ArrayList arrayList = new ArrayList(this.f64506b.values());
                Boolean bool = this.f64519o;
                boolean z11 = bool == null || bool.booleanValue();
                String str2 = this.f64520p;
                if (str2 == null) {
                    str2 = "POINT";
                }
                String str3 = str2;
                String str4 = this.f64521q;
                if (str4 == null) {
                    str4 = "HIGHLIGHT";
                }
                return new c(str, uri2, uri, j10, j11, j12, j13, list, z10, j14, j15, list2, list3, arrayList, z11, str3, str4);
            }

            public a b(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f64508d;
                if (uri2 != null) {
                    AbstractC4134a.b(uri2.equals(uri), "Can't change assetListUri from " + this.f64508d + " to " + uri);
                }
                this.f64508d = uri;
                return this;
            }

            public a c(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f64507c;
                if (uri2 != null) {
                    AbstractC4134a.b(uri2.equals(uri), "Can't change assetUri from " + this.f64507c + " to " + uri);
                }
                this.f64507c = uri;
                return this;
            }

            public a d(List list) {
                if (!list.isEmpty()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        b bVar = (b) list.get(i10);
                        String str = bVar.f64484a;
                        b bVar2 = (b) this.f64506b.get(str);
                        if (bVar2 != null) {
                            AbstractC4134a.b(bVar2.equals(bVar), "Can't change " + str + " from " + bVar2.f64487d + " " + bVar2.f64486c + " to " + bVar.f64487d + " " + bVar.f64486c);
                        }
                        this.f64506b.put(str, bVar);
                    }
                }
                return this;
            }

            public a e(Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.f64519o;
                if (bool2 != null) {
                    AbstractC4134a.b(bool2.equals(bool), "Can't change contentMayVary from " + this.f64519o + " to " + bool);
                }
                this.f64519o = bool;
                return this;
            }

            public a f(List list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f64513i.isEmpty()) {
                    AbstractC4134a.b(this.f64513i.equals(list), "Can't change cue from " + s1.h.a(", ", this.f64513i) + " to " + s1.h.a(", ", list));
                }
                this.f64513i = list;
                return this;
            }

            public a g(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f64511g;
                if (j11 != -9223372036854775807L) {
                    AbstractC4134a.b(j11 == j10, "Can't change durationUs from " + this.f64511g + " to " + j10);
                }
                this.f64511g = j10;
                return this;
            }

            public a h(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f64510f;
                if (j11 != -9223372036854775807L) {
                    AbstractC4134a.b(j11 == j10, "Can't change endDateUnixUs from " + this.f64510f + " to " + j10);
                }
                this.f64510f = j10;
                return this;
            }

            public a i(boolean z10) {
                if (!z10) {
                    return this;
                }
                this.f64514j = true;
                return this;
            }

            public a j(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f64512h;
                if (j11 != -9223372036854775807L) {
                    AbstractC4134a.b(j11 == j10, "Can't change plannedDurationUs from " + this.f64512h + " to " + j10);
                }
                this.f64512h = j10;
                return this;
            }

            public a k(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f64516l;
                if (j11 != -9223372036854775807L) {
                    AbstractC4134a.b(j11 == j10, "Can't change playoutLimitUs from " + this.f64516l + " to " + j10);
                }
                this.f64516l = j10;
                return this;
            }

            public a l(List list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f64518n.isEmpty()) {
                    AbstractC4134a.b(this.f64518n.equals(list), "Can't change restrictions from " + s1.h.a(", ", this.f64518n) + " to " + s1.h.a(", ", list));
                }
                this.f64518n = list;
                return this;
            }

            public a m(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f64515k;
                if (j11 != -9223372036854775807L) {
                    AbstractC4134a.b(j11 == j10, "Can't change resumeOffsetUs from " + this.f64515k + " to " + j10);
                }
                this.f64515k = j10;
                return this;
            }

            public a n(List list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f64517m.isEmpty()) {
                    AbstractC4134a.b(this.f64517m.equals(list), "Can't change snapTypes from " + s1.h.a(", ", this.f64517m) + " to " + s1.h.a(", ", list));
                }
                this.f64517m = list;
                return this;
            }

            public a o(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f64509e;
                if (j11 != -9223372036854775807L) {
                    AbstractC4134a.b(j11 == j10, "Can't change startDateUnixUs from " + this.f64509e + " to " + j10);
                }
                this.f64509e = j10;
                return this;
            }

            public a p(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f64520p;
                if (str2 != null) {
                    AbstractC4134a.b(str2.equals(str), "Can't change timelineOccupies from " + this.f64520p + " to " + str);
                }
                this.f64520p = str;
                return this;
            }

            public a q(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f64521q;
                if (str2 != null) {
                    AbstractC4134a.b(str2.equals(str), "Can't change timelineStyle from " + this.f64521q + " to " + str);
                }
                this.f64521q = str;
                return this;
            }
        }

        public c(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, List list, boolean z10, long j14, long j15, List list2, List list3, List list4, boolean z11, String str2, String str3) {
            AbstractC4134a.a((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f64488a = str;
            this.f64489b = uri;
            this.f64490c = uri2;
            this.f64491d = j10;
            this.f64492e = j11;
            this.f64493f = j12;
            this.f64494g = j13;
            this.f64495h = list;
            this.f64496i = z10;
            this.f64497j = j14;
            this.f64498k = j15;
            this.f64499l = AbstractC3445z.o(list2);
            this.f64500m = AbstractC3445z.o(list3);
            this.f64501n = AbstractC3445z.E(new Comparator() { // from class: s1.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compareTo;
                    compareTo = ((f.b) obj).f64484a.compareTo(((f.b) obj2).f64484a);
                    return compareTo;
                }
            }, list4);
            this.f64502o = z11;
            this.f64503p = str2;
            this.f64504q = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f64491d == cVar.f64491d && this.f64492e == cVar.f64492e && this.f64493f == cVar.f64493f && this.f64494g == cVar.f64494g && this.f64496i == cVar.f64496i && this.f64497j == cVar.f64497j && this.f64498k == cVar.f64498k && this.f64502o == cVar.f64502o && Objects.equals(this.f64488a, cVar.f64488a) && Objects.equals(this.f64489b, cVar.f64489b) && Objects.equals(this.f64490c, cVar.f64490c) && Objects.equals(this.f64495h, cVar.f64495h) && Objects.equals(this.f64499l, cVar.f64499l) && Objects.equals(this.f64500m, cVar.f64500m) && Objects.equals(this.f64501n, cVar.f64501n) && Objects.equals(this.f64503p, cVar.f64503p) && Objects.equals(this.f64504q, cVar.f64504q);
        }

        public int hashCode() {
            return Objects.hash(this.f64488a, this.f64489b, this.f64490c, Long.valueOf(this.f64491d), Long.valueOf(this.f64492e), Long.valueOf(this.f64493f), Long.valueOf(this.f64494g), this.f64495h, Boolean.valueOf(this.f64496i), Long.valueOf(this.f64497j), Long.valueOf(this.f64498k), this.f64499l, this.f64500m, this.f64501n, Boolean.valueOf(this.f64502o), this.f64503p, this.f64504q);
        }
    }

    public static final class d extends g {

        /* renamed from: l, reason: collision with root package name */
        public final boolean f64522l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f64523m;

        public d(String str, C0896f c0896f, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, c0896f, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f64522l = z11;
            this.f64523m = z12;
        }

        public d b(long j10, int i10) {
            return new d(this.f64529a, this.f64530b, this.f64531c, i10, j10, this.f64534f, this.f64535g, this.f64536h, this.f64537i, this.f64538j, this.f64539k, this.f64522l, this.f64523m);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f64524a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64525b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64526c;

        public e(Uri uri, long j10, int i10) {
            this.f64524a = uri;
            this.f64525b = j10;
            this.f64526c = i10;
        }
    }

    public static class g implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final String f64529a;

        /* renamed from: b, reason: collision with root package name */
        public final C0896f f64530b;

        /* renamed from: c, reason: collision with root package name */
        public final long f64531c;

        /* renamed from: d, reason: collision with root package name */
        public final int f64532d;

        /* renamed from: e, reason: collision with root package name */
        public final long f64533e;

        /* renamed from: f, reason: collision with root package name */
        public final DrmInitData f64534f;

        /* renamed from: g, reason: collision with root package name */
        public final String f64535g;

        /* renamed from: h, reason: collision with root package name */
        public final String f64536h;

        /* renamed from: i, reason: collision with root package name */
        public final long f64537i;

        /* renamed from: j, reason: collision with root package name */
        public final long f64538j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f64539k;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f64533e > l10.longValue()) {
                return 1;
            }
            return this.f64533e < l10.longValue() ? -1 : 0;
        }

        public g(String str, C0896f c0896f, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.f64529a = str;
            this.f64530b = c0896f;
            this.f64531c = j10;
            this.f64532d = i10;
            this.f64533e = j11;
            this.f64534f = drmInitData;
            this.f64535g = str2;
            this.f64536h = str3;
            this.f64537i = j12;
            this.f64538j = j13;
            this.f64539k = z10;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final long f64540a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f64541b;

        /* renamed from: c, reason: collision with root package name */
        public final long f64542c;

        /* renamed from: d, reason: collision with root package name */
        public final long f64543d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f64544e;

        public h(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f64540a = j10;
            this.f64541b = z10;
            this.f64542c = j11;
            this.f64543d = j12;
            this.f64544e = z11;
        }
    }

    public f(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List list2, List list3, h hVar, Map map, List list4) {
        super(str, list, z12);
        this.f64464d = i10;
        this.f64468h = j11;
        this.f64467g = z10;
        this.f64469i = z11;
        this.f64470j = i11;
        this.f64471k = j12;
        this.f64472l = i12;
        this.f64473m = j13;
        this.f64474n = j14;
        this.f64475o = z13;
        this.f64476p = z14;
        this.f64477q = drmInitData;
        this.f64478r = AbstractC3445z.o(list2);
        this.f64479s = AbstractC3445z.o(list3);
        this.f64480t = B.e(map);
        this.f64483w = AbstractC3445z.o(list4);
        if (!list3.isEmpty()) {
            d dVar = (d) I.f(list3);
            this.f64481u = dVar.f64533e + dVar.f64531c;
        } else if (list2.isEmpty()) {
            this.f64481u = 0L;
        } else {
            C0896f c0896f = (C0896f) I.f(list2);
            this.f64481u = c0896f.f64533e + c0896f.f64531c;
        }
        this.f64465e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f64481u, j10) : Math.max(0L, this.f64481u + j10) : -9223372036854775807L;
        this.f64466f = j10 >= 0;
        this.f64482v = hVar;
    }

    public f c(long j10, int i10) {
        return new f(this.f64464d, this.f64566a, this.f64567b, this.f64465e, this.f64467g, j10, true, i10, this.f64471k, this.f64472l, this.f64473m, this.f64474n, this.f64568c, this.f64475o, this.f64476p, this.f64477q, this.f64478r, this.f64479s, this.f64482v, this.f64480t, this.f64483w);
    }

    public f d() {
        return this.f64475o ? this : new f(this.f64464d, this.f64566a, this.f64567b, this.f64465e, this.f64467g, this.f64468h, this.f64469i, this.f64470j, this.f64471k, this.f64472l, this.f64473m, this.f64474n, this.f64568c, true, this.f64476p, this.f64477q, this.f64478r, this.f64479s, this.f64482v, this.f64480t, this.f64483w);
    }

    public long e() {
        return this.f64468h + this.f64481u;
    }

    public boolean f(f fVar) {
        if (fVar != null) {
            long j10 = this.f64471k;
            long j11 = fVar.f64471k;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f64478r.size() - fVar.f64478r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f64479s.size();
                int size3 = fVar.f64479s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f64475o || fVar.f64475o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: s1.f$f, reason: collision with other inner class name */
    public static final class C0896f extends g {

        /* renamed from: l, reason: collision with root package name */
        public final String f64527l;

        /* renamed from: m, reason: collision with root package name */
        public final List f64528m;

        public C0896f(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, AbstractC3445z.t());
        }

        public C0896f b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f64528m.size(); i11++) {
                d dVar = (d) this.f64528m.get(i11);
                arrayList.add(dVar.b(j11, i10));
                j11 += dVar.f64531c;
            }
            return new C0896f(this.f64529a, this.f64530b, this.f64527l, this.f64531c, i10, j10, this.f64534f, this.f64535g, this.f64536h, this.f64537i, this.f64538j, this.f64539k, arrayList);
        }

        public C0896f(String str, C0896f c0896f, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List list) {
            super(str, c0896f, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f64527l = str2;
            this.f64528m = AbstractC3445z.o(list);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f64484a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64485b;

        /* renamed from: c, reason: collision with root package name */
        public final double f64486c;

        /* renamed from: d, reason: collision with root package name */
        public final String f64487d;

        public b(String str, double d10) {
            this.f64484a = str;
            this.f64485b = 2;
            this.f64486c = d10;
            this.f64487d = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f64485b == bVar.f64485b && Double.compare(this.f64486c, bVar.f64486c) == 0 && Objects.equals(this.f64484a, bVar.f64484a) && Objects.equals(this.f64487d, bVar.f64487d);
        }

        public int hashCode() {
            return Objects.hash(this.f64484a, Integer.valueOf(this.f64485b), Double.valueOf(this.f64486c), this.f64487d);
        }

        public b(String str, String str2, int i10) {
            boolean z10 = true;
            if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z10 = false;
            }
            AbstractC4134a.g(z10);
            this.f64484a = str;
            this.f64485b = i10;
            this.f64487d = str2;
            this.f64486c = 0.0d;
        }
    }

    @Override // x1.InterfaceC6777a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List list) {
        return this;
    }
}
