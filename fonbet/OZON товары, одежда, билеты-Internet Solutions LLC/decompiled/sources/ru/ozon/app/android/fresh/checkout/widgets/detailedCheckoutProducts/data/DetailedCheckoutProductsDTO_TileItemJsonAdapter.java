package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data;

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
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO_TileItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "nullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "nullableSeparatorAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;", "spacersAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailedCheckoutProductsDTO_TileItemJsonAdapter extends JsonAdapter<DetailedCheckoutProductsDTO.TileItem> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Object> anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;
    private volatile Constructor<DetailedCheckoutProductsDTO.TileItem> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Object> nullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<DetailedCheckoutProductsDTO.TileItem.Separator> nullableSeparatorAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<DetailedCheckoutProductsDTO.TileItem.Spacers> spacersAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DetailedCheckoutProductsDTO_TileItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", SelectionItemFormDTO.TITLE_FIELD_NAME, "productQuantity", "subtitle", "icon", "price", "separator", "backgroundColor", "radius", "spacers", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "image");
        final String str = "";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b11 = N.b(FreshTextPairDTO.class);
        final String str2 = "textPair";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str, b11) { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        final d b12 = N.b(TextDTO.class);
        final String str3 = "textAtom";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, new ProtoOneOfSignature(str3, str, b12) { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        this.anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(Object.class, C7705l.j0(elements), SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "productQuantity");
        ProtoOneOf protoOneOf2 = new ProtoOneOf(str) { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b13 = N.b(TextDTO.class);
        final String str4 = "subtitleTextAtom";
        ProtoOneOfSignature protoOneOfSignature2 = new ProtoOneOfSignature(str4, str, b13) { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str4, "name");
                Intrinsics.checkNotNullParameter(str, "fieldName");
                Intrinsics.checkNotNullParameter(b13, "type");
                this.name = str4;
                this.fieldName = str;
                this.type = C6345a.b(b13);
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
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
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
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b14 = N.b(BadgeDTO.class);
        final String str5 = "subtitleBadge";
        Annotation[] elements2 = {protoOneOf2, protoOneOfSignature2, new ProtoOneOfSignature(str5, str, b14) { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO_TileItemJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str5, "name");
                Intrinsics.checkNotNullParameter(str, "fieldName");
                Intrinsics.checkNotNullParameter(b14, "type");
                this.name = str5;
                this.fieldName = str;
                this.type = C6345a.b(b14);
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
                ProtoOneOfSignature protoOneOfSignature22 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature22.name()) && Intrinsics.d(fieldName(), protoOneOfSignature22.fieldName()) && C2702w.f(protoOneOfSignature22, N.b(type()));
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
                String str42 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str32, ", fieldName=", str42, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        this.nullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(Object.class, C7705l.j0(elements2), "subtitle");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableSeparatorAdapter = moshi.f(DetailedCheckoutProductsDTO.TileItem.Separator.class, m11, "separator");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "radius");
        this.spacersAdapter = moshi.f(DetailedCheckoutProductsDTO.TileItem.Spacers.class, m11, "spacers");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(DetailedCheckoutProductsDTO.TileItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DetailedCheckoutProductsDTO.TileItem fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        Object obj = null;
        TextDTO textDTO = null;
        Object obj2 = null;
        IconDTO iconDTO = null;
        PriceDTO priceDTO = null;
        DetailedCheckoutProductsDTO.TileItem.Separator separator = null;
        String str2 = null;
        CornerRadius cornerRadius = null;
        DetailedCheckoutProductsDTO.TileItem.Spacers spacers = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            String str3 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("image", "image", reader);
                    }
                    continue;
                case 1:
                    obj = this.anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    if (obj == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    obj2 = this.nullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case 4:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    separator = this.nullableSeparatorAdapter.fromJson(reader);
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw Y9.c.q("radius", "radius", reader);
                    }
                    i12 &= -257;
                    break;
                case 9:
                    spacers = this.spacersAdapter.fromJson(reader);
                    if (spacers == null) {
                        throw Y9.c.q("spacers", "spacers", reader);
                    }
                    i12 &= -513;
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            str = str3;
        }
        String str4 = str;
        reader.endObject();
        if (i12 == -769) {
            if (str4 == null) {
                throw Y9.c.j("image", "image", reader);
            }
            if (obj == null) {
                throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            Intrinsics.g(spacers, "null cannot be cast to non-null type ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO.TileItem.Spacers");
            CornerRadius cornerRadius2 = cornerRadius;
            String str5 = str2;
            DetailedCheckoutProductsDTO.TileItem.Separator separator2 = separator;
            PriceDTO priceDTO2 = priceDTO;
            IconDTO iconDTO2 = iconDTO;
            return new DetailedCheckoutProductsDTO.TileItem(str4, obj, textDTO, obj2, iconDTO2, priceDTO2, separator2, str5, cornerRadius2, spacers, map);
        }
        Constructor<DetailedCheckoutProductsDTO.TileItem> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = DetailedCheckoutProductsDTO.TileItem.class.getDeclaredConstructor(String.class, Object.class, TextDTO.class, Object.class, IconDTO.class, PriceDTO.class, DetailedCheckoutProductsDTO.TileItem.Separator.class, String.class, CornerRadius.class, DetailedCheckoutProductsDTO.TileItem.Spacers.class, Map.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<DetailedCheckoutProductsDTO.TileItem> constructor2 = constructor;
        if (str4 == null) {
            throw Y9.c.j("image", "image", reader);
        }
        if (obj == null) {
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        DetailedCheckoutProductsDTO.TileItem newInstance = constructor2.newInstance(str4, obj, textDTO, obj2, iconDTO, priceDTO, separator, str2, cornerRadius, spacers, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DetailedCheckoutProductsDTO.TileItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.anyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("productQuantity");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getProductQuantity());
        writer.w("subtitle");
        this.nullableAnyAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("price");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("separator");
        this.nullableSeparatorAdapter.mo44toJson(writer, (x) value.getSeparator());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("radius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getRadius());
        writer.w("spacers");
        this.spacersAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
