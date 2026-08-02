package com.sofascore.model.mvvm.model;

import defpackage.a7a;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamTimeActiveData;", "", "", "activeFrom", "activeTo", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TeamTimeActiveData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/TeamTimeActiveData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getActiveFrom", "getActiveTo", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamTimeActiveData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer activeFrom;

    @Nullable
    private final Integer activeTo;

    public /* synthetic */ TeamTimeActiveData(int i, Integer num, Integer num2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, TeamTimeActiveData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.activeFrom = num;
        this.activeTo = num2;
    }

    public static /* synthetic */ TeamTimeActiveData copy$default(TeamTimeActiveData teamTimeActiveData, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = teamTimeActiveData.activeFrom;
        }
        if ((i & 2) != 0) {
            num2 = teamTimeActiveData.activeTo;
        }
        return teamTimeActiveData.copy(num, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamTimeActiveData self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.activeFrom);
        output.h(serialDesc, 1, a7aVar, self.activeTo);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getActiveFrom() {
        return this.activeFrom;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getActiveTo() {
        return this.activeTo;
    }

    @NotNull
    public final TeamTimeActiveData copy(@Nullable Integer activeFrom, @Nullable Integer activeTo) {
        return new TeamTimeActiveData(activeFrom, activeTo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamTimeActiveData)) {
            return false;
        }
        TeamTimeActiveData teamTimeActiveData = (TeamTimeActiveData) other;
        return Intrinsics.c(this.activeFrom, teamTimeActiveData.activeFrom) && Intrinsics.c(this.activeTo, teamTimeActiveData.activeTo);
    }

    @Nullable
    public final Integer getActiveFrom() {
        return this.activeFrom;
    }

    @Nullable
    public final Integer getActiveTo() {
        return this.activeTo;
    }

    public int hashCode() {
        Integer num = this.activeFrom;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.activeTo;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TeamTimeActiveData(activeFrom=" + this.activeFrom + ", activeTo=" + this.activeTo + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamTimeActiveData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamTimeActiveData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamTimeActiveData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamTimeActiveData(@Nullable Integer num, @Nullable Integer num2) {
        this.activeFrom = num;
        this.activeTo = num2;
    }
}
