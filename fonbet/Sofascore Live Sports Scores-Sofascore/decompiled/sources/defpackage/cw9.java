package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cw9 implements iw8 {
    public static final cw9 a;
    private static final /* synthetic */ uye descriptor;

    static {
        cw9 cw9Var = new cw9();
        a = cw9Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Impression", cw9Var, 6);
        uyeVar.j("banner", true);
        uyeVar.j("video", true);
        uyeVar.j(IronSourceConstants.EVENTS_NATIVE, true);
        uyeVar.j("instl", true);
        uyeVar.j("secure", true);
        uyeVar.j("ext", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(kz0.a);
        KSerializer W2 = l98.W(vok.a);
        KSerializer W3 = l98.W(r3d.a);
        qb2 qb2Var = qb2.a;
        return new KSerializer[]{W, W2, W3, qb2Var, qb2Var, ew9.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        mz0 mz0Var = null;
        xok xokVar = null;
        t3d t3dVar = null;
        gw9 gw9Var = null;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    mz0Var = (mz0) b.i(uyeVar, 0, kz0.a, mz0Var);
                    i |= 1;
                    break;
                case 1:
                    xokVar = (xok) b.i(uyeVar, 1, vok.a, xokVar);
                    i |= 2;
                    break;
                case 2:
                    t3dVar = (t3d) b.i(uyeVar, 2, r3d.a, t3dVar);
                    i |= 4;
                    break;
                case 3:
                    b2 = b.A(uyeVar, 3);
                    i |= 8;
                    break;
                case 4:
                    b3 = b.A(uyeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    gw9Var = (gw9) b.w(uyeVar, 5, ew9.a, gw9Var);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(uyeVar);
        if (32 != (i & 32)) {
            oea.z(i, 32, descriptor);
            throw null;
        }
        hw9 hw9Var = new hw9();
        if ((i & 1) == 0) {
            hw9Var.a = null;
        } else {
            hw9Var.a = mz0Var;
        }
        if ((i & 2) == 0) {
            hw9Var.b = null;
        } else {
            hw9Var.b = xokVar;
        }
        if ((i & 4) == 0) {
            hw9Var.c = null;
        } else {
            hw9Var.c = t3dVar;
        }
        if ((i & 8) == 0) {
            hw9Var.d = (byte) 0;
        } else {
            hw9Var.d = b2;
        }
        if ((i & 16) == 0) {
            hw9Var.e = (byte) 1;
        } else {
            hw9Var.e = b3;
        }
        hw9Var.f = gw9Var;
        return hw9Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hw9 hw9Var = (hw9) obj;
        encoder.getClass();
        hw9Var.getClass();
        byte b = hw9Var.e;
        t3d t3dVar = hw9Var.c;
        uye uyeVar = descriptor;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || hw9Var.a != null) {
            b2.h(uyeVar, 0, kz0.a, hw9Var.a);
        }
        if (b2.o(uyeVar) || hw9Var.b != null) {
            b2.h(uyeVar, 1, vok.a, hw9Var.b);
        }
        if (b2.o(uyeVar) || t3dVar != null) {
            b2.h(uyeVar, 2, r3d.a, t3dVar);
        }
        if (b2.o(uyeVar) || hw9Var.d != 0) {
            b2.q(uyeVar, 3, hw9Var.d);
        }
        if (b2.o(uyeVar) || b != 1) {
            b2.q(uyeVar, 4, b);
        }
        b2.f(uyeVar, 5, ew9.a, hw9Var.f);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
