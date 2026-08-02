package K7;

import java.util.LinkedList;

/* loaded from: classes2.dex */
public class H extends C1371l {

    /* renamed from: f, reason: collision with root package name */
    public LinkedList f6258f;

    public H(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
        this.f6258f = new LinkedList();
    }

    @Override // K7.C1371l
    public void a(Object obj) {
        H6.f fVar = (H6.f) this.f6258f.poll();
        if (fVar == null) {
            fVar = new H6.f();
        }
        fVar.c(obj);
        this.f6329c.add(fVar);
    }

    @Override // K7.C1371l
    public Object g() {
        H6.f fVar = (H6.f) this.f6329c.poll();
        D6.k.g(fVar);
        Object b10 = fVar.b();
        fVar.a();
        this.f6258f.add(fVar);
        return b10;
    }
}
