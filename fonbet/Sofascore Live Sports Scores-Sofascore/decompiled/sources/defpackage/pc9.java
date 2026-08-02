package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pc9 extends j2c {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public n72 C;
    public pd9 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public hv9 I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final re4 p;
    public final xe4 q;
    public final n72 r;
    public final boolean s;
    public final boolean t;
    public final djj u;
    public final pp4 v;
    public final List w;
    public final DrmInitData x;
    public final xq9 y;
    public final j9e z;

    public pc9(pp4 pp4Var, re4 re4Var, xe4 xe4Var, b bVar, boolean z, re4 re4Var2, xe4 xe4Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, djj djjVar, DrmInitData drmInitData, n72 n72Var, xq9 xq9Var, j9e j9eVar, boolean z6, boolean z7, cse cseVar) {
        super(re4Var, xe4Var, bVar, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : C.TIME_UNSET;
        this.l = i3;
        this.q = xe4Var2;
        this.p = re4Var2;
        this.F = xe4Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = djjVar;
        this.t = z4;
        this.v = pp4Var;
        this.w = list;
        this.x = drmInitData;
        this.r = n72Var;
        this.y = xq9Var;
        this.z = j9eVar;
        this.L = z6;
        this.n = z7;
        av9 av9Var = hv9.b;
        this.I = vvf.e;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (rz8.W(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.j2c
    public final boolean b() {
        throw null;
    }

    public final void c(re4 re4Var, xe4 xe4Var, boolean z, boolean z2) {
        xe4 b;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            b = xe4Var;
        } else {
            b = xe4Var.b(i);
            z3 = false;
        }
        try {
            bp4 g = g(re4Var, b, z2);
            if (z3) {
                g.skipFully(this.E, false);
            }
            do {
                try {
                    try {
                        if (this.G) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((ll6) this.C.b).seek(0L, 0L);
                        j = g.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (g.d - xe4Var.f);
                    throw th;
                }
            } while (((ll6) this.C.b).b(g, n72.f) == 0);
            j = g.d;
            this.E = (int) (j - xe4Var.f);
        } finally {
            qx9.w(re4Var);
        }
    }

    @Override // defpackage.yfb
    public final void cancelLoad() {
        this.G = true;
    }

    public final int e(int i) {
        z1a.E(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    public final boolean f() {
        return this.K != C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x00a2, code lost:
    
        if (((defpackage.o7f) r6).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bp4 g(re4 re4Var, xe4 xe4Var, boolean z) {
        int i;
        bp4 bp4Var;
        long j;
        n72 n72Var;
        long j2;
        long j3;
        long j4;
        n72 n72Var2;
        n72 n72Var3;
        int i2;
        int i3;
        int i4;
        b bVar;
        int i5;
        ArrayList arrayList;
        Object e9Var;
        boolean z2;
        xli xliVar;
        int i6;
        int i7;
        boolean z3;
        ll6 c;
        pd9 pd9Var;
        long b;
        Object wwcVar;
        lic licVar;
        long b2 = re4Var.b(xe4Var);
        long j5 = this.g;
        djj djjVar = this.u;
        if (z) {
            try {
                djjVar.g(j5, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        bp4 bp4Var2 = new bp4(re4Var, xe4Var.f, b2);
        int i8 = 1;
        int i9 = 0;
        if (this.C == null) {
            j9e j9eVar = this.z;
            bp4Var2.f = 0;
            try {
                j9eVar.K(10);
                bp4Var2.peekFully(j9eVar.a, 0, 10, false);
            } catch (EOFException unused2) {
                bp4Var = null;
            }
            if (j9eVar.D() == 4801587) {
                j9eVar.O(3);
                int z4 = j9eVar.z();
                int i10 = z4 + 10;
                byte[] bArr = j9eVar.a;
                if (i10 > bArr.length) {
                    j9eVar.K(i10);
                    System.arraycopy(bArr, 0, j9eVar.a, 0, 10);
                }
                bp4Var2.peekFully(j9eVar.a, 10, z4, false);
                ric K = this.y.K(z4, j9eVar.a);
                if (K != null) {
                    lic[] licVarArr = K.a;
                    int length = licVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bp4Var = null;
                            licVar = null;
                            break;
                        }
                        lic licVar2 = licVarArr[i11];
                        bp4Var = null;
                        if (o7f.class.isAssignableFrom(licVar2.getClass())) {
                            licVar = (lic) o7f.class.cast(licVar2);
                        }
                        licVar = null;
                        if (licVar != null) {
                            break;
                        }
                        i11++;
                    }
                    o7f o7fVar = (o7f) licVar;
                    if (o7fVar != null) {
                        System.arraycopy(o7fVar.c, 0, j9eVar.a, 0, 8);
                        j9eVar.N(0);
                        j9eVar.M(8);
                        j = j9eVar.u() & 8589934591L;
                        bp4Var2.f = 0;
                        n72Var = this.r;
                        if (n72Var != null) {
                            djj djjVar2 = (djj) n72Var.d;
                            ll6 ll6Var = (ll6) n72Var.b;
                            ll6 c2 = ll6Var.c();
                            z1a.E(!((c2 instanceof z1k) || (c2 instanceof er8)));
                            z1a.C(ll6Var.getClass(), "Can't recreate wrapped extractors. Outer type: %s", ll6Var.c() == ll6Var);
                            if (ll6Var instanceof h2l) {
                                wwcVar = new h2l(((b) n72Var.c).d, djjVar2, (xli) n72Var.e, n72Var.a);
                            } else if (ll6Var instanceof il) {
                                wwcVar = new il(0);
                            } else if (ll6Var instanceof e9) {
                                wwcVar = new e9();
                            } else if (ll6Var instanceof i9) {
                                wwcVar = new i9();
                            } else {
                                if (!(ll6Var instanceof wwc)) {
                                    a70.r("Unexpected extractor type for recreation: ".concat(ll6Var.getClass().getSimpleName()));
                                    return bp4Var;
                                }
                                wwcVar = new wwc(0);
                            }
                            n72Var3 = new n72(wwcVar, (b) n72Var.c, djjVar2, (xli) n72Var.e, n72Var.a);
                            i = 0;
                            j2 = j5;
                            j3 = j;
                            j4 = 0;
                        } else {
                            Uri uri = xe4Var.a;
                            Map responseHeaders = re4Var.getResponseHeaders();
                            pp4 pp4Var = this.v;
                            pp4Var.getClass();
                            b bVar2 = this.d;
                            int F = o1j.F(bVar2.o);
                            List list = (List) responseHeaders.get("Content-Type");
                            int F2 = o1j.F((list == null || list.isEmpty()) ? bp4Var : (String) list.get(0));
                            int G = o1j.G(uri);
                            long j6 = j;
                            int i12 = 7;
                            ArrayList arrayList2 = new ArrayList(7);
                            pp4.d(arrayList2, F);
                            pp4.d(arrayList2, F2);
                            pp4.d(arrayList2, G);
                            for (int i13 = 0; i13 < 7; i13++) {
                                pp4.d(arrayList2, pp4.e[i13]);
                            }
                            bp4Var2.f = 0;
                            bp4 bp4Var3 = bp4Var;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= arrayList2.size()) {
                                    i = i9;
                                    j2 = j5;
                                    j3 = j6;
                                    j4 = 0;
                                    bp4Var3.getClass();
                                    n72Var2 = new n72((ll6) bp4Var3, bVar2, djjVar, (zic) pp4Var.d, pp4Var.b);
                                    break;
                                }
                                int intValue = ((Integer) arrayList2.get(i14)).intValue();
                                if (intValue == 0) {
                                    i2 = i14;
                                    j2 = j5;
                                    i3 = intValue;
                                    i4 = i12;
                                    bVar = bVar2;
                                    i5 = F;
                                    arrayList = arrayList2;
                                    j3 = j6;
                                    j4 = 0;
                                    e9Var = new e9();
                                } else if (intValue == i8) {
                                    i2 = i14;
                                    j2 = j5;
                                    i3 = intValue;
                                    i4 = i12;
                                    bVar = bVar2;
                                    i5 = F;
                                    arrayList = arrayList2;
                                    j3 = j6;
                                    j4 = 0;
                                    e9Var = new i9();
                                } else if (intValue == 2) {
                                    i2 = i14;
                                    j2 = j5;
                                    i3 = intValue;
                                    i4 = i12;
                                    bVar = bVar2;
                                    i5 = F;
                                    arrayList = arrayList2;
                                    j3 = j6;
                                    j4 = 0;
                                    e9Var = new il(0);
                                } else if (intValue != i12) {
                                    List list2 = this.w;
                                    xli xliVar2 = xli.A7;
                                    if (intValue == 8) {
                                        i2 = i14;
                                        j2 = j5;
                                        i3 = intValue;
                                        bVar = bVar2;
                                        i5 = F;
                                        arrayList = arrayList2;
                                        j4 = 0;
                                        i4 = 7;
                                        xli xliVar3 = (zic) pp4Var.d;
                                        boolean z5 = pp4Var.b;
                                        int i15 = pp4Var.c;
                                        if (z5) {
                                            xliVar = xliVar3;
                                            i6 = 4;
                                        } else {
                                            i6 = 36;
                                            xliVar = xliVar2;
                                        }
                                        int f = er8.f(i15) | i6;
                                        if (list2 == null) {
                                            av9 av9Var = hv9.b;
                                            list2 = vvf.e;
                                        }
                                        j3 = j6;
                                        e9Var = new er8(xliVar, f, djjVar, list2, null);
                                    } else if (intValue != 11) {
                                        if (intValue != 13) {
                                            e9Var = bp4Var;
                                            i2 = i14;
                                            j2 = j5;
                                            i3 = intValue;
                                            bVar = bVar2;
                                            i5 = F;
                                            arrayList = arrayList2;
                                            j3 = j6;
                                            j4 = 0;
                                        } else {
                                            i2 = i14;
                                            e9Var = new h2l(bVar2.d, djjVar, (zic) pp4Var.d, pp4Var.b);
                                            j2 = j5;
                                            i3 = intValue;
                                            bVar = bVar2;
                                            i5 = F;
                                            arrayList = arrayList2;
                                            j3 = j6;
                                            j4 = 0;
                                        }
                                        i4 = 7;
                                    } else {
                                        i2 = i14;
                                        xli xliVar4 = (zic) pp4Var.d;
                                        boolean z6 = pp4Var.b;
                                        if (list2 != null) {
                                            i7 = 48;
                                        } else {
                                            qm8 qm8Var = new qm8();
                                            qm8Var.n = sjc.p(MimeTypes.APPLICATION_CEA608);
                                            list2 = Collections.singletonList(new b(qm8Var));
                                            i7 = 16;
                                        }
                                        String str = bVar2.k;
                                        if (TextUtils.isEmpty(str)) {
                                            z3 = z6;
                                        } else {
                                            boolean z7 = z6;
                                            if (sjc.c(str, MimeTypes.AUDIO_AAC) == null) {
                                                i7 |= 2;
                                            }
                                            z3 = z7;
                                            if (sjc.c(str, "video/avc") == null) {
                                                i7 |= 4;
                                                z3 = z7;
                                            }
                                        }
                                        if (z3 != 0) {
                                            xliVar2 = xliVar4;
                                        }
                                        i3 = intValue;
                                        arrayList = arrayList2;
                                        j2 = j5;
                                        bVar = bVar2;
                                        j4 = 0;
                                        i4 = 7;
                                        i5 = F;
                                        djj djjVar3 = djjVar;
                                        e9Var = new z1k(2, !z3, xliVar2, djjVar3, new mu4(i7, list2));
                                        djjVar = djjVar3;
                                        j3 = j6;
                                    }
                                } else {
                                    i2 = i14;
                                    j2 = j5;
                                    i3 = intValue;
                                    i4 = i12;
                                    bVar = bVar2;
                                    i5 = F;
                                    arrayList = arrayList2;
                                    j3 = j6;
                                    j4 = 0;
                                    e9Var = new wwc(0L);
                                }
                                e9Var.getClass();
                                ll6 ll6Var2 = (ll6) e9Var;
                                try {
                                    z2 = ll6Var2.a(bp4Var2);
                                    i = 0;
                                    bp4Var2.f = 0;
                                } catch (EOFException unused3) {
                                    i = 0;
                                    bp4Var2.f = 0;
                                    z2 = false;
                                } catch (Throwable th) {
                                    bp4Var2.f = 0;
                                    throw th;
                                }
                                if (z2) {
                                    n72Var2 = new n72(ll6Var2, bVar, djjVar, (zic) pp4Var.d, pp4Var.b);
                                    break;
                                }
                                bVar2 = bVar;
                                if (bp4Var3 == null && (i3 == i5 || i3 == F2 || i3 == G || i3 == 11)) {
                                    bp4Var3 = ll6Var2;
                                }
                                i14 = i2 + 1;
                                F = i5;
                                j5 = j2;
                                arrayList2 = arrayList;
                                i12 = i4;
                                j6 = j3;
                                i9 = i;
                                i8 = 1;
                            }
                            n72Var3 = n72Var2;
                        }
                        n72 n72Var4 = n72Var3;
                        this.C = n72Var4;
                        c = ((ll6) n72Var4.b).c();
                        if (!(c instanceof il) || (c instanceof e9) || (c instanceof i9) || (c instanceof wwc)) {
                            pd9Var = this.D;
                            long j7 = j3;
                            b = j7 != C.TIME_UNSET ? djjVar.b(j7) : j2;
                            if (pd9Var.W != b) {
                                pd9Var.W = b;
                                od9[] od9VarArr = pd9Var.v;
                                int length2 = od9VarArr.length;
                                for (int i16 = i; i16 < length2; i16++) {
                                    od9 od9Var = od9VarArr[i16];
                                    if (od9Var.H != b) {
                                        od9Var.H = b;
                                        od9Var.B = true;
                                    }
                                }
                            }
                        } else {
                            pd9 pd9Var2 = this.D;
                            if (pd9Var2.W != j4) {
                                pd9Var2.W = j4;
                                od9[] od9VarArr2 = pd9Var2.v;
                                int length3 = od9VarArr2.length;
                                for (int i17 = i; i17 < length3; i17++) {
                                    od9 od9Var2 = od9VarArr2[i17];
                                    if (od9Var2.H != j4) {
                                        od9Var2.H = j4;
                                        od9Var2.B = true;
                                    }
                                }
                            }
                        }
                        this.D.x.clear();
                        ((ll6) this.C.b).e(this.D);
                    }
                    j = -9223372036854775807L;
                    bp4Var2.f = 0;
                    n72Var = this.r;
                    if (n72Var != null) {
                    }
                    n72 n72Var42 = n72Var3;
                    this.C = n72Var42;
                    c = ((ll6) n72Var42.b).c();
                    if (c instanceof il) {
                    }
                    pd9Var = this.D;
                    long j72 = j3;
                    if (j72 != C.TIME_UNSET) {
                    }
                    if (pd9Var.W != b) {
                    }
                    this.D.x.clear();
                    ((ll6) this.C.b).e(this.D);
                }
            }
            j = -9223372036854775807L;
            bp4Var = null;
            bp4Var2.f = 0;
            n72Var = this.r;
            if (n72Var != null) {
            }
            n72 n72Var422 = n72Var3;
            this.C = n72Var422;
            c = ((ll6) n72Var422.b).c();
            if (c instanceof il) {
            }
            pd9Var = this.D;
            long j722 = j3;
            if (j722 != C.TIME_UNSET) {
            }
            if (pd9Var.W != b) {
            }
            this.D.x.clear();
            ((ll6) this.C.b).e(this.D);
        } else {
            i = 0;
        }
        pd9 pd9Var3 = this.D;
        DrmInitData drmInitData = pd9Var3.X;
        DrmInitData drmInitData2 = this.x;
        if (!Objects.equals(drmInitData, drmInitData2)) {
            pd9Var3.X = drmInitData2;
            int i18 = i;
            while (true) {
                od9[] od9VarArr3 = pd9Var3.v;
                if (i18 >= od9VarArr3.length) {
                    break;
                }
                if (pd9Var3.O[i18]) {
                    od9 od9Var3 = od9VarArr3[i18];
                    od9Var3.K = drmInitData2;
                    od9Var3.B = true;
                }
                i18++;
            }
        }
        return bp4Var2;
    }

    @Override // defpackage.yfb
    public final void load() {
        n72 n72Var;
        this.D.getClass();
        if (this.C == null && (n72Var = this.r) != null) {
            ll6 c = ((ll6) n72Var.b).c();
            if ((c instanceof z1k) || (c instanceof er8)) {
                this.C = this.r;
                this.F = false;
            }
        }
        xe4 xe4Var = this.q;
        re4 re4Var = this.p;
        if (this.F) {
            re4Var.getClass();
            xe4Var.getClass();
            c(re4Var, xe4Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }
}
