package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data;

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
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.TravelOrderListMobileDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO_OrderItemDTO_SectionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$StatusDTO;", "statusDTOAdapter", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO$OrderItemDTO$SectionDTO$TravelBadgeDTO;", "nullableListOfTravelBadgeDTOAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "", "nullableIntAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListMobileDTO_OrderItemDTO_SectionDTOJsonAdapter extends JsonAdapter<TravelOrderListMobileDTO.OrderItemDTO.SectionDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.TravelBadgeDTO>> nullableListOfTravelBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.StatusDTO> statusDTOAdapter;

    public TravelOrderListMobileDTO_OrderItemDTO_SectionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "status", "content", "travelBadgesList", "debtAlert", "stars");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.statusDTOAdapter = moshi.f(TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.StatusDTO.class, m11, "status");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "content");
        this.nullableListOfTravelBadgeDTOAdapter = moshi.f(D.e(List.class, TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.TravelBadgeDTO.class), m11, "travelBadgesList");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "debtAlert");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "stars");
    }

    @NotNull
    public String toString() {
        return b.c(70, "GeneratedJsonAdapter(TravelOrderListMobileDTO.OrderItemDTO.SectionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelOrderListMobileDTO.OrderItemDTO.SectionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.StatusDTO statusDTO = null;
        List<AtomDTO> list = null;
        List<TravelOrderListMobileDTO.OrderItemDTO.SectionDTO.TravelBadgeDTO> list2 = null;
        DisclaimerAtom disclaimerAtom = null;
        Integer num = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    statusDTO = this.statusDTOAdapter.fromJson(reader);
                    if (statusDTO == null) {
                        throw c.q("status", "status", reader);
                    }
                    break;
                case 2:
                    list = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list2 = this.nullableListOfTravelBadgeDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (statusDTO != null) {
            return new TravelOrderListMobileDTO.OrderItemDTO.SectionDTO(str, statusDTO, list, list2, disclaimerAtom, num);
        }
        throw c.j("status", "status", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelOrderListMobileDTO.OrderItemDTO.SectionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("status");
        this.statusDTOAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("content");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getContent());
        writer.w("travelBadgesList");
        this.nullableListOfTravelBadgeDTOAdapter.mo44toJson(writer, (x) value.getTravelBadgesList());
        writer.w("debtAlert");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getDebtAlert());
        writer.w("stars");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getStars());
        writer.p();
    }
}
