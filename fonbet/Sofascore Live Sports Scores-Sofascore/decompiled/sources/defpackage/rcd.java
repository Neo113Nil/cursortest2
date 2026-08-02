package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rcd implements iw8 {
    public static final rcd a;
    private static final /* synthetic */ uye descriptor;

    static {
        rcd rcdVar = new rcd();
        a = rcdVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.NimbusNative", rcdVar, 5);
        uyeVar.j("ver", true);
        uyeVar.j("plcmttype", false);
        uyeVar.j("context", false);
        uyeVar.j("contextsubtype", false);
        uyeVar.j("assets", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = tcd.f;
        qb2 qb2Var = qb2.a;
        return new KSerializer[]{uhi.a, l98.W(qb2Var), l98.W(qb2Var), l98.W(qb2Var), joaVarArr[4].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = tcd.f;
        boolean z = true;
        int i = 0;
        String str = null;
        Byte b2 = null;
        Byte b3 = null;
        Byte b4 = null;
        List list = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                b2 = (Byte) b.i(uyeVar, 1, qb2.a, b2);
                i |= 2;
            } else if (o == 2) {
                b3 = (Byte) b.i(uyeVar, 2, qb2.a, b3);
                i |= 4;
            } else if (o == 3) {
                b4 = (Byte) b.i(uyeVar, 3, qb2.a, b4);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                list = (List) b.w(uyeVar, 4, (dy4) joaVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(uyeVar);
        if (30 != (i & 30)) {
            oea.z(i, 30, descriptor);
            throw null;
        }
        tcd tcdVar = new tcd();
        if ((i & 1) == 0) {
            tcdVar.a = "1.2";
        } else {
            tcdVar.a = str;
        }
        tcdVar.b = b2;
        tcdVar.c = b3;
        tcdVar.d = b4;
        tcdVar.e = list;
        return tcdVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tcd tcdVar = (tcd) obj;
        encoder.getClass();
        tcdVar.getClass();
        String str = tcdVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = tcd.f;
        if (b.o(uyeVar) || !Intrinsics.c(str, "1.2")) {
            b.y(uyeVar, 0, str);
        }
        qb2 qb2Var = qb2.a;
        b.h(uyeVar, 1, qb2Var, tcdVar.b);
        b.h(uyeVar, 2, qb2Var, tcdVar.c);
        b.h(uyeVar, 3, qb2Var, tcdVar.d);
        b.f(uyeVar, 4, (KSerializer) joaVarArr[4].getValue(), tcdVar.e);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
