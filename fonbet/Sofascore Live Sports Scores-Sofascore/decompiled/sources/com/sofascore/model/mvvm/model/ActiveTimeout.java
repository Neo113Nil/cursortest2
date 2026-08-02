package com.sofascore.model.mvvm.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.c0;
import defpackage.hz8;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJL\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b2\u0010\u001c¨\u00065"}, d2 = {"Lcom/sofascore/model/mvvm/model/ActiveTimeout;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/TimeoutType;", "type", "", IronSourceConstants.EVENTS_DURATION, "", "description", "clock", "teamId", "<init>", "(Lcom/sofascore/model/mvvm/model/TimeoutType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/TimeoutType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/ActiveTimeout;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/TimeoutType;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(Lcom/sofascore/model/mvvm/model/TimeoutType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/ActiveTimeout;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/TimeoutType;", "getType", "Ljava/lang/Integer;", "getDuration", "Ljava/lang/String;", "getDescription", "getClock", "getTeamId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ActiveTimeout implements Serializable {

    @Nullable
    private final String clock;

    @Nullable
    private final String description;

    @Nullable
    private final Integer duration;

    @Nullable
    private final Integer teamId;

    @Nullable
    private final TimeoutType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new c0(9)), null, null, null, null};

    public /* synthetic */ ActiveTimeout(int i, TimeoutType timeoutType, Integer num, String str, String str2, Integer num2, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, ActiveTimeout$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = timeoutType;
        this.duration = num;
        this.description = str;
        this.clock = str2;
        this.teamId = num2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return hz8.F("com.sofascore.model.mvvm.model.TimeoutType", TimeoutType.values(), new String[]{"teamTimeout", "tvTimeout", "challengeTimeout", "officialTimeout"}, new Annotation[][]{null, null, null, null});
    }

    public static /* synthetic */ ActiveTimeout copy$default(ActiveTimeout activeTimeout, TimeoutType timeoutType, Integer num, String str, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            timeoutType = activeTimeout.type;
        }
        if ((i & 2) != 0) {
            num = activeTimeout.duration;
        }
        if ((i & 4) != 0) {
            str = activeTimeout.description;
        }
        if ((i & 8) != 0) {
            str2 = activeTimeout.clock;
        }
        if ((i & 16) != 0) {
            num2 = activeTimeout.teamId;
        }
        Integer num3 = num2;
        String str3 = str;
        return activeTimeout.copy(timeoutType, num, str3, str2, num3);
    }

    public static final /* synthetic */ void write$Self$model_release(ActiveTimeout self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.type);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.duration);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.description);
        output.h(serialDesc, 3, uhiVar, self.clock);
        output.h(serialDesc, 4, a7aVar, self.teamId);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final TimeoutType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getClock() {
        return this.clock;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getTeamId() {
        return this.teamId;
    }

    @NotNull
    public final ActiveTimeout copy(@Nullable TimeoutType type, @Nullable Integer duration, @Nullable String description, @Nullable String clock, @Nullable Integer teamId) {
        return new ActiveTimeout(type, duration, description, clock, teamId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveTimeout)) {
            return false;
        }
        ActiveTimeout activeTimeout = (ActiveTimeout) other;
        return this.type == activeTimeout.type && Intrinsics.c(this.duration, activeTimeout.duration) && Intrinsics.c(this.description, activeTimeout.description) && Intrinsics.c(this.clock, activeTimeout.clock) && Intrinsics.c(this.teamId, activeTimeout.teamId);
    }

    @Nullable
    public final String getClock() {
        return this.clock;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getTeamId() {
        return this.teamId;
    }

    @Nullable
    public final TimeoutType getType() {
        return this.type;
    }

    public int hashCode() {
        TimeoutType timeoutType = this.type;
        int hashCode = (timeoutType == null ? 0 : timeoutType.hashCode()) * 31;
        Integer num = this.duration;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clock;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.teamId;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TimeoutType timeoutType = this.type;
        Integer num = this.duration;
        String str = this.description;
        String str2 = this.clock;
        Integer num2 = this.teamId;
        StringBuilder sb = new StringBuilder("ActiveTimeout(type=");
        sb.append(timeoutType);
        sb.append(", duration=");
        sb.append(num);
        sb.append(", description=");
        bf3.v(sb, str, ", clock=", str2, ", teamId=");
        return vxd.n(sb, num2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/ActiveTimeout$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ActiveTimeout;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ActiveTimeout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ActiveTimeout(@Nullable TimeoutType timeoutType, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2) {
        this.type = timeoutType;
        this.duration = num;
        this.description = str;
        this.clock = str2;
        this.teamId = num2;
    }
}
