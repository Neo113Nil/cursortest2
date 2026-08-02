package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes13.dex */
public final class g {
    public static g e;

    @NonNull
    public final Object a = new Object();

    @NonNull
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    @Nullable
    public c c;

    @Nullable
    public c d;

    /* compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.a) {
                try {
                    if (gVar.c != cVar) {
                        if (gVar.d == cVar) {
                        }
                    }
                    gVar.a(cVar, 2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    public interface b {
        void a(int i);

        void show();
    }

    /* compiled from: SnackbarManager.java */
    public static class c {

        @NonNull
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public c(int i, BaseTransientBottomBar.e eVar) {
            this.a = new WeakReference<>(eVar);
            this.b = i;
        }
    }

    public static g b() {
        if (e == null) {
            e = new g();
        }
        return e;
    }

    public final boolean a(@NonNull c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.c;
        return (cVar == null || bVar == null || cVar.a.get() != bVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.e eVar) {
        synchronized (this.a) {
            try {
                if (c(eVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.e eVar) {
        synchronized (this.a) {
            try {
                if (c(eVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        f(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(@NonNull c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }
}
