package defpackage;

import com.ironsource.U3;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sp5 {
    public static final rm0 d = new rm0("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List a;
    public final sm0 b;
    public final int c;

    public sp5(SocketAddress socketAddress) {
        sm0 sm0Var = sm0.b;
        List singletonList = Collections.singletonList(socketAddress);
        z1a.r("addrs is empty", !singletonList.isEmpty());
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.a = unmodifiableList;
        z1a.y(sm0Var, "attrs");
        this.b = sm0Var;
        this.c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp5)) {
            return false;
        }
        sp5 sp5Var = (sp5) obj;
        List list = sp5Var.a;
        List list2 = this.a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.b.equals(sp5Var.b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return U3.j.d + this.a + "/" + this.b + U3.j.e;
    }
}
