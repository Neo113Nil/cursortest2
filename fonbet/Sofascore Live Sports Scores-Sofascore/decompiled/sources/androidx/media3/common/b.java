package androidx.media3.common;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.DrmInitData;
import com.google.android.gms.ads.AdError;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.BuildConfig;
import defpackage.a70;
import defpackage.bf3;
import defpackage.e75;
import defpackage.fc6;
import defpackage.hv9;
import defpackage.ih2;
import defpackage.m72;
import defpackage.me4;
import defpackage.nik;
import defpackage.qm8;
import defpackage.ric;
import defpackage.sjc;
import defpackage.uka;
import defpackage.w13;
import defpackage.w3a;
import defpackage.wt3;
import defpackage.yc2;
import defpackage.z1a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final w13 E;
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
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final hv9 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final ric l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final DrmInitData s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new b(new qm8());
        nik.N(0);
        nik.N(1);
        nik.N(2);
        nik.N(3);
        wt3.s(4, 5, 6, 7, 8);
        wt3.s(9, 10, 11, 12, 13);
        wt3.s(14, 15, 16, 17, 18);
        wt3.s(19, 20, 21, 22, 23);
        wt3.s(24, 25, 26, 27, 28);
        wt3.s(29, 30, 31, 32, 33);
        nik.N(34);
        nik.N(35);
        nik.N(36);
        nik.N(37);
    }

    public b(qm8 qm8Var) {
        boolean z;
        String str;
        this.a = qm8Var.a;
        String U = nik.U(qm8Var.d);
        this.d = U;
        if (qm8Var.c.isEmpty() && qm8Var.b != null) {
            this.c = hv9.z(new uka(U, qm8Var.b));
            this.b = qm8Var.b;
        } else if (qm8Var.c.isEmpty() || qm8Var.b != null) {
            if (!qm8Var.c.isEmpty() || qm8Var.b != null) {
                for (int i = 0; i < qm8Var.c.size(); i++) {
                    if (!((uka) qm8Var.c.get(i)).b.equals(qm8Var.b)) {
                    }
                }
                z = false;
                z1a.E(z);
                this.c = qm8Var.c;
                this.b = qm8Var.b;
            }
            z = true;
            z1a.E(z);
            this.c = qm8Var.c;
            this.b = qm8Var.b;
        } else {
            hv9 hv9Var = qm8Var.c;
            this.c = hv9Var;
            Iterator it = hv9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((uka) hv9Var.get(0)).b;
                    break;
                }
                uka ukaVar = (uka) it.next();
                if (TextUtils.equals(ukaVar.a, U)) {
                    str = ukaVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = qm8Var.e;
        z1a.D("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", qm8Var.g == 0 || (qm8Var.f & 32768) != 0);
        this.f = qm8Var.f;
        this.g = qm8Var.g;
        int i2 = qm8Var.h;
        this.h = i2;
        int i3 = qm8Var.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = qm8Var.j;
        this.l = qm8Var.k;
        this.m = qm8Var.l;
        this.n = qm8Var.m;
        this.o = qm8Var.n;
        this.p = qm8Var.o;
        this.q = qm8Var.p;
        List list = qm8Var.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = qm8Var.r;
        this.s = drmInitData;
        this.t = qm8Var.s;
        this.u = qm8Var.t;
        this.v = qm8Var.u;
        this.w = qm8Var.v;
        this.x = qm8Var.w;
        this.y = qm8Var.x;
        this.z = qm8Var.y;
        int i4 = qm8Var.z;
        this.A = i4 == -1 ? 0 : i4;
        float f = qm8Var.A;
        this.B = f == -1.0f ? 1.0f : f;
        this.C = qm8Var.B;
        this.D = qm8Var.C;
        this.E = qm8Var.D;
        this.F = qm8Var.E;
        this.G = qm8Var.F;
        this.H = qm8Var.G;
        this.I = qm8Var.H;
        int i5 = qm8Var.I;
        this.J = i5 == -1 ? 0 : i5;
        int i6 = qm8Var.J;
        this.K = i6 != -1 ? i6 : 0;
        this.L = qm8Var.K;
        this.M = qm8Var.L;
        this.N = qm8Var.M;
        this.O = qm8Var.N;
        int i7 = qm8Var.O;
        if (i7 != 0 || drmInitData == null) {
            this.P = i7;
        } else {
            this.P = 1;
        }
    }

    public static String c(b bVar) {
        int i;
        String str;
        String str2;
        if (bVar == null) {
            return "null";
        }
        int i2 = bVar.e;
        hv9 hv9Var = bVar.c;
        String str3 = bVar.d;
        int i3 = bVar.H;
        int i4 = bVar.G;
        int i5 = bVar.F;
        float f = bVar.z;
        w13 w13Var = bVar.E;
        float f2 = bVar.B;
        int i6 = bVar.y;
        int i7 = bVar.x;
        int i8 = bVar.w;
        int i9 = bVar.v;
        DrmInitData drmInitData = bVar.s;
        String str4 = bVar.k;
        int i10 = bVar.j;
        String str5 = bVar.m;
        String str6 = bVar.n;
        int i11 = bVar.f;
        ih2 ih2Var = new ih2(String.valueOf(','));
        StringBuilder q = fc6.q("id=");
        q.append(bVar.a);
        q.append(", mimeType=");
        q.append(bVar.o);
        if (str6 != null) {
            q.append(", container=");
            q.append(str6);
        }
        if (str5 != null) {
            q.append(", primaryGroupId=");
            q.append(str5);
        }
        if (i10 != -1) {
            q.append(", bitrate=");
            q.append(i10);
        }
        if (str4 != null) {
            q.append(", codecs=");
            q.append(str4);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < drmInitData.d; i12++) {
                UUID uuid = drmInitData.a[i12].b;
                if (uuid.equals(yc2.b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(yc2.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(yc2.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(yc2.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(yc2.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            q.append(", drm=[");
            ih2Var.a(q, linkedHashSet.iterator());
            q.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            me4.r(q, ", res=", i9, "x", i8);
        }
        if (i7 != -1 && i6 != -1) {
            me4.r(q, ", decRes=", i7, "x", i6);
        }
        double d = f2;
        int i13 = e75.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            q.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = nik.a;
            q.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (w13Var != null) {
            int i14 = w13Var.f;
            int i15 = w13Var.e;
            if ((i15 != -1 && i14 != -1) || w13Var.d()) {
                q.append(", color=");
                if (w13Var.d()) {
                    String b = w13.b(w13Var.a);
                    String a = w13.a(w13Var.b);
                    String c = w13.c(w13Var.c);
                    Locale locale = Locale.US;
                    str2 = bf3.k(b, "/", a, "/", c);
                } else {
                    str2 = "NA/NA/NA";
                }
                q.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : fc6.g(i15, i14, "/")));
            }
        }
        if (f != -1.0f) {
            q.append(", fps=");
            q.append(f);
        }
        if (i5 != -1) {
            q.append(", maxSubLayers=");
            q.append(i5);
        }
        if (i4 != -1) {
            q.append(", channels=");
            q.append(i4);
        }
        if (i3 != -1) {
            q.append(", sample_rate=");
            q.append(i3);
        }
        if (str3 != null) {
            q.append(", language=");
            q.append(str3);
        }
        if (!hv9Var.isEmpty()) {
            q.append(", labels=[");
            ih2Var.a(q, w3a.S(hv9Var, new m72(8)).iterator());
            q.append(U3.j.e);
        }
        if (i2 != 0) {
            q.append(", selectionFlags=[");
            String str8 = nik.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            ih2Var.a(q, arrayList.iterator());
            q.append(U3.j.e);
        }
        if (i11 != 0) {
            q.append(", roleFlags=[");
            String str9 = nik.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add(U3.i.Z);
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & com.ironsource.mediationsdk.metadata.a.o) != 0) {
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
            ih2Var.a(q, arrayList2.iterator());
            q.append(U3.j.e);
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            q.append(", auxiliaryTrackType=");
            int i16 = bVar.g;
            String str10 = nik.a;
            if (i16 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    a70.r("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            q.append(str);
        }
        return q.toString();
    }

    public final qm8 a() {
        qm8 qm8Var = new qm8();
        qm8Var.a = this.a;
        qm8Var.b = this.b;
        qm8Var.c = this.c;
        qm8Var.d = this.d;
        qm8Var.e = this.e;
        qm8Var.f = this.f;
        qm8Var.h = this.h;
        qm8Var.i = this.i;
        qm8Var.j = this.k;
        qm8Var.k = this.l;
        qm8Var.l = this.m;
        qm8Var.m = this.n;
        qm8Var.n = this.o;
        qm8Var.o = this.p;
        qm8Var.p = this.q;
        qm8Var.q = this.r;
        qm8Var.r = this.s;
        qm8Var.s = this.t;
        qm8Var.t = this.u;
        qm8Var.u = this.v;
        qm8Var.v = this.w;
        qm8Var.w = this.x;
        qm8Var.x = this.y;
        qm8Var.y = this.z;
        qm8Var.z = this.A;
        qm8Var.A = this.B;
        qm8Var.B = this.C;
        qm8Var.C = this.D;
        qm8Var.D = this.E;
        qm8Var.E = this.F;
        qm8Var.F = this.G;
        qm8Var.G = this.H;
        qm8Var.H = this.I;
        qm8Var.I = this.J;
        qm8Var.J = this.K;
        qm8Var.K = this.L;
        qm8Var.L = this.M;
        qm8Var.M = this.N;
        qm8Var.N = this.O;
        qm8Var.O = this.P;
        return qm8Var;
    }

    public final boolean b(b bVar) {
        List list = this.r;
        if (list.size() != bVar.r.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) bVar.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final b d(b bVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == bVar) {
            return this;
        }
        int i3 = sjc.i(this.o);
        String str3 = bVar.a;
        hv9 hv9Var = bVar.c;
        int i4 = bVar.N;
        int i5 = bVar.O;
        String str4 = bVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (hv9Var.isEmpty()) {
            hv9Var = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = bVar.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = bVar.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = bVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String x = nik.x(bVar.k, i3);
            if (nik.f0(x).length == 1) {
                str5 = x;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = bVar.m;
        }
        ric ricVar = bVar.l;
        ric ricVar2 = this.l;
        if (ricVar2 != null) {
            ricVar = ricVar2.b(ricVar);
        }
        float f = this.z;
        if (f == -1.0f && i3 == 2) {
            f = bVar.z;
        }
        int i8 = this.e | bVar.e;
        hv9 hv9Var2 = hv9Var;
        int i9 = bVar.f | this.f;
        DrmInitData drmInitData = bVar.s;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            String str7 = drmInitData.c;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.a;
            int length = schemeDataArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                DrmInitData.SchemeData schemeData = schemeDataArr[i11];
                int i12 = length;
                if (schemeData.e != null) {
                    arrayList.add(schemeData);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.s;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.a;
            String str8 = str2;
            int length2 = schemeDataArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i14];
                int i15 = length2;
                if (schemeData2.e != null) {
                    UUID uuid = schemeData2.b;
                    i2 = i4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i16)).b.equals(uuid)) {
                            break;
                        }
                        i16++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i13 = i14 + 1;
                length2 = i15;
                i4 = i2;
                size = i;
            }
            str2 = str8;
        }
        int i17 = i4;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        qm8 a = a();
        a.a = str3;
        a.b = str4;
        a.c = hv9.v(hv9Var2);
        a.d = str;
        a.e = i8;
        a.f = i9;
        a.h = i6;
        a.i = i7;
        a.j = str5;
        a.k = ricVar;
        a.l = str6;
        a.r = drmInitData3;
        a.y = f;
        a.M = i17;
        a.N = i5;
        return new b(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = this.Q;
        return (i2 == 0 || (i = bVar.Q) == 0 || i2 == i) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.p == bVar.p && this.t == bVar.t && this.v == bVar.v && this.w == bVar.w && this.x == bVar.x && this.y == bVar.y && this.A == bVar.A && this.D == bVar.D && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.L == bVar.L && this.N == bVar.N && this.O == bVar.O && this.P == bVar.P && Float.compare(this.z, bVar.z) == 0 && Float.compare(this.B, bVar.B) == 0 && Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c.equals(bVar.c) && Objects.equals(this.k, bVar.k) && Objects.equals(this.m, bVar.m) && Objects.equals(this.n, bVar.n) && Objects.equals(this.o, bVar.o) && Objects.equals(this.d, bVar.d) && Arrays.equals(this.C, bVar.C) && Objects.equals(this.l, bVar.l) && Objects.equals(this.E, bVar.E) && Objects.equals(this.s, bVar.s) && b(bVar);
    }

    public final int hashCode() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ric ricVar = this.l;
        int hashCode5 = (hashCode4 + (ricVar == null ? 0 : ricVar.hashCode())) * 961;
        String str5 = this.m;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.B) + ((((Float.floatToIntBits(this.z) + ((((((((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        this.Q = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.z);
        sb.append(", ");
        sb.append(this.E);
        sb.append("], [");
        sb.append(this.G);
        sb.append(", ");
        return fc6.h(this.H, "])", sb);
    }
}
