package kotlinx.serialization.encoding;

import defpackage.p5c;
import defpackage.wf3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface Encoder {
    void B(int i);

    default wf3 C(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return b(serialDescriptor);
    }

    void F(String str);

    p5c a();

    wf3 b(SerialDescriptor serialDescriptor);

    void e(double d);

    void g(byte b);

    void j(SerialDescriptor serialDescriptor, int i);

    Encoder k(SerialDescriptor serialDescriptor);

    default void l(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }

    void m(long j);

    void p();

    void r(short s);

    void s(boolean z);

    void v(float f);

    void w(char c);
}
