package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/StageTeamPlacement.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/StageTeamPlacement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/StageTeamPlacement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/StageTeamPlacement;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class StageTeamPlacement$$serializer implements iw8 {

    @NotNull
    public static final StageTeamPlacement$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StageTeamPlacement$$serializer stageTeamPlacement$$serializer = new StageTeamPlacement$$serializer();
        INSTANCE = stageTeamPlacement$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.StageTeamPlacement", stageTeamPlacement$$serializer, 5);
        uyeVar.j("teamId", false);
        uyeVar.j("position", false);
        uyeVar.j("points", false);
        uyeVar.j("status", false);
        uyeVar.j("gap", false);
        descriptor = uyeVar;
    }

    private StageTeamPlacement$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(h75.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, W2, W3, l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final StageTeamPlacement deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        String str = null;
        String str2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                num = (Integer) b.i(serialDescriptor, 0, a7a.a, num);
                i |= 1;
            } else if (o == 1) {
                num2 = (Integer) b.i(serialDescriptor, 1, a7a.a, num2);
                i |= 2;
            } else if (o == 2) {
                d = (Double) b.i(serialDescriptor, 2, h75.a, d);
                i |= 4;
            } else if (o == 3) {
                str = (String) b.i(serialDescriptor, 3, uhi.a, str);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                str2 = (String) b.i(serialDescriptor, 4, uhi.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new StageTeamPlacement(i, num, num2, d, str, str2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StageTeamPlacement value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        StageTeamPlacement.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
