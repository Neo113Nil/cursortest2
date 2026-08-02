package aa;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.q4;
import androidx.core.app.FrameMetricsAggregator;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.g0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.transition.w;
import b6.p;
import com.appsflyer.AFLogger;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.firebase.messaging.j0;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.e0;
import com.logrocket.core.f0;
import com.logrocket.core.h0;
import com.logrocket.core.x;
import com.sports.insider.data.repository.room.live.LiveTable;
import eg.e1;
import io.appmetrica.analytics.impl.C0090d2;
import io.appmetrica.analytics.impl.C0112e;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.impl.C0493t1;
import io.appmetrica.analytics.impl.C0617y0;
import io.appmetrica.analytics.impl.ap;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.android.core.w0;
import io.sentry.d4;
import io.sentry.protocol.DebugImage;
import java.io.File;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90b;

    public /* synthetic */ c(int i5, Object obj) {
        this.f89a = i5;
        this.f90b = obj;
    }

    private final void a() {
        c4.d dVar = (c4.d) this.f90b;
        synchronized (((ArrayDeque) dVar.f3580e)) {
            SharedPreferences.Editor edit = ((SharedPreferences) dVar.f3577b).edit();
            String str = (String) dVar.f3578c;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) dVar.f3580e).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) dVar.f3579d);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    private final void b() {
        a0 a0Var = (a0) this.f90b;
        synchronized (a0Var) {
            try {
                if (((WeakHashMap) a0Var.f681c).isEmpty()) {
                    return;
                }
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((WeakHashMap) a0Var.f681c).entrySet()) {
                    View view = (View) entry.getKey();
                    com.logrocket.core.graphics.h hVar = (com.logrocket.core.graphics.h) entry.getValue();
                    int scrollX = view.getScrollX();
                    int scrollY = view.getScrollY();
                    if (view instanceof AbsListView) {
                        int firstVisiblePosition = ((AbsListView) view).getFirstVisiblePosition();
                        if (firstVisiblePosition == hVar.f6554b) {
                            hashSet.add(view);
                        } else {
                            ((WeakHashMap) a0Var.f681c).put(view, new com.logrocket.core.graphics.h(0, firstVisiblePosition));
                        }
                    } else {
                        if (!(view instanceof ScrollView) && !(view instanceof HorizontalScrollView)) {
                            if (a0Var.e(view) != 1) {
                                hashSet.add(view);
                            }
                        }
                        if (hVar.f6553a == scrollX && hVar.f6554b == scrollY) {
                            hashSet.add(view);
                        } else {
                            ((WeakHashMap) a0Var.f681c).put(view, new com.logrocket.core.graphics.h(scrollX, scrollY));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((WeakHashMap) a0Var.f681c).remove((View) it.next());
                }
                if (((WeakHashMap) a0Var.f681c).isEmpty()) {
                    ExecutorService executorService = e0.f6424a;
                    LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
                    if (maybeGetInstance != null) {
                        x xVar = maybeGetInstance.f6386i;
                        if (xVar.f6655l.compareAndSet(true, false)) {
                            xVar.c(true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x060e A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i5;
        long j;
        boolean z5;
        boolean z7;
        Object obj;
        HttpURLConnection httpURLConnection;
        JSONObject jSONObject;
        View d10;
        int width;
        int i10 = 3;
        boolean z10 = false;
        HttpURLConnection httpURLConnection2 = null;
        switch (this.f89a) {
            case 0:
                g gVar = (g) this.f90b;
                synchronized (gVar.f101h) {
                    try {
                        gVar.f96c.run();
                        synchronized (gVar.f100g) {
                            gVar.f99f = null;
                        }
                        i5 = gVar.f95b;
                    } catch (Throwable th2) {
                        try {
                            th2.printStackTrace();
                            synchronized (gVar.f100g) {
                                gVar.f99f = null;
                                i5 = gVar.f95b;
                            }
                        } catch (Throwable th3) {
                            synchronized (gVar.f100g) {
                                gVar.f99f = null;
                                gVar.a(gVar.f95b);
                                throw th3;
                            }
                        }
                    }
                    gVar.a(i5);
                }
                return;
            case 1:
                ((p) this.f90b).c();
                return;
            case 2:
                androidx.dynamicanimation.animation.d dVar = (androidx.dynamicanimation.animation.d) ((androidx.dynamicanimation.animation.d) this.f90b).f1775c.f10430b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = dVar.f1774b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    androidx.dynamicanimation.animation.l lVar = (androidx.dynamicanimation.animation.l) arrayList.get(i11);
                    if (lVar != null) {
                        s.n nVar = dVar.f1773a;
                        Long l6 = (Long) nVar.get(lVar);
                        if (l6 != null) {
                            if (l6.longValue() < uptimeMillis2) {
                                nVar.remove(lVar);
                            }
                        }
                        long j6 = lVar.f1800i;
                        if (j6 == 0) {
                            lVar.f1800i = uptimeMillis;
                            lVar.c(lVar.f1793b);
                        } else {
                            long j10 = uptimeMillis - j6;
                            lVar.f1800i = uptimeMillis;
                            float f6 = androidx.dynamicanimation.animation.l.b().f1779g;
                            long j11 = f6 == 0.0f ? 2147483647L : (long) (j10 / f6);
                            if (lVar.f1805o) {
                                float f10 = lVar.f1804n;
                                if (f10 != Float.MAX_VALUE) {
                                    lVar.f1803m.f1814i = f10;
                                    lVar.f1804n = Float.MAX_VALUE;
                                }
                                lVar.f1793b = (float) lVar.f1803m.f1814i;
                                lVar.f1792a = 0.0f;
                                lVar.f1805o = z10;
                                j = uptimeMillis2;
                            } else {
                                if (lVar.f1804n != Float.MAX_VALUE) {
                                    j = uptimeMillis2;
                                    long j12 = j11 / 2;
                                    androidx.dynamicanimation.animation.g c2 = lVar.f1803m.c(lVar.f1793b, lVar.f1792a, j12);
                                    androidx.dynamicanimation.animation.m mVar = lVar.f1803m;
                                    mVar.f1814i = lVar.f1804n;
                                    lVar.f1804n = Float.MAX_VALUE;
                                    androidx.dynamicanimation.animation.g c8 = mVar.c(c2.f1783a, c2.f1784b, j12);
                                    lVar.f1793b = c8.f1783a;
                                    lVar.f1792a = c8.f1784b;
                                } else {
                                    j = uptimeMillis2;
                                    androidx.dynamicanimation.animation.g c10 = lVar.f1803m.c(lVar.f1793b, lVar.f1792a, j11);
                                    lVar.f1793b = c10.f1783a;
                                    lVar.f1792a = c10.f1784b;
                                }
                                float max = Math.max(lVar.f1793b, lVar.f1799h);
                                lVar.f1793b = max;
                                lVar.f1793b = Math.min(max, lVar.f1798g);
                                float f11 = lVar.f1792a;
                                androidx.dynamicanimation.animation.m mVar2 = lVar.f1803m;
                                mVar2.getClass();
                                if (Math.abs(f11) >= mVar2.f1810e || Math.abs(r6 - ((float) mVar2.f1814i)) >= mVar2.f1809d) {
                                    z5 = false;
                                    float min = Math.min(lVar.f1793b, lVar.f1798g);
                                    lVar.f1793b = min;
                                    float max2 = Math.max(min, lVar.f1799h);
                                    lVar.f1793b = max2;
                                    lVar.c(max2);
                                    if (!z5) {
                                        ArrayList arrayList2 = lVar.f1801k;
                                        lVar.f1797f = false;
                                        androidx.dynamicanimation.animation.d b10 = androidx.dynamicanimation.animation.l.b();
                                        b10.f1773a.remove(lVar);
                                        ArrayList arrayList3 = b10.f1774b;
                                        int indexOf = arrayList3.indexOf(lVar);
                                        if (indexOf >= 0) {
                                            arrayList3.set(indexOf, null);
                                            b10.f1778f = true;
                                        }
                                        lVar.f1800i = 0L;
                                        lVar.f1794c = false;
                                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                            if (arrayList2.get(i12) != null) {
                                                ((w) ((androidx.dynamicanimation.animation.h) arrayList2.get(i12))).a(lVar.f1793b);
                                            }
                                        }
                                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                    }
                                    i11++;
                                    uptimeMillis2 = j;
                                    z10 = false;
                                } else {
                                    lVar.f1793b = (float) lVar.f1803m.f1814i;
                                    lVar.f1792a = 0.0f;
                                }
                            }
                            z5 = true;
                            float min2 = Math.min(lVar.f1793b, lVar.f1798g);
                            lVar.f1793b = min2;
                            float max22 = Math.max(min2, lVar.f1799h);
                            lVar.f1793b = max22;
                            lVar.c(max22);
                            if (!z5) {
                            }
                            i11++;
                            uptimeMillis2 = j;
                            z10 = false;
                        }
                    }
                    j = uptimeMillis2;
                    i11++;
                    uptimeMillis2 = j;
                    z10 = false;
                }
                if (dVar.f1778f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        dVar.f1780h.a();
                    }
                    dVar.f1778f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) dVar.f1777e.f25409a).postFrameCallback(new androidx.dynamicanimation.animation.c(dVar.f1776d));
                    return;
                }
                return;
            case 3:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f90b;
                g0 g0Var = processLifecycleOwner.f2130f;
                if (processLifecycleOwner.f2126b == 0) {
                    z7 = true;
                    processLifecycleOwner.f2127c = true;
                    g0Var.e(androidx.lifecycle.w.ON_PAUSE);
                } else {
                    z7 = true;
                }
                if (processLifecycleOwner.f2125a == 0 && processLifecycleOwner.f2127c) {
                    g0Var.e(androidx.lifecycle.w.ON_STOP);
                    processLifecycleOwner.f2128d = z7;
                    return;
                }
                return;
            case 4:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f90b;
                int[] iArr = SwipeRefreshLayout.K;
                swipeRefreshLayout.f();
                return;
            case 5:
                Activity activity = (Activity) this.f90b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = c0.c.f3243g;
                Method method = c0.c.f3242f;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i13 != 26 && i13 != 27) || method != null) && (c0.c.f3241e != null || c0.c.f3240d != null)) {
                    try {
                        Object obj2 = c0.c.f3239c.get(activity);
                        if (obj2 != null && (obj = c0.c.f3238b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            c0.b bVar = new c0.b(activity);
                            application.registerActivityLifecycleCallbacks(bVar);
                            handler.post(new g8.a(i10, bVar, obj2));
                            int i14 = 4;
                            try {
                                if (i13 == 26 || i13 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new g8.a(i14, application, bVar));
                                return;
                            } finally {
                                handler.post(new g8.a(i14, application, bVar));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 6:
                AFLogger.getMonetizationNetwork((Function1) this.f90b);
                return;
            case 7:
                ((MaterialButton) this.f90b).lambda$setOpticalCenterEnabled$1();
                return;
            case 8:
                ((CarouselLayoutManager) this.f90b).refreshKeylineState();
                return;
            case 9:
                ((MaterialBackOrchestrator) this.f90b).startListeningForBackCallbacksWithPriorityOverlay();
                return;
            case 10:
                a();
                return;
            case 11:
                j0 j0Var = (j0) this.f90b;
                w0.m("FirebaseMessaging", "Service took too long to process intent: " + j0Var.f6145a.getAction() + " finishing.");
                j0Var.f6146b.d(null);
                return;
            case 12:
                com.logrocket.core.d dVar2 = (com.logrocket.core.d) this.f90b;
                dVar2.f6415c.put(dVar2.f6416d, Boolean.TRUE);
                dVar2.f6414b.o("onActivityStarted: ".concat(com.logrocket.core.d.a(dVar2.f6416d)));
                dVar2.b(dVar2.f6416d, 2);
                return;
            case 13:
                Throwable th4 = (Throwable) this.f90b;
                try {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        JSONArray jSONArray2 = new JSONArray();
                        StackTraceElement[] stackTrace = th4.getStackTrace();
                        for (int length = stackTrace.length - 1; length >= 0; length--) {
                            StackTraceElement stackTraceElement = stackTrace[length];
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("filename", stackTraceElement.getFileName());
                            if (stackTraceElement.getLineNumber() >= 0) {
                                jSONObject5.put("lineno", stackTraceElement.getLineNumber());
                            }
                            jSONObject5.put("function", stackTraceElement.getMethodName());
                            jSONObject5.put("module", stackTraceElement.getClassName());
                            jSONArray2.put(jSONObject5);
                        }
                        jSONObject4.put("frames", jSONArray2);
                        jSONObject2.put("type", th4.getClass().getCanonicalName());
                        jSONObject2.put("stacktrace", jSONObject4);
                        jSONObject2.put("value", th4.getMessage());
                        jSONArray.put(jSONObject2);
                        jSONObject3.put("values", jSONArray);
                        jSONObject.put(LiveTable.messageColumn, th4.getMessage());
                        jSONObject.put("logger", "java");
                        jSONObject.put("platform", "java");
                        jSONObject.put("release", "1.57.4");
                        jSONObject.put("environment", "production");
                        jSONObject.put("exception", jSONObject3);
                        LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
                        f0 f0Var = maybeGetInstance != null ? maybeGetInstance.N : null;
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("android-version", Build.VERSION.SDK_INT);
                        jSONObject6.put(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER);
                        jSONObject6.put(CommonUrlParts.MODEL, Build.MODEL);
                        jSONObject.put("tags", jSONObject6);
                        if (f0Var != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject6.put("appID", f0Var.f6445a);
                            jSONObject7.put("recordingID", f0Var.f6446b);
                            jSONObject7.put("sessionID", f0Var.f6447c);
                            jSONObject7.put("tabID", f0Var.f6448d);
                            jSONObject.put("extra", jSONObject7);
                        }
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("type", DebugImage.PROGUARD);
                        jSONObject8.put(CommonUrlParts.UUID, "06630267-9a34-4cab-9f43-798c8654a9c9");
                        JSONArray jSONArray3 = new JSONArray();
                        jSONArray3.put(jSONObject8);
                        JSONObject jSONObject9 = new JSONObject();
                        jSONObject9.put("images", jSONArray3);
                        jSONObject.put("debug_meta", jSONObject9);
                        URL url = new URL("https://e.logrocket.com/api/2/store/?sentry_version=7&sentry_client=http%2F3.8.0&sentry_key=5a3c8ceabdec4a959f554bfaa7448f9f");
                        Proxy proxy = h0.f6587b;
                        httpURLConnection = proxy == null ? (HttpURLConnection) url.openConnection() : (HttpURLConnection) url.openConnection(proxy);
                    } catch (Throwable unused2) {
                        httpURLConnection = null;
                    }
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json");
                        httpURLConnection.setRequestProperty("Origin", "https://app.logrocket.com");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setConnectTimeout(2000);
                        httpURLConnection.setReadTimeout(2000);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
                        outputStreamWriter.write(jSONObject.toString());
                        outputStreamWriter.flush();
                        h0.a(httpURLConnection);
                        httpURLConnection.disconnect();
                    } catch (Throwable unused3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable unused4) {
                    return;
                }
            case 14:
                String str = (String) this.f90b;
                try {
                    try {
                        URL url2 = new URL("https://r.logrocket.io/s");
                        Proxy proxy2 = h0.f6587b;
                        httpURLConnection2 = proxy2 == null ? (HttpURLConnection) url2.openConnection() : (HttpURLConnection) url2.openConnection(proxy2);
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setConnectTimeout(2000);
                        httpURLConnection2.setReadTimeout(2000);
                        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(httpURLConnection2.getOutputStream());
                        outputStreamWriter2.write(str);
                        outputStreamWriter2.flush();
                        h0.a(httpURLConnection2);
                        httpURLConnection2.disconnect();
                        return;
                    } catch (Throwable unused5) {
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                            return;
                        }
                        return;
                    }
                } catch (Throwable unused6) {
                    return;
                }
            case 15:
                b();
                return;
            case 16:
                e.g gVar2 = (e.g) this.f90b;
                Runnable runnable = gVar2.f8409b;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    gVar2.f8409b = null;
                    return;
                }
                return;
            case 17:
                e.l.a((e.l) this.f90b);
                return;
            case 18:
                e1 e1Var = (e1) this.f90b;
                if (e1Var != null) {
                    e1Var.k(null);
                    return;
                }
                return;
            case 19:
                ((DrawerLayout) this.f90b).c(false);
                return;
            case 20:
                i1.f fVar = (i1.f) this.f90b;
                DrawerLayout drawerLayout = fVar.f10863d;
                int i15 = fVar.f10861b.f1564o;
                int i16 = fVar.f10860a;
                Object[] objArr = i16 == 3;
                if (objArr == true) {
                    d10 = drawerLayout.d(3);
                    width = (d10 != null ? -d10.getWidth() : 0) + i15;
                } else {
                    d10 = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i15;
                }
                if (d10 != null) {
                    if (((!objArr == true || d10.getLeft() >= width) && (objArr == true || d10.getLeft() <= width)) || drawerLayout.f(d10) != 0) {
                        return;
                    }
                    i1.d dVar3 = (i1.d) d10.getLayoutParams();
                    fVar.f10861b.s(d10, width, d10.getTop());
                    dVar3.f10858c = true;
                    drawerLayout.invalidate();
                    View d11 = drawerLayout.d(i16 != 3 ? 3 : 5);
                    if (d11 != null) {
                        drawerLayout.b(d11, true);
                    }
                    if (drawerLayout.f1755t) {
                        return;
                    }
                    long uptimeMillis3 = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis3, uptimeMillis3, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i17 = 0; i17 < childCount; i17++) {
                        drawerLayout.getChildAt(i17).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    drawerLayout.f1755t = true;
                    return;
                }
                return;
            case 21:
                C0090d2.a((C0090d2) this.f90b);
                return;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                ((C0112e) this.f90b).a();
                return;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                ((C0493t1) this.f90b).e();
                return;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                C0493t1.a((Object[]) this.f90b);
                return;
            case C0122e9.F /* 25 */:
                ((C0617y0) this.f90b).o();
                return;
            case C0122e9.G /* 26 */:
                File[] listFiles = ((File) this.f90b).listFiles();
                if (listFiles == null) {
                    return;
                }
                for (File file : listFiles) {
                    if (file.lastModified() < d4.f16311f - TimeUnit.MINUTES.toMillis(5L)) {
                        io.sentry.config.a.g(file);
                    }
                }
                return;
            case C0122e9.H /* 27 */:
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f90b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) xVar.f6182a;
                for (int i18 = 0; i18 < 40; i18++) {
                    try {
                        scheduledThreadPoolExecutor.schedule((d) xVar.f6184c, 365L, TimeUnit.DAYS).cancel(true);
                    } catch (RejectedExecutionException unused7) {
                        return;
                    }
                }
                scheduledThreadPoolExecutor.purge();
                return;
            case 28:
                io.sentry.android.core.a aVar = (io.sentry.android.core.a) this.f90b;
                aVar.f15533h = SystemClock.uptimeMillis();
                aVar.f15534i.set(false);
                return;
            default:
                ((FrameMetricsAggregator) ((io.sentry.util.f) ((q4) this.f90b).f892b).a()).f1255a.s();
                return;
        }
    }

    public /* synthetic */ c(io.sentry.android.core.a aVar, ap apVar) {
        this.f89a = 28;
        this.f90b = aVar;
    }
}
