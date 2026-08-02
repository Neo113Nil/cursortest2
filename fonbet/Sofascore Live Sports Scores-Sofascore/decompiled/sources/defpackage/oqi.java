package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oqi extends qo2 {
    public final HashMap c;
    public final /* synthetic */ pqi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqi(pqi pqiVar) {
        super(0);
        this.d = pqiVar;
        this.c = new HashMap();
    }

    @Override // defpackage.qo2
    public final void d(d9l d9lVar) {
        ArrayList arrayList = this.d.b;
        if ((d9lVar.a.d() & 519) != 0) {
            this.c.remove(d9lVar);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vef vefVar = (vef) arrayList.get(size);
                int i = vefVar.e;
                boolean z = i > 0;
                int i2 = i - 1;
                vefVar.e = i2;
                if (z && i2 == 0) {
                    vefVar.c();
                }
            }
        }
    }

    @Override // defpackage.qo2
    public final void e(d9l d9lVar) {
        ArrayList arrayList = this.d.b;
        if ((d9lVar.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vef) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.qo2
    public final x9l f(x9l x9lVar, List list) {
        ArrayList arrayList = this.d.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            d9l d9lVar = (d9l) list.get(size);
            Integer num = (Integer) this.c.get(d9lVar);
            if (num != null) {
                int intValue = num.intValue();
                float a = d9lVar.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        u4a b = u4a.b(x9lVar.a.i(519), x9lVar.a.i(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            vef vefVar = (vef) arrayList.get(size2);
            u4a u4aVar = vefVar.d;
            ArrayList arrayList2 = vefVar.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                d23 d23Var = (d23) arrayList2.get(size3);
                int i2 = d23Var.a;
                if ((i2 & i) != 0) {
                    uef uefVar = d23Var.b;
                    if (!uefVar.d) {
                        uefVar.d = true;
                        k1d k1dVar = uefVar.i;
                        if (k1dVar != null) {
                            ((View) k1dVar.c).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = u4aVar.a;
                        if (i3 > 0) {
                            d23Var.b(b.a / i3);
                        }
                        d23Var.a(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = u4aVar.b;
                        if (i4 > 0) {
                            d23Var.b(b.b / i4);
                        }
                        d23Var.a(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = u4aVar.c;
                        if (i5 > 0) {
                            d23Var.b(b.c / i5);
                        }
                        d23Var.a(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = u4aVar.d;
                        if (i6 > 0) {
                            d23Var.b(b.d / i6);
                        }
                        d23Var.a(rectF.bottom);
                    }
                }
            }
        }
        return x9lVar;
    }

    @Override // defpackage.qo2
    public final c0l g(d9l d9lVar, c0l c0lVar) {
        if ((d9lVar.a.d() & 519) != 0) {
            u4a u4aVar = (u4a) c0lVar.c;
            u4a u4aVar2 = (u4a) c0lVar.b;
            int i = u4aVar.a != u4aVar2.a ? 1 : 0;
            if (u4aVar.b != u4aVar2.b) {
                i |= 2;
            }
            if (u4aVar.c != u4aVar2.c) {
                i |= 4;
            }
            if (u4aVar.d != u4aVar2.d) {
                i |= 8;
            }
            this.c.put(d9lVar, Integer.valueOf(i));
        }
        return c0lVar;
    }
}
