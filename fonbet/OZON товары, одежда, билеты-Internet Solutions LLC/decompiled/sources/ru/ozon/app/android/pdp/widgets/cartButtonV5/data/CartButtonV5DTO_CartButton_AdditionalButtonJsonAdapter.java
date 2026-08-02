package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

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
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO_CartButton_AdditionalButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton$ChangeQuantityButton;", "changeQuantityButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5DTO_CartButton_AdditionalButtonJsonAdapter extends JsonAdapter<CartButtonV5DTO.CartButton.AdditionalButton> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton.AdditionalButton.ChangeQuantityButton> changeQuantityButtonAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CartButtonV5DTO_CartButton_AdditionalButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("incrementButton", HammersV3BodyDTO.PLACEHOLDER, "decrementButton", "backgroundColor", "cornerRadius");
        M m11 = M.f71699a;
        this.changeQuantityButtonAdapter = moshi.f(CartButtonV5DTO.CartButton.AdditionalButton.ChangeQuantityButton.class, m11, "incrementButton");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(CartButtonV5DTO.CartButton.AdditionalButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonV5DTO.CartButton.AdditionalButton fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CartButtonV5DTO.CartButton.AdditionalButton.ChangeQuantityButton changeQuantityButton = null;
        TextDTO textDTO = null;
        CartButtonV5DTO.CartButton.AdditionalButton.ChangeQuantityButton changeQuantityButton2 = null;
        String str = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                changeQuantityButton = this.changeQuantityButtonAdapter.fromJson(reader);
                if (changeQuantityButton == null) {
                    throw c.q("incrementButton", "incrementButton", reader);
                }
            } else if (v11 == 1) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                }
            } else if (v11 == 2) {
                changeQuantityButton2 = this.changeQuantityButtonAdapter.fromJson(reader);
                if (changeQuantityButton2 == null) {
                    throw c.q("decrementButton", "decrementButton", reader);
                }
            } else if (v11 == 3) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
            } else if (v11 == 4 && (cornerRadius = this.cornerRadiusAdapter.fromJson(reader)) == null) {
                throw c.q("cornerRadius", "cornerRadius", reader);
            }
        }
        reader.endObject();
        if (changeQuantityButton == null) {
            throw c.j("incrementButton", "incrementButton", reader);
        }
        if (textDTO == null) {
            throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
        }
        if (changeQuantityButton2 == null) {
            throw c.j("decrementButton", "decrementButton", reader);
        }
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (cornerRadius != null) {
            return new CartButtonV5DTO.CartButton.AdditionalButton(changeQuantityButton, textDTO, changeQuantityButton2, str, cornerRadius);
        }
        throw c.j("cornerRadius", "cornerRadius", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonV5DTO.CartButton.AdditionalButton value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("incrementButton");
        this.changeQuantityButtonAdapter.mo44toJson(writer, (x) value.getIncrementButton());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w("decrementButton");
        this.changeQuantityButtonAdapter.mo44toJson(writer, (x) value.getDecrementButton());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("cornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
