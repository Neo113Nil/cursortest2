package com.sofascore.model.newNetwork.statistics;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/BaseballRunner.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/BaseballRunner;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BaseballRunner$$serializer implements iw8 {

    @NotNull
    public static final BaseballRunner$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BaseballRunner$$serializer baseballRunner$$serializer = new BaseballRunner$$serializer();
        INSTANCE = baseballRunner$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.BaseballRunner", baseballRunner$$serializer, 10);
        uyeVar.j("id", false);
        uyeVar.j("firstName", false);
        uyeVar.j("lastName", false);
        uyeVar.j("jerseyNumber", false);
        uyeVar.j("position", false);
        uyeVar.j("outcomeId", false);
        uyeVar.j("description", false);
        uyeVar.j("startingBase", false);
        uyeVar.j("endingBase", false);
        uyeVar.j("out", false);
        descriptor = uyeVar;
    }

    private BaseballRunner$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BaseballRunner deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Boolean bool = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) b.i(serialDescriptor, 0, a7a.a, num2);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.i(serialDescriptor, 1, uhi.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.i(serialDescriptor, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.i(serialDescriptor, 3, uhi.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.i(serialDescriptor, 4, uhi.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.i(serialDescriptor, 5, uhi.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) b.i(serialDescriptor, 6, uhi.a, str6);
                    i |= 64;
                    break;
                case 7:
                    num3 = (Integer) b.i(serialDescriptor, 7, a7a.a, num3);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    bool = (Boolean) b.i(serialDescriptor, 9, gz1.a, bool);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new BaseballRunner(i, num2, str, str2, str3, str4, str5, str6, num3, num, bool, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BaseballRunner value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BaseballRunner.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
