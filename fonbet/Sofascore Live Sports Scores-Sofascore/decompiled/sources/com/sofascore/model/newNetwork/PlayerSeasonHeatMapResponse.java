package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.boe;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bBI\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerSeasonHeatMapResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "matches", "", "Lcom/sofascore/model/newNetwork/SeasonHeatMapPoint;", "points", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/lang/Integer;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerSeasonHeatMapResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/sofascore/model/newNetwork/PlayerSeasonHeatMapResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMatches", "Ljava/util/List;", "getPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerSeasonHeatMapResponse extends NetworkResponse {

    @Nullable
    private final Integer matches;

    @Nullable
    private final List<SeasonHeatMapPoint> points;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new boe(21))};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayerSeasonHeatMapResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, Integer num, List list, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, PlayerSeasonHeatMapResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.matches = num;
        this.points = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(SeasonHeatMapPoint$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerSeasonHeatMapResponse copy$default(PlayerSeasonHeatMapResponse playerSeasonHeatMapResponse, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = playerSeasonHeatMapResponse.matches;
        }
        if ((i & 2) != 0) {
            list = playerSeasonHeatMapResponse.points;
        }
        return playerSeasonHeatMapResponse.copy(num, list);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerSeasonHeatMapResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, a7a.a, self.matches);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.points);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final List<SeasonHeatMapPoint> component2() {
        return this.points;
    }

    @NotNull
    public final PlayerSeasonHeatMapResponse copy(@Nullable Integer matches, @Nullable List<SeasonHeatMapPoint> points) {
        return new PlayerSeasonHeatMapResponse(matches, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerSeasonHeatMapResponse)) {
            return false;
        }
        PlayerSeasonHeatMapResponse playerSeasonHeatMapResponse = (PlayerSeasonHeatMapResponse) other;
        return Intrinsics.c(this.matches, playerSeasonHeatMapResponse.matches) && Intrinsics.c(this.points, playerSeasonHeatMapResponse.points);
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final List<SeasonHeatMapPoint> getPoints() {
        return this.points;
    }

    public int hashCode() {
        Integer num = this.matches;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<SeasonHeatMapPoint> list = this.points;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayerSeasonHeatMapResponse(matches=" + this.matches + ", points=" + this.points + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerSeasonHeatMapResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerSeasonHeatMapResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerSeasonHeatMapResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerSeasonHeatMapResponse(@Nullable Integer num, @Nullable List<SeasonHeatMapPoint> list) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.matches = num;
        this.points = list;
    }
}
