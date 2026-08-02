package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

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
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto_Configuration_DeliveryDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$DeliveryData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$DeliveryData;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$DeliveryData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantDto$Configuration$DeliveryData$QuantitySelector;", "quantitySelectorAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantDto_Configuration_DeliveryDataJsonAdapter extends JsonAdapter<CartButtonQuantDto.Configuration.DeliveryData> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CartButtonQuantDto.Configuration.DeliveryData.QuantitySelector> quantitySelectorAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CartButtonQuantDto_Configuration_DeliveryDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "total", "quantitySelector");
        M m11 = M.f71699a;
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.stringAdapter = moshi.f(String.class, m11, "total");
        this.quantitySelectorAdapter = moshi.f(CartButtonQuantDto.Configuration.DeliveryData.QuantitySelector.class, m11, "quantitySelector");
    }

    @NotNull
    public String toString() {
        return b.c(67, "GeneratedJsonAdapter(CartButtonQuantDto.Configuration.DeliveryData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonQuantDto.Configuration.DeliveryData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3Atom.LargeButton largeButton = null;
        String str = null;
        CartButtonQuantDto.Configuration.DeliveryData.QuantitySelector quantitySelector = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                largeButton = this.largeButtonAdapter.fromJson(reader);
                if (largeButton == null) {
                    throw c.q("button", "button", reader);
                }
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("total", "total", reader);
                }
            } else if (v11 == 2 && (quantitySelector = this.quantitySelectorAdapter.fromJson(reader)) == null) {
                throw c.q("quantitySelector", "quantitySelector", reader);
            }
        }
        reader.endObject();
        if (largeButton == null) {
            throw c.j("button", "button", reader);
        }
        if (str == null) {
            throw c.j("total", "total", reader);
        }
        if (quantitySelector != null) {
            return new CartButtonQuantDto.Configuration.DeliveryData(largeButton, str, quantitySelector);
        }
        throw c.j("quantitySelector", "quantitySelector", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonQuantDto.Configuration.DeliveryData value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("total");
        this.stringAdapter.mo44toJson(writer, (x) value.getTotal());
        writer.w("quantitySelector");
        this.quantitySelectorAdapter.mo44toJson(writer, (x) value.getQuantitySelector());
        writer.p();
    }
}
