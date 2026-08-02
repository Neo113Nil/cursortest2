package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import jh.C7427c;
import jh.C7428d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/IconButtonIconTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "preset", "Lru/ozon/app/android/atoms/data/cell/IconButtonIconTitleSubtitleCellDTO$IconButtonIconTitleSubtitleCellPreset;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "icon", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "iconButton", "Lru/ozon/app/android/atoms/data/controls/button/IconButtonDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/cell/IconButtonIconTitleSubtitleCellDTO$IconButtonIconTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/controls/button/IconButtonDTO;)V", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/IconButtonIconTitleSubtitleCellDTO$IconButtonIconTitleSubtitleCellPreset;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIcon", "()Lru/ozon/app/android/atoms/data/icon/IconDTO;", "getIconButton", "()Lru/ozon/app/android/atoms/data/controls/button/IconButtonDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconButtonIconTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconButtonIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconButtonIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final IconDTO icon;
    private final IconButtonDTO iconButton;

    @EnumNullFallback
    private final IconButtonIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconButtonIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconButtonIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            IconButtonIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : IconButtonIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new IconButtonIconTitleSubtitleCellDTO(createFromParcel, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconButtonDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IconButtonIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new IconButtonIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/IconButtonIconTitleSubtitleCellDTO$IconButtonIconTitleSubtitleCellPreset;", "", "Ljh/c;", "preset", "<init>", "(Ljava/lang/String;ILjh/c;)V", "Ljh/c;", "getPreset", "()Ljh/c;", "CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconButtonIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconButtonIconTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final C7427c preset;
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500", 0, C7428d.b());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500", 1, C7428d.a());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", 2, C7428d.d());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", 3, C7428d.c());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", 4, C7428d.f());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", 5, C7428d.e());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", 6, C7428d.h());
        public static final IconButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500 = new IconButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", 7, C7428d.g());

        private static final /* synthetic */ IconButtonIconTitleSubtitleCellPreset[] $values() {
            return new IconButtonIconTitleSubtitleCellPreset[]{CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500, CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500};
        }

        static {
            IconButtonIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconButtonIconTitleSubtitleCellPreset(String str, int i11, C7427c c7427c) {
            this.preset = c7427c;
        }

        @NotNull
        public static a<IconButtonIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static IconButtonIconTitleSubtitleCellPreset valueOf(String str) {
            return (IconButtonIconTitleSubtitleCellPreset) Enum.valueOf(IconButtonIconTitleSubtitleCellPreset.class, str);
        }

        public static IconButtonIconTitleSubtitleCellPreset[] values() {
            return (IconButtonIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C7427c getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonIconTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, IconButtonIconTitleSubtitleCellPreset iconButtonIconTitleSubtitleCellPreset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, IconButtonDTO iconButtonDTO) {
        super(DsAtomsType.ICON_BUTTON_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.common = commonCellSettings;
        this.preset = iconButtonIconTitleSubtitleCellPreset;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.icon = iconDTO;
        this.iconButton = iconButtonDTO;
    }

    public static /* synthetic */ IconButtonIconTitleSubtitleCellDTO copy$default(IconButtonIconTitleSubtitleCellDTO iconButtonIconTitleSubtitleCellDTO, CommonCellSettings commonCellSettings, IconButtonIconTitleSubtitleCellPreset iconButtonIconTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconDTO iconDTO, IconButtonDTO iconButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonCellSettings = iconButtonIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 2) != 0) {
            iconButtonIconTitleSubtitleCellPreset = iconButtonIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = iconButtonIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = iconButtonIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            iconDTO = iconButtonIconTitleSubtitleCellDTO.icon;
        }
        if ((i11 & 32) != 0) {
            iconButtonDTO = iconButtonIconTitleSubtitleCellDTO.iconButton;
        }
        IconDTO iconDTO2 = iconDTO;
        IconButtonDTO iconButtonDTO2 = iconButtonDTO;
        return iconButtonIconTitleSubtitleCellDTO.copy(commonCellSettings, iconButtonIconTitleSubtitleCellPreset, commonAtomLabelDTO, commonAtomLabelDTO2, iconDTO2, iconButtonDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonIconTitleSubtitleCellPreset getPreset() {
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
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final IconButtonDTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final IconButtonIconTitleSubtitleCellDTO copy(CommonCellSettings common, IconButtonIconTitleSubtitleCellPreset preset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IconDTO icon, IconButtonDTO iconButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IconButtonIconTitleSubtitleCellDTO(common, preset, title, subtitle, icon, iconButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonIconTitleSubtitleCellDTO)) {
            return false;
        }
        IconButtonIconTitleSubtitleCellDTO iconButtonIconTitleSubtitleCellDTO = (IconButtonIconTitleSubtitleCellDTO) other;
        return Intrinsics.d(this.common, iconButtonIconTitleSubtitleCellDTO.common) && this.preset == iconButtonIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.title, iconButtonIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, iconButtonIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.icon, iconButtonIconTitleSubtitleCellDTO.icon) && Intrinsics.d(this.iconButton, iconButtonIconTitleSubtitleCellDTO.iconButton);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final IconButtonDTO getIconButton() {
        return this.iconButton;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.iconButtonIconTitleSubtitleCell;
    }

    public final IconButtonIconTitleSubtitleCellPreset getPreset() {
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
        IconButtonIconTitleSubtitleCellPreset iconButtonIconTitleSubtitleCellPreset = this.preset;
        int c11 = Tl.a.c(this.title, (hashCode + (iconButtonIconTitleSubtitleCellPreset == null ? 0 : iconButtonIconTitleSubtitleCellPreset.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        IconButtonDTO iconButtonDTO = this.iconButton;
        return hashCode3 + (iconButtonDTO != null ? iconButtonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CommonCellSettings commonCellSettings = this.common;
        IconButtonIconTitleSubtitleCellPreset iconButtonIconTitleSubtitleCellPreset = this.preset;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        IconButtonDTO iconButtonDTO = this.iconButton;
        StringBuilder sb2 = new StringBuilder("IconButtonIconTitleSubtitleCellDTO(common=");
        sb2.append(commonCellSettings);
        sb2.append(", preset=");
        sb2.append(iconButtonIconTitleSubtitleCellPreset);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", icon=");
        sb2.append(iconDTO);
        sb2.append(", iconButton=");
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
        IconButtonIconTitleSubtitleCellPreset iconButtonIconTitleSubtitleCellPreset = this.preset;
        if (iconButtonIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconButtonIconTitleSubtitleCellPreset.name());
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
        IconButtonDTO iconButtonDTO = this.iconButton;
        if (iconButtonDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconButtonDTO.writeToParcel(dest, flags);
        }
    }
}
