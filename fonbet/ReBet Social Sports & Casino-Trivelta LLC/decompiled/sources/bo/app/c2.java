package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c2 implements o9 {

    /* renamed from: d, reason: collision with root package name */
    public static final b2 f25308d = new b2();

    /* renamed from: a, reason: collision with root package name */
    public final e2 f25309a;

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f25310b;

    /* renamed from: c, reason: collision with root package name */
    public final a2 f25311c;

    public c2(Context context, e2 brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        this.f25309a = brazeManager;
        this.f25310b = appConfigurationProvider;
        a2 a2Var = new a2(context, f25308d.a(appConfigurationProvider), appConfigurationProvider);
        this.f25311c = a2Var;
        if (a2Var.f25242a != null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c2.c();
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
        if (this.f25310b.isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c2.a();
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c2.b();
            }
        }, 6, (Object) null);
        return true;
    }

    public final boolean f() {
        if (d()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c2.g();
                }
            }, 6, (Object) null);
            return false;
        }
        a2 a2Var = this.f25311c;
        Function1<? super IBrazeLocation, Unit> locationUpdateCallback = new Function1() { // from class: c3.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bo.app.c2.a(bo.app.c2.this, (IBrazeLocation) obj);
            }
        };
        a2Var.getClass();
        Intrinsics.checkNotNullParameter(locationUpdateCallback, "locationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = a2Var.f25242a;
        if (iBrazeLocationApi != null) {
            return iBrazeLocationApi.requestSingleLocationUpdate(locationUpdateCallback);
        }
        return false;
    }

    public static final String b(IBrazeLocation iBrazeLocation) {
        return "Invoked manualSetUserLocation for " + iBrazeLocation;
    }

    public final boolean a(final IBrazeLocation location) {
        c2 c2Var;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            c2Var = this;
        } catch (Exception e10) {
            e = e10;
            c2Var = this;
        }
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c2Var, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c2.b(IBrazeLocation.this);
                }
            }, 6, (Object) null);
            y8 a10 = k1.f25630g.a(location);
            if (a10 == null) {
                return true;
            }
            c2Var = this;
            c2Var.f25309a.a(a10);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) c2Var, BrazeLogger.Priority.f29470E, (Throwable) e, false, new Function0() { // from class: c3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c2.e();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final Unit a(c2 c2Var, IBrazeLocation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c2Var.a(it);
        return Unit.INSTANCE;
    }
}
