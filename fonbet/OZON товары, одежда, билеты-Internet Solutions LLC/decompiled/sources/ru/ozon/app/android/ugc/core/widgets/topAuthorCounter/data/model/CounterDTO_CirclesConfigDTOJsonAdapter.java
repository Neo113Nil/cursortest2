package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model;

import Ak.b;
import Y9.c;
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
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.CounterDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO_CirclesConfigDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "", "nullableListOfStringAdapter", "nullableStringAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CounterDTO_CirclesConfigDTOJsonAdapter extends JsonAdapter<CounterDTO.CirclesConfigDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CounterDTO_CirclesConfigDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("totalCount", "progressCount", "activeIcon", "inactiveIcon", "activeLineGradientColor", "inactiveLineBackgroundColor");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "totalCount");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "activeIcon");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "activeLineGradientColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "inactiveLineBackgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(CounterDTO.CirclesConfigDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CounterDTO.CirclesConfigDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        List<String> list = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("totalCount", "totalCount", reader);
                    }
                    break;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("progressCount", "progressCount", reader);
                    }
                    break;
                case 2:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("activeIcon", "activeIcon", reader);
                    }
                    break;
                case 3:
                    iconDTO2 = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO2 == null) {
                        throw c.q("inactiveIcon", "inactiveIcon", reader);
                    }
                    break;
                case 4:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("totalCount", "totalCount", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw c.j("progressCount", "progressCount", reader);
        }
        int intValue2 = num2.intValue();
        if (iconDTO == null) {
            throw c.j("activeIcon", "activeIcon", reader);
        }
        if (iconDTO2 != null) {
            return new CounterDTO.CirclesConfigDTO(intValue, intValue2, iconDTO, iconDTO2, list, str);
        }
        throw c.j("inactiveIcon", "inactiveIcon", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CounterDTO.CirclesConfigDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("totalCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getTotalCount()));
        writer.w("progressCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getProgressCount()));
        writer.w("activeIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getActiveIcon());
        writer.w("inactiveIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getInactiveIcon());
        writer.w("activeLineGradientColor");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getActiveLineGradientColor());
        writer.w("inactiveLineBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getInactiveLineBackgroundColor());
        writer.p();
    }
}
