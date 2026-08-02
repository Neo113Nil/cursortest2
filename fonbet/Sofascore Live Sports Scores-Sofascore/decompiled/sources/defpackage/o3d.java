package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class o3d implements bjb, Serializable {
    public Object readResolve() throws ObjectStreamException {
        return ejb.b("NOP");
    }
}
