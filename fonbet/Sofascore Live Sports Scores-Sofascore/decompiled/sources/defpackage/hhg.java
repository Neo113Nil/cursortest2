package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hhg extends y0 {
    public final ArrayList d;
    public final String e;
    public final ccd f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhg(wm2 wm2Var, String str) {
        super(wm2Var, new HashMap());
        ccd ccdVar = ccd.f;
        Context context = hkg.a;
        String str2 = context != null ? (String) fig.c(context).d : null;
        this.d = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    fkg fkgVar = (fkg) it.next();
                    if (fkgVar instanceof alg) {
                        alg algVar = (alg) fkgVar;
                        if (algVar.b() >= 0) {
                            this.d.add(algVar);
                        }
                    }
                }
                Collections.sort(this.d, new laf(13));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = str;
        this.f = ccdVar;
        this.g = str2;
    }
}
