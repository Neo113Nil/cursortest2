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
import ru.ozon.uni.android.cell.disclosure.disclosureIndicatorBadgeTitleSubtitleCell.data.DisclosureIndicatorBadgeTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.disclosureIndicatorBadgeTitleSubtitleCell.data.DisclosureIndicatorBadgeTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00015BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020\u001fJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeTitleSubtitleCellDTO$DisclosureIndicatorBadgeTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "disclosureIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeTitleSubtitleCellDTO$DisclosureIndicatorBadgeTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeTitleSubtitleCellDTO$DisclosureIndicatorBadgeTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getDisclosureIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclosureIndicatorBadgeTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DisclosureIndicatorBadgeTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DisclosureIndicatorBadgeTitleSubtitleCellDTO> CREATOR = new Creator();
    private final BadgeDTO badge;
    private final CommonCellSettings common;
    private final CommonAtomIconDTO disclosureIcon;
    private final IndicatorDTO indicator;

    @EnumNullFallback
    private final DisclosureIndicatorBadgeTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DisclosureIndicatorBadgeTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureIndicatorBadgeTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclosureIndicatorBadgeTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DisclosureIndicatorBadgeTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DisclosureIndicatorBadgeTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BadgeDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureIndicatorBadgeTitleSubtitleCellDTO[] newArray(int i11) {
            return new DisclosureIndicatorBadgeTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeTitleSubtitleCellDTO$DisclosureIndicatorBadgeTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/disclosure/disclosureIndicatorBadgeTitleSubtitleCell/data/DisclosureIndicatorBadgeTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/disclosure/disclosureIndicatorBadgeTitleSubtitleCell/data/DisclosureIndicatorBadgeTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/disclosure/disclosureIndicatorBadgeTitleSubtitleCell/data/DisclosureIndicatorBadgeTitleSubtitleWrapperPreset;", "CENTER_END_500_CENTER_START_500_DEFAULT_500", "CENTER_END_500_CENTER_START_500_CONTROL_500", "CENTER_END_400_CENTER_START_400_DEFAULT_400", "CENTER_END_400_CENTER_START_400_CONTROL_400", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DisclosureIndicatorBadgeTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisclosureIndicatorBadgeTitleSubtitleCellPreset[] $VALUES;
        public static final DisclosureIndicatorBadgeTitleSubtitleCellPreset CENTER_END_400_CENTER_START_400_CONTROL_400;
        public static final DisclosureIndicatorBadgeTitleSubtitleCellPreset CENTER_END_400_CENTER_START_400_DEFAULT_400;
        public static final DisclosureIndicatorBadgeTitleSubtitleCellPreset CENTER_END_500_CENTER_START_500_CONTROL_500;
        public static final DisclosureIndicatorBadgeTitleSubtitleCellPreset CENTER_END_500_CENTER_START_500_DEFAULT_500;

        @NotNull
        private final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ DisclosureIndicatorBadgeTitleSubtitleCellPreset[] $values() {
            return new DisclosureIndicatorBadgeTitleSubtitleCellPreset[]{CENTER_END_500_CENTER_START_500_DEFAULT_500, CENTER_END_500_CENTER_START_500_CONTROL_500, CENTER_END_400_CENTER_START_400_DEFAULT_400, CENTER_END_400_CENTER_START_400_CONTROL_400};
        }

        static {
            DisclosureIndicatorBadgeTitleSubtitleWrapperPresets disclosureIndicatorBadgeTitleSubtitleWrapperPresets = DisclosureIndicatorBadgeTitleSubtitleWrapperPresets.INSTANCE;
            CENTER_END_500_CENTER_START_500_DEFAULT_500 = new DisclosureIndicatorBadgeTitleSubtitleCellPreset("CENTER_END_500_CENTER_START_500_DEFAULT_500", 0, disclosureIndicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd500CenterStart500Default500());
            CENTER_END_500_CENTER_START_500_CONTROL_500 = new DisclosureIndicatorBadgeTitleSubtitleCellPreset("CENTER_END_500_CENTER_START_500_CONTROL_500", 1, disclosureIndicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd500CenterStart500Control500());
            CENTER_END_400_CENTER_START_400_DEFAULT_400 = new DisclosureIndicatorBadgeTitleSubtitleCellPreset("CENTER_END_400_CENTER_START_400_DEFAULT_400", 2, disclosureIndicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd400CenterStart400Default400());
            CENTER_END_400_CENTER_START_400_CONTROL_400 = new DisclosureIndicatorBadgeTitleSubtitleCellPreset("CENTER_END_400_CENTER_START_400_CONTROL_400", 3, disclosureIndicatorBadgeTitleSubtitleWrapperPresets.getCenterEnd400CenterStart400Control400());
            DisclosureIndicatorBadgeTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DisclosureIndicatorBadgeTitleSubtitleCellPreset(String str, int i11, DisclosureIndicatorBadgeTitleSubtitleWrapperPreset disclosureIndicatorBadgeTitleSubtitleWrapperPreset) {
            this.preset = disclosureIndicatorBadgeTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<DisclosureIndicatorBadgeTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DisclosureIndicatorBadgeTitleSubtitleCellPreset valueOf(String str) {
            return (DisclosureIndicatorBadgeTitleSubtitleCellPreset) Enum.valueOf(DisclosureIndicatorBadgeTitleSubtitleCellPreset.class, str);
        }

        public static DisclosureIndicatorBadgeTitleSubtitleCellPreset[] values() {
            return (DisclosureIndicatorBadgeTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final DisclosureIndicatorBadgeTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureIndicatorBadgeTitleSubtitleCellDTO(DisclosureIndicatorBadgeTitleSubtitleCellPreset disclosureIndicatorBadgeTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, IndicatorDTO indicatorDTO, BadgeDTO badgeDTO) {
        super(DsAtomsType.DISCLOSURE_INDICATOR_BADGE_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = disclosureIndicatorBadgeTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.disclosureIcon = commonAtomIconDTO;
        this.indicator = indicatorDTO;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ DisclosureIndicatorBadgeTitleSubtitleCellDTO copy$default(DisclosureIndicatorBadgeTitleSubtitleCellDTO disclosureIndicatorBadgeTitleSubtitleCellDTO, DisclosureIndicatorBadgeTitleSubtitleCellPreset disclosureIndicatorBadgeTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, IndicatorDTO indicatorDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureIndicatorBadgeTitleSubtitleCellPreset = disclosureIndicatorBadgeTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = disclosureIndicatorBadgeTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = disclosureIndicatorBadgeTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = disclosureIndicatorBadgeTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = disclosureIndicatorBadgeTitleSubtitleCellDTO.disclosureIcon;
        }
        if ((i11 & 32) != 0) {
            indicatorDTO = disclosureIndicatorBadgeTitleSubtitleCellDTO.indicator;
        }
        if ((i11 & 64) != 0) {
            badgeDTO = disclosureIndicatorBadgeTitleSubtitleCellDTO.badge;
        }
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return disclosureIndicatorBadgeTitleSubtitleCellDTO.copy(disclosureIndicatorBadgeTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, commonAtomIconDTO2, indicatorDTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclosureIndicatorBadgeTitleSubtitleCellPreset getPreset() {
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
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component7, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final DisclosureIndicatorBadgeTitleSubtitleCellDTO copy(DisclosureIndicatorBadgeTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO disclosureIcon, IndicatorDTO indicator, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureIndicatorBadgeTitleSubtitleCellDTO(preset, common, title, subtitle, disclosureIcon, indicator, badge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureIndicatorBadgeTitleSubtitleCellDTO)) {
            return false;
        }
        DisclosureIndicatorBadgeTitleSubtitleCellDTO disclosureIndicatorBadgeTitleSubtitleCellDTO = (DisclosureIndicatorBadgeTitleSubtitleCellDTO) other;
        return this.preset == disclosureIndicatorBadgeTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, disclosureIndicatorBadgeTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, disclosureIndicatorBadgeTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, disclosureIndicatorBadgeTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.disclosureIcon, disclosureIndicatorBadgeTitleSubtitleCellDTO.disclosureIcon) && Intrinsics.d(this.indicator, disclosureIndicatorBadgeTitleSubtitleCellDTO.indicator) && Intrinsics.d(this.badge, disclosureIndicatorBadgeTitleSubtitleCellDTO.badge);
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

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.disclosureIndicatorBadgeTitleSubtitleCV;
    }

    public final DisclosureIndicatorBadgeTitleSubtitleCellPreset getPreset() {
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
        DisclosureIndicatorBadgeTitleSubtitleCellPreset disclosureIndicatorBadgeTitleSubtitleCellPreset = this.preset;
        int hashCode = (disclosureIndicatorBadgeTitleSubtitleCellPreset == null ? 0 : disclosureIndicatorBadgeTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        int hashCode3 = (hashCode2 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode4 = (hashCode3 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode4 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureIndicatorBadgeTitleSubtitleCellPreset disclosureIndicatorBadgeTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        IndicatorDTO indicatorDTO = this.indicator;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder sb2 = new StringBuilder("DisclosureIndicatorBadgeTitleSubtitleCellDTO(preset=");
        sb2.append(disclosureIndicatorBadgeTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", disclosureIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(", badge=");
        return AZ.c.b(sb2, badgeDTO, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DisclosureIndicatorBadgeTitleSubtitleCellPreset disclosureIndicatorBadgeTitleSubtitleCellPreset = this.preset;
        if (disclosureIndicatorBadgeTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(disclosureIndicatorBadgeTitleSubtitleCellPreset.name());
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
        IndicatorDTO indicatorDTO = this.indicator;
        if (indicatorDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            indicatorDTO.writeToParcel(dest, flags);
        }
        BadgeDTO badgeDTO = this.badge;
        if (badgeDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeDTO.writeToParcel(dest, flags);
        }
    }
}
