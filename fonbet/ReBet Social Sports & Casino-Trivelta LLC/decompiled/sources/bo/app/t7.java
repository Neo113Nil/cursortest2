package bo.app;

import Ph.AbstractC1459k;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f26071a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f26072b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26073c;

    public t7(q1 storage, r7 eventPublisher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f26071a = storage;
        this.f26072b = eventPublisher;
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String b() {
        return "Failed to get all events from storage.";
    }

    public static final String d() {
        return "Failed to log storage exception";
    }

    public final Collection c() {
        if (this.f26073c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Va
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.t7.a();
                }
            }, 6, (Object) null);
            return SetsKt.emptySet();
        }
        try {
            return this.f26071a.b();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Wa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.t7.b();
                }
            }, 4, (Object) null);
            a(e10);
            return SetsKt.emptySet();
        }
    }

    public final void a(final y8 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a("add event " + event, new Function0() { // from class: c3.Ya
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.t7.a(bo.app.t7.this, event);
            }
        });
    }

    public static final Unit a(t7 t7Var, y8 y8Var) {
        t7Var.f26071a.a(y8Var);
        return Unit.INSTANCE;
    }

    public final void a(final Set events) {
        Intrinsics.checkNotNullParameter(events, "events");
        a("delete events " + events, new Function0() { // from class: c3.ab
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.t7.a(bo.app.t7.this, events);
            }
        });
    }

    public static final Unit a(t7 t7Var, Set set) {
        t7Var.f26071a.a(set);
        return Unit.INSTANCE;
    }

    public final void a(Exception exc) {
        try {
            this.f26072b.b(new jf("A storage exception has occurred!", exc), jf.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Xa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.t7.d();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final String str, Function0 function0) {
        if (!this.f26073c) {
            AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new s7(function0, this, str, null), 3, null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Za
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.t7.a(str);
                }
            }, 6, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Storage provider is closed. Failed to " + str;
    }
}
