package defpackage;

import android.os.Bundle;
import android.util.Size;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jkh implements KSerializer {
    public static final jkh a = new jkh();
    public static final m5h b = aik.v("android.util.Size", new SerialDescriptor[0]);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(b.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        Bundle bundle = dqgVar.o;
        String str = dqgVar.q;
        str.getClass();
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        w3a.I(str);
        throw null;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Size size = (Size) obj;
        encoder.getClass();
        size.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(b.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putSize(str, size);
    }
}
