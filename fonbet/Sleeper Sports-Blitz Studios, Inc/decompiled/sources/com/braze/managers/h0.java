package com.braze.managers;

import com.braze.storage.w1;
import com.braze.support.BrazeLogger;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f586a;
    public boolean b;

    public h0(w1 brazeEventStorageProvider) {
        Intrinsics.checkNotNullParameter(brazeEventStorageProvider, "brazeEventStorageProvider");
        this.f586a = brazeEventStorageProvider;
    }

    public static final String b(com.braze.models.k kVar) {
        return "Storage manager is closed. Not adding event: " + kVar;
    }

    public final void a(final com.braze.models.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h0$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.b(com.braze.models.k.this);
                }
            }, 6, (Object) null);
        } else {
            this.f586a.a(event);
        }
    }

    public static final String b() {
        return "Started offline event recovery task.";
    }

    public final void a(final LinkedHashSet events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h0$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.a(events);
                }
            }, 6, (Object) null);
        } else {
            this.f586a.a(events);
        }
    }

    public static final String a(Set set) {
        return "Storage manager is closed. Not deleting events: " + set;
    }

    public final void a(com.braze.events.d internalEventPublisher) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        if (this.b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h0$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.a();
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.b();
            }
        }, 7, (Object) null);
        final List events = CollectionsKt.toList(this.f586a.c());
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.a(events);
            }
        }, 6, (Object) null);
        Intrinsics.checkNotNullParameter(events, "events");
        internalEventPublisher.b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.b, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
    }

    public static final String a() {
        return "Storage manager is closed. Not starting offline recovery.";
    }

    public static final String a(List list) {
        return "Adding events to dispatch from storage: " + list;
    }
}
