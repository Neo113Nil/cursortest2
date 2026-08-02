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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class IceHockeyTopTeamsStatistics$$serializer implements iw8 {

    @NotNull
    public static final IceHockeyTopTeamsStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IceHockeyTopTeamsStatistics$$serializer iceHockeyTopTeamsStatistics$$serializer = new IceHockeyTopTeamsStatistics$$serializer();
        INSTANCE = iceHockeyTopTeamsStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics", iceHockeyTopTeamsStatistics$$serializer, 10);
        uyeVar.j("powerPlayPercentage", false);
        uyeVar.j("penaltyKillPercentage", false);
        uyeVar.j("goals", false);
        uyeVar.j("goalsAgainst", false);
        uyeVar.j("shots", false);
        uyeVar.j("shotsAgainst", false);
        uyeVar.j("hits", false);
        uyeVar.j("blocks", false);
        uyeVar.j("faceOffPercentage", false);
        uyeVar.j("penaltyMinutes", false);
        descriptor = uyeVar;
    }

    private IceHockeyTopTeamsStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = IceHockeyTopTeamsStatistics.$childSerializers;
        return new KSerializer[]{l98.W((KSerializer) joaVarArr[0].getValue()), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W((KSerializer) joaVarArr[2].getValue()), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W((KSerializer) joaVarArr[5].getValue()), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W((KSerializer) joaVarArr[7].getValue()), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W((KSerializer) joaVarArr[9].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final IceHockeyTopTeamsStatistics deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = IceHockeyTopTeamsStatistics.$childSerializers;
        List list = null;
        List list2 = null;
        boolean z = true;
        List list3 = null;
        int i = 0;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    joaVarArr2 = joaVarArr;
                    list4 = (List) b.i(serialDescriptor, 0, (dy4) joaVarArr2[0].getValue(), list4);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr2 = joaVarArr;
                    list5 = (List) b.i(serialDescriptor, 1, (dy4) joaVarArr2[1].getValue(), list5);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr2 = joaVarArr;
                    list6 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr2[2].getValue(), list6);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    list7 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr2[3].getValue(), list7);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    list8 = (List) b.i(serialDescriptor, 4, (dy4) joaVarArr2[4].getValue(), list8);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    list9 = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr2[5].getValue(), list9);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    list10 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr2[6].getValue(), list10);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr2 = joaVarArr;
                    list3 = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr2[7].getValue(), list3);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr2 = joaVarArr;
                    list2 = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr2[8].getValue(), list2);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    list = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
        }
        b.c(serialDescriptor);
        return new IceHockeyTopTeamsStatistics(i, list4, list5, list6, list7, list8, list9, list10, list3, list2, list, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull IceHockeyTopTeamsStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        IceHockeyTopTeamsStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
