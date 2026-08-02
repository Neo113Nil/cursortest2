package ru.ozon.app.android.storefront.data.tiles.addtocart.likezone;

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
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.FamilyButtonDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO_QuantityButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "updateCartActionAdapter", "nullableIntAdapter", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyButtonDTO_QuantityButtonJsonAdapter extends JsonAdapter<FamilyButtonDTO.QuantityButton> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<FamilyButtonDTO.QuantityButton.UpdateCartAction> updateCartActionAdapter;

    public FamilyButtonDTO_QuantityButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("maxItems", "updateCartAction", "minItems");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxItems");
        this.updateCartActionAdapter = moshi.f(FamilyButtonDTO.QuantityButton.UpdateCartAction.class, m11, "updateCartAction");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "minItems");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(FamilyButtonDTO.QuantityButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FamilyButtonDTO.QuantityButton fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("maxItems", "maxItems", reader);
                }
            } else if (v11 == 1) {
                updateCartAction = this.updateCartActionAdapter.fromJson(reader);
                if (updateCartAction == null) {
                    throw c.q("updateCartAction", "updateCartAction", reader);
                }
            } else if (v11 == 2) {
                num2 = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("maxItems", "maxItems", reader);
        }
        int intValue = num.intValue();
        if (updateCartAction != null) {
            return new FamilyButtonDTO.QuantityButton(intValue, updateCartAction, num2);
        }
        throw c.j("updateCartAction", "updateCartAction", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FamilyButtonDTO.QuantityButton value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("maxItems");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxItems()));
        writer.w("updateCartAction");
        this.updateCartActionAdapter.mo44toJson(writer, (x) value.getUpdateCartAction());
        writer.w("minItems");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMinItems());
        writer.p();
    }
}
