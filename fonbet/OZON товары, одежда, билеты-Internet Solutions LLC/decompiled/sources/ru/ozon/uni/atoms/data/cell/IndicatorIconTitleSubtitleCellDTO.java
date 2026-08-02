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
import ru.ozon.uni.android.cell.indicator.indicatorIconTitleSubtitleCell.data.IndicatorIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.indicator.indicatorIconTitleSubtitleCell.data.IndicatorIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/uni/atoms/data/cell/IndicatorIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/IndicatorIconTitleSubtitleCellDTO$IndicatorIconTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/IndicatorIconTitleSubtitleCellDTO$IndicatorIconTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/IndicatorIconTitleSubtitleCellDTO$IndicatorIconTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IndicatorIconTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IndicatorIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IndicatorIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final IconDTO icon;
    private final IndicatorDTO indicator;

    @EnumNullFallback
    private final IndicatorIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IndicatorIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final IndicatorIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IndicatorIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : IndicatorIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new IndicatorIconTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IndicatorIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new IndicatorIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/cell/IndicatorIconTitleSubtitleCellDTO$IndicatorIconTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/indicator/indicatorIconTitleSubtitleCell/data/IndicatorIconTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/indicator/indicatorIconTitleSubtitleCell/data/IndicatorIconTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/indicator/indicatorIconTitleSubtitleCell/data/IndicatorIconTitleSubtitleWrapperPreset;", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", "CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IndicatorIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IndicatorIconTitleSubtitleCellPreset[] $VALUES;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500;
        public static final IndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500;

        @NotNull
        private final IndicatorIconTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ IndicatorIconTitleSubtitleCellPreset[] $values() {
            return new IndicatorIconTitleSubtitleCellPreset[]{CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400, CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400, CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500, CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500};
        }

        static {
            IndicatorIconTitleSubtitleWrapperPresets indicatorIconTitleSubtitleWrapperPresets = IndicatorIconTitleSubtitleWrapperPresets.INSTANCE;
            CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500NoShape500TopStart500Default500());
            CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", 1, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500NoShape500TopStart500Control500());
            CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", 2, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd400NoShape400TopStart400Default400());
            CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", 3, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd400NoShape400TopStart400Control400());
            CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", 4, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500shape400TopStart500Default500());
            CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", 5, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500shape400TopStart500Control500());
            CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", 6, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500shape500TopStart500Default500());
            CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", 7, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500shape500TopStart500Control500());
            CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", 8, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500shape600CenterStart500Default500());
            CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500 = new IndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", 9, indicatorIconTitleSubtitleWrapperPresets.getCenterEnd500shape600CenterStart500Control500());
            IndicatorIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IndicatorIconTitleSubtitleCellPreset(String str, int i11, IndicatorIconTitleSubtitleWrapperPreset indicatorIconTitleSubtitleWrapperPreset) {
            this.preset = indicatorIconTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<IndicatorIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static IndicatorIconTitleSubtitleCellPreset valueOf(String str) {
            return (IndicatorIconTitleSubtitleCellPreset) Enum.valueOf(IndicatorIconTitleSubtitleCellPreset.class, str);
        }

        public static IndicatorIconTitleSubtitleCellPreset[] values() {
            return (IndicatorIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final IndicatorIconTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorIconTitleSubtitleCellDTO(IndicatorIconTitleSubtitleCellPreset indicatorIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IndicatorDTO indicatorDTO, IconDTO iconDTO) {
        super(DsAtomsType.INDICATOR_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = indicatorIconTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.indicator = indicatorDTO;
        this.icon = iconDTO;
    }

    public static /* synthetic */ IndicatorIconTitleSubtitleCellDTO copy$default(IndicatorIconTitleSubtitleCellDTO indicatorIconTitleSubtitleCellDTO, IndicatorIconTitleSubtitleCellPreset indicatorIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IndicatorDTO indicatorDTO, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            indicatorIconTitleSubtitleCellPreset = indicatorIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = indicatorIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = indicatorIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = indicatorIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            indicatorDTO = indicatorIconTitleSubtitleCellDTO.indicator;
        }
        if ((i11 & 32) != 0) {
            iconDTO = indicatorIconTitleSubtitleCellDTO.icon;
        }
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        IconDTO iconDTO2 = iconDTO;
        return indicatorIconTitleSubtitleCellDTO.copy(indicatorIconTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2, indicatorDTO2, iconDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final IndicatorIconTitleSubtitleCellPreset getPreset() {
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
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component6, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final IndicatorIconTitleSubtitleCellDTO copy(IndicatorIconTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IndicatorDTO indicator, IconDTO icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IndicatorIconTitleSubtitleCellDTO(preset, common, title, subtitle, indicator, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorIconTitleSubtitleCellDTO)) {
            return false;
        }
        IndicatorIconTitleSubtitleCellDTO indicatorIconTitleSubtitleCellDTO = (IndicatorIconTitleSubtitleCellDTO) other;
        return this.preset == indicatorIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, indicatorIconTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, indicatorIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, indicatorIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.indicator, indicatorIconTitleSubtitleCellDTO.indicator) && Intrinsics.d(this.icon, indicatorIconTitleSubtitleCellDTO.icon);
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.indicatorIconTitleSubtitleCV;
    }

    public final IndicatorIconTitleSubtitleCellPreset getPreset() {
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
        IndicatorIconTitleSubtitleCellPreset indicatorIconTitleSubtitleCellPreset = this.preset;
        int hashCode = (indicatorIconTitleSubtitleCellPreset == null ? 0 : indicatorIconTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode3 = (hashCode2 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        return hashCode3 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IndicatorIconTitleSubtitleCellPreset indicatorIconTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IndicatorDTO indicatorDTO = this.indicator;
        IconDTO iconDTO = this.icon;
        StringBuilder sb2 = new StringBuilder("IndicatorIconTitleSubtitleCellDTO(preset=");
        sb2.append(indicatorIconTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        IndicatorIconTitleSubtitleCellPreset indicatorIconTitleSubtitleCellPreset = this.preset;
        if (indicatorIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(indicatorIconTitleSubtitleCellPreset.name());
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
        IndicatorDTO indicatorDTO = this.indicator;
        if (indicatorDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            indicatorDTO.writeToParcel(dest, flags);
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
