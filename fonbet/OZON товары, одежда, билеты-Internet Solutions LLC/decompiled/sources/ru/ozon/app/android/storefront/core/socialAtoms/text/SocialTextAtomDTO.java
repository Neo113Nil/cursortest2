package ru.ozon.app.android.storefront.core.socialAtoms.text;

import Ak.b;
import B4.V;
import C.J;
import De.C2859b;
import G.g;
import I1.w;
import N3.C3660k;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001AB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0090\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u000bJ\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u000bHÖ\u0001J\t\u0010;\u001a\u00020\u0004HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006B"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroid/os/Parcelable;", "text", "", "textStyle", "textColor", "textTags", "", "Lru/ozon/app/android/storefront/core/socialAtoms/text/TextTag;", "maxLines", "", "icon", "iconTintColor", "iconPosition", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Ljava/lang/String;", "getTextStyle", "getTextColor", "getTextTags", "()Ljava/util/List;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIcon", "getIconTintColor", "getIconPosition", "()Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconPosition", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SocialTextAtomDTO extends AtomDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SocialTextAtomDTO> CREATOR = new Creator();
    private final String icon;

    @NotNull
    private final IconPosition iconPosition;
    private final String iconTintColor;
    private final Integer maxLines;
    private final TestInfo testInfo;

    @NotNull
    private final String text;

    @NotNull
    private final String textColor;

    @NotNull
    private final String textStyle;
    private final List<TextTag> textTags;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SocialTextAtomDTO> {
        @Override // android.os.Parcelable.Creator
        public final SocialTextAtomDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.b(TextTag.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            IconPosition valueOf2 = IconPosition.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(SocialTextAtomDTO.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SocialTextAtomDTO(readString, readString2, readString3, arrayList, valueOf, readString4, readString5, valueOf2, linkedHashMap, (TestInfo) parcel.readParcelable(SocialTextAtomDTO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SocialTextAtomDTO[] newArray(int i11) {
            return new SocialTextAtomDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "ICON_POSITION_START", "ICON_POSITION_END", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;
        public static final IconPosition ICON_POSITION_START = new IconPosition("ICON_POSITION_START", 0);
        public static final IconPosition ICON_POSITION_END = new IconPosition("ICON_POSITION_END", 1);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{ICON_POSITION_START, ICON_POSITION_END};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SocialTextAtomDTO(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO.IconPosition r19, java.util.Map r20, ru.ozon.uni.atoms.data.TestInfo r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            ru.ozon.uni.android.uikit.common.StyleParser$TextStyle r13 = ru.ozon.uni.android.uikit.common.StyleParser.TextStyle.BODY_M
            java.lang.String r13 = r13.getStyleName()
        Lc:
            r2 = r13
            r13 = r0 & 4
            if (r13 == 0) goto L19
            ru.ozon.uni.android.uikit.common.StyleParser$OzColor r13 = ru.ozon.uni.android.uikit.common.StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY
            java.lang.String r13 = r13.getValue()
            r3 = r13
            goto L1a
        L19:
            r3 = r14
        L1a:
            r13 = r0 & 8
            r1 = 0
            if (r13 == 0) goto L21
            r4 = r1
            goto L22
        L21:
            r4 = r15
        L22:
            r13 = r0 & 16
            if (r13 == 0) goto L28
            r5 = r1
            goto L2a
        L28:
            r5 = r16
        L2a:
            r13 = r0 & 32
            if (r13 == 0) goto L30
            r6 = r1
            goto L32
        L30:
            r6 = r17
        L32:
            r13 = r0 & 64
            if (r13 == 0) goto L38
            r7 = r1
            goto L3a
        L38:
            r7 = r18
        L3a:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L42
            ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO$IconPosition r13 = ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO.IconPosition.ICON_POSITION_START
            r8 = r13
            goto L44
        L42:
            r8 = r19
        L44:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L4e
            r10 = r1
            r0 = r11
            r9 = r20
            r1 = r12
            goto L54
        L4e:
            r10 = r21
            r0 = r11
            r1 = r12
            r9 = r20
        L54:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO$IconPosition, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ SocialTextAtomDTO copy$default(SocialTextAtomDTO socialTextAtomDTO, String str, String str2, String str3, List list, Integer num, String str4, String str5, IconPosition iconPosition, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = socialTextAtomDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = socialTextAtomDTO.textStyle;
        }
        if ((i11 & 4) != 0) {
            str3 = socialTextAtomDTO.textColor;
        }
        if ((i11 & 8) != 0) {
            list = socialTextAtomDTO.textTags;
        }
        if ((i11 & 16) != 0) {
            num = socialTextAtomDTO.maxLines;
        }
        if ((i11 & 32) != 0) {
            str4 = socialTextAtomDTO.icon;
        }
        if ((i11 & 64) != 0) {
            str5 = socialTextAtomDTO.iconTintColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconPosition = socialTextAtomDTO.iconPosition;
        }
        if ((i11 & 256) != 0) {
            map = socialTextAtomDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            testInfo = socialTextAtomDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str6 = str5;
        IconPosition iconPosition2 = iconPosition;
        Integer num2 = num;
        String str7 = str4;
        return socialTextAtomDTO.copy(str, str2, str3, list, num2, str7, str6, iconPosition2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final List<TextTag> component4() {
        return this.textTags;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final SocialTextAtomDTO copy(@NotNull String text, @NotNull String textStyle, @NotNull String textColor, List<TextTag> textTags, Integer maxLines, String icon, String iconTintColor, @NotNull IconPosition iconPosition, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        return new SocialTextAtomDTO(text, textStyle, textColor, textTags, maxLines, icon, iconTintColor, iconPosition, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialTextAtomDTO)) {
            return false;
        }
        SocialTextAtomDTO socialTextAtomDTO = (SocialTextAtomDTO) other;
        return Intrinsics.d(this.text, socialTextAtomDTO.text) && Intrinsics.d(this.textStyle, socialTextAtomDTO.textStyle) && Intrinsics.d(this.textColor, socialTextAtomDTO.textColor) && Intrinsics.d(this.textTags, socialTextAtomDTO.textTags) && Intrinsics.d(this.maxLines, socialTextAtomDTO.maxLines) && Intrinsics.d(this.icon, socialTextAtomDTO.icon) && Intrinsics.d(this.iconTintColor, socialTextAtomDTO.iconTintColor) && this.iconPosition == socialTextAtomDTO.iconPosition && Intrinsics.d(this.trackingInfo, socialTextAtomDTO.trackingInfo) && Intrinsics.d(this.testInfo, socialTextAtomDTO.testInfo);
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_social_text_atom_dto;
    }

    public final Integer getMaxLines() {
        return this.maxLines;
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

    @NotNull
    public final String getTextStyle() {
        return this.textStyle;
    }

    public final List<TextTag> getTextTags() {
        return this.textTags;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.text.hashCode() * 31, 31, this.textStyle), 31, this.textColor);
        List<TextTag> list = this.textTags;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.maxLines;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.icon;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconTintColor;
        int hashCode4 = (this.iconPosition.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textStyle;
        String str3 = this.textColor;
        List<TextTag> list = this.textTags;
        Integer num = this.maxLines;
        String str4 = this.icon;
        String str5 = this.iconTintColor;
        IconPosition iconPosition = this.iconPosition;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("SocialTextAtomDTO(text=", str, ", textStyle=", str2, ", textColor=");
        w.d(str3, ", textTags=", ", maxLines=", d11, list);
        V.f(num, ", icon=", str4, ", iconTintColor=", d11);
        d11.append(str5);
        d11.append(", iconPosition=");
        d11.append(iconPosition);
        d11.append(", trackingInfo=");
        return Ns.b.b(", testInfo=", ")", d11, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.textStyle);
        dest.writeString(this.textColor);
        List<TextTag> list = this.textTags;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((TextTag) c11.next()).writeToParcel(dest, flags);
            }
        }
        Integer num = this.maxLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        dest.writeString(this.iconPosition.name());
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
    public SocialTextAtomDTO(@NotNull String text, @NotNull String textStyle, @NotNull String textColor, List<TextTag> list, Integer num, String str, String str2, @NotNull IconPosition iconPosition, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(SocialAtomType.SOCIAL_TEXT_ATOM, null, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        this.text = text;
        this.textStyle = textStyle;
        this.textColor = textColor;
        this.textTags = list;
        this.maxLines = num;
        this.icon = str;
        this.iconTintColor = str2;
        this.iconPosition = iconPosition;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
