package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data;

import Ak.b;
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
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$ItemDTO;", "itemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoItemDTO;", "nullableListOfPhotoItemDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "", "intAdapter", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoConfig;", "photoConfigAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddDTOJsonAdapter extends JsonAdapter<ParcelPhotoAddDTO> {

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ParcelPhotoAddDTO.ItemDTO> itemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ParcelPhotoAddDTO.PhotoItemDTO>> nullableListOfPhotoItemDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ParcelPhotoAddDTO.PhotoConfig> photoConfigAdapter;

    public ParcelPhotoAddDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("pickerItem", "emptyItem", "photos", "removeIcon", "maxItemsCount", "photoConfig", "borderColor", "deliveryNumber", "postingNumber", "trackingInfo", "uploadTrackingInfo", "uploadErrorTrackingInfo", "deleteTrackingInfo", "deleteErrorTrackingInfo");
        M m11 = M.f71699a;
        this.itemDTOAdapter = moshi.f(ParcelPhotoAddDTO.ItemDTO.class, m11, "pickerItem");
        this.nullableListOfPhotoItemDTOAdapter = moshi.f(D.e(List.class, ParcelPhotoAddDTO.PhotoItemDTO.class), m11, "photos");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "removeIcon");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxItemsCount");
        this.photoConfigAdapter = moshi.f(ParcelPhotoAddDTO.PhotoConfig.class, m11, "photoConfig");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(ParcelPhotoAddDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ParcelPhotoAddDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        ParcelPhotoAddDTO.ItemDTO itemDTO = null;
        ParcelPhotoAddDTO.ItemDTO itemDTO2 = null;
        List<ParcelPhotoAddDTO.PhotoItemDTO> list = null;
        IconDTO iconDTO = null;
        ParcelPhotoAddDTO.PhotoConfig photoConfig = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        Map<String, TokenizedTrackingInfo> map5 = null;
        while (true) {
            Integer num2 = num;
            ParcelPhotoAddDTO.ItemDTO itemDTO3 = itemDTO;
            ParcelPhotoAddDTO.ItemDTO itemDTO4 = itemDTO2;
            if (!reader.hasNext()) {
                List<ParcelPhotoAddDTO.PhotoItemDTO> list2 = list;
                reader.endObject();
                if (itemDTO3 == null) {
                    throw c.j("pickerItem", "pickerItem", reader);
                }
                if (itemDTO4 == null) {
                    throw c.j("emptyItem", "emptyItem", reader);
                }
                if (iconDTO == null) {
                    throw c.j("removeIcon", "removeIcon", reader);
                }
                if (num2 == null) {
                    throw c.j("maxItemsCount", "maxItemsCount", reader);
                }
                int intValue = num2.intValue();
                if (photoConfig != null) {
                    return new ParcelPhotoAddDTO(itemDTO3, itemDTO4, list2, iconDTO, intValue, photoConfig, str, str2, str3, map, map2, map3, map4, map5);
                }
                throw c.j("photoConfig", "photoConfig", reader);
            }
            List<ParcelPhotoAddDTO.PhotoItemDTO> list3 = list;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 0:
                    itemDTO = this.itemDTOAdapter.fromJson(reader);
                    if (itemDTO == null) {
                        throw c.q("pickerItem", "pickerItem", reader);
                    }
                    num = num2;
                    list = list3;
                    itemDTO2 = itemDTO4;
                case 1:
                    itemDTO2 = this.itemDTOAdapter.fromJson(reader);
                    if (itemDTO2 == null) {
                        throw c.q("emptyItem", "emptyItem", reader);
                    }
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                case 2:
                    list = this.nullableListOfPhotoItemDTOAdapter.fromJson(reader);
                    num = num2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 3:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("removeIcon", "removeIcon", reader);
                    }
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxItemsCount", "maxItemsCount", reader);
                    }
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 5:
                    photoConfig = this.photoConfigAdapter.fromJson(reader);
                    if (photoConfig == null) {
                        throw c.q("photoConfig", "photoConfig", reader);
                    }
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 10:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 11:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 12:
                    map4 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 13:
                    map5 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                default:
                    num = num2;
                    list = list3;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ParcelPhotoAddDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("pickerItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getPickerItem());
        writer.w("emptyItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getEmptyItem());
        writer.w("photos");
        this.nullableListOfPhotoItemDTOAdapter.mo44toJson(writer, (x) value.getPhotos());
        writer.w("removeIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getRemoveIcon());
        writer.w("maxItemsCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxItemsCount()));
        writer.w("photoConfig");
        this.photoConfigAdapter.mo44toJson(writer, (x) value.getPhotoConfig());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("deliveryNumber");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDeliveryNumber());
        writer.w("postingNumber");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPostingNumber());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("uploadTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getUploadTrackingInfo());
        writer.w("uploadErrorTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getUploadErrorTrackingInfo());
        writer.w("deleteTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDeleteTrackingInfo());
        writer.w("deleteErrorTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDeleteErrorTrackingInfo());
        writer.p();
    }
}
