package ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data.FreshTileGridDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/data/FreshTileGridDTO;", "nullableFreshTileGridDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AutoCatalogItemDTOJsonAdapter extends JsonAdapter<AutoCatalogItemDTO> {
    public static final int $stable = 8;
    private volatile Constructor<AutoCatalogItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<FreshTileGridDTO> nullableFreshTileGridDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AutoCatalogItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", "tileGridMedium", "tileGridMini");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "type");
        this.nullableFreshTileGridDTOAdapter = moshi.f(FreshTileGridDTO.class, m11, "tileGridMedium");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(AutoCatalogItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AutoCatalogItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        FreshTileGridDTO freshTileGridDTO = null;
        FreshTileGridDTO freshTileGridDTO2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("type", "type", reader);
                }
            } else if (v11 == 1) {
                freshTileGridDTO = this.nullableFreshTileGridDTOAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                freshTileGridDTO2 = this.nullableFreshTileGridDTOAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            if (str != null) {
                return new AutoCatalogItemDTO(str, freshTileGridDTO, freshTileGridDTO2);
            }
            throw c.j("type", "type", reader);
        }
        Constructor<AutoCatalogItemDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AutoCatalogItemDTO.class.getDeclaredConstructor(String.class, FreshTileGridDTO.class, FreshTileGridDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("type", "type", reader);
        }
        AutoCatalogItemDTO newInstance = constructor.newInstance(str, freshTileGridDTO, freshTileGridDTO2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AutoCatalogItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("tileGridMedium");
        this.nullableFreshTileGridDTOAdapter.mo44toJson(writer, (x) value.getTileGridMedium());
        writer.w("tileGridMini");
        this.nullableFreshTileGridDTOAdapter.mo44toJson(writer, (x) value.getTileGridMini());
        writer.p();
    }
}
