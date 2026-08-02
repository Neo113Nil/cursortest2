package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fo0 {
    public final hv9 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public fo0(hv9 hv9Var) {
        this.a = hv9Var;
        ho0 ho0Var = ho0.e;
        this.d = false;
    }

    public final void a() {
        io0 io0Var = io0.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j = io0Var.a;
        int i = 0;
        while (true) {
            hv9 hv9Var = this.a;
            if (i >= hv9Var.size()) {
                break;
            }
            mo0 mo0Var = (mo0) hv9Var.get(i);
            mo0Var.a(new io0(j));
            if (mo0Var.isActive()) {
                j = mo0Var.c(j);
                z1a.E(j >= 0);
                arrayList.add(mo0Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((mo0) arrayList.get(i2)).getOutput();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((mo0) this.b.get(b())).isEnded() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    mo0 mo0Var = (mo0) arrayList.get(i);
                    if (!mo0Var.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : mo0.a;
                        long remaining = byteBuffer2.remaining();
                        mo0Var.queueInput(byteBuffer2);
                        this.c[i] = mo0Var.getOutput();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((mo0) arrayList.get(i + 1)).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo0)) {
            return false;
        }
        hv9 hv9Var = ((fo0) obj).a;
        hv9 hv9Var2 = this.a;
        if (hv9Var2.size() != hv9Var.size()) {
            return false;
        }
        for (int i = 0; i < hv9Var2.size(); i++) {
            if (hv9Var2.get(i) != hv9Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
