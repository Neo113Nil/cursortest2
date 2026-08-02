package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Score$$serializer;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Status$$serializer;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/EsportsGame.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/EsportsGame;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/EsportsGame;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/EsportsGame;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EsportsGame$$serializer implements iw8 {

    @NotNull
    public static final EsportsGame$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EsportsGame$$serializer esportsGame$$serializer = new EsportsGame$$serializer();
        INSTANCE = esportsGame$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.EsportsGame", esportsGame$$serializer, 10);
        uyeVar.j("id", false);
        uyeVar.j("status", false);
        uyeVar.j("winnerCode", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("length", false);
        uyeVar.j("map", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("homeTeamStartingSide", false);
        uyeVar.j("shouldReverseTeams", true);
        descriptor = uyeVar;
    }

    private EsportsGame$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(ESportMap$$serializer.INSTANCE);
        KSerializer W4 = l98.W(a7aVar);
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        return new KSerializer[]{a7aVar, Status$$serializer.INSTANCE, W, lkb.a, W2, W3, score$$serializer, score$$serializer, W4, gz1.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EsportsGame deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        long j = 0;
        Integer num = null;
        boolean z = true;
        Score score = null;
        Score score2 = null;
        int i = 0;
        int i2 = 0;
        Status status = null;
        Integer num2 = null;
        Integer num3 = null;
        ESportMap eSportMap = null;
        boolean z2 = false;
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
                    status = (Status) b.w(serialDescriptor, 1, Status$$serializer.INSTANCE, status);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.i(serialDescriptor, 2, a7a.a, num2);
                    i |= 4;
                    break;
                case 3:
                    j = b.g(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) b.i(serialDescriptor, 4, a7a.a, num3);
                    i |= 16;
                    break;
                case 5:
                    eSportMap = (ESportMap) b.i(serialDescriptor, 5, ESportMap$$serializer.INSTANCE, eSportMap);
                    i |= 32;
                    break;
                case 6:
                    score = (Score) b.w(serialDescriptor, 6, Score$$serializer.INSTANCE, score);
                    i |= 64;
                    break;
                case 7:
                    score2 = (Score) b.w(serialDescriptor, 7, Score$$serializer.INSTANCE, score2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    z2 = b.B(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EsportsGame(i, i2, status, num2, j, num3, eSportMap, score, score2, num, z2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EsportsGame value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EsportsGame.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
