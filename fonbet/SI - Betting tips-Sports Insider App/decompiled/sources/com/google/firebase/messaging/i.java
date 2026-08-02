package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.util.Log;
import f3.l0;
import io.sentry.ILogger;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.o0;
import io.sentry.android.core.q0;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.e5;
import io.sentry.g1;
import io.sentry.h4;
import io.sentry.i5;
import io.sentry.l6;
import io.sentry.r4;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6140c;

    public /* synthetic */ i(int i5, Object obj, Object obj2) {
        this.f6138a = i5;
        this.f6139b = obj;
        this.f6140c = obj2;
    }

    private final Object a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i5;
        ComponentName startService;
        Context context = (Context) this.f6139b;
        Intent intent = (Intent) this.f6140c;
        x w10 = x.w();
        w10.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) w10.f6185d).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (w10) {
            try {
                str = (String) w10.f6182a;
                if (str == null) {
                    ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                w10.f6182a = context.getPackageName() + serviceInfo.name;
                            } else {
                                w10.f6182a = serviceInfo.name;
                            }
                            str = (String) w10.f6182a;
                        }
                        w0.d("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        str = null;
                    }
                    w0.d("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (w10.z(context)) {
                startService = h0.d(context, intent2);
            } else {
                startService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                w0.d("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i5 = 404;
            } else {
                i5 = -1;
            }
        } catch (IllegalStateException e7) {
            w0.d("FirebaseMessaging", "Failed to start service while in background: " + e7);
            i5 = 402;
        } catch (SecurityException e9) {
            w0.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e9);
            i5 = 401;
        }
        return Integer.valueOf(i5);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        BufferedWriter bufferedWriter;
        ByteArrayOutputStream byteArrayOutputStream;
        switch (this.f6138a) {
            case 0:
                return a();
            case 1:
                f3.g0 g0Var = (f3.g0) this.f6139b;
                f3.j0 j0Var = (f3.j0) this.f6140c;
                m3.o oVar = j0Var.f9377a;
                String id2 = j0Var.f9379c;
                m3.s sVar = j0Var.f9385i;
                boolean z5 = true;
                boolean z7 = false;
                if (!(g0Var instanceof f3.e0)) {
                    if (g0Var instanceof f3.d0) {
                        j0Var.d(((f3.d0) g0Var).f9346a);
                        return Boolean.valueOf(z7);
                    }
                    if (!(g0Var instanceof f3.f0)) {
                        throw new gf.m();
                    }
                    int i5 = ((f3.f0) g0Var).f9363a;
                    if (Intrinsics.areEqual(oVar.f20353y, Boolean.TRUE)) {
                        String str = l0.f9396a;
                        e3.x.e().a(str, "Worker " + oVar.f20333c + " was interrupted. Backing off.");
                        j0Var.b(i5);
                    } else {
                        e3.i0 b10 = sVar.b(id2);
                        if (b10 == null || b10.a()) {
                            String str2 = l0.f9396a;
                            e3.x.e().a(str2, "Status for " + id2 + " is " + b10 + " ; not doing any work");
                            z5 = false;
                        } else {
                            String str3 = l0.f9396a;
                            e3.x.e().a(str3, "Status for " + id2 + " is " + b10 + "; not doing any work and rescheduling for later execution");
                            sVar.h(e3.i0.f8524a, id2);
                            sVar.i(i5, id2);
                            sVar.e(-1L, id2);
                        }
                    }
                    z7 = z5;
                    return Boolean.valueOf(z7);
                }
                e3.v vVar = ((f3.e0) g0Var).f9351a;
                e3.i0 b11 = sVar.b(id2);
                m3.m x10 = j0Var.f9384h.x();
                x10.getClass();
                Intrinsics.checkNotNullParameter(id2, "workSpecId");
                f3.x.n0(x10.f20327a, false, true, new a2.k(id2, 13));
                if (b11 != null) {
                    if (b11 == e3.i0.f8525b) {
                        String str4 = j0Var.f9387l;
                        if (vVar instanceof e3.u) {
                            String str5 = l0.f9396a;
                            e3.x.e().f(str5, "Worker result SUCCESS for " + str4);
                            if (oVar.c()) {
                                j0Var.c();
                            } else {
                                sVar.h(e3.i0.f8526c, id2);
                                Intrinsics.checkNotNull(vVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                                e3.j output = ((e3.u) vVar).f8564a;
                                Intrinsics.checkNotNullExpressionValue(output, "getOutputData(...)");
                                Intrinsics.checkNotNullParameter(id2, "id");
                                Intrinsics.checkNotNullParameter(output, "output");
                                f3.x.n0(sVar.f20360a, false, true, new fg.d(10, output, id2));
                                j0Var.f9382f.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                m3.c cVar = j0Var.j;
                                for (String id3 : cVar.a(id2)) {
                                    if (sVar.b(id3) == e3.i0.f8528e) {
                                        Intrinsics.checkNotNullParameter(id3, "id");
                                        if (((Boolean) f3.x.n0(cVar.f20304a, true, false, new a2.k(id3, 9))).booleanValue()) {
                                            e3.x.e().f(l0.f9396a, "Setting status to enqueued for ".concat(id3));
                                            sVar.h(e3.i0.f8524a, id3);
                                            sVar.g(currentTimeMillis, id3);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (vVar instanceof e3.t) {
                                String str6 = l0.f9396a;
                                e3.x.e().f(str6, "Worker result RETRY for " + str4);
                                j0Var.b(-256);
                                z7 = z5;
                                return Boolean.valueOf(z7);
                            }
                            String str7 = l0.f9396a;
                            e3.x.e().f(str7, "Worker result FAILURE for " + str4);
                            if (oVar.c()) {
                                j0Var.c();
                            } else {
                                if (vVar == null) {
                                    vVar = new e3.s();
                                }
                                j0Var.d(vVar);
                            }
                        }
                    } else if (!b11.a()) {
                        j0Var.b(-512);
                        z7 = z5;
                        return Boolean.valueOf(z7);
                    }
                }
                z5 = false;
                z7 = z5;
                return Boolean.valueOf(z7);
            case 2:
                g1 g1Var = (g1) this.f6139b;
                h4 h4Var = (h4) this.f6140c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, r4.f16984d));
                    try {
                        g1Var.a(h4Var, bufferedWriter2);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 3:
                g1 g1Var2 = (g1) this.f6139b;
                io.sentry.clientreport.c cVar2 = (io.sentry.clientreport.c) this.f6140c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, r4.f16984d));
                    try {
                        g1Var2.a(cVar2, bufferedWriter3);
                        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter3.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                }
            case 4:
                g1 g1Var3 = (g1) this.f6139b;
                l6 l6Var = (l6) this.f6140c;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, r4.f16984d));
                    try {
                        g1Var3.a(l6Var, bufferedWriter);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream4.close();
                        return byteArray3;
                    } finally {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th6) {
                            th.addSuppressed(th6);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream4.close();
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                    }
                }
            case 5:
                g1 g1Var4 = (g1) this.f6139b;
                e5 e5Var = (e5) this.f6140c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f16984d));
                    try {
                        g1Var4.a(e5Var, bufferedWriter4);
                        byte[] byteArray4 = byteArrayOutputStream.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream.close();
                        return byteArray4;
                    } finally {
                        try {
                            bufferedWriter4.close();
                        } catch (Throwable th8) {
                            th.addSuppressed(th8);
                        }
                    }
                } finally {
                }
            case 6:
                g1 g1Var5 = (g1) this.f6139b;
                i5 i5Var = (i5) this.f6140c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f16984d));
                    try {
                        g1Var5.a(i5Var, bufferedWriter);
                        byte[] byteArray5 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray5;
                    } finally {
                    }
                } finally {
                }
            case 7:
                return q0.c(((o0) this.f6139b).f15783a, (SentryAndroidOptions) this.f6140c);
            case 8:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.f6139b;
                Bitmap bitmap = (Bitmap) this.f6140c;
                ILogger logger = screenshotEventProcessor.f15493a.getLogger();
                byte[] bArr = null;
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream5);
                            bitmap.recycle();
                            if (byteArrayOutputStream5.size() <= 0) {
                                logger.h(b5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream5.close();
                            } else {
                                byte[] byteArray6 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                bArr = byteArray6;
                            }
                        } finally {
                        }
                    } catch (Throwable th9) {
                        logger.e(b5.ERROR, "Compressing bitmap failed.", th9);
                    }
                }
                return bArr;
            default:
                j9.d dVar = (j9.d) this.f6139b;
                j9.e eVar = (j9.e) this.f6140c;
                j9.n nVar = dVar.f18299b;
                synchronized (nVar) {
                    FileOutputStream openFileOutput = nVar.f18358a.openFileOutput(nVar.f18359b, 0);
                    try {
                        openFileOutput.write(eVar.f18302a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
        }
    }
}
