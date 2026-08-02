package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.tasks.Task;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.Properties;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g4 implements e6.k {

    /* renamed from: d, reason: collision with root package name */
    public static g4 f5056d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5057a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5058b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5059c;

    public g4(int i5) {
        switch (i5) {
            case 3:
                this.f5058b = new Object();
                break;
            default:
                this.f5057a = false;
                this.f5058b = null;
                this.f5059c = null;
                break;
        }
    }

    public static g4 b(Context context) {
        g4 g4Var;
        g4 g4Var2;
        synchronized (g4.class) {
            try {
                if (f5056d == null) {
                    if (d0.c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        g4Var2 = new g4();
                        g4Var2.f5057a = false;
                        g4Var2.f5058b = context;
                        g4Var2.f5059c = new f4(null);
                    } else {
                        g4Var2 = new g4(0);
                    }
                    f5056d = g4Var2;
                }
                g4 g4Var3 = f5056d;
                if (g4Var3 != null && ((f4) g4Var3.f5059c) != null && !g4Var3.f5057a) {
                    try {
                        context.getContentResolver().registerContentObserver(x3.f5350a, true, (f4) f5056d.f5059c);
                        g4 g4Var4 = f5056d;
                        g4Var4.getClass();
                        g4Var4.f5057a = true;
                    } catch (SecurityException e7) {
                        io.sentry.android.core.w0.e("GservicesLoader", "Unable to register Gservices content observer", e7);
                    }
                }
                g4Var = f5056d;
                g4Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g4Var;
    }

    public static synchronized void g() {
        Context context;
        synchronized (g4.class) {
            try {
                g4 g4Var = f5056d;
                if (g4Var != null && (context = (Context) g4Var.f5058b) != null && ((f4) g4Var.f5059c) != null && g4Var.f5057a) {
                    context.getContentResolver().unregisterContentObserver((f4) f5056d.f5059c);
                }
                f5056d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Properties a() {
        io.sentry.k2 k2Var = (io.sentry.k2) this.f5059c;
        String str = (String) this.f5058b;
        try {
            File file = new File(str.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (file.isFile()) {
                if (!file.canRead()) {
                    k2Var.h(io.sentry.b5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                }
            } else if (this.f5057a) {
                k2Var.h(io.sentry.b5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                return null;
            }
            return null;
        } catch (Throwable th2) {
            k2Var.b(io.sentry.b5.ERROR, th2, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        e6.i iVar;
        boolean z5;
        m7.i iVar2 = (m7.i) obj;
        w7.g gVar = (w7.g) obj2;
        synchronized (this) {
            iVar = (e6.i) ((e6.j) this.f5058b).f8719b;
            z5 = this.f5057a;
            ((e6.j) this.f5058b).f8719b = null;
        }
        if (iVar == null) {
            gVar.b(Boolean.FALSE);
        } else {
            m7.b.f20427b.g(iVar2, iVar, z5, gVar);
        }
    }

    public synchronized e6.j c() {
        return (e6.j) this.f5058b;
    }

    public void d(w7.l lVar) {
        synchronized (this.f5058b) {
            try {
                if (((ArrayDeque) this.f5059c) == null) {
                    this.f5059c = new ArrayDeque();
                }
                ((ArrayDeque) this.f5059c).add(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String e(String str) {
        Object a7;
        Context context = (Context) this.f5058b;
        if (context != null && (!a4.a() || a4.b(context))) {
            try {
                try {
                    t tVar = new t(this, str);
                    try {
                        a7 = tVar.a();
                    } catch (SecurityException unused) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            a7 = tVar.a();
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    return (String) a7;
                } catch (SecurityException e7) {
                    e = e7;
                    io.sentry.android.core.w0.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            } catch (IllegalStateException e9) {
                e = e9;
                io.sentry.android.core.w0.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                io.sentry.android.core.w0.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public void f(Task task) {
        w7.l lVar;
        Object obj = this.f5058b;
        synchronized (obj) {
            if (((ArrayDeque) this.f5059c) != null && !this.f5057a) {
                this.f5057a = true;
                while (true) {
                    synchronized (obj) {
                        try {
                            lVar = (w7.l) ((ArrayDeque) this.f5059c).poll();
                            if (lVar == null) {
                                this.f5057a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.a(task);
                }
            }
        }
    }

    public g4(String str, io.sentry.k2 k2Var, boolean z5) {
        this.f5058b = str;
        this.f5059c = k2Var;
        this.f5057a = z5;
    }
}
