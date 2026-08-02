package bo.app;

import com.braze.support.BrazeLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final t7 f26109a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26110b;

    public u7(t7 brazeEventStorageProvider) {
        Intrinsics.checkNotNullParameter(brazeEventStorageProvider, "brazeEventStorageProvider");
        this.f26109a = brazeEventStorageProvider;
    }

    public static final String b(y8 y8Var) {
        return "Storage manager is closed. Not adding event: " + y8Var;
    }

    public final void a(final y8 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f26110b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.qb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.u7.b(bo.app.y8.this);
                }
            }, 6, (Object) null);
        } else {
            this.f26109a.a(event);
        }
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(final LinkedHashSet events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f26110b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.rb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.u7.a(events);
                }
            }, 6, (Object) null);
        } else {
            this.f26109a.a(events);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(r7 internalEventPublisher) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        if (this.f26110b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.nb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.u7.a();
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ob
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.u7.b();
            }
        }, 7, (Object) null);
        final List events = CollectionsKt.toList(this.f26109a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.pb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.u7.a(events);
            }
        }, 6, (Object) null);
        Intrinsics.checkNotNullParameter(events, "events");
        internalEventPublisher.b(new o5(n5.f25788b, events, null, null, 12), o5.class);
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
