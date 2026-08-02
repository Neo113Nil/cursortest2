package ru.ozon.app.android.cml.delivery.molecules.cellList.data;

import B90.C2618u;
import D3.h;
import Ep.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010,J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003JÒ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00142\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006G"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topIslandCornerRadius", "bottomIslandCornerRadius", "islandColor", "", "backgroundColor", "leftMargin", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightMargin", "topMargin", "bottomMargin", "leftPadding", "rightPadding", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "enableHtmlTags", "", "enableCellsSeparators", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopIslandCornerRadius", "getBottomIslandCornerRadius", "getIslandColor", "()Ljava/lang/String;", "getBackgroundColor", "getLeftMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightMargin", "getTopMargin", "getBottomMargin", "getLeftPadding", "getRightPadding", "getTrackingInfo", "()Ljava/util/Map;", "getEnableHtmlTags", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableCellsSeparators", "getCells", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListDTO;", "equals", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CmlCellListDTO {
    private final String backgroundColor;
    private final CornerRadius bottomIslandCornerRadius;
    private final CommonCellSettings.LayoutPadding bottomMargin;

    @NotNull
    private final List<CellDTO> cells;
    private final Boolean enableCellsSeparators;
    private final Boolean enableHtmlTags;
    private final String islandColor;
    private final CornerRadius islandCornerRadius;
    private final CommonCellSettings.LayoutPadding leftMargin;
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final CommonCellSettings.LayoutPadding rightMargin;
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final CornerRadius topIslandCornerRadius;
    private final CommonCellSettings.LayoutPadding topMargin;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CmlCellListDTO(CornerRadius cornerRadius, CornerRadius cornerRadius2, CornerRadius cornerRadius3, String str, String str2, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, CommonCellSettings.LayoutPadding layoutPadding6, Map<String, TokenizedTrackingInfo> map, Boolean bool, Boolean bool2, @NotNull List<CellDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.islandCornerRadius = cornerRadius;
        this.topIslandCornerRadius = cornerRadius2;
        this.bottomIslandCornerRadius = cornerRadius3;
        this.islandColor = str;
        this.backgroundColor = str2;
        this.leftMargin = layoutPadding;
        this.rightMargin = layoutPadding2;
        this.topMargin = layoutPadding3;
        this.bottomMargin = layoutPadding4;
        this.leftPadding = layoutPadding5;
        this.rightPadding = layoutPadding6;
        this.trackingInfo = map;
        this.enableHtmlTags = bool;
        this.enableCellsSeparators = bool2;
        this.cells = cells;
    }

    /* renamed from: component1, reason: from getter */
    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    /* renamed from: component10, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component11, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getEnableHtmlTags() {
        return this.enableHtmlTags;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getEnableCellsSeparators() {
        return this.enableCellsSeparators;
    }

    @NotNull
    public final List<CellDTO> component15() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final CornerRadius getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final CornerRadius getBottomIslandCornerRadius() {
        return this.bottomIslandCornerRadius;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIslandColor() {
        return this.islandColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftMargin() {
        return this.leftMargin;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightMargin() {
        return this.rightMargin;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component9, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final CmlCellListDTO copy(CornerRadius islandCornerRadius, CornerRadius topIslandCornerRadius, CornerRadius bottomIslandCornerRadius, String islandColor, String backgroundColor, CommonCellSettings.LayoutPadding leftMargin, CommonCellSettings.LayoutPadding rightMargin, CommonCellSettings.LayoutPadding topMargin, CommonCellSettings.LayoutPadding bottomMargin, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean enableHtmlTags, Boolean enableCellsSeparators, @NotNull List<CellDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new CmlCellListDTO(islandCornerRadius, topIslandCornerRadius, bottomIslandCornerRadius, islandColor, backgroundColor, leftMargin, rightMargin, topMargin, bottomMargin, leftPadding, rightPadding, trackingInfo, enableHtmlTags, enableCellsSeparators, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmlCellListDTO)) {
            return false;
        }
        CmlCellListDTO cmlCellListDTO = (CmlCellListDTO) other;
        return this.islandCornerRadius == cmlCellListDTO.islandCornerRadius && this.topIslandCornerRadius == cmlCellListDTO.topIslandCornerRadius && this.bottomIslandCornerRadius == cmlCellListDTO.bottomIslandCornerRadius && Intrinsics.d(this.islandColor, cmlCellListDTO.islandColor) && Intrinsics.d(this.backgroundColor, cmlCellListDTO.backgroundColor) && this.leftMargin == cmlCellListDTO.leftMargin && this.rightMargin == cmlCellListDTO.rightMargin && this.topMargin == cmlCellListDTO.topMargin && this.bottomMargin == cmlCellListDTO.bottomMargin && this.leftPadding == cmlCellListDTO.leftPadding && this.rightPadding == cmlCellListDTO.rightPadding && Intrinsics.d(this.trackingInfo, cmlCellListDTO.trackingInfo) && Intrinsics.d(this.enableHtmlTags, cmlCellListDTO.enableHtmlTags) && Intrinsics.d(this.enableCellsSeparators, cmlCellListDTO.enableCellsSeparators) && Intrinsics.d(this.cells, cmlCellListDTO.cells);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getBottomIslandCornerRadius() {
        return this.bottomIslandCornerRadius;
    }

    public final CommonCellSettings.LayoutPadding getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final Boolean getEnableCellsSeparators() {
        return this.enableCellsSeparators;
    }

    public final Boolean getEnableHtmlTags() {
        return this.enableHtmlTags;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    public final CornerRadius getIslandCornerRadius() {
        return this.islandCornerRadius;
    }

    public final CommonCellSettings.LayoutPadding getLeftMargin() {
        return this.leftMargin;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final CommonCellSettings.LayoutPadding getRightMargin() {
        return this.rightMargin;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public final CornerRadius getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    public final CommonCellSettings.LayoutPadding getTopMargin() {
        return this.topMargin;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        CornerRadius cornerRadius = this.islandCornerRadius;
        int hashCode = (cornerRadius == null ? 0 : cornerRadius.hashCode()) * 31;
        CornerRadius cornerRadius2 = this.topIslandCornerRadius;
        int hashCode2 = (hashCode + (cornerRadius2 == null ? 0 : cornerRadius2.hashCode())) * 31;
        CornerRadius cornerRadius3 = this.bottomIslandCornerRadius;
        int hashCode3 = (hashCode2 + (cornerRadius3 == null ? 0 : cornerRadius3.hashCode())) * 31;
        String str = this.islandColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftMargin;
        int hashCode6 = (hashCode5 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightMargin;
        int hashCode7 = (hashCode6 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topMargin;
        int hashCode8 = (hashCode7 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomMargin;
        int hashCode9 = (hashCode8 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding5 = this.leftPadding;
        int hashCode10 = (hashCode9 + (layoutPadding5 == null ? 0 : layoutPadding5.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding6 = this.rightPadding;
        int hashCode11 = (hashCode10 + (layoutPadding6 == null ? 0 : layoutPadding6.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.enableHtmlTags;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableCellsSeparators;
        return this.cells.hashCode() + ((hashCode13 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        CornerRadius cornerRadius = this.islandCornerRadius;
        CornerRadius cornerRadius2 = this.topIslandCornerRadius;
        CornerRadius cornerRadius3 = this.bottomIslandCornerRadius;
        String str = this.islandColor;
        String str2 = this.backgroundColor;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftMargin;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightMargin;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topMargin;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomMargin;
        CommonCellSettings.LayoutPadding layoutPadding5 = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding6 = this.rightPadding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool = this.enableHtmlTags;
        Boolean bool2 = this.enableCellsSeparators;
        List<CellDTO> list = this.cells;
        StringBuilder sb2 = new StringBuilder("CmlCellListDTO(islandCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", topIslandCornerRadius=");
        sb2.append(cornerRadius2);
        sb2.append(", bottomIslandCornerRadius=");
        sb2.append(cornerRadius3);
        sb2.append(", islandColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        sb2.append(str2);
        sb2.append(", leftMargin=");
        sb2.append(layoutPadding);
        sb2.append(", rightMargin=");
        a.f(sb2, layoutPadding2, ", topMargin=", layoutPadding3, ", bottomMargin=");
        a.f(sb2, layoutPadding4, ", leftPadding=", layoutPadding5, ", rightPadding=");
        sb2.append(layoutPadding6);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", enableHtmlTags=");
        h.h(sb2, bool, ", enableCellsSeparators=", bool2, ", cells=");
        return C2618u.h(sb2, list, ")");
    }
}
