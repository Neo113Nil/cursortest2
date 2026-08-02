package ru.ozon.uni.atoms.data.cell;

import D40.c;
import D40.d;
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
import ru.ozon.uni.android.cell.selection.toggle.data.ToggleTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.selection.toggle.data.ToggleTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO$ToggleTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "toggle", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO$ToggleTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO$ToggleTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getToggle", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ToggleTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ToggleTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ToggleTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;

    @EnumNullFallback
    private final ToggleTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;
    private final ToggleDTO toggle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ToggleTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final ToggleTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ToggleTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : ToggleTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new ToggleTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? ToggleDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleTitleSubtitleCellDTO[] newArray(int i11) {
            return new ToggleTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO$ToggleTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "CENTER_END_500_DEFAULT_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ToggleTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ToggleTitleSubtitleCellPreset[] $VALUES;
        public static final ToggleTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500 = new ToggleTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, ToggleTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500default500());

        @NotNull
        private final ToggleTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ ToggleTitleSubtitleCellPreset[] $values() {
            return new ToggleTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500};
        }

        static {
            ToggleTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ToggleTitleSubtitleCellPreset(String str, int i11, ToggleTitleSubtitleWrapperPreset toggleTitleSubtitleWrapperPreset) {
            this.preset = toggleTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<ToggleTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static ToggleTitleSubtitleCellPreset valueOf(String str) {
            return (ToggleTitleSubtitleCellPreset) Enum.valueOf(ToggleTitleSubtitleCellPreset.class, str);
        }

        public static ToggleTitleSubtitleCellPreset[] values() {
            return (ToggleTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final ToggleTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleTitleSubtitleCellDTO(ToggleTitleSubtitleCellPreset toggleTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, ToggleDTO toggleDTO) {
        super(DsAtomsType.TOGGLE_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = toggleTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.toggle = toggleDTO;
    }

    public static /* synthetic */ ToggleTitleSubtitleCellDTO copy$default(ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO, ToggleTitleSubtitleCellPreset toggleTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, ToggleDTO toggleDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            toggleTitleSubtitleCellPreset = toggleTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = toggleTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = toggleTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = toggleTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            toggleDTO = toggleTitleSubtitleCellDTO.toggle;
        }
        ToggleDTO toggleDTO2 = toggleDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return toggleTitleSubtitleCellDTO.copy(toggleTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, toggleDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final ToggleTitleSubtitleCellPreset getPreset() {
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
    public final ToggleDTO getToggle() {
        return this.toggle;
    }

    @NotNull
    public final ToggleTitleSubtitleCellDTO copy(ToggleTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, ToggleDTO toggle) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ToggleTitleSubtitleCellDTO(preset, common, title, subtitle, toggle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleTitleSubtitleCellDTO)) {
            return false;
        }
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO = (ToggleTitleSubtitleCellDTO) other;
        return this.preset == toggleTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, toggleTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, toggleTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, toggleTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.toggle, toggleTitleSubtitleCellDTO.toggle);
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.toggleTitleSubtitleCV;
    }

    public final ToggleTitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public final ToggleDTO getToggle() {
        return this.toggle;
    }

    public int hashCode() {
        ToggleTitleSubtitleCellPreset toggleTitleSubtitleCellPreset = this.preset;
        int hashCode = (toggleTitleSubtitleCellPreset == null ? 0 : toggleTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        ToggleDTO toggleDTO = this.toggle;
        return hashCode2 + (toggleDTO != null ? toggleDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ToggleTitleSubtitleCellPreset toggleTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        ToggleDTO toggleDTO = this.toggle;
        StringBuilder sb2 = new StringBuilder("ToggleTitleSubtitleCellDTO(preset=");
        sb2.append(toggleTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", toggle=");
        sb2.append(toggleDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ToggleTitleSubtitleCellPreset toggleTitleSubtitleCellPreset = this.preset;
        if (toggleTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(toggleTitleSubtitleCellPreset.name());
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
        ToggleDTO toggleDTO = this.toggle;
        if (toggleDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            toggleDTO.writeToParcel(dest, flags);
        }
    }
}
