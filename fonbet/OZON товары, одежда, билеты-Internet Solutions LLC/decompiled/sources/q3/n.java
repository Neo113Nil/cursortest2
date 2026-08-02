package q3;

import I3.C3227b;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    private final long f81478a;

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet<h> f81479b = new TreeSet<>(new C3227b(1));

    /* renamed from: c, reason: collision with root package name */
    private long f81480c;

    public n(long j11) {
        this.f81478a = j11;
    }

    @Override // q3.InterfaceC8980a.b
    public final void a(q qVar, h hVar, h hVar2) {
        b(hVar);
        c(qVar, hVar2);
    }

    @Override // q3.InterfaceC8980a.b
    public final void b(h hVar) {
        this.f81479b.remove(hVar);
        this.f81480c -= hVar.f81436c;
    }

    @Override // q3.InterfaceC8980a.b
    public final void c(q qVar, h hVar) {
        TreeSet<h> treeSet = this.f81479b;
        treeSet.add(hVar);
        this.f81480c += hVar.f81436c;
        while (this.f81480c > this.f81478a && !treeSet.isEmpty()) {
            qVar.p(treeSet.first());
        }
    }

    public final void d(q qVar, long j11) {
        if (j11 != -1) {
            while (this.f81480c + j11 > this.f81478a) {
                TreeSet<h> treeSet = this.f81479b;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    qVar.p(treeSet.first());
                }
            }
        }
    }
}
