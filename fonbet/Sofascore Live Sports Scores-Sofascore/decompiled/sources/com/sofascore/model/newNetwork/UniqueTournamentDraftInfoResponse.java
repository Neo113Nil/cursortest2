package com.sofascore.model.newNetwork;

import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JJ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00064"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;", "", "", "lotteryYear", "prospectsYear", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;", "draft", "previousDraft", "", "hasLotteryDraw", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;Z)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;Z)Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLotteryYear", "getProspectsYear", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftYear;", "getDraft", "getPreviousDraft", "Z", "getHasLotteryDraw", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentDraftInfoResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final UniqueTournamentDraftYear draft;
    private final boolean hasLotteryDraw;

    @Nullable
    private final String lotteryYear;

    @Nullable
    private final UniqueTournamentDraftYear previousDraft;

    @Nullable
    private final String prospectsYear;

    public /* synthetic */ UniqueTournamentDraftInfoResponse(int i, String str, String str2, UniqueTournamentDraftYear uniqueTournamentDraftYear, UniqueTournamentDraftYear uniqueTournamentDraftYear2, boolean z, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, UniqueTournamentDraftInfoResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lotteryYear = str;
        this.prospectsYear = str2;
        this.draft = uniqueTournamentDraftYear;
        this.previousDraft = uniqueTournamentDraftYear2;
        if ((i & 16) == 0) {
            this.hasLotteryDraw = true;
        } else {
            this.hasLotteryDraw = z;
        }
    }

    public static /* synthetic */ UniqueTournamentDraftInfoResponse copy$default(UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse, String str, String str2, UniqueTournamentDraftYear uniqueTournamentDraftYear, UniqueTournamentDraftYear uniqueTournamentDraftYear2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uniqueTournamentDraftInfoResponse.lotteryYear;
        }
        if ((i & 2) != 0) {
            str2 = uniqueTournamentDraftInfoResponse.prospectsYear;
        }
        if ((i & 4) != 0) {
            uniqueTournamentDraftYear = uniqueTournamentDraftInfoResponse.draft;
        }
        if ((i & 8) != 0) {
            uniqueTournamentDraftYear2 = uniqueTournamentDraftInfoResponse.previousDraft;
        }
        if ((i & 16) != 0) {
            z = uniqueTournamentDraftInfoResponse.hasLotteryDraw;
        }
        boolean z2 = z;
        UniqueTournamentDraftYear uniqueTournamentDraftYear3 = uniqueTournamentDraftYear;
        return uniqueTournamentDraftInfoResponse.copy(str, str2, uniqueTournamentDraftYear3, uniqueTournamentDraftYear2, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentDraftInfoResponse self, wf3 output, SerialDescriptor serialDesc) {
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.lotteryYear);
        output.h(serialDesc, 1, uhiVar, self.prospectsYear);
        UniqueTournamentDraftYear$$serializer uniqueTournamentDraftYear$$serializer = UniqueTournamentDraftYear$$serializer.INSTANCE;
        output.h(serialDesc, 2, uniqueTournamentDraftYear$$serializer, self.draft);
        output.h(serialDesc, 3, uniqueTournamentDraftYear$$serializer, self.previousDraft);
        if (!output.o(serialDesc) && self.hasLotteryDraw) {
            return;
        }
        output.x(serialDesc, 4, self.hasLotteryDraw);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLotteryYear() {
        return this.lotteryYear;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getProspectsYear() {
        return this.prospectsYear;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final UniqueTournamentDraftYear getDraft() {
        return this.draft;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final UniqueTournamentDraftYear getPreviousDraft() {
        return this.previousDraft;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasLotteryDraw() {
        return this.hasLotteryDraw;
    }

    @NotNull
    public final UniqueTournamentDraftInfoResponse copy(@Nullable String lotteryYear, @Nullable String prospectsYear, @Nullable UniqueTournamentDraftYear draft, @Nullable UniqueTournamentDraftYear previousDraft, boolean hasLotteryDraw) {
        return new UniqueTournamentDraftInfoResponse(lotteryYear, prospectsYear, draft, previousDraft, hasLotteryDraw);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentDraftInfoResponse)) {
            return false;
        }
        UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse = (UniqueTournamentDraftInfoResponse) other;
        return Intrinsics.c(this.lotteryYear, uniqueTournamentDraftInfoResponse.lotteryYear) && Intrinsics.c(this.prospectsYear, uniqueTournamentDraftInfoResponse.prospectsYear) && Intrinsics.c(this.draft, uniqueTournamentDraftInfoResponse.draft) && Intrinsics.c(this.previousDraft, uniqueTournamentDraftInfoResponse.previousDraft) && this.hasLotteryDraw == uniqueTournamentDraftInfoResponse.hasLotteryDraw;
    }

    @Nullable
    public final UniqueTournamentDraftYear getDraft() {
        return this.draft;
    }

    public final boolean getHasLotteryDraw() {
        return this.hasLotteryDraw;
    }

    @Nullable
    public final String getLotteryYear() {
        return this.lotteryYear;
    }

    @Nullable
    public final UniqueTournamentDraftYear getPreviousDraft() {
        return this.previousDraft;
    }

    @Nullable
    public final String getProspectsYear() {
        return this.prospectsYear;
    }

    public int hashCode() {
        String str = this.lotteryYear;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prospectsYear;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniqueTournamentDraftYear uniqueTournamentDraftYear = this.draft;
        int hashCode3 = (hashCode2 + (uniqueTournamentDraftYear == null ? 0 : uniqueTournamentDraftYear.hashCode())) * 31;
        UniqueTournamentDraftYear uniqueTournamentDraftYear2 = this.previousDraft;
        return Boolean.hashCode(this.hasLotteryDraw) + ((hashCode3 + (uniqueTournamentDraftYear2 != null ? uniqueTournamentDraftYear2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.lotteryYear;
        String str2 = this.prospectsYear;
        UniqueTournamentDraftYear uniqueTournamentDraftYear = this.draft;
        UniqueTournamentDraftYear uniqueTournamentDraftYear2 = this.previousDraft;
        boolean z = this.hasLotteryDraw;
        StringBuilder s = mz1.s("UniqueTournamentDraftInfoResponse(lotteryYear=", str, ", prospectsYear=", str2, ", draft=");
        s.append(uniqueTournamentDraftYear);
        s.append(", previousDraft=");
        s.append(uniqueTournamentDraftYear2);
        s.append(", hasLotteryDraw=");
        return wt3.p(s, z, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentDraftInfoResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentDraftInfoResponse(@Nullable String str, @Nullable String str2, @Nullable UniqueTournamentDraftYear uniqueTournamentDraftYear, @Nullable UniqueTournamentDraftYear uniqueTournamentDraftYear2, boolean z) {
        this.lotteryYear = str;
        this.prospectsYear = str2;
        this.draft = uniqueTournamentDraftYear;
        this.previousDraft = uniqueTournamentDraftYear2;
        this.hasLotteryDraw = z;
    }

    public /* synthetic */ UniqueTournamentDraftInfoResponse(String str, String str2, UniqueTournamentDraftYear uniqueTournamentDraftYear, UniqueTournamentDraftYear uniqueTournamentDraftYear2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, uniqueTournamentDraftYear, uniqueTournamentDraftYear2, (i & 16) != 0 ? true : z);
    }
}
