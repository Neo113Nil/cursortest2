package ru.ozon.app.android.abtool.domain;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/abtool/domain/BaseFeatureValueProvider;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "getValue", "()Ljava/lang/String;", "localValue", "getLocalValue", "overrideValue", "getOverrideValue", "getFeatureValue", "isOverrideEnabled", "", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseFeatureValueProvider {
    @NotNull
    public final String getFeatureValue(boolean isOverrideEnabled) {
        if (!isOverrideEnabled) {
            String localValue = getLocalValue();
            return localValue == null ? getValue() : localValue;
        }
        String localValue2 = getLocalValue();
        if (localValue2 != null) {
            return localValue2;
        }
        String overrideValue = getOverrideValue();
        return overrideValue == null ? getValue() : overrideValue;
    }

    public abstract String getLocalValue();

    public abstract String getOverrideValue();

    @NotNull
    public abstract String getValue();
}
