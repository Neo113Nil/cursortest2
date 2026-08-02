package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b9 {
    public static final String b(String str) {
        return "No RequestEndpointDestination found for name: " + str;
    }

    public final c9 a(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return c9.valueOf(name);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.b9.b(name);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
