package ru.ozon.app.android.returns.creation.widgets.photopickerunified.data;

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
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ReturnCreationPhotoPickerUnifiedDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO_NotificationsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerUnifiedDTO_NotificationsDTOJsonAdapter extends JsonAdapter<ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<NotificationDTO> notificationDTOAdapter;

    @NotNull
    private final n.a options;

    public ReturnCreationPhotoPickerUnifiedDTO_NotificationsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("minCountRestriction", "uploadInProgress", "uploadFailed", "continueFailed");
        this.notificationDTOAdapter = moshi.f(NotificationDTO.class, M.f71699a, "minCountRestriction");
    }

    @NotNull
    public String toString() {
        return b.c(74, "GeneratedJsonAdapter(ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        NotificationDTO notificationDTO = null;
        NotificationDTO notificationDTO2 = null;
        NotificationDTO notificationDTO3 = null;
        NotificationDTO notificationDTO4 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                notificationDTO = this.notificationDTOAdapter.fromJson(reader);
                if (notificationDTO == null) {
                    throw c.q("minCountRestriction", "minCountRestriction", reader);
                }
            } else if (v11 == 1) {
                notificationDTO2 = this.notificationDTOAdapter.fromJson(reader);
                if (notificationDTO2 == null) {
                    throw c.q("uploadInProgress", "uploadInProgress", reader);
                }
            } else if (v11 == 2) {
                notificationDTO3 = this.notificationDTOAdapter.fromJson(reader);
                if (notificationDTO3 == null) {
                    throw c.q("uploadFailed", "uploadFailed", reader);
                }
            } else if (v11 == 3 && (notificationDTO4 = this.notificationDTOAdapter.fromJson(reader)) == null) {
                throw c.q("continueFailed", "continueFailed", reader);
            }
        }
        reader.endObject();
        if (notificationDTO == null) {
            throw c.j("minCountRestriction", "minCountRestriction", reader);
        }
        if (notificationDTO2 == null) {
            throw c.j("uploadInProgress", "uploadInProgress", reader);
        }
        if (notificationDTO3 == null) {
            throw c.j("uploadFailed", "uploadFailed", reader);
        }
        if (notificationDTO4 != null) {
            return new ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO(notificationDTO, notificationDTO2, notificationDTO3, notificationDTO4);
        }
        throw c.j("continueFailed", "continueFailed", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("minCountRestriction");
        this.notificationDTOAdapter.mo44toJson(writer, (x) value.getMinCountRestriction());
        writer.w("uploadInProgress");
        this.notificationDTOAdapter.mo44toJson(writer, (x) value.getUploadInProgress());
        writer.w("uploadFailed");
        this.notificationDTOAdapter.mo44toJson(writer, (x) value.getUploadFailed());
        writer.w("continueFailed");
        this.notificationDTOAdapter.mo44toJson(writer, (x) value.getContinueFailed());
        writer.p();
    }
}
