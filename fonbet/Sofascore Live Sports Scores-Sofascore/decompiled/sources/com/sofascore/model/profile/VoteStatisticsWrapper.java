package com.sofascore.model.profile;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/sofascore/model/profile/VoteStatisticsWrapper;", "Ljava/io/Serializable;", "Lcom/sofascore/model/profile/VoteStatistics;", "allTime", "current", "<init>", "(Lcom/sofascore/model/profile/VoteStatistics;Lcom/sofascore/model/profile/VoteStatistics;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/profile/VoteStatistics;Lcom/sofascore/model/profile/VoteStatistics;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/VoteStatisticsWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/profile/VoteStatistics;", "getAllTime", "()Lcom/sofascore/model/profile/VoteStatistics;", "getCurrent", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VoteStatisticsWrapper implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final VoteStatistics allTime;

    @NotNull
    private final VoteStatistics current;

    public /* synthetic */ VoteStatisticsWrapper(int i, VoteStatistics voteStatistics, VoteStatistics voteStatistics2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, VoteStatisticsWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.allTime = voteStatistics;
        this.current = voteStatistics2;
    }

    public static final /* synthetic */ void write$Self$model_release(VoteStatisticsWrapper self, wf3 output, SerialDescriptor serialDesc) {
        VoteStatistics$$serializer voteStatistics$$serializer = VoteStatistics$$serializer.INSTANCE;
        output.f(serialDesc, 0, voteStatistics$$serializer, self.allTime);
        output.f(serialDesc, 1, voteStatistics$$serializer, self.current);
    }

    @NotNull
    public final VoteStatistics getAllTime() {
        return this.allTime;
    }

    @NotNull
    public final VoteStatistics getCurrent() {
        return this.current;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/VoteStatisticsWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/VoteStatisticsWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoteStatisticsWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VoteStatisticsWrapper(@NotNull VoteStatistics voteStatistics, @NotNull VoteStatistics voteStatistics2) {
        voteStatistics.getClass();
        voteStatistics2.getClass();
        this.allTime = voteStatistics;
        this.current = voteStatistics2;
    }
}
