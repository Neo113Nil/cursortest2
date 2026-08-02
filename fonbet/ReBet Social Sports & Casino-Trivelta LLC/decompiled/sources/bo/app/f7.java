package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f7 {

    /* renamed from: a, reason: collision with root package name */
    public final hf f25453a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f25454b;

    public f7(hf sessionStorageManager, r7 eventPublisher) {
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        this.f25453a = sessionStorageManager;
        this.f25454b = eventPublisher;
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

    public final we c() {
        try {
            return this.f25453a.c();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.D1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.f7.a();
                }
            }, 4, (Object) null);
            a(this.f25454b, e10);
            return null;
        }
    }

    public final void a(we session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            this.f25453a.a(session);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.F1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.f7.e();
                }
            }, 4, (Object) null);
            a(this.f25454b, e10);
        }
    }

    public final void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        try {
            this.f25453a.a(sessionId);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.E1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.f7.b();
                }
            }, 4, (Object) null);
            a(this.f25454b, e10);
        }
    }

    public final void a(r7 eventPublisher, Exception throwable) {
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            eventPublisher.b(new jf("A storage exception has occurred. Please view the stack trace for more details.", throwable), jf.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.G1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.f7.d();
                }
            }, 4, (Object) null);
        }
    }
}
