package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.ControlsDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO_QuantityControlJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "nullableIntAdapter", "", "nullableLongAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl$QuantityStyle;", "nullableQuantityStyleAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;", "nullableDecrementRemoveAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ControlsDTO_QuantityControlJsonAdapter extends JsonAdapter<ControlsDTO.QuantityControl> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ControlsDTO.DecrementRemove> nullableDecrementRemoveAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final JsonAdapter<ControlsDTO.QuantityControl.QuantityStyle> nullableQuantityStyleAdapter;

    @NotNull
    private final n.a options;

    public ControlsDTO_QuantityControlJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("minimum", "maximum", "current", "action", "multiplicity", "debounceDelay", "incrementTrackingInfo", "decrementTrackingInfo", "quantityChangeDisabledNotificationBar", "quantSize", "style", "decrementRemove");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "minimum");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "multiplicity");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "debounceDelay");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "incrementTrackingInfo");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "quantityChangeDisabledNotificationBar");
        this.nullableQuantityStyleAdapter = moshi.f(ControlsDTO.QuantityControl.QuantityStyle.class, m11, "style");
        this.nullableDecrementRemoveAdapter = moshi.f(ControlsDTO.DecrementRemove.class, m11, "decrementRemove");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(ControlsDTO.QuantityControl)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ControlsDTO.QuantityControl fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        AtomActionDTO atomActionDTO = null;
        Integer num4 = null;
        Long l11 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        NotificationDTO notificationDTO = null;
        Integer num5 = null;
        ControlsDTO.QuantityControl.QuantityStyle quantityStyle = null;
        ControlsDTO.DecrementRemove decrementRemove = null;
        while (true) {
            Integer num6 = num;
            if (!reader.hasNext()) {
                reader.endObject();
                if (num6 == null) {
                    throw c.j("minimum", "minimum", reader);
                }
                int intValue = num6.intValue();
                if (num2 == null) {
                    throw c.j("maximum", "maximum", reader);
                }
                int intValue2 = num2.intValue();
                if (num3 == null) {
                    throw c.j("current", "current", reader);
                }
                int intValue3 = num3.intValue();
                if (atomActionDTO != null) {
                    return new ControlsDTO.QuantityControl(intValue, intValue2, intValue3, atomActionDTO, num4, l11, map, map2, notificationDTO, num5, quantityStyle, decrementRemove);
                }
                throw c.j("action", "action", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("minimum", "minimum", reader);
                    }
                    continue;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("maximum", "maximum", reader);
                    }
                    break;
                case 2:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("current", "current", reader);
                    }
                    break;
                case 3:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    break;
                case 4:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 10:
                    quantityStyle = this.nullableQuantityStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    decrementRemove = this.nullableDecrementRemoveAdapter.fromJson(reader);
                    break;
            }
            num = num6;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ControlsDTO.QuantityControl value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("minimum");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinimum()));
        writer.w("maximum");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaximum()));
        writer.w("current");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCurrent()));
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("multiplicity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMultiplicity());
        writer.w("debounceDelay");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getDebounceDelay());
        writer.w("incrementTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getIncrementTrackingInfo());
        writer.w("decrementTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDecrementTrackingInfo());
        writer.w("quantityChangeDisabledNotificationBar");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getQuantityChangeDisabledNotificationBar());
        writer.w("quantSize");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getQuantSize());
        writer.w("style");
        this.nullableQuantityStyleAdapter.mo44toJson(writer, (x) value.getStyle());
        writer.w("decrementRemove");
        this.nullableDecrementRemoveAdapter.mo44toJson(writer, (x) value.getDecrementRemove());
        writer.p();
    }
}
