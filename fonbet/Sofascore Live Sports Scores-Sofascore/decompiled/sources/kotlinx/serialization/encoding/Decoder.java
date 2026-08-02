package kotlinx.serialization.encoding;

import defpackage.dy4;
import defpackage.p5c;
import defpackage.uf3;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface Decoder {
    boolean C();

    byte E();

    p5c a();

    uf3 b(SerialDescriptor serialDescriptor);

    int f(SerialDescriptor serialDescriptor);

    int k();

    long m();

    Decoder p(SerialDescriptor serialDescriptor);

    short q();

    float r();

    double t();

    boolean u();

    char v();

    default Object y(dy4 dy4Var) {
        dy4Var.getClass();
        return dy4Var.deserialize(this);
    }

    String z();
}
