package ru.ozon.app.android.checkoutgeo.address.common.addressCell;

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
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell_RightLeftTitlesCell24Icon_StyleColorsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors$Colors;", "colorsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressCell_RightLeftTitlesCell24Icon_StyleColorsJsonAdapter extends JsonAdapter<AddressCell.RightLeftTitlesCell24Icon.StyleColors> {

    @NotNull
    private final JsonAdapter<AddressCell.RightLeftTitlesCell24Icon.StyleColors.Colors> colorsAdapter;

    @NotNull
    private final n.a options;

    public AddressCell_RightLeftTitlesCell24Icon_StyleColorsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("common", "saleActive");
        this.colorsAdapter = moshi.f(AddressCell.RightLeftTitlesCell24Icon.StyleColors.Colors.class, M.f71699a, "common");
    }

    @NotNull
    public String toString() {
        return b.c(71, "GeneratedJsonAdapter(AddressCell.RightLeftTitlesCell24Icon.StyleColors)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressCell.RightLeftTitlesCell24Icon.StyleColors fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AddressCell.RightLeftTitlesCell24Icon.StyleColors.Colors colors = null;
        AddressCell.RightLeftTitlesCell24Icon.StyleColors.Colors colors2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                colors = this.colorsAdapter.fromJson(reader);
                if (colors == null) {
                    throw c.q("common", "common", reader);
                }
            } else if (v11 == 1 && (colors2 = this.colorsAdapter.fromJson(reader)) == null) {
                throw c.q("saleActive", "saleActive", reader);
            }
        }
        reader.endObject();
        if (colors == null) {
            throw c.j("common", "common", reader);
        }
        if (colors2 != null) {
            return new AddressCell.RightLeftTitlesCell24Icon.StyleColors(colors, colors2);
        }
        throw c.j("saleActive", "saleActive", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressCell.RightLeftTitlesCell24Icon.StyleColors value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("common");
        this.colorsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("saleActive");
        this.colorsAdapter.mo44toJson(writer, (x) value.getSaleActive());
        writer.p();
    }
}
