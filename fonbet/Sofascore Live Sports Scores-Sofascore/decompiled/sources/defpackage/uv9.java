package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uv9 implements Serializable {
    public final Object[] a;

    public uv9(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        return vv9.u(this.a);
    }
}
