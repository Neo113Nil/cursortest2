package androidx.appcompat.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.Choreographer;
import android.view.View;
import com.google.firebase.messaging.FirebaseMessaging;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0075cd;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.impl.C0207hg;
import io.appmetrica.analytics.impl.C0232ig;
import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.InterfaceC0483sg;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.ILogger;
import io.sentry.SpotlightIntegration;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.e1;
import io.sentry.i1;
import io.sentry.n6;
import io.sentry.ndk.NativeScope;
import io.sentry.x3;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f345c;

    public /* synthetic */ t(int i5, Object obj, Object obj2) {
        this.f343a = i5;
        this.f344b = obj;
        this.f345c = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [gf.i, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f343a) {
            case 0:
                k2.a0 a0Var = (k2.a0) this.f344b;
                Runnable runnable = (Runnable) this.f345c;
                a0Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    a0Var.c();
                }
            case 1:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) this.f344b, (ProductInfo) this.f345c);
                return;
            case 2:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.n) this.f344b, (RequestConfig) this.f345c);
                return;
            case 3:
                ((com.google.firebase.messaging.m) this.f344b).a((Intent) this.f345c);
                return;
            case 4:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f344b;
                w7.g gVar = (w7.g) this.f345c;
                h9.c cVar = FirebaseMessaging.f6059l;
                try {
                    gVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    gVar.a(e7);
                    return;
                }
            case 5:
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f344b;
                w7.g gVar2 = (w7.g) this.f345c;
                try {
                    gVar2.b(sVar.c());
                    return;
                } catch (Exception e9) {
                    gVar2.a(e9);
                    return;
                }
            case 6:
                com.logrocket.core.d dVar = (com.logrocket.core.d) this.f344b;
                String str2 = (String) this.f345c;
                dVar.f6417e = str2;
                String str3 = "";
                Activity activity = dVar.f6416d;
                if (activity != null) {
                    str = activity.getPackageName();
                    if (dVar.f6418f) {
                        str3 = "" + dVar.f6416d.getLocalClassName();
                    }
                } else {
                    str = "";
                }
                if (!str2.isEmpty()) {
                    StringBuilder b10 = v.f.b(str3);
                    if (!str3.isEmpty()) {
                        str2 = "/".concat(str2);
                    }
                    b10.append(str2);
                    str3 = b10.toString();
                }
                xg.b v5 = xg.c.v();
                v5.d();
                xg.c.q((xg.c) v5.f6816b, str);
                v5.d();
                xg.c.r((xg.c) v5.f6816b, str3);
                v5.d();
                xg.c.p((xg.c) v5.f6816b, 8);
                dVar.f6413a.b(6, v5, null, true, null);
                return;
            case 7:
                com.android.billingclient.api.i iVar = (com.android.billingclient.api.i) this.f344b;
                File[] fileArr = (File[]) this.f345c;
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) iVar.f4028b;
                for (File file : fileArr) {
                    try {
                        cVar2.getClass();
                        JSONObject jSONObject = new JSONArray(io.sentry.internal.debugmeta.c.p(file)).getJSONObject(0);
                        boolean z5 = jSONObject.getLong("age") > System.currentTimeMillis() - 604800000;
                        String string = jSONObject.getString("appID");
                        if (!z5) {
                            if (!file.delete()) {
                                throw new IOException("Failed to delete crash report file " + file.getName());
                            }
                        } else if (((com.logrocket.core.e) iVar.f4029c).f(file, string) && !file.delete()) {
                            throw new IOException("Failed to delete crash report file " + file.getName());
                        }
                    } catch (IOException e10) {
                        e = e10;
                        ((ba.d) iVar.f4030d).f("Error while sending pending crash report", e);
                    } catch (RuntimeException e11) {
                        e = e11;
                        ((ba.d) iVar.f4030d).f("Error while sending pending crash report", e);
                    } catch (JSONException e12) {
                        e = e12;
                        ((ba.d) iVar.f4030d).f("Error while sending pending crash report", e);
                    }
                }
                return;
            case 8:
                com.android.billingclient.api.i iVar2 = (com.android.billingclient.api.i) this.f344b;
                Throwable th2 = (Throwable) this.f345c;
                ba.d dVar2 = (ba.d) iVar2.f4030d;
                com.logrocket.core.e eVar = (com.logrocket.core.e) iVar2.f4029c;
                try {
                    byte[] e13 = eVar.e(th2);
                    if (eVar.c(((com.logrocket.core.f0) eVar.f6422c).f6445a, e13)) {
                        return;
                    }
                    ci.c.e0(((io.sentry.internal.debugmeta.c) iVar2.f4028b).g(), e13);
                    return;
                } catch (IOException e14) {
                    e = e14;
                    dVar2.f("Error while attempting to upload crash report", e);
                    return;
                } catch (RuntimeException e15) {
                    e = e15;
                    dVar2.f("Error while attempting to upload crash report", e);
                    return;
                } catch (JSONException e16) {
                    dVar2.f("Error while building crash report body", e16);
                    return;
                }
            case 9:
                com.logrocket.core.graphics.e eVar2 = (com.logrocket.core.graphics.e) this.f344b;
                String obj = ((Editable) this.f345c).toString();
                com.logrocket.core.g gVar3 = (com.logrocket.core.g) eVar2.f6529b.get();
                if (gVar3 == null || obj.isEmpty() || obj.equals(eVar2.f6531d)) {
                    return;
                }
                xg.d r5 = xg.e.r();
                r5.d();
                xg.e.p((xg.e) r5.f6816b, obj);
                ArrayList arrayList = eVar2.f6530c;
                r5.d();
                xg.e.q((xg.e) r5.f6816b, arrayList);
                gVar3.b(13, r5, null, true, null);
                eVar2.f6531d = obj;
                return;
            case 10:
                e.j jVar = (e.j) this.f344b;
                jVar.f3250a.a(new a2.g(2, (e.d0) this.f345c, jVar));
                return;
            case 11:
                ((f0.j) this.f344b).onFontRetrieved((Typeface) this.f345c);
                return;
            case 12:
                f3.f fVar = (f3.f) this.f344b;
                m3.j jVar2 = (m3.j) this.f345c;
                synchronized (fVar.f9362k) {
                    try {
                        Iterator it = fVar.j.iterator();
                        while (it.hasNext()) {
                            ((f3.c) it.next()).a(jVar2, false);
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                ((eg.l) this.f344b).C((fg.e) this.f345c, Unit.f19194a);
                return;
            case 14:
                ((l1.a) ((g3.d) this.f344b).f9736c).D((f3.k) this.f345c, 3);
                return;
            case 15:
                Db.a((Db) this.f344b, (V) this.f345c);
                return;
            case 16:
                L0.a((L0) this.f344b, (PluginErrorDetails) this.f345c);
                return;
            case 17:
                C0075cd.a((C0075cd) this.f344b, (List) this.f345c);
                return;
            case 18:
                C0207hg.a((C0232ig) this.f344b, (InterfaceC0483sg) this.f345c);
                return;
            case 19:
                C0232ig.b((InterfaceC0483sg) this.f344b, (Throwable) this.f345c);
                return;
            case 20:
                ((e1) this.f345c).d(((x3) this.f344b).m().getShutdownTimeoutMillis());
                return;
            case 21:
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.f344b;
                l1.a aVar = (l1.a) this.f345c;
                try {
                    b6 b6Var = spotlightIntegration.f15424a;
                    if (b6Var == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    HttpURLConnection k6 = SpotlightIntegration.k(b6Var.getSpotlightConnectionUrl() != null ? spotlightIntegration.f15424a.getSpotlightConnectionUrl() : io.sentry.util.h.f17164a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream");
                    try {
                        OutputStream outputStream = k6.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                spotlightIntegration.f15424a.getSerializer().e(aVar, gZIPOutputStream);
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                spotlightIntegration.f15425b.h(b5.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(k6.getResponseCode()));
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th3) {
                        try {
                            spotlightIntegration.f15425b.e(b5.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th3);
                            spotlightIntegration.f15425b.h(b5.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(k6.getResponseCode()));
                        } catch (Throwable th4) {
                            spotlightIntegration.f15425b.h(b5.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(k6.getResponseCode()));
                            SpotlightIntegration.c(k6);
                            throw th4;
                        }
                    }
                    SpotlightIntegration.c(k6);
                    return;
                } catch (Exception e17) {
                    spotlightIntegration.f15425b.e(b5.ERROR, "An exception occurred while creating the connection to spotlight.", e17);
                    return;
                }
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                ActivityLifecycleIntegration.k((i1) this.f344b, (i1) this.f345c);
                return;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                AnrIntegration anrIntegration = (AnrIntegration) this.f344b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f345c;
                io.sentry.r a7 = anrIntegration.f15469c.a();
                try {
                    if (!anrIntegration.f15468b) {
                        anrIntegration.c(sentryAndroidOptions);
                    }
                    a7.close();
                    return;
                } finally {
                }
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                ((io.sentry.android.core.h0) this.f344b).k((ILogger) this.f345c);
                return;
            case C0122e9.F /* 25 */:
                io.sentry.android.core.internal.util.p pVar = (io.sentry.android.core.internal.util.p) this.f344b;
                io.sentry.android.core.v vVar = (io.sentry.android.core.v) this.f345c;
                try {
                    pVar.j = Choreographer.getInstance();
                    return;
                } catch (Throwable th5) {
                    vVar.e(b5.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th5);
                    return;
                }
            case C0122e9.G /* 26 */:
                io.sentry.android.ndk.c cVar3 = (io.sentry.android.ndk.c) this.f344b;
                io.sentry.e eVar3 = (io.sentry.e) this.f345c;
                b6 b6Var2 = cVar3.f15919a;
                b5 b5Var = eVar3.f16338i;
                String str4 = null;
                String lowerCase = b5Var != null ? b5Var.name().toLowerCase(Locale.ROOT) : null;
                String u10 = com.google.android.play.core.appupdate.b.u(eVar3.b());
                try {
                    ConcurrentHashMap concurrentHashMap = eVar3.f16335f;
                    if (!concurrentHashMap.isEmpty()) {
                        str4 = b6Var2.getSerializer().b(concurrentHashMap);
                    }
                } catch (Throwable th6) {
                    b6Var2.getLogger().b(b5.ERROR, th6, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str5 = str4;
                NativeScope nativeScope = cVar3.f15920b;
                String str6 = eVar3.f16333d;
                String str7 = eVar3.f16336g;
                String str8 = eVar3.f16334e;
                nativeScope.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str6, str7, str8, u10, str5);
                return;
            case C0122e9.H /* 27 */:
                io.sentry.android.ndk.c cVar4 = (io.sentry.android.ndk.c) this.f344b;
                n6 n6Var = (n6) this.f345c;
                NativeScope nativeScope2 = cVar4.f15920b;
                String vVar2 = n6Var.f16667a.toString();
                String p6Var = n6Var.f16668b.toString();
                nativeScope2.getClass();
                NativeScope.nativeSetTrace(vVar2, p6Var);
                return;
            case 28:
                File file2 = (File) this.f344b;
                io.sentry.android.replay.capture.g gVar4 = (io.sentry.android.replay.capture.g) this.f345c;
                io.sentry.config.a.g(file2);
                gVar4.l(-1);
                return;
            default:
                io.sentry.android.replay.screenshot.g gVar5 = (io.sentry.android.replay.screenshot.g) this.f344b;
                io.sentry.android.replay.viewhierarchy.f fVar2 = (io.sentry.android.replay.viewhierarchy.f) this.f345c;
                AtomicBoolean atomicBoolean = gVar5.f16106m;
                b6 b6Var3 = gVar5.f16096b;
                Bitmap bitmap = gVar5.f16101g;
                if (atomicBoolean.get() || bitmap.isRecycled()) {
                    b6Var3.getLogger().h(b5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) gVar5.f16103i.getValue());
                fVar2.a(new f2.a(gVar5, arrayList2, canvas));
                b6Var3.getReplayController().getClass();
                gVar5.f16095a.O(bitmap);
                gVar5.j.set(true);
                gVar5.f16105l.set(false);
                return;
        }
    }

    public /* synthetic */ t(ActivityLifecycleIntegration activityLifecycleIntegration, i1 i1Var, i1 i1Var2) {
        this.f343a = 22;
        this.f344b = i1Var;
        this.f345c = i1Var2;
    }

    public /* synthetic */ t(io.sentry.android.replay.screenshot.g gVar, io.sentry.android.replay.viewhierarchy.f fVar, View view) {
        this.f343a = 29;
        this.f344b = gVar;
        this.f345c = fVar;
    }
}
