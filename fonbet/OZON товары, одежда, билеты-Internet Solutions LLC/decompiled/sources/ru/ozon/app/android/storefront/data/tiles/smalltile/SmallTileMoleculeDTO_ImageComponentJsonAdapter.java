package ru.ozon.app.android.storefront.data.tiles.smalltile;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO_ImageComponentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageComponent;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$ImageItem;", "imageItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "nullableFavoriteProductMoleculeV2Adapter", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "nullableBlurMoleculeDTOAdapter", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SmallTileMoleculeDTO_ImageComponentJsonAdapter extends JsonAdapter<SmallTileMoleculeDTO.ImageComponent> {

    @NotNull
    private final JsonAdapter<SmallTileMoleculeDTO.ImageItem> imageItemAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<BlurMoleculeDTO> nullableBlurMoleculeDTOAdapter;

    @NotNull
    private final JsonAdapter<FavoriteProductMoleculeV2> nullableFavoriteProductMoleculeV2Adapter;

    @NotNull
    private final n.a options;

    public SmallTileMoleculeDTO_ImageComponentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("imageItem", "badge", "favoriteProductMoleculeV2", "blurItem");
        M m11 = M.f71699a;
        this.imageItemAdapter = moshi.f(SmallTileMoleculeDTO.ImageItem.class, m11, "imageItem");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableFavoriteProductMoleculeV2Adapter = moshi.f(FavoriteProductMoleculeV2.class, m11, "favoriteProductMoleculeV2");
        this.nullableBlurMoleculeDTOAdapter = moshi.f(BlurMoleculeDTO.class, m11, "blurItem");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(SmallTileMoleculeDTO.ImageComponent)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SmallTileMoleculeDTO.ImageComponent fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        SmallTileMoleculeDTO.ImageItem imageItem = null;
        BadgeDTO badgeDTO = null;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = null;
        BlurMoleculeDTO blurMoleculeDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                imageItem = this.imageItemAdapter.fromJson(reader);
                if (imageItem == null) {
                    throw c.q("imageItem", "imageItem", reader);
                }
            } else if (v11 == 1) {
                badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                favoriteProductMoleculeV2 = this.nullableFavoriteProductMoleculeV2Adapter.fromJson(reader);
            } else if (v11 == 3) {
                blurMoleculeDTO = this.nullableBlurMoleculeDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (imageItem != null) {
            return new SmallTileMoleculeDTO.ImageComponent(imageItem, badgeDTO, favoriteProductMoleculeV2, blurMoleculeDTO);
        }
        throw c.j("imageItem", "imageItem", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SmallTileMoleculeDTO.ImageComponent value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("imageItem");
        this.imageItemAdapter.mo44toJson(writer, (x) value.getImageItem());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("favoriteProductMoleculeV2");
        this.nullableFavoriteProductMoleculeV2Adapter.mo44toJson(writer, (x) value.getFavoriteProductMoleculeV2());
        writer.w("blurItem");
        this.nullableBlurMoleculeDTOAdapter.mo44toJson(writer, (x) value.getBlurItem());
        writer.p();
    }
}
