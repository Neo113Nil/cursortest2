package ru.ozon.push.sdk.internal.status.data.network.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.network.models.PushStatusEvent;
import ru.ozon.push.sdk.internal.status.data.network.models.PushstatusRequestBodyV3;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;", "statusAdapter", "", "nullableLongAdapter", "longAdapter", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;", "senderPlaceAdapter", "", "booleanAdapter", "", "nullableIntAdapter", "Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "nullableDeviceStatsAdapter", "nullableStringAdapter", "nullableBooleanAdapter", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushStatusEventJsonAdapter extends JsonAdapter<PushStatusEvent> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<PushstatusRequestBodyV3.DeviceStats> nullableDeviceStatsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PushStatusEvent.a> senderPlaceAdapter;

    @NotNull
    private final JsonAdapter<PushStatusEvent.b> statusAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PushStatusEventJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("messageID", "status", "event_ms_ts", "send_ms_ts", "sender_place", "in_place", "send_retry", "extension_up_duration", "stats", "delivery_status", "is_teens_mode", "priority", "original_priority", "first_message_id");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "messageId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<PushStatusEvent.b> f11 = moshi.f(PushStatusEvent.b.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.statusAdapter = f11;
        JsonAdapter<Long> f12 = moshi.f(Long.class, m11, "messageReceiptTimestamp");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLongAdapter = f12;
        JsonAdapter<Long> f13 = moshi.f(Long.TYPE, m11, "eventSendingTimestamp");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.longAdapter = f13;
        JsonAdapter<PushStatusEvent.a> f14 = moshi.f(PushStatusEvent.a.class, m11, "senderPlace");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.senderPlaceAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.TYPE, m11, "isRequestTrigger");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.booleanAdapter = f15;
        JsonAdapter<Integer> f16 = moshi.f(Integer.class, m11, "sendingAttemptNumber");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableIntAdapter = f16;
        JsonAdapter<PushstatusRequestBodyV3.DeviceStats> f17 = moshi.f(PushstatusRequestBodyV3.DeviceStats.class, m11, "deviceStatsAtReceive");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableDeviceStatsAdapter = f17;
        JsonAdapter<String> f18 = moshi.f(String.class, m11, "deliveryStatus");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableStringAdapter = f18;
        JsonAdapter<Boolean> f19 = moshi.f(Boolean.class, m11, "isTeensMode");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableBooleanAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(PushStatusEvent)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PushStatusEvent fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Boolean bool = null;
        String str = null;
        PushStatusEvent.b bVar = null;
        Long l12 = null;
        PushStatusEvent.a aVar = null;
        Integer num = null;
        Long l13 = null;
        PushstatusRequestBodyV3.DeviceStats deviceStats = null;
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            Long l14 = l11;
            Boolean bool3 = bool;
            String str6 = str;
            PushStatusEvent.b bVar2 = bVar;
            Long l15 = l12;
            PushStatusEvent.a aVar2 = aVar;
            if (!reader.hasNext()) {
                Integer num2 = num;
                reader.endObject();
                if (str6 == null) {
                    throw c.j("messageId", "messageID", reader);
                }
                if (bVar2 == null) {
                    throw c.j("status", "status", reader);
                }
                if (l14 == null) {
                    throw c.j("eventSendingTimestamp", "send_ms_ts", reader);
                }
                long longValue = l14.longValue();
                if (aVar2 == null) {
                    throw c.j("senderPlace", "sender_place", reader);
                }
                if (bool3 != null) {
                    return new PushStatusEvent(str6, bVar2, l15, longValue, aVar2, bool3.booleanValue(), num2, l13, deviceStats, str2, bool2, str3, str4, str5);
                }
                throw c.j("isRequestTrigger", "in_place", reader);
            }
            Integer num3 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("messageId", "messageID", reader);
                    }
                    l11 = l14;
                    bool = bool3;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 1:
                    bVar = this.statusAdapter.fromJson(reader);
                    if (bVar == null) {
                        throw c.q("status", "status", reader);
                    }
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 2:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    num = num3;
                    aVar = aVar2;
                case 3:
                    Long fromJson = this.longAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("eventSendingTimestamp", "send_ms_ts", reader);
                    }
                    l11 = fromJson;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 4:
                    aVar = this.senderPlaceAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw c.q("senderPlace", "sender_place", reader);
                    }
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isRequestTrigger", "in_place", reader);
                    }
                    l11 = l14;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    aVar = aVar2;
                case 7:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 8:
                    deviceStats = this.nullableDeviceStatsAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 10:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 12:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                case 13:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
                default:
                    l11 = l14;
                    bool = bool3;
                    str = str6;
                    bVar = bVar2;
                    l12 = l15;
                    num = num3;
                    aVar = aVar2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PushStatusEvent value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("messageID");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMessageId());
        writer.w("status");
        this.statusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("event_ms_ts");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getMessageReceiptTimestamp());
        writer.w("send_ms_ts");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getEventSendingTimestamp()));
        writer.w("sender_place");
        this.senderPlaceAdapter.mo44toJson(writer, (x) value_.getSenderPlace());
        writer.w("in_place");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isRequestTrigger()));
        writer.w("send_retry");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getSendingAttemptNumber());
        writer.w("extension_up_duration");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getPushServiceStartupTime());
        writer.w("stats");
        this.nullableDeviceStatsAdapter.mo44toJson(writer, (x) value_.getDeviceStatsAtReceive());
        writer.w("delivery_status");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDeliveryStatus());
        writer.w("is_teens_mode");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isTeensMode());
        writer.w("priority");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPriority());
        writer.w("original_priority");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOriginalPriority());
        writer.w("first_message_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirstMessageId());
        writer.p();
    }
}
