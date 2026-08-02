package defpackage;

import com.ironsource.U3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x0h implements iw8 {
    public static final x0h a;
    private static final /* synthetic */ uye descriptor;

    static {
        x0h x0hVar = new x0h();
        a = x0hVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Segment", x0hVar, 4);
        uyeVar.j("id", true);
        uyeVar.j("name", true);
        uyeVar.j(U3.i.X, true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = c1h.e;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), joaVarArr[3].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = c1h.e;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
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
            } else if (o == 2) {
                str3 = (String) b.i(uyeVar, 2, uhi.a, str3);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                map = (Map) b.w(uyeVar, 3, (dy4) joaVarArr[3].getValue(), map);
                i |= 8;
            }
        }
        b.c(uyeVar);
        return new c1h(i, str, str2, str3, map);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c1h c1hVar = (c1h) obj;
        encoder.getClass();
        c1hVar.getClass();
        Map map = c1hVar.d;
        String str = c1hVar.c;
        String str2 = c1hVar.b;
        String str3 = c1hVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = c1h.e;
        if (b.o(uyeVar) || str3 != null) {
            b.h(uyeVar, 0, uhi.a, str3);
        }
        if (b.o(uyeVar) || str2 != null) {
            b.h(uyeVar, 1, uhi.a, str2);
        }
        if (b.o(uyeVar) || str != null) {
            b.h(uyeVar, 2, uhi.a, str);
        }
        if (b.o(uyeVar) || !Intrinsics.c(map, new LinkedHashMap())) {
            b.f(uyeVar, 3, (KSerializer) joaVarArr[3].getValue(), map);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
