package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data;

import Ak.b;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentsResponse;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse_ResponseInputsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentsResponse$ResponseInputs;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "nullableCommonInputDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentsResponse_ResponseInputsJsonAdapter extends JsonAdapter<ReportDocumentsResponse.ResponseInputs> {

    @NotNull
    private final JsonAdapter<CommonInputDTO> nullableCommonInputDTOAdapter;

    @NotNull
    private final n.a options;

    public ReportDocumentsResponse_ResponseInputsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("fromDate", "toDate", Scopes.EMAIL);
        this.nullableCommonInputDTOAdapter = moshi.f(CommonInputDTO.class, M.f71699a, "fromDate");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(ReportDocumentsResponse.ResponseInputs)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReportDocumentsResponse.ResponseInputs fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CommonInputDTO commonInputDTO = null;
        CommonInputDTO commonInputDTO2 = null;
        CommonInputDTO commonInputDTO3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                commonInputDTO = this.nullableCommonInputDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                commonInputDTO2 = this.nullableCommonInputDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                commonInputDTO3 = this.nullableCommonInputDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ReportDocumentsResponse.ResponseInputs(commonInputDTO, commonInputDTO2, commonInputDTO3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReportDocumentsResponse.ResponseInputs value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("fromDate");
        this.nullableCommonInputDTOAdapter.mo44toJson(writer, (x) value.getFromDate());
        writer.w("toDate");
        this.nullableCommonInputDTOAdapter.mo44toJson(writer, (x) value.getToDate());
        writer.w(Scopes.EMAIL);
        this.nullableCommonInputDTOAdapter.mo44toJson(writer, (x) value.getEmail());
        writer.p();
    }
}
