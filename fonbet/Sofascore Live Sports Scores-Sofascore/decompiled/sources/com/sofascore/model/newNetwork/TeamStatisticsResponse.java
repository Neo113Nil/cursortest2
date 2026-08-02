package com.sofascore.model.newNetwork;

import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uye;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0002 \u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0005\u0010\u000fJG\u0010\u001b\u001a\u00020\u0018\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamStatisticsResponse;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "T", "Lcom/sofascore/model/newNetwork/NetworkResponse;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "<init>", "(Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;Lt5h;)V", "", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamStatisticsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "getStatistics", "()Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamStatisticsResponse<T extends TeamSeasonStatistics> extends NetworkResponse {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final T statistics;

    static {
        uye uyeVar = new uye("com.sofascore.model.newNetwork.TeamStatisticsResponse", null, 3);
        uyeVar.j("head", true);
        uyeVar.j("error", true);
        uyeVar.j(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, false);
        $cachedDescriptor = uyeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TeamStatisticsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, TeamSeasonStatistics teamSeasonStatistics, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (4 != (i & 4)) {
            oea.z(i, 4, $cachedDescriptor);
            throw null;
        }
        this.statistics = teamSeasonStatistics;
    }

    public static final /* synthetic */ void write$Self$model_release(TeamStatisticsResponse self, wf3 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, typeSerial0, self.statistics);
    }

    @NotNull
    public final T getStatistics() {
        return this.statistics;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamStatisticsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamStatisticsResponse;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new TeamStatisticsResponse$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamStatisticsResponse(@NotNull T t) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        t.getClass();
        this.statistics = t;
    }
}
