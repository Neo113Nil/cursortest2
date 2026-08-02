package androidx.appcompat.view.menu;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.core.view.i1;
import androidx.core.view.n1;
import androidx.core.view.s1;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzr;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s7.e2;
import s7.f1;
import s7.k1;
import s7.n0;
import s7.o3;
import s7.q2;
import s7.r0;
import s7.r2;
import s7.r3;
import s7.s3;
import s7.v3;
import s7.y2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f473e;

    public /* synthetic */ f(int i5, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f469a = i5;
        this.f473e = obj;
        this.f470b = obj2;
        this.f471c = obj3;
        this.f472d = obj4;
    }

    private final void a() {
        s7.a0 a0Var;
        y2 y2Var = (y2) this.f470b;
        AtomicReference atomicReference = (AtomicReference) this.f471c;
        zzr zzrVar = (zzr) this.f472d;
        zzoo zzooVar = (zzoo) this.f473e;
        synchronized (atomicReference) {
            try {
                a0Var = y2Var.f23257d;
            } catch (RemoteException e7) {
                n0 n0Var = ((f1) y2Var.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.b(e7, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (a0Var != null) {
                a0Var.C(zzrVar, zzooVar, new r2(y2Var, atomicReference));
                y2Var.w();
            } else {
                n0 n0Var2 = ((f1) y2Var.f3328a).f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.a("[sgtm] Failed to get upload batches; not connected to service");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:89|90|(5:92|(1:94)|96|97|98)|100|(2:103|101)|104|105|106|107|(2:110|108)|111|112|(1:114)|115|97|98) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0446, code lost:
    
        r5.a().f22906i.b(r2, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0377, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r7 + r9)) goto L90;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        s7.a0 a0Var;
        s7.a0 a0Var2;
        switch (this.f469a) {
            case 0:
                h hVar = (h) ((h9.c) this.f473e).f10430b;
                p pVar = (p) this.f471c;
                g gVar = (g) this.f470b;
                if (gVar != null) {
                    hVar.f499z = true;
                    gVar.f475b.close(false);
                    hVar.f499z = false;
                }
                if (pVar.isEnabled() && pVar.hasSubMenu()) {
                    ((n) this.f472d).performItemAction(pVar, 4);
                    return;
                }
                return;
            case 1:
                n1.i((View) this.f470b, (s1) this.f471c, (i1) this.f472d);
                ((ValueAnimator) this.f473e).start();
                return;
            case 2:
                k1 k1Var = (k1) this.f470b;
                String str = (String) this.f471c;
                zzoo zzooVar = (zzoo) this.f472d;
                s7.e0 e0Var = (s7.e0) this.f473e;
                r3 r3Var = k1Var.f22848a;
                r3Var.B();
                r3Var.b().j();
                r3Var.l0();
                s7.j jVar = r3Var.f22989c;
                r3.U(jVar);
                Object obj = null;
                List<s3> o3 = jVar.o(str, zzooVar, ((Integer) s7.x.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (s3 s3Var : o3) {
                    String str2 = s3Var.f23064c;
                    long j = s3Var.f23069h;
                    long j6 = s3Var.f23062a;
                    if (r3Var.s(str, str2)) {
                        int i5 = s3Var.f23070i;
                        if (i5 > 0) {
                            if (i5 <= ((Integer) s7.x.f23228z.a(obj)).intValue()) {
                                long min = Math.min(((Long) s7.x.f23225x.a(obj)).longValue() * (1 << (i5 - 1)), ((Long) s7.x.f23226y.a(obj)).longValue());
                                r3Var.f().getClass();
                                break;
                            }
                            r3Var.a().f22910n.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j6), Long.valueOf(j));
                            obj = null;
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : s3Var.f23065d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j10 = s3Var.f23062a;
                        g3 g3Var = s3Var.f23063b;
                        zzom zzomVar = new zzom(j10, g3Var.a(), s3Var.f23064c, bundle, s3Var.f23066e.f22858a, s3Var.f23068g, "");
                        f3 f3Var = (f3) r0.W(g3.w(), zzomVar.f5805b);
                        for (int i10 = 0; i10 < ((g3) f3Var.f5041b).q(); i10++) {
                            h3 h3Var = (h3) ((g3) f3Var.f5041b).r(i10).i();
                            r3Var.f().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            h3Var.b();
                            ((i3) h3Var.f5041b).f0(currentTimeMillis);
                            f3Var.b();
                            ((g3) f3Var.f5041b).y(i10, (i3) h3Var.f());
                        }
                        zzomVar.f5805b = ((g3) f3Var.f()).a();
                        if (Log.isLoggable(r3Var.a().t(), 2)) {
                            r0 r0Var = r3Var.f22993g;
                            r3.U(r0Var);
                            zzomVar.f5810g = r0Var.M((g3) f3Var.f());
                        }
                        arrayList.add(zzomVar);
                        obj = null;
                    } else {
                        r3Var.a().f22910n.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j6), s3Var.f23064c);
                    }
                }
                try {
                    e0Var.E(new zzoq(arrayList));
                    r3Var.a().f22910n.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e7) {
                    r3Var.a().f22903f.c(str, e7, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 3:
                y2 p10 = ((AppMeasurementDynamiteService) this.f473e).f5780a.p();
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) this.f470b;
                zzbg zzbgVar = (zzbg) this.f471c;
                String str3 = (String) this.f472d;
                p10.j();
                p10.k();
                f1 f1Var = (f1) p10.f3328a;
                v3 v3Var = f1Var.f22748i;
                f1.k(v3Var);
                if (c6.d.f3660b.b(((f1) v3Var.f3328a).f22740a, 12451000) == 0) {
                    p10.x(new f(7, p10, zzbgVar, str3, n0Var));
                    return;
                }
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22906i.a("Not bundling data. Service unavailable or out of date");
                v3 v3Var2 = f1Var.f22748i;
                f1.k(v3Var2);
                v3Var2.W(n0Var, new byte[0]);
                return;
            case 4:
                k1 k1Var2 = (k1) this.f470b;
                Bundle bundle2 = (Bundle) this.f471c;
                String str4 = (String) this.f472d;
                zzr zzrVar = (zzr) this.f473e;
                r3 r3Var2 = k1Var2.f22848a;
                boolean t3 = r3Var2.e0().t(null, s7.x.W0);
                if (bundle2.isEmpty() && t3) {
                    s7.j jVar2 = r3Var2.f22989c;
                    r3.U(jVar2);
                    jVar2.j();
                    jVar2.k();
                    try {
                        jVar2.Y().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e9) {
                        n0 n0Var3 = ((f1) jVar2.f3328a).f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22903f.b(e9, "Error clearing default event params");
                        return;
                    }
                }
                s7.j jVar3 = r3Var2.f22989c;
                r3.U(jVar3);
                f1 f1Var2 = (f1) jVar3.f3328a;
                jVar3.j();
                jVar3.k();
                kh.l lVar = new kh.l((f1) jVar3.f3328a, "", str4, "dep", 0L, 0L, bundle2);
                r0 r0Var2 = jVar3.f22859b.f22993g;
                r3.U(r0Var2);
                byte[] a7 = r0Var2.L(lVar).a();
                n0 n0Var4 = f1Var2.f22745f;
                f1.m(n0Var4);
                n0Var4.f22910n.c(str4, Integer.valueOf(a7.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put(CommonUrlParts.APP_ID, str4);
                contentValues.put("parameters", a7);
                try {
                    if (jVar3.Y().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        f1.m(n0Var4);
                        n0Var4.f22903f.b(n0.r(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e10) {
                    f1.m(n0Var4);
                    n0Var4.f22903f.c(n0.r(str4), e10, "Error storing default event parameters. appId");
                }
                s7.j jVar4 = r3Var2.f22989c;
                r3.U(jVar4);
                long j11 = zzrVar.D;
                try {
                    if (jVar4.U("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j11)}, 0L) > 0) {
                        return;
                    }
                    if (jVar4.U("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j11)}, 0L) > 0) {
                        s7.j jVar5 = r3Var2.f22989c;
                        r3.U(jVar5);
                        jVar5.B(str4, Long.valueOf(j11), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e11) {
                    n0 n0Var5 = ((f1) jVar4.f3328a).f22745f;
                    f1.m(n0Var5);
                    n0Var5.f22903f.b(e11, "Error checking backfill conditions");
                    return;
                }
            case 5:
                String str5 = (String) this.f471c;
                String str6 = (String) this.f472d;
                y2 p11 = ((f1) ((e2) this.f473e).f3328a).p();
                AtomicReference atomicReference = (AtomicReference) this.f470b;
                p11.j();
                p11.k();
                p11.x(new io.sentry.android.replay.z(p11, atomicReference, str5, str6, p11.z(false), 2));
                return;
            case 6:
                y2 p12 = ((AppMeasurementDynamiteService) this.f473e).f5780a.p();
                com.google.android.gms.internal.measurement.n0 n0Var6 = (com.google.android.gms.internal.measurement.n0) this.f470b;
                String str7 = (String) this.f471c;
                String str8 = (String) this.f472d;
                p12.j();
                p12.k();
                p12.x(new io.sentry.android.replay.z(p12, str7, str8, p12.z(false), n0Var6, 3));
                return;
            case 7:
                com.google.android.gms.internal.measurement.n0 n0Var7 = (com.google.android.gms.internal.measurement.n0) this.f472d;
                y2 y2Var = (y2) this.f473e;
                byte[] bArr = null;
                try {
                    try {
                        a0Var = y2Var.f23257d;
                    } finally {
                        v3 v3Var3 = ((f1) y2Var.f3328a).f22748i;
                        f1.k(v3Var3);
                        v3Var3.W(n0Var7, null);
                    }
                } catch (RemoteException e12) {
                    n0 n0Var8 = ((f1) y2Var.f3328a).f22745f;
                    f1.m(n0Var8);
                    n0Var8.f22903f.b(e12, "Failed to send event to the service to bundle");
                }
                if (a0Var != null) {
                    bArr = a0Var.v((zzbg) this.f470b, (String) this.f471c);
                    y2Var.w();
                    return;
                }
                f1 f1Var3 = (f1) y2Var.f3328a;
                n0 n0Var9 = f1Var3.f22745f;
                f1.m(n0Var9);
                n0Var9.f22903f.a("Discarding data. Failed to send event to service to bundle");
                v3 v3Var4 = f1Var3.f22748i;
                f1.k(v3Var4);
                v3Var4.W(n0Var7, null);
                return;
            case 8:
                y2 y2Var2 = (y2) this.f470b;
                AtomicReference atomicReference2 = (AtomicReference) this.f471c;
                zzr zzrVar2 = (zzr) this.f472d;
                Bundle bundle3 = (Bundle) this.f473e;
                synchronized (atomicReference2) {
                    try {
                        a0Var2 = y2Var2.f23257d;
                    } catch (RemoteException e13) {
                        n0 n0Var10 = ((f1) y2Var2.f3328a).f22745f;
                        f1.m(n0Var10);
                        n0Var10.f22903f.b(e13, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                    if (a0Var2 != null) {
                        a0Var2.L(zzrVar2, bundle3, new q2(y2Var2, atomicReference2));
                        y2Var2.w();
                        return;
                    } else {
                        n0 n0Var11 = ((f1) y2Var2.f3328a).f22745f;
                        f1.m(n0Var11);
                        n0Var11.f22903f.a("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                }
            case 9:
                a();
                return;
            default:
                r3 r3Var3 = ((o3) this.f473e).f22938a;
                v3 k0 = r3Var3.k0();
                r3Var3.f().getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                String str9 = (String) this.f470b;
                zzbg N = k0.N((String) this.f471c, (Bundle) this.f472d, "auto", currentTimeMillis2, false);
                g6.v.h(N);
                r3Var3.h(N, str9);
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i5, boolean z5) {
        this.f469a = i5;
        this.f470b = obj;
        this.f471c = obj2;
        this.f472d = obj3;
        this.f473e = obj4;
    }

    public f(e2 e2Var, AtomicReference atomicReference, String str, String str2) {
        this.f469a = 5;
        this.f470b = atomicReference;
        this.f471c = str;
        this.f472d = str2;
        Objects.requireNonNull(e2Var);
        this.f473e = e2Var;
    }
}
