package ru.ozon.app.android.cart.ui.thermometer.data;

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
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO_ThermometerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ThermometerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$ProgressDTO;", "progressDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/ui/thermometer/data/ThermometerMoleculeDTO$StatusDTO;", "nullableStatusDTOAdapter", "", "nullableIntAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThermometerMoleculeDTO_ThermometerDTOJsonAdapter extends JsonAdapter<ThermometerMoleculeDTO.ThermometerDTO> {

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<ThermometerMoleculeDTO.StatusDTO> nullableStatusDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ThermometerMoleculeDTO.ProgressDTO> progressDTOAdapter;

    public ThermometerMoleculeDTO_ThermometerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("progress", "status", "verticalPadding", "horizontalPadding");
        M m11 = M.f71699a;
        this.progressDTOAdapter = moshi.f(ThermometerMoleculeDTO.ProgressDTO.class, m11, "progress");
        this.nullableStatusDTOAdapter = moshi.f(ThermometerMoleculeDTO.StatusDTO.class, m11, "status");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "verticalPadding");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(ThermometerMoleculeDTO.ThermometerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ThermometerMoleculeDTO.ThermometerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ThermometerMoleculeDTO.ProgressDTO progressDTO = null;
        ThermometerMoleculeDTO.StatusDTO statusDTO = null;
        Integer num = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                progressDTO = this.progressDTOAdapter.fromJson(reader);
                if (progressDTO == null) {
                    throw c.q("progress", "progress", reader);
                }
            } else if (v11 == 1) {
                statusDTO = this.nullableStatusDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 3) {
                num2 = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (progressDTO != null) {
            return new ThermometerMoleculeDTO.ThermometerDTO(progressDTO, statusDTO, num, num2);
        }
        throw c.j("progress", "progress", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ThermometerMoleculeDTO.ThermometerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("progress");
        this.progressDTOAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("status");
        this.nullableStatusDTOAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("verticalPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getVerticalPadding());
        writer.w("horizontalPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.p();
    }
}
