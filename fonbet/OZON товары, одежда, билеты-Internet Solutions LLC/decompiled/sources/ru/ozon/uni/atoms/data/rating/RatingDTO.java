package ru.ozon.uni.atoms.data.rating;

import D40.c;
import N3.C3660k;
import Ve.Om;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.core.UniGradient;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u000389:B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\"\u001a\u00020#H\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jb\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020#J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020#HÖ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020#R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006;"}, d2 = {"Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "style", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;", "size", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "separateClickable", "", "total", "", "context", "", "customStyle", "Lru/ozon/uni/atoms/data/rating/RatingDTO$CustomStyle;", "<init>", "(Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Lru/ozon/uni/atoms/data/rating/RatingDTO$CustomStyle;)V", "getStyle", "()Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;", "getSize", "()Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSeparateClickable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTotal", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getContext", "()Ljava/lang/String;", "getCustomStyle", "()Lru/ozon/uni/atoms/data/rating/RatingDTO$CustomStyle;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;Lru/ozon/uni/atoms/data/rating/RatingDTO$CustomStyle;)Lru/ozon/uni/atoms/data/rating/RatingDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RatingStyle", "RatingSize", "CustomStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RatingDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RatingDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;
    private final CustomStyle customStyle;
    private final Boolean separateClickable;

    @EnumNullFallback
    private final RatingSize size;

    @EnumNullFallback
    private final RatingStyle style;
    private final Float total;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingDTO> {
        @Override // android.os.Parcelable.Creator
        public final RatingDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RatingStyle valueOf2 = parcel.readInt() == 0 ? null : RatingStyle.valueOf(parcel.readString());
            RatingSize valueOf3 = parcel.readInt() == 0 ? null : RatingSize.valueOf(parcel.readString());
            CommonControlSettings createFromParcel = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RatingDTO(valueOf2, valueOf3, createFromParcel, valueOf, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt() != 0 ? CustomStyle.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingDTO[] newArray(int i11) {
            return new RatingDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/uni/atoms/data/rating/RatingDTO$CustomStyle;", "Landroid/os/Parcelable;", "starsColor", "", "starsBackgroundColor", "starsGradient", "Lru/ozon/uni/core/UniGradient;", "starsBackgroundGradient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;Lru/ozon/uni/core/UniGradient;)V", "getStarsColor", "()Ljava/lang/String;", "getStarsBackgroundColor", "getStarsGradient", "()Lru/ozon/uni/core/UniGradient;", "getStarsBackgroundGradient", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomStyle> CREATOR = new Creator();
        private final String starsBackgroundColor;
        private final UniGradient starsBackgroundGradient;
        private final String starsColor;
        private final UniGradient starsGradient;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<CustomStyle> {
            @Override // android.os.Parcelable.Creator
            public final CustomStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomStyle(parcel.readString(), parcel.readString(), (UniGradient) parcel.readParcelable(CustomStyle.class.getClassLoader()), (UniGradient) parcel.readParcelable(CustomStyle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CustomStyle[] newArray(int i11) {
                return new CustomStyle[i11];
            }
        }

        public CustomStyle() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, String str, String str2, UniGradient uniGradient, UniGradient uniGradient2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customStyle.starsColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customStyle.starsBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                uniGradient = customStyle.starsGradient;
            }
            if ((i11 & 8) != 0) {
                uniGradient2 = customStyle.starsBackgroundGradient;
            }
            return customStyle.copy(str, str2, uniGradient, uniGradient2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStarsColor() {
            return this.starsColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStarsBackgroundColor() {
            return this.starsBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final UniGradient getStarsGradient() {
            return this.starsGradient;
        }

        /* renamed from: component4, reason: from getter */
        public final UniGradient getStarsBackgroundGradient() {
            return this.starsBackgroundGradient;
        }

        @NotNull
        public final CustomStyle copy(String starsColor, String starsBackgroundColor, UniGradient starsGradient, UniGradient starsBackgroundGradient) {
            return new CustomStyle(starsColor, starsBackgroundColor, starsGradient, starsBackgroundGradient);
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
            return Intrinsics.d(this.starsColor, customStyle.starsColor) && Intrinsics.d(this.starsBackgroundColor, customStyle.starsBackgroundColor) && Intrinsics.d(this.starsGradient, customStyle.starsGradient) && Intrinsics.d(this.starsBackgroundGradient, customStyle.starsBackgroundGradient);
        }

        public final String getStarsBackgroundColor() {
            return this.starsBackgroundColor;
        }

        public final UniGradient getStarsBackgroundGradient() {
            return this.starsBackgroundGradient;
        }

        public final String getStarsColor() {
            return this.starsColor;
        }

        public final UniGradient getStarsGradient() {
            return this.starsGradient;
        }

        public int hashCode() {
            String str = this.starsColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.starsBackgroundColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniGradient uniGradient = this.starsGradient;
            int hashCode3 = (hashCode2 + (uniGradient == null ? 0 : uniGradient.hashCode())) * 31;
            UniGradient uniGradient2 = this.starsBackgroundGradient;
            return hashCode3 + (uniGradient2 != null ? uniGradient2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.starsColor;
            String str2 = this.starsBackgroundColor;
            UniGradient uniGradient = this.starsGradient;
            UniGradient uniGradient2 = this.starsBackgroundGradient;
            StringBuilder d11 = C3660k.d("CustomStyle(starsColor=", str, ", starsBackgroundColor=", str2, ", starsGradient=");
            d11.append(uniGradient);
            d11.append(", starsBackgroundGradient=");
            d11.append(uniGradient2);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.starsColor);
            dest.writeString(this.starsBackgroundColor);
            dest.writeParcelable(this.starsGradient, flags);
            dest.writeParcelable(this.starsBackgroundGradient, flags);
        }

        public CustomStyle(String str, String str2, UniGradient uniGradient, UniGradient uniGradient2) {
            this.starsColor = str;
            this.starsBackgroundColor = str2;
            this.starsGradient = uniGradient;
            this.starsBackgroundGradient = uniGradient2;
        }

        public /* synthetic */ CustomStyle(String str, String str2, UniGradient uniGradient, UniGradient uniGradient2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : uniGradient, (i11 & 8) != 0 ? null : uniGradient2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "", "size", "", "gap", "gapClickable", "<init>", "(Ljava/lang/String;IIII)V", "getSize", "()I", "getGap", "getGapClickable", "SIZE_200", "SIZE_300", "SIZE_500", "SIZE_525", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RatingSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RatingSize[] $VALUES;
        public static final RatingSize SIZE_200 = new RatingSize("SIZE_200", 0, 12, 1, 0);
        public static final RatingSize SIZE_300 = new RatingSize("SIZE_300", 1, 16, 4, 0);
        public static final RatingSize SIZE_500 = new RatingSize("SIZE_500", 2, 24, 0, 2);
        public static final RatingSize SIZE_525 = new RatingSize("SIZE_525", 3, 28, 0, 2);
        public static final RatingSize SIZE_600 = new RatingSize("SIZE_600", 4, 32, 0, 4);
        public static final RatingSize SIZE_700 = new RatingSize("SIZE_700", 5, 40, 0, 4);
        private final int gap;
        private final int gapClickable;
        private final int size;

        private static final /* synthetic */ RatingSize[] $values() {
            return new RatingSize[]{SIZE_200, SIZE_300, SIZE_500, SIZE_525, SIZE_600, SIZE_700};
        }

        static {
            RatingSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RatingSize(String str, int i11, int i12, int i13, int i14) {
            this.size = i12;
            this.gap = i13;
            this.gapClickable = i14;
        }

        @NotNull
        public static a<RatingSize> getEntries() {
            return $ENTRIES;
        }

        public static RatingSize valueOf(String str) {
            return (RatingSize) Enum.valueOf(RatingSize.class, str);
        }

        public static RatingSize[] values() {
            return (RatingSize[]) $VALUES.clone();
        }

        public final int getGap() {
            return this.gap;
        }

        public final int getGapClickable() {
            return this.gapClickable;
        }

        public final int getSize() {
            return this.size;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "DEFAULT_ON_DARK", "STATIC_ON_DARK", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RatingStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RatingStyle[] $VALUES;
        public static final RatingStyle DEFAULT = new RatingStyle("DEFAULT", 0);
        public static final RatingStyle DEFAULT_ON_DARK = new RatingStyle("DEFAULT_ON_DARK", 1);
        public static final RatingStyle STATIC_ON_DARK = new RatingStyle("STATIC_ON_DARK", 2);
        public static final RatingStyle CUSTOM = new RatingStyle("CUSTOM", 3);

        private static final /* synthetic */ RatingStyle[] $values() {
            return new RatingStyle[]{DEFAULT, DEFAULT_ON_DARK, STATIC_ON_DARK, CUSTOM};
        }

        static {
            RatingStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RatingStyle(String str, int i11) {
        }

        @NotNull
        public static a<RatingStyle> getEntries() {
            return $ENTRIES;
        }

        public static RatingStyle valueOf(String str) {
            return (RatingStyle) Enum.valueOf(RatingStyle.class, str);
        }

        public static RatingStyle[] values() {
            return (RatingStyle[]) $VALUES.clone();
        }
    }

    public RatingDTO() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ RatingDTO copy$default(RatingDTO ratingDTO, RatingStyle ratingStyle, RatingSize ratingSize, CommonControlSettings commonControlSettings, Boolean bool, Float f7, String str, CustomStyle customStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ratingStyle = ratingDTO.style;
        }
        if ((i11 & 2) != 0) {
            ratingSize = ratingDTO.size;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = ratingDTO.common;
        }
        if ((i11 & 8) != 0) {
            bool = ratingDTO.separateClickable;
        }
        if ((i11 & 16) != 0) {
            f7 = ratingDTO.total;
        }
        if ((i11 & 32) != 0) {
            str = ratingDTO.context;
        }
        if ((i11 & 64) != 0) {
            customStyle = ratingDTO.customStyle;
        }
        String str2 = str;
        CustomStyle customStyle2 = customStyle;
        Float f11 = f7;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return ratingDTO.copy(ratingStyle, ratingSize, commonControlSettings2, bool, f11, str2, customStyle2);
    }

    /* renamed from: component1, reason: from getter */
    public final RatingStyle getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final RatingSize getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getSeparateClickable() {
        return this.separateClickable;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getTotal() {
        return this.total;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component7, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @NotNull
    public final RatingDTO copy(RatingStyle style, RatingSize size, CommonControlSettings common, Boolean separateClickable, Float total, String context, CustomStyle customStyle) {
        return new RatingDTO(style, size, common, separateClickable, total, context, customStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingDTO)) {
            return false;
        }
        RatingDTO ratingDTO = (RatingDTO) other;
        return this.style == ratingDTO.style && this.size == ratingDTO.size && Intrinsics.d(this.common, ratingDTO.common) && Intrinsics.d(this.separateClickable, ratingDTO.separateClickable) && Intrinsics.d(this.total, ratingDTO.total) && Intrinsics.d(this.context, ratingDTO.context) && Intrinsics.d(this.customStyle, ratingDTO.customStyle);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.ds_rating;
    }

    public final Boolean getSeparateClickable() {
        return this.separateClickable;
    }

    public final RatingSize getSize() {
        return this.size;
    }

    public final RatingStyle getStyle() {
        return this.style;
    }

    public final Float getTotal() {
        return this.total;
    }

    public int hashCode() {
        RatingStyle ratingStyle = this.style;
        int hashCode = (ratingStyle == null ? 0 : ratingStyle.hashCode()) * 31;
        RatingSize ratingSize = this.size;
        int hashCode2 = (hashCode + (ratingSize == null ? 0 : ratingSize.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode3 = (hashCode2 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Boolean bool = this.separateClickable;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f7 = this.total;
        int hashCode5 = (hashCode4 + (f7 == null ? 0 : f7.hashCode())) * 31;
        String str = this.context;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CustomStyle customStyle = this.customStyle;
        return hashCode6 + (customStyle != null ? customStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RatingDTO(style=" + this.style + ", size=" + this.size + ", common=" + this.common + ", separateClickable=" + this.separateClickable + ", total=" + this.total + ", context=" + this.context + ", customStyle=" + this.customStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        RatingStyle ratingStyle = this.style;
        if (ratingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ratingStyle.name());
        }
        RatingSize ratingSize = this.size;
        if (ratingSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ratingSize.name());
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        Boolean bool = this.separateClickable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Float f7 = this.total;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
        dest.writeString(this.context);
        CustomStyle customStyle = this.customStyle;
        if (customStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customStyle.writeToParcel(dest, flags);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RatingDTO(ru.ozon.uni.atoms.data.rating.RatingDTO.RatingStyle r2, ru.ozon.uni.atoms.data.rating.RatingDTO.RatingSize r3, ru.ozon.uni.atoms.data.controls.CommonControlSettings r4, java.lang.Boolean r5, java.lang.Float r6, java.lang.String r7, ru.ozon.uni.atoms.data.rating.RatingDTO.CustomStyle r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            ru.ozon.uni.atoms.data.rating.RatingDTO$RatingStyle r2 = ru.ozon.uni.atoms.data.rating.RatingDTO.RatingStyle.DEFAULT
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            ru.ozon.uni.atoms.data.rating.RatingDTO$RatingSize r3 = ru.ozon.uni.atoms.data.rating.RatingDTO.RatingSize.SIZE_500
        Lc:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L12
            r4 = r0
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L21
            r6 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
        L21:
            r10 = r9 & 32
            if (r10 == 0) goto L26
            r7 = r0
        L26:
            r9 = r9 & 64
            if (r9 == 0) goto L33
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3b
        L33:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.rating.RatingDTO.<init>(ru.ozon.uni.atoms.data.rating.RatingDTO$RatingStyle, ru.ozon.uni.atoms.data.rating.RatingDTO$RatingSize, ru.ozon.uni.atoms.data.controls.CommonControlSettings, java.lang.Boolean, java.lang.Float, java.lang.String, ru.ozon.uni.atoms.data.rating.RatingDTO$CustomStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public RatingDTO(RatingStyle ratingStyle, RatingSize ratingSize, CommonControlSettings commonControlSettings, Boolean bool, Float f7, String str, CustomStyle customStyle) {
        super(DsAtomsType.DS_RATING, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.style = ratingStyle;
        this.size = ratingSize;
        this.common = commonControlSettings;
        this.separateClickable = bool;
        this.total = f7;
        this.context = str;
        this.customStyle = customStyle;
    }
}
