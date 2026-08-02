package com.sofascore.model.newNetwork;

import com.ironsource.C4227o2;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/TeamOfTheWeekPlayer.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/TeamOfTheWeekPlayer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class TeamOfTheWeekPlayer$$serializer implements iw8 {

    @NotNull
    public static final TeamOfTheWeekPlayer$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TeamOfTheWeekPlayer$$serializer teamOfTheWeekPlayer$$serializer = new TeamOfTheWeekPlayer$$serializer();
        INSTANCE = teamOfTheWeekPlayer$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.TeamOfTheWeekPlayer", teamOfTheWeekPlayer$$serializer, 6);
        uyeVar.j("id", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("team", false);
        uyeVar.j("event", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j(C4227o2.u, false);
        descriptor = uyeVar;
    }

    private TeamOfTheWeekPlayer$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = TeamOfTheWeekPlayer.$childSerializers;
        KSerializer W = l98.W(Player$$serializer.INSTANCE);
        KSerializer W2 = l98.W((KSerializer) joaVarArr[2].getValue());
        KSerializer W3 = l98.W(EventSerializer.INSTANCE);
        KSerializer W4 = l98.W(uhi.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, W, W2, W3, W4, a7aVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final TeamOfTheWeekPlayer deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = TeamOfTheWeekPlayer.$childSerializers;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Player player = null;
        Team team = null;
        Event event = null;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    player = (Player) b.i(serialDescriptor, 1, Player$$serializer.INSTANCE, player);
                    i |= 2;
                    break;
                case 2:
                    team = (Team) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), team);
                    i |= 4;
                    break;
                case 3:
                    event = (Event) b.i(serialDescriptor, 3, EventSerializer.INSTANCE, event);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.i(serialDescriptor, 4, uhi.a, str);
                    i |= 16;
                    break;
                case 5:
                    i3 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TeamOfTheWeekPlayer(i, i2, player, team, event, str, i3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TeamOfTheWeekPlayer value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        TeamOfTheWeekPlayer.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
