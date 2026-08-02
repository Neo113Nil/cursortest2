package defpackage;

import android.os.Bundle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rp2 implements KSerializer {
    public static final rp2 a = new rp2();
    public static final m5h b = aik.v("kotlin.CharSequence", new SerialDescriptor[0]);

    public static CharSequence a(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(b.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        Bundle bundle = dqgVar.o;
        String str = dqgVar.q;
        str.getClass();
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        w3a.I(str);
        throw null;
    }

    public static void b(Encoder encoder, CharSequence charSequence) {
        encoder.getClass();
        charSequence.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(b.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putCharSequence(str, charSequence);
    }

    @Override // defpackage.dy4
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return a(decoder);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, (CharSequence) obj);
    }
}
