package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fgc implements yae, i39 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final egc e;

    public fgc(egc egcVar) {
        this.e = egcVar;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            yae yaeVar = (yae) arrayList.get(size);
            if (yaeVar instanceof so3) {
                so3 so3Var = (so3) yaeVar;
                ArrayList arrayList2 = (ArrayList) so3Var.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path n = ((yae) arrayList2.get(size2)).n();
                    Matrix matrix = so3Var.d;
                    wvj wvjVar = so3Var.l;
                    if (wvjVar != null) {
                        matrix = wvjVar.e();
                    } else {
                        matrix.reset();
                    }
                    n.transform(matrix);
                    path.addPath(n);
                }
            } else {
                path.addPath(yaeVar.n());
            }
        }
        int i = 0;
        yae yaeVar2 = (yae) arrayList.get(0);
        if (yaeVar2 instanceof so3) {
            so3 so3Var2 = (so3) yaeVar2;
            List f = so3Var2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) f;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path n2 = ((yae) arrayList3.get(i)).n();
                Matrix matrix2 = so3Var2.d;
                wvj wvjVar2 = so3Var2.l;
                if (wvjVar2 != null) {
                    matrix2 = wvjVar2.e();
                } else {
                    matrix2.reset();
                }
                n2.transform(matrix2);
                path2.addPath(n2);
                i++;
            }
        } else {
            path2.set(yaeVar2.n());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((yae) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.i39
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            fo3 fo3Var = (fo3) listIterator.previous();
            if (fo3Var instanceof yae) {
                this.d.add((yae) fo3Var);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.yae
    public final Path n() {
        Path path = this.c;
        path.reset();
        egc egcVar = this.e;
        if (!egcVar.b) {
            int C = wt3.C(egcVar.a);
            if (C == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((yae) arrayList.get(i)).n());
                    i++;
                }
            } else {
                if (C == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (C == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (C == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (C == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
