package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data;

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
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3DTO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO_InputItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v2/CommonInputV2DTO;", "commonInputV2DTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "listOfBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV3DTO_InputItemDTOJsonAdapter extends JsonAdapter<TravelAddNewPassengerFormV3DTO.InputItemDTO> {

    @NotNull
    private final JsonAdapter<CommonInputV2DTO> commonInputV2DTOAdapter;
    private volatile Constructor<TravelAddNewPassengerFormV3DTO.InputItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelAddNewPassengerFormV3DTO_InputItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "input", "infoText", "hintBadges", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "id");
        this.commonInputV2DTOAdapter = moshi.f(CommonInputV2DTO.class, m11, "input");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "infoText");
        this.listOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "hintBadges");
        this.nullableDisclaimerDTOAdapter = moshi.f(TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(TravelAddNewPassengerFormV3DTO.InputItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelAddNewPassengerFormV3DTO.InputItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        CommonInputV2DTO commonInputV2DTO = null;
        TextDTO textDTO = null;
        List<BadgeDTO> list = null;
        TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO disclaimerDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("id", "id", reader);
                }
            } else if (v11 == 1) {
                commonInputV2DTO = this.commonInputV2DTOAdapter.fromJson(reader);
                if (commonInputV2DTO == null) {
                    throw c.q("input", "input", reader);
                }
            } else if (v11 == 2) {
                textDTO = this.nullableTextDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                list = this.listOfBadgeDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("hintBadges", "hintBadges", reader);
                }
                i11 = -9;
            } else if (v11 == 4) {
                disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -9) {
            CommonInputV2DTO commonInputV2DTO2 = commonInputV2DTO;
            if (num == null) {
                throw c.j("id", "id", reader);
            }
            TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
            TextDTO textDTO2 = textDTO;
            int intValue = num.intValue();
            if (commonInputV2DTO2 == null) {
                throw c.j("input", "input", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.dsBadge.BadgeDTO>");
            return new TravelAddNewPassengerFormV3DTO.InputItemDTO(intValue, commonInputV2DTO2, textDTO2, list, disclaimerDTO2);
        }
        CommonInputV2DTO commonInputV2DTO3 = commonInputV2DTO;
        TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO disclaimerDTO3 = disclaimerDTO;
        TextDTO textDTO3 = textDTO;
        Constructor<TravelAddNewPassengerFormV3DTO.InputItemDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = TravelAddNewPassengerFormV3DTO.InputItemDTO.class.getDeclaredConstructor(cls2, CommonInputV2DTO.class, TextDTO.class, List.class, TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TravelAddNewPassengerFormV3DTO.InputItemDTO> constructor2 = constructor;
        if (num == null) {
            throw c.j("id", "id", reader);
        }
        if (commonInputV2DTO3 == null) {
            throw c.j("input", "input", reader);
        }
        TravelAddNewPassengerFormV3DTO.InputItemDTO newInstance = constructor2.newInstance(num, commonInputV2DTO3, textDTO3, list, disclaimerDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelAddNewPassengerFormV3DTO.InputItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getId()));
        writer.w("input");
        this.commonInputV2DTOAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("infoText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getInfoText());
        writer.w("hintBadges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getHintBadges());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.p();
    }
}
