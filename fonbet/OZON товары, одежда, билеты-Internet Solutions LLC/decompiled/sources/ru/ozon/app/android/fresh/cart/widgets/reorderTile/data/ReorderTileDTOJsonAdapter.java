package ru.ozon.app.android.fresh.cart.widgets.reorderTile.data;

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
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileDTO;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", "nullableCommonHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem;", "listOfTileItemAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReorderTileDTOJsonAdapter extends JsonAdapter<ReorderTileDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ReorderTileDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<ReorderTileDTO.TileItem>> listOfTileItemAdapter;

    @NotNull
    private final JsonAdapter<CommonHeaderDTO> nullableCommonHeaderDTOAdapter;

    @NotNull
    private final n.a options;

    public ReorderTileDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "tiles");
        M m11 = M.f71699a;
        this.nullableCommonHeaderDTOAdapter = moshi.f(CommonHeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfTileItemAdapter = moshi.f(D.e(List.class, ReorderTileDTO.TileItem.class), m11, "tiles");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(ReorderTileDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReorderTileDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CommonHeaderDTO commonHeaderDTO = null;
        List<ReorderTileDTO.TileItem> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                commonHeaderDTO = this.nullableCommonHeaderDTOAdapter.fromJson(reader);
                i11 = -2;
            } else if (v11 == 1 && (list = this.listOfTileItemAdapter.fromJson(reader)) == null) {
                throw c.q("tiles", "tiles", reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            if (list != null) {
                return new ReorderTileDTO(commonHeaderDTO, list);
            }
            throw c.j("tiles", "tiles", reader);
        }
        Constructor<ReorderTileDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReorderTileDTO.class.getDeclaredConstructor(CommonHeaderDTO.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("tiles", "tiles", reader);
        }
        ReorderTileDTO newInstance = constructor.newInstance(commonHeaderDTO, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReorderTileDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableCommonHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("tiles");
        this.listOfTileItemAdapter.mo44toJson(writer, (x) value.getTiles());
        writer.p();
    }
}
