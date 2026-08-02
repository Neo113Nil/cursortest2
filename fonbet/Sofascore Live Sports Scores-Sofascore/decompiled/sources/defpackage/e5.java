package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class e5 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public e5(n5 n5Var, byte b) {
        this.a = 5;
        this.d = n5Var;
        Collection collection = n5Var.c;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        n5 n5Var = (n5) this.d;
        n5Var.d();
        if (n5Var.c == ((Collection) this.c)) {
            return;
        }
        a70.o();
    }

    public void b() {
        n5 n5Var = (n5) this.d;
        n5Var.m();
        if (n5Var.c == ((Collection) this.c)) {
            return;
        }
        a70.o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                a();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((f5) obj).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return it.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = (Collection) entry3.getValue();
                return ((f5) obj).c(entry3);
            case 4:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = entry4;
                return entry4.getKey();
            default:
                b();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                z1a.D("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((azc) ((f5) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                z1a.D("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((g5) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            case 2:
                it.remove();
                n5 n5Var = (n5) obj;
                ((azc) n5Var.f).f--;
                n5Var.e();
                break;
            case 3:
                zzguk.g("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((hjo) ((f5) obj).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 4:
                zzguk.g("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection2 = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((pho) obj).c.e -= collection2.size();
                collection2.clear();
                this.c = null;
                break;
            default:
                it.remove();
                n5 n5Var2 = (n5) obj;
                hjo hjoVar = (hjo) n5Var2.f;
                hjoVar.e--;
                n5Var2.zzb();
                break;
        }
    }

    public e5(f5 f5Var, byte b) {
        this.a = 3;
        this.d = f5Var;
        this.b = f5Var.b.entrySet().iterator();
    }

    public /* synthetic */ e5(AbstractSet abstractSet, Iterator it, int i) {
        this.a = i;
        this.b = it;
        this.d = abstractSet;
    }

    public e5(n5 n5Var, ListIterator listIterator, byte b) {
        this.a = 5;
        this.d = n5Var;
        this.c = n5Var.c;
        this.b = listIterator;
    }

    public e5(n5 n5Var) {
        Iterator it;
        this.a = 2;
        this.d = n5Var;
        Collection collection = n5Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public e5(n5 n5Var, ListIterator listIterator) {
        this.a = 2;
        this.d = n5Var;
        this.c = n5Var.c;
        this.b = listIterator;
    }

    public e5(f5 f5Var) {
        this.a = 0;
        this.d = f5Var;
        this.b = f5Var.b.entrySet().iterator();
    }
}
