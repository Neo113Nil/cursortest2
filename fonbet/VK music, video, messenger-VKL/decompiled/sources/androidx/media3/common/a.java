package androidx.media3.common;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import xsna.cq;
import xsna.dgn;
import xsna.fi20;
import xsna.fr;
import xsna.fw3;
import xsna.fxc0;
import xsna.h5s;
import xsna.io20;
import xsna.m6g;
import xsna.op5;
import xsna.qhz;
import xsna.t6o;
import xsna.tu8;
import xsna.y2r0;
import xsna.zky;

/* compiled from: Format.java */
/* loaded from: classes12.dex */
public final class a {
    public final float A;

    @Nullable
    public final byte[] B;
    public final int C;

    @Nullable
    public final m6g D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;

    @Nullable
    public final String a;

    @Nullable
    public final String b;
    public final ImmutableList c;

    @Nullable
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    @Nullable
    public final String k;

    @Nullable
    public final fi20 l;

    @Nullable
    public final String m;

    @Nullable
    public final String n;
    public final int o;
    public final int p;
    public final List<byte[]> q;

    @Nullable
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    /* compiled from: Format.java */
    /* renamed from: androidx.media3.common.a$a, reason: collision with other inner class name */
    public static final class C0043a {

        @Nullable
        public byte[] A;
        public int B;

        @Nullable
        public m6g C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;

        @Nullable
        public String a;

        @Nullable
        public String b;
        public ImmutableList c;

        @Nullable
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        @Nullable
        public String j;

        @Nullable
        public fi20 k;

        @Nullable
        public String l;

        @Nullable
        public String m;
        public int n;
        public int o;

        @Nullable
        public List<byte[]> p;

        @Nullable
        public DrmInitData q;
        public long r;
        public boolean s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public int y;
        public float z;

        public C0043a() {
            ImmutableList.b bVar = ImmutableList.c;
            this.c = g.f;
            this.h = -1;
            this.i = -1;
            this.n = -1;
            this.o = -1;
            this.r = Long.MAX_VALUE;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1.0f;
            this.z = 1.0f;
            this.B = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.J = -1;
            this.K = 1;
            this.L = -1;
            this.M = -1;
            this.N = 0;
            this.g = 0;
        }

        public final a a() {
            return new a(this);
        }

        public final void b(int i) {
            this.J = i;
        }

        public final void c(int i) {
            this.h = i;
        }

        public final void d(int i) {
            this.E = i;
        }

        public final void e(@Nullable String str) {
            this.j = str;
        }

        public final void f(@Nullable String str) {
            this.l = io20.q(str);
        }

        public final void g(float f) {
            this.x = f;
        }

        public final void h(int i) {
            this.u = i;
        }

        public final void i(int i) {
            this.a = Integer.toString(i);
        }

        public final void j(@Nullable String str) {
            this.a = str;
        }

        public final void k(@Nullable String str) {
            this.b = str;
        }

        public final void l(@Nullable String str) {
            this.d = str;
        }

        public final void m(@Nullable fi20 fi20Var) {
            this.k = fi20Var;
        }

        public final void n(int i) {
            this.G = i;
        }

        public final void o(int i) {
            this.i = i;
        }

        public final void p(int i) {
            this.f = i;
        }

        public final void q(@Nullable String str) {
            this.m = io20.q(str);
        }

        public final void r(int i) {
            this.F = i;
        }

        public final void s(int i) {
            this.e = i;
        }

        public final void t(int i) {
            this.t = i;
        }
    }

    static {
        new C0043a().a();
        y2r0.L(0);
        y2r0.L(1);
        y2r0.L(2);
        y2r0.L(3);
        y2r0.L(4);
        cq.h(5, 6, 7, 8, 9);
        cq.h(10, 11, 12, 13, 14);
        cq.h(15, 16, 17, 18, 19);
        cq.h(20, 21, 22, 23, 24);
        cq.h(25, 26, 27, 28, 29);
        cq.h(30, 31, 32, 33, 34);
        y2r0.L(35);
        y2r0.L(36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(C0043a c0043a) {
        boolean z;
        String str;
        this.a = c0043a.a;
        String T = y2r0.T(c0043a.d);
        this.d = T;
        if (c0043a.c.isEmpty() && c0043a.b != null) {
            this.c = ImmutableList.p(new zky(T, c0043a.b));
            this.b = c0043a.b;
        } else if (c0043a.c.isEmpty() || c0043a.b != null) {
            if (!c0043a.c.isEmpty() || c0043a.b != null) {
                for (int i = 0; i < c0043a.c.size(); i++) {
                    if (!((zky) c0043a.c.get(i)).b.equals(c0043a.b)) {
                    }
                }
                z = false;
                fxc0.z(z);
                this.c = c0043a.c;
                this.b = c0043a.b;
            }
            z = true;
            fxc0.z(z);
            this.c = c0043a.c;
            this.b = c0043a.b;
        } else {
            ImmutableList immutableList = c0043a.c;
            this.c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zky) immutableList.get(0)).b;
                    break;
                }
                zky zkyVar = (zky) it.next();
                if (TextUtils.equals(zkyVar.a, T)) {
                    str = zkyVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = c0043a.e;
        fxc0.A(c0043a.g == 0 || (c0043a.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = c0043a.f;
        this.g = c0043a.g;
        int i2 = c0043a.h;
        this.h = i2;
        int i3 = c0043a.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = c0043a.j;
        this.l = c0043a.k;
        this.m = c0043a.l;
        this.n = c0043a.m;
        this.o = c0043a.n;
        this.p = c0043a.o;
        List<byte[]> list = c0043a.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = c0043a.q;
        this.r = drmInitData;
        this.s = c0043a.r;
        this.t = c0043a.s;
        this.u = c0043a.t;
        this.v = c0043a.u;
        this.w = c0043a.v;
        this.x = c0043a.w;
        this.y = c0043a.x;
        int i4 = c0043a.y;
        this.z = i4 == -1 ? 0 : i4;
        float f = c0043a.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = c0043a.A;
        this.C = c0043a.B;
        this.D = c0043a.C;
        this.E = c0043a.D;
        this.F = c0043a.E;
        this.G = c0043a.F;
        this.H = c0043a.G;
        int i5 = c0043a.H;
        this.I = i5 == -1 ? 0 : i5;
        int i6 = c0043a.I;
        this.J = i6 != -1 ? i6 : 0;
        this.K = c0043a.J;
        this.L = c0043a.K;
        this.M = c0043a.L;
        this.N = c0043a.M;
        int i7 = c0043a.N;
        if (i7 != 0 || drmInitData == null) {
            this.O = i7;
        } else {
            this.O = 1;
        }
    }

    public static String d(@Nullable a aVar) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        if (aVar == null) {
            return "null";
        }
        int i3 = aVar.e;
        ImmutableList immutableList = aVar.c;
        String str4 = aVar.d;
        int i4 = aVar.G;
        int i5 = aVar.F;
        int i6 = aVar.E;
        float f = aVar.y;
        m6g m6gVar = aVar.D;
        float f2 = aVar.A;
        int i7 = aVar.x;
        int i8 = aVar.w;
        int i9 = aVar.v;
        int i10 = aVar.u;
        DrmInitData drmInitData = aVar.r;
        String str5 = aVar.k;
        int i11 = aVar.j;
        String str6 = aVar.m;
        int i12 = aVar.f;
        op5 op5Var = new op5(String.valueOf(','));
        StringBuilder e = fw3.e("id=");
        e.append(aVar.a);
        e.append(", mimeType=");
        e.append(aVar.n);
        if (str6 != null) {
            e.append(", container=");
            e.append(str6);
        }
        if (i11 != -1) {
            e.append(", bitrate=");
            e.append(i11);
        }
        if (str5 != null) {
            e.append(", codecs=");
            e.append(str5);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i13 = 0;
            while (i13 < drmInitData.e) {
                UUID uuid = drmInitData.b[i13].c;
                if (uuid.equals(tu8.b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(tu8.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(tu8.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(tu8.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(tu8.a)) {
                    linkedHashSet.add("universal");
                } else {
                    i2 = i13;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i13 = i2 + 1;
                }
                i2 = i13;
                i13 = i2 + 1;
            }
            e.append(", drm=[");
            op5Var.a(e, linkedHashSet.iterator());
            e.append(']');
        }
        if (i10 != -1 && i9 != -1) {
            dgn.a(i10, i9, ", res=", "x", e);
        }
        if (i8 != -1 && i7 != -1) {
            dgn.a(i8, i7, ", decRes=", "x", e);
        }
        double d = f2;
        int i14 = t6o.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            e.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = y2r0.a;
            e.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (m6gVar != null) {
            int i15 = m6gVar.f;
            int i16 = m6gVar.e;
            if ((i16 != -1 && i15 != -1) || m6gVar.f()) {
                e.append(", color=");
                if (m6gVar.f()) {
                    String c = m6g.c(m6gVar.a);
                    String b = m6g.b(m6gVar.b);
                    String e2 = m6g.e(m6gVar.c);
                    Locale locale = Locale.US;
                    str2 = c + DomExceptionUtils.SEPARATOR + b + DomExceptionUtils.SEPARATOR + e2;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i16 == -1 || i15 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i16 + DomExceptionUtils.SEPARATOR + i15;
                }
                e.append(str2 + DomExceptionUtils.SEPARATOR + str3);
            }
        }
        if (f != -1.0f) {
            e.append(", fps=");
            e.append(f);
        }
        if (i6 != -1) {
            e.append(", maxSubLayers=");
            e.append(i6);
        }
        if (i5 != -1) {
            e.append(", channels=");
            e.append(i5);
        }
        if (i4 != -1) {
            e.append(", sample_rate=");
            e.append(i4);
        }
        if (str4 != null) {
            e.append(", language=");
            e.append(str4);
        }
        if (!immutableList.isEmpty()) {
            e.append(", labels=[");
            op5Var.a(e, qhz.e(immutableList, new fr(18)).iterator());
            e.append(X3.j.e);
        }
        if (i3 != 0) {
            e.append(", selectionFlags=[");
            String str8 = y2r0.a;
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i3 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i3 & 2) != 0) {
                arrayList.add("forced");
            }
            op5Var.a(e, arrayList.iterator());
            e.append(X3.j.e);
        }
        if (i12 != 0) {
            e.append(", roleFlags=[");
            String str9 = y2r0.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add(X3.i.Z);
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i12;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            op5Var.a(e, arrayList2.iterator());
            e.append(X3.j.e);
        } else {
            i = i12;
        }
        if ((i & 32768) != 0) {
            e.append(", auxiliaryTrackType=");
            int i17 = aVar.g;
            String str10 = y2r0.a;
            if (i17 == 0) {
                str = StringUtils.UNDEFINED;
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            e.append(str);
        }
        return e.toString();
    }

    public final C0043a a() {
        C0043a c0043a = new C0043a();
        c0043a.a = this.a;
        c0043a.b = this.b;
        c0043a.c = this.c;
        c0043a.d = this.d;
        c0043a.e = this.e;
        c0043a.f = this.f;
        c0043a.h = this.h;
        c0043a.i = this.i;
        c0043a.j = this.k;
        c0043a.k = this.l;
        c0043a.l = this.m;
        c0043a.m = this.n;
        c0043a.n = this.o;
        c0043a.o = this.p;
        c0043a.p = this.q;
        c0043a.q = this.r;
        c0043a.r = this.s;
        c0043a.s = this.t;
        c0043a.t = this.u;
        c0043a.u = this.v;
        c0043a.v = this.w;
        c0043a.w = this.x;
        c0043a.x = this.y;
        c0043a.y = this.z;
        c0043a.z = this.A;
        c0043a.A = this.B;
        c0043a.B = this.C;
        c0043a.C = this.D;
        c0043a.D = this.E;
        c0043a.E = this.F;
        c0043a.F = this.G;
        c0043a.G = this.H;
        c0043a.H = this.I;
        c0043a.I = this.J;
        c0043a.J = this.K;
        c0043a.K = this.L;
        c0043a.L = this.M;
        c0043a.M = this.N;
        c0043a.N = this.O;
        return c0043a;
    }

    public final int b() {
        int i;
        int i2 = this.u;
        if (i2 == -1 || (i = this.v) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(a aVar) {
        List<byte[]> list = this.q;
        if (list.size() != aVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), aVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final a e(a aVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == aVar) {
            return this;
        }
        int i3 = io20.i(this.n);
        String str3 = aVar.a;
        fi20 fi20Var = aVar.l;
        ImmutableList immutableList = aVar.c;
        int i4 = aVar.M;
        int i5 = aVar.N;
        String str4 = aVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (immutableList.isEmpty()) {
            immutableList = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = aVar.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = aVar.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = aVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String w = y2r0.w(aVar.k, i3);
            if (y2r0.f0(w).length == 1) {
                str5 = w;
            }
        }
        fi20 fi20Var2 = this.l;
        if (fi20Var2 != null) {
            fi20Var = fi20Var2.b(fi20Var);
        }
        float f = this.y;
        if (f == -1.0f && i3 == 2) {
            f = aVar.y;
        }
        int i8 = this.e | aVar.e;
        int i9 = this.f | aVar.f;
        DrmInitData drmInitData = aVar.r;
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableList2 = immutableList;
        if (drmInitData != null) {
            String str6 = drmInitData.d;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.b;
            int length = schemeDataArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                DrmInitData.SchemeData schemeData = schemeDataArr[i11];
                int i12 = length;
                if (schemeData.f != null) {
                    arrayList.add(schemeData);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.r;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.d;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.b;
            String str7 = str2;
            int length2 = schemeDataArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i14];
                int i15 = length2;
                if (schemeData2.f != null) {
                    UUID uuid = schemeData2.c;
                    i2 = i5;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i16)).c.equals(uuid)) {
                            break;
                        }
                        i16++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i5;
                }
                i13 = i14 + 1;
                length2 = i15;
                i5 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i17 = i5;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        C0043a a = a();
        a.a = str3;
        a.b = str4;
        a.c = ImmutableList.m(immutableList2);
        a.d = str;
        a.e = i8;
        a.f = i9;
        a.h = i6;
        a.i = i7;
        a.j = str5;
        a.k = fi20Var;
        a.q = drmInitData3;
        a.x = f;
        a.L = i4;
        a.M = i17;
        return new a(a);
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = aVar.P) == 0 || i2 == i) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.o == aVar.o && this.s == aVar.s && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && this.z == aVar.z && this.C == aVar.C && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K && this.M == aVar.M && this.N == aVar.N && this.O == aVar.O && Float.compare(this.y, aVar.y) == 0 && Float.compare(this.A, aVar.A) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && this.c.equals(aVar.c) && Objects.equals(this.k, aVar.k) && Objects.equals(this.m, aVar.m) && Objects.equals(this.n, aVar.n) && Objects.equals(this.d, aVar.d) && Arrays.equals(this.B, aVar.B) && Objects.equals(this.l, aVar.l) && Objects.equals(this.D, aVar.D) && Objects.equals(this.r, aVar.r) && c(aVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.a;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            fi20 fi20Var = this.l;
            int hashCode5 = (hashCode4 + (fi20Var == null ? 0 : fi20Var.hashCode())) * 961;
            String str5 = this.m;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return h5s.c(this.G, "])", sb);
    }
}
