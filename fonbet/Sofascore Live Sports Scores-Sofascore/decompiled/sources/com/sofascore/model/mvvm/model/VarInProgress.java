package com.sofascore.model.mvvm.model;

import defpackage.gz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lcom/sofascore/model/mvvm/model/VarInProgress;", "Ljava/io/Serializable;", "", "homeTeam", "awayTeam", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/VarInProgress;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sofascore/model/mvvm/model/VarInProgress;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getHomeTeam", "getAwayTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VarInProgress implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean awayTeam;

    @Nullable
    private final Boolean homeTeam;

    public /* synthetic */ VarInProgress(int i, Boolean bool, Boolean bool2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, VarInProgress$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeTeam = bool;
        this.awayTeam = bool2;
    }

    public static /* synthetic */ VarInProgress copy$default(VarInProgress varInProgress, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = varInProgress.homeTeam;
        }
        if ((i & 2) != 0) {
            bool2 = varInProgress.awayTeam;
        }
        return varInProgress.copy(bool, bool2);
    }

    public static final /* synthetic */ void write$Self$model_release(VarInProgress self, wf3 output, SerialDescriptor serialDesc) {
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 0, gz1Var, self.homeTeam);
        output.h(serialDesc, 1, gz1Var, self.awayTeam);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    public final VarInProgress copy(@Nullable Boolean homeTeam, @Nullable Boolean awayTeam) {
        return new VarInProgress(homeTeam, awayTeam);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarInProgress)) {
            return false;
        }
        VarInProgress varInProgress = (VarInProgress) other;
        return Intrinsics.c(this.homeTeam, varInProgress.homeTeam) && Intrinsics.c(this.awayTeam, varInProgress.awayTeam);
    }

    @Nullable
    public final Boolean getAwayTeam() {
        return this.awayTeam;
    }

    @Nullable
    public final Boolean getHomeTeam() {
        return this.homeTeam;
    }

    public int hashCode() {
        Boolean bool = this.homeTeam;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.awayTeam;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VarInProgress(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/VarInProgress$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/VarInProgress;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VarInProgress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VarInProgress(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.homeTeam = bool;
        this.awayTeam = bool2;
    }
}
