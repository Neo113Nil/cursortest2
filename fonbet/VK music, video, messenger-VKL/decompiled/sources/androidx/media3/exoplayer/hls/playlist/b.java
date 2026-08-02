package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.f370;
import xsna.fxc0;
import xsna.k9v;
import xsna.o9v;
import xsna.sd9;

/* compiled from: HlsMediaPlaylist.java */
/* loaded from: classes12.dex */
public final class b extends o9v {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;

    @Nullable
    public final DrmInitData q;
    public final ImmutableList r;
    public final ImmutableList s;
    public final ImmutableMap t;
    public final long u;
    public final g v;
    public final ImmutableList<C0058b> w;

    /* compiled from: HlsMediaPlaylist.java */
    /* renamed from: androidx.media3.exoplayer.hls.playlist.b$b, reason: collision with other inner class name */
    public static final class C0058b {
        public final String a;

        @Nullable
        public final Uri b;

        @Nullable
        public final Uri c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<String> h;
        public final boolean i;
        public final long j;
        public final long k;
        public final ImmutableList<String> l;
        public final ImmutableList<String> m;
        public final com.google.common.collect.g n;
        public final boolean o;
        public final String p;
        public final String q;
        public final long r;
        public final long s;

        @Nullable
        public final String t;

        /* compiled from: HlsMediaPlaylist.java */
        /* renamed from: androidx.media3.exoplayer.hls.playlist.b$b$a */
        public static final class a {
            public final String a;
            public Uri c;
            public Uri d;
            public boolean j;
            public Boolean o;
            public String p;
            public String q;

            @Nullable
            public String t;
            public final HashMap b = new HashMap();
            public long e = C.TIME_UNSET;
            public long f = C.TIME_UNSET;
            public long g = C.TIME_UNSET;
            public long h = C.TIME_UNSET;
            public ArrayList i = new ArrayList();
            public long k = C.TIME_UNSET;
            public long l = C.TIME_UNSET;
            public ArrayList m = new ArrayList();
            public ArrayList n = new ArrayList();
            public long r = C.TIME_UNSET;
            public long s = C.TIME_UNSET;

            public a(String str) {
                this.a = str;
            }

            @Nullable
            public final C0058b a() {
                Uri uri = this.d;
                if ((uri != null || this.c == null) && (uri == null || this.c != null)) {
                    return null;
                }
                long j = this.e;
                if (j == C.TIME_UNSET) {
                    return null;
                }
                Uri uri2 = this.c;
                long j2 = this.f;
                long j3 = this.g;
                long j4 = this.h;
                ArrayList arrayList = this.i;
                boolean z = this.j;
                long j5 = this.k;
                long j6 = this.l;
                ArrayList arrayList2 = this.m;
                ArrayList arrayList3 = this.n;
                ArrayList arrayList4 = new ArrayList(this.b.values());
                Boolean bool = this.o;
                boolean z2 = bool == null || bool.booleanValue();
                String str = this.p;
                if (str == null) {
                    str = "POINT";
                }
                String str2 = str;
                String str3 = this.q;
                if (str3 == null) {
                    str3 = "HIGHLIGHT";
                }
                return new C0058b(this.a, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3, this.r, this.s, this.t);
            }

            public final void b(@Nullable Uri uri) {
                if (uri == null) {
                    return;
                }
                Uri uri2 = this.d;
                if (uri2 != null) {
                    fxc0.r(uri2.equals(uri), "Can't change assetListUri from %s to %s", this.d, uri);
                }
                this.d = uri;
            }

            public final void c(@Nullable Uri uri) {
                if (uri == null) {
                    return;
                }
                Uri uri2 = this.c;
                if (uri2 != null) {
                    fxc0.r(uri2.equals(uri), "Can't change assetUri from %s to %s", this.c, uri);
                }
                this.c = uri;
            }

            public final void d(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    a aVar = (a) arrayList.get(i);
                    String str = aVar.a;
                    HashMap hashMap = this.b;
                    a aVar2 = (a) hashMap.get(str);
                    if (aVar2 != null) {
                        boolean equals = aVar2.equals(aVar);
                        Object[] objArr = {str, aVar2.d, Double.valueOf(aVar2.c), aVar.d, Double.valueOf(aVar.c)};
                        if (!equals) {
                            throw new IllegalArgumentException(f370.E("Can't change %s from %s %s to %s %s", objArr));
                        }
                    }
                    hashMap.put(str, aVar);
                }
            }

            public final void e(@Nullable Boolean bool) {
                if (bool == null) {
                    return;
                }
                Boolean bool2 = this.o;
                if (bool2 != null) {
                    fxc0.r(bool2.equals(bool), "Can't change contentMayVary from %s to %s", this.o, bool);
                }
                this.o = bool;
            }

            public final void f(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!this.i.isEmpty()) {
                    fxc0.q(this.i.equals(arrayList), "Can't change cue from " + String.join(", ", this.i) + " to " + String.join(", ", arrayList));
                }
                this.i = arrayList;
            }

            public final void g(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.g;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change durationUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.g = j2;
            }

            public final void h(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.f;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change endDateUnixUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.f = j2;
            }

            public final void i(boolean z) {
                if (z) {
                    this.j = true;
                }
            }

            public final void j(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.h;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change plannedDurationUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.h = j2;
            }

            public final void k(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.l;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change playoutLimitUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.l = j2;
            }

            public final void l(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!this.n.isEmpty()) {
                    fxc0.q(this.n.equals(arrayList), "Can't change restrictions from " + String.join(", ", this.n) + " to " + String.join(", ", arrayList));
                }
                this.n = arrayList;
            }

            public final void m(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.k;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change resumeOffsetUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.k = j2;
            }

            public final void n(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.s;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change skipControlDurationUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.s = j2;
            }

            public final void o(@Nullable String str) {
                if (str == null) {
                    return;
                }
                String str2 = this.t;
                if (str2 != null) {
                    fxc0.r(str2.equals(str), "Can't change skipControlLabelId from %s to %s", this.t, str);
                }
                this.t = str;
            }

            public final void p(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.r;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change skipControlOffsetUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.r = j2;
            }

            public final void q(ArrayList arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                if (!this.m.isEmpty()) {
                    fxc0.q(this.m.equals(arrayList), "Can't change snapTypes from " + String.join(", ", this.m) + " to " + String.join(", ", arrayList));
                }
                this.m = arrayList;
            }

            public final void r(long j) {
                long j2;
                if (j == C.TIME_UNSET) {
                    return;
                }
                long j3 = this.e;
                if (j3 != C.TIME_UNSET) {
                    j2 = j;
                    fxc0.m(j3, j2, "Can't change startDateUnixUs from %s to %s", j3 == j);
                } else {
                    j2 = j;
                }
                this.e = j2;
            }

            public final void s(@Nullable String str) {
                if (str == null) {
                    return;
                }
                String str2 = this.p;
                if (str2 != null) {
                    fxc0.r(str2.equals(str), "Can't change timelineOccupies from %s to %s", this.p, str);
                }
                this.p = str;
            }

            public final void t(@Nullable String str) {
                if (str == null) {
                    return;
                }
                String str2 = this.q;
                if (str2 != null) {
                    fxc0.r(str2.equals(str), "Can't change timelineStyle from %s to %s", this.q, str);
                }
                this.q = str;
            }
        }

        public C0058b(String str, @Nullable Uri uri, @Nullable Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, @Nullable String str4) {
            fxc0.p((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.a = str;
            this.b = uri;
            this.c = uri2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = arrayList;
            this.i = z;
            this.j = j5;
            this.k = j6;
            this.l = ImmutableList.m(arrayList2);
            this.m = ImmutableList.m(arrayList3);
            this.n = ImmutableList.u(new k9v(), arrayList4);
            this.o = z2;
            this.p = str2;
            this.q = str3;
            this.r = j7;
            this.s = j8;
            this.t = str4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0058b)) {
                return false;
            }
            C0058b c0058b = (C0058b) obj;
            return this.d == c0058b.d && this.e == c0058b.e && this.f == c0058b.f && this.g == c0058b.g && this.i == c0058b.i && this.j == c0058b.j && this.k == c0058b.k && this.o == c0058b.o && this.r == c0058b.r && this.s == c0058b.s && Objects.equals(this.a, c0058b.a) && Objects.equals(this.b, c0058b.b) && Objects.equals(this.c, c0058b.c) && Objects.equals(this.h, c0058b.h) && Objects.equals(this.l, c0058b.l) && Objects.equals(this.m, c0058b.m) && Objects.equals(this.n, c0058b.n) && Objects.equals(this.p, c0058b.p) && Objects.equals(this.q, c0058b.q) && Objects.equals(this.t, c0058b.t);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class c extends f {
        public final boolean m;
        public final boolean n;

        public c(String str, @Nullable e eVar, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, eVar, j, i, j2, drmInitData, str2, str3, j3, j4, z);
            this.m = z2;
            this.n = z3;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class d {
        public final Uri a;
        public final long b;
        public final int c;

        public d(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static class f implements Comparable<Long> {
        public final String b;

        @Nullable
        public final e c;
        public final long d;
        public final int e;
        public final long f;

        @Nullable
        public final DrmInitData g;

        @Nullable
        public final String h;

        @Nullable
        public final String i;
        public final long j;
        public final long k;
        public final boolean l;

        public f(String str, e eVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.b = str;
            this.c = eVar;
            this.d = j;
            this.e = i;
            this.f = j2;
            this.g = drmInitData;
            this.h = str2;
            this.i = str3;
            this.j = j3;
            this.k = j4;
            this.l = z;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l) {
            Long l2 = l;
            long longValue = l2.longValue();
            long j = this.f;
            if (j > longValue) {
                return 1;
            }
            return j < l2.longValue() ? -1 : 0;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class g {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public g(long j, boolean z, long j2, long j3, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public b(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, @Nullable DrmInitData drmInitData, List<e> list2, List<c> list3, g gVar, Map<Uri, d> map, List<C0058b> list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = ImmutableList.m(list2);
        this.s = ImmutableList.m(list3);
        this.t = ImmutableMap.a(map);
        this.w = ImmutableList.m(list4);
        if (!list3.isEmpty()) {
            c cVar = (c) sd9.k(list3);
            this.u = cVar.f + cVar.d;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            e eVar = (e) sd9.k(list2);
            this.u = eVar.f + eVar.d;
        }
        this.e = j != C.TIME_UNSET ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : C.TIME_UNSET;
        this.f = j >= 0;
        this.v = gVar;
    }

    public final b a(int i, long j) {
        return new b(this.d, this.a, this.b, this.e, this.g, j, true, i, this.k, this.l, this.m, this.n, this.c, this.o, this.p, this.q, this.r, this.s, this.v, this.t, this.w);
    }

    public final b b() {
        if (this.o) {
            return this;
        }
        return new b(this.d, this.a, this.b, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.c, true, this.p, this.q, this.r, this.s, this.v, this.t, this.w);
    }

    public final boolean c(@Nullable b bVar) {
        if (bVar == null) {
            return true;
        }
        long j = this.k;
        long j2 = bVar.k;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.r.size() - bVar.r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.s.size();
        int size3 = bVar.s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.o && !bVar.o;
        }
        return true;
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class e extends f {
        public final String m;
        public final ImmutableList n;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(long j, long j2, String str, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, com.google.common.collect.g.f);
            ImmutableList.b bVar = ImmutableList.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final e a(int i, long j) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            long j2 = j;
            while (true) {
                ImmutableList immutableList = this.n;
                if (i2 >= immutableList.size()) {
                    return new e(this.b, this.c, this.m, this.d, i, j, this.g, this.h, this.i, this.j, this.k, this.l, arrayList);
                }
                c cVar = (c) immutableList.get(i2);
                arrayList.add(new c(cVar.b, cVar.c, cVar.d, i, j2, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n));
                j2 += cVar.d;
                i2++;
            }
        }

        public e(String str, @Nullable e eVar, String str2, long j, int i, long j2, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z, List<c> list) {
            super(str, eVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.m = str2;
            this.n = ImmutableList.m(list);
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static class a {
        public final String a;
        public final int b;
        public final double c;

        @Nullable
        public final String d;

        public a(String str, double d) {
            this.a = str;
            this.b = 2;
            this.c = d;
            this.d = null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && Double.compare(this.c, aVar.c) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.d, aVar.d);
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
        }

        public a(String str, String str2, int i) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            fxc0.z(z);
            this.a = str;
            this.b = i;
            this.d = str2;
            this.c = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
    }

    @Override // xsna.uer
    public final o9v copy(List list) {
        return this;
    }
}
