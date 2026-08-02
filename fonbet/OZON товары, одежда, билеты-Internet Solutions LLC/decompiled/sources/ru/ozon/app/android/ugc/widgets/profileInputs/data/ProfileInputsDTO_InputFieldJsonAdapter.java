package ru.ozon.app.android.ugc.widgets.profileInputs.data;

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
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ProfileInputsDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO_InputFieldJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileInputsDTO_InputFieldJsonAdapter extends JsonAdapter<ProfileInputsDTO.InputField> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ProfileInputsDTO_InputFieldJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, "bottomValue", "minCount", "maxCount", "emptyError", "countError");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.intAdapter = moshi.f(Integer.TYPE, m11, "minCount");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(ProfileInputsDTO.InputField)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProfileInputsDTO.InputField fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("minCount", "minCount", reader);
                    }
                    break;
                case 3:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("maxCount", "maxCount", reader);
                    }
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        Integer num3 = num2;
        if (num == null) {
            throw c.j("minCount", "minCount", reader);
        }
        int intValue = num.intValue();
        if (num3 != null) {
            return new ProfileInputsDTO.InputField(str, str2, intValue, num3.intValue(), str3, str4);
        }
        throw c.j("maxCount", "maxCount", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProfileInputsDTO.InputField value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("bottomValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBottomValue());
        writer.w("minCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinCount()));
        writer.w("maxCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxCount()));
        writer.w("emptyError");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getEmptyError());
        writer.w("countError");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCountError());
        writer.p();
    }
}
