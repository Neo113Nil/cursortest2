package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import Ak.b;
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
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO_SharedDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "nullableOverlayItemAdapter", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "nullableMapOfStringBlurMoleculeContentDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2DTO_SharedDataJsonAdapter extends JsonAdapter<TileGrid2DTO.SharedData> {

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, BlurMoleculeContentDTO>> nullableMapOfStringBlurMoleculeContentDTOAdapter;

    @NotNull
    private final JsonAdapter<TileGrid2DTO.OverlayItem> nullableOverlayItemAdapter;

    @NotNull
    private final n.a options;

    public TileGrid2DTO_SharedDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("kebabIcon", "overlayItem", "blurItemInfo", "bannerBadge");
        M m11 = M.f71699a;
        this.nullableCommonAtomIconDTOAdapter = moshi.f(CommonAtomIconDTO.class, m11, "kebabIcon");
        this.nullableOverlayItemAdapter = moshi.f(TileGrid2DTO.OverlayItem.class, m11, "overlayItem");
        this.nullableMapOfStringBlurMoleculeContentDTOAdapter = moshi.f(D.e(Map.class, String.class, BlurMoleculeContentDTO.class), m11, "blurItemInfo");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "bannerBadge");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(TileGrid2DTO.SharedData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileGrid2DTO.SharedData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CommonAtomIconDTO commonAtomIconDTO = null;
        TileGrid2DTO.OverlayItem overlayItem = null;
        Map<String, BlurMoleculeContentDTO> map = null;
        BadgeDTO badgeDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                overlayItem = this.nullableOverlayItemAdapter.fromJson(reader);
            } else if (v11 == 2) {
                map = this.nullableMapOfStringBlurMoleculeContentDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new TileGrid2DTO.SharedData(commonAtomIconDTO, overlayItem, map, badgeDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileGrid2DTO.SharedData value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("kebabIcon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value.getKebabIcon());
        writer.w("overlayItem");
        this.nullableOverlayItemAdapter.mo44toJson(writer, (x) value.getOverlayItem());
        writer.w("blurItemInfo");
        this.nullableMapOfStringBlurMoleculeContentDTOAdapter.mo44toJson(writer, (x) value.getBlurItemInfo());
        writer.w("bannerBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBannerBadge());
        writer.p();
    }
}
