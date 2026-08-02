package ru.ozon.app.android.atoms.data.controls.chip;

import C.o0;
import Nj.EnumC3673a;
import Oj.EnumC3708a;
import Oj.EnumC3709b;
import Oj.c;
import Oj.e;
import Oj.f;
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
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u000256B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!JJ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010\u0010J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010!¨\u00067"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "Lru/ozon/app/android/atoms/data/controls/chip/Style;", "style", "LNj/a;", "state", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "common", "", "context", "<init>", "(Lru/ozon/app/android/atoms/data/controls/chip/Style;LNj/a;Lru/ozon/app/android/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "", "getItemType", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()Lru/ozon/app/android/atoms/data/controls/chip/Style;", "component2", "()LNj/a;", "component3", "()Lru/ozon/app/android/atoms/data/icon/IconDTO;", "component4", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "component5", "()Ljava/lang/String;", "copy", "(Lru/ozon/app/android/atoms/data/controls/chip/Style;LNj/a;Lru/ozon/app/android/atoms/data/icon/IconDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/controls/chip/Style;", "getStyle", "LNj/a;", "getState", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "getIcon", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getCommon", "Ljava/lang/String;", "getContext", "IconSettings", "IconChipSize", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconChipDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconChipDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;

    @NotNull
    private final IconDTO icon;

    @EnumNullFallback
    private final EnumC3673a state;

    @EnumNullFallback
    private final Style style;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconChipDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconChipDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IconChipDTO(parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EnumC3673a.valueOf(parcel.readString()), IconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconChipDTO[] newArray(int i11) {
            return new IconChipDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO$IconChipSize;", "", "LOj/e;", "settings", "Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO$IconSettings;", "iconSettings", "<init>", "(Ljava/lang/String;ILOj/e;Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO$IconSettings;)V", "LOj/e;", "getSettings", "()LOj/e;", "Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO$IconSettings;", "getIconSettings", "()Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO$IconSettings;", "SIZE_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconChipSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconChipSize[] $VALUES;
        public static final IconChipSize SIZE_500;

        @NotNull
        private final IconSettings iconSettings;

        @NotNull
        private final e settings;

        private static final /* synthetic */ IconChipSize[] $values() {
            return new IconChipSize[]{SIZE_500};
        }

        static {
            f fVar = f.SIZE_600;
            EnumC3709b enumC3709b = EnumC3709b.PADDING_200;
            SIZE_500 = new IconChipSize("SIZE_500", 0, new e(fVar, enumC3709b, enumC3709b, c.a(), EnumC3708a.MARGIN_NONE), new IconSettings(IconDTO.IconSize.SIZE_500, IconDTO.IconShape.CIRCLE));
            IconChipSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconChipSize(String str, int i11, e eVar, IconSettings iconSettings) {
            this.settings = eVar;
            this.iconSettings = iconSettings;
        }

        @NotNull
        public static a<IconChipSize> getEntries() {
            return $ENTRIES;
        }

        public static IconChipSize valueOf(String str) {
            return (IconChipSize) Enum.valueOf(IconChipSize.class, str);
        }

        public static IconChipSize[] values() {
            return (IconChipSize[]) $VALUES.clone();
        }

        @NotNull
        public final IconSettings getIconSettings() {
            return this.iconSettings;
        }

        @NotNull
        public final e getSettings() {
            return this.settings;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/IconChipDTO$IconSettings;", "", "Lru/ozon/app/android/atoms/data/icon/IconDTO$IconSize;", "iconSize", "Lru/ozon/app/android/atoms/data/icon/IconDTO$IconShape;", "iconShape", "<init>", "(Lru/ozon/app/android/atoms/data/icon/IconDTO$IconSize;Lru/ozon/app/android/atoms/data/icon/IconDTO$IconShape;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/icon/IconDTO$IconSize;", "getIconSize", "()Lru/ozon/app/android/atoms/data/icon/IconDTO$IconSize;", "Lru/ozon/app/android/atoms/data/icon/IconDTO$IconShape;", "getIconShape", "()Lru/ozon/app/android/atoms/data/icon/IconDTO$IconShape;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconSettings {

        @NotNull
        private final IconDTO.IconShape iconShape;

        @NotNull
        private final IconDTO.IconSize iconSize;

        public IconSettings(@NotNull IconDTO.IconSize iconSize, @NotNull IconDTO.IconShape iconShape) {
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            Intrinsics.checkNotNullParameter(iconShape, "iconShape");
            this.iconSize = iconSize;
            this.iconShape = iconShape;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconSettings)) {
                return false;
            }
            IconSettings iconSettings = (IconSettings) other;
            return this.iconSize == iconSettings.iconSize && this.iconShape == iconSettings.iconShape;
        }

        public int hashCode() {
            return this.iconShape.hashCode() + (this.iconSize.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "IconSettings(iconSize=" + this.iconSize + ", iconShape=" + this.iconShape + ")";
        }
    }

    public /* synthetic */ IconChipDTO(Style style, EnumC3673a enumC3673a, IconDTO iconDTO, CommonControlSettings commonControlSettings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Style.ASPECT_PRIMARY : style, (i11 & 2) != 0 ? EnumC3673a.ENABLED : enumC3673a, iconDTO, commonControlSettings, (i11 & 16) != 0 ? null : str);
    }

    public static /* synthetic */ IconChipDTO copy$default(IconChipDTO iconChipDTO, Style style, EnumC3673a enumC3673a, IconDTO iconDTO, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            style = iconChipDTO.style;
        }
        if ((i11 & 2) != 0) {
            enumC3673a = iconChipDTO.state;
        }
        if ((i11 & 4) != 0) {
            iconDTO = iconChipDTO.icon;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = iconChipDTO.common;
        }
        if ((i11 & 16) != 0) {
            str = iconChipDTO.context;
        }
        String str2 = str;
        IconDTO iconDTO2 = iconDTO;
        return iconChipDTO.copy(style, enumC3673a, iconDTO2, commonControlSettings, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final EnumC3673a getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final IconChipDTO copy(Style style, EnumC3673a state, @NotNull IconDTO icon, CommonControlSettings common, String context) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new IconChipDTO(style, state, icon, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconChipDTO)) {
            return false;
        }
        IconChipDTO iconChipDTO = (IconChipDTO) other;
        return this.style == iconChipDTO.style && this.state == iconChipDTO.state && Intrinsics.d(this.icon, iconChipDTO.icon) && Intrinsics.d(this.common, iconChipDTO.common) && Intrinsics.d(this.context, iconChipDTO.context);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.iconChip;
    }

    public final EnumC3673a getState() {
        return this.state;
    }

    public final Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        Style style = this.style;
        int hashCode = (style == null ? 0 : style.hashCode()) * 31;
        EnumC3673a enumC3673a = this.state;
        int hashCode2 = (this.icon.hashCode() + ((hashCode + (enumC3673a == null ? 0 : enumC3673a.hashCode())) * 31)) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.context;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Style style = this.style;
        EnumC3673a enumC3673a = this.state;
        IconDTO iconDTO = this.icon;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.context;
        StringBuilder sb2 = new StringBuilder("IconChipDTO(style=");
        sb2.append(style);
        sb2.append(", state=");
        sb2.append(enumC3673a);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", context=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        EnumC3673a enumC3673a = this.state;
        if (enumC3673a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC3673a.name());
        }
        this.icon.writeToParcel(dest, flags);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconChipDTO(Style style, EnumC3673a enumC3673a, @NotNull IconDTO icon, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.ICON_CHIP, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.style = style;
        this.state = enumC3673a;
        this.icon = icon;
        this.common = commonControlSettings;
        this.context = str;
    }
}
