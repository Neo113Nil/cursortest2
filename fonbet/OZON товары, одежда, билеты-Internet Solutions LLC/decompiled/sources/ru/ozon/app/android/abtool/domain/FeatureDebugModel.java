package ru.ozon.app.android.abtool.domain;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "Lru/ozon/app/android/abtool/domain/BaseFeatureValueProvider;", "", "id", AppMeasurementSdk.ConditionalUserProperty.NAME, "serviceName", AppMeasurementSdk.ConditionalUserProperty.VALUE, "localValue", "overrideValue", "Lru/ozon/app/android/abtool/domain/ValueType;", "valueType", "Lru/ozon/app/android/abtool/domain/UpdateStrategy;", "updateStrategy", "displayedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/domain/ValueType;Lru/ozon/app/android/abtool/domain/UpdateStrategy;Ljava/lang/String;)V", "getDisplayedName", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getServiceName", "getValue", "getLocalValue", "getOverrideValue", "Lru/ozon/app/android/abtool/domain/ValueType;", "getValueType", "()Lru/ozon/app/android/abtool/domain/ValueType;", "Lru/ozon/app/android/abtool/domain/UpdateStrategy;", "getUpdateStrategy", "()Lru/ozon/app/android/abtool/domain/UpdateStrategy;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FeatureDebugModel extends BaseFeatureValueProvider {
    private final String displayedName;

    @NotNull
    private final String id;
    private final String localValue;

    @NotNull
    private final String name;
    private final String overrideValue;

    @NotNull
    private final String serviceName;

    @NotNull
    private final UpdateStrategy updateStrategy;

    @NotNull
    private final String value;

    @NotNull
    private final ValueType valueType;

    public FeatureDebugModel(@NotNull String id2, @NotNull String name, @NotNull String serviceName, @NotNull String value, String str, String str2, @NotNull ValueType valueType, @NotNull UpdateStrategy updateStrategy, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(updateStrategy, "updateStrategy");
        this.id = id2;
        this.name = name;
        this.serviceName = serviceName;
        this.value = value;
        this.localValue = str;
        this.overrideValue = str2;
        this.valueType = valueType;
        this.updateStrategy = updateStrategy;
        this.displayedName = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureDebugModel)) {
            return false;
        }
        FeatureDebugModel featureDebugModel = (FeatureDebugModel) other;
        return Intrinsics.d(this.id, featureDebugModel.id) && Intrinsics.d(this.name, featureDebugModel.name) && Intrinsics.d(this.serviceName, featureDebugModel.serviceName) && Intrinsics.d(this.value, featureDebugModel.value) && Intrinsics.d(this.localValue, featureDebugModel.localValue) && Intrinsics.d(this.overrideValue, featureDebugModel.overrideValue) && this.valueType == featureDebugModel.valueType && this.updateStrategy == featureDebugModel.updateStrategy && Intrinsics.d(this.displayedName, featureDebugModel.displayedName);
    }

    public final String getDisplayedName() {
        if (getLocalValue() != null) {
            String str = this.displayedName;
            return (str != null ? str : "").concat("\nlocal");
        }
        if (getOverrideValue() == null) {
            return this.displayedName;
        }
        String str2 = this.displayedName;
        return (str2 != null ? str2 : "").concat("\noverride");
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.abtool.domain.BaseFeatureValueProvider
    public String getLocalValue() {
        return this.localValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // ru.ozon.app.android.abtool.domain.BaseFeatureValueProvider
    public String getOverrideValue() {
        return this.overrideValue;
    }

    @NotNull
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final UpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    @Override // ru.ozon.app.android.abtool.domain.BaseFeatureValueProvider
    @NotNull
    public String getValue() {
        return this.value;
    }

    @NotNull
    public final ValueType getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(this.id.hashCode() * 31, 31, this.name), 31, this.serviceName), 31, this.value);
        String str = this.localValue;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overrideValue;
        int hashCode2 = (this.updateStrategy.hashCode() + ((this.valueType.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.displayedName;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.serviceName;
        String str4 = this.value;
        String str5 = this.localValue;
        String str6 = this.overrideValue;
        ValueType valueType = this.valueType;
        UpdateStrategy updateStrategy = this.updateStrategy;
        String str7 = this.displayedName;
        StringBuilder d11 = C3660k.d("FeatureDebugModel(id=", str, ", name=", str2, ", serviceName=");
        a.h(d11, str3, ", value=", str4, ", localValue=");
        a.h(d11, str5, ", overrideValue=", str6, ", valueType=");
        d11.append(valueType);
        d11.append(", updateStrategy=");
        d11.append(updateStrategy);
        d11.append(", displayedName=");
        return o0.c(d11, str7, ")");
    }
}
