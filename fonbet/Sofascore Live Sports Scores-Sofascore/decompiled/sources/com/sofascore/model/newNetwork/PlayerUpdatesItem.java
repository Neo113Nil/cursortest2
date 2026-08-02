package com.sofascore.model.newNetwork;

import com.sofascore.model.network.response.serializers.UniqueTournamentPlayerUpdatesSerializer;
import defpackage.bxe;
import defpackage.joa;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = UniqueTournamentPlayerUpdatesSerializer.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "", "Transfer", "Injury", "Award", "Unknown", "Companion", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Award;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Injury;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Transfer;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Unknown;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PlayerUpdatesItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return new UniqueTournamentPlayerUpdatesSerializer();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Unknown;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unknown implements PlayerUpdatesItem {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new bxe(7));

        private Unknown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new qq3("com.sofascore.model.newNetwork.PlayerUpdatesItem.Unknown", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Award;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "", "timestamp", "Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;", "payload", "<init>", "(JLcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJLcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Award;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;", "copy", "(JLcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;)Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Award;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;", "getPayload", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Award implements PlayerUpdatesItem {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PlayerAwardUpdatePayload payload;
        private final long timestamp;

        public /* synthetic */ Award(int i, long j, PlayerAwardUpdatePayload playerAwardUpdatePayload, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, PlayerUpdatesItem$Award$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
            this.payload = playerAwardUpdatePayload;
        }

        public static /* synthetic */ Award copy$default(Award award, long j, PlayerAwardUpdatePayload playerAwardUpdatePayload, int i, Object obj) {
            if ((i & 1) != 0) {
                j = award.timestamp;
            }
            if ((i & 2) != 0) {
                playerAwardUpdatePayload = award.payload;
            }
            return award.copy(j, playerAwardUpdatePayload);
        }

        public static final /* synthetic */ void write$Self$model_release(Award self, wf3 output, SerialDescriptor serialDesc) {
            output.E(serialDesc, 0, self.timestamp);
            output.f(serialDesc, 1, PlayerAwardUpdatePayload$$serializer.INSTANCE, self.payload);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PlayerAwardUpdatePayload getPayload() {
            return this.payload;
        }

        @NotNull
        public final Award copy(long timestamp, @NotNull PlayerAwardUpdatePayload payload) {
            payload.getClass();
            return new Award(timestamp, payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Award)) {
                return false;
            }
            Award award = (Award) other;
            return this.timestamp == award.timestamp && Intrinsics.c(this.payload, award.payload);
        }

        @NotNull
        public final PlayerAwardUpdatePayload getPayload() {
            return this.payload;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.payload.hashCode() + (Long.hashCode(this.timestamp) * 31);
        }

        @NotNull
        public String toString() {
            return "Award(timestamp=" + this.timestamp + ", payload=" + this.payload + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Award$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Award;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return PlayerUpdatesItem$Award$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Award(long j, @NotNull PlayerAwardUpdatePayload playerAwardUpdatePayload) {
            playerAwardUpdatePayload.getClass();
            this.timestamp = j;
            this.payload = playerAwardUpdatePayload;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Injury;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "", "timestamp", "Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;", "payload", "<init>", "(JLcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJLcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Injury;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;", "copy", "(JLcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;)Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Injury;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;", "getPayload", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Injury implements PlayerUpdatesItem {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PlayerInjuryUpdatePayload payload;
        private final long timestamp;

        public /* synthetic */ Injury(int i, long j, PlayerInjuryUpdatePayload playerInjuryUpdatePayload, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, PlayerUpdatesItem$Injury$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
            this.payload = playerInjuryUpdatePayload;
        }

        public static /* synthetic */ Injury copy$default(Injury injury, long j, PlayerInjuryUpdatePayload playerInjuryUpdatePayload, int i, Object obj) {
            if ((i & 1) != 0) {
                j = injury.timestamp;
            }
            if ((i & 2) != 0) {
                playerInjuryUpdatePayload = injury.payload;
            }
            return injury.copy(j, playerInjuryUpdatePayload);
        }

        public static final /* synthetic */ void write$Self$model_release(Injury self, wf3 output, SerialDescriptor serialDesc) {
            output.E(serialDesc, 0, self.timestamp);
            output.f(serialDesc, 1, PlayerInjuryUpdatePayload$$serializer.INSTANCE, self.payload);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PlayerInjuryUpdatePayload getPayload() {
            return this.payload;
        }

        @NotNull
        public final Injury copy(long timestamp, @NotNull PlayerInjuryUpdatePayload payload) {
            payload.getClass();
            return new Injury(timestamp, payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Injury)) {
                return false;
            }
            Injury injury = (Injury) other;
            return this.timestamp == injury.timestamp && Intrinsics.c(this.payload, injury.payload);
        }

        @NotNull
        public final PlayerInjuryUpdatePayload getPayload() {
            return this.payload;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.payload.hashCode() + (Long.hashCode(this.timestamp) * 31);
        }

        @NotNull
        public String toString() {
            return "Injury(timestamp=" + this.timestamp + ", payload=" + this.payload + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Injury$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Injury;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return PlayerUpdatesItem$Injury$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Injury(long j, @NotNull PlayerInjuryUpdatePayload playerInjuryUpdatePayload) {
            playerInjuryUpdatePayload.getClass();
            this.timestamp = j;
            this.payload = playerInjuryUpdatePayload;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Transfer;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem;", "", "timestamp", "Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;", "payload", "<init>", "(JLcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJLcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Transfer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;", "copy", "(JLcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;)Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Transfer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;", "getPayload", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Transfer implements PlayerUpdatesItem {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final PlayerTransferUpdatePayload payload;
        private final long timestamp;

        public /* synthetic */ Transfer(int i, long j, PlayerTransferUpdatePayload playerTransferUpdatePayload, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, PlayerUpdatesItem$Transfer$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.timestamp = j;
            this.payload = playerTransferUpdatePayload;
        }

        public static /* synthetic */ Transfer copy$default(Transfer transfer, long j, PlayerTransferUpdatePayload playerTransferUpdatePayload, int i, Object obj) {
            if ((i & 1) != 0) {
                j = transfer.timestamp;
            }
            if ((i & 2) != 0) {
                playerTransferUpdatePayload = transfer.payload;
            }
            return transfer.copy(j, playerTransferUpdatePayload);
        }

        public static final /* synthetic */ void write$Self$model_release(Transfer self, wf3 output, SerialDescriptor serialDesc) {
            output.E(serialDesc, 0, self.timestamp);
            output.f(serialDesc, 1, PlayerTransferUpdatePayload$$serializer.INSTANCE, self.payload);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PlayerTransferUpdatePayload getPayload() {
            return this.payload;
        }

        @NotNull
        public final Transfer copy(long timestamp, @NotNull PlayerTransferUpdatePayload payload) {
            payload.getClass();
            return new Transfer(timestamp, payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) other;
            return this.timestamp == transfer.timestamp && Intrinsics.c(this.payload, transfer.payload);
        }

        @NotNull
        public final PlayerTransferUpdatePayload getPayload() {
            return this.payload;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.payload.hashCode() + (Long.hashCode(this.timestamp) * 31);
        }

        @NotNull
        public String toString() {
            return "Transfer(timestamp=" + this.timestamp + ", payload=" + this.payload + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Transfer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerUpdatesItem$Transfer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return PlayerUpdatesItem$Transfer$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Transfer(long j, @NotNull PlayerTransferUpdatePayload playerTransferUpdatePayload) {
            playerTransferUpdatePayload.getClass();
            this.timestamp = j;
            this.payload = playerTransferUpdatePayload;
        }
    }
}
