package ru.ozon.app.android.marketing.widgets.ladderActions.data;

import De.C2859b;
import Fm.C3051a;
import G.g;
import Pk0.a;
import Tz.C4055a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO;", "", "cells", "", "Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO$LadderActionsCellDTO;", "backgroundColor", "", "cellSeparatorColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getCellSeparatorColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LadderActionsCellDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LadderActionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String cellSeparatorColor;

    @NotNull
    private final List<LadderActionsCellDTO> cells;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/data/LadderActionsDTO$LadderActionsCellDTO;", "", "primaryPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "secondaryPrice", "defaultButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "activeButton", "isActive", "", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "getPrimaryPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSecondaryPrice", "getDefaultButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActiveButton", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LadderActionsCellDTO {
        public static final int $stable = PriceDTO.$stable;

        @NotNull
        private final ButtonV3DTO activeButton;

        @NotNull
        private final ButtonV3DTO defaultButton;
        private final boolean isActive;

        @NotNull
        private final PriceDTO primaryPrice;

        @NotNull
        private final PriceDTO secondaryPrice;

        public LadderActionsCellDTO(@NotNull PriceDTO primaryPrice, @NotNull PriceDTO secondaryPrice, @NotNull ButtonV3DTO defaultButton, @NotNull ButtonV3DTO activeButton, boolean z11) {
            Intrinsics.checkNotNullParameter(primaryPrice, "primaryPrice");
            Intrinsics.checkNotNullParameter(secondaryPrice, "secondaryPrice");
            Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
            Intrinsics.checkNotNullParameter(activeButton, "activeButton");
            this.primaryPrice = primaryPrice;
            this.secondaryPrice = secondaryPrice;
            this.defaultButton = defaultButton;
            this.activeButton = activeButton;
            this.isActive = z11;
        }

        public static /* synthetic */ LadderActionsCellDTO copy$default(LadderActionsCellDTO ladderActionsCellDTO, PriceDTO priceDTO, PriceDTO priceDTO2, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceDTO = ladderActionsCellDTO.primaryPrice;
            }
            if ((i11 & 2) != 0) {
                priceDTO2 = ladderActionsCellDTO.secondaryPrice;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = ladderActionsCellDTO.defaultButton;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO2 = ladderActionsCellDTO.activeButton;
            }
            if ((i11 & 16) != 0) {
                z11 = ladderActionsCellDTO.isActive;
            }
            boolean z12 = z11;
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
            return ladderActionsCellDTO.copy(priceDTO, priceDTO2, buttonV3DTO3, buttonV3DTO2, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceDTO getPrimaryPrice() {
            return this.primaryPrice;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getSecondaryPrice() {
            return this.secondaryPrice;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getDefaultButton() {
            return this.defaultButton;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getActiveButton() {
            return this.activeButton;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final LadderActionsCellDTO copy(@NotNull PriceDTO primaryPrice, @NotNull PriceDTO secondaryPrice, @NotNull ButtonV3DTO defaultButton, @NotNull ButtonV3DTO activeButton, boolean isActive) {
            Intrinsics.checkNotNullParameter(primaryPrice, "primaryPrice");
            Intrinsics.checkNotNullParameter(secondaryPrice, "secondaryPrice");
            Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
            Intrinsics.checkNotNullParameter(activeButton, "activeButton");
            return new LadderActionsCellDTO(primaryPrice, secondaryPrice, defaultButton, activeButton, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LadderActionsCellDTO)) {
                return false;
            }
            LadderActionsCellDTO ladderActionsCellDTO = (LadderActionsCellDTO) other;
            return Intrinsics.d(this.primaryPrice, ladderActionsCellDTO.primaryPrice) && Intrinsics.d(this.secondaryPrice, ladderActionsCellDTO.secondaryPrice) && Intrinsics.d(this.defaultButton, ladderActionsCellDTO.defaultButton) && Intrinsics.d(this.activeButton, ladderActionsCellDTO.activeButton) && this.isActive == ladderActionsCellDTO.isActive;
        }

        @NotNull
        public final ButtonV3DTO getActiveButton() {
            return this.activeButton;
        }

        @NotNull
        public final ButtonV3DTO getDefaultButton() {
            return this.defaultButton;
        }

        @NotNull
        public final PriceDTO getPrimaryPrice() {
            return this.primaryPrice;
        }

        @NotNull
        public final PriceDTO getSecondaryPrice() {
            return this.secondaryPrice;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + C2859b.c(this.activeButton, C2859b.c(this.defaultButton, C3051a.b(this.secondaryPrice, this.primaryPrice.hashCode() * 31, 31), 31), 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            PriceDTO priceDTO = this.primaryPrice;
            PriceDTO priceDTO2 = this.secondaryPrice;
            ButtonV3DTO buttonV3DTO = this.defaultButton;
            ButtonV3DTO buttonV3DTO2 = this.activeButton;
            boolean z11 = this.isActive;
            StringBuilder sb2 = new StringBuilder("LadderActionsCellDTO(primaryPrice=");
            sb2.append(priceDTO);
            sb2.append(", secondaryPrice=");
            sb2.append(priceDTO2);
            sb2.append(", defaultButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", activeButton=");
            sb2.append(buttonV3DTO2);
            sb2.append(", isActive=");
            return a.a(")", sb2, z11);
        }
    }

    public LadderActionsDTO(@NotNull List<LadderActionsCellDTO> cells, @NotNull String backgroundColor, @NotNull String cellSeparatorColor, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cellSeparatorColor, "cellSeparatorColor");
        this.cells = cells;
        this.backgroundColor = backgroundColor;
        this.cellSeparatorColor = cellSeparatorColor;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LadderActionsDTO copy$default(LadderActionsDTO ladderActionsDTO, List list, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = ladderActionsDTO.cells;
        }
        if ((i11 & 2) != 0) {
            str = ladderActionsDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = ladderActionsDTO.cellSeparatorColor;
        }
        if ((i11 & 8) != 0) {
            map = ladderActionsDTO.trackingInfo;
        }
        return ladderActionsDTO.copy(list, str, str2, map);
    }

    @NotNull
    public final List<LadderActionsCellDTO> component1() {
        return this.cells;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCellSeparatorColor() {
        return this.cellSeparatorColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final LadderActionsDTO copy(@NotNull List<LadderActionsCellDTO> cells, @NotNull String backgroundColor, @NotNull String cellSeparatorColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cellSeparatorColor, "cellSeparatorColor");
        return new LadderActionsDTO(cells, backgroundColor, cellSeparatorColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderActionsDTO)) {
            return false;
        }
        LadderActionsDTO ladderActionsDTO = (LadderActionsDTO) other;
        return Intrinsics.d(this.cells, ladderActionsDTO.cells) && Intrinsics.d(this.backgroundColor, ladderActionsDTO.backgroundColor) && Intrinsics.d(this.cellSeparatorColor, ladderActionsDTO.cellSeparatorColor) && Intrinsics.d(this.trackingInfo, ladderActionsDTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getCellSeparatorColor() {
        return this.cellSeparatorColor;
    }

    @NotNull
    public final List<LadderActionsCellDTO> getCells() {
        return this.cells;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.cells.hashCode() * 31, 31, this.backgroundColor), 31, this.cellSeparatorColor);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<LadderActionsCellDTO> list = this.cells;
        String str = this.backgroundColor;
        return C4070a.a(C4055a.a("LadderActionsDTO(cells=", ", backgroundColor=", str, ", cellSeparatorColor=", list), this.cellSeparatorColor, ", trackingInfo=", this.trackingInfo, ")");
    }
}
