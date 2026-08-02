package ru.ozon.app.android.checkoutcomposer.common.formbuilder.data;

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
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO_Row_Block_BlockRow_Field_SearchOptions_BoundingBoxJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;", "geoCoordinateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderDTO_Row_Block_BlockRow_Field_SearchOptions_BoundingBoxJsonAdapter extends JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox> {

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox.GeoCoordinate> geoCoordinateAdapter;

    @NotNull
    private final n.a options;

    public FormBuilderDTO_Row_Block_BlockRow_Field_SearchOptions_BoundingBoxJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("rightTop", "leftBottom");
        this.geoCoordinateAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox.GeoCoordinate.class, M.f71699a, "rightTop");
    }

    @NotNull
    public String toString() {
        return b.c(87, "GeneratedJsonAdapter(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox.GeoCoordinate geoCoordinate = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox.GeoCoordinate geoCoordinate2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                geoCoordinate = this.geoCoordinateAdapter.fromJson(reader);
                if (geoCoordinate == null) {
                    throw c.q("rightTop", "rightTop", reader);
                }
            } else if (v11 == 1 && (geoCoordinate2 = this.geoCoordinateAdapter.fromJson(reader)) == null) {
                throw c.q("leftBottom", "leftBottom", reader);
            }
        }
        reader.endObject();
        if (geoCoordinate == null) {
            throw c.j("rightTop", "rightTop", reader);
        }
        if (geoCoordinate2 != null) {
            return new FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox(geoCoordinate, geoCoordinate2);
        }
        throw c.j("leftBottom", "leftBottom", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("rightTop");
        this.geoCoordinateAdapter.mo44toJson(writer, (x) value.getRightTop());
        writer.w("leftBottom");
        this.geoCoordinateAdapter.mo44toJson(writer, (x) value.getLeftBottom());
        writer.p();
    }
}
