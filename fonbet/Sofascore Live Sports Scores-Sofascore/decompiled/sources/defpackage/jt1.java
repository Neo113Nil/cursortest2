package defpackage;

import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Batsman$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jt1 implements iw8 {
    public static final jt1 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        jt1 jt1Var = new jt1();
        a = jt1Var;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.BatsmanRow", jt1Var, 4);
        uyeVar.j("currentBatsman", false);
        uyeVar.j("isFirst", false);
        uyeVar.j("batsman", false);
        uyeVar.j("isLastItemInGroup", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{gz1Var, gz1Var, Batsman$$serializer.INSTANCE, gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Batsman batsman = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                z2 = b.B(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                z3 = b.B(serialDescriptor, 1);
                i |= 2;
            } else if (o == 2) {
                batsman = (Batsman) b.w(serialDescriptor, 2, Batsman$$serializer.INSTANCE, batsman);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                z4 = b.B(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new lt1(i, z2, z3, batsman, z4);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lt1 lt1Var = (lt1) obj;
        encoder.getClass();
        lt1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.x(serialDescriptor, 0, lt1Var.a);
        b.x(serialDescriptor, 1, lt1Var.b);
        b.f(serialDescriptor, 2, Batsman$$serializer.INSTANCE, lt1Var.c);
        if (b.o(serialDescriptor) || lt1Var.d) {
            b.x(serialDescriptor, 3, lt1Var.d);
        }
        b.c(serialDescriptor);
    }
}
