package defpackage;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ig4 extends e7 {
    public static final ig4 a = new ig4();
    public static final joa b = ypa.a(ysa.b, new wc4(1));

    @Override // defpackage.e7
    public final dy4 a(uf3 uf3Var, String str) {
        return ((zvg) b.getValue()).a(uf3Var, str);
    }

    @Override // defpackage.e7
    public final KSerializer b(Encoder encoder, Object obj) {
        kk4 kk4Var = (kk4) obj;
        encoder.getClass();
        kk4Var.getClass();
        return ((zvg) b.getValue()).b(encoder, kk4Var);
    }

    @Override // defpackage.e7
    public final KClass c() {
        return duf.a.getOrCreateKotlinClass(kk4.class);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return ((zvg) b.getValue()).getDescriptor();
    }
}
