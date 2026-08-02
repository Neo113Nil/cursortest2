package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class huo extends puo {
    public final kso h;
    public final long i;

    public huo(zro zroVar, s9n s9nVar, int i, kso ksoVar) {
        super(zroVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", s9nVar, i, 53);
        this.h = ksoVar;
        if (ksoVar != null) {
            if (ksoVar.l <= -2) {
                WeakReference weakReference = ksoVar.h;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    ksoVar.l = -3L;
                }
            }
            this.i = ksoVar.l;
        }
    }

    @Override // defpackage.puo
    public final void a() {
        if (this.h != null) {
            long longValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            s9n s9nVar = this.d;
            s9nVar.b();
            ((cmn) s9nVar.b).I(longValue);
        }
    }
}
