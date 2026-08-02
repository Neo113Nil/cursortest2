package fi0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63491a;

    public h(@NotNull String value) {
        Intrinsics.checkNotNullParameter("x-o3-internal-headers-token", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f63491a = value;
    }

    @NotNull
    public final String a() {
        return this.f63491a;
    }
}
