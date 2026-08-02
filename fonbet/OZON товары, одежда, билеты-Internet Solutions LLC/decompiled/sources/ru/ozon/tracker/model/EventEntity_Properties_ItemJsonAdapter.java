package ru.ozon.tracker.model;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/tracker/model/EventEntity_Properties_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity$Properties$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity$Properties$Item;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity$Properties$Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntity_Properties_ItemJsonAdapter extends JsonAdapter<EventEntity.Properties.Item> {
    private volatile Constructor<EventEntity.Properties.Item> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public EventEntity_Properties_ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("sku", "finalPrice", "originalPrice", "quantity", "deliveryType", "isSupermarket");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Long> f7 = moshi.f(Long.TYPE, m11, "sku");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.longAdapter = f7;
        JsonAdapter<BigDecimal> f11 = moshi.f(BigDecimal.class, m11, "finalPrice");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBigDecimalAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "quantity");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "deliveryType");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "isSupermarket");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(EventEntity.Properties.Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity.Properties.Item fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Long l11 = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        Integer num = null;
        String str = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("sku", "sku", reader);
                    }
                    break;
                case 1:
                    bigDecimal = this.nullableBigDecimalAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -63) {
            String str2 = str;
            BigDecimal bigDecimal3 = bigDecimal;
            if (l11 == null) {
                throw c.j("sku", "sku", reader);
            }
            Boolean bool2 = bool;
            return new EventEntity.Properties.Item(l11.longValue(), bigDecimal3, bigDecimal2, num, str2, bool2);
        }
        String str3 = str;
        Boolean bool3 = bool;
        BigDecimal bigDecimal4 = bigDecimal;
        BigDecimal bigDecimal5 = bigDecimal2;
        Integer num2 = num;
        Constructor<EventEntity.Properties.Item> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EventEntity.Properties.Item.class.getDeclaredConstructor(Long.TYPE, BigDecimal.class, BigDecimal.class, Integer.class, String.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<EventEntity.Properties.Item> constructor2 = constructor;
        if (l11 == null) {
            throw c.j("sku", "sku", reader);
        }
        EventEntity.Properties.Item newInstance = constructor2.newInstance(l11, bigDecimal4, bigDecimal5, num2, str3, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity.Properties.Item value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getSku()));
        writer.w("finalPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getFinalPrice());
        writer.w("originalPrice");
        this.nullableBigDecimalAdapter.mo44toJson(writer, (x) value_.getOriginalPrice());
        writer.w("quantity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getQuantity());
        writer.w("deliveryType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDeliveryType());
        writer.w("isSupermarket");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isSupermarket());
        writer.p();
    }
}
