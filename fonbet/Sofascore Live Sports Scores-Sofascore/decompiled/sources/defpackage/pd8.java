package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pd8 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ qd8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd8(qd8 qd8Var, int i) {
        super(1);
        this.i = i;
        this.j = qd8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        qd8 qd8Var = this.j;
        switch (i) {
            case 0:
                fj2 fj2Var = (fj2) obj;
                View q = ok3.q(qd8Var);
                if (!q.isFocused() && !q.hasFocus()) {
                    wd8 focusOwner = ((xy) c6o.d0(qd8Var)).getFocusOwner();
                    View N = pco.N(qd8Var);
                    Integer c = td8.c(fj2Var.a);
                    int[] iArr = new int[2];
                    N.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    q.getLocationOnScreen(iArr2);
                    ne8 R = l98.R(((yd8) focusOwner).c);
                    Rect rect = null;
                    oqf S = R != null ? l98.S(R) : null;
                    if (S != null) {
                        int i2 = (int) S.a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) S.b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) S.c) + i3) - i4, (((int) S.d) + i6) - i7);
                    }
                    if (!td8.b(q, c, rect)) {
                        fj2Var.b = true;
                    }
                }
                break;
            default:
                ok3.q(qd8Var);
                break;
        }
        return Unit.a;
    }
}
