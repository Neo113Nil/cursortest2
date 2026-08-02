package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.data;

import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.starsBalance.StarsBalanceMoleculeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileDTO;", "", "firstBlock", "Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;", "secondBlock", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;Ljava/lang/String;Ljava/util/Map;)V", "getFirstBlock", "()Lru/ozon/app/android/travel/molecules/dto/starsBalance/StarsBalanceMoleculeDTO;", "getSecondBlock", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StarsTileDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final StarsBalanceMoleculeDTO firstBlock;

    @NotNull
    private final StarsBalanceMoleculeDTO secondBlock;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public StarsTileDTO(@NotNull StarsBalanceMoleculeDTO firstBlock, @NotNull StarsBalanceMoleculeDTO secondBlock, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
        this.firstBlock = firstBlock;
        this.secondBlock = secondBlock;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StarsTileDTO copy$default(StarsTileDTO starsTileDTO, StarsBalanceMoleculeDTO starsBalanceMoleculeDTO, StarsBalanceMoleculeDTO starsBalanceMoleculeDTO2, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            starsBalanceMoleculeDTO = starsTileDTO.firstBlock;
        }
        if ((i11 & 2) != 0) {
            starsBalanceMoleculeDTO2 = starsTileDTO.secondBlock;
        }
        if ((i11 & 4) != 0) {
            str = starsTileDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = starsTileDTO.trackingInfo;
        }
        return starsTileDTO.copy(starsBalanceMoleculeDTO, starsBalanceMoleculeDTO2, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StarsBalanceMoleculeDTO getFirstBlock() {
        return this.firstBlock;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StarsBalanceMoleculeDTO getSecondBlock() {
        return this.secondBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final StarsTileDTO copy(@NotNull StarsBalanceMoleculeDTO firstBlock, @NotNull StarsBalanceMoleculeDTO secondBlock, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
        return new StarsTileDTO(firstBlock, secondBlock, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarsTileDTO)) {
            return false;
        }
        StarsTileDTO starsTileDTO = (StarsTileDTO) other;
        return Intrinsics.d(this.firstBlock, starsTileDTO.firstBlock) && Intrinsics.d(this.secondBlock, starsTileDTO.secondBlock) && Intrinsics.d(this.backgroundColor, starsTileDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, starsTileDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final StarsBalanceMoleculeDTO getFirstBlock() {
        return this.firstBlock;
    }

    @NotNull
    public final StarsBalanceMoleculeDTO getSecondBlock() {
        return this.secondBlock;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.secondBlock.hashCode() + (this.firstBlock.hashCode() * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StarsBalanceMoleculeDTO starsBalanceMoleculeDTO = this.firstBlock;
        StarsBalanceMoleculeDTO starsBalanceMoleculeDTO2 = this.secondBlock;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("StarsTileDTO(firstBlock=");
        sb2.append(starsBalanceMoleculeDTO);
        sb2.append(", secondBlock=");
        sb2.append(starsBalanceMoleculeDTO2);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
