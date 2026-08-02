package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data;

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
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseBannerDTO;", "nullableWiseBannerDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "nullableListOfFreshTileDTOAdapter", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;", "nullableListOfWiseOldTileDTOAdapter", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;", "nullableBeakDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;", "paddingsDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$SizeConfigurationDTO;", "sizeConfigurationDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseSkuScrollDTOJsonAdapter extends JsonAdapter<WiseSkuScrollDTO> {
    private volatile Constructor<WiseSkuScrollDTO> constructorRef;

    @NotNull
    private final JsonAdapter<WiseSkuScrollDTO.BeakDTO> nullableBeakDTOAdapter;

    @NotNull
    private final JsonAdapter<List<FreshTileDTO>> nullableListOfFreshTileDTOAdapter;

    @NotNull
    private final JsonAdapter<List<WiseOldTileDTO>> nullableListOfWiseOldTileDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<WiseBannerDTO> nullableWiseBannerDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<WiseSkuScrollDTO.PaddingsDTO> paddingsDTOAdapter;

    @NotNull
    private final JsonAdapter<WiseSkuScrollDTO.SizeConfigurationDTO> sizeConfigurationDTOAdapter;

    public WiseSkuScrollDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("banner", "tiles", "products", "beak", "backgroundColor", "paddings", "trackingInfo", "sizeConfiguration");
        M m11 = M.f71699a;
        this.nullableWiseBannerDTOAdapter = moshi.f(WiseBannerDTO.class, m11, "banner");
        this.nullableListOfFreshTileDTOAdapter = moshi.f(D.e(List.class, FreshTileDTO.class), m11, "tiles");
        this.nullableListOfWiseOldTileDTOAdapter = moshi.f(D.e(List.class, WiseOldTileDTO.class), m11, "products");
        this.nullableBeakDTOAdapter = moshi.f(WiseSkuScrollDTO.BeakDTO.class, m11, "beak");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.paddingsDTOAdapter = moshi.f(WiseSkuScrollDTO.PaddingsDTO.class, m11, "paddings");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.sizeConfigurationDTOAdapter = moshi.f(WiseSkuScrollDTO.SizeConfigurationDTO.class, m11, "sizeConfiguration");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(WiseSkuScrollDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WiseSkuScrollDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        WiseBannerDTO wiseBannerDTO = null;
        List<FreshTileDTO> list = null;
        List<WiseOldTileDTO> list2 = null;
        WiseSkuScrollDTO.BeakDTO beakDTO = null;
        String str = null;
        WiseSkuScrollDTO.PaddingsDTO paddingsDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        WiseSkuScrollDTO.SizeConfigurationDTO sizeConfigurationDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    wiseBannerDTO = this.nullableWiseBannerDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.nullableListOfFreshTileDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list2 = this.nullableListOfWiseOldTileDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    beakDTO = this.nullableBeakDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    paddingsDTO = this.paddingsDTOAdapter.fromJson(reader);
                    if (paddingsDTO == null) {
                        throw c.q("paddings", "paddings", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    sizeConfigurationDTO = this.sizeConfigurationDTOAdapter.fromJson(reader);
                    if (sizeConfigurationDTO == null) {
                        throw c.q("sizeConfiguration", "sizeConfiguration", reader);
                    }
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -161) {
            String str2 = str;
            WiseSkuScrollDTO.BeakDTO beakDTO2 = beakDTO;
            List<WiseOldTileDTO> list3 = list2;
            List<FreshTileDTO> list4 = list;
            Intrinsics.g(paddingsDTO, "null cannot be cast to non-null type ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO.PaddingsDTO");
            Intrinsics.g(sizeConfigurationDTO, "null cannot be cast to non-null type ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO.SizeConfigurationDTO");
            return new WiseSkuScrollDTO(wiseBannerDTO, list4, list3, beakDTO2, str2, paddingsDTO, map, sizeConfigurationDTO);
        }
        String str3 = str;
        WiseSkuScrollDTO.BeakDTO beakDTO3 = beakDTO;
        List<WiseOldTileDTO> list5 = list2;
        List<FreshTileDTO> list6 = list;
        WiseBannerDTO wiseBannerDTO2 = wiseBannerDTO;
        Constructor<WiseSkuScrollDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WiseSkuScrollDTO.class.getDeclaredConstructor(WiseBannerDTO.class, List.class, List.class, WiseSkuScrollDTO.BeakDTO.class, String.class, WiseSkuScrollDTO.PaddingsDTO.class, Map.class, WiseSkuScrollDTO.SizeConfigurationDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        WiseSkuScrollDTO newInstance = constructor.newInstance(wiseBannerDTO2, list6, list5, beakDTO3, str3, paddingsDTO, map, sizeConfigurationDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WiseSkuScrollDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("banner");
        this.nullableWiseBannerDTOAdapter.mo44toJson(writer, (x) value.getBanner());
        writer.w("tiles");
        this.nullableListOfFreshTileDTOAdapter.mo44toJson(writer, (x) value.getTiles());
        writer.w("products");
        this.nullableListOfWiseOldTileDTOAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("beak");
        this.nullableBeakDTOAdapter.mo44toJson(writer, (x) value.getBeak());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("paddings");
        this.paddingsDTOAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("sizeConfiguration");
        this.sizeConfigurationDTOAdapter.mo44toJson(writer, (x) value.getSizeConfiguration());
        writer.p();
    }
}
