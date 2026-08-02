package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f32677a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f32678b;

    /* renamed from: c, reason: collision with root package name */
    public static String f32679c;

    /* renamed from: d, reason: collision with root package name */
    public static int f32680d;

    public static int a(Context context) {
        b(context);
        return f32680d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (f32677a) {
            try {
                if (f32678b) {
                    return;
                }
                f32678b = true;
                try {
                    bundle = M9.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f32679c = bundle.getString("com.google.app.id");
                f32680d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
