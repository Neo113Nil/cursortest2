package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.internal.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzpv;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import com.google.android.gms.internal.appset.zzl;
import com.google.android.gms.internal.cast.zzn;
import com.google.android.gms.internal.cast.zzo;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzpw;
import com.google.android.gms.internal.cast.zzqb;
import com.google.android.gms.internal.cast.zzqc;
import com.google.android.gms.internal.cast.zzqq;
import com.google.android.gms.internal.cast.zzqr;
import com.google.android.gms.internal.cast.zzr;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhk;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznn;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzok;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzph;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzw;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dno implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public dno(zzpg zzpgVar, zzph zzphVar) {
        this.a = 13;
        this.b = zzpgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03c1, code lost:
    
        if (r14.B0() >= 242600) goto L126;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        smo f;
        Object obj;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ino inoVar = (ino) this.b;
                if (inoVar.b != null) {
                    return;
                }
                synchronized (ino.c) {
                    if (inoVar.b != null) {
                        return;
                    }
                    try {
                        z = ((Boolean) exo.i.J()).booleanValue();
                    } catch (IllegalStateException unused) {
                        z = false;
                    }
                    if (z) {
                        try {
                            ino.d = u0p.a(((ino) this.b).a.a, "ADSHIELD");
                        } catch (Throwable unused2) {
                        }
                    }
                    z2 = z;
                    ((ino) this.b).b = Boolean.valueOf(z2);
                    ino.c.open();
                    return;
                }
            case 1:
                uno unoVar = (uno) this.b;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    lto ltoVar = unoVar.e;
                    String t = ltoVar.t();
                    Context context = unoVar.b;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    boolean u = ltoVar.u();
                    boolean z3 = unoVar.f;
                    synchronized (smo.class) {
                        f = smo.f(t, context, Executors.newCachedThreadPool(), u, z3);
                    }
                    f.h();
                    return;
                } catch (NullPointerException e) {
                    unoVar.c.z(2027, System.currentTimeMillis() - currentTimeMillis, e);
                    return;
                }
            case 2:
                Context context2 = ((zzl) this.b).a;
                long j = zzl.a(context2).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (j2 != -1) {
                    DefaultClock.a.getClass();
                    if (System.currentTimeMillis() > j2) {
                        if (!zzl.a(context2).edit().remove("app_set_id").commit()) {
                            String valueOf = String.valueOf(context2.getPackageName());
                            if (valueOf.length() != 0) {
                                "Failed to clear app set ID generated for App ".concat(valueOf);
                            }
                        }
                        if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                            return;
                        }
                        String valueOf2 = String.valueOf(context2.getPackageName());
                        if (valueOf2.length() != 0) {
                            "Failed to clear app set ID last used time for App ".concat(valueOf2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((kso) this.b).c();
                return;
            case 4:
                zzn zznVar = (zzn) this.b;
                zzo zzoVar = zznVar.g;
                if (zzoVar != null) {
                    zznVar.a.a((zzqr) zznVar.c.b(zzoVar).c(), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
                zznVar.c();
                return;
            case 5:
                nuo nuoVar = (nuo) this.b;
                try {
                    zro zroVar = nuoVar.a;
                    DexClassLoader dexClassLoader = zroVar.c;
                    byte[] bArr = zroVar.e;
                    String str = nuoVar.b;
                    zroVar.d.getClass();
                    Class<?> loadClass = dexClassLoader.loadClass(new String(tnf.t(str, bArr), C.UTF8_NAME));
                    if (loadClass != null) {
                        byte[] bArr2 = zroVar.e;
                        String str2 = nuoVar.c;
                        nuoVar.a.d.getClass();
                        nuoVar.d = loadClass.getMethod(new String(tnf.t(str2, bArr2), C.UTF8_NAME), nuoVar.e);
                    }
                } catch (UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException | upo unused3) {
                } catch (Throwable th) {
                    nuoVar.f.countDown();
                    throw th;
                }
                nuoVar.f.countDown();
                return;
            case 6:
                cwo cwoVar = (cwo) this.b;
                String str3 = zzfm.a;
                int generateAudioSessionId = zzcj.a(cwoVar.e).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                zzdn zzdnVar = cwoVar.z;
                zzea zzeaVar = zzdnVar.b;
                Looper myLooper = Looper.myLooper();
                if (myLooper == zzeaVar.zza()) {
                    obj = zzdnVar.d;
                } else {
                    zzguk.f(myLooper == zzdnVar.a.zza());
                    obj = zzdnVar.e;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf3 = Integer.valueOf(generateAudioSessionId);
                    zzdnVar.e = valueOf3;
                    wjn wjnVar = new wjn(10, zzdnVar, valueOf3);
                    zzea zzeaVar2 = zzdnVar.b;
                    if (zzeaVar2.zza().getThread().isAlive()) {
                        zzeaVar2.f(wjnVar);
                    }
                    cwoVar.p(1, 10, valueOf3);
                    cwoVar.p(2, 10, valueOf3);
                    return;
                }
                return;
            case 7:
                ((xwo) this.b).t.d();
                return;
            case 8:
                zzna zznaVar = (zzna) this.b;
                try {
                    synchronized (zznaVar) {
                    }
                    try {
                        zznaVar.a.f(zznaVar.c, zznaVar.d);
                        zznaVar.a(true);
                        return;
                    } catch (Throwable th2) {
                        zznaVar.a(true);
                        throw th2;
                    }
                } catch (zzjn e2) {
                    zzeh.f("Unexpected error delivering message on external thread.", e2);
                    is8.h(e2);
                    return;
                }
            case 9:
                zznl zznlVar = ((zznf) this.b).c;
                zznlVar.b0(new ComponentName(((zzic) zznlVar.b).a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 10:
                zznl zznlVar2 = ((zznf) ((jyo) this.b).c).c;
                zzhz zzhzVar = ((zzic) zznlVar2.b).g;
                zzic.m(zzhzVar);
                zzhzVar.Z(new uyo(zznlVar2, z2 ? 1 : 0));
                return;
            case 11:
                zzpv zzpvVar = (zzpv) this.b;
                zzpvVar.n(zzpvVar.o(), IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new omf(26));
                zzpvVar.f.e();
                return;
            case 12:
                mzo mzoVar = (mzo) this.b;
                zzoc zzocVar = (zzoc) mzoVar.c.c;
                zzocVar.Q();
                zzic zzicVar = (zzic) zzocVar.b;
                zzgu zzguVar = zzicVar.f;
                Context context3 = zzicVar.a;
                zzic.m(zzguVar);
                zzguVar.n.a("Application going to the background");
                lmo lmoVar = zzicVar.e;
                zzic.k(lmoVar);
                lmoVar.t.b(true);
                zzocVar.Q();
                zzocVar.e = true;
                zzal zzalVar = zzicVar.d;
                if (!zzalVar.f0()) {
                    long j3 = mzoVar.b;
                    c78 c78Var = zzocVar.g;
                    c78Var.q(j3, false, false);
                    ((ozo) c78Var.d).c();
                }
                long j4 = mzoVar.a;
                zzic.m(zzguVar);
                zzguVar.m.b(Long.valueOf(j4), "Application backgrounded at: timestamp_millis");
                zzlj zzljVar = zzicVar.m;
                zzic.l(zzljVar);
                zzljVar.Q();
                zzic zzicVar2 = (zzic) zzljVar.b;
                zzljVar.R();
                zznl o = zzicVar2.o();
                o.Q();
                o.R();
                if (o.X()) {
                    zzpp zzppVar = ((zzic) o.b).i;
                    zzic.k(zzppVar);
                    break;
                }
                zznl o2 = zzicVar2.o();
                o2.Q();
                o2.R();
                o2.e0(new qxo(o2, o2.g0(true), 0));
                if (zzalVar.b0(null, zzfy.N0)) {
                    zzpp zzppVar2 = zzicVar.i;
                    zzic.k(zzppVar2);
                    long Y = zzppVar2.v0(context3.getPackageName(), zzalVar.d) ? 1000L : zzalVar.Y(context3.getPackageName(), zzfy.E);
                    zzic.m(zzguVar);
                    zzguVar.o.b(Long.valueOf(Y), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    zzic.j(zzicVar.u);
                    zzicVar.u.U(Y);
                    return;
                }
                return;
            case 13:
                zzpg zzpgVar = (zzpg) this.b;
                zzpgVar.d().Q();
                zzpgVar.k = new zzhk(zzpgVar);
                hkn hknVar = new hkn(zzpgVar);
                hknVar.S();
                zzpgVar.c = hknVar;
                zzht zzhtVar = zzpgVar.a;
                zzal f0 = zzpgVar.f0();
                Preconditions.i(zzhtVar);
                f0.e = zzhtVar;
                zznn zznnVar = new zznn(zzpgVar);
                zznnVar.S();
                zzpgVar.i = zznnVar;
                t9n t9nVar = new t9n(zzpgVar);
                t9nVar.S();
                zzpgVar.f = t9nVar;
                nwo nwoVar = new nwo(zzpgVar);
                nwoVar.S();
                zzpgVar.h = nwoVar;
                zzok zzokVar = new zzok(zzpgVar);
                zzokVar.S();
                zzpgVar.e = zzokVar;
                zzpgVar.d = new pko(zzpgVar);
                if (zzpgVar.r != zzpgVar.s) {
                    zzpgVar.b().g.c(Integer.valueOf(zzpgVar.r), Integer.valueOf(zzpgVar.s), "Not all upload components initialized");
                }
                zzpgVar.m.set(true);
                zzpgVar.b().o.a("UploadController is now fully initialized");
                zzpgVar.d().Q();
                hkn hknVar2 = zzpgVar.c;
                zzpg.U(hknVar2);
                hknVar2.a0();
                hkn hknVar3 = zzpgVar.c;
                zzpg.U(hknVar3);
                hknVar3.Q();
                hknVar3.R();
                if (hknVar3.B0()) {
                    zzfx zzfxVar = zzfy.u0;
                    if (((Long) zzfxVar.a(null)).longValue() != 0) {
                        SQLiteDatabase H0 = hknVar3.H0();
                        zzic zzicVar3 = (zzic) hknVar3.b;
                        zzicVar3.k.getClass();
                        int delete = H0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzfxVar.a(null))});
                        if (delete > 0) {
                            zzgu zzguVar2 = zzicVar3.f;
                            zzic.m(zzguVar2);
                            zzguVar2.o.b(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (zzpgVar.i.i.a() == 0) {
                    zzhe zzheVar = zzpgVar.i.i;
                    ((DefaultClock) zzpgVar.f()).getClass();
                    zzheVar.b(System.currentTimeMillis());
                }
                zzpgVar.N();
                return;
            case 14:
                throw new RuntimeException(((ExecutionException) this.b).getCause());
            case 15:
                ((zzs) this.b).i(false);
                return;
            case 16:
                zzr zzrVar = (zzr) this.b;
                SharedPreferences sharedPreferences = zzrVar.b;
                HashSet hashSet = zzrVar.f;
                if (hashSet.isEmpty()) {
                    return;
                }
                HashSet hashSet2 = zzrVar.g;
                long j5 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                DefaultClock defaultClock = zzrVar.h;
                Preconditions.i(defaultClock);
                long a = defaultClock.a();
                long j6 = zzrVar.i;
                if (j6 == 0 || a - j6 >= j5) {
                    zzr.j.a("Upload the feature usage report.", new Object[0]);
                    zzqb n = zzqc.n();
                    String str4 = zzr.k;
                    n.b();
                    ((zzqc) n.b).p(str4);
                    String str5 = zzrVar.c;
                    n.b();
                    ((zzqc) n.b).o(str5);
                    zzqc zzqcVar = (zzqc) n.c();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    com.google.android.gms.internal.cast.zzpv n2 = zzpw.n();
                    n2.b();
                    ((zzpw) n2.b).p(arrayList);
                    n2.b();
                    ((zzpw) n2.b).o(zzqcVar);
                    zzpw zzpwVar = (zzpw) n2.c();
                    zzqq o3 = zzqr.o();
                    o3.b();
                    ((zzqr) o3.b).C(zzpwVar);
                    zzrVar.a.a((zzqr) o3.c(), 243);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((zzpm) it.next()).a);
                            String q = dmi.q("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(q)) {
                                q = dmi.q("feature_usage_timestamp_detected_feature_", num);
                            }
                            String q2 = dmi.q("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(q, q2)) {
                                long j7 = sharedPreferences.getLong(q, 0L);
                                edit.remove(q);
                                if (j7 != 0) {
                                    edit.putLong(q2, j7);
                                }
                            }
                        }
                    }
                    zzrVar.i = a;
                    edit.putLong("feature_usage_last_report_time", a).apply();
                    return;
                }
                return;
            case 17:
                ((com.google.android.gms.internal.ads.zzqr) this.b).c();
                return;
            case 18:
                try {
                    hkg.P((hd8) this.b);
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 19:
                zzic zzicVar4 = ((zzw) this.b).a;
                zzic.j(zzicVar4.u);
                zzicVar4.u.U(((Long) zzfy.D.a(null)).longValue());
                return;
            case 20:
                o7p o7pVar = (o7p) this.b;
                int V = l7p.j.V(o7pVar);
                if (!(V >= 0)) {
                    a70.r("Less than 0 remaining futures");
                    return;
                }
                if (V == 0) {
                    o7pVar.h = null;
                    m7p m7pVar = o7pVar.m;
                    if (m7pVar != null) {
                        try {
                            m7pVar.c.execute(m7pVar);
                        } catch (RejectedExecutionException e3) {
                            m7pVar.d.e(e3);
                        }
                    }
                    o7pVar.l = null;
                    return;
                }
                return;
            case 21:
                zztw zztwVar = (zztw) this.b;
                if (zztwVar.V >= 300000) {
                    ((zzuc) zztwVar.l.b).J0 = true;
                    zztwVar.V = 0L;
                    return;
                }
                return;
            case 22:
                zzic zzicVar5 = (zzic) this.b;
                zzpp zzppVar3 = zzicVar5.i;
                zzlj zzljVar2 = zzicVar5.m;
                zzic.k(zzppVar3);
                zzppVar3.Q();
                if (zzppVar3.n0() != 1) {
                    zzgu zzguVar3 = zzicVar5.f;
                    zzic.m(zzguVar3);
                    zzguVar3.j.a("registerTrigger called but app not eligible");
                    return;
                }
                zzic.l(zzljVar2);
                zzljVar2.Q();
                dto dtoVar = zzljVar2.m;
                if (dtoVar != null) {
                    dtoVar.c();
                }
                zzic.l(zzljVar2);
                new Thread(new bto(zzljVar2, 3)).start();
                return;
            case 23:
                ml0 ml0Var = (ml0) this.b;
                Object obj2 = ml0Var.b;
                synchronized (obj2) {
                    try {
                        if (ml0Var.l) {
                            return;
                        }
                        long j8 = ml0Var.k - 1;
                        ml0Var.k = j8;
                        if (j8 > 0) {
                            return;
                        }
                        if (j8 >= 0) {
                            ml0Var.c();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj2) {
                            ml0Var.m = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                Iterator it2 = ((rfn) this.b).c.values().iterator();
                while (it2.hasNext()) {
                    ((okn) it2.next()).a(4);
                    it2.remove();
                }
                return;
        }
    }

    public /* synthetic */ dno(xwo xwoVar, int i) {
        this.a = 7;
        this.b = xwoVar;
    }

    public /* synthetic */ dno(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
