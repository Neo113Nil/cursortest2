package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a9e implements KSerializer {
    public static final m5h a = aik.v("kotlin.Array<android.os.Parcelable>", new SerialDescriptor[0]);

    public static Parcelable[] a(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof dqg)) {
            ogj.h(ml4.Q(a.a, decoder));
            return null;
        }
        dqg dqgVar = (dqg) decoder;
        Bundle bundle = dqgVar.o;
        String str = dqgVar.q;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Parcelable.class);
        str.getClass();
        orCreateKotlinClass.getClass();
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) z9.l(bundle, str, sha.x(orCreateKotlinClass)) : bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        w3a.I(str);
        throw null;
    }
}
