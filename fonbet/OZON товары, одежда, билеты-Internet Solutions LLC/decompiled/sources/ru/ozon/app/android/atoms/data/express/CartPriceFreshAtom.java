package ru.ozon.app.android.atoms.data.express;

import B0.C2454a;
import C.J;
import De.C2859b;
import G.g;
import N3.C3660k;
import T7.P;
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
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003TUVB«\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00106\u001a\u00020\rH\u0016J\t\u00107\u001a\u00020\u0004HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÁ\u0001\u0010G\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0006\u0010H\u001a\u00020\rJ\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\rHÖ\u0001J\t\u0010N\u001a\u00020\bHÖ\u0001J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006W"}, d2 = {"Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroid/os/Parcelable;", "atomType", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceType;", "theme", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;", "price", "", "priceColor", "originalPrice", "originalPriceColor", "currentItems", "", "maxQuantity", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "unitOfMeasure", "plusButton", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$Button;", "minusButton", "backgroundButtonsColor", "priceWithUnit", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceType;Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;Ljava/lang/String;Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$Button;Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$Button;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAtomType", "()Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceType;", "getTheme", "()Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;", "getPrice", "()Ljava/lang/String;", "getPriceColor", "getOriginalPrice", "getOriginalPriceColor", "getCurrentItems", "()I", "getMaxQuantity", "getAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "getUnitOfMeasure", "getPlusButton", "()Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$Button;", "getMinusButton", "getBackgroundButtonsColor", "getPriceWithUnit", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Button", "CartPriceType", "CartPriceStyleType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartPriceFreshAtom extends AtomDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CartPriceFreshAtom> CREATOR = new Creator();
    private final ButtonV3Atom.AddToCartAtom.Action action;

    @NotNull
    private final CartPriceType atomType;

    @NotNull
    private final String backgroundButtonsColor;
    private final int currentItems;
    private final int maxQuantity;

    @NotNull
    private final Button minusButton;
    private final String originalPrice;
    private final String originalPriceColor;

    @NotNull
    private final Button plusButton;

    @NotNull
    private final String price;

    @NotNull
    private final String priceColor;

    @NotNull
    private final String priceWithUnit;
    private final TestInfo testInfo;
    private final CartPriceStyleType theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String unitOfMeasure;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceStyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_INVALID", "STYLE_TYPE_PRIMARY", "STYLE_TYPE_PRIMARY_EXPRESS", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class CartPriceStyleType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartPriceStyleType[] $VALUES;
        public static final CartPriceStyleType STYLE_TYPE_INVALID = new CartPriceStyleType("STYLE_TYPE_INVALID", 0);
        public static final CartPriceStyleType STYLE_TYPE_PRIMARY = new CartPriceStyleType("STYLE_TYPE_PRIMARY", 1);
        public static final CartPriceStyleType STYLE_TYPE_PRIMARY_EXPRESS = new CartPriceStyleType("STYLE_TYPE_PRIMARY_EXPRESS", 2);

        private static final /* synthetic */ CartPriceStyleType[] $values() {
            return new CartPriceStyleType[]{STYLE_TYPE_INVALID, STYLE_TYPE_PRIMARY, STYLE_TYPE_PRIMARY_EXPRESS};
        }

        static {
            CartPriceStyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartPriceStyleType(String str, int i11) {
        }

        @NotNull
        public static a<CartPriceStyleType> getEntries() {
            return $ENTRIES;
        }

        public static CartPriceStyleType valueOf(String str) {
            return (CartPriceStyleType) Enum.valueOf(CartPriceStyleType.class, str);
        }

        public static CartPriceStyleType[] values() {
            return (CartPriceStyleType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$CartPriceType;", "", "<init>", "(Ljava/lang/String;I)V", "ATOM_TYPE_PRICE", "ATOM_TYPE_QUANTITY", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class CartPriceType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartPriceType[] $VALUES;
        public static final CartPriceType ATOM_TYPE_PRICE = new CartPriceType("ATOM_TYPE_PRICE", 0);
        public static final CartPriceType ATOM_TYPE_QUANTITY = new CartPriceType("ATOM_TYPE_QUANTITY", 1);

        private static final /* synthetic */ CartPriceType[] $values() {
            return new CartPriceType[]{ATOM_TYPE_PRICE, ATOM_TYPE_QUANTITY};
        }

        static {
            CartPriceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartPriceType(String str, int i11) {
        }

        @NotNull
        public static a<CartPriceType> getEntries() {
            return $ENTRIES;
        }

        public static CartPriceType valueOf(String str) {
            return (CartPriceType) Enum.valueOf(CartPriceType.class, str);
        }

        public static CartPriceType[] values() {
            return (CartPriceType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<CartPriceFreshAtom> {
        @Override // android.os.Parcelable.Creator
        public final CartPriceFreshAtom createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CartPriceType valueOf = CartPriceType.valueOf(parcel.readString());
            LinkedHashMap linkedHashMap = null;
            CartPriceStyleType valueOf2 = parcel.readInt() == 0 ? null : CartPriceStyleType.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CartPriceStyleType cartPriceStyleType = valueOf2;
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ButtonV3Atom.AddToCartAtom.Action action = (ButtonV3Atom.AddToCartAtom.Action) parcel.readParcelable(CartPriceFreshAtom.class.getClassLoader());
            String readString5 = parcel.readString();
            Parcelable.Creator<Button> creator = Button.CREATOR;
            Button createFromParcel = creator.createFromParcel(parcel);
            Button createFromParcel2 = creator.createFromParcel(parcel);
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i11 = 0;
                while (i11 != readInt3) {
                    int i12 = readInt3;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    i11 = C2859b.a(CartPriceFreshAtom.class, parcel, linkedHashMap3, parcel.readString(), i11, 1);
                    linkedHashMap2 = linkedHashMap3;
                    readInt3 = i12;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CartPriceFreshAtom(valueOf, cartPriceStyleType, readString, readString2, readString3, readString4, readInt, readInt2, action, readString5, createFromParcel, createFromParcel2, readString6, readString7, linkedHashMap, (TestInfo) parcel.readParcelable(CartPriceFreshAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CartPriceFreshAtom[] newArray(int i11) {
            return new CartPriceFreshAtom[i11];
        }
    }

    public /* synthetic */ CartPriceFreshAtom(CartPriceType cartPriceType, CartPriceStyleType cartPriceStyleType, String str, String str2, String str3, String str4, int i11, int i12, ButtonV3Atom.AddToCartAtom.Action action, String str5, Button button, Button button2, String str6, String str7, Map map, TestInfo testInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cartPriceType, cartPriceStyleType, str, str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? 0 : i11, i12, (i13 & 256) != 0 ? null : action, str5, button, button2, str6, str7, map, (i13 & 32768) != 0 ? null : testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CartPriceType getAtomType() {
        return this.atomType;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final Button getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Button getMinusButton() {
        return this.minusButton;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getBackgroundButtonsColor() {
        return this.backgroundButtonsColor;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getPriceWithUnit() {
        return this.priceWithUnit;
    }

    public final Map<String, TokenizedTrackingInfo> component15() {
        return this.trackingInfo;
    }

    /* renamed from: component16, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final CartPriceStyleType getTheme() {
        return this.theme;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPriceColor() {
        return this.priceColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOriginalPriceColor() {
        return this.originalPriceColor;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCurrentItems() {
        return this.currentItems;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    /* renamed from: component9, reason: from getter */
    public final ButtonV3Atom.AddToCartAtom.Action getAction() {
        return this.action;
    }

    @NotNull
    public final CartPriceFreshAtom copy(@i(name = "type") @NotNull CartPriceType atomType, CartPriceStyleType theme, @NotNull String price, @NotNull String priceColor, String originalPrice, String originalPriceColor, int currentItems, int maxQuantity, ButtonV3Atom.AddToCartAtom.Action action, @NotNull String unitOfMeasure, @NotNull Button plusButton, @NotNull Button minusButton, @NotNull String backgroundButtonsColor, @NotNull String priceWithUnit, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(atomType, "atomType");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceColor, "priceColor");
        Intrinsics.checkNotNullParameter(unitOfMeasure, "unitOfMeasure");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(minusButton, "minusButton");
        Intrinsics.checkNotNullParameter(backgroundButtonsColor, "backgroundButtonsColor");
        Intrinsics.checkNotNullParameter(priceWithUnit, "priceWithUnit");
        return new CartPriceFreshAtom(atomType, theme, price, priceColor, originalPrice, originalPriceColor, currentItems, maxQuantity, action, unitOfMeasure, plusButton, minusButton, backgroundButtonsColor, priceWithUnit, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartPriceFreshAtom)) {
            return false;
        }
        CartPriceFreshAtom cartPriceFreshAtom = (CartPriceFreshAtom) other;
        return this.atomType == cartPriceFreshAtom.atomType && this.theme == cartPriceFreshAtom.theme && Intrinsics.d(this.price, cartPriceFreshAtom.price) && Intrinsics.d(this.priceColor, cartPriceFreshAtom.priceColor) && Intrinsics.d(this.originalPrice, cartPriceFreshAtom.originalPrice) && Intrinsics.d(this.originalPriceColor, cartPriceFreshAtom.originalPriceColor) && this.currentItems == cartPriceFreshAtom.currentItems && this.maxQuantity == cartPriceFreshAtom.maxQuantity && Intrinsics.d(this.action, cartPriceFreshAtom.action) && Intrinsics.d(this.unitOfMeasure, cartPriceFreshAtom.unitOfMeasure) && Intrinsics.d(this.plusButton, cartPriceFreshAtom.plusButton) && Intrinsics.d(this.minusButton, cartPriceFreshAtom.minusButton) && Intrinsics.d(this.backgroundButtonsColor, cartPriceFreshAtom.backgroundButtonsColor) && Intrinsics.d(this.priceWithUnit, cartPriceFreshAtom.priceWithUnit) && Intrinsics.d(this.trackingInfo, cartPriceFreshAtom.trackingInfo) && Intrinsics.d(this.testInfo, cartPriceFreshAtom.testInfo);
    }

    public final ButtonV3Atom.AddToCartAtom.Action getAction() {
        return this.action;
    }

    @NotNull
    public final CartPriceType getAtomType() {
        return this.atomType;
    }

    @NotNull
    public final String getBackgroundButtonsColor() {
        return this.backgroundButtonsColor;
    }

    public final int getCurrentItems() {
        return this.currentItems;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_cart_price_express_atom;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    @NotNull
    public final Button getMinusButton() {
        return this.minusButton;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    public final String getOriginalPriceColor() {
        return this.originalPriceColor;
    }

    @NotNull
    public final Button getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPriceColor() {
        return this.priceColor;
    }

    @NotNull
    public final String getPriceWithUnit() {
        return this.priceWithUnit;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final CartPriceStyleType getTheme() {
        return this.theme;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public int hashCode() {
        int hashCode = this.atomType.hashCode() * 31;
        CartPriceStyleType cartPriceStyleType = this.theme;
        int a11 = g.a(g.a((hashCode + (cartPriceStyleType == null ? 0 : cartPriceStyleType.hashCode())) * 31, 31, this.price), 31, this.priceColor);
        String str = this.originalPrice;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalPriceColor;
        int a12 = C2454a.a(this.maxQuantity, C2454a.a(this.currentItems, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        ButtonV3Atom.AddToCartAtom.Action action = this.action;
        int a13 = g.a(g.a((this.minusButton.hashCode() + ((this.plusButton.hashCode() + g.a((a12 + (action == null ? 0 : action.hashCode())) * 31, 31, this.unitOfMeasure)) * 31)) * 31, 31, this.backgroundButtonsColor), 31, this.priceWithUnit);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (a13 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CartPriceType cartPriceType = this.atomType;
        CartPriceStyleType cartPriceStyleType = this.theme;
        String str = this.price;
        String str2 = this.priceColor;
        String str3 = this.originalPrice;
        String str4 = this.originalPriceColor;
        int i11 = this.currentItems;
        int i12 = this.maxQuantity;
        ButtonV3Atom.AddToCartAtom.Action action = this.action;
        String str5 = this.unitOfMeasure;
        Button button = this.plusButton;
        Button button2 = this.minusButton;
        String str6 = this.backgroundButtonsColor;
        String str7 = this.priceWithUnit;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("CartPriceFreshAtom(atomType=");
        sb2.append(cartPriceType);
        sb2.append(", theme=");
        sb2.append(cartPriceStyleType);
        sb2.append(", price=");
        Nh.a.h(sb2, str, ", priceColor=", str2, ", originalPrice=");
        Nh.a.h(sb2, str3, ", originalPriceColor=", str4, ", currentItems=");
        Ek.a.f(i11, i12, ", maxQuantity=", ", action=", sb2);
        sb2.append(action);
        sb2.append(", unitOfMeasure=");
        sb2.append(str5);
        sb2.append(", plusButton=");
        sb2.append(button);
        sb2.append(", minusButton=");
        sb2.append(button2);
        sb2.append(", backgroundButtonsColor=");
        Nh.a.h(sb2, str6, ", priceWithUnit=", str7, ", trackingInfo=");
        return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.atomType.name());
        CartPriceStyleType cartPriceStyleType = this.theme;
        if (cartPriceStyleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cartPriceStyleType.name());
        }
        dest.writeString(this.price);
        dest.writeString(this.priceColor);
        dest.writeString(this.originalPrice);
        dest.writeString(this.originalPriceColor);
        dest.writeInt(this.currentItems);
        dest.writeInt(this.maxQuantity);
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.unitOfMeasure);
        this.plusButton.writeToParcel(dest, flags);
        this.minusButton.writeToParcel(dest, flags);
        dest.writeString(this.backgroundButtonsColor);
        dest.writeString(this.priceWithUnit);
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
    public CartPriceFreshAtom(@i(name = "type") @NotNull CartPriceType atomType, CartPriceStyleType cartPriceStyleType, @NotNull String price, @NotNull String priceColor, String str, String str2, int i11, int i12, ButtonV3Atom.AddToCartAtom.Action action, @NotNull String unitOfMeasure, @NotNull Button plusButton, @NotNull Button minusButton, @NotNull String backgroundButtonsColor, @NotNull String priceWithUnit, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(AtomTypeImpl.ADD_TO_CART_WITH_PRICE_BUTTON, null, map, testInfo);
        Intrinsics.checkNotNullParameter(atomType, "atomType");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceColor, "priceColor");
        Intrinsics.checkNotNullParameter(unitOfMeasure, "unitOfMeasure");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(minusButton, "minusButton");
        Intrinsics.checkNotNullParameter(backgroundButtonsColor, "backgroundButtonsColor");
        Intrinsics.checkNotNullParameter(priceWithUnit, "priceWithUnit");
        this.atomType = atomType;
        this.theme = cartPriceStyleType;
        this.price = price;
        this.priceColor = priceColor;
        this.originalPrice = str;
        this.originalPriceColor = str2;
        this.currentItems = i11;
        this.maxQuantity = i12;
        this.action = action;
        this.unitOfMeasure = unitOfMeasure;
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.backgroundButtonsColor = backgroundButtonsColor;
        this.priceWithUnit = priceWithUnit;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom$Button;", "Landroid/os/Parcelable;", "color", "", "disabledColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getColor", "()Ljava/lang/String;", "getDisabledColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @NotNull
        private final String color;

        @NotNull
        private final String disabledColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
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
                return new Button(readString, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i11) {
                return new Button[i11];
            }
        }

        public Button(@NotNull String color, @NotNull String disabledColor, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(disabledColor, "disabledColor");
            this.color = color;
            this.disabledColor = disabledColor;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Button copy$default(Button button, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.color;
            }
            if ((i11 & 2) != 0) {
                str2 = button.disabledColor;
            }
            if ((i11 & 4) != 0) {
                map = button.trackingInfo;
            }
            return button.copy(str, str2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDisabledColor() {
            return this.disabledColor;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final Button copy(@NotNull String color, @NotNull String disabledColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(disabledColor, "disabledColor");
            return new Button(color, disabledColor, trackingInfo);
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
            return Intrinsics.d(this.color, button.color) && Intrinsics.d(this.disabledColor, button.disabledColor) && Intrinsics.d(this.trackingInfo, button.trackingInfo);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getDisabledColor() {
            return this.disabledColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.color.hashCode() * 31, 31, this.disabledColor);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.color;
            String str2 = this.disabledColor;
            return P.f(C3660k.d("Button(color=", str, ", disabledColor=", str2, ", trackingInfo="), this.trackingInfo, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.color);
            dest.writeString(this.disabledColor);
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

        public /* synthetic */ Button(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : map);
        }
    }
}
