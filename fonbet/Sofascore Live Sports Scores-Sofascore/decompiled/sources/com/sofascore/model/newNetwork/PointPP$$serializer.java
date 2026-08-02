package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/PointPP.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/PointPP;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/PointPP;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/PointPP;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PointPP$$serializer implements iw8 {

    @NotNull
    public static final PointPP$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PointPP$$serializer pointPP$$serializer = new PointPP$$serializer();
        INSTANCE = pointPP$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.PointPP", pointPP$$serializer, 7);
        uyeVar.j("homePoint", false);
        uyeVar.j("awayPoint", false);
        uyeVar.j("pointDescription", false);
        uyeVar.j("homePointType", false);
        uyeVar.j("awayPointType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("shouldReverseTeams", true);
        descriptor = uyeVar;
    }

    private PointPP$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = PointPP.$childSerializers;
        KSerializer W = l98.W(a7a.a);
        KSerializer W2 = l98.W((KSerializer) joaVarArr[3].getValue());
        KSerializer W3 = l98.W((KSerializer) joaVarArr[4].getValue());
        gz1 gz1Var = gz1.a;
        KSerializer W4 = l98.W(gz1Var);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar, W, W2, W3, W4, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PointPP deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = PointPP.$childSerializers;
        PointPP pointPP = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        Integer num = null;
        PointType pointType = null;
        PointType pointType2 = null;
        Boolean bool = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) b.i(serialDescriptor, 2, a7a.a, num);
                    i |= 4;
                    break;
                case 3:
                    pointType = (PointType) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), pointType);
                    i |= 8;
                    break;
                case 4:
                    pointType2 = (PointType) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), pointType2);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) b.i(serialDescriptor, 5, gz1.a, bool);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    yhk.e(o);
                    return pointPP;
            }
            pointPP = null;
        }
        b.c(serialDescriptor);
        return new PointPP(i, str, str2, num, pointType, pointType2, bool, z2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PointPP value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PointPP.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
