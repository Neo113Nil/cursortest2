package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/AiInsightsTennisPredictions.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class AiInsightsTennisPredictions$$serializer implements iw8 {

    @NotNull
    public static final AiInsightsTennisPredictions$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AiInsightsTennisPredictions$$serializer aiInsightsTennisPredictions$$serializer = new AiInsightsTennisPredictions$$serializer();
        INSTANCE = aiInsightsTennisPredictions$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.AiInsightsTennisPredictions", aiInsightsTennisPredictions$$serializer, 14);
        uyeVar.j("firstSetWinner", false);
        uyeVar.j("firstSetWinnerProbability", false);
        uyeVar.j("firstSetGamesCount", false);
        uyeVar.j("possibleFirstSetResults", false);
        uyeVar.j("secondSetWinner", false);
        uyeVar.j("secondSetWinnerProbability", false);
        uyeVar.j("homeWinsASet", false);
        uyeVar.j("awayWinsASet", false);
        uyeVar.j("homeTotalGames", false);
        uyeVar.j("awayTotalGames", false);
        uyeVar.j("totalGamesCount", false);
        uyeVar.j("winningProbability", false);
        uyeVar.j("possibleHomeResults", false);
        uyeVar.j("possibleAwayResults", false);
        descriptor = uyeVar;
    }

    private AiInsightsTennisPredictions$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = AiInsightsTennisPredictions.$childSerializers;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        KSerializer W = l98.W(player$$serializer);
        a7a a7aVar = a7a.a;
        KSerializer W2 = l98.W(a7aVar);
        h75 h75Var = h75.a;
        KSerializer W3 = l98.W(h75Var);
        KSerializer W4 = l98.W((KSerializer) joaVarArr[3].getValue());
        KSerializer W5 = l98.W(player$$serializer);
        KSerializer W6 = l98.W(a7aVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, l98.W(gz1Var), l98.W(gz1Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(AiInsightsTennisWinningProbability$$serializer.INSTANCE), l98.W((KSerializer) joaVarArr[12].getValue()), l98.W((KSerializer) joaVarArr[13].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final AiInsightsTennisPredictions deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Double d;
        Integer num;
        AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability;
        Double d2;
        Player player;
        Double d3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = AiInsightsTennisPredictions.$childSerializers;
        AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability2 = null;
        Double d4 = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        Boolean bool = null;
        int i = 0;
        List list2 = null;
        Integer num4 = null;
        Double d5 = null;
        List list3 = null;
        Player player2 = null;
        Integer num5 = null;
        Boolean bool2 = null;
        boolean z = true;
        Player player3 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    aiInsightsTennisWinningProbability = aiInsightsTennisWinningProbability2;
                    d2 = d5;
                    player = player3;
                    d3 = d4;
                    z = false;
                    d4 = d3;
                    d5 = d2;
                    player3 = player;
                    aiInsightsTennisWinningProbability2 = aiInsightsTennisWinningProbability;
                case 0:
                    aiInsightsTennisWinningProbability = aiInsightsTennisWinningProbability2;
                    d2 = d5;
                    Player player4 = player3;
                    d3 = d4;
                    player = (Player) b.i(serialDescriptor, 0, Player$$serializer.INSTANCE, player4);
                    i |= 1;
                    num4 = num4;
                    d4 = d3;
                    d5 = d2;
                    player3 = player;
                    aiInsightsTennisWinningProbability2 = aiInsightsTennisWinningProbability;
                case 1:
                    d = d5;
                    num4 = (Integer) b.i(serialDescriptor, 1, a7a.a, num4);
                    i |= 2;
                    aiInsightsTennisWinningProbability2 = aiInsightsTennisWinningProbability2;
                    d5 = d;
                case 2:
                    aiInsightsTennisWinningProbability = aiInsightsTennisWinningProbability2;
                    d5 = (Double) b.i(serialDescriptor, 2, h75.a, d5);
                    i |= 4;
                    num4 = num4;
                    aiInsightsTennisWinningProbability2 = aiInsightsTennisWinningProbability;
                case 3:
                    num = num4;
                    d = d5;
                    list3 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list3);
                    i |= 8;
                    num4 = num;
                    d5 = d;
                case 4:
                    num = num4;
                    d = d5;
                    player2 = (Player) b.i(serialDescriptor, 4, Player$$serializer.INSTANCE, player2);
                    i |= 16;
                    num4 = num;
                    d5 = d;
                case 5:
                    num = num4;
                    d = d5;
                    num5 = (Integer) b.i(serialDescriptor, 5, a7a.a, num5);
                    i |= 32;
                    num4 = num;
                    d5 = d;
                case 6:
                    num = num4;
                    d = d5;
                    bool2 = (Boolean) b.i(serialDescriptor, 6, gz1.a, bool2);
                    i |= 64;
                    num4 = num;
                    d5 = d;
                case 7:
                    num = num4;
                    d = d5;
                    bool = (Boolean) b.i(serialDescriptor, 7, gz1.a, bool);
                    i |= 128;
                    num4 = num;
                    d5 = d;
                case 8:
                    num = num4;
                    d = d5;
                    num3 = (Integer) b.i(serialDescriptor, 8, a7a.a, num3);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num4 = num;
                    d5 = d;
                case 9:
                    num = num4;
                    d = d5;
                    num2 = (Integer) b.i(serialDescriptor, 9, a7a.a, num2);
                    i |= 512;
                    num4 = num;
                    d5 = d;
                case 10:
                    num = num4;
                    d = d5;
                    d4 = (Double) b.i(serialDescriptor, 10, h75.a, d4);
                    i |= 1024;
                    num4 = num;
                    d5 = d;
                case 11:
                    num = num4;
                    d = d5;
                    aiInsightsTennisWinningProbability2 = (AiInsightsTennisWinningProbability) b.i(serialDescriptor, 11, AiInsightsTennisWinningProbability$$serializer.INSTANCE, aiInsightsTennisWinningProbability2);
                    i |= a.o;
                    num4 = num;
                    d5 = d;
                case 12:
                    num = num4;
                    d = d5;
                    list = (List) b.i(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), list);
                    i |= 4096;
                    num4 = num;
                    d5 = d;
                case 13:
                    num = num4;
                    d = d5;
                    list2 = (List) b.i(serialDescriptor, 13, (dy4) joaVarArr[13].getValue(), list2);
                    i |= 8192;
                    num4 = num;
                    d5 = d;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability3 = aiInsightsTennisWinningProbability2;
        Player player5 = player3;
        b.c(serialDescriptor);
        return new AiInsightsTennisPredictions(i, player5, num4, d5, list3, player2, num5, bool2, bool, num3, num2, d4, aiInsightsTennisWinningProbability3, list, list2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AiInsightsTennisPredictions value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        AiInsightsTennisPredictions.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
