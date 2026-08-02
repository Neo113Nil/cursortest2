package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b9e implements KSerializer {
    public static final b9e a = new b9e();
    public static final m5h b = aik.v("kotlin.collections.List<android.os.Parcelable>", new SerialDescriptor[0]);

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
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Parcelable.class);
        str.getClass();
        orCreateKotlinClass.getClass();
        ArrayList L = gz8.L(bundle, str, sha.x(orCreateKotlinClass));
        if (L != null) {
            return L;
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
        } else {
            eqg eqgVar = (eqg) encoder;
            r4a.F(eqgVar.o, eqgVar.q, list);
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
