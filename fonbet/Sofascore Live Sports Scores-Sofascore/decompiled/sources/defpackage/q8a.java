package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q8a {
    public List a;
    public int b;
    public int c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((sp5) this.a.get(this.b)).a.get(this.c);
        }
        a70.r("Index is past the end of the address group list");
        return null;
    }

    public boolean b() {
        if (c()) {
            sp5 sp5Var = (sp5) this.a.get(this.b);
            int i = this.c + 1;
            this.c = i;
            if (i >= sp5Var.a.size()) {
                int i2 = this.b + 1;
                this.b = i2;
                this.c = 0;
                if (i2 < this.a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.b < this.a.size();
    }

    public void d() {
        this.b = 0;
        this.c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i = 0; i < this.a.size(); i++) {
            int indexOf = ((sp5) this.a.get(i)).a.indexOf(socketAddress);
            if (indexOf != -1) {
                this.b = i;
                this.c = indexOf;
                return true;
            }
        }
        return false;
    }
}
