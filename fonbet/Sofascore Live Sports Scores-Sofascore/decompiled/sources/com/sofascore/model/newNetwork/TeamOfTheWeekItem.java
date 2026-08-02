package com.sofascore.model.newNetwork;

import defpackage.duf;
import defpackage.ffa;
import defpackage.fuf;
import defpackage.r5h;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ffa(discriminator = "type")
@r5h
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\b\u0010\u0016\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem;", "", "id", "", "getId", "()I", "type", "", "getType", "()Ljava/lang/String;", "periodName", "getPeriodName", "tournamentId", "getTournamentId", "()Ljava/lang/Integer;", "createdAtTimestamp", "", "getCreatedAtTimestamp", "()J", "startDateTimestamp", "getStartDateTimestamp", "()Ljava/lang/Long;", "getItemName", "Companion", "Lcom/sofascore/model/newNetwork/TeamOfThePeriodRound;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekRound;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekSeason;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TeamOfTheWeekItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.newNetwork.TeamOfTheWeekItem", fufVar.getOrCreateKotlinClass(TeamOfTheWeekItem.class), new KClass[]{fufVar.getOrCreateKotlinClass(TeamOfThePeriodRound.class), fufVar.getOrCreateKotlinClass(TeamOfTheWeekRound.class), fufVar.getOrCreateKotlinClass(TeamOfTheWeekSeason.class), fufVar.getOrCreateKotlinClass(TeamOfTheWeekTimespan.class)}, new KSerializer[]{TeamOfThePeriodRound$$serializer.INSTANCE, TeamOfTheWeekRound$$serializer.INSTANCE, TeamOfTheWeekSeason$$serializer.INSTANCE, TeamOfTheWeekTimespan$$serializer.INSTANCE}, new Annotation[]{new TeamOfTheWeekItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type")});
        }
    }

    long getCreatedAtTimestamp();

    int getId();

    @NotNull
    String getItemName();

    @NotNull
    String getPeriodName();

    @Nullable
    Long getStartDateTimestamp();

    @Nullable
    Integer getTournamentId();

    @NotNull
    String getType();
}
