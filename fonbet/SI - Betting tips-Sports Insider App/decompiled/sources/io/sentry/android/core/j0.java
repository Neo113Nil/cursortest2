package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.n6;
import io.sentry.protocol.DebugImage;
import io.sentry.t4;
import io.sentry.u4;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15759a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f15760b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f15761c;

    /* renamed from: d, reason: collision with root package name */
    public final u4 f15762d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.cache.g f15763e;

    /* renamed from: f, reason: collision with root package name */
    public final List f15764f = Collections.singletonList(new i0(this));

    public j0(MyApp myApp, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = myApp.getApplicationContext();
        this.f15759a = applicationContext != null ? applicationContext : myApp;
        this.f15760b = sentryAndroidOptions;
        this.f15761c = n0Var;
        this.f15763e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f15762d = new u4(new io.sentry.t(sentryAndroidOptions, 2));
    }

    public final String a() {
        SentryAndroidOptions sentryAndroidOptions = this.f15760b;
        try {
            return (String) sentryAndroidOptions.getRuntimeManager().b(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(25, this));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    public final Object b(b6 b6Var, String str, Class cls) {
        io.sentry.cache.g gVar = this.f15763e;
        if (gVar == null) {
            return null;
        }
        return gVar.m(b6Var, str, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0550 A[Catch: all -> 0x0565, TryCatch #1 {all -> 0x0565, blocks: (B:228:0x0548, B:230:0x0550, B:232:0x055e), top: B:227:0x0548 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05e9 A[Catch: all -> 0x0626, TryCatch #2 {all -> 0x0626, blocks: (B:262:0x05e1, B:264:0x05e9, B:266:0x05fd, B:267:0x0602, B:268:0x060a, B:270:0x0610), top: B:261:0x05e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04d8  */
    @Override // io.sentry.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t4 k(t4 t4Var, io.sentry.h0 h0Var) {
        i0 i0Var;
        i0 i0Var2;
        String str;
        File[] fileArr;
        io.sentry.protocol.d dVar;
        List list;
        io.sentry.hints.b bVar;
        io.sentry.protocol.a d10;
        PackageInfo f6;
        String str2;
        Map map;
        io.sentry.protocol.i0 i0Var3;
        g6.h0 h0Var2;
        com.android.billingclient.api.u0 u0Var;
        String str3;
        int i5;
        DisplayMetrics displayMetrics;
        io.sentry.protocol.d0 d0Var;
        ArrayList arrayList;
        Object b10 = h0Var.b("sentry:typeCheckHint");
        boolean z5 = b10 instanceof io.sentry.hints.b;
        int i10 = 0;
        SentryAndroidOptions sentryAndroidOptions = this.f15760b;
        if (!z5) {
            sentryAndroidOptions.getLogger().h(b5.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return t4Var;
        }
        io.sentry.hints.b bVar2 = (io.sentry.hints.b) b10;
        Iterator it = this.f15764f.iterator();
        while (true) {
            if (!it.hasNext()) {
                i0Var = null;
                break;
            }
            i0Var = (i0) it.next();
            i0Var.getClass();
            if (b10 instanceof io.sentry.hints.a) {
                break;
            }
        }
        if (i0Var != null) {
            boolean equals = bVar2 instanceof io.sentry.hints.a ? "anr_background".equals(((io.sentry.hints.a) bVar2).e()) : false;
            j0 j0Var = i0Var.f15633a;
            if (t4Var.f16462h == null) {
                t4Var.f16462h = "java";
            }
            com.android.billingclient.api.m mVar = t4Var.f17095t;
            if ((mVar == null ? null : mVar.f4046a) == null) {
                io.sentry.protocol.m mVar2 = new io.sentry.protocol.m();
                if (bVar2.a()) {
                    mVar2.f16855a = "AppExitInfo";
                } else {
                    mVar2.f16855a = "HistoricalAppExitInfo";
                }
                ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(equals ? "Background ANR" : "ANR", Thread.currentThread());
                com.android.billingclient.api.m mVar3 = t4Var.f17094s;
                ArrayList arrayList2 = mVar3 != null ? mVar3.f4046a : null;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        d0Var = (io.sentry.protocol.d0) it2.next();
                        String str4 = d0Var.f16762c;
                        if (str4 != null && str4.equals("main")) {
                            break;
                        }
                    }
                }
                d0Var = null;
                if (d0Var == null) {
                    d0Var = new io.sentry.protocol.d0();
                    d0Var.f16768i = new io.sentry.protocol.b0();
                }
                j0Var.f15762d.getClass();
                io.sentry.protocol.b0 b0Var = d0Var.f16768i;
                if (b0Var == null) {
                    arrayList = new ArrayList(0);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(u4.c(applicationNotResponding, mVar2, d0Var.f16760a, b0Var.f16749a, true));
                    arrayList = arrayList3;
                }
                t4Var.f17095t = new com.android.billingclient.api.m(arrayList);
            }
        }
        io.sentry.protocol.c cVar = t4Var.f16456b;
        io.sentry.protocol.o g10 = cVar.g();
        Context context = this.f15759a;
        cVar.r(q0.c(context, sentryAndroidOptions).f15824g);
        if (g10 != null) {
            String str5 = g10.f16869a;
            cVar.k(g10, (str5 == null || str5.isEmpty()) ? "os_1" : "os_" + str5.trim().toLowerCase(Locale.ROOT));
        }
        io.sentry.protocol.f e7 = cVar.e();
        n0 n0Var = this.f15761c;
        if (e7 == null) {
            io.sentry.protocol.f fVar = new io.sentry.protocol.f();
            fVar.f16777b = Build.MANUFACTURER;
            fVar.f16778c = Build.BRAND;
            fVar.f16779d = m0.c(sentryAndroidOptions.getLogger());
            fVar.f16780e = Build.MODEL;
            fVar.f16781f = Build.ID;
            fVar.f16782g = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo d11 = m0.d(context, sentryAndroidOptions.getLogger());
            if (d11 != null) {
                fVar.f16787m = Long.valueOf(d11.totalMem);
            }
            fVar.f16786l = n0Var.b();
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th2) {
                logger.e(b5.ERROR, "Error getting DisplayMetrics.", th2);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                fVar.f16794u = Integer.valueOf(displayMetrics.widthPixels);
                fVar.f16795v = Integer.valueOf(displayMetrics.heightPixels);
                fVar.f16796w = Float.valueOf(displayMetrics.density);
                fVar.f16797x = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (fVar.A == null) {
                fVar.A = a();
            }
            ArrayList a7 = io.sentry.android.core.internal.util.f.f15714c.a();
            if (!a7.isEmpty()) {
                fVar.F = Double.valueOf(((Integer) Collections.max(a7)).doubleValue());
                fVar.E = Integer.valueOf(a7.size());
            }
            cVar.o(fVar);
        }
        if (!bVar2.a()) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return t4Var;
        }
        if (t4Var.f16458d == null) {
            t4Var.f16458d = (io.sentry.protocol.p) b(sentryAndroidOptions, "request.json", io.sentry.protocol.p.class);
        }
        if (t4Var.f16463i == null) {
            t4Var.f16463i = (io.sentry.protocol.i0) b(sentryAndroidOptions, "user.json", io.sentry.protocol.i0.class);
        }
        Map map2 = (Map) b(sentryAndroidOptions, "tags.json", Map.class);
        if (map2 != null) {
            if (t4Var.f16459e == null) {
                t4Var.f16459e = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry : map2.entrySet()) {
                    int i11 = i10;
                    if (!t4Var.f16459e.containsKey(entry.getKey())) {
                        t4Var.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    i10 = i11;
                }
            }
        }
        int i12 = i10;
        List list2 = (List) b(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list2 != null) {
            List list3 = t4Var.f16466m;
            if (list3 == null) {
                t4Var.f16466m = new ArrayList(list2);
            } else {
                list3.addAll(list2);
            }
        }
        Map map3 = (Map) b(sentryAndroidOptions, "extras.json", Map.class);
        if (map3 != null) {
            if (t4Var.f16468o == null) {
                t4Var.f16468o = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry2 : map3.entrySet()) {
                    if (!t4Var.f16468o.containsKey(entry2.getKey())) {
                        t4Var.f16468o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        io.sentry.protocol.c cVar2 = (io.sentry.protocol.c) b(sentryAndroidOptions, "contexts.json", io.sentry.protocol.c.class);
        if (cVar2 != null) {
            Iterator it3 = new io.sentry.protocol.c(cVar2).f16754a.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                Object value = entry3.getValue();
                Iterator it4 = it3;
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof n6)) && !cVar.a(entry3.getKey())) {
                    cVar.k(value, (String) entry3.getKey());
                }
                it3 = it4;
            }
        }
        String str6 = (String) b(sentryAndroidOptions, "transaction.json", String.class);
        if (t4Var.f17097v == null) {
            t4Var.f17097v = str6;
        }
        List list4 = (List) b(sentryAndroidOptions, "fingerprint.json", List.class);
        if (t4Var.f17098w == null) {
            t4Var.f17098w = list4 != null ? new ArrayList(list4) : null;
        }
        b5 b5Var = (b5) b(sentryAndroidOptions, "level.json", b5.class);
        if (t4Var.f17096u == null) {
            t4Var.f17096u = b5Var;
        }
        n6 n6Var = (n6) b(sentryAndroidOptions, "trace.json", n6.class);
        if (cVar.i() == null && n6Var != null) {
            cVar.v(n6Var);
        }
        String str7 = (String) b(sentryAndroidOptions, "replay.json", String.class);
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            str = "anr_background";
            i0Var2 = i0Var;
        } else {
            i0Var2 = i0Var;
            str = "anr_background";
            if (!new File(cacheDirPath, androidx.appcompat.widget.c1.m("replay_", str7)).exists()) {
                String str8 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class);
                if (str8 != null) {
                    try {
                        if (Double.parseDouble(str8) < io.sentry.util.j.a().c()) {
                            ILogger logger2 = sentryAndroidOptions.getLogger();
                            b5 b5Var2 = b5.DEBUG;
                            Object[] objArr = new Object[1];
                            objArr[i12] = t4Var.f16455a;
                            logger2.h(b5Var2, "Not capturing replay for ANR %s due to not being sampled.", objArr);
                        } else {
                            File[] listFiles = new File(cacheDirPath).listFiles();
                            if (listFiles != null) {
                                int length = listFiles.length;
                                long j = Long.MIN_VALUE;
                                int i13 = i12;
                                String str9 = null;
                                while (i13 < length) {
                                    File file = listFiles[i13];
                                    if (file.isDirectory()) {
                                        fileArr = listFiles;
                                        if (file.getName().startsWith("replay_") && file.lastModified() > j && file.lastModified() <= ((Date) t4Var.f17092p.clone()).getTime()) {
                                            j = file.lastModified();
                                            str9 = file.getName().substring(7);
                                        }
                                    } else {
                                        fileArr = listFiles;
                                    }
                                    i13++;
                                    listFiles = fileArr;
                                }
                                str7 = str9;
                            } else {
                                str7 = null;
                            }
                        }
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().e(b5.ERROR, "Error parsing replay sample rate.", th3);
                    }
                }
            }
            if (str7 != null) {
                Charset charset = io.sentry.cache.g.f16253c;
                io.sentry.cache.a.d(sentryAndroidOptions, str7, ".scope-cache", "replay.json");
                cVar.k(str7, "replay_id");
            }
        }
        if (t4Var.f16460f == null) {
            t4Var.f16460f = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (t4Var.f16461g == null) {
            String str10 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "environment.json", String.class);
            if (str10 == null) {
                str10 = sentryAndroidOptions.getEnvironment();
            }
            t4Var.f16461g = str10;
        }
        if (t4Var.f16465l == null) {
            t4Var.f16465l = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "dist.json", String.class);
        }
        if (t4Var.f16465l == null && (str3 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "release.json", String.class)) != null) {
            try {
                i5 = 1;
            } catch (Throwable unused) {
                i5 = 1;
            }
            try {
                t4Var.f16465l = str3.substring(str3.indexOf(43) + 1);
            } catch (Throwable unused2) {
                ILogger logger3 = sentryAndroidOptions.getLogger();
                b5 b5Var3 = b5.WARNING;
                Object[] objArr2 = new Object[i5];
                objArr2[i12] = str3;
                logger3.h(b5Var3, "Failed to parse release from scope cache: %s", objArr2);
                dVar = t4Var.f16467n;
                if (dVar == null) {
                }
                if (dVar.f16758b == null) {
                }
                list = dVar.f16758b;
                if (list == null) {
                }
                if (t4Var.f16457c == null) {
                }
                d10 = cVar.d();
                if (d10 == null) {
                }
                io.sentry.protocol.a aVar = d10;
                aVar.f16737e = (String) m0.f15778c.a(context);
                f6 = m0.f(context, n0Var);
                if (f6 != null) {
                }
                str2 = t4Var.f16460f;
                if (str2 == null) {
                }
                if (str2 != null) {
                }
                u0Var = q0.c(context, sentryAndroidOptions).f15823f;
                if (u0Var != null) {
                }
                cVar.m(aVar);
                map = (Map) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
                if (map != null) {
                }
                i0Var3 = t4Var.f16463i;
                if (i0Var3 == null) {
                }
                if (i0Var3.f16817b == null) {
                }
                if (i0Var3.f16819d == null) {
                    i0Var3.f16819d = "{{auto}}";
                }
                h0Var2 = q0.c(context, sentryAndroidOptions).f15822e;
                if (h0Var2 != null) {
                }
                if (i0Var2 != null) {
                }
                return t4Var;
            }
        }
        dVar = t4Var.f16467n;
        if (dVar == null) {
            dVar = new io.sentry.protocol.d();
        }
        if (dVar.f16758b == null) {
            dVar.f16758b = new ArrayList(new ArrayList());
        }
        list = dVar.f16758b;
        if (list == null) {
            String str11 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class);
            if (str11 != null) {
                DebugImage debugImage = new DebugImage();
                bVar = bVar2;
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str11);
                list.add(debugImage);
            } else {
                bVar = bVar2;
            }
            t4Var.f16467n = dVar;
        } else {
            bVar = bVar2;
        }
        if (t4Var.f16457c == null) {
            t4Var.f16457c = (io.sentry.protocol.t) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "sdk-version.json", io.sentry.protocol.t.class);
        }
        d10 = cVar.d();
        if (d10 == null) {
            d10 = new io.sentry.protocol.a();
        }
        io.sentry.protocol.a aVar2 = d10;
        aVar2.f16737e = (String) m0.f15778c.a(context);
        f6 = m0.f(context, n0Var);
        if (f6 != null) {
            aVar2.f16733a = f6.packageName;
        }
        str2 = t4Var.f16460f;
        if (str2 == null) {
            str2 = (String) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (str2 != null) {
            try {
                String substring = str2.substring(str2.indexOf(64) + 1, str2.indexOf(43));
                String substring2 = str2.substring(str2.indexOf(43) + 1);
                aVar2.f16738f = substring;
                aVar2.f16739g = substring2;
            } catch (Throwable unused3) {
                ILogger logger4 = sentryAndroidOptions.getLogger();
                b5 b5Var4 = b5.WARNING;
                Object[] objArr3 = new Object[1];
                objArr3[i12] = str2;
                logger4.h(b5Var4, "Failed to parse release from scope cache: %s", objArr3);
            }
        }
        try {
            u0Var = q0.c(context, sentryAndroidOptions).f15823f;
            if (u0Var != null) {
                aVar2.f16743l = Boolean.valueOf(u0Var.f4106a);
                String[] strArr = (String[]) u0Var.f4107b;
                if (strArr != null) {
                    aVar2.f16744m = Arrays.asList(strArr);
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting split apks info.", th4);
        }
        cVar.m(aVar2);
        map = (Map) io.sentry.cache.a.c(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
        if (map != null) {
            if (t4Var.f16459e == null) {
                t4Var.f16459e = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry4 : map.entrySet()) {
                    if (!t4Var.f16459e.containsKey(entry4.getKey())) {
                        t4Var.b((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        i0Var3 = t4Var.f16463i;
        if (i0Var3 == null) {
            i0Var3 = new io.sentry.protocol.i0();
            t4Var.f16463i = i0Var3;
        }
        if (i0Var3.f16817b == null) {
            i0Var3.f16817b = a();
        }
        if (i0Var3.f16819d == null && sentryAndroidOptions.isSendDefaultPii()) {
            i0Var3.f16819d = "{{auto}}";
        }
        try {
            h0Var2 = q0.c(context, sentryAndroidOptions).f15822e;
            if (h0Var2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isSideLoaded", String.valueOf(h0Var2.f9847a));
                String str12 = h0Var2.f9848b;
                if (str12 != null) {
                    hashMap.put("installerStore", str12);
                }
                for (Map.Entry entry5 : hashMap.entrySet()) {
                    t4Var.b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().e(b5.ERROR, "Error getting side loaded info.", th5);
        }
        if (i0Var2 != null) {
            io.sentry.hints.b bVar3 = bVar;
            int equals2 = bVar3 instanceof io.sentry.hints.a ? str.equals(((io.sentry.hints.a) bVar3).e()) : i12;
            boolean z7 = equals2 ^ 1;
            io.sentry.protocol.a d12 = cVar.d();
            if (d12 == null) {
                d12 = new io.sentry.protocol.a();
                cVar.m(d12);
            }
            if (d12.f16742k == null) {
                d12.f16742k = Boolean.valueOf(z7);
            }
            if (t4Var.f17098w == null) {
                List asList = Arrays.asList("{{ default }}", equals2 != 0 ? "background-anr" : "foreground-anr");
                t4Var.f17098w = asList != null ? new ArrayList(asList) : null;
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        return d5Var;
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, io.sentry.h0 h0Var) {
        return d6Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        return e0Var;
    }
}
