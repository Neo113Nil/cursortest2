package defpackage;

import java.util.LinkedList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class b5m extends yzc {
    public final LinkedList l = new LinkedList();

    @Override // defpackage.yzc, defpackage.keb
    public final void j(Object obj) {
        super.j(obj);
        synchronized (this.l) {
            this.l.pollFirst();
            Object peekFirst = this.l.peekFirst();
            if (peekFirst != null) {
                super.k(peekFirst);
                Unit unit = Unit.a;
            }
        }
    }

    @Override // defpackage.yzc
    public final void k(Object obj) {
        synchronized (this.l) {
            try {
                this.l.add(obj);
                if (this.l.size() == 1) {
                    super.k(obj);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
