package com.sofascore.model.newNetwork;

import defpackage.mz1;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBU\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0007\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J.\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010!R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/PregameFormResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/newNetwork/TeamForm;", "homeTeam", "awayTeam", "", "label", "<init>", "(Lcom/sofascore/model/newNetwork/TeamForm;Lcom/sofascore/model/newNetwork/TeamForm;Ljava/lang/String;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "hasMmaRankings", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/newNetwork/TeamForm;Lcom/sofascore/model/newNetwork/TeamForm;Ljava/lang/String;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PregameFormResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/TeamForm;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/sofascore/model/newNetwork/TeamForm;Lcom/sofascore/model/newNetwork/TeamForm;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/PregameFormResponse;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/TeamForm;", "getHomeTeam", "getAwayTeam", "Ljava/lang/String;", "getLabel", "Z", "getHasMmaRankings", "()Z", "setHasMmaRankings", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PregameFormResponse extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final TeamForm awayTeam;
    private boolean hasMmaRankings;

    @NotNull
    private final TeamForm homeTeam;

    @NotNull
    private final String label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PregameFormResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, TeamForm teamForm, TeamForm teamForm2, String str, boolean z, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (28 != (i & 28)) {
            oea.z(i, 28, PregameFormResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeTeam = teamForm;
        this.awayTeam = teamForm2;
        this.label = str;
        if ((i & 32) == 0) {
            this.hasMmaRankings = false;
        } else {
            this.hasMmaRankings = z;
        }
    }

    public static /* synthetic */ PregameFormResponse copy$default(PregameFormResponse pregameFormResponse, TeamForm teamForm, TeamForm teamForm2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            teamForm = pregameFormResponse.homeTeam;
        }
        if ((i & 2) != 0) {
            teamForm2 = pregameFormResponse.awayTeam;
        }
        if ((i & 4) != 0) {
            str = pregameFormResponse.label;
        }
        return pregameFormResponse.copy(teamForm, teamForm2, str);
    }

    public static final /* synthetic */ void write$Self$model_release(PregameFormResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        TeamForm$$serializer teamForm$$serializer = TeamForm$$serializer.INSTANCE;
        output.f(serialDesc, 2, teamForm$$serializer, self.homeTeam);
        output.f(serialDesc, 3, teamForm$$serializer, self.awayTeam);
        output.y(serialDesc, 4, self.label);
        if (output.o(serialDesc) || self.hasMmaRankings) {
            output.x(serialDesc, 5, self.hasMmaRankings);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TeamForm getHomeTeam() {
        return this.homeTeam;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TeamForm getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final PregameFormResponse copy(@NotNull TeamForm homeTeam, @NotNull TeamForm awayTeam, @NotNull String label) {
        homeTeam.getClass();
        awayTeam.getClass();
        label.getClass();
        return new PregameFormResponse(homeTeam, awayTeam, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregameFormResponse)) {
            return false;
        }
        PregameFormResponse pregameFormResponse = (PregameFormResponse) other;
        return Intrinsics.c(this.homeTeam, pregameFormResponse.homeTeam) && Intrinsics.c(this.awayTeam, pregameFormResponse.awayTeam) && Intrinsics.c(this.label, pregameFormResponse.label);
    }

    @NotNull
    public final TeamForm getAwayTeam() {
        return this.awayTeam;
    }

    public final boolean getHasMmaRankings() {
        return this.hasMmaRankings;
    }

    @NotNull
    public final TeamForm getHomeTeam() {
        return this.homeTeam;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode() + ((this.awayTeam.hashCode() + (this.homeTeam.hashCode() * 31)) * 31);
    }

    public final void setHasMmaRankings(boolean z) {
        this.hasMmaRankings = z;
    }

    @NotNull
    public String toString() {
        TeamForm teamForm = this.homeTeam;
        TeamForm teamForm2 = this.awayTeam;
        String str = this.label;
        StringBuilder sb = new StringBuilder("PregameFormResponse(homeTeam=");
        sb.append(teamForm);
        sb.append(", awayTeam=");
        sb.append(teamForm2);
        sb.append(", label=");
        return mz1.o(sb, str, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PregameFormResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PregameFormResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PregameFormResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PregameFormResponse(@NotNull TeamForm teamForm, @NotNull TeamForm teamForm2, @NotNull String str) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        teamForm.getClass();
        teamForm2.getClass();
        str.getClass();
        this.homeTeam = teamForm;
        this.awayTeam = teamForm2;
        this.label = str;
    }
}
