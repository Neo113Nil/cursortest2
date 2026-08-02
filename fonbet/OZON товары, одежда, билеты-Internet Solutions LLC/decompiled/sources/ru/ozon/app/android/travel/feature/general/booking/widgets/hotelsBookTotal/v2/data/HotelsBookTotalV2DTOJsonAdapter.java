package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$TotalPriceDetailItemDTO;", "nullableListOfTotalPriceDetailItemDTOAdapter", "nullableStringAdapter", "nullableTextDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO$PriceDetailItemDTO;", "listOfPriceDetailItemDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV2DTOJsonAdapter extends JsonAdapter<HotelsBookTotalV2DTO> {

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<HotelsBookTotalV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<HotelsBookTotalV2DTO.PriceDetailItemDTO>> listOfPriceDetailItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<HotelsBookTotalV2DTO.TotalPriceDetailItemDTO>> nullableListOfTotalPriceDetailItemDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsBookTotalV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "nextButton", "totalPriceDetails", "dividerColor", "agreement", "trackingInfo", "priceDetails");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "nextButton");
        this.nullableListOfTotalPriceDetailItemDTOAdapter = moshi.f(D.e(List.class, HotelsBookTotalV2DTO.TotalPriceDetailItemDTO.class), m11, "totalPriceDetails");
        this.nullableStringAdapter = moshi.f(String.class, m11, "dividerColor");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "agreement");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.listOfPriceDetailItemDTOAdapter = moshi.f(D.e(List.class, HotelsBookTotalV2DTO.PriceDetailItemDTO.class), m11, "priceDetails");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(HotelsBookTotalV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsBookTotalV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        List<HotelsBookTotalV2DTO.TotalPriceDetailItemDTO> list = null;
        String str = null;
        TextDTO textDTO2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        List<HotelsBookTotalV2DTO.PriceDetailItemDTO> list2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("nextButton", "nextButton", reader);
                    }
                    break;
                case 2:
                    list = this.nullableListOfTotalPriceDetailItemDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    list2 = this.listOfPriceDetailItemDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("priceDetails", "priceDetails", reader);
                    }
                    i11 = -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            TextDTO textDTO3 = textDTO2;
            String str2 = str;
            List<HotelsBookTotalV2DTO.TotalPriceDetailItemDTO> list3 = list;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            TextDTO textDTO4 = textDTO;
            if (textDTO4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (buttonV3DTO2 == null) {
                throw c.j("nextButton", "nextButton", reader);
            }
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2DTO.PriceDetailItemDTO>");
            return new HotelsBookTotalV2DTO(textDTO4, buttonV3DTO2, list3, str2, textDTO3, map2, list2);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        TextDTO textDTO5 = textDTO2;
        String str3 = str;
        List<HotelsBookTotalV2DTO.TotalPriceDetailItemDTO> list4 = list;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        TextDTO textDTO6 = textDTO;
        Constructor<HotelsBookTotalV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsBookTotalV2DTO.class.getDeclaredConstructor(TextDTO.class, ButtonV3DTO.class, List.class, String.class, TextDTO.class, Map.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<HotelsBookTotalV2DTO> constructor2 = constructor;
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (buttonV3DTO3 == null) {
            throw c.j("nextButton", "nextButton", reader);
        }
        HotelsBookTotalV2DTO newInstance = constructor2.newInstance(textDTO6, buttonV3DTO3, list4, str3, textDTO5, map3, list2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsBookTotalV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("nextButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getNextButton());
        writer.w("totalPriceDetails");
        this.nullableListOfTotalPriceDetailItemDTOAdapter.mo44toJson(writer, (x) value.getTotalPriceDetails());
        writer.w("dividerColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDividerColor());
        writer.w("agreement");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAgreement());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("priceDetails");
        this.listOfPriceDetailItemDTOAdapter.mo44toJson(writer, (x) value.getPriceDetails());
        writer.p();
    }
}
