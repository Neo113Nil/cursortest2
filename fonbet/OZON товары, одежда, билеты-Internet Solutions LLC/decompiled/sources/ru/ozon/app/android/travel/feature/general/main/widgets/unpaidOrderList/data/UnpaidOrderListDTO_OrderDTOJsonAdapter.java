package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.analytics.ecommerce.ProductAction;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data.UnpaidOrderListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO_OrderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableBadgeDTOAdapter", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "listOfIconDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO$PriceBlock;", "nullablePriceBlockAdapter", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListDTO_OrderDTOJsonAdapter extends JsonAdapter<UnpaidOrderListDTO.OrderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<IconDTO>> listOfIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<UnpaidOrderListDTO.OrderDTO.PriceBlock> nullablePriceBlockAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public UnpaidOrderListDTO_OrderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badge", "timeToPay", "remainingDisplayTimerValue", SelectionItemFormDTO.TITLE_FIELD_NAME, "dates", ProductAction.ACTION_DETAIL, "priceBadge", "routeIcons", "clickAction", "viewTracking", "clickTracking", "priceBlock");
        M m11 = M.f71699a;
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.longAdapter = moshi.f(Long.TYPE, m11, "timeToPay");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "priceBadge");
        this.listOfIconDTOAdapter = moshi.f(D.e(List.class, IconDTO.class), m11, "routeIcons");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "clickAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "viewTracking");
        this.nullablePriceBlockAdapter = moshi.f(UnpaidOrderListDTO.OrderDTO.PriceBlock.class, m11, "priceBlock");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(UnpaidOrderListDTO.OrderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UnpaidOrderListDTO.OrderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Long l12 = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        BadgeDTO badgeDTO2 = null;
        List<IconDTO> list = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        UnpaidOrderListDTO.OrderDTO.PriceBlock priceBlock = null;
        while (true) {
            Long l13 = l11;
            Long l14 = l12;
            BadgeDTO badgeDTO3 = badgeDTO;
            TextDTO textDTO4 = textDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO5 = textDTO2;
                reader.endObject();
                if (badgeDTO3 == null) {
                    throw c.j("badge", "badge", reader);
                }
                if (l13 == null) {
                    throw c.j("timeToPay", "timeToPay", reader);
                }
                long longValue = l13.longValue();
                if (l14 == null) {
                    throw c.j("remainingDisplayTimerValue", "remainingDisplayTimerValue", reader);
                }
                long longValue2 = l14.longValue();
                if (textDTO4 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO5 == null) {
                    throw c.j("dates", "dates", reader);
                }
                if (textDTO3 == null) {
                    throw c.j(ProductAction.ACTION_DETAIL, ProductAction.ACTION_DETAIL, reader);
                }
                if (list == null) {
                    throw c.j("routeIcons", "routeIcons", reader);
                }
                if (atomActionDTO != null) {
                    return new UnpaidOrderListDTO.OrderDTO(badgeDTO3, longValue, longValue2, textDTO4, textDTO5, textDTO3, badgeDTO2, list, atomActionDTO, map, map2, priceBlock);
                }
                throw c.j("clickAction", "clickAction", reader);
            }
            TextDTO textDTO6 = textDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 0:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("badge", "badge", reader);
                    }
                    l11 = l13;
                    l12 = l14;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 1:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("timeToPay", "timeToPay", reader);
                    }
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 2:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("remainingDisplayTimerValue", "remainingDisplayTimerValue", reader);
                    }
                    l11 = l13;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                case 4:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("dates", "dates", reader);
                    }
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO = textDTO4;
                case 5:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q(ProductAction.ACTION_DETAIL, ProductAction.ACTION_DETAIL, reader);
                    }
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 6:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 7:
                    list = this.listOfIconDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("routeIcons", "routeIcons", reader);
                    }
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 8:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("clickAction", "clickAction", reader);
                    }
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 10:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                case 11:
                    priceBlock = this.nullablePriceBlockAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
                default:
                    l11 = l13;
                    l12 = l14;
                    badgeDTO = badgeDTO3;
                    textDTO2 = textDTO6;
                    textDTO = textDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UnpaidOrderListDTO.OrderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("timeToPay");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getTimeToPay()));
        writer.w("remainingDisplayTimerValue");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getRemainingDisplayTimerValue()));
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("dates");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDates());
        writer.w(ProductAction.ACTION_DETAIL);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDetail());
        writer.w("priceBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getPriceBadge());
        writer.w("routeIcons");
        this.listOfIconDTOAdapter.mo44toJson(writer, (x) value.getRouteIcons());
        writer.w("clickAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getClickAction());
        writer.w("viewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTracking());
        writer.w("clickTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getClickTracking());
        writer.w("priceBlock");
        this.nullablePriceBlockAdapter.mo44toJson(writer, (x) value.getPriceBlock());
        writer.p();
    }
}
