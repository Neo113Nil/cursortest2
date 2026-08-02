package ru.ozon.tracker.model;

import I1.w;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dk0.c;
import id.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.network.serializing.date.DateTimeWithMs;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b$\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Bk\b\u0016\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0002\u0010\u0011Bc\b\u0017\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R1\u0010\t\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078F@BX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b&\u0010!\u0012\u0004\b)\u0010\u0003\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-*\u0004\b.\u0010/R/\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-*\u0004\b2\u0010/R+\u0010\n\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b3\u0010+\"\u0004\b4\u0010-*\u0004\b5\u0010/R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b6\u00107\"\u0004\b8\u00109*\u0004\b:\u0010/R/\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>*\u0004\b?\u0010/¨\u0006@"}, d2 = {"Lru/ozon/tracker/model/CustomEventEntity;", "", "<init>", "()V", "", "uuid", "number", "Lorg/joda/time/DateTime;", "timestamp", "timestampMs", "version", "Lru/ozon/tracker/model/EventEntity$Attributes;", "attributes", "Lru/ozon/tracker/model/EventEntity$User;", "user", "", "custom", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Ljava/util/Map;)V", "getEventMap", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "map", "Ljava/util/Map;", "<set-?>", "timestamp$delegate", "Lid/f;", "getTimestamp", "()Lorg/joda/time/DateTime;", "setTimestamp", "(Lorg/joda/time/DateTime;)V", "timestampMs$delegate", "getTimestampMs", "setTimestampMs", "getTimestampMs$annotations", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "getUuid$delegate", "(Lru/ozon/tracker/model/CustomEventEntity;)Ljava/lang/Object;", "getNumber", "setNumber", "getNumber$delegate", "getVersion", "setVersion", "getVersion$delegate", "getAttributes", "()Lru/ozon/tracker/model/EventEntity$Attributes;", "setAttributes", "(Lru/ozon/tracker/model/EventEntity$Attributes;)V", "getAttributes$delegate", "getUser", "()Lru/ozon/tracker/model/EventEntity$User;", "setUser", "(Lru/ozon/tracker/model/EventEntity$User;)V", "getUser$delegate", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomEventEntity {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(CustomEventEntity.class, "uuid", "getUuid()Ljava/lang/String;", 0), w.c(CustomEventEntity.class, "number", "getNumber()Ljava/lang/String;", 0), w.c(CustomEventEntity.class, "timestamp", "getTimestamp()Lorg/joda/time/DateTime;", 0), w.c(CustomEventEntity.class, "timestampMs", "getTimestampMs()Lorg/joda/time/DateTime;", 0), w.c(CustomEventEntity.class, "version", "getVersion()Ljava/lang/String;", 0), w.c(CustomEventEntity.class, "attributes", "getAttributes()Lru/ozon/tracker/model/EventEntity$Attributes;", 0), w.c(CustomEventEntity.class, "user", "getUser()Lru/ozon/tracker/model/EventEntity$User;", 0)};

    @NotNull
    private final Map<String, Object> map;

    /* renamed from: timestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private final f timestamp;

    /* renamed from: timestampMs$delegate, reason: from kotlin metadata */
    @NotNull
    private final f timestampMs;

    private CustomEventEntity() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.map = linkedHashMap;
        this.timestamp = c.a(linkedHashMap);
        this.timestampMs = c.a(linkedHashMap);
    }

    @DateTimeWithMs
    public static /* synthetic */ void getTimestampMs$annotations() {
    }

    private final void setAttributes(EventEntity.Attributes attributes) {
        this.map.put($$delegatedProperties[5].getName(), attributes);
    }

    private final void setNumber(String str) {
        this.map.put($$delegatedProperties[1].getName(), str);
    }

    private final void setTimestamp(DateTime dateTime) {
        this.timestamp.setValue(this, $$delegatedProperties[2], dateTime);
    }

    private final void setTimestampMs(DateTime dateTime) {
        this.timestampMs.setValue(this, $$delegatedProperties[3], dateTime);
    }

    private final void setUser(EventEntity.User user) {
        this.map.put($$delegatedProperties[6].getName(), user);
    }

    private final void setUuid(String str) {
        this.map.put($$delegatedProperties[0].getName(), str);
    }

    private final void setVersion(String str) {
        this.map.put($$delegatedProperties[4].getName(), str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!CustomEventEntity.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.tracker.model.CustomEventEntity");
        return Intrinsics.d(this.map, ((CustomEventEntity) other).map);
    }

    public final EventEntity.Attributes getAttributes() {
        return (EventEntity.Attributes) U.d(this.map, $$delegatedProperties[5].getName());
    }

    @NotNull
    public final Map<String, Object> getEventMap() {
        return this.map;
    }

    public final String getNumber() {
        return (String) U.d(this.map, $$delegatedProperties[1].getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final DateTime getTimestamp() {
        return (DateTime) this.timestamp.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final DateTime getTimestampMs() {
        return (DateTime) this.timestampMs.getValue(this, $$delegatedProperties[3]);
    }

    public final EventEntity.User getUser() {
        return (EventEntity.User) U.d(this.map, $$delegatedProperties[6].getName());
    }

    public final String getUuid() {
        return (String) U.d(this.map, $$delegatedProperties[0].getName());
    }

    @NotNull
    public final String getVersion() {
        return (String) U.d(this.map, $$delegatedProperties[4].getName());
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public /* synthetic */ CustomEventEntity(String str, String str2, DateTime dateTime, DateTime dateTime2, String str3, EventEntity.Attributes attributes, EventEntity.User user, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, dateTime2, (i11 & 16) != 0 ? "2" : str3, (i11 & 32) != 0 ? null : attributes, (i11 & 64) != 0 ? null : user, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomEventEntity(String str, String str2, @NotNull DateTime timestamp, @NotNull DateTime timestampMs, @NotNull String version, EventEntity.Attributes attributes, EventEntity.User user, Map<String, ? extends Object> map) {
        this();
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
        Intrinsics.checkNotNullParameter(version, "version");
        if (map != null) {
            this.map.putAll(map);
        }
        setUuid(str);
        setNumber(str2);
        setTimestamp(timestamp);
        setTimestampMs(timestampMs);
        setVersion(version);
        setAttributes(attributes);
        setUser(user);
    }

    public /* synthetic */ CustomEventEntity(String str, String str2, DateTime dateTime, String str3, EventEntity.Attributes attributes, EventEntity.User user, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, (i11 & 8) != 0 ? "2" : str3, (i11 & 16) != 0 ? null : attributes, (i11 & 32) != 0 ? null : user, (i11 & 64) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public CustomEventEntity(String str, String str2, @NotNull DateTime timestamp, @NotNull String version, EventEntity.Attributes attributes, EventEntity.User user, Map<String, ? extends Object> map) {
        this();
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
        if (map != null) {
            this.map.putAll(map);
        }
        setUuid(str);
        setNumber(str2);
        setTimestamp(timestamp);
        setTimestampMs(timestamp);
        setVersion(version);
        setAttributes(attributes);
        setUser(user);
    }
}
