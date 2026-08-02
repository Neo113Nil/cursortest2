package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yap {
    public int a;
    public final int b;
    public yap c;
    public final HashMap d = new HashMap(0);

    public yap(int i, int i2) {
        if (i > i2) {
            ilg.c();
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return me4.g(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}
