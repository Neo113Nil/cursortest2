package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/PlayerHistoricalRating.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/PlayerHistoricalRating;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PlayerHistoricalRating$$serializer implements iw8 {

    @NotNull
    public static final PlayerHistoricalRating$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PlayerHistoricalRating$$serializer playerHistoricalRating$$serializer = new PlayerHistoricalRating$$serializer();
        INSTANCE = playerHistoricalRating$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.PlayerHistoricalRating", playerHistoricalRating$$serializer, 7);
        uyeVar.j("eventId", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("opponent", false);
        uyeVar.j("event", false);
        uyeVar.j("isHome", false);
        uyeVar.j("shouldReverseTeams", true);
        descriptor = uyeVar;
    }

    private PlayerHistoricalRating$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = PlayerHistoricalRating.$childSerializers;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, a7aVar, l98.W(h75.a), joaVarArr[3].getValue(), l98.W(EventSerializer.INSTANCE), gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PlayerHistoricalRating deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = PlayerHistoricalRating.$childSerializers;
        PlayerHistoricalRating playerHistoricalRating = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        Double d = null;
        Team team = null;
        Event event = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) b.i(serialDescriptor, 2, h75.a, d);
                    i |= 4;
                    break;
                case 3:
                    team = (Team) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), team);
                    i |= 8;
                    break;
                case 4:
                    event = (Event) b.i(serialDescriptor, 4, EventSerializer.INSTANCE, event);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.B(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z3 = b.B(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    yhk.e(o);
                    return playerHistoricalRating;
            }
            playerHistoricalRating = null;
        }
        b.c(serialDescriptor);
        return new PlayerHistoricalRating(i, i2, i3, d, team, event, z2, z3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PlayerHistoricalRating value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PlayerHistoricalRating.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
