package ru.ozon.app.android.storefront.data.tiles.tilescroll;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.tilescroll.TileScrollDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "nullableHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options;", "nullableOptionsAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;", "nullableBannerAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;", "nullableAllProductsButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;", "nullableSharedDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileScrollDTOJsonAdapter extends JsonAdapter<TileScrollDTO> {
    private volatile Constructor<TileScrollDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<SmallTileMoleculeDTO>> listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<TileScrollDTO.AllProductsButton> nullableAllProductsButtonAdapter;

    @NotNull
    private final JsonAdapter<TileScrollDTO.Banner> nullableBannerAdapter;

    @NotNull
    private final JsonAdapter<HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TileScrollDTO.Options> nullableOptionsAdapter;

    @NotNull
    private final JsonAdapter<TileScrollDTO.SharedData> nullableSharedDataAdapter;

    @NotNull
    private final n.a options;

    public TileScrollDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "items", "options", "banner", "allProductsButton", "trackingInfo", "sharedData");
        M m11 = M.f71699a;
        this.nullableHeaderDTOAdapter = moshi.f(HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, SmallTileMoleculeDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.storefront.data.tiles.tilescroll.TileScrollDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonCollectionDecoding.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonCollectionDecoding;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding()";
            }
        }), "items");
        this.nullableOptionsAdapter = moshi.f(TileScrollDTO.Options.class, m11, "options");
        this.nullableBannerAdapter = moshi.f(TileScrollDTO.Banner.class, m11, "banner");
        this.nullableAllProductsButtonAdapter = moshi.f(TileScrollDTO.AllProductsButton.class, m11, "allProductsButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableSharedDataAdapter = moshi.f(TileScrollDTO.SharedData.class, m11, "sharedData");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(TileScrollDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileScrollDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        HeaderDTO headerDTO = null;
        List<SmallTileMoleculeDTO> list = null;
        TileScrollDTO.Options options = null;
        TileScrollDTO.Banner banner = null;
        TileScrollDTO.AllProductsButton allProductsButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TileScrollDTO.SharedData sharedData = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("items", "items", reader);
                    }
                    break;
                case 2:
                    options = this.nullableOptionsAdapter.fromJson(reader);
                    break;
                case 3:
                    banner = this.nullableBannerAdapter.fromJson(reader);
                    break;
                case 4:
                    allProductsButton = this.nullableAllProductsButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 = -33;
                    break;
                case 6:
                    sharedData = this.nullableSharedDataAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            TileScrollDTO.SharedData sharedData2 = sharedData;
            Map<String, TokenizedTrackingInfo> map2 = map;
            TileScrollDTO.AllProductsButton allProductsButton2 = allProductsButton;
            TileScrollDTO.Banner banner2 = banner;
            TileScrollDTO.Options options2 = options;
            List<SmallTileMoleculeDTO> list2 = list;
            HeaderDTO headerDTO2 = headerDTO;
            if (list2 != null) {
                return new TileScrollDTO(headerDTO2, list2, options2, banner2, allProductsButton2, map2, sharedData2);
            }
            throw c.j("items", "items", reader);
        }
        TileScrollDTO.SharedData sharedData3 = sharedData;
        Map<String, TokenizedTrackingInfo> map3 = map;
        TileScrollDTO.AllProductsButton allProductsButton3 = allProductsButton;
        TileScrollDTO.Banner banner3 = banner;
        TileScrollDTO.Options options3 = options;
        List<SmallTileMoleculeDTO> list3 = list;
        HeaderDTO headerDTO3 = headerDTO;
        Constructor<TileScrollDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileScrollDTO.class.getDeclaredConstructor(HeaderDTO.class, List.class, TileScrollDTO.Options.class, TileScrollDTO.Banner.class, TileScrollDTO.AllProductsButton.class, Map.class, TileScrollDTO.SharedData.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list3 == null) {
            throw c.j("items", "items", reader);
        }
        TileScrollDTO newInstance = constructor.newInstance(headerDTO3, list3, options3, banner3, allProductsButton3, map3, sharedData3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileScrollDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("items");
        this.listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("options");
        this.nullableOptionsAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("banner");
        this.nullableBannerAdapter.mo44toJson(writer, (x) value.getBanner());
        writer.w("allProductsButton");
        this.nullableAllProductsButtonAdapter.mo44toJson(writer, (x) value.getAllProductsButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("sharedData");
        this.nullableSharedDataAdapter.mo44toJson(writer, (x) value.getSharedData());
        writer.p();
    }
}
