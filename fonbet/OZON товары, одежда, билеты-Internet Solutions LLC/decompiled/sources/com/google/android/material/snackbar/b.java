package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f58514b;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Object f58515a = new Object();

    final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.b((C0888b) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    private static class C0888b {
    }

    private b() {
        new Handler(Looper.getMainLooper(), new a());
    }

    static b a() {
        if (f58514b == null) {
            f58514b = new b();
        }
        return f58514b;
    }

    final void b(@NonNull C0888b c0888b) {
        synchronized (this.f58515a) {
            try {
                if (c0888b == null || c0888b == null) {
                    c0888b.getClass();
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f58515a) {
        }
    }

    public final void d() {
        synchronized (this.f58515a) {
        }
    }
}
