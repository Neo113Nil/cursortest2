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
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.data.DisclosureIconTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.data.DisclosureIconTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO$DisclosureIconTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "disclosureIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO$DisclosureIconTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO$DisclosureIconTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getDisclosureIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclosureIconTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DisclosureIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DisclosureIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final CommonAtomIconDTO disclosureIcon;
    private final IconDTO icon;

    @EnumNullFallback
    private final DisclosureIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DisclosureIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclosureIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DisclosureIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DisclosureIconTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new DisclosureIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO$DisclosureIconTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/data/DisclosureIconTitleSubtitleWrapperPreset;", "NO_SHAPE_500_TOP_START_500_DEFAULT_500", "NO_SHAPE_500_TOP_START_500_CONTROL_500", "NO_SHAPE_400_TOP_START_400_DEFAULT_400", "NO_SHAPE_400_TOP_START_400_CONTROL_400", "SHAPE_400_TOP_START_500_DEFAULT_500", "SHAPE_400_TOP_START_500_CONTROL_500", "SHAPE_500_TOP_START_500_DEFAULT_500", "SHAPE_500_TOP_START_500_CONTROL_500", "SHAPE_600_CENTER_START_500_DEFAULT_500", "SHAPE_600_CENTER_START_500_CONTROL_500", "SHAPE_400_CENTER_500_CONTROL_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DisclosureIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisclosureIconTitleSubtitleCellPreset[] $VALUES;
        public static final DisclosureIconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_400_CONTROL_400;
        public static final DisclosureIconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_400_DEFAULT_400;
        public static final DisclosureIconTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_CONTROL_500;
        public static final DisclosureIconTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_400_CENTER_500_CONTROL_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_400_TOP_START_500_CONTROL_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_400_TOP_START_500_DEFAULT_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_500_TOP_START_500_CONTROL_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_500_TOP_START_500_DEFAULT_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_600_CENTER_START_500_CONTROL_500;
        public static final DisclosureIconTitleSubtitleCellPreset SHAPE_600_CENTER_START_500_DEFAULT_500;

        @NotNull
        private final DisclosureIconTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ DisclosureIconTitleSubtitleCellPreset[] $values() {
            return new DisclosureIconTitleSubtitleCellPreset[]{NO_SHAPE_500_TOP_START_500_DEFAULT_500, NO_SHAPE_500_TOP_START_500_CONTROL_500, NO_SHAPE_400_TOP_START_400_DEFAULT_400, NO_SHAPE_400_TOP_START_400_CONTROL_400, SHAPE_400_TOP_START_500_DEFAULT_500, SHAPE_400_TOP_START_500_CONTROL_500, SHAPE_500_TOP_START_500_DEFAULT_500, SHAPE_500_TOP_START_500_CONTROL_500, SHAPE_600_CENTER_START_500_DEFAULT_500, SHAPE_600_CENTER_START_500_CONTROL_500, SHAPE_400_CENTER_500_CONTROL_500};
        }

        static {
            DisclosureIconTitleSubtitleWrapperPresets disclosureIconTitleSubtitleWrapperPresets = DisclosureIconTitleSubtitleWrapperPresets.INSTANCE;
            NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new DisclosureIconTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, disclosureIconTitleSubtitleWrapperPresets.getNoShape500TopStart500Default500());
            NO_SHAPE_500_TOP_START_500_CONTROL_500 = new DisclosureIconTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_CONTROL_500", 1, disclosureIconTitleSubtitleWrapperPresets.getNoShape500TopStart500Control500());
            NO_SHAPE_400_TOP_START_400_DEFAULT_400 = new DisclosureIconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_400_DEFAULT_400", 2, disclosureIconTitleSubtitleWrapperPresets.getNoShape400TopStart400Default400());
            NO_SHAPE_400_TOP_START_400_CONTROL_400 = new DisclosureIconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_400_CONTROL_400", 3, disclosureIconTitleSubtitleWrapperPresets.getNoShape400TopStart400Control400());
            SHAPE_400_TOP_START_500_DEFAULT_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_400_TOP_START_500_DEFAULT_500", 4, disclosureIconTitleSubtitleWrapperPresets.getShape400TopStart500Default500());
            SHAPE_400_TOP_START_500_CONTROL_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_400_TOP_START_500_CONTROL_500", 5, disclosureIconTitleSubtitleWrapperPresets.getShape400TopStart500Control500());
            SHAPE_500_TOP_START_500_DEFAULT_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_500_TOP_START_500_DEFAULT_500", 6, disclosureIconTitleSubtitleWrapperPresets.getShape500TopStart500Default500());
            SHAPE_500_TOP_START_500_CONTROL_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_500_TOP_START_500_CONTROL_500", 7, disclosureIconTitleSubtitleWrapperPresets.getShape500TopStart500Control500());
            SHAPE_600_CENTER_START_500_DEFAULT_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_600_CENTER_START_500_DEFAULT_500", 8, disclosureIconTitleSubtitleWrapperPresets.getShape600CenterStart500Default500());
            SHAPE_600_CENTER_START_500_CONTROL_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_600_CENTER_START_500_CONTROL_500", 9, disclosureIconTitleSubtitleWrapperPresets.getShape600CenterStart500Control500());
            SHAPE_400_CENTER_500_CONTROL_500 = new DisclosureIconTitleSubtitleCellPreset("SHAPE_400_CENTER_500_CONTROL_500", 10, disclosureIconTitleSubtitleWrapperPresets.getShape400Center500Control500());
            DisclosureIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DisclosureIconTitleSubtitleCellPreset(String str, int i11, DisclosureIconTitleSubtitleWrapperPreset disclosureIconTitleSubtitleWrapperPreset) {
            this.preset = disclosureIconTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<DisclosureIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DisclosureIconTitleSubtitleCellPreset valueOf(String str) {
            return (DisclosureIconTitleSubtitleCellPreset) Enum.valueOf(DisclosureIconTitleSubtitleCellPreset.class, str);
        }

        public static DisclosureIconTitleSubtitleCellPreset[] values() {
            return (DisclosureIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final DisclosureIconTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureIconTitleSubtitleCellDTO(DisclosureIconTitleSubtitleCellPreset disclosureIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, IconDTO iconDTO) {
        super(DsAtomsType.DISCLOSURE_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = disclosureIconTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.disclosureIcon = commonAtomIconDTO;
        this.icon = iconDTO;
    }

    public static /* synthetic */ DisclosureIconTitleSubtitleCellDTO copy$default(DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO, DisclosureIconTitleSubtitleCellPreset disclosureIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureIconTitleSubtitleCellPreset = disclosureIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = disclosureIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = disclosureIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = disclosureIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = disclosureIconTitleSubtitleCellDTO.disclosureIcon;
        }
        if ((i11 & 32) != 0) {
            iconDTO = disclosureIconTitleSubtitleCellDTO.icon;
        }
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        IconDTO iconDTO2 = iconDTO;
        return disclosureIconTitleSubtitleCellDTO.copy(disclosureIconTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2, commonAtomIconDTO2, iconDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclosureIconTitleSubtitleCellPreset getPreset() {
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
    public final CommonAtomIconDTO getDisclosureIcon() {
        return this.disclosureIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleCellDTO copy(DisclosureIconTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO disclosureIcon, IconDTO icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureIconTitleSubtitleCellDTO(preset, common, title, subtitle, disclosureIcon, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureIconTitleSubtitleCellDTO)) {
            return false;
        }
        DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO = (DisclosureIconTitleSubtitleCellDTO) other;
        return this.preset == disclosureIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, disclosureIconTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, disclosureIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, disclosureIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.disclosureIcon, disclosureIconTitleSubtitleCellDTO.disclosureIcon) && Intrinsics.d(this.icon, disclosureIconTitleSubtitleCellDTO.icon);
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getDisclosureIcon() {
        return this.disclosureIcon;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.disclosureIconTitleSubtitleCV;
    }

    public final DisclosureIconTitleSubtitleCellPreset getPreset() {
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
        DisclosureIconTitleSubtitleCellPreset disclosureIconTitleSubtitleCellPreset = this.preset;
        int hashCode = (disclosureIconTitleSubtitleCellPreset == null ? 0 : disclosureIconTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        int hashCode3 = (hashCode2 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        return hashCode3 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureIconTitleSubtitleCellPreset disclosureIconTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        IconDTO iconDTO = this.icon;
        StringBuilder sb2 = new StringBuilder("DisclosureIconTitleSubtitleCellDTO(preset=");
        sb2.append(disclosureIconTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", disclosureIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DisclosureIconTitleSubtitleCellPreset disclosureIconTitleSubtitleCellPreset = this.preset;
        if (disclosureIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(disclosureIconTitleSubtitleCellPreset.name());
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
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        if (commonAtomIconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomIconDTO.writeToParcel(dest, flags);
        }
        IconDTO iconDTO = this.icon;
        if (iconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconDTO.writeToParcel(dest, flags);
        }
    }
}
