package ru.ozon.app.android.atoms.data.cell;

import Eh.c;
import Eh.d;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/RadioTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/RadioTitleSubtitleCellDTO$RadioTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", FormPageDTO.Field.FIELD_TYPE_RADIO, "Lru/ozon/app/android/atoms/data/selectionControls/radiobutton/RadioDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/RadioTitleSubtitleCellDTO$RadioTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/selectionControls/radiobutton/RadioDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/RadioTitleSubtitleCellDTO$RadioTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getRadio", "()Lru/ozon/app/android/atoms/data/selectionControls/radiobutton/RadioDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RadioTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RadioTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RadioTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;

    @EnumNullFallback
    private final RadioTitleSubtitleCellPreset preset;
    private final RadioDTO radio;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RadioTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final RadioTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RadioTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : RadioTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new RadioTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? RadioDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RadioTitleSubtitleCellDTO[] newArray(int i11) {
            return new RadioTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/RadioTitleSubtitleCellDTO$RadioTitleSubtitleCellPreset;", "", "LEh/c;", "preset", "<init>", "(Ljava/lang/String;ILEh/c;)V", "LEh/c;", "getPreset", "()LEh/c;", "NO_SHAPE_500_TOP_START_500_DEFAULT_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RadioTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RadioTitleSubtitleCellPreset[] $VALUES;
        public static final RadioTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new RadioTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, d.a());

        @NotNull
        private final c preset;

        private static final /* synthetic */ RadioTitleSubtitleCellPreset[] $values() {
            return new RadioTitleSubtitleCellPreset[]{NO_SHAPE_500_TOP_START_500_DEFAULT_500};
        }

        static {
            RadioTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RadioTitleSubtitleCellPreset(String str, int i11, c cVar) {
            this.preset = cVar;
        }

        @NotNull
        public static a<RadioTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static RadioTitleSubtitleCellPreset valueOf(String str) {
            return (RadioTitleSubtitleCellPreset) Enum.valueOf(RadioTitleSubtitleCellPreset.class, str);
        }

        public static RadioTitleSubtitleCellPreset[] values() {
            return (RadioTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final c getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioTitleSubtitleCellDTO(RadioTitleSubtitleCellPreset radioTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, RadioDTO radioDTO) {
        super(DsAtomsType.RADIO_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = radioTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.radio = radioDTO;
    }

    public static /* synthetic */ RadioTitleSubtitleCellDTO copy$default(RadioTitleSubtitleCellDTO radioTitleSubtitleCellDTO, RadioTitleSubtitleCellPreset radioTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, RadioDTO radioDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            radioTitleSubtitleCellPreset = radioTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = radioTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = radioTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = radioTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            radioDTO = radioTitleSubtitleCellDTO.radio;
        }
        RadioDTO radioDTO2 = radioDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return radioTitleSubtitleCellDTO.copy(radioTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, radioDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final RadioTitleSubtitleCellPreset getPreset() {
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
    public final RadioDTO getRadio() {
        return this.radio;
    }

    @NotNull
    public final RadioTitleSubtitleCellDTO copy(RadioTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, RadioDTO radio) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new RadioTitleSubtitleCellDTO(preset, common, title, subtitle, radio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioTitleSubtitleCellDTO)) {
            return false;
        }
        RadioTitleSubtitleCellDTO radioTitleSubtitleCellDTO = (RadioTitleSubtitleCellDTO) other;
        return this.preset == radioTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, radioTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, radioTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, radioTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.radio, radioTitleSubtitleCellDTO.radio);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.radioTitleSubtitleCV;
    }

    public final RadioTitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    public final RadioDTO getRadio() {
        return this.radio;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        RadioTitleSubtitleCellPreset radioTitleSubtitleCellPreset = this.preset;
        int hashCode = (radioTitleSubtitleCellPreset == null ? 0 : radioTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        RadioDTO radioDTO = this.radio;
        return hashCode2 + (radioDTO != null ? radioDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RadioTitleSubtitleCellPreset radioTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        RadioDTO radioDTO = this.radio;
        StringBuilder sb2 = new StringBuilder("RadioTitleSubtitleCellDTO(preset=");
        sb2.append(radioTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", radio=");
        sb2.append(radioDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RadioTitleSubtitleCellPreset radioTitleSubtitleCellPreset = this.preset;
        if (radioTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(radioTitleSubtitleCellPreset.name());
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
        RadioDTO radioDTO = this.radio;
        if (radioDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            radioDTO.writeToParcel(dest, flags);
        }
    }
}
