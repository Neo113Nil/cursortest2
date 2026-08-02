package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data;

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
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data.TravelRoomAndGuestsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO$CancellationInfoDTO;", "cancellationInfoDTOAdapter", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/data/TravelRoomAndGuestsDTO$GuestDTO;", "listOfGuestDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRoomAndGuestsDTOJsonAdapter extends JsonAdapter<TravelRoomAndGuestsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TravelRoomAndGuestsDTO.CancellationInfoDTO> cancellationInfoDTOAdapter;
    private volatile Constructor<TravelRoomAndGuestsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TravelRoomAndGuestsDTO.GuestDTO>> listOfGuestDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelRoomAndGuestsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "feedInfo", "cancellationInfo", "priceForMobile", "priceDescription", "guests");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.cancellationInfoDTOAdapter = moshi.f(TravelRoomAndGuestsDTO.CancellationInfoDTO.class, m11, "cancellationInfo");
        this.listOfGuestDTOAdapter = moshi.f(D.e(List.class, TravelRoomAndGuestsDTO.GuestDTO.class), m11, "guests");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(TravelRoomAndGuestsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRoomAndGuestsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TravelRoomAndGuestsDTO.CancellationInfoDTO cancellationInfoDTO = null;
        TextAtom textAtom3 = null;
        TextAtom textAtom4 = null;
        List<TravelRoomAndGuestsDTO.GuestDTO> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("feedInfo", "feedInfo", reader);
                    }
                    break;
                case 2:
                    cancellationInfoDTO = this.cancellationInfoDTOAdapter.fromJson(reader);
                    if (cancellationInfoDTO == null) {
                        throw c.q("cancellationInfo", "cancellationInfo", reader);
                    }
                    break;
                case 3:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("priceForMobile", "priceForMobile", reader);
                    }
                    break;
                case 4:
                    textAtom4 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom4 == null) {
                        throw c.q("priceDescription", "priceDescription", reader);
                    }
                    break;
                case 5:
                    list = this.listOfGuestDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("guests", "guests", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            TextAtom textAtom5 = textAtom4;
            TextAtom textAtom6 = textAtom3;
            TravelRoomAndGuestsDTO.CancellationInfoDTO cancellationInfoDTO2 = cancellationInfoDTO;
            TextAtom textAtom7 = textAtom2;
            TextAtom textAtom8 = textAtom;
            if (textAtom8 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (textAtom7 == null) {
                throw c.j("feedInfo", "feedInfo", reader);
            }
            if (cancellationInfoDTO2 == null) {
                throw c.j("cancellationInfo", "cancellationInfo", reader);
            }
            if (textAtom6 == null) {
                throw c.j("priceForMobile", "priceForMobile", reader);
            }
            if (textAtom5 == null) {
                throw c.j("priceDescription", "priceDescription", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data.TravelRoomAndGuestsDTO.GuestDTO>");
            return new TravelRoomAndGuestsDTO(textAtom8, textAtom7, cancellationInfoDTO2, textAtom6, textAtom5, list);
        }
        TextAtom textAtom9 = textAtom4;
        TextAtom textAtom10 = textAtom3;
        TravelRoomAndGuestsDTO.CancellationInfoDTO cancellationInfoDTO3 = cancellationInfoDTO;
        TextAtom textAtom11 = textAtom2;
        TextAtom textAtom12 = textAtom;
        Constructor<TravelRoomAndGuestsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelRoomAndGuestsDTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, TravelRoomAndGuestsDTO.CancellationInfoDTO.class, TextAtom.class, TextAtom.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textAtom12 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textAtom11 == null) {
            throw c.j("feedInfo", "feedInfo", reader);
        }
        if (cancellationInfoDTO3 == null) {
            throw c.j("cancellationInfo", "cancellationInfo", reader);
        }
        if (textAtom10 == null) {
            throw c.j("priceForMobile", "priceForMobile", reader);
        }
        if (textAtom9 == null) {
            throw c.j("priceDescription", "priceDescription", reader);
        }
        TravelRoomAndGuestsDTO newInstance = constructor.newInstance(textAtom12, textAtom11, cancellationInfoDTO3, textAtom10, textAtom9, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRoomAndGuestsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("feedInfo");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getFeedInfo());
        writer.w("cancellationInfo");
        this.cancellationInfoDTOAdapter.mo44toJson(writer, (x) value.getCancellationInfo());
        writer.w("priceForMobile");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPriceForMobile());
        writer.w("priceDescription");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPriceDescription());
        writer.w("guests");
        this.listOfGuestDTOAdapter.mo44toJson(writer, (x) value.getGuests());
        writer.p();
    }
}
