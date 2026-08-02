package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.TvChannel$$serializer;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/sofascore/model/newNetwork/TvChannelVote;", "", "Lcom/sofascore/model/mvvm/model/TvChannel;", "tvChannel", "", "upvote", "downvote", "<init>", "(Lcom/sofascore/model/mvvm/model/TvChannel;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/TvChannel;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TvChannelVote;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TvChannel;", "getTvChannel", "()Lcom/sofascore/model/mvvm/model/TvChannel;", "I", "getUpvote", "()I", "getDownvote", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TvChannelVote {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int downvote;

    @NotNull
    private final TvChannel tvChannel;
    private final int upvote;

    public /* synthetic */ TvChannelVote(int i, TvChannel tvChannel, int i2, int i3, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TvChannelVote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.tvChannel = tvChannel;
        this.upvote = i2;
        this.downvote = i3;
    }

    public static final /* synthetic */ void write$Self$model_release(TvChannelVote self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, TvChannel$$serializer.INSTANCE, self.tvChannel);
        output.u(1, self.upvote, serialDesc);
        output.u(2, self.downvote, serialDesc);
    }

    public final int getDownvote() {
        return this.downvote;
    }

    @NotNull
    public final TvChannel getTvChannel() {
        return this.tvChannel;
    }

    public final int getUpvote() {
        return this.upvote;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TvChannelVote$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TvChannelVote;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TvChannelVote$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TvChannelVote(@NotNull TvChannel tvChannel, int i, int i2) {
        tvChannel.getClass();
        this.tvChannel = tvChannel;
        this.upvote = i;
        this.downvote = i2;
    }
}
