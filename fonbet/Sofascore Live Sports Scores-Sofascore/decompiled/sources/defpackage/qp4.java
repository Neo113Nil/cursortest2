package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qp4 implements id9 {
    public final /* synthetic */ tp4 a;

    public qp4(tp4 tp4Var) {
        this.a = tp4Var;
    }

    @Override // defpackage.id9
    public final void b() {
        this.a.e.remove(this);
    }

    @Override // defpackage.id9
    public final boolean d(Uri uri, yz1 yz1Var, boolean z) {
        sp4 sp4Var;
        tp4 tp4Var = this.a;
        HashMap hashMap = tp4Var.d;
        if (tp4Var.q == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sp4 sp4Var2 = (sp4) hashMap.get(uri);
            sp4Var2.getClass();
            kd9 kd9Var = sp4Var2.a;
            int size = kd9Var.b.size();
            cck it = vv9.t(kd9Var.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                sp4 sp4Var3 = (sp4) hashMap.get(uri2);
                if (sp4Var3 != null ? sp4Var3.c(uri2, elapsedRealtime) : false) {
                    i++;
                }
            }
            int size2 = tp4Var.l.size();
            av9 listIterator = tp4Var.l.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                if (tp4Var.g((kd9) listIterator.next(), elapsedRealtime)) {
                    i2++;
                }
            }
            jfb jfbVar = new jfb(size, i, size2, i2);
            tp4Var.c.getClass();
            r5a j = it7.j(jfbVar, yz1Var);
            if (j != null && (sp4Var = (sp4) hashMap.get(uri)) != null) {
                return sp4Var.a(uri, j.b);
            }
        }
        return false;
    }
}
