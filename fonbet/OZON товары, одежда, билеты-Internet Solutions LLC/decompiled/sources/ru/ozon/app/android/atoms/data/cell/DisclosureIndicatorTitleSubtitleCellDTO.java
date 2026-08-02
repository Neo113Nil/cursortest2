package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.indicator.IndicatorDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import th.C9874a;
import th.b;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorTitleSubtitleCellDTO$DisclosureIndicatorTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "disclosureIcon", "Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "indicator", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorTitleSubtitleCellDTO$DisclosureIndicatorTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorTitleSubtitleCellDTO$DisclosureIndicatorTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getDisclosureIcon", "()Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "getIndicator", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclosureIndicatorTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclosureIndicatorTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DisclosureIndicatorTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final CommonAtomIconDTO disclosureIcon;
    private final IndicatorDTO indicator;

    @EnumNullFallback
    private final DisclosureIndicatorTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisclosureIndicatorTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureIndicatorTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclosureIndicatorTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DisclosureIndicatorTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DisclosureIndicatorTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IndicatorDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureIndicatorTitleSubtitleCellDTO[] newArray(int i11) {
            return new DisclosureIndicatorTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorTitleSubtitleCellDTO$DisclosureIndicatorTitleSubtitleCellPreset;", "", "Lth/a;", "preset", "<init>", "(Ljava/lang/String;ILth/a;)V", "Lth/a;", "getPreset", "()Lth/a;", "CENTER_END_500_DEFAULT_500", "CENTER_END_500_CONTROL_500", "CENTER_END_400_DEFAULT_400", "CENTER_END_400_CONTROL_400", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisclosureIndicatorTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisclosureIndicatorTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final C9874a preset;
        public static final DisclosureIndicatorTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500 = new DisclosureIndicatorTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, b.d());
        public static final DisclosureIndicatorTitleSubtitleCellPreset CENTER_END_500_CONTROL_500 = new DisclosureIndicatorTitleSubtitleCellPreset("CENTER_END_500_CONTROL_500", 1, b.c());
        public static final DisclosureIndicatorTitleSubtitleCellPreset CENTER_END_400_DEFAULT_400 = new DisclosureIndicatorTitleSubtitleCellPreset("CENTER_END_400_DEFAULT_400", 2, b.b());
        public static final DisclosureIndicatorTitleSubtitleCellPreset CENTER_END_400_CONTROL_400 = new DisclosureIndicatorTitleSubtitleCellPreset("CENTER_END_400_CONTROL_400", 3, b.a());

        private static final /* synthetic */ DisclosureIndicatorTitleSubtitleCellPreset[] $values() {
            return new DisclosureIndicatorTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500, CENTER_END_500_CONTROL_500, CENTER_END_400_DEFAULT_400, CENTER_END_400_CONTROL_400};
        }

        static {
            DisclosureIndicatorTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private DisclosureIndicatorTitleSubtitleCellPreset(String str, int i11, C9874a c9874a) {
            this.preset = c9874a;
        }

        @NotNull
        public static a<DisclosureIndicatorTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DisclosureIndicatorTitleSubtitleCellPreset valueOf(String str) {
            return (DisclosureIndicatorTitleSubtitleCellPreset) Enum.valueOf(DisclosureIndicatorTitleSubtitleCellPreset.class, str);
        }

        public static DisclosureIndicatorTitleSubtitleCellPreset[] values() {
            return (DisclosureIndicatorTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C9874a getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureIndicatorTitleSubtitleCellDTO(DisclosureIndicatorTitleSubtitleCellPreset disclosureIndicatorTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, IndicatorDTO indicatorDTO) {
        super(DsAtomsType.DISCLOSURE_INDICATOR_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = disclosureIndicatorTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.disclosureIcon = commonAtomIconDTO;
        this.indicator = indicatorDTO;
    }

    public static /* synthetic */ DisclosureIndicatorTitleSubtitleCellDTO copy$default(DisclosureIndicatorTitleSubtitleCellDTO disclosureIndicatorTitleSubtitleCellDTO, DisclosureIndicatorTitleSubtitleCellPreset disclosureIndicatorTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, IndicatorDTO indicatorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureIndicatorTitleSubtitleCellPreset = disclosureIndicatorTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = disclosureIndicatorTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = disclosureIndicatorTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = disclosureIndicatorTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = disclosureIndicatorTitleSubtitleCellDTO.disclosureIcon;
        }
        if ((i11 & 32) != 0) {
            indicatorDTO = disclosureIndicatorTitleSubtitleCellDTO.indicator;
        }
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        return disclosureIndicatorTitleSubtitleCellDTO.copy(disclosureIndicatorTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2, commonAtomIconDTO2, indicatorDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclosureIndicatorTitleSubtitleCellPreset getPreset() {
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

    @NotNull
    public final DisclosureIndicatorTitleSubtitleCellDTO copy(DisclosureIndicatorTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO disclosureIcon, IndicatorDTO indicator) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureIndicatorTitleSubtitleCellDTO(preset, common, title, subtitle, disclosureIcon, indicator);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureIndicatorTitleSubtitleCellDTO)) {
            return false;
        }
        DisclosureIndicatorTitleSubtitleCellDTO disclosureIndicatorTitleSubtitleCellDTO = (DisclosureIndicatorTitleSubtitleCellDTO) other;
        return this.preset == disclosureIndicatorTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, disclosureIndicatorTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, disclosureIndicatorTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, disclosureIndicatorTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.disclosureIcon, disclosureIndicatorTitleSubtitleCellDTO.disclosureIcon) && Intrinsics.d(this.indicator, disclosureIndicatorTitleSubtitleCellDTO.indicator);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
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
        return R.id.disclosureIndicatorTitleSubtitleCV;
    }

    public final DisclosureIndicatorTitleSubtitleCellPreset getPreset() {
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
        DisclosureIndicatorTitleSubtitleCellPreset disclosureIndicatorTitleSubtitleCellPreset = this.preset;
        int hashCode = (disclosureIndicatorTitleSubtitleCellPreset == null ? 0 : disclosureIndicatorTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        int hashCode3 = (hashCode2 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        return hashCode3 + (indicatorDTO != null ? indicatorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureIndicatorTitleSubtitleCellPreset disclosureIndicatorTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        IndicatorDTO indicatorDTO = this.indicator;
        StringBuilder sb2 = new StringBuilder("DisclosureIndicatorTitleSubtitleCellDTO(preset=");
        sb2.append(disclosureIndicatorTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", disclosureIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DisclosureIndicatorTitleSubtitleCellPreset disclosureIndicatorTitleSubtitleCellPreset = this.preset;
        if (disclosureIndicatorTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(disclosureIndicatorTitleSubtitleCellPreset.name());
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
    }
}
