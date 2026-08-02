package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.data;

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
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "commonInputV2DTOAdapter", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "listOfTagButtonDTOAdapter", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelPersonalAccountReplenishmentV3DTOJsonAdapter extends JsonAdapter<TravelPersonalAccountReplenishmentV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonInputV2DTO> commonInputV2DTOAdapter;
    private volatile Constructor<TravelPersonalAccountReplenishmentV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TagButtonDTO>> listOfTagButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelPersonalAccountReplenishmentV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "input", "inputVariants", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "submitButton", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.commonInputV2DTOAdapter = moshi.f(CommonInputV2DTO.class, m11, "input");
        this.listOfTagButtonDTOAdapter = moshi.f(D.e(List.class, TagButtonDTO.class), m11, "inputVariants");
        this.nullableDisclaimerDTOAdapter = moshi.f(DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "submitButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(TravelPersonalAccountReplenishmentV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPersonalAccountReplenishmentV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CommonInputV2DTO commonInputV2DTO = null;
        List<TagButtonDTO> list = null;
        DisclaimerDTO disclaimerDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    commonInputV2DTO = this.commonInputV2DTOAdapter.fromJson(reader);
                    if (commonInputV2DTO == null) {
                        throw c.q("input", "input", reader);
                    }
                    break;
                case 3:
                    list = this.listOfTagButtonDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("inputVariants", "inputVariants", reader);
                    }
                    i11 = -9;
                    break;
                case 4:
                    disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("submitButton", "submitButton", reader);
                    }
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            CommonInputV2DTO commonInputV2DTO2 = commonInputV2DTO;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            if (commonInputV2DTO2 == null) {
                throw c.j("input", "input", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO>");
            if (buttonV3DTO == null) {
                throw c.j("submitButton", "submitButton", reader);
            }
            Map<String, TokenizedTrackingInfo> map2 = map;
            return new TravelPersonalAccountReplenishmentV3DTO(textDTO4, textDTO3, commonInputV2DTO2, list, disclaimerDTO, buttonV3DTO, map2);
        }
        CommonInputV2DTO commonInputV2DTO3 = commonInputV2DTO;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        Constructor<TravelPersonalAccountReplenishmentV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelPersonalAccountReplenishmentV3DTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, CommonInputV2DTO.class, List.class, DisclaimerDTO.class, ButtonV3DTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TravelPersonalAccountReplenishmentV3DTO> constructor2 = constructor;
        if (commonInputV2DTO3 == null) {
            throw c.j("input", "input", reader);
        }
        if (buttonV3DTO == null) {
            throw c.j("submitButton", "submitButton", reader);
        }
        TravelPersonalAccountReplenishmentV3DTO newInstance = constructor2.newInstance(textDTO6, textDTO5, commonInputV2DTO3, list, disclaimerDTO, buttonV3DTO, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPersonalAccountReplenishmentV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("input");
        this.commonInputV2DTOAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("inputVariants");
        this.listOfTagButtonDTOAdapter.mo44toJson(writer, (x) value.getInputVariants());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.w("submitButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
