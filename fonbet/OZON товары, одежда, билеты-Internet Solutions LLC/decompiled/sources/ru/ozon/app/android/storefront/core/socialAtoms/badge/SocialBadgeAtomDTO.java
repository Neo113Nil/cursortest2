package ru.ozon.app.android.storefront.core.socialAtoms.badge;

import C.J;
import De.C2859b;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.socialAtoms.SocialAtomType;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002HIB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0004HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u009f\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0006\u0010=\u001a\u00020/J\u0013\u0010>\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020/HÖ\u0001J\t\u0010B\u001a\u00020\u0004HÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020/R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006J"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroid/os/Parcelable;", "text", "", "textColor", "icon", "iconTintColor", "showArrow", "", "arrowColor", "style", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;", "backgroundColors", "", "gradientStyle", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;Ljava/util/List;Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getIcon", "getIconTintColor", "getShowArrow", "()Z", "getArrowColor", "getStyle", "()Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;", "getBackgroundColors", "()Ljava/util/List;", "getGradientStyle", "()Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Style", "Gradient", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SocialBadgeAtomDTO extends AtomDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SocialBadgeAtomDTO> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String arrowColor;

    @NotNull
    private final List<String> backgroundColors;

    @NotNull
    private final Gradient gradientStyle;
    private final String icon;
    private final String iconTintColor;
    private final boolean showArrow;

    @NotNull
    private final Style style;
    private final TestInfo testInfo;

    @NotNull
    private final String text;

    @NotNull
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialBadgeAtomDTO> {
        @Override // android.os.Parcelable.Creator
        public final SocialBadgeAtomDTO createFromParcel(Parcel parcel) {
            String str;
            boolean z11;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                str = readString;
                z11 = true;
            } else {
                str = readString;
                z11 = false;
            }
            String readString5 = parcel.readString();
            Style valueOf = Style.valueOf(parcel.readString());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Gradient valueOf2 = Gradient.valueOf(parcel.readString());
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(SocialBadgeAtomDTO.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                int i11 = 0;
                linkedHashMap = new LinkedHashMap(readInt);
                while (i11 != readInt) {
                    i11 = C2859b.a(SocialBadgeAtomDTO.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    readInt = readInt;
                }
            }
            return new SocialBadgeAtomDTO(str, readString2, readString3, readString4, z11, readString5, valueOf, createStringArrayList, valueOf2, atomActionDTO, linkedHashMap, (TestInfo) parcel.readParcelable(SocialBadgeAtomDTO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SocialBadgeAtomDTO[] newArray(int i11) {
            return new SocialBadgeAtomDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Gradient;", "", "<init>", "(Ljava/lang/String;I)V", "GRADIENT_STYLE_TYPE_LEFT_RIGHT", "GRADIENT_STYLE_TYPE_TOP_BOTTOM", "GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM", "GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gradient {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Gradient[] $VALUES;
        public static final Gradient GRADIENT_STYLE_TYPE_LEFT_RIGHT = new Gradient("GRADIENT_STYLE_TYPE_LEFT_RIGHT", 0);
        public static final Gradient GRADIENT_STYLE_TYPE_TOP_BOTTOM = new Gradient("GRADIENT_STYLE_TYPE_TOP_BOTTOM", 1);
        public static final Gradient GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM = new Gradient("GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM", 2);
        public static final Gradient GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM = new Gradient("GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM", 3);

        private static final /* synthetic */ Gradient[] $values() {
            return new Gradient[]{GRADIENT_STYLE_TYPE_LEFT_RIGHT, GRADIENT_STYLE_TYPE_TOP_BOTTOM, GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM, GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM};
        }

        static {
            Gradient[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Gradient(String str, int i11) {
        }

        public static Gradient valueOf(String str) {
            return (Gradient) Enum.valueOf(Gradient.class, str);
        }

        public static Gradient[] values() {
            return (Gradient[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO$Style;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_SMALL", "STYLE_TYPE_MEDIUM", "STYLE_TYPE_MEDIUM_UPPERCASE", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style STYLE_TYPE_SMALL = new Style("STYLE_TYPE_SMALL", 0);
        public static final Style STYLE_TYPE_MEDIUM = new Style("STYLE_TYPE_MEDIUM", 1);
        public static final Style STYLE_TYPE_MEDIUM_UPPERCASE = new Style("STYLE_TYPE_MEDIUM_UPPERCASE", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{STYLE_TYPE_SMALL, STYLE_TYPE_MEDIUM, STYLE_TYPE_MEDIUM_UPPERCASE};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SocialBadgeAtomDTO(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.String r21, ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.Style r22, java.util.List r23, ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.Gradient r24, ru.ozon.uni.atoms.data.AtomActionDTO r25, java.util.Map r26, ru.ozon.uni.atoms.data.TestInfo r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 2
            if (r1 == 0) goto Le
            ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY
            java.lang.String r1 = r1.getValue()
            r4 = r1
            goto L10
        Le:
            r4 = r17
        L10:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L17
            r5 = r2
            goto L19
        L17:
            r5 = r18
        L19:
            r1 = r0 & 8
            if (r1 == 0) goto L1f
            r6 = r2
            goto L21
        L1f:
            r6 = r19
        L21:
            r1 = r0 & 32
            if (r1 == 0) goto L27
            r8 = r2
            goto L29
        L27:
            r8 = r21
        L29:
            r1 = r0 & 64
            if (r1 == 0) goto L31
            ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO$Style r1 = ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.Style.STYLE_TYPE_SMALL
            r9 = r1
            goto L33
        L31:
            r9 = r22
        L33:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L43
            ru.ozon.uni.android.uikit.common.StyleParser$OzColor r1 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
            java.lang.String r1 = r1.getValue()
            java.util.List r1 = kotlin.collections.C7714v.a0(r1)
            r10 = r1
            goto L45
        L43:
            r10 = r23
        L45:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4d
            ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO$Gradient r1 = ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.Gradient.GRADIENT_STYLE_TYPE_LEFT_RIGHT
            r11 = r1
            goto L4f
        L4d:
            r11 = r24
        L4f:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L55
            r12 = r2
            goto L57
        L55:
            r12 = r25
        L57:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L64
            r14 = r2
            r3 = r16
            r7 = r20
            r13 = r26
            r2 = r15
            goto L6d
        L64:
            r14 = r27
            r2 = r15
            r3 = r16
            r7 = r20
            r13 = r26
        L6d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO$Style, java.util.List, ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO$Gradient, ru.ozon.uni.atoms.data.AtomActionDTO, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ SocialBadgeAtomDTO copy$default(SocialBadgeAtomDTO socialBadgeAtomDTO, String str, String str2, String str3, String str4, boolean z11, String str5, Style style, List list, Gradient gradient, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = socialBadgeAtomDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = socialBadgeAtomDTO.textColor;
        }
        if ((i11 & 4) != 0) {
            str3 = socialBadgeAtomDTO.icon;
        }
        if ((i11 & 8) != 0) {
            str4 = socialBadgeAtomDTO.iconTintColor;
        }
        if ((i11 & 16) != 0) {
            z11 = socialBadgeAtomDTO.showArrow;
        }
        if ((i11 & 32) != 0) {
            str5 = socialBadgeAtomDTO.arrowColor;
        }
        if ((i11 & 64) != 0) {
            style = socialBadgeAtomDTO.style;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = socialBadgeAtomDTO.backgroundColors;
        }
        if ((i11 & 256) != 0) {
            gradient = socialBadgeAtomDTO.gradientStyle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            atomActionDTO = socialBadgeAtomDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = socialBadgeAtomDTO.trackingInfo;
        }
        if ((i11 & 2048) != 0) {
            testInfo = socialBadgeAtomDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        Gradient gradient2 = gradient;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Style style2 = style;
        List list2 = list;
        boolean z12 = z11;
        String str6 = str5;
        return socialBadgeAtomDTO.copy(str, str2, str3, str4, z12, str6, style2, list2, gradient2, atomActionDTO2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowArrow() {
        return this.showArrow;
    }

    /* renamed from: component6, reason: from getter */
    public final String getArrowColor() {
        return this.arrowColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    public final List<String> component8() {
        return this.backgroundColors;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Gradient getGradientStyle() {
        return this.gradientStyle;
    }

    @NotNull
    public final SocialBadgeAtomDTO copy(@NotNull String text, @NotNull String textColor, String icon, String iconTintColor, boolean showArrow, String arrowColor, @NotNull Style style, @NotNull List<String> backgroundColors, @NotNull Gradient gradientStyle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
        return new SocialBadgeAtomDTO(text, textColor, icon, iconTintColor, showArrow, arrowColor, style, backgroundColors, gradientStyle, action, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialBadgeAtomDTO)) {
            return false;
        }
        SocialBadgeAtomDTO socialBadgeAtomDTO = (SocialBadgeAtomDTO) other;
        return Intrinsics.d(this.text, socialBadgeAtomDTO.text) && Intrinsics.d(this.textColor, socialBadgeAtomDTO.textColor) && Intrinsics.d(this.icon, socialBadgeAtomDTO.icon) && Intrinsics.d(this.iconTintColor, socialBadgeAtomDTO.iconTintColor) && this.showArrow == socialBadgeAtomDTO.showArrow && Intrinsics.d(this.arrowColor, socialBadgeAtomDTO.arrowColor) && this.style == socialBadgeAtomDTO.style && Intrinsics.d(this.backgroundColors, socialBadgeAtomDTO.backgroundColors) && this.gradientStyle == socialBadgeAtomDTO.gradientStyle && Intrinsics.d(this.action, socialBadgeAtomDTO.action) && Intrinsics.d(this.trackingInfo, socialBadgeAtomDTO.trackingInfo) && Intrinsics.d(this.testInfo, socialBadgeAtomDTO.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getArrowColor() {
        return this.arrowColor;
    }

    @NotNull
    public final List<String> getBackgroundColors() {
        return this.backgroundColors;
    }

    @NotNull
    public final Gradient getGradientStyle() {
        return this.gradientStyle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_social_badge_atom_dto;
    }

    public final boolean getShowArrow() {
        return this.showArrow;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.text.hashCode() * 31, 31, this.textColor);
        String str = this.icon;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconTintColor;
        int a12 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showArrow);
        String str3 = this.arrowColor;
        int hashCode2 = (this.gradientStyle.hashCode() + g.b((this.style.hashCode() + ((a12 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.backgroundColors)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textColor;
        String str3 = this.icon;
        String str4 = this.iconTintColor;
        boolean z11 = this.showArrow;
        String str5 = this.arrowColor;
        Style style = this.style;
        List<String> list = this.backgroundColors;
        Gradient gradient = this.gradientStyle;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("SocialBadgeAtomDTO(text=", str, ", textColor=", str2, ", icon=");
        Nh.a.h(d11, str3, ", iconTintColor=", str4, ", showArrow=");
        C5766e.a(", arrowColor=", str5, ", style=", d11, z11);
        d11.append(style);
        d11.append(", backgroundColors=");
        d11.append(list);
        d11.append(", gradientStyle=");
        d11.append(gradient);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", trackingInfo=");
        return Ns.b.b(", testInfo=", ")", d11, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.textColor);
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        dest.writeInt(this.showArrow ? 1 : 0);
        dest.writeString(this.arrowColor);
        dest.writeString(this.style.name());
        dest.writeStringList(this.backgroundColors);
        dest.writeString(this.gradientStyle.name());
        dest.writeParcelable(this.action, flags);
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
    public SocialBadgeAtomDTO(@NotNull String text, @NotNull String textColor, String str, String str2, boolean z11, String str3, @NotNull Style style, @NotNull List<String> backgroundColors, @NotNull Gradient gradientStyle, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(SocialAtomType.SOCIAL_BADGE_ATOM, null, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
        this.text = text;
        this.textColor = textColor;
        this.icon = str;
        this.iconTintColor = str2;
        this.showArrow = z11;
        this.arrowColor = str3;
        this.style = style;
        this.backgroundColors = backgroundColors;
        this.gradientStyle = gradientStyle;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
