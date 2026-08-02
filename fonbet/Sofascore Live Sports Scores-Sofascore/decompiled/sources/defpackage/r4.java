package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class r4 implements Iterator, eia {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public r4(ip5 ip5Var) {
        this.a = 2;
        this.c = ip5Var;
        this.b = ip5Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b < ((u4) obj).size()) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.b > 0) {
                    break;
                }
                break;
            case 3:
                if (this.b < ((zwh) obj).e()) {
                    break;
                }
                break;
            case 4:
                if (this.b < ((byte[]) obj).length) {
                    break;
                }
                break;
            case 5:
                if (this.b < ((int[]) obj).length) {
                    break;
                }
                break;
            case 6:
                if (this.b < ((long[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.b < ((short[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    break;
                }
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    ogj.m(e.getMessage());
                    return null;
                }
            case 2:
                ip5 ip5Var = (ip5) obj;
                int i4 = ip5Var.c;
                int i5 = this.b;
                this.b = i5 - 1;
                break;
            case 3:
                int i6 = this.b;
                this.b = i6 + 1;
                break;
            case 4:
                int i7 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i7 >= bArr.length) {
                    ogj.m(String.valueOf(i7));
                    break;
                } else {
                    this.b = i7 + 1;
                    break;
                }
            case 5:
                int i8 = this.b;
                int[] iArr = (int[]) obj;
                if (i8 >= iArr.length) {
                    ogj.m(String.valueOf(i8));
                    break;
                } else {
                    this.b = i8 + 1;
                    break;
                }
            case 6:
                int i9 = this.b;
                long[] jArr = (long[]) obj;
                if (i9 >= jArr.length) {
                    ogj.m(String.valueOf(i9));
                    break;
                } else {
                    this.b = i9 + 1;
                    break;
                }
            default:
                int i10 = this.b;
                short[] sArr = (short[]) obj;
                if (i10 >= sArr.length) {
                    ogj.m(String.valueOf(i10));
                    break;
                } else {
                    this.b = i10 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r4(Object[] objArr) {
        this.a = 1;
        objArr.getClass();
        this.c = objArr;
    }

    public /* synthetic */ r4(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }
}
