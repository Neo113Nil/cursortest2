package wg;

import java.util.ArrayList;
import java.util.Iterator;
import ug.AbstractC6575c;

/* loaded from: classes4.dex */
public class k extends AbstractC6575c {

    /* renamed from: g, reason: collision with root package name */
    public C6746a f67770g;

    public k(C6746a c6746a) {
        super("PEXTimeOutListener", 10000L);
        this.f67770g = c6746a;
    }

    @Override // ug.AbstractC6575c
    public void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f67770g.u((AbstractC6749d) it.next());
        }
    }

    @Override // ug.AbstractC6575c
    public boolean c(Object obj) {
        return System.currentTimeMillis() - ((AbstractC6749d) obj).b() > this.f67770g.q();
    }
}
