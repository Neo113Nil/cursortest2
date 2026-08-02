package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z55 extends m4 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public z55(y18 y18Var) {
        this.c = y18Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        File file = y18Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(a(file));
        } else if (!file.isFile()) {
            done();
        } else {
            file.getClass();
            arrayDeque.push(new v18(file));
        }
    }

    public t18 a(File file) {
        int ordinal = ((y18) this.c).b.ordinal();
        if (ordinal == 0) {
            return new w18(this, file);
        }
        if (ordinal == 1) {
            return new u18(this, file);
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.m4
    public final void computeNext() {
        Object obj;
        File a;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Iterator it = (Iterator) obj3;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((HashSet) obj2).add(next)) {
                        setNext(next);
                        break;
                    }
                }
                done();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) obj3;
                while (true) {
                    x18 x18Var = (x18) arrayDeque.peek();
                    if (x18Var == null) {
                        obj = null;
                    } else {
                        a = x18Var.a();
                        if (a == null) {
                            arrayDeque.pop();
                        } else if (!a.equals(x18Var.a) && a.isDirectory() && arrayDeque.size() < ((y18) obj2).f) {
                            arrayDeque.push(a(a));
                        }
                    }
                }
                obj = a;
                if (obj == null) {
                    done();
                    break;
                } else {
                    setNext(obj);
                    break;
                }
                break;
        }
    }

    public z55(Iterator it, gfg gfgVar) {
        it.getClass();
        this.b = it;
        this.c = new HashSet();
    }
}
