package defpackage;

import com.ironsource.U3;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uog implements Iterable {
    public rog a;
    public rog b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final Object a(Object obj, Object obj2) {
        rog rogVar = this.a;
        while (rogVar != null && !rogVar.a.equals(obj)) {
            rogVar = rogVar.c;
        }
        if (rogVar != null) {
            return rogVar.b;
        }
        rog rogVar2 = new rog(obj, obj2);
        this.d++;
        rog rogVar3 = this.b;
        if (rogVar3 == null) {
            this.a = rogVar2;
            this.b = rogVar2;
            return null;
        }
        rogVar3.c = rogVar2;
        rogVar2.d = rogVar3;
        this.b = rogVar2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.qog) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uog)) {
            return false;
        }
        uog uogVar = (uog) obj;
        if (this.d != uogVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = uogVar.iterator();
        while (true) {
            qog qogVar = (qog) it;
            if (!qogVar.hasNext()) {
                break;
            }
            qog qogVar2 = (qog) it2;
            if (!qogVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) qogVar.next();
            Object next = qogVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            qog qogVar = (qog) it;
            if (!qogVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) qogVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        rog rogVar = this.a;
        rog rogVar2 = this.b;
        qog qogVar = new qog();
        qogVar.a = rogVar2;
        qogVar.b = rogVar;
        this.c.put(qogVar, Boolean.FALSE);
        return qogVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(U3.j.d);
        Iterator it = iterator();
        while (true) {
            qog qogVar = (qog) it;
            if (!qogVar.hasNext()) {
                sb.append(U3.j.e);
                return sb.toString();
            }
            sb.append(((Map.Entry) qogVar.next()).toString());
            if (qogVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
