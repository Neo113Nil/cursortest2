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
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.data.IndicatorTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.data.IndicatorTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/cell/IndicatorTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/IndicatorTitleSubtitleCellDTO$IndicatorTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/IndicatorTitleSubtitleCellDTO$IndicatorTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/IndicatorTitleSubtitleCellDTO$IndicatorTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IndicatorTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IndicatorTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IndicatorTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final IndicatorDTO indicator;

    @EnumNullFallback
    private final IndicatorTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IndicatorTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final IndicatorTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IndicatorTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : IndicatorTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new IndicatorTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? IndicatorDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IndicatorTitleSubtitleCellDTO[] newArray(int i11) {
            return new IndicatorTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/cell/IndicatorTitleSubtitleCellDTO$IndicatorTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "CENTER_END_500_DEFAULT_500", "CENTER_END_500_CONTROL_500", "CENTER_END_400_DEFAULT_400", "CENTER_END_400_CONTROL_400", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IndicatorTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IndicatorTitleSubtitleCellPreset[] $VALUES;
        public static final IndicatorTitleSubtitleCellPreset CENTER_END_400_CONTROL_400;
        public static final IndicatorTitleSubtitleCellPreset CENTER_END_400_DEFAULT_400;
        public static final IndicatorTitleSubtitleCellPreset CENTER_END_500_CONTROL_500;
        public static final IndicatorTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500;

        @NotNull
        private final IndicatorTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ IndicatorTitleSubtitleCellPreset[] $values() {
            return new IndicatorTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500, CENTER_END_500_CONTROL_500, CENTER_END_400_DEFAULT_400, CENTER_END_400_CONTROL_400};
        }

        static {
            IndicatorTitleSubtitleWrapperPresets indicatorTitleSubtitleWrapperPresets = IndicatorTitleSubtitleWrapperPresets.INSTANCE;
            CENTER_END_500_DEFAULT_500 = new IndicatorTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, indicatorTitleSubtitleWrapperPresets.getCenterEnd500Default500());
            CENTER_END_500_CONTROL_500 = new IndicatorTitleSubtitleCellPreset("CENTER_END_500_CONTROL_500", 1, indicatorTitleSubtitleWrapperPresets.getCenterEnd500Control500());
            CENTER_END_400_DEFAULT_400 = new IndicatorTitleSubtitleCellPreset("CENTER_END_400_DEFAULT_400", 2, indicatorTitleSubtitleWrapperPresets.getCenterEnd400Default400());
            CENTER_END_400_CONTROL_400 = new IndicatorTitleSubtitleCellPreset("CENTER_END_400_CONTROL_400", 3, indicatorTitleSubtitleWrapperPresets.getCenterEnd400Control400());
            IndicatorTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IndicatorTitleSubtitleCellPreset(String str, int i11, IndicatorTitleSubtitleWrapperPreset indicatorTitleSubtitleWrapperPreset) {
            this.preset = indicatorTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<IndicatorTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static IndicatorTitleSubtitleCellPreset valueOf(String str) {
            return (IndicatorTitleSubtitleCellPreset) Enum.valueOf(IndicatorTitleSubtitleCellPreset.class, str);
        }

        public static IndicatorTitleSubtitleCellPreset[] values() {
            return (IndicatorTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final IndicatorTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorTitleSubtitleCellDTO(IndicatorTitleSubtitleCellPreset indicatorTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IndicatorDTO indicatorDTO) {
        super(DsAtomsType.INDICATOR_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = indicatorTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.indicator = indicatorDTO;
    }

    public static /* synthetic */ IndicatorTitleSubtitleCellDTO copy$default(IndicatorTitleSubtitleCellDTO indicatorTitleSubtitleCellDTO, IndicatorTitleSubtitleCellPreset indicatorTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IndicatorDTO indicatorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            indicatorTitleSubtitleCellPreset = indicatorTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = indicatorTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = indicatorTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = indicatorTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            indicatorDTO = indicatorTitleSubtitleCellDTO.indicator;
        }
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return indicatorTitleSubtitleCellDTO.copy(indicatorTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, indicatorDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final IndicatorTitleSubtitleCellPreset getPreset() {
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

    @NotNull
    public final IndicatorTitleSubtitleCellDTO copy(IndicatorTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IndicatorDTO indicator) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IndicatorTitleSubtitleCellDTO(preset, common, title, subtitle, indicator);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorTitleSubtitleCellDTO)) {
            return false;
        }
        IndicatorTitleSubtitleCellDTO indicatorTitleSubtitleCellDTO = (IndicatorTitleSubtitleCellDTO) other;
        return this.preset == indicatorTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, indicatorTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, indicatorTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, indicatorTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.indicator, indicatorTitleSubtitleCellDTO.indicator);
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.indicatorTitleSubtitleCV;
    }

    public final IndicatorTitleSubtitleCellPreset getPreset() {
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
        IndicatorTitleSubtitleCellPreset indicatorTitleSubtitleCellPreset = this.preset;
        int hashCode = (indicatorTitleSubtitleCellPreset == null ? 0 : indicatorTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        return hashCode2 + (indicatorDTO != null ? indicatorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IndicatorTitleSubtitleCellPreset indicatorTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IndicatorDTO indicatorDTO = this.indicator;
        StringBuilder sb2 = new StringBuilder("IndicatorTitleSubtitleCellDTO(preset=");
        sb2.append(indicatorTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        IndicatorTitleSubtitleCellPreset indicatorTitleSubtitleCellPreset = this.preset;
        if (indicatorTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(indicatorTitleSubtitleCellPreset.name());
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
    }
}
