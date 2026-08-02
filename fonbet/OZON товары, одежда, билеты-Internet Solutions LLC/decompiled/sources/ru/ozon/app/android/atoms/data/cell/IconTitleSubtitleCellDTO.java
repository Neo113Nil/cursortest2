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
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import vh.c;
import vh.d;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/IconTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/IconTitleSubtitleCellDTO$IconTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "icon", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/IconTitleSubtitleCellDTO$IconTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/icon/IconDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/IconTitleSubtitleCellDTO$IconTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIcon", "()Lru/ozon/app/android/atoms/data/icon/IconDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final IconDTO icon;

    @EnumNullFallback
    private final IconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : IconTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new IconTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? IconDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IconTitleSubtitleCellDTO[] newArray(int i11) {
            return new IconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/IconTitleSubtitleCellDTO$IconTitleSubtitleCellPreset;", "", "Lvh/c;", "preset", "<init>", "(Ljava/lang/String;ILvh/c;)V", "Lvh/c;", "getPreset", "()Lvh/c;", "NO_SHAPE_500_TOP_START_500_DEFAULT_500", "NO_SHAPE_400_TOP_START_400_DEFAULT_400", "NO_SHAPE_400_TOP_START_DEFAULT_400", "SHAPE_400_TOP_START_500_DEFAULT_500", "SHAPE_500_TOP_START_500_DEFAULT_500", "SHAPE_500_VERTICAL_START_500_DEFAULT_400", "SHAPE_600_VERTICAL_START_500_DEFAULT_400", "SHAPE_600_CENTER_START_500_DEFAULT_500", "NO_SHAPE_500_TOP_START_500_REVERT_500", "NO_SHAPE_400_TOP_START_400_REVERT_400", "NO_SHAPE_400_TOP_START_REVERT_400", "SHAPE_400_TOP_START_500_REVERT_500", "SHAPE_500_TOP_START_500_REVERT_500", "SHAPE_600_CENTER_START_500_REVERT_500", "NO_SHAPE_500_TOP_START_500_CONTROL_500", "NO_SHAPE_400_TOP_START_400_CONTROL_400", "NO_SHAPE_400_TOP_START_CONTROL_400", "SHAPE_400_VERTICAL_START_500_CONTROL_400", "SHAPE_400_TOP_START_500_CONTROL_500", "SHAPE_500_TOP_START_500_CONTROL_500", "SHAPE_600_CENTER_START_500_CONTROL_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final c preset;
        public static final IconTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new IconTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, d.h());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_400_DEFAULT_400 = new IconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_400_DEFAULT_400", 1, d.b());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_DEFAULT_400 = new IconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_DEFAULT_400", 2, d.e());
        public static final IconTitleSubtitleCellPreset SHAPE_400_TOP_START_500_DEFAULT_500 = new IconTitleSubtitleCellPreset("SHAPE_400_TOP_START_500_DEFAULT_500", 3, d.m());
        public static final IconTitleSubtitleCellPreset SHAPE_500_TOP_START_500_DEFAULT_500 = new IconTitleSubtitleCellPreset("SHAPE_500_TOP_START_500_DEFAULT_500", 4, d.r());
        public static final IconTitleSubtitleCellPreset SHAPE_500_VERTICAL_START_500_DEFAULT_400 = new IconTitleSubtitleCellPreset("SHAPE_500_VERTICAL_START_500_DEFAULT_400", 5, d.t());
        public static final IconTitleSubtitleCellPreset SHAPE_600_VERTICAL_START_500_DEFAULT_400 = new IconTitleSubtitleCellPreset("SHAPE_600_VERTICAL_START_500_DEFAULT_400", 6, d.y());
        public static final IconTitleSubtitleCellPreset SHAPE_600_CENTER_START_500_DEFAULT_500 = new IconTitleSubtitleCellPreset("SHAPE_600_CENTER_START_500_DEFAULT_500", 7, d.w());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_REVERT_500 = new IconTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_REVERT_500", 8, d.i());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_400_REVERT_400 = new IconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_400_REVERT_400", 9, d.c());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_REVERT_400 = new IconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_REVERT_400", 10, d.f());
        public static final IconTitleSubtitleCellPreset SHAPE_400_TOP_START_500_REVERT_500 = new IconTitleSubtitleCellPreset("SHAPE_400_TOP_START_500_REVERT_500", 11, d.n());
        public static final IconTitleSubtitleCellPreset SHAPE_500_TOP_START_500_REVERT_500 = new IconTitleSubtitleCellPreset("SHAPE_500_TOP_START_500_REVERT_500", 12, d.s());
        public static final IconTitleSubtitleCellPreset SHAPE_600_CENTER_START_500_REVERT_500 = new IconTitleSubtitleCellPreset("SHAPE_600_CENTER_START_500_REVERT_500", 13, d.x());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_500_TOP_START_500_CONTROL_500 = new IconTitleSubtitleCellPreset("NO_SHAPE_500_TOP_START_500_CONTROL_500", 14, d.g());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_400_CONTROL_400 = new IconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_400_CONTROL_400", 15, d.a());
        public static final IconTitleSubtitleCellPreset NO_SHAPE_400_TOP_START_CONTROL_400 = new IconTitleSubtitleCellPreset("NO_SHAPE_400_TOP_START_CONTROL_400", 16, d.d());
        public static final IconTitleSubtitleCellPreset SHAPE_400_VERTICAL_START_500_CONTROL_400 = new IconTitleSubtitleCellPreset("SHAPE_400_VERTICAL_START_500_CONTROL_400", 17, d.o());
        public static final IconTitleSubtitleCellPreset SHAPE_400_TOP_START_500_CONTROL_500 = new IconTitleSubtitleCellPreset("SHAPE_400_TOP_START_500_CONTROL_500", 18, d.l());
        public static final IconTitleSubtitleCellPreset SHAPE_500_TOP_START_500_CONTROL_500 = new IconTitleSubtitleCellPreset("SHAPE_500_TOP_START_500_CONTROL_500", 19, d.q());
        public static final IconTitleSubtitleCellPreset SHAPE_600_CENTER_START_500_CONTROL_500 = new IconTitleSubtitleCellPreset("SHAPE_600_CENTER_START_500_CONTROL_500", 20, d.v());

        private static final /* synthetic */ IconTitleSubtitleCellPreset[] $values() {
            return new IconTitleSubtitleCellPreset[]{NO_SHAPE_500_TOP_START_500_DEFAULT_500, NO_SHAPE_400_TOP_START_400_DEFAULT_400, NO_SHAPE_400_TOP_START_DEFAULT_400, SHAPE_400_TOP_START_500_DEFAULT_500, SHAPE_500_TOP_START_500_DEFAULT_500, SHAPE_500_VERTICAL_START_500_DEFAULT_400, SHAPE_600_VERTICAL_START_500_DEFAULT_400, SHAPE_600_CENTER_START_500_DEFAULT_500, NO_SHAPE_500_TOP_START_500_REVERT_500, NO_SHAPE_400_TOP_START_400_REVERT_400, NO_SHAPE_400_TOP_START_REVERT_400, SHAPE_400_TOP_START_500_REVERT_500, SHAPE_500_TOP_START_500_REVERT_500, SHAPE_600_CENTER_START_500_REVERT_500, NO_SHAPE_500_TOP_START_500_CONTROL_500, NO_SHAPE_400_TOP_START_400_CONTROL_400, NO_SHAPE_400_TOP_START_CONTROL_400, SHAPE_400_VERTICAL_START_500_CONTROL_400, SHAPE_400_TOP_START_500_CONTROL_500, SHAPE_500_TOP_START_500_CONTROL_500, SHAPE_600_CENTER_START_500_CONTROL_500};
        }

        static {
            IconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconTitleSubtitleCellPreset(String str, int i11, c cVar) {
            this.preset = cVar;
        }

        @NotNull
        public static a<IconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static IconTitleSubtitleCellPreset valueOf(String str) {
            return (IconTitleSubtitleCellPreset) Enum.valueOf(IconTitleSubtitleCellPreset.class, str);
        }

        public static IconTitleSubtitleCellPreset[] values() {
            return (IconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final c getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTitleSubtitleCellDTO(IconTitleSubtitleCellPreset iconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO) {
        super(DsAtomsType.ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = iconTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.icon = iconDTO;
    }

    public static /* synthetic */ IconTitleSubtitleCellDTO copy$default(IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO, IconTitleSubtitleCellPreset iconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconTitleSubtitleCellPreset = iconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = iconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = iconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = iconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            iconDTO = iconTitleSubtitleCellDTO.icon;
        }
        IconDTO iconDTO2 = iconDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return iconTitleSubtitleCellDTO.copy(iconTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, iconDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final IconTitleSubtitleCellPreset getPreset() {
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
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final IconTitleSubtitleCellDTO copy(IconTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IconDTO icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IconTitleSubtitleCellDTO(preset, common, title, subtitle, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconTitleSubtitleCellDTO)) {
            return false;
        }
        IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO = (IconTitleSubtitleCellDTO) other;
        return this.preset == iconTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, iconTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, iconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, iconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.icon, iconTitleSubtitleCellDTO.icon);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.iconTitleSubtitleCV;
    }

    public final IconTitleSubtitleCellPreset getPreset() {
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
        IconTitleSubtitleCellPreset iconTitleSubtitleCellPreset = this.preset;
        int hashCode = (iconTitleSubtitleCellPreset == null ? 0 : iconTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        return hashCode2 + (iconDTO != null ? iconDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconTitleSubtitleCellPreset iconTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        StringBuilder sb2 = new StringBuilder("IconTitleSubtitleCellDTO(preset=");
        sb2.append(iconTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", icon=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        IconTitleSubtitleCellPreset iconTitleSubtitleCellPreset = this.preset;
        if (iconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconTitleSubtitleCellPreset.name());
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
        IconDTO iconDTO = this.icon;
        if (iconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iconDTO.writeToParcel(dest, flags);
        }
    }
}
