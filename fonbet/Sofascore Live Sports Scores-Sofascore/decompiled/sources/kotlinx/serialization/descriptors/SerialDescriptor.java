package kotlinx.serialization.descriptors;

import defpackage.km5;
import defpackage.mha;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface SerialDescriptor {
    default boolean b() {
        return false;
    }

    int c(String str);

    int d();

    String e(int i);

    List f(int i);

    SerialDescriptor g(int i);

    default List getAnnotations() {
        return km5.a;
    }

    mha getKind();

    String h();

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
