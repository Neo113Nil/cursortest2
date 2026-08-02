package com.sofascore.model.crowdsourcing;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fc6;
import defpackage.fuf;
import defpackage.gz1;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.q5h;
import defpackage.qt5;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00122\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest;", "", "id", "", "getId", "()I", "status", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "getStatus", "()Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "validated", "", "getValidated", "()Z", "IncidentSuggest", "StartDateSuggest", "StatusSuggest", "FinalScoreSuggest", "Companion", "Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EventSuggest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.crowdsourcing.EventSuggest", fufVar.getOrCreateKotlinClass(EventSuggest.class), new KClass[]{fufVar.getOrCreateKotlinClass(FinalScoreSuggest.class), fufVar.getOrCreateKotlinClass(IncidentSuggest.CardSuggest.class), fufVar.getOrCreateKotlinClass(IncidentSuggest.GoalSuggest.class), fufVar.getOrCreateKotlinClass(StartDateSuggest.class), fufVar.getOrCreateKotlinClass(StatusSuggest.class)}, new KSerializer[]{EventSuggest$FinalScoreSuggest$$serializer.INSTANCE, EventSuggest$IncidentSuggest$CardSuggest$$serializer.INSTANCE, EventSuggest$IncidentSuggest$GoalSuggest$$serializer.INSTANCE, EventSuggest$StartDateSuggest$$serializer.INSTANCE, EventSuggest$StatusSuggest$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    int getId();

    @NotNull
    SuggestStatus getStatus();

    boolean getValidated();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001c\u001d\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u0002\u001f ¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest;", "side", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "getSide", "()Lcom/sofascore/model/crowdsourcing/TeamSide;", "time", "", "getTime", "()Ljava/lang/Integer;", "addedTime", "getAddedTime", "type", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;", "getType", "()Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "playerName", "", "getPlayerName", "()Ljava/lang/String;", "applied", "", "getApplied", "()Ljava/lang/Boolean;", "GoalSuggest", "CardSuggest", "Companion", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface IncidentSuggest extends EventSuggest {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                fuf fufVar = duf.a;
                return new zvg("com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest", fufVar.getOrCreateKotlinClass(IncidentSuggest.class), new KClass[]{fufVar.getOrCreateKotlinClass(CardSuggest.class), fufVar.getOrCreateKotlinClass(GoalSuggest.class)}, new KSerializer[]{EventSuggest$IncidentSuggest$CardSuggest$$serializer.INSTANCE, EventSuggest$IncidentSuggest$GoalSuggest$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @Nullable
        Integer getAddedTime();

        @Nullable
        Boolean getApplied();

        @Nullable
        Player getPlayer();

        @Nullable
        String getPlayerName();

        @NotNull
        TeamSide getSide();

        @Nullable
        Integer getTime();

        @NotNull
        CrowdsourcingIncidentType getType();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @q5h("eventCardSuggest")
        @r5h
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J~\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001aJ\u001a\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010\"R \u0010\r\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\r\u0010I\u0012\u0004\bK\u0010H\u001a\u0004\bJ\u0010$R \u0010\u000f\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010L\u0012\u0004\bN\u0010H\u001a\u0004\bM\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bQ\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010+¨\u0006V"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;", "", "id", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "status", "", "validated", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "playerName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "type", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "side", "time", "addedTime", "applied", "<init>", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/crowdsourcing/SuggestStatus;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "component3", "()Z", "component4", "()Lcom/sofascore/model/mvvm/model/Player;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "component7", "()Lcom/sofascore/model/crowdsourcing/TeamSide;", "component8", "()Ljava/lang/Integer;", "component9", "component10", "()Ljava/lang/Boolean;", "copy", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZLcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "getStatus", "Z", "getValidated", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/lang/String;", "getPlayerName", "getPlayerName$annotations", "()V", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "getType", "getType$annotations", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "getSide", "getSide$annotations", "Ljava/lang/Integer;", "getTime", "getAddedTime", "Ljava/lang/Boolean;", "getApplied", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CardSuggest implements IncidentSuggest {

            @NotNull
            private static final joa[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Nullable
            private final Integer addedTime;

            @Nullable
            private final Boolean applied;
            private final int id;

            @Nullable
            private final Player player;

            @Nullable
            private final String playerName;

            @NotNull
            private final TeamSide side;

            @NotNull
            private final SuggestStatus status;

            @Nullable
            private final Integer time;

            @NotNull
            private final CrowdsourcingIncidentType.Card type;
            private final boolean validated;

            static {
                ysa ysaVar = ysa.b;
                $childSerializers = new joa[]{null, ypa.a(ysaVar, new qt5(22)), null, null, null, ypa.a(ysaVar, new qt5(23)), ypa.a(ysaVar, new qt5(24)), null, null, null};
            }

            public /* synthetic */ CardSuggest(int i, int i2, SuggestStatus suggestStatus, boolean z, Player player, String str, CrowdsourcingIncidentType.Card card, TeamSide teamSide, Integer num, Integer num2, Boolean bool, t5h t5hVar) {
                if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
                    oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, EventSuggest$IncidentSuggest$CardSuggest$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = i2;
                this.status = suggestStatus;
                this.validated = z;
                this.player = player;
                this.playerName = str;
                this.type = card;
                this.side = teamSide;
                this.time = num;
                this.addedTime = num2;
                this.applied = bool;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return SuggestStatus.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return CrowdsourcingIncidentType.Card.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
                return TeamSide.INSTANCE.serializer();
            }

            public static /* synthetic */ CardSuggest copy$default(CardSuggest cardSuggest, int i, SuggestStatus suggestStatus, boolean z, Player player, String str, CrowdsourcingIncidentType.Card card, TeamSide teamSide, Integer num, Integer num2, Boolean bool, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = cardSuggest.id;
                }
                if ((i2 & 2) != 0) {
                    suggestStatus = cardSuggest.status;
                }
                if ((i2 & 4) != 0) {
                    z = cardSuggest.validated;
                }
                if ((i2 & 8) != 0) {
                    player = cardSuggest.player;
                }
                if ((i2 & 16) != 0) {
                    str = cardSuggest.playerName;
                }
                if ((i2 & 32) != 0) {
                    card = cardSuggest.type;
                }
                if ((i2 & 64) != 0) {
                    teamSide = cardSuggest.side;
                }
                if ((i2 & 128) != 0) {
                    num = cardSuggest.time;
                }
                if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    num2 = cardSuggest.addedTime;
                }
                if ((i2 & 512) != 0) {
                    bool = cardSuggest.applied;
                }
                Integer num3 = num2;
                Boolean bool2 = bool;
                TeamSide teamSide2 = teamSide;
                Integer num4 = num;
                String str2 = str;
                CrowdsourcingIncidentType.Card card2 = card;
                return cardSuggest.copy(i, suggestStatus, z, player, str2, card2, teamSide2, num4, num3, bool2);
            }

            public static final /* synthetic */ void write$Self$model_release(CardSuggest self, wf3 output, SerialDescriptor serialDesc) {
                joa[] joaVarArr = $childSerializers;
                output.u(0, self.getId(), serialDesc);
                output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.getStatus());
                output.x(serialDesc, 2, self.getValidated());
                output.h(serialDesc, 3, Player$$serializer.INSTANCE, self.getPlayer());
                output.h(serialDesc, 4, uhi.a, self.getPlayerName());
                output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.getType());
                output.f(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.getSide());
                a7a a7aVar = a7a.a;
                output.h(serialDesc, 7, a7aVar, self.getTime());
                output.h(serialDesc, 8, a7aVar, self.getAddedTime());
                output.h(serialDesc, 9, gz1.a, self.getApplied());
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component10, reason: from getter */
            public final Boolean getApplied() {
                return this.applied;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final SuggestStatus getStatus() {
                return this.status;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getValidated() {
                return this.validated;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final Player getPlayer() {
                return this.player;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final String getPlayerName() {
                return this.playerName;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final CrowdsourcingIncidentType.Card getType() {
                return this.type;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final TeamSide getSide() {
                return this.side;
            }

            @Nullable
            /* renamed from: component8, reason: from getter */
            public final Integer getTime() {
                return this.time;
            }

            @Nullable
            /* renamed from: component9, reason: from getter */
            public final Integer getAddedTime() {
                return this.addedTime;
            }

            @NotNull
            public final CardSuggest copy(int id, @NotNull SuggestStatus status, boolean validated, @Nullable Player player, @Nullable String playerName, @NotNull CrowdsourcingIncidentType.Card type, @NotNull TeamSide side, @Nullable Integer time, @Nullable Integer addedTime, @Nullable Boolean applied) {
                status.getClass();
                type.getClass();
                side.getClass();
                return new CardSuggest(id, status, validated, player, playerName, type, side, time, addedTime, applied);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CardSuggest)) {
                    return false;
                }
                CardSuggest cardSuggest = (CardSuggest) other;
                return this.id == cardSuggest.id && this.status == cardSuggest.status && this.validated == cardSuggest.validated && Intrinsics.c(this.player, cardSuggest.player) && Intrinsics.c(this.playerName, cardSuggest.playerName) && this.type == cardSuggest.type && this.side == cardSuggest.side && Intrinsics.c(this.time, cardSuggest.time) && Intrinsics.c(this.addedTime, cardSuggest.addedTime) && Intrinsics.c(this.applied, cardSuggest.applied);
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Integer getAddedTime() {
                return this.addedTime;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Boolean getApplied() {
                return this.applied;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest
            public int getId() {
                return this.id;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Player getPlayer() {
                return this.player;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public String getPlayerName() {
                return this.playerName;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @NotNull
            public TeamSide getSide() {
                return this.side;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest
            @NotNull
            public SuggestStatus getStatus() {
                return this.status;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Integer getTime() {
                return this.time;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest
            public boolean getValidated() {
                return this.validated;
            }

            public int hashCode() {
                int e = dmi.e((this.status.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.validated);
                Player player = this.player;
                int hashCode = (e + (player == null ? 0 : player.hashCode())) * 31;
                String str = this.playerName;
                int hashCode2 = (this.side.hashCode() + ((this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
                Integer num = this.time;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.addedTime;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.applied;
                return hashCode4 + (bool != null ? bool.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "CardSuggest(id=" + this.id + ", status=" + this.status + ", validated=" + this.validated + ", player=" + this.player + ", playerName=" + this.playerName + ", type=" + this.type + ", side=" + this.side + ", time=" + this.time + ", addedTime=" + this.addedTime + ", applied=" + this.applied + ")";
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$CardSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return EventSuggest$IncidentSuggest$CardSuggest$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @NotNull
            public CrowdsourcingIncidentType.Card getType() {
                return this.type;
            }

            @q5h("name")
            public static /* synthetic */ void getPlayerName$annotations() {
            }

            @q5h("playerTeam")
            public static /* synthetic */ void getSide$annotations() {
            }

            @q5h("cardType")
            public static /* synthetic */ void getType$annotations() {
            }

            public CardSuggest(int i, @NotNull SuggestStatus suggestStatus, boolean z, @Nullable Player player, @Nullable String str, @NotNull CrowdsourcingIncidentType.Card card, @NotNull TeamSide teamSide, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
                suggestStatus.getClass();
                card.getClass();
                teamSide.getClass();
                this.id = i;
                this.status = suggestStatus;
                this.validated = z;
                this.player = player;
                this.playerName = str;
                this.type = card;
                this.side = teamSide;
                this.time = num;
                this.addedTime = num2;
                this.applied = bool;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @q5h("eventScoreSuggest")
        @r5h
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002baB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00103Jª\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b6\u0010)J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001eJ\u001a\u0010:\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bK\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bL\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010M\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bQ\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010R\u0012\u0004\bT\u0010P\u001a\u0004\bS\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bU\u0010)R \u0010\u0011\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010V\u0012\u0004\bX\u0010P\u001a\u0004\bW\u0010,R \u0010\u0013\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010Y\u0012\u0004\b[\u0010P\u001a\u0004\bZ\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\b]\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b^\u00100R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\b`\u00103¨\u0006c"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;", "", "id", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "status", "", "validated", "homeScoreSuggest", "awayScoreSuggest", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "assist", "", "playerName", "assistName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "type", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "side", "time", "addedTime", "applied", "<init>", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZIILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/crowdsourcing/SuggestStatus;ZIILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lt5h;)V", "component1", "()I", "component2", "()Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "component3", "()Z", "component4", "component5", "component6", "()Lcom/sofascore/model/mvvm/model/Player;", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "()Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "component11", "()Lcom/sofascore/model/crowdsourcing/TeamSide;", "component12", "()Ljava/lang/Integer;", "component13", "component14", "()Ljava/lang/Boolean;", "copy", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZIILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;Lcom/sofascore/model/crowdsourcing/TeamSide;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "getStatus", "Z", "getValidated", "getHomeScoreSuggest", "getAwayScoreSuggest", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "getPlayer$annotations", "()V", "getAssist", "Ljava/lang/String;", "getPlayerName", "getPlayerName$annotations", "getAssistName", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "getType", "getType$annotations", "Lcom/sofascore/model/crowdsourcing/TeamSide;", "getSide", "getSide$annotations", "Ljava/lang/Integer;", "getTime", "getAddedTime", "Ljava/lang/Boolean;", "getApplied", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GoalSuggest implements IncidentSuggest {

            @NotNull
            private static final joa[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Nullable
            private final Integer addedTime;

            @Nullable
            private final Boolean applied;

            @Nullable
            private final Player assist;

            @Nullable
            private final String assistName;
            private final int awayScoreSuggest;
            private final int homeScoreSuggest;
            private final int id;

            @Nullable
            private final Player player;

            @Nullable
            private final String playerName;

            @NotNull
            private final TeamSide side;

            @NotNull
            private final SuggestStatus status;

            @Nullable
            private final Integer time;

            @NotNull
            private final CrowdsourcingIncidentType.Goal type;
            private final boolean validated;

            static {
                ysa ysaVar = ysa.b;
                $childSerializers = new joa[]{null, ypa.a(ysaVar, new qt5(25)), null, null, null, null, null, null, null, ypa.a(ysaVar, new qt5(26)), ypa.a(ysaVar, new qt5(27)), null, null, null};
            }

            public /* synthetic */ GoalSuggest(int i, int i2, SuggestStatus suggestStatus, boolean z, int i3, int i4, Player player, Player player2, String str, String str2, CrowdsourcingIncidentType.Goal goal, TeamSide teamSide, Integer num, Integer num2, Boolean bool, t5h t5hVar) {
                if (16383 != (i & 16383)) {
                    oea.z(i, 16383, EventSuggest$IncidentSuggest$GoalSuggest$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = i2;
                this.status = suggestStatus;
                this.validated = z;
                this.homeScoreSuggest = i3;
                this.awayScoreSuggest = i4;
                this.player = player;
                this.assist = player2;
                this.playerName = str;
                this.assistName = str2;
                this.type = goal;
                this.side = teamSide;
                this.time = num;
                this.addedTime = num2;
                this.applied = bool;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return SuggestStatus.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return CrowdsourcingIncidentType.Goal.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
                return TeamSide.INSTANCE.serializer();
            }

            public static final /* synthetic */ void write$Self$model_release(GoalSuggest self, wf3 output, SerialDescriptor serialDesc) {
                joa[] joaVarArr = $childSerializers;
                output.u(0, self.getId(), serialDesc);
                output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.getStatus());
                output.x(serialDesc, 2, self.getValidated());
                output.u(3, self.homeScoreSuggest, serialDesc);
                output.u(4, self.awayScoreSuggest, serialDesc);
                Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
                output.h(serialDesc, 5, player$$serializer, self.getPlayer());
                output.h(serialDesc, 6, player$$serializer, self.assist);
                uhi uhiVar = uhi.a;
                output.h(serialDesc, 7, uhiVar, self.getPlayerName());
                output.h(serialDesc, 8, uhiVar, self.assistName);
                output.f(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.getType());
                output.f(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.getSide());
                a7a a7aVar = a7a.a;
                output.h(serialDesc, 11, a7aVar, self.getTime());
                output.h(serialDesc, 12, a7aVar, self.getAddedTime());
                output.h(serialDesc, 13, gz1.a, self.getApplied());
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final CrowdsourcingIncidentType.Goal getType() {
                return this.type;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final TeamSide getSide() {
                return this.side;
            }

            @Nullable
            /* renamed from: component12, reason: from getter */
            public final Integer getTime() {
                return this.time;
            }

            @Nullable
            /* renamed from: component13, reason: from getter */
            public final Integer getAddedTime() {
                return this.addedTime;
            }

            @Nullable
            /* renamed from: component14, reason: from getter */
            public final Boolean getApplied() {
                return this.applied;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final SuggestStatus getStatus() {
                return this.status;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getValidated() {
                return this.validated;
            }

            /* renamed from: component4, reason: from getter */
            public final int getHomeScoreSuggest() {
                return this.homeScoreSuggest;
            }

            /* renamed from: component5, reason: from getter */
            public final int getAwayScoreSuggest() {
                return this.awayScoreSuggest;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final Player getPlayer() {
                return this.player;
            }

            @Nullable
            /* renamed from: component7, reason: from getter */
            public final Player getAssist() {
                return this.assist;
            }

            @Nullable
            /* renamed from: component8, reason: from getter */
            public final String getPlayerName() {
                return this.playerName;
            }

            @Nullable
            /* renamed from: component9, reason: from getter */
            public final String getAssistName() {
                return this.assistName;
            }

            @NotNull
            public final GoalSuggest copy(int id, @NotNull SuggestStatus status, boolean validated, int homeScoreSuggest, int awayScoreSuggest, @Nullable Player player, @Nullable Player assist, @Nullable String playerName, @Nullable String assistName, @NotNull CrowdsourcingIncidentType.Goal type, @NotNull TeamSide side, @Nullable Integer time, @Nullable Integer addedTime, @Nullable Boolean applied) {
                status.getClass();
                type.getClass();
                side.getClass();
                return new GoalSuggest(id, status, validated, homeScoreSuggest, awayScoreSuggest, player, assist, playerName, assistName, type, side, time, addedTime, applied);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GoalSuggest)) {
                    return false;
                }
                GoalSuggest goalSuggest = (GoalSuggest) other;
                return this.id == goalSuggest.id && this.status == goalSuggest.status && this.validated == goalSuggest.validated && this.homeScoreSuggest == goalSuggest.homeScoreSuggest && this.awayScoreSuggest == goalSuggest.awayScoreSuggest && Intrinsics.c(this.player, goalSuggest.player) && Intrinsics.c(this.assist, goalSuggest.assist) && Intrinsics.c(this.playerName, goalSuggest.playerName) && Intrinsics.c(this.assistName, goalSuggest.assistName) && this.type == goalSuggest.type && this.side == goalSuggest.side && Intrinsics.c(this.time, goalSuggest.time) && Intrinsics.c(this.addedTime, goalSuggest.addedTime) && Intrinsics.c(this.applied, goalSuggest.applied);
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Integer getAddedTime() {
                return this.addedTime;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Boolean getApplied() {
                return this.applied;
            }

            @Nullable
            public final Player getAssist() {
                return this.assist;
            }

            @Nullable
            public final String getAssistName() {
                return this.assistName;
            }

            public final int getAwayScoreSuggest() {
                return this.awayScoreSuggest;
            }

            public final int getHomeScoreSuggest() {
                return this.homeScoreSuggest;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest
            public int getId() {
                return this.id;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Player getPlayer() {
                return this.player;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public String getPlayerName() {
                return this.playerName;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @NotNull
            public TeamSide getSide() {
                return this.side;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest
            @NotNull
            public SuggestStatus getStatus() {
                return this.status;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @Nullable
            public Integer getTime() {
                return this.time;
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest
            public boolean getValidated() {
                return this.validated;
            }

            public int hashCode() {
                int a = wv8.a(this.awayScoreSuggest, wv8.a(this.homeScoreSuggest, dmi.e((this.status.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.validated), 31), 31);
                Player player = this.player;
                int hashCode = (a + (player == null ? 0 : player.hashCode())) * 31;
                Player player2 = this.assist;
                int hashCode2 = (hashCode + (player2 == null ? 0 : player2.hashCode())) * 31;
                String str = this.playerName;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.assistName;
                int hashCode4 = (this.side.hashCode() + ((this.type.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
                Integer num = this.time;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.addedTime;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.applied;
                return hashCode6 + (bool != null ? bool.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "GoalSuggest(id=" + this.id + ", status=" + this.status + ", validated=" + this.validated + ", homeScoreSuggest=" + this.homeScoreSuggest + ", awayScoreSuggest=" + this.awayScoreSuggest + ", player=" + this.player + ", assist=" + this.assist + ", playerName=" + this.playerName + ", assistName=" + this.assistName + ", type=" + this.type + ", side=" + this.side + ", time=" + this.time + ", addedTime=" + this.addedTime + ", applied=" + this.applied + ")";
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest$GoalSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return EventSuggest$IncidentSuggest$GoalSuggest$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Override // com.sofascore.model.crowdsourcing.EventSuggest.IncidentSuggest
            @NotNull
            public CrowdsourcingIncidentType.Goal getType() {
                return this.type;
            }

            @q5h("scorer")
            public static /* synthetic */ void getPlayer$annotations() {
            }

            @q5h("scorerName")
            public static /* synthetic */ void getPlayerName$annotations() {
            }

            @q5h("scoringTeam")
            public static /* synthetic */ void getSide$annotations() {
            }

            @q5h("from")
            public static /* synthetic */ void getType$annotations() {
            }

            public GoalSuggest(int i, @NotNull SuggestStatus suggestStatus, boolean z, int i2, int i3, @Nullable Player player, @Nullable Player player2, @Nullable String str, @Nullable String str2, @NotNull CrowdsourcingIncidentType.Goal goal, @NotNull TeamSide teamSide, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
                suggestStatus.getClass();
                goal.getClass();
                teamSide.getClass();
                this.id = i;
                this.status = suggestStatus;
                this.validated = z;
                this.homeScoreSuggest = i2;
                this.awayScoreSuggest = i3;
                this.player = player;
                this.assist = player2;
                this.playerName = str;
                this.assistName = str2;
                this.type = goal;
                this.side = teamSide;
                this.time = num;
                this.addedTime = num2;
                this.applied = bool;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventFinalScoreSuggest")
    @r5h
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001a¨\u00065"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest;", "", "id", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "status", "", "validated", "homeScoreSuggest", "awayScoreSuggest", "<init>", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZII)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/crowdsourcing/SuggestStatus;ZIILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "component3", "()Z", "component4", "component5", "copy", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZII)Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "getStatus", "Z", "getValidated", "getHomeScoreSuggest", "getAwayScoreSuggest", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FinalScoreSuggest implements EventSuggest {
        private final int awayScoreSuggest;
        private final int homeScoreSuggest;
        private final int id;

        @NotNull
        private final SuggestStatus status;
        private final boolean validated;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new qt5(21)), null, null, null};

        public /* synthetic */ FinalScoreSuggest(int i, int i2, SuggestStatus suggestStatus, boolean z, int i3, int i4, t5h t5hVar) {
            if (31 != (i & 31)) {
                oea.z(i, 31, EventSuggest$FinalScoreSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.status = suggestStatus;
            this.validated = z;
            this.homeScoreSuggest = i3;
            this.awayScoreSuggest = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return SuggestStatus.INSTANCE.serializer();
        }

        public static /* synthetic */ FinalScoreSuggest copy$default(FinalScoreSuggest finalScoreSuggest, int i, SuggestStatus suggestStatus, boolean z, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = finalScoreSuggest.id;
            }
            if ((i4 & 2) != 0) {
                suggestStatus = finalScoreSuggest.status;
            }
            if ((i4 & 4) != 0) {
                z = finalScoreSuggest.validated;
            }
            if ((i4 & 8) != 0) {
                i2 = finalScoreSuggest.homeScoreSuggest;
            }
            if ((i4 & 16) != 0) {
                i3 = finalScoreSuggest.awayScoreSuggest;
            }
            int i5 = i3;
            boolean z2 = z;
            return finalScoreSuggest.copy(i, suggestStatus, z2, i2, i5);
        }

        public static final /* synthetic */ void write$Self$model_release(FinalScoreSuggest self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            output.u(0, self.getId(), serialDesc);
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.getStatus());
            output.x(serialDesc, 2, self.getValidated());
            output.u(3, self.homeScoreSuggest, serialDesc);
            output.u(4, self.awayScoreSuggest, serialDesc);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SuggestStatus getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getValidated() {
            return this.validated;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHomeScoreSuggest() {
            return this.homeScoreSuggest;
        }

        /* renamed from: component5, reason: from getter */
        public final int getAwayScoreSuggest() {
            return this.awayScoreSuggest;
        }

        @NotNull
        public final FinalScoreSuggest copy(int id, @NotNull SuggestStatus status, boolean validated, int homeScoreSuggest, int awayScoreSuggest) {
            status.getClass();
            return new FinalScoreSuggest(id, status, validated, homeScoreSuggest, awayScoreSuggest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalScoreSuggest)) {
                return false;
            }
            FinalScoreSuggest finalScoreSuggest = (FinalScoreSuggest) other;
            return this.id == finalScoreSuggest.id && this.status == finalScoreSuggest.status && this.validated == finalScoreSuggest.validated && this.homeScoreSuggest == finalScoreSuggest.homeScoreSuggest && this.awayScoreSuggest == finalScoreSuggest.awayScoreSuggest;
        }

        public final int getAwayScoreSuggest() {
            return this.awayScoreSuggest;
        }

        public final int getHomeScoreSuggest() {
            return this.homeScoreSuggest;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        public int getId() {
            return this.id;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        @NotNull
        public SuggestStatus getStatus() {
            return this.status;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        public boolean getValidated() {
            return this.validated;
        }

        public int hashCode() {
            return Integer.hashCode(this.awayScoreSuggest) + wv8.a(this.homeScoreSuggest, dmi.e((this.status.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.validated), 31);
        }

        @NotNull
        public String toString() {
            int i = this.id;
            SuggestStatus suggestStatus = this.status;
            boolean z = this.validated;
            int i2 = this.homeScoreSuggest;
            int i3 = this.awayScoreSuggest;
            StringBuilder sb = new StringBuilder("FinalScoreSuggest(id=");
            sb.append(i);
            sb.append(", status=");
            sb.append(suggestStatus);
            sb.append(", validated=");
            sb.append(z);
            sb.append(", homeScoreSuggest=");
            sb.append(i2);
            sb.append(", awayScoreSuggest=");
            return fc6.h(i3, ")", sb);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggest$FinalScoreSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public FinalScoreSuggest(int i, @NotNull SuggestStatus suggestStatus, boolean z, int i2, int i3) {
            suggestStatus.getClass();
            this.id = i;
            this.status = suggestStatus;
            this.validated = z;
            this.homeScoreSuggest = i2;
            this.awayScoreSuggest = i3;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventStartDateSuggest")
    @r5h
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010 ¨\u00065"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest;", "", "id", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "status", "", "validated", "", "startDateSuggestTimestamp", "<init>", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZJ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/crowdsourcing/SuggestStatus;ZJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "component3", "()Z", "component4", "()J", "copy", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZJ)Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "getStatus", "Z", "getValidated", "J", "getStartDateSuggestTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartDateSuggest implements EventSuggest {
        private final int id;
        private final long startDateSuggestTimestamp;

        @NotNull
        private final SuggestStatus status;
        private final boolean validated;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new qt5(28)), null, null};

        public /* synthetic */ StartDateSuggest(int i, int i2, SuggestStatus suggestStatus, boolean z, long j, t5h t5hVar) {
            if (15 != (i & 15)) {
                oea.z(i, 15, EventSuggest$StartDateSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.status = suggestStatus;
            this.validated = z;
            this.startDateSuggestTimestamp = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return SuggestStatus.INSTANCE.serializer();
        }

        public static /* synthetic */ StartDateSuggest copy$default(StartDateSuggest startDateSuggest, int i, SuggestStatus suggestStatus, boolean z, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = startDateSuggest.id;
            }
            if ((i2 & 2) != 0) {
                suggestStatus = startDateSuggest.status;
            }
            if ((i2 & 4) != 0) {
                z = startDateSuggest.validated;
            }
            if ((i2 & 8) != 0) {
                j = startDateSuggest.startDateSuggestTimestamp;
            }
            boolean z2 = z;
            return startDateSuggest.copy(i, suggestStatus, z2, j);
        }

        public static final /* synthetic */ void write$Self$model_release(StartDateSuggest self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            output.u(0, self.getId(), serialDesc);
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.getStatus());
            output.x(serialDesc, 2, self.getValidated());
            output.E(serialDesc, 3, self.startDateSuggestTimestamp);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SuggestStatus getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getValidated() {
            return this.validated;
        }

        /* renamed from: component4, reason: from getter */
        public final long getStartDateSuggestTimestamp() {
            return this.startDateSuggestTimestamp;
        }

        @NotNull
        public final StartDateSuggest copy(int id, @NotNull SuggestStatus status, boolean validated, long startDateSuggestTimestamp) {
            status.getClass();
            return new StartDateSuggest(id, status, validated, startDateSuggestTimestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartDateSuggest)) {
                return false;
            }
            StartDateSuggest startDateSuggest = (StartDateSuggest) other;
            return this.id == startDateSuggest.id && this.status == startDateSuggest.status && this.validated == startDateSuggest.validated && this.startDateSuggestTimestamp == startDateSuggest.startDateSuggestTimestamp;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        public int getId() {
            return this.id;
        }

        public final long getStartDateSuggestTimestamp() {
            return this.startDateSuggestTimestamp;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        @NotNull
        public SuggestStatus getStatus() {
            return this.status;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        public boolean getValidated() {
            return this.validated;
        }

        public int hashCode() {
            return Long.hashCode(this.startDateSuggestTimestamp) + dmi.e((this.status.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.validated);
        }

        @NotNull
        public String toString() {
            return "StartDateSuggest(id=" + this.id + ", status=" + this.status + ", validated=" + this.validated + ", startDateSuggestTimestamp=" + this.startDateSuggestTimestamp + ")";
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggest$StartDateSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public StartDateSuggest(int i, @NotNull SuggestStatus suggestStatus, boolean z, long j) {
            suggestStatus.getClass();
            this.id = i;
            this.status = suggestStatus;
            this.validated = z;
            this.startDateSuggestTimestamp = j;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q5h("eventStatusSuggest")
    @r5h
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010!JF\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b3\u0010!¨\u00066"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "Lcom/sofascore/model/crowdsourcing/EventSuggest;", "", "id", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "status", "", "validated", "", "statusSuggest", "reasonSuggest", "<init>", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZLjava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/crowdsourcing/SuggestStatus;ZLjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "copy", "(ILcom/sofascore/model/crowdsourcing/SuggestStatus;ZLjava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "getStatus", "Z", "getValidated", "Ljava/lang/String;", "getStatusSuggest", "getReasonSuggest", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StatusSuggest implements EventSuggest {
        private final int id;

        @Nullable
        private final String reasonSuggest;

        @NotNull
        private final SuggestStatus status;

        @Nullable
        private final String statusSuggest;
        private final boolean validated;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new qt5(29)), null, null, null};

        public /* synthetic */ StatusSuggest(int i, int i2, SuggestStatus suggestStatus, boolean z, String str, String str2, t5h t5hVar) {
            if (31 != (i & 31)) {
                oea.z(i, 31, EventSuggest$StatusSuggest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = i2;
            this.status = suggestStatus;
            this.validated = z;
            this.statusSuggest = str;
            this.reasonSuggest = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return SuggestStatus.INSTANCE.serializer();
        }

        public static /* synthetic */ StatusSuggest copy$default(StatusSuggest statusSuggest, int i, SuggestStatus suggestStatus, boolean z, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = statusSuggest.id;
            }
            if ((i2 & 2) != 0) {
                suggestStatus = statusSuggest.status;
            }
            if ((i2 & 4) != 0) {
                z = statusSuggest.validated;
            }
            if ((i2 & 8) != 0) {
                str = statusSuggest.statusSuggest;
            }
            if ((i2 & 16) != 0) {
                str2 = statusSuggest.reasonSuggest;
            }
            String str3 = str2;
            boolean z2 = z;
            return statusSuggest.copy(i, suggestStatus, z2, str, str3);
        }

        public static final /* synthetic */ void write$Self$model_release(StatusSuggest self, wf3 output, SerialDescriptor serialDesc) {
            joa[] joaVarArr = $childSerializers;
            output.u(0, self.getId(), serialDesc);
            output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.getStatus());
            output.x(serialDesc, 2, self.getValidated());
            uhi uhiVar = uhi.a;
            output.h(serialDesc, 3, uhiVar, self.statusSuggest);
            output.h(serialDesc, 4, uhiVar, self.reasonSuggest);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final SuggestStatus getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getValidated() {
            return this.validated;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getStatusSuggest() {
            return this.statusSuggest;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getReasonSuggest() {
            return this.reasonSuggest;
        }

        @NotNull
        public final StatusSuggest copy(int id, @NotNull SuggestStatus status, boolean validated, @Nullable String statusSuggest, @Nullable String reasonSuggest) {
            status.getClass();
            return new StatusSuggest(id, status, validated, statusSuggest, reasonSuggest);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusSuggest)) {
                return false;
            }
            StatusSuggest statusSuggest = (StatusSuggest) other;
            return this.id == statusSuggest.id && this.status == statusSuggest.status && this.validated == statusSuggest.validated && Intrinsics.c(this.statusSuggest, statusSuggest.statusSuggest) && Intrinsics.c(this.reasonSuggest, statusSuggest.reasonSuggest);
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        public int getId() {
            return this.id;
        }

        @Nullable
        public final String getReasonSuggest() {
            return this.reasonSuggest;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        @NotNull
        public SuggestStatus getStatus() {
            return this.status;
        }

        @Nullable
        public final String getStatusSuggest() {
            return this.statusSuggest;
        }

        @Override // com.sofascore.model.crowdsourcing.EventSuggest
        public boolean getValidated() {
            return this.validated;
        }

        public int hashCode() {
            int e = dmi.e((this.status.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.validated);
            String str = this.statusSuggest;
            int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonSuggest;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i = this.id;
            SuggestStatus suggestStatus = this.status;
            boolean z = this.validated;
            String str = this.statusSuggest;
            String str2 = this.reasonSuggest;
            StringBuilder sb = new StringBuilder("StatusSuggest(id=");
            sb.append(i);
            sb.append(", status=");
            sb.append(suggestStatus);
            sb.append(", validated=");
            sb.append(z);
            sb.append(", statusSuggest=");
            sb.append(str);
            sb.append(", reasonSuggest=");
            return mz1.o(sb, str2, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return EventSuggest$StatusSuggest$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public StatusSuggest(int i, @NotNull SuggestStatus suggestStatus, boolean z, @Nullable String str, @Nullable String str2) {
            suggestStatus.getClass();
            this.id = i;
            this.status = suggestStatus;
            this.validated = z;
            this.statusSuggest = str;
            this.reasonSuggest = str2;
        }
    }
}
