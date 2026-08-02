package ru.ozon.uni.atoms.data.cell;

import D40.c;
import D40.d;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.disclosure.disclosureBadgeIconTitleSubtitleCell.data.DisclosureBadgeIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.disclosureBadgeIconTitleSubtitleCell.data.DisclosureBadgeIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00015BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020\u001fJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO$DisclosureBadgeIconTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "disclosureIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO$DisclosureBadgeIconTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO$DisclosureBadgeIconTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getDisclosureIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclosureBadgeIconTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DisclosureBadgeIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DisclosureBadgeIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final BadgeDTO badge;
    private final CommonCellSettings common;
    private final CommonAtomIconDTO disclosureIcon;
    private final IconDTO icon;

    @EnumNullFallback
    private final DisclosureBadgeIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DisclosureBadgeIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureBadgeIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclosureBadgeIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DisclosureBadgeIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DisclosureBadgeIconTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BadgeDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureBadgeIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new DisclosureBadgeIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO$DisclosureBadgeIconTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/disclosure/disclosureBadgeIconTitleSubtitleCell/data/DisclosureBadgeIconTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/disclosure/disclosureBadgeIconTitleSubtitleCell/data/DisclosureBadgeIconTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/disclosure/disclosureBadgeIconTitleSubtitleCell/data/DisclosureBadgeIconTitleSubtitleWrapperPreset;", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", "CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DisclosureBadgeIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisclosureBadgeIconTitleSubtitleCellPreset[] $VALUES;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500;
        public static final DisclosureBadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500;

        @NotNull
        private final DisclosureBadgeIconTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ DisclosureBadgeIconTitleSubtitleCellPreset[] $values() {
            return new DisclosureBadgeIconTitleSubtitleCellPreset[]{CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400, CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400, CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500, CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500};
        }

        static {
            DisclosureBadgeIconTitleSubtitleWrapperPresets disclosureBadgeIconTitleSubtitleWrapperPresets = DisclosureBadgeIconTitleSubtitleWrapperPresets.INSTANCE;
            CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500NoShape500TopStart500Default500());
            CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", 1, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500NoShape500TopStart500Control500());
            CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", 2, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd400NoShape400TopStart400Default400());
            CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", 3, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd400NoShape400TopStart400Control400());
            CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", 4, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500Shape400TopStart500Default500());
            CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", 5, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500shape400TopStart500Control500());
            CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", 6, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500Shape500TopStart500Default500());
            CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", 7, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500shape500TopStart500Control500());
            CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", 8, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500Shape600CenterStart500Default500());
            CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500 = new DisclosureBadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", 9, disclosureBadgeIconTitleSubtitleWrapperPresets.getCenterEnd500shape600CenterStart500Control500());
            DisclosureBadgeIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DisclosureBadgeIconTitleSubtitleCellPreset(String str, int i11, DisclosureBadgeIconTitleSubtitleWrapperPreset disclosureBadgeIconTitleSubtitleWrapperPreset) {
            this.preset = disclosureBadgeIconTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<DisclosureBadgeIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DisclosureBadgeIconTitleSubtitleCellPreset valueOf(String str) {
            return (DisclosureBadgeIconTitleSubtitleCellPreset) Enum.valueOf(DisclosureBadgeIconTitleSubtitleCellPreset.class, str);
        }

        public static DisclosureBadgeIconTitleSubtitleCellPreset[] values() {
            return (DisclosureBadgeIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final DisclosureBadgeIconTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureBadgeIconTitleSubtitleCellDTO(DisclosureBadgeIconTitleSubtitleCellPreset disclosureBadgeIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, BadgeDTO badgeDTO, IconDTO iconDTO) {
        super(DsAtomsType.DISCLOSURE_BADGE_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = disclosureBadgeIconTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.disclosureIcon = commonAtomIconDTO;
        this.badge = badgeDTO;
        this.icon = iconDTO;
    }

    public static /* synthetic */ DisclosureBadgeIconTitleSubtitleCellDTO copy$default(DisclosureBadgeIconTitleSubtitleCellDTO disclosureBadgeIconTitleSubtitleCellDTO, DisclosureBadgeIconTitleSubtitleCellPreset disclosureBadgeIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, BadgeDTO badgeDTO, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureBadgeIconTitleSubtitleCellPreset = disclosureBadgeIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = disclosureBadgeIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = disclosureBadgeIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = disclosureBadgeIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = disclosureBadgeIconTitleSubtitleCellDTO.disclosureIcon;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = disclosureBadgeIconTitleSubtitleCellDTO.badge;
        }
        if ((i11 & 64) != 0) {
            iconDTO = disclosureBadgeIconTitleSubtitleCellDTO.icon;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        IconDTO iconDTO2 = iconDTO;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return disclosureBadgeIconTitleSubtitleCellDTO.copy(disclosureBadgeIconTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, commonAtomIconDTO2, badgeDTO2, iconDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclosureBadgeIconTitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonAtomIconDTO getDisclosureIcon() {
        return this.disclosureIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component7, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final DisclosureBadgeIconTitleSubtitleCellDTO copy(DisclosureBadgeIconTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO disclosureIcon, BadgeDTO badge, IconDTO icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureBadgeIconTitleSubtitleCellDTO(preset, common, title, subtitle, disclosureIcon, badge, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureBadgeIconTitleSubtitleCellDTO)) {
            return false;
        }
        DisclosureBadgeIconTitleSubtitleCellDTO disclosureBadgeIconTitleSubtitleCellDTO = (DisclosureBadgeIconTitleSubtitleCellDTO) other;
        return this.preset == disclosureBadgeIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, disclosureBadgeIconTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, disclosureBadgeIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, disclosureBadgeIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.disclosureIcon, disclosureBadgeIconTitleSubtitleCellDTO.disclosureIcon) && Intrinsics.d(this.badge, disclosureBadgeIconTitleSubtitleCellDTO.badge) && Intrinsics.d(this.icon, disclosureBadgeIconTitleSubtitleCellDTO.icon);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getDisclosureIcon() {
        return this.disclosureIcon;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.disclosureBadgeIconTitleSubtitleCV;
    }

    public final DisclosureBadgeIconTitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        DisclosureBadgeIconTitleSubtitleCellPreset disclosureBadgeIconTitleSubtitleCellPreset = this.preset;
        int hashCode = (disclosureBadgeIconTitleSubtitleCellPreset == null ? 0 : disclosureBadgeIconTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        int hashCode3 = (hashCode2 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        return hashCode4 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureBadgeIconTitleSubtitleCellPreset disclosureBadgeIconTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        BadgeDTO badgeDTO = this.badge;
        IconDTO iconDTO = this.icon;
        StringBuilder sb2 = new StringBuilder("DisclosureBadgeIconTitleSubtitleCellDTO(preset=");
        sb2.append(disclosureBadgeIconTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", disclosureIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DisclosureBadgeIconTitleSubtitleCellPreset disclosureBadgeIconTitleSubtitleCellPreset = this.preset;
        if (disclosureBadgeIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(disclosureBadgeIconTitleSubtitleCellPreset.name());
        }
        CommonCellSettings commonCellSettings = this.common;
        if (commonCellSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonCellSettings.writeToParcel(dest, flags);
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        if (commonAtomIconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomIconDTO.writeToParcel(dest, flags);
        }
        BadgeDTO badgeDTO = this.badge;
        if (badgeDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeDTO.writeToParcel(dest, flags);
        }
        IconDTO iconDTO = this.icon;
        if (iconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconDTO.writeToParcel(dest, flags);
        }
    }
}
