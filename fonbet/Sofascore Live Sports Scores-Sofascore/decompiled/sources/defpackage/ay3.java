package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ay3 implements iw8 {
    public static final ay3 a;
    private static final /* synthetic */ uye descriptor;

    static {
        ay3 ay3Var = new ay3();
        a = ay3Var;
        uye uyeVar = new uye("createCalendarEvent", ay3Var, 1);
        uyeVar.j("data", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{cy3.c[0].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = cy3.c;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                map = (Map) b.w(uyeVar, 0, (dy4) joaVarArr[0].getValue(), map);
                i = 1;
            }
        }
        b.c(uyeVar);
        return new cy3(i, map);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cy3 cy3Var = (cy3) obj;
        encoder.getClass();
        cy3Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.f(uyeVar, 0, (KSerializer) cy3.c[0].getValue(), cy3Var.b);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
