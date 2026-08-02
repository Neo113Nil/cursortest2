package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ikd implements tif {
    public final rkd a;
    public final Iterator b;
    public volatile boolean c;
    public boolean d;
    public boolean e;

    public ikd(rkd rkdVar, Iterator it) {
        this.a = rkdVar;
        this.b = it;
    }

    @Override // defpackage.ohh
    public final void clear() {
        this.d = true;
    }

    @Override // defpackage.k55
    public final void d() {
        this.c = true;
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return this.d;
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // defpackage.ohh
    public final Object poll() {
        if (this.d) {
            return null;
        }
        boolean z = this.e;
        Iterator it = this.b;
        if (!z) {
            this.e = true;
        } else if (!it.hasNext()) {
            this.d = true;
            return null;
        }
        Object next = it.next();
        rha.x(next, "The iterator returned a null value");
        return next;
    }
}
