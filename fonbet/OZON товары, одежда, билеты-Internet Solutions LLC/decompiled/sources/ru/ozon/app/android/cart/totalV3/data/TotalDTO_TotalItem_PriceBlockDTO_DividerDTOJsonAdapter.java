package ru.ozon.app.android.cart.totalV3.data;

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
import ru.ozon.app.android.cart.totalV3.data.TotalDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO_TotalItem_PriceBlockDTO_DividerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "horizontalMarginsDTOAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalDTO_TotalItem_PriceBlockDTO_DividerDTOJsonAdapter extends JsonAdapter<TotalDTO.TotalItem.PriceBlockDTO.DividerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TotalDTO.HorizontalMarginsDTO> horizontalMarginsDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TotalDTO_TotalItem_PriceBlockDTO_DividerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("height", "width", "color", "margins");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "height");
        this.stringAdapter = moshi.f(String.class, m11, "color");
        this.horizontalMarginsDTOAdapter = moshi.f(TotalDTO.HorizontalMarginsDTO.class, m11, "margins");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(TotalDTO.TotalItem.PriceBlockDTO.DividerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalDTO.TotalItem.PriceBlockDTO.DividerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        TotalDTO.HorizontalMarginsDTO horizontalMarginsDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("height", "height", reader);
                }
            } else if (v11 == 1) {
                num2 = this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw c.q("width", "width", reader);
                }
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("color", "color", reader);
                }
            } else if (v11 == 3 && (horizontalMarginsDTO = this.horizontalMarginsDTOAdapter.fromJson(reader)) == null) {
                throw c.q("margins", "margins", reader);
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("height", "height", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw c.j("width", "width", reader);
        }
        int intValue2 = num2.intValue();
        if (str == null) {
            throw c.j("color", "color", reader);
        }
        if (horizontalMarginsDTO != null) {
            return new TotalDTO.TotalItem.PriceBlockDTO.DividerDTO(intValue, intValue2, str, horizontalMarginsDTO);
        }
        throw c.j("margins", "margins", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalDTO.TotalItem.PriceBlockDTO.DividerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("height");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHeight()));
        writer.w("width");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getWidth()));
        writer.w("color");
        this.stringAdapter.mo44toJson(writer, (x) value.getColor());
        writer.w("margins");
        this.horizontalMarginsDTOAdapter.mo44toJson(writer, (x) value.getMargins());
        writer.p();
    }
}
