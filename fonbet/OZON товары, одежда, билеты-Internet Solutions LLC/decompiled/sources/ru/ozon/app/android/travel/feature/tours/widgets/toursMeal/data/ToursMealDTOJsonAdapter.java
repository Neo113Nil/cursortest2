package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data;

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
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealDTO;
import ru.ozon.app.android.travel.molecules.dto.travelTab.v2.TravelTabDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/molecules/dto/travelTab/v2/TravelTabDTO;", "listOfTravelTabDTOAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO$CellsBlockDTO;", "listOfCellsBlockDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursMealDTOJsonAdapter extends JsonAdapter<ToursMealDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ToursMealDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<ToursMealDTO.CellsBlockDTO>> listOfCellsBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelTabDTO>> listOfTravelTabDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ToursMealDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "filterTabs", "blocks", "selectButton", "returnButton", "trackingInfo");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfTravelTabDTOAdapter = moshi.f(D.e(List.class, TravelTabDTO.class), m11, "filterTabs");
        this.listOfCellsBlockDTOAdapter = moshi.f(D.e(List.class, ToursMealDTO.CellsBlockDTO.class), m11, "blocks");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "selectButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(ToursMealDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ToursMealDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        List<TravelTabDTO> list = null;
        List<ToursMealDTO.CellsBlockDTO> list2 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.LargeButton largeButton2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
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
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 2:
                    list = this.listOfTravelTabDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("filterTabs", "filterTabs", reader);
                    }
                    i12 = -5;
                    break;
                case 3:
                    list2 = this.listOfCellsBlockDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("blocks", "blocks", reader);
                    }
                    break;
                case 4:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("selectButton", "selectButton", reader);
                    }
                    break;
                case 5:
                    largeButton2 = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton2 == null) {
                        throw c.q("returnButton", "returnButton", reader);
                    }
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i12 == -5) {
            TextAtom textAtom3 = textAtom2;
            TextAtom textAtom4 = textAtom;
            if (textAtom4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (textAtom3 == null) {
                throw c.j("subtitle", "subtitle", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.molecules.dto.travelTab.v2.TravelTabDTO>");
            if (list2 == null) {
                throw c.j("blocks", "blocks", reader);
            }
            if (largeButton == null) {
                throw c.j("selectButton", "selectButton", reader);
            }
            if (largeButton2 == null) {
                throw c.j("returnButton", "returnButton", reader);
            }
            Map<String, TokenizedTrackingInfo> map2 = map;
            ButtonV3Atom.LargeButton largeButton3 = largeButton2;
            return new ToursMealDTO(textAtom4, textAtom3, list, list2, largeButton, largeButton3, map2);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        ButtonV3Atom.LargeButton largeButton4 = largeButton2;
        ButtonV3Atom.LargeButton largeButton5 = largeButton;
        List<ToursMealDTO.CellsBlockDTO> list3 = list2;
        List<TravelTabDTO> list4 = list;
        TextAtom textAtom5 = textAtom2;
        TextAtom textAtom6 = textAtom;
        Constructor<ToursMealDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = ToursMealDTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, List.class, List.class, ButtonV3Atom.LargeButton.class, ButtonV3Atom.LargeButton.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<ToursMealDTO> constructor2 = constructor;
        if (textAtom6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textAtom5 == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        if (list3 == null) {
            throw c.j("blocks", "blocks", reader);
        }
        if (largeButton5 == null) {
            throw c.j("selectButton", "selectButton", reader);
        }
        if (largeButton4 == null) {
            throw c.j("returnButton", "returnButton", reader);
        }
        ToursMealDTO newInstance = constructor2.newInstance(textAtom6, textAtom5, list4, list3, largeButton5, largeButton4, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ToursMealDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("filterTabs");
        this.listOfTravelTabDTOAdapter.mo44toJson(writer, (x) value.getFilterTabs());
        writer.w("blocks");
        this.listOfCellsBlockDTOAdapter.mo44toJson(writer, (x) value.getBlocks());
        writer.w("selectButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSelectButton());
        writer.w("returnButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getReturnButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
