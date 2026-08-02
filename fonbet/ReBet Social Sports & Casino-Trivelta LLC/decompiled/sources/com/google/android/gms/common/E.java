package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.W;
import com.google.android.gms.common.internal.X;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class E {

    /* renamed from: g, reason: collision with root package name */
    public static volatile X f32230g;

    /* renamed from: i, reason: collision with root package name */
    public static Context f32232i;

    /* renamed from: a, reason: collision with root package name */
    public static final C f32224a = new t(z.i("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* renamed from: b, reason: collision with root package name */
    public static final C f32225b = new u(z.i("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* renamed from: c, reason: collision with root package name */
    public static final C f32226c = new v(z.i("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: d, reason: collision with root package name */
    public static final C f32227d = new w(z.i("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: e, reason: collision with root package name */
    public static final C f32228e = new x(z.i("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: f, reason: collision with root package name */
    public static final C f32229f = new y(z.i("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: h, reason: collision with root package name */
    public static final Object f32231h = new Object();

    public static synchronized void a(Context context) {
        synchronized (E.class) {
            if (f32232i != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f32232i = context.getApplicationContext();
            }
        }
    }

    public static void b() {
        if (f32230g != null) {
            return;
        }
        AbstractC3191o.m(f32232i);
        synchronized (f32231h) {
            try {
                if (f32230g == null) {
                    f32230g = W.c(DynamiteModule.e(f32232i, DynamiteModule.f32843f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static L c(J j10) {
        L d10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC3191o.m(f32232i);
            try {
                b();
                AbstractC3191o.m(f32232i);
                zzp b10 = j10.b(f32232i);
                try {
                    zzr s02 = j10.a() ? f32230g.s0(b10) : f32230g.D0(b10);
                    if (s02.zza()) {
                        d10 = L.f(s02.j(), s02.h());
                    } else {
                        String g10 = s02.g();
                        PackageManager.NameNotFoundException nameNotFoundException = s02.i() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (g10 == null) {
                            g10 = "error checking package certificate";
                        }
                        d10 = L.g(s02.j(), s02.i(), g10, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    d10 = L.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                d10 = L.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d10;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    public static L d(String str, z zVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, zVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static /* synthetic */ String e(boolean z10, String str, z zVar) {
        String str2 = (z10 || !f(str, zVar, true, false).f32250a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = K9.a.b("SHA-256");
        AbstractC3191o.m(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, K9.j.a(b10.digest(zVar.g())), Boolean.valueOf(z10), "12451000.false");
    }

    public static L f(final String str, final z zVar, final boolean z10, boolean z11) {
        try {
            b();
            AbstractC3191o.m(f32232i);
            try {
                return f32230g.z0(new zzt(str, zVar, z10, z11), N9.d.i(f32232i.getPackageManager())) ? L.b() : new K(new Callable() { // from class: com.google.android.gms.common.B
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return E.e(z10, str, zVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return L.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return L.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
