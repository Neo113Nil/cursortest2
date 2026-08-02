package ru.ozon.app.android.cml.delivery.widgets.cellList.data;

import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001*BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListDTO;", "", "cellList", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "headerCellList", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "buttonTopMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "islandSeparator", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListDTO$SeparatorConfig;", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListDTO$SeparatorConfig;)V", "getCellList", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "getHeaderCellList", "getButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getButtonTopMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getIslandSeparator", "()Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListDTO$SeparatorConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SeparatorConfig", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CmlCellListDTO {
    private final Paddings buttonTopMargin;
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final CmlCellListMoleculeDTO cellList;
    private final CmlCellListMoleculeDTO headerCellList;
    private final SeparatorConfig islandSeparator;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListDTO$SeparatorConfig;", "", "height", "", "backgroundColor", "", "<init>", "(ILjava/lang/String;)V", "getHeight", "()I", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorConfig {

        @NotNull
        private final String backgroundColor;
        private final int height;

        public SeparatorConfig(int i11, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.height = i11;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ SeparatorConfig copy$default(SeparatorConfig separatorConfig, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = separatorConfig.height;
            }
            if ((i12 & 2) != 0) {
                str = separatorConfig.backgroundColor;
            }
            return separatorConfig.copy(i11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final SeparatorConfig copy(int height, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new SeparatorConfig(height, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorConfig)) {
                return false;
            }
            SeparatorConfig separatorConfig = (SeparatorConfig) other;
            return this.height == separatorConfig.height && Intrinsics.d(this.backgroundColor, separatorConfig.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getHeight() {
            return this.height;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (Integer.hashCode(this.height) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.height, "SeparatorConfig(height=", ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    public CmlCellListDTO(@NotNull CmlCellListMoleculeDTO cellList, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, List<ButtonV3DTO> list, Map<String, TokenizedTrackingInfo> map, Paddings paddings, SeparatorConfig separatorConfig) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.cellList = cellList;
        this.headerCellList = cmlCellListMoleculeDTO;
        this.buttons = list;
        this.trackingInfo = map;
        this.buttonTopMargin = paddings;
        this.islandSeparator = separatorConfig;
    }

    public static /* synthetic */ CmlCellListDTO copy$default(CmlCellListDTO cmlCellListDTO, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, CmlCellListMoleculeDTO cmlCellListMoleculeDTO2, List list, Map map, Paddings paddings, SeparatorConfig separatorConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cmlCellListMoleculeDTO = cmlCellListDTO.cellList;
        }
        if ((i11 & 2) != 0) {
            cmlCellListMoleculeDTO2 = cmlCellListDTO.headerCellList;
        }
        if ((i11 & 4) != 0) {
            list = cmlCellListDTO.buttons;
        }
        if ((i11 & 8) != 0) {
            map = cmlCellListDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            paddings = cmlCellListDTO.buttonTopMargin;
        }
        if ((i11 & 32) != 0) {
            separatorConfig = cmlCellListDTO.islandSeparator;
        }
        Paddings paddings2 = paddings;
        SeparatorConfig separatorConfig2 = separatorConfig;
        return cmlCellListDTO.copy(cmlCellListMoleculeDTO, cmlCellListMoleculeDTO2, list, map, paddings2, separatorConfig2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    /* renamed from: component2, reason: from getter */
    public final CmlCellListMoleculeDTO getHeaderCellList() {
        return this.headerCellList;
    }

    public final List<ButtonV3DTO> component3() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getButtonTopMargin() {
        return this.buttonTopMargin;
    }

    /* renamed from: component6, reason: from getter */
    public final SeparatorConfig getIslandSeparator() {
        return this.islandSeparator;
    }

    @NotNull
    public final CmlCellListDTO copy(@NotNull CmlCellListMoleculeDTO cellList, CmlCellListMoleculeDTO headerCellList, List<ButtonV3DTO> buttons, Map<String, TokenizedTrackingInfo> trackingInfo, Paddings buttonTopMargin, SeparatorConfig islandSeparator) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        return new CmlCellListDTO(cellList, headerCellList, buttons, trackingInfo, buttonTopMargin, islandSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmlCellListDTO)) {
            return false;
        }
        CmlCellListDTO cmlCellListDTO = (CmlCellListDTO) other;
        return Intrinsics.d(this.cellList, cmlCellListDTO.cellList) && Intrinsics.d(this.headerCellList, cmlCellListDTO.headerCellList) && Intrinsics.d(this.buttons, cmlCellListDTO.buttons) && Intrinsics.d(this.trackingInfo, cmlCellListDTO.trackingInfo) && this.buttonTopMargin == cmlCellListDTO.buttonTopMargin && Intrinsics.d(this.islandSeparator, cmlCellListDTO.islandSeparator);
    }

    public final Paddings getButtonTopMargin() {
        return this.buttonTopMargin;
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    public final CmlCellListMoleculeDTO getHeaderCellList() {
        return this.headerCellList;
    }

    public final SeparatorConfig getIslandSeparator() {
        return this.islandSeparator;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cellList.hashCode() * 31;
        CmlCellListMoleculeDTO cmlCellListMoleculeDTO = this.headerCellList;
        int hashCode2 = (hashCode + (cmlCellListMoleculeDTO == null ? 0 : cmlCellListMoleculeDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Paddings paddings = this.buttonTopMargin;
        int hashCode5 = (hashCode4 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        SeparatorConfig separatorConfig = this.islandSeparator;
        return hashCode5 + (separatorConfig != null ? separatorConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CmlCellListDTO(cellList=" + this.cellList + ", headerCellList=" + this.headerCellList + ", buttons=" + this.buttons + ", trackingInfo=" + this.trackingInfo + ", buttonTopMargin=" + this.buttonTopMargin + ", islandSeparator=" + this.islandSeparator + ")";
    }
}
