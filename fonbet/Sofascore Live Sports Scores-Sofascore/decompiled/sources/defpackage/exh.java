package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class exh implements KSerializer {
    public static final exh a = new exh();
    public static final m5h b = aik.v("android.util.SparseArray<android.os.Parcelable>", new SerialDescriptor[0]);

    @Override // defpackage.dy4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SparseArray deserialize(Decoder decoder) {
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
        SparseArray p = Build.VERSION.SDK_INT >= 34 ? z9.p(bundle, str, sha.x(orCreateKotlinClass)) : bundle.getSparseParcelableArray(str);
        if (p != null) {
            return p;
        }
        w3a.I(str);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, SparseArray sparseArray) {
        encoder.getClass();
        sparseArray.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(b.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
