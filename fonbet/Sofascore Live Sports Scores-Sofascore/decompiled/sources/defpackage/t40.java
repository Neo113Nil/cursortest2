package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t40 extends qo2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t40(ViewGroup viewGroup, int i) {
        super(1);
        this.c = i;
        this.d = viewGroup;
    }

    @Override // defpackage.qo2
    public final x9l f(x9l x9lVar, List list) {
        int i = this.c;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                return ((rsk) viewGroup).l(x9lVar);
            default:
                w15 w15Var = (w15) viewGroup;
                if (w15Var.n) {
                    return x9lVar;
                }
                View childAt = w15Var.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, w15Var.getWidth() - childAt.getRight());
                int max4 = Math.max(0, w15Var.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? x9lVar : x9lVar.a.r(max, max2, max3, max4);
        }
    }

    @Override // defpackage.qo2
    public final c0l g(d9l d9lVar, c0l c0lVar) {
        int i = this.c;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                z3a z3aVar = (z3a) ((rsk) viewGroup).z.F.d;
                if (!z3aVar.S.n) {
                    return c0lVar;
                }
                long L = s6a.L(z3aVar.P(0L));
                int i2 = (int) (L >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (L & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long e = o6a.y(z3aVar).e();
                int i4 = (int) (e >> 32);
                int i5 = (int) (e & 4294967295L);
                long j = z3aVar.c;
                long L2 = s6a.L(z3aVar.P((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i6 = i4 - ((int) (L2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (L2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? c0lVar : new c0l(2, b50.k((u4a) c0lVar.b, i2, i3, i6, i8), b50.k((u4a) c0lVar.c, i2, i3, i6, i8));
            default:
                w15 w15Var = (w15) viewGroup;
                if (w15Var.n) {
                    return c0lVar;
                }
                View childAt = w15Var.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, w15Var.getWidth() - childAt.getRight());
                int max4 = Math.max(0, w15Var.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return c0lVar;
                }
                u4a c = u4a.c(max, max2, max3, max4);
                int i9 = c.a;
                u4a u4aVar = (u4a) c0lVar.b;
                int i10 = c.b;
                int i11 = c.c;
                int i12 = c.d;
                return new c0l(2, x9l.e(u4aVar, i9, i10, i11, i12), x9l.e((u4a) c0lVar.c, i9, i10, i11, i12));
        }
    }
}
