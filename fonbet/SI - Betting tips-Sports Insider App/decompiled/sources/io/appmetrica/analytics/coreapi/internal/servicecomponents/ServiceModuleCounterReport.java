package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import d9.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u001b\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0002$#B-\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "", "component3", "component4", "name", "value", "valueBytes", "type", "copy", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getValue", "c", "[B", "getValueBytes", "()[B", "d", "I", "getType", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BI)V", "Companion", "Builder", "core-api_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class ServiceModuleCounterReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] valueBytes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport$Builder;", "", "", "name", "withName", "value", "withValue", "", "valueBytes", "withValueBytes", "", "type", "withType", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport;", "build", "<init>", "()V", "core-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f11649a;

        /* renamed from: b, reason: collision with root package name */
        private String f11650b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f11651c;

        /* renamed from: d, reason: collision with root package name */
        private int f11652d;

        @NotNull
        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f11649a, this.f11650b, this.f11651c, this.f11652d);
        }

        @NotNull
        public final Builder withName(@Nullable String name) {
            this.f11649a = name;
            return this;
        }

        @NotNull
        public final Builder withType(int type) {
            this.f11652d = type;
            return this;
        }

        @NotNull
        public final Builder withValue(@Nullable String value) {
            this.f11650b = value;
            return this;
        }

        @NotNull
        public final Builder withValueBytes(@Nullable byte[] valueBytes) {
            this.f11651c = valueBytes;
            return this;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport$Companion;", "", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ServiceModuleCounterReport$Builder;", "newBuilder", "core-api_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(@Nullable String str, @Nullable String str2, @Nullable byte[] bArr, int i5) {
        this.name = str;
        this.value = str2;
        this.valueBytes = bArr;
        this.type = i5;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceModuleCounterReport.name;
        }
        if ((i10 & 2) != 0) {
            str2 = serviceModuleCounterReport.value;
        }
        if ((i10 & 4) != 0) {
            bArr = serviceModuleCounterReport.valueBytes;
        }
        if ((i10 & 8) != 0) {
            i5 = serviceModuleCounterReport.type;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i5);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final byte[] getValueBytes() {
        return this.valueBytes;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ServiceModuleCounterReport copy(@Nullable String name, @Nullable String value, @Nullable byte[] valueBytes, int type) {
        return new ServiceModuleCounterReport(name, value, valueBytes, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) other;
        return this.type == serviceModuleCounterReport.type && Intrinsics.areEqual(this.name, serviceModuleCounterReport.name) && Intrinsics.areEqual(this.value, serviceModuleCounterReport.value) && Arrays.equals(this.valueBytes, serviceModuleCounterReport.valueBytes);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final byte[] getValueBytes() {
        return this.valueBytes;
    }

    public int hashCode() {
        int i5 = this.type * 31;
        String str = this.name;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.valueBytes;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceModuleCounterReport(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", valueBytes=");
        sb2.append(Arrays.toString(this.valueBytes));
        sb2.append(", type=");
        return e.i(sb2, this.type, ')');
    }
}
