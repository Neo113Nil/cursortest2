package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final t4 f26103a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f26104b;

    public u4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26103a = new t4(context);
        this.f26104b = new CopyOnWriteArrayList();
    }

    public static final String a(boolean z10) {
        return "Setting delayed initialization enabled to: " + z10;
    }

    public final void b(final boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.jb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.u4.a(z10);
            }
        }, 6, (Object) null);
        this.f26103a.writeData(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.valueOf(z10));
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.f26103a.readBoolean(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.FALSE), Boolean.TRUE);
    }

    public static final String a(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        return "Setting delayed initialization analytics behavior to: " + delayedInitializationAnalyticsBehavior.getValue();
    }

    public final void c(final DelayedInitializationAnalyticsBehavior analyticsBehavior) {
        Intrinsics.checkNotNullParameter(analyticsBehavior, "analyticsBehavior");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.kb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.u4.a(DelayedInitializationAnalyticsBehavior.this);
            }
        }, 6, (Object) null);
        this.f26103a.writeData(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, analyticsBehavior.getValue());
    }

    public static final String b() {
        return "Enqueuing push analytics event";
    }

    public final void a(y8 pushEvent) {
        Intrinsics.checkNotNullParameter(pushEvent, "pushEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.mb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.u4.b();
            }
        }, 6, (Object) null);
        if (DelayedInitializationAnalyticsBehavior.INSTANCE.fromString(this.f26103a.readString(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, "")) == DelayedInitializationAnalyticsBehavior.QUEUE) {
            this.f26104b.add(pushEvent);
        }
    }

    public final void a(a9 brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.lb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.u4.a(bo.app.u4.this);
            }
        }, 6, (Object) null);
        Iterator it = this.f26104b.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            y8 y8Var = (y8) it.next();
            Intrinsics.checkNotNull(y8Var);
            ((e2) brazeManager).a(y8Var);
        }
        this.f26104b.clear();
    }

    public static final String a(u4 u4Var) {
        return "Flushing push analytics queue with " + u4Var.f26104b.size() + " events";
    }
}
