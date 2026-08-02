package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6135a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6136b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static v7.a f6137c;

    public static void a(Context context) {
        if (f6137c == null) {
            v7.a aVar = new v7.a(context);
            f6137c = aVar;
            synchronized (aVar.f24438a) {
                aVar.f24444g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f6136b) {
            try {
                if (f6137c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f6137c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, k0 k0Var, Intent intent) {
        synchronized (f6136b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f6137c.a(f6135a);
                }
                k0Var.b(intent).addOnCompleteListener(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(7, intent));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f6136b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f6137c.a(f6135a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
