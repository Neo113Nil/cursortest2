package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import androidx.core.app.NotificationCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import coil.memory.MemoryCache$Key;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k1d implements qh2, qj2, dvd, k9k, bl3, k4f, ew1, wif, xwg, lii, zhh, ay2 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public k1d(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            case 6:
                this.b = new i1d(new wma[16], 0);
                break;
            case 9:
                this.b = new AtomicLong();
                this.c = new AtomicLong();
                break;
            case 24:
                this.b = null;
                this.c = null;
                break;
            default:
                this.b = new x0d();
                this.c = new x0d();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void o(wma wmaVar) {
        if (wmaVar.P > 0) {
            if (wmaVar.G.d == sma.e && !wmaVar.q() && !wmaVar.r() && !wmaVar.Q && wmaVar.I()) {
                wtc wtcVar = (wtc) wmaVar.F.g;
                if ((wtcVar.d & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    while (wtcVar != null) {
                        if ((wtcVar.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                            bw4 bw4Var = wtcVar;
                            ?? r5 = 0;
                            while (bw4Var != 0) {
                                if (bw4Var instanceof a09) {
                                    a09 a09Var = (a09) bw4Var;
                                    a09Var.K(c6o.a0(a09Var, NotificationCompat.FLAG_LOCAL_ONLY));
                                } else if ((bw4Var.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && (bw4Var instanceof bw4)) {
                                    wtc wtcVar2 = bw4Var.p;
                                    int i = 0;
                                    bw4Var = bw4Var;
                                    r5 = r5;
                                    while (wtcVar2 != null) {
                                        if ((wtcVar2.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                bw4Var = wtcVar2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new i1d(new wtc[16], 0);
                                                }
                                                if (bw4Var != 0) {
                                                    r5.b(bw4Var);
                                                    bw4Var = 0;
                                                }
                                                r5.b(wtcVar2);
                                            }
                                        }
                                        wtcVar2 = wtcVar2.f;
                                        bw4Var = bw4Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                bw4Var = c6o.X(r5);
                            }
                        }
                        if ((wtcVar.d & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                            break;
                        } else {
                            wtcVar = wtcVar.f;
                        }
                    }
                }
            }
            wmaVar.O = false;
            i1d z = wmaVar.z();
            Object[] objArr = z.a;
            int i2 = z.c;
            for (int i3 = 0; i3 < i2; i3++) {
                o((wma) objArr[i3]);
            }
        }
    }

    @Override // defpackage.ay2
    public void B() {
        grb grbVar = (grb) this.c;
        if (grbVar.isReady()) {
            grbVar.c.execute(new q3g(1, this));
        }
    }

    @Override // defpackage.zhh
    public void a(k55 k55Var) {
        r55.c((na3) this.b, k55Var);
    }

    @Override // defpackage.lii
    public void b(int i) {
        int i2;
        jk3 jk3Var = (jk3) this.c;
        if (i >= 40) {
            jk3Var.h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        synchronized (jk3Var.c) {
            i2 = jk3Var.d;
        }
        jk3Var.h(i2 / 2);
    }

    @Override // defpackage.k9k
    public void c() {
        ((z41) this.b).y(Unit.a);
    }

    @Override // defpackage.qj2
    public void cancel() {
        if (((em0) this.c).compareAndSet(1, 1)) {
            return;
        }
        ((mi) this.b).invoke();
    }

    @Override // defpackage.lii
    public pec d(MemoryCache$Key memoryCache$Key) {
        npf npfVar = (npf) ((jk3) this.c).c(memoryCache$Key);
        if (npfVar != null) {
            return new pec(npfVar.a, npfVar.b);
        }
        return null;
    }

    @Override // defpackage.ew1
    public void e() {
        nkk nkkVar = (nkk) this.c;
        byte[] bArr = lik.e;
        nkkVar.C(bArr, bArr.length);
    }

    @Override // defpackage.lii
    public void f(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        int i;
        int y = wkn.y(bitmap);
        jk3 jk3Var = (jk3) this.c;
        synchronized (jk3Var.c) {
            i = jk3Var.a;
        }
        jk3 jk3Var2 = (jk3) this.c;
        if (y <= i) {
            jk3Var2.d(memoryCache$Key, new npf(bitmap, map, y));
        } else {
            jk3Var2.e(memoryCache$Key);
            ((d0l) this.b).g(memoryCache$Key, bitmap, map, y);
        }
    }

    @Override // defpackage.bl3
    public void g() {
        lj2 lj2Var = (lj2) this.b;
        p2g p2gVar = w2g.b;
        lj2Var.resumeWith(Boolean.valueOf(!((zzj) this.c).a()));
    }

    @Override // defpackage.wif
    public void h(vif vifVar, int i) {
        int[] iArr = (int[]) this.c;
        try {
            vifVar.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            vifVar.close();
        }
    }

    @Override // defpackage.dvd
    public List i(Integer num) {
        List i = ((dvd) this.b).i(null);
        mlh mlhVar = (mlh) this.c;
        int i2 = mlhVar.v;
        return i2 < 0 ? i : CollectionsKt.w0(i, v9g.w(mlhVar, num, i2, Integer.valueOf(mlhVar.F(i2, mlhVar.b))));
    }

    @Override // defpackage.ew1
    public dw1 j(ml6 ml6Var, long j) {
        long position = ml6Var.getPosition();
        int min = (int) Math.min(20000L, ml6Var.getLength() - position);
        nkk nkkVar = (nkk) this.c;
        nkkVar.B(min);
        ml6Var.peekFully(nkkVar.a, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (nkkVar.c() >= 4) {
            if (x68.o(nkkVar.b, nkkVar.a) != 442) {
                nkkVar.F(1);
            } else {
                nkkVar.F(4);
                long c = mgf.c(nkkVar);
                if (c != C.TIME_UNSET) {
                    long b = ((cjj) this.b).b(c);
                    if (b > j) {
                        return j2 == C.TIME_UNSET ? new dw1(-1, 0, b, position) : new dw1(0, 0, C.TIME_UNSET, position + i2);
                    }
                    long j3 = b + 100000;
                    int i3 = nkkVar.b;
                    if (j3 > j) {
                        return new dw1(0, 0, C.TIME_UNSET, position + i3);
                    }
                    i2 = i3;
                    j2 = b;
                }
                int i4 = nkkVar.c;
                if (nkkVar.c() >= 10) {
                    nkkVar.F(9);
                    int s = nkkVar.s() & 7;
                    if (nkkVar.c() >= s) {
                        nkkVar.F(s);
                        if (nkkVar.c() >= 4) {
                            if (x68.o(nkkVar.b, nkkVar.a) == 443) {
                                nkkVar.F(4);
                                int x = nkkVar.x();
                                if (nkkVar.c() < x) {
                                    nkkVar.E(i4);
                                } else {
                                    nkkVar.F(x);
                                }
                            }
                            while (true) {
                                if (nkkVar.c() < 4) {
                                    break;
                                }
                                int o = x68.o(nkkVar.b, nkkVar.a);
                                if (o == 442 || o == 441 || (o >>> 8) != 1) {
                                    break;
                                }
                                nkkVar.F(4);
                                if (nkkVar.c() < 2) {
                                    nkkVar.E(i4);
                                    break;
                                }
                                nkkVar.E(Math.min(nkkVar.c, nkkVar.b + nkkVar.x()));
                            }
                        } else {
                            nkkVar.E(i4);
                        }
                    } else {
                        nkkVar.E(i4);
                    }
                } else {
                    nkkVar.E(i4);
                }
                i = nkkVar.b;
            }
        }
        return j2 != C.TIME_UNSET ? new dw1(-2, 0, j2, position + i) : dw1.e;
    }

    @Override // defpackage.k9k
    public void k() {
        k4e.b((k4e) this.c);
    }

    @Override // defpackage.dvd
    public boolean l() {
        return ((dvd) this.b).l();
    }

    @Override // defpackage.k4f
    public void m(Preference preference) {
        ((PreferenceGroup) this.b).S = Integer.MAX_VALUE;
        y4f y4fVar = (y4f) this.c;
        Handler handler = y4fVar.e;
        kac kacVar = y4fVar.f;
        handler.removeCallbacks(kacVar);
        handler.post(kacVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n() {
        Object[] objArr;
        i1d i1dVar = (i1d) this.b;
        Arrays.sort(i1dVar.a, 0, i1dVar.c, qe8.h);
        int i = i1dVar.c;
        wma[] wmaVarArr = (wma[]) this.c;
        if (wmaVarArr != null) {
            int length = wmaVarArr.length;
            objArr = wmaVarArr;
        }
        objArr = new wma[Math.max(16, i)];
        this.c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = i1dVar.a[i2];
        }
        i1dVar.n();
        while (true) {
            i--;
            if (-1 >= i) {
                this.c = objArr;
                return;
            }
            wma wmaVar = objArr[i];
            wmaVar.getClass();
            if (wmaVar.O) {
                o(wmaVar);
            }
            objArr[i] = 0;
        }
    }

    @Override // defpackage.zhh
    public void onError(Throwable th) {
        ((zhh) this.c).onError(th);
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        switch (this.a) {
            case 3:
                try {
                    ((ph2) this.b).m((dod) this.c, iOException);
                    break;
                } catch (Throwable th) {
                    kik.a0(th);
                    th.printStackTrace();
                    return;
                }
            default:
                f6a.s(-1, iOException, (pcd) ((vcd) this.b));
                break;
        }
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        String str;
        switch (this.a) {
            case 3:
                ph2 ph2Var = (ph2) this.b;
                dod dodVar = (dod) this.c;
                try {
                    try {
                        ph2Var.e(dodVar, dodVar.c(d2gVar));
                        return;
                    } catch (Throwable th) {
                        kik.a0(th);
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    kik.a0(th2);
                    try {
                        ph2Var.m(dodVar, th2);
                        return;
                    } catch (Throwable th3) {
                        kik.a0(th3);
                        th3.printStackTrace();
                        return;
                    }
                }
            default:
                vcd vcdVar = (vcd) this.b;
                try {
                    try {
                        i2g i2gVar = d2gVar.g;
                        if (!d2gVar.q || i2gVar == null) {
                            int i = d2gVar.d;
                            if (i2gVar == null || (str = i2gVar.string()) == null) {
                                str = d2gVar.c;
                            }
                            f6a.s(i, new RuntimeException(str), (pcd) vcdVar);
                        } else {
                            wcd wcdVar = new wcd(rv1.a(sv1.Companion, i2gVar.string()));
                            wcdVar.c.put("is_rewarded", String.valueOf(td4.c0((ucd) this.c) == 4));
                            f6a.t(wcdVar, vcdVar);
                        }
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Error parsing Nimbus response";
                        }
                        cjb.a(message);
                        f6a.s(-2, e, (pcd) vcdVar);
                    }
                    d2gVar.close();
                    return;
                } catch (Throwable th4) {
                    d2gVar.close();
                    throw th4;
                }
        }
    }

    @Override // defpackage.zhh
    public void onSuccess(Object obj) {
        ((zhh) this.c).onSuccess(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        r0 = new defpackage.ow8[]{r7, r5}[1].b;
        r1 = r21 - r0.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
    
        if (r7 >= r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a5, code lost:
    
        r22[r4 + r7] = 0;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ad, code lost:
    
        java.lang.System.arraycopy(r0, 0, r22, r4 + r1, r0.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(int i, int[] iArr) {
        ow8 ow8Var;
        ow8 ow8Var2;
        ow8 ow8Var3;
        nw8 nw8Var = (nw8) this.b;
        if (i == 0) {
            a70.p("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            a70.p("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        int i2 = 1;
        int i3 = 0;
        if (i >= arrayList.size()) {
            ow8 ow8Var4 = (ow8) mz1.h(arrayList, 1);
            int size = arrayList.size();
            while (size <= i) {
                int[] iArr2 = {i2, nw8Var.a[(size - 1) + nw8Var.f]};
                if (iArr2[i3] == 0) {
                    int i4 = i2;
                    while (i4 < 2 && iArr2[i4] == 0) {
                        i4++;
                    }
                    if (i4 == 2) {
                        iArr2 = new int[]{i3};
                    } else {
                        int i5 = 2 - i4;
                        int[] iArr3 = new int[i5];
                        System.arraycopy(iArr2, i4, iArr3, i3, i5);
                        iArr2 = iArr3;
                    }
                }
                nw8 nw8Var2 = ow8Var4.a;
                if (!nw8Var2.equals(nw8Var)) {
                    a70.p("GenericGFPolys do not have same GenericGF field");
                    return;
                }
                int[] iArr4 = ow8Var4.b;
                if (iArr4[i3] == 0 || iArr2[i3] == 0) {
                    ow8Var4 = nw8Var2.c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i2];
                    int i6 = i3;
                    while (i6 < length2) {
                        int i7 = iArr4[i6];
                        while (i3 < length3) {
                            int i8 = i6 + i3;
                            iArr5[i8] = iArr5[i8] ^ nw8Var2.a(i7, iArr2[i3]);
                            i3++;
                            iArr4 = iArr4;
                        }
                        i6++;
                        i3 = 0;
                    }
                    ow8Var4 = new ow8(nw8Var2, iArr5);
                }
                arrayList.add(ow8Var4);
                size++;
                i2 = 1;
                i3 = 0;
            }
        }
        ow8 ow8Var5 = (ow8) arrayList.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            ilg.c();
            return;
        }
        if (length > 1 && iArr6[0] == 0) {
            int i9 = 1;
            while (i9 < length && iArr6[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr6 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr7 = new int[i10];
                System.arraycopy(iArr6, i9, iArr7, 0, i10);
                iArr6 = iArr7;
            }
        }
        if (i < 0) {
            ilg.c();
            return;
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i];
        for (int i11 = 0; i11 < length4; i11++) {
            iArr8[i11] = nw8Var.a(iArr6[i11], 1);
        }
        ow8 ow8Var6 = new ow8(nw8Var, iArr8);
        nw8 nw8Var3 = ow8Var5.a;
        int[] iArr9 = ow8Var5.b;
        boolean equals = nw8Var.equals(nw8Var3);
        ow8 ow8Var7 = nw8Var.c;
        if (!equals) {
            a70.p("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (iArr9[0] == 0) {
            a70.p("Divide by 0");
            return;
        }
        int i12 = iArr9[(iArr9.length - 1) - ow8Var5.b()];
        if (i12 == 0) {
            throw new ArithmeticException();
        }
        int i13 = nw8Var.a[(nw8Var.d - nw8Var.b[i12]) - 1];
        ow8 ow8Var8 = ow8Var7;
        while (true) {
            int[] iArr10 = ow8Var6.b;
            if (ow8Var6.b() < ow8Var5.b() || iArr10[0] == 0) {
                break;
            }
            int b = ow8Var6.b() - ow8Var5.b();
            int a = nw8Var.a(iArr10[(iArr10.length - 1) - ow8Var6.b()], i13);
            nw8 nw8Var4 = ow8Var5.a;
            if (b < 0) {
                ilg.c();
                return;
            }
            if (a == 0) {
                ow8Var2 = nw8Var4.c;
                ow8Var = ow8Var5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + b];
                int i14 = 0;
                while (i14 < length5) {
                    iArr11[i14] = nw8Var4.a(iArr9[i14], a);
                    i14++;
                    ow8Var5 = ow8Var5;
                }
                ow8Var = ow8Var5;
                ow8Var2 = new ow8(nw8Var4, iArr11);
            }
            if (b < 0) {
                ilg.c();
                return;
            }
            if (a == 0) {
                ow8Var3 = ow8Var7;
            } else {
                int[] iArr12 = new int[b + 1];
                iArr12[0] = a;
                ow8Var3 = new ow8(nw8Var, iArr12);
            }
            ow8Var8 = ow8Var8.a(ow8Var3);
            ow8Var6 = ow8Var6.a(ow8Var2);
            ow8Var5 = ow8Var;
        }
    }

    @Override // defpackage.ay2
    public void q(qic qicVar) {
        int i;
        int i2;
        if (((r3g) this.b).d > 0) {
            jic jicVar = grb.E;
            qicVar.a(jicVar);
            qicVar.e(jicVar, String.valueOf(((r3g) this.b).d));
        }
        grb grbVar = (grb) this.c;
        r3g r3gVar = (r3g) this.b;
        jic jicVar2 = grb.E;
        g3g a = grbVar.a(r3gVar);
        if (a != null) {
            grbVar.b.execute(a);
        }
        if (((grb) this.c).o.f == ((r3g) this.b)) {
            s3g s3gVar = ((grb) this.c).m;
            if (s3gVar != null) {
                AtomicInteger atomicInteger = s3gVar.d;
                do {
                    i = atomicInteger.get();
                    i2 = s3gVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(s3gVar.c + i, i2)));
            }
            ((grb) this.c).c.execute(new vlo(this, qicVar, false, 19));
        }
    }

    public void r(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        nff nffVar = new nff(byteArrayOutputStream, hashMap, (HashMap) this.c);
        if (obj == null) {
            return;
        }
        sjd sjdVar = (sjd) hashMap.get(obj.getClass());
        if (sjdVar != null) {
            sjdVar.a(obj, nffVar);
            return;
        }
        throw new mn5("No encoder for " + obj.getClass());
    }

    public File s() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        String str = "PersistedInstallation." + ((r38) this.c).d() + ".json";
                        r38 r38Var = (r38) this.c;
                        r38Var.a();
                        File file = new File(r38Var.a.getNoBackupFilesDir(), str);
                        this.b = file;
                        if (file.exists()) {
                            return (File) this.b;
                        }
                        r38 r38Var2 = (r38) this.c;
                        r38Var2.a();
                        File file2 = new File(r38Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.b)) {
                            new IOException("Unable to move the file from back up to non back up directory");
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public void t(String str, String str2) {
        ArrayList arrayList = ((k89) this.c).a;
        if (str.isEmpty()) {
            a70.p("name is empty");
            return;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                a70.p(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
        if (str2 == null) {
            a70.p("value == null");
            return;
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt2 = str2.charAt(i3);
            if (charAt2 <= 31 || charAt2 >= 127) {
                a70.p(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                return;
            }
        }
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public String toString() {
        switch (this.a) {
            case 16:
                String str = "[ ";
                if (((rvh) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((rvh) this.b).h[i] + " ";
                    }
                }
                StringBuilder r = mz1.r(str, "] ");
                r.append((rvh) this.b);
                return r.toString();
            case 26:
                return "Request{url=" + ((kl9) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public void u(uu0 uu0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", uu0Var.a);
            jSONObject.put("Status", wt3.C(uu0Var.b));
            jSONObject.put("AuthToken", uu0Var.c);
            jSONObject.put("RefreshToken", uu0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", uu0Var.f);
            jSONObject.put("ExpiresInSecs", uu0Var.e);
            jSONObject.put("FisError", uu0Var.g);
            r38 r38Var = (r38) this.c;
            r38Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", r38Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(C.UTF8_NAME));
            fileOutputStream.close();
            if (createTempFile.renameTo(s())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // defpackage.ay2
    public void v(cqa cqaVar) {
        p3g p3gVar = ((grb) this.c).o;
        boolean z = false;
        z1a.D("Headers should be received prior to messages.", p3gVar.f != null);
        if (p3gVar.f == ((r3g) this.b)) {
            ((grb) this.c).c.execute(new vlo(this, cqaVar, z, 20));
            return;
        }
        Logger logger = n49.a;
        while (true) {
            InputStream D = cqaVar.D();
            if (D == null) {
                return;
            } else {
                n49.b(D);
            }
        }
    }

    public uu0 w() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(s());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = uu0.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = wt3.D(5)[optInt];
        if (i2 == 0) {
            yhk.s("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i2 != 0) {
            return new uu0(optString, i2, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }

    public void x(twc twcVar) {
        x0d x0dVar = (x0d) this.b;
        Object g = ((x0d) this.c).g(twcVar);
        if (g != null) {
            int i = 14;
            if (!(g instanceof l0d)) {
                uyc.c(x0dVar, (rwc) g, new mnc(twcVar, i));
                return;
            }
            l0d l0dVar = (l0d) g;
            Object[] objArr = l0dVar.a;
            int i2 = l0dVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                obj.getClass();
                uyc.c(x0dVar, (rwc) obj, new mnc(twcVar, i));
            }
        }
    }

    @Override // defpackage.ay2
    public void z(xei xeiVar, zx2 zx2Var, qic qicVar) {
        boolean z;
        yli yliVar;
        grb grbVar;
        yih yihVar;
        Integer num = -1;
        synchronized (((grb) this.c).i) {
            grb grbVar2 = (grb) this.c;
            grbVar2.o = grbVar2.o.c((r3g) this.b);
            ((grb) this.c).n.b.add(String.valueOf(xeiVar.a));
        }
        boolean z2 = false;
        z2 = false;
        if (((grb) this.c).r.decrementAndGet() == Integer.MIN_VALUE) {
            ((grb) this.c).c.execute(new q3g(false ? 1 : 0, this));
            return;
        }
        r3g r3gVar = (r3g) this.b;
        if (r3gVar.c) {
            grb grbVar3 = (grb) this.c;
            g3g a = grbVar3.a(r3gVar);
            if (a != null) {
                grbVar3.b.execute(a);
            }
            if (((grb) this.c).o.f == ((r3g) this.b)) {
                ((grb) this.c).j(xeiVar, zx2Var, qicVar);
                return;
            }
            return;
        }
        zx2 zx2Var2 = zx2.d;
        if (zx2Var == zx2Var2 && ((grb) this.c).q.incrementAndGet() > 1000) {
            grb grbVar4 = (grb) this.c;
            g3g a2 = grbVar4.a((r3g) this.b);
            if (a2 != null) {
                grbVar4.b.execute(a2);
            }
            if (((grb) this.c).o.f == ((r3g) this.b)) {
                ((grb) this.c).j(xei.l.h("Too many transparent retries. Might be a bug in gRPC").g(xeiVar.a()), zx2Var, qicVar);
                return;
            }
            return;
        }
        if (((grb) this.c).o.f == null) {
            if (zx2Var == zx2Var2 || (zx2Var == zx2.b && ((grb) this.c).p.compareAndSet(false, true))) {
                r3g b = ((grb) this.c).b(((r3g) this.b).d, true);
                if (b == null) {
                    return;
                }
                grb grbVar5 = (grb) this.c;
                if (grbVar5.h) {
                    synchronized (grbVar5.i) {
                        grb grbVar6 = (grb) this.c;
                        grbVar6.o = grbVar6.o.b((r3g) this.b, b);
                    }
                }
                ((grb) this.c).b.execute(new pyn(this, b, z2, 18));
                return;
            }
            zx2 zx2Var3 = zx2.c;
            grb grbVar7 = (grb) this.c;
            if (zx2Var != zx2Var3) {
                grbVar7.p.set(true);
                grb grbVar8 = (grb) this.c;
                if (grbVar8.h) {
                    String str = (String) qicVar.c(grb.F);
                    if (str != null) {
                        try {
                            num = Integer.valueOf(str);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        num = null;
                    }
                    grb grbVar9 = (grb) this.c;
                    boolean contains = grbVar9.g.c.contains(xeiVar.a);
                    boolean z3 = (grbVar9.m == null || (!contains && (num == null || num.intValue() >= 0))) ? false : !grbVar9.m.a();
                    if (contains && !z3 && !xeiVar.f() && num != null && num.intValue() > 0) {
                        num = 0;
                    }
                    if (contains && !z3) {
                        z2 = true;
                    }
                    if (z2) {
                        ((grb) this.c).i(num);
                    }
                    synchronized (((grb) this.c).i) {
                        try {
                            grb grbVar10 = (grb) this.c;
                            p3g p3gVar = grbVar10.o;
                            r3g r3gVar2 = (r3g) this.b;
                            ArrayList arrayList = new ArrayList(p3gVar.d);
                            arrayList.remove(r3gVar2);
                            grbVar10.o = new p3g(p3gVar.b, p3gVar.c, Collections.unmodifiableCollection(arrayList), p3gVar.f, p3gVar.g, p3gVar.a, p3gVar.h, p3gVar.e);
                            if (z2) {
                                grb grbVar11 = (grb) this.c;
                                if (!grbVar11.h(grbVar11.o)) {
                                    if (!((grb) this.c).o.d.isEmpty()) {
                                    }
                                }
                                return;
                            }
                        } finally {
                        }
                    }
                } else {
                    z3g z3gVar = grbVar8.f;
                    long j = 0;
                    if (z3gVar == null) {
                        yliVar = new yli(false, 0L);
                    } else {
                        boolean contains2 = z3gVar.f.contains(xeiVar.a);
                        String str2 = (String) qicVar.c(grb.F);
                        if (str2 != null) {
                            try {
                                num = Integer.valueOf(str2);
                            } catch (NumberFormatException unused2) {
                            }
                        } else {
                            num = null;
                        }
                        boolean z4 = (grbVar8.m == null || (!contains2 && (num == null || num.intValue() >= 0))) ? false : !grbVar8.m.a();
                        if (grbVar8.f.a > ((r3g) this.b).d + 1 && !z4) {
                            if (num == null) {
                                if (contains2) {
                                    j = (long) (grb.H.nextDouble() * grbVar8.x);
                                    double d = grbVar8.x;
                                    z3g z3gVar2 = grbVar8.f;
                                    grbVar8.x = Math.min((long) (d * z3gVar2.d), z3gVar2.c);
                                    z = true;
                                }
                            } else if (num.intValue() >= 0) {
                                j = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                grbVar8.x = grbVar8.f.b;
                                z = true;
                            }
                            yliVar = new yli(z, j);
                        }
                        z = false;
                        yliVar = new yli(z, j);
                    }
                    if (yliVar.a) {
                        r3g b2 = ((grb) this.c).b(((r3g) this.b).d + 1, false);
                        if (b2 == null) {
                            return;
                        }
                        synchronized (((grb) this.c).i) {
                            grbVar = (grb) this.c;
                            yihVar = new yih(grbVar.i);
                            grbVar.v = yihVar;
                        }
                        yihVar.n(grbVar.d.schedule(new a8p(this, b2, z2, 19), yliVar.b, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            } else if (grbVar7.h) {
                grbVar7.g();
            }
        }
        grb grbVar12 = (grb) this.c;
        g3g a3 = grbVar12.a((r3g) this.b);
        if (a3 != null) {
            grbVar12.b.execute(a3);
        }
        if (((grb) this.c).o.f == ((r3g) this.b)) {
            ((grb) this.c).j(xeiVar, zx2Var, qicVar);
        }
    }

    public /* synthetic */ k1d(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ k1d(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ k1d(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public k1d(k1d k1dVar) {
        this.a = 26;
        this.b = (kl9) k1dVar.b;
        k89 k89Var = (k89) k1dVar.c;
        k89Var.getClass();
        this.c = new n89(k89Var);
    }

    public k1d(nw8 nw8Var) {
        this.a = 23;
        this.b = nw8Var;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new ow8(nw8Var, new int[]{1}));
    }

    public k1d(mi miVar) {
        this.a = 7;
        this.b = miVar;
        this.c = new em0(0);
    }

    public k1d(ExecutorService executorService) {
        this.a = 27;
        this.c = new dh0(0);
        this.b = executorService;
    }

    public k1d(rod rodVar, vcd vcdVar, ucd ucdVar) {
        this.a = 4;
        this.b = vcdVar;
        this.c = ucdVar;
    }

    public k1d(vff vffVar) {
        this.a = 12;
        this.c = Collections.synchronizedMap(new HashMap());
        this.b = vffVar;
    }

    public k1d(int i, d0l d0lVar) {
        this.a = 22;
        this.b = d0lVar;
        this.c = new jk3(i, this);
    }

    public k1d(cjj cjjVar) {
        this.a = 19;
        this.b = cjjVar;
        this.c = new nkk(4, false);
    }

    public k1d(k4e k4eVar, z41 z41Var) {
        this.a = 10;
        z41Var.getClass();
        this.c = k4eVar;
        this.b = z41Var;
    }

    public /* synthetic */ k1d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
