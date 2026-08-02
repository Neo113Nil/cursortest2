package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5DTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO_RoomDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$GuestFormDTO;", "listOfGuestFormDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "nullableLinkButtonDTOAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5DTO_RoomDTOJsonAdapter extends JsonAdapter<AddHotelGuestsV5DTO.RoomDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<AddHotelGuestsV5DTO.GuestFormDTO>> listOfGuestFormDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<LinkButtonDTO> nullableLinkButtonDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AddHotelGuestsV5DTO_RoomDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "forms", "addGuestButton", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfGuestFormDTOAdapter = moshi.f(D.e(List.class, AddHotelGuestsV5DTO.GuestFormDTO.class), m11, "forms");
        this.nullableLinkButtonDTOAdapter = moshi.f(LinkButtonDTO.class, m11, "addGuestButton");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(AddHotelGuestsV5DTO.RoomDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddHotelGuestsV5DTO.RoomDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        List<AddHotelGuestsV5DTO.GuestFormDTO> list = null;
        LinkButtonDTO linkButtonDTO = null;
        DisclaimerAtom disclaimerAtom = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                textDTO2 = this.textDTOAdapter.fromJson(reader);
                if (textDTO2 == null) {
                    throw c.q("subtitle", "subtitle", reader);
                }
            } else if (v11 == 2) {
                list = this.listOfGuestFormDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("forms", "forms", reader);
                }
            } else if (v11 == 3) {
                linkButtonDTO = this.nullableLinkButtonDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textDTO2 == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        if (list != null) {
            return new AddHotelGuestsV5DTO.RoomDTO(textDTO, textDTO2, list, linkButtonDTO, disclaimerAtom);
        }
        throw c.j("forms", "forms", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddHotelGuestsV5DTO.RoomDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("forms");
        this.listOfGuestFormDTOAdapter.mo44toJson(writer, (x) value.getForms());
        writer.w("addGuestButton");
        this.nullableLinkButtonDTOAdapter.mo44toJson(writer, (x) value.getAddGuestButton());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.p();
    }
}
