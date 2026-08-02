package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.SubmitBloggerPersonalDataResponse;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Success;", "nullableSuccessAdapter", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/SubmitBloggerPersonalDataResponse$Error;", "nullableErrorAdapter", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubmitBloggerPersonalDataResponseJsonAdapter extends JsonAdapter<SubmitBloggerPersonalDataResponse> {

    @NotNull
    private final JsonAdapter<SubmitBloggerPersonalDataResponse.Error> nullableErrorAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final JsonAdapter<SubmitBloggerPersonalDataResponse.Success> nullableSuccessAdapter;

    @NotNull
    private final n.a options;

    public SubmitBloggerPersonalDataResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("notificationBar", "success", "error");
        M m11 = M.f71699a;
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "notificationBar");
        this.nullableSuccessAdapter = moshi.f(SubmitBloggerPersonalDataResponse.Success.class, m11, "success");
        this.nullableErrorAdapter = moshi.f(SubmitBloggerPersonalDataResponse.Error.class, m11, "error");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(SubmitBloggerPersonalDataResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SubmitBloggerPersonalDataResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        NotificationDTO notificationDTO = null;
        SubmitBloggerPersonalDataResponse.Success success = null;
        SubmitBloggerPersonalDataResponse.Error error = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                success = this.nullableSuccessAdapter.fromJson(reader);
            } else if (v11 == 2) {
                error = this.nullableErrorAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new SubmitBloggerPersonalDataResponse(notificationDTO, success, error);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SubmitBloggerPersonalDataResponse value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("notificationBar");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getNotificationBar());
        writer.w("success");
        this.nullableSuccessAdapter.mo44toJson(writer, (x) value.getSuccess());
        writer.w("error");
        this.nullableErrorAdapter.mo44toJson(writer, (x) value.getError());
        writer.p();
    }
}
