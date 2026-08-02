package ru.ozon.app.android.abtool;

import G.g;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/abtool/FeatureFlag;", "", "serviceName", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "localValue", "updateStrategy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "getName", "getValue", "getLocalValue", "getUpdateStrategy", "equals", "", "other", "hashCode", "", "toString", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeatureFlag {
    private final String localValue;

    @NotNull
    private final String name;

    @NotNull
    private final String serviceName;

    @NotNull
    private final String updateStrategy;

    @NotNull
    private final String value;

    public FeatureFlag(@NotNull String serviceName, @NotNull String name, @NotNull String value, String str, @NotNull String updateStrategy) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(updateStrategy, "updateStrategy");
        this.serviceName = serviceName;
        this.name = name;
        this.value = value;
        this.localValue = str;
        this.updateStrategy = updateStrategy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FeatureFlag.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.abtool.FeatureFlag");
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.d(this.serviceName, featureFlag.serviceName) && Intrinsics.d(this.name, featureFlag.name) && Intrinsics.d(this.value, featureFlag.value) && Intrinsics.d(this.localValue, featureFlag.localValue) && Intrinsics.d(this.updateStrategy, featureFlag.updateStrategy);
    }

    public final String getLocalValue() {
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
    public final String getUpdateStrategy() {
        return this.updateStrategy;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.serviceName.hashCode() * 31, 31, this.name), 31, this.value);
        String str = this.localValue;
        return this.updateStrategy.hashCode() + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String name = FeatureFlag.class.getName();
        String str = this.serviceName;
        String str2 = this.name;
        String str3 = this.value;
        String str4 = this.localValue;
        String str5 = this.updateStrategy;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("(serviceName='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        a.h(sb2, "', value='", str3, "', localValue=", str4);
        return C6594f.a(", updateStrategy='", str5, "')", sb2);
    }
}
