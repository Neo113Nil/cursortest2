package K7;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: K7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1372m {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6332a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public a f6333b;

    /* renamed from: c, reason: collision with root package name */
    public a f6334c;

    /* renamed from: K7.m$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public a f6335a;

        /* renamed from: b, reason: collision with root package name */
        public int f6336b;

        /* renamed from: c, reason: collision with root package name */
        public LinkedList f6337c;

        /* renamed from: d, reason: collision with root package name */
        public a f6338d;

        public String toString() {
            return "LinkedEntry(key: " + this.f6336b + ")";
        }

        public a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f6335a = aVar;
            this.f6336b = i10;
            this.f6337c = linkedList;
            this.f6338d = aVar2;
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f6332a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object pollFirst = aVar.f6337c.pollFirst();
        c(aVar);
        return pollFirst;
    }

    public final void b(a aVar) {
        if (aVar == null || !aVar.f6337c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f6332a.remove(aVar.f6336b);
    }

    public final void c(a aVar) {
        if (this.f6333b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f6333b;
        if (aVar2 == null) {
            this.f6333b = aVar;
            this.f6334c = aVar;
        } else {
            aVar.f6338d = aVar2;
            aVar2.f6335a = aVar;
            this.f6333b = aVar;
        }
    }

    public final synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f6335a;
            a aVar3 = aVar.f6338d;
            if (aVar2 != null) {
                aVar2.f6338d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f6335a = aVar2;
            }
            aVar.f6335a = null;
            aVar.f6338d = null;
            if (aVar == this.f6333b) {
                this.f6333b = aVar3;
            }
            if (aVar == this.f6334c) {
                this.f6334c = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f6332a.get(i10);
            if (aVar == null) {
                a aVar2 = new a(null, i10, new LinkedList(), null);
                this.f6332a.put(i10, aVar2);
                aVar = aVar2;
            }
            aVar.f6337c.addLast(obj);
            c(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Object f() {
        a aVar = this.f6334c;
        if (aVar == null) {
            return null;
        }
        Object pollLast = aVar.f6337c.pollLast();
        b(aVar);
        return pollLast;
    }
}
