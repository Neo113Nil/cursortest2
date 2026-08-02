package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/UniqueTournamentRecapPlayerPerformance;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UniqueTournamentRecapPlayerPerformance$$serializer implements iw8 {

    @NotNull
    public static final UniqueTournamentRecapPlayerPerformance$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UniqueTournamentRecapPlayerPerformance$$serializer uniqueTournamentRecapPlayerPerformance$$serializer = new UniqueTournamentRecapPlayerPerformance$$serializer();
        INSTANCE = uniqueTournamentRecapPlayerPerformance$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.UniqueTournamentRecapPlayerPerformance", uniqueTournamentRecapPlayerPerformance$$serializer, 9);
        uyeVar.j("event", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("team", false);
        uyeVar.j("points", false);
        uyeVar.j("rebounds", false);
        uyeVar.j("assists", false);
        uyeVar.j("steals", false);
        uyeVar.j("blocks", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        descriptor = uyeVar;
    }

    private UniqueTournamentRecapPlayerPerformance$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = UniqueTournamentRecapPlayerPerformance.$childSerializers;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{EventSerializer.INSTANCE, Player$$serializer.INSTANCE, joaVarArr[2].getValue(), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UniqueTournamentRecapPlayerPerformance deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = UniqueTournamentRecapPlayerPerformance.$childSerializers;
        Double d = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Event event = null;
        Player player = null;
        Team team = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    event = (Event) b.w(serialDescriptor, 0, EventSerializer.INSTANCE, event);
                    i |= 1;
                    break;
                case 1:
                    player = (Player) b.w(serialDescriptor, 1, Player$$serializer.INSTANCE, player);
                    i |= 2;
                    break;
                case 2:
                    team = (Team) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), team);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) b.i(serialDescriptor, 3, a7a.a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) b.i(serialDescriptor, 4, a7a.a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) b.i(serialDescriptor, 5, a7a.a, num4);
                    i |= 32;
                    break;
                case 6:
                    num5 = (Integer) b.i(serialDescriptor, 6, a7a.a, num5);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) b.i(serialDescriptor, 7, a7a.a, num);
                    i |= 128;
                    break;
                case 8:
                    d = (Double) b.i(serialDescriptor, 8, h75.a, d);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new UniqueTournamentRecapPlayerPerformance(i, event, player, team, num2, num3, num4, num5, num, d, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UniqueTournamentRecapPlayerPerformance value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UniqueTournamentRecapPlayerPerformance.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
