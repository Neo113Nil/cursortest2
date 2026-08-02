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
public final class zvh implements iw8 {
    public static final zvh a;
    private static final /* synthetic */ uye descriptor;

    static {
        zvh zvhVar = new zvh();
        a = zvhVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Source", zvhVar, 1);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dwh.b[0].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = dwh.b;
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
        return new dwh(i, map);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dwh dwhVar = (dwh) obj;
        encoder.getClass();
        dwhVar.getClass();
        Map map = dwhVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = dwh.b;
        if (b.o(uyeVar) || !Intrinsics.c(map, new LinkedHashMap())) {
            b.f(uyeVar, 0, (KSerializer) joaVarArr[0].getValue(), map);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
