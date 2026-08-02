package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3182f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f32705a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static int f32706b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static o0 f32707c = null;

    /* renamed from: d, reason: collision with root package name */
    public static HandlerThread f32708d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Executor f32709e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f32710f = false;

    public static AbstractC3182f b(Context context) {
        synchronized (f32705a) {
            try {
                if (f32707c == null) {
                    f32707c = new o0(context.getApplicationContext(), f32710f ? c().getLooper() : context.getMainLooper(), f32709e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32707c;
    }

    public static HandlerThread c() {
        synchronized (f32705a) {
            try {
                HandlerThread handlerThread = f32708d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f32706b);
                f32708d = handlerThread2;
                handlerThread2.start();
                return f32708d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return e(new l0(componentName, 4225), serviceConnection, str, executor).l();
    }

    public void d(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        g(new l0(componentName, 4225), serviceConnection, str);
    }

    public abstract ConnectionResult e(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        g(new l0(str, str2, 4225, z10), serviceConnection, str3);
    }

    public abstract void g(l0 l0Var, ServiceConnection serviceConnection, String str);
}
