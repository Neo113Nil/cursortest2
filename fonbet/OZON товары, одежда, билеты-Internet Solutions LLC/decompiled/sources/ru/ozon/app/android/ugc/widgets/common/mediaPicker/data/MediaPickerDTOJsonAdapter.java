package ru.ozon.app.android.ugc.widgets.common.mediaPicker.data;

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
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR(\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020+\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001a¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO;", "nullableListOfMediaDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;", "itemDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "", "intAdapter", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "photoConfigAdapter", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "nullableVideoConfigAdapter", "nullableStringAdapter", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO;", "nullablePickerItemBadgeDTOAdapter", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;", "nullableOnBoardingConfigDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableBooleanAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerDTOJsonAdapter extends JsonAdapter<MediaPickerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<MediaPickerDTO.ItemDTO> itemDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<MediaPickerDTO.MediaDTO>> nullableListOfMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<MediaPickerDTO.OnBoardingConfigDTO> nullableOnBoardingConfigDTOAdapter;

    @NotNull
    private final JsonAdapter<MediaPickerDTO.PickerItemBadgeDTO> nullablePickerItemBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<MediaPickerDTO.VideoConfig> nullableVideoConfigAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<MediaPickerDTO.PhotoConfig> photoConfigAdapter;

    public MediaPickerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("medias", "pickerItem", "emptyItem", "removeIcon", "playIcon", "maxItemsCount", "photoConfig", "videoConfig", "borderColor", "pickerItemBadge", "onBoardingConfig", "uploadTrackingInfo", "uploadErrorTrackingInfo", "isHidden");
        b e11 = D.e(List.class, MediaPickerDTO.MediaDTO.class);
        M m11 = M.f71699a;
        this.nullableListOfMediaDTOAdapter = moshi.f(e11, m11, "medias");
        this.itemDTOAdapter = moshi.f(MediaPickerDTO.ItemDTO.class, m11, "pickerItem");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "removeIcon");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxItemsCount");
        this.photoConfigAdapter = moshi.f(MediaPickerDTO.PhotoConfig.class, m11, "photoConfig");
        this.nullableVideoConfigAdapter = moshi.f(MediaPickerDTO.VideoConfig.class, m11, "videoConfig");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullablePickerItemBadgeDTOAdapter = moshi.f(MediaPickerDTO.PickerItemBadgeDTO.class, m11, "pickerItemBadge");
        this.nullableOnBoardingConfigDTOAdapter = moshi.f(MediaPickerDTO.OnBoardingConfigDTO.class, m11, "onBoardingConfig");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "uploadTrackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isHidden");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(MediaPickerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MediaPickerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        List<MediaPickerDTO.MediaDTO> list = null;
        MediaPickerDTO.ItemDTO itemDTO = null;
        MediaPickerDTO.ItemDTO itemDTO2 = null;
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        MediaPickerDTO.PhotoConfig photoConfig = null;
        MediaPickerDTO.VideoConfig videoConfig = null;
        String str = null;
        MediaPickerDTO.PickerItemBadgeDTO pickerItemBadgeDTO = null;
        MediaPickerDTO.OnBoardingConfigDTO onBoardingConfigDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Boolean bool = null;
        while (true) {
            Integer num2 = num;
            List<MediaPickerDTO.MediaDTO> list2 = list;
            MediaPickerDTO.ItemDTO itemDTO3 = itemDTO;
            MediaPickerDTO.ItemDTO itemDTO4 = itemDTO2;
            if (!reader.hasNext()) {
                IconDTO iconDTO3 = iconDTO;
                reader.endObject();
                if (itemDTO3 == null) {
                    throw c.j("pickerItem", "pickerItem", reader);
                }
                if (itemDTO4 == null) {
                    throw c.j("emptyItem", "emptyItem", reader);
                }
                if (iconDTO3 == null) {
                    throw c.j("removeIcon", "removeIcon", reader);
                }
                if (iconDTO2 == null) {
                    throw c.j("playIcon", "playIcon", reader);
                }
                if (num2 == null) {
                    throw c.j("maxItemsCount", "maxItemsCount", reader);
                }
                int intValue = num2.intValue();
                if (photoConfig != null) {
                    return new MediaPickerDTO(list2, itemDTO3, itemDTO4, iconDTO3, iconDTO2, intValue, photoConfig, videoConfig, str, pickerItemBadgeDTO, onBoardingConfigDTO, map, map2, bool);
                }
                throw c.j("photoConfig", "photoConfig", reader);
            }
            IconDTO iconDTO4 = iconDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 0:
                    list = this.nullableListOfMediaDTOAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 1:
                    itemDTO = this.itemDTOAdapter.fromJson(reader);
                    if (itemDTO == null) {
                        throw c.q("pickerItem", "pickerItem", reader);
                    }
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO2 = itemDTO4;
                case 2:
                    itemDTO2 = this.itemDTOAdapter.fromJson(reader);
                    if (itemDTO2 == null) {
                        throw c.q("emptyItem", "emptyItem", reader);
                    }
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                case 3:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("removeIcon", "removeIcon", reader);
                    }
                    num = num2;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 4:
                    iconDTO2 = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO2 == null) {
                        throw c.q("playIcon", "playIcon", reader);
                    }
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 5:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxItemsCount", "maxItemsCount", reader);
                    }
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 6:
                    photoConfig = this.photoConfigAdapter.fromJson(reader);
                    if (photoConfig == null) {
                        throw c.q("photoConfig", "photoConfig", reader);
                    }
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 7:
                    videoConfig = this.nullableVideoConfigAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 9:
                    pickerItemBadgeDTO = this.nullablePickerItemBadgeDTOAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 10:
                    onBoardingConfigDTO = this.nullableOnBoardingConfigDTOAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 12:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                case 13:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
                default:
                    num = num2;
                    iconDTO = iconDTO4;
                    list = list2;
                    itemDTO = itemDTO3;
                    itemDTO2 = itemDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MediaPickerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("medias");
        this.nullableListOfMediaDTOAdapter.mo44toJson(writer, (x) value.getMedias());
        writer.w("pickerItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getPickerItem());
        writer.w("emptyItem");
        this.itemDTOAdapter.mo44toJson(writer, (x) value.getEmptyItem());
        writer.w("removeIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getRemoveIcon());
        writer.w("playIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getPlayIcon());
        writer.w("maxItemsCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxItemsCount()));
        writer.w("photoConfig");
        this.photoConfigAdapter.mo44toJson(writer, (x) value.getPhotoConfig());
        writer.w("videoConfig");
        this.nullableVideoConfigAdapter.mo44toJson(writer, (x) value.getVideoConfig());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("pickerItemBadge");
        this.nullablePickerItemBadgeDTOAdapter.mo44toJson(writer, (x) value.getPickerItemBadge());
        writer.w("onBoardingConfig");
        this.nullableOnBoardingConfigDTOAdapter.mo44toJson(writer, (x) value.getOnBoardingConfig());
        writer.w("uploadTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getUploadTrackingInfo());
        writer.w("uploadErrorTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getUploadErrorTrackingInfo());
        writer.w("isHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isHidden());
        writer.p();
    }
}
