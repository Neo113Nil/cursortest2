package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m5 {
    public final o5 a(ye yeVar) {
        if (yeVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.x5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.m5.a();
                }
            }, 7, (Object) null);
        }
        return new o5(n5.f25789c, null, yeVar, null, 10);
    }

    public static final String a() {
        return "There should be a session ID here";
    }
}
