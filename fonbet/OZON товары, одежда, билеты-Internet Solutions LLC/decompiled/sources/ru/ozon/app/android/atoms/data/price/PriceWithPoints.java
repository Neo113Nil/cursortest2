package ru.ozon.app.android.atoms.data.price;

import C.J;
import C.o0;
import De.C2859b;
import G.g;
import Sc.InterfaceC3999a;
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
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.AtomTypeImpl;
import ru.ozon.app.android.atoms.data.TestInfo;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003-./BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010!\u001a\u00020\u001aJ\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u001aHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00060"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithPoints;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "context", "", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "price", "Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Price;", "points", "Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Points;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Price;Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Points;)V", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getPrice", "()Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Price;", "getPoints", "()Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Points;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Price", "Points", "ThemeType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PriceWithPoints extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PriceWithPoints> CREATOR = new Creator();
    private final String context;
    private final Points points;
    private final Price price;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceWithPoints> {
        @Override // android.os.Parcelable.Creator
        public final PriceWithPoints createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(PriceWithPoints.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PriceWithPoints(readString, createFromParcel, linkedHashMap, parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Points.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PriceWithPoints[] newArray(int i11) {
            return new PriceWithPoints[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_SMALL", "THEME_TYPE_MEDIUM", "THEME_TYPE_LARGE", "THEME_TYPE_X_LARGE", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;

        @i(name = "THEME_TYPE_SMALL")
        public static final ThemeType THEME_TYPE_SMALL = new ThemeType("THEME_TYPE_SMALL", 0);

        @i(name = "THEME_TYPE_MEDIUM")
        public static final ThemeType THEME_TYPE_MEDIUM = new ThemeType("THEME_TYPE_MEDIUM", 1);

        @i(name = "THEME_TYPE_LARGE")
        public static final ThemeType THEME_TYPE_LARGE = new ThemeType("THEME_TYPE_LARGE", 2);

        @i(name = "THEME_TYPE_X_LARGE")
        public static final ThemeType THEME_TYPE_X_LARGE = new ThemeType("THEME_TYPE_X_LARGE", 3);

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_SMALL, THEME_TYPE_MEDIUM, THEME_TYPE_LARGE, THEME_TYPE_X_LARGE};
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

    public PriceWithPoints() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PriceWithPoints copy$default(PriceWithPoints priceWithPoints, String str, TestInfo testInfo, Map map, Price price, Points points, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = priceWithPoints.context;
        }
        if ((i11 & 2) != 0) {
            testInfo = priceWithPoints.testInfo;
        }
        if ((i11 & 4) != 0) {
            map = priceWithPoints.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            price = priceWithPoints.price;
        }
        if ((i11 & 16) != 0) {
            points = priceWithPoints.points;
        }
        Points points2 = points;
        Map map2 = map;
        return priceWithPoints.copy(str, testInfo, map2, price, points2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final Points getPoints() {
        return this.points;
    }

    @NotNull
    public final PriceWithPoints copy(String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Price price, Points points) {
        return new PriceWithPoints(context, testInfo, trackingInfo, price, points);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceWithPoints)) {
            return false;
        }
        PriceWithPoints priceWithPoints = (PriceWithPoints) other;
        return Intrinsics.d(this.context, priceWithPoints.context) && Intrinsics.d(this.testInfo, priceWithPoints.testInfo) && Intrinsics.d(this.trackingInfo, priceWithPoints.trackingInfo) && Intrinsics.d(this.price, priceWithPoints.price) && Intrinsics.d(this.points, priceWithPoints.points);
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.atom_type_price_with_discount;
    }

    public final Points getPoints() {
        return this.points;
    }

    public final Price getPrice() {
        return this.price;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.context;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Price price = this.price;
        int hashCode4 = (hashCode3 + (price == null ? 0 : price.hashCode())) * 31;
        Points points = this.points;
        return hashCode4 + (points != null ? points.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceWithPoints(context=" + this.context + ", testInfo=" + this.testInfo + ", trackingInfo=" + this.trackingInfo + ", price=" + this.price + ", points=" + this.points + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
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
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        Price price = this.price;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Points points = this.points;
        if (points == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            points.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ PriceWithPoints(String str, TestInfo testInfo, Map map, Price price, Points points, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : testInfo, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : price, (i11 & 16) != 0 ? null : points);
    }

    public PriceWithPoints(String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Price price, Points points) {
        super(AtomTypeImpl.PRICE_WITH_POINTS, str, map, testInfo);
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.price = price;
        this.points = points;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Price;", "Landroid/os/Parcelable;", "theme", "Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;", "text", "", "color", "<init>", "(Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;Ljava/lang/String;Ljava/lang/String;)V", "getTheme", "()Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;", "getText", "()Ljava/lang/String;", "getColor", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Price> CREATOR = new Creator();
        private final String color;

        @NotNull
        private final String text;
        private final ThemeType theme;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Price> {
            @Override // android.os.Parcelable.Creator
            public final Price createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Price(parcel.readInt() == 0 ? null : ThemeType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Price[] newArray(int i11) {
                return new Price[i11];
            }
        }

        public Price(ThemeType themeType, @NotNull String text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.theme = themeType;
            this.text = text;
            this.color = str;
        }

        public static /* synthetic */ Price copy$default(Price price, ThemeType themeType, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                themeType = price.theme;
            }
            if ((i11 & 2) != 0) {
                str = price.text;
            }
            if ((i11 & 4) != 0) {
                str2 = price.color;
            }
            return price.copy(themeType, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final ThemeType getTheme() {
            return this.theme;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Price copy(ThemeType theme, @NotNull String text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Price(theme, text, color);
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
            return this.theme == price.theme && Intrinsics.d(this.text, price.text) && Intrinsics.d(this.color, price.color);
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final ThemeType getTheme() {
            return this.theme;
        }

        public int hashCode() {
            ThemeType themeType = this.theme;
            int a11 = g.a((themeType == null ? 0 : themeType.hashCode()) * 31, 31, this.text);
            String str = this.color;
            return a11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ThemeType themeType = this.theme;
            String str = this.text;
            String str2 = this.color;
            StringBuilder sb2 = new StringBuilder("Price(theme=");
            sb2.append(themeType);
            sb2.append(", text=");
            sb2.append(str);
            sb2.append(", color=");
            return o0.c(sb2, str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ThemeType themeType = this.theme;
            if (themeType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(themeType.name());
            }
            dest.writeString(this.text);
            dest.writeString(this.color);
        }

        public /* synthetic */ Price(ThemeType themeType, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : themeType, str, (i11 & 4) != 0 ? null : str2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithPoints$Points;", "Landroid/os/Parcelable;", "theme", "Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;", "text", "", "color", "firstIcon", "firstIconBackgroundColor", "secondIcon", "secondIconBackgroundColor", "<init>", "(Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTheme", "()Lru/ozon/app/android/atoms/data/price/PriceWithPoints$ThemeType;", "getText", "()Ljava/lang/String;", "getColor", "getFirstIcon", "getFirstIconBackgroundColor", "getSecondIcon", "getSecondIconBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Points implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Points> CREATOR = new Creator();
        private final String color;
        private final String firstIcon;
        private final String firstIconBackgroundColor;
        private final String secondIcon;
        private final String secondIconBackgroundColor;

        @NotNull
        private final String text;
        private final ThemeType theme;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Points> {
            @Override // android.os.Parcelable.Creator
            public final Points createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Points(parcel.readInt() == 0 ? null : ThemeType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Points[] newArray(int i11) {
                return new Points[i11];
            }
        }

        public Points(ThemeType themeType, @NotNull String text, String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.theme = themeType;
            this.text = text;
            this.color = str;
            this.firstIcon = str2;
            this.firstIconBackgroundColor = str3;
            this.secondIcon = str4;
            this.secondIconBackgroundColor = str5;
        }

        public static /* synthetic */ Points copy$default(Points points, ThemeType themeType, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                themeType = points.theme;
            }
            if ((i11 & 2) != 0) {
                str = points.text;
            }
            if ((i11 & 4) != 0) {
                str2 = points.color;
            }
            if ((i11 & 8) != 0) {
                str3 = points.firstIcon;
            }
            if ((i11 & 16) != 0) {
                str4 = points.firstIconBackgroundColor;
            }
            if ((i11 & 32) != 0) {
                str5 = points.secondIcon;
            }
            if ((i11 & 64) != 0) {
                str6 = points.secondIconBackgroundColor;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            String str10 = str2;
            return points.copy(themeType, str, str10, str3, str9, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final ThemeType getTheme() {
            return this.theme;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFirstIcon() {
            return this.firstIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final String getFirstIconBackgroundColor() {
            return this.firstIconBackgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSecondIcon() {
            return this.secondIcon;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSecondIconBackgroundColor() {
            return this.secondIconBackgroundColor;
        }

        @NotNull
        public final Points copy(ThemeType theme, @NotNull String text, String color, String firstIcon, String firstIconBackgroundColor, String secondIcon, String secondIconBackgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Points(theme, text, color, firstIcon, firstIconBackgroundColor, secondIcon, secondIconBackgroundColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Points)) {
                return false;
            }
            Points points = (Points) other;
            return this.theme == points.theme && Intrinsics.d(this.text, points.text) && Intrinsics.d(this.color, points.color) && Intrinsics.d(this.firstIcon, points.firstIcon) && Intrinsics.d(this.firstIconBackgroundColor, points.firstIconBackgroundColor) && Intrinsics.d(this.secondIcon, points.secondIcon) && Intrinsics.d(this.secondIconBackgroundColor, points.secondIconBackgroundColor);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getFirstIcon() {
            return this.firstIcon;
        }

        public final String getFirstIconBackgroundColor() {
            return this.firstIconBackgroundColor;
        }

        public final String getSecondIcon() {
            return this.secondIcon;
        }

        public final String getSecondIconBackgroundColor() {
            return this.secondIconBackgroundColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final ThemeType getTheme() {
            return this.theme;
        }

        public int hashCode() {
            ThemeType themeType = this.theme;
            int a11 = g.a((themeType == null ? 0 : themeType.hashCode()) * 31, 31, this.text);
            String str = this.color;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstIcon;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.firstIconBackgroundColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.secondIcon;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.secondIconBackgroundColor;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ThemeType themeType = this.theme;
            String str = this.text;
            String str2 = this.color;
            String str3 = this.firstIcon;
            String str4 = this.firstIconBackgroundColor;
            String str5 = this.secondIcon;
            String str6 = this.secondIconBackgroundColor;
            StringBuilder sb2 = new StringBuilder("Points(theme=");
            sb2.append(themeType);
            sb2.append(", text=");
            sb2.append(str);
            sb2.append(", color=");
            Nh.a.h(sb2, str2, ", firstIcon=", str3, ", firstIconBackgroundColor=");
            Nh.a.h(sb2, str4, ", secondIcon=", str5, ", secondIconBackgroundColor=");
            return o0.c(sb2, str6, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ThemeType themeType = this.theme;
            if (themeType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(themeType.name());
            }
            dest.writeString(this.text);
            dest.writeString(this.color);
            dest.writeString(this.firstIcon);
            dest.writeString(this.firstIconBackgroundColor);
            dest.writeString(this.secondIcon);
            dest.writeString(this.secondIconBackgroundColor);
        }

        public /* synthetic */ Points(ThemeType themeType, String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : themeType, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6);
        }
    }
}
