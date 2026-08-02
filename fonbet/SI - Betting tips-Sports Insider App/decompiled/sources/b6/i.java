package b6;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.lifecycle.u0;
import com.android.billingclient.api.o0;
import com.android.billingclient.api.r;
import com.android.billingclient.api.t0;
import com.android.billingclient.api.y;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import eg.c0;
import g6.v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import k2.w;
import s7.a0;
import s7.b3;
import s7.e2;
import s7.f1;
import s7.k1;
import s7.n0;
import s7.p1;
import s7.q3;
import s7.r0;
import s7.r1;
import s7.r3;
import s7.s3;
import s7.v0;
import s7.v3;
import s7.y2;
import s7.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3052a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3053b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3054c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3055d;

    public /* synthetic */ i() {
        this.f3052a = 7;
    }

    private final void a() {
        AtomicReference atomicReference;
        y2 y2Var;
        f1 f1Var;
        v0 v0Var;
        AtomicReference atomicReference2 = (AtomicReference) this.f3053b;
        synchronized (atomicReference2) {
            try {
                try {
                    y2Var = (y2) this.f3055d;
                    f1Var = (f1) y2Var.f3328a;
                    v0Var = f1Var.f22744e;
                    f1.k(v0Var);
                } catch (RemoteException e7) {
                    n0 n0Var = ((f1) ((y2) this.f3055d).f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.b(e7, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.f3053b;
                }
                if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
                    a0 a0Var = y2Var.f23257d;
                    if (a0Var != null) {
                        atomicReference2.set(a0Var.J((zzr) this.f3054c));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            e2 e2Var = ((f1) y2Var.f3328a).f22751m;
                            f1.l(e2Var);
                            e2Var.f22700g.set(str);
                            v0 v0Var2 = f1Var.f22744e;
                            f1.k(v0Var2);
                            v0Var2.f23128g.i(str);
                        }
                        y2Var.w();
                        atomicReference = (AtomicReference) this.f3053b;
                        atomicReference.notify();
                        return;
                    }
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.a("Failed to get app instance id");
                } else {
                    n0 n0Var3 = f1Var.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22907k.a("Analytics storage consent denied; will not get app instance id");
                    e2 e2Var2 = ((f1) y2Var.f3328a).f22751m;
                    f1.l(e2Var2);
                    e2Var2.f22700g.set(null);
                    v0 v0Var3 = f1Var.f22744e;
                    f1.k(v0Var3);
                    v0Var3.f23128g.i(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th2) {
                ((AtomicReference) this.f3053b).notify();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i5;
        w7.m i10;
        zzbe zzbeVar;
        int i11;
        long j;
        int i12;
        Cursor cursor;
        s3 s3Var;
        Cursor cursor2;
        v3 v3Var;
        f1 f1Var;
        v0 v0Var;
        n0 n0Var;
        switch (this.f3052a) {
            case 0:
                CloudMessage cloudMessage = (CloudMessage) this.f3054c;
                Intent intent = cloudMessage.f4437a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    i10 = d5.q(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = cloudMessage.f4437a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = cloudMessage.f4437a;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.f3053b;
                    bundle.putBoolean("supports_message_handled", true);
                    p h10 = p.h(context);
                    synchronized (h10) {
                        i5 = h10.f3078a;
                        h10.f3078a = i5 + 1;
                    }
                    i10 = h10.i(new n(i5, 2, bundle, 0));
                }
                i10.b(g.f3047b, new h((CountDownLatch) this.f3055d));
                return;
            case 1:
                com.android.billingclient.api.d dVar = (com.android.billingclient.api.d) this.f3053b;
                com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) this.f3054c;
                com.android.billingclient.api.a aVar = (com.android.billingclient.api.a) this.f3055d;
                dVar.getClass();
                com.android.billingclient.api.k kVar = t0.f4091m;
                dVar.I(24, 4, kVar);
                eVar.c(kVar, aVar.f3966b);
                return;
            case 2:
                ((o0) this.f3053b).P((y) this.f3054c, (r) this.f3055d);
                return;
            case 3:
                ((o0) this.f3053b).O((com.android.billingclient.api.a) this.f3054c, (com.android.billingclient.api.e) this.f3055d);
                return;
            case 4:
                ((o0) this.f3053b).Q((l1.a) this.f3054c, (com.android.billingclient.api.e) this.f3055d);
                return;
            case 5:
                ((o0) this.f3053b).N((com.android.billingclient.api.a) this.f3054c, (com.android.billingclient.api.e) this.f3055d);
                return;
            case 6:
                eg.l lVar = (eg.l) this.f3053b;
                try {
                    c0.w(lVar.f9194e.z(kotlin.coroutines.d.f19226f0), new u0((w) this.f3054c, lVar, (androidx.lifecycle.c) this.f3055d, null, 4));
                    return;
                } catch (Throwable th2) {
                    lVar.n(th2);
                    return;
                }
            case 7:
                try {
                    obj = ((m0.e) this.f3053b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f3055d).post(new g8.a(25, (m0.f) this.f3054c, obj));
                return;
            case 8:
                zzr zzrVar = (zzr) this.f3054c;
                r3 r3Var = ((k1) this.f3055d).f22848a;
                r3Var.B();
                zzah zzahVar = (zzah) this.f3053b;
                if (zzahVar.f5787c.c() == null) {
                    r3Var.a0(zzahVar, zzrVar);
                    return;
                } else {
                    r3Var.Z(zzahVar, zzrVar);
                    return;
                }
            case 9:
                zzbg zzbgVar = (zzbg) this.f3053b;
                zzr zzrVar2 = (zzr) this.f3054c;
                k1 k1Var = (k1) this.f3055d;
                k1Var.getClass();
                r3 r3Var2 = k1Var.f22848a;
                if ("_cmp".equals(zzbgVar.f5797a) && (zzbeVar = zzbgVar.f5798b) != null) {
                    Bundle bundle2 = zzbeVar.f5796a;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            r3Var2.a().f22908l.b(zzbgVar.toString(), "Event has been filtered ");
                            zzbgVar = new zzbg("_cmpx", zzbeVar, zzbgVar.f5799c, zzbgVar.f5800d);
                        }
                    }
                }
                String str = zzbgVar.f5797a;
                z0 z0Var = r3Var2.f22987a;
                r0 r0Var = r3Var2.f22993g;
                r3.U(z0Var);
                String str2 = zzrVar2.f5820a;
                e0 e0Var = TextUtils.isEmpty(str2) ? null : (e0) z0Var.j.c(str2);
                if (e0Var == null) {
                    r3Var2.a().f22910n.b(zzrVar2.f5820a, "EES not loaded for");
                    r3Var2.B();
                    r3Var2.j(zzbgVar, zzrVar2);
                    return;
                }
                try {
                    androidx.appcompat.app.v0 v0Var2 = e0Var.f5020c;
                    r3.U(r0Var);
                    HashMap Z = r0.Z(zzbgVar.f5798b.s0(), true);
                    String g10 = r1.g(str, r1.f22977c, r1.f22975a);
                    if (g10 == null) {
                        g10 = str;
                    }
                    if (e0Var.a(new com.google.android.gms.internal.measurement.b(g10, zzbgVar.f5800d, Z))) {
                        if (((com.google.android.gms.internal.measurement.b) v0Var2.f365c).equals((com.google.android.gms.internal.measurement.b) v0Var2.f364b)) {
                            r3Var2.B();
                            r3Var2.j(zzbgVar, zzrVar2);
                        } else {
                            r3Var2.a().f22910n.b(str, "EES edited event");
                            r3.U(r0Var);
                            zzbg n9 = r0.n((com.google.android.gms.internal.measurement.b) v0Var2.f365c);
                            r3Var2.B();
                            r3Var2.j(n9, zzrVar2);
                        }
                        if (((ArrayList) v0Var2.f366d).isEmpty()) {
                            return;
                        }
                        Iterator it = ((ArrayList) v0Var2.f366d).iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.internal.measurement.b bVar = (com.google.android.gms.internal.measurement.b) it.next();
                            r3Var2.a().f22910n.b(bVar.f4925a, "EES logging created event");
                            r3.U(r0Var);
                            zzbg n10 = r0.n(bVar);
                            r3Var2.B();
                            r3Var2.j(n10, zzrVar2);
                        }
                        return;
                    }
                } catch (com.google.android.gms.internal.measurement.r0 unused2) {
                    r3Var2.a().f22903f.c(zzrVar2.f5821b, str, "EES error. appId, eventName");
                }
                r3Var2.a().f22910n.b(str, "EES was not applied to event");
                r3Var2.B();
                r3Var2.j(zzbgVar, zzrVar2);
                return;
            case 10:
                k1 k1Var2 = (k1) this.f3055d;
                k1Var2.f22848a.B();
                k1Var2.f22848a.h((zzbg) this.f3053b, (String) this.f3054c);
                return;
            case 11:
                zzr zzrVar3 = (zzr) this.f3054c;
                r3 r3Var3 = ((k1) this.f3055d).f22848a;
                r3Var3.B();
                zzpl zzplVar = (zzpl) this.f3053b;
                if (zzplVar.c() == null) {
                    r3Var3.X(zzplVar.f5814b, zzrVar3);
                    return;
                } else {
                    r3Var3.W(zzplVar, zzrVar3);
                    return;
                }
            case 12:
                k1 k1Var3 = (k1) this.f3053b;
                zzr zzrVar4 = (zzr) this.f3054c;
                zzaf zzafVar = (zzaf) this.f3055d;
                r3 r3Var4 = k1Var3.f22848a;
                r3Var4.B();
                String str3 = zzrVar4.f5820a;
                v.h(str3);
                HashMap hashMap = r3Var4.E;
                r3Var4.b().j();
                r3Var4.l0();
                s7.j jVar = r3Var4.f22989c;
                r3.U(jVar);
                long j6 = zzafVar.f5782a;
                long j10 = zzafVar.f5784c;
                jVar.j();
                jVar.k();
                Cursor cursor3 = null;
                r21 = null;
                s3 s3Var2 = null;
                try {
                    cursor = jVar.Y().query("upload_queue", new String[]{"rowId", CommonUrlParts.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j6)}, null, null, null, "1");
                    try {
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        i11 = 4;
                        j = j10;
                        i12 = 1;
                        cursor2 = cursor;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    i11 = 4;
                    j = j10;
                    i12 = 1;
                    cursor = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (!cursor.moveToFirst()) {
                    i11 = 4;
                    j = j10;
                    i12 = 1;
                    if (cursor != null) {
                        cursor.close();
                    }
                    s3Var = s3Var2;
                    if (s3Var != null) {
                        r3Var4.a().f22906i.c(str3, Long.valueOf(j6), "[sgtm] Queued batch doesn't exist. appId, rowId");
                        return;
                    }
                    String str4 = s3Var.f23064c;
                    int i13 = zzafVar.f5783b;
                    if (i13 != i12) {
                        if (i13 == 3) {
                            q3 q3Var = (q3) hashMap.get(str4);
                            if (q3Var == null) {
                                q3Var = new q3(r3Var4);
                                hashMap.put(str4, q3Var);
                            } else {
                                q3Var.f22969b += i12;
                                q3Var.f22970c = q3Var.a();
                            }
                            r3Var4.f().getClass();
                            r3Var4.a().f22910n.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str3, str4, Long.valueOf((q3Var.f22970c - System.currentTimeMillis()) / 1000));
                        }
                        s7.j jVar2 = r3Var4.f22989c;
                        r3.U(jVar2);
                        Long valueOf2 = Long.valueOf(zzafVar.f5782a);
                        jVar2.v(valueOf2);
                        r3Var4.a().f22910n.c(str3, valueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                        return;
                    }
                    if (hashMap.containsKey(str4)) {
                        hashMap.remove(str4);
                    }
                    s7.j jVar3 = r3Var4.f22989c;
                    r3.U(jVar3);
                    Long valueOf3 = Long.valueOf(j6);
                    jVar3.q(valueOf3);
                    r3Var4.a().f22910n.c(str3, valueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                    if (j > 0) {
                        s7.j jVar4 = r3Var4.f22989c;
                        r3.U(jVar4);
                        f1 f1Var2 = (f1) jVar4.f3328a;
                        jVar4.j();
                        jVar4.k();
                        Long valueOf4 = Long.valueOf(j);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", Integer.valueOf(i12));
                        q6.a aVar2 = f1Var2.f22749k;
                        n0 n0Var2 = f1Var2.f22745f;
                        aVar2.getClass();
                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                        try {
                            if (jVar4.Y().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str3, String.valueOf(i11)}) != 1) {
                                f1.m(n0Var2);
                                n0Var2.f22906i.c(str3, valueOf4, "Google Signal pending batch not updated. appId, rowId");
                            }
                            r3Var4.a().f22910n.c(str3, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            r3Var4.t(str3);
                            return;
                        } catch (SQLiteException e10) {
                            f1.m(n0Var2);
                            n0Var2.f22903f.d("Failed to update google Signal pending batch. appid, rowId", str3, Long.valueOf(j), e10);
                            throw e10;
                        }
                    }
                    return;
                }
                String string2 = cursor.getString(1);
                v.h(string2);
                try {
                    try {
                        try {
                            i12 = 1;
                            cursor2 = cursor;
                            i11 = 4;
                            j = j10;
                        } catch (SQLiteException e11) {
                            e = e11;
                            cursor2 = cursor;
                            j = j10;
                            i12 = 1;
                            i11 = 4;
                            cursor = cursor2;
                            try {
                                n0 n0Var3 = ((f1) jVar.f3328a).f22745f;
                                f1.m(n0Var3);
                                n0Var3.f22903f.c(Long.valueOf(j6), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                if (cursor != null) {
                                }
                                s3Var = s3Var2;
                                if (s3Var != null) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                cursor3 = cursor;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        i12 = 1;
                        cursor2 = cursor;
                        j = j10;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    i11 = 4;
                    i12 = 1;
                    cursor2 = cursor;
                    j = j10;
                }
                try {
                    s3Var2 = jVar.K(string2, j6, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    cursor2.close();
                } catch (SQLiteException e14) {
                    e = e14;
                    cursor = cursor2;
                    n0 n0Var32 = ((f1) jVar.f3328a).f22745f;
                    f1.m(n0Var32);
                    n0Var32.f22903f.c(Long.valueOf(j6), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                    if (cursor != null) {
                    }
                    s3Var = s3Var2;
                    if (s3Var != null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
                s3Var = s3Var2;
                if (s3Var != null) {
                }
            case 13:
                a();
                return;
            case 14:
                com.google.android.gms.internal.measurement.n0 n0Var4 = (com.google.android.gms.internal.measurement.n0) this.f3054c;
                y2 y2Var = (y2) this.f3055d;
                String str5 = null;
                try {
                    try {
                        f1Var = (f1) y2Var.f3328a;
                        v0Var = f1Var.f22744e;
                        n0Var = f1Var.f22745f;
                        f1.k(v0Var);
                    } catch (RemoteException e15) {
                        n0 n0Var5 = ((f1) y2Var.f3328a).f22745f;
                        f1.m(n0Var5);
                        n0Var5.f22903f.b(e15, "Failed to get app instance id");
                    }
                    if (v0Var.q().i(p1.ANALYTICS_STORAGE)) {
                        a0 a0Var = y2Var.f23257d;
                        if (a0Var != null) {
                            str5 = a0Var.J((zzr) this.f3053b);
                            if (str5 != null) {
                                e2 e2Var = f1Var.f22751m;
                                f1.l(e2Var);
                                e2Var.f22700g.set(str5);
                                f1.k(v0Var);
                                v0Var.f23128g.i(str5);
                            }
                            y2Var.w();
                            v3Var = ((f1) y2Var.f3328a).f22748i;
                            f1.k(v3Var);
                            v3Var.T(str5, n0Var4);
                            return;
                        }
                        f1.m(n0Var);
                        n0Var.f22903f.a("Failed to get app instance id");
                    } else {
                        f1.m(n0Var);
                        n0Var.f22907k.a("Analytics storage consent denied; will not get app instance id");
                        e2 e2Var2 = f1Var.f22751m;
                        f1.l(e2Var2);
                        e2Var2.f22700g.set(null);
                        f1.k(v0Var);
                        v0Var.f23128g.i(null);
                    }
                    v3Var = f1Var.f22748i;
                    f1.k(v3Var);
                    v3Var.T(str5, n0Var4);
                    return;
                } catch (Throwable th7) {
                    v3 v3Var2 = ((f1) y2Var.f3328a).f22748i;
                    f1.k(v3Var2);
                    v3Var2.T(null, n0Var4);
                    throw th7;
                }
            case 15:
                y2 y2Var2 = (y2) this.f3053b;
                zzr zzrVar5 = (zzr) this.f3054c;
                zzaf zzafVar2 = (zzaf) this.f3055d;
                f1 f1Var3 = (f1) y2Var2.f3328a;
                a0 a0Var2 = y2Var2.f23257d;
                if (a0Var2 == null) {
                    n0 n0Var6 = f1Var3.f22745f;
                    f1.m(n0Var6);
                    n0Var6.f22903f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    a0Var2.u(zzrVar5, zzafVar2);
                    y2Var2.w();
                    return;
                } catch (RemoteException e16) {
                    n0 n0Var7 = f1Var3.f22745f;
                    f1.m(n0Var7);
                    n0Var7.f22903f.c(Long.valueOf(zzafVar2.f5782a), e16, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            default:
                r7.a aVar3 = (r7.a) this.f3053b;
                n0 n0Var8 = (n0) this.f3054c;
                JobParameters jobParameters = (JobParameters) this.f3055d;
                n0Var8.f22910n.a("AppMeasurementJobService processed last upload request.");
                ((b3) ((Service) aVar3.f22318b)).c(jobParameters);
                return;
        }
    }

    public /* synthetic */ i(Object obj, AbstractSafeParcelable abstractSafeParcelable, Object obj2, int i5) {
        this.f3052a = i5;
        this.f3053b = abstractSafeParcelable;
        this.f3054c = obj2;
        this.f3055d = obj;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i5) {
        this.f3052a = i5;
        this.f3053b = obj;
        this.f3054c = obj2;
        this.f3055d = obj3;
    }

    public i(y2 y2Var, AtomicReference atomicReference, zzr zzrVar) {
        this.f3052a = 13;
        this.f3053b = atomicReference;
        this.f3054c = zzrVar;
        Objects.requireNonNull(y2Var);
        this.f3055d = y2Var;
    }
}
