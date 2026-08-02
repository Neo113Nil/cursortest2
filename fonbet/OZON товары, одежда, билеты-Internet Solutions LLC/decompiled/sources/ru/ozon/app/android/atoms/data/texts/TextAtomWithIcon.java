package ru.ozon.app.android.atoms.data.texts;

import B0.C2454a;
import Bl.C2639a;
import C.J;
import De.C2859b;
import G.g;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010&\u001a\u00020\bH\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008c\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0006\u00103\u001a\u00020\bJ\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006@"}, d2 = {"Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textStyle", "", "textColor", "maxLines", "", "icon", "iconTintColor", "iconAlignment", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon$IconAlignment;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon$IconAlignment;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextStyle", "()Ljava/lang/String;", "getTextColor", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIcon", "getIconTintColor", "getIconAlignment", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon$IconAlignment;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon$IconAlignment;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconAlignment", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TextAtomWithIcon extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<TextAtomWithIcon> CREATOR = new Creator();
    private final String context;
    private final String icon;
    private final IconAlignment iconAlignment;
    private final String iconTintColor;
    private final Integer maxLines;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;

    @NotNull
    private final String textColor;

    @NotNull
    private final String textStyle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<TextAtomWithIcon> {
        @Override // android.os.Parcelable.Creator
        public final TextAtomWithIcon createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel2);
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            LinkedHashMap linkedHashMap = null;
            Integer valueOf = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            String readString3 = parcel2.readString();
            String readString4 = parcel2.readString();
            IconAlignment valueOf2 = parcel2.readInt() == 0 ? null : IconAlignment.valueOf(parcel2.readString());
            Integer num = valueOf;
            String readString5 = parcel2.readString();
            TestInfo testInfo = (TestInfo) parcel2.readParcelable(TextAtomWithIcon.class.getClassLoader());
            if (parcel2.readInt() != 0) {
                int readInt = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(TextAtomWithIcon.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                }
            }
            return new TextAtomWithIcon(create, readString, readString2, num, readString3, readString4, valueOf2, readString5, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAtomWithIcon[] newArray(int i11) {
            return new TextAtomWithIcon[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon$IconAlignment;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "BOTTOM", "BASELINE", "CENTER", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class IconAlignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconAlignment[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "BOTTOM")
        public static final IconAlignment BOTTOM = new IconAlignment("BOTTOM", 0, "BOTTOM");

        @i(name = "BASELINE")
        public static final IconAlignment BASELINE = new IconAlignment("BASELINE", 1, "BASELINE");

        @i(name = "CENTER")
        public static final IconAlignment CENTER = new IconAlignment("CENTER", 2, "CENTER");

        private static final /* synthetic */ IconAlignment[] $values() {
            return new IconAlignment[]{BOTTOM, BASELINE, CENTER};
        }

        static {
            IconAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconAlignment(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static a<IconAlignment> getEntries() {
            return $ENTRIES;
        }

        public static IconAlignment valueOf(String str) {
            return (IconAlignment) Enum.valueOf(IconAlignment.class, str);
        }

        public static IconAlignment[] values() {
            return (IconAlignment[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public /* synthetic */ TextAtomWithIcon(OzonSpannableString ozonSpannableString, String str, String str2, Integer num, String str3, String str4, IconAlignment iconAlignment, String str5, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? StyleParser.TextStyle.BODY_M.getStyleName() : str, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : iconAlignment, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
    }

    public static /* synthetic */ TextAtomWithIcon copy$default(TextAtomWithIcon textAtomWithIcon, OzonSpannableString ozonSpannableString, String str, String str2, Integer num, String str3, String str4, IconAlignment iconAlignment, String str5, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = textAtomWithIcon.text;
        }
        if ((i11 & 2) != 0) {
            str = textAtomWithIcon.textStyle;
        }
        if ((i11 & 4) != 0) {
            str2 = textAtomWithIcon.textColor;
        }
        if ((i11 & 8) != 0) {
            num = textAtomWithIcon.maxLines;
        }
        if ((i11 & 16) != 0) {
            str3 = textAtomWithIcon.icon;
        }
        if ((i11 & 32) != 0) {
            str4 = textAtomWithIcon.iconTintColor;
        }
        if ((i11 & 64) != 0) {
            iconAlignment = textAtomWithIcon.iconAlignment;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str5 = textAtomWithIcon.context;
        }
        if ((i11 & 256) != 0) {
            testInfo = textAtomWithIcon.testInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = textAtomWithIcon.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        IconAlignment iconAlignment2 = iconAlignment;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return textAtomWithIcon.copy(ozonSpannableString, str, str2, num, str7, str8, iconAlignment2, str6, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
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

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    /* renamed from: component7, reason: from getter */
    public final IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component9, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextAtomWithIcon copy(@NotNull OzonSpannableString text, @NotNull String textStyle, @NotNull String textColor, Integer maxLines, String icon, String iconTintColor, IconAlignment iconAlignment, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new TextAtomWithIcon(text, textStyle, textColor, maxLines, icon, iconTintColor, iconAlignment, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAtomWithIcon)) {
            return false;
        }
        TextAtomWithIcon textAtomWithIcon = (TextAtomWithIcon) other;
        return Intrinsics.d(this.text, textAtomWithIcon.text) && Intrinsics.d(this.textStyle, textAtomWithIcon.textStyle) && Intrinsics.d(this.textColor, textAtomWithIcon.textColor) && Intrinsics.d(this.maxLines, textAtomWithIcon.maxLines) && Intrinsics.d(this.icon, textAtomWithIcon.icon) && Intrinsics.d(this.iconTintColor, textAtomWithIcon.iconTintColor) && this.iconAlignment == textAtomWithIcon.iconAlignment && Intrinsics.d(this.context, textAtomWithIcon.context) && Intrinsics.d(this.testInfo, textAtomWithIcon.testInfo) && Intrinsics.d(this.trackingInfo, textAtomWithIcon.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_text_atom_with_icon;
    }

    public final Integer getMaxLines() {
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
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTextStyle() {
        return this.textStyle;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.text.hashCode() * 31, 31, this.textStyle), 31, this.textColor);
        Integer num = this.maxLines;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconTintColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconAlignment iconAlignment = this.iconAlignment;
        int hashCode4 = (hashCode3 + (iconAlignment == null ? 0 : iconAlignment.hashCode())) * 31;
        String str3 = this.context;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.textStyle;
        String str2 = this.textColor;
        Integer num = this.maxLines;
        String str3 = this.icon;
        String str4 = this.iconTintColor;
        IconAlignment iconAlignment = this.iconAlignment;
        String str5 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = GR.b.f("TextAtomWithIcon(text=", ozonSpannableString, ", textStyle=", str, ", textColor=");
        C2454a.f(num, str2, ", maxLines=", ", icon=", f7);
        Nh.a.h(f7, str3, ", iconTintColor=", str4, ", iconAlignment=");
        f7.append(iconAlignment);
        f7.append(", context=");
        f7.append(str5);
        f7.append(", testInfo=");
        return C2639a.a(", trackingInfo=", ")", f7, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeString(this.textStyle);
        dest.writeString(this.textColor);
        Integer num = this.maxLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        IconAlignment iconAlignment = this.iconAlignment;
        if (iconAlignment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconAlignment.name());
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
    public TextAtomWithIcon(@NotNull OzonSpannableString text, @NotNull String textStyle, @NotNull String textColor, Integer num, String str, String str2, IconAlignment iconAlignment, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.TEXT_ATOM_WITH_ICON, str3, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.text = text;
        this.textStyle = textStyle;
        this.textColor = textColor;
        this.maxLines = num;
        this.icon = str;
        this.iconTintColor = str2;
        this.iconAlignment = iconAlignment;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
