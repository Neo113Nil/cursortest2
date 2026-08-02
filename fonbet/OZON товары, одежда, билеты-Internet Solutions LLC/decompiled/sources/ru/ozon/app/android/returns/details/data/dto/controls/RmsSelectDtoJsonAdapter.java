package ru.ozon.app.android.returns.details.data.dto.controls;

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
import ru.ozon.app.android.returns.details.data.dto.controls.RmsSelectDto;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsSelectDto$Option;", "nullableListOfOptionAdapter", "Lru/ozon/app/android/returns/details/data/dto/controls/RmsSizeDto;", "nullableRmsSizeDtoAdapter", "", "nullableBooleanAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsSelectDtoJsonAdapter extends JsonAdapter<RmsSelectDto> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<RmsSelectDto.Option>> nullableListOfOptionAdapter;

    @NotNull
    private final JsonAdapter<RmsSizeDto> nullableRmsSizeDtoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public RmsSelectDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, "options", "size", "filterable");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableListOfOptionAdapter = moshi.f(D.e(List.class, RmsSelectDto.Option.class), m11, "options");
        this.nullableRmsSizeDtoAdapter = moshi.f(RmsSizeDto.class, m11, "size");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "filterable");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(RmsSelectDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RmsSelectDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        List<RmsSelectDto.Option> list = null;
        RmsSizeDto rmsSizeDto = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.nullableListOfOptionAdapter.fromJson(reader);
            } else if (v11 == 2) {
                rmsSizeDto = this.nullableRmsSizeDtoAdapter.fromJson(reader);
            } else if (v11 == 3) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new RmsSelectDto(str, list, rmsSizeDto, bool);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RmsSelectDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("options");
        this.nullableListOfOptionAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("size");
        this.nullableRmsSizeDtoAdapter.mo44toJson(writer, (x) value.getSize());
        writer.w("filterable");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getFilterable());
        writer.p();
    }
}
