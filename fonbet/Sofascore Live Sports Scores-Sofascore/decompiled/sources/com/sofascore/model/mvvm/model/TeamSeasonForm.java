package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0016¨\u0006+"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "Ljava/io/Serializable;", "", "wins", "losses", "draws", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TeamSeasonForm;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWins", "getLosses", "getDraws", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamSeasonForm implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer draws;

    @Nullable
    private final Integer losses;

    @Nullable
    private final Integer wins;

    public /* synthetic */ TeamSeasonForm(int i, Integer num, Integer num2, Integer num3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TeamSeasonForm$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.wins = num;
        this.losses = num2;
        this.draws = num3;
    }

    public static /* synthetic */ TeamSeasonForm copy$default(TeamSeasonForm teamSeasonForm, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = teamSeasonForm.wins;
        }
        if ((i & 2) != 0) {
            num2 = teamSeasonForm.losses;
        }
        if ((i & 4) != 0) {
            num3 = teamSeasonForm.draws;
        }
        return teamSeasonForm.copy(num, num2, num3);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamSeasonForm self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.wins);
        output.h(serialDesc, 1, a7aVar, self.losses);
        output.h(serialDesc, 2, a7aVar, self.draws);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getWins() {
        return this.wins;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getDraws() {
        return this.draws;
    }

    @NotNull
    public final TeamSeasonForm copy(@Nullable Integer wins, @Nullable Integer losses, @Nullable Integer draws) {
        return new TeamSeasonForm(wins, losses, draws);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamSeasonForm)) {
            return false;
        }
        TeamSeasonForm teamSeasonForm = (TeamSeasonForm) other;
        return Intrinsics.c(this.wins, teamSeasonForm.wins) && Intrinsics.c(this.losses, teamSeasonForm.losses) && Intrinsics.c(this.draws, teamSeasonForm.draws);
    }

    @Nullable
    public final Integer getDraws() {
        return this.draws;
    }

    @Nullable
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    public final Integer getWins() {
        return this.wins;
    }

    public int hashCode() {
        Integer num = this.wins;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.losses;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.draws;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.wins;
        Integer num2 = this.losses;
        return vxd.n(wv8.k(num, "TeamSeasonForm(wins=", ", losses=", ", draws=", num2), this.draws, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamSeasonForm$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamSeasonForm$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamSeasonForm(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.wins = num;
        this.losses = num2;
        this.draws = num3;
    }
}
