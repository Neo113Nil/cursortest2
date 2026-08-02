package ru.ozon.app.android.checkoutcomposer.rfbsSplit.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.data.RealFbsSplitDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;", "nullableHeaderAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;", "nullableProductsAdapter", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "nullableListOfDynamicElementDTOAtJsonCollectionDecodingAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;", "nullableFooterAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RealFbsSplitDTOJsonAdapter extends JsonAdapter<RealFbsSplitDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<RealFbsSplitDTO.Footer> nullableFooterAdapter;

    @NotNull
    private final JsonAdapter<RealFbsSplitDTO.Header> nullableHeaderAdapter;

    @NotNull
    private final JsonAdapter<List<DynamicElementDTO>> nullableListOfDynamicElementDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<RealFbsSplitDTO.Products> nullableProductsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public RealFbsSplitDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("action", CommentV3DTO.HEADER_FIELD_NAME, "subHeader", "products", "dynamicElements", "trackingInfo", "scrollWidgetKey", "showSeparator", CommentV3DTO.FOOTER_FIELD_NAME);
        M m11 = M.f71699a;
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableHeaderAdapter = moshi.f(RealFbsSplitDTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subHeader");
        this.nullableProductsAdapter = moshi.f(RealFbsSplitDTO.Products.class, m11, "products");
        this.nullableListOfDynamicElementDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, DynamicElementDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.checkoutcomposer.rfbsSplit.data.RealFbsSplitDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonCollectionDecoding.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonCollectionDecoding;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding()";
            }
        }), "dynamicElements");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "scrollWidgetKey");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "showSeparator");
        this.nullableFooterAdapter = moshi.f(RealFbsSplitDTO.Footer.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(RealFbsSplitDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RealFbsSplitDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AtomActionDTO atomActionDTO = null;
        RealFbsSplitDTO.Header header = null;
        TextAtom textAtom = null;
        RealFbsSplitDTO.Products products = null;
        List<DynamicElementDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str = null;
        Boolean bool = null;
        RealFbsSplitDTO.Footer footer = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    header = this.nullableHeaderAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    products = this.nullableProductsAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.nullableListOfDynamicElementDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    footer = this.nullableFooterAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new RealFbsSplitDTO(atomActionDTO, header, textAtom, products, list, map, str, bool, footer);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RealFbsSplitDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("subHeader");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubHeader());
        writer.w("products");
        this.nullableProductsAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("dynamicElements");
        this.nullableListOfDynamicElementDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getDynamicElements());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("scrollWidgetKey");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getScrollWidgetKey());
        writer.w("showSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowSeparator());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.p();
    }
}
