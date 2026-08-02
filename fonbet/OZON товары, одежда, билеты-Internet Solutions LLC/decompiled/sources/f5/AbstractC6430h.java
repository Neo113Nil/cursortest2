package f5;

import android.content.Context;
import d5.InterfaceC6086a;
import e5.AbstractC6296c;
import i5.C7009b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6430h<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7009b f62737a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f62738b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f62739c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<InterfaceC6086a<T>> f62740d;

    /* renamed from: e, reason: collision with root package name */
    private T f62741e;

    protected AbstractC6430h(@NotNull Context context, @NotNull C7009b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f62737a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f62738b = applicationContext;
        this.f62739c = new Object();
        this.f62740d = new LinkedHashSet<>();
    }

    public static void a(List listenersList, AbstractC6430h this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6086a) it.next()).a(this$0.f62741e);
        }
    }

    public final void b(@NotNull AbstractC6296c listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f62739c) {
            try {
                if (this.f62740d.add(listener)) {
                    if (this.f62740d.size() == 1) {
                        this.f62741e = d();
                        androidx.work.o e11 = androidx.work.o.e();
                        str = C6431i.f62742a;
                        e11.a(str, getClass().getSimpleName() + ": initial state = " + this.f62741e);
                        g();
                    }
                    listener.a(this.f62741e);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    protected final Context c() {
        return this.f62738b;
    }

    public abstract T d();

    public final void e(@NotNull AbstractC6296c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f62739c) {
            try {
                if (this.f62740d.remove(listener) && this.f62740d.isEmpty()) {
                    h();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(T t2) {
        synchronized (this.f62739c) {
            T t11 = this.f62741e;
            if (t11 == null || !t11.equals(t2)) {
                this.f62741e = t2;
                this.f62737a.b().execute(new AB.a(3, C7714v.U0(this.f62740d), this));
                Unit unit = Unit.f71690a;
            }
        }
    }

    public abstract void g();

    public abstract void h();
}
