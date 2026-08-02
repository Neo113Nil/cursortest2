package ru.ozon.app.android.account.orders.cancel.data;

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
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsActionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsAction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsAction;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsAction;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "nullableConfirmingCancellationPopoverAdapter", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FetchCancelPostingsActionJsonAdapter extends JsonAdapter<FetchCancelPostingsAction> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ConfirmingCancellationPopover> nullableConfirmingCancellationPopoverAdapter;

    @NotNull
    private final n.a options;

    public FetchCancelPostingsActionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("nextAction", "popover");
        M m11 = M.f71699a;
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "nextAction");
        this.nullableConfirmingCancellationPopoverAdapter = moshi.f(ConfirmingCancellationPopover.class, m11, "popover");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(FetchCancelPostingsAction)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FetchCancelPostingsAction fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AtomActionDTO atomActionDTO = null;
        ConfirmingCancellationPopover confirmingCancellationPopover = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                if (atomActionDTO == null) {
                    throw c.q("nextAction", "nextAction", reader);
                }
            } else if (v11 == 1) {
                confirmingCancellationPopover = this.nullableConfirmingCancellationPopoverAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (atomActionDTO != null) {
            return new FetchCancelPostingsAction(atomActionDTO, confirmingCancellationPopover);
        }
        throw c.j("nextAction", "nextAction", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FetchCancelPostingsAction value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("nextAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getNextAction());
        writer.w("popover");
        this.nullableConfirmingCancellationPopoverAdapter.mo44toJson(writer, (x) value.getPopover());
        writer.p();
    }
}
