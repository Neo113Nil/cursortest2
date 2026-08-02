package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import eh.C6365a;
import eh.C6366b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/BadgeIconTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/BadgeIconTitleSubtitleCellDTO$BadgeIconTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "icon", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "badge", "Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/BadgeIconTitleSubtitleCellDTO$BadgeIconTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/BadgeIconTitleSubtitleCellDTO$BadgeIconTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIcon", "()Lru/ozon/app/android/atoms/data/icon/IconDTO;", "getBadge", "()Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BadgeIconTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BadgeIconTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BadgeIconTitleSubtitleCellDTO> CREATOR = new Creator();
    private final BadgeDTO badge;
    private final CommonCellSettings common;
    private final IconDTO icon;

    @EnumNullFallback
    private final BadgeIconTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/BadgeIconTitleSubtitleCellDTO$BadgeIconTitleSubtitleCellPreset;", "", "Leh/a;", "preset", "<init>", "(Ljava/lang/String;ILeh/a;)V", "Leh/a;", "getPreset", "()Leh/a;", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", "CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", "CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeIconTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgeIconTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final C6365a preset;
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500", 0, C6366b.d());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500", 1, C6366b.c());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500", 2, C6366b.f());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500", 3, C6366b.e());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500", 4, C6366b.h());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500", 5, C6366b.g());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500", 6, C6366b.j());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500", 7, C6366b.i());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400", 8, C6366b.b());
        public static final BadgeIconTitleSubtitleCellPreset CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400 = new BadgeIconTitleSubtitleCellPreset("CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400", 9, C6366b.a());

        private static final /* synthetic */ BadgeIconTitleSubtitleCellPreset[] $values() {
            return new BadgeIconTitleSubtitleCellPreset[]{CENTER_END_500_NO_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_NO_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_400_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_400_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_500_TOP_START_500_DEFAULT_500, CENTER_END_500_SHAPE_500_TOP_START_500_CONTROL_500, CENTER_END_500_SHAPE_600_CENTER_START_500_DEFAULT_500, CENTER_END_500_SHAPE_600_CENTER_START_500_CONTROL_500, CENTER_END_400_NO_SHAPE_400_TOP_START_400_DEFAULT_400, CENTER_END_400_NO_SHAPE_400_TOP_START_400_CONTROL_400};
        }

        static {
            BadgeIconTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BadgeIconTitleSubtitleCellPreset(String str, int i11, C6365a c6365a) {
            this.preset = c6365a;
        }

        @NotNull
        public static a<BadgeIconTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static BadgeIconTitleSubtitleCellPreset valueOf(String str) {
            return (BadgeIconTitleSubtitleCellPreset) Enum.valueOf(BadgeIconTitleSubtitleCellPreset.class, str);
        }

        public static BadgeIconTitleSubtitleCellPreset[] values() {
            return (BadgeIconTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C6365a getPreset() {
            return this.preset;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeIconTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final BadgeIconTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BadgeIconTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : BadgeIconTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new BadgeIconTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BadgeDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeIconTitleSubtitleCellDTO[] newArray(int i11) {
            return new BadgeIconTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeIconTitleSubtitleCellDTO(BadgeIconTitleSubtitleCellPreset badgeIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IconDTO iconDTO, BadgeDTO badgeDTO) {
        super(DsAtomsType.BADGE_ICON_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = badgeIconTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.icon = iconDTO;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ BadgeIconTitleSubtitleCellDTO copy$default(BadgeIconTitleSubtitleCellDTO badgeIconTitleSubtitleCellDTO, BadgeIconTitleSubtitleCellPreset badgeIconTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IconDTO iconDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeIconTitleSubtitleCellPreset = badgeIconTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = badgeIconTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = badgeIconTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = badgeIconTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            iconDTO = badgeIconTitleSubtitleCellDTO.icon;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = badgeIconTitleSubtitleCellDTO.badge;
        }
        IconDTO iconDTO2 = iconDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        return badgeIconTitleSubtitleCellDTO.copy(badgeIconTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2, iconDTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeIconTitleSubtitleCellPreset getPreset() {
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

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final BadgeIconTitleSubtitleCellDTO copy(BadgeIconTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IconDTO icon, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BadgeIconTitleSubtitleCellDTO(preset, common, title, subtitle, icon, badge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeIconTitleSubtitleCellDTO)) {
            return false;
        }
        BadgeIconTitleSubtitleCellDTO badgeIconTitleSubtitleCellDTO = (BadgeIconTitleSubtitleCellDTO) other;
        return this.preset == badgeIconTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, badgeIconTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, badgeIconTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, badgeIconTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.icon, badgeIconTitleSubtitleCellDTO.icon) && Intrinsics.d(this.badge, badgeIconTitleSubtitleCellDTO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
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
        return R.id.badgeIconTitleSubtitleCV;
    }

    public final BadgeIconTitleSubtitleCellPreset getPreset() {
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
        BadgeIconTitleSubtitleCellPreset badgeIconTitleSubtitleCellPreset = this.preset;
        int hashCode = (badgeIconTitleSubtitleCellPreset == null ? 0 : badgeIconTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BadgeIconTitleSubtitleCellPreset badgeIconTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder sb2 = new StringBuilder("BadgeIconTitleSubtitleCellDTO(preset=");
        sb2.append(badgeIconTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", icon=");
        sb2.append(iconDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        BadgeIconTitleSubtitleCellPreset badgeIconTitleSubtitleCellPreset = this.preset;
        if (badgeIconTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(badgeIconTitleSubtitleCellPreset.name());
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
        BadgeDTO badgeDTO = this.badge;
        if (badgeDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeDTO.writeToParcel(dest, flags);
        }
    }
}
