package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class so3 implements jb5, yae, k41, bja {
    public final yz1 a;
    public final RectF b;
    public final cnd c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final gmb j;
    public ArrayList k;
    public final wvj l;

    public so3(gmb gmbVar, p41 p41Var, String str, boolean z, ArrayList arrayList, x50 x50Var) {
        this.a = new yz1(8);
        this.b = new RectF();
        this.c = new cnd();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = gmbVar;
        this.h = z;
        this.i = arrayList;
        if (x50Var != null) {
            wvj wvjVar = new wvj(x50Var);
            this.l = wvjVar;
            wvjVar.a(p41Var);
            wvjVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fo3 fo3Var = (fo3) arrayList.get(size);
            if (fo3Var instanceof i39) {
                arrayList2.add((i39) fo3Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((i39) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.k41
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            fo3 fo3Var = (fo3) arrayList.get(size2);
            fo3Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(fo3Var);
        }
    }

    @Override // defpackage.bja
    public final void c(aja ajaVar, int i, ArrayList arrayList, aja ajaVar2) {
        String str = this.g;
        if (!ajaVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            aja ajaVar3 = new aja(ajaVar2);
            ajaVar3.a.add(str);
            if (ajaVar.a(i, str)) {
                aja ajaVar4 = new aja(ajaVar3);
                ajaVar4.b = this;
                arrayList.add(ajaVar4);
            }
            ajaVar2 = ajaVar3;
        }
        if (!ajaVar.d(i, str)) {
            return;
        }
        int b = ajaVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            fo3 fo3Var = (fo3) arrayList2.get(i2);
            if (fo3Var instanceof bja) {
                ((bja) fo3Var).c(ajaVar, b, arrayList, ajaVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        wvj wvjVar = this.l;
        if (wvjVar != null) {
            wvjVar.c(wj9Var, obj);
        }
    }

    @Override // defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        wvj wvjVar = this.l;
        if (wvjVar != null) {
            matrix2.preConcat(wvjVar.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            fo3 fo3Var = (fo3) arrayList.get(size);
            if (fo3Var instanceof jb5) {
                ((jb5) fo3Var).e(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List f() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                fo3 fo3Var = (fo3) arrayList.get(i);
                if (fo3Var instanceof yae) {
                    this.k.add((yae) fo3Var);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.jb5
    public final void g(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        wvj wvjVar = this.l;
        if (wvjVar != null) {
            matrix2.preConcat(wvjVar.e());
            i = (int) (((((wvjVar.p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        gmb gmbVar = this.j;
        boolean z = (gmbVar.s && h() && i != 255) || (uc5Var != null && gmbVar.t && h());
        int i2 = z ? 255 : i;
        cnd cndVar = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            e(rectF, matrix, true);
            yz1 yz1Var = this.a;
            yz1Var.b = i;
            if (uc5Var != null) {
                if (Color.alpha(uc5Var.d) > 0) {
                    yz1Var.c = uc5Var;
                } else {
                    yz1Var.c = null;
                }
                uc5Var = null;
            } else {
                yz1Var.c = null;
            }
            canvas = cndVar.e(canvas, rectF, yz1Var);
        } else if (uc5Var != null) {
            uc5 uc5Var2 = new uc5(uc5Var);
            uc5Var2.b(i2);
            uc5Var = uc5Var2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof jb5) {
                ((jb5) obj).g(canvas, matrix2, i2, uc5Var);
            }
        }
        if (z) {
            cndVar.c();
        }
    }

    @Override // defpackage.fo3
    public final String getName() {
        throw null;
    }

    public final boolean h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof jb5) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.yae
    public final Path n() {
        Matrix matrix = this.d;
        matrix.reset();
        wvj wvjVar = this.l;
        if (wvjVar != null) {
            matrix.set(wvjVar.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                fo3 fo3Var = (fo3) arrayList.get(size);
                if (fo3Var instanceof yae) {
                    path.addPath(((yae) fo3Var).n(), matrix);
                }
            }
        }
        return path;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public so3(gmb gmbVar, p41 p41Var, fbh fbhVar, plb plbVar) {
        this(gmbVar, p41Var, r3, r4, r5, r11);
        x50 x50Var;
        String str = fbhVar.a;
        boolean z = fbhVar.c;
        List list = fbhVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            fo3 a = ((gp3) list.get(i2)).a(gmbVar, plbVar, p41Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                x50Var = null;
                break;
            }
            gp3 gp3Var = (gp3) list.get(i);
            if (gp3Var instanceof x50) {
                x50Var = (x50) gp3Var;
                break;
            }
            i++;
        }
    }
}
