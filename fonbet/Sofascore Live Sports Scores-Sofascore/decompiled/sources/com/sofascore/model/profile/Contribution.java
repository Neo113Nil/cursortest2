package com.sofascore.model.profile;

import defpackage.joa;
import defpackage.l98;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.t63;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/profile/Contribution;", "", "", "Lcom/sofascore/model/profile/ContributionType;", "types", "Lcom/sofascore/model/profile/ContributionStatus;", "status", "<init>", "(Ljava/util/List;Lcom/sofascore/model/profile/ContributionStatus;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/sofascore/model/profile/ContributionStatus;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/Contribution;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/sofascore/model/profile/ContributionStatus;", "copy", "(Ljava/util/List;Lcom/sofascore/model/profile/ContributionStatus;)Lcom/sofascore/model/profile/Contribution;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTypes", "Lcom/sofascore/model/profile/ContributionStatus;", "getStatus", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Contribution {

    @Nullable
    private final ContributionStatus status;

    @NotNull
    private final List<ContributionType> types;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new t63(12)), null};

    public /* synthetic */ Contribution(int i, List list, ContributionStatus contributionStatus, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, Contribution$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.types = list;
        this.status = contributionStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(l98.W(ContributionTypeSerializer.INSTANCE), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Contribution copy$default(Contribution contribution, List list, ContributionStatus contributionStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contribution.types;
        }
        if ((i & 2) != 0) {
            contributionStatus = contribution.status;
        }
        return contribution.copy(list, contributionStatus);
    }

    public static final /* synthetic */ void write$Self$model_release(Contribution self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.types);
        output.h(serialDesc, 1, ContributionStatusSerializer.INSTANCE, self.status);
    }

    @NotNull
    public final List<ContributionType> component1() {
        return this.types;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ContributionStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final Contribution copy(@NotNull List<? extends ContributionType> types, @Nullable ContributionStatus status) {
        types.getClass();
        return new Contribution(types, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contribution)) {
            return false;
        }
        Contribution contribution = (Contribution) other;
        return Intrinsics.c(this.types, contribution.types) && this.status == contribution.status;
    }

    @Nullable
    public final ContributionStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final List<ContributionType> getTypes() {
        return this.types;
    }

    public int hashCode() {
        int hashCode = this.types.hashCode() * 31;
        ContributionStatus contributionStatus = this.status;
        return hashCode + (contributionStatus == null ? 0 : contributionStatus.hashCode());
    }

    @NotNull
    public String toString() {
        return "Contribution(types=" + this.types + ", status=" + this.status + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/Contribution$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/Contribution;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Contribution$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Contribution(@NotNull List<? extends ContributionType> list, @Nullable ContributionStatus contributionStatus) {
        list.getClass();
        this.types = list;
        this.status = contributionStatus;
    }
}
