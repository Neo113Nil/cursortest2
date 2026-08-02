package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesCellDTOJsonAdapter extends JsonAdapter<AddToFavoritesCellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AddToFavoritesCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cell", "sku", "addLink", "deleteLink", "isFavorite", "modalAction", "trackingInfo", "addTrackingInfo", "deleteTrackingInfo");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.stringAdapter = moshi.f(String.class, m11, "sku");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFavorite");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "modalAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(AddToFavoritesCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddToFavoritesCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        CellDTO cellDTO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        CommonControlSettings commonControlSettings = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                reader.endObject();
                if (cellDTO == null) {
                    throw c.j("cell", "cell", reader);
                }
                if (str == null) {
                    throw c.j("sku", "sku", reader);
                }
                if (str2 == null) {
                    throw c.j("addLink", "addLink", reader);
                }
                if (str3 == null) {
                    throw c.j("deleteLink", "deleteLink", reader);
                }
                if (bool2 != null) {
                    return new AddToFavoritesCellDTO(cellDTO, str, str2, str3, bool2.booleanValue(), commonControlSettings, map, map2, map3);
                }
                throw c.j("isFavorite", "isFavorite", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("sku", "sku", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("addLink", "addLink", reader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("deleteLink", "deleteLink", reader);
                    }
                    break;
                case 4:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("isFavorite", "isFavorite", reader);
                    }
                    bool = fromJson;
                    continue;
                case 5:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddToFavoritesCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("sku");
        this.stringAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("addLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getAddLink());
        writer.w("deleteLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeleteLink());
        writer.w("isFavorite");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFavorite()));
        writer.w("modalAction");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getModalAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("addTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getAddTrackingInfo());
        writer.w("deleteTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDeleteTrackingInfo());
        writer.p();
    }
}
