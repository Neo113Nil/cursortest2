package ru.ozon.uni.atoms.data.controls.button;

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
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.data.DisclosureTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.data.DisclosureTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\"\u001a\u00020#H\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jl\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020#J\u0013\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020#HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020#R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006;"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "preset", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;", "style", "Lru/ozon/uni/atoms/data/controls/button/Style;", "isEnabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "iconSide", "Lru/ozon/uni/atoms/data/controls/button/IconSide;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/controls/button/IconSide;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPreset", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/button/Style;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIconSide", "()Lru/ozon/uni/atoms/data/controls/button/IconSide;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;Lru/ozon/uni/atoms/data/controls/button/Style;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/controls/button/IconSide;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Preset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UncontainedIconLabelButtonDTO extends ButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UncontainedIconLabelButtonDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final CommonAtomIconDTO icon;

    @EnumNullFallback
    private final IconSide iconSide;
    private final Boolean isEnabled;

    @EnumNullFallback
    private final Preset preset;

    @EnumNullFallback
    private final Style style;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UncontainedIconLabelButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final UncontainedIconLabelButtonDTO createFromParcel(Parcel parcel) {
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
            return new UncontainedIconLabelButtonDTO(valueOf2, valueOf3, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconSide.valueOf(parcel.readString()), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UncontainedIconLabelButtonDTO[] newArray(int i11) {
            return new UncontainedIconLabelButtonDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO$Preset;", "", "mainViewPresetStart", "Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/data/DisclosureTitleSubtitleWrapperPreset;", "mainViewPresetEnd", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/data/DisclosureTitleSubtitleWrapperPreset;Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/data/DisclosureTitleSubtitleWrapperPreset;)V", "getMainViewPresetStart", "()Lru/ozon/uni/android/cell/disclosure/disclosureTitleSubtitleCell/data/DisclosureTitleSubtitleWrapperPreset;", "getMainViewPresetEnd", "SIZE_400", "SIZE_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400;
        public static final Preset SIZE_500;

        @NotNull
        private final DisclosureTitleSubtitleWrapperPreset mainViewPresetEnd;

        @NotNull
        private final DisclosureTitleSubtitleWrapperPreset mainViewPresetStart;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500};
        }

        static {
            DisclosureTitleSubtitleWrapperPresets disclosureTitleSubtitleWrapperPresets = DisclosureTitleSubtitleWrapperPresets.INSTANCE;
            SIZE_400 = new Preset("SIZE_400", 0, disclosureTitleSubtitleWrapperPresets.getCenterStart400Control400Control400$uni_release(), disclosureTitleSubtitleWrapperPresets.getCenterEndControl400Control400$uni_release());
            SIZE_500 = new Preset("SIZE_500", 1, disclosureTitleSubtitleWrapperPresets.getCenterStart400Control500Control500$uni_release(), disclosureTitleSubtitleWrapperPresets.getCenterEndControl500Control500$uni_release());
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, DisclosureTitleSubtitleWrapperPreset disclosureTitleSubtitleWrapperPreset, DisclosureTitleSubtitleWrapperPreset disclosureTitleSubtitleWrapperPreset2) {
            this.mainViewPresetStart = disclosureTitleSubtitleWrapperPreset;
            this.mainViewPresetEnd = disclosureTitleSubtitleWrapperPreset2;
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
        public final DisclosureTitleSubtitleWrapperPreset getMainViewPresetEnd() {
            return this.mainViewPresetEnd;
        }

        @NotNull
        public final DisclosureTitleSubtitleWrapperPreset getMainViewPresetStart() {
            return this.mainViewPresetStart;
        }
    }

    public /* synthetic */ UncontainedIconLabelButtonDTO(Preset preset, Style style, Boolean bool, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, IconSide iconSide, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Preset.SIZE_400 : preset, (i11 & 2) != 0 ? Style.ACTION_SECONDARY : style, (i11 & 4) != 0 ? Boolean.TRUE : bool, commonAtomLabelDTO, commonAtomLabelDTO2, commonAtomIconDTO, (i11 & 64) != 0 ? IconSide.END : iconSide, commonControlSettings);
    }

    public static /* synthetic */ UncontainedIconLabelButtonDTO copy$default(UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO, Preset preset, Style style, Boolean bool, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, IconSide iconSide, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = uncontainedIconLabelButtonDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = uncontainedIconLabelButtonDTO.style;
        }
        if ((i11 & 4) != 0) {
            bool = uncontainedIconLabelButtonDTO.isEnabled;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO = uncontainedIconLabelButtonDTO.title;
        }
        if ((i11 & 16) != 0) {
            commonAtomLabelDTO2 = uncontainedIconLabelButtonDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            commonAtomIconDTO = uncontainedIconLabelButtonDTO.icon;
        }
        if ((i11 & 64) != 0) {
            iconSide = uncontainedIconLabelButtonDTO.iconSide;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = uncontainedIconLabelButtonDTO.common;
        }
        IconSide iconSide2 = iconSide;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        return uncontainedIconLabelButtonDTO.copy(preset, style, bool, commonAtomLabelDTO, commonAtomLabelDTO3, commonAtomIconDTO2, iconSide2, commonControlSettings2);
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
    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final IconSide getIconSide() {
        return this.iconSide;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final UncontainedIconLabelButtonDTO copy(Preset preset, Style style, Boolean isEnabled, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO icon, IconSide iconSide, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new UncontainedIconLabelButtonDTO(preset, style, isEnabled, title, subtitle, icon, iconSide, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UncontainedIconLabelButtonDTO)) {
            return false;
        }
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = (UncontainedIconLabelButtonDTO) other;
        return this.preset == uncontainedIconLabelButtonDTO.preset && this.style == uncontainedIconLabelButtonDTO.style && Intrinsics.d(this.isEnabled, uncontainedIconLabelButtonDTO.isEnabled) && Intrinsics.d(this.title, uncontainedIconLabelButtonDTO.title) && Intrinsics.d(this.subtitle, uncontainedIconLabelButtonDTO.subtitle) && Intrinsics.d(this.icon, uncontainedIconLabelButtonDTO.icon) && this.iconSide == uncontainedIconLabelButtonDTO.iconSide && Intrinsics.d(this.common, uncontainedIconLabelButtonDTO.common);
    }

    @Override // ru.ozon.uni.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    public final IconSide getIconSide() {
        return this.iconSide;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.uncontainediconLabelButton;
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
        int b11 = d.b(this.title, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode3 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        int hashCode4 = (hashCode3 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        IconSide iconSide = this.iconSide;
        int hashCode5 = (hashCode4 + (iconSide == null ? 0 : iconSide.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "UncontainedIconLabelButtonDTO(preset=" + this.preset + ", style=" + this.style + ", isEnabled=" + this.isEnabled + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", iconSide=" + this.iconSide + ", common=" + this.common + ")";
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
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        if (commonAtomIconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomIconDTO.writeToParcel(dest, flags);
        }
        IconSide iconSide = this.iconSide;
        if (iconSide == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconSide.name());
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
    public UncontainedIconLabelButtonDTO(Preset preset, Style style, Boolean bool, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, IconSide iconSide, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.UNCONTAINED_ICON_LABEL_BUTTON, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.isEnabled = bool;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.icon = commonAtomIconDTO;
        this.iconSide = iconSide;
        this.common = commonControlSettings;
    }
}
