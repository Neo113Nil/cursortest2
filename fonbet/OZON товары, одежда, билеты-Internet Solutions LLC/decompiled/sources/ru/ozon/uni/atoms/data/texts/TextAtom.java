package ru.ozon.uni.atoms.data.texts;

import B0.C2454a;
import C.J;
import De.C2859b;
import G.g;
import GR.b;
import Nh.a;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\bH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jh\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\bJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, d2 = {"Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textStyle", "", "textColor", "maxLines", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextStyle", "()Ljava/lang/String;", "getTextColor", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/uni/atoms/data/texts/TextAtom;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TextAtom extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TextAtom> CREATOR = new Creator();
    private final String context;
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
    public static final class Creator implements Parcelable.Creator<TextAtom> {
        @Override // android.os.Parcelable.Creator
        public final TextAtom createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(TextAtom.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TextAtom(create, readString, readString2, valueOf, readString3, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAtom[] newArray(int i11) {
            return new TextAtom[i11];
        }
    }

    public /* synthetic */ TextAtom(OzonSpannableString ozonSpannableString, String str, String str2, Integer num, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? StyleParser.TextStyle.BODY_M.getStyleName() : str, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
    }

    public static /* synthetic */ TextAtom copy$default(TextAtom textAtom, OzonSpannableString ozonSpannableString, String str, String str2, Integer num, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = textAtom.text;
        }
        if ((i11 & 2) != 0) {
            str = textAtom.textStyle;
        }
        if ((i11 & 4) != 0) {
            str2 = textAtom.textColor;
        }
        if ((i11 & 8) != 0) {
            num = textAtom.maxLines;
        }
        if ((i11 & 16) != 0) {
            str3 = textAtom.context;
        }
        if ((i11 & 32) != 0) {
            testInfo = textAtom.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = textAtom.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str4 = str3;
        String str5 = str2;
        return textAtom.copy(ozonSpannableString, str, str5, num, str4, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
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
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextAtom copy(@NotNull OzonSpannableString text, @NotNull String textStyle, @NotNull String textColor, Integer maxLines, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new TextAtom(text, textStyle, textColor, maxLines, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAtom)) {
            return false;
        }
        TextAtom textAtom = (TextAtom) other;
        return Intrinsics.d(this.text, textAtom.text) && Intrinsics.d(this.textStyle, textAtom.textStyle) && Intrinsics.d(this.textColor, textAtom.textColor) && Intrinsics.d(this.maxLines, textAtom.maxLines) && Intrinsics.d(this.context, textAtom.context) && Intrinsics.d(this.testInfo, textAtom.testInfo) && Intrinsics.d(this.trackingInfo, textAtom.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_text_atom;
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
        String str = this.context;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.textStyle;
        String str2 = this.textColor;
        Integer num = this.maxLines;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = b.f("TextAtom(text=", ozonSpannableString, ", textStyle=", str, ", textColor=");
        C2454a.f(num, str2, ", maxLines=", ", context=", f7);
        C4070a.b(f7, str3, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(f7, map, ")");
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
            a.f(dest, 1, num);
        }
        dest.writeString(this.context);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
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
    public TextAtom(@NotNull OzonSpannableString text, @NotNull String textStyle, @NotNull String textColor, Integer num, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.TEXT_ATOM, str, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.text = text;
        this.textStyle = textStyle;
        this.textColor = textColor;
        this.maxLines = num;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
