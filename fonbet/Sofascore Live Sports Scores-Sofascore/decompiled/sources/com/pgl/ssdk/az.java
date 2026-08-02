package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a3;

/* loaded from: classes4.dex */
public class az {
    private final a2<a0> a;
    private a3 b;
    private a3 c;

    public static class b {
        private static final az a = new az();
    }

    private az() {
        this.a = a2.a(2);
    }

    private a0 a(a3.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a0(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a3 b() {
        a3 a3Var;
        a3 a3Var2 = this.c;
        if (a3Var2 != null) {
            return a3Var2;
        }
        synchronized (az.class) {
            try {
                a3Var = this.c;
                if (a3Var == null) {
                    a3Var = a("pags_net_handler");
                    this.c = a3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a3Var;
    }

    public a3 c() {
        a3 a3Var;
        a3 a3Var2 = this.b;
        if (a3Var2 != null) {
            return a3Var2;
        }
        synchronized (az.class) {
            try {
                a3Var = this.b;
                if (a3Var == null) {
                    a3Var = a("pags_ssdk_handler");
                    this.b = a3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a3Var;
    }

    public a3 a(String str) {
        return b(null, str);
    }

    public static az a() {
        return b.a;
    }

    public a3 b(a3.a aVar, String str) {
        a0 a2 = this.a.a();
        if (a2 == null) {
            return a(aVar, str);
        }
        a2.a(aVar);
        a2.a(str);
        return a2;
    }
}
