package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import defpackage.a7a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/EventGraphResponse.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/EventGraphResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/EventGraphResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/EventGraphResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EventGraphResponse$$serializer implements iw8 {

    @NotNull
    public static final EventGraphResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventGraphResponse$$serializer eventGraphResponse$$serializer = new EventGraphResponse$$serializer();
        INSTANCE = eventGraphResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.EventGraphResponse", eventGraphResponse$$serializer, 9);
        uyeVar.j("head", true);
        uyeVar.j("error", true);
        uyeVar.j("graphPoints", false);
        uyeVar.j("periodTime", false);
        uyeVar.j("periodCount", false);
        uyeVar.j("overtimeLength", false);
        uyeVar.j("overtimeCount", false);
        uyeVar.j("halfTimeCount", true);
        uyeVar.j("fullTimeCount", true);
        descriptor = uyeVar;
    }

    private EventGraphResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = EventGraphResponse.$childSerializers;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{l98.W(HeadResponse$$serializer.INSTANCE), l98.W(ErrorResponse$$serializer.INSTANCE), joaVarArr[2].getValue(), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EventGraphResponse deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = EventGraphResponse.$childSerializers;
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        int i = 0;
        HeadResponse headResponse = null;
        ErrorResponse errorResponse = null;
        List list = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    headResponse = (HeadResponse) b.i(serialDescriptor, 0, HeadResponse$$serializer.INSTANCE, headResponse);
                    i |= 1;
                    break;
                case 1:
                    errorResponse = (ErrorResponse) b.i(serialDescriptor, 1, ErrorResponse$$serializer.INSTANCE, errorResponse);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b.i(serialDescriptor, 3, a7a.a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) b.i(serialDescriptor, 4, a7a.a, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) b.i(serialDescriptor, 5, a7a.a, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) b.i(serialDescriptor, 6, a7a.a, num6);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) b.i(serialDescriptor, 7, a7a.a, num2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EventGraphResponse(i, headResponse, errorResponse, list, num3, num4, num5, num6, num2, num, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EventGraphResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EventGraphResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
