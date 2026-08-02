package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.data;

import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderDTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "skeletonCount", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getSkeletonCount", "()I", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSkeletonLoaderDTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final int skeletonCount;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AviaSkeletonLoaderDTO(int i11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.skeletonCount = i11;
        this.action = action;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AviaSkeletonLoaderDTO copy$default(AviaSkeletonLoaderDTO aviaSkeletonLoaderDTO, int i11, AtomActionDTO atomActionDTO, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aviaSkeletonLoaderDTO.skeletonCount;
        }
        if ((i12 & 2) != 0) {
            atomActionDTO = aviaSkeletonLoaderDTO.action;
        }
        if ((i12 & 4) != 0) {
            map = aviaSkeletonLoaderDTO.trackingInfo;
        }
        return aviaSkeletonLoaderDTO.copy(i11, atomActionDTO, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSkeletonCount() {
        return this.skeletonCount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final AviaSkeletonLoaderDTO copy(int skeletonCount, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new AviaSkeletonLoaderDTO(skeletonCount, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSkeletonLoaderDTO)) {
            return false;
        }
        AviaSkeletonLoaderDTO aviaSkeletonLoaderDTO = (AviaSkeletonLoaderDTO) other;
        return this.skeletonCount == aviaSkeletonLoaderDTO.skeletonCount && Intrinsics.d(this.action, aviaSkeletonLoaderDTO.action) && Intrinsics.d(this.trackingInfo, aviaSkeletonLoaderDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final int getSkeletonCount() {
        return this.skeletonCount;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.action, Integer.hashCode(this.skeletonCount) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.skeletonCount;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AviaSkeletonLoaderDTO(skeletonCount=");
        sb2.append(i11);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
