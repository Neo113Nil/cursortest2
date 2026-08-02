package defpackage;

import android.widget.TextView;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hjk extends j8i {
    public final bu1 e;

    public hjk(bu1 bu1Var) {
        super(bu1Var);
        this.e = bu1Var;
    }

    @Override // defpackage.j8i, defpackage.p8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(int i, int i2, xlf xlfVar) {
        String str;
        xlfVar.getClass();
        super.b(i, i2, xlfVar);
        Double points = xlfVar.a.getPoints();
        if (points != null) {
            str = String.format(dla.d(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(points.doubleValue())}, 1));
        } else {
            str = null;
        }
        haa.N((TextView) this.e.k, str);
    }
}
