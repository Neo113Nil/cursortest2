package defpackage;

import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgst;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zzqf;
import com.google.android.gms.internal.ads.zzqj;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zztd;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.play.core.hsdp.protocol.PrewarmRequest;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jgo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public jgo(zznl zznlVar, AtomicReference atomicReference, zzr zzrVar) {
        this.a = 9;
        this.b = atomicReference;
        this.d = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.c = zznlVar;
    }

    private final void a() {
        zzpp zzppVar;
        lmo lmoVar;
        zzgu zzguVar;
        zzcs zzcsVar = (zzcs) this.d;
        zznl zznlVar = (zznl) this.c;
        zzic zzicVar = (zzic) zznlVar.b;
        String str = null;
        try {
            try {
                lmoVar = zzicVar.e;
                zzguVar = zzicVar.f;
                zzic.k(lmoVar);
            } catch (RemoteException e) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.b(e, "Failed to get app instance id");
            }
            if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                zzgb zzgbVar = zznlVar.e;
                if (zzgbVar != null) {
                    str = zzgbVar.O1((zzr) this.b);
                    if (str != null) {
                        zzlj zzljVar = zzicVar.m;
                        zzic.l(zzljVar);
                        zzljVar.h.set(str);
                        zzic.k(lmoVar);
                        lmoVar.h.b(str);
                    }
                    zznlVar.d0();
                    zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    zzppVar.D0(str, zzcsVar);
                }
                zzic.m(zzguVar);
                zzguVar.g.a("Failed to get app instance id");
            } else {
                zzic.m(zzguVar);
                zzguVar.l.a("Analytics storage consent denied; will not get app instance id");
                zzlj zzljVar2 = zzicVar.m;
                zzic.l(zzljVar2);
                zzljVar2.h.set(null);
                zzic.k(lmoVar);
                lmoVar.h.b(null);
            }
            zzppVar = zzicVar.i;
            zzic.k(zzppVar);
            zzppVar.D0(str, zzcsVar);
        } catch (Throwable th) {
            zzpp zzppVar2 = zzicVar.i;
            zzic.k(zzppVar2);
            zzppVar2.D0(null, zzcsVar);
            throw th;
        }
    }

    private final /* synthetic */ void b() {
        AudioTrack audioTrack = (AudioTrack) this.b;
        Handler handler = (Handler) this.d;
        final zzeg zzegVar = (zzeg) this.c;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                final int i = 0;
                handler.post(new Runnable() { // from class: r5p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        zzeg zzegVar2 = zzegVar;
                        switch (i2) {
                            case 0:
                                zzegVar2.getClass();
                                if (Thread.currentThread() == zzegVar2.a) {
                                    zzegVar2.c(-1, w9f.q);
                                    zzegVar2.d();
                                    break;
                                }
                                break;
                            default:
                                zzegVar2.getClass();
                                if (Thread.currentThread() == zzegVar2.a) {
                                    zzegVar2.c(-1, w9f.q);
                                    zzegVar2.d();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            synchronized (zztd.o) {
                try {
                    int i2 = zztd.q - 1;
                    zztd.q = i2;
                    if (i2 == 0) {
                        ScheduledExecutorService scheduledExecutorService = zztd.p;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zztd.p = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                final int i3 = 1;
                handler.post(new Runnable() { // from class: r5p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i22 = i3;
                        zzeg zzegVar2 = zzegVar;
                        switch (i22) {
                            case 0:
                                zzegVar2.getClass();
                                if (Thread.currentThread() == zzegVar2.a) {
                                    zzegVar2.c(-1, w9f.q);
                                    zzegVar2.d();
                                    break;
                                }
                                break;
                            default:
                                zzegVar2.getClass();
                                if (Thread.currentThread() == zzegVar2.a) {
                                    zzegVar2.c(-1, w9f.q);
                                    zzegVar2.d();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            synchronized (zztd.o) {
                try {
                    int i4 = zztd.q - 1;
                    zztd.q = i4;
                    if (i4 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zztd.p;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zztd.p = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0332  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzbf zzbfVar;
        Cursor cursor;
        zzpj zzpjVar;
        int i;
        long j;
        Cursor cursor2;
        zzpj zzpjVar2;
        AtomicReference atomicReference;
        zznl zznlVar;
        zzic zzicVar;
        lmo lmoVar;
        switch (this.a) {
            case 0:
                lgo lgoVar = (lgo) this.b;
                ago agoVar = (ago) this.d;
                zzgsw zzgswVar = (zzgsw) this.c;
                String str = lgoVar.b;
                try {
                    u53 u53Var = lgoVar.a;
                    if (u53Var == null) {
                        throw null;
                    }
                    zzgrm zzgrmVar = (zzgrm) u53Var.i;
                    if (zzgrmVar == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    String str2 = agoVar.a;
                    if (!lgo.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = agoVar.b;
                    if (!lgo.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    zzgrmVar.Q1(bundle, new kgo(lgoVar, zzgswVar));
                    return;
                } catch (RemoteException e) {
                    lgo.c.d(e, "dismiss overlay display from: %s", str);
                    return;
                }
            case 1:
                lgo lgoVar2 = (lgo) this.b;
                zzgst zzgstVar = (zzgst) this.d;
                zzgsw zzgswVar2 = (zzgsw) this.c;
                String str4 = lgoVar2.b;
                try {
                    u53 u53Var2 = lgoVar2.a;
                    if (u53Var2 == null) {
                        throw null;
                    }
                    zzgrm zzgrmVar2 = (zzgrm) u53Var2.i;
                    if (zzgrmVar2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str4);
                    bundle2.putBinder("windowToken", zzgstVar.a());
                    String f = zzgstVar.f();
                    if (!lgo.b(f)) {
                        f.getClass();
                        bundle2.putString("adFieldEnifd", f.trim());
                    }
                    bundle2.putInt("layoutGravity", zzgstVar.c());
                    bundle2.putFloat("layoutVerticalMargin", zzgstVar.d());
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("theme", 0);
                    bundle2.putInt("windowWidthPx", zzgstVar.e());
                    if (!lgo.b(null)) {
                        throw null;
                    }
                    if (!lgo.b(null)) {
                        throw null;
                    }
                    String b = zzgstVar.b();
                    if (!lgo.b(b)) {
                        b.getClass();
                        bundle2.putString("appId", b.trim());
                    }
                    if (!lgo.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    zzgrmVar2.g0(str4, bundle2, new kgo(lgoVar2, zzgswVar2));
                    return;
                } catch (RemoteException e2) {
                    lgo.c.d(e2, "show overlay display from: %s", str4);
                    return;
                }
            case 2:
                Bundle bundle3 = (Bundle) this.d;
                y0p y0pVar = (y0p) this.b;
                kto ktoVar = (kto) this.c;
                try {
                    i1k i1kVar = y0pVar.a;
                    if (i1kVar == null) {
                        throw null;
                    }
                    tqn tqnVar = (tqn) ((IInterface) i1kVar.k);
                    if (tqnVar == null) {
                        return;
                    }
                    x3n x3nVar = (x3n) tqnVar;
                    Parcel J = x3nVar.J();
                    int i2 = zzc.a;
                    J.writeInt(1);
                    bundle3.writeToParcel(J, 0);
                    J.writeStrongBinder(ktoVar);
                    x3nVar.S1(J, 1);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            case 3:
                zzpg zzpgVar = ((zzjd) this.c).a;
                zzpgVar.W();
                zzah zzahVar = (zzah) this.b;
                Object zza = zzahVar.c.zza();
                zzr zzrVar = (zzr) this.d;
                if (zza == null) {
                    zzpgVar.b0(zzahVar, zzrVar);
                    return;
                } else {
                    zzpgVar.a0(zzahVar, zzrVar);
                    return;
                }
            case 4:
                zzbh zzbhVar = (zzbh) this.b;
                zzr zzrVar2 = (zzr) this.d;
                zzpg zzpgVar2 = ((zzjd) this.c).a;
                if ("_cmp".equals(zzbhVar.a) && (zzbfVar = zzbhVar.b) != null) {
                    Bundle bundle4 = zzbfVar.a;
                    if (bundle4.size() != 0) {
                        String string = bundle4.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            zzpgVar2.b().m.b(zzbhVar.toString(), "Event has been filtered ");
                            zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.c, zzbhVar.d, zzbhVar.e);
                        }
                    }
                }
                String str5 = zzbhVar.a;
                zzht zzhtVar = zzpgVar2.a;
                zzpk zzpkVar = zzpgVar2.g;
                zzpg.U(zzhtVar);
                String str6 = zzrVar2.a;
                com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str6) ? null : (com.google.android.gms.internal.measurement.zzc) zzhtVar.l.c(str6);
                if (zzcVar == null) {
                    zzpgVar2.b().o.b(zzrVar2.a, "EES not loaded for");
                    zzpgVar2.W();
                    zzpgVar2.j(zzbhVar, zzrVar2);
                    return;
                }
                try {
                    zzab zzabVar = zzcVar.c;
                    zzpg.U(zzpkVar);
                    HashMap E0 = zzpk.E0(true, zzbhVar.b.b1());
                    String b2 = zzlt.b(str5, zzjm.f, zzjm.a);
                    if (b2 == null) {
                        b2 = str5;
                    }
                    if (zzcVar.a(new zzaa(b2, zzbhVar.d, E0))) {
                        if (zzabVar.b.equals(zzabVar.a)) {
                            zzpgVar2.W();
                            zzpgVar2.j(zzbhVar, zzrVar2);
                        } else {
                            zzpgVar2.b().o.b(str5, "EES edited event");
                            zzpg.U(zzpkVar);
                            zzbh U = zzpk.U(zzabVar.b);
                            zzpgVar2.W();
                            zzpgVar2.j(U, zzrVar2);
                        }
                        if (zzabVar.c.isEmpty()) {
                            return;
                        }
                        Iterator it = zzabVar.c.iterator();
                        while (it.hasNext()) {
                            zzaa zzaaVar = (zzaa) it.next();
                            zzpgVar2.b().o.b(zzaaVar.a, "EES logging created event");
                            zzpg.U(zzpkVar);
                            zzbh U2 = zzpk.U(zzaaVar);
                            zzpgVar2.W();
                            zzpgVar2.j(U2, zzrVar2);
                        }
                        return;
                    }
                } catch (zzd unused2) {
                    zzpgVar2.b().g.c(zzrVar2.b, str5, "EES error. appId, eventName");
                }
                zzpgVar2.b().o.b(str5, "EES was not applied to event");
                zzpgVar2.W();
                zzpgVar2.j(zzbhVar, zzrVar2);
                return;
            case 5:
                zzpg zzpgVar3 = ((zzjd) this.c).a;
                zzpgVar3.W();
                zzpgVar3.h((zzbh) this.b, (String) this.d);
                return;
            case 6:
                zzpg zzpgVar4 = ((zzjd) this.c).a;
                zzpgVar4.W();
                zzpl zzplVar = (zzpl) this.b;
                Object zza2 = zzplVar.zza();
                zzr zzrVar3 = (zzr) this.d;
                if (zza2 == null) {
                    zzpgVar4.Y(zzplVar.b, zzrVar3);
                    return;
                } else {
                    zzpgVar4.X(zzplVar, zzrVar3);
                    return;
                }
            case 7:
                zzjd zzjdVar = (zzjd) this.b;
                zzr zzrVar4 = (zzr) this.d;
                zzaf zzafVar = (zzaf) this.c;
                zzpg zzpgVar5 = zzjdVar.a;
                zzpgVar5.W();
                String str7 = zzrVar4.a;
                Preconditions.i(str7);
                HashMap hashMap = zzpgVar5.E;
                zzpgVar5.d().Q();
                zzpgVar5.m0();
                hkn hknVar = zzpgVar5.c;
                zzpg.U(hknVar);
                long j2 = zzafVar.a;
                long j3 = zzafVar.c;
                hknVar.Q();
                hknVar.R();
                try {
                    cursor2 = hknVar.H0().query("upload_queue", new String[]{"rowId", MBridgeConstans.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                        } catch (SQLiteException e3) {
                            e = e3;
                            zzpjVar = null;
                            i = 4;
                            j = j3;
                            cursor = cursor2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor2;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    zzpjVar = null;
                    i = 4;
                    j = j3;
                    cursor2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                if (!cursor2.moveToFirst()) {
                    zzpjVar = null;
                    i = 4;
                    j = j3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    zzpjVar2 = zzpjVar;
                    if (zzpjVar2 != null) {
                        zzpgVar5.b().j.c(str7, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                        return;
                    }
                    String str8 = zzpjVar2.c;
                    int i3 = zzafVar.b;
                    if (i3 != 1) {
                        if (i3 == 3) {
                            o1p o1pVar = (o1p) hashMap.get(str8);
                            if (o1pVar == null) {
                                o1pVar = new o1p(zzpgVar5);
                                hashMap.put(str8, o1pVar);
                            } else {
                                o1pVar.b++;
                                o1pVar.c = o1pVar.a();
                            }
                            ((DefaultClock) zzpgVar5.f()).getClass();
                            zzpgVar5.b().o.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str7, str8, Long.valueOf((o1pVar.c - System.currentTimeMillis()) / 1000));
                        }
                        hkn hknVar2 = zzpgVar5.c;
                        zzpg.U(hknVar2);
                        Long valueOf = Long.valueOf(zzafVar.a);
                        hknVar2.c0(valueOf);
                        zzpgVar5.b().o.c(str7, valueOf, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                        return;
                    }
                    if (hashMap.containsKey(str8)) {
                        hashMap.remove(str8);
                    }
                    hkn hknVar3 = zzpgVar5.c;
                    zzpg.U(hknVar3);
                    Long valueOf2 = Long.valueOf(j2);
                    hknVar3.X(valueOf2);
                    zzpgVar5.b().o.c(str7, valueOf2, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                    if (j > 0) {
                        hkn hknVar4 = zzpgVar5.c;
                        zzpg.U(hknVar4);
                        zzic zzicVar2 = (zzic) hknVar4.b;
                        hknVar4.Q();
                        hknVar4.R();
                        Long valueOf3 = Long.valueOf(j);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", (Integer) 1);
                        DefaultClock defaultClock = zzicVar2.k;
                        zzgu zzguVar = zzicVar2.f;
                        defaultClock.getClass();
                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                        try {
                            if (hknVar4.H0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str7, String.valueOf(i)}) != 1) {
                                zzic.m(zzguVar);
                                zzguVar.j.c(str7, valueOf3, "Google Signal pending batch not updated. appId, rowId");
                            }
                            zzpgVar5.b().o.c(str7, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            zzpgVar5.t(str7);
                            return;
                        } catch (SQLiteException e5) {
                            zzic.m(zzguVar);
                            zzguVar.g.d("Failed to update google Signal pending batch. appid, rowId", str7, Long.valueOf(j), e5);
                            throw e5;
                        }
                    }
                    return;
                }
                String string2 = cursor2.getString(1);
                Preconditions.i(string2);
                try {
                    zzpjVar = null;
                    try {
                        try {
                            cursor = cursor2;
                            j = j3;
                            i = 4;
                        } catch (SQLiteException e6) {
                            e = e6;
                            cursor = cursor2;
                            j = j3;
                            i = 4;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        i = 4;
                        cursor = cursor2;
                        j = j3;
                        cursor2 = cursor;
                        zzgu zzguVar2 = ((zzic) hknVar.b).f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                        if (cursor2 != null) {
                        }
                        zzpjVar2 = zzpjVar;
                        if (zzpjVar2 != null) {
                        }
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    zzpjVar = null;
                }
                try {
                    zzpj t0 = hknVar.t0(string2, j2, cursor2.getBlob(2), cursor2.getString(3), cursor2.getString(4), cursor2.getInt(5), cursor2.getInt(6), cursor2.getLong(7), cursor2.getLong(8), cursor2.getLong(9));
                    cursor.close();
                    zzpjVar2 = t0;
                } catch (SQLiteException e9) {
                    e = e9;
                    cursor2 = cursor;
                    zzgu zzguVar22 = ((zzic) hknVar.b).f;
                    zzic.m(zzguVar22);
                    zzguVar22.g.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                    if (cursor2 != null) {
                    }
                    zzpjVar2 = zzpjVar;
                    if (zzpjVar2 != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                if (zzpjVar2 != null) {
                }
            case 8:
                zzqf p = zzqf.p((Context) this.b);
                if (p == null) {
                    zzeh.c("MediaMetricsService unavailable.");
                    return;
                } else {
                    ((cwo) this.d).c(p);
                    ((zzqj) this.c).a(p.q());
                    return;
                }
            case 9:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zznlVar = (zznl) this.c;
                            zzicVar = (zzic) zznlVar.b;
                            lmoVar = zzicVar.e;
                            zzic.k(lmoVar);
                        } catch (RemoteException e10) {
                            zzgu zzguVar3 = ((zzic) ((zznl) this.c).b).f;
                            zzic.m(zzguVar3);
                            zzguVar3.g.b(e10, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.b;
                        }
                        if (lmoVar.X().i(zzjk.ANALYTICS_STORAGE)) {
                            zzgb zzgbVar = zznlVar.e;
                            if (zzgbVar != null) {
                                atomicReference2.set(zzgbVar.O1((zzr) this.d));
                                String str9 = (String) atomicReference2.get();
                                if (str9 != null) {
                                    zzlj zzljVar = ((zzic) zznlVar.b).m;
                                    zzic.l(zzljVar);
                                    zzljVar.h.set(str9);
                                    lmo lmoVar2 = zzicVar.e;
                                    zzic.k(lmoVar2);
                                    lmoVar2.h.b(str9);
                                }
                                zznlVar.d0();
                                atomicReference = (AtomicReference) this.b;
                                atomicReference.notify();
                                return;
                            }
                            zzgu zzguVar4 = zzicVar.f;
                            zzic.m(zzguVar4);
                            zzguVar4.g.a("Failed to get app instance id");
                        } else {
                            zzgu zzguVar5 = zzicVar.f;
                            zzic.m(zzguVar5);
                            zzguVar5.l.a("Analytics storage consent denied; will not get app instance id");
                            zzlj zzljVar2 = ((zzic) zznlVar.b).m;
                            zzic.l(zzljVar2);
                            zzljVar2.h.set(null);
                            lmo lmoVar3 = zzicVar.e;
                            zzic.k(lmoVar3);
                            lmoVar3.h.b(null);
                            atomicReference2.set(null);
                        }
                        atomicReference2.notify();
                        return;
                    } catch (Throwable th4) {
                        ((AtomicReference) this.b).notify();
                        throw th4;
                    }
                }
            case 10:
                ((zznq) ((d7c) this.b).j).f(((zzgxj) this.d).f(), (zzxo) this.c);
                return;
            case 11:
                a();
                return;
            case 12:
                Pair pair = (Pair) this.d;
                ((zznq) ((wxo) this.b).b.k).b(((Integer) pair.first).intValue(), (zzxo) pair.second, (zzxk) this.c);
                return;
            case 13:
                zznl zznlVar2 = (zznl) this.b;
                zzr zzrVar5 = (zzr) this.d;
                zzaf zzafVar2 = (zzaf) this.c;
                zzic zzicVar3 = (zzic) zznlVar2.b;
                zzgb zzgbVar2 = zznlVar2.e;
                if (zzgbVar2 == null) {
                    zzgu zzguVar6 = zzicVar3.f;
                    zzic.m(zzguVar6);
                    zzguVar6.g.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    zzgbVar2.k3(zzrVar5, zzafVar2);
                    zznlVar2.d0();
                    return;
                } catch (RemoteException e11) {
                    zzgu zzguVar7 = zzicVar3.f;
                    zzic.m(zzguVar7);
                    zzguVar7.g.c(Long.valueOf(zzafVar2.a), e11, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 14:
                zznt zzntVar = (zznt) this.b;
                zzgu zzguVar8 = (zzgu) this.d;
                JobParameters jobParameters = (JobParameters) this.c;
                zzguVar8.o.a("AppMeasurementJobService processed last upload request.");
                ((zznp) zzntVar.a).c(jobParameters);
                return;
            case 15:
                zzry zzryVar = (zzry) this.b;
                zzv zzvVar = (zzv) this.d;
                zzjf zzjfVar = (zzjf) this.c;
                String str10 = zzfm.a;
                zzpv zzpvVar = zzryVar.b.a.q;
                zznr r = zzpvVar.r();
                zzpvVar.n(r, 1009, new xto(r, zzvVar, zzjfVar));
                return;
            case 16:
                b();
                return;
            default:
                rfn rfnVar = (rfn) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                fg9 fg9Var = (fg9) this.c;
                try {
                    ako akoVar = (ako) ((IInterface) rfnVar.b.k);
                    if (akoVar == null) {
                        return;
                    }
                    String packageName = rfnVar.a.getPackageName();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        vxn vxnVar = (vxn) it2.next();
                        String str11 = vxnVar.a;
                        arrayList2.add(new PrewarmRequest(str11, hda.Z(str11, vxnVar.b, vxnVar.c).toString(), vxnVar.d));
                    }
                    o4n o4nVar = new o4n(rfnVar, fg9Var);
                    a7o a7oVar = (a7o) akoVar;
                    Parcel J2 = a7oVar.J();
                    J2.writeString(packageName);
                    J2.writeTypedList(arrayList2);
                    int i4 = zzc.a;
                    J2.writeStrongBinder(o4nVar);
                    a7oVar.S1(J2, 1);
                    return;
                } catch (DeadObjectException | RemoteException unused3) {
                    return;
                }
        }
    }

    public /* synthetic */ jgo(Object obj, AbstractSafeParcelable abstractSafeParcelable, Object obj2, int i) {
        this.a = i;
        this.b = abstractSafeParcelable;
        this.d = obj2;
        this.c = obj;
    }

    public /* synthetic */ jgo(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
