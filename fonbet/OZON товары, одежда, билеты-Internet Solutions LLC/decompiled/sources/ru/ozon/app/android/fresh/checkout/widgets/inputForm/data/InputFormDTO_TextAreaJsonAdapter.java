package ru.ozon.app.android.fresh.checkout.widgets.inputForm.data;

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
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.data.InputFormDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO_TextAreaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputFormDTO_TextAreaJsonAdapter extends JsonAdapter<InputFormDTO.TextArea> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public InputFormDTO_TextAreaJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "maxInputLength", "minRows", "maxRows");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxInputLength");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(InputFormDTO.TextArea)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InputFormDTO.TextArea fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                }
            } else if (v11 == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 3) {
                num2 = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 4) {
                num3 = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new InputFormDTO.TextArea(str, str2, num, num2, num3);
        }
        throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InputFormDTO.TextArea value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("maxInputLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxInputLength());
        writer.w("minRows");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMinRows());
        writer.w("maxRows");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxRows());
        writer.p();
    }
}
