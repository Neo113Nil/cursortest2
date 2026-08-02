package com.braze.storage;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final j f764a;
    public final com.braze.events.d b;
    public boolean c;

    public w1(j storage, com.braze.events.d eventPublisher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f764a = storage;
        this.b = eventPublisher;
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
        if (this.c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.storage.w1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w1.a();
                }
            }, 6, (Object) null);
            return SetsKt.emptySet();
        }
        try {
            return this.f764a.b();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.w1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w1.b();
                }
            }, 4, (Object) null);
            a(e);
            return SetsKt.emptySet();
        }
    }

    public final void a(final com.braze.models.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a("add event " + event, new Function0() { // from class: com.braze.storage.w1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w1.a(w1.this, event);
            }
        });
    }

    public static final Unit a(w1 w1Var, com.braze.models.k kVar) {
        w1Var.f764a.a(kVar);
        return Unit.INSTANCE;
    }

    public final void a(final Set events) {
        Intrinsics.checkNotNullParameter(events, "events");
        a("delete events " + events, new Function0() { // from class: com.braze.storage.w1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w1.a(w1.this, events);
            }
        });
    }

    public static final Unit a(w1 w1Var, Set set) {
        w1Var.f764a.a(set);
        return Unit.INSTANCE;
    }

    public final void a(Exception exc) {
        try {
            this.b.b(new com.braze.exceptions.b("A storage exception has occurred!", exc), com.braze.exceptions.b.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.w1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w1.d();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final String str, Function0 function0) {
        if (!this.c) {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new v1(function0, this, str, null), 3, null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.storage.w1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w1.a(str);
                }
            }, 6, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Storage provider is closed. Failed to " + str;
    }
}
