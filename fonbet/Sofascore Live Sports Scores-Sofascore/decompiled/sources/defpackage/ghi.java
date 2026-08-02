package defpackage;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ghi {
    public static final Set a;

    static {
        y7k.b.getClass();
        e8k.b.getClass();
        p7k.b.getClass();
        q8k.b.getClass();
        a = ph0.a0(new SerialDescriptor[]{c8k.b, i8k.b, t7k.b, u8k.b});
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
