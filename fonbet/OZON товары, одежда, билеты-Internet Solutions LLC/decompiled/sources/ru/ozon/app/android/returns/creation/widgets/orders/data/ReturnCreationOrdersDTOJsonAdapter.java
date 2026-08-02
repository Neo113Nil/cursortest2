package ru.ozon.app.android.returns.creation.widgets.orders.data;

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
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryGroupDTO;
import ru.ozon.app.android.returns.ui.molecules.opencloud.data.OpenCloudDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/data/ReturnCreationOrdersDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/orders/data/ReturnCreationOrdersDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/orders/data/ReturnCreationOrdersDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/orders/data/ReturnCreationOrdersDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;", "nullableOpenCloudDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupDTO;", "nullableListOfDeliveryGroupDTOAdapter", "Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "nullablePaginationDTOAdapter", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationOrdersDTOJsonAdapter extends JsonAdapter<ReturnCreationOrdersDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<DeliveryGroupDTO>> nullableListOfDeliveryGroupDTOAdapter;

    @NotNull
    private final JsonAdapter<OpenCloudDTO> nullableOpenCloudDTOAdapter;

    @NotNull
    private final JsonAdapter<PaginationDTO> nullablePaginationDTOAdapter;

    @NotNull
    private final n.a options;

    public ReturnCreationOrdersDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("openCloud", "orders", "pagination");
        M m11 = M.f71699a;
        this.nullableOpenCloudDTOAdapter = moshi.f(OpenCloudDTO.class, m11, "openCloud");
        this.nullableListOfDeliveryGroupDTOAdapter = moshi.f(D.e(List.class, DeliveryGroupDTO.class), m11, "orders");
        this.nullablePaginationDTOAdapter = moshi.f(PaginationDTO.class, m11, "pagination");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(ReturnCreationOrdersDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnCreationOrdersDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        OpenCloudDTO openCloudDTO = null;
        List<DeliveryGroupDTO> list = null;
        PaginationDTO paginationDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                openCloudDTO = this.nullableOpenCloudDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.nullableListOfDeliveryGroupDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                paginationDTO = this.nullablePaginationDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ReturnCreationOrdersDTO(openCloudDTO, list, paginationDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnCreationOrdersDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("openCloud");
        this.nullableOpenCloudDTOAdapter.mo44toJson(writer, (x) value.getOpenCloud());
        writer.w("orders");
        this.nullableListOfDeliveryGroupDTOAdapter.mo44toJson(writer, (x) value.getOrders());
        writer.w("pagination");
        this.nullablePaginationDTOAdapter.mo44toJson(writer, (x) value.getPagination());
        writer.p();
    }
}
