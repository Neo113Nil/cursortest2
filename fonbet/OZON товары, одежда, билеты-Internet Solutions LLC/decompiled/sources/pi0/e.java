package pi0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class e extends b<Integer> {
    @Override // pi0.b
    public final Integer b(String launchArgsName) {
        Intrinsics.checkNotNullParameter(launchArgsName, "launchArgsName");
        return d().b(launchArgsName);
    }

    @Override // pi0.b
    public final Integer c(String deeplinkPath) {
        Intrinsics.checkNotNullParameter(deeplinkPath, "deeplinkPath");
        String d11 = d().d(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (d11 != null) {
            return kotlin.text.h.w0(d11);
        }
        return null;
    }
}
