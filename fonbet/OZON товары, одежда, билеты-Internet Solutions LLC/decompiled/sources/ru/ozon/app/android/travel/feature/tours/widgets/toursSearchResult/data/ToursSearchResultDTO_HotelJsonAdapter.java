package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data;

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
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO_HotelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$TourOption;", "nullableListOfTourOptionAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultDTO_HotelJsonAdapter extends JsonAdapter<ToursSearchResultDTO.Hotel> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<List<ToursSearchResultDTO.TourOption>> nullableListOfTourOptionAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ToursSearchResultDTO_HotelJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("images", "badges", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "hotelFeatures", "tourOptions", "price", "dates", "selectAction", "trackingInfo", "galleryTrackingInfo");
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        this.listOfStringAdapter = moshi.f(e11, m11, "images");
        this.nullableListOfBadgeAdapter = moshi.f(D.e(List.class, Badge.class), m11, "badges");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "description");
        this.nullableListOfTourOptionAdapter = moshi.f(D.e(List.class, ToursSearchResultDTO.TourOption.class), m11, "tourOptions");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "selectAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(48, "GeneratedJsonAdapter(ToursSearchResultDTO.Hotel)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ToursSearchResultDTO.Hotel fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<String> list = null;
        List<Badge> list2 = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        List<Badge> list3 = null;
        List<ToursSearchResultDTO.TourOption> list4 = null;
        TextAtom textAtom3 = null;
        TextAtom textAtom4 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        while (true) {
            List<String> list5 = list;
            List<Badge> list6 = list2;
            if (!reader.hasNext()) {
                TextAtom textAtom5 = textAtom;
                reader.endObject();
                if (list5 == null) {
                    throw c.j("images", "images", reader);
                }
                if (textAtom5 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textAtom3 == null) {
                    throw c.j("price", "price", reader);
                }
                if (textAtom4 == null) {
                    throw c.j("dates", "dates", reader);
                }
                if (atomActionDTO != null) {
                    return new ToursSearchResultDTO.Hotel(list5, list6, textAtom5, textAtom2, list3, list4, textAtom3, textAtom4, atomActionDTO, map, map2);
                }
                throw c.j("selectAction", "selectAction", reader);
            }
            TextAtom textAtom6 = textAtom;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 0:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("images", "images", reader);
                    }
                    textAtom = textAtom6;
                    list2 = list6;
                case 1:
                    list2 = this.nullableListOfBadgeAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    list = list5;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    list = list5;
                    list2 = list6;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 4:
                    list3 = this.nullableListOfBadgeAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 5:
                    list4 = this.nullableListOfTourOptionAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 6:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("price", "price", reader);
                    }
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 7:
                    textAtom4 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom4 == null) {
                        throw c.q("dates", "dates", reader);
                    }
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 8:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("selectAction", "selectAction", reader);
                    }
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                case 10:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
                default:
                    textAtom = textAtom6;
                    list = list5;
                    list2 = list6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ToursSearchResultDTO.Hotel value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("images");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("description");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("hotelFeatures");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getHotelFeatures());
        writer.w("tourOptions");
        this.nullableListOfTourOptionAdapter.mo44toJson(writer, (x) value.getTourOptions());
        writer.w("price");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("dates");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getDates());
        writer.w("selectAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getSelectAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("galleryTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getGalleryTrackingInfo());
        writer.p();
    }
}
