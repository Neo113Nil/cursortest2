package ru.ozon.app.android.pdp.widgets.priceV4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "nullablePriceDTOAdapter", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DTO$StarsBadge;", "nullableStarsBadgeAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "nullablePartnerBanksDTOAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV4DTOJsonAdapter extends JsonAdapter<PriceV4DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<PartnerBanksDTO> nullablePartnerBanksDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceV4DTO.StarsBadge> nullableStarsBadgeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    public PriceV4DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("price", "priceAction", "priceIcon", "bottomPrice", "bottomPriceAction", "moreAboutPrice", "ozonCardBadge", "topFinBadge", "topStarsBadge", "bottomFinBadge", "trackingInfo", "onboarding", "partnerBanks");
        M m11 = M.f71699a;
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "priceAction");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "priceIcon");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "bottomPrice");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "bottomPriceAction");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "moreAboutPrice");
        this.nullableStarsBadgeAdapter = moshi.f(PriceV4DTO.StarsBadge.class, m11, "topStarsBadge");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
        this.nullablePartnerBanksDTOAdapter = moshi.f(PartnerBanksDTO.class, m11, "partnerBanks");
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(PriceV4DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceV4DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PriceDTO priceDTO = null;
        AtomActionDTO atomActionDTO = null;
        Icon icon = null;
        PriceDTO priceDTO2 = null;
        AtomActionDTO atomActionDTO2 = null;
        BadgeDTO badgeDTO = null;
        BadgeDTO badgeDTO2 = null;
        BadgeDTO badgeDTO3 = null;
        PriceV4DTO.StarsBadge starsBadge = null;
        BadgeDTO badgeDTO4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        OnBoardingDTO onBoardingDTO = null;
        PartnerBanksDTO partnerBanksDTO = null;
        while (reader.hasNext()) {
            PriceDTO priceDTO3 = priceDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    continue;
                case 1:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("priceAction", "priceAction", reader);
                    }
                    break;
                case 2:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 3:
                    priceDTO2 = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    badgeDTO3 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    starsBadge = this.nullableStarsBadgeAdapter.fromJson(reader);
                    break;
                case 9:
                    badgeDTO4 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 11:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 12:
                    partnerBanksDTO = this.nullablePartnerBanksDTOAdapter.fromJson(reader);
                    break;
            }
            priceDTO = priceDTO3;
        }
        PriceDTO priceDTO4 = priceDTO;
        reader.endObject();
        if (priceDTO4 == null) {
            throw c.j("price", "price", reader);
        }
        if (atomActionDTO != null) {
            return new PriceV4DTO(priceDTO4, atomActionDTO, icon, priceDTO2, atomActionDTO2, badgeDTO, badgeDTO2, badgeDTO3, starsBadge, badgeDTO4, map, onBoardingDTO, partnerBanksDTO);
        }
        throw c.j("priceAction", "priceAction", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceV4DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getPriceAction());
        writer.w("priceIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getPriceIcon());
        writer.w("bottomPrice");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getBottomPrice());
        writer.w("bottomPriceAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getBottomPriceAction());
        writer.w("moreAboutPrice");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getMoreAboutPrice());
        writer.w("ozonCardBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getOzonCardBadge());
        writer.w("topFinBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getTopFinBadge());
        writer.w("topStarsBadge");
        this.nullableStarsBadgeAdapter.mo44toJson(writer, (x) value.getTopStarsBadge());
        writer.w("bottomFinBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBottomFinBadge());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("partnerBanks");
        this.nullablePartnerBanksDTOAdapter.mo44toJson(writer, (x) value.getPartnerBanks());
        writer.p();
    }
}
