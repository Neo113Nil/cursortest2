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
import ru.ozon.uni.android.cell.button.iconButtonTitleSubtitleCell.data.IconButtonTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.button.iconButtonTitleSubtitleCell.data.IconButtonTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "preset", "Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO$IconButtonTitleSubtitleCellPreset;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO$IconButtonTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;)V", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getPreset", "()Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO$IconButtonTitleSubtitleCellPreset;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconButtonTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IconButtonTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconButtonTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final IconButtonDTO iconButton;

    @EnumNullFallback
    private final IconButtonTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IconButtonTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconButtonTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            IconButtonTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : IconButtonTitleSubtitleCellPreset.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new IconButtonTitleSubtitleCellDTO(createFromParcel, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? IconButtonDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IconButtonTitleSubtitleCellDTO[] newArray(int i11) {
            return new IconButtonTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO$IconButtonTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPreset;", "CENTER_END_500_DEFAULT_500", "CENTER_END_500_CONTROL_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IconButtonTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconButtonTitleSubtitleCellPreset[] $VALUES;
        public static final IconButtonTitleSubtitleCellPreset CENTER_END_500_CONTROL_500;
        public static final IconButtonTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500;

        @NotNull
        private final IconButtonTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ IconButtonTitleSubtitleCellPreset[] $values() {
            return new IconButtonTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500, CENTER_END_500_CONTROL_500};
        }

        static {
            IconButtonTitleSubtitleWrapperPresets iconButtonTitleSubtitleWrapperPresets = IconButtonTitleSubtitleWrapperPresets.INSTANCE;
            CENTER_END_500_DEFAULT_500 = new IconButtonTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, iconButtonTitleSubtitleWrapperPresets.getCenterEnd500Default500());
            CENTER_END_500_CONTROL_500 = new IconButtonTitleSubtitleCellPreset("CENTER_END_500_CONTROL_500", 1, iconButtonTitleSubtitleWrapperPresets.getCenterEnd500Control500());
            IconButtonTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconButtonTitleSubtitleCellPreset(String str, int i11, IconButtonTitleSubtitleWrapperPreset iconButtonTitleSubtitleWrapperPreset) {
            this.preset = iconButtonTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<IconButtonTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static IconButtonTitleSubtitleCellPreset valueOf(String str) {
            return (IconButtonTitleSubtitleCellPreset) Enum.valueOf(IconButtonTitleSubtitleCellPreset.class, str);
        }

        public static IconButtonTitleSubtitleCellPreset[] values() {
            return (IconButtonTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final IconButtonTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, IconButtonTitleSubtitleCellPreset iconButtonTitleSubtitleCellPreset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconButtonDTO iconButtonDTO) {
        super(DsAtomsType.ICON_BUTTON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.common = commonCellSettings;
        this.preset = iconButtonTitleSubtitleCellPreset;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.iconButton = iconButtonDTO;
    }

    public static /* synthetic */ IconButtonTitleSubtitleCellDTO copy$default(IconButtonTitleSubtitleCellDTO iconButtonTitleSubtitleCellDTO, CommonCellSettings commonCellSettings, IconButtonTitleSubtitleCellPreset iconButtonTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconButtonDTO iconButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonCellSettings = iconButtonTitleSubtitleCellDTO.common;
        }
        if ((i11 & 2) != 0) {
            iconButtonTitleSubtitleCellPreset = iconButtonTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = iconButtonTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = iconButtonTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            iconButtonDTO = iconButtonTitleSubtitleCellDTO.iconButton;
        }
        IconButtonDTO iconButtonDTO2 = iconButtonDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return iconButtonTitleSubtitleCellDTO.copy(commonCellSettings, iconButtonTitleSubtitleCellPreset, commonAtomLabelDTO3, commonAtomLabelDTO2, iconButtonDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonTitleSubtitleCellPreset getPreset() {
        return this.preset;
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
    public final IconButtonDTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final IconButtonTitleSubtitleCellDTO copy(CommonCellSettings common, IconButtonTitleSubtitleCellPreset preset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IconButtonDTO iconButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IconButtonTitleSubtitleCellDTO(common, preset, title, subtitle, iconButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonTitleSubtitleCellDTO)) {
            return false;
        }
        IconButtonTitleSubtitleCellDTO iconButtonTitleSubtitleCellDTO = (IconButtonTitleSubtitleCellDTO) other;
        return Intrinsics.d(this.common, iconButtonTitleSubtitleCellDTO.common) && this.preset == iconButtonTitleSubtitleCellDTO.preset && Intrinsics.d(this.title, iconButtonTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, iconButtonTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.iconButton, iconButtonTitleSubtitleCellDTO.iconButton);
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final IconButtonDTO getIconButton() {
        return this.iconButton;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.iconButtonTitleSubtitleCell;
    }

    public final IconButtonTitleSubtitleCellPreset getPreset() {
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
        CommonCellSettings commonCellSettings = this.common;
        int hashCode = (commonCellSettings == null ? 0 : commonCellSettings.hashCode()) * 31;
        IconButtonTitleSubtitleCellPreset iconButtonTitleSubtitleCellPreset = this.preset;
        int b11 = d.b(this.title, (hashCode + (iconButtonTitleSubtitleCellPreset == null ? 0 : iconButtonTitleSubtitleCellPreset.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IconButtonDTO iconButtonDTO = this.iconButton;
        return hashCode2 + (iconButtonDTO != null ? iconButtonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CommonCellSettings commonCellSettings = this.common;
        IconButtonTitleSubtitleCellPreset iconButtonTitleSubtitleCellPreset = this.preset;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IconButtonDTO iconButtonDTO = this.iconButton;
        StringBuilder sb2 = new StringBuilder("IconButtonTitleSubtitleCellDTO(common=");
        sb2.append(commonCellSettings);
        sb2.append(", preset=");
        sb2.append(iconButtonTitleSubtitleCellPreset);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", iconButton=");
        sb2.append(iconButtonDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CommonCellSettings commonCellSettings = this.common;
        if (commonCellSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonCellSettings.writeToParcel(dest, flags);
        }
        IconButtonTitleSubtitleCellPreset iconButtonTitleSubtitleCellPreset = this.preset;
        if (iconButtonTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconButtonTitleSubtitleCellPreset.name());
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        IconButtonDTO iconButtonDTO = this.iconButton;
        if (iconButtonDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconButtonDTO.writeToParcel(dest, flags);
        }
    }
}
