package ru.ozon.app.android.cart.cartSplitV2.v1.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO_HeaderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Header$AdditionalAction;", "nullableAdditionalActionAdapter", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO;", "nullableThermometerMoleculeDTOAdapter", "", "nullableBooleanAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2DTO_HeaderJsonAdapter extends JsonAdapter<CartSplitV2DTO.Header> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CartSplitV2DTO.Header.AdditionalAction> nullableAdditionalActionAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<ThermometerMoleculeDTO> nullableThermometerMoleculeDTOAdapter;

    @NotNull
    private final n.a options;

    public CartSplitV2DTO_HeaderJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "badges", "additionalAction", "thermometerMolecule", "disableRounding");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableListOfBadgeAdapter = moshi.f(D.e(List.class, Badge.class), m11, "badges");
        this.nullableAdditionalActionAdapter = moshi.f(CartSplitV2DTO.Header.AdditionalAction.class, m11, "additionalAction");
        this.nullableThermometerMoleculeDTOAdapter = moshi.f(ThermometerMoleculeDTO.class, m11, "thermometerMolecule");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "disableRounding");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(CartSplitV2DTO.Header)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartSplitV2DTO.Header fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        List<Badge> list = null;
        CartSplitV2DTO.Header.AdditionalAction additionalAction = null;
        ThermometerMoleculeDTO thermometerMoleculeDTO = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfBadgeAdapter.fromJson(reader);
                    break;
                case 3:
                    additionalAction = this.nullableAdditionalActionAdapter.fromJson(reader);
                    break;
                case 4:
                    thermometerMoleculeDTO = this.nullableThermometerMoleculeDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new CartSplitV2DTO.Header(textAtom, textAtom2, list, additionalAction, thermometerMoleculeDTO, bool);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartSplitV2DTO.Header value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("additionalAction");
        this.nullableAdditionalActionAdapter.mo44toJson(writer, (x) value.getAdditionalAction());
        writer.w("thermometerMolecule");
        this.nullableThermometerMoleculeDTOAdapter.mo44toJson(writer, (x) value.getThermometerMolecule());
        writer.w("disableRounding");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDisableRounding());
        writer.p();
    }
}
