package ru.ozon.app.android.storefront.core.atoms.data;

import B3.p;
import Bl.C2639a;
import C.J;
import D40.c;
import De.C2859b;
import Pk0.b;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010,\u001a\u00020-H\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J¦\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020-J\u0013\u0010=\u001a\u00020\u000e2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020-HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006G"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "Lru/ozon/uni/atoms/data/AtomDTO;", "minValue", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "maxValue", "fromValue", "toValue", "step", "units", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideSlider", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(FLjava/lang/String;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getMinValue", "()F", "getTitle", "()Ljava/lang/String;", "getMaxValue", "getFromValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getToValue", "getStep", "getUnits", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideSlider", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(FLjava/lang/String;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RangeFilter extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<RangeFilter> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final Float fromValue;
    private final Boolean hideSlider;
    private final float maxValue;
    private final float minValue;
    private final Float step;
    private final TestInfo testInfo;
    private final String title;
    private final Float toValue;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String units;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<RangeFilter> {
        @Override // android.os.Parcelable.Creator
        public final RangeFilter createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            float readFloat = parcel2.readFloat();
            String readString = parcel2.readString();
            float readFloat2 = parcel2.readFloat();
            LinkedHashMap linkedHashMap = null;
            Float valueOf2 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            Float valueOf3 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            Float valueOf4 = parcel2.readInt() == 0 ? null : Float.valueOf(parcel2.readFloat());
            String readString2 = parcel2.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(RangeFilter.class.getClassLoader());
            int i11 = 0;
            if (parcel2.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel2.readInt() != 0);
            }
            Float f7 = valueOf4;
            String readString3 = parcel2.readString();
            TestInfo testInfo = (TestInfo) parcel2.readParcelable(RangeFilter.class.getClassLoader());
            if (parcel2.readInt() != 0) {
                int readInt = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i11 != readInt) {
                    int i12 = readInt;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    i11 = C2859b.a(RangeFilter.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    linkedHashMap2 = linkedHashMap3;
                    readInt = i12;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RangeFilter(readFloat, readString, readFloat2, valueOf2, valueOf3, f7, readString2, atomActionDTO, valueOf, readString3, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RangeFilter[] newArray(int i11) {
            return new RangeFilter[i11];
        }
    }

    public /* synthetic */ RangeFilter(float f7, String str, float f11, Float f12, Float f13, Float f14, String str2, AtomActionDTO atomActionDTO, Boolean bool, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, str, f11, f12, f13, f14, str2, atomActionDTO, bool, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : map);
    }

    public static /* synthetic */ RangeFilter copy$default(RangeFilter rangeFilter, float f7, String str, float f11, Float f12, Float f13, Float f14, String str2, AtomActionDTO atomActionDTO, Boolean bool, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f7 = rangeFilter.minValue;
        }
        if ((i11 & 2) != 0) {
            str = rangeFilter.title;
        }
        if ((i11 & 4) != 0) {
            f11 = rangeFilter.maxValue;
        }
        if ((i11 & 8) != 0) {
            f12 = rangeFilter.fromValue;
        }
        if ((i11 & 16) != 0) {
            f13 = rangeFilter.toValue;
        }
        if ((i11 & 32) != 0) {
            f14 = rangeFilter.step;
        }
        if ((i11 & 64) != 0) {
            str2 = rangeFilter.units;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO = rangeFilter.action;
        }
        if ((i11 & 256) != 0) {
            bool = rangeFilter.hideSlider;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str3 = rangeFilter.context;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = rangeFilter.testInfo;
        }
        if ((i11 & 2048) != 0) {
            map = rangeFilter.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        Boolean bool2 = bool;
        String str4 = str3;
        String str5 = str2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Float f15 = f13;
        Float f16 = f14;
        return rangeFilter.copy(f7, str, f11, f12, f15, f16, str5, atomActionDTO2, bool2, str4, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    /* renamed from: component10, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component11, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getFromValue() {
        return this.fromValue;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getToValue() {
        return this.toValue;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getStep() {
        return this.step;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getHideSlider() {
        return this.hideSlider;
    }

    @NotNull
    public final RangeFilter copy(float minValue, String title, float maxValue, Float fromValue, Float toValue, Float step, String units, AtomActionDTO action, Boolean hideSlider, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new RangeFilter(minValue, title, maxValue, fromValue, toValue, step, units, action, hideSlider, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeFilter)) {
            return false;
        }
        RangeFilter rangeFilter = (RangeFilter) other;
        return Float.compare(this.minValue, rangeFilter.minValue) == 0 && Intrinsics.d(this.title, rangeFilter.title) && Float.compare(this.maxValue, rangeFilter.maxValue) == 0 && Intrinsics.d(this.fromValue, rangeFilter.fromValue) && Intrinsics.d(this.toValue, rangeFilter.toValue) && Intrinsics.d(this.step, rangeFilter.step) && Intrinsics.d(this.units, rangeFilter.units) && Intrinsics.d(this.action, rangeFilter.action) && Intrinsics.d(this.hideSlider, rangeFilter.hideSlider) && Intrinsics.d(this.context, rangeFilter.context) && Intrinsics.d(this.testInfo, rangeFilter.testInfo) && Intrinsics.d(this.trackingInfo, rangeFilter.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Float getFromValue() {
        return this.fromValue;
    }

    public final Boolean getHideSlider() {
        return this.hideSlider;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_range_filter;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final Float getStep() {
        return this.step;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Float getToValue() {
        return this.toValue;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getUnits() {
        return this.units;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.minValue) * 31;
        String str = this.title;
        int a11 = b.a(this.maxValue, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Float f7 = this.fromValue;
        int hashCode2 = (a11 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f11 = this.toValue;
        int hashCode3 = (hashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.step;
        int hashCode4 = (hashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str2 = this.units;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Boolean bool = this.hideSlider;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.context;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode9 = (hashCode8 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode9 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        float f7 = this.minValue;
        String str = this.title;
        float f11 = this.maxValue;
        Float f12 = this.fromValue;
        Float f13 = this.toValue;
        Float f14 = this.step;
        String str2 = this.units;
        AtomActionDTO atomActionDTO = this.action;
        Boolean bool = this.hideSlider;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("RangeFilter(minValue=");
        sb2.append(f7);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", maxValue=");
        sb2.append(f11);
        sb2.append(", fromValue=");
        sb2.append(f12);
        sb2.append(", toValue=");
        sb2.append(f13);
        sb2.append(", step=");
        sb2.append(f14);
        sb2.append(", units=");
        p.c(str2, ", action=", ", hideSlider=", sb2, atomActionDTO);
        HY.b.c(bool, ", context=", str3, ", testInfo=", sb2);
        return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.minValue);
        dest.writeString(this.title);
        dest.writeFloat(this.maxValue);
        Float f7 = this.fromValue;
        if (f7 == null) {
            dest.writeInt(0);
        } else {
            Om.b(dest, 1, f7);
        }
        Float f11 = this.toValue;
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
        dest.writeString(this.units);
        dest.writeParcelable(this.action, flags);
        Boolean bool = this.hideSlider;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    public RangeFilter(float f7, String str, float f11, Float f12, Float f13, Float f14, String str2, AtomActionDTO atomActionDTO, Boolean bool, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.RANGE_FILTER, str3, map, null, 8, null);
        this.minValue = f7;
        this.title = str;
        this.maxValue = f11;
        this.fromValue = f12;
        this.toValue = f13;
        this.step = f14;
        this.units = str2;
        this.action = atomActionDTO;
        this.hideSlider = bool;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
