package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.data.indicator.IndicatorDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import sh.C9695a;
import sh.C9696b;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00015BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020\u001fJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorIconTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorIconTitleSubtitleCellDTO$DisclosureIndicatorIconTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "disclosureIcon", "Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "indicator", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "icon", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorIconTitleSubtitleCellDTO$DisclosureIndicatorIconTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/icon/IconDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorIconTitleSubtitleCellDTO$DisclosureIndicatorIconTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getDisclosureIcon", "()Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "getIndicator", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "getIcon", "()Lru/ozon/app/android/atoms/data/icon/IconDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclosureIndicatorIconTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclosureIndicatorIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DisclosureIndicatorIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final CommonAtomIconDTO disclosureIcon;
    private final IconDTO icon;
    private final IndicatorDTO indicator;

    @EnumNullFallback
    private final DisclosureIndicatorIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisclosureIndicatorIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureIndicatorIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclosureIndicatorIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DisclosureIndicatorIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DisclosureIndicatorIconTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IconDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureIndicatorIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new DisclosureIndicatorIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/DisclosureIndicatorIconTitleSubtitleCellDTO$DisclosureIndicatorIconTitleSubtitleCellPreset;", "", "Lsh/a;", "preset", "<init>", "(Ljava/lang/String;ILsh/a;)V", "Lsh/a;", "getPreset", "()Lsh/a;", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", "CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisclosureIndicatorIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisclosureIndicatorIconTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final C9695a preset;
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, C9696b.d());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", 1, C9696b.c());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", 2, C9696b.b());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", 3, C9696b.a());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", 4, C9696b.f());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", 5, C9696b.e());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", 6, C9696b.h());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", 7, C9696b.g());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", 8, C9696b.j());
        public static final DisclosureIndicatorIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500 = new DisclosureIndicatorIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", 9, C9696b.i());

        private static final /* synthetic */ DisclosureIndicatorIconTitleSubtitleCellPreset[] $values() {
            return new DisclosureIndicatorIconTitleSubtitleCellPreset[]{CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400, CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400, CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500, CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500};
        }

        static {
            DisclosureIndicatorIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DisclosureIndicatorIconTitleSubtitleCellPreset(String str, int i11, C9695a c9695a) {
            this.preset = c9695a;
        }

        @NotNull
        public static a<DisclosureIndicatorIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DisclosureIndicatorIconTitleSubtitleCellPreset valueOf(String str) {
            return (DisclosureIndicatorIconTitleSubtitleCellPreset) Enum.valueOf(DisclosureIndicatorIconTitleSubtitleCellPreset.class, str);
        }

        public static DisclosureIndicatorIconTitleSubtitleCellPreset[] values() {
            return (DisclosureIndicatorIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C9695a getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureIndicatorIconTitleSubtitleCellDTO(DisclosureIndicatorIconTitleSubtitleCellPreset disclosureIndicatorIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, IndicatorDTO indicatorDTO, IconDTO iconDTO) {
        super(DsAtomsType.DISCLOSURE_INDICATOR_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = disclosureIndicatorIconTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.disclosureIcon = commonAtomIconDTO;
        this.indicator = indicatorDTO;
        this.icon = iconDTO;
    }

    public static /* synthetic */ DisclosureIndicatorIconTitleSubtitleCellDTO copy$default(DisclosureIndicatorIconTitleSubtitleCellDTO disclosureIndicatorIconTitleSubtitleCellDTO, DisclosureIndicatorIconTitleSubtitleCellPreset disclosureIndicatorIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, IndicatorDTO indicatorDTO, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureIndicatorIconTitleSubtitleCellPreset = disclosureIndicatorIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = disclosureIndicatorIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = disclosureIndicatorIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = disclosureIndicatorIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = disclosureIndicatorIconTitleSubtitleCellDTO.disclosureIcon;
        }
        if ((i11 & 32) != 0) {
            indicatorDTO = disclosureIndicatorIconTitleSubtitleCellDTO.indicator;
        }
        if ((i11 & 64) != 0) {
            iconDTO = disclosureIndicatorIconTitleSubtitleCellDTO.icon;
        }
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        IconDTO iconDTO2 = iconDTO;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return disclosureIndicatorIconTitleSubtitleCellDTO.copy(disclosureIndicatorIconTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, commonAtomIconDTO2, indicatorDTO2, iconDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclosureIndicatorIconTitleSubtitleCellPreset getPreset() {
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
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component7, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final DisclosureIndicatorIconTitleSubtitleCellDTO copy(DisclosureIndicatorIconTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO disclosureIcon, IndicatorDTO indicator, IconDTO icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureIndicatorIconTitleSubtitleCellDTO(preset, common, title, subtitle, disclosureIcon, indicator, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureIndicatorIconTitleSubtitleCellDTO)) {
            return false;
        }
        DisclosureIndicatorIconTitleSubtitleCellDTO disclosureIndicatorIconTitleSubtitleCellDTO = (DisclosureIndicatorIconTitleSubtitleCellDTO) other;
        return this.preset == disclosureIndicatorIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, disclosureIndicatorIconTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, disclosureIndicatorIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, disclosureIndicatorIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.disclosureIcon, disclosureIndicatorIconTitleSubtitleCellDTO.disclosureIcon) && Intrinsics.d(this.indicator, disclosureIndicatorIconTitleSubtitleCellDTO.indicator) && Intrinsics.d(this.icon, disclosureIndicatorIconTitleSubtitleCellDTO.icon);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getDisclosureIcon() {
        return this.disclosureIcon;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.disclosureIndicatorIconTitleSubtitleCV;
    }

    public final DisclosureIndicatorIconTitleSubtitleCellPreset getPreset() {
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
        DisclosureIndicatorIconTitleSubtitleCellPreset disclosureIndicatorIconTitleSubtitleCellPreset = this.preset;
        int hashCode = (disclosureIndicatorIconTitleSubtitleCellPreset == null ? 0 : disclosureIndicatorIconTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        int hashCode3 = (hashCode2 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode4 = (hashCode3 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        return hashCode4 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureIndicatorIconTitleSubtitleCellPreset disclosureIndicatorIconTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        IndicatorDTO indicatorDTO = this.indicator;
        IconDTO iconDTO = this.icon;
        StringBuilder sb2 = new StringBuilder("DisclosureIndicatorIconTitleSubtitleCellDTO(preset=");
        sb2.append(disclosureIndicatorIconTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", disclosureIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DisclosureIndicatorIconTitleSubtitleCellPreset disclosureIndicatorIconTitleSubtitleCellPreset = this.preset;
        if (disclosureIndicatorIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(disclosureIndicatorIconTitleSubtitleCellPreset.name());
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
        IndicatorDTO indicatorDTO = this.indicator;
        if (indicatorDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            indicatorDTO.writeToParcel(dest, flags);
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
