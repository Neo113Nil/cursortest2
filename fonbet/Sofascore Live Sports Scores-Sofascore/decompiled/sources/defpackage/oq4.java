package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oq4 implements KSerializer {
    public static final oq4 b = new oq4();
    public final m5h a = aik.v("java.io.Serializable", new SerialDescriptor[0]);

    @Override // defpackage.dy4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Serializable deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(this.a.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        Bundle bundle = dqgVar.o;
        String str = dqgVar.q;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Serializable.class);
        str.getClass();
        orCreateKotlinClass.getClass();
        Serializable M = gz8.M(bundle, str, sha.x(orCreateKotlinClass));
        if (M != null) {
            return M;
        }
        w3a.I(str);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, Serializable serializable) {
        encoder.getClass();
        serializable.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(this.a.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putSerializable(str, serializable);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
