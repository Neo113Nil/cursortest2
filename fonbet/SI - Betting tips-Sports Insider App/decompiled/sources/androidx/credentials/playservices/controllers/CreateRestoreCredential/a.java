package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import android.app.usage.UsageStatsManager;
import android.content.Intent;
import android.graphics.Canvas;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.v0;
import androidx.drawerlayout.widget.DrawerLayout;
import c5.c;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.firebase.messaging.h0;
import com.google.firebase.messaging.j0;
import com.google.gson.internal.l;
import com.google.gson.internal.q;
import com.sports.insider.MyApp;
import d5.m;
import eg.g0;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.C0064c2;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.impl.C0519u2;
import io.appmetrica.analytics.impl.EnumC0569w2;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.location.impl.u;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.o0;
import io.sentry.android.core.q0;
import io.sentry.android.core.u0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.b6;
import io.sentry.i6;
import io.sentry.j6;
import io.sentry.k;
import io.sentry.k1;
import io.sentry.l6;
import io.sentry.m6;
import io.sentry.o6;
import io.sentry.u3;
import io.sentry.w6;
import io.sentry.z0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.o;
import rh.g;
import u.h;
import u.i;
import v8.e;
import w7.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, o, MaterialShapeDrawable.OnCornerSizeChangeListener, CanvasCompat.CanvasOperation, OnCompleteListener, l, FunctionWithThrowable, i, ActivationBarrierCallback, o6, u3, io.sentry.util.runtime.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1514b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f1513a = i5;
        this.f1514b = obj;
    }

    @Override // u.i
    public Object a(h completer) {
        g0 this_asListenableFuture = (g0) this.f1514b;
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.J(new f2.a(0, completer, this_asListenableFuture));
        return "Deferred.asListenableFuture";
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        EnumC0569w2 a7;
        switch (this.f1513a) {
            case 16:
                return u.a((u) this.f1514b, (LocationManager) obj);
            default:
                a7 = C0519u2.a((C0064c2) this.f1514b, (UsageStatsManager) obj);
                return a7;
        }
    }

    public c5.b b(v0 v0Var) {
        c cVar = (c) this.f1514b;
        URL url = (URL) v0Var.f364b;
        String w10 = ci.c.w("CctTransportBackend");
        if (Log.isLoggable(w10, 4)) {
            Log.i(w10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f3650g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) v0Var.f366d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    r7.a aVar = cVar.f3644a;
                    d5.i iVar = (d5.i) v0Var.f365c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    v8.d dVar = (v8.d) aVar.f22318b;
                    e eVar = new e(bufferedWriter, dVar.f24458a, dVar.f24459b, dVar.f24460c, dVar.f24461d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f24463b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String w11 = ci.c.w("CctTransportBackend");
                    if (Log.isLoggable(w11, 4)) {
                        Log.i(w11, String.format("Status Code: %d", valueOf));
                    }
                    ci.c.m(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    ci.c.m(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c5.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c5.b bVar = new c5.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f8233a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e7) {
            e = e7;
            ci.c.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c5.b(500, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            ci.c.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c5.b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            ci.c.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c5.b(400, null, 0L);
        } catch (t8.b e11) {
            e = e11;
            ci.c.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c5.b(400, null, 0L);
        }
    }

    @Override // io.sentry.o6
    public void c(m6 m6Var) {
        j6 j6Var = (j6) this.f1514b;
        k kVar = j6Var.q;
        if (kVar != null) {
            kVar.b(m6Var);
        }
        i6 i6Var = j6Var.f16573f;
        w6 w6Var = j6Var.f16583r;
        if (w6Var.f17239g == null) {
            if (i6Var.f16492a) {
                j6Var.x(i6Var.f16493b, null);
                return;
            }
            return;
        }
        if (w6Var.f17238f) {
            ListIterator listIterator = j6Var.f16570c.listIterator();
            while (listIterator.hasNext()) {
                m6 m6Var2 = (m6) listIterator.next();
                if (!m6Var2.f16652g && m6Var2.f16647b == null) {
                    return;
                }
            }
        }
        j6Var.t();
    }

    @Override // com.google.gson.internal.l
    public Object d() {
        int i5 = this.f1513a;
        Object obj = this.f1514b;
        switch (i5) {
            case 10:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e7) {
                    g gVar = q9.c.f22069a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
                } catch (InstantiationException e9) {
                    throw new RuntimeException("Failed to invoke constructor '" + q9.c.b(constructor) + "' with no args", e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + q9.c.b(constructor) + "' with no args", e10.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return q.f6350a.a(cls);
                } catch (Exception e11) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
                }
        }
    }

    public void e(b6 b6Var) {
        MyApp myApp = (MyApp) this.f1514b;
        SentryAndroidOptions options = (SentryAndroidOptions) b6Var;
        jg.d dVar = MyApp.f6830c;
        Intrinsics.checkNotNullParameter(options, "options");
        boolean z5 = false;
        boolean z7 = Build.VERSION.SDK_INT >= 28;
        if (System.currentTimeMillis() < 1764536400000L && z7) {
            z5 = true;
        }
        options.setEnabled(true);
        options.setEnableAutoSessionTracking(z5);
        options.setAnrEnabled(z5);
        options.setAnrReportInDebug(z5);
        options.setReportHistoricalAnrs(z5);
        options.setAttachAnrThreadDump(z5);
        options.setTracesSampleRate(Double.valueOf(z5 ? 0.2d : 0.05d));
        options.setEnableAppStartProfiling(z5);
        options.setProfilesSampleRate(Double.valueOf(z5 ? 0.2d : 0.05d));
        options.addIntegration(new FragmentLifecycleIntegration(myApp, z5, z5));
        options.setDist(String.valueOf(123));
        options.setRelease("1.2.44.123");
        options.setAnrTimeoutIntervalMillis(5000L);
        options.setSessionTrackingIntervalMillis(30000L);
        options.setBeforeSend(new com.google.firebase.messaging.k(14));
    }

    @Override // io.sentry.u3
    public void g(z0 z0Var) {
        l6 v5;
        switch (this.f1513a) {
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                z0Var.K(new com.google.firebase.messaging.g(8, (k1) this.f1514b, z0Var));
                break;
            case 28:
                AtomicLong atomicLong = ((io.sentry.android.core.v0) this.f1514b).f15865a;
                if (atomicLong.get() == 0 && (v5 = z0Var.v()) != null && v5.c() != null) {
                    atomicLong.set(v5.c().getTime());
                    break;
                }
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1514b;
                l6 v10 = z0Var.v();
                if (v10 != null && v10.c() != null) {
                    atomicBoolean.set(true);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f1513a) {
            case 7:
                h0.b((Intent) this.f1514b);
                break;
            case 8:
                ((j0) this.f1514b).f6146b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f1514b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable.OnCornerSizeChangeListener
    public void onCornerSizeChange(float f6) {
        ((MaterialButton) this.f1514b).lambda$setOpticalCenterEnabled$0(f6);
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        switch (this.f1513a) {
            case 0:
                ((Function1) this.f1514b).invoke(obj);
                break;
            default:
                ((cc.a) this.f1514b).invoke(obj);
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        I5.a((I5) this.f1514b);
    }

    @Override // q0.o
    public boolean perform(View view, q0.g gVar) {
        boolean lambda$onBottomSheetStateChanged$0;
        switch (this.f1513a) {
            case 3:
                lambda$onBottomSheetStateChanged$0 = ((BottomSheetDragHandleView) this.f1514b).lambda$onBottomSheetStateChanged$0(view, null);
                return lambda$onBottomSheetStateChanged$0;
            default:
                DrawerLayout drawerLayout = (DrawerLayout) this.f1514b;
                if (!DrawerLayout.k(view) || drawerLayout.f(view) == 2) {
                    return false;
                }
                drawerLayout.b(view, true);
                return true;
        }
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        switch (this.f1513a) {
            case 5:
                ((MaskableFrameLayout) this.f1514b).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) this.f1514b).lambda$dispatchDraw$0(canvas);
                break;
        }
    }

    public /* synthetic */ a(ActivityLifecycleIntegration activityLifecycleIntegration, k1 k1Var) {
        this.f1513a = 24;
        this.f1514b = k1Var;
    }

    @Override // io.sentry.util.runtime.a
    public Object run() {
        switch (this.f1513a) {
            case C0122e9.F /* 25 */:
                return u0.a(((io.sentry.android.core.j0) this.f1514b).f15759a);
            case C0122e9.G /* 26 */:
                return u0.a(((o0) this.f1514b).f15783a);
            default:
                return u0.a(((q0) this.f1514b).f15818a);
        }
    }
}
