package p;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f21384a;

    /* renamed from: b, reason: collision with root package name */
    public c f21385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21386c;

    public b(c cVar, c cVar2, int i5) {
        this.f21386c = i5;
        this.f21384a = cVar2;
        this.f21385b = cVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f21384a == cVar && cVar == this.f21385b) {
            this.f21385b = null;
            this.f21384a = null;
        }
        c cVar4 = this.f21384a;
        if (cVar4 == cVar) {
            switch (this.f21386c) {
                case 0:
                    cVar2 = cVar4.f21390d;
                    break;
                default:
                    cVar2 = cVar4.f21389c;
                    break;
            }
            this.f21384a = cVar2;
        }
        c cVar5 = this.f21385b;
        if (cVar5 == cVar) {
            c cVar6 = this.f21384a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f21385b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f21386c) {
            case 0:
                return cVar.f21389c;
            default:
                return cVar.f21390d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21385b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f21385b;
        c cVar2 = this.f21384a;
        this.f21385b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
