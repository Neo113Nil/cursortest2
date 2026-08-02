package androidx.media3.transformer;

import androidx.media3.transformer.a0;
import androidx.media3.transformer.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.fxc0;
import xsna.ihz;
import xsna.io20;
import xsna.otu;
import xsna.xy4;

/* compiled from: FallbackListener.java */
/* loaded from: classes12.dex */
public final class u {
    public final f a;
    public final ihz<a0.c> b;
    public final otu c;
    public final z d;
    public final AtomicInteger e = new AtomicInteger();
    public z f;

    public u(f fVar, ihz<a0.c> ihzVar, otu otuVar, z zVar) {
        this.a = fVar;
        this.b = ihzVar;
        this.c = otuVar;
        this.d = zVar;
        this.f = zVar;
    }

    public final synchronized void a(z zVar) {
        boolean z;
        try {
            fxc0.z(this.e.getAndDecrement() > 0);
            z.a a = this.f.a();
            if (!Objects.equals(zVar.b, this.d.b)) {
                String q = io20.q(zVar.b);
                if (q != null && !io20.l(q)) {
                    z = false;
                    fxc0.o(q, "Not an audio MIME type: %s", z);
                    a.b = q;
                }
                z = true;
                fxc0.o(q, "Not an audio MIME type: %s", z);
                a.b = q;
            }
            if (!Objects.equals(zVar.c, this.d.c)) {
                String q2 = io20.q(zVar.c);
                fxc0.o(q2, "Not a video MIME type: %s", q2 == null || io20.p(q2));
                a.c = q2;
            }
            int i = zVar.a;
            z zVar2 = this.d;
            if (i != zVar2.a) {
                a.a = i;
            }
            int i2 = zVar.d;
            if (i2 != zVar2.d) {
                a.d = i2;
            }
            z a2 = a.a();
            this.f = a2;
            if (this.e.get() == 0 && !this.d.equals(this.f)) {
                this.c.post(new xy4(2, this, a2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
