package s7;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23165c;

    public /* synthetic */ w0(int i5, Object obj, Object obj2) {
        this.f23163a = i5;
        this.f23164b = obj2;
        this.f23165c = obj;
    }

    private final void a() {
        w7.k kVar = (w7.k) this.f23165c;
        synchronized (kVar.f24996c) {
            try {
                OnCompleteListener onCompleteListener = (OnCompleteListener) kVar.f24997d;
                if (onCompleteListener != null) {
                    onCompleteListener.onComplete((Task) this.f23164b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        w7.k kVar = (w7.k) this.f23165c;
        synchronized (kVar.f24996c) {
            try {
                w7.c cVar = (w7.c) kVar.f24997d;
                if (cVar != null) {
                    Exception exception = ((Task) this.f23164b).getException();
                    g6.v.h(exception);
                    cVar.c(exception);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        w7.k kVar = (w7.k) this.f23165c;
        synchronized (kVar.f24996c) {
            try {
                w7.d dVar = (w7.d) kVar.f24997d;
                if (dVar != null) {
                    dVar.onSuccess(((Task) this.f23164b).getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        w7.k kVar = (w7.k) this.f23165c;
        try {
            Task e7 = ((w7.f) kVar.f24996c).e(((Task) this.f23164b).getResult());
            if (e7 == null) {
                kVar.c(new NullPointerException("Continuation returned null"));
                return;
            }
            g6.p pVar = w7.h.f24981b;
            e7.e(pVar, kVar);
            e7.c(pVar, kVar);
            e7.a(pVar, kVar);
        } catch (CancellationException unused) {
            kVar.b();
        } catch (w7.e e9) {
            if (e9.getCause() instanceof Exception) {
                kVar.c((Exception) e9.getCause());
            } else {
                kVar.c(e9);
            }
        } catch (Exception e10) {
            kVar.c(e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:196|(1:198)(9:442|443|444|445|(1:447)(2:468|(4:470|449|450|(25:452|(1:454)(1:466)|455|456|457|458|459|200|201|(2:203|(2:205|(2:207|(2:209|(2:211|(2:213|(1:215)(1:435))(1:436))(1:437))(1:438))(1:439))(1:440))(1:441)|216|217|218|(1:220)(1:432)|221|(1:223)|225|(1:227)(2:429|(7:431|(3:421|422|(1:424)(1:425))|(5:231|(1:233)(3:412|(3:415|(1:417)(1:418)|413)|419)|(1:235)(1:411)|236|(38:238|(1:240)(1:408)|241|(1:243)|244|(1:246)(1:407)|247|(1:249)|(3:406|251|(1:253))|254|(3:401|402|(18:404|(1:270)(1:399)|271|(1:273)|274|(2:377|(2:383|(2:390|(2:391|(1:398)(2:393|(2:395|396)(1:397)))))(1:382))(1:278)|279|(3:373|(1:375)|376)|283|(1:285)|286|(1:290)|291|(3:293|(7:295|(1:297)(1:329)|298|(1:300)|301|(4:305|(1:307)|308|(1:310))|311)(1:330)|312)(10:331|(4:333|(2:336|(6:338|(1:340)(1:370)|341|(1:343)|344|345))|371|345)(1:372)|346|(1:348)|349|350|351|352|353|(5:355|(1:357)(1:365)|(1:361)|(1:363)|364))|313|(3:315|(1:317)(1:326)|(5:319|(1:321)|322|(1:324)|325))|327|328))(1:257)|258|(1:400)(1:267)|268|(0)(0)|271|(0)|274|(1:276)|377|(1:380)|383|(4:386|388|390|(3:391|(0)(0)|397))|279|(1:281)|373|(0)|376|283|(0)|286|(2:288|290)|291|(0)(0)|313|(0)|327|328)(2:409|410))|420|(0)(0)|236|(0)(0)))|228|(0)|(0)|420|(0)(0)|236|(0)(0))))|448|449|450|(0))|199|200|201|(0)(0)|216|217|218|(0)(0)|221|(0)|225|(0)(0)|228|(0)|(0)|420|(0)(0)|236|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:442|(2:443|444)|445|(1:447)(2:468|(4:470|449|450|(25:452|(1:454)(1:466)|455|456|457|458|459|200|201|(2:203|(2:205|(2:207|(2:209|(2:211|(2:213|(1:215)(1:435))(1:436))(1:437))(1:438))(1:439))(1:440))(1:441)|216|217|218|(1:220)(1:432)|221|(1:223)|225|(1:227)(2:429|(7:431|(3:421|422|(1:424)(1:425))|(5:231|(1:233)(3:412|(3:415|(1:417)(1:418)|413)|419)|(1:235)(1:411)|236|(38:238|(1:240)(1:408)|241|(1:243)|244|(1:246)(1:407)|247|(1:249)|(3:406|251|(1:253))|254|(3:401|402|(18:404|(1:270)(1:399)|271|(1:273)|274|(2:377|(2:383|(2:390|(2:391|(1:398)(2:393|(2:395|396)(1:397)))))(1:382))(1:278)|279|(3:373|(1:375)|376)|283|(1:285)|286|(1:290)|291|(3:293|(7:295|(1:297)(1:329)|298|(1:300)|301|(4:305|(1:307)|308|(1:310))|311)(1:330)|312)(10:331|(4:333|(2:336|(6:338|(1:340)(1:370)|341|(1:343)|344|345))|371|345)(1:372)|346|(1:348)|349|350|351|352|353|(5:355|(1:357)(1:365)|(1:361)|(1:363)|364))|313|(3:315|(1:317)(1:326)|(5:319|(1:321)|322|(1:324)|325))|327|328))(1:257)|258|(1:400)(1:267)|268|(0)(0)|271|(0)|274|(1:276)|377|(1:380)|383|(4:386|388|390|(3:391|(0)(0)|397))|279|(1:281)|373|(0)|376|283|(0)|286|(2:288|290)|291|(0)(0)|313|(0)|327|328)(2:409|410))|420|(0)(0)|236|(0)(0)))|228|(0)|(0)|420|(0)(0)|236|(0)(0))))|448|449|450|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0793, code lost:
    
        if (r11.G() == 1) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x060e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x060f, code lost:
    
        s7.f1.m(r14);
        r14.f22903f.c(s7.n0.r(r2), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x054b, code lost:
    
        r13 = "Unknown";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0366 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05ff A[Catch: IllegalStateException -> 0x060e, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x060e, blocks: (B:218:0x05ed, B:221:0x05fb, B:223:0x05ff), top: B:217:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x092e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0650 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x052e A[Catch: NameNotFoundException -> 0x054b, TryCatch #6 {NameNotFoundException -> 0x054b, blocks: (B:450:0x0523, B:452:0x052e, B:454:0x053a), top: B:449:0x0523 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c10  */
    /* JADX WARN: Type inference failed for: r0v63, types: [s7.d2] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        String str;
        zzdd zzddVar;
        String str2;
        PackageManager packageManager;
        int i5;
        String str3;
        PackageInfo packageInfo;
        int g10;
        List<String> list;
        Bundle u10;
        Integer valueOf;
        i2 i2Var;
        f1 f1Var;
        l0 l0Var;
        v3 v3Var;
        q1 q1Var;
        boolean z5;
        q1 q1Var2;
        f1 f1Var2;
        n1 y5;
        n1 y10;
        Bundle bundle;
        Iterator it;
        Boolean v5;
        io.sentry.android.core.s sVar;
        x0 x0Var;
        f1 f1Var3;
        v3 v3Var2;
        com.android.billingclient.api.i iVar;
        n0 n0Var;
        l0 l0Var2;
        String b10;
        Long valueOf2;
        switch (this.f23163a) {
            case 0:
                ca.a aVar = (ca.a) this.f23165c;
                f1 f1Var4 = ((x0) aVar.f3719c).f23230b;
                d1 d1Var = f1Var4.f22746g;
                f1.m(d1Var);
                d1Var.j();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", (String) aVar.f3718b);
                try {
                    com.google.android.gms.internal.measurement.a0 a0Var = (com.google.android.gms.internal.measurement.a0) ((com.google.android.gms.internal.measurement.c0) this.f23164b);
                    Parcel O = a0Var.O();
                    com.google.android.gms.internal.measurement.z.b(O, bundle2);
                    Parcel N = a0Var.N(O, 1);
                    Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.z.a(N, Bundle.CREATOR);
                    N.recycle();
                    if (bundle3 == null) {
                        n0 n0Var2 = f1Var4.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e7) {
                    n0 n0Var3 = f1Var4.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.b(e7.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                d1 d1Var2 = f1Var4.f22746g;
                f1.m(d1Var2);
                d1Var2.j();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                n1 n1Var = n1.UNINITIALIZED;
                f1 f1Var5 = (f1) this.f23165c;
                s1 s1Var = (s1) this.f23164b;
                d1 d1Var3 = f1Var5.f22746g;
                n0 n0Var4 = f1Var5.f22745f;
                v0 v0Var = f1Var5.f22744e;
                v3 v3Var3 = f1Var5.f22748i;
                f1.m(d1Var3);
                d1Var3.j();
                e eVar = f1Var5.f22743d;
                ((f1) eVar.f3328a).getClass();
                m mVar = new m(f1Var5);
                mVar.m();
                f1Var5.f22756s = mVar;
                zzdd zzddVar2 = s1Var.f23053d;
                f0 f0Var = new f0(f1Var5, s1Var.f23052c, zzddVar2 == null ? 0L : zzddVar2.f5383a);
                f0Var.l();
                f1Var5.f22757t = f0Var;
                h0 h0Var = new h0(f1Var5);
                h0Var.l();
                f1Var5.q = h0Var;
                y2 y2Var = new y2(f1Var5);
                y2Var.l();
                f1Var5.f22755r = y2Var;
                boolean z7 = v3Var3.f22870b;
                f1 f1Var6 = (f1) v3Var3.f3328a;
                if (z7) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                v3Var3.j();
                SecureRandom secureRandom = new SecureRandom();
                long nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    nextLong = secureRandom.nextLong();
                    if (nextLong == 0) {
                        n0 n0Var5 = ((f1) v3Var3.f3328a).f22745f;
                        f1.m(n0Var5);
                        j = 0;
                        n0Var5.f22906i.a("Utils falling back to Random for random id");
                        v3Var3.f23152d.set(nextLong);
                        f1Var6.C.incrementAndGet();
                        v3Var3.f22870b = true;
                        if (!v0Var.f22870b) {
                            throw new IllegalStateException("Can't initialize twice");
                        }
                        SharedPreferences sharedPreferences = ((f1) v0Var.f3328a).f22740a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                        v0Var.f23124c = sharedPreferences;
                        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
                        v0Var.f23137r = z10;
                        if (!z10) {
                            SharedPreferences.Editor edit = v0Var.f23124c.edit();
                            edit.putBoolean("has_been_opened", true);
                            edit.apply();
                        }
                        v0Var.f23126e = new g3.d(v0Var, Math.max(0L, ((Long) x.f23182d.a(null)).longValue()));
                        ((f1) v0Var.f3328a).C.incrementAndGet();
                        v0Var.f22870b = true;
                        f0 f0Var2 = f1Var5.f22757t;
                        if (f0Var2.f23263b) {
                            throw new IllegalStateException("Can't initialize twice");
                        }
                        f1 f1Var7 = (f1) f0Var2.f3328a;
                        n0 n0Var6 = f1Var7.f22745f;
                        n0 n0Var7 = f1Var7.f22745f;
                        f1.m(n0Var6);
                        n0Var6.f22910n.c(Long.valueOf(f0Var2.j), Long.valueOf(f0Var2.f22733i), "sdkVersion bundled with app, dynamiteVersion");
                        Context context = f1Var7.f22740a;
                        String packageName = context.getPackageName();
                        PackageManager packageManager2 = context.getPackageManager();
                        String str4 = "";
                        String str5 = "Unknown";
                        String str6 = "unknown";
                        if (packageManager2 == null) {
                            f1.m(n0Var7);
                            str = "Can't initialize twice";
                            zzddVar = zzddVar2;
                            n0Var7.f22903f.b(n0.r(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                        } else {
                            str = "Can't initialize twice";
                            zzddVar = zzddVar2;
                            try {
                                str6 = packageManager2.getInstallerPackageName(packageName);
                            } catch (IllegalArgumentException unused) {
                                f1.m(n0Var7);
                                n0Var7.f22903f.b(n0.r(packageName), "Error retrieving app installer package name. appId");
                            }
                            String str7 = str6;
                            if (str7 == null) {
                                str7 = "manual_install";
                            } else if ("com.android.vending".equals(str7)) {
                                str6 = "";
                                packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                                if (packageInfo != null) {
                                    CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                                    str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                                    try {
                                        str3 = packageInfo.versionName;
                                        try {
                                            i5 = packageInfo.versionCode;
                                            packageManager = packageManager2;
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            str5 = str3;
                                            f1.m(n0Var7);
                                            packageManager = packageManager2;
                                            n0Var7.f22903f.c(n0.r(packageName), str2, "Error retrieving package info. appId, appName");
                                            i5 = Integer.MIN_VALUE;
                                            str3 = str5;
                                            String str8 = str6;
                                            f0Var2.f22727c = packageName;
                                            f0Var2.f22730f = str8;
                                            f0Var2.f22728d = str3;
                                            f0Var2.f22729e = i5;
                                            f0Var2.f22731g = str2;
                                            f0Var2.f22732h = 0L;
                                            g10 = f1Var7.g();
                                            if (g10 == 0) {
                                            }
                                            f0Var2.f22737n = "";
                                            b10 = r1.b(context, f1Var7.f22754p);
                                            if (!TextUtils.isEmpty(b10)) {
                                            }
                                            f0Var2.f22737n = str4;
                                            if (g10 == 0) {
                                            }
                                            list = null;
                                            f0Var2.f22734k = null;
                                            e eVar2 = f1Var7.f22743d;
                                            f1 f1Var8 = (f1) eVar2.f3328a;
                                            g6.v.e("analytics.safelisted_events");
                                            u10 = eVar2.u();
                                            if (u10 == null) {
                                            }
                                            valueOf = null;
                                            if (valueOf != null) {
                                            }
                                            if (list != null) {
                                            }
                                            f0Var2.f22734k = list;
                                            if (packageManager != null) {
                                            }
                                            ((f1) f0Var2.f3328a).C.incrementAndGet();
                                            f0Var2.f23263b = true;
                                            i2Var = new i2(f1Var5);
                                            i2Var.l();
                                            f1Var5.f22758u = i2Var;
                                            if (i2Var.f23263b) {
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                    String str82 = str6;
                                    f0Var2.f22727c = packageName;
                                    f0Var2.f22730f = str82;
                                    f0Var2.f22728d = str3;
                                    f0Var2.f22729e = i5;
                                    f0Var2.f22731g = str2;
                                    f0Var2.f22732h = 0L;
                                    g10 = f1Var7.g();
                                    if (g10 == 0) {
                                        f1.m(n0Var7);
                                        n0Var7.f22910n.a("App measurement collection enabled");
                                    } else if (g10 == 1) {
                                        f1.m(n0Var7);
                                        n0Var7.f22908l.a("App measurement deactivated via the manifest");
                                    } else if (g10 == 3) {
                                        f1.m(n0Var7);
                                        n0Var7.f22908l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                    } else if (g10 == 4) {
                                        f1.m(n0Var7);
                                        n0Var7.f22908l.a("App measurement disabled via the manifest");
                                    } else if (g10 == 6) {
                                        f1.m(n0Var7);
                                        n0Var7.f22907k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                    } else if (g10 == 7) {
                                        f1.m(n0Var7);
                                        n0Var7.f22908l.a("App measurement disabled via the global data collection setting");
                                    } else if (g10 != 8) {
                                        f1.m(n0Var7);
                                        n0Var7.f22908l.a("App measurement disabled");
                                        f1.m(n0Var7);
                                        n0Var7.f22904g.a("Invalid scion state in identity");
                                    } else {
                                        f1.m(n0Var7);
                                        n0Var7.f22908l.a("App measurement disabled due to denied storage consent");
                                    }
                                    f0Var2.f22737n = "";
                                    b10 = r1.b(context, f1Var7.f22754p);
                                    if (!TextUtils.isEmpty(b10)) {
                                        str4 = b10;
                                    }
                                    f0Var2.f22737n = str4;
                                    if (g10 == 0) {
                                        f1.m(n0Var7);
                                        n0Var7.f22910n.c(f0Var2.f22727c, f0Var2.f22737n, "App measurement enabled for app package, google app id");
                                    }
                                    list = null;
                                    f0Var2.f22734k = null;
                                    e eVar22 = f1Var7.f22743d;
                                    f1 f1Var82 = (f1) eVar22.f3328a;
                                    g6.v.e("analytics.safelisted_events");
                                    u10 = eVar22.u();
                                    if (u10 == null) {
                                        n0 n0Var8 = f1Var82.f22745f;
                                        f1.m(n0Var8);
                                        n0Var8.f22903f.a("Failed to load metadata: Metadata bundle is null");
                                    } else if (u10.containsKey("analytics.safelisted_events")) {
                                        valueOf = Integer.valueOf(u10.getInt("analytics.safelisted_events"));
                                        if (valueOf != null) {
                                            try {
                                                String[] stringArray = f1Var82.f22740a.getResources().getStringArray(valueOf.intValue());
                                                if (stringArray != null) {
                                                    list = Arrays.asList(stringArray);
                                                }
                                            } catch (Resources.NotFoundException e9) {
                                                n0 n0Var9 = f1Var82.f22745f;
                                                f1.m(n0Var9);
                                                n0Var9.f22903f.b(e9, "Failed to load string array from metadata: resource not found");
                                            }
                                        }
                                        if (list != null) {
                                            if (list.isEmpty()) {
                                                f1.m(n0Var7);
                                                n0Var7.f22907k.a("Safelisted event list is empty. Ignoring");
                                            } else {
                                                for (String str9 : list) {
                                                    v3 v3Var4 = f1Var7.f22748i;
                                                    f1.k(v3Var4);
                                                    if (!v3Var4.m0("safelisted event", str9)) {
                                                    }
                                                }
                                            }
                                            if (packageManager != null) {
                                                f0Var2.f22736m = s6.a.p(context) ? 1 : 0;
                                            } else {
                                                f0Var2.f22736m = 0;
                                            }
                                            ((f1) f0Var2.f3328a).C.incrementAndGet();
                                            f0Var2.f23263b = true;
                                            i2Var = new i2(f1Var5);
                                            i2Var.l();
                                            f1Var5.f22758u = i2Var;
                                            if (i2Var.f23263b) {
                                                throw new IllegalStateException(str);
                                            }
                                            i2Var.f22810c = (JobScheduler) ((f1) i2Var.f3328a).f22740a.getSystemService("jobscheduler");
                                            ((f1) i2Var.f3328a).C.incrementAndGet();
                                            i2Var.f23263b = true;
                                            f1.m(n0Var4);
                                            l0 l0Var3 = n0Var4.f22909m;
                                            l0 l0Var4 = n0Var4.f22908l;
                                            l0 l0Var5 = n0Var4.f22910n;
                                            l0 l0Var6 = n0Var4.f22903f;
                                            eVar.o();
                                            l0Var4.b(133005L, "App measurement initialized, version");
                                            f1.m(n0Var4);
                                            l0Var4.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                            String p10 = f0Var.p();
                                            if (v3Var3.L(p10, eVar.f22690c)) {
                                                f1.m(n0Var4);
                                                l0Var4.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                            } else {
                                                f1.m(n0Var4);
                                                l0Var4.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(p10)));
                                            }
                                            f1.m(n0Var4);
                                            l0Var3.a("Debug-level message logging enabled");
                                            int i10 = f1Var5.A;
                                            AtomicInteger atomicInteger = f1Var5.C;
                                            if (i10 != atomicInteger.get()) {
                                                f1.m(n0Var4);
                                                l0Var6.c(Integer.valueOf(f1Var5.A), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                            }
                                            f1Var5.f22759v = true;
                                            long j6 = f1Var5.D;
                                            p1 p1Var = p1.ANALYTICS_STORAGE;
                                            final e2 e2Var = f1Var5.f22751m;
                                            d1 d1Var4 = f1Var5.f22746g;
                                            f1.m(d1Var4);
                                            d1Var4.j();
                                            f1.j(f1Var5.f22758u);
                                            int o3 = f1Var5.f22758u.o();
                                            o8.a();
                                            boolean t3 = eVar.t(null, x.R0);
                                            boolean z11 = o3 == 2;
                                            if (t3) {
                                                v3Var3.j();
                                                break;
                                            }
                                            if (z11) {
                                                z11 = true;
                                                v3Var3.j();
                                                IntentFilter intentFilter = new IntentFilter();
                                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                boolean z12 = z11;
                                                d0.c.d(f1Var6.f22740a, new androidx.appcompat.app.g0(f1Var6), intentFilter);
                                                n0 n0Var10 = f1Var6.f22745f;
                                                f1.m(n0Var10);
                                                n0Var10.f22909m.a("Registered app receiver");
                                                if (z12) {
                                                    f1.j(f1Var5.f22758u);
                                                    f1Var5.f22758u.n(((Long) x.C.a(null)).longValue());
                                                }
                                            }
                                            com.android.billingclient.api.i iVar2 = v0Var.f23128g;
                                            q1 q = v0Var.q();
                                            int i11 = q.f22966b;
                                            n1 y11 = eVar.y("google_analytics_default_allow_ad_storage", false);
                                            n1 y12 = eVar.y("google_analytics_default_allow_analytics_storage", false);
                                            if (y11 == n1Var && y12 == n1Var) {
                                                l0Var = l0Var6;
                                                f1Var = f1Var5;
                                                v3Var = v3Var3;
                                            } else {
                                                f1Var = f1Var5;
                                                l0Var = l0Var6;
                                                v3Var = v3Var3;
                                                if (q1.l(-10, v0Var.n().getInt("consent_source", 100))) {
                                                    EnumMap enumMap = new EnumMap(p1.class);
                                                    enumMap.put((EnumMap) p1.AD_STORAGE, (p1) y11);
                                                    enumMap.put((EnumMap) p1Var, (p1) y12);
                                                    q1Var = new q1(enumMap, -10);
                                                    z5 = false;
                                                    if (q1Var == null) {
                                                        f1.l(e2Var);
                                                        e2Var.F(q1Var, true);
                                                        q1Var2 = q1Var;
                                                    } else {
                                                        q1Var2 = q;
                                                    }
                                                    f1.l(e2Var);
                                                    f1Var2 = (f1) e2Var.f3328a;
                                                    e2Var.n(q1Var2);
                                                    v0Var.j();
                                                    int i12 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22861a;
                                                    y5 = eVar.y("google_analytics_default_allow_ad_personalization_signals", true);
                                                    if (y5 != n1Var) {
                                                        f1.m(n0Var4);
                                                        l0Var5.b(y5, "Default ad personalization consent from Manifest");
                                                    }
                                                    y10 = eVar.y("google_analytics_default_allow_ad_user_data", true);
                                                    if (y10 == n1Var && q1.l(-10, i12)) {
                                                        f1.l(e2Var);
                                                        EnumMap enumMap2 = new EnumMap(p1.class);
                                                        enumMap2.put((EnumMap) p1.AD_USER_DATA, (p1) y10);
                                                        e2Var.E(new l(enumMap2, -10, (Boolean) null, (String) null), true);
                                                    } else if (TextUtils.isEmpty(f1Var.r().q()) && (i12 == 0 || i12 == 30)) {
                                                        f1.l(e2Var);
                                                        e2Var.E(new l((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                    } else if (TextUtils.isEmpty(f1Var.r().q()) && zzddVar != null && (bundle = zzddVar.f5386d) != null && q1.l(30, i12)) {
                                                        l c2 = l.c(30, bundle);
                                                        it = c2.f22865e.values().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((n1) it.next()) != n1Var) {
                                                                    f1.l(e2Var);
                                                                    e2Var.E(c2, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v5 = eVar.v("google_analytics_tcf_data_enabled");
                                                    if (v5 != null || v5.booleanValue()) {
                                                        f1.m(n0Var4);
                                                        l0Var3.a("TCF client enabled.");
                                                        f1.l(e2Var);
                                                        e2Var.j();
                                                        n0 n0Var11 = f1Var2.f22745f;
                                                        f1.m(n0Var11);
                                                        n0Var11.f22909m.a("Register tcfPrefChangeListener.");
                                                        if (e2Var.f22712u == null) {
                                                            e2Var.f22713v = new u1(e2Var, f1Var2, 2);
                                                            e2Var.f22712u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: s7.d2
                                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str10) {
                                                                    e2 e2Var2 = e2.this;
                                                                    f1 f1Var9 = (f1) e2Var2.f3328a;
                                                                    e eVar3 = f1Var9.f22743d;
                                                                    n0 n0Var12 = f1Var9.f22745f;
                                                                    if (!eVar3.t(null, x.f23175a1)) {
                                                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                                                            f1.m(n0Var12);
                                                                            n0Var12.f22910n.a("IABTCF_TCString change picked up in listener.");
                                                                            u1 u1Var = e2Var2.f22713v;
                                                                            g6.v.h(u1Var);
                                                                            u1Var.b(500L);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                        f1.m(n0Var12);
                                                                        n0Var12.f22910n.a("IABTCF_TCString change picked up in listener.");
                                                                        u1 u1Var2 = e2Var2.f22713v;
                                                                        g6.v.h(u1Var2);
                                                                        u1Var2.b(500L);
                                                                    }
                                                                }
                                                            };
                                                        }
                                                        v0 v0Var2 = f1Var2.f22744e;
                                                        f1.k(v0Var2);
                                                        v0Var2.o().registerOnSharedPreferenceChangeListener(e2Var.f22712u);
                                                        f1.l(e2Var);
                                                        e2Var.p();
                                                    }
                                                    sVar = v0Var.f23127f;
                                                    if (sVar.a() == j) {
                                                        f1.m(n0Var4);
                                                        l0Var5.b(Long.valueOf(j6), "Persisting first open");
                                                        sVar.b(j6);
                                                    }
                                                    f1.l(e2Var);
                                                    x0Var = e2Var.f22709r;
                                                    if (x0Var.e() && x0Var.d()) {
                                                        v0 v0Var3 = x0Var.f23230b.f22744e;
                                                        f1.k(v0Var3);
                                                        v0Var3.f23142w.i(null);
                                                    }
                                                    if (f1Var.h()) {
                                                        if (f1Var.d()) {
                                                            v3Var2 = v3Var;
                                                            if (v3Var2.I("android.permission.INTERNET")) {
                                                                l0Var2 = l0Var;
                                                            } else {
                                                                f1.m(n0Var4);
                                                                l0Var2 = l0Var;
                                                                l0Var2.a("App is missing INTERNET permission");
                                                            }
                                                            if (!v3Var2.I("android.permission.ACCESS_NETWORK_STATE")) {
                                                                f1.m(n0Var4);
                                                                l0Var2.a("App is missing ACCESS_NETWORK_STATE permission");
                                                            }
                                                            f1Var3 = f1Var;
                                                            Context context2 = f1Var3.f22740a;
                                                            if (!s6.c.a(context2).c() && !eVar.m()) {
                                                                if (!v3.b0(context2)) {
                                                                    f1.m(n0Var4);
                                                                    l0Var2.a("AppMeasurementReceiver not registered/enabled");
                                                                }
                                                                if (!v3.C(context2)) {
                                                                    f1.m(n0Var4);
                                                                    l0Var2.a("AppMeasurementService not registered/enabled");
                                                                }
                                                            }
                                                            f1.m(n0Var4);
                                                            l0Var2.a("Uploading is not possible. App measurement disabled");
                                                        } else {
                                                            f1Var3 = f1Var;
                                                            v3Var2 = v3Var;
                                                        }
                                                        n0Var = n0Var4;
                                                    } else {
                                                        f1Var3 = f1Var;
                                                        v3Var2 = v3Var;
                                                        if (TextUtils.isEmpty(f1Var3.r().q())) {
                                                            iVar = iVar2;
                                                        } else {
                                                            String q3 = f1Var3.r().q();
                                                            v0Var.j();
                                                            String string = v0Var.n().getString("gmp_app_id", null);
                                                            boolean isEmpty = TextUtils.isEmpty(q3);
                                                            boolean isEmpty2 = TextUtils.isEmpty(string);
                                                            if (!isEmpty && !isEmpty2) {
                                                                g6.v.h(q3);
                                                                if (!q3.equals(string)) {
                                                                    f1.m(n0Var4);
                                                                    l0Var4.a("Rechecking which service to use due to a GMP App Id change");
                                                                    v0Var.j();
                                                                    v0Var.j();
                                                                    Boolean valueOf3 = v0Var.n().contains("measurement_enabled") ? Boolean.valueOf(v0Var.n().getBoolean("measurement_enabled", true)) : null;
                                                                    SharedPreferences.Editor edit2 = v0Var.n().edit();
                                                                    edit2.clear();
                                                                    edit2.apply();
                                                                    if (valueOf3 != null) {
                                                                        v0Var.j();
                                                                        SharedPreferences.Editor edit3 = v0Var.n().edit();
                                                                        edit3.putBoolean("measurement_enabled", valueOf3.booleanValue());
                                                                        edit3.apply();
                                                                    }
                                                                    f1Var3.o().n();
                                                                    f1Var3.f22755r.r();
                                                                    f1Var3.f22755r.p();
                                                                    sVar.b(j6);
                                                                    iVar = iVar2;
                                                                    iVar.i(null);
                                                                    String q10 = f1Var3.r().q();
                                                                    v0Var.j();
                                                                    SharedPreferences.Editor edit4 = v0Var.n().edit();
                                                                    edit4.putString("gmp_app_id", q10);
                                                                    edit4.apply();
                                                                }
                                                            }
                                                            iVar = iVar2;
                                                            String q102 = f1Var3.r().q();
                                                            v0Var.j();
                                                            SharedPreferences.Editor edit42 = v0Var.n().edit();
                                                            edit42.putString("gmp_app_id", q102);
                                                            edit42.apply();
                                                        }
                                                        if (!v0Var.q().i(p1Var)) {
                                                            iVar.i(null);
                                                        }
                                                        f1.l(e2Var);
                                                        e2Var.f22700g.set(iVar.h());
                                                        try {
                                                            f1Var6.f22740a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                        } catch (ClassNotFoundException unused4) {
                                                            com.android.billingclient.api.i iVar3 = v0Var.f23141v;
                                                            if (!TextUtils.isEmpty(iVar3.h())) {
                                                                f1.m(n0Var4);
                                                                n0Var = n0Var4;
                                                                n0Var.f22906i.a("Remote config removed with active feature rollouts");
                                                                iVar3.i(null);
                                                            }
                                                        }
                                                        n0Var = n0Var4;
                                                        if (!TextUtils.isEmpty(f1Var3.r().q())) {
                                                            boolean d10 = f1Var3.d();
                                                            SharedPreferences sharedPreferences2 = v0Var.f23124c;
                                                            if (!(sharedPreferences2 == null ? z5 : sharedPreferences2.contains("deferred_analytics_collection")) && !eVar.w()) {
                                                                v0Var.s(!d10);
                                                            }
                                                            if (d10) {
                                                                f1.l(e2Var);
                                                                e2Var.v();
                                                            }
                                                            f3 f3Var = f1Var3.f22747h;
                                                            f1.l(f3Var);
                                                            f3Var.f22766e.j();
                                                            f1Var3.p().n(new AtomicReference());
                                                            f1Var3.p().o(v0Var.f23144y.R());
                                                        }
                                                    }
                                                    o8.a();
                                                    if (eVar.t(null, x.R0)) {
                                                        v3Var2.j();
                                                        if (v3Var2.G() == 1 ? true : z5) {
                                                            long intValue = ((Integer) x.f23227y0.a(null)).intValue();
                                                            long nextInt = new Random().nextInt(5000);
                                                            f1Var3.f22749k.getClass();
                                                            long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                            if (max > 500) {
                                                                f1.m(n0Var);
                                                                l0Var5.b(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                            }
                                                            f1.l(e2Var);
                                                            e2Var.j();
                                                            if (e2Var.f22704l == null) {
                                                                e2Var.f22704l = new u1(e2Var, f1Var2, 0);
                                                            }
                                                            e2Var.f22704l.b(max);
                                                        }
                                                    }
                                                    v0Var.f23135o.b(true);
                                                    return;
                                                }
                                            }
                                            if (TextUtils.isEmpty(f1Var.r().q()) || !(i11 == 0 || i11 == 30 || i11 == 10 || i11 == 40)) {
                                                z5 = false;
                                            } else {
                                                f1.l(e2Var);
                                                z5 = false;
                                                e2Var.F(new q1(-10), false);
                                            }
                                            q1Var = null;
                                            if (q1Var == null) {
                                            }
                                            f1.l(e2Var);
                                            f1Var2 = (f1) e2Var.f3328a;
                                            e2Var.n(q1Var2);
                                            v0Var.j();
                                            int i122 = l.b(v0Var.n().getString("dma_consent_settings", null)).f22861a;
                                            y5 = eVar.y("google_analytics_default_allow_ad_personalization_signals", true);
                                            if (y5 != n1Var) {
                                            }
                                            y10 = eVar.y("google_analytics_default_allow_ad_user_data", true);
                                            if (y10 == n1Var) {
                                            }
                                            if (TextUtils.isEmpty(f1Var.r().q())) {
                                            }
                                            if (TextUtils.isEmpty(f1Var.r().q())) {
                                                l c22 = l.c(30, bundle);
                                                it = c22.f22865e.values().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                            }
                                            v5 = eVar.v("google_analytics_tcf_data_enabled");
                                            if (v5 != null) {
                                            }
                                            f1.m(n0Var4);
                                            l0Var3.a("TCF client enabled.");
                                            f1.l(e2Var);
                                            e2Var.j();
                                            n0 n0Var112 = f1Var2.f22745f;
                                            f1.m(n0Var112);
                                            n0Var112.f22909m.a("Register tcfPrefChangeListener.");
                                            if (e2Var.f22712u == null) {
                                            }
                                            v0 v0Var22 = f1Var2.f22744e;
                                            f1.k(v0Var22);
                                            v0Var22.o().registerOnSharedPreferenceChangeListener(e2Var.f22712u);
                                            f1.l(e2Var);
                                            e2Var.p();
                                            sVar = v0Var.f23127f;
                                            if (sVar.a() == j) {
                                            }
                                            f1.l(e2Var);
                                            x0Var = e2Var.f22709r;
                                            if (x0Var.e()) {
                                                v0 v0Var32 = x0Var.f23230b.f22744e;
                                                f1.k(v0Var32);
                                                v0Var32.f23142w.i(null);
                                            }
                                            if (f1Var.h()) {
                                            }
                                            o8.a();
                                            if (eVar.t(null, x.R0)) {
                                            }
                                            v0Var.f23135o.b(true);
                                            return;
                                        }
                                        f0Var2.f22734k = list;
                                        if (packageManager != null) {
                                        }
                                        ((f1) f0Var2.f3328a).C.incrementAndGet();
                                        f0Var2.f23263b = true;
                                        i2Var = new i2(f1Var5);
                                        i2Var.l();
                                        f1Var5.f22758u = i2Var;
                                        if (i2Var.f23263b) {
                                        }
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    if (list != null) {
                                    }
                                    f0Var2.f22734k = list;
                                    if (packageManager != null) {
                                    }
                                    ((f1) f0Var2.f3328a).C.incrementAndGet();
                                    f0Var2.f23263b = true;
                                    i2Var = new i2(f1Var5);
                                    i2Var.l();
                                    f1Var5.f22758u = i2Var;
                                    if (i2Var.f23263b) {
                                    }
                                }
                            }
                            str6 = str7;
                            packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo != null) {
                            }
                        }
                        packageManager = packageManager2;
                        i5 = Integer.MIN_VALUE;
                        str2 = "Unknown";
                        str3 = str2;
                        String str822 = str6;
                        f0Var2.f22727c = packageName;
                        f0Var2.f22730f = str822;
                        f0Var2.f22728d = str3;
                        f0Var2.f22729e = i5;
                        f0Var2.f22731g = str2;
                        f0Var2.f22732h = 0L;
                        g10 = f1Var7.g();
                        if (g10 == 0) {
                        }
                        f0Var2.f22737n = "";
                        b10 = r1.b(context, f1Var7.f22754p);
                        if (!TextUtils.isEmpty(b10)) {
                        }
                        f0Var2.f22737n = str4;
                        if (g10 == 0) {
                        }
                        list = null;
                        f0Var2.f22734k = null;
                        e eVar222 = f1Var7.f22743d;
                        f1 f1Var822 = (f1) eVar222.f3328a;
                        g6.v.e("analytics.safelisted_events");
                        u10 = eVar222.u();
                        if (u10 == null) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        if (list != null) {
                        }
                        f0Var2.f22734k = list;
                        if (packageManager != null) {
                        }
                        ((f1) f0Var2.f3328a).C.incrementAndGet();
                        f0Var2.f23263b = true;
                        i2Var = new i2(f1Var5);
                        i2Var.l();
                        f1Var5.f22758u = i2Var;
                        if (i2Var.f23263b) {
                        }
                    }
                }
                j = 0;
                v3Var3.f23152d.set(nextLong);
                f1Var6.C.incrementAndGet();
                v3Var3.f22870b = true;
                if (!v0Var.f22870b) {
                }
                break;
            case 2:
                r3 r3Var = ((k1) this.f23165c).f22848a;
                r3Var.B();
                zzah zzahVar = (zzah) this.f23164b;
                if (zzahVar.f5787c.c() == null) {
                    r3Var.getClass();
                    String str10 = zzahVar.f5785a;
                    g6.v.h(str10);
                    zzr Q = r3Var.Q(str10);
                    if (Q != null) {
                        r3Var.a0(zzahVar, Q);
                        return;
                    }
                    return;
                }
                r3Var.getClass();
                String str11 = zzahVar.f5785a;
                g6.v.h(str11);
                zzr Q2 = r3Var.Q(str11);
                if (Q2 != null) {
                    r3Var.Z(zzahVar, Q2);
                    return;
                }
                return;
            case 3:
                com.google.android.gms.internal.measurement.n0 n0Var12 = (com.google.android.gms.internal.measurement.n0) this.f23164b;
                e2 e2Var2 = (e2) this.f23165c;
                f1 f1Var9 = (f1) e2Var2.f3328a;
                f1 f1Var10 = (f1) e2Var2.f3328a;
                f3 f3Var2 = f1Var9.f22747h;
                f1.l(f3Var2);
                f1 f1Var11 = (f1) f3Var2.f3328a;
                v0 v0Var4 = f1Var11.f22744e;
                f1.k(v0Var4);
                if (v0Var4.q().i(p1.ANALYTICS_STORAGE)) {
                    f1.k(v0Var4);
                    io.sentry.android.core.s sVar2 = v0Var4.q;
                    f1Var11.f22749k.getClass();
                    if (!v0Var4.t(System.currentTimeMillis()) && sVar2.a() != 0) {
                        valueOf2 = Long.valueOf(sVar2.a());
                        if (valueOf2 == null) {
                            v3 v3Var5 = f1Var10.f22748i;
                            f1.k(v3Var5);
                            v3Var5.U(n0Var12, valueOf2.longValue());
                            return;
                        } else {
                            try {
                                n0Var12.b(null);
                                return;
                            } catch (RemoteException e10) {
                                n0 n0Var13 = f1Var10.f22745f;
                                f1.m(n0Var13);
                                n0Var13.f22903f.b(e10, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                } else {
                    n0 n0Var14 = f1Var11.f22745f;
                    f1.m(n0Var14);
                    n0Var14.f22907k.a("Analytics storage consent denied; will not get session id");
                }
                valueOf2 = null;
                if (valueOf2 == null) {
                }
                break;
            case 4:
                ((e2) this.f23165c).A((Boolean) this.f23164b, true);
                return;
            case 5:
                e2 e2Var3 = (e2) this.f23165c;
                f1 f1Var12 = (f1) e2Var3.f3328a;
                v0 v0Var5 = f1Var12.f22744e;
                n0 n0Var15 = f1Var12.f22745f;
                f1.k(v0Var5);
                v0Var5.j();
                v0Var5.j();
                l b11 = l.b(v0Var5.n().getString("dma_consent_settings", null));
                l lVar = (l) this.f23164b;
                int i13 = lVar.f22861a;
                if (!q1.l(i13, b11.f22861a)) {
                    f1.m(n0Var15);
                    n0Var15.f22908l.b(Integer.valueOf(i13), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor edit5 = v0Var5.n().edit();
                edit5.putString("dma_consent_settings", lVar.f22862b);
                edit5.apply();
                f1.m(n0Var15);
                n0Var15.f22910n.b(lVar, "Setting DMA consent(FE)");
                f1 f1Var13 = (f1) e2Var3.f3328a;
                if (f1Var13.p().t()) {
                    y2 p11 = f1Var13.p();
                    p11.j();
                    p11.k();
                    p11.x(new w2(p11, 1));
                    return;
                }
                y2 p12 = f1Var13.p();
                p12.j();
                p12.k();
                if (p12.s()) {
                    p12.x(new t2(p12, p12.z(false)));
                    return;
                }
                return;
            case 6:
                e2 e2Var4 = ((AppMeasurementDynamiteService) this.f23165c).f5780a.f22751m;
                f1.l(e2Var4);
                x5.h hVar = (x5.h) this.f23164b;
                e2Var4.j();
                e2Var4.k();
                x5.h hVar2 = e2Var4.f22697d;
                if (hVar != hVar2) {
                    g6.v.j("EventInterceptor already set.", hVar2 == null);
                }
                e2Var4.f22697d = hVar;
                return;
            case 7:
                f1 f1Var14 = (f1) ((e2) this.f23164b).f3328a;
                f0 r5 = f1Var14.r();
                String str12 = (String) this.f23165c;
                String str13 = r5.q;
                boolean z13 = false;
                if (str13 != null && !str13.equals(str12)) {
                    z13 = true;
                }
                r5.q = str12;
                if (z13) {
                    f1Var14.r().o();
                    return;
                }
                return;
            case 8:
                y2 y2Var2 = (y2) this.f23165c;
                a0 a0Var2 = y2Var2.f23257d;
                f1 f1Var15 = (f1) y2Var2.f3328a;
                if (a0Var2 == null) {
                    n0 n0Var16 = f1Var15.f22745f;
                    f1.m(n0Var16);
                    n0Var16.f22903f.a("Failed to send current screen to service");
                    return;
                }
                try {
                    l2 l2Var = (l2) this.f23164b;
                    if (l2Var == null) {
                        a0Var2.j(0L, null, null, f1Var15.f22740a.getPackageName());
                    } else {
                        a0Var2.j(l2Var.f22873c, l2Var.f22871a, l2Var.f22872b, f1Var15.f22740a.getPackageName());
                    }
                    y2Var2.w();
                    return;
                } catch (RemoteException e11) {
                    n0 n0Var17 = f1Var15.f22745f;
                    f1.m(n0Var17);
                    n0Var17.f22903f.b(e11, "Failed to send current screen to the service");
                    return;
                }
            case 9:
                ((x2) this.f23165c).f23241c.u((ComponentName) this.f23164b);
                return;
            case 10:
                y2 y2Var3 = ((x2) this.f23165c).f23241c;
                y2Var3.f23257d = null;
                if (((ConnectionResult) this.f23164b).f4441b != 7777) {
                    y2Var3.y();
                    return;
                }
                if (y2Var3.f23260g == null) {
                    y2Var3.f23260g = Executors.newScheduledThreadPool(1);
                }
                y2Var3.f23260g.schedule(new androidx.core.widget.b(22, this), ((Long) x.f23174a0.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 11:
                r3 r3Var2 = (r3) this.f23164b;
                r3Var2.B();
                Runnable runnable = (Runnable) this.f23165c;
                r3Var2.b().j();
                if (r3Var2.f23001p == null) {
                    r3Var2.f23001p = new ArrayList();
                }
                r3Var2.f23001p.add(runnable);
                r3Var2.q();
                return;
            case 12:
                r7.a aVar2 = (r7.a) this.f23164b;
                JobParameters jobParameters = (JobParameters) this.f23165c;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((b3) ((Service) aVar2.f22318b)).c(jobParameters);
                return;
            case 13:
                w1.a aVar3 = (w1.a) this.f23165c;
                Object obj = this.f23164b;
                if (aVar3.f24949c.get()) {
                    x5.c cVar = aVar3.f24951e;
                    if (cVar.f25402h == aVar3) {
                        SystemClock.uptimeMillis();
                        cVar.f25402h = null;
                        cVar.b();
                    }
                } else {
                    x5.c cVar2 = aVar3.f24951e;
                    if (cVar2.f25401g != aVar3) {
                        if (cVar2.f25402h == aVar3) {
                            SystemClock.uptimeMillis();
                            cVar2.f25402h = null;
                            cVar2.b();
                        }
                    } else if (!cVar2.f25397c) {
                        SystemClock.uptimeMillis();
                        cVar2.f25401g = null;
                        v1.b bVar = cVar2.f25395a;
                        if (bVar != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                bVar.j(obj);
                            } else {
                                bVar.h(obj);
                            }
                        }
                    }
                }
                aVar3.f24948b = 3;
                return;
            case 14:
                w7.j jVar = (w7.j) this.f23165c;
                Task task = (Task) this.f23164b;
                if (task.j()) {
                    jVar.f24993d.o();
                    return;
                }
                try {
                    jVar.f24993d.m(jVar.f24992c.f(task));
                    return;
                } catch (w7.e e12) {
                    if (e12.getCause() instanceof Exception) {
                        jVar.f24993d.n((Exception) e12.getCause());
                        return;
                    } else {
                        jVar.f24993d.n(e12);
                        return;
                    }
                } catch (Exception e13) {
                    jVar.f24993d.n(e13);
                    return;
                }
            case 15:
                w7.j jVar2 = (w7.j) this.f23165c;
                try {
                    Task task2 = (Task) jVar2.f24992c.f((Task) this.f23164b);
                    if (task2 == null) {
                        jVar2.c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    g6.p pVar = w7.h.f24981b;
                    task2.e(pVar, jVar2);
                    task2.c(pVar, jVar2);
                    task2.a(pVar, jVar2);
                    return;
                } catch (w7.e e14) {
                    if (e14.getCause() instanceof Exception) {
                        jVar2.f24993d.n((Exception) e14.getCause());
                        return;
                    } else {
                        jVar2.f24993d.n(e14);
                        return;
                    }
                } catch (Exception e15) {
                    jVar2.f24993d.n(e15);
                    return;
                }
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            case 18:
                c();
                return;
            case 19:
                d();
                return;
            default:
                w7.m mVar2 = (w7.m) this.f23164b;
                try {
                    mVar2.m(((Callable) this.f23165c).call());
                    return;
                } catch (Exception e16) {
                    mVar2.n(e16);
                    return;
                } catch (Throwable th2) {
                    mVar2.n(new RuntimeException(th2));
                    return;
                }
        }
    }

    public /* synthetic */ w0(int i5, Object obj, Object obj2, boolean z5) {
        this.f23163a = i5;
        this.f23164b = obj;
        this.f23165c = obj2;
    }

    public w0(ca.a aVar, com.google.android.gms.internal.measurement.c0 c0Var, ca.a aVar2) {
        this.f23163a = 0;
        this.f23164b = c0Var;
        this.f23165c = aVar;
    }

    public w0(r7.a aVar, r3 r3Var, Runnable runnable) {
        this.f23163a = 11;
        this.f23164b = r3Var;
        this.f23165c = runnable;
    }

    public w0(e2 e2Var, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f23163a = 3;
        this.f23164b = n0Var;
        Objects.requireNonNull(e2Var);
        this.f23165c = e2Var;
    }

    public w0(y2 y2Var, l2 l2Var) {
        this.f23163a = 8;
        this.f23164b = l2Var;
        Objects.requireNonNull(y2Var);
        this.f23165c = y2Var;
    }
}
