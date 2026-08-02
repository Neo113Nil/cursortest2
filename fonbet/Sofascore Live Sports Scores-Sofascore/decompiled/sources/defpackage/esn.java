package defpackage;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class esn implements atn {
    public static final esn e = new esn(new gtn());
    public Date a;
    public boolean b;
    public final gtn c;
    public boolean d;

    public esn(gtn gtnVar) {
        this.c = gtnVar;
    }

    @Override // defpackage.atn
    public final void zzd(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    Iterator it = Collections.unmodifiableCollection(tsn.c.b).iterator();
                    while (it.hasNext()) {
                        d7n d7nVar = ((i2o) it.next()).d;
                        Date date3 = this.a;
                        d7nVar.b(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.d = z;
    }
}
