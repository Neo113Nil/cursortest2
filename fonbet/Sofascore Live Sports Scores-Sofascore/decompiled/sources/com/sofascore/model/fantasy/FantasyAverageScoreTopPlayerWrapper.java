package com.sofascore.model.fantasy;

import defpackage.c88;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyAverageScoreTopPlayerWrapper;", "Lcom/sofascore/model/fantasy/FantasyTopPlayerWrapper;", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "fantasyPlayer", "", "averageScore", "<init>", "(Lcom/sofascore/model/fantasy/FantasyPlayer;Ljava/lang/Float;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyPlayer;Ljava/lang/Float;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyAverageScoreTopPlayerWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "getFantasyPlayer", "()Lcom/sofascore/model/fantasy/FantasyPlayer;", "Ljava/lang/Float;", "getAverageScore", "()Ljava/lang/Float;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyAverageScoreTopPlayerWrapper implements FantasyTopPlayerWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float averageScore;

    @NotNull
    private final FantasyPlayer fantasyPlayer;

    public /* synthetic */ FantasyAverageScoreTopPlayerWrapper(int i, FantasyPlayer fantasyPlayer, Float f, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyAverageScoreTopPlayerWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fantasyPlayer = fantasyPlayer;
        this.averageScore = f;
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyAverageScoreTopPlayerWrapper self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, FantasyPlayer$$serializer.INSTANCE, self.getFantasyPlayer());
        output.h(serialDesc, 1, c88.a, self.averageScore);
    }

    @Nullable
    public final Float getAverageScore() {
        return this.averageScore;
    }

    @Override // com.sofascore.model.fantasy.FantasyTopPlayerWrapper
    @NotNull
    public FantasyPlayer getFantasyPlayer() {
        return this.fantasyPlayer;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyAverageScoreTopPlayerWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyAverageScoreTopPlayerWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyAverageScoreTopPlayerWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyAverageScoreTopPlayerWrapper(@NotNull FantasyPlayer fantasyPlayer, @Nullable Float f) {
        fantasyPlayer.getClass();
        this.fantasyPlayer = fantasyPlayer;
        this.averageScore = f;
    }
}
