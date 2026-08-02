package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class AmericanFootballTopPlayersStatistics$$serializer implements iw8 {

    @NotNull
    public static final AmericanFootballTopPlayersStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AmericanFootballTopPlayersStatistics$$serializer americanFootballTopPlayersStatistics$$serializer = new AmericanFootballTopPlayersStatistics$$serializer();
        INSTANCE = americanFootballTopPlayersStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics", americanFootballTopPlayersStatistics$$serializer, 11);
        uyeVar.j("passingTouchdowns", false);
        uyeVar.j("rushingTouchdowns", false);
        uyeVar.j("receivingTouchdowns", false);
        uyeVar.j("passingCompletionPercentage", false);
        uyeVar.j("passingTouchdownInterceptionRatio", false);
        uyeVar.j("rushingYardsPerAttempt", false);
        uyeVar.j("receivingYardsPerReception", false);
        uyeVar.j("defensiveInterceptions", false);
        uyeVar.j("defensiveTotalTackles", false);
        uyeVar.j("defensiveSacks", false);
        uyeVar.j("kickingFgMade", false);
        descriptor = uyeVar;
    }

    private AmericanFootballTopPlayersStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = AmericanFootballTopPlayersStatistics.$childSerializers;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue()), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W((KSerializer) joaVarArr[9].getValue()), l98.W((KSerializer) joaVarArr[10].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final AmericanFootballTopPlayersStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = AmericanFootballTopPlayersStatistics.$childSerializers;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z2 = true;
        List list4 = null;
        int i = 0;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        List list11 = null;
        while (true) {
            while (z2) {
                int o = b.o(serialDescriptor);
                switch (o) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        joa[] joaVarArr3 = joaVarArr;
                        list5 = (List) b.i(serialDescriptor, 0, (dy4) joaVarArr3[0].getValue(), list5);
                        i |= 1;
                        joaVarArr = joaVarArr3;
                        z2 = z2;
                        continue;
                    case 1:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list6 = (List) b.i(serialDescriptor, 1, (dy4) joaVarArr2[1].getValue(), list6);
                        i |= 2;
                        break;
                    case 2:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list7 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr2[2].getValue(), list7);
                        i |= 4;
                        break;
                    case 3:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list8 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr2[3].getValue(), list8);
                        i |= 8;
                        break;
                    case 4:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list9 = (List) b.i(serialDescriptor, 4, (dy4) joaVarArr2[4].getValue(), list9);
                        i |= 16;
                        break;
                    case 5:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list10 = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr2[5].getValue(), list10);
                        i |= 32;
                        break;
                    case 6:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list11 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr2[6].getValue(), list11);
                        i |= 64;
                        break;
                    case 7:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list4 = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr2[7].getValue(), list4);
                        i |= 128;
                        break;
                    case 8:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list3 = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr2[8].getValue(), list3);
                        i |= NotificationCompat.FLAG_LOCAL_ONLY;
                        break;
                    case 9:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list2 = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr2[9].getValue(), list2);
                        i |= 512;
                        break;
                    case 10:
                        joaVarArr2 = joaVarArr;
                        z = z2;
                        list = (List) b.i(serialDescriptor, 10, (dy4) joaVarArr2[10].getValue(), list);
                        i |= 1024;
                        break;
                    default:
                        yhk.e(o);
                        return null;
                }
                joaVarArr = joaVarArr2;
                z2 = z;
            }
            b.c(serialDescriptor);
            return new AmericanFootballTopPlayersStatistics(i, list5, list6, list7, list8, list9, list10, list11, list4, list3, list2, list, null);
        }
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AmericanFootballTopPlayersStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        AmericanFootballTopPlayersStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
