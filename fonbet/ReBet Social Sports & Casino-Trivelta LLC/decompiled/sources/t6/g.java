package t6;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t6.j;

/* loaded from: classes2.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public static final a f65703d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Map f65704e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f65705a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f65706b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f65707c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = g.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new g(activity, null);
                b10.put(valueOf, obj);
            }
            g.c((g) obj);
        }

        public final void b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar == null) {
                return;
            }
            g.d(gVar);
        }

        public a() {
        }
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (Y7.a.d(g.class)) {
            return null;
        }
        try {
            return f65704e;
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (Y7.a.d(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (Y7.a.d(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
        }
    }

    public static final void f(g this$0) {
        if (Y7.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                p6.g gVar = p6.g.f63069a;
                View e10 = p6.g.e((Activity) this$0.f65705a.get());
                Activity activity = (Activity) this$0.f65705a.get();
                if (e10 != null && activity != null) {
                    for (View view : c.a(e10)) {
                        if (!l6.d.g(view)) {
                            String d10 = c.d(view);
                            if (d10.length() > 0 && d10.length() <= 300) {
                                j.a aVar = j.f65714e;
                                String localClassName = activity.getLocalClassName();
                                Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                aVar.d(view, e10, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
        }
    }

    public final void e() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: t6.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(g.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f65706b.post(runnable);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void g() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (this.f65707c.getAndSet(true)) {
                return;
            }
            p6.g gVar = p6.g.f63069a;
            View e10 = p6.g.e((Activity) this.f65705a.get());
            if (e10 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void h() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (this.f65707c.getAndSet(false)) {
                p6.g gVar = p6.g.f63069a;
                View e10 = p6.g.e((Activity) this.f65705a.get());
                if (e10 == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public g(Activity activity) {
        this.f65705a = new WeakReference(activity);
        this.f65706b = new Handler(Looper.getMainLooper());
        this.f65707c = new AtomicBoolean(false);
    }
}
