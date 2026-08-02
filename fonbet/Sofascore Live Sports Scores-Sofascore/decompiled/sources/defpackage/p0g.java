package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.a;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p0g implements Handler.Callback {
    public static final e2f d = new e2f(1);
    public volatile n0g a;
    public final jr8 b;
    public final d4a c = new d4a(d);

    public p0g() {
        this.b = (e79.e && e79.d) ? new b68() : new a99(21);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final n0g b(Context context) {
        if (context == null) {
            a70.p("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    a70.p("You cannot start a load for a destroyed activity");
                    return null;
                }
                this.b.b(fragmentActivity);
                Activity a = a(fragmentActivity);
                boolean z = a == null || !a.isFinishing();
                a a2 = a.a(fragmentActivity.getApplicationContext());
                d4a d4aVar = this.c;
                g6b lifecycle = fragmentActivity.getLifecycle();
                fp8 k = fragmentActivity.k();
                kik.g();
                kik.g();
                n0g n0gVar = (n0g) ((HashMap) d4aVar.b).get(lifecycle);
                if (n0gVar != null) {
                    return n0gVar;
                }
                r6b r6bVar = new r6b(lifecycle);
                n0g n0gVar2 = new n0g(a2, r6bVar, new tnf(d4aVar, k), fragmentActivity);
                ((HashMap) d4aVar.b).put(lifecycle, n0gVar2);
                r6bVar.c(new z6b(d4aVar, lifecycle));
                if (z) {
                    n0gVar2.onStart();
                }
                return n0gVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = new n0g(a.a(context.getApplicationContext()), new mx9(), new mx9(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
