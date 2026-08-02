package ru.ozon.id.nativeauth.data.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthActionDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/data/models/AuthActionDTO$StatusDTO;", "nullableStatusDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$FastEntryDataDTO;", "nullableFastEntryDataDTOAdapter", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "nullableErrorDTOAdapter", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$EntryNotification;", "nullableEntryNotificationAdapter", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$SharedStoreKeysInfo;", "nullableSharedStoreKeysInfoAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FastEntryActionDTOJsonAdapter extends JsonAdapter<FastEntryActionDTO> {

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.EntryNotification> nullableEntryNotificationAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.ErrorDTO> nullableErrorDTOAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.FastEntryDataDTO> nullableFastEntryDataDTOAdapter;

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.SharedStoreKeysInfo> nullableSharedStoreKeysInfoAdapter;

    @NotNull
    private final JsonAdapter<AuthActionDTO.StatusDTO> nullableStatusDTOAdapter;

    @NotNull
    private final n.a options;

    public FastEntryActionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("status", "data", "error", "notification", "sharedStoreKeysInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<AuthActionDTO.StatusDTO> f7 = moshi.f(AuthActionDTO.StatusDTO.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStatusDTOAdapter = f7;
        JsonAdapter<FastEntryActionDTO.FastEntryDataDTO> f11 = moshi.f(FastEntryActionDTO.FastEntryDataDTO.class, m11, "data");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableFastEntryDataDTOAdapter = f11;
        JsonAdapter<FastEntryActionDTO.ErrorDTO> f12 = moshi.f(FastEntryActionDTO.ErrorDTO.class, m11, "error");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableErrorDTOAdapter = f12;
        JsonAdapter<FastEntryActionDTO.EntryNotification> f13 = moshi.f(FastEntryActionDTO.EntryNotification.class, m11, "notification");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableEntryNotificationAdapter = f13;
        JsonAdapter<FastEntryActionDTO.SharedStoreKeysInfo> f14 = moshi.f(FastEntryActionDTO.SharedStoreKeysInfo.class, m11, "sharedStoreKeysInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableSharedStoreKeysInfoAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(FastEntryActionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FastEntryActionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AuthActionDTO.StatusDTO statusDTO = null;
        FastEntryActionDTO.FastEntryDataDTO fastEntryDataDTO = null;
        FastEntryActionDTO.ErrorDTO errorDTO = null;
        FastEntryActionDTO.EntryNotification entryNotification = null;
        FastEntryActionDTO.SharedStoreKeysInfo sharedStoreKeysInfo = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                statusDTO = this.nullableStatusDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                fastEntryDataDTO = this.nullableFastEntryDataDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                errorDTO = this.nullableErrorDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                entryNotification = this.nullableEntryNotificationAdapter.fromJson(reader);
            } else if (v11 == 4) {
                sharedStoreKeysInfo = this.nullableSharedStoreKeysInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new FastEntryActionDTO(statusDTO, fastEntryDataDTO, errorDTO, entryNotification, sharedStoreKeysInfo);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FastEntryActionDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("status");
        this.nullableStatusDTOAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("data");
        this.nullableFastEntryDataDTOAdapter.mo44toJson(writer, (x) value_.getData());
        writer.w("error");
        this.nullableErrorDTOAdapter.mo44toJson(writer, (x) value_.getError());
        writer.w("notification");
        this.nullableEntryNotificationAdapter.mo44toJson(writer, (x) value_.getNotification());
        writer.w("sharedStoreKeysInfo");
        this.nullableSharedStoreKeysInfoAdapter.mo44toJson(writer, (x) value_.getSharedStoreKeysInfo());
        writer.p();
    }
}
