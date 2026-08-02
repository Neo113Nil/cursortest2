package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzxp;
import com.google.android.gms.internal.measurement.zzxs;
import com.google.android.gms.internal.measurement.zzzf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbc;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgh;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public n2(zzlj zzljVar, AtomicReference atomicReference, String str, String str2) {
        this.a = 11;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        Objects.requireNonNull(zzljVar);
        this.e = zzljVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:135|136|(5:138|(1:140)|142|143|144)|146|(2:149|147)|150|151|152|153|(2:156|154)|157|158|(1:160)|161|143|144) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0460, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r6 + r10)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0531, code lost:
    
        r5.b().j.b(r3, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzbho zzbhoVar;
        boolean z;
        long j;
        zzgb zzgbVar;
        zzgb zzgbVar2;
        zzgb zzgbVar3;
        long j2 = 0;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                ((kod) this.e).c((xei) this.b, (zx2) this.c, (qic) this.d);
                return;
            case 1:
                ql2 ql2Var = (ql2) ((de0) this.e).b;
                efc efcVar = (efc) this.c;
                pl2 pl2Var = (pl2) this.b;
                if (pl2Var != null) {
                    ql2Var.A = true;
                    pl2Var.b.c(false);
                    ql2Var.A = false;
                }
                if (efcVar.isEnabled() && efcVar.hasSubMenu()) {
                    ((vec) this.d).q(efcVar, null, 4);
                    return;
                }
                return;
            case 2:
                ((ay2) ((vv4) this.e).b).z((xei) this.b, (zx2) this.c, (qic) this.d);
                return;
            case 3:
                grb grbVar = (grb) this.e;
                grbVar.z = true;
                grbVar.u.z((xei) this.b, (zx2) this.c, (qic) this.d);
                return;
            case 4:
                synchronized (((neh) this.e)) {
                    try {
                        if (((leh) this.b).b == 0) {
                            try {
                                ((meh) this.c).f(this.d);
                                ((neh) this.e).a.remove((meh) this.c);
                                if (((neh) this.e).a.isEmpty()) {
                                    ((neh) this.e).b.shutdown();
                                    ((neh) this.e).b = null;
                                }
                            } catch (Throwable th) {
                                ((neh) this.e).a.remove((meh) this.c);
                                if (((neh) this.e).a.isEmpty()) {
                                    ((neh) this.e).b.shutdown();
                                    ((neh) this.e).b = null;
                                }
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 5:
                z8l.i((View) this.b, (d9l) this.c, (c0l) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 6:
                ((Activity) this.b).startActivityForResult(hda.V((String) this.c, (String) this.d, (Map) this.e), 0);
                return;
            case 7:
                zmn zmnVar = (zmn) this.e;
                zzbhq zzbhqVar = (zzbhq) this.c;
                cnn cnnVar = (cnn) this.b;
                try {
                    zzbht zzbhtVar = (zzbht) zzbhqVar.getService();
                    boolean t = zzbhqVar.t();
                    zzbhr zzbhrVar = (zzbhr) this.d;
                    if (t) {
                        Parcel J = zzbhtVar.J();
                        zzbew.c(J, zzbhrVar);
                        Parcel S1 = zzbhtVar.S1(J, 2);
                        zzbhoVar = (zzbho) zzbew.b(S1, zzbho.CREATOR);
                        S1.recycle();
                    } else {
                        Parcel J2 = zzbhtVar.J();
                        zzbew.c(J2, zzbhrVar);
                        Parcel S12 = zzbhtVar.S1(J2, 1);
                        zzbhoVar = (zzbho) zzbew.b(S12, zzbho.CREATOR);
                        S12.recycle();
                    }
                    if (!zzbhoVar.zza()) {
                        zmnVar.zzd(new RuntimeException("No entry contents."));
                        cnnVar.c.a();
                        return;
                    }
                    ann annVar = new ann(cnnVar, zzbhoVar.Y0());
                    int read = annVar.read();
                    if (read == -1) {
                        throw new IOException("Unable to read from cache.");
                    }
                    annVar.unread(read);
                    synchronized (zzbhoVar) {
                        z = zzbhoVar.b;
                    }
                    boolean Z0 = zzbhoVar.Z0();
                    synchronized (zzbhoVar) {
                        j = zzbhoVar.d;
                    }
                    zmnVar.zzc(new zzbid(annVar, z, Z0, j, zzbhoVar.zze()));
                    return;
                } catch (RemoteException e) {
                    e = e;
                    int i = zze.zza;
                    zzo.zzg("Unable to obtain a cache service instance.", e);
                    zmnVar.zzd(e);
                    cnnVar.c.a();
                    return;
                } catch (IOException e2) {
                    e = e2;
                    int i2 = zze.zza;
                    zzo.zzg("Unable to obtain a cache service instance.", e);
                    zmnVar.zzd(e);
                    cnnVar.c.a();
                    return;
                }
            case 8:
                zzjd zzjdVar = (zzjd) this.b;
                String str = (String) this.c;
                zzoo zzooVar = (zzoo) this.d;
                zzgh zzghVar = (zzgh) this.e;
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                zzpgVar.d().Q();
                zzpgVar.m0();
                hkn hknVar = zzpgVar.c;
                zzpg.U(hknVar);
                List<zzpj> V = hknVar.V(str, zzooVar, ((Integer) zzfy.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (zzpj zzpjVar : V) {
                    String str2 = zzpjVar.c;
                    long j3 = zzpjVar.h;
                    long j4 = zzpjVar.a;
                    if (zzpgVar.s(str, str2)) {
                        int i3 = zzpjVar.i;
                        if (i3 > 0) {
                            if (i3 <= ((Integer) zzfy.z.a(bArr)).intValue()) {
                                long min = Math.min(((Long) zzfy.x.a(bArr)).longValue() * (1 << (i3 - 1)), ((Long) zzfy.y.a(bArr)).longValue());
                                ((DefaultClock) zzpgVar.f()).getClass();
                                break;
                            }
                            zzpgVar.b().o.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j4), Long.valueOf(j3));
                            bArr = null;
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : zzpjVar.d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        zzom zzomVar = new zzom(zzpjVar.a, zzpjVar.b.h(), zzpjVar.c, bundle, zzpjVar.e.a, zzpjVar.g, "");
                        zzhz zzhzVar = (zzhz) zzpk.B0(zzib.F(), zzomVar.b);
                        for (int i4 = 0; i4 < ((zzib) zzhzVar.b).z(); i4++) {
                            zzic zzicVar = (zzic) ((zzib) zzhzVar.b).A(i4).q();
                            ((DefaultClock) zzpgVar.f()).getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            zzicVar.k();
                            ((zzid) zzicVar.b).p0(currentTimeMillis);
                            zzhzVar.k();
                            ((zzib) zzhzVar.b).H(i4, (zzid) zzicVar.m());
                        }
                        zzomVar.b = ((zzib) zzhzVar.m()).h();
                        if (Log.isLoggable(zzpgVar.b().W(), 2)) {
                            zzpk zzpkVar = zzpgVar.g;
                            zzpg.U(zzpkVar);
                            zzomVar.g = zzpkVar.r0((zzib) zzhzVar.m());
                        }
                        arrayList.add(zzomVar);
                        bArr = null;
                    } else {
                        zzpgVar.b().o.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j4), zzpjVar.c);
                    }
                }
                zzoq zzoqVar = new zzoq(arrayList);
                try {
                    zzghVar.P3(zzoqVar);
                    zzpgVar.b().o.c(str, Integer.valueOf(zzoqVar.a.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e3) {
                    zzpgVar.b().g.c(str, e3, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 9:
                zznl o = ((AppMeasurementDynamiteService) this.e).a.o();
                zzcs zzcsVar = (zzcs) this.b;
                zzbh zzbhVar = (zzbh) this.c;
                String str3 = (String) this.d;
                o.Q();
                o.R();
                com.google.android.gms.measurement.internal.zzic zzicVar2 = (com.google.android.gms.measurement.internal.zzic) o.b;
                zzpp zzppVar = zzicVar2.i;
                com.google.android.gms.measurement.internal.zzic.k(zzppVar);
                if (GoogleApiAvailabilityLight.b.b(((com.google.android.gms.measurement.internal.zzic) zzppVar.b).a, 12451000) == 0) {
                    o.e0(new n2(o, zzbhVar, str3, zzcsVar, 15));
                    return;
                }
                zzgu zzguVar = zzicVar2.f;
                com.google.android.gms.measurement.internal.zzic.m(zzguVar);
                zzguVar.j.a("Not bundling data. Service unavailable or out of date");
                zzpp zzppVar2 = zzicVar2.i;
                com.google.android.gms.measurement.internal.zzic.k(zzppVar2);
                zzppVar2.G0(zzcsVar, new byte[0]);
                return;
            case 10:
                zzjd zzjdVar2 = (zzjd) this.b;
                Bundle bundle2 = (Bundle) this.c;
                String str4 = (String) this.d;
                zzr zzrVar = (zzr) this.e;
                boolean isEmpty = bundle2.isEmpty();
                zzpg zzpgVar2 = zzjdVar2.a;
                if (isEmpty) {
                    hkn hknVar2 = zzpgVar2.c;
                    zzpg.U(hknVar2);
                    hknVar2.Q();
                    hknVar2.R();
                    try {
                        hknVar2.H0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e4) {
                        zzgu zzguVar2 = ((com.google.android.gms.measurement.internal.zzic) hknVar2.b).f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar2);
                        zzguVar2.g.b(e4, "Error clearing default event params");
                        return;
                    }
                }
                hkn hknVar3 = zzpgVar2.c;
                zzpg.U(hknVar3);
                com.google.android.gms.measurement.internal.zzic zzicVar3 = (com.google.android.gms.measurement.internal.zzic) hknVar3.b;
                hknVar3.Q();
                hknVar3.R();
                zzbc zzbcVar = new zzbc((com.google.android.gms.measurement.internal.zzic) hknVar3.b, "", str4, "dep", 0L, 0L, 0L, bundle2);
                zzpk zzpkVar2 = hknVar3.c.g;
                zzpg.U(zzpkVar2);
                byte[] h = zzpkVar2.q0(zzbcVar).h();
                zzgu zzguVar3 = zzicVar3.f;
                com.google.android.gms.measurement.internal.zzic.m(zzguVar3);
                zzguVar3.o.c(str4, Integer.valueOf(h.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put(MBridgeConstans.APP_ID, str4);
                contentValues.put("parameters", h);
                try {
                    if (hknVar3.H0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar3);
                        zzguVar3.g.b(zzgu.U(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e5) {
                    com.google.android.gms.measurement.internal.zzic.m(zzguVar3);
                    zzguVar3.g.c(zzgu.U(str4), e5, "Error storing default event parameters. appId");
                }
                hkn hknVar4 = zzpgVar2.c;
                zzpg.U(hknVar4);
                long j5 = zzrVar.D;
                try {
                    if (hknVar4.n0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
                        return;
                    }
                    if (hknVar4.n0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
                        hkn hknVar5 = zzpgVar2.c;
                        zzpg.U(hknVar5);
                        hknVar5.j0(str4, Long.valueOf(j5), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e6) {
                    zzgu zzguVar4 = ((com.google.android.gms.measurement.internal.zzic) hknVar4.b).f;
                    com.google.android.gms.measurement.internal.zzic.m(zzguVar4);
                    zzguVar4.g.b(e6, "Error checking backfill conditions");
                    return;
                }
            case 11:
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                zznl o2 = ((com.google.android.gms.measurement.internal.zzic) ((zzlj) this.e).b).o();
                AtomicReference atomicReference = (AtomicReference) this.b;
                o2.Q();
                o2.R();
                o2.e0(new g3g(o2, atomicReference, str5, str6, o2.g0(false), 8));
                return;
            case 12:
                z9h z9hVar = (z9h) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                Context context = (Context) this.d;
                wuo wuoVar = (wuo) this.e;
                if ((z9hVar.a instanceof u3) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(wuoVar);
                        return;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                return;
            case 13:
                zzxs zzxsVar = uwo.a;
                Level level = (Level) this.b;
                zzzf zzzfVar = zzxsVar.a;
                boolean b = zzzfVar.b(level);
                s4n.a.c().a(zzzfVar.a(), level, b);
                ((zzxp) ((zzxp) (!b ? zzxs.b : new kcp(zzxsVar, level)).a((Throwable) this.c)).zzn()).b((String) this.d, (Object[]) this.e);
                return;
            case 14:
                zznl o3 = ((AppMeasurementDynamiteService) this.e).a.o();
                zzcs zzcsVar2 = (zzcs) this.b;
                String str7 = (String) this.c;
                String str8 = (String) this.d;
                o3.Q();
                o3.R();
                o3.e0(new g3g(o3, str7, str8, o3.g0(false), zzcsVar2, 9));
                return;
            case 15:
                zzcs zzcsVar3 = (zzcs) this.d;
                zznl zznlVar = (zznl) this.e;
                com.google.android.gms.measurement.internal.zzic zzicVar4 = (com.google.android.gms.measurement.internal.zzic) zznlVar.b;
                try {
                    try {
                        zzgbVar = zznlVar.e;
                    } catch (RemoteException e7) {
                        zzgu zzguVar5 = zzicVar4.f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar5);
                        zzguVar5.g.b(e7, "Failed to send event to the service to bundle");
                    }
                    if (zzgbVar != null) {
                        bArr = zzgbVar.H0((zzbh) this.b, (String) this.c);
                        zznlVar.d0();
                        return;
                    } else {
                        zzgu zzguVar6 = zzicVar4.f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar6);
                        zzguVar6.g.a("Discarding data. Failed to send event to service to bundle");
                        return;
                    }
                } finally {
                    zzpp zzppVar3 = zzicVar4.i;
                    com.google.android.gms.measurement.internal.zzic.k(zzppVar3);
                    zzppVar3.G0(zzcsVar3, null);
                }
            case 16:
                zznl zznlVar2 = (zznl) this.b;
                AtomicReference atomicReference2 = (AtomicReference) this.c;
                zzr zzrVar2 = (zzr) this.d;
                Bundle bundle3 = (Bundle) this.e;
                synchronized (atomicReference2) {
                    try {
                        zzgbVar2 = zznlVar2.e;
                    } catch (RemoteException e8) {
                        zzgu zzguVar7 = ((com.google.android.gms.measurement.internal.zzic) zznlVar2.b).f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar7);
                        zzguVar7.g.b(e8, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                    if (zzgbVar2 != null) {
                        zzgbVar2.c3(zzrVar2, bundle3, new fxo(zznlVar2, atomicReference2));
                        zznlVar2.d0();
                        return;
                    } else {
                        zzgu zzguVar8 = ((com.google.android.gms.measurement.internal.zzic) zznlVar2.b).f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar8);
                        zzguVar8.g.a("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                }
            case 17:
                zznl zznlVar3 = (zznl) this.b;
                AtomicReference atomicReference3 = (AtomicReference) this.c;
                zzr zzrVar3 = (zzr) this.d;
                zzoo zzooVar2 = (zzoo) this.e;
                synchronized (atomicReference3) {
                    try {
                        zzgbVar3 = zznlVar3.e;
                    } catch (RemoteException e9) {
                        zzgu zzguVar9 = ((com.google.android.gms.measurement.internal.zzic) zznlVar3.b).f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar9);
                        zzguVar9.g.b(e9, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                    if (zzgbVar3 != null) {
                        zzgbVar3.L(zzrVar3, zzooVar2, new hxo(zznlVar3, atomicReference3));
                        zznlVar3.d0();
                        return;
                    } else {
                        zzgu zzguVar10 = ((com.google.android.gms.measurement.internal.zzic) zznlVar3.b).f;
                        com.google.android.gms.measurement.internal.zzic.m(zzguVar10);
                        zzguVar10.g.a("[sgtm] Failed to get upload batches; not connected to service");
                        return;
                    }
                }
            case 18:
                zzpg zzpgVar3 = (zzpg) ((muo) this.e).b;
                zzpp l0 = zzpgVar3.l0();
                ((DefaultClock) zzpgVar3.f()).getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (zzpgVar3.f0().b0(null, zzfy.e1)) {
                    ((DefaultClock) zzpgVar3.f()).getClass();
                    j2 = SystemClock.elapsedRealtime();
                }
                Bundle bundle4 = (Bundle) this.d;
                String str9 = (String) this.c;
                String str10 = (String) this.b;
                zzbh x0 = l0.x0(str9, bundle4, "auto", currentTimeMillis2, j2, false);
                Preconditions.i(x0);
                zzpgVar3.h(x0, str10);
                return;
            default:
                rfn rfnVar = (rfn) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.d;
                Bundle bundle5 = (Bundle) this.e;
                try {
                    ako akoVar = (ako) ((IInterface) rfnVar.b.k);
                    if (akoVar == null) {
                        return;
                    }
                    ((a7o) akoVar).Z1(rfnVar.a.getPackageName(), str11, str12, bundle5, rfnVar.d);
                    return;
                } catch (DeadObjectException | RemoteException unused2) {
                    return;
                }
        }
    }

    public /* synthetic */ n2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ n2(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
