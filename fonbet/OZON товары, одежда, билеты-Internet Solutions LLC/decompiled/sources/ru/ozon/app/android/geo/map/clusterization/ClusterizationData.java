package ru.ozon.app.android.geo.map.clusterization;

import Ak.C2436a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;", "", "", "", "images", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin;", "pinsList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getPinsList", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClusterizationData {

    @NotNull
    private final List<String> images;

    @NotNull
    private final List<ClusterizationPin> pinsList;

    public ClusterizationData(@NotNull List<String> images, @NotNull List<ClusterizationPin> pinsList) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(pinsList, "pinsList");
        this.images = images;
        this.pinsList = pinsList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusterizationData)) {
            return false;
        }
        ClusterizationData clusterizationData = (ClusterizationData) other;
        return Intrinsics.d(this.images, clusterizationData.images) && Intrinsics.d(this.pinsList, clusterizationData.pinsList);
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final List<ClusterizationPin> getPinsList() {
        return this.pinsList;
    }

    public int hashCode() {
        return this.pinsList.hashCode() + (this.images.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2436a.b("ClusterizationData(images=", this.images, ", pinsList=", ")", this.pinsList);
    }
}
