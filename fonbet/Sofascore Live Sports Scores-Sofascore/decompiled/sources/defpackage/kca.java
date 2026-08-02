package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kca extends cck {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kca(s9h s9hVar) {
        this();
        this.c = 1;
        this.e = s9hVar;
        this.d = s9hVar.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        z1a.E(this.a != 4);
        int C = wt3.C(this.a);
        if (C == 0) {
            return true;
        }
        if (C != 2) {
            this.a = 4;
            int i = this.c;
            Object obj = null;
            Object obj2 = this.e;
            Iterator it = this.d;
            switch (i) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((m3f) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.a = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((s9h) obj2).b.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.a = 3;
                    break;
            }
            this.b = obj;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kca(Iterator it, m3f m3fVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = m3fVar;
    }

    public kca() {
        this.a = 2;
    }
}
