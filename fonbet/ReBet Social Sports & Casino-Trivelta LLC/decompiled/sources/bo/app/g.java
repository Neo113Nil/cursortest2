package bo.app;

import android.content.Context;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g {
    public static final String b() {
        return "com.amazon.device.messaging.ADM not found";
    }

    public final boolean a() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.O1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g.b();
                }
            }, 6, (Object) null);
            return false;
        }
    }

    public final boolean a(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.P1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g.a(e10);
                }
            }, 6, (Object) null);
            return false;
        }
    }

    public static final String a(Exception exc) {
        return "Manifest not authored properly to support ADM. ADM manifest exception: " + exc;
    }
}
