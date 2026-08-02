package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.tv0;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "", "", "battingOrder", "sequence", "", "Lcom/sofascore/model/mvvm/model/BaseballRole;", "roles", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getBattingOrder", "getSequence", "Ljava/util/List;", "getRoles", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballAdditionalPlayerData {

    @Nullable
    private final Integer battingOrder;

    @Nullable
    private final List<BaseballRole> roles;

    @Nullable
    private final Integer sequence;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new tv0(11))};

    public /* synthetic */ BaseballAdditionalPlayerData(int i, Integer num, Integer num2, List list, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, BaseballAdditionalPlayerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.battingOrder = num;
        this.sequence = num2;
        this.roles = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(BaseballRoleSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseballAdditionalPlayerData copy$default(BaseballAdditionalPlayerData baseballAdditionalPlayerData, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = baseballAdditionalPlayerData.battingOrder;
        }
        if ((i & 2) != 0) {
            num2 = baseballAdditionalPlayerData.sequence;
        }
        if ((i & 4) != 0) {
            list = baseballAdditionalPlayerData.roles;
        }
        return baseballAdditionalPlayerData.copy(num, num2, list);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballAdditionalPlayerData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.battingOrder);
        output.h(serialDesc, 1, a7aVar, self.sequence);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.roles);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getBattingOrder() {
        return this.battingOrder;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    @Nullable
    public final List<BaseballRole> component3() {
        return this.roles;
    }

    @NotNull
    public final BaseballAdditionalPlayerData copy(@Nullable Integer battingOrder, @Nullable Integer sequence, @Nullable List<? extends BaseballRole> roles) {
        return new BaseballAdditionalPlayerData(battingOrder, sequence, roles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballAdditionalPlayerData)) {
            return false;
        }
        BaseballAdditionalPlayerData baseballAdditionalPlayerData = (BaseballAdditionalPlayerData) other;
        return Intrinsics.c(this.battingOrder, baseballAdditionalPlayerData.battingOrder) && Intrinsics.c(this.sequence, baseballAdditionalPlayerData.sequence) && Intrinsics.c(this.roles, baseballAdditionalPlayerData.roles);
    }

    @Nullable
    public final Integer getBattingOrder() {
        return this.battingOrder;
    }

    @Nullable
    public final List<BaseballRole> getRoles() {
        return this.roles;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        Integer num = this.battingOrder;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sequence;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BaseballRole> list = this.roles;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.battingOrder;
        Integer num2 = this.sequence;
        return mz1.p(wv8.k(num, "BaseballAdditionalPlayerData(battingOrder=", ", sequence=", ", roles=", num2), this.roles, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/BaseballAdditionalPlayerData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballAdditionalPlayerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseballAdditionalPlayerData(@Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends BaseballRole> list) {
        this.battingOrder = num;
        this.sequence = num2;
        this.roles = list;
    }
}
