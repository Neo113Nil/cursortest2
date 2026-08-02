package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/StageFeaturedOdds.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/StageFeaturedOdds;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/StageFeaturedOdds;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/StageFeaturedOdds;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class StageFeaturedOdds$$serializer implements iw8 {

    @NotNull
    public static final StageFeaturedOdds$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StageFeaturedOdds$$serializer stageFeaturedOdds$$serializer = new StageFeaturedOdds$$serializer();
        INSTANCE = stageFeaturedOdds$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.StageFeaturedOdds", stageFeaturedOdds$$serializer, 7);
        uyeVar.j("id", false);
        uyeVar.j("marketId", false);
        uyeVar.j("marketName", false);
        uyeVar.j("isLive", false);
        uyeVar.j("choice", false);
        uyeVar.j("sourceId", false);
        uyeVar.j("fid", false);
        descriptor = uyeVar;
    }

    private StageFeaturedOdds$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{l98.W(a7aVar), l98.W(a7aVar), l98.W(uhi.a), l98.W(gz1.a), l98.W(OddsChoice$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final StageFeaturedOdds deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Boolean bool = null;
        OddsChoice oddsChoice = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.i(serialDescriptor, 0, a7a.a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) b.i(serialDescriptor, 1, a7a.a, num2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.i(serialDescriptor, 2, uhi.a, str);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) b.i(serialDescriptor, 3, gz1.a, bool);
                    i |= 8;
                    break;
                case 4:
                    oddsChoice = (OddsChoice) b.i(serialDescriptor, 4, OddsChoice$$serializer.INSTANCE, oddsChoice);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) b.i(serialDescriptor, 5, a7a.a, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) b.i(serialDescriptor, 6, a7a.a, num4);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new StageFeaturedOdds(i, num, num2, str, bool, oddsChoice, num3, num4, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StageFeaturedOdds value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        StageFeaturedOdds.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
