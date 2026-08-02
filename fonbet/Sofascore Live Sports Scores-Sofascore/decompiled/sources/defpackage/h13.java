package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class h13 extends w2 {
    public final KSerializer a;

    public h13(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.w2
    public void f(uf3 uf3Var, int i, Object obj) {
        i(i, obj, uf3Var.w(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        int d = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        wf3 C = encoder.C(descriptor);
        Iterator c = c(obj);
        for (int i = 0; i < d; i++) {
            C.f(getDescriptor(), i, this.a, c.next());
        }
        C.c(descriptor);
    }
}
