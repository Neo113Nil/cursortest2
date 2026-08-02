package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class di0 implements iw8 {
    public static final di0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        di0 di0Var = new di0();
        a = di0Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Asset.ImageObject", di0Var, 5);
        uyeVar.j("type", false);
        uyeVar.j("w", true);
        uyeVar.j(h.b, true);
        uyeVar.j("hmin", true);
        uyeVar.j("wmin", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{qb2.a, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        byte b2 = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                b2 = b.A(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                num = (Integer) b.i(uyeVar, 1, a7a.a, num);
                i |= 2;
            } else if (o == 2) {
                num2 = (Integer) b.i(uyeVar, 2, a7a.a, num2);
                i |= 4;
            } else if (o == 3) {
                num3 = (Integer) b.i(uyeVar, 3, a7a.a, num3);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                num4 = (Integer) b.i(uyeVar, 4, a7a.a, num4);
                i |= 16;
            }
        }
        b.c(uyeVar);
        if (1 != (i & 1)) {
            oea.z(i, 1, descriptor);
            throw null;
        }
        fi0 fi0Var = new fi0();
        fi0Var.a = b2;
        if ((i & 2) == 0) {
            fi0Var.b = null;
        } else {
            fi0Var.b = num;
        }
        if ((i & 4) == 0) {
            fi0Var.c = null;
        } else {
            fi0Var.c = num2;
        }
        if ((i & 8) == 0) {
            fi0Var.d = null;
        } else {
            fi0Var.d = num3;
        }
        if ((i & 16) == 0) {
            fi0Var.e = null;
            return fi0Var;
        }
        fi0Var.e = num4;
        return fi0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fi0 fi0Var = (fi0) obj;
        encoder.getClass();
        fi0Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        byte b2 = fi0Var.a;
        Integer num = fi0Var.e;
        Integer num2 = fi0Var.d;
        Integer num3 = fi0Var.c;
        Integer num4 = fi0Var.b;
        b.q(uyeVar, 0, b2);
        if (b.o(uyeVar) || num4 != null) {
            b.h(uyeVar, 1, a7a.a, num4);
        }
        if (b.o(uyeVar) || num3 != null) {
            b.h(uyeVar, 2, a7a.a, num3);
        }
        if (b.o(uyeVar) || num2 != null) {
            b.h(uyeVar, 3, a7a.a, num2);
        }
        if (b.o(uyeVar) || num != null) {
            b.h(uyeVar, 4, a7a.a, num);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
