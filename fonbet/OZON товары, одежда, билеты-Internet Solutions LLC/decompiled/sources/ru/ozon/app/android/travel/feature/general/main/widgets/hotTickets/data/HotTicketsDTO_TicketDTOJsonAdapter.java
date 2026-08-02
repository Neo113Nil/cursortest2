package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data;

import Ak.b;
import Y9.c;
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
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO_TicketDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "listOfImageDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotTicketsDTO_TicketDTOJsonAdapter extends JsonAdapter<HotTicketsDTO.TicketDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ImageDTO>> listOfImageDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotTicketsDTO_TicketDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("dateBadge", "price", "airlineIcons", "destination", "tripDuration", "tripTime", "transferText", "transferIcon", "cardClickAction", "trackingInfo");
        M m11 = M.f71699a;
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "dateBadge");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.listOfImageDTOAdapter = moshi.f(D.e(List.class, ImageDTO.class), m11, "airlineIcons");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "destination");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "tripTime");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "transferIcon");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "cardClickAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(HotTicketsDTO.TicketDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotTicketsDTO.TicketDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BadgeDTO badgeDTO = null;
        PriceDTO priceDTO = null;
        List<ImageDTO> list = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        TextDTO textDTO4 = null;
        IconDTO iconDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            BadgeDTO badgeDTO2 = badgeDTO;
            if (!reader.hasNext()) {
                PriceDTO priceDTO2 = priceDTO;
                reader.endObject();
                if (badgeDTO2 == null) {
                    throw c.j("dateBadge", "dateBadge", reader);
                }
                if (priceDTO2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (list == null) {
                    throw c.j("airlineIcons", "airlineIcons", reader);
                }
                if (textDTO == null) {
                    throw c.j("destination", "destination", reader);
                }
                if (textDTO2 != null) {
                    return new HotTicketsDTO.TicketDTO(badgeDTO2, priceDTO2, list, textDTO, textDTO2, textDTO3, textDTO4, iconDTO, atomActionDTO, map);
                }
                throw c.j("tripDuration", "tripDuration", reader);
            }
            PriceDTO priceDTO3 = priceDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 0:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("dateBadge", "dateBadge", reader);
                    }
                    priceDTO = priceDTO3;
                case 1:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    badgeDTO = badgeDTO2;
                case 2:
                    list = this.listOfImageDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("airlineIcons", "airlineIcons", reader);
                    }
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("destination", "destination", reader);
                    }
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 4:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("tripDuration", "tripDuration", reader);
                    }
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 5:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 6:
                    textDTO4 = this.nullableTextDTOAdapter.fromJson(reader);
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 7:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 8:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
                default:
                    priceDTO = priceDTO3;
                    badgeDTO = badgeDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotTicketsDTO.TicketDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("dateBadge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getDateBadge());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("airlineIcons");
        this.listOfImageDTOAdapter.mo44toJson(writer, (x) value.getAirlineIcons());
        writer.w("destination");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDestination());
        writer.w("tripDuration");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTripDuration());
        writer.w("tripTime");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTripTime());
        writer.w("transferText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTransferText());
        writer.w("transferIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getTransferIcon());
        writer.w("cardClickAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getCardClickAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
