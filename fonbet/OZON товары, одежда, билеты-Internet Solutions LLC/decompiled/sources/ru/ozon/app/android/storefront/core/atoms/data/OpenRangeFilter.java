package ru.ozon.app.android.storefront.core.atoms.data;

import Am.C2438a;
import B0.C2454a;
import B3.p;
import C.J;
import C.o0;
import De.C2859b;
import Kk.C3532b;
import Nh.a;
import Pk0.g;
import Ql.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010-\u001a\u00020\u0003H\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¬\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010<J\u0006\u0010=\u001a\u00020\u0003J\u0013\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\t\u0010B\u001a\u00020\u0006HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c¨\u0006H"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "Lru/ozon/uni/atoms/data/AtomDTO;", "minValue", "", "maxValue", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "symbol", "stepPower", "maxValueSign", "fromValue", "toValue", "hideSeparator", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "<init>", "(IILjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IIZLjava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "getMinValue", "()I", "getMaxValue", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSymbol", "getStepPower", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxValueSign", "getFromValue", "getToValue", "getHideSeparator", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(IILjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IIZLjava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OpenRangeFilter extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<OpenRangeFilter> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final int fromValue;
    private final boolean hideSeparator;
    private final int maxValue;
    private final String maxValueSign;
    private final int minValue;
    private final Integer stepPower;
    private final String symbol;
    private final TestInfo testInfo;
    private final String title;
    private final int toValue;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<OpenRangeFilter> {
        @Override // android.os.Parcelable.Creator
        public final OpenRangeFilter createFromParcel(Parcel parcel) {
            int i11;
            Integer num;
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(OpenRangeFilter.class.getClassLoader());
            String readString2 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int i12 = 0;
            if (parcel.readInt() != 0) {
                i11 = readInt2;
                num = valueOf;
                z11 = true;
            } else {
                i11 = readInt2;
                num = valueOf;
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt5);
                while (i12 != readInt5) {
                    int i13 = readInt5;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    i12 = C2859b.a(OpenRangeFilter.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                    linkedHashMap = linkedHashMap2;
                    readInt5 = i13;
                }
            }
            return new OpenRangeFilter(readInt, i11, readString, atomActionDTO, readString2, num, readString3, readInt3, readInt4, z11, linkedHashMap, (TestInfo) parcel.readParcelable(OpenRangeFilter.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OpenRangeFilter[] newArray(int i11) {
            return new OpenRangeFilter[i11];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OpenRangeFilter(int r17, int r18, java.lang.String r19, ru.ozon.uni.atoms.data.AtomActionDTO r20, java.lang.String r21, java.lang.Integer r22, java.lang.String r23, int r24, int r25, boolean r26, java.util.Map r27, ru.ozon.uni.atoms.data.TestInfo r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L9
            r10 = r17
            goto Lb
        L9:
            r10 = r24
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L12
            r11 = r18
            goto L14
        L12:
            r11 = r25
        L14:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1b
            r1 = 0
            r12 = r1
            goto L1d
        L1b:
            r12 = r26
        L1d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L24
            r13 = r2
            goto L26
        L24:
            r13 = r27
        L26:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2c
            r14 = r2
            goto L2e
        L2c:
            r14 = r28
        L2e:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L44
            r15 = r2
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r2 = r16
            goto L56
        L44:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
        L56:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter.<init>(int, int, java.lang.String, ru.ozon.uni.atoms.data.AtomActionDTO, java.lang.String, java.lang.Integer, java.lang.String, int, int, boolean, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ OpenRangeFilter copy$default(OpenRangeFilter openRangeFilter, int i11, int i12, String str, AtomActionDTO atomActionDTO, String str2, Integer num, String str3, int i13, int i14, boolean z11, Map map, TestInfo testInfo, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = openRangeFilter.minValue;
        }
        return openRangeFilter.copy(i11, (i15 & 2) != 0 ? openRangeFilter.maxValue : i12, (i15 & 4) != 0 ? openRangeFilter.title : str, (i15 & 8) != 0 ? openRangeFilter.action : atomActionDTO, (i15 & 16) != 0 ? openRangeFilter.symbol : str2, (i15 & 32) != 0 ? openRangeFilter.stepPower : num, (i15 & 64) != 0 ? openRangeFilter.maxValueSign : str3, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? openRangeFilter.fromValue : i13, (i15 & 256) != 0 ? openRangeFilter.toValue : i14, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? openRangeFilter.hideSeparator : z11, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? openRangeFilter.trackingInfo : map, (i15 & 2048) != 0 ? openRangeFilter.testInfo : testInfo, (i15 & 4096) != 0 ? openRangeFilter.context : str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHideSeparator() {
        return this.hideSeparator;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getStepPower() {
        return this.stepPower;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMaxValueSign() {
        return this.maxValueSign;
    }

    /* renamed from: component8, reason: from getter */
    public final int getFromValue() {
        return this.fromValue;
    }

    /* renamed from: component9, reason: from getter */
    public final int getToValue() {
        return this.toValue;
    }

    @NotNull
    public final OpenRangeFilter copy(int minValue, int maxValue, String title, AtomActionDTO action, String symbol, Integer stepPower, String maxValueSign, int fromValue, int toValue, boolean hideSeparator, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, String context) {
        return new OpenRangeFilter(minValue, maxValue, title, action, symbol, stepPower, maxValueSign, fromValue, toValue, hideSeparator, trackingInfo, testInfo, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenRangeFilter)) {
            return false;
        }
        OpenRangeFilter openRangeFilter = (OpenRangeFilter) other;
        return this.minValue == openRangeFilter.minValue && this.maxValue == openRangeFilter.maxValue && Intrinsics.d(this.title, openRangeFilter.title) && Intrinsics.d(this.action, openRangeFilter.action) && Intrinsics.d(this.symbol, openRangeFilter.symbol) && Intrinsics.d(this.stepPower, openRangeFilter.stepPower) && Intrinsics.d(this.maxValueSign, openRangeFilter.maxValueSign) && this.fromValue == openRangeFilter.fromValue && this.toValue == openRangeFilter.toValue && this.hideSeparator == openRangeFilter.hideSeparator && Intrinsics.d(this.trackingInfo, openRangeFilter.trackingInfo) && Intrinsics.d(this.testInfo, openRangeFilter.testInfo) && Intrinsics.d(this.context, openRangeFilter.context);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final int getFromValue() {
        return this.fromValue;
    }

    public final boolean getHideSeparator() {
        return this.hideSeparator;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_open_range_filter;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final String getMaxValueSign() {
        return this.maxValueSign;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final Integer getStepPower() {
        return this.stepPower;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getToValue() {
        return this.toValue;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxValue, Integer.hashCode(this.minValue) * 31, 31);
        String str = this.title;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.symbol;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.stepPower;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.maxValueSign;
        int a12 = C3532b.a(C2454a.a(this.toValue, C2454a.a(this.fromValue, (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31, this.hideSeparator);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        String str4 = this.context;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.minValue;
        int i12 = this.maxValue;
        String str = this.title;
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.symbol;
        Integer num = this.stepPower;
        String str3 = this.maxValueSign;
        int i13 = this.fromValue;
        int i14 = this.toValue;
        boolean z11 = this.hideSeparator;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        String str4 = this.context;
        StringBuilder a11 = C2438a.a("OpenRangeFilter(minValue=", i11, ", maxValue=", ", title=", i12);
        p.c(str, ", action=", ", symbol=", a11, atomActionDTO);
        C2454a.f(num, str2, ", stepPower=", ", maxValueSign=", a11);
        g.d(i13, str3, ", fromValue=", ", toValue=", a11);
        c.d(a11, i14, ", hideSeparator=", z11, ", trackingInfo=");
        a11.append(map);
        a11.append(", testInfo=");
        a11.append(testInfo);
        a11.append(", context=");
        return o0.c(a11, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.minValue);
        dest.writeInt(this.maxValue);
        dest.writeString(this.title);
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.symbol);
        Integer num = this.stepPower;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        dest.writeString(this.maxValueSign);
        dest.writeInt(this.fromValue);
        dest.writeInt(this.toValue);
        dest.writeInt(this.hideSeparator ? 1 : 0);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.testInfo, flags);
        dest.writeString(this.context);
    }

    public OpenRangeFilter(int i11, int i12, String str, AtomActionDTO atomActionDTO, String str2, Integer num, String str3, int i13, int i14, boolean z11, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, String str4) {
        super(Type.OPEN_RANGE_FILTER, str4, map, null, 8, null);
        this.minValue = i11;
        this.maxValue = i12;
        this.title = str;
        this.action = atomActionDTO;
        this.symbol = str2;
        this.stepPower = num;
        this.maxValueSign = str3;
        this.fromValue = i13;
        this.toValue = i14;
        this.hideSeparator = z11;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.context = str4;
    }
}
