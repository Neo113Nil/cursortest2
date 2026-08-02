package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.fc6;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010\u001d¨\u0006/"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyAgeGroup;", "", "", "id", "maxAge", "minAge", "", "isEligibleForCompetition", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyAgeGroup;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Z", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Z)Lcom/sofascore/model/fantasy/FantasyAgeGroup;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/Integer;", "getMaxAge", "getMinAge", "Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyAgeGroup {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;
    private final boolean isEligibleForCompetition;

    @Nullable
    private final Integer maxAge;

    @Nullable
    private final Integer minAge;

    public /* synthetic */ FantasyAgeGroup(int i, int i2, Integer num, Integer num2, boolean z, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FantasyAgeGroup$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.maxAge = num;
        this.minAge = num2;
        this.isEligibleForCompetition = z;
    }

    public static /* synthetic */ FantasyAgeGroup copy$default(FantasyAgeGroup fantasyAgeGroup, int i, Integer num, Integer num2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyAgeGroup.id;
        }
        if ((i2 & 2) != 0) {
            num = fantasyAgeGroup.maxAge;
        }
        if ((i2 & 4) != 0) {
            num2 = fantasyAgeGroup.minAge;
        }
        if ((i2 & 8) != 0) {
            z = fantasyAgeGroup.isEligibleForCompetition;
        }
        return fantasyAgeGroup.copy(i, num, num2, z);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyAgeGroup self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.maxAge);
        output.h(serialDesc, 2, a7aVar, self.minAge);
        output.x(serialDesc, 3, self.isEligibleForCompetition);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getMaxAge() {
        return this.maxAge;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getMinAge() {
        return this.minAge;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEligibleForCompetition() {
        return this.isEligibleForCompetition;
    }

    @NotNull
    public final FantasyAgeGroup copy(int id, @Nullable Integer maxAge, @Nullable Integer minAge, boolean isEligibleForCompetition) {
        return new FantasyAgeGroup(id, maxAge, minAge, isEligibleForCompetition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyAgeGroup)) {
            return false;
        }
        FantasyAgeGroup fantasyAgeGroup = (FantasyAgeGroup) other;
        return this.id == fantasyAgeGroup.id && Intrinsics.c(this.maxAge, fantasyAgeGroup.maxAge) && Intrinsics.c(this.minAge, fantasyAgeGroup.minAge) && this.isEligibleForCompetition == fantasyAgeGroup.isEligibleForCompetition;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getMaxAge() {
        return this.maxAge;
    }

    @Nullable
    public final Integer getMinAge() {
        return this.minAge;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.maxAge;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minAge;
        return Boolean.hashCode(this.isEligibleForCompetition) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean isEligibleForCompetition() {
        return this.isEligibleForCompetition;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.maxAge;
        Integer num2 = this.minAge;
        boolean z = this.isEligibleForCompetition;
        StringBuilder r = fc6.r("FantasyAgeGroup(id=", ", maxAge=", ", minAge=", num, i);
        r.append(num2);
        r.append(", isEligibleForCompetition=");
        r.append(z);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyAgeGroup$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyAgeGroup;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyAgeGroup$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyAgeGroup(int i, @Nullable Integer num, @Nullable Integer num2, boolean z) {
        this.id = i;
        this.maxAge = num;
        this.minAge = num2;
        this.isEligibleForCompetition = z;
    }
}
