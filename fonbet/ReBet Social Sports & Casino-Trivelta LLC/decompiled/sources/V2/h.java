package V2;

import Q2.AbstractC1508t;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final Z2.b f12374a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12375b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12376c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f12377d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12378e;

    public h(Context context, Z2.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f12374a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f12375b = applicationContext;
        this.f12376c = new Object();
        this.f12377d = new LinkedHashSet();
    }

    public static final void b(List list, h hVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.constraints.a) it.next()).a(hVar.f12378e);
        }
    }

    public final void c(androidx.work.impl.constraints.a listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f12376c) {
            try {
                if (this.f12377d.add(listener)) {
                    if (this.f12377d.size() == 1) {
                        this.f12378e = e();
                        AbstractC1508t e10 = AbstractC1508t.e();
                        str = i.f12379a;
                        e10.a(str, getClass().getSimpleName() + ": initial state = " + this.f12378e);
                        h();
                    }
                    listener.a(this.f12378e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Context d() {
        return this.f12375b;
    }

    public abstract Object e();

    public final void f(androidx.work.impl.constraints.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f12376c) {
            try {
                if (this.f12377d.remove(listener) && this.f12377d.isEmpty()) {
                    i();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f12376c) {
            Object obj2 = this.f12378e;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.f12378e = obj;
                final List list = CollectionsKt.toList(this.f12377d);
                this.f12374a.a().execute(new Runnable() { // from class: V2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(list, this);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
