package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pd4 implements zd4, wd4 {
    public final List a;
    public final sl4 b;
    public final yd4 c;
    public int d = -1;
    public pia e;
    public List f;
    public int g;
    public volatile ntc h;
    public File i;

    public pd4(List list, sl4 sl4Var, yd4 yd4Var) {
        this.a = list;
        this.b = sl4Var;
        this.c = yd4Var;
    }

    @Override // defpackage.zd4
    public final boolean b() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    otc otcVar = (otc) list2.get(i);
                    File file = this.i;
                    sl4 sl4Var = this.b;
                    this.h = otcVar.a(file, sl4Var.e, sl4Var.f, sl4Var.i);
                    if (this.h != null && this.b.c(this.h.c.c()) != null) {
                        this.h.c.b(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            pia piaVar = (pia) this.a.get(this.d);
            sl4 sl4Var2 = this.b;
            File b = sl4Var2.h.d().b(new qd4(piaVar, sl4Var2.n));
            this.i = b;
            if (b != null) {
                this.e = piaVar;
                this.f = this.b.c.a().f(b);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.zd4
    public final void cancel() {
        ntc ntcVar = this.h;
        if (ntcVar != null) {
            ntcVar.c.cancel();
        }
    }

    @Override // defpackage.wd4
    public final void d(Exception exc) {
        this.c.c(this.e, exc, this.h.c, 3);
    }

    @Override // defpackage.wd4
    public final void l(Object obj) {
        this.c.a(this.e, obj, this.h.c, 3, this.e);
    }
}
