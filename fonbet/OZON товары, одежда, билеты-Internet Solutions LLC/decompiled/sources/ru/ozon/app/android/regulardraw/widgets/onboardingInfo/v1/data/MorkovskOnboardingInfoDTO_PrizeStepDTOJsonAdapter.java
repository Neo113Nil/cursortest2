package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.data;

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
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.data.MorkovskOnboardingInfoDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO_PrizeStepDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "morkovskCurrencyBadgeDTOAdapter", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "morkovskShadowButtonDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskOnboardingInfoDTO_PrizeStepDTOJsonAdapter extends JsonAdapter<MorkovskOnboardingInfoDTO.PrizeStepDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<MorkovskCurrencyBadgeDTO> morkovskCurrencyBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<MorkovskShadowButtonDTO> morkovskShadowButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MorkovskOnboardingInfoDTO_PrizeStepDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("prizeText", "prizeImage", "tooltipText", "carrotsExchangeRate", "ticketsExchangeRate", "finishButton", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "prizeText");
        this.morkovskCurrencyBadgeDTOAdapter = moshi.f(MorkovskCurrencyBadgeDTO.class, m11, "carrotsExchangeRate");
        this.morkovskShadowButtonDTOAdapter = moshi.f(MorkovskShadowButtonDTO.class, m11, "finishButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(MorkovskOnboardingInfoDTO.PrizeStepDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MorkovskOnboardingInfoDTO.PrizeStepDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = null;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO2 = null;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("prizeText", "prizeText", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("prizeImage", "prizeImage", reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("tooltipText", "tooltipText", reader);
                    }
                    break;
                case 3:
                    morkovskCurrencyBadgeDTO = this.morkovskCurrencyBadgeDTOAdapter.fromJson(reader);
                    if (morkovskCurrencyBadgeDTO == null) {
                        throw c.q("carrotsExchangeRate", "carrotsExchangeRate", reader);
                    }
                    break;
                case 4:
                    morkovskCurrencyBadgeDTO2 = this.morkovskCurrencyBadgeDTOAdapter.fromJson(reader);
                    if (morkovskCurrencyBadgeDTO2 == null) {
                        throw c.q("ticketsExchangeRate", "ticketsExchangeRate", reader);
                    }
                    break;
                case 5:
                    morkovskShadowButtonDTO = this.morkovskShadowButtonDTOAdapter.fromJson(reader);
                    if (morkovskShadowButtonDTO == null) {
                        throw c.q("finishButton", "finishButton", reader);
                    }
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("prizeText", "prizeText", reader);
        }
        if (str2 == null) {
            throw c.j("prizeImage", "prizeImage", reader);
        }
        if (str3 == null) {
            throw c.j("tooltipText", "tooltipText", reader);
        }
        if (morkovskCurrencyBadgeDTO == null) {
            throw c.j("carrotsExchangeRate", "carrotsExchangeRate", reader);
        }
        if (morkovskCurrencyBadgeDTO2 == null) {
            throw c.j("ticketsExchangeRate", "ticketsExchangeRate", reader);
        }
        if (morkovskShadowButtonDTO != null) {
            return new MorkovskOnboardingInfoDTO.PrizeStepDTO(str, str2, str3, morkovskCurrencyBadgeDTO, morkovskCurrencyBadgeDTO2, morkovskShadowButtonDTO, map);
        }
        throw c.j("finishButton", "finishButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MorkovskOnboardingInfoDTO.PrizeStepDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("prizeText");
        this.stringAdapter.mo44toJson(writer, (x) value.getPrizeText());
        writer.w("prizeImage");
        this.stringAdapter.mo44toJson(writer, (x) value.getPrizeImage());
        writer.w("tooltipText");
        this.stringAdapter.mo44toJson(writer, (x) value.getTooltipText());
        writer.w("carrotsExchangeRate");
        this.morkovskCurrencyBadgeDTOAdapter.mo44toJson(writer, (x) value.getCarrotsExchangeRate());
        writer.w("ticketsExchangeRate");
        this.morkovskCurrencyBadgeDTOAdapter.mo44toJson(writer, (x) value.getTicketsExchangeRate());
        writer.w("finishButton");
        this.morkovskShadowButtonDTOAdapter.mo44toJson(writer, (x) value.getFinishButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
