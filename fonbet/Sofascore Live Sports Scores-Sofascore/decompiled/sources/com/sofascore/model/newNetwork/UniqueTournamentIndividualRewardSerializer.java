package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.aik;
import defpackage.mfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0080\u0004J\u0012\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualRewardSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualReward;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniqueTournamentIndividualRewardSerializer implements KSerializer {

    @NotNull
    public static final UniqueTournamentIndividualRewardSerializer INSTANCE = new UniqueTournamentIndividualRewardSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = aik.v("UniqueTournamentIndividualReward", new SerialDescriptor[0]);

    private UniqueTournamentIndividualRewardSerializer() {
    }

    @Override // defpackage.dy4
    @NotNull
    public UniqueTournamentIndividualReward deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        mfa mfaVar = (mfa) decoder;
        b j = mfaVar.j();
        c g = qfa.g(j);
        return (UniqueTournamentIndividualReward) mfaVar.d().a(g.containsKey(SearchResponseKt.MANAGER_ENTITY) ? UniqueTournamentManagerReward.INSTANCE.serializer() : g.containsKey(SearchResponseKt.PLAYER_ENTITY) ? UniqueTournamentPlayerReward.INSTANCE.serializer() : UniqueTournamentComingSoonReward.INSTANCE.serializer(), j);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull UniqueTournamentIndividualReward value) {
        encoder.getClass();
        value.getClass();
    }
}
