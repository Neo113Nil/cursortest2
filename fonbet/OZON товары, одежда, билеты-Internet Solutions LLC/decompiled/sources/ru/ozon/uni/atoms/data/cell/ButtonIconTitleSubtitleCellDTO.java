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
import ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell.data.ButtonIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.button.buttonIconTitleSubtitleCell.data.ButtonIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/uni/atoms/data/cell/ButtonIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "preset", "Lru/ozon/uni/atoms/data/cell/ButtonIconTitleSubtitleCellDTO$ButtonIconTitleSubtitleCellPreset;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/cell/ButtonIconTitleSubtitleCellDTO$ButtonIconTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;)V", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getPreset", "()Lru/ozon/uni/atoms/data/cell/ButtonIconTitleSubtitleCellDTO$ButtonIconTitleSubtitleCellPreset;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ButtonIconTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ButtonIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final ButtonDTO button;
    private final CommonCellSettings common;
    private final IconDTO icon;

    @EnumNullFallback
    private final ButtonIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/data/cell/ButtonIconTitleSubtitleCellDTO$ButtonIconTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/button/buttonIconTitleSubtitleCell/data/ButtonIconTitleSubtitleWrapperPreset;", "CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonIconTitleSubtitleCellPreset[] $VALUES;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500;
        public static final ButtonIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500;

        @NotNull
        private final ButtonIconTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ ButtonIconTitleSubtitleCellPreset[] $values() {
            return new ButtonIconTitleSubtitleCellPreset[]{CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500, CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500};
        }

        static {
            ButtonIconTitleSubtitleWrapperPresets buttonIconTitleSubtitleWrapperPresets = ButtonIconTitleSubtitleWrapperPresets.INSTANCE;
            CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_NOSHAPE_500_TOP_START_500_DEFAULT_500", 0, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500NoShape500TopStart500Default500());
            CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_NOSHAPE_500_TOP_START_500_CONTROL_500", 1, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500NoShape500TopStart500Control500());
            CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", 2, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500Shape400TopStart500Default500());
            CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", 3, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500Shape400TopStart500Control500());
            CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", 4, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500Shape500TopStart500Default500());
            CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", 5, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500Shape500TopStart500Control500());
            CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", 6, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500Shape600CenterStart500Default500());
            CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500 = new ButtonIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", 7, buttonIconTitleSubtitleWrapperPresets.getCenterEnd500Shape600CenterStart500Control500());
            ButtonIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonIconTitleSubtitleCellPreset(String str, int i11, ButtonIconTitleSubtitleWrapperPreset buttonIconTitleSubtitleWrapperPreset) {
            this.preset = buttonIconTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<ButtonIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static ButtonIconTitleSubtitleCellPreset valueOf(String str) {
            return (ButtonIconTitleSubtitleCellPreset) Enum.valueOf(ButtonIconTitleSubtitleCellPreset.class, str);
        }

        public static ButtonIconTitleSubtitleCellPreset[] values() {
            return (ButtonIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final ButtonIconTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final ButtonIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            ButtonIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : ButtonIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new ButtonIconTitleSubtitleCellDTO(createFromParcel, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new ButtonIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonIconTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, ButtonIconTitleSubtitleCellPreset buttonIconTitleSubtitleCellPreset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, ButtonDTO buttonDTO) {
        super(DsAtomsType.BUTTON_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.common = commonCellSettings;
        this.preset = buttonIconTitleSubtitleCellPreset;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.icon = iconDTO;
        this.button = buttonDTO;
    }

    public static /* synthetic */ ButtonIconTitleSubtitleCellDTO copy$default(ButtonIconTitleSubtitleCellDTO buttonIconTitleSubtitleCellDTO, CommonCellSettings commonCellSettings, ButtonIconTitleSubtitleCellPreset buttonIconTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconDTO iconDTO, ButtonDTO buttonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonCellSettings = buttonIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 2) != 0) {
            buttonIconTitleSubtitleCellPreset = buttonIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = buttonIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = buttonIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            iconDTO = buttonIconTitleSubtitleCellDTO.icon;
        }
        if ((i11 & 32) != 0) {
            buttonDTO = buttonIconTitleSubtitleCellDTO.button;
        }
        IconDTO iconDTO2 = iconDTO;
        ButtonDTO buttonDTO2 = buttonDTO;
        return buttonIconTitleSubtitleCellDTO.copy(commonCellSettings, buttonIconTitleSubtitleCellPreset, commonAtomLabelDTO, commonAtomLabelDTO2, iconDTO2, buttonDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonIconTitleSubtitleCellPreset getPreset() {
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
    public final ButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final ButtonIconTitleSubtitleCellDTO copy(CommonCellSettings common, ButtonIconTitleSubtitleCellPreset preset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IconDTO icon, ButtonDTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ButtonIconTitleSubtitleCellDTO(common, preset, title, subtitle, icon, button);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonIconTitleSubtitleCellDTO)) {
            return false;
        }
        ButtonIconTitleSubtitleCellDTO buttonIconTitleSubtitleCellDTO = (ButtonIconTitleSubtitleCellDTO) other;
        return Intrinsics.d(this.common, buttonIconTitleSubtitleCellDTO.common) && this.preset == buttonIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.title, buttonIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, buttonIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.icon, buttonIconTitleSubtitleCellDTO.icon) && Intrinsics.d(this.button, buttonIconTitleSubtitleCellDTO.button);
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.buttonTitleSubtitleCell;
    }

    public final ButtonIconTitleSubtitleCellPreset getPreset() {
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
        ButtonIconTitleSubtitleCellPreset buttonIconTitleSubtitleCellPreset = this.preset;
        int b11 = d.b(this.title, (hashCode + (buttonIconTitleSubtitleCellPreset == null ? 0 : buttonIconTitleSubtitleCellPreset.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        return hashCode3 + (buttonDTO != null ? buttonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CommonCellSettings commonCellSettings = this.common;
        ButtonIconTitleSubtitleCellPreset buttonIconTitleSubtitleCellPreset = this.preset;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        ButtonDTO buttonDTO = this.button;
        StringBuilder sb2 = new StringBuilder("ButtonIconTitleSubtitleCellDTO(common=");
        sb2.append(commonCellSettings);
        sb2.append(", preset=");
        sb2.append(buttonIconTitleSubtitleCellPreset);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", icon=");
        sb2.append(iconDTO);
        sb2.append(", button=");
        sb2.append(buttonDTO);
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
        ButtonIconTitleSubtitleCellPreset buttonIconTitleSubtitleCellPreset = this.preset;
        if (buttonIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(buttonIconTitleSubtitleCellPreset.name());
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
        ButtonDTO buttonDTO = this.button;
        if (buttonDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonDTO.writeToParcel(dest, flags);
        }
    }
}
