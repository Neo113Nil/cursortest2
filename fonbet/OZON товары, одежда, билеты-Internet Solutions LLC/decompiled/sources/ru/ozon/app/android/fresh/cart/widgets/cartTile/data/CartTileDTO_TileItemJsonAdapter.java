package ru.ozon.app.android.fresh.cart.widgets.cartTile.data;

import Ak.b;
import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO_TileItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "tileControlAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "nullableSeparatorAdapter", "nullableStringAdapter", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;", "nullableCheckboxAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;", "spacersAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;", "nullableFavoriteButtonAdapter", "", "nullableIntAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileDTO_TileItemJsonAdapter extends JsonAdapter<CartTileDTO.TileItem> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CartTileDTO.TileItem> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CartTileDTO.TileItem.Checkbox> nullableCheckboxAdapter;

    @NotNull
    private final JsonAdapter<CartTileDTO.TileItem.FavoriteButton> nullableFavoriteButtonAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<CartTileDTO.TileItem.Separator> nullableSeparatorAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CartTileDTO.TileItem.Spacers> spacersAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    @NotNull
    private final JsonAdapter<CartTileDTO.TileItem.TileControl> tileControlAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    public CartTileDTO_TileItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", SelectionItemFormDTO.TITLE_FIELD_NAME, "tileControl", "action", "deleteAction", "price", "weightText", "description", "separator", "backgroundColor", "checkbox", "radius", "spacers", "trackingInfo", "deleteTrackingInfo", "tapDeleteTrackingInfo", "swipeTrackingInfo", "favoriteButton", DynamicElementDTO.TIMER, "delayedRefresh");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        final String str = "";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b11 = N.b(CartTileDTO.TileItem.TileControl.AvailableControl.class);
        final String str2 = "availableControl";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str, b11) { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
                this.fieldName = str;
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
                String str3 = this.name;
                String str4 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str3, ", fieldName=", str4, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(CartTileDTO.TileItem.TileControl.UnavailableControl.class);
        final String str3 = "unavailableControl";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, new ProtoOneOfSignature(str3, str, b12) { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str3, "name");
                Intrinsics.checkNotNullParameter(str, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str3;
                this.fieldName = str;
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
                String str32 = this.name;
                String str4 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str32, ", fieldName=", str4, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.tileControlAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(CartTileDTO.TileItem.TileControl.class, C7705l.j0(elements), "tileControl");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "deleteAction");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "weightText");
        this.nullableSeparatorAdapter = moshi.f(CartTileDTO.TileItem.Separator.class, m11, "separator");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCheckboxAdapter = moshi.f(CartTileDTO.TileItem.Checkbox.class, m11, "checkbox");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "radius");
        this.spacersAdapter = moshi.f(CartTileDTO.TileItem.Spacers.class, m11, "spacers");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableFavoriteButtonAdapter = moshi.f(CartTileDTO.TileItem.FavoriteButton.class, m11, "favoriteButton");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, DynamicElementDTO.TIMER);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "delayedRefresh");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(CartTileDTO.TileItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartTileDTO.TileItem fromJson(@NotNull n reader) {
        CartTileDTO.TileItem.TileControl tileControl;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        TextDTO textDTO = null;
        Boolean bool2 = bool;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        PriceDTO priceDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        CartTileDTO.TileItem.Separator separator = null;
        CartTileDTO.TileItem.Spacers spacers = null;
        CornerRadius cornerRadius = null;
        String str2 = null;
        CartTileDTO.TileItem.Checkbox checkbox = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        CartTileDTO.TileItem.FavoriteButton favoriteButton = null;
        Integer num = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        int i11 = -1;
        CartTileDTO.TileItem.TileControl tileControl2 = null;
        while (true) {
            String str3 = str;
            TextDTO textDTO4 = textDTO;
            CartTileDTO.TileItem.TileControl tileControl3 = tileControl2;
            AtomActionDTO atomActionDTO3 = atomActionDTO;
            if (!reader.hasNext()) {
                AtomActionDTO atomActionDTO4 = atomActionDTO2;
                reader.endObject();
                if (i11 == -531457) {
                    if (str3 == null) {
                        throw Y9.c.j("image", "image", reader);
                    }
                    if (textDTO4 == null) {
                        throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (tileControl3 == null) {
                        throw Y9.c.j("tileControl", "tileControl", reader);
                    }
                    if (atomActionDTO3 == null) {
                        throw Y9.c.j("action", "action", reader);
                    }
                    Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
                    Intrinsics.g(spacers, "null cannot be cast to non-null type ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO.TileItem.Spacers");
                    return new CartTileDTO.TileItem(str3, textDTO4, tileControl3, atomActionDTO3, atomActionDTO4, priceDTO, textDTO2, textDTO3, separator, str2, checkbox, cornerRadius, spacers, map3, map, map2, map4, favoriteButton, num, bool2.booleanValue());
                }
                CartTileDTO.TileItem.Separator separator2 = separator;
                PriceDTO priceDTO2 = priceDTO;
                Integer num2 = num;
                Map<String, TokenizedTrackingInfo> map5 = map2;
                CartTileDTO.TileItem.Spacers spacers2 = spacers;
                TextDTO textDTO5 = textDTO2;
                CartTileDTO.TileItem.FavoriteButton favoriteButton2 = favoriteButton;
                Map<String, TokenizedTrackingInfo> map6 = map;
                CornerRadius cornerRadius2 = cornerRadius;
                Constructor<CartTileDTO.TileItem> constructor = this.constructorRef;
                if (constructor == null) {
                    tileControl = tileControl3;
                    constructor = CartTileDTO.TileItem.class.getDeclaredConstructor(String.class, TextDTO.class, CartTileDTO.TileItem.TileControl.class, AtomActionDTO.class, AtomActionDTO.class, PriceDTO.class, TextDTO.class, TextDTO.class, CartTileDTO.TileItem.Separator.class, String.class, CartTileDTO.TileItem.Checkbox.class, CornerRadius.class, CartTileDTO.TileItem.Spacers.class, Map.class, Map.class, Map.class, Map.class, CartTileDTO.TileItem.FavoriteButton.class, Integer.class, Boolean.TYPE, Integer.TYPE, Y9.c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    tileControl = tileControl3;
                }
                if (str3 == null) {
                    throw Y9.c.j("image", "image", reader);
                }
                if (textDTO4 == null) {
                    throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (tileControl == null) {
                    throw Y9.c.j("tileControl", "tileControl", reader);
                }
                if (atomActionDTO3 == null) {
                    throw Y9.c.j("action", "action", reader);
                }
                CartTileDTO.TileItem newInstance = constructor.newInstance(str3, textDTO4, tileControl, atomActionDTO3, atomActionDTO4, priceDTO2, textDTO5, textDTO3, separator2, str2, checkbox, cornerRadius2, spacers2, map3, map6, map5, map4, favoriteButton2, num2, bool2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            AtomActionDTO atomActionDTO5 = atomActionDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 0:
                    String fromJson = this.stringAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw Y9.c.q("image", "image", reader);
                    }
                    str = fromJson;
                    atomActionDTO2 = atomActionDTO5;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 1:
                    TextDTO fromJson2 = this.textDTOAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    textDTO = fromJson2;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 2:
                    CartTileDTO.TileItem.TileControl fromJson3 = this.tileControlAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    if (fromJson3 == null) {
                        throw Y9.c.q("tileControl", "tileControl", reader);
                    }
                    tileControl2 = fromJson3;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    atomActionDTO = atomActionDTO3;
                case 3:
                    AtomActionDTO fromJson4 = this.atomActionDTOAdapter.fromJson(reader);
                    if (fromJson4 == null) {
                        throw Y9.c.q("action", "action", reader);
                    }
                    atomActionDTO = fromJson4;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                case 4:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 5:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 6:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 7:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 8:
                    separator = this.nullableSeparatorAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 10:
                    checkbox = this.nullableCheckboxAdapter.fromJson(reader);
                    i11 &= -1025;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 11:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw Y9.c.q("radius", "radius", reader);
                    }
                    i11 &= -2049;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 12:
                    spacers = this.spacersAdapter.fromJson(reader);
                    if (spacers == null) {
                        throw Y9.c.q("spacers", "spacers", reader);
                    }
                    i11 &= -4097;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 13:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 14:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 15:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 16:
                    map4 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 17:
                    favoriteButton = this.nullableFavoriteButtonAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 18:
                    num = this.nullableIntAdapter.fromJson(reader);
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                case 19:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("delayedRefresh", "delayedRefresh", reader);
                    }
                    i11 &= -524289;
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
                default:
                    atomActionDTO2 = atomActionDTO5;
                    str = str3;
                    textDTO = textDTO4;
                    tileControl2 = tileControl3;
                    atomActionDTO = atomActionDTO3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartTileDTO.TileItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("tileControl");
        this.tileControlAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getTileControl());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("deleteAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getDeleteAction());
        writer.w("price");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("weightText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getWeightText());
        writer.w("description");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("separator");
        this.nullableSeparatorAdapter.mo44toJson(writer, (x) value.getSeparator());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("checkbox");
        this.nullableCheckboxAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w("radius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getRadius());
        writer.w("spacers");
        this.spacersAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("deleteTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDeleteTrackingInfo());
        writer.w("tapDeleteTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTapDeleteTrackingInfo());
        writer.w("swipeTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSwipeTrackingInfo());
        writer.w("favoriteButton");
        this.nullableFavoriteButtonAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("delayedRefresh");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getDelayedRefresh()));
        writer.p();
    }
}
