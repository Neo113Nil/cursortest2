package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j extends e implements i {
    public e[] mWidgets = new e[4];

    /* renamed from: B0, reason: collision with root package name */
    public int f18078B0 = 0;

    @Override // androidx.constraintlayout.core.widgets.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f18078B0 + 1;
        e[] eVarArr = this.mWidgets;
        if (i10 > eVarArr.length) {
            this.mWidgets = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.mWidgets;
        int i11 = this.f18078B0;
        eVarArr2[i11] = eVar;
        this.f18078B0 = i11 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void b() {
        this.f18078B0 = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void c(f fVar) {
    }

    public void s1(ArrayList arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f18078B0; i11++) {
            oVar.a(this.mWidgets[i11]);
        }
        for (int i12 = 0; i12 < this.f18078B0; i12++) {
            androidx.constraintlayout.core.widgets.analyzer.i.a(this.mWidgets[i12], i10, arrayList, oVar);
        }
    }

    public int t1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f18078B0; i13++) {
            e eVar = this.mWidgets[i13];
            if (i10 == 0 && (i12 = eVar.f17996y0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f17998z0) != -1) {
                return i11;
            }
        }
        return -1;
    }
}
