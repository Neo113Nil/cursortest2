package ru.ozon.app.android.initializers.sentry;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/sentry/SentrySampleRateHolder;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "getSentrySampleRate", "", "setupSentrySampleRate", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SentrySampleRateHolder {

    @NotNull
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public SentrySampleRateHolder(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    public final double getSentrySampleRate() {
        return h.d(this.sharedPreferences.getFloat("ozon.sentry.sampleRateRaw", 1.0f), 0.0f, 1.0f);
    }

    public final void setupSentrySampleRate(float value) {
        this.sharedPreferences.edit().putFloat("ozon.sentry.sampleRateRaw", value).apply();
    }
}
