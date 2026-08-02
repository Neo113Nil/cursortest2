package ru.ozon.inapp.push.sdk.internal.data.dto;

import Ak.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponse;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "nullableStringAdapter", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionProcessResponseJsonAdapter extends JsonAdapter<ActionProcessResponse> {

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ActionProcessResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("notificationBar", "refreshInterval", "pixelUrl");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<NotificationDTO> f7 = moshi.f(NotificationDTO.class, m11, "notificationBar");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableNotificationDTOAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.class, m11, "refreshIntervalSec");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIntAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "pixelUrl");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(ActionProcessResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionProcessResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        NotificationDTO notificationDTO = null;
        Integer num = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ActionProcessResponse(notificationDTO, num, str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionProcessResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("notificationBar");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value_.getNotificationBar());
        writer.w("refreshInterval");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getRefreshIntervalSec());
        writer.w("pixelUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPixelUrl());
        writer.p();
    }
}
