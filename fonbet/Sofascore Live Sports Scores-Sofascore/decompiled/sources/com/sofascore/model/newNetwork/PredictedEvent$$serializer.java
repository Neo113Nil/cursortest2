package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Status$$serializer;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/PredictedEvent.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/PredictedEvent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/PredictedEvent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/PredictedEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PredictedEvent$$serializer implements iw8 {

    @NotNull
    public static final PredictedEvent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PredictedEvent$$serializer predictedEvent$$serializer = new PredictedEvent$$serializer();
        INSTANCE = predictedEvent$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.PredictedEvent", predictedEvent$$serializer, 20);
        uyeVar.j("eventId", false);
        uyeVar.j("startDateTimestamp", false);
        uyeVar.j("homeTeamName", false);
        uyeVar.j("awayTeamName", false);
        uyeVar.j("homeNameCode", false);
        uyeVar.j("awayNameCode", false);
        uyeVar.j("homeTeamId", false);
        uyeVar.j("awayTeamId", false);
        uyeVar.j("homeTeamScore", false);
        uyeVar.j("awayTeamScore", false);
        uyeVar.j("homeTeamType", false);
        uyeVar.j("awayTeamType", false);
        uyeVar.j("homeTeamAlpha2", false);
        uyeVar.j("awayTeamAlpha2", false);
        uyeVar.j("correct", true);
        uyeVar.j("odds", false);
        uyeVar.j("sportSlug", false);
        uyeVar.j("displayInverseHomeAwayTeams", false);
        uyeVar.j("status", false);
        uyeVar.j("votes", false);
        descriptor = uyeVar;
    }

    private PredictedEvent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = PredictedEvent.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, lkb.a, uhiVar, uhiVar, uhiVar, uhiVar, a7aVar, a7aVar, l98.W(a7aVar), l98.W(a7aVar), a7aVar, a7aVar, l98.W(uhiVar), l98.W(uhiVar), joaVarArr[14].getValue(), l98.W(OddsChoice$$serializer.INSTANCE), l98.W(uhiVar), gz1.a, Status$$serializer.INSTANCE, l98.W((KSerializer) joaVarArr[19].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PredictedEvent deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        String str;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = PredictedEvent.$childSerializers;
        long j = 0;
        OddsChoice oddsChoice = null;
        VoteResult voteResult = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        Integer num2 = null;
        int i2 = 0;
        Status status = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = true;
        int i7 = 0;
        boolean z2 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str5;
                    z = false;
                    str5 = str;
                case 0:
                    str = str5;
                    i7 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    str5 = str;
                case 1:
                    j = b.g(serialDescriptor, 1);
                    i2 |= 2;
                case 2:
                    str5 = b.n(serialDescriptor, 2);
                    i2 |= 4;
                case 3:
                    str6 = b.n(serialDescriptor, 3);
                    i2 |= 8;
                case 4:
                    str7 = b.n(serialDescriptor, 4);
                    i2 |= 16;
                case 5:
                    str8 = b.n(serialDescriptor, 5);
                    i2 |= 32;
                case 6:
                    i3 = b.l(serialDescriptor, 6);
                    i2 |= 64;
                case 7:
                    i4 = b.l(serialDescriptor, 7);
                    i2 |= 128;
                case 8:
                    str = str5;
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str5 = str;
                case 9:
                    str = str5;
                    num2 = (Integer) b.i(serialDescriptor, 9, a7a.a, num2);
                    i2 |= 512;
                    str5 = str;
                case 10:
                    i5 = b.l(serialDescriptor, 10);
                    i2 |= 1024;
                case 11:
                    i6 = b.l(serialDescriptor, 11);
                    i2 |= a.o;
                case 12:
                    str = str5;
                    str4 = (String) b.i(serialDescriptor, 12, uhi.a, str4);
                    i2 |= 4096;
                    str5 = str;
                case 13:
                    str = str5;
                    str2 = (String) b.i(serialDescriptor, 13, uhi.a, str2);
                    i2 |= 8192;
                    str5 = str;
                case 14:
                    str = str5;
                    voteResult = (VoteResult) b.w(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), voteResult);
                    i2 |= 16384;
                    str5 = str;
                case 15:
                    str = str5;
                    oddsChoice = (OddsChoice) b.i(serialDescriptor, 15, OddsChoice$$serializer.INSTANCE, oddsChoice);
                    i = 32768;
                    i2 |= i;
                    str5 = str;
                case 16:
                    str = str5;
                    str3 = (String) b.i(serialDescriptor, 16, uhi.a, str3);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    str5 = str;
                case 17:
                    z2 = b.B(serialDescriptor, 17);
                    i2 |= 131072;
                case 18:
                    str = str5;
                    status = (Status) b.w(serialDescriptor, 18, Status$$serializer.INSTANCE, status);
                    i = 262144;
                    i2 |= i;
                    str5 = str;
                case 19:
                    str = str5;
                    list = (List) b.i(serialDescriptor, 19, (dy4) joaVarArr[19].getValue(), list);
                    i = 524288;
                    i2 |= i;
                    str5 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PredictedEvent(i2, i7, j, str5, str6, str7, str8, i3, i4, num, num2, i5, i6, str4, str2, voteResult, oddsChoice, str3, z2, status, list, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PredictedEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PredictedEvent.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
