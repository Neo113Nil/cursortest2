package x2;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6782d extends AbstractC6790l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6782d(Context context) {
        super(r2);
        MeasurementManager measurementManager;
        Intrinsics.checkNotNullParameter(context, "context");
        measurementManager = MeasurementManager.get(context);
        Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
    }
}
