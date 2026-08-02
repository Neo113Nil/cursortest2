package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/UniqueTournamentChampionsResponse.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UniqueTournamentChampionsResponse$$serializer implements iw8 {

    @NotNull
    public static final UniqueTournamentChampionsResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UniqueTournamentChampionsResponse$$serializer uniqueTournamentChampionsResponse$$serializer = new UniqueTournamentChampionsResponse$$serializer();
        INSTANCE = uniqueTournamentChampionsResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.UniqueTournamentChampionsResponse", uniqueTournamentChampionsResponse$$serializer, 4);
        uyeVar.j("winner", false);
        uyeVar.j("runnerUp", false);
        uyeVar.j("mvp", false);
        uyeVar.j("conferenceChampions", false);
        descriptor = uyeVar;
    }

    private UniqueTournamentChampionsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = UniqueTournamentChampionsResponse.$childSerializers;
        ChampionsTeamStanding$$serializer championsTeamStanding$$serializer = ChampionsTeamStanding$$serializer.INSTANCE;
        return new KSerializer[]{championsTeamStanding$$serializer, championsTeamStanding$$serializer, l98.W(Player$$serializer.INSTANCE), joaVarArr[3].getValue()};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UniqueTournamentChampionsResponse deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = UniqueTournamentChampionsResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        ChampionsTeamStanding championsTeamStanding = null;
        ChampionsTeamStanding championsTeamStanding2 = null;
        Player player = null;
        List list = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                championsTeamStanding = (ChampionsTeamStanding) b.w(serialDescriptor, 0, ChampionsTeamStanding$$serializer.INSTANCE, championsTeamStanding);
                i |= 1;
            } else if (o == 1) {
                championsTeamStanding2 = (ChampionsTeamStanding) b.w(serialDescriptor, 1, ChampionsTeamStanding$$serializer.INSTANCE, championsTeamStanding2);
                i |= 2;
            } else if (o == 2) {
                player = (Player) b.i(serialDescriptor, 2, Player$$serializer.INSTANCE, player);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                list = (List) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new UniqueTournamentChampionsResponse(i, championsTeamStanding, championsTeamStanding2, player, list, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UniqueTournamentChampionsResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UniqueTournamentChampionsResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
