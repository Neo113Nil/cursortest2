package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.FragmentManager;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4772k2;
import io.sentry.C4743e3;
import io.sentry.C4792o2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4861w2;
import io.sentry.N1;
import io.sentry.X1;
import io.sentry.android.core.C4683i0;
import io.sentry.android.core.H0;
import io.sentry.android.core.O;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.android.core.b1;
import io.sentry.android.core.e1;
import io.sentry.android.core.internal.util.E;
import io.sentry.android.core.j1;
import io.sentry.protocol.F;
import io.sentry.util.AbstractC4846d;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.p;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: s, reason: collision with root package name */
    public static final C4818c f52600s;

    /* renamed from: t, reason: collision with root package name */
    public static final ILogger f52601t;

    /* renamed from: u, reason: collision with root package name */
    public static final C4683i0 f52602u;

    /* renamed from: v, reason: collision with root package name */
    public static final Charset f52603v;

    /* renamed from: w, reason: collision with root package name */
    public static long f52604w;

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f52605a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageInfo f52606b;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52610f;

    /* renamed from: o, reason: collision with root package name */
    public j1 f52619o;

    /* renamed from: c, reason: collision with root package name */
    public FrameMetricsAggregator f52607c = null;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.android.core.internal.util.E f52608d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f52609e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f52611g = 101;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f52612h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f52613i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public boolean f52614j = false;

    /* renamed from: k, reason: collision with root package name */
    public String f52615k = null;

    /* renamed from: l, reason: collision with root package name */
    public String f52616l = null;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC4760i0 f52617m = null;

    /* renamed from: p, reason: collision with root package name */
    public long f52620p = 5242880;

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f52618n = z();

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC4861w2 f52621q = new b1();

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.s f52622r = new io.sentry.util.s();

    static {
        C4818c c4818c = new C4818c();
        f52600s = c4818c;
        f52601t = c4818c;
        f52602u = new C4683i0(c4818c);
        f52603v = Charset.forName("UTF-8");
        f52604w = -1L;
    }

    public t(ReactApplicationContext reactApplicationContext) {
        this.f52606b = X(reactApplicationContext);
        this.f52605a = reactApplicationContext;
    }

    public static byte[] F0(final Activity activity) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final byte[][] bArr = {new byte[0]};
        Runnable runnable = new Runnable() { // from class: io.sentry.react.f
            @Override // java.lang.Runnable
            public final void run() {
                t.o(bArr, activity, countDownLatch);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return bArr[0];
        } catch (InterruptedException unused) {
            f52601t.c(EnumC4788n3.ERROR, "Screenshot process was interrupted.", new Object[0]);
            return new byte[0];
        }
    }

    public static PackageInfo X(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f52601t.c(EnumC4788n3.WARNING, "Error getting package info.", new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void a(ReadableMap readableMap, InterfaceC4730c0 interfaceC4730c0) {
        interfaceC4730c0.d(AbstractC4816a.a(readableMap, f52601t));
        String b10 = AbstractC4816a.b(readableMap);
        if (b10 != null) {
            interfaceC4730c0.P(b10);
        }
    }

    public static boolean g0(String str, Context context) {
        String packageName;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        if ("media".equals(lowerCase)) {
            return true;
        }
        if (context != null && (packageName = context.getPackageName()) != null) {
            if (lowerCase.equals(packageName.toLowerCase(locale) + ".fileprovider")) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void h(ReadableMap readableMap, String str, InterfaceC4730c0 interfaceC4730c0) {
        if (readableMap == null) {
            interfaceC4730c0.L(str);
        } else {
            interfaceC4730c0.C(str, readableMap.toHashMap());
        }
    }

    public static boolean h0(Uri uri, Context context) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        return "content".equals(lowerCase) ? g0(uri.getAuthority(), context) : "file".equals(lowerCase) && j0(uri.getPath(), context);
    }

    public static boolean j0(String str, Context context) {
        if (str == null || str.isEmpty() || context == null) {
            return false;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            File[] fileArr = {context.getFilesDir(), context.getCacheDir(), context.getExternalFilesDir(null), context.getExternalCacheDir()};
            for (int i10 = 0; i10 < 4; i10++) {
                File file = fileArr[i10];
                if (file != null) {
                    String canonicalPath2 = file.getCanonicalPath();
                    if (canonicalPath.equals(canonicalPath2)) {
                        return true;
                    }
                    if (canonicalPath.startsWith(canonicalPath2 + File.separator)) {
                        return true;
                    }
                }
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public static /* synthetic */ void l(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
    }

    public static /* synthetic */ void n(ReadableMap readableMap, ReadableMap readableMap2, InterfaceC4730c0 interfaceC4730c0) {
        if (readableMap == null && readableMap2 == null) {
            interfaceC4730c0.j(null);
            return;
        }
        try {
            io.sentry.protocol.F a10 = new F.a().a(new io.sentry.util.u(readableMap != null ? AbstractC4816a.c(readableMap) : new HashMap()), f52601t);
            if (readableMap2 != null) {
                HashMap hashMap = new HashMap();
                ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    String string = readableMap2.getString(nextKey);
                    if (string != null) {
                        hashMap.put(nextKey, string);
                    }
                }
                a10.l(hashMap);
            }
            interfaceC4730c0.j(a10);
        } catch (Exception e10) {
            f52601t.b(EnumC4788n3.ERROR, "Failed to deserialize user from map.", e10);
            interfaceC4730c0.j(null);
        }
    }

    public static /* synthetic */ void o(byte[][] bArr, Activity activity, CountDownLatch countDownLatch) {
        bArr[0] = io.sentry.android.core.internal.util.x.f(activity, f52601t, f52602u);
        countDownLatch.countDown();
    }

    public void A() {
        if (i0()) {
            this.f52607c.e();
            this.f52607c = null;
        }
        C0();
    }

    public WritableMap A0(boolean z10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (this.f52612h.get() == null && z10) {
            e0();
        }
        try {
            HermesSamplingProfiler.disable();
            HermesSamplingProfiler.enable();
            this.f52613i.set(true);
            O o10 = (O) this.f52612h.get();
            if (o10 != null) {
                o10.j();
            }
            writableNativeMap.putBoolean("started", true);
            return writableNativeMap;
        } catch (Throwable th2) {
            if (this.f52613i.getAndSet(false)) {
                try {
                    HermesSamplingProfiler.disable();
                } catch (Throwable unused) {
                }
            }
            writableNativeMap.putBoolean("started", false);
            writableNativeMap.putString("error", th2.toString());
            return writableNativeMap;
        }
    }

    public void B() {
        E0();
    }

    public final void B0() {
        if (this.f52619o != null) {
            return;
        }
        try {
            ReactApplicationContext a02 = a0();
            j1 j1Var = new j1(f52601t);
            this.f52619o = j1Var;
            j1Var.e(a02, new j1.a() { // from class: io.sentry.react.m
                @Override // io.sentry.android.core.j1.a
                public final void onShake() {
                    t.this.m0();
                }
            });
        } catch (Throwable th2) {
            f52601t.b(EnumC4788n3.WARNING, "Failed to start shake detection.", th2);
            this.f52619o = null;
        }
    }

    public void C() {
        io.sentry.android.core.internal.util.E frameMetricsCollector;
        boolean u10 = u();
        this.f52610f = u10;
        if (u10) {
            this.f52607c = new FrameMetricsAggregator();
            Activity T10 = T();
            FrameMetricsAggregator frameMetricsAggregator = this.f52607c;
            if (frameMetricsAggregator == null || T10 == null) {
                f52601t.c(EnumC4788n3.INFO, "currentActivity isn't available.", new Object[0]);
            } else {
                try {
                    frameMetricsAggregator.a(T10);
                    f52601t.c(EnumC4788n3.INFO, "FrameMetricsAggregator installed.", new Object[0]);
                } catch (Throwable unused) {
                    f52601t.c(EnumC4788n3.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
                }
            }
        } else {
            f52601t.c(EnumC4788n3.WARNING, "androidx.core' isn't available as a dependency.", new Object[0]);
        }
        try {
            F3 i10 = AbstractC4772k2.p().i();
            if (!(i10 instanceof SentryAndroidOptions) || (frameMetricsCollector = ((SentryAndroidOptions) i10).getFrameMetricsCollector()) == null) {
                return;
            }
            C0();
            String o10 = frameMetricsCollector.o(new E.c() { // from class: io.sentry.react.g
                @Override // io.sentry.android.core.internal.util.E.c
                public final void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10) {
                    t.l(j10, j11, j12, j13, z10, z11, f10);
                }
            });
            if (o10 != null) {
                this.f52608d = frameMetricsCollector;
                this.f52609e = o10;
                f52601t.c(EnumC4788n3.INFO, "SentryFrameMetricsCollector listener installed.", new Object[0]);
            }
        } catch (Throwable unused2) {
            f52601t.c(EnumC4788n3.WARNING, "Error starting frame metrics collection.", new Object[0]);
        }
    }

    public final void C0() {
        String str;
        io.sentry.android.core.internal.util.E e10 = this.f52608d;
        if (e10 != null && (str = this.f52609e) != null) {
            e10.p(str);
        }
        this.f52608d = null;
        this.f52609e = null;
    }

    public void D() {
        B0();
    }

    public WritableMap D0() {
        O.b g10;
        boolean isDebug = X1.D().i().isDebug();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!this.f52613i.compareAndSet(true, false)) {
            writableNativeMap.putString("error", "Profiling not active");
            return writableNativeMap;
        }
        File file = null;
        O o10 = (O) this.f52612h.getAndSet(null);
        if (o10 != null) {
            try {
                g10 = o10.g(false, null);
            } catch (Throwable th2) {
                try {
                    writableNativeMap.putString("error", th2.toString());
                    if (file != null) {
                        try {
                            if (!file.delete()) {
                                f52601t.c(EnumC4788n3.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                            }
                        } catch (Throwable unused) {
                            f52601t.c(EnumC4788n3.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        }
                    }
                } catch (Throwable th3) {
                    if (file != null) {
                        try {
                            if (!file.delete()) {
                                f52601t.c(EnumC4788n3.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                            }
                        } catch (Throwable unused2) {
                            f52601t.c(EnumC4788n3.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                        }
                    }
                    throw th3;
                }
            }
        } else {
            g10 = null;
        }
        HermesSamplingProfiler.disable();
        file = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.f52605a.getCacheDir());
        if (isDebug) {
            f52601t.c(EnumC4788n3.INFO, "Profile saved to: " + file.getAbsolutePath(), new Object[0]);
        }
        HermesSamplingProfiler.dumpSampledTraceToFile(file.getPath());
        writableNativeMap.putString("profile", p0(file));
        if (g10 != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("sampled_profile", io.sentry.vendor.a.f(AbstractC4851i.b(g10.f50763c.getPath(), this.f52620p), 3));
            writableNativeMap2.putInt("android_api_level", f52602u.d());
            writableNativeMap2.putString("build_id", Z());
            Map map = g10.f50764d;
            if (map != null && !map.isEmpty()) {
                WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                for (Map.Entry entry : g10.f50764d.entrySet()) {
                    WritableNativeMap writableNativeMap4 = new WritableNativeMap();
                    writableNativeMap4.putString("unit", ((io.sentry.profilemeasurements.a) entry.getValue()).c());
                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                    if (((io.sentry.profilemeasurements.a) entry.getValue()).d() != null) {
                        for (Iterator it = ((io.sentry.profilemeasurements.a) entry.getValue()).d().iterator(); it.hasNext(); it = it) {
                            io.sentry.profilemeasurements.b bVar = (io.sentry.profilemeasurements.b) it.next();
                            WritableNativeMap writableNativeMap5 = new WritableNativeMap();
                            writableNativeMap5.putString("elapsed_since_start_ns", bVar.d());
                            writableNativeMap5.putDouble(EventKeys.VALUE_KEY, bVar.e());
                            writableNativeArray.pushMap(writableNativeMap5);
                        }
                    }
                    writableNativeMap4.putArray(EventKeys.VALUES_KEY, writableNativeArray);
                    writableNativeMap3.putMap((String) entry.getKey(), writableNativeMap4);
                }
                writableNativeMap2.putMap("measurements", writableNativeMap3);
            }
            writableNativeMap.putMap("androidProfile", writableNativeMap2);
        }
        try {
            if (!file.delete()) {
                f52601t.c(EnumC4788n3.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
                return writableNativeMap;
            }
        } catch (Throwable unused3) {
            f52601t.c(EnumC4788n3.WARNING, "Profile not deleted from:" + file.getAbsolutePath(), new Object[0]);
        }
        return writableNativeMap;
    }

    public void E(ReadableArray readableArray, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            bArr[i10] = (byte) readableArray.getInt(i10);
        }
        promise.resolve(Base64.encodeToString(bArr, 0));
    }

    public final void E0() {
        try {
            j1 j1Var = this.f52619o;
            if (j1Var != null) {
                j1Var.f();
                this.f52619o = null;
            }
        } catch (Throwable th2) {
            f52601t.b(EnumC4788n3.WARNING, "Failed to stop shake detection.", th2);
            this.f52619o = null;
        }
    }

    public void F(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a0().getResources().getAssets().open("modules.json"));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, f52603v));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            f52601t.c(EnumC4788n3.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void G(Promise promise) {
        H(promise, io.sentry.android.core.performance.m.v(), H0.h(), f52601t);
    }

    public void H(Promise promise, io.sentry.android.core.performance.m mVar, Map map, ILogger iLogger) {
        if (!mVar.y()) {
            iLogger.c(EnumC4788n3.WARNING, "Invalid app start data: app not launched in foreground.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableMap writableMap = (WritableMap) AbstractC4819d.c(map);
        long h10 = mVar.o().h();
        long j10 = f52604w;
        boolean z10 = j10 > 0 && j10 == h10;
        writableMap.putBoolean("has_fetched", z10);
        if (f52604w < 0) {
            iLogger.c(EnumC4788n3.DEBUG, "App Start data reported to the RN layer for the first time.", new Object[0]);
        } else if (z10) {
            iLogger.c(EnumC4788n3.DEBUG, "App Start data already fetched from native before.", new Object[0]);
        } else {
            iLogger.c(EnumC4788n3.DEBUG, "App Start data updated, reporting to the RN layer again.", new Object[0]);
        }
        f52604w = h10;
        mVar.z();
        promise.resolve(writableMap);
    }

    public void I(Promise promise) {
        J(promise, X1.D().i(), a0().getApplicationContext(), H0.i());
    }

    public void J(Promise promise, F3 f32, Context context, InterfaceC4730c0 interfaceC4730c0) {
        if (!(f32 instanceof SentryAndroidOptions)) {
            promise.resolve(null);
            return;
        }
        if (context == null) {
            promise.resolve(null);
            return;
        }
        Map j10 = H0.j(context, (SentryAndroidOptions) f32, interfaceC4730c0);
        Object obj = j10.get("breadcrumbs");
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof Map) {
                    Map map = (Map) obj2;
                    if (!"react-native".equals(map.get("origin"))) {
                        arrayList.add(map);
                    }
                }
            }
            j10.put("breadcrumbs", arrayList);
        }
        promise.resolve(AbstractC4819d.c(j10));
    }

    public void K(Promise promise) {
        int i10;
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (!i0()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] b10 = this.f52607c.b();
            if (b10 == null || (sparseIntArray = b10[0]) == null) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                    int keyAt = sparseIntArray.keyAt(i13);
                    int valueAt = sparseIntArray.valueAt(i13);
                    i10 += valueAt;
                    if (keyAt > 700) {
                        i12 += valueAt;
                    } else if (keyAt > 16) {
                        i11 += valueAt;
                    }
                }
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("totalFrames", i10);
            createMap.putInt("slowFrames", i11);
            createMap.putInt("frozenFrames", i12);
            promise.resolve(createMap);
        } catch (Throwable unused) {
            f52601t.c(EnumC4788n3.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void L(double d10, double d11, Promise promise) {
        try {
            long nanoTime = System.nanoTime();
            double currentTimeMillis = System.currentTimeMillis() / 1000.0d;
            double d12 = currentTimeMillis - d10;
            double d13 = currentTimeMillis - d11;
            if (d12 >= 0.0d && d13 >= 0.0d) {
                long j10 = (long) (d12 * 1.0E9d);
                if (j10 <= nanoTime) {
                    long j11 = (long) (d13 * 1.0E9d);
                    if (j11 <= nanoTime) {
                        long j12 = nanoTime - j10;
                        long j13 = nanoTime - j11;
                        io.sentry.android.core.internal.util.E e10 = this.f52608d;
                        if (e10 == null) {
                            promise.resolve(null);
                            return;
                        }
                        e1 i10 = e10.i(j12, j13);
                        if (i10 == null || i10.a() < 0.0d) {
                            promise.resolve(null);
                            return;
                        } else {
                            promise.resolve(Double.valueOf(i10.a()));
                            return;
                        }
                    }
                }
            }
            promise.resolve(null);
        } catch (Throwable unused) {
            f52601t.c(EnumC4788n3.WARNING, "Error fetching native frames delay.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void M(Promise promise) {
        N(promise, X1.D().i(), a0().getApplicationContext(), H0.i());
    }

    public void N(Promise promise, F3 f32, Context context, InterfaceC4730c0 interfaceC4730c0) {
        if (!(f32 instanceof SentryAndroidOptions) || context == null) {
            promise.resolve(null);
            return;
        }
        Object obj = H0.j(context, (SentryAndroidOptions) f32, interfaceC4730c0).get("contexts");
        if (!(obj instanceof Map)) {
            promise.resolve(null);
            return;
        }
        Map map = (Map) obj;
        HashMap hashMap = new HashMap();
        if (map.containsKey("os")) {
            hashMap.put("os", map.get("os"));
        }
        if (map.containsKey("device")) {
            hashMap.put("device", map.get("device"));
        }
        hashMap.put("release", f32.getRelease());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("contexts", hashMap);
        promise.resolve(AbstractC4819d.c(hashMap2));
    }

    public String O() {
        return this.f52606b.packageName;
    }

    public void P(Promise promise) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(StackTraceHelper.ID_KEY, this.f52606b.packageName);
        createMap.putString("version", this.f52606b.versionName);
        createMap.putString("build", String.valueOf(this.f52606b.versionCode));
        promise.resolve(createMap);
    }

    public void Q(Promise promise) {
        io.sentry.protocol.s sdkVersion = X1.D().i().getSdkVersion();
        if (sdkVersion == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("name", sdkVersion.e());
        writableNativeMap.putString("version", sdkVersion.g());
        promise.resolve(writableNativeMap);
    }

    public void R(Promise promise) {
        Activity T10 = T();
        ILogger iLogger = f52601t;
        io.sentry.protocol.G c10 = ViewHierarchyEventProcessor.c(T10, iLogger);
        if (c10 == null) {
            iLogger.c(EnumC4788n3.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] c11 = io.sentry.util.o.c(X1.D().i().getSerializer(), iLogger, c10);
        if (c11 == null) {
            iLogger.c(EnumC4788n3.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else {
            if (c11.length < 1) {
                iLogger.c(EnumC4788n3.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
                promise.resolve(null);
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (byte b10 : c11) {
                writableNativeArray.pushInt(b10);
            }
            promise.resolve(writableNativeArray);
        }
    }

    public Context S() {
        Context applicationContext = a0().getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        f52601t.c(EnumC4788n3.ERROR, "ApplicationContext is null, using ReactApplicationContext fallback.", new Object[0]);
        return a0();
    }

    public final Activity T() {
        return this.f52605a.getCurrentActivity();
    }

    public String U() {
        io.sentry.protocol.u r10;
        InterfaceC4730c0 i10 = H0.i();
        if (i10 == null || (r10 = i10.r()) == io.sentry.protocol.u.f52477c) {
            return null;
        }
        return r10.toString();
    }

    public void V(String str, Promise promise) {
        try {
            Uri parse = Uri.parse(str);
            if (!h0(parse, a0())) {
                String str2 = "Unsupported uri scheme or location: " + str;
                f52601t.c(EnumC4788n3.ERROR, str2, new Object[0]);
                promise.reject(new Exception(str2));
                return;
            }
            try {
                InputStream openInputStream = a0().getContentResolver().openInputStream(parse);
                try {
                    if (openInputStream == null) {
                        String str3 = "File not found for uri: " + str;
                        f52601t.c(EnumC4788n3.ERROR, str3, new Object[0]);
                        promise.reject(new Exception(str3));
                        if (openInputStream == null) {
                            return;
                        }
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        WritableArray createArray = Arguments.createArray();
                        for (byte b10 : byteArray) {
                            createArray.pushInt(b10 & UByte.MAX_VALUE);
                        }
                        promise.resolve(createArray);
                    }
                    openInputStream.close();
                } finally {
                }
            } catch (IOException e10) {
                String str4 = "Error reading uri: " + str + ": " + e10.getMessage();
                f52601t.c(EnumC4788n3.ERROR, str4, new Object[0]);
                promise.reject(new Exception(str4));
            }
        } catch (Exception unused) {
            String str5 = "Invalid uri: " + str;
            f52601t.c(EnumC4788n3.ERROR, str5, new Object[0]);
            promise.reject(new Exception(str5));
        }
    }

    public void W(Promise promise) {
        J.c(promise, this.f52621q);
    }

    public final String Y() {
        if (this.f52616l == null) {
            this.f52616l = new File(a0().getCacheDir(), "sentry/react").getAbsolutePath();
        }
        File file = new File(this.f52616l, "profiling_trace");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    public final String Z() {
        if (this.f52614j) {
            return this.f52615k;
        }
        this.f52614j = true;
        List a10 = new io.sentry.android.core.internal.debugmeta.a(a0(), f52601t).a();
        if (a10 == null) {
            return null;
        }
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            String n10 = AbstractC4846d.n((Properties) it.next());
            this.f52615k = n10;
            if (n10 != null) {
                f52601t.c(EnumC4788n3.INFO, "Proguard uuid found: " + this.f52615k, new Object[0]);
                return this.f52615k;
            }
        }
        f52601t.c(EnumC4788n3.WARNING, "No proguard uuid found in debug meta properties file!", new Object[0]);
        return null;
    }

    public final ReactApplicationContext a0() {
        return this.f52605a;
    }

    public final void b0() {
        FragmentManager supportFragmentManager;
        y yVar = new y(f52602u, this.f52618n, f52601t);
        AbstractActivityC2168s abstractActivityC2168s = (AbstractActivityC2168s) T();
        if (abstractActivityC2168s == null || (supportFragmentManager = abstractActivityC2168s.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.o1(yVar, true);
    }

    public void c0(Promise promise) {
        b0();
    }

    public void d0(ReadableMap readableMap, Promise promise) {
        f52600s.f(this.f52605a);
        try {
            G.n(S(), readableMap, T(), new AbstractC4772k2.a() { // from class: io.sentry.react.o
                @Override // io.sentry.AbstractC4772k2.a
                public final void a(F3 f32) {
                    ((SentryAndroidOptions) f32).setLogger(t.f52600s);
                }
            }, f52601t);
            try {
                RNSentryTurboModulePerfTracker.b(readableMap.hasKey("enableTurboModuleTracking") && readableMap.getType("enableTurboModuleTracking") == ReadableType.Boolean && readableMap.getBoolean("enableTurboModuleTracking"));
            } catch (Throwable th2) {
                f52601t.c(EnumC4788n3.WARNING, "Failed to toggle TurboModule perf tracking: " + th2.getMessage(), new Object[0]);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Throwable th3) {
            f52601t.b(EnumC4788n3.ERROR, "Failed to initialize Sentry Android SDK", th3);
            promise.reject("SentryReactNative", th3.getMessage(), th3);
        }
    }

    public final void e0() {
        if (this.f52617m == null) {
            this.f52617m = new C4743e3();
        }
        String Y10 = Y();
        io.sentry.android.core.internal.util.E e10 = null;
        try {
            F3 i10 = AbstractC4772k2.p().i();
            if (i10 instanceof SentryAndroidOptions) {
                e10 = ((SentryAndroidOptions) i10).getFrameMetricsCollector();
            }
        } catch (Throwable unused) {
        }
        if (e10 == null) {
            e10 = new io.sentry.android.core.internal.util.E(this.f52605a, f52601t, f52602u);
        }
        this.f52612h.set(new O(Y10, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f52611g, e10, new p.a() { // from class: io.sentry.react.k
            @Override // io.sentry.util.p.a
            public final Object a() {
                InterfaceC4760i0 l02;
                l02 = t.this.l0();
                return l02;
            }
        }, f52601t));
    }

    public void f0() {
        if (this.f52613i.getAndSet(false)) {
            O o10 = (O) this.f52612h.getAndSet(null);
            try {
                HermesSamplingProfiler.disable();
                f52601t.c(EnumC4788n3.INFO, "Stopped Hermes sampling profiler on React instance destroy.", new Object[0]);
            } catch (Throwable th2) {
                f52601t.c(EnumC4788n3.WARNING, "Failed to stop Hermes sampling profiler on teardown: " + th2, new Object[0]);
            }
            if (o10 != null) {
                try {
                    O.b g10 = o10.g(false, null);
                    if (g10 != null) {
                        File file = g10.f50763c;
                        if (file != null) {
                            try {
                                file.delete();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable th3) {
                    f52601t.c(EnumC4788n3.WARNING, "AndroidProfiler cleanup failed during invalidate: " + th3, new Object[0]);
                }
            }
        }
    }

    public final boolean i0() {
        return this.f52610f && this.f52607c != null;
    }

    public final /* synthetic */ void k0() {
        J.f(Double.valueOf(this.f52621q.now().f() / 1.0E9d));
    }

    public final /* synthetic */ InterfaceC4760i0 l0() {
        return this.f52617m;
    }

    public final /* synthetic */ void m0() {
        try {
            ReactApplicationContext a02 = a0();
            if (a02.hasActiveReactInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) a02.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rn_sentry_on_shake", null);
            }
        } catch (Throwable th2) {
            f52601t.b(EnumC4788n3.WARNING, "Failed to emit shake event.", th2);
        }
    }

    public void n0() {
    }

    public void o0(String str, Promise promise) {
        if (str != null) {
            promise.resolve(J.d(str));
        } else {
            promise.resolve(null);
        }
    }

    public void p(final ReadableMap readableMap) {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.j
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                t.a(ReadableMap.this, interfaceC4730c0);
            }
        });
    }

    public final String p0(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb3 = sb2.toString();
                    bufferedReader.close();
                    return sb3;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void q(String str) {
        f52601t.c(EnumC4788n3.ERROR, "addListener of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    public void q0(final String str) {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.r
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                interfaceC4730c0.I(str);
            }
        });
    }

    public void r(String str, ReadableMap readableMap, Promise promise) {
        boolean z10;
        byte[] a10 = io.sentry.vendor.a.a(str, 0);
        try {
        } catch (Throwable unused) {
            f52601t.c(EnumC4788n3.ERROR, "Error while capturing envelope", new Object[0]);
            promise.resolve(Boolean.FALSE);
        }
        if (readableMap.hasKey("hardCrashed") && readableMap.getBoolean("hardCrashed")) {
            z10 = false;
            H0.e(a10, z10);
            promise.resolve(Boolean.TRUE);
        }
        z10 = true;
        H0.e(a10, z10);
        promise.resolve(Boolean.TRUE);
    }

    public void r0(double d10) {
    }

    public void s(boolean z10, Promise promise) {
        AbstractC4772k2.p().i().getReplayController().A0(Boolean.valueOf(z10));
        promise.resolve(U());
    }

    public void s0() {
    }

    public void t(Promise promise) {
        Activity T10 = T();
        if (T10 == null) {
            f52601t.c(EnumC4788n3.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] F02 = F0(T10);
        if (F02 == null || F02.length == 0) {
            f52601t.c(EnumC4788n3.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b10 : F02) {
            writableNativeArray.pushInt(b10);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", ClipboardModule.MIMETYPE_PNG);
        writableNativeMap.putArray(EventKeys.DATA, writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    public boolean t0(String str) {
        J.g(str);
        return true;
    }

    public final boolean u() {
        return true;
    }

    public void u0(final String str, final String str2) {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.p
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                interfaceC4730c0.F(str, str2);
            }
        });
    }

    public void v() {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.s
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                interfaceC4730c0.z();
            }
        });
    }

    public void v0(final ReadableMap readableMap) {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.n
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                interfaceC4730c0.R(C4792o2.b(ReadableMap.this.toHashMap()));
            }
        });
    }

    public void w(Promise promise) {
        AbstractC4772k2.h();
        A();
        promise.resolve(Boolean.TRUE);
    }

    public void w0(final String str, final ReadableMap readableMap) {
        if (str == null) {
            f52601t.c(EnumC4788n3.ERROR, "RNSentry.setContext called with null key, can't change context.", new Object[0]);
        } else {
            AbstractC4772k2.i(new N1() { // from class: io.sentry.react.i
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    t.h(ReadableMap.this, str, interfaceC4730c0);
                }
            });
        }
    }

    public void x() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    public void x0(final String str, final String str2) {
        if (str == null || str2 == null) {
            f52601t.c(EnumC4788n3.ERROR, "RNSentry.setExtra called with null key or value, can't change extra.", new Object[0]);
        } else {
            AbstractC4772k2.i(new N1() { // from class: io.sentry.react.l
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    interfaceC4730c0.f(str, str2);
                }
            });
        }
    }

    public void y(Promise promise) {
        promise.resolve(AbstractC4772k2.C());
    }

    public void y0(final String str, final String str2) {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.q
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                interfaceC4730c0.e(str, str2);
            }
        });
    }

    public final Runnable z() {
        return new Runnable() { // from class: io.sentry.react.h
            @Override // java.lang.Runnable
            public final void run() {
                t.this.k0();
            }
        };
    }

    public void z0(final ReadableMap readableMap, final ReadableMap readableMap2) {
        AbstractC4772k2.i(new N1() { // from class: io.sentry.react.e
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                t.n(ReadableMap.this, readableMap2, interfaceC4730c0);
            }
        });
    }
}
