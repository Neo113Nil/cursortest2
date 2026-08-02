package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qr4 implements KSerializer {
    public static final qr4 b = new qr4();
    public final m5h a = aik.v("android.os.Parcelable", new SerialDescriptor[0]);

    @Override // defpackage.dy4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Parcelable deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(this.a.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        Bundle bundle = dqgVar.o;
        String str = dqgVar.q;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Parcelable.class);
        str.getClass();
        orCreateKotlinClass.getClass();
        Parcelable parcelable = (Parcelable) gz8.K(bundle, str, sha.x(orCreateKotlinClass));
        if (parcelable != null) {
            return parcelable;
        }
        w3a.I(str);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, Parcelable parcelable) {
        encoder.getClass();
        parcelable.getClass();
        if (!(encoder instanceof eqg)) {
            ogj.h(ml4.S(this.a.a, encoder));
            return;
        }
        eqg eqgVar = (eqg) encoder;
        Bundle bundle = eqgVar.o;
        String str = eqgVar.q;
        str.getClass();
        bundle.putParcelable(str, parcelable);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
