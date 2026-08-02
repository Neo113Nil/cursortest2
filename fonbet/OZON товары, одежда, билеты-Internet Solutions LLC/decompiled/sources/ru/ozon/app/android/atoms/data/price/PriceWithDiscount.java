package ru.ozon.app.android.atoms.data.price;

import C.J;
import De.C2859b;
import G.g;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Jq\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010&\u001a\u00020\u001cJ\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001cHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithDiscount;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "price", "", "priceColor", "strikethroughColor", "discount", "discountColor", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "getPrice", "()Ljava/lang/String;", "getPriceColor", "getStrikethroughColor", "getDiscount", "getDiscountColor", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PriceWithDiscount extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PriceWithDiscount> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final String discount;
    private final String discountColor;

    @NotNull
    private final String price;
    private final String priceColor;
    private final String strikethroughColor;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceWithDiscount> {
        @Override // android.os.Parcelable.Creator
        public final PriceWithDiscount createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(PriceWithDiscount.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PriceWithDiscount(readString, readString2, readString3, readString4, readString5, readString6, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PriceWithDiscount[] newArray(int i11) {
            return new PriceWithDiscount[i11];
        }
    }

    public /* synthetic */ PriceWithDiscount(String str, String str2, String str3, String str4, String str5, String str6, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo);
    }

    public static /* synthetic */ PriceWithDiscount copy$default(PriceWithDiscount priceWithDiscount, String str, String str2, String str3, String str4, String str5, String str6, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = priceWithDiscount.price;
        }
        if ((i11 & 2) != 0) {
            str2 = priceWithDiscount.priceColor;
        }
        if ((i11 & 4) != 0) {
            str3 = priceWithDiscount.strikethroughColor;
        }
        if ((i11 & 8) != 0) {
            str4 = priceWithDiscount.discount;
        }
        if ((i11 & 16) != 0) {
            str5 = priceWithDiscount.discountColor;
        }
        if ((i11 & 32) != 0) {
            str6 = priceWithDiscount.context;
        }
        if ((i11 & 64) != 0) {
            map = priceWithDiscount.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = priceWithDiscount.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str7 = str5;
        String str8 = str6;
        return priceWithDiscount.copy(str, str2, str3, str4, str7, str8, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPriceColor() {
        return this.priceColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStrikethroughColor() {
        return this.strikethroughColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDiscountColor() {
        return this.discountColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final PriceWithDiscount copy(@NotNull String price, String priceColor, String strikethroughColor, @NotNull String discount, String discountColor, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discount, "discount");
        return new PriceWithDiscount(price, priceColor, strikethroughColor, discount, discountColor, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceWithDiscount)) {
            return false;
        }
        PriceWithDiscount priceWithDiscount = (PriceWithDiscount) other;
        return Intrinsics.d(this.price, priceWithDiscount.price) && Intrinsics.d(this.priceColor, priceWithDiscount.priceColor) && Intrinsics.d(this.strikethroughColor, priceWithDiscount.strikethroughColor) && Intrinsics.d(this.discount, priceWithDiscount.discount) && Intrinsics.d(this.discountColor, priceWithDiscount.discountColor) && Intrinsics.d(this.context, priceWithDiscount.context) && Intrinsics.d(this.trackingInfo, priceWithDiscount.trackingInfo) && Intrinsics.d(this.testInfo, priceWithDiscount.testInfo);
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @NotNull
    public final String getDiscount() {
        return this.discount;
    }

    public final String getDiscountColor() {
        return this.discountColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.atom_type_price_with_discount;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    public final String getPriceColor() {
        return this.priceColor;
    }

    public final String getStrikethroughColor() {
        return this.strikethroughColor;
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
        int hashCode = this.price.hashCode() * 31;
        String str = this.priceColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strikethroughColor;
        int a11 = g.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.discount);
        String str3 = this.discountColor;
        int hashCode3 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.context;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.price;
        String str2 = this.priceColor;
        String str3 = this.strikethroughColor;
        String str4 = this.discount;
        String str5 = this.discountColor;
        String str6 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("PriceWithDiscount(price=", str, ", priceColor=", str2, ", strikethroughColor=");
        a.h(d11, str3, ", discount=", str4, ", discountColor=");
        a.h(d11, str5, ", context=", str6, ", trackingInfo=");
        d11.append(map);
        d11.append(", testInfo=");
        d11.append(testInfo);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.price);
        dest.writeString(this.priceColor);
        dest.writeString(this.strikethroughColor);
        dest.writeString(this.discount);
        dest.writeString(this.discountColor);
        dest.writeString(this.context);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithDiscount(@NotNull String price, String str, String str2, @NotNull String discount, String str3, String str4, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(AtomTypeImpl.PRICE_WITH_DISCOUNT, str4, map, testInfo);
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.price = price;
        this.priceColor = str;
        this.strikethroughColor = str2;
        this.discount = discount;
        this.discountColor = str3;
        this.context = str4;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
