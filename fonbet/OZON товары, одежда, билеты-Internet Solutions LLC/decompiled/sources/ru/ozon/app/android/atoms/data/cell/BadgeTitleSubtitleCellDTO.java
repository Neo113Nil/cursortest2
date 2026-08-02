package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import fh.C6564a;
import fh.C6565b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0017HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/BadgeTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/BadgeTitleSubtitleCellDTO$BadgeTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "badge", "Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/BadgeTitleSubtitleCellDTO$BadgeTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/BadgeTitleSubtitleCellDTO$BadgeTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getBadge", "()Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BadgeTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BadgeTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BadgeTitleSubtitleCellDTO> CREATOR = new Creator();
    private final BadgeDTO badge;
    private final CommonCellSettings common;

    @EnumNullFallback
    private final BadgeTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/BadgeTitleSubtitleCellDTO$BadgeTitleSubtitleCellPreset;", "", "Lfh/a;", "preset", "<init>", "(Ljava/lang/String;ILfh/a;)V", "Lfh/a;", "getPreset", "()Lfh/a;", "CENTER_END_500_DEFAULT_500", "CENTER_END_500_CONTROL_500", "CENTER_END_400_DEFAULT_400", "CENTER_END_400_CONTROL_400", "CENTER_START_500_DEFAULT_500", "CENTER_START_500_CONTROL_500", "CENTER_START_400_DEFAULT_400", "CENTER_START_400_CONTROL_400", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgeTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final C6564a preset;
        public static final BadgeTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500 = new BadgeTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, C6565b.d());
        public static final BadgeTitleSubtitleCellPreset CENTER_END_500_CONTROL_500 = new BadgeTitleSubtitleCellPreset("CENTER_END_500_CONTROL_500", 1, C6565b.c());
        public static final BadgeTitleSubtitleCellPreset CENTER_END_400_DEFAULT_400 = new BadgeTitleSubtitleCellPreset("CENTER_END_400_DEFAULT_400", 2, C6565b.b());
        public static final BadgeTitleSubtitleCellPreset CENTER_END_400_CONTROL_400 = new BadgeTitleSubtitleCellPreset("CENTER_END_400_CONTROL_400", 3, C6565b.a());
        public static final BadgeTitleSubtitleCellPreset CENTER_START_500_DEFAULT_500 = new BadgeTitleSubtitleCellPreset("CENTER_START_500_DEFAULT_500", 4, C6565b.h());
        public static final BadgeTitleSubtitleCellPreset CENTER_START_500_CONTROL_500 = new BadgeTitleSubtitleCellPreset("CENTER_START_500_CONTROL_500", 5, C6565b.g());
        public static final BadgeTitleSubtitleCellPreset CENTER_START_400_DEFAULT_400 = new BadgeTitleSubtitleCellPreset("CENTER_START_400_DEFAULT_400", 6, C6565b.f());
        public static final BadgeTitleSubtitleCellPreset CENTER_START_400_CONTROL_400 = new BadgeTitleSubtitleCellPreset("CENTER_START_400_CONTROL_400", 7, C6565b.e());

        private static final /* synthetic */ BadgeTitleSubtitleCellPreset[] $values() {
            return new BadgeTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500, CENTER_END_500_CONTROL_500, CENTER_END_400_DEFAULT_400, CENTER_END_400_CONTROL_400, CENTER_START_500_DEFAULT_500, CENTER_START_500_CONTROL_500, CENTER_START_400_DEFAULT_400, CENTER_START_400_CONTROL_400};
        }

        static {
            BadgeTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BadgeTitleSubtitleCellPreset(String str, int i11, C6564a c6564a) {
            this.preset = c6564a;
        }

        @NotNull
        public static a<BadgeTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static BadgeTitleSubtitleCellPreset valueOf(String str) {
            return (BadgeTitleSubtitleCellPreset) Enum.valueOf(BadgeTitleSubtitleCellPreset.class, str);
        }

        public static BadgeTitleSubtitleCellPreset[] values() {
            return (BadgeTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C6564a getPreset() {
            return this.preset;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final BadgeTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BadgeTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : BadgeTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new BadgeTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? BadgeDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeTitleSubtitleCellDTO[] newArray(int i11) {
            return new BadgeTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTitleSubtitleCellDTO(BadgeTitleSubtitleCellPreset badgeTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, BadgeDTO badgeDTO) {
        super(DsAtomsType.BADGE_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = badgeTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ BadgeTitleSubtitleCellDTO copy$default(BadgeTitleSubtitleCellDTO badgeTitleSubtitleCellDTO, BadgeTitleSubtitleCellPreset badgeTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeTitleSubtitleCellPreset = badgeTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = badgeTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = badgeTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = badgeTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = badgeTitleSubtitleCellDTO.badge;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return badgeTitleSubtitleCellDTO.copy(badgeTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO3, commonAtomLabelDTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final BadgeTitleSubtitleCellPreset getPreset() {
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
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final BadgeTitleSubtitleCellDTO copy(BadgeTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BadgeTitleSubtitleCellDTO(preset, common, title, subtitle, badge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeTitleSubtitleCellDTO)) {
            return false;
        }
        BadgeTitleSubtitleCellDTO badgeTitleSubtitleCellDTO = (BadgeTitleSubtitleCellDTO) other;
        return this.preset == badgeTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, badgeTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, badgeTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, badgeTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.badge, badgeTitleSubtitleCellDTO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.badgeTitleSubtitleCV;
    }

    public final BadgeTitleSubtitleCellPreset getPreset() {
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
        BadgeTitleSubtitleCellPreset badgeTitleSubtitleCellPreset = this.preset;
        int hashCode = (badgeTitleSubtitleCellPreset == null ? 0 : badgeTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BadgeTitleSubtitleCellPreset badgeTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder sb2 = new StringBuilder("BadgeTitleSubtitleCellDTO(preset=");
        sb2.append(badgeTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", badge=");
        sb2.append(badgeDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        BadgeTitleSubtitleCellPreset badgeTitleSubtitleCellPreset = this.preset;
        if (badgeTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(badgeTitleSubtitleCellPreset.name());
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
        BadgeDTO badgeDTO = this.badge;
        if (badgeDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeDTO.writeToParcel(dest, flags);
        }
    }
}
