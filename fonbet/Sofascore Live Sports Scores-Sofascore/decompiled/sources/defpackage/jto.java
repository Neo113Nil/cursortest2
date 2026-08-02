package defpackage;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jto extends puo {
    public final hpo h;
    public final long i;
    public final long j;

    public jto(zro zroVar, s9n s9nVar, int i, hpo hpoVar, long j, long j2) {
        super(zroVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", s9nVar, i, 11);
        this.h = hpoVar;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.puo
    public final void a() {
        hpo hpoVar = this.h;
        if (hpoVar != null) {
            String str = (String) this.e.invoke(null, (NetworkCapabilities) hpoVar.a, Long.valueOf(this.i), Long.valueOf(this.j));
            voo vooVar = new voo();
            HashMap b = neo.b(str);
            if (b != null) {
                vooVar.a = (Long) b.get(0);
                vooVar.b = (Long) b.get(1);
                vooVar.c = (Long) b.get(2);
            }
            s9n s9nVar = this.d;
            synchronized (s9nVar) {
                try {
                    long longValue = vooVar.a.longValue();
                    s9nVar.b();
                    ((cmn) s9nVar.b).t0(longValue);
                    if (vooVar.b.longValue() >= 0) {
                        long longValue2 = vooVar.b.longValue();
                        s9nVar.b();
                        ((cmn) s9nVar.b).V(longValue2);
                    }
                    if (vooVar.c.longValue() >= 0) {
                        long longValue3 = vooVar.c.longValue();
                        s9nVar.b();
                        ((cmn) s9nVar.b).W(longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
