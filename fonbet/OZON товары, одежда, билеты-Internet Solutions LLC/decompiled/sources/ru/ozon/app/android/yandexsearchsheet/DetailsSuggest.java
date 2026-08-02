package ru.ozon.app.android.yandexsearchsheet;

import D40.a;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/DetailsSuggest;", "", "isExact", "", "isAvailable", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DetailsSuggest {
    private final AtomActionDTO action;
    private final boolean isAvailable;
    private final boolean isExact;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public DetailsSuggest(boolean z11, boolean z12, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        this.isExact = z11;
        this.isAvailable = z12;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailsSuggest copy$default(DetailsSuggest detailsSuggest, boolean z11, boolean z12, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = detailsSuggest.isExact;
        }
        if ((i11 & 2) != 0) {
            z12 = detailsSuggest.isAvailable;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = detailsSuggest.action;
        }
        if ((i11 & 8) != 0) {
            map = detailsSuggest.trackingInfo;
        }
        return detailsSuggest.copy(z11, z12, atomActionDTO, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsExact() {
        return this.isExact;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final DetailsSuggest copy(boolean isExact, boolean isAvailable, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new DetailsSuggest(isExact, isAvailable, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsSuggest)) {
            return false;
        }
        DetailsSuggest detailsSuggest = (DetailsSuggest) other;
        return this.isExact == detailsSuggest.isExact && this.isAvailable == detailsSuggest.isAvailable && Intrinsics.d(this.action, detailsSuggest.action) && Intrinsics.d(this.trackingInfo, detailsSuggest.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(Boolean.hashCode(this.isExact) * 31, 31, this.isAvailable);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isExact() {
        return this.isExact;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isExact;
        boolean z12 = this.isAvailable;
        return a.d(Lh.a.d("DetailsSuggest(isExact=", ", isAvailable=", ", action=", z11, z12), this.action, ", trackingInfo=", this.trackingInfo, ")");
    }

    public /* synthetic */ DetailsSuggest(boolean z11, boolean z12, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, atomActionDTO, map);
    }
}
