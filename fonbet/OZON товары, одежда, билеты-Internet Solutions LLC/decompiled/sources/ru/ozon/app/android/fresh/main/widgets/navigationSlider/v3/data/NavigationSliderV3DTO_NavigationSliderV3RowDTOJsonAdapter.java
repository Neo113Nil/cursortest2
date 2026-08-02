package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

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
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO_NavigationSliderV3RowDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "itemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableItemAdapter", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;", "rowTypeAdapter", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "cornersAdapter", "", "booleanAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3DTO_NavigationSliderV3RowDTOJsonAdapter extends JsonAdapter<NavigationSliderV3DTO.NavigationSliderV3RowDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<NavigationSliderV3DTO.NavigationSliderV3RowDTO> constructorRef;

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.Corners> cornersAdapter;

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.Item> itemAdapter;

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.Item> nullableItemAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.RowType> rowTypeAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NavigationSliderV3DTO_NavigationSliderV3RowDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftItem", "rightItem", "rowType", "corners", "hasHeader", "backgroundColor");
        M m11 = M.f71699a;
        this.itemAdapter = moshi.f(NavigationSliderV3DTO.Item.class, m11, "leftItem");
        this.nullableItemAdapter = moshi.f(NavigationSliderV3DTO.Item.class, m11, "rightItem");
        this.rowTypeAdapter = moshi.f(NavigationSliderV3DTO.RowType.class, m11, "rowType");
        this.cornersAdapter = moshi.f(NavigationSliderV3DTO.Corners.class, m11, "corners");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hasHeader");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(68, "GeneratedJsonAdapter(NavigationSliderV3DTO.NavigationSliderV3RowDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NavigationSliderV3DTO.NavigationSliderV3RowDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        NavigationSliderV3DTO.Item item = null;
        NavigationSliderV3DTO.Item item2 = null;
        NavigationSliderV3DTO.RowType rowType = null;
        NavigationSliderV3DTO.Corners corners = null;
        Boolean bool = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    item = this.itemAdapter.fromJson(reader);
                    if (item == null) {
                        throw c.q("leftItem", "leftItem", reader);
                    }
                    break;
                case 1:
                    item2 = this.nullableItemAdapter.fromJson(reader);
                    i11 = -3;
                    break;
                case 2:
                    rowType = this.rowTypeAdapter.fromJson(reader);
                    if (rowType == null) {
                        throw c.q("rowType", "rowType", reader);
                    }
                    break;
                case 3:
                    corners = this.cornersAdapter.fromJson(reader);
                    if (corners == null) {
                        throw c.q("corners", "corners", reader);
                    }
                    break;
                case 4:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("hasHeader", "hasHeader", reader);
                    }
                    break;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            Boolean bool2 = bool;
            NavigationSliderV3DTO.Corners corners2 = corners;
            NavigationSliderV3DTO.RowType rowType2 = rowType;
            NavigationSliderV3DTO.Item item3 = item2;
            NavigationSliderV3DTO.Item item4 = item;
            if (item4 == null) {
                throw c.j("leftItem", "leftItem", reader);
            }
            if (rowType2 == null) {
                throw c.j("rowType", "rowType", reader);
            }
            if (corners2 == null) {
                throw c.j("corners", "corners", reader);
            }
            if (bool2 == null) {
                throw c.j("hasHeader", "hasHeader", reader);
            }
            String str2 = str;
            boolean booleanValue = bool2.booleanValue();
            if (str2 != null) {
                return new NavigationSliderV3DTO.NavigationSliderV3RowDTO(item4, item3, rowType2, corners2, booleanValue, str2);
            }
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        Boolean bool3 = bool;
        String str3 = str;
        NavigationSliderV3DTO.Corners corners3 = corners;
        NavigationSliderV3DTO.RowType rowType3 = rowType;
        NavigationSliderV3DTO.Item item5 = item2;
        NavigationSliderV3DTO.Item item6 = item;
        Constructor<NavigationSliderV3DTO.NavigationSliderV3RowDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NavigationSliderV3DTO.NavigationSliderV3RowDTO.class.getDeclaredConstructor(NavigationSliderV3DTO.Item.class, NavigationSliderV3DTO.Item.class, NavigationSliderV3DTO.RowType.class, NavigationSliderV3DTO.Corners.class, Boolean.TYPE, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (item6 == null) {
            throw c.j("leftItem", "leftItem", reader);
        }
        if (rowType3 == null) {
            throw c.j("rowType", "rowType", reader);
        }
        if (corners3 == null) {
            throw c.j("corners", "corners", reader);
        }
        if (bool3 == null) {
            throw c.j("hasHeader", "hasHeader", reader);
        }
        if (str3 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        NavigationSliderV3DTO.NavigationSliderV3RowDTO newInstance = constructor.newInstance(item6, item5, rowType3, corners3, bool3, str3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NavigationSliderV3DTO.NavigationSliderV3RowDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftItem");
        this.itemAdapter.mo44toJson(writer, (x) value.getLeftItem());
        writer.w("rightItem");
        this.nullableItemAdapter.mo44toJson(writer, (x) value.getRightItem());
        writer.w("rowType");
        this.rowTypeAdapter.mo44toJson(writer, (x) value.getRowType());
        writer.w("corners");
        this.cornersAdapter.mo44toJson(writer, (x) value.getCorners());
        writer.w("hasHeader");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHasHeader()));
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
