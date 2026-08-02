package ru.ozon.app.android.atoms.data.gradientbadge;

import C.J;
import De.C2859b;
import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001CB\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J§\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0006\u00107\u001a\u00020(J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020(HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006D"}, d2 = {"Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge;", "Lru/ozon/uni/atoms/data/AtomDTO;", "primaryText", "", "primaryTextColor", "primaryTextBackgroundColor", "secondaryText", "secondaryTextColor", "tertiaryText", "tertiaryTextColor", "gradientStart", "gradientEnd", "theme", "Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge$ThemeType;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge$ThemeType;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getPrimaryText", "()Ljava/lang/String;", "getPrimaryTextColor", "getPrimaryTextBackgroundColor", "getSecondaryText", "getSecondaryTextColor", "getTertiaryText", "getTertiaryTextColor", "getGradientStart", "getGradientEnd", "getTheme", "()Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge$ThemeType;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ThemeType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GradientBadge extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<GradientBadge> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final String gradientEnd;

    @NotNull
    private final String gradientStart;

    @NotNull
    private final String primaryText;
    private final String primaryTextBackgroundColor;

    @NotNull
    private final String primaryTextColor;

    @NotNull
    private final String secondaryText;
    private final String secondaryTextColor;
    private final String tertiaryText;
    private final String tertiaryTextColor;
    private final TestInfo testInfo;
    private final ThemeType theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<GradientBadge> {
        @Override // android.os.Parcelable.Creator
        public final GradientBadge createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            String readString3 = parcel2.readString();
            String readString4 = parcel2.readString();
            String readString5 = parcel2.readString();
            String readString6 = parcel2.readString();
            String readString7 = parcel2.readString();
            String readString8 = parcel2.readString();
            String readString9 = parcel2.readString();
            LinkedHashMap linkedHashMap = null;
            ThemeType valueOf = parcel2.readInt() == 0 ? null : ThemeType.valueOf(parcel2.readString());
            String readString10 = parcel2.readString();
            TestInfo testInfo = (TestInfo) parcel2.readParcelable(GradientBadge.class.getClassLoader());
            if (parcel2.readInt() != 0) {
                int readInt = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    int i12 = readInt;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    i11 = C2859b.a(GradientBadge.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    linkedHashMap2 = linkedHashMap3;
                    readInt = i12;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new GradientBadge(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, valueOf, readString10, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final GradientBadge[] newArray(int i11) {
            return new GradientBadge[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/gradientbadge/GradientBadge$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_S", "THEME_TYPE_M", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;

        @i(name = "THEME_TYPE_INVALID")
        public static final ThemeType THEME_TYPE_INVALID = new ThemeType("THEME_TYPE_INVALID", 0);

        @i(name = "THEME_TYPE_S")
        public static final ThemeType THEME_TYPE_S = new ThemeType("THEME_TYPE_S", 1);

        @i(name = "THEME_TYPE_M")
        public static final ThemeType THEME_TYPE_M = new ThemeType("THEME_TYPE_M", 2);

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_INVALID, THEME_TYPE_S, THEME_TYPE_M};
        }

        static {
            ThemeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ThemeType(String str, int i11) {
        }

        @NotNull
        public static a<ThemeType> getEntries() {
            return $ENTRIES;
        }

        public static ThemeType valueOf(String str) {
            return (ThemeType) Enum.valueOf(ThemeType.class, str);
        }

        public static ThemeType[] values() {
            return (ThemeType[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GradientBadge(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge.ThemeType r26, java.lang.String r27, ru.ozon.uni.atoms.data.TestInfo r28, java.util.Map r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 4
            if (r1 == 0) goto Le
            ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY
            java.lang.String r1 = r1.getValue()
            r5 = r1
            goto L10
        Le:
            r5 = r19
        L10:
            r1 = r0 & 8
            if (r1 == 0) goto L18
            java.lang.String r1 = ""
            r6 = r1
            goto L1a
        L18:
            r6 = r20
        L1a:
            r1 = r0 & 16
            if (r1 == 0) goto L26
            ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE
            java.lang.String r1 = r1.getValue()
            r7 = r1
            goto L28
        L26:
            r7 = r21
        L28:
            r1 = r0 & 64
            if (r1 == 0) goto L34
            ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_CREDIT
            java.lang.String r1 = r1.getValue()
            r9 = r1
            goto L36
        L34:
            r9 = r23
        L36:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L3d
            r13 = r2
            goto L3f
        L3d:
            r13 = r27
        L3f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L45
            r14 = r2
            goto L47
        L45:
            r14 = r28
        L47:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L5b
            r15 = r2
            r3 = r17
            r4 = r18
            r8 = r22
            r10 = r24
            r11 = r25
            r12 = r26
            r2 = r16
            goto L6b
        L5b:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
            r8 = r22
            r10 = r24
            r11 = r25
            r12 = r26
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.app.android.atoms.data.gradientbadge.GradientBadge$ThemeType, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ GradientBadge copy$default(GradientBadge gradientBadge, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ThemeType themeType, String str10, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gradientBadge.primaryText;
        }
        return gradientBadge.copy(str, (i11 & 2) != 0 ? gradientBadge.primaryTextColor : str2, (i11 & 4) != 0 ? gradientBadge.primaryTextBackgroundColor : str3, (i11 & 8) != 0 ? gradientBadge.secondaryText : str4, (i11 & 16) != 0 ? gradientBadge.secondaryTextColor : str5, (i11 & 32) != 0 ? gradientBadge.tertiaryText : str6, (i11 & 64) != 0 ? gradientBadge.tertiaryTextColor : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? gradientBadge.gradientStart : str8, (i11 & 256) != 0 ? gradientBadge.gradientEnd : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? gradientBadge.theme : themeType, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? gradientBadge.context : str10, (i11 & 2048) != 0 ? gradientBadge.testInfo : testInfo, (i11 & 4096) != 0 ? gradientBadge.trackingInfo : map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component10, reason: from getter */
    public final ThemeType getTheme() {
        return this.theme;
    }

    /* renamed from: component11, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component12, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrimaryTextBackgroundColor() {
        return this.primaryTextBackgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTertiaryText() {
        return this.tertiaryText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTertiaryTextColor() {
        return this.tertiaryTextColor;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getGradientStart() {
        return this.gradientStart;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getGradientEnd() {
        return this.gradientEnd;
    }

    @NotNull
    public final GradientBadge copy(@NotNull String primaryText, @NotNull String primaryTextColor, String primaryTextBackgroundColor, @NotNull String secondaryText, String secondaryTextColor, String tertiaryText, String tertiaryTextColor, @NotNull String gradientStart, @NotNull String gradientEnd, ThemeType theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(primaryTextColor, "primaryTextColor");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(gradientStart, "gradientStart");
        Intrinsics.checkNotNullParameter(gradientEnd, "gradientEnd");
        return new GradientBadge(primaryText, primaryTextColor, primaryTextBackgroundColor, secondaryText, secondaryTextColor, tertiaryText, tertiaryTextColor, gradientStart, gradientEnd, theme, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientBadge)) {
            return false;
        }
        GradientBadge gradientBadge = (GradientBadge) other;
        return Intrinsics.d(this.primaryText, gradientBadge.primaryText) && Intrinsics.d(this.primaryTextColor, gradientBadge.primaryTextColor) && Intrinsics.d(this.primaryTextBackgroundColor, gradientBadge.primaryTextBackgroundColor) && Intrinsics.d(this.secondaryText, gradientBadge.secondaryText) && Intrinsics.d(this.secondaryTextColor, gradientBadge.secondaryTextColor) && Intrinsics.d(this.tertiaryText, gradientBadge.tertiaryText) && Intrinsics.d(this.tertiaryTextColor, gradientBadge.tertiaryTextColor) && Intrinsics.d(this.gradientStart, gradientBadge.gradientStart) && Intrinsics.d(this.gradientEnd, gradientBadge.gradientEnd) && this.theme == gradientBadge.theme && Intrinsics.d(this.context, gradientBadge.context) && Intrinsics.d(this.testInfo, gradientBadge.testInfo) && Intrinsics.d(this.trackingInfo, gradientBadge.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @NotNull
    public final String getGradientEnd() {
        return this.gradientEnd;
    }

    @NotNull
    public final String getGradientStart() {
        return this.gradientStart;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_gradient_badge;
    }

    @NotNull
    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getPrimaryTextBackgroundColor() {
        return this.primaryTextBackgroundColor;
    }

    @NotNull
    public final String getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    @NotNull
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final String getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    public final String getTertiaryText() {
        return this.tertiaryText;
    }

    public final String getTertiaryTextColor() {
        return this.tertiaryTextColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final ThemeType getTheme() {
        return this.theme;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.primaryText.hashCode() * 31, 31, this.primaryTextColor);
        String str = this.primaryTextBackgroundColor;
        int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.secondaryText);
        String str2 = this.secondaryTextColor;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tertiaryText;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tertiaryTextColor;
        int a13 = g.a(g.a((hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.gradientStart), 31, this.gradientEnd);
        ThemeType themeType = this.theme;
        int hashCode3 = (a13 + (themeType == null ? 0 : themeType.hashCode())) * 31;
        String str5 = this.context;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.primaryText;
        String str2 = this.primaryTextColor;
        String str3 = this.primaryTextBackgroundColor;
        String str4 = this.secondaryText;
        String str5 = this.secondaryTextColor;
        String str6 = this.tertiaryText;
        String str7 = this.tertiaryTextColor;
        String str8 = this.gradientStart;
        String str9 = this.gradientEnd;
        ThemeType themeType = this.theme;
        String str10 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("GradientBadge(primaryText=", str, ", primaryTextColor=", str2, ", primaryTextBackgroundColor=");
        Nh.a.h(d11, str3, ", secondaryText=", str4, ", secondaryTextColor=");
        Nh.a.h(d11, str5, ", tertiaryText=", str6, ", tertiaryTextColor=");
        Nh.a.h(d11, str7, ", gradientStart=", str8, ", gradientEnd=");
        d11.append(str9);
        d11.append(", theme=");
        d11.append(themeType);
        d11.append(", context=");
        C4070a.b(d11, str10, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(d11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.primaryText);
        dest.writeString(this.primaryTextColor);
        dest.writeString(this.primaryTextBackgroundColor);
        dest.writeString(this.secondaryText);
        dest.writeString(this.secondaryTextColor);
        dest.writeString(this.tertiaryText);
        dest.writeString(this.tertiaryTextColor);
        dest.writeString(this.gradientStart);
        dest.writeString(this.gradientEnd);
        ThemeType themeType = this.theme;
        if (themeType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(themeType.name());
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientBadge(@NotNull String primaryText, @NotNull String primaryTextColor, String str, @NotNull String secondaryText, String str2, String str3, String str4, @NotNull String gradientStart, @NotNull String gradientEnd, ThemeType themeType, String str5, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.GRADIENT_BADGE, str5, map, testInfo);
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(primaryTextColor, "primaryTextColor");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(gradientStart, "gradientStart");
        Intrinsics.checkNotNullParameter(gradientEnd, "gradientEnd");
        this.primaryText = primaryText;
        this.primaryTextColor = primaryTextColor;
        this.primaryTextBackgroundColor = str;
        this.secondaryText = secondaryText;
        this.secondaryTextColor = str2;
        this.tertiaryText = str3;
        this.tertiaryTextColor = str4;
        this.gradientStart = gradientStart;
        this.gradientEnd = gradientEnd;
        this.theme = themeType;
        this.context = str5;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
