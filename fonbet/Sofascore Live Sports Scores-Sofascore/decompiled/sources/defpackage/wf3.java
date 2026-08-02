package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface wf3 {
    void A(b7f b7fVar, int i, char c);

    void D(SerialDescriptor serialDescriptor, int i, double d);

    void E(SerialDescriptor serialDescriptor, int i, long j);

    void c(SerialDescriptor serialDescriptor);

    void f(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void h(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void i(b7f b7fVar, int i, short s);

    Encoder n(b7f b7fVar, int i);

    default boolean o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }

    void q(SerialDescriptor serialDescriptor, int i, byte b);

    void t(SerialDescriptor serialDescriptor, int i, float f);

    void u(int i, int i2, SerialDescriptor serialDescriptor);

    void x(SerialDescriptor serialDescriptor, int i, boolean z);

    void y(SerialDescriptor serialDescriptor, int i, String str);
}
