package s0;

import android.graphics.RectF;
import android.view.View;
import androidx.core.view.i1;
import androidx.core.view.j1;
import androidx.core.view.k2;
import androidx.core.view.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22610a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22611b;

    public f(g gVar) {
        this.f22611b = gVar;
    }

    @Override // androidx.core.view.j1
    public final void onEnd(s1 s1Var) {
        ArrayList arrayList = this.f22611b.f22613b;
        if ((s1Var.f1391a.d() & 519) != 0) {
            this.f22610a.remove(s1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i5 = cVar.f22603e;
                boolean z5 = i5 > 0;
                int i10 = i5 - 1;
                cVar.f22603e = i10;
                if (z5 && i10 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // androidx.core.view.j1
    public final void onPrepare(s1 s1Var) {
        ArrayList arrayList = this.f22611b.f22613b;
        if ((s1Var.f1391a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f22603e++;
            }
        }
    }

    @Override // androidx.core.view.j1
    public final k2 onProgress(k2 k2Var, List list) {
        ArrayList arrayList = this.f22611b.f22613b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i5 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            s1 s1Var = (s1) list.get(size);
            Integer num = (Integer) this.f22610a.get(s1Var);
            if (num != null) {
                int intValue = num.intValue();
                float a7 = s1Var.f1391a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a7;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a7;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a7;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a7;
                }
                i5 |= intValue;
            }
        }
        g0.d b10 = g0.d.b(k2Var.f1349a.f(519), k2Var.f1349a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            g0.d dVar = cVar.f22602d;
            ArrayList arrayList2 = cVar.f22599a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i10 = aVar.f22582a;
                if ((i10 & i5) != 0) {
                    b bVar = aVar.f22583b;
                    if (!bVar.f22593d) {
                        bVar.f22593d = true;
                        io.sentry.util.network.b bVar2 = bVar.f22598i;
                        if (bVar2 != null) {
                            ((View) bVar2.f17177c).setVisibility(0);
                        }
                    }
                    if (i10 == 1) {
                        int i11 = dVar.f9676a;
                        if (i11 > 0) {
                            aVar.b(b10.f9676a / i11);
                        }
                        aVar.a(rectF.left);
                    } else if (i10 == 2) {
                        int i12 = dVar.f9677b;
                        if (i12 > 0) {
                            aVar.b(b10.f9677b / i12);
                        }
                        aVar.a(rectF.top);
                    } else if (i10 == 4) {
                        int i13 = dVar.f9678c;
                        if (i13 > 0) {
                            aVar.b(b10.f9678c / i13);
                        }
                        aVar.a(rectF.right);
                    } else if (i10 == 8) {
                        int i14 = dVar.f9679d;
                        if (i14 > 0) {
                            aVar.b(b10.f9679d / i14);
                        }
                        aVar.a(rectF.bottom);
                    }
                }
            }
        }
        return k2Var;
    }

    @Override // androidx.core.view.j1
    public final i1 onStart(s1 s1Var, i1 i1Var) {
        if ((s1Var.f1391a.d() & 519) != 0) {
            g0.d dVar = i1Var.f1337b;
            g0.d dVar2 = i1Var.f1336a;
            int i5 = dVar.f9676a != dVar2.f9676a ? 1 : 0;
            if (dVar.f9677b != dVar2.f9677b) {
                i5 |= 2;
            }
            if (dVar.f9678c != dVar2.f9678c) {
                i5 |= 4;
            }
            if (dVar.f9679d != dVar2.f9679d) {
                i5 |= 8;
            }
            this.f22610a.put(s1Var, Integer.valueOf(i5));
        }
        return i1Var;
    }
}
