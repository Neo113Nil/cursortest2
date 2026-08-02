package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class n53 implements Iterator {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public n53(fio fioVar) {
        this.e = fioVar;
        this.b = fioVar.e;
        this.c = fioVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                }
                break;
            default:
                if (this.c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        Object obj = null;
        switch (i) {
            case 0:
                o53 o53Var = (o53) abstractMap;
                if (o53Var.e != this.b) {
                    a70.o();
                    break;
                } else if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    int i2 = this.c;
                    this.d = i2;
                    obj = a(i2);
                    int i3 = this.c + 1;
                    this.c = i3 < o53Var.f ? i3 : -1;
                    break;
                }
            default:
                fio fioVar = (fio) abstractMap;
                if (fioVar.e != this.b) {
                    a70.o();
                    break;
                } else if (!hasNext()) {
                    yhk.d();
                    break;
                } else {
                    int i4 = this.c;
                    this.d = i4;
                    obj = b(i4);
                    int i5 = this.c + 1;
                    this.c = i5 < fioVar.f ? i5 : -1;
                    break;
                }
        }
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                o53 o53Var = (o53) abstractMap;
                if (o53Var.e != this.b) {
                    a70.o();
                    break;
                } else {
                    z1a.D("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    int i2 = this.d;
                    Object obj = o53.j;
                    o53Var.remove(o53Var.o()[i2]);
                    this.c--;
                    this.d = -1;
                    break;
                }
            default:
                fio fioVar = (fio) abstractMap;
                if (fioVar.e != this.b) {
                    a70.o();
                    break;
                } else {
                    zzguk.g("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    fioVar.remove(fioVar.g()[this.d]);
                    this.c--;
                    this.d = -1;
                    break;
                }
        }
    }

    public n53(o53 o53Var) {
        this.e = o53Var;
        this.b = o53Var.e;
        this.c = o53Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
