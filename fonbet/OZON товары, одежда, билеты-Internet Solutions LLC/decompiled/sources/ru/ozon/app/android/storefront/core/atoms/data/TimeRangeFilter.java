package ru.ozon.app.android.storefront.core.atoms.data;

import B0.C2454a;
import B4.V;
import Bl.C2639a;
import C.J;
import De.C2859b;
import Ek.a;
import Ql.c;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010)\u001a\u00020\u0007H\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J¦\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u00020\u0007J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0007HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006D"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;", "Lru/ozon/uni/atoms/data/AtomDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "minValue", "", "maxValue", "fromValue", "toValue", "step", "format", "inputMask", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMinValue", "()I", "getMaxValue", "getFromValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToValue", "getStep", "getFormat", "getInputMask", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/storefront/core/atoms/data/TimeRangeFilter;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TimeRangeFilter extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<TimeRangeFilter> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final String format;
    private final Integer fromValue;
    private final String inputMask;
    private final int maxValue;
    private final int minValue;
    private final Integer step;
    private final TestInfo testInfo;
    private final String title;
    private final Integer toValue;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<TimeRangeFilter> {
        @Override // android.os.Parcelable.Creator
        public final TimeRangeFilter createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel2.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(TimeRangeFilter.class.getClassLoader());
            int readInt = parcel2.readInt();
            int readInt2 = parcel2.readInt();
            LinkedHashMap linkedHashMap = null;
            Integer valueOf = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            String readString2 = parcel2.readString();
            Integer num = valueOf;
            String readString3 = parcel2.readString();
            Integer num2 = valueOf2;
            String readString4 = parcel2.readString();
            TestInfo testInfo = (TestInfo) parcel2.readParcelable(TimeRangeFilter.class.getClassLoader());
            if (parcel2.readInt() != 0) {
                int readInt3 = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt3);
                int i11 = 0;
                while (i11 != readInt3) {
                    int i12 = readInt3;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    i11 = C2859b.a(TimeRangeFilter.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    linkedHashMap = linkedHashMap2;
                    readInt3 = i12;
                }
            }
            return new TimeRangeFilter(readString, atomActionDTO, readInt, readInt2, num, num2, valueOf3, readString2, readString3, readString4, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeRangeFilter[] newArray(int i11) {
            return new TimeRangeFilter[i11];
        }
    }

    public /* synthetic */ TimeRangeFilter(String str, AtomActionDTO atomActionDTO, int i11, int i12, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, TestInfo testInfo, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, atomActionDTO, i11, i12, num, num2, num3, str2, str3, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str4, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i13 & 2048) != 0 ? null : map);
    }

    public static /* synthetic */ TimeRangeFilter copy$default(TimeRangeFilter timeRangeFilter, String str, AtomActionDTO atomActionDTO, int i11, int i12, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, TestInfo testInfo, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = timeRangeFilter.title;
        }
        if ((i13 & 2) != 0) {
            atomActionDTO = timeRangeFilter.action;
        }
        if ((i13 & 4) != 0) {
            i11 = timeRangeFilter.minValue;
        }
        if ((i13 & 8) != 0) {
            i12 = timeRangeFilter.maxValue;
        }
        if ((i13 & 16) != 0) {
            num = timeRangeFilter.fromValue;
        }
        if ((i13 & 32) != 0) {
            num2 = timeRangeFilter.toValue;
        }
        if ((i13 & 64) != 0) {
            num3 = timeRangeFilter.step;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str2 = timeRangeFilter.format;
        }
        if ((i13 & 256) != 0) {
            str3 = timeRangeFilter.inputMask;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str4 = timeRangeFilter.context;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = timeRangeFilter.testInfo;
        }
        if ((i13 & 2048) != 0) {
            map = timeRangeFilter.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str5 = str3;
        String str6 = str4;
        Integer num4 = num3;
        String str7 = str2;
        Integer num5 = num;
        Integer num6 = num2;
        return timeRangeFilter.copy(str, atomActionDTO, i11, i12, num5, num6, num4, str7, str5, str6, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
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
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getFromValue() {
        return this.fromValue;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getToValue() {
        return this.toValue;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getStep() {
        return this.step;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInputMask() {
        return this.inputMask;
    }

    @NotNull
    public final TimeRangeFilter copy(String title, AtomActionDTO action, int minValue, int maxValue, Integer fromValue, Integer toValue, Integer step, String format, String inputMask, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new TimeRangeFilter(title, action, minValue, maxValue, fromValue, toValue, step, format, inputMask, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeRangeFilter)) {
            return false;
        }
        TimeRangeFilter timeRangeFilter = (TimeRangeFilter) other;
        return Intrinsics.d(this.title, timeRangeFilter.title) && Intrinsics.d(this.action, timeRangeFilter.action) && this.minValue == timeRangeFilter.minValue && this.maxValue == timeRangeFilter.maxValue && Intrinsics.d(this.fromValue, timeRangeFilter.fromValue) && Intrinsics.d(this.toValue, timeRangeFilter.toValue) && Intrinsics.d(this.step, timeRangeFilter.step) && Intrinsics.d(this.format, timeRangeFilter.format) && Intrinsics.d(this.inputMask, timeRangeFilter.inputMask) && Intrinsics.d(this.context, timeRangeFilter.context) && Intrinsics.d(this.testInfo, timeRangeFilter.testInfo) && Intrinsics.d(this.trackingInfo, timeRangeFilter.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getFromValue() {
        return this.fromValue;
    }

    public final String getInputMask() {
        return this.inputMask;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_time_range_filter;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final Integer getStep() {
        return this.step;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getToValue() {
        return this.toValue;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int a11 = C2454a.a(this.maxValue, C2454a.a(this.minValue, (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31), 31);
        Integer num = this.fromValue;
        int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.toValue;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.step;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.format;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inputMask;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.context;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        AtomActionDTO atomActionDTO = this.action;
        int i11 = this.minValue;
        int i12 = this.maxValue;
        Integer num = this.fromValue;
        Integer num2 = this.toValue;
        Integer num3 = this.step;
        String str2 = this.format;
        String str3 = this.inputMask;
        String str4 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = c.c("TimeRangeFilter(title=", str, ", action=", atomActionDTO, ", minValue=");
        a.f(i11, i12, ", maxValue=", ", fromValue=", c11);
        Ef0.c.e(c11, num, ", toValue=", num2, ", step=");
        V.f(num3, ", format=", str2, ", inputMask=", c11);
        Nh.a.h(c11, str3, ", context=", str4, ", testInfo=");
        return C2639a.a(", trackingInfo=", ")", c11, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeParcelable(this.action, flags);
        dest.writeInt(this.minValue);
        dest.writeInt(this.maxValue);
        Integer num = this.fromValue;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Integer num2 = this.toValue;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        Integer num3 = this.step;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        dest.writeString(this.format);
        dest.writeString(this.inputMask);
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

    public TimeRangeFilter(String str, AtomActionDTO atomActionDTO, int i11, int i12, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.TIME_RANGE_FILTER, str4, map, null, 8, null);
        this.title = str;
        this.action = atomActionDTO;
        this.minValue = i11;
        this.maxValue = i12;
        this.fromValue = num;
        this.toValue = num2;
        this.step = num3;
        this.format = str2;
        this.inputMask = str3;
        this.context = str4;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
