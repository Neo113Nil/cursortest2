package com.sofascore.model.network.response;

import com.appsflyer.internal.i;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.xt8;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B?\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006-"}, d2 = {"Lcom/sofascore/model/network/response/GoalDistributionsResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "", "Lcom/sofascore/model/network/response/DistributionItem;", "goalDistributions", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/GoalDistributionsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "type", "getDistributionOfType", "(Ljava/lang/String;)Lcom/sofascore/model/network/response/DistributionItem;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/sofascore/model/network/response/GoalDistributionsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGoalDistributions", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GoalDistributionsResponse extends AbstractNetworkResponse {

    @NotNull
    private final List<DistributionItem> goalDistributions;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new xt8(15))};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoalDistributionsResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, List list, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (4 != (i & 4)) {
            oea.z(i, 4, GoalDistributionsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goalDistributions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(DistributionItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalDistributionsResponse copy$default(GoalDistributionsResponse goalDistributionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = goalDistributionsResponse.goalDistributions;
        }
        return goalDistributionsResponse.copy(list);
    }

    public static final /* synthetic */ void write$Self$model_release(GoalDistributionsResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        output.f(serialDesc, 2, (KSerializer) $childSerializers[2].getValue(), self.goalDistributions);
    }

    @NotNull
    public final List<DistributionItem> component1() {
        return this.goalDistributions;
    }

    @NotNull
    public final GoalDistributionsResponse copy(@NotNull List<DistributionItem> goalDistributions) {
        goalDistributions.getClass();
        return new GoalDistributionsResponse(goalDistributions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoalDistributionsResponse) && Intrinsics.c(this.goalDistributions, ((GoalDistributionsResponse) other).goalDistributions);
    }

    @Nullable
    public final DistributionItem getDistributionOfType(@NotNull String type) {
        type.getClass();
        for (DistributionItem distributionItem : this.goalDistributions) {
            if (Intrinsics.c(distributionItem.getType(), type)) {
                return distributionItem;
            }
        }
        return null;
    }

    @NotNull
    public final List<DistributionItem> getGoalDistributions() {
        return this.goalDistributions;
    }

    public int hashCode() {
        return this.goalDistributions.hashCode();
    }

    @NotNull
    public String toString() {
        return i.i("GoalDistributionsResponse(goalDistributions=", ")", this.goalDistributions);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/GoalDistributionsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/GoalDistributionsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GoalDistributionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalDistributionsResponse(@NotNull List<DistributionItem> list) {
        super((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.goalDistributions = list;
    }
}
