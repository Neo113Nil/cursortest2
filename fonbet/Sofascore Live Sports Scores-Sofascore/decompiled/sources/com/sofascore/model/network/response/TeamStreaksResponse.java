package com.sofascore.model.network.response;

import defpackage.bxi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287Bg\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB\u008f\u0001\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ|\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001eR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b2\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b4\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b5\u0010\u001eR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b6\u0010\u001e¨\u00069"}, d2 = {"Lcom/sofascore/model/network/response/TeamStreaksResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "", "Lcom/sofascore/model/network/response/Streak;", "general", "generalTotal", "generalPerLastX", "head2head", "head2HeadTotal", "head2HeadPerLastX", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/TeamStreaksResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/network/response/TeamStreaksResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGeneral", "getGeneralTotal", "getGeneralPerLastX", "getHead2head", "getHead2HeadTotal", "getHead2HeadPerLastX", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamStreaksResponse extends AbstractNetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<Streak> general;

    @Nullable
    private final List<Streak> generalPerLastX;

    @Nullable
    private final List<Streak> generalTotal;

    @Nullable
    private final List<Streak> head2HeadPerLastX;

    @Nullable
    private final List<Streak> head2HeadTotal;

    @Nullable
    private final List<Streak> head2head;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new bxi(24)), ypa.a(ysaVar, new bxi(25)), ypa.a(ysaVar, new bxi(26)), ypa.a(ysaVar, new bxi(27)), ypa.a(ysaVar, new bxi(28)), ypa.a(ysaVar, new bxi(29))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamStreaksResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, List list, List list2, List list3, List list4, List list5, List list6, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (252 != (i & 252)) {
            oea.z(i, 252, TeamStreaksResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.general = list;
        this.generalTotal = list2;
        this.generalPerLastX = list3;
        this.head2head = list4;
        this.head2HeadTotal = list5;
        this.head2HeadPerLastX = list6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(Streak$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Streak$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(Streak$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(Streak$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(Streak$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(Streak$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ TeamStreaksResponse copy$default(TeamStreaksResponse teamStreaksResponse, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teamStreaksResponse.general;
        }
        if ((i & 2) != 0) {
            list2 = teamStreaksResponse.generalTotal;
        }
        if ((i & 4) != 0) {
            list3 = teamStreaksResponse.generalPerLastX;
        }
        if ((i & 8) != 0) {
            list4 = teamStreaksResponse.head2head;
        }
        if ((i & 16) != 0) {
            list5 = teamStreaksResponse.head2HeadTotal;
        }
        if ((i & 32) != 0) {
            list6 = teamStreaksResponse.head2HeadPerLastX;
        }
        List list7 = list5;
        List list8 = list6;
        return teamStreaksResponse.copy(list, list2, list3, list4, list7, list8);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamStreaksResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.general);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.generalTotal);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.generalPerLastX);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.head2head);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.head2HeadTotal);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.head2HeadPerLastX);
    }

    @Nullable
    public final List<Streak> component1() {
        return this.general;
    }

    @Nullable
    public final List<Streak> component2() {
        return this.generalTotal;
    }

    @Nullable
    public final List<Streak> component3() {
        return this.generalPerLastX;
    }

    @Nullable
    public final List<Streak> component4() {
        return this.head2head;
    }

    @Nullable
    public final List<Streak> component5() {
        return this.head2HeadTotal;
    }

    @Nullable
    public final List<Streak> component6() {
        return this.head2HeadPerLastX;
    }

    @NotNull
    public final TeamStreaksResponse copy(@Nullable List<Streak> general, @Nullable List<Streak> generalTotal, @Nullable List<Streak> generalPerLastX, @Nullable List<Streak> head2head, @Nullable List<Streak> head2HeadTotal, @Nullable List<Streak> head2HeadPerLastX) {
        return new TeamStreaksResponse(general, generalTotal, generalPerLastX, head2head, head2HeadTotal, head2HeadPerLastX);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamStreaksResponse)) {
            return false;
        }
        TeamStreaksResponse teamStreaksResponse = (TeamStreaksResponse) other;
        return Intrinsics.c(this.general, teamStreaksResponse.general) && Intrinsics.c(this.generalTotal, teamStreaksResponse.generalTotal) && Intrinsics.c(this.generalPerLastX, teamStreaksResponse.generalPerLastX) && Intrinsics.c(this.head2head, teamStreaksResponse.head2head) && Intrinsics.c(this.head2HeadTotal, teamStreaksResponse.head2HeadTotal) && Intrinsics.c(this.head2HeadPerLastX, teamStreaksResponse.head2HeadPerLastX);
    }

    @Nullable
    public final List<Streak> getGeneral() {
        return this.general;
    }

    @Nullable
    public final List<Streak> getGeneralPerLastX() {
        return this.generalPerLastX;
    }

    @Nullable
    public final List<Streak> getGeneralTotal() {
        return this.generalTotal;
    }

    @Nullable
    public final List<Streak> getHead2HeadPerLastX() {
        return this.head2HeadPerLastX;
    }

    @Nullable
    public final List<Streak> getHead2HeadTotal() {
        return this.head2HeadTotal;
    }

    @Nullable
    public final List<Streak> getHead2head() {
        return this.head2head;
    }

    public int hashCode() {
        List<Streak> list = this.general;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Streak> list2 = this.generalTotal;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Streak> list3 = this.generalPerLastX;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Streak> list4 = this.head2head;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Streak> list5 = this.head2HeadTotal;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Streak> list6 = this.head2HeadPerLastX;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Streak> list = this.general;
        List<Streak> list2 = this.generalTotal;
        List<Streak> list3 = this.generalPerLastX;
        List<Streak> list4 = this.head2head;
        List<Streak> list5 = this.head2HeadTotal;
        List<Streak> list6 = this.head2HeadPerLastX;
        StringBuilder s = fc6.s("TeamStreaksResponse(general=", ", generalTotal=", ", generalPerLastX=", list, list2);
        vxd.w(s, list3, ", head2head=", list4, ", head2HeadTotal=");
        return me4.j(s, list5, ", head2HeadPerLastX=", list6, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/TeamStreaksResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/TeamStreaksResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamStreaksResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TeamStreaksResponse(@Nullable List<Streak> list, @Nullable List<Streak> list2, @Nullable List<Streak> list3, @Nullable List<Streak> list4, @Nullable List<Streak> list5, @Nullable List<Streak> list6) {
        super((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.general = list;
        this.generalTotal = list2;
        this.generalPerLastX = list3;
        this.head2head = list4;
        this.head2HeadTotal = list5;
        this.head2HeadPerLastX = list6;
    }
}
