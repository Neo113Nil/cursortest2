package com.sofascore.model.newNetwork.topperformance.response;

import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class HandballTopPlayersStatistics$$serializer implements iw8 {

    @NotNull
    public static final HandballTopPlayersStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HandballTopPlayersStatistics$$serializer handballTopPlayersStatistics$$serializer = new HandballTopPlayersStatistics$$serializer();
        INSTANCE = handballTopPlayersStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics", handballTopPlayersStatistics$$serializer, 8);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("goals7m", false);
        uyeVar.j("steals", false);
        uyeVar.j("twoMinutePenalties", false);
        uyeVar.j("saves", false);
        uyeVar.j("goalkeeperEfficiencyPercentage", false);
        uyeVar.j("gk7mSaves", false);
        descriptor = uyeVar;
    }

    private HandballTopPlayersStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = HandballTopPlayersStatistics.$childSerializers;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue()), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final HandballTopPlayersStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = HandballTopPlayersStatistics.$childSerializers;
        HandballTopPlayersStatistics handballTopPlayersStatistics = null;
        boolean z = true;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        int i = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list2 = (List) b.i(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list2);
                    i |= 1;
                    break;
                case 1:
                    list3 = (List) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), list3);
                    i |= 2;
                    break;
                case 2:
                    list4 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list4);
                    i |= 4;
                    break;
                case 3:
                    list5 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list5);
                    i |= 8;
                    break;
                case 4:
                    list6 = (List) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list6);
                    i |= 16;
                    break;
                case 5:
                    list7 = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list7);
                    i |= 32;
                    break;
                case 6:
                    list8 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list8);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return handballTopPlayersStatistics;
            }
            handballTopPlayersStatistics = null;
        }
        b.c(serialDescriptor);
        return new HandballTopPlayersStatistics(i, list2, list3, list4, list5, list6, list7, list8, list, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull HandballTopPlayersStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        HandballTopPlayersStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
