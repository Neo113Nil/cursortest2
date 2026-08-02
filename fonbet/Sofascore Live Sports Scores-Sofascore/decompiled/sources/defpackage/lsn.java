package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lsn extends gtn {
    public static final lsn d = new lsn();

    private lsn() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gtn
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(tsn.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((i2o) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gtn
    public final void b(boolean z) {
        Iterator it = Collections.unmodifiableCollection(tsn.c.a).iterator();
        while (it.hasNext()) {
            d7n d7nVar = ((i2o) it.next()).d;
            if (((f0l) d7nVar.d).get() != 0) {
                nun.a.a(d7nVar.a(), "setState", true != z ? "backgrounded" : "foregrounded", (String) d7nVar.c);
            }
        }
    }
}
