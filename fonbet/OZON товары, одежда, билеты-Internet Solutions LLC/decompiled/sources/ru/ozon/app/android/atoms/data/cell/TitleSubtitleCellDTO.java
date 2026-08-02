package ru.ozon.app.android.atoms.data.cell;

import Ch.e;
import Ch.f;
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
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0013J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/TitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/TitleSubtitleCellDTO$TitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "<init>", "(Lru/ozon/app/android/atoms/data/cell/TitleSubtitleCellDTO$TitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/TitleSubtitleCellDTO$TitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TitleSubtitleCellDTO> CREATOR = new Creator();

    @NotNull
    private final CommonCellSettings common;

    @EnumNullFallback
    private final TitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final TitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : TitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new TitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TitleSubtitleCellDTO[] newArray(int i11) {
            return new TitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/TitleSubtitleCellDTO$TitleSubtitleCellPreset;", "", "LCh/e;", "preset", "<init>", "(Ljava/lang/String;ILCh/e;)V", "LCh/e;", "getPreset", "()LCh/e;", "DEFAULT_500", "REVERT_500", "CONTROL_500", "DEFAULT_400", "REVERT_400", "CONTROL_400", "H2_END", "H2_COMPACT_END", "CONTENT_DEFAULT_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class TitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final e preset;
        public static final TitleSubtitleCellPreset DEFAULT_500 = new TitleSubtitleCellPreset("DEFAULT_500", 0, f.r());
        public static final TitleSubtitleCellPreset REVERT_500 = new TitleSubtitleCellPreset("REVERT_500", 1, f.D());
        public static final TitleSubtitleCellPreset CONTROL_500 = new TitleSubtitleCellPreset("CONTROL_500", 2, f.j());
        public static final TitleSubtitleCellPreset DEFAULT_400 = new TitleSubtitleCellPreset("DEFAULT_400", 3, f.q());
        public static final TitleSubtitleCellPreset REVERT_400 = new TitleSubtitleCellPreset("REVERT_400", 4, f.C());
        public static final TitleSubtitleCellPreset CONTROL_400 = new TitleSubtitleCellPreset("CONTROL_400", 5, f.g());
        public static final TitleSubtitleCellPreset H2_END = new TitleSubtitleCellPreset("H2_END", 6, f.t());
        public static final TitleSubtitleCellPreset H2_COMPACT_END = new TitleSubtitleCellPreset("H2_COMPACT_END", 7, f.s());
        public static final TitleSubtitleCellPreset CONTENT_DEFAULT_500 = new TitleSubtitleCellPreset("CONTENT_DEFAULT_500", 8, f.d());

        private static final /* synthetic */ TitleSubtitleCellPreset[] $values() {
            return new TitleSubtitleCellPreset[]{DEFAULT_500, REVERT_500, CONTROL_500, DEFAULT_400, REVERT_400, CONTROL_400, H2_END, H2_COMPACT_END, CONTENT_DEFAULT_500};
        }

        static {
            TitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TitleSubtitleCellPreset(String str, int i11, e eVar) {
            this.preset = eVar;
        }

        @NotNull
        public static a<TitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static TitleSubtitleCellPreset valueOf(String str) {
            return (TitleSubtitleCellPreset) Enum.valueOf(TitleSubtitleCellPreset.class, str);
        }

        public static TitleSubtitleCellPreset[] values() {
            return (TitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final e getPreset() {
            return this.preset;
        }
    }

    public /* synthetic */ TitleSubtitleCellDTO(TitleSubtitleCellPreset titleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? TitleSubtitleCellPreset.DEFAULT_500 : titleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2);
    }

    public static /* synthetic */ TitleSubtitleCellDTO copy$default(TitleSubtitleCellDTO titleSubtitleCellDTO, TitleSubtitleCellPreset titleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            titleSubtitleCellPreset = titleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = titleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = titleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = titleSubtitleCellDTO.subtitle;
        }
        return titleSubtitleCellDTO.copy(titleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final TitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    @NotNull
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

    @NotNull
    public final TitleSubtitleCellDTO copy(TitleSubtitleCellPreset preset, @NotNull CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TitleSubtitleCellDTO(preset, common, title, subtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleSubtitleCellDTO)) {
            return false;
        }
        TitleSubtitleCellDTO titleSubtitleCellDTO = (TitleSubtitleCellDTO) other;
        return this.preset == titleSubtitleCellDTO.preset && Intrinsics.d(this.common, titleSubtitleCellDTO.common) && Intrinsics.d(this.title, titleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, titleSubtitleCellDTO.subtitle);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    @NotNull
    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.titleSubtitleCV;
    }

    public final TitleSubtitleCellPreset getPreset() {
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
        TitleSubtitleCellPreset titleSubtitleCellPreset = this.preset;
        int c11 = Tl.a.c(this.title, (this.common.hashCode() + ((titleSubtitleCellPreset == null ? 0 : titleSubtitleCellPreset.hashCode()) * 31)) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        return c11 + (commonAtomLabelDTO != null ? commonAtomLabelDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TitleSubtitleCellDTO(preset=" + this.preset + ", common=" + this.common + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TitleSubtitleCellPreset titleSubtitleCellPreset = this.preset;
        if (titleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(titleSubtitleCellPreset.name());
        }
        this.common.writeToParcel(dest, flags);
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleSubtitleCellDTO(TitleSubtitleCellPreset titleSubtitleCellPreset, @NotNull CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO) {
        super(DsAtomsType.TITLE_SUBTITLE_CELL, common, null, 4, null);
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = titleSubtitleCellPreset;
        this.common = common;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
    }
}
