package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mk6 {
    public final Object a;
    public final int b;

    public mk6(int i, MessageLite messageLite) {
        this.a = messageLite;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mk6)) {
            return false;
        }
        mk6 mk6Var = (mk6) obj;
        return this.a == mk6Var.a && this.b == mk6Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
