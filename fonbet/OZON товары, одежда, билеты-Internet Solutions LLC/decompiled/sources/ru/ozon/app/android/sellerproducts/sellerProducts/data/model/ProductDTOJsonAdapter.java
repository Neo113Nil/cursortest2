package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.product.common.product.ImageBadge;
import ru.ozon.app.android.product.common.product.ImageTheme;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO;", "nullableListOfImageItemDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "nullableFavoriteProductMoleculeV2Adapter", "Lru/ozon/app/android/product/common/product/ImageBadge;", "nullableListOfImageBadgeAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "nullableAtomDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "nullableTextAtomWithIconAdapter", "", "nullableFloatAdapter", "Lru/ozon/app/android/product/common/product/ImageTheme;", "nullableImageThemeAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductDTOJsonAdapter extends JsonAdapter<ProductDTO> {
    private volatile Constructor<ProductDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<AtomDTO> nullableAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMoleculeV2> nullableFavoriteProductMoleculeV2Adapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<ImageTheme> nullableImageThemeAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ImageBadge>> nullableListOfImageBadgeAdapter;

    @NotNull
    private final JsonAdapter<List<ProductDTO.ImageItemDTO>> nullableListOfImageItemDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtomWithIcon> nullableTextAtomWithIconAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ProductDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("skuId", "items", "favoriteButton", "imageBadges", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isFavorite", "link", "state", "button", "buttonV3", "secondaryButton", "trackingInfo", "buttonSubtitle", "imageOverlayPicture", "imageAlpha", "imageIsFaded", "imageOverlayTitle", "imageTheme", "backgroundColor");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "skuId");
        b e11 = D.e(List.class, ProductDTO.ImageItemDTO.class);
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(ProductDTO.ImageItemDTO.ImageDTO.class);
        final String str2 = "image";
        final String str3 = "";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
                this.fieldName = str3;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature2 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature2.name()) && Intrinsics.d(fieldName(), protoOneOfSignature2.fieldName()) && C2702w.f(protoOneOfSignature2, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str4 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str4, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(ProductDTO.ImageItemDTO.VideoDTO.class);
        final String str4 = "video";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, new ProtoOneOfSignature(str4, str3, b12) { // from class: ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str4, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str4;
                this.fieldName = str3;
                this.type = C6345a.b(b12);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature2 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature2.name()) && Intrinsics.d(fieldName(), protoOneOfSignature2.fieldName()) && C2702w.f(protoOneOfSignature2, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableListOfImageItemDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "items");
        this.nullableFavoriteProductMoleculeV2Adapter = moshi.f(FavoriteProductMoleculeV2.class, m11, "favoriteButton");
        this.nullableListOfImageBadgeAdapter = moshi.f(D.e(List.class, ImageBadge.class), m11, "imageBadges");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableStringAdapter = moshi.f(String.class, m11, "link");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "state");
        this.nullableAtomDTOAdapter = moshi.f(AtomDTO.class, m11, "button");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "buttonV3");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTextAtomWithIconAdapter = moshi.f(TextAtomWithIcon.class, m11, "buttonSubtitle");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "imageAlpha");
        this.nullableImageThemeAdapter = moshi.f(ImageTheme.class, m11, "imageTheme");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(32, "GeneratedJsonAdapter(ProductDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        int i11 = -1;
        Long l11 = null;
        List<ProductDTO.ImageItemDTO> list = null;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = null;
        List<ImageBadge> list2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        List<AtomDTO> list3 = null;
        AtomDTO atomDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        AtomDTO atomDTO2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TextAtomWithIcon textAtomWithIcon = null;
        String str3 = null;
        Float f7 = null;
        Boolean bool3 = null;
        String str4 = null;
        ImageTheme imageTheme = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw Y9.c.q("skuId", "skuId", reader);
                    }
                    break;
                case 1:
                    list = this.nullableListOfImageItemDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case 2:
                    favoriteProductMoleculeV2 = this.nullableFavoriteProductMoleculeV2Adapter.fromJson(reader);
                    break;
                case 3:
                    list2 = this.nullableListOfImageBadgeAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    atomDTO = this.nullableAtomDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 10:
                    atomDTO2 = this.nullableAtomDTOAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    textAtomWithIcon = this.nullableTextAtomWithIconAdapter.fromJson(reader);
                    break;
                case 13:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 15:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    imageTheme = this.nullableImageThemeAdapter.fromJson(reader);
                    break;
                case 18:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("backgroundColor", "backgroundColor", reader);
                    }
                    i11 = -262145;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -262145) {
            Boolean bool4 = bool;
            List<ProductDTO.ImageItemDTO> list4 = list;
            if (l11 == null) {
                throw Y9.c.j("skuId", "skuId", reader);
            }
            Boolean bool5 = bool2;
            String str5 = str2;
            long longValue = l11.longValue();
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return new ProductDTO(longValue, list4, favoriteProductMoleculeV2, list2, bool4, bool5, str5, list3, atomDTO, buttonV3DTO, atomDTO2, map, textAtomWithIcon, str3, f7, bool3, str4, imageTheme, str);
        }
        String str6 = str;
        Boolean bool6 = bool;
        Boolean bool7 = bool2;
        List<ProductDTO.ImageItemDTO> list5 = list;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV22 = favoriteProductMoleculeV2;
        String str7 = str2;
        List<ImageBadge> list6 = list2;
        Constructor<ProductDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductDTO.class.getDeclaredConstructor(Long.TYPE, List.class, FavoriteProductMoleculeV2.class, List.class, Boolean.class, Boolean.class, String.class, List.class, AtomDTO.class, ButtonV3DTO.class, AtomDTO.class, Map.class, TextAtomWithIcon.class, String.class, Float.class, Boolean.class, String.class, ImageTheme.class, String.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (l11 == null) {
            throw Y9.c.j("skuId", "skuId", reader);
        }
        ProductDTO newInstance = constructor.newInstance(l11, list5, favoriteProductMoleculeV22, list6, bool6, bool7, str7, list3, atomDTO, buttonV3DTO, atomDTO2, map, textAtomWithIcon, str3, f7, bool3, str4, imageTheme, str6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("skuId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSkuId()));
        writer.w("items");
        this.nullableListOfImageItemDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("favoriteButton");
        this.nullableFavoriteProductMoleculeV2Adapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("imageBadges");
        this.nullableListOfImageBadgeAdapter.mo44toJson(writer, (x) value.getImageBadges());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isAdult());
        writer.w("isFavorite");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isFavorite());
        writer.w("link");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("state");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getState());
        writer.w("button");
        this.nullableAtomDTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("buttonV3");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButtonV3());
        writer.w("secondaryButton");
        this.nullableAtomDTOAdapter.mo44toJson(writer, (x) value.getSecondaryButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("buttonSubtitle");
        this.nullableTextAtomWithIconAdapter.mo44toJson(writer, (x) value.getButtonSubtitle());
        writer.w("imageOverlayPicture");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImageOverlayPicture());
        writer.w("imageAlpha");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getImageAlpha());
        writer.w("imageIsFaded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getImageIsFaded());
        writer.w("imageOverlayTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImageOverlayTitle());
        writer.w("imageTheme");
        this.nullableImageThemeAdapter.mo44toJson(writer, (x) value.getImageTheme());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
