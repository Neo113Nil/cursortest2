package ru.ozon.app.android.common.cellList.v2.data;

import Ep.a;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.BadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIndicatorTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorBadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorBadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IndicatorTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003JÜ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006M"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "", "islandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topIslandCornerRadius", "bottomIslandCornerRadius", "islandColor", "", "backgroundColor", "leftMargin", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightMargin", "topMargin", "bottomMargin", "leftPadding", "rightPadding", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "enableHtmlTags", "", "enableCellsSeparators", "eventActions", "Lru/ozon/app/android/common/cellList/v2/data/EventActions;", "cells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/Map;ZLjava/lang/Boolean;Lru/ozon/app/android/common/cellList/v2/data/EventActions;Ljava/util/List;)V", "getIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopIslandCornerRadius", "getBottomIslandCornerRadius", "getIslandColor", "()Ljava/lang/String;", "getBackgroundColor", "getLeftMargin", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightMargin", "getTopMargin", "getBottomMargin", "getLeftPadding", "getRightPadding", "getTrackingInfo", "()Ljava/util/Map;", "getEnableHtmlTags", "()Z", "getEnableCellsSeparators", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEventActions", "()Lru/ozon/app/android/common/cellList/v2/data/EventActions;", "getCells", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/Map;ZLjava/lang/Boolean;Lru/ozon/app/android/common/cellList/v2/data/EventActions;Ljava/util/List;)Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "equals", "other", "hashCode", "", "toString", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CellListV2DTO {
    private final String backgroundColor;
    private final CornerRadius bottomIslandCornerRadius;
    private final CommonCellSettings.LayoutPadding bottomMargin;

    @NotNull
    private final List<AtomDTO> cells;
    private final Boolean enableCellsSeparators;
    private final boolean enableHtmlTags;
    private final EventActions eventActions;
    private final String islandColor;
    private final CornerRadius islandCornerRadius;
    private final CommonCellSettings.LayoutPadding leftMargin;
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final CommonCellSettings.LayoutPadding rightMargin;
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final CornerRadius topIslandCornerRadius;
    private final CommonCellSettings.LayoutPadding topMargin;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public CellListV2DTO(CornerRadius cornerRadius, CornerRadius cornerRadius2, CornerRadius cornerRadius3, String str, String str2, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CommonCellSettings.LayoutPadding layoutPadding5, CommonCellSettings.LayoutPadding layoutPadding6, Map<String, TokenizedTrackingInfo> map, boolean z11, Boolean bool, EventActions eventActions, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badgeTitleSubtitleCell", type = BadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "badgeIconTitleSubtitleCell", type = BadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIconTitleSubtitleCell", type = DisclosureIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureBadgeTitleSubtitleCell", type = DisclosureBadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureBadgeIconTitleSubtitleCell", type = DisclosureBadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorTitleSubtitleCell", type = DisclosureIndicatorTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorIconTitleSubtitleCell", type = DisclosureIndicatorIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorBadgeTitleSubtitleCell", type = DisclosureIndicatorBadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorBadgeIconTitleSubtitleCell", type = DisclosureIndicatorBadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "iconTitleSubtitleCell", type = IconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "iconButtonIconTitleSubtitleCell", type = IconButtonIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorTitleSubtitleCell", type = IndicatorTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorIconTitleSubtitleCell", type = IndicatorIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorBadgeTitleSubtitleCell", type = IndicatorBadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorBadgeIconTitleSubtitleCell", type = IndicatorBadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "checkboxTitleSubtitleCell", type = CheckboxTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "radioTitleSubtitleCell", type = RadioTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "toggleTitleSubtitleCell", type = ToggleTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "titleSubtitleCell", type = TitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "imageTitleSubtitleCell", type = ImageTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "iconButtonTitleSubtitleCell", type = IconButtonTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> cells) {
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
        this.enableHtmlTags = z11;
        this.enableCellsSeparators = bool;
        this.eventActions = eventActions;
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
    public final boolean getEnableHtmlTags() {
        return this.enableHtmlTags;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getEnableCellsSeparators() {
        return this.enableCellsSeparators;
    }

    /* renamed from: component15, reason: from getter */
    public final EventActions getEventActions() {
        return this.eventActions;
    }

    @NotNull
    public final List<AtomDTO> component16() {
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
    public final CellListV2DTO copy(CornerRadius islandCornerRadius, CornerRadius topIslandCornerRadius, CornerRadius bottomIslandCornerRadius, String islandColor, String backgroundColor, CommonCellSettings.LayoutPadding leftMargin, CommonCellSettings.LayoutPadding rightMargin, CommonCellSettings.LayoutPadding topMargin, CommonCellSettings.LayoutPadding bottomMargin, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, Map<String, TokenizedTrackingInfo> trackingInfo, boolean enableHtmlTags, Boolean enableCellsSeparators, EventActions eventActions, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badgeTitleSubtitleCell", type = BadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "badgeIconTitleSubtitleCell", type = BadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureTitleSubtitleCell", type = DisclosureTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIconTitleSubtitleCell", type = DisclosureIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureBadgeTitleSubtitleCell", type = DisclosureBadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureBadgeIconTitleSubtitleCell", type = DisclosureBadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorTitleSubtitleCell", type = DisclosureIndicatorTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorIconTitleSubtitleCell", type = DisclosureIndicatorIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorBadgeTitleSubtitleCell", type = DisclosureIndicatorBadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "disclosureIndicatorBadgeIconTitleSubtitleCell", type = DisclosureIndicatorBadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "iconTitleSubtitleCell", type = IconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "iconButtonIconTitleSubtitleCell", type = IconButtonIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorTitleSubtitleCell", type = IndicatorTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorIconTitleSubtitleCell", type = IndicatorIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorBadgeTitleSubtitleCell", type = IndicatorBadgeTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "indicatorBadgeIconTitleSubtitleCell", type = IndicatorBadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "checkboxTitleSubtitleCell", type = CheckboxTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "radioTitleSubtitleCell", type = RadioTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "toggleTitleSubtitleCell", type = ToggleTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "titleSubtitleCell", type = TitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "imageTitleSubtitleCell", type = ImageTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "iconButtonTitleSubtitleCell", type = IconButtonTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new CellListV2DTO(islandCornerRadius, topIslandCornerRadius, bottomIslandCornerRadius, islandColor, backgroundColor, leftMargin, rightMargin, topMargin, bottomMargin, leftPadding, rightPadding, trackingInfo, enableHtmlTags, enableCellsSeparators, eventActions, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellListV2DTO)) {
            return false;
        }
        CellListV2DTO cellListV2DTO = (CellListV2DTO) other;
        return this.islandCornerRadius == cellListV2DTO.islandCornerRadius && this.topIslandCornerRadius == cellListV2DTO.topIslandCornerRadius && this.bottomIslandCornerRadius == cellListV2DTO.bottomIslandCornerRadius && Intrinsics.d(this.islandColor, cellListV2DTO.islandColor) && Intrinsics.d(this.backgroundColor, cellListV2DTO.backgroundColor) && this.leftMargin == cellListV2DTO.leftMargin && this.rightMargin == cellListV2DTO.rightMargin && this.topMargin == cellListV2DTO.topMargin && this.bottomMargin == cellListV2DTO.bottomMargin && this.leftPadding == cellListV2DTO.leftPadding && this.rightPadding == cellListV2DTO.rightPadding && Intrinsics.d(this.trackingInfo, cellListV2DTO.trackingInfo) && this.enableHtmlTags == cellListV2DTO.enableHtmlTags && Intrinsics.d(this.enableCellsSeparators, cellListV2DTO.enableCellsSeparators) && Intrinsics.d(this.eventActions, cellListV2DTO.eventActions) && Intrinsics.d(this.cells, cellListV2DTO.cells);
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
    public final List<AtomDTO> getCells() {
        return this.cells;
    }

    public final Boolean getEnableCellsSeparators() {
        return this.enableCellsSeparators;
    }

    public final boolean getEnableHtmlTags() {
        return this.enableHtmlTags;
    }

    public final EventActions getEventActions() {
        return this.eventActions;
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
        int a11 = C3532b.a((hashCode11 + (map == null ? 0 : map.hashCode())) * 31, 31, this.enableHtmlTags);
        Boolean bool = this.enableCellsSeparators;
        int hashCode12 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        EventActions eventActions = this.eventActions;
        return this.cells.hashCode() + ((hashCode12 + (eventActions != null ? eventActions.hashCode() : 0)) * 31);
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
        boolean z11 = this.enableHtmlTags;
        Boolean bool = this.enableCellsSeparators;
        EventActions eventActions = this.eventActions;
        List<AtomDTO> list = this.cells;
        StringBuilder sb2 = new StringBuilder("CellListV2DTO(islandCornerRadius=");
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
        sb2.append(z11);
        sb2.append(", enableCellsSeparators=");
        sb2.append(bool);
        sb2.append(", eventActions=");
        sb2.append(eventActions);
        sb2.append(", cells=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CellListV2DTO(ru.ozon.uni.atoms.data.common.CornerRadius r20, ru.ozon.uni.atoms.data.common.CornerRadius r21, ru.ozon.uni.atoms.data.common.CornerRadius r22, java.lang.String r23, java.lang.String r24, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r25, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r26, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r27, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r28, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r29, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r30, java.util.Map r31, boolean r32, java.lang.Boolean r33, ru.ozon.app.android.common.cellList.v2.data.EventActions r34, java.util.List r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto La
            ru.ozon.uni.atoms.data.common.CornerRadius r1 = ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_500
            r3 = r1
            goto Lc
        La:
            r3 = r20
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            ru.ozon.uni.atoms.data.common.CornerRadius r1 = ru.ozon.uni.atoms.data.common.CornerRadius.NO_RADIUS
            r4 = r1
            goto L16
        L14:
            r4 = r21
        L16:
            r1 = r0 & 4
            if (r1 == 0) goto L1e
            ru.ozon.uni.atoms.data.common.CornerRadius r1 = ru.ozon.uni.atoms.data.common.CornerRadius.NO_RADIUS
            r5 = r1
            goto L20
        L1e:
            r5 = r22
        L20:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L27
            r14 = r2
            goto L29
        L27:
            r14 = r31
        L29:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L30
            r1 = 0
            r15 = r1
            goto L32
        L30:
            r15 = r32
        L32:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L3b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r16 = r1
            goto L3d
        L3b:
            r16 = r33
        L3d:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L58
            r17 = r2
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r18 = r35
            r2 = r19
            goto L6e
        L58:
            r17 = r34
            r2 = r19
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r18 = r35
        L6e:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO.<init>(ru.ozon.uni.atoms.data.common.CornerRadius, ru.ozon.uni.atoms.data.common.CornerRadius, ru.ozon.uni.atoms.data.common.CornerRadius, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, java.util.Map, boolean, java.lang.Boolean, ru.ozon.app.android.common.cellList.v2.data.EventActions, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
