package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/data/AviaSkeletonLoaderResponse;", "", "refreshAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "repeatRequest", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Z)V", "getRefreshAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRepeatRequest", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSkeletonLoaderResponse {
    public static final int $stable = 0;
    private final AtomActionDTO refreshAction;
    private final boolean repeatRequest;

    public AviaSkeletonLoaderResponse(AtomActionDTO atomActionDTO, boolean z11) {
        this.refreshAction = atomActionDTO;
        this.repeatRequest = z11;
    }

    public static /* synthetic */ AviaSkeletonLoaderResponse copy$default(AviaSkeletonLoaderResponse aviaSkeletonLoaderResponse, AtomActionDTO atomActionDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = aviaSkeletonLoaderResponse.refreshAction;
        }
        if ((i11 & 2) != 0) {
            z11 = aviaSkeletonLoaderResponse.repeatRequest;
        }
        return aviaSkeletonLoaderResponse.copy(atomActionDTO, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRepeatRequest() {
        return this.repeatRequest;
    }

    @NotNull
    public final AviaSkeletonLoaderResponse copy(AtomActionDTO refreshAction, boolean repeatRequest) {
        return new AviaSkeletonLoaderResponse(refreshAction, repeatRequest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSkeletonLoaderResponse)) {
            return false;
        }
        AviaSkeletonLoaderResponse aviaSkeletonLoaderResponse = (AviaSkeletonLoaderResponse) other;
        return Intrinsics.d(this.refreshAction, aviaSkeletonLoaderResponse.refreshAction) && this.repeatRequest == aviaSkeletonLoaderResponse.repeatRequest;
    }

    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    public final boolean getRepeatRequest() {
        return this.repeatRequest;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.refreshAction;
        return Boolean.hashCode(this.repeatRequest) + ((atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "AviaSkeletonLoaderResponse(refreshAction=" + this.refreshAction + ", repeatRequest=" + this.repeatRequest + ")";
    }
}
