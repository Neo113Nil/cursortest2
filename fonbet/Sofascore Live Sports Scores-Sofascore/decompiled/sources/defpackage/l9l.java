package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class l9l {
    public final x9l a;
    public u4a[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public l9l(x9l x9lVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = x9lVar;
        c(x9lVar);
    }

    public final void a() {
        u4a[] u4aVarArr = this.b;
        if (u4aVarArr != null) {
            u4a u4aVar = u4aVarArr[0];
            u4a u4aVar2 = u4aVarArr[1];
            x9l x9lVar = this.a;
            if (u4aVar2 == null) {
                u4aVar2 = x9lVar.a.i(2);
            }
            if (u4aVar == null) {
                u4aVar = x9lVar.a.i(1);
            }
            h(u4a.a(u4aVar, u4aVar2));
            u4a u4aVar3 = this.b[oea.o(16)];
            if (u4aVar3 != null) {
                g(u4aVar3);
            }
            u4a u4aVar4 = this.b[oea.o(32)];
            if (u4aVar4 != null) {
                e(u4aVar4);
            }
            u4a u4aVar5 = this.b[oea.o(64)];
            if (u4aVar5 != null) {
                i(u4aVar5);
            }
        }
    }

    public abstract x9l b();

    public void c(x9l x9lVar) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> f = x9lVar.a.f(i);
            int o = oea.o(i);
            this.c[o] = (Rect[]) f.toArray(new Rect[f.size()]);
            if (i != 8) {
                List<Rect> g = x9lVar.a.g(i);
                this.d[o] = (Rect[]) g.toArray(new Rect[g.size()]);
            }
        }
    }

    public void d(int i, u4a u4aVar) {
        if (this.b == null) {
            this.b = new u4a[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[oea.o(i2)] = u4aVar;
            }
        }
    }

    public abstract void f(u4a u4aVar);

    public abstract void h(u4a u4aVar);

    public l9l() {
        this(new x9l((x9l) null));
    }

    public void e(u4a u4aVar) {
    }

    public void g(u4a u4aVar) {
    }

    public void i(u4a u4aVar) {
    }
}
