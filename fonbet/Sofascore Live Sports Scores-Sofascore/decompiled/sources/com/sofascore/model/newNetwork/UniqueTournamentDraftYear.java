package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.uzj;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ@\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b-\u0010\u001a¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;", "", "", "year", "", "", "rounds", "", "isLotteryComplete", "status", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getYear", "Ljava/util/List;", "getRounds", "Z", "getStatus", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentDraftYear {
    private final boolean isLotteryComplete;

    @NotNull
    private final List<Integer> rounds;

    @Nullable
    private final String status;

    @NotNull
    private final String year;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new uzj(29)), null, null};

    public /* synthetic */ UniqueTournamentDraftYear(int i, String str, List list, boolean z, String str2, t5h t5hVar) {
        if (11 != (i & 11)) {
            oea.z(i, 11, UniqueTournamentDraftYear$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.year = str;
        this.rounds = list;
        if ((i & 4) == 0) {
            this.isLotteryComplete = false;
        } else {
            this.isLotteryComplete = z;
        }
        this.status = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniqueTournamentDraftYear copy$default(UniqueTournamentDraftYear uniqueTournamentDraftYear, String str, List list, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uniqueTournamentDraftYear.year;
        }
        if ((i & 2) != 0) {
            list = uniqueTournamentDraftYear.rounds;
        }
        if ((i & 4) != 0) {
            z = uniqueTournamentDraftYear.isLotteryComplete;
        }
        if ((i & 8) != 0) {
            str2 = uniqueTournamentDraftYear.status;
        }
        return uniqueTournamentDraftYear.copy(str, list, z, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentDraftYear self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.year);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.rounds);
        if (output.o(serialDesc) || self.isLotteryComplete) {
            output.x(serialDesc, 2, self.isLotteryComplete);
        }
        output.h(serialDesc, 3, uhi.a, self.status);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.rounds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLotteryComplete() {
        return this.isLotteryComplete;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final UniqueTournamentDraftYear copy(@NotNull String year, @NotNull List<Integer> rounds, boolean isLotteryComplete, @Nullable String status) {
        year.getClass();
        rounds.getClass();
        return new UniqueTournamentDraftYear(year, rounds, isLotteryComplete, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentDraftYear)) {
            return false;
        }
        UniqueTournamentDraftYear uniqueTournamentDraftYear = (UniqueTournamentDraftYear) other;
        return Intrinsics.c(this.year, uniqueTournamentDraftYear.year) && Intrinsics.c(this.rounds, uniqueTournamentDraftYear.rounds) && this.isLotteryComplete == uniqueTournamentDraftYear.isLotteryComplete && Intrinsics.c(this.status, uniqueTournamentDraftYear.status);
    }

    @NotNull
    public final List<Integer> getRounds() {
        return this.rounds;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        int e = dmi.e(dmi.d(this.year.hashCode() * 31, 31, this.rounds), 31, this.isLotteryComplete);
        String str = this.status;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final boolean isLotteryComplete() {
        return this.isLotteryComplete;
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentDraftYear(year=" + this.year + ", rounds=" + this.rounds + ", isLotteryComplete=" + this.isLotteryComplete + ", status=" + this.status + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentDraftYear$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentDraftYear(@NotNull String str, @NotNull List<Integer> list, boolean z, @Nullable String str2) {
        str.getClass();
        list.getClass();
        this.year = str;
        this.rounds = list;
        this.isLotteryComplete = z;
        this.status = str2;
    }

    public /* synthetic */ UniqueTournamentDraftYear(String str, List list, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z, str2);
    }
}
