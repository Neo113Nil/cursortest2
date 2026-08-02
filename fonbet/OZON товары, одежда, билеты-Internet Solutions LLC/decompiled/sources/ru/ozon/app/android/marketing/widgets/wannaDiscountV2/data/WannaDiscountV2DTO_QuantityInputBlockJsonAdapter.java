package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data;

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
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO_QuantityInputBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "inputBlockAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock$QuantityError;", "quantityErrorAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2DTO_QuantityInputBlockJsonAdapter extends JsonAdapter<WannaDiscountV2DTO.QuantityInputBlock> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<WannaDiscountV2DTO.QuantityInputBlock> constructorRef;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.InputBlock> inputBlockAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.QuantityInputBlock.QuantityError> quantityErrorAdapter;

    public WannaDiscountV2DTO_QuantityInputBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("input", "userQuantityMin", "userQuantityMax", "error", "quantityFieldDisabled");
        M m11 = M.f71699a;
        this.inputBlockAdapter = moshi.f(WannaDiscountV2DTO.InputBlock.class, m11, "input");
        this.longAdapter = moshi.f(Long.TYPE, m11, "userQuantityMin");
        this.quantityErrorAdapter = moshi.f(WannaDiscountV2DTO.QuantityInputBlock.QuantityError.class, m11, "error");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "quantityFieldDisabled");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(WannaDiscountV2DTO.QuantityInputBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WannaDiscountV2DTO.QuantityInputBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        WannaDiscountV2DTO.InputBlock inputBlock = null;
        Long l11 = null;
        Long l12 = null;
        WannaDiscountV2DTO.QuantityInputBlock.QuantityError quantityError = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                inputBlock = this.inputBlockAdapter.fromJson(reader);
                if (inputBlock == null) {
                    throw c.q("input", "input", reader);
                }
            } else if (v11 == 1) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("userQuantityMin", "userQuantityMin", reader);
                }
            } else if (v11 == 2) {
                l12 = this.longAdapter.fromJson(reader);
                if (l12 == null) {
                    throw c.q("userQuantityMax", "userQuantityMax", reader);
                }
            } else if (v11 == 3) {
                quantityError = this.quantityErrorAdapter.fromJson(reader);
                if (quantityError == null) {
                    throw c.q("error", "error", reader);
                }
            } else if (v11 == 4) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("quantityFieldDisabled", "quantityFieldDisabled", reader);
                }
                i11 = -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            if (inputBlock == null) {
                throw c.j("input", "input", reader);
            }
            if (l11 == null) {
                throw c.j("userQuantityMin", "userQuantityMin", reader);
            }
            long longValue = l11.longValue();
            if (l12 == null) {
                throw c.j("userQuantityMax", "userQuantityMax", reader);
            }
            long longValue2 = l12.longValue();
            if (quantityError == null) {
                throw c.j("error", "error", reader);
            }
            return new WannaDiscountV2DTO.QuantityInputBlock(inputBlock, longValue, longValue2, quantityError, bool2.booleanValue());
        }
        Constructor<WannaDiscountV2DTO.QuantityInputBlock> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Long.TYPE;
            constructor = WannaDiscountV2DTO.QuantityInputBlock.class.getDeclaredConstructor(WannaDiscountV2DTO.InputBlock.class, cls3, cls3, WannaDiscountV2DTO.QuantityInputBlock.QuantityError.class, cls2, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<WannaDiscountV2DTO.QuantityInputBlock> constructor2 = constructor;
        if (inputBlock == null) {
            throw c.j("input", "input", reader);
        }
        if (l11 == null) {
            throw c.j("userQuantityMin", "userQuantityMin", reader);
        }
        if (l12 == null) {
            throw c.j("userQuantityMax", "userQuantityMax", reader);
        }
        if (quantityError == null) {
            throw c.j("error", "error", reader);
        }
        WannaDiscountV2DTO.QuantityInputBlock newInstance = constructor2.newInstance(inputBlock, l11, l12, quantityError, bool2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WannaDiscountV2DTO.QuantityInputBlock value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("input");
        this.inputBlockAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("userQuantityMin");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getUserQuantityMin()));
        writer.w("userQuantityMax");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getUserQuantityMax()));
        writer.w("error");
        this.quantityErrorAdapter.mo44toJson(writer, (x) value.getError());
        writer.w("quantityFieldDisabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getQuantityFieldDisabled()));
        writer.p();
    }
}
