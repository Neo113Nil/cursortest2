package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/SofaSeason.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/SofaSeason;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/SofaSeason;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/SofaSeason;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class SofaSeason$$serializer implements iw8 {

    @NotNull
    public static final SofaSeason$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SofaSeason$$serializer sofaSeason$$serializer = new SofaSeason$$serializer();
        INSTANCE = sofaSeason$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.SofaSeason", sofaSeason$$serializer, 9);
        uyeVar.j("monthStats", false);
        uyeVar.j("sports", false);
        uyeVar.j("eventsData", false);
        uyeVar.j("playersData", false);
        uyeVar.j("teams", false);
        uyeVar.j("skillRadar", false);
        uyeVar.j("torneoView", false);
        uyeVar.j("predictorVotesCount", false);
        uyeVar.j("contributorTopOnePercent", false);
        descriptor = uyeVar;
    }

    private SofaSeason$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = SofaSeason.$childSerializers;
        return new KSerializer[]{joaVarArr[0].getValue(), joaVarArr[1].getValue(), SeasonEventData$$serializer.INSTANCE, SeasonPlayersData$$serializer.INSTANCE, joaVarArr[4].getValue(), SkillRadar$$serializer.INSTANCE, l98.W(SeasonTorneoData$$serializer.INSTANCE), l98.W(a7a.a), l98.W(gz1.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final SofaSeason deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = SofaSeason.$childSerializers;
        Boolean bool = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        List list = null;
        List list2 = null;
        SeasonEventData seasonEventData = null;
        SeasonPlayersData seasonPlayersData = null;
        List list3 = null;
        SkillRadar skillRadar = null;
        SeasonTorneoData seasonTorneoData = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    seasonEventData = (SeasonEventData) b.w(serialDescriptor, 2, SeasonEventData$$serializer.INSTANCE, seasonEventData);
                    i |= 4;
                    break;
                case 3:
                    seasonPlayersData = (SeasonPlayersData) b.w(serialDescriptor, 3, SeasonPlayersData$$serializer.INSTANCE, seasonPlayersData);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    skillRadar = (SkillRadar) b.w(serialDescriptor, 5, SkillRadar$$serializer.INSTANCE, skillRadar);
                    i |= 32;
                    break;
                case 6:
                    seasonTorneoData = (SeasonTorneoData) b.i(serialDescriptor, 6, SeasonTorneoData$$serializer.INSTANCE, seasonTorneoData);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) b.i(serialDescriptor, 7, a7a.a, num);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) b.i(serialDescriptor, 8, gz1.a, bool);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SofaSeason(i, list, list2, seasonEventData, seasonPlayersData, list3, skillRadar, seasonTorneoData, num, bool, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SofaSeason value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        SofaSeason.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
