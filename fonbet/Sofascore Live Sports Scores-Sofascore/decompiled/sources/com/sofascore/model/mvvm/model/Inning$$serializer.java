package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Inning.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Inning;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Inning;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Inning;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Inning$$serializer implements iw8 {

    @NotNull
    public static final Inning$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Inning$$serializer inning$$serializer = new Inning$$serializer();
        INSTANCE = inning$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Inning", inning$$serializer, 20);
        uyeVar.j("id", false);
        uyeVar.j("superOver", false);
        uyeVar.j("number", false);
        uyeVar.j("bowlingLine", false);
        uyeVar.j("battingLine", false);
        uyeVar.j("partnerships", false);
        uyeVar.j("battingTeam", false);
        uyeVar.j("bowlingTeam", false);
        uyeVar.j("score", false);
        uyeVar.j("wickets", false);
        uyeVar.j("overs", false);
        uyeVar.j("extra", false);
        uyeVar.j("wide", false);
        uyeVar.j("noBall", false);
        uyeVar.j("bye", false);
        uyeVar.j("legBye", false);
        uyeVar.j("penalty", false);
        uyeVar.j("isInningDeclare", false);
        uyeVar.j("currentBatsman", false);
        uyeVar.j("currentBowler", false);
        descriptor = uyeVar;
    }

    private Inning$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Inning.$childSerializers;
        a7a a7aVar = a7a.a;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        return new KSerializer[]{a7aVar, l98.W(a7aVar), a7aVar, joaVarArr[3].getValue(), joaVarArr[4].getValue(), joaVarArr[5].getValue(), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75.a), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(player$$serializer), l98.W(player$$serializer)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Inning deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        Team team;
        int i;
        Integer num2;
        Integer num3;
        Team team2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Inning.$childSerializers;
        Integer num4 = null;
        Double d = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Team team3 = null;
        int i2 = 0;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Player player = null;
        Player player2 = null;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        Integer num13 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        Team team4 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    z = false;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 0:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 1:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    num13 = (Integer) b.i(serialDescriptor, 1, a7a.a, num13);
                    i2 |= 2;
                    list = list;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 2:
                    num2 = num4;
                    num3 = num6;
                    i4 = b.l(serialDescriptor, 2);
                    i2 |= 4;
                    num6 = num3;
                    num4 = num2;
                case 3:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    list = (List) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list);
                    i2 |= 8;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 4:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    list2 = (List) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list2);
                    i2 |= 16;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 5:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    list3 = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list3);
                    i2 |= 32;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 6:
                    num2 = num4;
                    num3 = num6;
                    team2 = team3;
                    team4 = (Team) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), team4);
                    i2 |= 64;
                    team3 = team2;
                    num6 = num3;
                    num4 = num2;
                case 7:
                    num2 = num4;
                    num3 = num6;
                    team3 = (Team) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), team3);
                    i2 |= 128;
                    num6 = num3;
                    num4 = num2;
                case 8:
                    num2 = num4;
                    num6 = (Integer) b.i(serialDescriptor, 8, a7a.a, num6);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    team3 = team3;
                    num4 = num2;
                case 9:
                    num = num6;
                    team = team3;
                    num5 = (Integer) b.i(serialDescriptor, 9, a7a.a, num5);
                    i2 |= 512;
                    team3 = team;
                    num6 = num;
                case 10:
                    num = num6;
                    team = team3;
                    d = (Double) b.i(serialDescriptor, 10, h75.a, d);
                    i2 |= 1024;
                    team3 = team;
                    num6 = num;
                case 11:
                    num = num6;
                    team = team3;
                    num4 = (Integer) b.i(serialDescriptor, 11, a7a.a, num4);
                    i2 |= a.o;
                    team3 = team;
                    num6 = num;
                case 12:
                    num = num6;
                    team = team3;
                    num7 = (Integer) b.i(serialDescriptor, 12, a7a.a, num7);
                    i2 |= 4096;
                    team3 = team;
                    num6 = num;
                case 13:
                    num = num6;
                    team = team3;
                    num8 = (Integer) b.i(serialDescriptor, 13, a7a.a, num8);
                    i2 |= 8192;
                    team3 = team;
                    num6 = num;
                case 14:
                    num = num6;
                    team = team3;
                    num10 = (Integer) b.i(serialDescriptor, 14, a7a.a, num10);
                    i2 |= 16384;
                    team3 = team;
                    num6 = num;
                case 15:
                    num = num6;
                    team = team3;
                    num9 = (Integer) b.i(serialDescriptor, 15, a7a.a, num9);
                    i = 32768;
                    i2 |= i;
                    team3 = team;
                    num6 = num;
                case 16:
                    num = num6;
                    team = team3;
                    num11 = (Integer) b.i(serialDescriptor, 16, a7a.a, num11);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    team3 = team;
                    num6 = num;
                case 17:
                    num = num6;
                    team = team3;
                    num12 = (Integer) b.i(serialDescriptor, 17, a7a.a, num12);
                    i = 131072;
                    i2 |= i;
                    team3 = team;
                    num6 = num;
                case 18:
                    num = num6;
                    team = team3;
                    player = (Player) b.i(serialDescriptor, 18, Player$$serializer.INSTANCE, player);
                    i = 262144;
                    i2 |= i;
                    team3 = team;
                    num6 = num;
                case 19:
                    team = team3;
                    num = num6;
                    player2 = (Player) b.i(serialDescriptor, 19, Player$$serializer.INSTANCE, player2);
                    i = 524288;
                    i2 |= i;
                    team3 = team;
                    num6 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num14 = num4;
        Team team5 = team3;
        Integer num15 = num13;
        List list4 = list;
        b.c(serialDescriptor);
        return new Inning(i2, i3, num15, i4, list4, list2, list3, team4, team5, num6, num5, d, num14, num7, num8, num10, num9, num11, num12, player, player2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Inning value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Inning.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
