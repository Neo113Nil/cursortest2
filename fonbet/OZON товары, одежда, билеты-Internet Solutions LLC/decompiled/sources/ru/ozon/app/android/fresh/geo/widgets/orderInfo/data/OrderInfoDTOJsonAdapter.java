package ru.ozon.app.android.fresh.geo.widgets.orderInfo.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.data.OrderInfoDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/data/OrderInfoDTO$OrderProductDTO;", "listOfOrderProductDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderInfoDTOJsonAdapter extends JsonAdapter<OrderInfoDTO> {
    private volatile Constructor<OrderInfoDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<OrderInfoDTO.OrderProductDTO>> listOfOrderProductDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public OrderInfoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "headerButton", "rightHeaderText", "rightHeaderTextAction", "products", "trackingInfo", "productsListAction");
        M m11 = M.f71699a;
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "headerButton");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "rightHeaderTextAction");
        this.listOfOrderProductDTOAdapter = moshi.f(D.e(List.class, OrderInfoDTO.OrderProductDTO.class), m11, "products");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(OrderInfoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderInfoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO3 = null;
        AtomActionDTO atomActionDTO = null;
        List<OrderInfoDTO.OrderProductDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        AtomActionDTO atomActionDTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    list = this.listOfOrderProductDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("products", "products", reader);
                    }
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -224) {
            AtomActionDTO atomActionDTO3 = atomActionDTO2;
            Map<String, TokenizedTrackingInfo> map2 = map;
            List<OrderInfoDTO.OrderProductDTO> list2 = list;
            AtomActionDTO atomActionDTO4 = atomActionDTO;
            TextDTO textDTO4 = textDTO3;
            BadgeDTO badgeDTO2 = badgeDTO;
            TextDTO textDTO5 = textDTO2;
            TextDTO textDTO6 = textDTO;
            if (list2 != null) {
                return new OrderInfoDTO(textDTO6, textDTO5, badgeDTO2, textDTO4, atomActionDTO4, list2, map2, atomActionDTO3);
            }
            throw c.j("products", "products", reader);
        }
        AtomActionDTO atomActionDTO5 = atomActionDTO2;
        Map<String, TokenizedTrackingInfo> map3 = map;
        List<OrderInfoDTO.OrderProductDTO> list3 = list;
        AtomActionDTO atomActionDTO6 = atomActionDTO;
        TextDTO textDTO7 = textDTO3;
        BadgeDTO badgeDTO3 = badgeDTO;
        TextDTO textDTO8 = textDTO2;
        TextDTO textDTO9 = textDTO;
        Constructor<OrderInfoDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OrderInfoDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, BadgeDTO.class, TextDTO.class, AtomActionDTO.class, List.class, Map.class, AtomActionDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list3 == null) {
            throw c.j("products", "products", reader);
        }
        OrderInfoDTO newInstance = constructor.newInstance(textDTO9, textDTO8, badgeDTO3, textDTO7, atomActionDTO6, list3, map3, atomActionDTO5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderInfoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("headerButton");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getHeaderButton());
        writer.w("rightHeaderText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getRightHeaderText());
        writer.w("rightHeaderTextAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRightHeaderTextAction());
        writer.w("products");
        this.listOfOrderProductDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("productsListAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getProductsListAction());
        writer.p();
    }
}
