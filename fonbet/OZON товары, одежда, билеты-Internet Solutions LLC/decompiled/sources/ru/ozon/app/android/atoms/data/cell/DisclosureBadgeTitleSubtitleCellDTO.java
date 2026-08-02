package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oh.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020\u001bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/DisclosureBadgeTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "preset", "Lru/ozon/app/android/atoms/data/cell/DisclosureBadgeTitleSubtitleCellDTO$DisclosureBadgeTitleSubtitleCellPreset;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "disclosureIcon", "Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "badge", "Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/DisclosureBadgeTitleSubtitleCellDTO$DisclosureBadgeTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;)V", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/DisclosureBadgeTitleSubtitleCellDTO$DisclosureBadgeTitleSubtitleCellPreset;", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getDisclosureIcon", "()Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "getBadge", "()Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DisclosureBadgeTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclosureBadgeTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DisclosureBadgeTitleSubtitleCellDTO> CREATOR = new Creator();
    private final BadgeDTO badge;
    private final CommonCellSettings common;
    private final CommonAtomIconDTO disclosureIcon;

    @EnumNullFallback
    private final DisclosureBadgeTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisclosureBadgeTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final DisclosureBadgeTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisclosureBadgeTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : DisclosureBadgeTitleSubtitleCellPreset.valueOf(parcel.readString());
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new DisclosureBadgeTitleSubtitleCellDTO(valueOf, createFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BadgeDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclosureBadgeTitleSubtitleCellDTO[] newArray(int i11) {
            return new DisclosureBadgeTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/DisclosureBadgeTitleSubtitleCellDTO$DisclosureBadgeTitleSubtitleCellPreset;", "", "Loh/a;", "preset", "<init>", "(Ljava/lang/String;ILoh/a;)V", "Loh/a;", "getPreset", "()Loh/a;", "CENTER_END_500_DEFAULT_500", "CENTER_END_500_CONTROL_500", "CENTER_END_400_DEFAULT_400", "CENTER_END_400_CONTROL_400", "CENTER_START_500_DEFAULT_500", "CENTER_START_500_CONTROL_500", "CENTER_START_400_DEFAULT_400", "CENTER_START_400_CONTROL_400", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisclosureBadgeTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DisclosureBadgeTitleSubtitleCellPreset[] $VALUES;

        @NotNull
        private final oh.a preset;
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_END_500_DEFAULT_500 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_END_500_DEFAULT_500", 0, b.d());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_END_500_CONTROL_500 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_END_500_CONTROL_500", 1, b.c());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_END_400_DEFAULT_400 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_END_400_DEFAULT_400", 2, b.b());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_END_400_CONTROL_400 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_END_400_CONTROL_400", 3, b.a());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_START_500_DEFAULT_500 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_START_500_DEFAULT_500", 4, b.h());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_START_500_CONTROL_500 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_START_500_CONTROL_500", 5, b.g());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_START_400_DEFAULT_400 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_START_400_DEFAULT_400", 6, b.f());
        public static final DisclosureBadgeTitleSubtitleCellPreset CENTER_START_400_CONTROL_400 = new DisclosureBadgeTitleSubtitleCellPreset("CENTER_START_400_CONTROL_400", 7, b.e());

        private static final /* synthetic */ DisclosureBadgeTitleSubtitleCellPreset[] $values() {
            return new DisclosureBadgeTitleSubtitleCellPreset[]{CENTER_END_500_DEFAULT_500, CENTER_END_500_CONTROL_500, CENTER_END_400_DEFAULT_400, CENTER_END_400_CONTROL_400, CENTER_START_500_DEFAULT_500, CENTER_START_500_CONTROL_500, CENTER_START_400_DEFAULT_400, CENTER_START_400_CONTROL_400};
        }

        static {
            DisclosureBadgeTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private DisclosureBadgeTitleSubtitleCellPreset(String str, int i11, oh.a aVar) {
            this.preset = aVar;
        }

        @NotNull
        public static a<DisclosureBadgeTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static DisclosureBadgeTitleSubtitleCellPreset valueOf(String str) {
            return (DisclosureBadgeTitleSubtitleCellPreset) Enum.valueOf(DisclosureBadgeTitleSubtitleCellPreset.class, str);
        }

        public static DisclosureBadgeTitleSubtitleCellPreset[] values() {
            return (DisclosureBadgeTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final oh.a getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureBadgeTitleSubtitleCellDTO(DisclosureBadgeTitleSubtitleCellPreset disclosureBadgeTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomIconDTO commonAtomIconDTO, BadgeDTO badgeDTO) {
        super(DsAtomsType.DISCLOSURE_BADGE_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = disclosureBadgeTitleSubtitleCellPreset;
        this.common = commonCellSettings;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.disclosureIcon = commonAtomIconDTO;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ DisclosureBadgeTitleSubtitleCellDTO copy$default(DisclosureBadgeTitleSubtitleCellDTO disclosureBadgeTitleSubtitleCellDTO, DisclosureBadgeTitleSubtitleCellPreset disclosureBadgeTitleSubtitleCellPreset, CommonCellSettings commonCellSettings, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, CommonAtomIconDTO commonAtomIconDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclosureBadgeTitleSubtitleCellPreset = disclosureBadgeTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 2) != 0) {
            commonCellSettings = disclosureBadgeTitleSubtitleCellDTO.common;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = disclosureBadgeTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = disclosureBadgeTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = disclosureBadgeTitleSubtitleCellDTO.disclosureIcon;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = disclosureBadgeTitleSubtitleCellDTO.badge;
        }
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        return disclosureBadgeTitleSubtitleCellDTO.copy(disclosureBadgeTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2, commonAtomIconDTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclosureBadgeTitleSubtitleCellPreset getPreset() {
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
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final DisclosureBadgeTitleSubtitleCellDTO copy(DisclosureBadgeTitleSubtitleCellPreset preset, CommonCellSettings common, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, CommonAtomIconDTO disclosureIcon, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DisclosureBadgeTitleSubtitleCellDTO(preset, common, title, subtitle, disclosureIcon, badge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureBadgeTitleSubtitleCellDTO)) {
            return false;
        }
        DisclosureBadgeTitleSubtitleCellDTO disclosureBadgeTitleSubtitleCellDTO = (DisclosureBadgeTitleSubtitleCellDTO) other;
        return this.preset == disclosureBadgeTitleSubtitleCellDTO.preset && Intrinsics.d(this.common, disclosureBadgeTitleSubtitleCellDTO.common) && Intrinsics.d(this.title, disclosureBadgeTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, disclosureBadgeTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.disclosureIcon, disclosureBadgeTitleSubtitleCellDTO.disclosureIcon) && Intrinsics.d(this.badge, disclosureBadgeTitleSubtitleCellDTO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getDisclosureIcon() {
        return this.disclosureIcon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.disclosureBadgeTitleSubtitleCV;
    }

    public final DisclosureBadgeTitleSubtitleCellPreset getPreset() {
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
        DisclosureBadgeTitleSubtitleCellPreset disclosureBadgeTitleSubtitleCellPreset = this.preset;
        int hashCode = (disclosureBadgeTitleSubtitleCellPreset == null ? 0 : disclosureBadgeTitleSubtitleCellPreset.hashCode()) * 31;
        CommonCellSettings commonCellSettings = this.common;
        int c11 = Tl.a.c(this.title, (hashCode + (commonCellSettings == null ? 0 : commonCellSettings.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        int hashCode3 = (hashCode2 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureBadgeTitleSubtitleCellPreset disclosureBadgeTitleSubtitleCellPreset = this.preset;
        CommonCellSettings commonCellSettings = this.common;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        CommonAtomIconDTO commonAtomIconDTO = this.disclosureIcon;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder sb2 = new StringBuilder("DisclosureBadgeTitleSubtitleCellDTO(preset=");
        sb2.append(disclosureBadgeTitleSubtitleCellPreset);
        sb2.append(", common=");
        sb2.append(commonCellSettings);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", disclosureIcon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DisclosureBadgeTitleSubtitleCellPreset disclosureBadgeTitleSubtitleCellPreset = this.preset;
        if (disclosureBadgeTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(disclosureBadgeTitleSubtitleCellPreset.name());
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
        BadgeDTO badgeDTO = this.badge;
        if (badgeDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeDTO.writeToParcel(dest, flags);
        }
    }
}
