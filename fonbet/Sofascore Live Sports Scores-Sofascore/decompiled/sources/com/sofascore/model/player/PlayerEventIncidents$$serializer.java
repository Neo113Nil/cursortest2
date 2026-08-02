package com.sofascore.model.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.iw8;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/player/PlayerEventIncidents.$serializer", "Liw8;", "Lcom/sofascore/model/player/PlayerEventIncidents;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/player/PlayerEventIncidents;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/player/PlayerEventIncidents;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PlayerEventIncidents$$serializer implements iw8 {

    @NotNull
    public static final PlayerEventIncidents$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PlayerEventIncidents$$serializer playerEventIncidents$$serializer = new PlayerEventIncidents$$serializer();
        INSTANCE = playerEventIncidents$$serializer;
        uye uyeVar = new uye("com.sofascore.model.player.PlayerEventIncidents", playerEventIncidents$$serializer, 18);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        uyeVar.j("yellowRedCards", false);
        uyeVar.j("ownGoals", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("kickingFgMade", false);
        uyeVar.j("passingTouchdowns", false);
        uyeVar.j("defensiveInterceptionsTouchdowns", false);
        uyeVar.j("fumbleTouchdownReturns", false);
        uyeVar.j("kickReturnsTouchdowns", false);
        uyeVar.j("rushingTouchdowns", false);
        uyeVar.j("puntingReturnTouchdowns", false);
        uyeVar.j("puntReturnsTouchdowns", false);
        uyeVar.j("receivingTouchdowns", false);
        uyeVar.j("kickingExtraMade", false);
        uyeVar.j("accumulatedPenaltyGoals", true);
        descriptor = uyeVar;
    }

    private PlayerEventIncidents$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), a7aVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PlayerEventIncidents deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        int i2 = 0;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        boolean z = true;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Integer num24 = null;
        int i3 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num8;
                    num2 = num18;
                    num3 = num21;
                    z = false;
                    num9 = num9;
                    num18 = num2;
                    num21 = num3;
                    num8 = num;
                case 0:
                    num = num8;
                    num2 = num18;
                    num3 = (Integer) b.i(serialDescriptor, 0, a7a.a, num21);
                    i2 |= 1;
                    num9 = num9;
                    num17 = num17;
                    num18 = num2;
                    num21 = num3;
                    num8 = num;
                case 1:
                    num = num8;
                    num4 = num17;
                    num5 = num18;
                    num22 = (Integer) b.i(serialDescriptor, 1, a7a.a, num22);
                    i2 |= 2;
                    num23 = num23;
                    num17 = num4;
                    num18 = num5;
                    num8 = num;
                case 2:
                    num = num8;
                    num4 = num17;
                    num5 = num18;
                    num23 = (Integer) b.i(serialDescriptor, 2, a7a.a, num23);
                    i2 |= 4;
                    num17 = num4;
                    num18 = num5;
                    num8 = num;
                case 3:
                    num = num8;
                    num5 = num18;
                    num4 = num17;
                    num24 = (Integer) b.i(serialDescriptor, 3, a7a.a, num24);
                    i2 |= 8;
                    num17 = num4;
                    num18 = num5;
                    num8 = num;
                case 4:
                    num = num8;
                    num5 = num18;
                    num17 = (Integer) b.i(serialDescriptor, 4, a7a.a, num17);
                    i2 |= 16;
                    num18 = num5;
                    num8 = num;
                case 5:
                    num = num8;
                    num18 = (Integer) b.i(serialDescriptor, 5, a7a.a, num18);
                    i2 |= 32;
                    num17 = num17;
                    num8 = num;
                case 6:
                    num6 = num17;
                    num7 = num18;
                    num19 = (Integer) b.i(serialDescriptor, 6, a7a.a, num19);
                    i2 |= 64;
                    num17 = num6;
                    num18 = num7;
                case 7:
                    num6 = num17;
                    num7 = num18;
                    num20 = (Integer) b.i(serialDescriptor, 7, a7a.a, num20);
                    i2 |= 128;
                    num17 = num6;
                    num18 = num7;
                case 8:
                    num6 = num17;
                    num7 = num18;
                    num12 = (Integer) b.i(serialDescriptor, 8, a7a.a, num12);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num17 = num6;
                    num18 = num7;
                case 9:
                    num6 = num17;
                    num7 = num18;
                    num10 = (Integer) b.i(serialDescriptor, 9, a7a.a, num10);
                    i2 |= 512;
                    num17 = num6;
                    num18 = num7;
                case 10:
                    num6 = num17;
                    num7 = num18;
                    num9 = (Integer) b.i(serialDescriptor, 10, a7a.a, num9);
                    i2 |= 1024;
                    num17 = num6;
                    num18 = num7;
                case 11:
                    num6 = num17;
                    num7 = num18;
                    num8 = (Integer) b.i(serialDescriptor, 11, a7a.a, num8);
                    i2 |= a.o;
                    num17 = num6;
                    num18 = num7;
                case 12:
                    num6 = num17;
                    num7 = num18;
                    num11 = (Integer) b.i(serialDescriptor, 12, a7a.a, num11);
                    i2 |= 4096;
                    num17 = num6;
                    num18 = num7;
                case 13:
                    num6 = num17;
                    num7 = num18;
                    num13 = (Integer) b.i(serialDescriptor, 13, a7a.a, num13);
                    i2 |= 8192;
                    num17 = num6;
                    num18 = num7;
                case 14:
                    num6 = num17;
                    num7 = num18;
                    num14 = (Integer) b.i(serialDescriptor, 14, a7a.a, num14);
                    i2 |= 16384;
                    num17 = num6;
                    num18 = num7;
                case 15:
                    num6 = num17;
                    num7 = num18;
                    num15 = (Integer) b.i(serialDescriptor, 15, a7a.a, num15);
                    i = 32768;
                    i2 |= i;
                    num17 = num6;
                    num18 = num7;
                case 16:
                    num6 = num17;
                    num7 = num18;
                    num16 = (Integer) b.i(serialDescriptor, 16, a7a.a, num16);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num17 = num6;
                    num18 = num7;
                case 17:
                    i3 = b.l(serialDescriptor, 17);
                    i2 |= 131072;
                    num17 = num17;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num25 = num8;
        Integer num26 = num18;
        b.c(serialDescriptor);
        return new PlayerEventIncidents(i2, num21, num22, num23, num24, num17, num26, num19, num20, num12, num10, num9, num25, num11, num13, num14, num15, num16, i3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PlayerEventIncidents value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PlayerEventIncidents.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
