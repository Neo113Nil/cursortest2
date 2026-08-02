package ru.ozon.app.android.atoms.data.price;

import C.J;
import De.C2859b;
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
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.AtomTypeImpl;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;
import ru.ozon.app.android.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001FB£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010+\u001a\u00020,H\u0016J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J¥\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0006\u0010:\u001a\u00020,J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020,HÖ\u0001J\t\u0010@\u001a\u00020\tHÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020,R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019¨\u0006G"}, d2 = {"Lru/ozon/app/android/atoms/data/price/Price;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "style", "Lru/ozon/app/android/atoms/data/price/Price$StyleType;", "theme", "price", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "priceSubtitle", "priceColor", "", "originalPrice", "originalPriceColor", "image", "imageTintColor", "strikethroughColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/price/Price$StyleType;Lru/ozon/app/android/atoms/data/price/Price$StyleType;Lru/ozon/app/android/atoms/utils/OzonSpannableString;Lru/ozon/app/android/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "getStyle$annotations", "()V", "getStyle", "()Lru/ozon/app/android/atoms/data/price/Price$StyleType;", "getTheme", "getPrice", "()Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "getPriceSubtitle", "getPriceColor", "()Ljava/lang/String;", "getOriginalPrice", "getOriginalPriceColor", "getImage", "getImageTintColor", "getStrikethroughColor", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "currentStyle", "getCurrentStyle", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "StyleType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Price extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final String image;
    private final String imageTintColor;
    private final OzonSpannableString originalPrice;
    private final String originalPriceColor;
    private final OzonSpannableString price;
    private final String priceColor;
    private final OzonSpannableString priceSubtitle;
    private final String strikethroughColor;
    private final StyleType style;
    private final TestInfo testInfo;
    private final StyleType theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Price> {
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StyleType valueOf = parcel.readInt() == 0 ? null : StyleType.valueOf(parcel.readString());
            StyleType valueOf2 = parcel.readInt() == 0 ? null : StyleType.valueOf(parcel.readString());
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
            OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
            String readString = parcel.readString();
            OzonSpannableString create3 = ozonSpannableStringParceler.create(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Price.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Price(valueOf, valueOf2, create, create2, readString, create3, readString2, readString3, readString4, readString5, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i11) {
            return new Price[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/price/Price$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_INVALID", "STYLE_TYPE_LARGE", "STYLE_TYPE_MEDIUM_LARGE", "STYLE_TYPE_MEDIUM", "STYLE_TYPE_SMALL_MEDIUM", "STYLE_TYPE_SMALL", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;

        @i(name = "STYLE_TYPE_INVALID")
        public static final StyleType STYLE_TYPE_INVALID = new StyleType("STYLE_TYPE_INVALID", 0);

        @i(name = "STYLE_TYPE_LARGE")
        public static final StyleType STYLE_TYPE_LARGE = new StyleType("STYLE_TYPE_LARGE", 1);

        @i(name = "STYLE_TYPE_MEDIUM_LARGE")
        public static final StyleType STYLE_TYPE_MEDIUM_LARGE = new StyleType("STYLE_TYPE_MEDIUM_LARGE", 2);

        @i(name = "STYLE_TYPE_MEDIUM")
        public static final StyleType STYLE_TYPE_MEDIUM = new StyleType("STYLE_TYPE_MEDIUM", 3);

        @i(name = "STYLE_TYPE_SMALL_MEDIUM")
        public static final StyleType STYLE_TYPE_SMALL_MEDIUM = new StyleType("STYLE_TYPE_SMALL_MEDIUM", 4);

        @i(name = "STYLE_TYPE_SMALL")
        public static final StyleType STYLE_TYPE_SMALL = new StyleType("STYLE_TYPE_SMALL", 5);

        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{STYLE_TYPE_INVALID, STYLE_TYPE_LARGE, STYLE_TYPE_MEDIUM_LARGE, STYLE_TYPE_MEDIUM, STYLE_TYPE_SMALL_MEDIUM, STYLE_TYPE_SMALL};
        }

        static {
            StyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleType(String str, int i11) {
        }

        @NotNull
        public static a<StyleType> getEntries() {
            return $ENTRIES;
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    public Price() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ Price copy$default(Price price, StyleType styleType, StyleType styleType2, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, OzonSpannableString ozonSpannableString3, String str2, String str3, String str4, String str5, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            styleType = price.style;
        }
        if ((i11 & 2) != 0) {
            styleType2 = price.theme;
        }
        if ((i11 & 4) != 0) {
            ozonSpannableString = price.price;
        }
        if ((i11 & 8) != 0) {
            ozonSpannableString2 = price.priceSubtitle;
        }
        if ((i11 & 16) != 0) {
            str = price.priceColor;
        }
        if ((i11 & 32) != 0) {
            ozonSpannableString3 = price.originalPrice;
        }
        if ((i11 & 64) != 0) {
            str2 = price.originalPriceColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = price.image;
        }
        if ((i11 & 256) != 0) {
            str4 = price.imageTintColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str5 = price.strikethroughColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = price.trackingInfo;
        }
        if ((i11 & 2048) != 0) {
            testInfo = price.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        String str10 = str;
        OzonSpannableString ozonSpannableString4 = ozonSpannableString3;
        return price.copy(styleType, styleType2, ozonSpannableString, ozonSpannableString2, str10, ozonSpannableString4, str8, str9, str6, str7, map2, testInfo2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getStyle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final StyleType getStyle() {
        return this.style;
    }

    /* renamed from: component10, reason: from getter */
    public final String getStrikethroughColor() {
        return this.strikethroughColor;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final StyleType getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final OzonSpannableString getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final OzonSpannableString getPriceSubtitle() {
        return this.priceSubtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPriceColor() {
        return this.priceColor;
    }

    /* renamed from: component6, reason: from getter */
    public final OzonSpannableString getOriginalPrice() {
        return this.originalPrice;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOriginalPriceColor() {
        return this.originalPriceColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component9, reason: from getter */
    public final String getImageTintColor() {
        return this.imageTintColor;
    }

    @NotNull
    public final Price copy(StyleType style, StyleType theme, OzonSpannableString price, OzonSpannableString priceSubtitle, String priceColor, OzonSpannableString originalPrice, String originalPriceColor, String image, String imageTintColor, String strikethroughColor, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        return new Price(style, theme, price, priceSubtitle, priceColor, originalPrice, originalPriceColor, image, imageTintColor, strikethroughColor, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return this.style == price.style && this.theme == price.theme && Intrinsics.d(this.price, price.price) && Intrinsics.d(this.priceSubtitle, price.priceSubtitle) && Intrinsics.d(this.priceColor, price.priceColor) && Intrinsics.d(this.originalPrice, price.originalPrice) && Intrinsics.d(this.originalPriceColor, price.originalPriceColor) && Intrinsics.d(this.image, price.image) && Intrinsics.d(this.imageTintColor, price.imageTintColor) && Intrinsics.d(this.strikethroughColor, price.strikethroughColor) && Intrinsics.d(this.trackingInfo, price.trackingInfo) && Intrinsics.d(this.testInfo, price.testInfo);
    }

    public final StyleType getCurrentStyle() {
        StyleType styleType = this.theme;
        return styleType == null ? this.style : styleType;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageTintColor() {
        return this.imageTintColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.atom_type_price;
    }

    public final OzonSpannableString getOriginalPrice() {
        return this.originalPrice;
    }

    public final String getOriginalPriceColor() {
        return this.originalPriceColor;
    }

    public final OzonSpannableString getPrice() {
        return this.price;
    }

    public final String getPriceColor() {
        return this.priceColor;
    }

    public final OzonSpannableString getPriceSubtitle() {
        return this.priceSubtitle;
    }

    public final String getStrikethroughColor() {
        return this.strikethroughColor;
    }

    public final StyleType getStyle() {
        return this.style;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final StyleType getTheme() {
        return this.theme;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        StyleType styleType = this.style;
        int hashCode = (styleType == null ? 0 : styleType.hashCode()) * 31;
        StyleType styleType2 = this.theme;
        int hashCode2 = (hashCode + (styleType2 == null ? 0 : styleType2.hashCode())) * 31;
        OzonSpannableString ozonSpannableString = this.price;
        int hashCode3 = (hashCode2 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        OzonSpannableString ozonSpannableString2 = this.priceSubtitle;
        int hashCode4 = (hashCode3 + (ozonSpannableString2 == null ? 0 : ozonSpannableString2.hashCode())) * 31;
        String str = this.priceColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        OzonSpannableString ozonSpannableString3 = this.originalPrice;
        int hashCode6 = (hashCode5 + (ozonSpannableString3 == null ? 0 : ozonSpannableString3.hashCode())) * 31;
        String str2 = this.originalPriceColor;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageTintColor;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.strikethroughColor;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode11 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StyleType styleType = this.style;
        StyleType styleType2 = this.theme;
        OzonSpannableString ozonSpannableString = this.price;
        OzonSpannableString ozonSpannableString2 = this.priceSubtitle;
        String str = this.priceColor;
        OzonSpannableString ozonSpannableString3 = this.originalPrice;
        String str2 = this.originalPriceColor;
        String str3 = this.image;
        String str4 = this.imageTintColor;
        String str5 = this.strikethroughColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("Price(style=");
        sb2.append(styleType);
        sb2.append(", theme=");
        sb2.append(styleType2);
        sb2.append(", price=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", priceSubtitle=");
        sb2.append((Object) ozonSpannableString2);
        sb2.append(", priceColor=");
        sb2.append(str);
        sb2.append(", originalPrice=");
        sb2.append((Object) ozonSpannableString3);
        sb2.append(", originalPriceColor=");
        Nh.a.h(sb2, str2, ", image=", str3, ", imageTintColor=");
        Nh.a.h(sb2, str4, ", strikethroughColor=", str5, ", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StyleType styleType = this.style;
        if (styleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleType.name());
        }
        StyleType styleType2 = this.theme;
        if (styleType2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleType2.name());
        }
        OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
        ozonSpannableStringParceler.write(this.price, dest, flags);
        ozonSpannableStringParceler.write(this.priceSubtitle, dest, flags);
        dest.writeString(this.priceColor);
        ozonSpannableStringParceler.write(this.originalPrice, dest, flags);
        dest.writeString(this.originalPriceColor);
        dest.writeString(this.image);
        dest.writeString(this.imageTintColor);
        dest.writeString(this.strikethroughColor);
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
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ Price(StyleType styleType, StyleType styleType2, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, OzonSpannableString ozonSpannableString3, String str2, String str3, String str4, String str5, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : styleType, (i11 & 2) != 0 ? null : styleType2, (i11 & 4) != 0 ? null : ozonSpannableString, (i11 & 8) != 0 ? null : ozonSpannableString2, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : ozonSpannableString3, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : map, (i11 & 2048) != 0 ? null : testInfo);
    }

    public Price(StyleType styleType, StyleType styleType2, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, OzonSpannableString ozonSpannableString3, String str2, String str3, String str4, String str5, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(AtomTypeImpl.PRICE, null, map, testInfo);
        this.style = styleType;
        this.theme = styleType2;
        this.price = ozonSpannableString;
        this.priceSubtitle = ozonSpannableString2;
        this.priceColor = str;
        this.originalPrice = ozonSpannableString3;
        this.originalPriceColor = str2;
        this.image = str3;
        this.imageTintColor = str4;
        this.strikethroughColor = str5;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
