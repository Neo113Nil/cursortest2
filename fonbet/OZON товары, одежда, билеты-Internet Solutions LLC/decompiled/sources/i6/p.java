package i6;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final b f65891f = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.n f65892a;

    /* renamed from: b, reason: collision with root package name */
    private final b f65893b;

    /* renamed from: c, reason: collision with root package name */
    private final C5132a<View, ComponentCallbacksC5392m> f65894c = new C5132a<>();

    /* renamed from: d, reason: collision with root package name */
    private final j f65895d;

    /* renamed from: e, reason: collision with root package name */
    private final n f65896e;

    final class a implements b {
        @Override // i6.p.b
        @NonNull
        public final com.bumptech.glide.n a(@NonNull com.bumptech.glide.c cVar, @NonNull k kVar, @NonNull q qVar, @NonNull Context context) {
            return new com.bumptech.glide.n(cVar, kVar, qVar, context);
        }
    }

    public interface b {
        @NonNull
        com.bumptech.glide.n a(@NonNull com.bumptech.glide.c cVar, @NonNull k kVar, @NonNull q qVar, @NonNull Context context);
    }

    public p(b bVar) {
        bVar = bVar == null ? f65891f : bVar;
        this.f65893b = bVar;
        this.f65896e = new n(bVar);
        this.f65895d = (c6.t.f56589f && c6.t.f56588e) ? new i() : new f();
    }

    private static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void b(List list, @NonNull C5132a c5132a) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) it.next();
            if (componentCallbacksC5392m != null && componentCallbacksC5392m.getView() != null) {
                c5132a.put(componentCallbacksC5392m.getView(), componentCallbacksC5392m);
                b(componentCallbacksC5392m.getChildFragmentManager().r0(), c5132a);
            }
        }
    }

    @NonNull
    public final com.bumptech.glide.n c(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        int i11 = p6.l.f80283d;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.r) {
                return f((androidx.fragment.app.r) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f65892a == null) {
            synchronized (this) {
                try {
                    if (this.f65892a == null) {
                        this.f65892a = this.f65893b.a(com.bumptech.glide.c.a(context.getApplicationContext()), new C7014a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f65892a;
    }

    @NonNull
    public final com.bumptech.glide.n d(@NonNull View view) {
        int i11 = p6.l.f80283d;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(view.getContext().getApplicationContext());
        }
        p6.k.b(view);
        p6.k.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a11 = a(view.getContext());
        if (a11 != null && (a11 instanceof androidx.fragment.app.r)) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) a11;
            C5132a<View, ComponentCallbacksC5392m> c5132a = this.f65894c;
            c5132a.clear();
            b(rVar.getSupportFragmentManager().r0(), c5132a);
            View findViewById = rVar.findViewById(R.id.content);
            ComponentCallbacksC5392m componentCallbacksC5392m = null;
            while (!view.equals(findViewById) && (componentCallbacksC5392m = c5132a.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c5132a.clear();
            return componentCallbacksC5392m != null ? e(componentCallbacksC5392m) : f(rVar);
        }
        return c(view.getContext().getApplicationContext());
    }

    @NonNull
    public final com.bumptech.glide.n e(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        p6.k.c(componentCallbacksC5392m.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        int i11 = p6.l.f80283d;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(componentCallbacksC5392m.getContext().getApplicationContext());
        }
        if (componentCallbacksC5392m.getActivity() != null) {
            this.f65895d.a(componentCallbacksC5392m.getActivity());
        }
        G childFragmentManager = componentCallbacksC5392m.getChildFragmentManager();
        Context context = componentCallbacksC5392m.getContext();
        return this.f65896e.a(context, com.bumptech.glide.c.a(context.getApplicationContext()), componentCallbacksC5392m.getLifecycle(), childFragmentManager, componentCallbacksC5392m.isVisible());
    }

    @NonNull
    public final com.bumptech.glide.n f(@NonNull androidx.fragment.app.r rVar) {
        int i11 = p6.l.f80283d;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(rVar.getApplicationContext());
        }
        if (rVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f65895d.a(rVar);
        Activity a11 = a(rVar);
        return this.f65896e.a(rVar, com.bumptech.glide.c.a(rVar.getApplicationContext()), rVar.getLifecycle(), rVar.getSupportFragmentManager(), a11 == null || !a11.isFinishing());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
