package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.q;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzekm;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfyl;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgac;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.measurement.zzmi;
import com.google.android.gms.internal.measurement.zzmq;
import com.google.android.gms.internal.measurement.zzmv;
import com.google.android.gms.internal.measurement.zzmw;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzqx;
import com.ironsource.C4324ta;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n72 implements kr8, mf2, zzfpi, zzfyl, zzdu {
    public static final b78 f = new b78();
    public static final Object g = new Object();
    public static n72 h;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0296  */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n72(zznd zzndVar, uif uifVar) {
        awf c;
        Object obj;
        char c2;
        long j;
        long j2;
        ?? r20;
        Object obj2;
        int i = 1;
        this.a = true;
        zzmw zzmwVar = zzndVar.a;
        zzmq zzmqVar = zzndVar.b;
        if (zzmwVar.a.isEmpty()) {
            zzmq.F().equals(zzmqVar);
        }
        this.b = zzmqVar.y();
        this.c = zzmqVar.z();
        zzmqVar.getClass();
        zzmqVar.getClass();
        Object obj3 = null;
        Map D = zzmqVar.C() == 0 ? null : zzmqVar.D();
        if (D != null) {
            vv9.t(D.keySet());
        } else {
            int i2 = vv9.c;
            Object[] objArr = ewf.i;
        }
        int C = zzmqVar.C();
        zzmw zzmwVar2 = zzndVar.a;
        char c3 = 3;
        if (C > 0) {
            Collection<zzmi> values = zzmqVar.D().values();
            if (values == null) {
                c = awf.g;
            } else {
                b10 d = lv9.d();
                for (zzmi zzmiVar : values) {
                    int M = zzmiVar.M();
                    int i3 = M - 1;
                    if (M == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        d.A(zzmiVar.y(), Long.valueOf(zzmiVar.z()));
                    } else if (i3 == 1) {
                        d.A(zzmiVar.y(), Boolean.valueOf(zzmiVar.A()));
                    } else if (i3 == 2) {
                        d.A(zzmiVar.y(), Double.valueOf(zzmiVar.B()));
                    } else if (i3 == 3) {
                        d.A(zzmiVar.y(), zzmiVar.C());
                    } else {
                        if (i3 != 4) {
                            a70.r("Could not serialize Flag for override: ".concat(String.valueOf(zzmiVar.y())));
                            throw null;
                        }
                        d.A(zzmiVar.y(), zzmiVar.D().s());
                    }
                }
                c = d.c(false);
            }
            if (!c.isEmpty()) {
                HashMap hashMap = new HashMap(c);
                aw9 aw9Var = zzmwVar2.a;
                yv9 yv9Var = new yv9(x5d.a);
                cck it = aw9Var.iterator();
                while (true) {
                    i4 i4Var = (i4) it;
                    if (i4Var.hasNext()) {
                        zzmv zzmvVar = (zzmv) i4Var.next();
                        String str = zzmvVar.b;
                        long j3 = zzmvVar.a;
                        Object remove = hashMap.remove(str == null ? Long.toString(j3) : str);
                        if (remove == null) {
                            yv9Var.c(zzmvVar);
                        } else if (remove instanceof String) {
                            yv9Var.c(new zzmv(zzmvVar.a, zzmvVar.b, 4, 0L, remove));
                        } else if (remove instanceof byte[]) {
                            yv9Var.c(new zzmv(zzmvVar.a, zzmvVar.b, 5, 0L, remove));
                        } else if (remove instanceof Boolean) {
                            yv9Var.c(new zzmv(zzmvVar.a, zzmvVar.b, ((Boolean) remove).booleanValue() ? 1 : 0, 0L, null));
                        } else if (remove instanceof Long) {
                            yv9Var.c(new zzmv(zzmvVar.a, zzmvVar.b, 2, ((Long) remove).longValue(), null));
                        } else {
                            if (!(remove instanceof Double)) {
                                String str2 = zzmvVar.b;
                                str2 = str2 == null ? Long.toString(j3) : str2;
                                String obj4 = remove.toString();
                                throw new IllegalStateException(fc6.o(new StringBuilder(fn0.c(46, str2) + obj4.length()), "Cannot serialize override for existing flag ", str2, ": ", obj4));
                            }
                            yv9Var.c(new zzmv(zzmvVar.a, zzmvVar.b, 3, Double.doubleToRawLongBits(((Double) remove).doubleValue()), null));
                        }
                    } else {
                        for (String str3 : hashMap.keySet()) {
                            Object obj5 = hashMap.get(str3);
                            int length = str3.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    obj2 = obj3;
                                    c2 = c3;
                                } else {
                                    obj = obj3;
                                    c2 = c3;
                                    long charAt = str3.charAt(0) - '0';
                                    obj = obj;
                                    if (charAt >= 1) {
                                        obj2 = obj;
                                        if (charAt <= 9) {
                                            int i4 = i;
                                            while (true) {
                                                if (i4 >= length) {
                                                    j = 0;
                                                    if (charAt >= 0 && charAt <= 2305843009213693951L) {
                                                        j2 = charAt;
                                                        r20 = obj;
                                                    }
                                                } else {
                                                    int charAt2 = str3.charAt(i4) - '0';
                                                    j = 0;
                                                    if ((charAt2 < 0) || (charAt2 > 9)) {
                                                        break;
                                                    }
                                                    charAt = (charAt * 10) + charAt2;
                                                    i4++;
                                                }
                                            }
                                            j2 = j;
                                            r20 = obj;
                                            String str4 = j2 == j ? str3 : r20;
                                            if (obj5 instanceof String) {
                                                yv9Var.c(new zzmv(j2, str4, 4, 0L, obj5));
                                            } else if (obj5 instanceof byte[]) {
                                                yv9Var.c(new zzmv(j2, str4, 5, 0L, obj5));
                                            } else if (obj5 instanceof Boolean) {
                                                yv9Var.c(new zzmv(j2, str4, ((Boolean) obj5).booleanValue() ? 1 : 0, 0L, null));
                                            } else if (obj5 instanceof Long) {
                                                yv9Var.c(new zzmv(j2, str4, 2, ((Long) obj5).longValue(), null));
                                            } else {
                                                if (!(obj5 instanceof Double)) {
                                                    String valueOf = String.valueOf(obj5);
                                                    a70.r(fc6.o(new StringBuilder(str3.length() + 28 + valueOf.length()), "Cannot serialize override ", str3, ": ", valueOf));
                                                    throw r20;
                                                }
                                                yv9Var.c(new zzmv(j2, str4, 3, Double.doubleToRawLongBits(((Double) obj5).doubleValue()), null));
                                            }
                                            c3 = c2;
                                            obj3 = r20;
                                            i = 1;
                                        }
                                    }
                                }
                                j = 0;
                                j2 = 0;
                                r20 = obj2;
                                if (j2 == j) {
                                }
                                if (obj5 instanceof String) {
                                }
                                c3 = c2;
                                obj3 = r20;
                                i = 1;
                            } else {
                                obj = obj3;
                                c2 = c3;
                            }
                            j = 0;
                            j2 = j;
                            r20 = obj;
                            if (j2 == j) {
                            }
                            if (obj5 instanceof String) {
                            }
                            c3 = c2;
                            obj3 = r20;
                            i = 1;
                        }
                        zzmwVar2 = new zzmw(yv9Var.i());
                    }
                }
            }
        }
        b10 e = lv9.e(((fwf) zzmwVar2.a).g.size() + 3);
        cck it2 = zzmwVar2.a.iterator();
        while (true) {
            i4 i4Var2 = (i4) it2;
            if (!i4Var2.hasNext()) {
                e.A("__phenotype_server_token", zzmqVar.A());
                e.A("__phenotype_snapshot_token", zzmqVar.y());
                e.A("__phenotype_configuration_version", Long.valueOf(zzmqVar.B()));
                this.d = e.c(false);
                this.e = uifVar;
                return;
            }
            zzmv zzmvVar2 = (zzmv) i4Var2.next();
            String str5 = zzmvVar2.b;
            if (str5 == null) {
                str5 = Long.toString(zzmvVar2.a);
            }
            e.A(str5, zzmvVar2.a());
        }
    }

    public static String D(tuo tuoVar) {
        vuo z = xuo.z();
        String s = tuoVar.s().s();
        z.b();
        ((xuo) z.b).B(s);
        String t = tuoVar.s().t();
        z.b();
        ((xuo) z.b).C(t);
        long v = tuoVar.s().v();
        z.b();
        ((xuo) z.b).E(v);
        long w = tuoVar.s().w();
        z.b();
        ((xuo) z.b).F(w);
        long u = tuoVar.s().u();
        z.b();
        ((xuo) z.b).D(u);
        return Hex.a(((xuo) z.c()).b());
    }

    public static String E(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzazs D = zzazt.D();
        D.n();
        ((zzazt) D.b).H(5);
        mpo B = zziei.B(0, bArr.length, bArr);
        D.n();
        ((zzazt) D.b).E(B);
        return Base64.encodeToString(((zzazt) D.o()).d(), 11);
    }

    public static int k(lf2 lf2Var, int i) {
        int hashCode = lf2Var.b.hashCode() + (lf2Var.a * 31);
        ao4 ao4Var = lf2Var.e;
        if (i < 2) {
            long a = ep3.a(ao4Var);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return ao4Var.hashCode() + (hashCode * 31);
    }

    public static lf2 m(int i, DataInputStream dataInputStream) {
        ao4 b0;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            fp3 fp3Var = new fp3(0);
            fp3Var.a(Long.valueOf(readLong), "exo_len");
            b0 = ao4.c.b(fp3Var);
        } else {
            b0 = vng.b0(dataInputStream);
        }
        return new lf2(readInt, readUTF, b0);
    }

    public synchronized boolean A() {
        Object obj;
        try {
            obj = this.b;
        } catch (Exception e) {
            throw new zzgaa(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void B() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.b;
            obj.getClass().getDeclaredMethod(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, null).invoke(obj, null);
            ((zzfyi) this.e).b(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzgaa(2003, e);
        }
    }

    public synchronized int C() {
        Object obj;
        try {
            obj = this.b;
        } catch (Exception e) {
            throw new zzgaa(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, null).invoke(obj, null)).intValue();
    }

    public void F(int i, long j) {
        ((vzo) this.e).zza(i, j);
    }

    public synchronized byte[] G(Map map) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.b;
        } catch (Exception e) {
            ((zzfyi) this.e).c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public xuo H(int i) {
        z8n b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        String str = (String) this.d;
        String string = i == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                byte[] c = Hex.c(string);
                e8n v = g8n.v(0, c.length, c);
                if (this.a) {
                    z8n z8nVar = z8n.b;
                    int i2 = o7n.a;
                    b = z8n.c;
                } else {
                    b = z8n.b();
                }
                return xuo.y(v, b);
            } catch (NullPointerException unused) {
                this.F(2029, currentTimeMillis);
            } catch (RuntimeException unused2) {
                this.F(2032, currentTimeMillis);
            } catch (lan unused3) {
            }
        }
        return null;
    }

    public void a() {
        synchronized (((ie2) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            wol.b((ejh) this.c);
            try {
                ((en0) this.b).b();
            } catch (IOException unused) {
            }
        }
    }

    public void b(ha5 ha5Var, float f2, long j) {
        float floatValue = ((Number) ((q50) this.c).d()).floatValue();
        if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            long c = r13.c(j, floatValue);
            if (!this.a) {
                ha5.U(ha5Var, c, f2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            }
            float f3 = njh.f(ha5Var.n());
            float d = njh.d(ha5Var.n());
            sx2 L0 = ha5Var.L0();
            long D = L0.D();
            L0.t().o();
            try {
                ((hpo) L0.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, d, 1);
                ha5.U(ha5Var, c, f2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            } finally {
                mz1.v(L0, D);
            }
        }
    }

    @Override // defpackage.kr8
    public void close() {
        this.a = true;
        z1a.D("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.d) != null);
        ((lod) ((o2) this.e)).m.n((qic) this.b, (byte[]) this.d);
        this.d = null;
        this.b = null;
    }

    @Override // defpackage.kr8
    public void e(zef zefVar) {
        uei ueiVar = (uei) this.c;
        cy2[] cy2VarArr = ueiVar.a;
        z1a.D("writePayload should not be called multiple times", ((byte[]) this.d) == null);
        try {
            this.d = tb2.b(zefVar);
            for (cy2 cy2Var : cy2VarArr) {
                cy2Var.i(0);
            }
            byte[] bArr = (byte[]) this.d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (cy2 cy2Var2 : ueiVar.a) {
                cy2Var2.j(0, length, length2);
            }
            long length3 = ((byte[]) this.d).length;
            for (cy2 cy2Var3 : cy2VarArr) {
                cy2Var3.k(length3);
            }
            long length4 = ((byte[]) this.d).length;
            for (cy2 cy2Var4 : cy2VarArr) {
                cy2Var4.l(length4);
            }
        } catch (IOException e) {
            is8.h(e);
        }
    }

    @Override // defpackage.mf2
    public void f(lf2 lf2Var) {
        this.a = true;
    }

    public void g(i7a i7aVar, ku3 ku3Var) {
        n72 n72Var;
        ArrayList arrayList = (ArrayList) this.d;
        if (i7aVar instanceof sf9) {
            arrayList.add(i7aVar);
        } else if (i7aVar instanceof tf9) {
            arrayList.remove(((tf9) i7aVar).a);
        } else if (i7aVar instanceof rd8) {
            arrayList.add(i7aVar);
        } else if (i7aVar instanceof sd8) {
            arrayList.remove(((sd8) i7aVar).a);
        } else if (i7aVar instanceof m95) {
            arrayList.add(i7aVar);
        } else if (i7aVar instanceof n95) {
            arrayList.remove(((n95) i7aVar).a);
        } else if (!(i7aVar instanceof l95)) {
            return;
        } else {
            arrayList.remove(((l95) i7aVar).a);
        }
        i7a i7aVar2 = (i7a) CollectionsKt.j0(arrayList);
        if (Intrinsics.c((i7a) this.e, i7aVar2)) {
            return;
        }
        rq3 rq3Var = null;
        if (i7aVar2 != null) {
            g5g g5gVar = (g5g) ((Function0) this.b).invoke();
            boolean z = i7aVar2 instanceof sf9;
            float f2 = z ? g5gVar.c : i7aVar2 instanceof rd8 ? g5gVar.b : i7aVar2 instanceof m95 ? g5gVar.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            i4k i4kVar = m5g.a;
            if (!z) {
                if (i7aVar2 instanceof rd8) {
                    i4kVar = new i4k(45, jg5.d, 2);
                } else if (i7aVar2 instanceof m95) {
                    i4kVar = new i4k(45, jg5.d, 2);
                }
            }
            n72Var = this;
            xw3.L(ku3Var, null, null, new pv2(n72Var, f2, i4kVar, rq3Var, 4), 3);
        } else {
            n72Var = this;
            i7a i7aVar3 = (i7a) n72Var.e;
            i4k i4kVar2 = m5g.a;
            if (!(i7aVar3 instanceof sf9) && !(i7aVar3 instanceof rd8) && (i7aVar3 instanceof m95)) {
                i4kVar2 = new i4k(150, jg5.d, 2);
            }
            xw3.L(ku3Var, null, null, new big(n72Var, i4kVar2, rq3Var, 29), 3);
        }
        n72Var.e = i7aVar2;
    }

    @Override // defpackage.mf2
    public boolean h() {
        f4a f4aVar = (f4a) this.d;
        return ((File) f4aVar.b).exists() || ((File) f4aVar.c).exists();
    }

    @Override // defpackage.mf2
    public void i(HashMap hashMap) {
        if (this.a) {
            p(hashMap);
        }
    }

    @Override // defpackage.kr8
    public boolean isClosed() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int l(k1d k1dVar, xy xyVar, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        gc9 gc9Var = (gc9) this.c;
        jc9 jc9Var = (jc9) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            yih x = ((bka) this.d).x(k1dVar, xyVar);
            nkb nkbVar = (nkb) x.c;
            int i3 = nkbVar.i();
            for (int i4 = 0; i4 < i3; i4++) {
                mze mzeVar = (mze) nkbVar.j(i4);
                if (!mzeVar.d && !mzeVar.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int i5 = nkbVar.i();
            for (int i6 = 0; i6 < i5; i6++) {
                mze mzeVar2 = (mze) nkbVar.j(i6);
                if (objArr != false || qea.l(mzeVar2)) {
                    ((wma) this.b).A(mzeVar2.c, jc9Var, mzeVar2.i, true);
                    if (!jc9Var.a.h()) {
                        gc9Var.a(jc9Var, qea.l(mzeVar2), mzeVar2.a);
                        jc9Var.clear();
                    }
                }
            }
            boolean b = gc9Var.b(x, z);
            if (!x.b) {
                int i7 = nkbVar.i();
                for (int i8 = 0; i8 < i7; i8++) {
                    mze mzeVar3 = (mze) nkbVar.j(i8);
                    if (!dnd.c(qea.E(mzeVar3, true), 0L) && mzeVar3.b()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int i9 = nkbVar.i();
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    i2 = 0;
                    break;
                }
                if (((mze) nkbVar.j(i10)).b()) {
                    i2 = 1;
                    break;
                }
                i10++;
            }
            int i11 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i11;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public synchronized void n() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((m30) this.c).b(context);
                context.unregisterComponentCallbacks((n30) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String o(Context context) {
        byte[] G;
        try {
            HashMap zzb = ((zzgac) this.d).zzb();
            zzb.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
            zzb.put("ctx", context);
            zzb.put(C4324ta.b, null);
            G = G(zzb);
            if (this.a) {
                zzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return E(G);
    }

    @Override // defpackage.mf2
    public void p(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        f4a f4aVar = (f4a) this.d;
        DataOutputStream dataOutputStream2 = null;
        try {
            cm0 z = f4aVar.z();
            d4g d4gVar = (d4g) this.e;
            if (d4gVar == null) {
                this.e = new d4g(z);
            } else {
                d4gVar.e(z);
            }
            dataOutputStream = new DataOutputStream((d4g) this.e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (lf2 lf2Var : hashMap.values()) {
                dataOutputStream.writeInt(lf2Var.a);
                dataOutputStream.writeUTF(lf2Var.b);
                vng.v0(lf2Var.e, dataOutputStream);
                i += k(lf2Var, 2);
            }
            dataOutputStream.writeInt(i);
            dataOutputStream.close();
            ((File) f4aVar.c).delete();
            String str = nik.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            nik.h(dataOutputStream2);
            throw th;
        }
    }

    @Override // defpackage.mf2
    public void q(lf2 lf2Var, boolean z) {
        this.a = true;
    }

    @Override // defpackage.mf2
    public void r(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        int readInt;
        DataInputStream dataInputStream2;
        int i;
        int readInt2;
        boolean z;
        z1a.E(!this.a);
        Cipher cipher = (Cipher) this.b;
        f4a f4aVar = (f4a) this.d;
        File file = (File) f4aVar.b;
        File file2 = (File) f4aVar.b;
        File file3 = (File) f4aVar.c;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream3 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    readInt = dataInputStream.readInt();
                } catch (IOException unused) {
                    dataInputStream3 = dataInputStream;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream3 = dataInputStream;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            if (readInt >= 0 && readInt <= 2) {
                if ((dataInputStream.readInt() & 1) == 0) {
                    dataInputStream2 = dataInputStream;
                } else if (cipher != null) {
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    try {
                        SecretKeySpec secretKeySpec = (SecretKeySpec) this.c;
                        String str = nik.a;
                        cipher.init(2, secretKeySpec, ivParameterSpec);
                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                try {
                    int readInt3 = dataInputStream2.readInt();
                    i = 0;
                    for (int i2 = 0; i2 < readInt3; i2++) {
                        lf2 m = m(readInt, dataInputStream2);
                        String str2 = m.b;
                        hashMap.put(str2, m);
                        sparseArray.put(m.a, str2);
                        i += k(m, readInt);
                    }
                    readInt2 = dataInputStream2.readInt();
                    z = dataInputStream2.read() == -1;
                } catch (IOException unused3) {
                    dataInputStream3 = dataInputStream2;
                    if (dataInputStream3 != null) {
                        nik.h(dataInputStream3);
                    }
                    hashMap.clear();
                    sparseArray.clear();
                    file2.delete();
                    file3.delete();
                } catch (Throwable th3) {
                    dataInputStream3 = dataInputStream2;
                    th = th3;
                    if (dataInputStream3 != null) {
                        nik.h(dataInputStream3);
                    }
                    throw th;
                }
                if (readInt2 == i && z) {
                    nik.h(dataInputStream2);
                    return;
                }
                nik.h(dataInputStream2);
                hashMap.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            }
            nik.h(dataInputStream);
            hashMap.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    @Override // defpackage.mf2
    public void s() {
        f4a f4aVar = (f4a) this.d;
        ((File) f4aVar.b).delete();
        ((File) f4aVar.c).delete();
    }

    public boolean t(tuo tuoVar, mxn mxnVar) {
        boolean z;
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (g) {
            try {
                xuo H = H(1);
                String s = tuoVar.s().s();
                if (H != null && H.s().equals(s)) {
                    F(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File z3 = z(s);
                if (z3.exists()) {
                    String str = true != z3.isDirectory() ? "0" : "1";
                    String str2 = true != z3.isFile() ? "0" : "1";
                    z = false;
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    ((vzo) this.e).zzb(4023, currentTimeMillis2, sb.toString());
                    F(4015, currentTimeMillis2);
                } else {
                    z = false;
                    if (!z3.mkdirs()) {
                        ((vzo) this.e).zzb(4024, currentTimeMillis2, "cw:".concat(true != z3.canWrite() ? "0" : "1"));
                        F(4015, currentTimeMillis2);
                        return false;
                    }
                }
                File z4 = z(s);
                File file = new File(z4, "pcam.jar");
                File file2 = new File(z4, "pcbc");
                if (!tba.S(file, tuoVar.t().x())) {
                    F(4016, currentTimeMillis);
                    return z;
                }
                if (!tba.S(file2, tuoVar.u().x())) {
                    F(4017, currentTimeMillis);
                    return z;
                }
                if (mxnVar != null) {
                    try {
                        z2 = ((xyo) mxnVar.b).a(file);
                    } catch (GeneralSecurityException unused) {
                        z2 = z;
                    }
                    if (!z2) {
                        F(4018, currentTimeMillis);
                        tba.V(z4);
                        return z;
                    }
                }
                String D = D(tuoVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                String string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.d)), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.d)), D);
                if (string != null) {
                    edit.putString("FBAMTD".concat(String.valueOf((String) this.d)), string);
                }
                if (!edit.commit()) {
                    F(4019, currentTimeMillis3);
                    return z;
                }
                HashSet hashSet = new HashSet();
                xuo H2 = H(1);
                if (H2 != null) {
                    hashSet.add(H2.s());
                }
                xuo H3 = H(2);
                if (H3 != null) {
                    hashSet.add(H3.s());
                }
                boolean z5 = z;
                File[] listFiles = new File(((Context) this.b).getDir("pccache", z5 ? 1 : 0), (String) this.d).listFiles();
                int length = listFiles.length;
                for (int i = z5 ? 1 : 0; i < length; i++) {
                    File file3 = listFiles[i];
                    if (!hashSet.contains(file3.getName())) {
                        tba.V(file3);
                    }
                }
                F(5014, currentTimeMillis);
                return true;
            } finally {
            }
        }
    }

    public synchronized String u(Context context, View view, Activity activity) {
        byte[] G;
        try {
            HashMap zzc = ((zzgac) this.d).zzc();
            zzc.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
            zzc.put("ctx", context);
            zzc.put(C4324ta.b, null);
            zzc.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
            zzc.put("act", activity);
            G = G(zzc);
            if (this.a) {
                zzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return E(G);
    }

    public boolean v(tuo tuoVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (g) {
            try {
                if (!tba.S(new File(z(tuoVar.s().s()), "pcbc"), tuoVar.u().x())) {
                    F(4020, currentTimeMillis);
                    return false;
                }
                String D = D(tuoVar);
                SharedPreferences.Editor edit = ((SharedPreferences) this.c).edit();
                edit.putString("LATMTD".concat(String.valueOf((String) this.d)), D);
                boolean commit = edit.commit();
                if (commit) {
                    F(5015, currentTimeMillis);
                } else {
                    F(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String w(Context context, String str, View view, Activity activity) {
        byte[] G;
        try {
            HashMap zzd = ((zzgac) this.d).zzd();
            zzd.put(InneractiveMediationDefs.GENDER_FEMALE, a.q);
            zzd.put("ctx", context);
            zzd.put("cs", str);
            zzd.put(C4324ta.b, null);
            zzd.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
            zzd.put("act", activity);
            G = G(zzd);
            if (this.a) {
                zzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return E(G);
    }

    public synchronized void x(MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap zze = ((zzgac) this.d).zze();
            zze.put(C4324ta.b, null);
            zze.put("evt", motionEvent);
            Object obj = this.b;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, zze);
            ((zzfyi) this.e).b(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzgaa(2005, e);
        }
    }

    public boolean y() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (g) {
            try {
                xuo H = H(1);
                if (H == null) {
                    F(4025, currentTimeMillis);
                    return false;
                }
                File z = z(H.s());
                if (!new File(z, "pcam.jar").exists()) {
                    F(4026, currentTimeMillis);
                    return false;
                }
                if (new File(z, "pcbc").exists()) {
                    F(5019, currentTimeMillis);
                    return true;
                }
                F(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public File z(String str) {
        return new File(new File(((Context) this.b).getDir("pccache", 0), (String) this.d), str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        long j;
        long j2;
        int i;
        zzekj zzekjVar = ((q) this.b).b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzekjVar.a.zzx()) {
            return null;
        }
        zzbil.zzaf.zzd zzdVar = (zzbil.zzaf.zzd) this.e;
        zzbil.zzab zzabVar = (zzbil.zzab) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        boolean z = this.a;
        zzbil.zzaf.zza.C0135zza V = zzbil.zzaf.zza.V();
        V.n();
        ((zzbil.zzaf.zza) V.b).E(arrayList);
        Context context = zzekjVar.c;
        zzbil.zzq zzqVar = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? zzbil.zzq.ENUM_TRUE : zzbil.zzq.ENUM_FALSE;
        V.n();
        ((zzbil.zzaf.zza) V.b).M(zzqVar);
        zzbil.zzq zzd = zzt.zzf().zzd(context, zzekjVar.e);
        V.n();
        ((zzbil.zzaf.zza) V.b).N(zzd);
        zzekb zzekbVar = zzekjVar.f;
        synchronized (zzekbVar.h) {
            j = zzekbVar.c;
        }
        V.n();
        ((zzbil.zzaf.zza) V.b).K(j);
        synchronized (zzekbVar) {
            synchronized (zzekbVar.j) {
                j2 = zzekbVar.e;
            }
        }
        V.n();
        ((zzbil.zzaf.zza) V.b).D(j2);
        synchronized (zzekbVar.g) {
            i = zzekbVar.b;
        }
        V.n();
        ((zzbil.zzaf.zza) V.b).O(i);
        V.n();
        ((zzbil.zzaf.zza) V.b).Q(zzdVar);
        V.n();
        ((zzbil.zzaf.zza) V.b).F(zzabVar);
        zzbil.zzq zzqVar2 = zzekjVar.g;
        V.n();
        ((zzbil.zzaf.zza) V.b).P(zzqVar2);
        zzbil.zzq zzqVar3 = z ? zzbil.zzq.ENUM_TRUE : zzbil.zzq.ENUM_FALSE;
        V.n();
        ((zzbil.zzaf.zza) V.b).J(zzqVar3);
        long a = zzekbVar.a();
        V.n();
        ((zzbil.zzaf.zza) V.b).R(a);
        long a2 = zzt.zzk().a();
        V.n();
        ((zzbil.zzaf.zza) V.b).I(a2);
        zzbil.zzq zzqVar4 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? zzbil.zzq.ENUM_TRUE : zzbil.zzq.ENUM_FALSE;
        V.n();
        ((zzbil.zzaf.zza) V.b).G(zzqVar4);
        byte[] d = ((zzbil.zzaf.zza) V.o()).d();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        zzekm.b(sQLiteDatabase, zzekjVar.f.a(), d);
        return null;
    }

    @Override // defpackage.kr8
    public void flush() {
    }

    @Override // defpackage.kr8
    public kr8 c(tz2 tz2Var) {
        return this;
    }

    @Override // defpackage.kr8
    public void d(int i) {
    }

    @Override // defpackage.mf2
    public void j(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzxz) obj).g(0, ((zzxy) this.b).a, (zzxf) this.c, (zzxk) this.d, (IOException) this.e, this.a);
    }

    public n72(Context context, int i, vzo vzoVar, boolean z) {
        this.a = false;
        this.b = context;
        this.d = Integer.toString(i - 1);
        this.c = context.getSharedPreferences("pcvmspf", 0);
        this.e = vzoVar;
        this.a = z;
    }

    public /* synthetic */ n72(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.a = z;
    }

    public n72(zzqv zzqvVar, uif uifVar) {
        this.a = false;
        zzqv.F().equals(zzqvVar);
        this.b = zzqvVar.y();
        this.c = zzqvVar.z();
        int i = vv9.c;
        Object[] objArr = ewf.i;
        b10 e = lv9.e(zzqvVar.D() + 3);
        for (zzqx zzqxVar : zzqvVar.C()) {
            int L = zzqxVar.L();
            int i2 = L - 1;
            if (L == 0) {
                throw null;
            }
            if (i2 == 0) {
                e.A(zzqxVar.y(), Long.valueOf(zzqxVar.z()));
            } else if (i2 == 1) {
                e.A(zzqxVar.y(), Boolean.valueOf(zzqxVar.A()));
            } else if (i2 == 2) {
                e.A(zzqxVar.y(), Double.valueOf(zzqxVar.B()));
            } else if (i2 == 3) {
                e.A(zzqxVar.y(), zzqxVar.C());
            } else if (i2 == 4) {
                e.A(zzqxVar.y(), zzqxVar.D().s());
            }
        }
        e.A("__phenotype_server_token", zzqvVar.A());
        e.A("__phenotype_snapshot_token", zzqvVar.y());
        e.A("__phenotype_configuration_version", Long.valueOf(zzqvVar.B()));
        this.d = e.c(false);
        this.e = uifVar;
    }

    public n72(boolean z, Function0 function0) {
        this.a = z;
        this.b = function0;
        this.c = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = new ArrayList();
    }
}
