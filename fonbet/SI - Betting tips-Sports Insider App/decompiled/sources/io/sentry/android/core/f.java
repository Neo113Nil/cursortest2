package io.sentry.android.core;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.views.SwitchButton;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.ILogger;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c6;
import io.sentry.d6;
import io.sentry.ndk.NativeScope;
import io.sentry.o3;
import io.sentry.y3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15573b;

    public /* synthetic */ f(int i5, Object obj) {
        this.f15572a = i5;
        this.f15573b = obj;
    }

    private final void a() {
        j1.p pVar = (j1.p) this.f15573b;
        synchronized (pVar.f18224d) {
            try {
                if (pVar.f18228h == null) {
                    return;
                }
                try {
                    m0.i d10 = pVar.d();
                    int i5 = d10.f20135f;
                    if (i5 == 2) {
                        synchronized (pVar.f18224d) {
                        }
                    }
                    if (i5 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                    }
                    try {
                        Method method = l0.k.f19312b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        m3.f fVar = pVar.f18223c;
                        Context context = pVar.f18221a;
                        fVar.getClass();
                        m0.i[] iVarArr = {d10};
                        a.a aVar = g0.g.f9683a;
                        Trace.beginSection(m4.g.B("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface l6 = g0.g.f9683a.l(context, iVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer L = ci.c.L(pVar.f18221a, d10.f20130a);
                            if (L == null || l6 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(l6, rh.g.F(L));
                                Trace.endSection();
                                synchronized (pVar.f18224d) {
                                    try {
                                        k2.x xVar2 = pVar.f18228h;
                                        if (xVar2 != null) {
                                            xVar2.z(xVar);
                                        }
                                    } finally {
                                    }
                                }
                                pVar.b();
                            } finally {
                                Method method2 = l0.k.f19312b;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (pVar.f18224d) {
                        try {
                            k2.x xVar3 = pVar.f18228h;
                            if (xVar3 != null) {
                                xVar3.y(th3);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x0623, code lost:
    
        if (r6 != null) goto L277;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v35, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [gf.i, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        Date date;
        c6 c6Var;
        String str;
        int i5;
        Date date2;
        Iterable iterable;
        io.sentry.android.replay.f fVar;
        List split$default;
        b6 b6Var;
        Field field;
        x9.a aVar;
        RandomAccessFile randomAccessFile;
        long j;
        long j6;
        switch (this.f15572a) {
            case 0:
                ((h) this.f15573b).h(true);
                return;
            case 1:
                ((u) this.f15573b).a(null, true);
                return;
            case 2:
                g0 g0Var = (g0) this.f15573b;
                if (g0Var != null) {
                    ProcessLifecycleOwner.f2124i.f2130f.b(g0Var);
                    return;
                }
                return;
            case 3:
                ((SystemEventsBreadcrumbsIntegration) this.f15573b).r();
                return;
            case 4:
                ((io.sentry.internal.modules.f) this.f15573b).a();
                return;
            case 5:
                ((io.sentry.android.ndk.c) this.f15573b).f15920b.getClass();
                NativeScope.nativeRemoveExtra("sessionURL");
                return;
            case 6:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.f15573b;
                b6 b6Var2 = replayIntegration.f15926d;
                if (b6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    b6Var2 = null;
                }
                io.sentry.cache.g findPersistingScopeObserver = b6Var2.findPersistingScopeObserver();
                if (findPersistingScopeObserver != null) {
                    b6 b6Var3 = replayIntegration.f15926d;
                    if (b6Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        b6Var3 = null;
                    }
                    String str2 = (String) findPersistingScopeObserver.m(b6Var3, "replay.json", String.class);
                    if (str2 != null) {
                        io.sentry.protocol.v replayId = new io.sentry.protocol.v(str2);
                        if (Intrinsics.areEqual(replayId, io.sentry.protocol.v.f16922b)) {
                            replayIntegration.K("");
                            return;
                        }
                        b6 options = replayIntegration.f15926d;
                        if (options == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("options");
                            options = null;
                        }
                        Intrinsics.checkNotNullParameter(options, "options");
                        Intrinsics.checkNotNullParameter(replayId, "replayId");
                        Intrinsics.checkNotNullParameter(options, "options");
                        Intrinsics.checkNotNullParameter(replayId, "replayId");
                        String cacheDirPath = options.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            options.getLogger().h(b5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = options.getCacheDirPath();
                            Intrinsics.checkNotNull(cacheDirPath2);
                            file = new File(cacheDirPath2, "replay_" + replayId);
                            file.mkdirs();
                        }
                        File file2 = new File(file, ".ongoing_segment");
                        if (file2.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), Segment.SIZE);
                            try {
                                Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
                                bg.k kVar = new bg.k(bufferedReader);
                                Intrinsics.checkNotNullParameter(kVar, "<this>");
                                Iterator it = new bg.a(kVar).iterator();
                                while (it.hasNext()) {
                                    split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
                                    linkedHashMap.put((String) split$default.get(0), (String) split$default.get(1));
                                }
                                bufferedReader.close();
                                String str3 = (String) linkedHashMap.get("config.height");
                                Integer intOrNull = str3 != null ? StringsKt.toIntOrNull(str3) : null;
                                String str4 = (String) linkedHashMap.get("config.width");
                                Integer intOrNull2 = str4 != null ? StringsKt.toIntOrNull(str4) : null;
                                String str5 = (String) linkedHashMap.get("config.frame-rate");
                                Integer intOrNull3 = str5 != null ? StringsKt.toIntOrNull(str5) : null;
                                String str6 = (String) linkedHashMap.get("config.bit-rate");
                                Integer intOrNull4 = str6 != null ? StringsKt.toIntOrNull(str6) : null;
                                String str7 = (String) linkedHashMap.get("segment.id");
                                Integer intOrNull5 = str7 != null ? StringsKt.toIntOrNull(str7) : null;
                                try {
                                    String str8 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    date = com.google.android.play.core.appupdate.b.p(str8);
                                } catch (Throwable unused) {
                                    date = null;
                                }
                                Integer num = intOrNull;
                                try {
                                    String str9 = (String) linkedHashMap.get("replay.type");
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    c6Var = c6.valueOf(str9);
                                } catch (Throwable unused2) {
                                    c6Var = null;
                                }
                                if (num != null && intOrNull2 != null && intOrNull3 != null && intOrNull4 != null && intOrNull5 != null) {
                                    Date date3 = date;
                                    Integer num2 = intOrNull2;
                                    if (intOrNull5.intValue() != -1 && date3 != null && c6Var != null) {
                                        io.sentry.android.replay.v vVar = new io.sentry.android.replay.v(num2.intValue(), num.intValue(), 1.0f, 1.0f, intOrNull3.intValue(), intOrNull4.intValue());
                                        io.sentry.android.replay.j jVar = new io.sentry.android.replay.j(options, replayId);
                                        ArrayList arrayList = jVar.f16059i;
                                        File n9 = jVar.n();
                                        File file3 = file;
                                        if (n9 != null) {
                                            str = "options";
                                            i5 = 1;
                                            n9.listFiles(new io.sentry.u(i5, jVar));
                                        } else {
                                            str = "options";
                                            i5 = 1;
                                        }
                                        if (!arrayList.isEmpty()) {
                                            if (arrayList.size() > i5) {
                                                kotlin.collections.y.m(arrayList, new androidx.coordinatorlayout.widget.i(7));
                                            }
                                            c6 c6Var2 = c6.SESSION;
                                            int intValue = c6Var == c6Var2 ? intOrNull5.intValue() : 0;
                                            if (c6Var == c6Var2) {
                                                date2 = date3;
                                            } else {
                                                Date o3 = com.google.android.play.core.appupdate.b.o(((io.sentry.android.replay.k) CollectionsKt.F(arrayList)).f16062b);
                                                Intrinsics.checkNotNull(o3);
                                                date2 = o3;
                                            }
                                            long time = (((io.sentry.android.replay.k) CollectionsKt.K(arrayList)).f16062b - date2.getTime()) + (AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT / intOrNull3.intValue());
                                            String str10 = (String) linkedHashMap.get("replay.recording");
                                            if (str10 != null) {
                                                o3 o3Var = (o3) options.getSerializer().c(new StringReader(str10), o3.class);
                                                if ((o3Var != null ? o3Var.f16685b : null) == null) {
                                                    iterable = null;
                                                    break;
                                                } else {
                                                    List list = o3Var.f16685b;
                                                    Intrinsics.checkNotNull(list);
                                                    iterable = new LinkedList(list);
                                                    break;
                                                }
                                            }
                                            iterable = kotlin.collections.e0.f19204a;
                                            fVar = new io.sentry.android.replay.f(vVar, jVar, date2, intValue, time, c6Var, (String) linkedHashMap.get("replay.screen-at-start"), CollectionsKt.R(iterable, new androidx.coordinatorlayout.widget.i(8)));
                                            if (fVar != null) {
                                                replayIntegration.K("");
                                                return;
                                            }
                                            b6 b6Var4 = replayIntegration.f15926d;
                                            if (b6Var4 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(str);
                                                b6Var4 = null;
                                            }
                                            Object m6 = findPersistingScopeObserver.m(b6Var4, "breadcrumbs.json", List.class);
                                            List list2 = m6 instanceof List ? (List) m6 : null;
                                            y3 y3Var = replayIntegration.f15927e;
                                            b6 b6Var5 = replayIntegration.f15926d;
                                            if (b6Var5 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(str);
                                                b6Var = null;
                                            } else {
                                                b6Var = b6Var5;
                                            }
                                            long j10 = fVar.f16032e;
                                            Date date4 = fVar.f16030c;
                                            int i10 = fVar.f16031d;
                                            io.sentry.android.replay.v vVar2 = fVar.f16028a;
                                            io.sentry.android.replay.capture.k a7 = io.sentry.android.replay.capture.h.a(y3Var, b6Var, j10, date4, replayId, i10, vVar2.f16138b, vVar2.f16137a, fVar.f16033f, fVar.f16029b, vVar2.f16141e, vVar2.f16142f, fVar.f16034g, list2, new LinkedList(fVar.f16035h));
                                            if (a7 instanceof io.sentry.android.replay.capture.i) {
                                                io.sentry.h0 hint = k2.x.k(new io.sentry.android.replay.l());
                                                io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) a7;
                                                y3 y3Var2 = replayIntegration.f15927e;
                                                Intrinsics.checkNotNull(hint);
                                                Intrinsics.checkNotNullParameter(hint, "hint");
                                                if (y3Var2 != null) {
                                                    d6 d6Var = iVar.f16007a;
                                                    hint.f16451g = iVar.f16008b;
                                                    Unit unit = Unit.f19194a;
                                                    y3Var2.x(d6Var, hint);
                                                }
                                            }
                                            replayIntegration.K(str2);
                                            return;
                                        }
                                        ILogger logger = options.getLogger();
                                        b5 b5Var = b5.DEBUG;
                                        Object[] objArr = new Object[i5];
                                        objArr[0] = replayId;
                                        logger.h(b5Var, "No frames found for replay: %s, deleting the replay", objArr);
                                        io.sentry.config.a.g(file3);
                                    }
                                }
                                File file4 = file;
                                str = "options";
                                options.getLogger().h(b5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                                io.sentry.config.a.g(file4);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    com.google.android.play.core.appupdate.b.g(bufferedReader, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            options.getLogger().h(b5.DEBUG, "No ongoing segment found for replay: %s", replayId);
                            io.sentry.config.a.g(file);
                            str = "options";
                        }
                        fVar = null;
                        if (fVar != null) {
                        }
                    }
                }
                replayIntegration.K("");
                return;
            case 7:
                io.sentry.android.replay.s sVar = (io.sentry.android.replay.s) this.f15573b;
                if (sVar.f16070a.get()) {
                    return;
                }
                Object obj = io.sentry.android.replay.y.f16170a;
                androidx.fragment.app.r swap = new androidx.fragment.app.r(3, sVar);
                Intrinsics.checkNotNullParameter(swap, "swap");
                try {
                    Object value = io.sentry.android.replay.y.f16171b.getValue();
                    if (value == null || (field = (Field) io.sentry.android.replay.y.f16172c.getValue()) == null) {
                        return;
                    }
                    Object obj2 = field.get(value);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
                    field.set(value, swap.invoke((ArrayList) obj2));
                    return;
                } catch (Throwable th4) {
                    Log.w("WindowManagerSpy", th4);
                    return;
                }
            case 8:
                io.sentry.android.replay.screenshot.g gVar = (io.sentry.android.replay.screenshot.g) this.f15573b;
                if (!gVar.f16101g.isRecycled()) {
                    synchronized (gVar.f16101g) {
                        try {
                            if (!gVar.f16101g.isRecycled()) {
                                gVar.f16101g.recycle();
                            }
                            Unit unit2 = Unit.f19194a;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                if (((Bitmap) gVar.f16100f.getValue()).isRecycled()) {
                    return;
                }
                ((Bitmap) gVar.f16100f.getValue()).recycle();
                return;
            case 9:
                io.sentry.cache.g gVar2 = (io.sentry.cache.g) this.f15573b;
                try {
                    ((io.sentry.cache.tape.e) gVar2.f16255b.a()).clear();
                    return;
                } catch (IOException e7) {
                    gVar2.f16254a.getLogger().e(b5.ERROR, "Failed to clear breadcrumbs from file queue", e7);
                    return;
                }
            case 10:
                io.sentry.logger.d dVar = (io.sentry.logger.d) this.f15573b;
                dVar.f16628d.d(dVar.f16625a.getShutdownTimeoutMillis());
                return;
            case 11:
                androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f15573b;
                ((com.google.firebase.messaging.x) a0Var.f683e).d(((b6) a0Var.f680b).getShutdownTimeoutMillis());
                return;
            case 12:
                a();
                return;
            case 13:
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f15573b;
                ((l5.i) ((m5.c) xVar.f6185d)).w(new io.sentry.android.core.internal.gestures.c(12, xVar));
                return;
            case 14:
                ((MainActivity) this.f15573b).f6896u0 = false;
                return;
            case 15:
                s0.e eVar = ((s0.g) this.f15573b).f22612a;
                ViewParent parent = eVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(eVar);
                    return;
                }
                return;
            case 16:
                SwitchButton switchButton = (SwitchButton) this.f15573b;
                int i11 = SwitchButton.f7947w0;
                int i12 = switchButton.j0;
                if (i12 != 0) {
                    return;
                }
                ValueAnimator valueAnimator = switchButton.k0;
                if (i12 == 0 && switchButton.f7971q0) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    switchButton.j0 = switchButton.f7951d;
                    ve.p0 p0Var = switchButton.f7957h0;
                    Intrinsics.checkNotNull(p0Var);
                    p0Var.a(switchButton.f7955g0);
                    ve.p0 p0Var2 = switchButton.f7959i0;
                    Intrinsics.checkNotNull(p0Var2);
                    p0Var2.a(switchButton.f7955g0);
                    if (switchButton.f7964m0) {
                        ve.p0 p0Var3 = switchButton.f7959i0;
                        Intrinsics.checkNotNull(p0Var3);
                        p0Var3.f24757b = switchButton.f7980v;
                        ve.p0 p0Var4 = switchButton.f7959i0;
                        Intrinsics.checkNotNull(p0Var4);
                        p0Var4.f24756a = switchButton.J;
                        ve.p0 p0Var5 = switchButton.f7959i0;
                        Intrinsics.checkNotNull(p0Var5);
                        p0Var5.f24758c = switchButton.f7980v;
                    } else {
                        ve.p0 p0Var6 = switchButton.f7959i0;
                        Intrinsics.checkNotNull(p0Var6);
                        p0Var6.f24757b = switchButton.f7978u;
                        ve.p0 p0Var7 = switchButton.f7959i0;
                        Intrinsics.checkNotNull(p0Var7);
                        p0Var7.f24756a = switchButton.I;
                        ve.p0 p0Var8 = switchButton.f7959i0;
                        Intrinsics.checkNotNull(p0Var8);
                        p0Var8.f24759d = switchButton.f7961l;
                    }
                    valueAnimator.start();
                    return;
                }
                return;
            case 17:
                x9.b bVar = (x9.b) this.f15573b;
                if (bVar.f25423g) {
                    return;
                }
                try {
                    randomAccessFile = new RandomAccessFile("/proc/" + bVar.f25420d + "/stat", "r");
                } catch (Throwable th6) {
                    bVar.f25417a.e("CPU stats could not be found or could not be read. Disabling LogRocket CPU Tracker.", th6);
                    bVar.b();
                    aVar = null;
                }
                try {
                    String readLine = randomAccessFile.readLine();
                    long currentTimeMillis = System.currentTimeMillis();
                    String[] split = readLine.split(" ");
                    float parseFloat = Float.parseFloat(split[13]);
                    float parseFloat2 = Float.parseFloat(split[14]);
                    float parseFloat3 = Float.parseFloat(split[15]);
                    float parseFloat4 = Float.parseFloat(split[16]);
                    float f6 = parseFloat + parseFloat3;
                    float f10 = bVar.f25419c;
                    x9.a aVar2 = new x9.a(currentTimeMillis, f6 * f10, (parseFloat2 + parseFloat4) * f10);
                    randomAccessFile.close();
                    aVar = aVar2;
                    if (aVar != null) {
                        com.logrocket.core.g gVar3 = (com.logrocket.core.g) bVar.f25418b.get();
                        if (gVar3 == null) {
                            bVar.b();
                        }
                        if (gVar3 == null) {
                            return;
                        }
                        String c2 = gVar3.f6462a.c();
                        String u10 = ((eh.j) bVar.f25424h.f6816b).u();
                        if (!c2.equals(u10)) {
                            if (u10 != null && !u10.isEmpty()) {
                                bVar.a();
                            }
                            eh.g gVar4 = bVar.f25424h;
                            gVar4.d();
                            eh.j.r((eh.j) gVar4.f6816b, c2);
                        }
                        x9.a aVar3 = bVar.f25425i;
                        if (aVar3 != null) {
                            float f11 = aVar.f25416c;
                            long j11 = aVar.f25414a;
                            float f12 = f11 - aVar3.f25416c;
                            float f13 = aVar.f25415b - aVar3.f25415b;
                            float f14 = j11 - aVar3.f25414a;
                            float f15 = (f12 / f14) * 100.0f;
                            float f16 = (f13 / f14) * 100.0f;
                            eh.h s8 = eh.i.s();
                            s8.d();
                            eh.i.q((eh.i) s8.f6816b, j11);
                            s8.d();
                            eh.i.p((eh.i) s8.f6816b, f15);
                            s8.d();
                            eh.i.r((eh.i) s8.f6816b, f16);
                            eh.g gVar5 = bVar.f25424h;
                            gVar5.d();
                            eh.j.q((eh.j) gVar5.f6816b, (eh.i) s8.a());
                        }
                        bVar.f25425i = aVar;
                        if (((eh.j) bVar.f25424h.f6816b).t() >= 10) {
                            bVar.a();
                            return;
                        }
                        return;
                    }
                    return;
                } finally {
                }
            default:
                x9.e eVar2 = (x9.e) this.f15573b;
                if (eVar2.f25442e) {
                    return;
                }
                com.logrocket.core.g gVar6 = (com.logrocket.core.g) eVar2.f25439b.get();
                if (gVar6 == null) {
                    eVar2.f25442e = true;
                    aa.g gVar7 = eVar2.f25441d;
                    if (gVar7 != null) {
                        gVar7.d();
                    }
                }
                if (gVar6 == null) {
                    return;
                }
                String c8 = gVar6.f6462a.c();
                String s10 = ((eh.r) eVar2.j.f6816b).s();
                if (!c8.equals(s10)) {
                    if (s10 != null && !s10.isEmpty()) {
                        eVar2.a();
                    }
                    eh.o oVar = eVar2.j;
                    oVar.d();
                    eh.r.q((eh.r) oVar.f6816b, c8);
                }
                long j12 = 0;
                long j13 = -1;
                if (eVar2.f25445h >= 0) {
                    long totalTxBytes = TrafficStats.getTotalTxBytes();
                    long totalRxBytes = TrafficStats.getTotalRxBytes();
                    long j14 = (totalTxBytes < 0 || totalRxBytes < 0) ? -1L : totalTxBytes + totalRxBytes;
                    long j15 = eVar2.f25445h;
                    if (j14 >= j15) {
                        j = j14 - j15;
                        eVar2.f25445h = j14;
                        if (eVar2.f25444g >= 0) {
                            long mobileTxBytes = TrafficStats.getMobileTxBytes();
                            long mobileRxBytes = TrafficStats.getMobileRxBytes();
                            long j16 = (mobileTxBytes < 0 || mobileRxBytes < 0) ? -1L : mobileTxBytes + mobileRxBytes;
                            long j17 = eVar2.f25444g;
                            if (j16 >= j17) {
                                j6 = j16 - j17;
                                eVar2.f25444g = j16;
                                if (eVar2.f25446i >= 0) {
                                    int i13 = eVar2.f25440c;
                                    long uidTxBytes = TrafficStats.getUidTxBytes(i13);
                                    long uidRxBytes = TrafficStats.getUidRxBytes(i13);
                                    if (uidTxBytes >= 0 && uidRxBytes >= 0) {
                                        j13 = uidTxBytes + uidRxBytes;
                                    }
                                    long j18 = eVar2.f25446i;
                                    if (j13 >= j18) {
                                        j12 = j13 - j18;
                                        eVar2.f25446i = j13;
                                    }
                                }
                                long currentTimeMillis2 = System.currentTimeMillis();
                                eh.p t3 = eh.q.t();
                                t3.d();
                                eh.q.s((eh.q) t3.f6816b, currentTimeMillis2);
                                t3.d();
                                eh.q.p((eh.q) t3.f6816b, j6);
                                t3.d();
                                eh.q.q((eh.q) t3.f6816b, j);
                                t3.d();
                                eh.q.r((eh.q) t3.f6816b, j12);
                                eh.o oVar2 = eVar2.j;
                                oVar2.d();
                                eh.r.p((eh.r) oVar2.f6816b, (eh.q) t3.a());
                                if (((eh.r) eVar2.j.f6816b).r() >= eVar2.f25443f) {
                                    eVar2.a();
                                    return;
                                }
                                return;
                            }
                        }
                        j6 = 0;
                        if (eVar2.f25446i >= 0) {
                        }
                        long currentTimeMillis22 = System.currentTimeMillis();
                        eh.p t32 = eh.q.t();
                        t32.d();
                        eh.q.s((eh.q) t32.f6816b, currentTimeMillis22);
                        t32.d();
                        eh.q.p((eh.q) t32.f6816b, j6);
                        t32.d();
                        eh.q.q((eh.q) t32.f6816b, j);
                        t32.d();
                        eh.q.r((eh.q) t32.f6816b, j12);
                        eh.o oVar22 = eVar2.j;
                        oVar22.d();
                        eh.r.p((eh.r) oVar22.f6816b, (eh.q) t32.a());
                        if (((eh.r) eVar2.j.f6816b).r() >= eVar2.f25443f) {
                        }
                    }
                }
                j = 0;
                if (eVar2.f25444g >= 0) {
                }
                j6 = 0;
                if (eVar2.f25446i >= 0) {
                }
                long currentTimeMillis222 = System.currentTimeMillis();
                eh.p t322 = eh.q.t();
                t322.d();
                eh.q.s((eh.q) t322.f6816b, currentTimeMillis222);
                t322.d();
                eh.q.p((eh.q) t322.f6816b, j6);
                t322.d();
                eh.q.q((eh.q) t322.f6816b, j);
                t322.d();
                eh.q.r((eh.q) t322.f6816b, j12);
                eh.o oVar222 = eVar2.j;
                oVar222.d();
                eh.r.p((eh.r) oVar222.f6816b, (eh.q) t322.a());
                if (((eh.r) eVar2.j.f6816b).r() >= eVar2.f25443f) {
                }
                break;
        }
    }

    public /* synthetic */ f(h0 h0Var, g0 g0Var) {
        this.f15572a = 2;
        this.f15573b = g0Var;
    }
}
