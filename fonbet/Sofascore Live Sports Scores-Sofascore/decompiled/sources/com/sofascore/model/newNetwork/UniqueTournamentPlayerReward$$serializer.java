package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/UniqueTournamentPlayerReward.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/UniqueTournamentPlayerReward;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/UniqueTournamentPlayerReward;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/UniqueTournamentPlayerReward;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UniqueTournamentPlayerReward$$serializer implements iw8 {

    @NotNull
    public static final UniqueTournamentPlayerReward$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UniqueTournamentPlayerReward$$serializer uniqueTournamentPlayerReward$$serializer = new UniqueTournamentPlayerReward$$serializer();
        INSTANCE = uniqueTournamentPlayerReward$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.UniqueTournamentPlayerReward", uniqueTournamentPlayerReward$$serializer, 5);
        uyeVar.j("id", false);
        uyeVar.j("team", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("name", false);
        uyeVar.j("type", false);
        descriptor = uyeVar;
    }

    private UniqueTournamentPlayerReward$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = UniqueTournamentPlayerReward.$childSerializers;
        return new KSerializer[]{a7a.a, l98.W((KSerializer) joaVarArr[1].getValue()), Player$$serializer.INSTANCE, uhi.a, l98.W(UniqueTournamentIndividualAwardTypeSerializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UniqueTournamentPlayerReward deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = UniqueTournamentPlayerReward.$childSerializers;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Team team = null;
        Player player = null;
        String str = null;
        UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                team = (Team) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), team);
                i |= 2;
            } else if (o == 2) {
                player = (Player) b.w(serialDescriptor, 2, Player$$serializer.INSTANCE, player);
                i |= 4;
            } else if (o == 3) {
                str = b.n(serialDescriptor, 3);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                uniqueTournamentIndividualAwardType = (UniqueTournamentIndividualAwardType) b.i(serialDescriptor, 4, UniqueTournamentIndividualAwardTypeSerializer.INSTANCE, uniqueTournamentIndividualAwardType);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new UniqueTournamentPlayerReward(i, i2, team, player, str, uniqueTournamentIndividualAwardType, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UniqueTournamentPlayerReward value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UniqueTournamentPlayerReward.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
