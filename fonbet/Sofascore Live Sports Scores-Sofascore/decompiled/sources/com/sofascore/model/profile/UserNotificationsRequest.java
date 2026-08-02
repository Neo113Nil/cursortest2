package com.sofascore.model.profile;

import com.ironsource.C4227o2;
import defpackage.dmi;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vak;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/sofascore/model/profile/UserNotificationsRequest;", "", "", "muteUntil", "", "registrationId", "", "", C4227o2.x, "<init>", "(JLjava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/UserNotificationsRequest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(JLjava/lang/String;Ljava/util/Map;)Lcom/sofascore/model/profile/UserNotificationsRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMuteUntil", "Ljava/lang/String;", "getRegistrationId", "Ljava/util/Map;", "getNotifications", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserNotificationsRequest {
    private final long muteUntil;

    @NotNull
    private final Map<String, List<String>> notifications;

    @NotNull
    private final String registrationId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new vak(22))};

    public /* synthetic */ UserNotificationsRequest(int i, long j, String str, Map map, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, UserNotificationsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.muteUntil = j;
        this.registrationId = str;
        this.notifications = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, new xg0(uhiVar, 0), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserNotificationsRequest copy$default(UserNotificationsRequest userNotificationsRequest, long j, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userNotificationsRequest.muteUntil;
        }
        if ((i & 2) != 0) {
            str = userNotificationsRequest.registrationId;
        }
        if ((i & 4) != 0) {
            map = userNotificationsRequest.notifications;
        }
        return userNotificationsRequest.copy(j, str, map);
    }

    public static final /* synthetic */ void write$Self$model_release(UserNotificationsRequest self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.E(serialDesc, 0, self.muteUntil);
        output.y(serialDesc, 1, self.registrationId);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.notifications);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMuteUntil() {
        return this.muteUntil;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRegistrationId() {
        return this.registrationId;
    }

    @NotNull
    public final Map<String, List<String>> component3() {
        return this.notifications;
    }

    @NotNull
    public final UserNotificationsRequest copy(long muteUntil, @NotNull String registrationId, @NotNull Map<String, ? extends List<String>> notifications) {
        registrationId.getClass();
        notifications.getClass();
        return new UserNotificationsRequest(muteUntil, registrationId, notifications);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserNotificationsRequest)) {
            return false;
        }
        UserNotificationsRequest userNotificationsRequest = (UserNotificationsRequest) other;
        return this.muteUntil == userNotificationsRequest.muteUntil && Intrinsics.c(this.registrationId, userNotificationsRequest.registrationId) && Intrinsics.c(this.notifications, userNotificationsRequest.notifications);
    }

    public final long getMuteUntil() {
        return this.muteUntil;
    }

    @NotNull
    public final Map<String, List<String>> getNotifications() {
        return this.notifications;
    }

    @NotNull
    public final String getRegistrationId() {
        return this.registrationId;
    }

    public int hashCode() {
        return this.notifications.hashCode() + dmi.c(Long.hashCode(this.muteUntil) * 31, 31, this.registrationId);
    }

    @NotNull
    public String toString() {
        return "UserNotificationsRequest(muteUntil=" + this.muteUntil + ", registrationId=" + this.registrationId + ", notifications=" + this.notifications + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/UserNotificationsRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/UserNotificationsRequest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserNotificationsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserNotificationsRequest(long j, @NotNull String str, @NotNull Map<String, ? extends List<String>> map) {
        str.getClass();
        map.getClass();
        this.muteUntil = j;
        this.registrationId = str;
        this.notifications = map;
    }
}
