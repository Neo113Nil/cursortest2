package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header.FlightSeatsSchemeV2HeaderBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend.MobileLegendBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JM\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "", "headerBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockDTO;", "mobileLegendBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;", "schemeBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "footerBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;", "emptySchemeBlock", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "shouldFetchState", "", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockDTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;Z)V", "getHeaderBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockDTO;", "getMobileLegendBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;", "getSchemeBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "getFooterBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;", "getEmptySchemeBlock", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "getShouldFetchState", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeV2DTO {
    public static final int $stable = 8;
    private final EmptyStateV2DTO emptySchemeBlock;

    @NotNull
    private final FooterBlockV2DTO footerBlock;
    private final FlightSeatsSchemeV2HeaderBlockDTO headerBlock;
    private final MobileLegendBlockV2DTO mobileLegendBlock;
    private final FlightSeatsSchemeV2BlockDTO schemeBlock;
    private final boolean shouldFetchState;

    public FlightSeatsSchemeV2DTO(FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO, MobileLegendBlockV2DTO mobileLegendBlockV2DTO, FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO, @NotNull FooterBlockV2DTO footerBlock, EmptyStateV2DTO emptyStateV2DTO, boolean z11) {
        Intrinsics.checkNotNullParameter(footerBlock, "footerBlock");
        this.headerBlock = flightSeatsSchemeV2HeaderBlockDTO;
        this.mobileLegendBlock = mobileLegendBlockV2DTO;
        this.schemeBlock = flightSeatsSchemeV2BlockDTO;
        this.footerBlock = footerBlock;
        this.emptySchemeBlock = emptyStateV2DTO;
        this.shouldFetchState = z11;
    }

    public static /* synthetic */ FlightSeatsSchemeV2DTO copy$default(FlightSeatsSchemeV2DTO flightSeatsSchemeV2DTO, FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO, MobileLegendBlockV2DTO mobileLegendBlockV2DTO, FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO, FooterBlockV2DTO footerBlockV2DTO, EmptyStateV2DTO emptyStateV2DTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flightSeatsSchemeV2HeaderBlockDTO = flightSeatsSchemeV2DTO.headerBlock;
        }
        if ((i11 & 2) != 0) {
            mobileLegendBlockV2DTO = flightSeatsSchemeV2DTO.mobileLegendBlock;
        }
        if ((i11 & 4) != 0) {
            flightSeatsSchemeV2BlockDTO = flightSeatsSchemeV2DTO.schemeBlock;
        }
        if ((i11 & 8) != 0) {
            footerBlockV2DTO = flightSeatsSchemeV2DTO.footerBlock;
        }
        if ((i11 & 16) != 0) {
            emptyStateV2DTO = flightSeatsSchemeV2DTO.emptySchemeBlock;
        }
        if ((i11 & 32) != 0) {
            z11 = flightSeatsSchemeV2DTO.shouldFetchState;
        }
        EmptyStateV2DTO emptyStateV2DTO2 = emptyStateV2DTO;
        boolean z12 = z11;
        return flightSeatsSchemeV2DTO.copy(flightSeatsSchemeV2HeaderBlockDTO, mobileLegendBlockV2DTO, flightSeatsSchemeV2BlockDTO, footerBlockV2DTO, emptyStateV2DTO2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final FlightSeatsSchemeV2HeaderBlockDTO getHeaderBlock() {
        return this.headerBlock;
    }

    /* renamed from: component2, reason: from getter */
    public final MobileLegendBlockV2DTO getMobileLegendBlock() {
        return this.mobileLegendBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final FlightSeatsSchemeV2BlockDTO getSchemeBlock() {
        return this.schemeBlock;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FooterBlockV2DTO getFooterBlock() {
        return this.footerBlock;
    }

    /* renamed from: component5, reason: from getter */
    public final EmptyStateV2DTO getEmptySchemeBlock() {
        return this.emptySchemeBlock;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    @NotNull
    public final FlightSeatsSchemeV2DTO copy(FlightSeatsSchemeV2HeaderBlockDTO headerBlock, MobileLegendBlockV2DTO mobileLegendBlock, FlightSeatsSchemeV2BlockDTO schemeBlock, @NotNull FooterBlockV2DTO footerBlock, EmptyStateV2DTO emptySchemeBlock, boolean shouldFetchState) {
        Intrinsics.checkNotNullParameter(footerBlock, "footerBlock");
        return new FlightSeatsSchemeV2DTO(headerBlock, mobileLegendBlock, schemeBlock, footerBlock, emptySchemeBlock, shouldFetchState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeV2DTO)) {
            return false;
        }
        FlightSeatsSchemeV2DTO flightSeatsSchemeV2DTO = (FlightSeatsSchemeV2DTO) other;
        return Intrinsics.d(this.headerBlock, flightSeatsSchemeV2DTO.headerBlock) && Intrinsics.d(this.mobileLegendBlock, flightSeatsSchemeV2DTO.mobileLegendBlock) && Intrinsics.d(this.schemeBlock, flightSeatsSchemeV2DTO.schemeBlock) && Intrinsics.d(this.footerBlock, flightSeatsSchemeV2DTO.footerBlock) && Intrinsics.d(this.emptySchemeBlock, flightSeatsSchemeV2DTO.emptySchemeBlock) && this.shouldFetchState == flightSeatsSchemeV2DTO.shouldFetchState;
    }

    public final EmptyStateV2DTO getEmptySchemeBlock() {
        return this.emptySchemeBlock;
    }

    @NotNull
    public final FooterBlockV2DTO getFooterBlock() {
        return this.footerBlock;
    }

    public final FlightSeatsSchemeV2HeaderBlockDTO getHeaderBlock() {
        return this.headerBlock;
    }

    public final MobileLegendBlockV2DTO getMobileLegendBlock() {
        return this.mobileLegendBlock;
    }

    public final FlightSeatsSchemeV2BlockDTO getSchemeBlock() {
        return this.schemeBlock;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public int hashCode() {
        FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO = this.headerBlock;
        int hashCode = (flightSeatsSchemeV2HeaderBlockDTO == null ? 0 : flightSeatsSchemeV2HeaderBlockDTO.hashCode()) * 31;
        MobileLegendBlockV2DTO mobileLegendBlockV2DTO = this.mobileLegendBlock;
        int hashCode2 = (hashCode + (mobileLegendBlockV2DTO == null ? 0 : mobileLegendBlockV2DTO.hashCode())) * 31;
        FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO = this.schemeBlock;
        int hashCode3 = (this.footerBlock.hashCode() + ((hashCode2 + (flightSeatsSchemeV2BlockDTO == null ? 0 : flightSeatsSchemeV2BlockDTO.hashCode())) * 31)) * 31;
        EmptyStateV2DTO emptyStateV2DTO = this.emptySchemeBlock;
        return Boolean.hashCode(this.shouldFetchState) + ((hashCode3 + (emptyStateV2DTO != null ? emptyStateV2DTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "FlightSeatsSchemeV2DTO(headerBlock=" + this.headerBlock + ", mobileLegendBlock=" + this.mobileLegendBlock + ", schemeBlock=" + this.schemeBlock + ", footerBlock=" + this.footerBlock + ", emptySchemeBlock=" + this.emptySchemeBlock + ", shouldFetchState=" + this.shouldFetchState + ")";
    }

    public /* synthetic */ FlightSeatsSchemeV2DTO(FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO, MobileLegendBlockV2DTO mobileLegendBlockV2DTO, FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO, FooterBlockV2DTO footerBlockV2DTO, EmptyStateV2DTO emptyStateV2DTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(flightSeatsSchemeV2HeaderBlockDTO, mobileLegendBlockV2DTO, flightSeatsSchemeV2BlockDTO, footerBlockV2DTO, emptyStateV2DTO, (i11 & 32) != 0 ? false : z11);
    }
}
