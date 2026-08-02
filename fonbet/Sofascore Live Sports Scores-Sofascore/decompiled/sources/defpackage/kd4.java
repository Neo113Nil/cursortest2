package defpackage;

import com.ironsource.B1;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kd4 implements iw8 {
    public static final kd4 a;
    private static final /* synthetic */ uye descriptor;

    static {
        kd4 kd4Var = new kd4();
        a = kd4Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Data", kd4Var, 3);
        uyeVar.j("id", true);
        uyeVar.j("name", true);
        uyeVar.j(B1.i, true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = nd4.d;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[2].getValue())};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = nd4.d;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Set set = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = (String) b.i(uyeVar, 0, uhi.a, str);
                i |= 1;
            } else if (o == 1) {
                str2 = (String) b.i(uyeVar, 1, uhi.a, str2);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                set = (Set) b.i(uyeVar, 2, (dy4) joaVarArr[2].getValue(), set);
                i |= 4;
            }
        }
        b.c(uyeVar);
        nd4 nd4Var = new nd4();
        if ((i & 1) == 0) {
            nd4Var.a = null;
        } else {
            nd4Var.a = str;
        }
        if ((i & 2) == 0) {
            nd4Var.b = null;
        } else {
            nd4Var.b = str2;
        }
        if ((i & 4) == 0) {
            nd4Var.c = null;
            return nd4Var;
        }
        nd4Var.c = set;
        return nd4Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nd4 nd4Var = (nd4) obj;
        encoder.getClass();
        nd4Var.getClass();
        String str = nd4Var.b;
        String str2 = nd4Var.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = nd4.d;
        if (b.o(uyeVar) || str2 != null) {
            b.h(uyeVar, 0, uhi.a, str2);
        }
        if (b.o(uyeVar) || str != null) {
            b.h(uyeVar, 1, uhi.a, str);
        }
        if (b.o(uyeVar) || nd4Var.c != null) {
            b.h(uyeVar, 2, (KSerializer) joaVarArr[2].getValue(), nd4Var.c);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
