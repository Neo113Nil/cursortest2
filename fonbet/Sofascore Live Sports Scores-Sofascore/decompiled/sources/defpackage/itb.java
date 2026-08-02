package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class itb extends ktb implements Iterator, eia {
    public final /* synthetic */ int e;

    public itb(ltb ltbVar, int i) {
        this.e = i;
        ltbVar.getClass();
        this.d = ltbVar;
        this.b = -1;
        this.c = ltbVar.h;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                c();
                int i = this.a;
                ltb ltbVar = (ltb) this.d;
                if (i >= ltbVar.f) {
                    yhk.d();
                    break;
                } else {
                    this.a = i + 1;
                    this.b = i;
                    jtb jtbVar = new jtb(ltbVar, i);
                    f();
                    break;
                }
            case 1:
                c();
                int i2 = this.a;
                ltb ltbVar2 = (ltb) this.d;
                if (i2 >= ltbVar2.f) {
                    yhk.d();
                    break;
                } else {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = ltbVar2.a[i2];
                    f();
                    break;
                }
            default:
                c();
                int i3 = this.a;
                ltb ltbVar3 = (ltb) this.d;
                if (i3 >= ltbVar3.f) {
                    yhk.d();
                    break;
                } else {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object[] objArr = ltbVar3.b;
                    objArr.getClass();
                    Object obj2 = objArr[this.b];
                    f();
                    break;
                }
        }
        return null;
    }
}
