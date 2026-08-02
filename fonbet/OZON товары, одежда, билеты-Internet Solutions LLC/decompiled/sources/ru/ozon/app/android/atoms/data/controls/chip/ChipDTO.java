package ru.ozon.app.android.atoms.data.controls.chip;

import C.o0;
import Ch.e;
import Ch.f;
import Nj.EnumC3673a;
import Oj.d;
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
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'Jb\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010\u0013J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010'¨\u0006?"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO$Preset;", "preset", "Lru/ozon/app/android/atoms/data/controls/chip/Style;", "style", "LNj/a;", "state", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "common", "", "context", "<init>", "(Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO$Preset;Lru/ozon/app/android/atoms/data/controls/chip/Style;LNj/a;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "", "getItemType", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO$Preset;", "component2", "()Lru/ozon/app/android/atoms/data/controls/chip/Style;", "component3", "()LNj/a;", "component4", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "component5", "component6", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "component7", "()Ljava/lang/String;", "copy", "(Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO$Preset;Lru/ozon/app/android/atoms/data/controls/chip/Style;LNj/a;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO$Preset;", "getPreset", "Lru/ozon/app/android/atoms/data/controls/chip/Style;", "getStyle", "LNj/a;", "getState", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getTitle", "getSubtitle", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getCommon", "Ljava/lang/String;", "getContext", "Preset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChipDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ChipDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;

    @EnumNullFallback
    private final Preset preset;

    @EnumNullFallback
    private final EnumC3673a state;

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
            EnumC3673a valueOf3 = parcel.readInt() == 0 ? null : EnumC3673a.valueOf(parcel.readString());
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/ChipDTO$Preset;", "", "LOj/e;", "settings", "LCh/e;", "mainPreset", "<init>", "(Ljava/lang/String;ILOj/e;LCh/e;)V", "LOj/e;", "getSettings", "()LOj/e;", "LCh/e;", "getMainPreset", "()LCh/e;", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400 = new Preset("SIZE_400", 0, d.b(), f.i());
        public static final Preset SIZE_500 = new Preset("SIZE_500", 1, d.c(), f.l());
        public static final Preset SIZE_600 = new Preset("SIZE_600", 2, d.d(), f.n());
        public static final Preset SIZE_700 = new Preset("SIZE_700", 3, d.e(), f.p());

        @NotNull
        private final e mainPreset;

        @NotNull
        private final Oj.e settings;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, Oj.e eVar, e eVar2) {
            this.settings = eVar;
            this.mainPreset = eVar2;
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
        public final e getMainPreset() {
            return this.mainPreset;
        }

        @NotNull
        public final Oj.e getSettings() {
            return this.settings;
        }
    }

    public /* synthetic */ ChipDTO(Preset preset, Style style, EnumC3673a enumC3673a, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonControlSettings commonControlSettings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(preset, (i11 & 2) != 0 ? Style.ASPECT_PRIMARY : style, (i11 & 4) != 0 ? EnumC3673a.ENABLED : enumC3673a, commonAtomLabelDTO, (i11 & 16) != 0 ? null : commonAtomLabelDTO2, commonControlSettings, (i11 & 64) != 0 ? null : str);
    }

    public static /* synthetic */ ChipDTO copy$default(ChipDTO chipDTO, Preset preset, Style style, EnumC3673a enumC3673a, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = chipDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = chipDTO.style;
        }
        if ((i11 & 4) != 0) {
            enumC3673a = chipDTO.state;
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
        EnumC3673a enumC3673a2 = enumC3673a;
        return chipDTO.copy(preset, style, enumC3673a2, commonAtomLabelDTO, commonAtomLabelDTO3, commonControlSettings2, str2);
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
    public final EnumC3673a getState() {
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
    public final ChipDTO copy(Preset preset, Style style, EnumC3673a state, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonControlSettings common, String context) {
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

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.chip;
    }

    public final Preset getPreset() {
        return this.preset;
    }

    public final EnumC3673a getState() {
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
        EnumC3673a enumC3673a = this.state;
        int c11 = Tl.a.c(this.title, (hashCode2 + (enumC3673a == null ? 0 : enumC3673a.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode3 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.context;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Preset preset = this.preset;
        Style style = this.style;
        EnumC3673a enumC3673a = this.state;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.context;
        StringBuilder sb2 = new StringBuilder("ChipDTO(preset=");
        sb2.append(preset);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", state=");
        sb2.append(enumC3673a);
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
        EnumC3673a enumC3673a = this.state;
        if (enumC3673a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC3673a.name());
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
    public ChipDTO(Preset preset, Style style, EnumC3673a enumC3673a, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.CHIP, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.state = enumC3673a;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.common = commonControlSettings;
        this.context = str;
    }
}
