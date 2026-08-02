package ru.ozon.app.android.regulardraw.widgets.emptyscreen.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/EmptyScreenDTO;", "", "island", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/IslandDTO;", "button", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/IslandDTO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Ljava/util/Map;)V", "getIsland", "()Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/IslandDTO;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmptyScreenDTO {
    public static final int $stable = 8;

    @NotNull
    private final MorkovskShadowButtonDTO button;

    @NotNull
    private final IslandDTO island;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public EmptyScreenDTO(@NotNull IslandDTO island, @NotNull MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(island, "island");
        Intrinsics.checkNotNullParameter(button, "button");
        this.island = island;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmptyScreenDTO copy$default(EmptyScreenDTO emptyScreenDTO, IslandDTO islandDTO, MorkovskShadowButtonDTO morkovskShadowButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            islandDTO = emptyScreenDTO.island;
        }
        if ((i11 & 2) != 0) {
            morkovskShadowButtonDTO = emptyScreenDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = emptyScreenDTO.trackingInfo;
        }
        return emptyScreenDTO.copy(islandDTO, morkovskShadowButtonDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IslandDTO getIsland() {
        return this.island;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final EmptyScreenDTO copy(@NotNull IslandDTO island, @NotNull MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(island, "island");
        Intrinsics.checkNotNullParameter(button, "button");
        return new EmptyScreenDTO(island, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyScreenDTO)) {
            return false;
        }
        EmptyScreenDTO emptyScreenDTO = (EmptyScreenDTO) other;
        return Intrinsics.d(this.island, emptyScreenDTO.island) && Intrinsics.d(this.button, emptyScreenDTO.button) && Intrinsics.d(this.trackingInfo, emptyScreenDTO.trackingInfo);
    }

    @NotNull
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final IslandDTO getIsland() {
        return this.island;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.button.hashCode() + (this.island.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        IslandDTO islandDTO = this.island;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("EmptyScreenDTO(island=");
        sb2.append(islandDTO);
        sb2.append(", button=");
        sb2.append(morkovskShadowButtonDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
