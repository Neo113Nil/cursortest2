package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/RaceDetailsResponse.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/RaceDetailsResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/RaceDetailsResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/RaceDetailsResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RaceDetailsResponse$$serializer implements iw8 {

    @NotNull
    public static final RaceDetailsResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RaceDetailsResponse$$serializer raceDetailsResponse$$serializer = new RaceDetailsResponse$$serializer();
        INSTANCE = raceDetailsResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.RaceDetailsResponse", raceDetailsResponse$$serializer, 12);
        uyeVar.j("stage", false);
        uyeVar.j("isLive", false);
        uyeVar.j("points", false);
        uyeVar.j("position", false);
        uyeVar.j("gridPosition", false);
        uyeVar.j("number", false);
        uyeVar.j("fastestLapTime", false);
        uyeVar.j("updatedAtTimestamp", false);
        uyeVar.j("driverResults", false);
        uyeVar.j("didNotStart", false);
        uyeVar.j("didNotFinish", false);
        uyeVar.j("disqualified", false);
        descriptor = uyeVar;
    }

    private RaceDetailsResponse$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = RaceDetailsResponse.$childSerializers;
        KSerializer W = l98.W(gz1.a);
        KSerializer W2 = l98.W(h75.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{Stage$$serializer.INSTANCE, W, W2, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhi.a), lkb.a, l98.W((KSerializer) joaVarArr[8].getValue()), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RaceDetailsResponse deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = RaceDetailsResponse.$childSerializers;
        long j = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z2 = true;
        String str = null;
        List list = null;
        int i = 0;
        Stage stage = null;
        Boolean bool = null;
        Double d = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    stage = (Stage) b.w(serialDescriptor, 0, Stage$$serializer.INSTANCE, stage);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    bool = (Boolean) b.i(serialDescriptor, 1, gz1.a, bool);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    d = (Double) b.i(serialDescriptor, 2, h75.a, d);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num4 = (Integer) b.i(serialDescriptor, 3, a7a.a, num4);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num5 = (Integer) b.i(serialDescriptor, 4, a7a.a, num5);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num6 = (Integer) b.i(serialDescriptor, 5, a7a.a, num6);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str = (String) b.i(serialDescriptor, 6, uhi.a, str);
                    i |= 64;
                    break;
                case 7:
                    j = b.g(serialDescriptor, 7);
                    i |= 128;
                    joaVarArr = joaVarArr;
                    continue;
                case 8:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    list = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr2[8].getValue(), list);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num3 = (Integer) b.i(serialDescriptor, 9, a7a.a, num3);
                    i |= 512;
                    break;
                case 10:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num2 = (Integer) b.i(serialDescriptor, 10, a7a.a, num2);
                    i |= 1024;
                    break;
                case 11:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    num = (Integer) b.i(serialDescriptor, 11, a7a.a, num);
                    i |= a.o;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new RaceDetailsResponse(i, stage, bool, d, num4, num5, num6, str, j, list, num3, num2, num, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RaceDetailsResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RaceDetailsResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
