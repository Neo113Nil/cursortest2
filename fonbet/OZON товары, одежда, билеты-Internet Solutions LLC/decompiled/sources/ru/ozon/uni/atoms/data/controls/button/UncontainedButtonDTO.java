package ru.ozon.uni.atoms.data.controls.button;

import D40.c;
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
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JT\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u001bJ\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "size", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;", "style", "Lru/ozon/uni/atoms/data/controls/button/Style;", "isEnabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getSize", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/button/Style;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Preset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UncontainedButtonDTO extends ButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UncontainedButtonDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final Boolean isEnabled;

    @EnumNullFallback
    private final Preset size;

    @EnumNullFallback
    private final Style style;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UncontainedButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final UncontainedButtonDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Preset valueOf2 = parcel.readInt() == 0 ? null : Preset.valueOf(parcel.readString());
            Style valueOf3 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new UncontainedButtonDTO(valueOf2, valueOf3, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UncontainedButtonDTO[] newArray(int i11) {
            return new UncontainedButtonDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO$Preset;", "", "mainPreset", "Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;)V", "getMainPreset", "()Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "SIZE_400", "SIZE_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400;
        public static final Preset SIZE_500;

        @NotNull
        private final TitleSubtitleWrapperPreset mainPreset;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500};
        }

        static {
            TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
            SIZE_400 = new Preset("SIZE_400", 0, titleSubtitleWrapperPresets.getControl400Control400$uni_release());
            SIZE_500 = new Preset("SIZE_500", 1, titleSubtitleWrapperPresets.getControl500Control500$uni_release());
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, TitleSubtitleWrapperPreset titleSubtitleWrapperPreset) {
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
    }

    public /* synthetic */ UncontainedButtonDTO(Preset preset, Style style, Boolean bool, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Preset.SIZE_400 : preset, (i11 & 2) != 0 ? Style.ACTION_SECONDARY : style, (i11 & 4) != 0 ? Boolean.TRUE : bool, commonAtomLabelDTO, commonAtomLabelDTO2, commonControlSettings);
    }

    public static /* synthetic */ UncontainedButtonDTO copy$default(UncontainedButtonDTO uncontainedButtonDTO, Preset preset, Style style, Boolean bool, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = uncontainedButtonDTO.size;
        }
        if ((i11 & 2) != 0) {
            style = uncontainedButtonDTO.style;
        }
        if ((i11 & 4) != 0) {
            bool = uncontainedButtonDTO.isEnabled;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO = uncontainedButtonDTO.title;
        }
        if ((i11 & 16) != 0) {
            commonAtomLabelDTO2 = uncontainedButtonDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = uncontainedButtonDTO.common;
        }
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return uncontainedButtonDTO.copy(preset, style, bool, commonAtomLabelDTO, commonAtomLabelDTO3, commonControlSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final Preset getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
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

    @NotNull
    public final UncontainedButtonDTO copy(Preset size, Style style, Boolean isEnabled, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new UncontainedButtonDTO(size, style, isEnabled, title, subtitle, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UncontainedButtonDTO)) {
            return false;
        }
        UncontainedButtonDTO uncontainedButtonDTO = (UncontainedButtonDTO) other;
        return this.size == uncontainedButtonDTO.size && this.style == uncontainedButtonDTO.style && Intrinsics.d(this.isEnabled, uncontainedButtonDTO.isEnabled) && Intrinsics.d(this.title, uncontainedButtonDTO.title) && Intrinsics.d(this.subtitle, uncontainedButtonDTO.subtitle) && Intrinsics.d(this.common, uncontainedButtonDTO.common);
    }

    @Override // ru.ozon.uni.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.uncontainedButton;
    }

    public final Preset getSize() {
        return this.size;
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
        Preset preset = this.size;
        int hashCode = (preset == null ? 0 : preset.hashCode()) * 31;
        Style style = this.style;
        int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int b11 = d.b(this.title, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode3 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "UncontainedButtonDTO(size=" + this.size + ", style=" + this.style + ", isEnabled=" + this.isEnabled + ", title=" + this.title + ", subtitle=" + this.subtitle + ", common=" + this.common + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Preset preset = this.size;
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UncontainedButtonDTO(Preset preset, Style style, Boolean bool, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.UNCONTAINED_BUTTON, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.size = preset;
        this.style = style;
        this.isEnabled = bool;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.common = commonControlSettings;
    }
}
