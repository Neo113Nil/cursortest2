package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.internal.d;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzcrj;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzemj;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzeog;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvm;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlq;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzw;
import com.google.android.gms.measurement.internal.zzx;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nkn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public nkn(zzfvd zzfvdVar, zze zzeVar) {
        this.a = 24;
        this.b = zzeVar;
        Objects.requireNonNull(zzfvdVar);
        this.c = zzfvdVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:23|(1:25)(7:257|258|259|(1:261)(2:284|(1:286))|262|263|(29:265|(1:267)(1:280)|268|269|270|272|273|274|28|(2:30|(2:32|(2:34|(2:36|(2:38|(2:40|(1:42)(1:250))(1:251))(1:252))(1:253))(1:254))(1:255))(1:256)|43|44|45|(1:47)(1:247)|48|(1:50)(1:246)|51|(1:53)|55|56|(1:58)(2:243|(8:245|(3:236|237|(6:239|(5:63|(1:65)(3:227|(3:230|(1:232)(1:233)|228)|234)|(1:67)(1:226)|68|(9:70|(1:72)(1:223)|73|(1:75)|76|(1:78)(1:222)|79|(1:81)|(31:220|83|(1:85)|86|(3:215|216|(19:218|(1:102)(1:214)|103|104|(1:106)|107|(2:208|(1:213))(1:111)|112|(3:204|(1:206)|207)|116|(1:118)|119|(1:123)|124|(3:126|(7:128|(1:130)(1:160)|131|(1:133)|134|(4:138|(1:140)|141|(1:143))|144)(1:161)|145)(10:162|(4:164|(2:167|(6:169|(1:171)(1:201)|172|(1:174)|175|176))|202|176)(1:203)|177|(1:179)|180|181|182|183|184|(5:186|(1:188)(1:196)|(1:192)|(1:194)|195))|146|(2:148|(5:150|(1:152)|153|(1:155)|156))|157|158))(1:89)|90|(1:99)|100|(0)(0)|103|104|(0)|107|(1:109)|208|(1:213)|112|(1:114)|204|(0)|207|116|(0)|119|(2:121|123)|124|(0)(0)|146|(0)|157|158)(32:221|86|(0)|215|216|(0)|90|(1:99)|100|(0)(0)|103|104|(0)|107|(0)|208|(0)|112|(0)|204|(0)|207|116|(0)|119|(0)|124|(0)(0)|146|(0)|157|158))(2:224|225))|235|(0)(0)|68|(0)(0)))|61|(0)|235|(0)(0)|68|(0)(0)))|59|(0)|61|(0)|235|(0)(0)|68|(0)(0))(1:281))|26|27|28|(0)(0)|43|44|45|(0)(0)|48|(0)(0)|51|(0)|55|56|(0)(0)|59|(0)|61|(0)|235|(0)(0)|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0281, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0282, code lost:
    
        com.google.android.gms.measurement.internal.zzic.m(r13);
        r13.g.c(com.google.android.gms.measurement.internal.zzgu.U(r2), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0409, code lost:
    
        if (r11.n0() == 1) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0558 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x025f A[Catch: IllegalStateException -> 0x0281, TryCatch #2 {IllegalStateException -> 0x0281, blocks: (B:45:0x0256, B:48:0x0265, B:51:0x026d, B:53:0x0271, B:247:0x025f), top: B:44:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0271 A[Catch: IllegalStateException -> 0x0281, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0281, blocks: (B:45:0x0256, B:48:0x0265, B:51:0x026d, B:53:0x0271, B:247:0x025f), top: B:44:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        zzgu zzguVar;
        zzgu zzguVar2;
        String str2;
        String str3;
        PackageManager packageManager;
        String str4;
        PackageInfo packageInfo;
        int i;
        String str5;
        int g;
        Bundle c0;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        zzlq zzlqVar;
        zzgs zzgsVar;
        zzgu zzguVar3;
        zzji g0;
        zzji zzjiVar;
        zzic zzicVar;
        zzgs zzgsVar2;
        zzpp zzppVar;
        zzjl zzjlVar;
        zzjl zzjlVar2;
        zzic zzicVar2;
        zzji g02;
        zzji g03;
        Boolean d0;
        zzhe zzheVar;
        zzx zzxVar;
        zzic zzicVar3;
        zzpp zzppVar2;
        zzhg zzhgVar;
        zzgu zzguVar4;
        zzgs zzgsVar3;
        String str6;
        Bundle bundle;
        zzic zzicVar4 = (zzic) this.c;
        zzjs zzjsVar = (zzjs) this.b;
        zzhz zzhzVar = zzicVar4.g;
        zzgu zzguVar5 = zzicVar4.f;
        lmo lmoVar = zzicVar4.e;
        zzpp zzppVar3 = zzicVar4.i;
        zzic.m(zzhzVar);
        zzhzVar.Q();
        zzal zzalVar = zzicVar4.d;
        ((zzic) zzalVar.b).getClass();
        zzbb zzbbVar = new zzbb(zzicVar4);
        ((zzic) zzbbVar.b).A++;
        zzbbVar.T();
        zzicVar4.s = zzbbVar;
        zzdb zzdbVar = zzjsVar.d;
        long j = zzdbVar == null ? 0L : zzdbVar.a;
        String string = (zzdbVar == null || (bundle = zzdbVar.d) == null) ? "" : bundle.getString("runtime_google_app_id", "");
        long j2 = zzjsVar.c;
        String str7 = "";
        zzgi zzgiVar = new zzgi(zzicVar4, j2, j, string);
        zzgiVar.S();
        zzicVar4.t = zzgiVar;
        zzgl zzglVar = new zzgl(zzicVar4);
        zzglVar.S();
        zzicVar4.q = zzglVar;
        zznl zznlVar = new zznl(zzicVar4);
        zznlVar.S();
        zzicVar4.r = zznlVar;
        boolean z = zzppVar3.c;
        zzic zzicVar5 = (zzic) zzppVar3.b;
        if (z) {
            a70.r("Can't initialize twice");
            return;
        }
        zzppVar3.Q();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzgu zzguVar6 = ((zzic) zzppVar3.b).f;
                zzic.m(zzguVar6);
                zzguVar6.j.a("Utils falling back to Random for random id");
            }
        }
        zzppVar3.e.set(nextLong);
        zzicVar5.C.incrementAndGet();
        zzppVar3.c = true;
        if (lmoVar.c) {
            a70.r("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences = ((zzic) lmoVar.b).a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        lmoVar.d = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        lmoVar.s = z2;
        if (!z2) {
            SharedPreferences.Editor edit = lmoVar.d.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        lmoVar.f = new zzhf(lmoVar, Math.max(0L, ((Long) zzfy.d.a(null)).longValue()));
        ((zzic) lmoVar.b).C.incrementAndGet();
        lmoVar.c = true;
        zzgi zzgiVar2 = zzicVar4.t;
        if (zzgiVar2.c) {
            a70.r("Can't initialize twice");
            return;
        }
        zzic zzicVar6 = (zzic) zzgiVar2.b;
        zzgu zzguVar7 = zzicVar6.f;
        zzgu zzguVar8 = zzicVar6.f;
        zzic.m(zzguVar7);
        zzguVar7.o.c(Long.valueOf(zzgiVar2.k), Long.valueOf(zzgiVar2.j), "sdkVersion bundled with app, dynamiteVersion");
        Context context = zzicVar6.a;
        String packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        String str8 = "Unknown";
        String str9 = "unknown";
        if (packageManager2 == null) {
            zzic.m(zzguVar8);
            zzguVar2 = zzguVar8;
            str = "Can't initialize twice";
            zzguVar = zzguVar5;
            zzguVar2.g.b(zzgu.U(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
        } else {
            str = "Can't initialize twice";
            zzguVar = zzguVar5;
            zzguVar2 = zzguVar8;
            try {
                str2 = packageManager2.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzic.m(zzguVar2);
                zzguVar2.g.b(zzgu.U(packageName), "Error retrieving app installer package name. appId");
                str2 = "unknown";
            }
            if (str2 == null) {
                str2 = "manual_install";
            } else if ("com.android.vending".equals(str2)) {
                str2 = str7;
            }
            try {
                packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str9 = str2;
                str3 = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                str3 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                str9 = str2;
                try {
                    str4 = packageInfo.versionName;
                } catch (PackageManager.NameNotFoundException unused3) {
                }
                try {
                    i = packageInfo.versionCode;
                    packageManager = packageManager2;
                    str5 = str9;
                } catch (PackageManager.NameNotFoundException unused4) {
                    str8 = str4;
                    zzic.m(zzguVar2);
                    packageManager = packageManager2;
                    zzguVar2.g.c(zzgu.U(packageName), str3, "Error retrieving package info. appId, appName");
                    str4 = str8;
                    str5 = str9;
                    i = Integer.MIN_VALUE;
                    zzgiVar2.d = packageName;
                    zzgiVar2.g = str5;
                    zzgiVar2.e = str4;
                    zzgiVar2.f = i;
                    zzgiVar2.h = str3;
                    zzgiVar2.i = 0L;
                    g = zzicVar6.g();
                    if (g == 0) {
                    }
                    zzgiVar2.p = str7;
                    str6 = zzgiVar2.n;
                    if (TextUtils.isEmpty(str6)) {
                    }
                    if (!TextUtils.isEmpty(str6)) {
                    }
                    zzgiVar2.p = str7;
                    if (g == 0) {
                    }
                    zzgiVar2.l = null;
                    zzal zzalVar2 = zzicVar6.d;
                    zzic zzicVar7 = (zzic) zzalVar2.b;
                    Preconditions.f("analytics.safelisted_events");
                    c0 = zzalVar2.c0();
                    if (c0 == null) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    asList = null;
                    if (asList != null) {
                    }
                    zzgiVar2.l = asList;
                    if (packageManager == null) {
                    }
                    ((zzic) zzgiVar2.b).C.incrementAndGet();
                    zzgiVar2.c = true;
                    zzlqVar = new zzlq(zzicVar4);
                    Object obj = zzlqVar.b;
                    zzic zzicVar8 = (zzic) obj;
                    zzicVar8.A++;
                    zzlqVar.S();
                    zzicVar4.u = zzlqVar;
                    if (!zzlqVar.c) {
                    }
                }
                zzgiVar2.d = packageName;
                zzgiVar2.g = str5;
                zzgiVar2.e = str4;
                zzgiVar2.f = i;
                zzgiVar2.h = str3;
                zzgiVar2.i = 0L;
                g = zzicVar6.g();
                if (g == 0) {
                    zzic.m(zzguVar2);
                    zzguVar2.o.a("App measurement collection enabled");
                } else if (g == 1) {
                    zzic.m(zzguVar2);
                    zzguVar2.m.a("App measurement deactivated via the manifest");
                } else if (g == 3) {
                    zzic.m(zzguVar2);
                    zzguVar2.m.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (g == 4) {
                    zzic.m(zzguVar2);
                    zzguVar2.m.a("App measurement disabled via the manifest");
                } else if (g == 6) {
                    zzic.m(zzguVar2);
                    zzguVar2.l.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (g == 7) {
                    zzic.m(zzguVar2);
                    zzguVar2.m.a("App measurement disabled via the global data collection setting");
                } else if (g != 8) {
                    zzic.m(zzguVar2);
                    zzguVar2.m.a("App measurement disabled");
                    zzic.m(zzguVar2);
                    zzguVar2.h.a("Invalid scion state in identity");
                } else {
                    zzic.m(zzguVar2);
                    zzguVar2.m.a("App measurement disabled due to denied storage consent");
                }
                zzgiVar2.p = str7;
                str6 = zzgiVar2.n;
                if (TextUtils.isEmpty(str6)) {
                    str6 = zzlt.a(context, zzicVar6.p);
                }
                if (!TextUtils.isEmpty(str6)) {
                    str7 = str6;
                }
                zzgiVar2.p = str7;
                if (g == 0) {
                    zzic.m(zzguVar2);
                    zzguVar2.o.c(zzgiVar2.d, zzgiVar2.p, "App measurement enabled for app package, google app id");
                }
                zzgiVar2.l = null;
                zzal zzalVar22 = zzicVar6.d;
                zzic zzicVar72 = (zzic) zzalVar22.b;
                Preconditions.f("analytics.safelisted_events");
                c0 = zzalVar22.c0();
                if (c0 == null) {
                    zzgu zzguVar9 = zzicVar72.f;
                    zzic.m(zzguVar9);
                    zzguVar9.g.a("Failed to load metadata: Metadata bundle is null");
                } else if (c0.containsKey("analytics.safelisted_events")) {
                    valueOf = Integer.valueOf(c0.getInt("analytics.safelisted_events"));
                    if (valueOf != null) {
                        try {
                            stringArray = zzicVar72.a.getResources().getStringArray(valueOf.intValue());
                        } catch (Resources.NotFoundException e) {
                            zzgu zzguVar10 = zzicVar72.f;
                            zzic.m(zzguVar10);
                            zzguVar10.g.b(e, "Failed to load string array from metadata: resource not found");
                        }
                        if (stringArray != null) {
                            asList = Arrays.asList(stringArray);
                            if (asList != null) {
                                if (!asList.isEmpty()) {
                                    for (String str10 : asList) {
                                        zzpp zzppVar4 = zzicVar6.i;
                                        zzic.k(zzppVar4);
                                        if (!zzppVar4.U0("safelisted event", str10)) {
                                            break;
                                        }
                                    }
                                } else {
                                    zzic.m(zzguVar2);
                                    zzguVar2.l.a("Safelisted event list is empty. Ignoring");
                                }
                                if (packageManager == null) {
                                    zzgiVar2.o = InstantApps.a(context) ? 1 : 0;
                                } else {
                                    zzgiVar2.o = 0;
                                }
                                ((zzic) zzgiVar2.b).C.incrementAndGet();
                                zzgiVar2.c = true;
                                zzlqVar = new zzlq(zzicVar4);
                                Object obj2 = zzlqVar.b;
                                zzic zzicVar82 = (zzic) obj2;
                                zzicVar82.A++;
                                zzlqVar.S();
                                zzicVar4.u = zzlqVar;
                                if (!zzlqVar.c) {
                                    a70.r(str);
                                    return;
                                }
                                zzlqVar.d = (JobScheduler) ((zzic) obj2).a.getSystemService("jobscheduler");
                                zzicVar82.C.incrementAndGet();
                                zzlqVar.c = true;
                                zzic.m(zzguVar);
                                zzgu zzguVar11 = zzguVar;
                                zzgs zzgsVar4 = zzguVar11.n;
                                zzgs zzgsVar5 = zzguVar11.m;
                                zzgs zzgsVar6 = zzguVar11.o;
                                zzgs zzgsVar7 = zzguVar11.g;
                                zzalVar.W();
                                zzgsVar5.b(161000L, "App measurement initialized, version");
                                zzic.m(zzguVar11);
                                zzgsVar5.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                String W = zzgiVar.W();
                                if (zzppVar3.v0(W, zzalVar.d)) {
                                    zzic.m(zzguVar11);
                                    zzgsVar5.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    zzic.m(zzguVar11);
                                    zzgsVar5.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(W)));
                                }
                                zzic.m(zzguVar11);
                                zzgsVar4.a("Debug-level message logging enabled");
                                int i2 = zzicVar4.A;
                                AtomicInteger atomicInteger = zzicVar4.C;
                                if (i2 != atomicInteger.get()) {
                                    zzic.m(zzguVar11);
                                    zzgsVar7.c(Integer.valueOf(zzicVar4.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                }
                                zzicVar4.v = true;
                                long j3 = zzicVar4.D;
                                zzlj zzljVar = zzicVar4.m;
                                zzic.m(zzhzVar);
                                zzhzVar.Q();
                                zzic.j(zzicVar4.u);
                                zzin V = zzicVar4.u.V();
                                zzaif.a();
                                boolean b0 = zzalVar.b0(null, zzfy.P0);
                                boolean z3 = V == zzin.CLIENT_UPLOAD_ELIGIBLE;
                                if (b0) {
                                    zzppVar3.Q();
                                }
                                if (!z3) {
                                    zzgsVar = zzgsVar5;
                                    zzguVar3 = zzguVar11;
                                    zzhg zzhgVar2 = lmoVar.h;
                                    zzjl X = lmoVar.X();
                                    int i3 = X.b;
                                    g0 = zzalVar.g0("google_analytics_default_allow_ad_storage", false);
                                    zzji g04 = zzalVar.g0("google_analytics_default_allow_analytics_storage", false);
                                    zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                                    zzjiVar = zzji.UNINITIALIZED;
                                    if (g0 == zzjiVar) {
                                    }
                                    zzicVar = zzicVar4;
                                    zzgsVar2 = zzgsVar7;
                                    zzppVar = zzppVar3;
                                    if (zzjl.l(-10, lmoVar.U().getInt("consent_source", 100))) {
                                    }
                                    if (!TextUtils.isEmpty(zzicVar.q().X())) {
                                        zzic.l(zzljVar);
                                        zzljVar.m0(new zzjl(-10), false);
                                    }
                                    zzjlVar = null;
                                    if (zzjlVar != null) {
                                    }
                                    zzic.l(zzljVar);
                                    zzicVar2 = (zzic) zzljVar.b;
                                    zzljVar.q0(zzjlVar2);
                                    lmoVar.Q();
                                    int i4 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).a;
                                    g02 = zzalVar.g0("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (g02 != zzjiVar) {
                                    }
                                    g03 = zzalVar.g0("google_analytics_default_allow_ad_user_data", true);
                                    if (g03 == zzjiVar) {
                                    }
                                    if (!TextUtils.isEmpty(zzicVar.q().X())) {
                                    }
                                    d0 = zzalVar.d0("google_analytics_tcf_data_enabled");
                                    if (d0 != null) {
                                    }
                                    zzic.m(zzguVar3);
                                    zzgsVar4.a("TCF client enabled.");
                                    zzic.l(zzljVar);
                                    zzljVar.Q();
                                    zzgu zzguVar12 = zzicVar2.f;
                                    zzic.m(zzguVar12);
                                    zzguVar12.n.a("Register tcfPrefChangeListener.");
                                    if (zzljVar.u == null) {
                                    }
                                    lmo lmoVar2 = zzicVar2.e;
                                    zzic.k(lmoVar2);
                                    lmoVar2.V().registerOnSharedPreferenceChangeListener(zzljVar.u);
                                    zzic.l(zzljVar);
                                    zzljVar.W();
                                    zzheVar = lmoVar.g;
                                    if (zzheVar.a() == 0) {
                                    }
                                    zzic.l(zzljVar);
                                    zzxVar = zzljVar.r;
                                    if (zzxVar.c()) {
                                    }
                                    if (zzicVar.h()) {
                                    }
                                    zzaif.a();
                                    if (zzalVar.b0(null, zzfy.P0)) {
                                    }
                                    lmoVar.p.b(true);
                                    return;
                                }
                                z3 = true;
                                zzppVar3.Q();
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                boolean z4 = z3;
                                zzgsVar = zzgsVar5;
                                zzguVar3 = zzguVar11;
                                eq3.K(zzicVar5.a, new zzw(zzicVar5), intentFilter, null, 2);
                                zzgu zzguVar13 = zzicVar5.f;
                                zzic.m(zzguVar13);
                                zzguVar13.n.a("Registered app receiver");
                                if (z4) {
                                    zzic.j(zzicVar4.u);
                                    zzicVar4.u.U(((Long) zzfy.C.a(null)).longValue());
                                }
                                zzhg zzhgVar22 = lmoVar.h;
                                zzjl X2 = lmoVar.X();
                                int i32 = X2.b;
                                g0 = zzalVar.g0("google_analytics_default_allow_ad_storage", false);
                                zzji g042 = zzalVar.g0("google_analytics_default_allow_analytics_storage", false);
                                zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                                zzjiVar = zzji.UNINITIALIZED;
                                if (g0 == zzjiVar || g042 != zzjiVar) {
                                    zzicVar = zzicVar4;
                                    zzgsVar2 = zzgsVar7;
                                    zzppVar = zzppVar3;
                                    if (zzjl.l(-10, lmoVar.U().getInt("consent_source", 100))) {
                                        EnumMap enumMap = new EnumMap(zzjk.class);
                                        enumMap.put((EnumMap) zzjk.AD_STORAGE, (zzjk) g0);
                                        enumMap.put((EnumMap) zzjkVar2, (zzjk) g042);
                                        zzjlVar = new zzjl(enumMap, -10);
                                        if (zzjlVar != null) {
                                            zzic.l(zzljVar);
                                            zzljVar.m0(zzjlVar, true);
                                            zzjlVar2 = zzjlVar;
                                        } else {
                                            zzjlVar2 = X2;
                                        }
                                        zzic.l(zzljVar);
                                        zzicVar2 = (zzic) zzljVar.b;
                                        zzljVar.q0(zzjlVar2);
                                        lmoVar.Q();
                                        int i42 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).a;
                                        g02 = zzalVar.g0("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (g02 != zzjiVar) {
                                            zzic.m(zzguVar3);
                                            zzgsVar6.b(g02, "Default ad personalization consent from Manifest");
                                        }
                                        g03 = zzalVar.g0("google_analytics_default_allow_ad_user_data", true);
                                        if (g03 == zzjiVar && zzjl.l(-10, i42)) {
                                            zzic.l(zzljVar);
                                            EnumMap enumMap2 = new EnumMap(zzjk.class);
                                            enumMap2.put((EnumMap) zzjk.AD_USER_DATA, (zzjk) g03);
                                            zzljVar.l0(new zzba(enumMap2, -10, (Boolean) null, (String) null), true);
                                        } else if (!TextUtils.isEmpty(zzicVar.q().X()) && (i42 == 0 || i42 == 30)) {
                                            zzic.l(zzljVar);
                                            zzljVar.l0(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
                                        d0 = zzalVar.d0("google_analytics_tcf_data_enabled");
                                        if (d0 != null || d0.booleanValue()) {
                                            zzic.m(zzguVar3);
                                            zzgsVar4.a("TCF client enabled.");
                                            zzic.l(zzljVar);
                                            zzljVar.Q();
                                            zzgu zzguVar122 = zzicVar2.f;
                                            zzic.m(zzguVar122);
                                            zzguVar122.n.a("Register tcfPrefChangeListener.");
                                            if (zzljVar.u == null) {
                                                zzljVar.v = new dto(zzljVar, zzicVar2, 2);
                                                zzljVar.u = new w3o(zzljVar, 1);
                                            }
                                            lmo lmoVar22 = zzicVar2.e;
                                            zzic.k(lmoVar22);
                                            lmoVar22.V().registerOnSharedPreferenceChangeListener(zzljVar.u);
                                            zzic.l(zzljVar);
                                            zzljVar.W();
                                        }
                                        zzheVar = lmoVar.g;
                                        if (zzheVar.a() == 0) {
                                            zzic.m(zzguVar3);
                                            zzgsVar6.b(Long.valueOf(j3), "Persisting first open");
                                            zzheVar.b(j3);
                                        }
                                        zzic.l(zzljVar);
                                        zzxVar = zzljVar.r;
                                        if (zzxVar.c() && zzxVar.b()) {
                                            lmo lmoVar3 = zzxVar.a.e;
                                            zzic.k(lmoVar3);
                                            lmoVar3.x.b(null);
                                        }
                                        if (zzicVar.h()) {
                                            zzicVar3 = zzicVar;
                                            zzppVar2 = zzppVar;
                                            if (TextUtils.isEmpty(zzicVar3.q().X())) {
                                                zzhgVar = zzhgVar22;
                                            } else {
                                                String X3 = zzicVar3.q().X();
                                                lmoVar.Q();
                                                String string2 = lmoVar.U().getString("gmp_app_id", null);
                                                boolean isEmpty = TextUtils.isEmpty(X3);
                                                boolean isEmpty2 = TextUtils.isEmpty(string2);
                                                if (!isEmpty && !isEmpty2) {
                                                    Preconditions.i(X3);
                                                    if (!X3.equals(string2)) {
                                                        zzic.m(zzguVar3);
                                                        zzgsVar.a("Rechecking which service to use due to a GMP App Id change");
                                                        lmoVar.Q();
                                                        lmoVar.Q();
                                                        Boolean valueOf2 = lmoVar.U().contains("measurement_enabled") ? Boolean.valueOf(lmoVar.U().getBoolean("measurement_enabled", true)) : null;
                                                        SharedPreferences.Editor edit2 = lmoVar.U().edit();
                                                        edit2.clear();
                                                        edit2.apply();
                                                        if (valueOf2 != null) {
                                                            lmoVar.Q();
                                                            SharedPreferences.Editor edit3 = lmoVar.U().edit();
                                                            edit3.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                            edit3.apply();
                                                        }
                                                        zzicVar3.n().U();
                                                        zzicVar3.r.Y();
                                                        zzicVar3.r.W();
                                                        zzheVar.b(j3);
                                                        zzhgVar = zzhgVar22;
                                                        zzhgVar.b(null);
                                                        String X4 = zzicVar3.q().X();
                                                        lmoVar.Q();
                                                        SharedPreferences.Editor edit4 = lmoVar.U().edit();
                                                        edit4.putString("gmp_app_id", X4);
                                                        edit4.apply();
                                                    }
                                                }
                                                zzhgVar = zzhgVar22;
                                                String X42 = zzicVar3.q().X();
                                                lmoVar.Q();
                                                SharedPreferences.Editor edit42 = lmoVar.U().edit();
                                                edit42.putString("gmp_app_id", X42);
                                                edit42.apply();
                                            }
                                            if (!lmoVar.X().i(zzjkVar2)) {
                                                zzhgVar.b(null);
                                            }
                                            zzic.l(zzljVar);
                                            zzljVar.h.set(zzhgVar.a());
                                            try {
                                                zzicVar5.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused5) {
                                                zzhg zzhgVar3 = lmoVar.w;
                                                if (!TextUtils.isEmpty(zzhgVar3.a())) {
                                                    zzic.m(zzguVar3);
                                                    zzguVar4 = zzguVar3;
                                                    zzguVar4.j.a("Remote config removed with active feature rollouts");
                                                    zzhgVar3.b(null);
                                                }
                                            }
                                            zzguVar4 = zzguVar3;
                                            if (!TextUtils.isEmpty(zzicVar3.q().X())) {
                                                boolean c = zzicVar3.c();
                                                SharedPreferences sharedPreferences2 = lmoVar.d;
                                                if (!(sharedPreferences2 == null ? false : sharedPreferences2.contains("deferred_analytics_collection")) && !zzalVar.e0()) {
                                                    lmoVar.Y(!c);
                                                }
                                                if (c) {
                                                    zzic.l(zzljVar);
                                                    zzljVar.c0();
                                                }
                                                zzoc zzocVar = zzicVar3.h;
                                                zzic.l(zzocVar);
                                                zzocVar.f.mo905zza();
                                                zzicVar3.o().U(new AtomicReference());
                                                zzicVar3.o().V(lmoVar.z.a());
                                            }
                                        } else {
                                            if (zzicVar.c()) {
                                                zzppVar2 = zzppVar;
                                                if (zzppVar2.t0("android.permission.INTERNET")) {
                                                    zzgsVar3 = zzgsVar2;
                                                } else {
                                                    zzic.m(zzguVar3);
                                                    zzgsVar3 = zzgsVar2;
                                                    zzgsVar3.a("App is missing INTERNET permission");
                                                }
                                                if (!zzppVar2.t0("android.permission.ACCESS_NETWORK_STATE")) {
                                                    zzic.m(zzguVar3);
                                                    zzgsVar3.a("App is missing ACCESS_NETWORK_STATE permission");
                                                }
                                                zzicVar3 = zzicVar;
                                                Context context2 = zzicVar3.a;
                                                if (!Wrappers.a(context2).c() && !zzalVar.T()) {
                                                    if (!zzpp.L0(context2)) {
                                                        zzic.m(zzguVar3);
                                                        zzgsVar3.a("AppMeasurementReceiver not registered/enabled");
                                                    }
                                                    if (!zzpp.l0(context2)) {
                                                        zzic.m(zzguVar3);
                                                        zzgsVar3.a("AppMeasurementService not registered/enabled");
                                                    }
                                                }
                                                zzic.m(zzguVar3);
                                                zzgsVar3.a("Uploading is not possible. App measurement disabled");
                                            } else {
                                                zzicVar3 = zzicVar;
                                                zzppVar2 = zzppVar;
                                            }
                                            zzguVar4 = zzguVar3;
                                        }
                                        zzaif.a();
                                        if (zzalVar.b0(null, zzfy.P0)) {
                                            zzppVar2.Q();
                                            if (zzppVar2.n0() == 1) {
                                                long intValue = ((Integer) zzfy.w0.a(null)).intValue();
                                                long nextInt = new Random().nextInt(5000);
                                                zzicVar3.k.getClass();
                                                long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                if (max > 500) {
                                                    zzic.m(zzguVar4);
                                                    zzgsVar6.b(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                zzic.l(zzljVar);
                                                zzljVar.Q();
                                                dto dtoVar = zzljVar.m;
                                                if (dtoVar == null) {
                                                    dtoVar = new dto(zzljVar, zzicVar2, 0);
                                                    zzljVar.m = dtoVar;
                                                }
                                                dtoVar.b(max);
                                            }
                                        }
                                        lmoVar.p.b(true);
                                        return;
                                    }
                                } else {
                                    zzicVar = zzicVar4;
                                    zzgsVar2 = zzgsVar7;
                                    zzppVar = zzppVar3;
                                }
                                if (!TextUtils.isEmpty(zzicVar.q().X()) && (i32 == 0 || i32 == 30 || i32 == 10 || i32 == 40)) {
                                    zzic.l(zzljVar);
                                    zzljVar.m0(new zzjl(-10), false);
                                }
                                zzjlVar = null;
                                if (zzjlVar != null) {
                                }
                                zzic.l(zzljVar);
                                zzicVar2 = (zzic) zzljVar.b;
                                zzljVar.q0(zzjlVar2);
                                lmoVar.Q();
                                int i422 = zzba.b(lmoVar.U().getString("dma_consent_settings", null)).a;
                                g02 = zzalVar.g0("google_analytics_default_allow_ad_personalization_signals", true);
                                if (g02 != zzjiVar) {
                                }
                                g03 = zzalVar.g0("google_analytics_default_allow_ad_user_data", true);
                                if (g03 == zzjiVar) {
                                }
                                if (!TextUtils.isEmpty(zzicVar.q().X())) {
                                    zzic.l(zzljVar);
                                    zzljVar.l0(new zzba((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                d0 = zzalVar.d0("google_analytics_tcf_data_enabled");
                                if (d0 != null) {
                                }
                                zzic.m(zzguVar3);
                                zzgsVar4.a("TCF client enabled.");
                                zzic.l(zzljVar);
                                zzljVar.Q();
                                zzgu zzguVar1222 = zzicVar2.f;
                                zzic.m(zzguVar1222);
                                zzguVar1222.n.a("Register tcfPrefChangeListener.");
                                if (zzljVar.u == null) {
                                }
                                lmo lmoVar222 = zzicVar2.e;
                                zzic.k(lmoVar222);
                                lmoVar222.V().registerOnSharedPreferenceChangeListener(zzljVar.u);
                                zzic.l(zzljVar);
                                zzljVar.W();
                                zzheVar = lmoVar.g;
                                if (zzheVar.a() == 0) {
                                }
                                zzic.l(zzljVar);
                                zzxVar = zzljVar.r;
                                if (zzxVar.c()) {
                                    lmo lmoVar32 = zzxVar.a.e;
                                    zzic.k(lmoVar32);
                                    lmoVar32.x.b(null);
                                }
                                if (zzicVar.h()) {
                                }
                                zzaif.a();
                                if (zzalVar.b0(null, zzfy.P0)) {
                                }
                                lmoVar.p.b(true);
                                return;
                            }
                            zzgiVar2.l = asList;
                            if (packageManager == null) {
                            }
                            ((zzic) zzgiVar2.b).C.incrementAndGet();
                            zzgiVar2.c = true;
                            zzlqVar = new zzlq(zzicVar4);
                            Object obj22 = zzlqVar.b;
                            zzic zzicVar822 = (zzic) obj22;
                            zzicVar822.A++;
                            zzlqVar.S();
                            zzicVar4.u = zzlqVar;
                            if (!zzlqVar.c) {
                            }
                        }
                    }
                    asList = null;
                    if (asList != null) {
                    }
                    zzgiVar2.l = asList;
                    if (packageManager == null) {
                    }
                    ((zzic) zzgiVar2.b).C.incrementAndGet();
                    zzgiVar2.c = true;
                    zzlqVar = new zzlq(zzicVar4);
                    Object obj222 = zzlqVar.b;
                    zzic zzicVar8222 = (zzic) obj222;
                    zzicVar8222.A++;
                    zzlqVar.S();
                    zzicVar4.u = zzlqVar;
                    if (!zzlqVar.c) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
                asList = null;
                if (asList != null) {
                }
                zzgiVar2.l = asList;
                if (packageManager == null) {
                }
                ((zzic) zzgiVar2.b).C.incrementAndGet();
                zzgiVar2.c = true;
                zzlqVar = new zzlq(zzicVar4);
                Object obj2222 = zzlqVar.b;
                zzic zzicVar82222 = (zzic) obj2222;
                zzicVar82222.A++;
                zzlqVar.S();
                zzicVar4.u = zzlqVar;
                if (!zzlqVar.c) {
                }
            } else {
                str9 = str2;
            }
        }
        packageManager = packageManager2;
        str4 = "Unknown";
        str3 = str4;
        str5 = str9;
        i = Integer.MIN_VALUE;
        zzgiVar2.d = packageName;
        zzgiVar2.g = str5;
        zzgiVar2.e = str4;
        zzgiVar2.f = i;
        zzgiVar2.h = str3;
        zzgiVar2.i = 0L;
        g = zzicVar6.g();
        if (g == 0) {
        }
        zzgiVar2.p = str7;
        str6 = zzgiVar2.n;
        if (TextUtils.isEmpty(str6)) {
        }
        if (!TextUtils.isEmpty(str6)) {
        }
        zzgiVar2.p = str7;
        if (g == 0) {
        }
        zzgiVar2.l = null;
        zzal zzalVar222 = zzicVar6.d;
        zzic zzicVar722 = (zzic) zzalVar222.b;
        Preconditions.f("analytics.safelisted_events");
        c0 = zzalVar222.c0();
        if (c0 == null) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        asList = null;
        if (asList != null) {
        }
        zzgiVar2.l = asList;
        if (packageManager == null) {
        }
        ((zzic) zzgiVar2.b).C.incrementAndGet();
        zzgiVar2.c = true;
        zzlqVar = new zzlq(zzicVar4);
        Object obj22222 = zzlqVar.b;
        zzic zzicVar822222 = (zzic) obj22222;
        zzicVar822222.A++;
        zzlqVar.S();
        zzicVar4.u = zzlqVar;
        if (!zzlqVar.c) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        s7o s7oVar;
        zzclm zzclmVar;
        zzfmd zzfmdVar;
        zzfmd zzfmdVar2;
        View view;
        int i = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                iso isoVar = (iso) this.b;
                isoVar.a();
                if (zzae.a()) {
                    isoVar.d().Z(this);
                    return;
                }
                skn sknVar = (skn) this.c;
                r4 = sknVar.c != 0;
                sknVar.c = 0L;
                if (r4) {
                    sknVar.a();
                    return;
                }
                return;
            case 1:
                zzbm zzbmVar = ((b) this.b).a;
                zzac zzacVar = (zzac) this.c;
                t8p t8pVar = zzbmVar.E;
                ApplicationMetadata applicationMetadata = zzacVar.d;
                zzao zzaoVar = zzacVar.f;
                if (!CastUtils.c(applicationMetadata, zzbmVar.u)) {
                    zzbmVar.u = applicationMetadata;
                    t8pVar.c(applicationMetadata);
                }
                double d = zzacVar.a;
                if (Double.isNaN(d) || Math.abs(d - zzbmVar.w) <= 1.0E-7d) {
                    z = false;
                } else {
                    zzbmVar.w = d;
                    z = true;
                }
                boolean z3 = zzacVar.b;
                if (z3 != zzbmVar.x) {
                    zzbmVar.x = z3;
                    z = true;
                }
                Logger logger = zzbm.H;
                logger.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(zzbmVar.n));
                if (t8pVar != null && (z || zzbmVar.n)) {
                    t8pVar.g();
                }
                Double.isNaN(zzacVar.g);
                int i2 = zzacVar.c;
                if (i2 != zzbmVar.y) {
                    zzbmVar.y = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                logger.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(zzbmVar.n));
                if (t8pVar != null && (z2 || zzbmVar.n)) {
                    t8pVar.a(zzbmVar.y);
                }
                int i3 = zzacVar.e;
                if (i3 != zzbmVar.z) {
                    zzbmVar.z = i3;
                } else {
                    r4 = false;
                }
                logger.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(r4), Boolean.valueOf(zzbmVar.n));
                if (t8pVar != null && (r4 || zzbmVar.n)) {
                    t8pVar.f(zzbmVar.z);
                }
                if (!CastUtils.c(zzbmVar.A, zzaoVar)) {
                    zzbmVar.A = zzaoVar;
                }
                zzbmVar.n = false;
                return;
            case 2:
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k6)).booleanValue();
                Context context = (Context) this.c;
                zzbik zzbikVar = (zzbik) this.b;
                if (booleanValue) {
                    try {
                        zzbikVar.a = (zzbfc) zzs.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", fff.c);
                        zzbikVar.a.G(new ObjectWrapper(context));
                        zzbikVar.b = true;
                        return;
                    } catch (RemoteException | zzr | NullPointerException unused) {
                        zzo.zzd("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 3:
                zzbtp zzbtpVar = (zzbtp) this.b;
                String str = (String) this.c;
                zzclm zzclmVar2 = zzbtpVar.a;
                if (zzclmVar2 != null) {
                    zzclmVar2.loadData(str, "text/html", C.UTF8_NAME);
                    return;
                }
                return;
            case 4:
                zzbul zzbulVar = (zzbul) this.c;
                zzbum zzbumVar = (zzbum) this.b;
                long a = zzt.zzk().a();
                ArrayList arrayList = new ArrayList();
                try {
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = zzbumVar.b;
                    VersionInfoParcel versionInfoParcel = zzbumVar.d;
                    zzbtp zzbtpVar2 = new zzbtp();
                    zzt.zzd();
                    zzclm a2 = zzcmc.a(context2, new zzcnw(0, 0, 0), "", false, false, null, null, versionInfoParcel, null, null, zzbif.a(), null, null, null, null, null);
                    zzbtpVar2.a = a2;
                    a2.zzE().setWillNotDraw(true);
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
                    pq7 pq7Var = new pq7(zzbumVar, arrayList, a, zzbulVar, zzbtpVar2);
                    zzclm zzclmVar3 = zzbtpVar2.a;
                    if (zzclmVar3 != null) {
                        zzclmVar3.zzP().h = new ohn(pq7Var, i);
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    zzbtpVar2.c0("/jsLoaded", new ipn(zzbumVar, a, zzbulVar, zzbtpVar2));
                    zzbv zzbvVar = new zzbv();
                    k0o k0oVar = new k0o(zzbumVar, zzbtpVar2, zzbvVar);
                    zzbvVar.zzb(k0oVar);
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) zzblh.d.c()).booleanValue() || TextUtils.equals(zzbumVar.b.getPackageName(), "com.google.android.gms")) {
                        zzbtpVar2.c0("/requestReload", k0oVar);
                    }
                    String str2 = zzbumVar.c;
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str2)));
                    if (str2.endsWith(".js")) {
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(str2));
                        zzbtp.A(new hpn(zzbtpVar2, "<!DOCTYPE html><html><head><script src=\"" + str2 + "\"></script></head><body></body></html>", objArr2 == true ? 1 : 0));
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str2.startsWith("<html>")) {
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
                        zzbtp.A(new nkn(zzbtpVar2, str2, objArr == true ? 1 : 0, 3));
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(str2));
                        zzbtp.A(new bnn(i, zzbtpVar2, str2));
                        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new kpn(zzbumVar, zzbulVar, zzbtpVar2, arrayList, a, 0), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.e)).intValue());
                    return;
                } catch (Throwable th) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Error creating webview.", th);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L8)).booleanValue()) {
                        zzbulVar.c("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th);
                        return;
                    } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N8)).booleanValue()) {
                        zzt.zzh().e("SdkJavascriptFactory.loadJavascriptEngine", th);
                        zzbulVar.b();
                        return;
                    } else {
                        zzt.zzh().d("SdkJavascriptFactory.loadJavascriptEngine", th);
                        zzbulVar.b();
                        return;
                    }
                }
            case 5:
                ((zzu) this.b).zzc((String) this.c, null);
                return;
            case 6:
                vdb vdbVar = (vdb) this.b;
                lda ldaVar = (lda) this.c;
                if (!((b2p) vdbVar.c).d() || (s7oVar = (s7o) vdbVar.f) == null) {
                    "Attempted to send bridge message after cleanup: ".concat(ldaVar.toString());
                    return;
                }
                y3p y3pVar = new y3p();
                y3pVar.a("type", ldaVar.d);
                y3pVar.a(L6.e1, ldaVar.c);
                Object obj = ldaVar.b;
                if (obj != null) {
                    y3pVar.a("data", obj);
                }
                String str3 = ldaVar.e;
                if (str3 != null) {
                    y3pVar.a("replyToMessageId", str3);
                }
                i5p b = y3pVar.b();
                String str4 = "javascript:adsense.mobileads.afmanotify.receiveMessage('" + ldaVar.a + "', " + s7oVar.a.d(b) + ");";
                new StringBuilder(ldaVar.toString().length() + 31 + str4.length());
                vdbVar.i(str4, null, null);
                return;
            case 7:
                zzcix zzcixVar = (zzcix) this.b;
                String str5 = (String) this.c;
                zzcht zzchtVar = zzcixVar.g;
                if (zzchtVar != null) {
                    zzchtVar.c("exception", "what", "ExoPlayerAdapter exception", "extra", str5);
                    return;
                }
                return;
            case 8:
                ohn ohnVar = new ohn((zzcmi) this.b, 5);
                zzemj zzemjVar = (zzemj) this.c;
                synchronized (zzemjVar) {
                    zzfvy zzfvyVar = zzemjVar.f;
                    if (zzfvyVar != null && (zzclmVar = zzemjVar.d) != null) {
                        zzt.zzu().g(zzfvyVar, ohnVar);
                        zzemjVar.f = null;
                        zzclmVar.h0(null);
                    }
                }
                return;
            case 9:
                zzcmx zzcmxVar = (zzcmx) this.b;
                String str6 = (String) this.c;
                fjn fjnVar = zzcmxVar.a;
                Uri parse = Uri.parse(str6);
                zzclx zzclxVar = ((n) fjnVar.b).n;
                if (zzclxVar != null) {
                    zzclxVar.A(parse);
                    return;
                } else {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                }
            case 10:
                zzcrj zzcrjVar = (zzcrj) this.b;
                Runnable runnable = (Runnable) this.c;
                Preconditions.e("Adapters must be initialized on the main thread.");
                HashMap hashMap = zzt.zzh().g().zzi().c;
                if (hashMap.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzj("Could not initialize rewarded ads.", th2);
                        return;
                    }
                }
                if (((zzbvu) zzcrjVar.c.a.c.get()) != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        for (zzbvn zzbvnVar : ((zzbvo) it.next()).a) {
                            String str7 = zzbvnVar.b;
                            for (String str8 : zzbvnVar.a) {
                                if (!hashMap2.containsKey(str8)) {
                                    hashMap2.put(str8, new ArrayList());
                                }
                                if (str7 != null) {
                                    ((List) hashMap2.get(str8)).add(str7);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String str9 = (String) entry.getKey();
                        try {
                            zzemt a3 = zzcrjVar.d.a(str9, jSONObject);
                            if (a3 != null) {
                                zzfmu zzfmuVar = (zzfmu) a3.b;
                                boolean a4 = zzfmuVar.a();
                                zzbvx zzbvxVar = zzfmuVar.a;
                                if (!a4) {
                                    try {
                                        if (zzbvxVar.zzx()) {
                                            try {
                                                zzbvxVar.m3(new ObjectWrapper(zzcrjVar.a), (zzeog) a3.c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str9);
                                                String sb2 = sb.toString();
                                                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                                                zzo.zzd(sb2);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (zzfmd e) {
                            String m = wt3.m("Failed to initialize rewarded video mediation adapter \"", str9, new StringBuilder(String.valueOf(str9).length() + 56), "\"");
                            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzj(m, e);
                        }
                    }
                    return;
                }
                return;
            case 11:
                JSONObject jSONObject2 = (JSONObject) this.b;
                String obj2 = jSONObject2.toString();
                String m2 = wt3.m("Calling AFMA_updateActiveView(", obj2, new StringBuilder(obj2.length() + 31), ")");
                int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd(m2);
                ((zzclm) this.c).h("AFMA_updateActiveView", jSONObject2);
                return;
            case 12:
                try {
                    ((zzdjm) this.b).mo13zza(this.c);
                    return;
                } catch (Throwable th3) {
                    zzt.zzh().e("EventEmitter.notify", th3);
                    com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th3);
                    return;
                }
            case 13:
                ((zzdqm) this.b).g((zzdso) this.c);
                return;
            case 14:
                zzdrq zzdrqVar = (zzdrq) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                zzflw zzflwVar = zzdrqVar.b;
                zzg zzgVar = zzdrqVar.a;
                zzdqr zzdqrVar = zzdrqVar.d;
                synchronized (zzdqrVar) {
                    view = zzdqrVar.o;
                }
                if (view != null) {
                    boolean z4 = viewGroup != null;
                    if (zzdqrVar.q() == 2 || zzdqrVar.q() == 1) {
                        zzgVar.zzr(zzflwVar.g, String.valueOf(zzdqrVar.q()), z4);
                        return;
                    } else {
                        if (zzdqrVar.q() == 6) {
                            String str10 = zzflwVar.g;
                            zzgVar.zzr(str10, "2", z4);
                            zzgVar.zzr(str10, "1", z4);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 15:
                ((zzeas) this.b).d.zzc((String) this.c, null);
                return;
            case 16:
                try {
                    ((zzbso) this.c).zza(((zzecu) this.b).b());
                    return;
                } catch (RemoteException e2) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("", e2);
                    return;
                }
            case 17:
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue() && zzfvk.a.a) {
                    ((zzfvq) this.b).c((View) this.c);
                    return;
                }
                return;
            case 18:
                zzfvy zzfvyVar2 = (zzfvy) this.b;
                View view2 = (View) this.c;
                Iterator it2 = zzfvyVar2.d.values().iterator();
                while (it2.hasNext()) {
                    ((zzfvm) it2.next()).c(view2);
                }
                zzfvyVar2.e.a(view2);
                return;
            case 19:
                ((zzes) ((d) this.b).b).c((Context) this.c);
                return;
            case 20:
                ((zzfhq) this.b).d.i0((zze) this.c);
                return;
            case 21:
                ((zzfkq) ((p03) this.b).f).d.i0((zze) this.c);
                return;
            case 22:
                ((zzfpz) this.b).f.c.p0(new ewm((zzfpp) this.c, 23));
                return;
            case 23:
                ((zzftp) this.b).n((zzfvd) this.c, 1);
                return;
            case 24:
                zzfvd zzfvdVar = (zzfvd) this.c;
                zze zzeVar = (zze) this.b;
                zzce zzceVar = zzfvdVar.i;
                if (zzceVar != null) {
                    try {
                        zzceVar.zzg(zzfvdVar.l, zzeVar);
                        return;
                    } catch (RemoteException unused2) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Failed to call onAdFailedToPreload");
                        return;
                    }
                }
                return;
            case 25:
                qeo qeoVar = (qeo) this.b;
                zzfzr zzfzrVar = (zzfzr) this.c;
                if (!qeoVar.a.a(zzfzrVar)) {
                    throw new zzgmg(2);
                }
                qeoVar.f.set("2.904631200.".concat(String.valueOf(zzfzrVar.a.D())));
                return;
            case 26:
                u53 u53Var = (u53) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } catch (RuntimeException e3) {
                    ((zzgtj) u53Var.d).c("error caused by ", e3);
                    return;
                }
            case 27:
                zznl o = ((AppMeasurementDynamiteService) this.c).a.o();
                zzcs zzcsVar = (zzcs) this.b;
                o.Q();
                o.R();
                o.e0(new jgo(o, o.g0(false), zzcsVar, 11));
                return;
            case 28:
                a();
                return;
            default:
                zzpg zzpgVar = ((zzjd) this.c).a;
                zzpgVar.W();
                zzah zzahVar = (zzah) this.b;
                if (zzahVar.c.zza() == null) {
                    zzpgVar.getClass();
                    String str11 = zzahVar.a;
                    Preconditions.i(str11);
                    com.google.android.gms.measurement.internal.zzr Q = zzpgVar.Q(str11);
                    if (Q != null) {
                        zzpgVar.b0(zzahVar, Q);
                        return;
                    }
                    return;
                }
                zzpgVar.getClass();
                String str12 = zzahVar.a;
                Preconditions.i(str12);
                com.google.android.gms.measurement.internal.zzr Q2 = zzpgVar.Q(str12);
                if (Q2 != null) {
                    zzpgVar.a0(zzahVar, Q2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ nkn(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ nkn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }
}
