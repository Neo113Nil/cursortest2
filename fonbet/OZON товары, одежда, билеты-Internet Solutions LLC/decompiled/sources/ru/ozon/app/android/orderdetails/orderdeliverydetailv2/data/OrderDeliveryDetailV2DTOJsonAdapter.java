package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data;

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
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.LeaveAtDoor;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "listElementAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "nullableLeaveAtDoorAdapter", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableListOfLargeBorderlessButtonAdapter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailV2DTOJsonAdapter extends JsonAdapter<OrderDeliveryDetailV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ListElementAtom.ListElement> listElementAdapter;

    @NotNull
    private final JsonAdapter<LeaveAtDoor> nullableLeaveAtDoorAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.LargeBorderlessButton>> nullableListOfLargeBorderlessButtonAdapter;

    @NotNull
    private final n.a options;

    public OrderDeliveryDetailV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "leaveAtDoor", "actions");
        M m11 = M.f71699a;
        this.listElementAdapter = moshi.f(ListElementAtom.ListElement.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableLeaveAtDoorAdapter = moshi.f(LeaveAtDoor.class, m11, "leaveAtDoor");
        this.nullableListOfLargeBorderlessButtonAdapter = moshi.f(D.e(List.class, ButtonV3Atom.LargeBorderlessButton.class), m11, "actions");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(OrderDeliveryDetailV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderDeliveryDetailV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ListElementAtom.ListElement listElement = null;
        LeaveAtDoor leaveAtDoor = null;
        List<ButtonV3Atom.LargeBorderlessButton> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                listElement = this.listElementAdapter.fromJson(reader);
                if (listElement == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                leaveAtDoor = this.nullableLeaveAtDoorAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.nullableListOfLargeBorderlessButtonAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (listElement != null) {
            return new OrderDeliveryDetailV2DTO(listElement, leaveAtDoor, list);
        }
        throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderDeliveryDetailV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.listElementAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("leaveAtDoor");
        this.nullableLeaveAtDoorAdapter.mo44toJson(writer, (x) value.getLeaveAtDoor());
        writer.w("actions");
        this.nullableListOfLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getActions());
        writer.p();
    }
}
