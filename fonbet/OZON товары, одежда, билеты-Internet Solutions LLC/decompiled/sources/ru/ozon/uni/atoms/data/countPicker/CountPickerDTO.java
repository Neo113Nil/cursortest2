package ru.ozon.uni.atoms.data.countPicker;

import C.o0;
import D40.c;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import Ve.Om;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004XYZ[B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010:\u001a\u00020;H\u0016J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0011HÆ\u0003JÀ\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010LJ\u0006\u0010M\u001a\u00020;J\u0013\u0010N\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020;HÖ\u0001J\t\u0010R\u001a\u00020\u0011HÖ\u0001J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020;R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\b\u0010!R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010*\u0012\u0004\b'\u0010$\u001a\u0004\b(\u0010)R \u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010*\u0012\u0004\b+\u0010$\u001a\u0004\b,\u0010)R \u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010*\u0012\u0004\b-\u0010$\u001a\u0004\b.\u0010)R \u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b/\u0010$\u001a\u0004\b0\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00102¨\u0006\\"}, d2 = {"Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "size", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Size;", "sizing", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Sizing;", "styleType", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$StyleType;", "isDisabled", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "minValue", "maxValue", "step", "showAsFloat", "subLabel", "", "customStyle", "Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$CustomStyle;", "minusIcon", "plusIcon", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "context", "<init>", "(Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Size;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Sizing;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$StyleType;Ljava/lang/Boolean;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$CustomStyle;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getSize", "()Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Size;", "getSizing", "()Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Sizing;", "getStyleType", "()Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$StyleType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValue$annotations", "()V", "getValue", "()F", "getMinValue$annotations", "getMinValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMaxValue$annotations", "getMaxValue", "getStep$annotations", "getStep", "getShowAsFloat$annotations", "getShowAsFloat", "getSubLabel", "()Ljava/lang/String;", "getCustomStyle", "()Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$CustomStyle;", "getMinusIcon", "getPlusIcon", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getContext", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Size;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Sizing;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$StyleType;Ljava/lang/Boolean;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$CustomStyle;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Size", "Sizing", "StyleType", "CustomStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CountPickerDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<CountPickerDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;
    private final CustomStyle customStyle;
    private final Boolean isDisabled;
    private final Float maxValue;
    private final Float minValue;
    private final String minusIcon;
    private final String plusIcon;
    private final Boolean showAsFloat;
    private final Size size;
    private final Sizing sizing;
    private final Float step;
    private final StyleType styleType;
    private final String subLabel;
    private final float value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountPickerDTO> {
        @Override // android.os.Parcelable.Creator
        public final CountPickerDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Size valueOf3 = parcel.readInt() == 0 ? null : Size.valueOf(parcel.readString());
            Sizing valueOf4 = parcel.readInt() == 0 ? null : Sizing.valueOf(parcel.readString());
            StyleType valueOf5 = parcel.readInt() == 0 ? null : StyleType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            float readFloat = parcel.readFloat();
            Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf8 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CountPickerDTO(valueOf3, valueOf4, valueOf5, valueOf, readFloat, valueOf6, valueOf7, valueOf8, valueOf2, parcel.readString(), parcel.readInt() == 0 ? null : CustomStyle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CountPickerDTO[] newArray(int i11) {
            return new CountPickerDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$CustomStyle;", "Landroid/os/Parcelable;", "backgroundColor", "", "buttonBackgroundColor", "iconColor", "valueColor", "subLabelColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getButtonBackgroundColor", "getIconColor", "getValueColor", "getSubLabelColor", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class CustomStyle implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomStyle> CREATOR = new Creator();
        private final String backgroundColor;
        private final String buttonBackgroundColor;
        private final String iconColor;
        private final String subLabelColor;
        private final String valueColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomStyle> {
            @Override // android.os.Parcelable.Creator
            public final CustomStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomStyle[] newArray(int i11) {
                return new CustomStyle[i11];
            }
        }

        public CustomStyle() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ CustomStyle copy$default(CustomStyle customStyle, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customStyle.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = customStyle.buttonBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                str3 = customStyle.iconColor;
            }
            if ((i11 & 8) != 0) {
                str4 = customStyle.valueColor;
            }
            if ((i11 & 16) != 0) {
                str5 = customStyle.subLabelColor;
            }
            String str6 = str5;
            String str7 = str3;
            return customStyle.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValueColor() {
            return this.valueColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubLabelColor() {
            return this.subLabelColor;
        }

        @NotNull
        public final CustomStyle copy(String backgroundColor, String buttonBackgroundColor, String iconColor, String valueColor, String subLabelColor) {
            return new CustomStyle(backgroundColor, buttonBackgroundColor, iconColor, valueColor, subLabelColor);
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
            return Intrinsics.d(this.backgroundColor, customStyle.backgroundColor) && Intrinsics.d(this.buttonBackgroundColor, customStyle.buttonBackgroundColor) && Intrinsics.d(this.iconColor, customStyle.iconColor) && Intrinsics.d(this.valueColor, customStyle.valueColor) && Intrinsics.d(this.subLabelColor, customStyle.subLabelColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public final String getSubLabelColor() {
            return this.subLabelColor;
        }

        public final String getValueColor() {
            return this.valueColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.buttonBackgroundColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.valueColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.subLabelColor;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.buttonBackgroundColor;
            String str3 = this.iconColor;
            String str4 = this.valueColor;
            String str5 = this.subLabelColor;
            StringBuilder d11 = C3660k.d("CustomStyle(backgroundColor=", str, ", buttonBackgroundColor=", str2, ", iconColor=");
            a.h(d11, str3, ", valueColor=", str4, ", subLabelColor=");
            return o0.c(d11, str5, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.backgroundColor);
            dest.writeString(this.buttonBackgroundColor);
            dest.writeString(this.iconColor);
            dest.writeString(this.valueColor);
            dest.writeString(this.subLabelColor);
        }

        public CustomStyle(String str, String str2, String str3, String str4, String str5) {
            this.backgroundColor = str;
            this.buttonBackgroundColor = str2;
            this.iconColor = str3;
            this.valueColor = str4;
            this.subLabelColor = str5;
        }

        public /* synthetic */ CustomStyle(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_INVALID", "SIZE_400", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        @i(name = "SIZE_INVALID")
        public static final Size SIZE_INVALID = new Size("SIZE_INVALID", 0);

        @i(name = "SIZE_400")
        public static final Size SIZE_400 = new Size("SIZE_400", 1);

        @i(name = "SIZE_500")
        public static final Size SIZE_500 = new Size("SIZE_500", 2);

        @i(name = "SIZE_600")
        public static final Size SIZE_600 = new Size("SIZE_600", 3);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_INVALID, SIZE_400, SIZE_500, SIZE_600};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$Sizing;", "", "<init>", "(Ljava/lang/String;I)V", "SIZING_INVALID", "SIZING_FILL", "SIZING_HUG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizing {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Sizing[] $VALUES;

        @i(name = "SIZING_INVALID")
        public static final Sizing SIZING_INVALID = new Sizing("SIZING_INVALID", 0);

        @i(name = "SIZING_FILL")
        public static final Sizing SIZING_FILL = new Sizing("SIZING_FILL", 1);

        @i(name = "SIZING_HUG")
        public static final Sizing SIZING_HUG = new Sizing("SIZING_HUG", 2);

        private static final /* synthetic */ Sizing[] $values() {
            return new Sizing[]{SIZING_INVALID, SIZING_FILL, SIZING_HUG};
        }

        static {
            Sizing[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Sizing(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Sizing> getEntries() {
            return $ENTRIES;
        }

        public static Sizing valueOf(String str) {
            return (Sizing) Enum.valueOf(Sizing.class, str);
        }

        public static Sizing[] values() {
            return (Sizing[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/countPicker/CountPickerDTO$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "BASED", "PRIMARY", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;

        @i(name = "INVALID")
        public static final StyleType INVALID = new StyleType("INVALID", 0);

        @i(name = "BASED")
        public static final StyleType BASED = new StyleType("BASED", 1);

        @i(name = "PRIMARY")
        public static final StyleType PRIMARY = new StyleType("PRIMARY", 2);

        @i(name = "CUSTOM")
        public static final StyleType CUSTOM = new StyleType("CUSTOM", 3);

        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{INVALID, BASED, PRIMARY, CUSTOM};
        }

        static {
            StyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleType(String str, int i11) {
        }

        @NotNull
        public static Xc.a<StyleType> getEntries() {
            return $ENTRIES;
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    public CountPickerDTO() {
        this(null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getMaxValue$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getMinValue$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getShowAsFloat$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getStep$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    /* renamed from: component11, reason: from getter */
    public final CustomStyle getCustomStyle() {
        return this.customStyle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getMinusIcon() {
        return this.minusIcon;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPlusIcon() {
        return this.plusIcon;
    }

    /* renamed from: component14, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component15, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final Sizing getSizing() {
        return this.sizing;
    }

    /* renamed from: component3, reason: from getter */
    public final StyleType getStyleType() {
        return this.styleType;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component5, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getMinValue() {
        return this.minValue;
    }

    /* renamed from: component7, reason: from getter */
    public final Float getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getStep() {
        return this.step;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getShowAsFloat() {
        return this.showAsFloat;
    }

    @NotNull
    public final CountPickerDTO copy(Size size, Sizing sizing, StyleType styleType, Boolean isDisabled, float value, Float minValue, Float maxValue, Float step, Boolean showAsFloat, String subLabel, CustomStyle customStyle, String minusIcon, String plusIcon, CommonControlSettings common, String context) {
        return new CountPickerDTO(size, sizing, styleType, isDisabled, value, minValue, maxValue, step, showAsFloat, subLabel, customStyle, minusIcon, plusIcon, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountPickerDTO)) {
            return false;
        }
        CountPickerDTO countPickerDTO = (CountPickerDTO) other;
        return this.size == countPickerDTO.size && this.sizing == countPickerDTO.sizing && this.styleType == countPickerDTO.styleType && Intrinsics.d(this.isDisabled, countPickerDTO.isDisabled) && Float.compare(this.value, countPickerDTO.value) == 0 && Intrinsics.d(this.minValue, countPickerDTO.minValue) && Intrinsics.d(this.maxValue, countPickerDTO.maxValue) && Intrinsics.d(this.step, countPickerDTO.step) && Intrinsics.d(this.showAsFloat, countPickerDTO.showAsFloat) && Intrinsics.d(this.subLabel, countPickerDTO.subLabel) && Intrinsics.d(this.customStyle, countPickerDTO.customStyle) && Intrinsics.d(this.minusIcon, countPickerDTO.minusIcon) && Intrinsics.d(this.plusIcon, countPickerDTO.plusIcon) && Intrinsics.d(this.common, countPickerDTO.common) && Intrinsics.d(this.context, countPickerDTO.context);
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
        return R$id.countPicker;
    }

    public final Float getMaxValue() {
        return this.maxValue;
    }

    public final Float getMinValue() {
        return this.minValue;
    }

    public final String getMinusIcon() {
        return this.minusIcon;
    }

    public final String getPlusIcon() {
        return this.plusIcon;
    }

    public final Boolean getShowAsFloat() {
        return this.showAsFloat;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Sizing getSizing() {
        return this.sizing;
    }

    public final Float getStep() {
        return this.step;
    }

    public final StyleType getStyleType() {
        return this.styleType;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        Size size = this.size;
        int hashCode = (size == null ? 0 : size.hashCode()) * 31;
        Sizing sizing = this.sizing;
        int hashCode2 = (hashCode + (sizing == null ? 0 : sizing.hashCode())) * 31;
        StyleType styleType = this.styleType;
        int hashCode3 = (hashCode2 + (styleType == null ? 0 : styleType.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int a11 = Pk0.b.a(this.value, (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        Float f7 = this.minValue;
        int hashCode4 = (a11 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f11 = this.maxValue;
        int hashCode5 = (hashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.step;
        int hashCode6 = (hashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool2 = this.showAsFloat;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.subLabel;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        CustomStyle customStyle = this.customStyle;
        int hashCode9 = (hashCode8 + (customStyle == null ? 0 : customStyle.hashCode())) * 31;
        String str2 = this.minusIcon;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.plusIcon;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode12 = (hashCode11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str4 = this.context;
        return hashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        Size size = this.size;
        Sizing sizing = this.sizing;
        StyleType styleType = this.styleType;
        Boolean bool = this.isDisabled;
        float f7 = this.value;
        Float f11 = this.minValue;
        Float f12 = this.maxValue;
        Float f13 = this.step;
        Boolean bool2 = this.showAsFloat;
        String str = this.subLabel;
        CustomStyle customStyle = this.customStyle;
        String str2 = this.minusIcon;
        String str3 = this.plusIcon;
        CommonControlSettings commonControlSettings = this.common;
        String str4 = this.context;
        StringBuilder sb2 = new StringBuilder("CountPickerDTO(size=");
        sb2.append(size);
        sb2.append(", sizing=");
        sb2.append(sizing);
        sb2.append(", styleType=");
        sb2.append(styleType);
        sb2.append(", isDisabled=");
        sb2.append(bool);
        sb2.append(", value=");
        sb2.append(f7);
        sb2.append(", minValue=");
        sb2.append(f11);
        sb2.append(", maxValue=");
        sb2.append(f12);
        sb2.append(", step=");
        sb2.append(f13);
        sb2.append(", showAsFloat=");
        HY.b.c(bool2, ", subLabel=", str, ", customStyle=", sb2);
        sb2.append(customStyle);
        sb2.append(", minusIcon=");
        sb2.append(str2);
        sb2.append(", plusIcon=");
        sb2.append(str3);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", context=");
        return o0.c(sb2, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Size size = this.size;
        if (size == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(size.name());
        }
        Sizing sizing = this.sizing;
        if (sizing == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizing.name());
        }
        StyleType styleType = this.styleType;
        if (styleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleType.name());
        }
        Boolean bool = this.isDisabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeFloat(this.value);
        Float f7 = this.minValue;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
        Float f11 = this.maxValue;
        if (f11 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f11);
        }
        Float f12 = this.step;
        if (f12 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f12);
        }
        Boolean bool2 = this.showAsFloat;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        dest.writeString(this.subLabel);
        CustomStyle customStyle = this.customStyle;
        if (customStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customStyle.writeToParcel(dest, flags);
        }
        dest.writeString(this.minusIcon);
        dest.writeString(this.plusIcon);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
    }

    public /* synthetic */ CountPickerDTO(Size size, Sizing sizing, StyleType styleType, Boolean bool, float f7, Float f11, Float f12, Float f13, Boolean bool2, String str, CustomStyle customStyle, String str2, String str3, CommonControlSettings commonControlSettings, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Size.SIZE_400 : size, (i11 & 2) != 0 ? Sizing.SIZING_FILL : sizing, (i11 & 4) != 0 ? StyleType.PRIMARY : styleType, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? 1.0f : f7, (i11 & 32) != 0 ? Float.valueOf(1.0f) : f11, (i11 & 64) != 0 ? Float.valueOf(9999.0f) : f12, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Float.valueOf(1.0f) : f13, (i11 & 256) != 0 ? Boolean.FALSE : bool2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : customStyle, (i11 & 2048) != 0 ? null : str2, (i11 & 4096) != 0 ? null : str3, (i11 & 8192) != 0 ? null : commonControlSettings, (i11 & 16384) != 0 ? null : str4);
    }

    public CountPickerDTO(Size size, Sizing sizing, StyleType styleType, Boolean bool, float f7, Float f11, Float f12, Float f13, Boolean bool2, String str, CustomStyle customStyle, String str2, String str3, CommonControlSettings commonControlSettings, String str4) {
        super(DsAtomsType.COUNT_PICKER, str4, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.size = size;
        this.sizing = sizing;
        this.styleType = styleType;
        this.isDisabled = bool;
        this.value = f7;
        this.minValue = f11;
        this.maxValue = f12;
        this.step = f13;
        this.showAsFloat = bool2;
        this.subLabel = str;
        this.customStyle = customStyle;
        this.minusIcon = str2;
        this.plusIcon = str3;
        this.common = commonControlSettings;
        this.context = str4;
    }
}
