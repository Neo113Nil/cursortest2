package ru.ozon.app.android.abtool.data.model;

import G.g;
import Ld0.f;
import Md0.a;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002BK\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "LLd0/f;", "LMd0/a;", "", "displayedName", "serviceName", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/abtool/data/model/ValueType;", "valueType", "", "defaultValue", "localValue", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "updateStrategy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/data/model/ValueType;Ljava/lang/Object;Ljava/lang/Object;Lru/ozon/app/android/abtool/data/model/UpdateStrategy;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getDisplayedName", "getServiceName", "getName", "Lru/ozon/app/android/abtool/data/model/ValueType;", "getValueType", "()Lru/ozon/app/android/abtool/data/model/ValueType;", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "getLocalValue", "Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "getUpdateStrategy", "()Lru/ozon/app/android/abtool/data/model/UpdateStrategy;", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureDTO extends a implements f {

    @NotNull
    private final Object defaultValue;

    @NotNull
    private final String displayedName;
    private final Object localValue;

    @NotNull
    private final String name;

    @NotNull
    private final String serviceName;

    @NotNull
    private final UpdateStrategy updateStrategy;

    @NotNull
    private final ValueType valueType;

    public /* synthetic */ FeatureDTO(String str, String str2, String str3, ValueType valueType, Object obj, Object obj2, UpdateStrategy updateStrategy, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, str3, (i11 & 8) != 0 ? ValueType.BOOLEAN : valueType, obj, (i11 & 32) != 0 ? null : obj2, (i11 & 64) != 0 ? UpdateStrategy.AS_FETCHED : updateStrategy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FeatureDTO.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.abtool.data.model.FeatureDTO");
        FeatureDTO featureDTO = (FeatureDTO) other;
        return Intrinsics.d(this.displayedName, featureDTO.displayedName) && Intrinsics.d(this.serviceName, featureDTO.serviceName) && Intrinsics.d(this.name, featureDTO.name) && this.valueType == featureDTO.valueType && Intrinsics.d(this.defaultValue, featureDTO.defaultValue) && Intrinsics.d(this.localValue, featureDTO.localValue) && this.updateStrategy == featureDTO.updateStrategy;
    }

    @NotNull
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @NotNull
    public final String getDisplayedName() {
        return this.displayedName;
    }

    public final Object getLocalValue() {
        return this.localValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final UpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    @NotNull
    public final ValueType getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        int c11 = H00.a.c((this.valueType.hashCode() + g.a(g.a(this.displayedName.hashCode() * 31, 31, this.serviceName), 31, this.name)) * 31, 31, this.defaultValue);
        Object obj = this.localValue;
        return this.updateStrategy.hashCode() + ((c11 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.displayedName;
        String str2 = this.serviceName;
        String str3 = this.name;
        ValueType valueType = this.valueType;
        Object obj = this.defaultValue;
        Object obj2 = this.localValue;
        UpdateStrategy updateStrategy = this.updateStrategy;
        StringBuilder d11 = C3660k.d("FeatureDTO(displayedName='", str, "', serviceName='", str2, "', name='");
        d11.append(str3);
        d11.append("', valueType=");
        d11.append(valueType);
        d11.append(", defaultValue=");
        d11.append(obj);
        d11.append(", localValue=");
        d11.append(obj2);
        d11.append(", updateStrategy=");
        d11.append(updateStrategy);
        d11.append(")");
        return d11.toString();
    }

    public FeatureDTO(@NotNull String displayedName, @NotNull String serviceName, @NotNull String name, @NotNull ValueType valueType, @NotNull Object defaultValue, Object obj, @NotNull UpdateStrategy updateStrategy) {
        Intrinsics.checkNotNullParameter(displayedName, "displayedName");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(updateStrategy, "updateStrategy");
        this.displayedName = displayedName;
        this.serviceName = serviceName;
        this.name = name;
        this.valueType = valueType;
        this.defaultValue = defaultValue;
        this.localValue = obj;
        this.updateStrategy = updateStrategy;
    }
}
