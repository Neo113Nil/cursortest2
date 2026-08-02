package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qp2 implements KSerializer {
    public static final qp2 a = new qp2();
    public static final m5h b = aik.v("kotlin.collections.List<kotlin.CharSequence>", new SerialDescriptor[0]);

    @Override // defpackage.dy4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ArrayList deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(b.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        Bundle bundle = dqgVar.o;
        String str = dqgVar.q;
        str.getClass();
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        w3a.I(str);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, List list) {
        encoder.getClass();
        list.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(b.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putCharSequenceArrayList(str, h5a.R(list));
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
