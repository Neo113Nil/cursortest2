package defpackage;

import android.os.Bundle;
import android.util.SizeF;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class akh implements KSerializer {
    public static final akh a = new akh();
    public static final m5h b = aik.v("android.util.SizeF", new SerialDescriptor[0]);

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
        SizeF sizeF = bundle.getSizeF(str);
        if (sizeF != null) {
            return sizeF;
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
        SizeF sizeF = (SizeF) obj;
        encoder.getClass();
        sizeF.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(b.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putSizeF(str, sizeF);
    }
}
