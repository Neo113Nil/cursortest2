package ru.ozon.uni.atoms.data.cell;

import C.o0;
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
import ru.ozon.uni.android.cell.dataAddon.data.DataTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.dataAddon.data.DataTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DataTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/uni/atoms/data/cell/DataTitleSubtitleCellDTO$DataTitleSubtitleCellPreset;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "data", "", "<init>", "(Lru/ozon/uni/atoms/data/cell/DataTitleSubtitleCellDTO$DataTitleSubtitleCellPreset;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Ljava/lang/String;)V", "getPreset", "()Lru/ozon/uni/atoms/data/cell/DataTitleSubtitleCellDTO$DataTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getData", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DataTitleSubtitleCellPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DataTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DataTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final String data;

    @EnumNullFallback
    private final DataTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DataTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DataTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DataTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DataTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DataTitleSubtitleCellDTO[] newArray(int i11) {
            return new DataTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/atoms/data/cell/DataTitleSubtitleCellDTO$DataTitleSubtitleCellPreset;", "", "preset", "Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;)V", "getPreset", "()Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "DATA_500_CENTER_END_500_CONTROL_500_CONTROL_500", "DATA_500_CENTER_END_500_CONTROL_600_CONTROL_500", "DATA_600_CENTER_END_500_CONTROL_800_CONTROL_500", "DATA_500_CENTER_END_500_LEADING_CONTROL_500_CONTROL_500", "DATA_500_CENTER_END_500_LEADING_CONTROL_600_CONTROL_500", "DATA_600_CENTER_END_500_LEADING_CONTROL_800_CONTROL_500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DataTitleSubtitleCellPreset[] $VALUES;
        public static final DataTitleSubtitleCellPreset DATA_500_CENTER_END_500_CONTROL_500_CONTROL_500;
        public static final DataTitleSubtitleCellPreset DATA_500_CENTER_END_500_CONTROL_600_CONTROL_500;
        public static final DataTitleSubtitleCellPreset DATA_500_CENTER_END_500_LEADING_CONTROL_500_CONTROL_500;
        public static final DataTitleSubtitleCellPreset DATA_500_CENTER_END_500_LEADING_CONTROL_600_CONTROL_500;
        public static final DataTitleSubtitleCellPreset DATA_600_CENTER_END_500_CONTROL_800_CONTROL_500;
        public static final DataTitleSubtitleCellPreset DATA_600_CENTER_END_500_LEADING_CONTROL_800_CONTROL_500;

        @NotNull
        private final DataTitleSubtitleWrapperPreset preset;

        private static final /* synthetic */ DataTitleSubtitleCellPreset[] $values() {
            return new DataTitleSubtitleCellPreset[]{DATA_500_CENTER_END_500_CONTROL_500_CONTROL_500, DATA_500_CENTER_END_500_CONTROL_600_CONTROL_500, DATA_600_CENTER_END_500_CONTROL_800_CONTROL_500, DATA_500_CENTER_END_500_LEADING_CONTROL_500_CONTROL_500, DATA_500_CENTER_END_500_LEADING_CONTROL_600_CONTROL_500, DATA_600_CENTER_END_500_LEADING_CONTROL_800_CONTROL_500};
        }

        static {
            DataTitleSubtitleWrapperPresets dataTitleSubtitleWrapperPresets = DataTitleSubtitleWrapperPresets.INSTANCE;
            DATA_500_CENTER_END_500_CONTROL_500_CONTROL_500 = new DataTitleSubtitleCellPreset("DATA_500_CENTER_END_500_CONTROL_500_CONTROL_500", 0, dataTitleSubtitleWrapperPresets.getData500CenterEnd500Control500Control500());
            DATA_500_CENTER_END_500_CONTROL_600_CONTROL_500 = new DataTitleSubtitleCellPreset("DATA_500_CENTER_END_500_CONTROL_600_CONTROL_500", 1, dataTitleSubtitleWrapperPresets.getData500CenterEnd500Control600Control500());
            DATA_600_CENTER_END_500_CONTROL_800_CONTROL_500 = new DataTitleSubtitleCellPreset("DATA_600_CENTER_END_500_CONTROL_800_CONTROL_500", 2, dataTitleSubtitleWrapperPresets.getData600centerEnd500Control800Control500());
            DATA_500_CENTER_END_500_LEADING_CONTROL_500_CONTROL_500 = new DataTitleSubtitleCellPreset("DATA_500_CENTER_END_500_LEADING_CONTROL_500_CONTROL_500", 3, dataTitleSubtitleWrapperPresets.getData500CenterEnd500LeadingControl500Control500());
            DATA_500_CENTER_END_500_LEADING_CONTROL_600_CONTROL_500 = new DataTitleSubtitleCellPreset("DATA_500_CENTER_END_500_LEADING_CONTROL_600_CONTROL_500", 4, dataTitleSubtitleWrapperPresets.getData500CenterEnd500LeadingControl600Control500());
            DATA_600_CENTER_END_500_LEADING_CONTROL_800_CONTROL_500 = new DataTitleSubtitleCellPreset("DATA_600_CENTER_END_500_LEADING_CONTROL_800_CONTROL_500", 5, dataTitleSubtitleWrapperPresets.getData600CenterEnd500LeadingControl800Control500());
            DataTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DataTitleSubtitleCellPreset(String str, int i11, DataTitleSubtitleWrapperPreset dataTitleSubtitleWrapperPreset) {
            this.preset = dataTitleSubtitleWrapperPreset;
        }

        @NotNull
        public static a<DataTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DataTitleSubtitleCellPreset valueOf(String str) {
            return (DataTitleSubtitleCellPreset) Enum.valueOf(DataTitleSubtitleCellPreset.class, str);
        }

        public static DataTitleSubtitleCellPreset[] values() {
            return (DataTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final DataTitleSubtitleWrapperPreset getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataTitleSubtitleCellDTO(DataTitleSubtitleCellPreset dataTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, String str) {
        super(DsAtomsType.ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = dataTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.data = str;
    }

    public static /* synthetic */ DataTitleSubtitleCellDTO copy$default(DataTitleSubtitleCellDTO dataTitleSubtitleCellDTO, DataTitleSubtitleCellPreset dataTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dataTitleSubtitleCellPreset = dataTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = dataTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = dataTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = dataTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            str = dataTitleSubtitleCellDTO.data;
        }
        String str2 = str;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return dataTitleSubtitleCellDTO.copy(dataTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final DataTitleSubtitleCellPreset getPreset() {
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
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final DataTitleSubtitleCellDTO copy(DataTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, String data) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DataTitleSubtitleCellDTO(preset, common, title, subtitle, data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataTitleSubtitleCellDTO)) {
            return false;
        }
        DataTitleSubtitleCellDTO dataTitleSubtitleCellDTO = (DataTitleSubtitleCellDTO) other;
        return this.preset == dataTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, dataTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, dataTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, dataTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.data, dataTitleSubtitleCellDTO.data);
    }

    @Override // ru.ozon.uni.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final String getData() {
        return this.data;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.dataTitleSubtitleCV;
    }

    public final DataTitleSubtitleCellPreset getPreset() {
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
        DataTitleSubtitleCellPreset dataTitleSubtitleCellPreset = this.preset;
        int hashCode = (dataTitleSubtitleCellPreset == null ? 0 : dataTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int b11 = d.b(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        String str = this.data;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DataTitleSubtitleCellPreset dataTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        String str = this.data;
        StringBuilder sb2 = new StringBuilder("DataTitleSubtitleCellDTO(preset=");
        sb2.append(dataTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", data=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DataTitleSubtitleCellPreset dataTitleSubtitleCellPreset = this.preset;
        if (dataTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dataTitleSubtitleCellPreset.name());
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
        dest.writeString(this.data);
    }
}
