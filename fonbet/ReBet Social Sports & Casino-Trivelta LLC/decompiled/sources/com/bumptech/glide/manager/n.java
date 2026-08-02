package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC2168s;
import com.bumptech.glide.load.resource.bitmap.A;
import z.C6900a;

/* loaded from: classes2.dex */
public class n implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final b f30107f = new a();

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.m f30108a;

    /* renamed from: b, reason: collision with root package name */
    public final b f30109b;

    /* renamed from: c, reason: collision with root package name */
    public final C6900a f30110c = new C6900a();

    /* renamed from: d, reason: collision with root package name */
    public final i f30111d;

    /* renamed from: e, reason: collision with root package name */
    public final l f30112e;

    public class a implements b {
        @Override // com.bumptech.glide.manager.n.b
        public com.bumptech.glide.m a(com.bumptech.glide.c cVar, j jVar, o oVar, Context context) {
            return new com.bumptech.glide.m(cVar, jVar, oVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.m a(com.bumptech.glide.c cVar, j jVar, o oVar, Context context);
    }

    public n(b bVar) {
        bVar = bVar == null ? f30107f : bVar;
        this.f30109b = bVar;
        this.f30112e = new l(bVar);
        this.f30111d = b();
    }

    public static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static i b() {
        return (A.f29972f && A.f29971e) ? new h() : new f();
    }

    public static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(Context context) {
        Activity c10 = c(context);
        return c10 == null || !c10.isFinishing();
    }

    public com.bumptech.glide.m d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.l.t() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC2168s) {
                return e((AbstractActivityC2168s) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.m e(AbstractActivityC2168s abstractActivityC2168s) {
        if (com.bumptech.glide.util.l.s()) {
            return d(abstractActivityC2168s.getApplicationContext());
        }
        a(abstractActivityC2168s);
        this.f30111d.a(abstractActivityC2168s);
        boolean g10 = g(abstractActivityC2168s);
        return this.f30112e.b(abstractActivityC2168s, com.bumptech.glide.c.d(abstractActivityC2168s.getApplicationContext()), abstractActivityC2168s.getLifecycle(), abstractActivityC2168s.getSupportFragmentManager(), g10);
    }

    public final com.bumptech.glide.m f(Context context) {
        if (this.f30108a == null) {
            synchronized (this) {
                try {
                    if (this.f30108a == null) {
                        this.f30108a = this.f30109b.a(com.bumptech.glide.c.d(context.getApplicationContext()), new com.bumptech.glide.manager.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f30108a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
