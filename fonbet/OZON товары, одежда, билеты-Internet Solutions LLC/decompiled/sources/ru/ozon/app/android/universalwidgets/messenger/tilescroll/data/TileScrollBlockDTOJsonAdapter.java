package ru.ozon.app.android.universalwidgets.messenger.tilescroll.data;

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
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.data.TileScrollBlockDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "nullableHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Tile;", "listOfTileAdapter", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;", "nullableOptionsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$SharedData;", "nullableSharedDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBlockDTOJsonAdapter extends JsonAdapter<TileScrollBlockDTO> {
    private volatile Constructor<TileScrollBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TileScrollBlockDTO.Tile>> listOfTileAdapter;

    @NotNull
    private final JsonAdapter<HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TileScrollBlockDTO.Options> nullableOptionsAdapter;

    @NotNull
    private final JsonAdapter<TileScrollBlockDTO.SharedData> nullableSharedDataAdapter;

    @NotNull
    private final n.a options;

    public TileScrollBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "items", "options", "trackingInfo", "sharedData");
        M m11 = M.f71699a;
        this.nullableHeaderDTOAdapter = moshi.f(HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfTileAdapter = moshi.f(D.e(List.class, TileScrollBlockDTO.Tile.class), m11, "items");
        this.nullableOptionsAdapter = moshi.f(TileScrollBlockDTO.Options.class, m11, "options");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableSharedDataAdapter = moshi.f(TileScrollBlockDTO.SharedData.class, m11, "sharedData");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(TileScrollBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileScrollBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HeaderDTO headerDTO = null;
        List<TileScrollBlockDTO.Tile> list = null;
        TileScrollBlockDTO.Options options = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TileScrollBlockDTO.SharedData sharedData = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfTileAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("items", "items", reader);
                }
            } else if (v11 == 2) {
                options = this.nullableOptionsAdapter.fromJson(reader);
            } else if (v11 == 3) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                i11 = -9;
            } else if (v11 == 4) {
                sharedData = this.nullableSharedDataAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -9) {
            TileScrollBlockDTO.SharedData sharedData2 = sharedData;
            Map<String, TokenizedTrackingInfo> map2 = map;
            TileScrollBlockDTO.Options options2 = options;
            List<TileScrollBlockDTO.Tile> list2 = list;
            HeaderDTO headerDTO2 = headerDTO;
            if (list2 != null) {
                return new TileScrollBlockDTO(headerDTO2, list2, options2, map2, sharedData2);
            }
            throw c.j("items", "items", reader);
        }
        TileScrollBlockDTO.SharedData sharedData3 = sharedData;
        Map<String, TokenizedTrackingInfo> map3 = map;
        TileScrollBlockDTO.Options options3 = options;
        List<TileScrollBlockDTO.Tile> list3 = list;
        HeaderDTO headerDTO3 = headerDTO;
        Constructor<TileScrollBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileScrollBlockDTO.class.getDeclaredConstructor(HeaderDTO.class, List.class, TileScrollBlockDTO.Options.class, Map.class, TileScrollBlockDTO.SharedData.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list3 == null) {
            throw c.j("items", "items", reader);
        }
        TileScrollBlockDTO newInstance = constructor.newInstance(headerDTO3, list3, options3, map3, sharedData3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileScrollBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("items");
        this.listOfTileAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("options");
        this.nullableOptionsAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("sharedData");
        this.nullableSharedDataAdapter.mo44toJson(writer, (x) value.getSharedData());
        writer.p();
    }
}
