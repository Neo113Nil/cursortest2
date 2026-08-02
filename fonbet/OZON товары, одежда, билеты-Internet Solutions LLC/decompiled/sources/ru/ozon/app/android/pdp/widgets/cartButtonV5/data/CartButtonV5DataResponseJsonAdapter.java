package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

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
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DataResponse;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse$ButtonText;", "nullableButtonTextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5DataResponseJsonAdapter extends JsonAdapter<CartButtonV5DataResponse> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CartButtonV5DataResponse> constructorRef;

    @NotNull
    private final JsonAdapter<CartButtonV5DataResponse.ButtonText> nullableButtonTextAdapter;

    @NotNull
    private final n.a options;

    public CartButtonV5DataResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("firstButton", "secondButton", "isTextToSubtitle");
        M m11 = M.f71699a;
        this.nullableButtonTextAdapter = moshi.f(CartButtonV5DataResponse.ButtonText.class, m11, "firstButton");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isTextToSubtitle");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(CartButtonV5DataResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonV5DataResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        CartButtonV5DataResponse.ButtonText buttonText = null;
        CartButtonV5DataResponse.ButtonText buttonText2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                buttonText = this.nullableButtonTextAdapter.fromJson(reader);
            } else if (v11 == 1) {
                buttonText2 = this.nullableButtonTextAdapter.fromJson(reader);
            } else if (v11 == 2) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("isTextToSubtitle", "isTextToSubtitle", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            return new CartButtonV5DataResponse(buttonText, buttonText2, bool.booleanValue());
        }
        Constructor<CartButtonV5DataResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CartButtonV5DataResponse.class.getDeclaredConstructor(CartButtonV5DataResponse.ButtonText.class, CartButtonV5DataResponse.ButtonText.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CartButtonV5DataResponse newInstance = constructor.newInstance(buttonText, buttonText2, bool, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonV5DataResponse value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("firstButton");
        this.nullableButtonTextAdapter.mo44toJson(writer, (x) value.getFirstButton());
        writer.w("secondButton");
        this.nullableButtonTextAdapter.mo44toJson(writer, (x) value.getSecondButton());
        writer.w("isTextToSubtitle");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isTextToSubtitle()));
        writer.p();
    }
}
