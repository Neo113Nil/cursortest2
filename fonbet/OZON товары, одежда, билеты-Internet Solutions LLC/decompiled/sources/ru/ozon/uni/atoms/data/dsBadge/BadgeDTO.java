package ru.ozon.uni.atoms.data.dsBadge;

import C.o0;
import D40.c;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.core.UniGradient;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005NOPQRB\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u00101\u001a\u000202H\u0016J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u009e\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u000202J\u0013\u0010D\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u000202HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u000202R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010!¨\u0006S"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "leftIcon", "size", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "style", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "customBadgeStyle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "context", "hideDisclosure", "", "styleType", "straightCorners", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "a11yInfo", "Lru/ozon/uni/atoms/data/common/A11yInfo;", "round", "Lru/ozon/uni/atoms/data/common/Rounds;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;Lru/ozon/uni/atoms/data/common/A11yInfo;Lru/ozon/uni/atoms/data/common/Rounds;)V", "getText", "()Ljava/lang/String;", "getLeftIcon", "getSize", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "getStyle$annotations", "()V", "getStyle", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "getCustomBadgeStyle", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getContext", "getHideDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStyleType", "getStraightCorners", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "getA11yInfo", "()Lru/ozon/uni/atoms/data/common/A11yInfo;", "getRound", "()Lru/ozon/uni/atoms/data/common/Rounds;", "getItemType", "", "badgeStyle", "getBadgeStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;Lru/ozon/uni/atoms/data/common/A11yInfo;Lru/ozon/uni/atoms/data/common/Rounds;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BadgeSize", "Style", "CustomStyle", "CustomBackground", "StraightCorners", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BadgeDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<BadgeDTO> CREATOR = new Creator();
    private final A11yInfo a11yInfo;
    private final CommonControlSettings common;
    private final String context;
    private final CustomStyle customBadgeStyle;
    private final Boolean hideDisclosure;
    private final String leftIcon;
    private final Rounds round;

    @EnumNullFallback
    private final BadgeSize size;
    private final StraightCorners straightCorners;

    @EnumNullFallback
    private final Style style;

    @EnumNullFallback
    private final Style styleType;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadgeSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgeSize[] $VALUES;

        @i(name = "SIZE_200")
        public static final BadgeSize SIZE_200 = new BadgeSize("SIZE_200", 0);

        @i(name = "SIZE_300")
        public static final BadgeSize SIZE_300 = new BadgeSize("SIZE_300", 1);

        @i(name = "SIZE_400")
        public static final BadgeSize SIZE_400 = new BadgeSize("SIZE_400", 2);

        @i(name = "SIZE_500")
        public static final BadgeSize SIZE_500 = new BadgeSize("SIZE_500", 3);

        @i(name = "SIZE_600")
        public static final BadgeSize SIZE_600 = new BadgeSize("SIZE_600", 4);

        private static final /* synthetic */ BadgeSize[] $values() {
            return new BadgeSize[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600};
        }

        static {
            BadgeSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BadgeSize(String str, int i11) {
        }

        @NotNull
        public static a<BadgeSize> getEntries() {
            return $ENTRIES;
        }

        public static BadgeSize valueOf(String str) {
            return (BadgeSize) Enum.valueOf(BadgeSize.class, str);
        }

        public static BadgeSize[] values() {
            return (BadgeSize[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeDTO> {
        @Override // android.os.Parcelable.Creator
        public final BadgeDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BadgeSize valueOf2 = parcel.readInt() == 0 ? null : BadgeSize.valueOf(parcel.readString());
            Style valueOf3 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            CustomStyle createFromParcel = parcel.readInt() == 0 ? null : CustomStyle.CREATOR.createFromParcel(parcel);
            CommonControlSettings createFromParcel2 = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BadgeDTO(readString, readString2, valueOf2, valueOf3, createFromParcel, createFromParcel2, readString3, valueOf, parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StraightCorners.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : A11yInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Rounds.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeDTO[] newArray(int i11) {
            return new BadgeDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "Landroid/os/Parcelable;", "color", "", "gradient", "Lru/ozon/uni/core/UniGradient;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/core/UniGradient;)V", "getColor", "()Ljava/lang/String;", "getGradient", "()Lru/ozon/uni/core/UniGradient;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomBackground implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomBackground> CREATOR = new Creator();
        private final String color;
        private final UniGradient gradient;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomBackground> {
            @Override // android.os.Parcelable.Creator
            public final CustomBackground createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomBackground(parcel.readString(), (UniGradient) parcel.readParcelable(CustomBackground.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CustomBackground[] newArray(int i11) {
                return new CustomBackground[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CustomBackground() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CustomBackground copy$default(CustomBackground customBackground, String str, UniGradient uniGradient, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customBackground.color;
            }
            if ((i11 & 2) != 0) {
                uniGradient = customBackground.gradient;
            }
            return customBackground.copy(str, uniGradient);
        }

        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final UniGradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final CustomBackground copy(String color, UniGradient gradient) {
            return new CustomBackground(color, gradient);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomBackground)) {
                return false;
            }
            CustomBackground customBackground = (CustomBackground) other;
            return Intrinsics.d(this.color, customBackground.color) && Intrinsics.d(this.gradient, customBackground.gradient);
        }

        public final String getColor() {
            return this.color;
        }

        public final UniGradient getGradient() {
            return this.gradient;
        }

        public int hashCode() {
            String str = this.color;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniGradient uniGradient = this.gradient;
            return hashCode + (uniGradient != null ? uniGradient.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CustomBackground(color=" + this.color + ", gradient=" + this.gradient + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.color);
            dest.writeParcelable(this.gradient, flags);
        }

        public CustomBackground(String str, UniGradient uniGradient) {
            this.color = str;
            this.gradient = uniGradient;
        }

        public /* synthetic */ CustomBackground(String str, UniGradient uniGradient, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : uniGradient);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "Landroid/os/Parcelable;", "backgroundColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "backgroundActiveColor", "textColor", "", "leftGraphicColor", "rightGraphicColor", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "getBackgroundActiveColor", "getTextColor", "()Ljava/lang/String;", "getLeftGraphicColor", "getRightGraphicColor", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomStyle> CREATOR = new Creator();
        private final CustomBackground backgroundActiveColor;
        private final CustomBackground backgroundColor;
        private final String leftGraphicColor;
        private final String rightGraphicColor;
        private final String textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomStyle> {
            @Override // android.os.Parcelable.Creator
            public final CustomStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomStyle(parcel.readInt() == 0 ? null : CustomBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CustomBackground.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomStyle[] newArray(int i11) {
                return new CustomStyle[i11];
            }
        }

        public CustomStyle() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, CustomBackground customBackground, CustomBackground customBackground2, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                customBackground = customStyle.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                customBackground2 = customStyle.backgroundActiveColor;
            }
            if ((i11 & 4) != 0) {
                str = customStyle.textColor;
            }
            if ((i11 & 8) != 0) {
                str2 = customStyle.leftGraphicColor;
            }
            if ((i11 & 16) != 0) {
                str3 = customStyle.rightGraphicColor;
            }
            String str4 = str3;
            String str5 = str;
            return customStyle.copy(customBackground, customBackground2, str5, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final CustomBackground getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final CustomBackground getBackgroundActiveColor() {
            return this.backgroundActiveColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLeftGraphicColor() {
            return this.leftGraphicColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRightGraphicColor() {
            return this.rightGraphicColor;
        }

        @NotNull
        public final CustomStyle copy(CustomBackground backgroundColor, CustomBackground backgroundActiveColor, String textColor, String leftGraphicColor, String rightGraphicColor) {
            return new CustomStyle(backgroundColor, backgroundActiveColor, textColor, leftGraphicColor, rightGraphicColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomStyle)) {
                return false;
            }
            CustomStyle customStyle = (CustomStyle) other;
            return Intrinsics.d(this.backgroundColor, customStyle.backgroundColor) && Intrinsics.d(this.backgroundActiveColor, customStyle.backgroundActiveColor) && Intrinsics.d(this.textColor, customStyle.textColor) && Intrinsics.d(this.leftGraphicColor, customStyle.leftGraphicColor) && Intrinsics.d(this.rightGraphicColor, customStyle.rightGraphicColor);
        }

        public final CustomBackground getBackgroundActiveColor() {
            return this.backgroundActiveColor;
        }

        public final CustomBackground getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getLeftGraphicColor() {
            return this.leftGraphicColor;
        }

        public final String getRightGraphicColor() {
            return this.rightGraphicColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            CustomBackground customBackground = this.backgroundColor;
            int hashCode = (customBackground == null ? 0 : customBackground.hashCode()) * 31;
            CustomBackground customBackground2 = this.backgroundActiveColor;
            int hashCode2 = (hashCode + (customBackground2 == null ? 0 : customBackground2.hashCode())) * 31;
            String str = this.textColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.leftGraphicColor;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.rightGraphicColor;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CustomBackground customBackground = this.backgroundColor;
            CustomBackground customBackground2 = this.backgroundActiveColor;
            String str = this.textColor;
            String str2 = this.leftGraphicColor;
            String str3 = this.rightGraphicColor;
            StringBuilder sb2 = new StringBuilder("CustomStyle(backgroundColor=");
            sb2.append(customBackground);
            sb2.append(", backgroundActiveColor=");
            sb2.append(customBackground2);
            sb2.append(", textColor=");
            Nh.a.h(sb2, str, ", leftGraphicColor=", str2, ", rightGraphicColor=");
            return o0.c(sb2, str3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CustomBackground customBackground = this.backgroundColor;
            if (customBackground == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customBackground.writeToParcel(dest, flags);
            }
            CustomBackground customBackground2 = this.backgroundActiveColor;
            if (customBackground2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customBackground2.writeToParcel(dest, flags);
            }
            dest.writeString(this.textColor);
            dest.writeString(this.leftGraphicColor);
            dest.writeString(this.rightGraphicColor);
        }

        public CustomStyle(CustomBackground customBackground, CustomBackground customBackground2, String str, String str2, String str3) {
            this.backgroundColor = customBackground;
            this.backgroundActiveColor = customBackground2;
            this.textColor = str;
            this.leftGraphicColor = str2;
            this.rightGraphicColor = str3;
        }

        public /* synthetic */ CustomStyle(CustomBackground customBackground, CustomBackground customBackground2, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : customBackground, (i11 & 2) != 0 ? null : customBackground2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "Landroid/os/Parcelable;", "topLeft", "", "topRight", "bottomLeft", "bottomRight", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTopLeft", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTopRight", "getBottomLeft", "getBottomRight", "isNonDefault", "isNonDefault$uni_release$annotations", "()V", "isNonDefault$uni_release", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StraightCorners implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<StraightCorners> CREATOR = new Creator();
        private final Boolean bottomLeft;
        private final Boolean bottomRight;
        private final boolean isNonDefault;
        private final Boolean topLeft;
        private final Boolean topRight;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<StraightCorners> {
            @Override // android.os.Parcelable.Creator
            public final StraightCorners createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new StraightCorners(valueOf, valueOf2, valueOf3, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final StraightCorners[] newArray(int i11) {
                return new StraightCorners[i11];
            }
        }

        public StraightCorners() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ StraightCorners copy$default(StraightCorners straightCorners, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = straightCorners.topLeft;
            }
            if ((i11 & 2) != 0) {
                bool2 = straightCorners.topRight;
            }
            if ((i11 & 4) != 0) {
                bool3 = straightCorners.bottomLeft;
            }
            if ((i11 & 8) != 0) {
                bool4 = straightCorners.bottomRight;
            }
            return straightCorners.copy(bool, bool2, bool3, bool4);
        }

        public static /* synthetic */ void isNonDefault$uni_release$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getTopLeft() {
            return this.topLeft;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getTopRight() {
            return this.topRight;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getBottomLeft() {
            return this.bottomLeft;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getBottomRight() {
            return this.bottomRight;
        }

        @NotNull
        public final StraightCorners copy(Boolean topLeft, Boolean topRight, Boolean bottomLeft, Boolean bottomRight) {
            return new StraightCorners(topLeft, topRight, bottomLeft, bottomRight);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StraightCorners)) {
                return false;
            }
            StraightCorners straightCorners = (StraightCorners) other;
            return Intrinsics.d(this.topLeft, straightCorners.topLeft) && Intrinsics.d(this.topRight, straightCorners.topRight) && Intrinsics.d(this.bottomLeft, straightCorners.bottomLeft) && Intrinsics.d(this.bottomRight, straightCorners.bottomRight);
        }

        public final Boolean getBottomLeft() {
            return this.bottomLeft;
        }

        public final Boolean getBottomRight() {
            return this.bottomRight;
        }

        public final Boolean getTopLeft() {
            return this.topLeft;
        }

        public final Boolean getTopRight() {
            return this.topRight;
        }

        public int hashCode() {
            Boolean bool = this.topLeft;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.topRight;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.bottomLeft;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.bottomRight;
            return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        /* renamed from: isNonDefault$uni_release, reason: from getter */
        public final boolean getIsNonDefault() {
            return this.isNonDefault;
        }

        @NotNull
        public String toString() {
            return "StraightCorners(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.topLeft;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            Boolean bool2 = this.topRight;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool2);
            }
            Boolean bool3 = this.bottomLeft;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool3);
            }
            Boolean bool4 = this.bottomRight;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool4);
            }
        }

        public StraightCorners(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.topLeft = bool;
            this.topRight = bool2;
            this.bottomLeft = bool3;
            this.bottomRight = bool4;
            Boolean bool5 = Boolean.TRUE;
            this.isNonDefault = Intrinsics.d(bool, bool5) || Intrinsics.d(bool2, bool5) || Intrinsics.d(bool3, bool5) || Intrinsics.d(bool4, bool5);
        }

        public /* synthetic */ StraightCorners(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? Boolean.FALSE : bool2, (i11 & 4) != 0 ? Boolean.FALSE : bool3, (i11 & 8) != 0 ? Boolean.FALSE : bool4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b1\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00062"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL_PRIMARY", "NEUTRAL_SECONDARY", "NEUTRAL_TERTIARY", "NEUTRAL_STATIC_PRIMARY", "WARNING_PRIMARY", "WARNING_SECONDARY", "NEGATIVE_PRIMARY", "NEGATIVE_SECONDARY", "POSITIVE_PRIMARY", "POSITIVE_SECONDARY", "ACTION_PRIMARY", "ACTION_SECONDARY", "SELLER_BONUS_LIGHT", "SELLER_BONUS_DARK", "DIGITAL_GOODS_LIGHT", "DIGITAL_GOODS_DARK", "PROMOTIONAL_FIRST_LIGHT", "PROMOTIONAL_FIRST_DARK", "OZON_CARE_LIGHT", "OZON_CARE_DARK", "PRE_ORDER_LIGHT", "PRE_ORDER_DARK", "NEW_LIGHT", "NEW_DARK", "BESTSELLER_LIGHT", "BESTSELLER_DARK", "TSR_CERTIFICATE_LIGHT", "TSR_CERTIFICATE_DARK", "OZON_ADS_LIGHT", "OZON_ADS_DARK", "PAYMENT_AFTER_FITTING_LIGHT", "PAYMENT_AFTER_FITTING_DARK", "POINTS_FOR_REVIEWS_LIGHT", "POINTS_FOR_REVIEWS_DARK", "CASH_PAYMENT_LIGHT", "CASH_PAYMENT_DARK", "AUDIO_LIGHT", "AUDIO_DARK", "ORIGINAL_PRODUCT_LIGHT", "ORIGINAL_PRODUCT_DARK", "OUT_OF_STOCK_LIGHT", "OUT_OF_STOCK_DARK", "BIG_PROMO", "RATING", "PREMIUM_PLUS", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @i(name = "NEUTRAL_PRIMARY")
        public static final Style NEUTRAL_PRIMARY = new Style("NEUTRAL_PRIMARY", 0);

        @i(name = "NEUTRAL_SECONDARY")
        public static final Style NEUTRAL_SECONDARY = new Style("NEUTRAL_SECONDARY", 1);

        @i(name = "NEUTRAL_TERTIARY")
        public static final Style NEUTRAL_TERTIARY = new Style("NEUTRAL_TERTIARY", 2);

        @i(name = "NEUTRAL_STATIC_PRIMARY")
        public static final Style NEUTRAL_STATIC_PRIMARY = new Style("NEUTRAL_STATIC_PRIMARY", 3);

        @i(name = "WARNING_PRIMARY")
        public static final Style WARNING_PRIMARY = new Style("WARNING_PRIMARY", 4);

        @i(name = "WARNING_SECONDARY")
        public static final Style WARNING_SECONDARY = new Style("WARNING_SECONDARY", 5);

        @i(name = "NEGATIVE_PRIMARY")
        public static final Style NEGATIVE_PRIMARY = new Style("NEGATIVE_PRIMARY", 6);

        @i(name = "NEGATIVE_SECONDARY")
        public static final Style NEGATIVE_SECONDARY = new Style("NEGATIVE_SECONDARY", 7);

        @i(name = "POSITIVE_PRIMARY")
        public static final Style POSITIVE_PRIMARY = new Style("POSITIVE_PRIMARY", 8);

        @i(name = "POSITIVE_SECONDARY")
        public static final Style POSITIVE_SECONDARY = new Style("POSITIVE_SECONDARY", 9);

        @i(name = "ACTION_PRIMARY")
        public static final Style ACTION_PRIMARY = new Style("ACTION_PRIMARY", 10);

        @i(name = "ACTION_SECONDARY")
        public static final Style ACTION_SECONDARY = new Style("ACTION_SECONDARY", 11);

        @i(name = "SELLER_BONUS_LIGHT")
        public static final Style SELLER_BONUS_LIGHT = new Style("SELLER_BONUS_LIGHT", 12);

        @i(name = "SELLER_BONUS_DARK")
        public static final Style SELLER_BONUS_DARK = new Style("SELLER_BONUS_DARK", 13);

        @i(name = "DIGITAL_GOODS_LIGHT")
        public static final Style DIGITAL_GOODS_LIGHT = new Style("DIGITAL_GOODS_LIGHT", 14);

        @i(name = "DIGITAL_GOODS_DARK")
        public static final Style DIGITAL_GOODS_DARK = new Style("DIGITAL_GOODS_DARK", 15);

        @i(name = "PROMOTIONAL_FIRST_LIGHT")
        public static final Style PROMOTIONAL_FIRST_LIGHT = new Style("PROMOTIONAL_FIRST_LIGHT", 16);

        @i(name = "PROMOTIONAL_FIRST_DARK")
        public static final Style PROMOTIONAL_FIRST_DARK = new Style("PROMOTIONAL_FIRST_DARK", 17);

        @i(name = "OZON_CARE_LIGHT")
        public static final Style OZON_CARE_LIGHT = new Style("OZON_CARE_LIGHT", 18);

        @i(name = "OZON_CARE_DARK")
        public static final Style OZON_CARE_DARK = new Style("OZON_CARE_DARK", 19);

        @i(name = "PRE_ORDER_LIGHT")
        public static final Style PRE_ORDER_LIGHT = new Style("PRE_ORDER_LIGHT", 20);

        @i(name = "PRE_ORDER_DARK")
        public static final Style PRE_ORDER_DARK = new Style("PRE_ORDER_DARK", 21);

        @i(name = "NEW_LIGHT")
        public static final Style NEW_LIGHT = new Style("NEW_LIGHT", 22);

        @i(name = "NEW_DARK")
        public static final Style NEW_DARK = new Style("NEW_DARK", 23);

        @i(name = "BESTSELLER_LIGHT")
        public static final Style BESTSELLER_LIGHT = new Style("BESTSELLER_LIGHT", 24);

        @i(name = "BESTSELLER_DARK")
        public static final Style BESTSELLER_DARK = new Style("BESTSELLER_DARK", 25);

        @i(name = "TSR_CERTIFICATE_LIGHT")
        public static final Style TSR_CERTIFICATE_LIGHT = new Style("TSR_CERTIFICATE_LIGHT", 26);

        @i(name = "TSR_CERTIFICATE_DARK")
        public static final Style TSR_CERTIFICATE_DARK = new Style("TSR_CERTIFICATE_DARK", 27);

        @i(name = "OZON_ADS_LIGHT")
        public static final Style OZON_ADS_LIGHT = new Style("OZON_ADS_LIGHT", 28);

        @i(name = "OZON_ADS_DARK")
        public static final Style OZON_ADS_DARK = new Style("OZON_ADS_DARK", 29);

        @i(name = "PAYMENT_AFTER_FITTING_LIGHT")
        public static final Style PAYMENT_AFTER_FITTING_LIGHT = new Style("PAYMENT_AFTER_FITTING_LIGHT", 30);

        @i(name = "PAYMENT_AFTER_FITTING_DARK")
        public static final Style PAYMENT_AFTER_FITTING_DARK = new Style("PAYMENT_AFTER_FITTING_DARK", 31);

        @i(name = "POINTS_FOR_REVIEWS_LIGHT")
        public static final Style POINTS_FOR_REVIEWS_LIGHT = new Style("POINTS_FOR_REVIEWS_LIGHT", 32);

        @i(name = "POINTS_FOR_REVIEWS_DARK")
        public static final Style POINTS_FOR_REVIEWS_DARK = new Style("POINTS_FOR_REVIEWS_DARK", 33);

        @i(name = "CASH_PAYMENT_LIGHT")
        public static final Style CASH_PAYMENT_LIGHT = new Style("CASH_PAYMENT_LIGHT", 34);

        @i(name = "CASH_PAYMENT_DARK")
        public static final Style CASH_PAYMENT_DARK = new Style("CASH_PAYMENT_DARK", 35);

        @i(name = "AUDIO_LIGHT")
        public static final Style AUDIO_LIGHT = new Style("AUDIO_LIGHT", 36);

        @i(name = "AUDIO_DARK")
        public static final Style AUDIO_DARK = new Style("AUDIO_DARK", 37);

        @i(name = "ORIGINAL_PRODUCT_LIGHT")
        public static final Style ORIGINAL_PRODUCT_LIGHT = new Style("ORIGINAL_PRODUCT_LIGHT", 38);

        @i(name = "ORIGINAL_PRODUCT_DARK")
        public static final Style ORIGINAL_PRODUCT_DARK = new Style("ORIGINAL_PRODUCT_DARK", 39);

        @i(name = "OUT_OF_STOCK_LIGHT")
        public static final Style OUT_OF_STOCK_LIGHT = new Style("OUT_OF_STOCK_LIGHT", 40);

        @i(name = "OUT_OF_STOCK_DARK")
        public static final Style OUT_OF_STOCK_DARK = new Style("OUT_OF_STOCK_DARK", 41);

        @i(name = "BIG_PROMO")
        public static final Style BIG_PROMO = new Style("BIG_PROMO", 42);

        @i(name = "RATING")
        public static final Style RATING = new Style("RATING", 43);

        @i(name = "PREMIUM_PLUS")
        public static final Style PREMIUM_PLUS = new Style("PREMIUM_PLUS", 44);

        @i(name = "CUSTOM")
        public static final Style CUSTOM = new Style("CUSTOM", 45);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{NEUTRAL_PRIMARY, NEUTRAL_SECONDARY, NEUTRAL_TERTIARY, NEUTRAL_STATIC_PRIMARY, WARNING_PRIMARY, WARNING_SECONDARY, NEGATIVE_PRIMARY, NEGATIVE_SECONDARY, POSITIVE_PRIMARY, POSITIVE_SECONDARY, ACTION_PRIMARY, ACTION_SECONDARY, SELLER_BONUS_LIGHT, SELLER_BONUS_DARK, DIGITAL_GOODS_LIGHT, DIGITAL_GOODS_DARK, PROMOTIONAL_FIRST_LIGHT, PROMOTIONAL_FIRST_DARK, OZON_CARE_LIGHT, OZON_CARE_DARK, PRE_ORDER_LIGHT, PRE_ORDER_DARK, NEW_LIGHT, NEW_DARK, BESTSELLER_LIGHT, BESTSELLER_DARK, TSR_CERTIFICATE_LIGHT, TSR_CERTIFICATE_DARK, OZON_ADS_LIGHT, OZON_ADS_DARK, PAYMENT_AFTER_FITTING_LIGHT, PAYMENT_AFTER_FITTING_DARK, POINTS_FOR_REVIEWS_LIGHT, POINTS_FOR_REVIEWS_DARK, CASH_PAYMENT_LIGHT, CASH_PAYMENT_DARK, AUDIO_LIGHT, AUDIO_DARK, ORIGINAL_PRODUCT_LIGHT, ORIGINAL_PRODUCT_DARK, OUT_OF_STOCK_LIGHT, OUT_OF_STOCK_DARK, BIG_PROMO, RATING, PREMIUM_PLUS, CUSTOM};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11) {
        }

        @NotNull
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public BadgeDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ BadgeDTO copy$default(BadgeDTO badgeDTO, String str, String str2, BadgeSize badgeSize, Style style, CustomStyle customStyle, CommonControlSettings commonControlSettings, String str3, Boolean bool, Style style2, StraightCorners straightCorners, A11yInfo a11yInfo, Rounds rounds, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = badgeDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = badgeDTO.leftIcon;
        }
        if ((i11 & 4) != 0) {
            badgeSize = badgeDTO.size;
        }
        if ((i11 & 8) != 0) {
            style = badgeDTO.style;
        }
        if ((i11 & 16) != 0) {
            customStyle = badgeDTO.customBadgeStyle;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = badgeDTO.common;
        }
        if ((i11 & 64) != 0) {
            str3 = badgeDTO.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = badgeDTO.hideDisclosure;
        }
        if ((i11 & 256) != 0) {
            style2 = badgeDTO.styleType;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            straightCorners = badgeDTO.straightCorners;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            a11yInfo = badgeDTO.a11yInfo;
        }
        if ((i11 & 2048) != 0) {
            rounds = badgeDTO.round;
        }
        A11yInfo a11yInfo2 = a11yInfo;
        Rounds rounds2 = rounds;
        Style style3 = style2;
        StraightCorners straightCorners2 = straightCorners;
        String str4 = str3;
        Boolean bool2 = bool;
        CustomStyle customStyle2 = customStyle;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return badgeDTO.copy(str, str2, badgeSize, style, customStyle2, commonControlSettings2, str4, bool2, style3, straightCorners2, a11yInfo2, rounds2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getStyle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final StraightCorners getStraightCorners() {
        return this.straightCorners;
    }

    /* renamed from: component11, reason: from getter */
    public final A11yInfo getA11yInfo() {
        return this.a11yInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final Rounds getRound() {
        return this.round;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeSize getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component5, reason: from getter */
    public final CustomStyle getCustomBadgeStyle() {
        return this.customBadgeStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHideDisclosure() {
        return this.hideDisclosure;
    }

    /* renamed from: component9, reason: from getter */
    public final Style getStyleType() {
        return this.styleType;
    }

    @NotNull
    public final BadgeDTO copy(String text, String leftIcon, BadgeSize size, Style style, CustomStyle customBadgeStyle, CommonControlSettings common, String context, Boolean hideDisclosure, Style styleType, StraightCorners straightCorners, A11yInfo a11yInfo, Rounds round) {
        return new BadgeDTO(text, leftIcon, size, style, customBadgeStyle, common, context, hideDisclosure, styleType, straightCorners, a11yInfo, round);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeDTO)) {
            return false;
        }
        BadgeDTO badgeDTO = (BadgeDTO) other;
        return Intrinsics.d(this.text, badgeDTO.text) && Intrinsics.d(this.leftIcon, badgeDTO.leftIcon) && this.size == badgeDTO.size && this.style == badgeDTO.style && Intrinsics.d(this.customBadgeStyle, badgeDTO.customBadgeStyle) && Intrinsics.d(this.common, badgeDTO.common) && Intrinsics.d(this.context, badgeDTO.context) && Intrinsics.d(this.hideDisclosure, badgeDTO.hideDisclosure) && this.styleType == badgeDTO.styleType && Intrinsics.d(this.straightCorners, badgeDTO.straightCorners) && Intrinsics.d(this.a11yInfo, badgeDTO.a11yInfo) && this.round == badgeDTO.round;
    }

    public final A11yInfo getA11yInfo() {
        return this.a11yInfo;
    }

    @NotNull
    public final Style getBadgeStyle() {
        Style style = this.style;
        if (style != null) {
            return style;
        }
        Style style2 = this.styleType;
        return style2 == null ? Style.NEUTRAL_SECONDARY : style2;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CustomStyle getCustomBadgeStyle() {
        return this.customBadgeStyle;
    }

    public final Boolean getHideDisclosure() {
        return this.hideDisclosure;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.ds_badge;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final Rounds getRound() {
        return this.round;
    }

    public final BadgeSize getSize() {
        return this.size;
    }

    public final StraightCorners getStraightCorners() {
        return this.straightCorners;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final Style getStyleType() {
        return this.styleType;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leftIcon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgeSize badgeSize = this.size;
        int hashCode3 = (hashCode2 + (badgeSize == null ? 0 : badgeSize.hashCode())) * 31;
        Style style = this.style;
        int hashCode4 = (hashCode3 + (style == null ? 0 : style.hashCode())) * 31;
        CustomStyle customStyle = this.customBadgeStyle;
        int hashCode5 = (hashCode4 + (customStyle == null ? 0 : customStyle.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str3 = this.context;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hideDisclosure;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Style style2 = this.styleType;
        int hashCode9 = (hashCode8 + (style2 == null ? 0 : style2.hashCode())) * 31;
        StraightCorners straightCorners = this.straightCorners;
        int hashCode10 = (hashCode9 + (straightCorners == null ? 0 : straightCorners.hashCode())) * 31;
        A11yInfo a11yInfo = this.a11yInfo;
        int hashCode11 = (hashCode10 + (a11yInfo == null ? 0 : a11yInfo.hashCode())) * 31;
        Rounds rounds = this.round;
        return hashCode11 + (rounds != null ? rounds.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.leftIcon;
        BadgeSize badgeSize = this.size;
        Style style = this.style;
        CustomStyle customStyle = this.customBadgeStyle;
        CommonControlSettings commonControlSettings = this.common;
        String str3 = this.context;
        Boolean bool = this.hideDisclosure;
        Style style2 = this.styleType;
        StraightCorners straightCorners = this.straightCorners;
        A11yInfo a11yInfo = this.a11yInfo;
        Rounds rounds = this.round;
        StringBuilder d11 = C3660k.d("BadgeDTO(text=", str, ", leftIcon=", str2, ", size=");
        d11.append(badgeSize);
        d11.append(", style=");
        d11.append(style);
        d11.append(", customBadgeStyle=");
        d11.append(customStyle);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(", context=");
        Sh.a.d(bool, str3, ", hideDisclosure=", ", styleType=", d11);
        d11.append(style2);
        d11.append(", straightCorners=");
        d11.append(straightCorners);
        d11.append(", a11yInfo=");
        d11.append(a11yInfo);
        d11.append(", round=");
        d11.append(rounds);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.leftIcon);
        BadgeSize badgeSize = this.size;
        if (badgeSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(badgeSize.name());
        }
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        CustomStyle customStyle = this.customBadgeStyle;
        if (customStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customStyle.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        Boolean bool = this.hideDisclosure;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Style style2 = this.styleType;
        if (style2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style2.name());
        }
        StraightCorners straightCorners = this.straightCorners;
        if (straightCorners == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            straightCorners.writeToParcel(dest, flags);
        }
        A11yInfo a11yInfo = this.a11yInfo;
        if (a11yInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            a11yInfo.writeToParcel(dest, flags);
        }
        Rounds rounds = this.round;
        if (rounds == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(rounds.name());
        }
    }

    public /* synthetic */ BadgeDTO(String str, String str2, BadgeSize badgeSize, Style style, CustomStyle customStyle, CommonControlSettings commonControlSettings, String str3, Boolean bool, Style style2, StraightCorners straightCorners, A11yInfo a11yInfo, Rounds rounds, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? BadgeSize.SIZE_500 : badgeSize, (i11 & 8) != 0 ? null : style, (i11 & 16) != 0 ? null : customStyle, (i11 & 32) != 0 ? null : commonControlSettings, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Boolean.FALSE : bool, (i11 & 256) != 0 ? null : style2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : straightCorners, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : a11yInfo, (i11 & 2048) != 0 ? null : rounds);
    }

    public BadgeDTO(String str, String str2, BadgeSize badgeSize, Style style, CustomStyle customStyle, CommonControlSettings commonControlSettings, String str3, Boolean bool, Style style2, StraightCorners straightCorners, A11yInfo a11yInfo, Rounds rounds) {
        super(DsAtomsType.BADGE, str3, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.text = str;
        this.leftIcon = str2;
        this.size = badgeSize;
        this.style = style;
        this.customBadgeStyle = customStyle;
        this.common = commonControlSettings;
        this.context = str3;
        this.hideDisclosure = bool;
        this.styleType = style2;
        this.straightCorners = straightCorners;
        this.a11yInfo = a11yInfo;
        this.round = rounds;
    }
}
