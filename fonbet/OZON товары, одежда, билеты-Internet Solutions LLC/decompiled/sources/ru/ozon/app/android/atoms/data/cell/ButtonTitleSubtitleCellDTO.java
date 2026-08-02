package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import ih.C7078c;
import ih.C7079d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.controls.button.ButtonDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "preset", "Lru/ozon/app/android/atoms/data/cell/ButtonTitleSubtitleCellDTO$ButtonTitleSubtitleCellPreset;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "button", "Lru/ozon/app/android/atoms/data/controls/button/ButtonDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/cell/ButtonTitleSubtitleCellDTO$ButtonTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/controls/button/ButtonDTO;)V", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/ButtonTitleSubtitleCellDTO$ButtonTitleSubtitleCellPreset;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getButton", "()Lru/ozon/app/android/atoms/data/controls/button/ButtonDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ButtonTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ButtonTitleSubtitleCellDTO> CREATOR = new Creator();
    private final ButtonDTO button;
    private final CommonCellSettings common;

    @EnumNullFallback
    private final ButtonTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/ButtonTitleSubtitleCellDTO$ButtonTitleSubtitleCellPreset;", "", "Lih/c;", "preset", "<init>", "(Ljava/lang/String;ILih/c;)V", "Lih/c;", "getPreset", "()Lih/c;", "CENTER_END_500_DEFAULT_500", "CENTER_END_500_CONTROL_500", "VERTICAL_END_500_DEFAULT_500", "VERTICAL_END_500_CONTROL_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final C7078c preset;
        public static final ButtonTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500 = new ButtonTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, C7079d.b());
        public static final ButtonTitleSubtitleCellPreset CENTER_END_500_CONTROL_500 = new ButtonTitleSubtitleCellPreset("CENTER_END_500_CONTROL_500", 1, C7079d.a());
        public static final ButtonTitleSubtitleCellPreset VERTICAL_END_500_DEFAULT_500 = new ButtonTitleSubtitleCellPreset("VERTICAL_END_500_DEFAULT_500", 2, C7079d.d());
        public static final ButtonTitleSubtitleCellPreset VERTICAL_END_500_CONTROL_500 = new ButtonTitleSubtitleCellPreset("VERTICAL_END_500_CONTROL_500", 3, C7079d.c());

        private static final /* synthetic */ ButtonTitleSubtitleCellPreset[] $values() {
            return new ButtonTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500, CENTER_END_500_CONTROL_500, VERTICAL_END_500_DEFAULT_500, VERTICAL_END_500_CONTROL_500};
        }

        static {
            ButtonTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonTitleSubtitleCellPreset(String str, int i11, C7078c c7078c) {
            this.preset = c7078c;
        }

        @NotNull
        public static a<ButtonTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static ButtonTitleSubtitleCellPreset valueOf(String str) {
            return (ButtonTitleSubtitleCellPreset) Enum.valueOf(ButtonTitleSubtitleCellPreset.class, str);
        }

        public static ButtonTitleSubtitleCellPreset[] values() {
            return (ButtonTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C7078c getPreset() {
            return this.preset;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final ButtonTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            ButtonTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : ButtonTitleSubtitleCellPreset.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new ButtonTitleSubtitleCellDTO(createFromParcel, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonTitleSubtitleCellDTO[] newArray(int i11) {
            return new ButtonTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, ButtonTitleSubtitleCellPreset buttonTitleSubtitleCellPreset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, ButtonDTO buttonDTO) {
        super(DsAtomsType.BUTTON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.common = commonCellSettings;
        this.preset = buttonTitleSubtitleCellPreset;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.button = buttonDTO;
    }

    public static /* synthetic */ ButtonTitleSubtitleCellDTO copy$default(ButtonTitleSubtitleCellDTO buttonTitleSubtitleCellDTO, CommonCellSettings commonCellSettings, ButtonTitleSubtitleCellPreset buttonTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, ButtonDTO buttonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonCellSettings = buttonTitleSubtitleCellDTO.common;
        }
        if ((i11 & 2) != 0) {
            buttonTitleSubtitleCellPreset = buttonTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = buttonTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = buttonTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            buttonDTO = buttonTitleSubtitleCellDTO.button;
        }
        ButtonDTO buttonDTO2 = buttonDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return buttonTitleSubtitleCellDTO.copy(commonCellSettings, buttonTitleSubtitleCellPreset, commonAtomLabelDTO3, commonAtomLabelDTO2, buttonDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonTitleSubtitleCellPreset getPreset() {
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
    public final ButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final ButtonTitleSubtitleCellDTO copy(CommonCellSettings common, ButtonTitleSubtitleCellPreset preset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, ButtonDTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ButtonTitleSubtitleCellDTO(common, preset, title, subtitle, button);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonTitleSubtitleCellDTO)) {
            return false;
        }
        ButtonTitleSubtitleCellDTO buttonTitleSubtitleCellDTO = (ButtonTitleSubtitleCellDTO) other;
        return Intrinsics.d(this.common, buttonTitleSubtitleCellDTO.common) && this.preset == buttonTitleSubtitleCellDTO.preset && Intrinsics.d(this.title, buttonTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, buttonTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.button, buttonTitleSubtitleCellDTO.button);
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.buttonTitleSubtitleCell;
    }

    public final ButtonTitleSubtitleCellPreset getPreset() {
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
        ButtonTitleSubtitleCellPreset buttonTitleSubtitleCellPreset = this.preset;
        int c11 = Tl.a.c(this.title, (hashCode + (buttonTitleSubtitleCellPreset == null ? 0 : buttonTitleSubtitleCellPreset.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        return hashCode2 + (buttonDTO != null ? buttonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CommonCellSettings commonCellSettings = this.common;
        ButtonTitleSubtitleCellPreset buttonTitleSubtitleCellPreset = this.preset;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        ButtonDTO buttonDTO = this.button;
        StringBuilder sb2 = new StringBuilder("ButtonTitleSubtitleCellDTO(common=");
        sb2.append(commonCellSettings);
        sb2.append(", preset=");
        sb2.append(buttonTitleSubtitleCellPreset);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", button=");
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
        ButtonTitleSubtitleCellPreset buttonTitleSubtitleCellPreset = this.preset;
        if (buttonTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(buttonTitleSubtitleCellPreset.name());
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
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
