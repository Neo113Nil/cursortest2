package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "nullablePriceContainerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "nullableOzonCardPriceAdapter", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "nullableVATPriceAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;", "nullableBonusInfoAdapter", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "nullablePDPOnBoardingDTOAdapter", "", "nullableListOfBonusInfoAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableBooleanAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2DTOJsonAdapter extends JsonAdapter<PriceV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PriceV2DTO.BonusInfo> nullableBonusInfoAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<PriceV2DTO.BonusInfo>> nullableListOfBonusInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PriceV2DTO.OzonCardPrice> nullableOzonCardPriceAdapter;

    @NotNull
    private final JsonAdapter<PDPOnBoardingDTO> nullablePDPOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceV2DTO.PriceContainer> nullablePriceContainerAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<PriceV2DTO.VATPrice> nullableVATPriceAdapter;

    @NotNull
    private final n.a options;

    public PriceV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("ordinaryPrice", "ozonCardPrice", "vatPrice", "multiplicityInfo", "bonusInfo", "cheaperInfo", "dutyOnGoods", "cheaperInfoOnBoarding", "infoCards", "innerBackgroundColor", "outerBackgroundColor", "trackingInfo", "showBottomSeparator", "showBottomRounding");
        M m11 = M.f71699a;
        this.nullablePriceContainerAdapter = moshi.f(PriceV2DTO.PriceContainer.class, m11, "ordinaryPrice");
        this.nullableOzonCardPriceAdapter = moshi.f(PriceV2DTO.OzonCardPrice.class, m11, "ozonCardPrice");
        this.nullableVATPriceAdapter = moshi.f(PriceV2DTO.VATPrice.class, m11, "vatPrice");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "multiplicityInfo");
        this.nullableBonusInfoAdapter = moshi.f(PriceV2DTO.BonusInfo.class, m11, "bonusInfo");
        this.nullablePDPOnBoardingDTOAdapter = moshi.f(PDPOnBoardingDTO.class, m11, "cheaperInfoOnBoarding");
        this.nullableListOfBonusInfoAdapter = moshi.f(D.e(List.class, PriceV2DTO.BonusInfo.class), m11, "infoCards");
        this.nullableStringAdapter = moshi.f(String.class, m11, "innerBackgroundColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "showBottomSeparator");
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(PriceV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PriceV2DTO.PriceContainer priceContainer = null;
        PriceV2DTO.OzonCardPrice ozonCardPrice = null;
        PriceV2DTO.VATPrice vATPrice = null;
        TextAtom textAtom = null;
        PriceV2DTO.BonusInfo bonusInfo = null;
        PriceV2DTO.BonusInfo bonusInfo2 = null;
        PriceV2DTO.BonusInfo bonusInfo3 = null;
        PDPOnBoardingDTO pDPOnBoardingDTO = null;
        List<PriceV2DTO.BonusInfo> list = null;
        String str = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    priceContainer = this.nullablePriceContainerAdapter.fromJson(reader);
                    break;
                case 1:
                    ozonCardPrice = this.nullableOzonCardPriceAdapter.fromJson(reader);
                    break;
                case 2:
                    vATPrice = this.nullableVATPriceAdapter.fromJson(reader);
                    break;
                case 3:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    bonusInfo = this.nullableBonusInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    bonusInfo2 = this.nullableBonusInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    bonusInfo3 = this.nullableBonusInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    pDPOnBoardingDTO = this.nullablePDPOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    list = this.nullableListOfBonusInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new PriceV2DTO(priceContainer, ozonCardPrice, vATPrice, textAtom, bonusInfo, bonusInfo2, bonusInfo3, pDPOnBoardingDTO, list, str, str2, map, bool, bool2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("ordinaryPrice");
        this.nullablePriceContainerAdapter.mo44toJson(writer, (x) value.getOrdinaryPrice());
        writer.w("ozonCardPrice");
        this.nullableOzonCardPriceAdapter.mo44toJson(writer, (x) value.getOzonCardPrice());
        writer.w("vatPrice");
        this.nullableVATPriceAdapter.mo44toJson(writer, (x) value.getVatPrice());
        writer.w("multiplicityInfo");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getMultiplicityInfo());
        writer.w("bonusInfo");
        this.nullableBonusInfoAdapter.mo44toJson(writer, (x) value.getBonusInfo());
        writer.w("cheaperInfo");
        this.nullableBonusInfoAdapter.mo44toJson(writer, (x) value.getCheaperInfo());
        writer.w("dutyOnGoods");
        this.nullableBonusInfoAdapter.mo44toJson(writer, (x) value.getDutyOnGoods());
        writer.w("cheaperInfoOnBoarding");
        this.nullablePDPOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getCheaperInfoOnBoarding());
        writer.w("infoCards");
        this.nullableListOfBonusInfoAdapter.mo44toJson(writer, (x) value.getInfoCards());
        writer.w("innerBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getInnerBackgroundColor());
        writer.w("outerBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOuterBackgroundColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("showBottomSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowBottomSeparator());
        writer.w("showBottomRounding");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowBottomRounding());
        writer.p();
    }
}
