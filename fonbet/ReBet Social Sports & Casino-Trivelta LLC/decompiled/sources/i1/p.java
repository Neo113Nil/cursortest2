package i1;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public final long f47995a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeSet f47996b = new TreeSet(new Comparator() { // from class: i1.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h10;
            h10 = p.h((i) obj, (i) obj2);
            return h10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public long f47997c;

    public p(long j10) {
        this.f47995a = j10;
    }

    public static int h(i iVar, i iVar2) {
        long j10 = iVar.f47965f;
        long j11 = iVar2.f47965f;
        return j10 - j11 == 0 ? iVar.compareTo(iVar2) : j10 < j11 ? -1 : 1;
    }

    @Override // i1.InterfaceC4517a.b
    public void a(InterfaceC4517a interfaceC4517a, i iVar) {
        this.f47996b.add(iVar);
        this.f47997c += iVar.f47962c;
        i(interfaceC4517a, 0L);
    }

    @Override // i1.InterfaceC4517a.b
    public void b(InterfaceC4517a interfaceC4517a, i iVar) {
        this.f47996b.remove(iVar);
        this.f47997c -= iVar.f47962c;
    }

    @Override // i1.d
    public void c(InterfaceC4517a interfaceC4517a, String str, long j10, long j11) {
        if (j11 != -1) {
            i(interfaceC4517a, j11);
        }
    }

    @Override // i1.d
    public boolean d() {
        return true;
    }

    @Override // i1.InterfaceC4517a.b
    public void e(InterfaceC4517a interfaceC4517a, i iVar, i iVar2) {
        b(interfaceC4517a, iVar);
        a(interfaceC4517a, iVar2);
    }

    public final void i(InterfaceC4517a interfaceC4517a, long j10) {
        while (this.f47997c + j10 > this.f47995a && !this.f47996b.isEmpty()) {
            interfaceC4517a.g((i) this.f47996b.first());
        }
    }

    @Override // i1.d
    public void f() {
    }
}
