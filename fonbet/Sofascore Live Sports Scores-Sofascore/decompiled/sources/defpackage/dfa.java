package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dfa implements KSerializer {
    public static final dfa a = new dfa();
    public static final cfa b = cfa.b;

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        ufa.j(decoder);
        return new a((List) new xg0(sfa.a, 0).e(decoder));
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a aVar = (a) obj;
        encoder.getClass();
        aVar.getClass();
        ufa.k(encoder);
        sfa sfaVar = sfa.a;
        SerialDescriptor descriptor = sfaVar.getDescriptor();
        descriptor.getClass();
        sg0 sg0Var = new sg0(descriptor, 1);
        int size = aVar.size();
        wf3 C = encoder.C(sg0Var);
        Iterator<b> it = aVar.iterator();
        for (int i = 0; i < size; i++) {
            C.f(sg0Var, i, sfaVar, it.next());
        }
        C.c(sg0Var);
    }
}
