package ru.ozon.uni.atoms.data.controls.chip;

import C.o0;
import D40.d;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperPreset;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00014BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020\u001fJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001fHÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "preset", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;", "style", "Lru/ozon/uni/atoms/data/controls/chip/Style;", "state", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "context", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;Lru/ozon/uni/atoms/data/controls/chip/Style;Lru/ozon/uni/android/wrappers/main/chip/ChipState;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getPreset", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/chip/Style;", "getState", "()Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getContext", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Preset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChipDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ChipDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;

    @EnumNullFallback
    private final Preset preset;

    @EnumNullFallback
    private final ChipState state;

    @EnumNullFallback
    private final Style style;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChipDTO> {
        @Override // android.os.Parcelable.Creator
        public final ChipDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Preset valueOf = parcel.readInt() == 0 ? null : Preset.valueOf(parcel.readString());
            Style valueOf2 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            ChipState valueOf3 = parcel.readInt() == 0 ? null : ChipState.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new ChipDTO(valueOf, valueOf2, valueOf3, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChipDTO[] newArray(int i11) {
            return new ChipDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/ChipDTO$Preset;", "", "settings", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "mainPreset", "Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;)V", "getSettings", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getMainPreset", "()Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400;
        public static final Preset SIZE_500;
        public static final Preset SIZE_600;
        public static final Preset SIZE_700;

        @NotNull
        private final TitleSubtitleWrapperPreset mainPreset;

        @NotNull
        private final BackgroundWrapperSettings settings;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            BackgroundWrapperPreset backgroundWrapperPreset = BackgroundWrapperPreset.INSTANCE;
            BackgroundWrapperSettings button400$uni_release = backgroundWrapperPreset.getButton400$uni_release();
            TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
            SIZE_400 = new Preset("SIZE_400", 0, button400$uni_release, titleSubtitleWrapperPresets.getControl400Default400$uni_release());
            SIZE_500 = new Preset("SIZE_500", 1, backgroundWrapperPreset.getButton500$uni_release(), titleSubtitleWrapperPresets.getControl500Default500$uni_release());
            SIZE_600 = new Preset("SIZE_600", 2, backgroundWrapperPreset.getButton600$uni_release(), titleSubtitleWrapperPresets.getControl600Default500$uni_release());
            SIZE_700 = new Preset("SIZE_700", 3, backgroundWrapperPreset.getButton700$uni_release(), titleSubtitleWrapperPresets.getControl800Default500$uni_release());
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, BackgroundWrapperSettings backgroundWrapperSettings, TitleSubtitleWrapperPreset titleSubtitleWrapperPreset) {
            this.settings = backgroundWrapperSettings;
            this.mainPreset = titleSubtitleWrapperPreset;
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
        public final TitleSubtitleWrapperPreset getMainPreset() {
            return this.mainPreset;
        }

        @NotNull
        public final BackgroundWrapperSettings getSettings() {
            return this.settings;
        }
    }

    public /* synthetic */ ChipDTO(Preset preset, Style style, ChipState chipState, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonControlSettings commonControlSettings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(preset, (i11 & 2) != 0 ? Style.ASPECT_PRIMARY : style, (i11 & 4) != 0 ? ChipState.ENABLED : chipState, commonAtomLabelDTO, (i11 & 16) != 0 ? null : commonAtomLabelDTO2, commonControlSettings, (i11 & 64) != 0 ? null : str);
    }

    public static /* synthetic */ ChipDTO copy$default(ChipDTO chipDTO, Preset preset, Style style, ChipState chipState, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = chipDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = chipDTO.style;
        }
        if ((i11 & 4) != 0) {
            chipState = chipDTO.state;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO = chipDTO.title;
        }
        if ((i11 & 16) != 0) {
            commonAtomLabelDTO2 = chipDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = chipDTO.common;
        }
        if ((i11 & 64) != 0) {
            str = chipDTO.context;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str2 = str;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
        ChipState chipState2 = chipState;
        return chipDTO.copy(preset, style, chipState2, commonAtomLabelDTO, commonAtomLabelDTO3, commonControlSettings2, str2);
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
    public final ChipState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final ChipDTO copy(Preset preset, Style style, ChipState state, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonControlSettings common, String context) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChipDTO(preset, style, state, title, subtitle, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipDTO)) {
            return false;
        }
        ChipDTO chipDTO = (ChipDTO) other;
        return this.preset == chipDTO.preset && this.style == chipDTO.style && this.state == chipDTO.state && Intrinsics.d(this.title, chipDTO.title) && Intrinsics.d(this.subtitle, chipDTO.subtitle) && Intrinsics.d(this.common, chipDTO.common) && Intrinsics.d(this.context, chipDTO.context);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.chip;
    }

    public final Preset getPreset() {
        return this.preset;
    }

    public final ChipState getState() {
        return this.state;
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
        ChipState chipState = this.state;
        int b11 = d.b(this.title, (hashCode2 + (chipState == null ? 0 : chipState.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode3 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.context;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Preset preset = this.preset;
        Style style = this.style;
        ChipState chipState = this.state;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.context;
        StringBuilder sb2 = new StringBuilder("ChipDTO(preset=");
        sb2.append(preset);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", state=");
        sb2.append(chipState);
        sb2.append(", title=");
        sb2.append(commonAtomLabelDTO);
        sb2.append(", subtitle=");
        sb2.append(commonAtomLabelDTO2);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", context=");
        return o0.c(sb2, str, ")");
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
        ChipState chipState = this.state;
        if (chipState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(chipState.name());
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipDTO(Preset preset, Style style, ChipState chipState, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.CHIP, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.state = chipState;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.common = commonControlSettings;
        this.context = str;
    }
}
