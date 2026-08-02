package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static b0 f37926e;

    /* renamed from: a, reason: collision with root package name */
    public String f37927a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f37928b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f37929c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f37930d = new ArrayDeque();

    public static synchronized b0 b() {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f37926e == null) {
                    f37926e = new b0();
                }
                b0Var = f37926e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }

    public final int a(Context context, Intent intent) {
        String f10 = f(context, intent);
        if (f10 != null) {
            Log.isLoggable("FirebaseMessaging", 3);
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if ((e(context) ? m0.g(context, intent) : context.startService(intent)) != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHSMILE;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION;
        }
    }

    public Intent c() {
        return (Intent) this.f37930d.poll();
    }

    public boolean d(Context context) {
        if (this.f37929c == null) {
            this.f37929c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f37928b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f37929c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.f37928b == null) {
            this.f37928b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f37928b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f37928b.booleanValue();
    }

    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f37927a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f37927a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f37927a = serviceInfo.name;
                    }
                    return this.f37927a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int g(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        this.f37930d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
