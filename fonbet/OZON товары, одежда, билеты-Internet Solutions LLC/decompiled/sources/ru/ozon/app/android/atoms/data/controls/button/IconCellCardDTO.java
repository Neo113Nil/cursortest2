package ru.ozon.app.android.atoms.data.controls.button;

import Oj.d;
import Oj.e;
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
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import vh.c;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000256BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u001fJ\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00067"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO;", "Lru/ozon/app/android/atoms/data/controls/button/ButtonsDTO;", "preset", "Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Preset;", "style", "Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Style;", "isEnabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "icon", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Preset;Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Style;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Preset;", "getStyle", "()Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Style;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIcon", "()Lru/ozon/app/android/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Preset;Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Style;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Preset", "Style", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconCellCardDTO extends ButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconCellCardDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final IconDTO icon;
    private final Boolean isEnabled;

    @EnumNullFallback
    private final Preset preset;

    @EnumNullFallback
    private final Style style;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconCellCardDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconCellCardDTO createFromParcel(Parcel parcel) {
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
            return new IconCellCardDTO(valueOf2, valueOf3, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IconCellCardDTO[] newArray(int i11) {
            return new IconCellCardDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Preset;", "", "LOj/e;", "settings", "Lvh/c;", "mainPreset", "<init>", "(Ljava/lang/String;ILOj/e;Lvh/c;)V", "LOj/e;", "getSettings", "()LOj/e;", "Lvh/c;", "getMainPreset", "()Lvh/c;", "SIZE_400", "SIZE_500", "SIZE_600", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400 = new Preset("SIZE_400", 0, d.i(), vh.d.j());
        public static final Preset SIZE_500 = new Preset("SIZE_500", 1, d.j(), vh.d.p());
        public static final Preset SIZE_600 = new Preset("SIZE_600", 2, d.k(), vh.d.u());

        @NotNull
        private final c mainPreset;

        @NotNull
        private final e settings;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500, SIZE_600};
        }

        static {
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, e eVar, c cVar) {
            this.settings = eVar;
            this.mainPreset = cVar;
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
        public final c getMainPreset() {
            return this.mainPreset;
        }

        @NotNull
        public final e getSettings() {
            return this.settings;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/IconCellCardDTO$Style;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL_SECONDARY", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style NEUTRAL_SECONDARY = new Style("NEUTRAL_SECONDARY", 0);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{NEUTRAL_SECONDARY};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11) {
        }

        @NotNull
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public /* synthetic */ IconCellCardDTO(Preset preset, Style style, Boolean bool, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Preset.SIZE_400 : preset, (i11 & 2) != 0 ? Style.NEUTRAL_SECONDARY : style, (i11 & 4) != 0 ? Boolean.TRUE : bool, commonAtomLabelDTO, commonAtomLabelDTO2, iconDTO, commonControlSettings);
    }

    public static /* synthetic */ IconCellCardDTO copy$default(IconCellCardDTO iconCellCardDTO, Preset preset, Style style, Boolean bool, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = iconCellCardDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = iconCellCardDTO.style;
        }
        if ((i11 & 4) != 0) {
            bool = iconCellCardDTO.isEnabled;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO = iconCellCardDTO.title;
        }
        if ((i11 & 16) != 0) {
            commonAtomLabelDTO2 = iconCellCardDTO.subtitle;
        }
        if ((i11 & 32) != 0) {
            iconDTO = iconCellCardDTO.icon;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = iconCellCardDTO.common;
        }
        IconDTO iconDTO2 = iconDTO;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
        Boolean bool2 = bool;
        return iconCellCardDTO.copy(preset, style, bool2, commonAtomLabelDTO, commonAtomLabelDTO3, iconDTO2, commonControlSettings2);
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
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final IconCellCardDTO copy(Preset preset, Style style, Boolean isEnabled, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IconDTO icon, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IconCellCardDTO(preset, style, isEnabled, title, subtitle, icon, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconCellCardDTO)) {
            return false;
        }
        IconCellCardDTO iconCellCardDTO = (IconCellCardDTO) other;
        return this.preset == iconCellCardDTO.preset && this.style == iconCellCardDTO.style && Intrinsics.d(this.isEnabled, iconCellCardDTO.isEnabled) && Intrinsics.d(this.title, iconCellCardDTO.title) && Intrinsics.d(this.subtitle, iconCellCardDTO.subtitle) && Intrinsics.d(this.icon, iconCellCardDTO.icon) && Intrinsics.d(this.common, iconCellCardDTO.common);
    }

    @Override // ru.ozon.app.android.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.iconCellCard;
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
        int c11 = Tl.a.c(this.title, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode3 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode4 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "IconCellCardDTO(preset=" + this.preset + ", style=" + this.style + ", isEnabled=" + this.isEnabled + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", common=" + this.common + ")";
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
            D40.c.c(dest, 1, bool);
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        IconDTO iconDTO = this.icon;
        if (iconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconDTO.writeToParcel(dest, flags);
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
    public IconCellCardDTO(Preset preset, Style style, Boolean bool, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.ICON_CELL_CARD, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.isEnabled = bool;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.icon = iconDTO;
        this.common = commonControlSettings;
    }
}
