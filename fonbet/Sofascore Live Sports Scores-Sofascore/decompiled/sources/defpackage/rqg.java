package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rqg implements KSerializer {
    public static final rqg a = new rqg();
    public static final m5h b = aik.v("androidx.savedstate.SavedState", new SerialDescriptor[0]);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(b.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        boolean c = Intrinsics.c(dqgVar.q, "");
        Bundle bundle = dqgVar.o;
        return c ? bundle : o3a.B(bundle, dqgVar.q);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Bundle bundle = (Bundle) obj;
        encoder.getClass();
        bundle.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(b.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        boolean c = Intrinsics.c(eqgVar.q, "");
        Bundle bundle2 = eqgVar.o;
        if (c) {
            bundle2.putAll(bundle);
        } else {
            r4a.G(bundle2, eqgVar.q, bundle);
        }
    }
}
