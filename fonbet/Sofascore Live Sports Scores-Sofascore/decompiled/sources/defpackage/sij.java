package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sij extends btg implements Runnable {
    public final long f;

    public sij(long j, sq3 sq3Var) {
        super(sq3Var, sq3Var.getContext());
        this.f = j;
    }

    @Override // defpackage.kea
    public final String X() {
        StringBuilder sb = new StringBuilder(super.X());
        sb.append("(timeMillis=");
        return fn0.n(sb, this.f, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoroutineContext coroutineContext = this.d;
        n4o.E(coroutineContext);
        gu3 gu3Var = (gu3) coroutineContext.get(gu3.c);
        String str = gu3Var != null ? gu3Var.b : null;
        String m = vxd.m("Timed out waiting for ", this.f, " ms");
        if (str != null) {
            StringBuilder q = wt3.q("Coroutine \"", str, "\" ");
            if (m.length() > 0) {
                m = Character.toLowerCase(m.charAt(0)) + m.substring(1);
            }
            q.append(m);
            m = q.toString();
        }
        x(new qij(m, this));
    }
}
