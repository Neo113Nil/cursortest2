package ru.ozon.fintech.settings.models;

import V.e;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/settings/models/FeatureFlag;", "", "featureName", "", "featureFlagValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getFeatureFlagValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeatureFlag {

    @i(name = AppMeasurementSdk.ConditionalUserProperty.VALUE)
    @NotNull
    private final String featureFlagValue;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String featureName;

    public FeatureFlag(@NotNull String featureName, @NotNull String featureFlagValue) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(featureFlagValue, "featureFlagValue");
        this.featureName = featureName;
        this.featureFlagValue = featureFlagValue;
    }

    public static /* synthetic */ FeatureFlag copy$default(FeatureFlag featureFlag, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureFlag.featureName;
        }
        if ((i11 & 2) != 0) {
            str2 = featureFlag.featureFlagValue;
        }
        return featureFlag.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFeatureFlagValue() {
        return this.featureFlagValue;
    }

    @NotNull
    public final FeatureFlag copy(@NotNull String featureName, @NotNull String featureFlagValue) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(featureFlagValue, "featureFlagValue");
        return new FeatureFlag(featureName, featureFlagValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.d(this.featureName, featureFlag.featureName) && Intrinsics.d(this.featureFlagValue, featureFlag.featureFlagValue);
    }

    @NotNull
    public final String getFeatureFlagValue() {
        return this.featureFlagValue;
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    public int hashCode() {
        return this.featureFlagValue.hashCode() + (this.featureName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("FeatureFlag(featureName=", this.featureName, ", featureFlagValue=", this.featureFlagValue, ")");
    }
}
