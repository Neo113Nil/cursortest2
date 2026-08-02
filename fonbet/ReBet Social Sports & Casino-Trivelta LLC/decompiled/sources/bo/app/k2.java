package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class k2 {
    public static void a(final Object obj, Function0 function0) {
        try {
            function0.invoke();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.C4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k2.a(obj);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj) {
        return "Encountered exception while parsing server response for " + obj;
    }
}
