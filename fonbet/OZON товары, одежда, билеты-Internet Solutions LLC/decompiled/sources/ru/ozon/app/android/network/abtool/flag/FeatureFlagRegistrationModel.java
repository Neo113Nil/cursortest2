package ru.ozon.app.android.network.abtool.flag;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\fB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\r\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000eB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "", "flag", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "defaultValue", "displayedName", "", "valueType", "Lru/ozon/app/android/abtool/data/model/ValueType;", "<init>", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;Ljava/lang/Object;Ljava/lang/String;Lru/ozon/app/android/abtool/data/model/ValueType;)V", "", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;ZLjava/lang/String;)V", "", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;ILjava/lang/String;)V", "", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;FLjava/lang/String;)V", "", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;JLjava/lang/String;)V", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;Ljava/lang/String;Ljava/lang/String;)V", "getFlag", "()Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "getDefaultValue", "()Ljava/lang/Object;", "getDisplayedName", "()Ljava/lang/String;", "getValueType", "()Lru/ozon/app/android/abtool/data/model/ValueType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "updateStrategy", "getUpdateStrategy", "()Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "setUpdateStrategy$network_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/abtool/data/model/UpdateStrategy;)V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureFlagRegistrationModel {

    @NotNull
    private final Object defaultValue;

    @NotNull
    private final String displayedName;

    @NotNull
    private final FeatureFlag flag;

    @NotNull
    private UpdateStrategy updateStrategy;

    @NotNull
    private final ValueType valueType;

    public FeatureFlagRegistrationModel(@NotNull FeatureFlag flag, @NotNull Object defaultValue, @NotNull String displayedName, @NotNull ValueType valueType) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.flag = flag;
        this.defaultValue = defaultValue;
        this.displayedName = displayedName;
        this.valueType = valueType;
        this.updateStrategy = UpdateStrategy.AS_FETCHED;
    }

    @NotNull
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final String getDisplayedName() {
        return this.displayedName;
    }

    @NotNull
    public final FeatureFlag getFlag() {
        return this.flag;
    }

    @NotNull
    public final UpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    @NotNull
    public final ValueType getValueType() {
        return this.valueType;
    }

    public final void setUpdateStrategy$network_prodGoogleAllVendorsRelease(@NotNull UpdateStrategy updateStrategy) {
        Intrinsics.checkNotNullParameter(updateStrategy, "<set-?>");
        this.updateStrategy = updateStrategy;
    }

    public /* synthetic */ FeatureFlagRegistrationModel(FeatureFlag featureFlag, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlag, z11, (i11 & 4) != 0 ? featureFlag.getFeatureName() : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureFlagRegistrationModel(@NotNull FeatureFlag flag, boolean z11, @NotNull String displayedName) {
        this(flag, Boolean.valueOf(z11), displayedName, ValueType.BOOLEAN);
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureFlagRegistrationModel(@NotNull FeatureFlag flag, int i11, @NotNull String displayedName) {
        this(flag, Integer.valueOf(i11), displayedName, ValueType.INT);
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureFlagRegistrationModel(@NotNull FeatureFlag flag, float f7, @NotNull String displayedName) {
        this(flag, Float.valueOf(f7), displayedName, ValueType.FLOAT);
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureFlagRegistrationModel(@NotNull FeatureFlag flag, long j11, @NotNull String displayedName) {
        this(flag, Long.valueOf(j11), displayedName, ValueType.LONG);
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureFlagRegistrationModel(@NotNull FeatureFlag flag, @NotNull String defaultValue, @NotNull String displayedName) {
        this(flag, defaultValue, displayedName, ValueType.STRING);
        Intrinsics.checkNotNullParameter(flag, "flag");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
    }
}
