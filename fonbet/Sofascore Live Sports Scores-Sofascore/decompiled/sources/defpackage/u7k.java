package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u7k implements iw8 {
    public static final u7k a;
    private static final /* synthetic */ uye descriptor;

    static {
        u7k u7kVar = new u7k();
        a = u7kVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.UID", u7kVar, 3);
        uyeVar.j("id", false);
        uyeVar.j("atype", true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uhi.a, a7a.a, w7k.d[2].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = w7k.d;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        Map map = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                i2 = b.l(uyeVar, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                map = (Map) b.w(uyeVar, 2, (dy4) joaVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        b.c(uyeVar);
        if (1 != (i & 1)) {
            oea.z(i, 1, descriptor);
            throw null;
        }
        w7k w7kVar = new w7k();
        w7kVar.a = str;
        if ((i & 2) == 0) {
            w7kVar.b = 0;
        } else {
            w7kVar.b = i2;
        }
        if ((i & 4) == 0) {
            w7kVar.c = new LinkedHashMap();
            return w7kVar;
        }
        w7kVar.c = map;
        return w7kVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w7k w7kVar = (w7k) obj;
        encoder.getClass();
        w7kVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = w7k.d;
        String str = w7kVar.a;
        Map map = w7kVar.c;
        int i = w7kVar.b;
        b.y(uyeVar, 0, str);
        if (b.o(uyeVar) || i != 0) {
            b.u(1, i, uyeVar);
        }
        if (b.o(uyeVar) || !Intrinsics.c(map, new LinkedHashMap())) {
            b.f(uyeVar, 2, (KSerializer) joaVarArr[2].getValue(), map);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
