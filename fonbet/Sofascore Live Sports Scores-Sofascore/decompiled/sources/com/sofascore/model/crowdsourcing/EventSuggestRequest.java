package com.sofascore.model.crowdsourcing;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.duf;
import defpackage.ec6;
import defpackage.fc6;
import defpackage.fuf;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00072\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "", "GoalSuggest", "CardSuggest", "FinalScoreSuggest", "StartDateSuggest", "StatusSuggest", "Companion", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$CardSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$FinalScoreSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$GoalSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StartDateSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StatusSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EventSuggestRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.crowdsourcing.EventSuggestRequest", fufVar.getOrCreateKotlinClass(EventSuggestRequest.class), new KClass[]{fufVar.getOrCreateKotlinClass(CardSuggest.class), fufVar.getOrCreateKotlinClass(FinalScoreSuggest.class), fufVar.getOrCreateKotlinClass(GoalSuggest.class), fufVar.getOrCreateKotlinClass(StartDateSuggest.class), fufVar.getOrCreateKotlinClass(StatusSuggest.class)}, new KSerializer[]{EventSuggestRequest$CardSuggest$$serializer.INSTANCE, EventSuggestRequest$FinalScoreSuggest$$serializer.INSTANCE, EventSuggestRequest$GoalSuggest$$serializer.INSTANCE, EventSuggestRequest$StartDateSuggest$$serializer.INSTANCE, EventSuggestRequest$StatusSuggest$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventCardSuggest")
    @r5h
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJT\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001c¨\u0006;"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$CardSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "", "playerId", "", "playerName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "cardType", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "playerTeam", "time", "addedTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$CardSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "component4", "()Lcom/sofascore/model/crowdsourcing/TeamSide;", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$CardSuggest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPlayerId", "Ljava/lang/String;", "getPlayerName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "getCardType", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "getPlayerTeam", "getTime", "getAddedTime", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardSuggest implements EventSuggestRequest {

        @NotNull
        private static final joa[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @NotNull
        private final CrowdsourcingIncidentType.Card cardType;

        @Nullable
        private final Integer playerId;

        @Nullable
        private final String playerName;

        @NotNull
        private final TeamSide playerTeam;

        @Nullable
        private final Integer time;

        static {
            ysa ysaVar = ysa.b;
            $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new ec6(0)), ypa.a(ysaVar, new ec6(1)), null, null};
        }

        public /* synthetic */ CardSuggest(int i, Integer num, String str, CrowdsourcingIncidentType.Card card, TeamSide teamSide, Integer num2, Integer num3, t5h t5hVar) {
            if (63 != (i & 63)) {
                oea.z(i, 63, EventSuggestRequest$CardSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.playerId = num;
            this.playerName = str;
            this.cardType = card;
            this.playerTeam = teamSide;
            this.time = num2;
            this.addedTime = num3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return CrowdsourcingIncidentType.Card.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return TeamSide.INSTANCE.serializer();
        }

        public static /* synthetic */ CardSuggest copy$default(CardSuggest cardSuggest, Integer num, String str, CrowdsourcingIncidentType.Card card, TeamSide teamSide, Integer num2, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = cardSuggest.playerId;
            }
            if ((i & 2) != 0) {
                str = cardSuggest.playerName;
            }
            if ((i & 4) != 0) {
                card = cardSuggest.cardType;
            }
            if ((i & 8) != 0) {
                teamSide = cardSuggest.playerTeam;
            }
            if ((i & 16) != 0) {
                num2 = cardSuggest.time;
            }
            if ((i & 32) != 0) {
                num3 = cardSuggest.addedTime;
            }
            Integer num4 = num2;
            Integer num5 = num3;
            return cardSuggest.copy(num, str, card, teamSide, num4, num5);
        }

        public static final /* synthetic */ void write$Self$model_release(CardSuggest self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 0, a7aVar, self.playerId);
            output.h(serialDesc, 1, uhi.a, self.playerName);
            output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.cardType);
            output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.playerTeam);
            output.h(serialDesc, 4, a7aVar, self.time);
            output.h(serialDesc, 5, a7aVar, self.addedTime);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getPlayerId() {
            return this.playerId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getPlayerName() {
            return this.playerName;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CrowdsourcingIncidentType.Card getCardType() {
            return this.cardType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TeamSide getPlayerTeam() {
            return this.playerTeam;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Integer getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Integer getAddedTime() {
            return this.addedTime;
        }

        @NotNull
        public final CardSuggest copy(@Nullable Integer playerId, @Nullable String playerName, @NotNull CrowdsourcingIncidentType.Card cardType, @NotNull TeamSide playerTeam, @Nullable Integer time, @Nullable Integer addedTime) {
            cardType.getClass();
            playerTeam.getClass();
            return new CardSuggest(playerId, playerName, cardType, playerTeam, time, addedTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardSuggest)) {
                return false;
            }
            CardSuggest cardSuggest = (CardSuggest) other;
            return Intrinsics.c(this.playerId, cardSuggest.playerId) && Intrinsics.c(this.playerName, cardSuggest.playerName) && this.cardType == cardSuggest.cardType && this.playerTeam == cardSuggest.playerTeam && Intrinsics.c(this.time, cardSuggest.time) && Intrinsics.c(this.addedTime, cardSuggest.addedTime);
        }

        @Nullable
        public final Integer getAddedTime() {
            return this.addedTime;
        }

        @NotNull
        public final CrowdsourcingIncidentType.Card getCardType() {
            return this.cardType;
        }

        @Nullable
        public final Integer getPlayerId() {
            return this.playerId;
        }

        @Nullable
        public final String getPlayerName() {
            return this.playerName;
        }

        @NotNull
        public final TeamSide getPlayerTeam() {
            return this.playerTeam;
        }

        @Nullable
        public final Integer getTime() {
            return this.time;
        }

        public int hashCode() {
            Integer num = this.playerId;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.playerName;
            int hashCode2 = (this.playerTeam.hashCode() + ((this.cardType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            Integer num2 = this.time;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.addedTime;
            return hashCode3 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.playerId;
            String str = this.playerName;
            CrowdsourcingIncidentType.Card card = this.cardType;
            TeamSide teamSide = this.playerTeam;
            Integer num2 = this.time;
            Integer num3 = this.addedTime;
            StringBuilder m = wv8.m("CardSuggest(playerId=", num, ", playerName=", str, ", cardType=");
            m.append(card);
            m.append(", playerTeam=");
            m.append(teamSide);
            m.append(", time=");
            return fc6.l(num2, num3, ", addedTime=", ")", m);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$CardSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$CardSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggestRequest$CardSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CardSuggest(@Nullable Integer num, @Nullable String str, @NotNull CrowdsourcingIncidentType.Card card, @NotNull TeamSide teamSide, @Nullable Integer num2, @Nullable Integer num3) {
            card.getClass();
            teamSide.getClass();
            this.playerId = num;
            this.playerName = str;
            this.cardType = card;
            this.playerTeam = teamSide;
            this.time = num2;
            this.addedTime = num3;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventFinalScoreSuggest")
    @r5h
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$FinalScoreSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "", "homeScoreSuggest", "awayScoreSuggest", "<init>", "(II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$FinalScoreSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$FinalScoreSuggest;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHomeScoreSuggest", "getAwayScoreSuggest", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FinalScoreSuggest implements EventSuggestRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int awayScoreSuggest;
        private final int homeScoreSuggest;

        public /* synthetic */ FinalScoreSuggest(int i, int i2, int i3, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, EventSuggestRequest$FinalScoreSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.homeScoreSuggest = i2;
            this.awayScoreSuggest = i3;
        }

        public static /* synthetic */ FinalScoreSuggest copy$default(FinalScoreSuggest finalScoreSuggest, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = finalScoreSuggest.homeScoreSuggest;
            }
            if ((i3 & 2) != 0) {
                i2 = finalScoreSuggest.awayScoreSuggest;
            }
            return finalScoreSuggest.copy(i, i2);
        }

        public static final /* synthetic */ void write$Self$model_release(FinalScoreSuggest self, wf3 output, SerialDescriptor serialDesc) {
            output.u(0, self.homeScoreSuggest, serialDesc);
            output.u(1, self.awayScoreSuggest, serialDesc);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHomeScoreSuggest() {
            return this.homeScoreSuggest;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAwayScoreSuggest() {
            return this.awayScoreSuggest;
        }

        @NotNull
        public final FinalScoreSuggest copy(int homeScoreSuggest, int awayScoreSuggest) {
            return new FinalScoreSuggest(homeScoreSuggest, awayScoreSuggest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalScoreSuggest)) {
                return false;
            }
            FinalScoreSuggest finalScoreSuggest = (FinalScoreSuggest) other;
            return this.homeScoreSuggest == finalScoreSuggest.homeScoreSuggest && this.awayScoreSuggest == finalScoreSuggest.awayScoreSuggest;
        }

        public final int getAwayScoreSuggest() {
            return this.awayScoreSuggest;
        }

        public final int getHomeScoreSuggest() {
            return this.homeScoreSuggest;
        }

        public int hashCode() {
            return Integer.hashCode(this.awayScoreSuggest) + (Integer.hashCode(this.homeScoreSuggest) * 31);
        }

        @NotNull
        public String toString() {
            return lnb.j(this.homeScoreSuggest, this.awayScoreSuggest, "FinalScoreSuggest(homeScoreSuggest=", ", awayScoreSuggest=", ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$FinalScoreSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$FinalScoreSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggestRequest$FinalScoreSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public FinalScoreSuggest(int i, int i2) {
            this.homeScoreSuggest = i;
            this.awayScoreSuggest = i2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventScoreSuggest")
    @r5h
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0080\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bD\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bE\u0010\u001a¨\u0006H"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$GoalSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "", "homeScoreSuggest", "awayScoreSuggest", "scorerId", "assistId", "", "scorerName", "assistName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "from", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "scoringTeam", "time", "addedTime", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "component8", "()Lcom/sofascore/model/crowdsourcing/TeamSide;", "component9", "component10", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$GoalSuggest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$GoalSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getHomeScoreSuggest", "getAwayScoreSuggest", "Ljava/lang/Integer;", "getScorerId", "getAssistId", "Ljava/lang/String;", "getScorerName", "getAssistName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "getFrom", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "getScoringTeam", "getTime", "getAddedTime", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoalSuggest implements EventSuggestRequest {

        @NotNull
        private static final joa[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer addedTime;

        @Nullable
        private final Integer assistId;

        @Nullable
        private final String assistName;
        private final int awayScoreSuggest;

        @NotNull
        private final CrowdsourcingIncidentType.Goal from;
        private final int homeScoreSuggest;

        @Nullable
        private final Integer scorerId;

        @Nullable
        private final String scorerName;

        @NotNull
        private final TeamSide scoringTeam;

        @Nullable
        private final Integer time;

        static {
            ysa ysaVar = ysa.b;
            $childSerializers = new joa[]{null, null, null, null, null, null, ypa.a(ysaVar, new ec6(2)), ypa.a(ysaVar, new ec6(3)), null, null};
        }

        public /* synthetic */ GoalSuggest(int i, int i2, int i3, Integer num, Integer num2, String str, String str2, CrowdsourcingIncidentType.Goal goal, TeamSide teamSide, Integer num3, Integer num4, t5h t5hVar) {
            if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
                oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, EventSuggestRequest$GoalSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.homeScoreSuggest = i2;
            this.awayScoreSuggest = i3;
            this.scorerId = num;
            this.assistId = num2;
            this.scorerName = str;
            this.assistName = str2;
            this.from = goal;
            this.scoringTeam = teamSide;
            this.time = num3;
            this.addedTime = num4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return CrowdsourcingIncidentType.Goal.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return TeamSide.INSTANCE.serializer();
        }

        public static /* synthetic */ GoalSuggest copy$default(GoalSuggest goalSuggest, int i, int i2, Integer num, Integer num2, String str, String str2, CrowdsourcingIncidentType.Goal goal, TeamSide teamSide, Integer num3, Integer num4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = goalSuggest.homeScoreSuggest;
            }
            if ((i3 & 2) != 0) {
                i2 = goalSuggest.awayScoreSuggest;
            }
            if ((i3 & 4) != 0) {
                num = goalSuggest.scorerId;
            }
            if ((i3 & 8) != 0) {
                num2 = goalSuggest.assistId;
            }
            if ((i3 & 16) != 0) {
                str = goalSuggest.scorerName;
            }
            if ((i3 & 32) != 0) {
                str2 = goalSuggest.assistName;
            }
            if ((i3 & 64) != 0) {
                goal = goalSuggest.from;
            }
            if ((i3 & 128) != 0) {
                teamSide = goalSuggest.scoringTeam;
            }
            if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                num3 = goalSuggest.time;
            }
            if ((i3 & 512) != 0) {
                num4 = goalSuggest.addedTime;
            }
            Integer num5 = num3;
            Integer num6 = num4;
            CrowdsourcingIncidentType.Goal goal2 = goal;
            TeamSide teamSide2 = teamSide;
            String str3 = str;
            String str4 = str2;
            return goalSuggest.copy(i, i2, num, num2, str3, str4, goal2, teamSide2, num5, num6);
        }

        public static final /* synthetic */ void write$Self$model_release(GoalSuggest self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            output.u(0, self.homeScoreSuggest, serialDesc);
            output.u(1, self.awayScoreSuggest, serialDesc);
            a7a a7aVar = a7a.a;
            output.h(serialDesc, 2, a7aVar, self.scorerId);
            output.h(serialDesc, 3, a7aVar, self.assistId);
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 4, uhiVar, self.scorerName);
            output.h(serialDesc, 5, uhiVar, self.assistName);
            output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.from);
            output.f(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.scoringTeam);
            output.h(serialDesc, 8, a7aVar, self.time);
            output.h(serialDesc, 9, a7aVar, self.addedTime);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHomeScoreSuggest() {
            return this.homeScoreSuggest;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final Integer getAddedTime() {
            return this.addedTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAwayScoreSuggest() {
            return this.awayScoreSuggest;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getScorerId() {
            return this.scorerId;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Integer getAssistId() {
            return this.assistId;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getScorerName() {
            return this.scorerName;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getAssistName() {
            return this.assistName;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final CrowdsourcingIncidentType.Goal getFrom() {
            return this.from;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final TeamSide getScoringTeam() {
            return this.scoringTeam;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final Integer getTime() {
            return this.time;
        }

        @NotNull
        public final GoalSuggest copy(int homeScoreSuggest, int awayScoreSuggest, @Nullable Integer scorerId, @Nullable Integer assistId, @Nullable String scorerName, @Nullable String assistName, @NotNull CrowdsourcingIncidentType.Goal from, @NotNull TeamSide scoringTeam, @Nullable Integer time, @Nullable Integer addedTime) {
            from.getClass();
            scoringTeam.getClass();
            return new GoalSuggest(homeScoreSuggest, awayScoreSuggest, scorerId, assistId, scorerName, assistName, from, scoringTeam, time, addedTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoalSuggest)) {
                return false;
            }
            GoalSuggest goalSuggest = (GoalSuggest) other;
            return this.homeScoreSuggest == goalSuggest.homeScoreSuggest && this.awayScoreSuggest == goalSuggest.awayScoreSuggest && Intrinsics.c(this.scorerId, goalSuggest.scorerId) && Intrinsics.c(this.assistId, goalSuggest.assistId) && Intrinsics.c(this.scorerName, goalSuggest.scorerName) && Intrinsics.c(this.assistName, goalSuggest.assistName) && this.from == goalSuggest.from && this.scoringTeam == goalSuggest.scoringTeam && Intrinsics.c(this.time, goalSuggest.time) && Intrinsics.c(this.addedTime, goalSuggest.addedTime);
        }

        @Nullable
        public final Integer getAddedTime() {
            return this.addedTime;
        }

        @Nullable
        public final Integer getAssistId() {
            return this.assistId;
        }

        @Nullable
        public final String getAssistName() {
            return this.assistName;
        }

        public final int getAwayScoreSuggest() {
            return this.awayScoreSuggest;
        }

        @NotNull
        public final CrowdsourcingIncidentType.Goal getFrom() {
            return this.from;
        }

        public final int getHomeScoreSuggest() {
            return this.homeScoreSuggest;
        }

        @Nullable
        public final Integer getScorerId() {
            return this.scorerId;
        }

        @Nullable
        public final String getScorerName() {
            return this.scorerName;
        }

        @NotNull
        public final TeamSide getScoringTeam() {
            return this.scoringTeam;
        }

        @Nullable
        public final Integer getTime() {
            return this.time;
        }

        public int hashCode() {
            int a = wv8.a(this.awayScoreSuggest, Integer.hashCode(this.homeScoreSuggest) * 31, 31);
            Integer num = this.scorerId;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.assistId;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.scorerName;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.assistName;
            int hashCode4 = (this.scoringTeam.hashCode() + ((this.from.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
            Integer num3 = this.time;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.addedTime;
            return hashCode5 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i = this.homeScoreSuggest;
            int i2 = this.awayScoreSuggest;
            Integer num = this.scorerId;
            Integer num2 = this.assistId;
            String str = this.scorerName;
            String str2 = this.assistName;
            CrowdsourcingIncidentType.Goal goal = this.from;
            TeamSide teamSide = this.scoringTeam;
            Integer num3 = this.time;
            Integer num4 = this.addedTime;
            StringBuilder s = lnb.s(i, i2, "GoalSuggest(homeScoreSuggest=", ", awayScoreSuggest=", ", scorerId=");
            vxd.r(num, num2, ", assistId=", ", scorerName=", s);
            bf3.v(s, str, ", assistName=", str2, ", from=");
            s.append(goal);
            s.append(", scoringTeam=");
            s.append(teamSide);
            s.append(", time=");
            return fc6.l(num3, num4, ", addedTime=", ")", s);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$GoalSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$GoalSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggestRequest$GoalSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public GoalSuggest(int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @NotNull CrowdsourcingIncidentType.Goal goal, @NotNull TeamSide teamSide, @Nullable Integer num3, @Nullable Integer num4) {
            goal.getClass();
            teamSide.getClass();
            this.homeScoreSuggest = i;
            this.awayScoreSuggest = i2;
            this.scorerId = num;
            this.assistId = num2;
            this.scorerName = str;
            this.assistName = str2;
            this.from = goal;
            this.scoringTeam = teamSide;
            this.time = num3;
            this.addedTime = num4;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventStartDateSuggest")
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StartDateSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "", "startDateSuggest", "<init>", "(J)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StartDateSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StartDateSuggest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStartDateSuggest", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartDateSuggest implements EventSuggestRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long startDateSuggest;

        public /* synthetic */ StartDateSuggest(int i, long j, t5h t5hVar) {
            if (1 == (i & 1)) {
                this.startDateSuggest = j;
            } else {
                oea.z(i, 1, EventSuggestRequest$StartDateSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ StartDateSuggest copy$default(StartDateSuggest startDateSuggest, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = startDateSuggest.startDateSuggest;
            }
            return startDateSuggest.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartDateSuggest() {
            return this.startDateSuggest;
        }

        @NotNull
        public final StartDateSuggest copy(long startDateSuggest) {
            return new StartDateSuggest(startDateSuggest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartDateSuggest) && this.startDateSuggest == ((StartDateSuggest) other).startDateSuggest;
        }

        public final long getStartDateSuggest() {
            return this.startDateSuggest;
        }

        public int hashCode() {
            return Long.hashCode(this.startDateSuggest);
        }

        @NotNull
        public String toString() {
            return vxd.m("StartDateSuggest(startDateSuggest=", this.startDateSuggest, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StartDateSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StartDateSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggestRequest$StartDateSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public StartDateSuggest(long j) {
            this.startDateSuggest = j;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventStatusSuggest")
    @r5h
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StatusSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest;", "", "statusSuggest", "reasonSuggest", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StatusSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StatusSuggest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatusSuggest", "getReasonSuggest", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StatusSuggest implements EventSuggestRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String reasonSuggest;

        @Nullable
        private final String statusSuggest;

        public /* synthetic */ StatusSuggest(int i, String str, String str2, t5h t5hVar) {
            if (3 != (i & 3)) {
                oea.z(i, 3, EventSuggestRequest$StatusSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.statusSuggest = str;
            this.reasonSuggest = str2;
        }

        public static /* synthetic */ StatusSuggest copy$default(StatusSuggest statusSuggest, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = statusSuggest.statusSuggest;
            }
            if ((i & 2) != 0) {
                str2 = statusSuggest.reasonSuggest;
            }
            return statusSuggest.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$model_release(StatusSuggest self, wf3 output, SerialDescriptor serialDesc) {
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 0, uhiVar, self.statusSuggest);
            output.h(serialDesc, 1, uhiVar, self.reasonSuggest);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getStatusSuggest() {
            return this.statusSuggest;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getReasonSuggest() {
            return this.reasonSuggest;
        }

        @NotNull
        public final StatusSuggest copy(@Nullable String statusSuggest, @Nullable String reasonSuggest) {
            return new StatusSuggest(statusSuggest, reasonSuggest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusSuggest)) {
                return false;
            }
            StatusSuggest statusSuggest = (StatusSuggest) other;
            return Intrinsics.c(this.statusSuggest, statusSuggest.statusSuggest) && Intrinsics.c(this.reasonSuggest, statusSuggest.reasonSuggest);
        }

        @Nullable
        public final String getReasonSuggest() {
            return this.reasonSuggest;
        }

        @Nullable
        public final String getStatusSuggest() {
            return this.statusSuggest;
        }

        public int hashCode() {
            String str = this.statusSuggest;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reasonSuggest;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return bf3.k("StatusSuggest(statusSuggest=", this.statusSuggest, ", reasonSuggest=", this.reasonSuggest, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StatusSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggestRequest$StatusSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggestRequest$StatusSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public StatusSuggest(@Nullable String str, @Nullable String str2) {
            this.statusSuggest = str;
            this.reasonSuggest = str2;
        }
    }
}
