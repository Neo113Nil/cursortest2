package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.ec6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000265B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J:\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/EventTennisAiInsightsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/newNetwork/AiInsightsResponse;", "Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "predictions", "", "Lcom/sofascore/model/newNetwork/AiInsightsSections;", "sections", "", "phase", "<init>", "(Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;Ljava/util/List;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventTennisAiInsightsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;Ljava/util/List;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/EventTennisAiInsightsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "getPredictions", "Ljava/util/List;", "getSections", "Ljava/lang/Integer;", "getPhase", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventTennisAiInsightsResponse extends NetworkResponse implements AiInsightsResponse {

    @Nullable
    private final Integer phase;

    @Nullable
    private final AiInsightsTennisPredictions predictions;

    @Nullable
    private final List<AiInsightsSections> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new ec6(6)), null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EventTennisAiInsightsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, AiInsightsTennisPredictions aiInsightsTennisPredictions, List list, Integer num, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (28 != (i & 28)) {
            oea.z(i, 28, EventTennisAiInsightsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.predictions = aiInsightsTennisPredictions;
        this.sections = list;
        this.phase = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(AiInsightsSections$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTennisAiInsightsResponse copy$default(EventTennisAiInsightsResponse eventTennisAiInsightsResponse, AiInsightsTennisPredictions aiInsightsTennisPredictions, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            aiInsightsTennisPredictions = eventTennisAiInsightsResponse.predictions;
        }
        if ((i & 2) != 0) {
            list = eventTennisAiInsightsResponse.sections;
        }
        if ((i & 4) != 0) {
            num = eventTennisAiInsightsResponse.phase;
        }
        return eventTennisAiInsightsResponse.copy(aiInsightsTennisPredictions, list, num);
    }

    public static final /* synthetic */ void write$Self$model_release(EventTennisAiInsightsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, AiInsightsTennisPredictions$$serializer.INSTANCE, self.predictions);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.sections);
        output.h(serialDesc, 4, a7a.a, self.phase);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AiInsightsTennisPredictions getPredictions() {
        return this.predictions;
    }

    @Nullable
    public final List<AiInsightsSections> component2() {
        return this.sections;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPhase() {
        return this.phase;
    }

    @NotNull
    public final EventTennisAiInsightsResponse copy(@Nullable AiInsightsTennisPredictions predictions, @Nullable List<AiInsightsSections> sections, @Nullable Integer phase) {
        return new EventTennisAiInsightsResponse(predictions, sections, phase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTennisAiInsightsResponse)) {
            return false;
        }
        EventTennisAiInsightsResponse eventTennisAiInsightsResponse = (EventTennisAiInsightsResponse) other;
        return Intrinsics.c(this.predictions, eventTennisAiInsightsResponse.predictions) && Intrinsics.c(this.sections, eventTennisAiInsightsResponse.sections) && Intrinsics.c(this.phase, eventTennisAiInsightsResponse.phase);
    }

    @Nullable
    public final Integer getPhase() {
        return this.phase;
    }

    @Nullable
    public final AiInsightsTennisPredictions getPredictions() {
        return this.predictions;
    }

    @Nullable
    public final List<AiInsightsSections> getSections() {
        return this.sections;
    }

    public int hashCode() {
        AiInsightsTennisPredictions aiInsightsTennisPredictions = this.predictions;
        int hashCode = (aiInsightsTennisPredictions == null ? 0 : aiInsightsTennisPredictions.hashCode()) * 31;
        List<AiInsightsSections> list = this.sections;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.phase;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AiInsightsTennisPredictions aiInsightsTennisPredictions = this.predictions;
        List<AiInsightsSections> list = this.sections;
        Integer num = this.phase;
        StringBuilder sb = new StringBuilder("EventTennisAiInsightsResponse(predictions=");
        sb.append(aiInsightsTennisPredictions);
        sb.append(", sections=");
        sb.append(list);
        sb.append(", phase=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventTennisAiInsightsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventTennisAiInsightsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventTennisAiInsightsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventTennisAiInsightsResponse(@Nullable AiInsightsTennisPredictions aiInsightsTennisPredictions, @Nullable List<AiInsightsSections> list, @Nullable Integer num) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.predictions = aiInsightsTennisPredictions;
        this.sections = list;
        this.phase = num;
    }
}
