package ru.ozon.app.android.storefront.core.socialAtoms.productList.container;

import B3.p;
import C.J;
import De.C2859b;
import G.g;
import N3.C3660k;
import Ns.b;
import Pk0.h;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010\u0015J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0017R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "Landroid/os/Parcelable;", "", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "items", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "component3", "()Lru/ozon/uni/atoms/data/TestInfo;", "copy", "(Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "ProductListItemDTO", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SocialProductListDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SocialProductListDTO> CREATOR = new Creator();

    @NotNull
    private final List<ProductListItemDTO> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialProductListDTO> {
        @Override // android.os.Parcelable.Creator
        public final SocialProductListDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readValue(SocialProductListDTO.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(SocialProductListDTO.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SocialProductListDTO(arrayList, linkedHashMap, (TestInfo) parcel.readParcelable(SocialProductListDTO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SocialProductListDTO[] newArray(int i11) {
            return new SocialProductListDTO[i11];
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "", "<init>", "()V", "AllProductsDTO", "ProductDTO", "CouponDTO", "ServiceDTO", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$AllProductsDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$ProductDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$ServiceDTO;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "allProducts", type = AllProductsDTO.class), @ProtoOneOfSignature(name = ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, type = ProductDTO.class), @ProtoOneOfSignature(name = "coupon", type = CouponDTO.class), @ProtoOneOfSignature(name = "service", type = ServiceDTO.class)})
    @ProtoOneOf(label = "type")
    public static abstract class ProductListItemDTO {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$AllProductsDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "shortTitle", "productsCount", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Ljava/lang/String;", "getShortTitle", "getProductsCount", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AllProductsDTO extends ProductListItemDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AllProductsDTO> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final String productsCount;

            @NotNull
            private final String shortTitle;
            private final TestInfo testInfo;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AllProductsDTO> {
                @Override // android.os.Parcelable.Creator
                public final AllProductsDTO createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(AllProductsDTO.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = C2859b.a(AllProductsDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new AllProductsDTO(readString, readString2, readString3, atomActionDTO, linkedHashMap, (TestInfo) parcel.readParcelable(AllProductsDTO.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final AllProductsDTO[] newArray(int i11) {
                    return new AllProductsDTO[i11];
                }
            }

            public /* synthetic */ AllProductsDTO(String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i11 & 8) != 0 ? null : atomActionDTO, map, (i11 & 32) != 0 ? null : testInfo);
            }

            public static /* synthetic */ AllProductsDTO copy$default(AllProductsDTO allProductsDTO, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = allProductsDTO.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = allProductsDTO.shortTitle;
                }
                if ((i11 & 4) != 0) {
                    str3 = allProductsDTO.productsCount;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = allProductsDTO.action;
                }
                if ((i11 & 16) != 0) {
                    map = allProductsDTO.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    testInfo = allProductsDTO.testInfo;
                }
                Map map2 = map;
                TestInfo testInfo2 = testInfo;
                return allProductsDTO.copy(str, str2, str3, atomActionDTO, map2, testInfo2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getShortTitle() {
                return this.shortTitle;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getProductsCount() {
                return this.productsCount;
            }

            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final AllProductsDTO copy(@NotNull String title, @NotNull String shortTitle, @NotNull String productsCount, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(shortTitle, "shortTitle");
                Intrinsics.checkNotNullParameter(productsCount, "productsCount");
                return new AllProductsDTO(title, shortTitle, productsCount, action, trackingInfo, testInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AllProductsDTO)) {
                    return false;
                }
                AllProductsDTO allProductsDTO = (AllProductsDTO) other;
                return Intrinsics.d(this.title, allProductsDTO.title) && Intrinsics.d(this.shortTitle, allProductsDTO.shortTitle) && Intrinsics.d(this.productsCount, allProductsDTO.productsCount) && Intrinsics.d(this.action, allProductsDTO.action) && Intrinsics.d(this.trackingInfo, allProductsDTO.trackingInfo) && Intrinsics.d(this.testInfo, allProductsDTO.testInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final String getProductsCount() {
                return this.productsCount;
            }

            @NotNull
            public final String getShortTitle() {
                return this.shortTitle;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.shortTitle), 31, this.productsCount);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.shortTitle;
                String str3 = this.productsCount;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                StringBuilder d11 = C3660k.d("AllProductsDTO(title=", str, ", shortTitle=", str2, ", productsCount=");
                p.c(str3, ", action=", ", trackingInfo=", d11, atomActionDTO);
                return b.b(", testInfo=", ")", d11, map, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.shortTitle);
                dest.writeString(this.productsCount);
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
            public AllProductsDTO(@NotNull String title, @NotNull String shortTitle, @NotNull String productsCount, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(shortTitle, "shortTitle");
                Intrinsics.checkNotNullParameter(productsCount, "productsCount");
                this.title = title;
                this.shortTitle = shortTitle;
                this.productsCount = productsCount;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00014BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010(\u001a\u00020\u0004J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\t\u0010.\u001a\u00020\bHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "Landroid/os/Parcelable;", "id", "", "stackType", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO$CouponType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(ILru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO$CouponType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getId", "()I", "getStackType", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO$CouponType;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CouponType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class CouponDTO extends ProductListItemDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CouponDTO> CREATOR = new Creator();
            private final AtomActionDTO action;
            private final int id;

            @NotNull
            private final CouponType stackType;

            @NotNull
            private final String subtitle;
            private final TestInfo testInfo;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$CouponDTO$CouponType;", "", "<init>", "(Ljava/lang/String;I)V", "COUPON_WINNER", "COUPON_ALL_PRODUCTS", "COUPON_USUAL", "COUPON_TYPE_INVALID", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes7.dex */
            public static final class CouponType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ CouponType[] $VALUES;
                public static final CouponType COUPON_WINNER = new CouponType("COUPON_WINNER", 0);
                public static final CouponType COUPON_ALL_PRODUCTS = new CouponType("COUPON_ALL_PRODUCTS", 1);
                public static final CouponType COUPON_USUAL = new CouponType("COUPON_USUAL", 2);
                public static final CouponType COUPON_TYPE_INVALID = new CouponType("COUPON_TYPE_INVALID", 3);

                private static final /* synthetic */ CouponType[] $values() {
                    return new CouponType[]{COUPON_WINNER, COUPON_ALL_PRODUCTS, COUPON_USUAL, COUPON_TYPE_INVALID};
                }

                static {
                    CouponType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private CouponType(String str, int i11) {
                }

                public static CouponType valueOf(String str) {
                    return (CouponType) Enum.valueOf(CouponType.class, str);
                }

                public static CouponType[] values() {
                    return (CouponType[]) $VALUES.clone();
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CouponDTO> {
                @Override // android.os.Parcelable.Creator
                public final CouponDTO createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int readInt = parcel.readInt();
                    CouponType valueOf = CouponType.valueOf(parcel.readString());
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(CouponDTO.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                        int i11 = 0;
                        while (i11 != readInt2) {
                            i11 = C2859b.a(CouponDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new CouponDTO(readInt, valueOf, readString, readString2, atomActionDTO, linkedHashMap, (TestInfo) parcel.readParcelable(CouponDTO.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final CouponDTO[] newArray(int i11) {
                    return new CouponDTO[i11];
                }
            }

            public /* synthetic */ CouponDTO(int i11, CouponType couponType, String str, String str2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, couponType, str, str2, (i12 & 16) != 0 ? null : atomActionDTO, map, (i12 & 64) != 0 ? null : testInfo);
            }

            public static /* synthetic */ CouponDTO copy$default(CouponDTO couponDTO, int i11, CouponType couponType, String str, String str2, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = couponDTO.id;
                }
                if ((i12 & 2) != 0) {
                    couponType = couponDTO.stackType;
                }
                if ((i12 & 4) != 0) {
                    str = couponDTO.title;
                }
                if ((i12 & 8) != 0) {
                    str2 = couponDTO.subtitle;
                }
                if ((i12 & 16) != 0) {
                    atomActionDTO = couponDTO.action;
                }
                if ((i12 & 32) != 0) {
                    map = couponDTO.trackingInfo;
                }
                if ((i12 & 64) != 0) {
                    testInfo = couponDTO.testInfo;
                }
                Map map2 = map;
                TestInfo testInfo2 = testInfo;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                String str3 = str;
                return couponDTO.copy(i11, couponType, str3, str2, atomActionDTO2, map2, testInfo2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CouponType getStackType() {
                return this.stackType;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final CouponDTO copy(int id2, @NotNull CouponType stackType, @NotNull String title, @NotNull String subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(stackType, "stackType");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new CouponDTO(id2, stackType, title, subtitle, action, trackingInfo, testInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CouponDTO)) {
                    return false;
                }
                CouponDTO couponDTO = (CouponDTO) other;
                return this.id == couponDTO.id && this.stackType == couponDTO.stackType && Intrinsics.d(this.title, couponDTO.title) && Intrinsics.d(this.subtitle, couponDTO.subtitle) && Intrinsics.d(this.action, couponDTO.action) && Intrinsics.d(this.trackingInfo, couponDTO.trackingInfo) && Intrinsics.d(this.testInfo, couponDTO.testInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final int getId() {
                return this.id;
            }

            @NotNull
            public final CouponType getStackType() {
                return this.stackType;
            }

            @NotNull
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(g.a((this.stackType.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.title), 31, this.subtitle);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                CouponType couponType = this.stackType;
                String str = this.title;
                String str2 = this.subtitle;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                StringBuilder sb2 = new StringBuilder("CouponDTO(id=");
                sb2.append(i11);
                sb2.append(", stackType=");
                sb2.append(couponType);
                sb2.append(", title=");
                Nh.a.h(sb2, str, ", subtitle=", str2, ", action=");
                Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
                return h.c(sb2, testInfo, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.id);
                dest.writeString(this.stackType.name());
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
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
            public CouponDTO(int i11, @NotNull CouponType stackType, @NotNull String title, @NotNull String subtitle, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(stackType, "stackType");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.id = i11;
                this.stackType = stackType;
                this.title = title;
                this.subtitle = subtitle;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003J{\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$ProductDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "Landroid/os/Parcelable;", "image", "", "price", "originalPrice", "description", "icon", "badge", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getPrice", "getOriginalPrice", "getDescription", "getIcon", "getBadge", "()Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductDTO extends ProductListItemDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ProductDTO> CREATOR = new Creator();
            private final AtomActionDTO action;
            private final SocialBadgeAtomDTO badge;

            @NotNull
            private final String description;
            private final String icon;

            @NotNull
            private final String image;
            private final String originalPrice;

            @NotNull
            private final String price;
            private final TestInfo testInfo;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ProductDTO> {
                @Override // android.os.Parcelable.Creator
                public final ProductDTO createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    LinkedHashMap linkedHashMap = null;
                    SocialBadgeAtomDTO createFromParcel = parcel.readInt() == 0 ? null : SocialBadgeAtomDTO.CREATOR.createFromParcel(parcel);
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ProductDTO.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = C2859b.a(ProductDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new ProductDTO(readString, readString2, readString3, readString4, readString5, createFromParcel, atomActionDTO, linkedHashMap, (TestInfo) parcel.readParcelable(ProductDTO.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ProductDTO[] newArray(int i11) {
                    return new ProductDTO[i11];
                }
            }

            public /* synthetic */ ProductDTO(String str, String str2, String str3, String str4, String str5, SocialBadgeAtomDTO socialBadgeAtomDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : socialBadgeAtomDTO, (i11 & 64) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map, (i11 & 256) != 0 ? null : testInfo);
            }

            public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, String str, String str2, String str3, String str4, String str5, SocialBadgeAtomDTO socialBadgeAtomDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = productDTO.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = productDTO.price;
                }
                if ((i11 & 4) != 0) {
                    str3 = productDTO.originalPrice;
                }
                if ((i11 & 8) != 0) {
                    str4 = productDTO.description;
                }
                if ((i11 & 16) != 0) {
                    str5 = productDTO.icon;
                }
                if ((i11 & 32) != 0) {
                    socialBadgeAtomDTO = productDTO.badge;
                }
                if ((i11 & 64) != 0) {
                    atomActionDTO = productDTO.action;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    map = productDTO.trackingInfo;
                }
                if ((i11 & 256) != 0) {
                    testInfo = productDTO.testInfo;
                }
                Map map2 = map;
                TestInfo testInfo2 = testInfo;
                SocialBadgeAtomDTO socialBadgeAtomDTO2 = socialBadgeAtomDTO;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                String str6 = str5;
                String str7 = str3;
                return productDTO.copy(str, str2, str7, str4, str6, socialBadgeAtomDTO2, atomActionDTO2, map2, testInfo2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPrice() {
                return this.price;
            }

            /* renamed from: component3, reason: from getter */
            public final String getOriginalPrice() {
                return this.originalPrice;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component5, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component6, reason: from getter */
            public final SocialBadgeAtomDTO getBadge() {
                return this.badge;
            }

            /* renamed from: component7, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component8() {
                return this.trackingInfo;
            }

            /* renamed from: component9, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final ProductDTO copy(@NotNull String image, @NotNull String price, String originalPrice, @NotNull String description, String icon, SocialBadgeAtomDTO badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(description, "description");
                return new ProductDTO(image, price, originalPrice, description, icon, badge, action, trackingInfo, testInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductDTO)) {
                    return false;
                }
                ProductDTO productDTO = (ProductDTO) other;
                return Intrinsics.d(this.image, productDTO.image) && Intrinsics.d(this.price, productDTO.price) && Intrinsics.d(this.originalPrice, productDTO.originalPrice) && Intrinsics.d(this.description, productDTO.description) && Intrinsics.d(this.icon, productDTO.icon) && Intrinsics.d(this.badge, productDTO.badge) && Intrinsics.d(this.action, productDTO.action) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo) && Intrinsics.d(this.testInfo, productDTO.testInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final SocialBadgeAtomDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final String getOriginalPrice() {
                return this.originalPrice;
            }

            @NotNull
            public final String getPrice() {
                return this.price;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(this.image.hashCode() * 31, 31, this.price);
                String str = this.originalPrice;
                int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
                String str2 = this.icon;
                int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                SocialBadgeAtomDTO socialBadgeAtomDTO = this.badge;
                int hashCode2 = (hashCode + (socialBadgeAtomDTO == null ? 0 : socialBadgeAtomDTO.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                String str2 = this.price;
                String str3 = this.originalPrice;
                String str4 = this.description;
                String str5 = this.icon;
                SocialBadgeAtomDTO socialBadgeAtomDTO = this.badge;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                StringBuilder d11 = C3660k.d("ProductDTO(image=", str, ", price=", str2, ", originalPrice=");
                Nh.a.h(d11, str3, ", description=", str4, ", icon=");
                d11.append(str5);
                d11.append(", badge=");
                d11.append(socialBadgeAtomDTO);
                d11.append(", action=");
                Sh.b.f(d11, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
                return h.c(d11, testInfo, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.image);
                dest.writeString(this.price);
                dest.writeString(this.originalPrice);
                dest.writeString(this.description);
                dest.writeString(this.icon);
                SocialBadgeAtomDTO socialBadgeAtomDTO = this.badge;
                if (socialBadgeAtomDTO == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    socialBadgeAtomDTO.writeToParcel(dest, flags);
                }
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
            public ProductDTO(@NotNull String image, @NotNull String price, String str, @NotNull String description, String str2, SocialBadgeAtomDTO socialBadgeAtomDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(description, "description");
                this.image = image;
                this.price = price;
                this.originalPrice = str;
                this.description = description;
                this.icon = str2;
                this.badge = socialBadgeAtomDTO;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO$ServiceDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO$ProductListItemDTO;", "Landroid/os/Parcelable;", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getDescription", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ServiceDTO extends ProductListItemDTO implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ServiceDTO> CREATOR = new Creator();
            private final AtomActionDTO action;

            @NotNull
            private final String description;

            @NotNull
            private final String image;
            private final TestInfo testInfo;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ServiceDTO> {
                @Override // android.os.Parcelable.Creator
                public final ServiceDTO createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ServiceDTO.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = C2859b.a(ServiceDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new ServiceDTO(readString, readString2, readString3, atomActionDTO, linkedHashMap, (TestInfo) parcel.readParcelable(ServiceDTO.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ServiceDTO[] newArray(int i11) {
                    return new ServiceDTO[i11];
                }
            }

            public /* synthetic */ ServiceDTO(String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i11 & 8) != 0 ? null : atomActionDTO, map, (i11 & 32) != 0 ? null : testInfo);
            }

            public static /* synthetic */ ServiceDTO copy$default(ServiceDTO serviceDTO, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = serviceDTO.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = serviceDTO.title;
                }
                if ((i11 & 4) != 0) {
                    str3 = serviceDTO.description;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = serviceDTO.action;
                }
                if ((i11 & 16) != 0) {
                    map = serviceDTO.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    testInfo = serviceDTO.testInfo;
                }
                Map map2 = map;
                TestInfo testInfo2 = testInfo;
                return serviceDTO.copy(str, str2, str3, atomActionDTO, map2, testInfo2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final ServiceDTO copy(@NotNull String image, @NotNull String title, @NotNull String description, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                return new ServiceDTO(image, title, description, action, trackingInfo, testInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServiceDTO)) {
                    return false;
                }
                ServiceDTO serviceDTO = (ServiceDTO) other;
                return Intrinsics.d(this.image, serviceDTO.image) && Intrinsics.d(this.title, serviceDTO.title) && Intrinsics.d(this.description, serviceDTO.description) && Intrinsics.d(this.action, serviceDTO.action) && Intrinsics.d(this.trackingInfo, serviceDTO.trackingInfo) && Intrinsics.d(this.testInfo, serviceDTO.testInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(g.a(this.image.hashCode() * 31, 31, this.title), 31, this.description);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                String str2 = this.title;
                String str3 = this.description;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                StringBuilder d11 = C3660k.d("ServiceDTO(image=", str, ", title=", str2, ", description=");
                p.c(str3, ", action=", ", trackingInfo=", d11, atomActionDTO);
                return b.b(", testInfo=", ")", d11, map, testInfo);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.image);
                dest.writeString(this.title);
                dest.writeString(this.description);
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
            public ServiceDTO(@NotNull String image, @NotNull String title, @NotNull String description, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.image = image;
                this.title = title;
                this.description = description;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }
        }

        public /* synthetic */ ProductListItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProductListItemDTO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SocialProductListDTO(@NotNull List<? extends ProductListItemDTO> items, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialProductListDTO copy$default(SocialProductListDTO socialProductListDTO, List list, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = socialProductListDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = socialProductListDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            testInfo = socialProductListDTO.testInfo;
        }
        return socialProductListDTO.copy(list, map, testInfo);
    }

    @NotNull
    public final List<ProductListItemDTO> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final SocialProductListDTO copy(@NotNull List<? extends ProductListItemDTO> items, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SocialProductListDTO(items, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialProductListDTO)) {
            return false;
        }
        SocialProductListDTO socialProductListDTO = (SocialProductListDTO) other;
        return Intrinsics.d(this.items, socialProductListDTO.items) && Intrinsics.d(this.trackingInfo, socialProductListDTO.trackingInfo) && Intrinsics.d(this.testInfo, socialProductListDTO.testInfo);
    }

    @NotNull
    public final List<ProductListItemDTO> getItems() {
        return this.items;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ProductListItemDTO> list = this.items;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("SocialProductListDTO(items=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.items, dest);
        while (c11.hasNext()) {
            dest.writeValue(c11.next());
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
        dest.writeParcelable(this.testInfo, flags);
    }

    public /* synthetic */ SocialProductListDTO(List list, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, (i11 & 4) != 0 ? null : testInfo);
    }
}
