package ru.ozon.app.android.atoms.data.controls.button;

import D40.c;
import G.g;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002;<Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012Be\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0013Jk\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020%H\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJx\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020%J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020%HÖ\u0001J\t\u00105\u001a\u00020\tHÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020%R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\n\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0010\u0010\u001c¨\u0006="}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/atoms/data/controls/button/ButtonsDTO;", "size", "Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "styleType", "Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "buttonShape", "Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "icon", "", "isDisabled", "", "iconColor", "backgroundColor", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "isHoverDisabled", "<init>", "(Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)V", "(Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getSize", "()Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "getStyleType", "()Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getButtonShape", "()Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "getIcon", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIconColor", "getBackgroundColor", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "copy", "(Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "(Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Sizes", "IconButtonShape", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconButtonV3DTO extends ButtonsDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<IconButtonV3DTO> CREATOR = new Creator();
    private final String backgroundColor;

    @EnumNullFallback
    private final IconButtonShape buttonShape;
    private final CommonControlSettings common;

    @NotNull
    private final String icon;
    private final String iconColor;
    private final Boolean isDisabled;
    private final Boolean isHoverDisabled;

    @EnumNullFallback
    private final Sizes size;

    @EnumNullFallback
    private final ButtonV3DTO.StyleTypes styleType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconButtonV3DTO> {
        @Override // android.os.Parcelable.Creator
        public final IconButtonV3DTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            Sizes valueOf2 = parcel.readInt() == 0 ? null : Sizes.valueOf(parcel.readString());
            ButtonV3DTO.StyleTypes valueOf3 = parcel.readInt() == 0 ? null : ButtonV3DTO.StyleTypes.valueOf(parcel.readString());
            IconButtonShape valueOf4 = parcel.readInt() == 0 ? null : IconButtonShape.valueOf(parcel.readString());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z11 = false;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CommonControlSettings createFromParcel = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                bool = Boolean.valueOf(z11);
            }
            return new IconButtonV3DTO(valueOf2, valueOf3, valueOf4, readString, valueOf, readString2, readString3, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final IconButtonV3DTO[] newArray(int i11) {
            return new IconButtonV3DTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "", "<init>", "(Ljava/lang/String;I)V", "SHAPE_CIRCLE", "SHAPE_SQUARE", "SHAPE_SQUARE_FORCE", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconButtonShape {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconButtonShape[] $VALUES;
        public static final IconButtonShape SHAPE_CIRCLE = new IconButtonShape("SHAPE_CIRCLE", 0);
        public static final IconButtonShape SHAPE_SQUARE = new IconButtonShape("SHAPE_SQUARE", 1);
        public static final IconButtonShape SHAPE_SQUARE_FORCE = new IconButtonShape("SHAPE_SQUARE_FORCE", 2);

        private static final /* synthetic */ IconButtonShape[] $values() {
            return new IconButtonShape[]{SHAPE_CIRCLE, SHAPE_SQUARE, SHAPE_SQUARE_FORCE};
        }

        static {
            IconButtonShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconButtonShape(String str, int i11) {
        }

        @NotNull
        public static a<IconButtonShape> getEntries() {
            return $ENTRIES;
        }

        public static IconButtonShape valueOf(String str) {
            return (IconButtonShape) Enum.valueOf(IconButtonShape.class, str);
        }

        public static IconButtonShape[] values() {
            return (IconButtonShape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "", "size", "", "cornerRadius", "<init>", "(Ljava/lang/String;III)V", "getSize", "()I", "getCornerRadius", "SIZE_300", "SIZE_400", "SIZE_450", "SIZE_500", "SIZE_600", "SIZE_700", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Sizes[] $VALUES;
        public static final Sizes SIZE_300 = new Sizes("SIZE_300", 0, 24, 8);
        public static final Sizes SIZE_400 = new Sizes("SIZE_400", 1, 32, 10);
        public static final Sizes SIZE_450 = new Sizes("SIZE_450", 2, 40, 12);
        public static final Sizes SIZE_500 = new Sizes("SIZE_500", 3, 44, 12);
        public static final Sizes SIZE_600 = new Sizes("SIZE_600", 4, 56, 16);
        public static final Sizes SIZE_700 = new Sizes("SIZE_700", 5, 72, 20);
        private final int cornerRadius;
        private final int size;

        private static final /* synthetic */ Sizes[] $values() {
            return new Sizes[]{SIZE_300, SIZE_400, SIZE_450, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            Sizes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Sizes(String str, int i11, int i12, int i13) {
            this.size = i12;
            this.cornerRadius = i13;
        }

        @NotNull
        public static a<Sizes> getEntries() {
            return $ENTRIES;
        }

        public static Sizes valueOf(String str) {
            return (Sizes) Enum.valueOf(Sizes.class, str);
        }

        public static Sizes[] values() {
            return (Sizes[]) $VALUES.clone();
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getSize() {
            return this.size;
        }
    }

    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Sizes.SIZE_400 : sizes, (i11 & 2) != 0 ? ButtonV3DTO.StyleTypes.ACTION_PRIMARY : styleTypes, (i11 & 4) != 0 ? IconButtonShape.SHAPE_SQUARE : iconButtonShape, str, (i11 & 16) != 0 ? Boolean.FALSE : bool, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings, (i11 & 256) != 0 ? Boolean.FALSE : bool2);
    }

    public static /* synthetic */ IconButtonV3DTO copy$default(IconButtonV3DTO iconButtonV3DTO, Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sizes = iconButtonV3DTO.size;
        }
        if ((i11 & 2) != 0) {
            styleTypes = iconButtonV3DTO.styleType;
        }
        if ((i11 & 4) != 0) {
            iconButtonShape = iconButtonV3DTO.buttonShape;
        }
        if ((i11 & 8) != 0) {
            str = iconButtonV3DTO.icon;
        }
        if ((i11 & 16) != 0) {
            bool = iconButtonV3DTO.isDisabled;
        }
        if ((i11 & 32) != 0) {
            str2 = iconButtonV3DTO.iconColor;
        }
        if ((i11 & 64) != 0) {
            str3 = iconButtonV3DTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = iconButtonV3DTO.common;
        }
        if ((i11 & 256) != 0) {
            bool2 = iconButtonV3DTO.isHoverDisabled;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Boolean bool3 = bool2;
        String str4 = str2;
        String str5 = str3;
        Boolean bool4 = bool;
        IconButtonShape iconButtonShape2 = iconButtonShape;
        return iconButtonV3DTO.copy(sizes, styleTypes, iconButtonShape2, str, bool4, str4, str5, commonControlSettings2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Sizes getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO.StyleTypes getStyleType() {
        return this.styleType;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonShape getButtonShape() {
        return this.buttonShape;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsHoverDisabled() {
        return this.isHoverDisabled;
    }

    @NotNull
    public final IconButtonV3DTO copy(Sizes size, ButtonV3DTO.StyleTypes styleType, IconButtonShape buttonShape, @NotNull String icon, Boolean isDisabled, String iconColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new IconButtonV3DTO(size, styleType, buttonShape, icon, isDisabled, iconColor, backgroundColor, common, isHoverDisabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonV3DTO)) {
            return false;
        }
        IconButtonV3DTO iconButtonV3DTO = (IconButtonV3DTO) other;
        return this.size == iconButtonV3DTO.size && this.styleType == iconButtonV3DTO.styleType && this.buttonShape == iconButtonV3DTO.buttonShape && Intrinsics.d(this.icon, iconButtonV3DTO.icon) && Intrinsics.d(this.isDisabled, iconButtonV3DTO.isDisabled) && Intrinsics.d(this.iconColor, iconButtonV3DTO.iconColor) && Intrinsics.d(this.backgroundColor, iconButtonV3DTO.backgroundColor) && Intrinsics.d(this.common, iconButtonV3DTO.common) && Intrinsics.d(this.isHoverDisabled, iconButtonV3DTO.isHoverDisabled);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconButtonShape getButtonShape() {
        return this.buttonShape;
    }

    @Override // ru.ozon.app.android.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.iconButtonV3;
    }

    public final Sizes getSize() {
        return this.size;
    }

    public final ButtonV3DTO.StyleTypes getStyleType() {
        return this.styleType;
    }

    public int hashCode() {
        Sizes sizes = this.size;
        int hashCode = (sizes == null ? 0 : sizes.hashCode()) * 31;
        ButtonV3DTO.StyleTypes styleTypes = this.styleType;
        int hashCode2 = (hashCode + (styleTypes == null ? 0 : styleTypes.hashCode())) * 31;
        IconButtonShape iconButtonShape = this.buttonShape;
        int a11 = g.a((hashCode2 + (iconButtonShape == null ? 0 : iconButtonShape.hashCode())) * 31, 31, this.icon);
        Boolean bool = this.isDisabled;
        int hashCode3 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.iconColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Boolean bool2 = this.isHoverDisabled;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    public final Boolean isHoverDisabled() {
        return this.isHoverDisabled;
    }

    @NotNull
    public String toString() {
        Sizes sizes = this.size;
        ButtonV3DTO.StyleTypes styleTypes = this.styleType;
        IconButtonShape iconButtonShape = this.buttonShape;
        String str = this.icon;
        Boolean bool = this.isDisabled;
        String str2 = this.iconColor;
        String str3 = this.backgroundColor;
        CommonControlSettings commonControlSettings = this.common;
        Boolean bool2 = this.isHoverDisabled;
        StringBuilder sb2 = new StringBuilder("IconButtonV3DTO(size=");
        sb2.append(sizes);
        sb2.append(", styleType=");
        sb2.append(styleTypes);
        sb2.append(", buttonShape=");
        sb2.append(iconButtonShape);
        sb2.append(", icon=");
        sb2.append(str);
        sb2.append(", isDisabled=");
        HY.b.c(bool, ", iconColor=", str2, ", backgroundColor=", sb2);
        sb2.append(str3);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", isHoverDisabled=");
        return D3.g.d(sb2, bool2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Sizes sizes = this.size;
        if (sizes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizes.name());
        }
        ButtonV3DTO.StyleTypes styleTypes = this.styleType;
        if (styleTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleTypes.name());
        }
        IconButtonShape iconButtonShape = this.buttonShape;
        if (iconButtonShape == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconButtonShape.name());
        }
        dest.writeString(this.icon);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.iconColor);
        dest.writeString(this.backgroundColor);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.isHoverDisabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
    }

    public static /* synthetic */ IconButtonV3DTO copy$default(IconButtonV3DTO iconButtonV3DTO, Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sizes = iconButtonV3DTO.size;
        }
        if ((i11 & 2) != 0) {
            styleTypes = iconButtonV3DTO.styleType;
        }
        if ((i11 & 4) != 0) {
            iconButtonShape = iconButtonV3DTO.buttonShape;
        }
        if ((i11 & 8) != 0) {
            str = iconButtonV3DTO.icon;
        }
        if ((i11 & 16) != 0) {
            bool = iconButtonV3DTO.isDisabled;
        }
        if ((i11 & 32) != 0) {
            str2 = iconButtonV3DTO.iconColor;
        }
        if ((i11 & 64) != 0) {
            str3 = iconButtonV3DTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = iconButtonV3DTO.getCommon();
        }
        String str4 = str3;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Boolean bool2 = bool;
        String str5 = str2;
        return iconButtonV3DTO.copy(sizes, styleTypes, iconButtonShape, str, bool2, str5, str4, commonControlSettings2);
    }

    @InterfaceC3999a
    public final /* synthetic */ IconButtonV3DTO copy(Sizes size, ButtonV3DTO.StyleTypes styleType, IconButtonShape buttonShape, String icon, Boolean isDisabled, String iconColor, String backgroundColor, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return copy(size, styleType, buttonShape, icon, isDisabled, iconColor, backgroundColor, common, this.isHoverDisabled);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, @NotNull String icon, Boolean bool, String str, String str2, CommonControlSettings commonControlSettings, Boolean bool2) {
        super(DsAtomsType.ICON_BUTTON_V3, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.size = sizes;
        this.styleType = styleTypes;
        this.buttonShape = iconButtonShape;
        this.icon = icon;
        this.isDisabled = bool;
        this.iconColor = str;
        this.backgroundColor = str2;
        this.common = commonControlSettings;
        this.isHoverDisabled = bool2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IconButtonV3DTO(ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO.Sizes r2, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes r3, ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO.IconButtonShape r4, java.lang.String r5, java.lang.Boolean r6, java.lang.String r7, java.lang.String r8, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO$Sizes r2 = ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO.Sizes.SIZE_400
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lc
            ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes r3 = ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO.StyleTypes.ACTION_PRIMARY
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L12
            ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO$IconButtonShape r4 = ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE
        L12:
            r11 = r10 & 16
            if (r11 == 0) goto L18
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L18:
            r11 = r10 & 32
            r0 = 0
            if (r11 == 0) goto L1e
            r7 = r0
        L1e:
            r11 = r10 & 64
            if (r11 == 0) goto L23
            r8 = r0
        L23:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L31
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3a
        L31:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO.<init>(ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO$Sizes, ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO$StyleTypes, ru.ozon.app.android.atoms.data.controls.button.IconButtonV3DTO$IconButtonShape, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, @NotNull String icon, Boolean bool, String str, String str2, CommonControlSettings commonControlSettings) {
        this(sizes, styleTypes, iconButtonShape, icon, bool, str, str2, commonControlSettings, Boolean.FALSE);
        Intrinsics.checkNotNullParameter(icon, "icon");
    }
}
