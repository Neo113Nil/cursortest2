package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data;

import Ak.b;
import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO_ComparisonProductsDTO_ComparedProductDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$ComparedProductDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$ComparedProductDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$ComparedProductDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProductMoleculeAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "", "anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonDTO_ComparisonProductsDTO_ComparedProductDTOJsonAdapter extends JsonAdapter<ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO> {

    @NotNull
    private final JsonAdapter<Object> anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMolecule> favoriteProductMoleculeAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ComparisonDTO_ComparisonProductsDTO_ComparedProductDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("skuString", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "price", "badge", "favoriteButton", "removeButton", "button", "pageInfo", "deeplink");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "skuString");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "badge");
        this.favoriteProductMoleculeAdapter = moshi.f(FavoriteProductMolecule.class, m11, "favoriteButton");
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "removeButton");
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO_ComparisonProductsDTO_ComparedProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b11 = N.b(ButtonV3Atom.AddToCartAtom.AddToCartButton.class);
        final String str2 = "addToCartButton";
        final String str3 = "";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO_ComparisonProductsDTO_ComparedProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        final d b12 = N.b(ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.class);
        final String str4 = ComparisonDTO.ComparisonProductsDTO.SMALL_BUTTONS;
        Annotation[] elements = {protoOneOf, protoOneOfSignature, new ProtoOneOfSignature(str4, str3, b12) { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO_ComparisonProductsDTO_ComparedProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        this.anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(Object.class, C7705l.j0(elements), "button");
    }

    @NotNull
    public String toString() {
        return b.c(76, "GeneratedJsonAdapter(ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        TextAtom textAtom = null;
        Price price = null;
        Badge badge = null;
        FavoriteProductMolecule favoriteProductMolecule = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        Object obj = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            String str5 = str;
            String str6 = str2;
            TextAtom textAtom2 = textAtom;
            Price price2 = price;
            Badge badge2 = badge;
            if (!reader.hasNext()) {
                FavoriteProductMolecule favoriteProductMolecule2 = favoriteProductMolecule;
                reader.endObject();
                if (str5 == null) {
                    throw Y9.c.j("skuString", "skuString", reader);
                }
                if (str6 == null) {
                    throw Y9.c.j("image", "image", reader);
                }
                if (textAtom2 == null) {
                    throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (price2 == null) {
                    throw Y9.c.j("price", "price", reader);
                }
                if (favoriteProductMolecule2 == null) {
                    throw Y9.c.j("favoriteButton", "favoriteButton", reader);
                }
                if (smallIconButton == null) {
                    throw Y9.c.j("removeButton", "removeButton", reader);
                }
                if (obj == null) {
                    throw Y9.c.j("button", "button", reader);
                }
                if (str3 == null) {
                    throw Y9.c.j("pageInfo", "pageInfo", reader);
                }
                if (str4 != null) {
                    return new ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO(str5, str6, textAtom2, price2, badge2, favoriteProductMolecule2, smallIconButton, obj, str3, str4);
                }
                throw Y9.c.j("deeplink", "deeplink", reader);
            }
            FavoriteProductMolecule favoriteProductMolecule3 = favoriteProductMolecule;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("skuString", "skuString", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q("image", "image", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    price = price2;
                    badge = badge2;
                case 3:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw Y9.c.q("price", "price", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    badge = badge2;
                case 4:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                case 5:
                    favoriteProductMolecule = this.favoriteProductMoleculeAdapter.fromJson(reader);
                    if (favoriteProductMolecule == null) {
                        throw Y9.c.q("favoriteButton", "favoriteButton", reader);
                    }
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 6:
                    smallIconButton = this.smallIconButtonAdapter.fromJson(reader);
                    if (smallIconButton == null) {
                        throw Y9.c.q("removeButton", "removeButton", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 7:
                    obj = this.anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    if (obj == null) {
                        throw Y9.c.q("button", "button", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 8:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Y9.c.q("pageInfo", "pageInfo", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                case 9:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Y9.c.q("deeplink", "deeplink", reader);
                    }
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
                default:
                    favoriteProductMolecule = favoriteProductMolecule3;
                    str = str5;
                    str2 = str6;
                    textAtom = textAtom2;
                    price = price2;
                    badge = badge2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ComparisonDTO.ComparisonProductsDTO.ComparedProductDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("skuString");
        this.stringAdapter.mo44toJson(writer, (x) value.getSkuString());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("badge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("favoriteButton");
        this.favoriteProductMoleculeAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("removeButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getRemoveButton());
        writer.w("button");
        this.anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("pageInfo");
        this.stringAdapter.mo44toJson(writer, (x) value.getPageInfo());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.p();
    }
}
