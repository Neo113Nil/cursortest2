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
import ru.ozon.uni.android.cell.selection.checkbox.data.CheckboxTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.selection.checkbox.data.CheckboxTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO$CheckboxTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO$CheckboxTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO$CheckboxTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CheckboxTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CheckboxTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CheckboxTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CheckBoxDTO checkbox;
    private final CommonCellSettings common;

    @EnumNullFallback
    private final CheckboxTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO$CheckboxTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/selection/checkbox/data/CheckboxTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxTitleSubtitleWrapperPreset;", "NO_SHAPE_500_TOP_START_500_DEFAULT_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CheckboxTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CheckboxTitleSubtitleCellPreset[] $VALUES;
        public static final CheckboxTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new CheckboxTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, CheckboxTitleSubtitleWrapperPresets.INSTANCE.getNoShape500TopStart500Default500());

        @NotNull
        private final CheckboxTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ CheckboxTitleSubtitleCellPreset[] $values() {
            return new CheckboxTitleSubtitleCellPreset[]{NO_SHAPE_500_TOP_START_500_DEFAULT_500};
        }

        static {
            CheckboxTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CheckboxTitleSubtitleCellPreset(String str, int i11, CheckboxTitleSubtitleWrapperPreset checkboxTitleSubtitleWrapperPreset) {
            this.preset = checkboxTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<CheckboxTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static CheckboxTitleSubtitleCellPreset valueOf(String str) {
            return (CheckboxTitleSubtitleCellPreset) Enum.valueOf(CheckboxTitleSubtitleCellPreset.class, str);
        }

        public static CheckboxTitleSubtitleCellPreset[] values() {
            return (CheckboxTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final CheckboxTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<CheckboxTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final CheckboxTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CheckboxTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : CheckboxTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new CheckboxTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? CheckBoxDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckboxTitleSubtitleCellDTO[] newArray(int i11) {
            return new CheckboxTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxTitleSubtitleCellDTO(CheckboxTitleSubtitleCellPreset checkboxTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CheckBoxDTO checkBoxDTO) {
        super(DsAtomsType.CHECKBOX_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = checkboxTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.checkbox = checkBoxDTO;
    }

    public static /* synthetic */ CheckboxTitleSubtitleCellDTO copy$default(CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO, CheckboxTitleSubtitleCellPreset checkboxTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CheckBoxDTO checkBoxDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkboxTitleSubtitleCellPreset = checkboxTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = checkboxTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = checkboxTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = checkboxTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            checkBoxDTO = checkboxTitleSubtitleCellDTO.checkbox;
        }
        CheckBoxDTO checkBoxDTO2 = checkBoxDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return checkboxTitleSubtitleCellDTO.copy(checkboxTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, checkBoxDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final CheckboxTitleSubtitleCellPreset getPreset() {
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
    public final CheckBoxDTO getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    public final CheckboxTitleSubtitleCellDTO copy(CheckboxTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CheckBoxDTO checkbox) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CheckboxTitleSubtitleCellDTO(preset, common, title, subtitle, checkbox);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxTitleSubtitleCellDTO)) {
            return false;
        }
        CheckboxTitleSubtitleCellDTO checkboxTitleSubtitleCellDTO = (CheckboxTitleSubtitleCellDTO) other;
        return this.preset == checkboxTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, checkboxTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, checkboxTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, checkboxTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.checkbox, checkboxTitleSubtitleCellDTO.checkbox);
    }

    public final CheckBoxDTO getCheckbox() {
        return this.checkbox;
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.checkboxTitleSubtitleCV;
    }

    public final CheckboxTitleSubtitleCellPreset getPreset() {
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
        CheckboxTitleSubtitleCellPreset checkboxTitleSubtitleCellPreset = this.preset;
        int hashCode = (checkboxTitleSubtitleCellPreset == null ? 0 : checkboxTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CheckBoxDTO checkBoxDTO = this.checkbox;
        return hashCode2 + (checkBoxDTO != null ? checkBoxDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CheckboxTitleSubtitleCellPreset checkboxTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CheckBoxDTO checkBoxDTO = this.checkbox;
        StringBuilder sb2 = new StringBuilder("CheckboxTitleSubtitleCellDTO(preset=");
        sb2.append(checkboxTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", checkbox=");
        sb2.append(checkBoxDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CheckboxTitleSubtitleCellPreset checkboxTitleSubtitleCellPreset = this.preset;
        if (checkboxTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(checkboxTitleSubtitleCellPreset.name());
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
        CheckBoxDTO checkBoxDTO = this.checkbox;
        if (checkBoxDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            checkBoxDTO.writeToParcel(dest, flags);
        }
    }
}
