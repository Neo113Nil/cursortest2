package ru.ozon.app.android.atoms.data.aspect;

import C.o0;
import V.e;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CornerRadius;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010 \u001a\u00020\u0019J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0019HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lru/ozon/app/android/atoms/data/aspect/AspectDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "radius", "Lru/ozon/app/android/atoms/data/common/CornerRadius;", "state", "Lru/ozon/app/android/atoms/data/aspect/AspectDTO$AspectState;", "customStyle", "Lru/ozon/app/android/atoms/data/aspect/AspectDTO$CustomStyle;", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "context", "", "<init>", "(Lru/ozon/app/android/atoms/data/common/CornerRadius;Lru/ozon/app/android/atoms/data/aspect/AspectDTO$AspectState;Lru/ozon/app/android/atoms/data/aspect/AspectDTO$CustomStyle;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getRadius", "()Lru/ozon/app/android/atoms/data/common/CornerRadius;", "getState", "()Lru/ozon/app/android/atoms/data/aspect/AspectDTO$AspectState;", "getCustomStyle", "()Lru/ozon/app/android/atoms/data/aspect/AspectDTO$CustomStyle;", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getContext", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CustomStyle", "AspectState", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AspectDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AspectDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;
    private final CustomStyle customStyle;
    private final CornerRadius radius;
    private final AspectState state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/aspect/AspectDTO$AspectState;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_INVALID", "ENABLED", "SELECTED", "UNAVAILABLE", "SELECTED_UNAVAILABLE", "PARTIALLY_AVAILABLE", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AspectState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AspectState[] $VALUES;

        @i(name = "STATE_INVALID")
        public static final AspectState STATE_INVALID = new AspectState("STATE_INVALID", 0);

        @i(name = "ENABLED")
        public static final AspectState ENABLED = new AspectState("ENABLED", 1);

        @i(name = "SELECTED")
        public static final AspectState SELECTED = new AspectState("SELECTED", 2);

        @i(name = "UNAVAILABLE")
        public static final AspectState UNAVAILABLE = new AspectState("UNAVAILABLE", 3);

        @i(name = "SELECTED_UNAVAILABLE")
        public static final AspectState SELECTED_UNAVAILABLE = new AspectState("SELECTED_UNAVAILABLE", 4);

        @i(name = "PARTIALLY_AVAILABLE")
        public static final AspectState PARTIALLY_AVAILABLE = new AspectState("PARTIALLY_AVAILABLE", 5);

        private static final /* synthetic */ AspectState[] $values() {
            return new AspectState[]{STATE_INVALID, ENABLED, SELECTED, UNAVAILABLE, SELECTED_UNAVAILABLE, PARTIALLY_AVAILABLE};
        }

        static {
            AspectState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AspectState(String str, int i11) {
        }

        @NotNull
        public static a<AspectState> getEntries() {
            return $ENTRIES;
        }

        public static AspectState valueOf(String str) {
            return (AspectState) Enum.valueOf(AspectState.class, str);
        }

        public static AspectState[] values() {
            return (AspectState[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AspectDTO> {
        @Override // android.os.Parcelable.Creator
        public final AspectDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AspectDTO(parcel.readInt() == 0 ? null : CornerRadius.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AspectState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CustomStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AspectDTO[] newArray(int i11) {
            return new AspectDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/aspect/AspectDTO$CustomStyle;", "Landroid/os/Parcelable;", "borderColor", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomStyle> CREATOR = new Creator();
        private final String backgroundColor;
        private final String borderColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomStyle> {
            @Override // android.os.Parcelable.Creator
            public final CustomStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomStyle(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomStyle[] newArray(int i11) {
                return new CustomStyle[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CustomStyle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customStyle.borderColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customStyle.backgroundColor;
            }
            return customStyle.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CustomStyle copy(String borderColor, String backgroundColor) {
            return new CustomStyle(borderColor, backgroundColor);
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
            return Intrinsics.d(this.borderColor, customStyle.borderColor) && Intrinsics.d(this.backgroundColor, customStyle.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public int hashCode() {
            String str = this.borderColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundColor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("CustomStyle(borderColor=", this.borderColor, ", backgroundColor=", this.backgroundColor, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.borderColor);
            dest.writeString(this.backgroundColor);
        }

        public CustomStyle(String str, String str2) {
            this.borderColor = str;
            this.backgroundColor = str2;
        }

        public /* synthetic */ CustomStyle(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    public AspectDTO() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AspectDTO copy$default(AspectDTO aspectDTO, CornerRadius cornerRadius, AspectState aspectState, CustomStyle customStyle, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cornerRadius = aspectDTO.radius;
        }
        if ((i11 & 2) != 0) {
            aspectState = aspectDTO.state;
        }
        if ((i11 & 4) != 0) {
            customStyle = aspectDTO.customStyle;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = aspectDTO.common;
        }
        if ((i11 & 16) != 0) {
            str = aspectDTO.context;
        }
        String str2 = str;
        CustomStyle customStyle2 = customStyle;
        return aspectDTO.copy(cornerRadius, aspectState, customStyle2, commonControlSettings, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final CornerRadius getRadius() {
        return this.radius;
    }

    /* renamed from: component2, reason: from getter */
    public final AspectState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
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
    public final AspectDTO copy(CornerRadius radius, AspectState state, CustomStyle customStyle, CommonControlSettings common, String context) {
        return new AspectDTO(radius, state, customStyle, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectDTO)) {
            return false;
        }
        AspectDTO aspectDTO = (AspectDTO) other;
        return this.radius == aspectDTO.radius && this.state == aspectDTO.state && Intrinsics.d(this.customStyle, aspectDTO.customStyle) && Intrinsics.d(this.common, aspectDTO.common) && Intrinsics.d(this.context, aspectDTO.context);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.aspect;
    }

    public final CornerRadius getRadius() {
        return this.radius;
    }

    public final AspectState getState() {
        return this.state;
    }

    public int hashCode() {
        CornerRadius cornerRadius = this.radius;
        int hashCode = (cornerRadius == null ? 0 : cornerRadius.hashCode()) * 31;
        AspectState aspectState = this.state;
        int hashCode2 = (hashCode + (aspectState == null ? 0 : aspectState.hashCode())) * 31;
        CustomStyle customStyle = this.customStyle;
        int hashCode3 = (hashCode2 + (customStyle == null ? 0 : customStyle.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.context;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CornerRadius cornerRadius = this.radius;
        AspectState aspectState = this.state;
        CustomStyle customStyle = this.customStyle;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.context;
        StringBuilder sb2 = new StringBuilder("AspectDTO(radius=");
        sb2.append(cornerRadius);
        sb2.append(", state=");
        sb2.append(aspectState);
        sb2.append(", customStyle=");
        sb2.append(customStyle);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", context=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CornerRadius cornerRadius = this.radius;
        if (cornerRadius == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cornerRadius.name());
        }
        AspectState aspectState = this.state;
        if (aspectState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aspectState.name());
        }
        CustomStyle customStyle = this.customStyle;
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
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AspectDTO(ru.ozon.app.android.atoms.data.common.CornerRadius r2, ru.ozon.app.android.atoms.data.aspect.AspectDTO.AspectState r3, ru.ozon.app.android.atoms.data.aspect.AspectDTO.CustomStyle r4, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            ru.ozon.app.android.atoms.data.common.CornerRadius r2 = ru.ozon.app.android.atoms.data.common.CornerRadius.RADIUS_300
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            ru.ozon.app.android.atoms.data.aspect.AspectDTO$AspectState r3 = ru.ozon.app.android.atoms.data.aspect.AspectDTO.AspectState.ENABLED
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.aspect.AspectDTO.<init>(ru.ozon.app.android.atoms.data.common.CornerRadius, ru.ozon.app.android.atoms.data.aspect.AspectDTO$AspectState, ru.ozon.app.android.atoms.data.aspect.AspectDTO$CustomStyle, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public AspectDTO(CornerRadius cornerRadius, AspectState aspectState, CustomStyle customStyle, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.ASPECT, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.radius = cornerRadius;
        this.state = aspectState;
        this.customStyle = customStyle;
        this.common = commonControlSettings;
        this.context = str;
    }
}
