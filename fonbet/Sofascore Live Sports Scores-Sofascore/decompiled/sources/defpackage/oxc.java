package defpackage;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oxc {
    public final String[] a;
    public final int b;

    public oxc(sp5 sp5Var) {
        z1a.y(sp5Var, "eag");
        List list = sp5Var.a;
        this.a = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.a[i] = ((SocketAddress) it.next()).toString();
            i++;
        }
        Arrays.sort(this.a);
        this.b = Arrays.hashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oxc)) {
            return false;
        }
        oxc oxcVar = (oxc) obj;
        if (oxcVar.b == this.b) {
            String[] strArr = oxcVar.a;
            int length = strArr.length;
            String[] strArr2 = this.a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return Arrays.toString(this.a);
    }
}
