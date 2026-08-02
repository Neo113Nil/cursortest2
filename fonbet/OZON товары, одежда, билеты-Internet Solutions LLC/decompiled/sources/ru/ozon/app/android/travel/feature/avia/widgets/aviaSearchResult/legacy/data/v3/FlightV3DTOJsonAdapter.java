package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.FlightV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001aR(\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000200\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001a¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$RouteBlockDTO;", "listOfRouteBlockDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$LuggageTabDTO;", "listOfLuggageTabDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$SimplePrice;", "simplePriceAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/FlightV3DTO$BonusPrice;", "nullableBonusPriceAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButtonAdapter", "nullableSmallButtonAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "nullableStringAdapter", "nullableBadgeAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "nullablePriceAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightV3DTOJsonAdapter extends JsonAdapter<FlightV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<List<FlightV3DTO.LuggageTabDTO>> listOfLuggageTabDTOAdapter;

    @NotNull
    private final JsonAdapter<List<FlightV3DTO.RouteBlockDTO>> listOfRouteBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<FlightV3DTO.BonusPrice> nullableBonusPriceAdapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Price> nullablePriceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<FlightV3DTO.SimplePrice> simplePriceAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> smallButtonAdapter;

    public FlightV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("routeBlocks", "luggageTabs", "simplePrice", "bonusPrice", "remainingTickets", "smallButton", "bonusSmallButton", "routeBadges", "borderColor", "bonusBackgroundColor", "premiumBadge", "bonusPremiumBadge", "crossedPrice", "cardClickAction", "bonusCardClickAction", "cardClickTrackingInfo", "viewTrackingInfo");
        b e11 = D.e(List.class, FlightV3DTO.RouteBlockDTO.class);
        M m11 = M.f71699a;
        this.listOfRouteBlockDTOAdapter = moshi.f(e11, m11, "routeBlocks");
        this.listOfLuggageTabDTOAdapter = moshi.f(D.e(List.class, FlightV3DTO.LuggageTabDTO.class), m11, "luggageTabs");
        this.simplePriceAdapter = moshi.f(FlightV3DTO.SimplePrice.class, m11, "simplePrice");
        this.nullableBonusPriceAdapter = moshi.f(FlightV3DTO.BonusPrice.class, m11, "bonusPrice");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "remainingTickets");
        this.smallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "smallButton");
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "bonusSmallButton");
        this.nullableListOfBadgeAdapter = moshi.f(D.e(List.class, Badge.class), m11, "routeBadges");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "premiumBadge");
        this.nullablePriceAdapter = moshi.f(Price.class, m11, "crossedPrice");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "cardClickAction");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "bonusCardClickAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "cardClickTrackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(33, "GeneratedJsonAdapter(FlightV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<FlightV3DTO.RouteBlockDTO> list = null;
        List<FlightV3DTO.LuggageTabDTO> list2 = null;
        FlightV3DTO.SimplePrice simplePrice = null;
        FlightV3DTO.BonusPrice bonusPrice = null;
        TextAtom textAtom = null;
        ButtonV3Atom.SmallButton smallButton = null;
        ButtonV3Atom.SmallButton smallButton2 = null;
        List<Badge> list3 = null;
        String str = null;
        String str2 = null;
        Badge badge = null;
        Badge badge2 = null;
        Price price = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        while (true) {
            List<FlightV3DTO.RouteBlockDTO> list4 = list;
            List<FlightV3DTO.LuggageTabDTO> list5 = list2;
            FlightV3DTO.SimplePrice simplePrice2 = simplePrice;
            if (!reader.hasNext()) {
                FlightV3DTO.BonusPrice bonusPrice2 = bonusPrice;
                reader.endObject();
                if (list4 == null) {
                    throw c.j("routeBlocks", "routeBlocks", reader);
                }
                if (list5 == null) {
                    throw c.j("luggageTabs", "luggageTabs", reader);
                }
                if (simplePrice2 == null) {
                    throw c.j("simplePrice", "simplePrice", reader);
                }
                if (smallButton == null) {
                    throw c.j("smallButton", "smallButton", reader);
                }
                if (atomActionDTO != null) {
                    return new FlightV3DTO(list4, list5, simplePrice2, bonusPrice2, textAtom, smallButton, smallButton2, list3, str, str2, badge, badge2, price, atomActionDTO, atomActionDTO2, map, map2);
                }
                throw c.j("cardClickAction", "cardClickAction", reader);
            }
            FlightV3DTO.BonusPrice bonusPrice3 = bonusPrice;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 0:
                    list = this.listOfRouteBlockDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("routeBlocks", "routeBlocks", reader);
                    }
                    bonusPrice = bonusPrice3;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 1:
                    list2 = this.listOfLuggageTabDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("luggageTabs", "luggageTabs", reader);
                    }
                    bonusPrice = bonusPrice3;
                    list = list4;
                    simplePrice = simplePrice2;
                case 2:
                    simplePrice = this.simplePriceAdapter.fromJson(reader);
                    if (simplePrice == null) {
                        throw c.q("simplePrice", "simplePrice", reader);
                    }
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                case 3:
                    bonusPrice = this.nullableBonusPriceAdapter.fromJson(reader);
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 4:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 5:
                    smallButton = this.smallButtonAdapter.fromJson(reader);
                    if (smallButton == null) {
                        throw c.q("smallButton", "smallButton", reader);
                    }
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 6:
                    smallButton2 = this.nullableSmallButtonAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 7:
                    list3 = this.nullableListOfBadgeAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 10:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 11:
                    badge2 = this.nullableBadgeAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 12:
                    price = this.nullablePriceAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 13:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("cardClickAction", "cardClickAction", reader);
                    }
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 14:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 15:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                case 16:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
                default:
                    bonusPrice = bonusPrice3;
                    list = list4;
                    list2 = list5;
                    simplePrice = simplePrice2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("routeBlocks");
        this.listOfRouteBlockDTOAdapter.mo44toJson(writer, (x) value.getRouteBlocks());
        writer.w("luggageTabs");
        this.listOfLuggageTabDTOAdapter.mo44toJson(writer, (x) value.getLuggageTabs());
        writer.w("simplePrice");
        this.simplePriceAdapter.mo44toJson(writer, (x) value.getSimplePrice());
        writer.w("bonusPrice");
        this.nullableBonusPriceAdapter.mo44toJson(writer, (x) value.getBonusPrice());
        writer.w("remainingTickets");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getRemainingTickets());
        writer.w("smallButton");
        this.smallButtonAdapter.mo44toJson(writer, (x) value.getSmallButton());
        writer.w("bonusSmallButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getBonusSmallButton());
        writer.w("routeBadges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getRouteBadges());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("bonusBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBonusBackgroundColor());
        writer.w("premiumBadge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getPremiumBadge());
        writer.w("bonusPremiumBadge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBonusPremiumBadge());
        writer.w("crossedPrice");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getCrossedPrice());
        writer.w("cardClickAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getCardClickAction());
        writer.w("bonusCardClickAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getBonusCardClickAction());
        writer.w("cardClickTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getCardClickTrackingInfo());
        writer.w("viewTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTrackingInfo());
        writer.p();
    }
}
