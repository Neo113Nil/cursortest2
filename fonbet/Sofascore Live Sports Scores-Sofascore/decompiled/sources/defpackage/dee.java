package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class dee implements Iterator, eia {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object[] d;

    public dee(u0k u0kVar, w0k[] w0kVarArr) {
        this.a = 0;
        u0kVar.getClass();
        this.d = w0kVarArr;
        this.c = true;
        w0k w0kVar = w0kVarArr[0];
        Object[] objArr = u0kVar.d;
        int bitCount = Integer.bitCount(u0kVar.a) * 2;
        w0kVar.getClass();
        objArr.getClass();
        w0kVar.b = objArr;
        w0kVar.c = bitCount;
        w0kVar.d = 0;
        this.b = 0;
        c();
    }

    public void a() {
        w0k[] w0kVarArr = (w0k[]) this.d;
        int i = this.b;
        w0k w0kVar = w0kVarArr[i];
        if (w0kVar.d < w0kVar.c) {
            return;
        }
        while (-1 < i) {
            int d = d(i);
            if (d == -1) {
                w0k w0kVar2 = w0kVarArr[i];
                int i2 = w0kVar2.d;
                Object[] objArr = w0kVar2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    w0kVar2.d = i2 + 1;
                    d = d(i);
                }
            }
            if (d != -1) {
                this.b = d;
                return;
            }
            if (i > 0) {
                w0k w0kVar3 = w0kVarArr[i - 1];
                int i3 = w0kVar3.d;
                int length2 = w0kVar3.b.length;
                w0kVar3.d = i3 + 1;
            }
            w0kVarArr[i].a(0, 0, v0k.e.d);
            i--;
        }
        this.c = false;
    }

    public void c() {
        w0k[] w0kVarArr = (w0k[]) this.d;
        int i = this.b;
        w0k w0kVar = w0kVarArr[i];
        if (w0kVar.d < w0kVar.c) {
            return;
        }
        while (-1 < i) {
            int e = e(i);
            if (e == -1) {
                w0k w0kVar2 = w0kVarArr[i];
                int i2 = w0kVar2.d;
                Object[] objArr = w0kVar2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    w0kVar2.d = i2 + 1;
                    e = e(i);
                }
            }
            if (e != -1) {
                this.b = e;
                return;
            }
            if (i > 0) {
                w0k w0kVar3 = w0kVarArr[i - 1];
                int i3 = w0kVar3.d;
                int length2 = w0kVar3.b.length;
                w0kVar3.d = i3 + 1;
            }
            w0k w0kVar4 = w0kVarArr[i];
            Object[] objArr2 = u0k.e.d;
            w0kVar4.getClass();
            objArr2.getClass();
            w0kVar4.b = objArr2;
            w0kVar4.c = 0;
            w0kVar4.d = 0;
            i--;
        }
        this.c = false;
    }

    public int d(int i) {
        w0k[] w0kVarArr = (w0k[]) this.d;
        w0k w0kVar = w0kVarArr[i];
        int i2 = w0kVar.d;
        if (i2 < w0kVar.c) {
            return i;
        }
        Object[] objArr = w0kVar.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        v0k v0kVar = (v0k) obj;
        if (i == 6) {
            w0k w0kVar2 = w0kVarArr[i + 1];
            Object[] objArr2 = v0kVar.d;
            w0kVar2.a(objArr2.length, 0, objArr2);
        } else {
            w0kVarArr[i + 1].a(Integer.bitCount(v0kVar.a) * 2, 0, v0kVar.d);
        }
        return d(i + 1);
    }

    public int e(int i) {
        w0k[] w0kVarArr = (w0k[]) this.d;
        w0k w0kVar = w0kVarArr[i];
        int i2 = w0kVar.d;
        if (i2 < w0kVar.c) {
            return i;
        }
        Object[] objArr = w0kVar.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        u0k u0kVar = (u0k) obj;
        if (i == 6) {
            w0k w0kVar2 = w0kVarArr[i + 1];
            Object[] objArr2 = u0kVar.d;
            int length2 = objArr2.length;
            w0kVar2.getClass();
            w0kVar2.b = objArr2;
            w0kVar2.c = length2;
            w0kVar2.d = 0;
        } else {
            w0k w0kVar3 = w0kVarArr[i + 1];
            Object[] objArr3 = u0kVar.d;
            int bitCount = Integer.bitCount(u0kVar.a) * 2;
            w0kVar3.getClass();
            objArr3.getClass();
            w0kVar3.b = objArr3;
            w0kVar3.c = bitCount;
            w0kVar3.d = 0;
        }
        return e(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        Object[] objArr = this.d;
        switch (i) {
            case 0:
                if (!this.c) {
                    yhk.d();
                    break;
                } else {
                    Object next = ((w0k[]) objArr)[this.b].next();
                    c();
                    break;
                }
            default:
                if (!this.c) {
                    yhk.d();
                    break;
                } else {
                    Object next2 = ((w0k[]) objArr)[this.b].next();
                    a();
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dee(v0k v0kVar, w0k[] w0kVarArr) {
        this.a = 1;
        this.d = w0kVarArr;
        this.c = true;
        w0kVarArr[0].a(Integer.bitCount(v0kVar.a) * 2, 0, v0kVar.d);
        this.b = 0;
        a();
    }
}
