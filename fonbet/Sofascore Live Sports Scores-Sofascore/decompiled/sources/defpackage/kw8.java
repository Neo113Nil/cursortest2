package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kw8 implements Iterator, eia {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    public kw8(a1d a1dVar) {
        this.a = 2;
        this.d = a1dVar;
        this.b = -1;
        this.c = b5h.a(new z0d(a1dVar, this, null));
    }

    public void a() {
        Object invoke;
        int i = this.b;
        a65 a65Var = (a65) this.d;
        if (i == -2) {
            invoke = ((Function0) a65Var.b).invoke();
        } else {
            Function1 function1 = (Function1) a65Var.c;
            Object obj = this.c;
            obj.getClass();
            invoke = function1.invoke(obj);
        }
        this.c = invoke;
        this.b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            case 1:
                return ((w4h) this.c).hasNext();
            case 2:
                return ((w4h) this.c).hasNext();
            default:
                tji tjiVar = (tji) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < tjiVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                return this.b < tjiVar.c && it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    yhk.d();
                    return null;
                }
                Object obj = this.c;
                obj.getClass();
                this.b = -1;
                return obj;
            case 1:
                return ((w4h) this.c).next();
            case 2:
                return ((w4h) this.c).next();
            default:
                tji tjiVar = (tji) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < tjiVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i = this.b;
                if (i < tjiVar.c) {
                    this.b = i + 1;
                    return it.next();
                }
                yhk.d();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.b;
                if (i2 != -1) {
                    ((o0d) obj).b.i(i2);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.b;
                if (i3 != -1) {
                    ((a1d) obj).b.m(i3);
                    this.b = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public kw8(a65 a65Var) {
        this.a = 0;
        this.d = a65Var;
        this.b = -2;
    }

    public kw8(tji tjiVar) {
        this.a = 3;
        this.d = tjiVar;
        this.c = tjiVar.a.iterator();
    }

    public kw8(o0d o0dVar) {
        this.a = 1;
        this.d = o0dVar;
        this.b = -1;
        this.c = b5h.a(new n0d(o0dVar, this, null));
    }
}
