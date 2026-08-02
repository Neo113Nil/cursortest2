package com.sofascore.model.mvvm.model;

import defpackage.gz1;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.qt5;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 JJ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010 ¨\u00063"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventFunFact;", "", "", "text", "", "highlighted", "", "Lcom/sofascore/model/mvvm/model/Team;", "teams", "Lcom/sofascore/model/mvvm/model/Player;", "players", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/EventFunFact;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/EventFunFact;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/lang/Boolean;", "getHighlighted", "Ljava/util/List;", "getTeams", "getPlayers", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventFunFact {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean highlighted;

    @Nullable
    private final List<Player> players;

    @Nullable
    private final List<Team> teams;

    @NotNull
    private final String text;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new qt5(3)), ypa.a(ysaVar, new qt5(4))};
    }

    public /* synthetic */ EventFunFact(int i, String str, Boolean bool, List list, List list2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, EventFunFact$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.highlighted = bool;
        this.teams = list;
        this.players = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Player$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventFunFact copy$default(EventFunFact eventFunFact, String str, Boolean bool, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventFunFact.text;
        }
        if ((i & 2) != 0) {
            bool = eventFunFact.highlighted;
        }
        if ((i & 4) != 0) {
            list = eventFunFact.teams;
        }
        if ((i & 8) != 0) {
            list2 = eventFunFact.players;
        }
        return eventFunFact.copy(str, bool, list, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(EventFunFact self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.text);
        output.h(serialDesc, 1, gz1.a, self.highlighted);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.teams);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.players);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getHighlighted() {
        return this.highlighted;
    }

    @Nullable
    public final List<Team> component3() {
        return this.teams;
    }

    @Nullable
    public final List<Player> component4() {
        return this.players;
    }

    @NotNull
    public final EventFunFact copy(@NotNull String text, @Nullable Boolean highlighted, @Nullable List<Team> teams, @Nullable List<Player> players) {
        text.getClass();
        return new EventFunFact(text, highlighted, teams, players);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventFunFact)) {
            return false;
        }
        EventFunFact eventFunFact = (EventFunFact) other;
        return Intrinsics.c(this.text, eventFunFact.text) && Intrinsics.c(this.highlighted, eventFunFact.highlighted) && Intrinsics.c(this.teams, eventFunFact.teams) && Intrinsics.c(this.players, eventFunFact.players);
    }

    @Nullable
    public final Boolean getHighlighted() {
        return this.highlighted;
    }

    @Nullable
    public final List<Player> getPlayers() {
        return this.players;
    }

    @Nullable
    public final List<Team> getTeams() {
        return this.teams;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Boolean bool = this.highlighted;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Team> list = this.teams;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Player> list2 = this.players;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        Boolean bool = this.highlighted;
        List<Team> list = this.teams;
        List<Player> list2 = this.players;
        StringBuilder sb = new StringBuilder("EventFunFact(text=");
        sb.append(str);
        sb.append(", highlighted=");
        sb.append(bool);
        sb.append(", teams=");
        return me4.j(sb, list, ", players=", list2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventFunFact$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/EventFunFact;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventFunFact$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventFunFact(@NotNull String str, @Nullable Boolean bool, @Nullable List<Team> list, @Nullable List<Player> list2) {
        str.getClass();
        this.text = str;
        this.highlighted = bool;
        this.teams = list;
        this.players = list2;
    }
}
