package ru.ozon.app.android.storefront.widgets.megadraw.data;

import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "countBlock", "Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "prizesBlock", "Lru/ozon/app/android/storefront/widgets/megadraw/data/PrizesBlockDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;Lru/ozon/app/android/storefront/widgets/megadraw/data/PrizesBlockDTO;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCountBlock", "()Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "getPrizesBlock", "()Lru/ozon/app/android/storefront/widgets/megadraw/data/PrizesBlockDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MegaDrawDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final CountBlockDTO countBlock;
    private final HeaderDTO header;

    @NotNull
    private final PrizesBlockDTO prizesBlock;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public MegaDrawDTO(HeaderDTO headerDTO, @NotNull AtomActionDTO action, @NotNull CountBlockDTO countBlock, @NotNull PrizesBlockDTO prizesBlock, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(countBlock, "countBlock");
        Intrinsics.checkNotNullParameter(prizesBlock, "prizesBlock");
        this.header = headerDTO;
        this.action = action;
        this.countBlock = countBlock;
        this.prizesBlock = prizesBlock;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MegaDrawDTO copy$default(MegaDrawDTO megaDrawDTO, HeaderDTO headerDTO, AtomActionDTO atomActionDTO, CountBlockDTO countBlockDTO, PrizesBlockDTO prizesBlockDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = megaDrawDTO.header;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = megaDrawDTO.action;
        }
        if ((i11 & 4) != 0) {
            countBlockDTO = megaDrawDTO.countBlock;
        }
        if ((i11 & 8) != 0) {
            prizesBlockDTO = megaDrawDTO.prizesBlock;
        }
        if ((i11 & 16) != 0) {
            map = megaDrawDTO.trackingInfo;
        }
        Map map2 = map;
        CountBlockDTO countBlockDTO2 = countBlockDTO;
        return megaDrawDTO.copy(headerDTO, atomActionDTO, countBlockDTO2, prizesBlockDTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CountBlockDTO getCountBlock() {
        return this.countBlock;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PrizesBlockDTO getPrizesBlock() {
        return this.prizesBlock;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final MegaDrawDTO copy(HeaderDTO header, @NotNull AtomActionDTO action, @NotNull CountBlockDTO countBlock, @NotNull PrizesBlockDTO prizesBlock, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(countBlock, "countBlock");
        Intrinsics.checkNotNullParameter(prizesBlock, "prizesBlock");
        return new MegaDrawDTO(header, action, countBlock, prizesBlock, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MegaDrawDTO)) {
            return false;
        }
        MegaDrawDTO megaDrawDTO = (MegaDrawDTO) other;
        return Intrinsics.d(this.header, megaDrawDTO.header) && Intrinsics.d(this.action, megaDrawDTO.action) && Intrinsics.d(this.countBlock, megaDrawDTO.countBlock) && Intrinsics.d(this.prizesBlock, megaDrawDTO.prizesBlock) && Intrinsics.d(this.trackingInfo, megaDrawDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final CountBlockDTO getCountBlock() {
        return this.countBlock;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final PrizesBlockDTO getPrizesBlock() {
        return this.prizesBlock;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int hashCode = (this.prizesBlock.hashCode() + ((this.countBlock.hashCode() + a.b(this.action, (headerDTO == null ? 0 : headerDTO.hashCode()) * 31, 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        HeaderDTO headerDTO = this.header;
        AtomActionDTO atomActionDTO = this.action;
        CountBlockDTO countBlockDTO = this.countBlock;
        PrizesBlockDTO prizesBlockDTO = this.prizesBlock;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MegaDrawDTO(header=");
        sb2.append(headerDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", countBlock=");
        sb2.append(countBlockDTO);
        sb2.append(", prizesBlock=");
        sb2.append(prizesBlockDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ MegaDrawDTO(HeaderDTO headerDTO, AtomActionDTO atomActionDTO, CountBlockDTO countBlockDTO, PrizesBlockDTO prizesBlockDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : headerDTO, atomActionDTO, countBlockDTO, prizesBlockDTO, map);
    }
}
