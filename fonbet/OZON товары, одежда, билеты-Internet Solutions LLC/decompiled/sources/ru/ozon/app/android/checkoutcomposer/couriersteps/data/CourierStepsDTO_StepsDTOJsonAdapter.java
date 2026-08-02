package ru.ozon.app.android.checkoutcomposer.couriersteps.data;

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
import ru.ozon.app.android.checkoutcomposer.couriersteps.data.CourierStepsDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO_StepsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO$StepsGroupDTO;", "stepsGroupDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierStepsDTO_StepsDTOJsonAdapter extends JsonAdapter<CourierStepsDTO.StepsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CourierStepsDTO.StepsDTO.StepsGroupDTO> stepsGroupDTOAdapter;

    public CourierStepsDTO_StepsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("total", AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        this.stepsGroupDTOAdapter = moshi.f(CourierStepsDTO.StepsDTO.StepsGroupDTO.class, M.f71699a, "total");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(CourierStepsDTO.StepsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CourierStepsDTO.StepsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CourierStepsDTO.StepsDTO.StepsGroupDTO stepsGroupDTO = null;
        CourierStepsDTO.StepsDTO.StepsGroupDTO stepsGroupDTO2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                stepsGroupDTO = this.stepsGroupDTOAdapter.fromJson(reader);
                if (stepsGroupDTO == null) {
                    throw c.q("total", "total", reader);
                }
            } else if (v11 == 1 && (stepsGroupDTO2 = this.stepsGroupDTOAdapter.fromJson(reader)) == null) {
                throw c.q(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, reader);
            }
        }
        reader.endObject();
        if (stepsGroupDTO == null) {
            throw c.j("total", "total", reader);
        }
        if (stepsGroupDTO2 != null) {
            return new CourierStepsDTO.StepsDTO(stepsGroupDTO, stepsGroupDTO2);
        }
        throw c.j(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CourierStepsDTO.StepsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("total");
        this.stepsGroupDTOAdapter.mo44toJson(writer, (x) value.getTotal());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        this.stepsGroupDTOAdapter.mo44toJson(writer, (x) value.getActive());
        writer.p();
    }
}
