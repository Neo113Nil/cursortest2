package h2;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import com.google.firebase.messaging.k;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, int i5) {
        super(r1);
        switch (i5) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService((Class<Object>) k.i());
                Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
                super(k.c(systemService));
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
                break;
        }
    }
}
