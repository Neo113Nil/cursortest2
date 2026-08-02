package ru.ozon.app.android.abtool.data.local.entity;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.UpdateStrategy;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.domain.BaseFeatureValueProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0001-BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012Jp\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b,\u0010\u0017¨\u0006."}, d2 = {"Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "Lru/ozon/app/android/abtool/domain/BaseFeatureValueProvider;", "", "id", "serviceName", "displayedName", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/abtool/data/model/ValueType;", "valueType", AppMeasurementSdk.ConditionalUserProperty.VALUE, "localValue", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "updateStrategy", "overrideValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/data/model/ValueType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/data/model/UpdateStrategy;Ljava/lang/String;)V", "", "isPerProcess", "()Z", "isDeleted", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/data/model/ValueType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/data/model/UpdateStrategy;Ljava/lang/String;)Lru/ozon/app/android/abtool/data/local/entity/FeatureEntity;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getServiceName", "getDisplayedName", "getName", "Lru/ozon/app/android/abtool/data/model/ValueType;", "getValueType", "()Lru/ozon/app/android/abtool/data/model/ValueType;", "getValue", "getLocalValue", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "getUpdateStrategy", "()Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "getOverrideValue", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FeatureEntity extends BaseFeatureValueProvider {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FeatureEntity(String str, String str2, String str3, String str4, ValueType valueType, String str5, String str6, UpdateStrategy updateStrategy, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, valueType, str5, r9, r10, r11);
        String str8;
        UpdateStrategy updateStrategy2;
        String str9;
        str3 = (i11 & 4) != 0 ? null : str3;
        if ((i11 & 64) != 0) {
            str8 = str7;
            updateStrategy2 = updateStrategy;
            str9 = null;
        } else {
            str8 = str7;
            updateStrategy2 = updateStrategy;
            str9 = str6;
        }
    }

    public static /* synthetic */ FeatureEntity copy$default(FeatureEntity featureEntity, String str, String str2, String str3, String str4, ValueType valueType, String str5, String str6, UpdateStrategy updateStrategy, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = featureEntity.serviceName;
        }
        if ((i11 & 4) != 0) {
            str3 = featureEntity.displayedName;
        }
        if ((i11 & 8) != 0) {
            str4 = featureEntity.name;
        }
        if ((i11 & 16) != 0) {
            valueType = featureEntity.valueType;
        }
        if ((i11 & 32) != 0) {
            str5 = featureEntity.value;
        }
        if ((i11 & 64) != 0) {
            str6 = featureEntity.localValue;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            updateStrategy = featureEntity.updateStrategy;
        }
        if ((i11 & 256) != 0) {
            str7 = featureEntity.overrideValue;
        }
        UpdateStrategy updateStrategy2 = updateStrategy;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        ValueType valueType2 = valueType;
        String str11 = str3;
        return featureEntity.copy(str, str2, str11, str4, valueType2, str9, str10, updateStrategy2, str8);
    }

    @NotNull
    public final FeatureEntity copy(@NotNull String id2, @NotNull String serviceName, String displayedName, @NotNull String name, @NotNull ValueType valueType, @NotNull String value, String localValue, @NotNull UpdateStrategy updateStrategy, String overrideValue) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(updateStrategy, "updateStrategy");
        return new FeatureEntity(id2, serviceName, displayedName, name, valueType, value, localValue, updateStrategy, overrideValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEntity)) {
            return false;
        }
        FeatureEntity featureEntity = (FeatureEntity) other;
        return Intrinsics.d(this.id, featureEntity.id) && Intrinsics.d(this.serviceName, featureEntity.serviceName) && Intrinsics.d(this.displayedName, featureEntity.displayedName) && Intrinsics.d(this.name, featureEntity.name) && this.valueType == featureEntity.valueType && Intrinsics.d(this.value, featureEntity.value) && Intrinsics.d(this.localValue, featureEntity.localValue) && this.updateStrategy == featureEntity.updateStrategy && Intrinsics.d(this.overrideValue, featureEntity.overrideValue);
    }

    public final String getDisplayedName() {
        return this.displayedName;
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
        int a11 = g.a(this.id.hashCode() * 31, 31, this.serviceName);
        String str = this.displayedName;
        int a12 = g.a((this.valueType.hashCode() + g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name)) * 31, 31, this.value);
        String str2 = this.localValue;
        int hashCode = (this.updateStrategy.hashCode() + ((a12 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.overrideValue;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isDeleted() {
        return this.updateStrategy == UpdateStrategy.DELETE;
    }

    public final boolean isPerProcess() {
        return this.updateStrategy == UpdateStrategy.PER_PROCESS;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.serviceName;
        String str3 = this.displayedName;
        String str4 = this.name;
        ValueType valueType = this.valueType;
        String str5 = this.value;
        String str6 = this.localValue;
        UpdateStrategy updateStrategy = this.updateStrategy;
        String str7 = this.overrideValue;
        StringBuilder d11 = C3660k.d("FeatureEntity(id=", str, ", serviceName=", str2, ", displayedName=");
        a.h(d11, str3, ", name=", str4, ", valueType=");
        d11.append(valueType);
        d11.append(", value=");
        d11.append(str5);
        d11.append(", localValue=");
        d11.append(str6);
        d11.append(", updateStrategy=");
        d11.append(updateStrategy);
        d11.append(", overrideValue=");
        return o0.c(d11, str7, ")");
    }

    public FeatureEntity(@NotNull String id2, @NotNull String serviceName, String str, @NotNull String name, @NotNull ValueType valueType, @NotNull String value, String str2, @NotNull UpdateStrategy updateStrategy, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(updateStrategy, "updateStrategy");
        this.id = id2;
        this.serviceName = serviceName;
        this.displayedName = str;
        this.name = name;
        this.valueType = valueType;
        this.value = value;
        this.localValue = str2;
        this.updateStrategy = updateStrategy;
        this.overrideValue = str3;
    }
}
