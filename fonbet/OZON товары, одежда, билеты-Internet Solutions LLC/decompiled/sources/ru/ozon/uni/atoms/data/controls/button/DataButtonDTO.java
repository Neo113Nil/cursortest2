package ru.ozon.uni.atoms.data.controls.button;

import D3.h;
import D40.c;
import D40.d;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.dataAddon.data.DataTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.dataAddon.data.DataTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperPreset;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001f\u001a\u00020 H\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jl\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020 J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020 HÖ\u0001J\t\u00100\u001a\u00020\rHÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0006\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00067"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "preset", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;", "style", "Lru/ozon/uni/atoms/data/controls/button/Style;", "isEnabled", "", "isContentCentered", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "data", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/button/Style;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getData", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Preset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DataButtonDTO extends ButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DataButtonDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String data;
    private final Boolean isContentCentered;
    private final Boolean isEnabled;

    @EnumNullFallback
    private final Preset preset;

    @EnumNullFallback
    private final Style style;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final DataButtonDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Preset valueOf3 = parcel.readInt() == 0 ? null : Preset.valueOf(parcel.readString());
            Style valueOf4 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DataButtonDTO(valueOf3, valueOf4, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DataButtonDTO[] newArray(int i11) {
            return new DataButtonDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO$Preset;", "", "backgroundWrapperCentered", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "mainPresetCentered", "Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "backgroundWrapperFilled", "mainPresetFilled", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;)V", "getBackgroundWrapperCentered", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getMainPresetCentered", "()Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "getBackgroundWrapperFilled", "getMainPresetFilled", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_500;
        public static final Preset SIZE_600;
        public static final Preset SIZE_700;

        @NotNull
        private final BackgroundWrapperSettings backgroundWrapperCentered;

        @NotNull
        private final BackgroundWrapperSettings backgroundWrapperFilled;

        @NotNull
        private final DataTitleSubtitleWrapperPreset mainPresetCentered;

        @NotNull
        private final DataTitleSubtitleWrapperPreset mainPresetFilled;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            BackgroundWrapperPreset backgroundWrapperPreset = BackgroundWrapperPreset.INSTANCE;
            BackgroundWrapperSettings button500$uni_release = backgroundWrapperPreset.getButton500$uni_release();
            DataTitleSubtitleWrapperPresets dataTitleSubtitleWrapperPresets = DataTitleSubtitleWrapperPresets.INSTANCE;
            SIZE_500 = new Preset("SIZE_500", 0, button500$uni_release, dataTitleSubtitleWrapperPresets.getData500CenterEnd500Control500Control500(), backgroundWrapperPreset.getFillData500$uni_release(), dataTitleSubtitleWrapperPresets.getData500CenterEnd500LeadingControl500Control500());
            SIZE_600 = new Preset("SIZE_600", 1, backgroundWrapperPreset.getButton600$uni_release(), dataTitleSubtitleWrapperPresets.getData500CenterEnd500Control600Control500(), backgroundWrapperPreset.getFillData600$uni_release(), dataTitleSubtitleWrapperPresets.getData500CenterEnd500LeadingControl600Control500());
            SIZE_700 = new Preset("SIZE_700", 2, backgroundWrapperPreset.getButton700$uni_release(), dataTitleSubtitleWrapperPresets.getData600centerEnd500Control800Control500(), backgroundWrapperPreset.getFillData700$uni_release(), dataTitleSubtitleWrapperPresets.getData600CenterEnd500LeadingControl800Control500());
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, BackgroundWrapperSettings backgroundWrapperSettings, DataTitleSubtitleWrapperPreset dataTitleSubtitleWrapperPreset, BackgroundWrapperSettings backgroundWrapperSettings2, DataTitleSubtitleWrapperPreset dataTitleSubtitleWrapperPreset2) {
            this.backgroundWrapperCentered = backgroundWrapperSettings;
            this.mainPresetCentered = dataTitleSubtitleWrapperPreset;
            this.backgroundWrapperFilled = backgroundWrapperSettings2;
            this.mainPresetFilled = dataTitleSubtitleWrapperPreset2;
        }

        @NotNull
        public static a<Preset> getEntries() {
            return $ENTRIES;
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) $VALUES.clone();
        }

        @NotNull
        public final BackgroundWrapperSettings getBackgroundWrapperCentered() {
            return this.backgroundWrapperCentered;
        }

        @NotNull
        public final BackgroundWrapperSettings getBackgroundWrapperFilled() {
            return this.backgroundWrapperFilled;
        }

        @NotNull
        public final DataTitleSubtitleWrapperPreset getMainPresetCentered() {
            return this.mainPresetCentered;
        }

        @NotNull
        public final DataTitleSubtitleWrapperPreset getMainPresetFilled() {
            return this.mainPresetFilled;
        }
    }

    public /* synthetic */ DataButtonDTO(Preset preset, Style style, Boolean bool, Boolean bool2, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, String str, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Preset.SIZE_500 : preset, (i11 & 2) != 0 ? Style.ACTION_PRIMARY : style, (i11 & 4) != 0 ? Boolean.TRUE : bool, (i11 & 8) != 0 ? Boolean.TRUE : bool2, commonAtomLabelDTO, commonAtomLabelDTO2, str, commonControlSettings);
    }

    public static /* synthetic */ DataButtonDTO copy$default(DataButtonDTO dataButtonDTO, Preset preset, Style style, Boolean bool, Boolean bool2, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = dataButtonDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = dataButtonDTO.style;
        }
        if ((i11 & 4) != 0) {
            bool = dataButtonDTO.isEnabled;
        }
        if ((i11 & 8) != 0) {
            bool2 = dataButtonDTO.isContentCentered;
        }
        if ((i11 & 16) != 0) {
            commonAtomLabelDTO = dataButtonDTO.title;
        }
        if ((i11 & 32) != 0) {
            commonAtomLabelDTO2 = dataButtonDTO.subtitle;
        }
        if ((i11 & 64) != 0) {
            str = dataButtonDTO.data;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = dataButtonDTO.common;
        }
        String str2 = str;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        CommonAtomLabelDTO commonAtomLabelDTO4 = commonAtomLabelDTO2;
        return dataButtonDTO.copy(preset, style, bool, bool2, commonAtomLabelDTO3, commonAtomLabelDTO4, str2, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final Preset getPreset() {
        return this.preset;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsContentCentered() {
        return this.isContentCentered;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final DataButtonDTO copy(Preset preset, Style style, Boolean isEnabled, Boolean isContentCentered, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, String data, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DataButtonDTO(preset, style, isEnabled, isContentCentered, title, subtitle, data, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataButtonDTO)) {
            return false;
        }
        DataButtonDTO dataButtonDTO = (DataButtonDTO) other;
        return this.preset == dataButtonDTO.preset && this.style == dataButtonDTO.style && Intrinsics.d(this.isEnabled, dataButtonDTO.isEnabled) && Intrinsics.d(this.isContentCentered, dataButtonDTO.isContentCentered) && Intrinsics.d(this.title, dataButtonDTO.title) && Intrinsics.d(this.subtitle, dataButtonDTO.subtitle) && Intrinsics.d(this.data, dataButtonDTO.data) && Intrinsics.d(this.common, dataButtonDTO.common);
    }

    @Override // ru.ozon.uni.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    public final String getData() {
        return this.data;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.dataButton;
    }

    public final Preset getPreset() {
        return this.preset;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        Preset preset = this.preset;
        int hashCode = (preset == null ? 0 : preset.hashCode()) * 31;
        Style style = this.style;
        int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isContentCentered;
        int b11 = d.b(this.title, (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode4 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        String str = this.data;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    public final Boolean isContentCentered() {
        return this.isContentCentered;
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        Preset preset = this.preset;
        Style style = this.style;
        Boolean bool = this.isEnabled;
        Boolean bool2 = this.isContentCentered;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        String str = this.data;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("DataButtonDTO(preset=");
        sb2.append(preset);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", isEnabled=");
        h.h(sb2, bool, ", isContentCentered=", bool2, ", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", data=");
        sb2.append(str);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Preset preset = this.preset;
        if (preset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(preset.name());
        }
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.isContentCentered;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        dest.writeString(this.data);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataButtonDTO(Preset preset, Style style, Boolean bool, Boolean bool2, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, String str, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.DATA_BUTTON, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.isEnabled = bool;
        this.isContentCentered = bool2;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.data = str;
        this.common = commonControlSettings;
    }
}
