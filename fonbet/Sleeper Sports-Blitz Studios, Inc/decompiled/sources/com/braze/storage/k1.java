package com.braze.storage;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final h3 f724a;
    public final com.braze.events.d b;

    public k1(h3 sessionStorageManager, com.braze.events.d eventPublisher) {
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f724a = sessionStorageManager;
        this.b = eventPublisher;
    }

    public static final String a() {
        return "Failed to get the active session from the storage.";
    }

    public static final String b() {
        return "Failed to delete the sealed session from the storage.";
    }

    public static final String d() {
        return "Error occured while publishing exception.";
    }

    public static final String e() {
        return "Failed to upsert active session in the storage.";
    }

    public final com.braze.models.p c() {
        try {
            return this.f724a.c();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.k1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k1.a();
                }
            }, 4, (Object) null);
            a(this.b, e);
            return null;
        }
    }

    public final void a(com.braze.models.p session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            this.f724a.a(session);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.k1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k1.e();
                }
            }, 4, (Object) null);
            a(this.b, e);
        }
    }

    public final void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            this.f724a.a(sessionId);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.k1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k1.b();
                }
            }, 4, (Object) null);
            a(this.b, e);
        }
    }

    public final void a(com.braze.events.d eventPublisher, Exception throwable) {
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            eventPublisher.b(new com.braze.exceptions.b("A storage exception has occurred. Please view the stack trace for more details.", throwable), com.braze.exceptions.b.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.k1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k1.d();
                }
            }, 4, (Object) null);
        }
    }
}
