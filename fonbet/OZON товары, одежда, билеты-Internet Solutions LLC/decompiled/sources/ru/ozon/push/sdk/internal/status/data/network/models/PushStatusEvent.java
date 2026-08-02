package ru.ozon.push.sdk.internal.status.data.network.models;

import Kk.C3532b;
import Pk0.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.status.data.network.models.PushstatusRequestBodyV3;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\b\u0081\b\u0018\u00002\u00020\u0001:\u0002MNB¥\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001aJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001aJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001aJ®\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001aJ\u0010\u00103\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\b\f\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bE\u0010\u001eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bH\u0010\u001aR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\b\u0013\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bJ\u0010\u001aR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bK\u0010\u001aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bL\u0010\u001a¨\u0006O"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent;", "", "", "messageId", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;", "status", "", "messageReceiptTimestamp", "eventSendingTimestamp", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;", "senderPlace", "", "isRequestTrigger", "", "sendingAttemptNumber", "pushServiceStartupTime", "Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "deviceStatsAtReceive", "deliveryStatus", "isTeensMode", "priority", "originalPriority", "firstMessageId", "<init>", "(Ljava/lang/String;Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;Ljava/lang/Long;JLru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;ZLjava/lang/Integer;Ljava/lang/Long;Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;", "component3", "()Ljava/lang/Long;", "component4", "()J", "component5", "()Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;", "component6", "()Z", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "component10", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;Ljava/lang/Long;JLru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;ZLjava/lang/Integer;Ljava/lang/Long;Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;", "getStatus", "Ljava/lang/Long;", "getMessageReceiptTimestamp", "J", "getEventSendingTimestamp", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;", "getSenderPlace", "Z", "Ljava/lang/Integer;", "getSendingAttemptNumber", "getPushServiceStartupTime", "Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "getDeviceStatsAtReceive", "getDeliveryStatus", "Ljava/lang/Boolean;", "getPriority", "getOriginalPriority", "getFirstMessageId", "b", "a", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PushStatusEvent {
    private final String deliveryStatus;
    private final PushstatusRequestBodyV3.DeviceStats deviceStatsAtReceive;
    private final long eventSendingTimestamp;
    private final String firstMessageId;
    private final boolean isRequestTrigger;
    private final Boolean isTeensMode;

    @NotNull
    private final String messageId;
    private final Long messageReceiptTimestamp;
    private final String originalPriority;
    private final String priority;
    private final Long pushServiceStartupTime;

    @NotNull
    private final a senderPlace;
    private final Integer sendingAttemptNumber;

    @NotNull
    private final b status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$a;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFICATION_EXTENSION", "APP_LAUNCH", "TASK_MANAGER", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NOTIFICATION_EXTENSION = new a("NOTIFICATION_EXTENSION", 0);
        public static final a APP_LAUNCH = new a("APP_LAUNCH", 1);
        public static final a TASK_MANAGER = new a("TASK_MANAGER", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NOTIFICATION_EXTENSION, APP_LAUNCH, TASK_MANAGER};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private a(String str, int i11) {
        }

        @NotNull
        public static Xc.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent$b;", "", "<init>", "(Ljava/lang/String;I)V", "DELIVERY", "OPEN", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DELIVERY = new b("DELIVERY", 0);
        public static final b OPEN = new b("OPEN", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{DELIVERY, OPEN};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private b(String str, int i11) {
        }

        @NotNull
        public static Xc.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public PushStatusEvent(@i(name = "messageID") @NotNull String messageId, @i(name = "status") @NotNull b status, @i(name = "event_ms_ts") Long l11, @i(name = "send_ms_ts") long j11, @i(name = "sender_place") @NotNull a senderPlace, @i(name = "in_place") boolean z11, @i(name = "send_retry") Integer num, @i(name = "extension_up_duration") Long l12, @i(name = "stats") PushstatusRequestBodyV3.DeviceStats deviceStats, @i(name = "delivery_status") String str, @i(name = "is_teens_mode") Boolean bool, @i(name = "priority") String str2, @i(name = "original_priority") String str3, @i(name = "first_message_id") String str4) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        this.messageId = messageId;
        this.status = status;
        this.messageReceiptTimestamp = l11;
        this.eventSendingTimestamp = j11;
        this.senderPlace = senderPlace;
        this.isRequestTrigger = z11;
        this.sendingAttemptNumber = num;
        this.pushServiceStartupTime = l12;
        this.deviceStatsAtReceive = deviceStats;
        this.deliveryStatus = str;
        this.isTeensMode = bool;
        this.priority = str2;
        this.originalPriority = str3;
        this.firstMessageId = str4;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsTeensMode() {
        return this.isTeensMode;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPriority() {
        return this.priority;
    }

    /* renamed from: component13, reason: from getter */
    public final String getOriginalPriority() {
        return this.originalPriority;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFirstMessageId() {
        return this.firstMessageId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getMessageReceiptTimestamp() {
        return this.messageReceiptTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEventSendingTimestamp() {
        return this.eventSendingTimestamp;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final a getSenderPlace() {
        return this.senderPlace;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRequestTrigger() {
        return this.isRequestTrigger;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getSendingAttemptNumber() {
        return this.sendingAttemptNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getPushServiceStartupTime() {
        return this.pushServiceStartupTime;
    }

    /* renamed from: component9, reason: from getter */
    public final PushstatusRequestBodyV3.DeviceStats getDeviceStatsAtReceive() {
        return this.deviceStatsAtReceive;
    }

    @NotNull
    public final PushStatusEvent copy(@i(name = "messageID") @NotNull String messageId, @i(name = "status") @NotNull b status, @i(name = "event_ms_ts") Long messageReceiptTimestamp, @i(name = "send_ms_ts") long eventSendingTimestamp, @i(name = "sender_place") @NotNull a senderPlace, @i(name = "in_place") boolean isRequestTrigger, @i(name = "send_retry") Integer sendingAttemptNumber, @i(name = "extension_up_duration") Long pushServiceStartupTime, @i(name = "stats") PushstatusRequestBodyV3.DeviceStats deviceStatsAtReceive, @i(name = "delivery_status") String deliveryStatus, @i(name = "is_teens_mode") Boolean isTeensMode, @i(name = "priority") String priority, @i(name = "original_priority") String originalPriority, @i(name = "first_message_id") String firstMessageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(senderPlace, "senderPlace");
        return new PushStatusEvent(messageId, status, messageReceiptTimestamp, eventSendingTimestamp, senderPlace, isRequestTrigger, sendingAttemptNumber, pushServiceStartupTime, deviceStatsAtReceive, deliveryStatus, isTeensMode, priority, originalPriority, firstMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushStatusEvent)) {
            return false;
        }
        PushStatusEvent pushStatusEvent = (PushStatusEvent) other;
        return Intrinsics.d(this.messageId, pushStatusEvent.messageId) && this.status == pushStatusEvent.status && Intrinsics.d(this.messageReceiptTimestamp, pushStatusEvent.messageReceiptTimestamp) && this.eventSendingTimestamp == pushStatusEvent.eventSendingTimestamp && this.senderPlace == pushStatusEvent.senderPlace && this.isRequestTrigger == pushStatusEvent.isRequestTrigger && Intrinsics.d(this.sendingAttemptNumber, pushStatusEvent.sendingAttemptNumber) && Intrinsics.d(this.pushServiceStartupTime, pushStatusEvent.pushServiceStartupTime) && Intrinsics.d(this.deviceStatsAtReceive, pushStatusEvent.deviceStatsAtReceive) && Intrinsics.d(this.deliveryStatus, pushStatusEvent.deliveryStatus) && Intrinsics.d(this.isTeensMode, pushStatusEvent.isTeensMode) && Intrinsics.d(this.priority, pushStatusEvent.priority) && Intrinsics.d(this.originalPriority, pushStatusEvent.originalPriority) && Intrinsics.d(this.firstMessageId, pushStatusEvent.firstMessageId);
    }

    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public final PushstatusRequestBodyV3.DeviceStats getDeviceStatsAtReceive() {
        return this.deviceStatsAtReceive;
    }

    public final long getEventSendingTimestamp() {
        return this.eventSendingTimestamp;
    }

    public final String getFirstMessageId() {
        return this.firstMessageId;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public final Long getMessageReceiptTimestamp() {
        return this.messageReceiptTimestamp;
    }

    public final String getOriginalPriority() {
        return this.originalPriority;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final Long getPushServiceStartupTime() {
        return this.pushServiceStartupTime;
    }

    @NotNull
    public final a getSenderPlace() {
        return this.senderPlace;
    }

    public final Integer getSendingAttemptNumber() {
        return this.sendingAttemptNumber;
    }

    @NotNull
    public final b getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (this.messageId.hashCode() * 31)) * 31;
        Long l11 = this.messageReceiptTimestamp;
        int a11 = C3532b.a((this.senderPlace.hashCode() + c.a((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.eventSendingTimestamp)) * 31, 31, this.isRequestTrigger);
        Integer num = this.sendingAttemptNumber;
        int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.pushServiceStartupTime;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        PushstatusRequestBodyV3.DeviceStats deviceStats = this.deviceStatsAtReceive;
        int hashCode4 = (hashCode3 + (deviceStats == null ? 0 : deviceStats.hashCode())) * 31;
        String str = this.deliveryStatus;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isTeensMode;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.priority;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalPriority;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstMessageId;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isRequestTrigger() {
        return this.isRequestTrigger;
    }

    public final Boolean isTeensMode() {
        return this.isTeensMode;
    }

    @NotNull
    public String toString() {
        String str = this.messageId;
        b bVar = this.status;
        Long l11 = this.messageReceiptTimestamp;
        long j11 = this.eventSendingTimestamp;
        a aVar = this.senderPlace;
        boolean z11 = this.isRequestTrigger;
        Integer num = this.sendingAttemptNumber;
        Long l12 = this.pushServiceStartupTime;
        PushstatusRequestBodyV3.DeviceStats deviceStats = this.deviceStatsAtReceive;
        String str2 = this.deliveryStatus;
        Boolean bool = this.isTeensMode;
        String str3 = this.priority;
        String str4 = this.originalPriority;
        String str5 = this.firstMessageId;
        StringBuilder sb2 = new StringBuilder("PushStatusEvent(messageId=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(bVar);
        sb2.append(", messageReceiptTimestamp=");
        sb2.append(l11);
        sb2.append(", eventSendingTimestamp=");
        sb2.append(j11);
        sb2.append(", senderPlace=");
        sb2.append(aVar);
        sb2.append(", isRequestTrigger=");
        sb2.append(z11);
        sb2.append(", sendingAttemptNumber=");
        sb2.append(num);
        sb2.append(", pushServiceStartupTime=");
        sb2.append(l12);
        sb2.append(", deviceStatsAtReceive=");
        sb2.append(deviceStats);
        sb2.append(", deliveryStatus=");
        sb2.append(str2);
        sb2.append(", isTeensMode=");
        sb2.append(bool);
        sb2.append(", priority=");
        sb2.append(str3);
        Nh.a.h(sb2, ", originalPriority=", str4, ", firstMessageId=", str5);
        sb2.append(")");
        return sb2.toString();
    }
}
