package ru.ozon.app.android.cart.cartSplitV2.v2.data;

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
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "nullableIntAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "nullablePaddingsAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2CellItemDTOV2JsonAdapter extends JsonAdapter<CartSplitV2CellItemDTOV2> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CartSplitV2CellItemDTOV2JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("index", "id", "cell", "hidingTimeMls", "strokeColor", "isLast", "externalPaddings");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "index");
        this.longAdapter = moshi.f(Long.TYPE, m11, "id");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "hidingTimeMls");
        this.nullableStringAdapter = moshi.f(String.class, m11, "strokeColor");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isLast");
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "externalPaddings");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(CartSplitV2CellItemDTOV2)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2CellItemDTOV2 fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Long l11 = null;
        CellDTO cellDTO = null;
        Integer num2 = null;
        String str = null;
        Boolean bool = null;
        Paddings paddings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("index", "index", reader);
                    }
                    break;
                case 1:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 2:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("index", "index", reader);
        }
        int intValue = num.intValue();
        if (l11 == null) {
            throw c.j("id", "id", reader);
        }
        long longValue = l11.longValue();
        if (cellDTO != null) {
            return new CartSplitV2CellItemDTOV2(intValue, longValue, cellDTO, num2, str, bool, paddings);
        }
        throw c.j("cell", "cell", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2CellItemDTOV2 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("index");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIndex()));
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getId()));
        writer.w("cell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("hidingTimeMls");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getHidingTimeMls());
        writer.w("strokeColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStrokeColor());
        writer.w("isLast");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isLast());
        writer.w("externalPaddings");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getExternalPaddings());
        writer.p();
    }
}
