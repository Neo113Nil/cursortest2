package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data;

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
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R(\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO_ProductDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$ProductDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$Badge;", "nullableListOfBadgeAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "ratingDTOAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "nullableStringAdapter", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO$SwipeAction;", "nullableListOfSwipeActionAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewV2DTO_ProductDTOJsonAdapter extends JsonAdapter<ProductsForReviewV2DTO.ProductDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ProductsForReviewV2DTO.Badge>> nullableListOfBadgeAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<List<ProductsForReviewV2DTO.SwipeAction>> nullableListOfSwipeActionAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RatingDTO> ratingDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ProductsForReviewV2DTO_ProductDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "image", "badges", "badgesLeftPadding", SelectionItemFormDTO.TITLE_FIELD_NAME, "aspectText", "rating", "cornerRadius", "backgroundColor", "swipeActions", "swipeTrackingInfo");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "id");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        b e11 = D.e(List.class, ProductsForReviewV2DTO.Badge.class);
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2DTO_ProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
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
        final d b11 = N.b(ProductsForReviewV2DTO.Badge.BadgeContentDTO.class);
        final String str2 = "BADGE";
        final String str3 = "badge";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2DTO_ProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
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
        final d b12 = N.b(ProductsForReviewV2DTO.Badge.TimerContentDTO.class);
        final String str4 = "TIMER";
        final String str5 = DynamicElementDTO.TIMER;
        Annotation[] elements = {protoOneOf, protoOneOfSignature, new ProtoOneOfSignature(str4, str5, b12) { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2DTO_ProductDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str4, "name");
                Intrinsics.checkNotNullParameter(str5, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str4;
                this.fieldName = str5;
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
                String str52 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str52, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableListOfBadgeAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "badges");
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "badgesLeftPadding");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "aspectText");
        this.ratingDTOAdapter = moshi.f(RatingDTO.class, m11, "rating");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableListOfSwipeActionAdapter = moshi.f(D.e(List.class, ProductsForReviewV2DTO.SwipeAction.class), m11, "swipeActions");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "swipeTrackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(55, "GeneratedJsonAdapter(ProductsForReviewV2DTO.ProductDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductsForReviewV2DTO.ProductDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        ImageDTO imageDTO = null;
        List<ProductsForReviewV2DTO.Badge> list = null;
        Paddings paddings = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        RatingDTO ratingDTO = null;
        CornerRadius cornerRadius = null;
        String str = null;
        List<ProductsForReviewV2DTO.SwipeAction> list2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Long l12 = l11;
            if (!reader.hasNext()) {
                reader.endObject();
                if (l12 == null) {
                    throw Y9.c.j("id", "id", reader);
                }
                long longValue = l12.longValue();
                if (textDTO == null) {
                    throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (ratingDTO != null) {
                    return new ProductsForReviewV2DTO.ProductDTO(longValue, imageDTO, list, paddings, textDTO, textDTO2, ratingDTO, cornerRadius, str, list2, map);
                }
                throw Y9.c.j("rating", "rating", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw Y9.c.q("id", "id", reader);
                    }
                    continue;
                case 1:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfBadgeAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case 3:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 5:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    ratingDTO = this.ratingDTOAdapter.fromJson(reader);
                    if (ratingDTO == null) {
                        throw Y9.c.q("rating", "rating", reader);
                    }
                    break;
                case 7:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    list2 = this.nullableListOfSwipeActionAdapter.fromJson(reader);
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            l11 = l12;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductsForReviewV2DTO.ProductDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getId()));
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("badges");
        this.nullableListOfBadgeAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("badgesLeftPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getBadgesLeftPadding());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("aspectText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAspectText());
        writer.w("rating");
        this.ratingDTOAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("swipeActions");
        this.nullableListOfSwipeActionAdapter.mo44toJson(writer, (x) value.getSwipeActions());
        writer.w("swipeTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSwipeTrackingInfo());
        writer.p();
    }
}
