package ru.ozon.app.android.atoms.data.rating;

import D40.c;
import Ve.Om;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000234BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u001fJ\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001fHÖ\u0001J\t\u0010-\u001a\u00020\rHÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "style", "Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingStyle;", "size", "Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingSize;", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "separateClickable", "", "total", "", "context", "", "<init>", "(Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingStyle;Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingSize;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;)V", "getStyle", "()Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingStyle;", "getSize", "()Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingSize;", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getSeparateClickable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTotal", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getContext", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingStyle;Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingSize;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/rating/RatingDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RatingStyle", "RatingSize", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RatingDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RatingDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;
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
            return new RatingDTO(valueOf2, valueOf3, createFromParcel, valueOf, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingDTO[] newArray(int i11) {
            return new RatingDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingSize;", "", "size", "", "gap", "gapClickable", "<init>", "(Ljava/lang/String;IIII)V", "getSize", "()I", "getGap", "getGapClickable", "SIZE_200", "SIZE_300", "SIZE_500", "SIZE_525", "SIZE_600", "SIZE_700", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingDTO$RatingStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "DEFAULT_ON_DARK", "STATIC_ON_DARK", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RatingStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RatingStyle[] $VALUES;
        public static final RatingStyle DEFAULT = new RatingStyle("DEFAULT", 0);
        public static final RatingStyle DEFAULT_ON_DARK = new RatingStyle("DEFAULT_ON_DARK", 1);
        public static final RatingStyle STATIC_ON_DARK = new RatingStyle("STATIC_ON_DARK", 2);

        private static final /* synthetic */ RatingStyle[] $values() {
            return new RatingStyle[]{DEFAULT, DEFAULT_ON_DARK, STATIC_ON_DARK};
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
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ RatingDTO copy$default(RatingDTO ratingDTO, RatingStyle ratingStyle, RatingSize ratingSize, CommonControlSettings commonControlSettings, Boolean bool, Float f7, String str, int i11, Object obj) {
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
        Float f11 = f7;
        String str2 = str;
        return ratingDTO.copy(ratingStyle, ratingSize, commonControlSettings, bool, f11, str2);
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

    @NotNull
    public final RatingDTO copy(RatingStyle style, RatingSize size, CommonControlSettings common, Boolean separateClickable, Float total, String context) {
        return new RatingDTO(style, size, common, separateClickable, total, context);
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
        return this.style == ratingDTO.style && this.size == ratingDTO.size && Intrinsics.d(this.common, ratingDTO.common) && Intrinsics.d(this.separateClickable, ratingDTO.separateClickable) && Intrinsics.d(this.total, ratingDTO.total) && Intrinsics.d(this.context, ratingDTO.context);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.ds_rating;
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
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RatingDTO(style=" + this.style + ", size=" + this.size + ", common=" + this.common + ", separateClickable=" + this.separateClickable + ", total=" + this.total + ", context=" + this.context + ")";
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
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RatingDTO(ru.ozon.app.android.atoms.data.rating.RatingDTO.RatingStyle r2, ru.ozon.app.android.atoms.data.rating.RatingDTO.RatingSize r3, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r4, java.lang.Boolean r5, java.lang.Float r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            ru.ozon.app.android.atoms.data.rating.RatingDTO$RatingStyle r2 = ru.ozon.app.android.atoms.data.rating.RatingDTO.RatingStyle.DEFAULT
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            ru.ozon.app.android.atoms.data.rating.RatingDTO$RatingSize r3 = ru.ozon.app.android.atoms.data.rating.RatingDTO.RatingSize.SIZE_500
        Lc:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L12
            r4 = r0
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L21
            r6 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
        L21:
            r8 = r8 & 32
            if (r8 == 0) goto L2d
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L34
        L2d:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.rating.RatingDTO.<init>(ru.ozon.app.android.atoms.data.rating.RatingDTO$RatingStyle, ru.ozon.app.android.atoms.data.rating.RatingDTO$RatingSize, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, java.lang.Boolean, java.lang.Float, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public RatingDTO(RatingStyle ratingStyle, RatingSize ratingSize, CommonControlSettings commonControlSettings, Boolean bool, Float f7, String str) {
        super(DsAtomsType.DS_RATING, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.style = ratingStyle;
        this.size = ratingSize;
        this.common = commonControlSettings;
        this.separateClickable = bool;
        this.total = f7;
        this.context = str;
    }
}
