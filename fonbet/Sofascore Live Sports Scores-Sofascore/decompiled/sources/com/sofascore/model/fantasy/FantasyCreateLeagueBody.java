package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody;", "", "", "fantasyCompetitionId", "", "name", "description", "gameType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFantasyCompetitionId", "Ljava/lang/String;", "getName", "getDescription", "Ljava/lang/Integer;", "getGameType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyCreateLeagueBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;
    private final int fantasyCompetitionId;

    @Nullable
    private final Integer gameType;

    @NotNull
    private final String name;

    public /* synthetic */ FantasyCreateLeagueBody(int i, int i2, String str, String str2, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyCreateLeagueBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fantasyCompetitionId = i2;
        this.name = str;
        this.description = str2;
        if ((i & 8) == 0) {
            this.gameType = null;
        } else {
            this.gameType = num;
        }
    }

    public static /* synthetic */ FantasyCreateLeagueBody copy$default(FantasyCreateLeagueBody fantasyCreateLeagueBody, int i, String str, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyCreateLeagueBody.fantasyCompetitionId;
        }
        if ((i2 & 2) != 0) {
            str = fantasyCreateLeagueBody.name;
        }
        if ((i2 & 4) != 0) {
            str2 = fantasyCreateLeagueBody.description;
        }
        if ((i2 & 8) != 0) {
            num = fantasyCreateLeagueBody.gameType;
        }
        return fantasyCreateLeagueBody.copy(i, str, str2, num);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyCreateLeagueBody self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.fantasyCompetitionId, serialDesc);
        output.y(serialDesc, 1, self.name);
        output.y(serialDesc, 2, self.description);
        if (!output.o(serialDesc) && self.gameType == null) {
            return;
        }
        output.h(serialDesc, 3, a7a.a, self.gameType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFantasyCompetitionId() {
        return this.fantasyCompetitionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getGameType() {
        return this.gameType;
    }

    @NotNull
    public final FantasyCreateLeagueBody copy(int fantasyCompetitionId, @NotNull String name, @NotNull String description, @Nullable Integer gameType) {
        name.getClass();
        description.getClass();
        return new FantasyCreateLeagueBody(fantasyCompetitionId, name, description, gameType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyCreateLeagueBody)) {
            return false;
        }
        FantasyCreateLeagueBody fantasyCreateLeagueBody = (FantasyCreateLeagueBody) other;
        return this.fantasyCompetitionId == fantasyCreateLeagueBody.fantasyCompetitionId && Intrinsics.c(this.name, fantasyCreateLeagueBody.name) && Intrinsics.c(this.description, fantasyCreateLeagueBody.description) && Intrinsics.c(this.gameType, fantasyCreateLeagueBody.gameType);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getFantasyCompetitionId() {
        return this.fantasyCompetitionId;
    }

    @Nullable
    public final Integer getGameType() {
        return this.gameType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.fantasyCompetitionId) * 31, 31, this.name), 31, this.description);
        Integer num = this.gameType;
        return c + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.fantasyCompetitionId;
        String str = this.name;
        String str2 = this.description;
        Integer num = this.gameType;
        StringBuilder t = dmi.t(i, "FantasyCreateLeagueBody(fantasyCompetitionId=", ", name=", str, ", description=");
        t.append(str2);
        t.append(", gameType=");
        t.append(num);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyCreateLeagueBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyCreateLeagueBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyCreateLeagueBody(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num) {
        str.getClass();
        str2.getClass();
        this.fantasyCompetitionId = i;
        this.name = str;
        this.description = str2;
        this.gameType = num;
    }

    public /* synthetic */ FantasyCreateLeagueBody(int i, String str, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : num);
    }
}
