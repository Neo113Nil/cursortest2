package com.sofascore.model.crowdsourcing;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.dmi;
import defpackage.ivc;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000b\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&JD\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&¨\u0006="}, d2 = {"Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "startDateSuggest", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "statusSuggest", "", "Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;", "liveIncidentSuggests", "Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "finalScoreSuggest", "<init>", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;Ljava/util/List;Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;Ljava/util/List;Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "component2", "()Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "component3", "()Ljava/util/List;", "component4", "()Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "copy", "(Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;Ljava/util/List;Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;)Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "getStartDateSuggest", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StatusSuggest;", "getStatusSuggest", "Ljava/util/List;", "getLiveIncidentSuggests", "Lcom/sofascore/model/crowdsourcing/EventSuggest$FinalScoreSuggest;", "getFinalScoreSuggest", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MyContributionsResponse extends NetworkResponse {

    @Nullable
    private final EventSuggest.FinalScoreSuggest finalScoreSuggest;

    @NotNull
    private final List<EventSuggest.IncidentSuggest> liveIncidentSuggests;

    @Nullable
    private final EventSuggest.StartDateSuggest startDateSuggest;

    @Nullable
    private final EventSuggest.StatusSuggest statusSuggest;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new ivc(2)), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MyContributionsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, EventSuggest.StartDateSuggest startDateSuggest, EventSuggest.StatusSuggest statusSuggest, List list, EventSuggest.FinalScoreSuggest finalScoreSuggest, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, MyContributionsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.startDateSuggest = startDateSuggest;
        this.statusSuggest = statusSuggest;
        this.liveIncidentSuggests = list;
        this.finalScoreSuggest = finalScoreSuggest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(EventSuggest.IncidentSuggest.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyContributionsResponse copy$default(MyContributionsResponse myContributionsResponse, EventSuggest.StartDateSuggest startDateSuggest, EventSuggest.StatusSuggest statusSuggest, List list, EventSuggest.FinalScoreSuggest finalScoreSuggest, int i, Object obj) {
        if ((i & 1) != 0) {
            startDateSuggest = myContributionsResponse.startDateSuggest;
        }
        if ((i & 2) != 0) {
            statusSuggest = myContributionsResponse.statusSuggest;
        }
        if ((i & 4) != 0) {
            list = myContributionsResponse.liveIncidentSuggests;
        }
        if ((i & 8) != 0) {
            finalScoreSuggest = myContributionsResponse.finalScoreSuggest;
        }
        return myContributionsResponse.copy(startDateSuggest, statusSuggest, list, finalScoreSuggest);
    }

    public static final /* synthetic */ void write$Self$model_release(MyContributionsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, EventSuggest$StartDateSuggest$$serializer.INSTANCE, self.startDateSuggest);
        output.h(serialDesc, 3, EventSuggest$StatusSuggest$$serializer.INSTANCE, self.statusSuggest);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.liveIncidentSuggests);
        output.h(serialDesc, 5, EventSuggest$FinalScoreSuggest$$serializer.INSTANCE, self.finalScoreSuggest);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final EventSuggest.StartDateSuggest getStartDateSuggest() {
        return this.startDateSuggest;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final EventSuggest.StatusSuggest getStatusSuggest() {
        return this.statusSuggest;
    }

    @NotNull
    public final List<EventSuggest.IncidentSuggest> component3() {
        return this.liveIncidentSuggests;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final EventSuggest.FinalScoreSuggest getFinalScoreSuggest() {
        return this.finalScoreSuggest;
    }

    @NotNull
    public final MyContributionsResponse copy(@Nullable EventSuggest.StartDateSuggest startDateSuggest, @Nullable EventSuggest.StatusSuggest statusSuggest, @NotNull List<? extends EventSuggest.IncidentSuggest> liveIncidentSuggests, @Nullable EventSuggest.FinalScoreSuggest finalScoreSuggest) {
        liveIncidentSuggests.getClass();
        return new MyContributionsResponse(startDateSuggest, statusSuggest, liveIncidentSuggests, finalScoreSuggest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyContributionsResponse)) {
            return false;
        }
        MyContributionsResponse myContributionsResponse = (MyContributionsResponse) other;
        return Intrinsics.c(this.startDateSuggest, myContributionsResponse.startDateSuggest) && Intrinsics.c(this.statusSuggest, myContributionsResponse.statusSuggest) && Intrinsics.c(this.liveIncidentSuggests, myContributionsResponse.liveIncidentSuggests) && Intrinsics.c(this.finalScoreSuggest, myContributionsResponse.finalScoreSuggest);
    }

    @Nullable
    public final EventSuggest.FinalScoreSuggest getFinalScoreSuggest() {
        return this.finalScoreSuggest;
    }

    @NotNull
    public final List<EventSuggest.IncidentSuggest> getLiveIncidentSuggests() {
        return this.liveIncidentSuggests;
    }

    @Nullable
    public final EventSuggest.StartDateSuggest getStartDateSuggest() {
        return this.startDateSuggest;
    }

    @Nullable
    public final EventSuggest.StatusSuggest getStatusSuggest() {
        return this.statusSuggest;
    }

    public int hashCode() {
        EventSuggest.StartDateSuggest startDateSuggest = this.startDateSuggest;
        int hashCode = (startDateSuggest == null ? 0 : startDateSuggest.hashCode()) * 31;
        EventSuggest.StatusSuggest statusSuggest = this.statusSuggest;
        int d = dmi.d((hashCode + (statusSuggest == null ? 0 : statusSuggest.hashCode())) * 31, 31, this.liveIncidentSuggests);
        EventSuggest.FinalScoreSuggest finalScoreSuggest = this.finalScoreSuggest;
        return d + (finalScoreSuggest != null ? finalScoreSuggest.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MyContributionsResponse(startDateSuggest=" + this.startDateSuggest + ", statusSuggest=" + this.statusSuggest + ", liveIncidentSuggests=" + this.liveIncidentSuggests + ", finalScoreSuggest=" + this.finalScoreSuggest + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/MyContributionsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MyContributionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MyContributionsResponse(@Nullable EventSuggest.StartDateSuggest startDateSuggest, @Nullable EventSuggest.StatusSuggest statusSuggest, @NotNull List<? extends EventSuggest.IncidentSuggest> list, @Nullable EventSuggest.FinalScoreSuggest finalScoreSuggest) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.startDateSuggest = startDateSuggest;
        this.statusSuggest = statusSuggest;
        this.liveIncidentSuggests = list;
        this.finalScoreSuggest = finalScoreSuggest;
    }
}
