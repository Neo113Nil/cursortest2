package ru.ozon.app.android.atoms.data.gradient;

import C.J;
import De.C2859b;
import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000267Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001f\u001a\u00020 H\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jo\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010*\u001a\u00020 J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020 HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lru/ozon/app/android/atoms/data/gradient/GradientAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "backgroundColor", "", "gradientFromColor", "gradientToColor", "cornerStyle", "Lru/ozon/app/android/atoms/data/gradient/GradientAtom$CornerStyle;", "gradientType", "Lru/ozon/app/android/atoms/data/gradient/GradientAtom$GradientType;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/gradient/GradientAtom$CornerStyle;Lru/ozon/app/android/atoms/data/gradient/GradientAtom$GradientType;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBackgroundColor", "()Ljava/lang/String;", "getGradientFromColor", "getGradientToColor", "getCornerStyle", "()Lru/ozon/app/android/atoms/data/gradient/GradientAtom$CornerStyle;", "getGradientType", "()Lru/ozon/app/android/atoms/data/gradient/GradientAtom$GradientType;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "GradientType", "CornerStyle", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GradientAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<GradientAtom> CREATOR = new Creator();
    private final String backgroundColor;
    private final String context;
    private final CornerStyle cornerStyle;

    @NotNull
    private final String gradientFromColor;

    @NotNull
    private final String gradientToColor;

    @NotNull
    private final GradientType gradientType;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/gradient/GradientAtom$CornerStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ROUNDED", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CornerStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CornerStyle[] $VALUES;

        @i(name = "CORNER_STYLE_DEFAULT")
        public static final CornerStyle DEFAULT = new CornerStyle("DEFAULT", 0);

        @i(name = "CORNER_STYLE_ROUNDED")
        public static final CornerStyle ROUNDED = new CornerStyle("ROUNDED", 1);

        private static final /* synthetic */ CornerStyle[] $values() {
            return new CornerStyle[]{DEFAULT, ROUNDED};
        }

        static {
            CornerStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CornerStyle(String str, int i11) {
        }

        @NotNull
        public static a<CornerStyle> getEntries() {
            return $ENTRIES;
        }

        public static CornerStyle valueOf(String str) {
            return (CornerStyle) Enum.valueOf(CornerStyle.class, str);
        }

        public static CornerStyle[] values() {
            return (CornerStyle[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GradientAtom> {
        @Override // android.os.Parcelable.Creator
        public final GradientAtom createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            CornerStyle valueOf = parcel.readInt() == 0 ? null : CornerStyle.valueOf(parcel.readString());
            GradientType valueOf2 = GradientType.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(GradientAtom.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new GradientAtom(readString, readString2, readString3, valueOf, valueOf2, readString4, linkedHashMap, (TestInfo) parcel.readParcelable(GradientAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GradientAtom[] newArray(int i11) {
            return new GradientAtom[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/atoms/data/gradient/GradientAtom$GradientType;", "", "<init>", "(Ljava/lang/String;I)V", "GRADIENT_DIRECTION_TOP_BOTTOM", "GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM", "GRADIENT_DIRECTION_RIGHT_LEFT", "GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT", "GRADIENT_DIRECTION_BOTTOM_TOP", "GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT", "GRADIENT_DIRECTION_LEFT_RIGHT", "GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GradientType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ GradientType[] $VALUES;

        @i(name = "GRADIENT_DIRECTION_TOP_BOTTOM")
        public static final GradientType GRADIENT_DIRECTION_TOP_BOTTOM = new GradientType("GRADIENT_DIRECTION_TOP_BOTTOM", 0);

        @i(name = "GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM")
        public static final GradientType GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM = new GradientType("GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM", 1);

        @i(name = "GRADIENT_DIRECTION_RIGHT_LEFT")
        public static final GradientType GRADIENT_DIRECTION_RIGHT_LEFT = new GradientType("GRADIENT_DIRECTION_RIGHT_LEFT", 2);

        @i(name = "GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT")
        public static final GradientType GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT = new GradientType("GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT", 3);

        @i(name = "GRADIENT_DIRECTION_BOTTOM_TOP")
        public static final GradientType GRADIENT_DIRECTION_BOTTOM_TOP = new GradientType("GRADIENT_DIRECTION_BOTTOM_TOP", 4);

        @i(name = "GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT")
        public static final GradientType GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT = new GradientType("GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT", 5);

        @i(name = "GRADIENT_DIRECTION_LEFT_RIGHT")
        public static final GradientType GRADIENT_DIRECTION_LEFT_RIGHT = new GradientType("GRADIENT_DIRECTION_LEFT_RIGHT", 6);

        @i(name = "GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT")
        public static final GradientType GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT = new GradientType("GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT", 7);

        private static final /* synthetic */ GradientType[] $values() {
            return new GradientType[]{GRADIENT_DIRECTION_TOP_BOTTOM, GRADIENT_DIRECTION_TOP_RIGHT_LEFT_BOTTOM, GRADIENT_DIRECTION_RIGHT_LEFT, GRADIENT_DIRECTION_BOTTOM_RIGHT_TOP_LEFT, GRADIENT_DIRECTION_BOTTOM_TOP, GRADIENT_DIRECTION_BOTTOM_LEFT_TOP_RIGHT, GRADIENT_DIRECTION_LEFT_RIGHT, GRADIENT_DIRECTION_TOP_LEFT_BOTTOM_RIGHT};
        }

        static {
            GradientType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private GradientType(String str, int i11) {
        }

        @NotNull
        public static a<GradientType> getEntries() {
            return $ENTRIES;
        }

        public static GradientType valueOf(String str) {
            return (GradientType) Enum.valueOf(GradientType.class, str);
        }

        public static GradientType[] values() {
            return (GradientType[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GradientAtom(java.lang.String r12, java.lang.String r13, java.lang.String r14, ru.ozon.app.android.atoms.data.gradient.GradientAtom.CornerStyle r15, ru.ozon.app.android.atoms.data.gradient.GradientAtom.GradientType r16, java.lang.String r17, java.util.Map r18, ru.ozon.uni.atoms.data.TestInfo r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 16
            if (r1 == 0) goto La
            ru.ozon.app.android.atoms.data.gradient.GradientAtom$GradientType r1 = ru.ozon.app.android.atoms.data.gradient.GradientAtom.GradientType.GRADIENT_DIRECTION_TOP_BOTTOM
            r7 = r1
            goto Lc
        La:
            r7 = r16
        Lc:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L13
            r8 = r2
            goto L15
        L13:
            r8 = r17
        L15:
            r1 = r0 & 64
            if (r1 == 0) goto L1b
            r9 = r2
            goto L1d
        L1b:
            r9 = r18
        L1d:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L28
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2 = r11
            goto L2f
        L28:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
        L2f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.gradient.GradientAtom.<init>(java.lang.String, java.lang.String, java.lang.String, ru.ozon.app.android.atoms.data.gradient.GradientAtom$CornerStyle, ru.ozon.app.android.atoms.data.gradient.GradientAtom$GradientType, java.lang.String, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ GradientAtom copy$default(GradientAtom gradientAtom, String str, String str2, String str3, CornerStyle cornerStyle, GradientType gradientType, String str4, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gradientAtom.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = gradientAtom.gradientFromColor;
        }
        if ((i11 & 4) != 0) {
            str3 = gradientAtom.gradientToColor;
        }
        if ((i11 & 8) != 0) {
            cornerStyle = gradientAtom.cornerStyle;
        }
        if ((i11 & 16) != 0) {
            gradientType = gradientAtom.gradientType;
        }
        if ((i11 & 32) != 0) {
            str4 = gradientAtom.context;
        }
        if ((i11 & 64) != 0) {
            map = gradientAtom.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = gradientAtom.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        GradientType gradientType2 = gradientType;
        String str5 = str4;
        return gradientAtom.copy(str, str2, str3, cornerStyle, gradientType2, str5, map2, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGradientFromColor() {
        return this.gradientFromColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getGradientToColor() {
        return this.gradientToColor;
    }

    /* renamed from: component4, reason: from getter */
    public final CornerStyle getCornerStyle() {
        return this.cornerStyle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final GradientType getGradientType() {
        return this.gradientType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final GradientAtom copy(String backgroundColor, @NotNull String gradientFromColor, @NotNull String gradientToColor, CornerStyle cornerStyle, @NotNull GradientType gradientType, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(gradientFromColor, "gradientFromColor");
        Intrinsics.checkNotNullParameter(gradientToColor, "gradientToColor");
        Intrinsics.checkNotNullParameter(gradientType, "gradientType");
        return new GradientAtom(backgroundColor, gradientFromColor, gradientToColor, cornerStyle, gradientType, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientAtom)) {
            return false;
        }
        GradientAtom gradientAtom = (GradientAtom) other;
        return Intrinsics.d(this.backgroundColor, gradientAtom.backgroundColor) && Intrinsics.d(this.gradientFromColor, gradientAtom.gradientFromColor) && Intrinsics.d(this.gradientToColor, gradientAtom.gradientToColor) && this.cornerStyle == gradientAtom.cornerStyle && this.gradientType == gradientAtom.gradientType && Intrinsics.d(this.context, gradientAtom.context) && Intrinsics.d(this.trackingInfo, gradientAtom.trackingInfo) && Intrinsics.d(this.testInfo, gradientAtom.testInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CornerStyle getCornerStyle() {
        return this.cornerStyle;
    }

    @NotNull
    public final String getGradientFromColor() {
        return this.gradientFromColor;
    }

    @NotNull
    public final String getGradientToColor() {
        return this.gradientToColor;
    }

    @NotNull
    public final GradientType getGradientType() {
        return this.gradientType;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_gradient;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int a11 = g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.gradientFromColor), 31, this.gradientToColor);
        CornerStyle cornerStyle = this.cornerStyle;
        int hashCode = (this.gradientType.hashCode() + ((a11 + (cornerStyle == null ? 0 : cornerStyle.hashCode())) * 31)) * 31;
        String str2 = this.context;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.gradientFromColor;
        String str3 = this.gradientToColor;
        CornerStyle cornerStyle = this.cornerStyle;
        GradientType gradientType = this.gradientType;
        String str4 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("GradientAtom(backgroundColor=", str, ", gradientFromColor=", str2, ", gradientToColor=");
        d11.append(str3);
        d11.append(", cornerStyle=");
        d11.append(cornerStyle);
        d11.append(", gradientType=");
        d11.append(gradientType);
        d11.append(", context=");
        d11.append(str4);
        d11.append(", trackingInfo=");
        return Ns.b.b(", testInfo=", ")", d11, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.backgroundColor);
        dest.writeString(this.gradientFromColor);
        dest.writeString(this.gradientToColor);
        CornerStyle cornerStyle = this.cornerStyle;
        if (cornerStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cornerStyle.name());
        }
        dest.writeString(this.gradientType.name());
        dest.writeString(this.context);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientAtom(String str, @NotNull String gradientFromColor, @NotNull String gradientToColor, CornerStyle cornerStyle, @NotNull GradientType gradientType, String str2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.GRADIENT, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(gradientFromColor, "gradientFromColor");
        Intrinsics.checkNotNullParameter(gradientToColor, "gradientToColor");
        Intrinsics.checkNotNullParameter(gradientType, "gradientType");
        this.backgroundColor = str;
        this.gradientFromColor = gradientFromColor;
        this.gradientToColor = gradientToColor;
        this.cornerStyle = cornerStyle;
        this.gradientType = gradientType;
        this.context = str2;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
