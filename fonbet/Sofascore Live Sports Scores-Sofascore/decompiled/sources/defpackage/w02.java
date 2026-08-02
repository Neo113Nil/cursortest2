package defpackage;

import com.sofascore.model.mvvm.model.Bowler;
import com.sofascore.model.mvvm.model.Bowler$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w02 implements iw8 {
    public static final w02 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w02 w02Var = new w02();
        a = w02Var;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.BowlerRow", w02Var, 4);
        uyeVar.j("currentBowler", false);
        uyeVar.j("isFirst", false);
        uyeVar.j("bowler", false);
        uyeVar.j("isLastItemInGroup", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{gz1Var, gz1Var, Bowler$$serializer.INSTANCE, gz1Var};
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
        Bowler bowler = null;
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
                bowler = (Bowler) b.w(serialDescriptor, 2, Bowler$$serializer.INSTANCE, bowler);
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
        return new y02(i, z2, z3, bowler, z4);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y02 y02Var = (y02) obj;
        encoder.getClass();
        y02Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.x(serialDescriptor, 0, y02Var.a);
        b.x(serialDescriptor, 1, y02Var.b);
        b.f(serialDescriptor, 2, Bowler$$serializer.INSTANCE, y02Var.c);
        if (b.o(serialDescriptor) || y02Var.d) {
            b.x(serialDescriptor, 3, y02Var.d);
        }
        b.c(serialDescriptor);
    }
}
