package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mh2 implements Serializable {
    public static final mh2 a = new mh2();

    private Object readResolve() throws ObjectStreamException {
        return a;
    }
}
