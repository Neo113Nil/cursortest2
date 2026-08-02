package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fzf implements jb5, yae, i39, k41, cja {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final gmb c;
    public final p41 d;
    public final String e;
    public final boolean f;
    public final z78 g;
    public final z78 h;
    public final wvj i;
    public so3 j;

    public fzf(gmb gmbVar, p41 p41Var, sqf sqfVar) {
        this.c = gmbVar;
        this.d = p41Var;
        this.e = sqfVar.b;
        this.f = sqfVar.d;
        z78 g = sqfVar.c.g();
        this.g = g;
        p41Var.f(g);
        g.a(this);
        z78 g2 = ((s50) sqfVar.e).g();
        this.h = g2;
        p41Var.f(g2);
        g2.a(this);
        x50 x50Var = (x50) sqfVar.f;
        x50Var.getClass();
        wvj wvjVar = new wvj(x50Var);
        this.i = wvjVar;
        wvjVar.a(p41Var);
        wvjVar.b(this);
    }

    @Override // defpackage.k41
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        pkc.g(ajaVar, i, arrayList, ajaVar2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            fo3 fo3Var = (fo3) this.j.i.get(i2);
            if (fo3Var instanceof cja) {
                pkc.g(ajaVar, i, arrayList, ajaVar2, (cja) fo3Var);
            }
        }
    }

    @Override // defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        if (this.i.c(wj9Var, obj)) {
            return;
        }
        if (obj == nmb.s) {
            this.g.j(wj9Var);
        } else if (obj == nmb.t) {
            this.h.j(wj9Var);
        }
    }

    @Override // defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    @Override // defpackage.i39
    public final void f(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((fo3) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new so3(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.jb5
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        wvj wvjVar = this.i;
        float floatValue3 = ((Float) wvjVar.v.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) wvjVar.w.e()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(wvjVar.f(f + floatValue2));
            this.j.g(canvas, matrix2, (int) (pkc.f(floatValue3, floatValue4, f / floatValue) * i), uc5Var);
        }
    }

    @Override // defpackage.fo3
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.yae
    public final Path n() {
        Path n = this.j.n();
        Path path = this.b;
        path.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix f = this.i.f(i + floatValue2);
            Matrix matrix = this.a;
            matrix.set(f);
            path.addPath(n, matrix);
        }
        return path;
    }
}
