package com.sofascore.model;

import com.ironsource.U3;
import com.sofascore.model.Injury;
import defpackage.a7a;
import defpackage.dy4;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/Injury.$serializer", "Liw8;", "Lcom/sofascore/model/Injury;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/Injury;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/Injury;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Injury$$serializer implements iw8 {

    @NotNull
    public static final Injury$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Injury$$serializer injury$$serializer = new Injury$$serializer();
        INSTANCE = injury$$serializer;
        uye uyeVar = new uye("com.sofascore.model.Injury", injury$$serializer, 8);
        uyeVar.j("id", false);
        uyeVar.j("status", false);
        uyeVar.j("reason", false);
        uyeVar.j("startDateTimestamp", false);
        uyeVar.j("endDateTimestamp", false);
        uyeVar.j("updateDateTimestamp", false);
        uyeVar.j("expectedReturn", false);
        uyeVar.j("expectedReturnDateData", false);
        descriptor = uyeVar;
    }

    private Injury$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Injury.$childSerializers;
        lkb lkbVar = lkb.a;
        KSerializer W = l98.W(lkbVar);
        KSerializer W2 = l98.W((KSerializer) joaVarArr[6].getValue());
        KSerializer W3 = l98.W(Injury$ExpectedReturnDateData$$serializer.INSTANCE);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7a.a, uhiVar, uhiVar, lkbVar, W, lkbVar, W2, W3};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Injury deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Injury.$childSerializers;
        Injury injury = null;
        Injury.ExpectedReturnDateData expectedReturnDateData = null;
        String str = null;
        String str2 = null;
        Long l = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        Injury.ExpectedReturn expectedReturn = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j = b.g(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) b.i(serialDescriptor, 4, lkb.a, l);
                    i |= 16;
                    break;
                case 5:
                    j2 = b.g(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    expectedReturn = (Injury.ExpectedReturn) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), expectedReturn);
                    i |= 64;
                    break;
                case 7:
                    expectedReturnDateData = (Injury.ExpectedReturnDateData) b.i(serialDescriptor, 7, Injury$ExpectedReturnDateData$$serializer.INSTANCE, expectedReturnDateData);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return injury;
            }
            injury = null;
        }
        b.c(serialDescriptor);
        return new Injury(i, i2, str, str2, j, l, j2, expectedReturn, expectedReturnDateData, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Injury value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Injury.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
