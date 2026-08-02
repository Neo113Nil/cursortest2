package ru.ozon.app.android.fresh.main.widgets.catalogShelf.data;

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
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO_CatalogShelfSection_CatalogShelfRowJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfItem;", "listOfCatalogShelfItemAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfDTO_CatalogShelfSection_CatalogShelfRowJsonAdapter extends JsonAdapter<CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow> constructorRef;

    @NotNull
    private final JsonAdapter<List<CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem>> listOfCatalogShelfItemAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CatalogShelfDTO_CatalogShelfSection_CatalogShelfRowJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("topCorners", "bottomCorners", "list", "scrollKey", "catalogueTabsConnectionTag");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "topCorners");
        this.listOfCatalogShelfItemAdapter = moshi.f(D.e(List.class, CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem.class), m11, "list");
        this.nullableStringAdapter = moshi.f(String.class, m11, "scrollKey");
    }

    @NotNull
    public String toString() {
        return b.c(73, "GeneratedJsonAdapter(CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        List<CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem> list = null;
        String str = null;
        String str2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("topCorners", "topCorners", reader);
                }
            } else if (v11 == 1) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("bottomCorners", "bottomCorners", reader);
                }
            } else if (v11 == 2) {
                list = this.listOfCatalogShelfItemAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("list", "list", reader);
                }
            } else if (v11 == 3) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -25) {
            List<CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem> list2 = list;
            if (bool == null) {
                throw c.j("topCorners", "topCorners", reader);
            }
            String str3 = str;
            boolean booleanValue = bool.booleanValue();
            if (bool2 == null) {
                throw c.j("bottomCorners", "bottomCorners", reader);
            }
            String str4 = str2;
            boolean booleanValue2 = bool2.booleanValue();
            if (list2 != null) {
                return new CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow(booleanValue, booleanValue2, list2, str3, str4);
            }
            throw c.j("list", "list", reader);
        }
        String str5 = str2;
        List<CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem> list3 = list;
        String str6 = str;
        Constructor<CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow.class.getDeclaredConstructor(cls2, cls2, List.class, String.class, String.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow> constructor2 = constructor;
        if (bool == null) {
            throw c.j("topCorners", "topCorners", reader);
        }
        if (bool2 == null) {
            throw c.j("bottomCorners", "bottomCorners", reader);
        }
        if (list3 == null) {
            throw c.j("list", "list", reader);
        }
        CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow newInstance = constructor2.newInstance(bool, bool2, list3, str6, str5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topCorners");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getTopCorners()));
        writer.w("bottomCorners");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getBottomCorners()));
        writer.w("list");
        this.listOfCatalogShelfItemAdapter.mo44toJson(writer, (x) value.getList());
        writer.w("scrollKey");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getScrollKey());
        writer.w("catalogueTabsConnectionTag");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCatalogueTabsConnectionTag());
        writer.p();
    }
}
