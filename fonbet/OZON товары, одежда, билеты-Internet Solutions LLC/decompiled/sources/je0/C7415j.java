package je0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

/* renamed from: je0.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7415j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final GeoProviderConfig f69976a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final GeoProviderConfig f69977b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final GeoProviderConfig f69978c;

    public C7415j(@NotNull GeoProviderConfig pickupTab, @NotNull GeoProviderConfig courierTab, @NotNull GeoProviderConfig withoutTab) {
        Intrinsics.checkNotNullParameter(pickupTab, "pickupTab");
        Intrinsics.checkNotNullParameter(courierTab, "courierTab");
        Intrinsics.checkNotNullParameter(withoutTab, "withoutTab");
        this.f69976a = pickupTab;
        this.f69977b = courierTab;
        this.f69978c = withoutTab;
    }

    @NotNull
    public final GeoProviderConfig a() {
        return this.f69977b;
    }

    @NotNull
    public final GeoProviderConfig b() {
        return this.f69976a;
    }

    @NotNull
    public final GeoProviderConfig c() {
        return this.f69978c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7415j)) {
            return false;
        }
        C7415j c7415j = (C7415j) obj;
        return Intrinsics.d(this.f69976a, c7415j.f69976a) && Intrinsics.d(this.f69977b, c7415j.f69977b) && Intrinsics.d(this.f69978c, c7415j.f69978c);
    }

    public final int hashCode() {
        return this.f69978c.hashCode() + ((this.f69977b.hashCode() + (this.f69976a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TabsGeoProviderConfigs(pickupTab=" + this.f69976a + ", courierTab=" + this.f69977b + ", withoutTab=" + this.f69978c + ")";
    }
}
