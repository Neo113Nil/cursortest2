package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO_State_QuantityControlJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$QuantityControl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$QuantityControl;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$QuantityControl;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableLongAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State$ActionIcon;", "actionIconAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarDTO_State_QuantityControlJsonAdapter extends JsonAdapter<ProductActionBarDTO.State.QuantityControl> {

    @NotNull
    private final JsonAdapter<ProductActionBarDTO.State.ActionIcon> actionIconAdapter;
    private volatile Constructor<ProductActionBarDTO.State.QuantityControl> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ProductActionBarDTO_State_QuantityControlJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "selectedDeliverySchema", AppMeasurementSdk.ConditionalUserProperty.VALUE, "valueTextStyle", "cartActionIcon", "additionalAction", "minValue", "maxValue", "multiplicity", "quantSize", "incrementIcon", "decrementIcon", "trackingInfo");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "id");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "selectedDeliverySchema");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "valueTextStyle");
        this.actionIconAdapter = moshi.f(ProductActionBarDTO.State.ActionIcon.class, m11, "cartActionIcon");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "additionalAction");
        this.nullableStringAdapter = moshi.f(String.class, m11, "incrementIcon");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(63, "GeneratedJsonAdapter(ProductActionBarDTO.State.QuantityControl)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductActionBarDTO.State.QuantityControl fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        Long l11 = null;
        Long l12 = null;
        Integer num = null;
        TextDTO textDTO = null;
        ProductActionBarDTO.State.ActionIcon actionIcon = null;
        CommonControlSettings commonControlSettings = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("valueTextStyle", "valueTextStyle", reader);
                    }
                    break;
                case 4:
                    actionIcon = this.actionIconAdapter.fromJson(reader);
                    if (actionIcon == null) {
                        throw c.q("cartActionIcon", "cartActionIcon", reader);
                    }
                    break;
                case 5:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
                case 11:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -4097;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -8161) {
            ProductActionBarDTO.State.ActionIcon actionIcon2 = actionIcon;
            Long l13 = l12;
            if (l11 == null) {
                throw c.j("id", "id", reader);
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Integer num6 = num2;
            Integer num7 = num;
            TextDTO textDTO2 = textDTO;
            long longValue = l11.longValue();
            if (textDTO2 == null) {
                throw c.j("valueTextStyle", "valueTextStyle", reader);
            }
            if (actionIcon2 != null) {
                return new ProductActionBarDTO.State.QuantityControl(longValue, l13, num7, textDTO2, actionIcon2, commonControlSettings2, num6, num3, num4, num5, str, str2, map);
            }
            throw c.j("cartActionIcon", "cartActionIcon", reader);
        }
        ProductActionBarDTO.State.ActionIcon actionIcon3 = actionIcon;
        Long l14 = l12;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        Integer num8 = num;
        Integer num9 = num2;
        TextDTO textDTO3 = textDTO;
        Constructor<ProductActionBarDTO.State.QuantityControl> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = ProductActionBarDTO.State.QuantityControl.class.getDeclaredConstructor(Long.TYPE, Long.class, Integer.class, TextDTO.class, ProductActionBarDTO.State.ActionIcon.class, CommonControlSettings.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<ProductActionBarDTO.State.QuantityControl> constructor2 = constructor;
        if (l11 == null) {
            throw c.j("id", "id", reader);
        }
        if (textDTO3 == null) {
            throw c.j("valueTextStyle", "valueTextStyle", reader);
        }
        if (actionIcon3 == null) {
            throw c.j("cartActionIcon", "cartActionIcon", reader);
        }
        ProductActionBarDTO.State.QuantityControl newInstance = constructor2.newInstance(l11, l14, num8, textDTO3, actionIcon3, commonControlSettings3, num9, num3, num4, num5, str, str2, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductActionBarDTO.State.QuantityControl value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getId()));
        writer.w("selectedDeliverySchema");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getSelectedDeliverySchema());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("valueTextStyle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getValueTextStyle());
        writer.w("cartActionIcon");
        this.actionIconAdapter.mo44toJson(writer, (x) value.getCartActionIcon());
        writer.w("additionalAction");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getAdditionalAction());
        writer.w("minValue");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMinValue());
        writer.w("maxValue");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxValue());
        writer.w("multiplicity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMultiplicity());
        writer.w("quantSize");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getQuantSize());
        writer.w("incrementIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIncrementIcon());
        writer.w("decrementIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDecrementIcon());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
