package ru.ozon.app.android.atoms.data.badge;

import B0.C2454a;
import Bl.C2639a;
import C.J;
import D40.c;
import De.C2859b;
import G.g;
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
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GB\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010-\u001a\u00020\u0005H\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J¤\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020\u0005J\u0013\u0010=\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\t\u0010A\u001a\u00020\tHÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\f\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006H"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/MultilineBadge;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "maxLines", "", "theme", "Lru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isFullWidth", "", "icon", "iconTintColor", "textStyle", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ILru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMaxLines", "()I", "getTheme", "()Lru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "getIconTintColor", "getTextStyle", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ILru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/badge/MultilineBadge;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ThemeType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MultilineBadge extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<MultilineBadge> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final String context;
    private final String icon;
    private final String iconTintColor;
    private final Boolean isFullWidth;
    private final int maxLines;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;

    @NotNull
    private final String textStyle;
    private final ThemeType theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<MultilineBadge> {
        @Override // android.os.Parcelable.Creator
        public final MultilineBadge createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel2);
            int readInt = parcel2.readInt();
            LinkedHashMap linkedHashMap = null;
            ThemeType valueOf2 = parcel2.readInt() == 0 ? null : ThemeType.valueOf(parcel2.readString());
            String readString = parcel2.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(MultilineBadge.class.getClassLoader());
            int i11 = 0;
            if (parcel2.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel2.readInt() != 0);
            }
            ThemeType themeType = valueOf2;
            String readString2 = parcel2.readString();
            String readString3 = parcel2.readString();
            String readString4 = parcel2.readString();
            Boolean bool = valueOf;
            String readString5 = parcel2.readString();
            TestInfo testInfo = (TestInfo) parcel2.readParcelable(MultilineBadge.class.getClassLoader());
            if (parcel2.readInt() != 0) {
                int readInt2 = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                while (i11 != readInt2) {
                    int i12 = readInt2;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    i11 = C2859b.a(MultilineBadge.class, parcel2, linkedHashMap3, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    linkedHashMap2 = linkedHashMap3;
                    readInt2 = i12;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new MultilineBadge(create, readInt, themeType, readString, atomActionDTO, bool, readString2, readString3, readString4, readString5, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MultilineBadge[] newArray(int i11) {
            return new MultilineBadge[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_DEFAULT", "THEME_TYPE_THIN", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;

        @i(name = "THEME_TYPE_INVALID")
        public static final ThemeType THEME_TYPE_INVALID = new ThemeType("THEME_TYPE_INVALID", 0);

        @i(name = "THEME_TYPE_DEFAULT")
        public static final ThemeType THEME_TYPE_DEFAULT = new ThemeType("THEME_TYPE_DEFAULT", 1);

        @i(name = "THEME_TYPE_THIN")
        public static final ThemeType THEME_TYPE_THIN = new ThemeType("THEME_TYPE_THIN", 2);

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_INVALID, THEME_TYPE_DEFAULT, THEME_TYPE_THIN};
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
    public /* synthetic */ MultilineBadge(ru.ozon.uni.atoms.utils.OzonSpannableString r16, int r17, ru.ozon.app.android.atoms.data.badge.MultilineBadge.ThemeType r18, java.lang.String r19, ru.ozon.uni.atoms.data.AtomActionDTO r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, ru.ozon.uni.atoms.data.TestInfo r26, java.util.Map r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 2
            if (r1 == 0) goto L9
            r1 = 3
            r4 = r1
            goto Lb
        L9:
            r4 = r17
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L17
            ru.ozon.uni.android.uikit.common.StyleParser$TextStyle r1 = ru.ozon.uni.android.uikit.common.StyleParser.TextStyle.CAPTION
            java.lang.String r1 = r1.getStyleName()
            r11 = r1
            goto L19
        L17:
            r11 = r24
        L19:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L20
            r12 = r2
            goto L22
        L20:
            r12 = r25
        L22:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L28
            r13 = r2
            goto L2a
        L28:
            r13 = r26
        L2a:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L3f
            r14 = r2
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r2 = r15
            goto L50
        L3f:
            r14 = r27
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
        L50:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.badge.MultilineBadge.<init>(ru.ozon.uni.atoms.utils.OzonSpannableString, int, ru.ozon.app.android.atoms.data.badge.MultilineBadge$ThemeType, java.lang.String, ru.ozon.uni.atoms.data.AtomActionDTO, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ MultilineBadge copy$default(MultilineBadge multilineBadge, OzonSpannableString ozonSpannableString, int i11, ThemeType themeType, String str, AtomActionDTO atomActionDTO, Boolean bool, String str2, String str3, String str4, String str5, TestInfo testInfo, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            ozonSpannableString = multilineBadge.text;
        }
        if ((i12 & 2) != 0) {
            i11 = multilineBadge.maxLines;
        }
        if ((i12 & 4) != 0) {
            themeType = multilineBadge.theme;
        }
        if ((i12 & 8) != 0) {
            str = multilineBadge.backgroundColor;
        }
        if ((i12 & 16) != 0) {
            atomActionDTO = multilineBadge.action;
        }
        if ((i12 & 32) != 0) {
            bool = multilineBadge.isFullWidth;
        }
        if ((i12 & 64) != 0) {
            str2 = multilineBadge.icon;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = multilineBadge.iconTintColor;
        }
        if ((i12 & 256) != 0) {
            str4 = multilineBadge.textStyle;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str5 = multilineBadge.context;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = multilineBadge.testInfo;
        }
        if ((i12 & 2048) != 0) {
            map = multilineBadge.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Boolean bool2 = bool;
        return multilineBadge.copy(ozonSpannableString, i11, themeType, str, atomActionDTO2, bool2, str8, str9, str6, str7, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
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
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemeType getTheme() {
        return this.theme;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final MultilineBadge copy(@NotNull OzonSpannableString text, int maxLines, ThemeType theme, String backgroundColor, AtomActionDTO action, Boolean isFullWidth, String icon, String iconTintColor, @NotNull String textStyle, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        return new MultilineBadge(text, maxLines, theme, backgroundColor, action, isFullWidth, icon, iconTintColor, textStyle, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultilineBadge)) {
            return false;
        }
        MultilineBadge multilineBadge = (MultilineBadge) other;
        return Intrinsics.d(this.text, multilineBadge.text) && this.maxLines == multilineBadge.maxLines && this.theme == multilineBadge.theme && Intrinsics.d(this.backgroundColor, multilineBadge.backgroundColor) && Intrinsics.d(this.action, multilineBadge.action) && Intrinsics.d(this.isFullWidth, multilineBadge.isFullWidth) && Intrinsics.d(this.icon, multilineBadge.icon) && Intrinsics.d(this.iconTintColor, multilineBadge.iconTintColor) && Intrinsics.d(this.textStyle, multilineBadge.textStyle) && Intrinsics.d(this.context, multilineBadge.context) && Intrinsics.d(this.testInfo, multilineBadge.testInfo) && Intrinsics.d(this.trackingInfo, multilineBadge.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_multiline_badge;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    @NotNull
    public final String getTextStyle() {
        return this.textStyle;
    }

    public final ThemeType getTheme() {
        return this.theme;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxLines, this.text.hashCode() * 31, 31);
        ThemeType themeType = this.theme;
        int hashCode = (a11 + (themeType == null ? 0 : themeType.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Boolean bool = this.isFullWidth;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconTintColor;
        int a12 = g.a((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.textStyle);
        String str4 = this.context;
        int hashCode6 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode7 = (hashCode6 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isFullWidth() {
        return this.isFullWidth;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        int i11 = this.maxLines;
        ThemeType themeType = this.theme;
        String str = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Boolean bool = this.isFullWidth;
        String str2 = this.icon;
        String str3 = this.iconTintColor;
        String str4 = this.textStyle;
        String str5 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MultilineBadge(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", maxLines=");
        sb2.append(i11);
        sb2.append(", theme=");
        sb2.append(themeType);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", isFullWidth=");
        sb2.append(bool);
        sb2.append(", icon=");
        Nh.a.h(sb2, str2, ", iconTintColor=", str3, ", textStyle=");
        Nh.a.h(sb2, str4, ", context=", str5, ", testInfo=");
        return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeInt(this.maxLines);
        ThemeType themeType = this.theme;
        if (themeType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(themeType.name());
        }
        dest.writeString(this.backgroundColor);
        dest.writeParcelable(this.action, flags);
        Boolean bool = this.isFullWidth;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        dest.writeString(this.textStyle);
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
    public MultilineBadge(@NotNull OzonSpannableString text, int i11, ThemeType themeType, String str, AtomActionDTO atomActionDTO, Boolean bool, String str2, String str3, @NotNull String textStyle, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.MULTILINE_BADGE, str4, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.text = text;
        this.maxLines = i11;
        this.theme = themeType;
        this.backgroundColor = str;
        this.action = atomActionDTO;
        this.isFullWidth = bool;
        this.icon = str2;
        this.iconTintColor = str3;
        this.textStyle = textStyle;
        this.context = str4;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
