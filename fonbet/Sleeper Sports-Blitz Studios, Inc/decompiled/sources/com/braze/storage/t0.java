package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f754a;
    public final CopyOnWriteArrayList b;

    public t0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f754a = new s0(context);
        this.b = new CopyOnWriteArrayList();
    }

    public static final String a(boolean z) {
        return "Setting delayed initialization enabled to: " + z;
    }

    public final void b(final boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.storage.t0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.a(z);
            }
        }, 6, (Object) null);
        this.f754a.writeData(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.valueOf(z));
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.f754a.readBoolean(DataStoreKey.DELAYED_INIT_ENABLED, Boolean.FALSE), Boolean.TRUE);
    }

    public static final String a(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        return "Setting delayed initialization analytics behavior to: " + delayedInitializationAnalyticsBehavior.getValue();
    }

    public final void c(final DelayedInitializationAnalyticsBehavior analyticsBehavior) {
        Intrinsics.checkNotNullParameter(analyticsBehavior, "analyticsBehavior");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.storage.t0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.a(DelayedInitializationAnalyticsBehavior.this);
            }
        }, 6, (Object) null);
        this.f754a.writeData(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, analyticsBehavior.getValue());
    }

    public static final String b() {
        return "Enqueuing push analytics event";
    }

    public final void a(com.braze.models.k pushEvent) {
        Intrinsics.checkNotNullParameter(pushEvent, "pushEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.t0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.b();
            }
        }, 6, (Object) null);
        if (DelayedInitializationAnalyticsBehavior.INSTANCE.fromString(this.f754a.readString(DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, "")) == DelayedInitializationAnalyticsBehavior.QUEUE) {
            this.b.add(pushEvent);
        }
    }

    public final void b(DelayedInitializationAnalyticsBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.t0$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.a();
            }
        }, 6, (Object) null);
        b(true);
        this.f754a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
        c(behavior);
    }

    public static final String a() {
        return "enableDelayedInitialization invoked";
    }

    public final void a(com.braze.managers.r brazeManager) {
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.t0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t0.a(t0.this);
            }
        }, 6, (Object) null);
        Iterator it = this.b.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            com.braze.models.k kVar = (com.braze.models.k) it.next();
            Intrinsics.checkNotNull(kVar);
            brazeManager.a(kVar);
        }
        this.b.clear();
    }

    public static final String a(t0 t0Var) {
        return "Flushing push analytics queue with " + t0Var.b.size() + " events";
    }
}
