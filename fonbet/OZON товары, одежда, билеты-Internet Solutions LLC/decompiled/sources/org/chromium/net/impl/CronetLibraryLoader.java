package org.chromium.net.impl;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import gm0.C6752a;
import internal.org.jni_zero.CalledByNative;
import java.util.Locale;
import org.chromium.base.BuildInfo;
import org.chromium.base.TraceEvent;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.httpflags.c;

/* loaded from: classes6.dex */
public final class CronetLibraryLoader {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f78716b;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f78715a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final String f78717c = Nk.a.b("cronet.", ImplVersion.getCronetVersion());

    /* renamed from: d, reason: collision with root package name */
    public static final String f78718d = "CronetLibraryLoader";

    /* renamed from: e, reason: collision with root package name */
    private static final HandlerThread f78719e = new HandlerThread("CronetInit");

    /* renamed from: f, reason: collision with root package name */
    private static final ConditionVariable f78720f = new ConditionVariable();

    /* renamed from: g, reason: collision with root package name */
    private static final ConditionVariable f78721g = new ConditionVariable();

    /* JADX WARN: Removed duplicated region for block: B:10:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a() {
        vf.c.c("CronetLibraryLoader#initializeOnInitThread");
        C6752a.a(org.chromium.base.e.b());
        f78721g.open();
        NetworkChangeNotifier.init();
        c.b bVar = C6752a.a(org.chromium.base.e.b()).b().get("Cronet_UpdateNetworkStateOnlyOnceOnStartup");
        int i11 = 0;
        int i12 = 1;
        boolean z11 = !(bVar != null && bVar.c());
        NetworkChangeNotifier.i(new org.chromium.net.w(), z11);
        String a11 = C8778q.a();
        boolean equals = a11.equals("heavily_redacted");
        String str = f78718d;
        if (!equals) {
            if (!a11.equals("on")) {
                if (a11.equals("include_sensitive")) {
                    i12 = 2;
                } else if (a11.equals("everything")) {
                    i12 = 3;
                } else {
                    String c11 = org.chromium.base.j.c(str);
                    Locale locale = Locale.US;
                    Log.w(c11, "Unknown value for debug.cronet.trace_netlog system property, ignoring: ".concat(a11));
                }
            }
            if (i12 > 0) {
                C8777p.a();
                String str2 = Build.TYPE;
                if (!str2.equals("userdebug") && !str2.equals("eng") && (org.chromium.base.e.b().getApplicationInfo().flags & 2) == 0) {
                    String c12 = org.chromium.base.j.c(str);
                    Locale locale2 = Locale.US;
                    Log.w(c12, "Ignoring requested Cronet trace netlog capture mode (debug.cronet.trace_netlog=" + a11 + ") because neither the device nor app are debuggable");
                    vf.c.c("CronetLibraryLoader#initializeOnInitThread waiting on library load");
                    f78720f.block();
                    vf.c.c("CronetLibraryLoader#ensureInitialized calling cronetInitOnInitThread");
                    internal.J.N.MROCxiBo(z11, i11);
                }
            }
            i11 = i12;
            vf.c.c("CronetLibraryLoader#initializeOnInitThread waiting on library load");
            f78720f.block();
            vf.c.c("CronetLibraryLoader#ensureInitialized calling cronetInitOnInitThread");
            internal.J.N.MROCxiBo(z11, i11);
        }
        i12 = 0;
        if (i12 > 0) {
        }
        i11 = i12;
        vf.c.c("CronetLibraryLoader#initializeOnInitThread waiting on library load");
        f78720f.block();
        vf.c.c("CronetLibraryLoader#ensureInitialized calling cronetInitOnInitThread");
        internal.J.N.MROCxiBo(z11, i11);
    }

    public static boolean b(Context context, U u11, boolean z11) {
        int i11;
        vf.c.c("CronetLibraryLoader#ensureInitialized");
        synchronized (f78715a) {
            try {
                if (f78716b) {
                    return false;
                }
                org.chromium.base.c.e(new String[]{"cronet"});
                org.chromium.base.e.c(context);
                HandlerThread handlerThread = f78719e;
                if (!handlerThread.isAlive()) {
                    vf.c.c("CronetLibraryLoader#ensureInitialized starting init thread");
                    handlerThread.start();
                    c(new H());
                }
                if (!z11) {
                    vf.c.c("CronetLibraryLoader#ensureInitialized loading native library");
                    u11.getClass();
                    System.loadLibrary(f78717c);
                }
                vf.c.c("CronetLibraryLoader#ensureInitialized calling nativeInit");
                org.chromium.base.c.b().g();
                internal.J.N.MAuYp$hS(K.d(context));
                c.b bVar = C6752a.a(org.chromium.base.e.b()).b().get("Cronet_InitializeBuildInfoOnStartup");
                if (bVar == null || bVar.c()) {
                    BuildInfo.a();
                }
                String cronetVersion = ImplVersion.getCronetVersion();
                if (!cronetVersion.equals((String) internal.J.N.M6xubM8G())) {
                    throw new RuntimeException("Expected Cronet version number " + cronetVersion + ", actual version number " + ((String) internal.J.N.M6xubM8G()) + ".");
                }
                String str = f78718d;
                String property = System.getProperty("os.arch");
                String c11 = org.chromium.base.j.c(str);
                Locale locale = Locale.US;
                Log.i(c11, "Cronet version: " + cronetVersion + ", arch: " + property);
                if (!Log.isLoggable("chromium", 2)) {
                    i11 = Log.isLoggable("chromium", 3) ? -1 : -2;
                    TraceEvent.p();
                    f78720f.open();
                    f78716b = true;
                    return true;
                }
                internal.J.N.Mrxu2pQS(i11);
                TraceEvent.p();
                f78720f.open();
                f78716b = true;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Runnable runnable) {
        HandlerThread handlerThread = f78719e;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handlerThread.getLooper()).post(runnable);
        }
    }

    @CalledByNative
    private static void ensureInitializedFromNative() {
        b(org.chromium.base.e.b(), null, true);
    }

    @CalledByNative
    private static byte[] getBaseFeatureOverrides() {
        return org.chromium.net.httpflags.a.b(C6752a.a(org.chromium.base.e.b())).toByteArray();
    }

    @CalledByNative
    private static String getDefaultUserAgent() {
        return d0.a(org.chromium.base.e.b());
    }

    @CalledByNative
    private static void setNetworkThreadPriorityOnNetworkThread(int i11) {
        String a11 = Ej.b.a(i11, "Setting network thread priority to ");
        String str = f78718d;
        if (Log.isLoggable(str, 3)) {
            Log.d(org.chromium.base.j.c(str), a11);
        }
        Process.setThreadPriority(i11);
    }
}
