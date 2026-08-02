package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.g14;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lcom/sofascore/model/newNetwork/DailyStages;", "", "", "date", "", "", "stageIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/DailyStages;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/sofascore/model/newNetwork/DailyStages;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "Ljava/util/List;", "getStageIds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DailyStages {

    @NotNull
    private final String date;

    @NotNull
    private final List<Integer> stageIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new g14(24))};

    public /* synthetic */ DailyStages(int i, String str, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, DailyStages$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.date = str;
        this.stageIds = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(a7a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyStages copy$default(DailyStages dailyStages, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyStages.date;
        }
        if ((i & 2) != 0) {
            list = dailyStages.stageIds;
        }
        return dailyStages.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$model_release(DailyStages self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.date);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.stageIds);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.stageIds;
    }

    @NotNull
    public final DailyStages copy(@NotNull String date, @NotNull List<Integer> stageIds) {
        date.getClass();
        stageIds.getClass();
        return new DailyStages(date, stageIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyStages)) {
            return false;
        }
        DailyStages dailyStages = (DailyStages) other;
        return Intrinsics.c(this.date, dailyStages.date) && Intrinsics.c(this.stageIds, dailyStages.stageIds);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final List<Integer> getStageIds() {
        return this.stageIds;
    }

    public int hashCode() {
        return this.stageIds.hashCode() + (this.date.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DailyStages(date=" + this.date + ", stageIds=" + this.stageIds + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/DailyStages$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/DailyStages;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DailyStages$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DailyStages(@NotNull String str, @NotNull List<Integer> list) {
        str.getClass();
        list.getClass();
        this.date = str;
        this.stageIds = list;
    }
}
