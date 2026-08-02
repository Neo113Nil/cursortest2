package com.sofascore.model.fantasy;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyScoreTopPlayerWrapper;", "Lcom/sofascore/model/fantasy/FantasyTopPlayerWrapper;", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "fantasyPlayer", "", "totalScore", "<init>", "(Lcom/sofascore/model/fantasy/FantasyPlayer;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyPlayer;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyScoreTopPlayerWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "getFantasyPlayer", "()Lcom/sofascore/model/fantasy/FantasyPlayer;", "I", "getTotalScore", "()I", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyScoreTopPlayerWrapper implements FantasyTopPlayerWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FantasyPlayer fantasyPlayer;
    private final int totalScore;

    public /* synthetic */ FantasyScoreTopPlayerWrapper(int i, FantasyPlayer fantasyPlayer, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyScoreTopPlayerWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fantasyPlayer = fantasyPlayer;
        this.totalScore = i2;
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyScoreTopPlayerWrapper self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, FantasyPlayer$$serializer.INSTANCE, self.getFantasyPlayer());
        output.u(1, self.totalScore, serialDesc);
    }

    @Override // com.sofascore.model.fantasy.FantasyTopPlayerWrapper
    @NotNull
    public FantasyPlayer getFantasyPlayer() {
        return this.fantasyPlayer;
    }

    public final int getTotalScore() {
        return this.totalScore;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyScoreTopPlayerWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyScoreTopPlayerWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyScoreTopPlayerWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyScoreTopPlayerWrapper(@NotNull FantasyPlayer fantasyPlayer, int i) {
        fantasyPlayer.getClass();
        this.fantasyPlayer = fantasyPlayer;
        this.totalScore = i;
    }
}
