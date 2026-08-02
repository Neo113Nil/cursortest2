package ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice;

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
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateDeclaredPriceResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateDeclaredPriceResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateDeclaredPriceResponseDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateDeclaredPriceResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "inputStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ValidateDeclaredPriceResponseDTOJsonAdapter extends JsonAdapter<ValidateDeclaredPriceResponseDTO> {

    @NotNull
    private final JsonAdapter<InputMoleculeDTO.InputStatus> inputStatusAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ValidateDeclaredPriceResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("status", "message", "price", "notificationBar");
        M m11 = M.f71699a;
        this.inputStatusAdapter = moshi.f(InputMoleculeDTO.InputStatus.class, m11, "status");
        this.stringAdapter = moshi.f(String.class, m11, "message");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "notificationBar");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(ValidateDeclaredPriceResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ValidateDeclaredPriceResponseDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        InputMoleculeDTO.InputStatus inputStatus = null;
        String str = null;
        String str2 = null;
        NotificationDTO notificationDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                inputStatus = this.inputStatusAdapter.fromJson(reader);
                if (inputStatus == null) {
                    throw c.q("status", "status", reader);
                }
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("message", "message", reader);
                }
            } else if (v11 == 2) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("price", "price", reader);
                }
            } else if (v11 == 3) {
                notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (inputStatus == null) {
            throw c.j("status", "status", reader);
        }
        if (str == null) {
            throw c.j("message", "message", reader);
        }
        if (str2 != null) {
            return new ValidateDeclaredPriceResponseDTO(inputStatus, str, str2, notificationDTO);
        }
        throw c.j("price", "price", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ValidateDeclaredPriceResponseDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("status");
        this.inputStatusAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("message");
        this.stringAdapter.mo44toJson(writer, (x) value.getMessage());
        writer.w("price");
        this.stringAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("notificationBar");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getNotificationBar());
        writer.p();
    }
}
