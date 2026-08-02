package com.braze.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p implements p0 {
    public static final o d = new o();

    /* renamed from: a, reason: collision with root package name */
    public final r f600a;
    public final BrazeConfigurationProvider b;
    public final com.braze.location.b c;

    public p(Context context, r brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        this.f600a = brazeManager;
        this.b = appConfigurationProvider;
        com.braze.location.b bVar = new com.braze.location.b(context, d.a(appConfigurationProvider), appConfigurationProvider);
        this.c = bVar;
        if (bVar.f561a != null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.p$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.c();
            }
        }, 6, (Object) null);
    }

    public static final String a() {
        return "Automatic location collection enabled via sdk configuration.";
    }

    public static final String b() {
        return "Automatic location collection disabled via sdk configuration.";
    }

    public static final String c() {
        return "***Location API not found. Please include android-sdk-location module***";
    }

    public static final String e() {
        return "Failed to log location recorded event.";
    }

    public static final String g() {
        return "Automatic location collection is disabled. Not requesting location update.";
    }

    public final boolean d() {
        if (this.b.isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.p$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.a();
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.p$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.b();
            }
        }, 6, (Object) null);
        return true;
    }

    public final boolean f() {
        if (d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.p$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.g();
                }
            }, 6, (Object) null);
            return false;
        }
        com.braze.location.b bVar = this.c;
        Function1<? super IBrazeLocation, Unit> locationUpdateCallback = new Function1() { // from class: com.braze.managers.p$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.a(p.this, (IBrazeLocation) obj);
            }
        };
        bVar.getClass();
        Intrinsics.checkNotNullParameter(locationUpdateCallback, "locationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = bVar.f561a;
        if (iBrazeLocationApi != null) {
            return iBrazeLocationApi.requestSingleLocationUpdate(locationUpdateCallback);
        }
        return false;
    }

    public static final String b(IBrazeLocation iBrazeLocation) {
        return "Invoked manualSetUserLocation for " + iBrazeLocation;
    }

    public final boolean a(final IBrazeLocation location) {
        p pVar;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            pVar = this;
        } catch (Exception e) {
            e = e;
            pVar = this;
        }
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.p$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.b(IBrazeLocation.this);
                }
            }, 6, (Object) null);
            com.braze.models.k a2 = com.braze.models.outgoing.event.b.g.a(location);
            if (a2 == null) {
                return true;
            }
            pVar = this;
            pVar.f600a.a(a2);
            return true;
        } catch (Exception e2) {
            e = e2;
            p pVar2 = pVar;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) pVar2, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.p$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.e();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final Unit a(p pVar, IBrazeLocation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        pVar.a(it);
        return Unit.INSTANCE;
    }
}
