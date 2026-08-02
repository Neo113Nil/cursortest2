package ru.ozon.uni.atoms.data.deprecated;

import C.J;
import De.C2859b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000234Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, d2 = {"Lru/ozon/uni/atoms/data/deprecated/Button;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "subtext", "style", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/deprecated/Button$Style;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getSubtext", "getStyle", "()Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Style", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Button extends AtomDTO {
    private final AtomActionDTO action;
    private final String context;

    @NotNull
    private final Style style;
    private final String subtext;
    private final TestInfo testInfo;

    @NotNull
    private final String text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Button> CREATOR = new Creator();

    @NotNull
    private static final Style defaultStyle = Style.PRIMARY;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/deprecated/Button$Companion;", "", "<init>", "()V", "defaultStyle", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "getDefaultStyle", "()Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Style getDefaultStyle() {
            return Button.defaultStyle;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Button> {
        @Override // android.os.Parcelable.Creator
        public final Button createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Style valueOf = Style.valueOf(parcel.readString());
            AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Button.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Button(readString, readString2, valueOf, createFromParcel, readString3, createFromParcel2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Button[] newArray(int i11) {
            return new Button[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "PRIMARY", "PRIMARY_GREEN", "SECONDARY", "TERTIARY", "DANGER", "IMPORTANT", "PRIMARY_SMALL", "PRIMARY_GREEN_SMALL", "SECONDARY_SMALL", "TERTIARY_SMALL", "DANGER_SMALL", "IMPORTANT_SMALL", "GET", "GET_ALT", "BORDERLESS", "BORDERLESS_SMALL", "NATIVE_PAY", "NATIVE_PAY_SMALL", "FAST_PAY", "FAST_PAY_SMALL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "primary")
        public static final Style PRIMARY = new Style("PRIMARY", 0, "primary");

        @i(name = "primaryGreen")
        public static final Style PRIMARY_GREEN = new Style("PRIMARY_GREEN", 1, "primaryGreen");

        @i(name = "secondary")
        public static final Style SECONDARY = new Style("SECONDARY", 2, "secondary");

        @i(name = "secondaryWhite")
        public static final Style TERTIARY = new Style("TERTIARY", 3, "secondaryWhite");

        @i(name = "delete")
        public static final Style DANGER = new Style("DANGER", 4, "delete");

        @i(name = "deleteWhite")
        public static final Style IMPORTANT = new Style("IMPORTANT", 5, "deleteWhite");

        @i(name = "primarySmall")
        public static final Style PRIMARY_SMALL = new Style("PRIMARY_SMALL", 6, "primarySmall");

        @i(name = "primaryGreenSmall")
        public static final Style PRIMARY_GREEN_SMALL = new Style("PRIMARY_GREEN_SMALL", 7, "primaryGreenSmall");

        @i(name = "secondarySmall")
        public static final Style SECONDARY_SMALL = new Style("SECONDARY_SMALL", 8, "secondarySmall");

        @i(name = "secondaryWhiteSmall")
        public static final Style TERTIARY_SMALL = new Style("TERTIARY_SMALL", 9, "secondaryWhiteSmall");

        @i(name = "deleteSmall")
        public static final Style DANGER_SMALL = new Style("DANGER_SMALL", 10, "deleteSmall");

        @i(name = "deleteWhiteSmall")
        public static final Style IMPORTANT_SMALL = new Style("IMPORTANT_SMALL", 11, "deleteWhiteSmall");

        @i(name = "get")
        public static final Style GET = new Style("GET", 12, "get");

        @i(name = "getWhite")
        public static final Style GET_ALT = new Style("GET_ALT", 13, "getWhite");

        @i(name = "borderless")
        public static final Style BORDERLESS = new Style("BORDERLESS", 14, "borderless");

        @i(name = "borderlessSmall")
        public static final Style BORDERLESS_SMALL = new Style("BORDERLESS_SMALL", 15, "borderlessSmall");

        @i(name = "nativePay")
        public static final Style NATIVE_PAY = new Style("NATIVE_PAY", 16, "nativePay");

        @i(name = "nativePaySmall")
        public static final Style NATIVE_PAY_SMALL = new Style("NATIVE_PAY_SMALL", 17, "nativePaySmall");

        @i(name = "fastPay")
        public static final Style FAST_PAY = new Style("FAST_PAY", 18, "fastPay");

        @i(name = "fastPaySmall")
        public static final Style FAST_PAY_SMALL = new Style("FAST_PAY_SMALL", 19, "fastPaySmall");

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{PRIMARY, PRIMARY_GREEN, SECONDARY, TERTIARY, DANGER, IMPORTANT, PRIMARY_SMALL, PRIMARY_GREEN_SMALL, SECONDARY_SMALL, TERTIARY_SMALL, DANGER_SMALL, IMPORTANT_SMALL, GET, GET_ALT, BORDERLESS, BORDERLESS_SMALL, NATIVE_PAY, NATIVE_PAY_SMALL, FAST_PAY, FAST_PAY_SMALL};
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Style(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public /* synthetic */ Button(String str, String str2, Style style, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? Style.PRIMARY : style, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
    }

    public static /* synthetic */ Button copy$default(Button button, String str, String str2, Style style, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = button.text;
        }
        if ((i11 & 2) != 0) {
            str2 = button.subtext;
        }
        if ((i11 & 4) != 0) {
            style = button.style;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = button.action;
        }
        if ((i11 & 16) != 0) {
            str3 = button.context;
        }
        if ((i11 & 32) != 0) {
            testInfo = button.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = button.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str4 = str3;
        Style style2 = style;
        return button.copy(str, str2, style2, atomActionDTO, str4, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
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
    public final Button copy(@NotNull String text, String subtext, @NotNull Style style, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        return new Button(text, subtext, style, action, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return Intrinsics.d(this.text, button.text) && Intrinsics.d(this.subtext, button.subtext) && this.style == button.style && Intrinsics.d(this.action, button.action) && Intrinsics.d(this.context, button.context) && Intrinsics.d(this.testInfo, button.testInfo) && Intrinsics.d(this.trackingInfo, button.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_button;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.subtext;
        int hashCode2 = (this.style.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.context;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.subtext;
        Style style = this.style;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("Button(text=", str, ", subtext=", str2, ", style=");
        d11.append(style);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", context=");
        C4070a.b(d11, str3, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(d11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.subtext);
        dest.writeString(this.style.name());
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
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
    public Button(@NotNull String text, String str, @NotNull Style style, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.BUTTON, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.text = text;
        this.subtext = str;
        this.style = style;
        this.action = atomActionDTO;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
