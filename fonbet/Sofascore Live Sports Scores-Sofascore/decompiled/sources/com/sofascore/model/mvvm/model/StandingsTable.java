package com.sofascore.model.mvvm.model;

import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.u9i;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b2\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/sofascore/model/mvvm/model/StandingsTable;", "", "", "id", "", "name", "", "Lcom/sofascore/model/mvvm/model/StandingsTableRow;", "rows", "Lcom/sofascore/model/mvvm/model/Tournament;", "tournament", "Lcom/sofascore/model/mvvm/model/Description;", "tieBreakingRule", "descriptions", "", "updatedAtTimestamp", "Lcom/sofascore/model/mvvm/model/StandingsBucket;", "bucket", "<init>", "(ILjava/lang/String;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Tournament;Lcom/sofascore/model/mvvm/model/Description;Ljava/util/List;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StandingsBucket;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Tournament;Lcom/sofascore/model/mvvm/model/Description;Ljava/util/List;Ljava/lang/Long;Lcom/sofascore/model/mvvm/model/StandingsBucket;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StandingsTable;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "()Lcom/sofascore/model/mvvm/model/Tournament;", "Lcom/sofascore/model/mvvm/model/Description;", "getTieBreakingRule", "()Lcom/sofascore/model/mvvm/model/Description;", "setTieBreakingRule", "(Lcom/sofascore/model/mvvm/model/Description;)V", "getDescriptions", "Ljava/lang/Long;", "getUpdatedAtTimestamp", "()Ljava/lang/Long;", "Lcom/sofascore/model/mvvm/model/StandingsBucket;", "getBucket", "()Lcom/sofascore/model/mvvm/model/StandingsBucket;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StandingsTable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final StandingsBucket bucket;

    @NotNull
    private final List<Description> descriptions;
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final List<StandingsTableRow> rows;

    @Nullable
    private Description tieBreakingRule;

    @NotNull
    private final Tournament tournament;

    @Nullable
    private final Long updatedAtTimestamp;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new u9i(12)), null, null, ypa.a(ysaVar, new u9i(13)), null, ypa.a(ysaVar, new u9i(14))};
    }

    public /* synthetic */ StandingsTable(int i, int i2, String str, List list, Tournament tournament, Description description, List list2, Long l, StandingsBucket standingsBucket, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, StandingsTable$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.name = str;
        this.rows = list;
        this.tournament = tournament;
        this.tieBreakingRule = description;
        this.descriptions = list2;
        this.updatedAtTimestamp = l;
        this.bucket = standingsBucket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(StandingsTableRow$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Description$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return StandingsBucket.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self$model_release(StandingsTable self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.rows);
        output.f(serialDesc, 3, Tournament$$serializer.INSTANCE, self.tournament);
        output.h(serialDesc, 4, Description$$serializer.INSTANCE, self.tieBreakingRule);
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.descriptions);
        output.h(serialDesc, 6, lkb.a, self.updatedAtTimestamp);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.bucket);
    }

    @Nullable
    public final StandingsBucket getBucket() {
        return this.bucket;
    }

    @NotNull
    public final List<Description> getDescriptions() {
        return this.descriptions;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<StandingsTableRow> getRows() {
        return this.rows;
    }

    @Nullable
    public final Description getTieBreakingRule() {
        return this.tieBreakingRule;
    }

    @NotNull
    public final Tournament getTournament() {
        return this.tournament;
    }

    @Nullable
    public final Long getUpdatedAtTimestamp() {
        return this.updatedAtTimestamp;
    }

    public final void setTieBreakingRule(@Nullable Description description) {
        this.tieBreakingRule = description;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StandingsTable$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StandingsTable;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StandingsTable$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StandingsTable(int i, @NotNull String str, @NotNull List<StandingsTableRow> list, @NotNull Tournament tournament, @Nullable Description description, @NotNull List<Description> list2, @Nullable Long l, @Nullable StandingsBucket standingsBucket) {
        str.getClass();
        list.getClass();
        tournament.getClass();
        list2.getClass();
        this.id = i;
        this.name = str;
        this.rows = list;
        this.tournament = tournament;
        this.tieBreakingRule = description;
        this.descriptions = list2;
        this.updatedAtTimestamp = l;
        this.bucket = standingsBucket;
    }
}
