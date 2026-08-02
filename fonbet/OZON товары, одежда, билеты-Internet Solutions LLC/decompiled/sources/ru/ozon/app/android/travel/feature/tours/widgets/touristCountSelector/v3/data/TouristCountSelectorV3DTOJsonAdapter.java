package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$QuantityCellDTO;", "listOfQuantityCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;", "childFormDTOAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$RoomDTO;", "listOfRoomDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "listOfAlertDTOAdapter", "", "intAdapter", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3DTOJsonAdapter extends JsonAdapter<TouristCountSelectorV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<TouristCountSelectorV3DTO.ChildFormDTO> childFormDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<TouristCountSelectorV3DTO.AlertDTO>> listOfAlertDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TouristCountSelectorV3DTO.QuantityCellDTO>> listOfQuantityCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TouristCountSelectorV3DTO.RoomDTO>> listOfRoomDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final n.a options;

    public TouristCountSelectorV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("roomCells", "childForm", "rooms", "deleteRoomButton", "addRoomButton", "applyButton", "decreaseButton", "increaseButton", "alerts", "roomsMaxCount");
        b e11 = D.e(List.class, TouristCountSelectorV3DTO.QuantityCellDTO.class);
        M m11 = M.f71699a;
        this.listOfQuantityCellDTOAdapter = moshi.f(e11, m11, "roomCells");
        this.childFormDTOAdapter = moshi.f(TouristCountSelectorV3DTO.ChildFormDTO.class, m11, "childForm");
        this.listOfRoomDTOAdapter = moshi.f(D.e(List.class, TouristCountSelectorV3DTO.RoomDTO.class), m11, "rooms");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "deleteRoomButton");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "applyButton");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "decreaseButton");
        this.listOfAlertDTOAdapter = moshi.f(D.e(List.class, TouristCountSelectorV3DTO.AlertDTO.class), m11, "alerts");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "roomsMaxCount");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(47, "GeneratedJsonAdapter(TouristCountSelectorV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TouristCountSelectorV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        List<TouristCountSelectorV3DTO.QuantityCellDTO> list = null;
        TouristCountSelectorV3DTO.ChildFormDTO childFormDTO = null;
        List<TouristCountSelectorV3DTO.RoomDTO> list2 = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        ButtonV3DTO buttonV3DTO3 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        List<TouristCountSelectorV3DTO.AlertDTO> list3 = null;
        while (true) {
            Integer num2 = num;
            List<TouristCountSelectorV3DTO.QuantityCellDTO> list4 = list;
            TouristCountSelectorV3DTO.ChildFormDTO childFormDTO2 = childFormDTO;
            List<TouristCountSelectorV3DTO.RoomDTO> list5 = list2;
            if (!reader.hasNext()) {
                ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
                reader.endObject();
                if (list4 == null) {
                    throw c.j("roomCells", "roomCells", reader);
                }
                if (childFormDTO2 == null) {
                    throw c.j("childForm", "childForm", reader);
                }
                if (list5 == null) {
                    throw c.j("rooms", "rooms", reader);
                }
                if (buttonV3DTO3 == null) {
                    throw c.j("applyButton", "applyButton", reader);
                }
                if (iconButtonV3DTO == null) {
                    throw c.j("decreaseButton", "decreaseButton", reader);
                }
                if (iconButtonV3DTO2 == null) {
                    throw c.j("increaseButton", "increaseButton", reader);
                }
                if (list3 == null) {
                    throw c.j("alerts", "alerts", reader);
                }
                if (num2 != null) {
                    return new TouristCountSelectorV3DTO(list4, childFormDTO2, list5, buttonV3DTO4, buttonV3DTO2, buttonV3DTO3, iconButtonV3DTO, iconButtonV3DTO2, list3, num2.intValue());
                }
                throw c.j("roomsMaxCount", "roomsMaxCount", reader);
            }
            ButtonV3DTO buttonV3DTO5 = buttonV3DTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 0:
                    list = this.listOfQuantityCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("roomCells", "roomCells", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 1:
                    childFormDTO = this.childFormDTOAdapter.fromJson(reader);
                    if (childFormDTO == null) {
                        throw c.q("childForm", "childForm", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    list2 = list5;
                case 2:
                    list2 = this.listOfRoomDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("rooms", "rooms", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                case 3:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    num = num2;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 4:
                    buttonV3DTO2 = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 5:
                    buttonV3DTO3 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO3 == null) {
                        throw c.q("applyButton", "applyButton", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 6:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("decreaseButton", "decreaseButton", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 7:
                    iconButtonV3DTO2 = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO2 == null) {
                        throw c.q("increaseButton", "increaseButton", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 8:
                    list3 = this.listOfAlertDTOAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("alerts", "alerts", reader);
                    }
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                case 9:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("roomsMaxCount", "roomsMaxCount", reader);
                    }
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
                default:
                    num = num2;
                    buttonV3DTO = buttonV3DTO5;
                    list = list4;
                    childFormDTO = childFormDTO2;
                    list2 = list5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TouristCountSelectorV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("roomCells");
        this.listOfQuantityCellDTOAdapter.mo44toJson(writer, (x) value.getRoomCells());
        writer.w("childForm");
        this.childFormDTOAdapter.mo44toJson(writer, (x) value.getChildForm());
        writer.w("rooms");
        this.listOfRoomDTOAdapter.mo44toJson(writer, (x) value.getRooms());
        writer.w("deleteRoomButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDeleteRoomButton());
        writer.w("addRoomButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAddRoomButton());
        writer.w("applyButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getApplyButton());
        writer.w("decreaseButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDecreaseButton());
        writer.w("increaseButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getIncreaseButton());
        writer.w("alerts");
        this.listOfAlertDTOAdapter.mo44toJson(writer, (x) value.getAlerts());
        writer.w("roomsMaxCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getRoomsMaxCount()));
        writer.p();
    }
}
