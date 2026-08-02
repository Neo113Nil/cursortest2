package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.dto;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.dto.TileGrid3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "nullableHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;", "nullableOptionsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;", "nullableSharedDataAdapter", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid3DTOJsonAdapter extends JsonAdapter<TileGrid3DTO> {

    @NotNull
    private final JsonAdapter<List<SmallTileMoleculeDTO>> listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TileGrid3DTO.Options> nullableOptionsAdapter;

    @NotNull
    private final JsonAdapter<TileGrid3DTO.SharedData> nullableSharedDataAdapter;

    @NotNull
    private final n.a options;

    public TileGrid3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "items", "options", "trackingInfo", "sharedData");
        M m11 = M.f71699a;
        this.nullableHeaderDTOAdapter = moshi.f(HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, SmallTileMoleculeDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.dto.TileGrid3DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        this.nullableOptionsAdapter = moshi.f(TileGrid3DTO.Options.class, m11, "options");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableSharedDataAdapter = moshi.f(TileGrid3DTO.SharedData.class, m11, "sharedData");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(TileGrid3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileGrid3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HeaderDTO headerDTO = null;
        List<SmallTileMoleculeDTO> list = null;
        TileGrid3DTO.Options options = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TileGrid3DTO.SharedData sharedData = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfSmallTileMoleculeDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("items", "items", reader);
                }
            } else if (v11 == 2) {
                options = this.nullableOptionsAdapter.fromJson(reader);
            } else if (v11 == 3) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 4) {
                sharedData = this.nullableSharedDataAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new TileGrid3DTO(headerDTO, list, options, map, sharedData);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileGrid3DTO value) {
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
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("sharedData");
        this.nullableSharedDataAdapter.mo44toJson(writer, (x) value.getSharedData());
        writer.p();
    }
}
