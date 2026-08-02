package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2DTOJsonAdapter extends JsonAdapter<TotalPriceWithButtonV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public TotalPriceWithButtonV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleIcon", "titlePrice", "titleCommon", "subtitle", "subtitlePrice", "countdownTitle", "countdownIcon", "countdownTime", "countdownColor", "nextButton", "nextStickyButton", "agreement", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "titleIcon");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "titlePrice");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "titleCommon");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "countdownTime");
        this.nullableStringAdapter = moshi.f(String.class, m11, "countdownColor");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "nextButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(TotalPriceWithButtonV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalPriceWithButtonV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        PriceDTO priceDTO = null;
        CommonControlSettings commonControlSettings = null;
        TextDTO textDTO2 = null;
        PriceDTO priceDTO2 = null;
        TextDTO textDTO3 = null;
        IconDTO iconDTO2 = null;
        Integer num = null;
        String str = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        TextDTO textDTO4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            TextDTO textDTO5 = textDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    continue;
                case 1:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    priceDTO2 = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("nextButton", "nextButton", reader);
                    }
                    break;
                case 11:
                    buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO2 == null) {
                        throw c.q("nextStickyButton", "nextStickyButton", reader);
                    }
                    break;
                case 12:
                    textDTO4 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 13:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            textDTO = textDTO5;
        }
        TextDTO textDTO6 = textDTO;
        reader.endObject();
        if (buttonV3DTO == null) {
            throw c.j("nextButton", "nextButton", reader);
        }
        if (buttonV3DTO2 != null) {
            return new TotalPriceWithButtonV2DTO(textDTO6, iconDTO, priceDTO, commonControlSettings, textDTO2, priceDTO2, textDTO3, iconDTO2, num, str, buttonV3DTO, buttonV3DTO2, textDTO4, map);
        }
        throw c.j("nextStickyButton", "nextStickyButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalPriceWithButtonV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getTitleIcon());
        writer.w("titlePrice");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getTitlePrice());
        writer.w("titleCommon");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getTitleCommon());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("subtitlePrice");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getSubtitlePrice());
        writer.w("countdownTitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getCountdownTitle());
        writer.w("countdownIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getCountdownIcon());
        writer.w("countdownTime");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getCountdownTime());
        writer.w("countdownColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCountdownColor());
        writer.w("nextButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getNextButton());
        writer.w("nextStickyButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getNextStickyButton());
        writer.w("agreement");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAgreement());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
