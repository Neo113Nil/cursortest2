package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n54 extends hoi implements et8 {
    public /* synthetic */ k24 r;
    public /* synthetic */ boolean s;
    public /* synthetic */ boolean t;
    public final /* synthetic */ q54 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n54(q54 q54Var, rq3 rq3Var) {
        super(4, rq3Var);
        this.u = q54Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        n54 n54Var = new n54(this.u, (rq3) obj4);
        n54Var.r = (k24) obj;
        n54Var.s = booleanValue;
        n54Var.t = booleanValue2;
        return n54Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Context i;
        int i2;
        String string;
        Context i3;
        int i4;
        k24 k24Var = this.r;
        boolean z = this.s;
        boolean z2 = this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        w34 w34Var = k24Var.b;
        boolean z3 = w34Var.b == null;
        boolean z4 = w34Var instanceof u34;
        q54 q54Var = this.u;
        if (z4) {
            if (z3) {
                i3 = q54Var.i();
                i4 = R.string.crowdsourcing_add_card;
            } else {
                i3 = q54Var.i();
                i4 = R.string.crowdsourcing_edit_card;
            }
            string = i3.getString(i4);
        } else {
            if (!(w34Var instanceof v34)) {
                zzl.b();
                return null;
            }
            if (z3) {
                i = q54Var.i();
                i2 = R.string.crowdsourcing_add_goal;
            } else {
                i = q54Var.i();
                i2 = R.string.crowdsourcing_edit_goal;
            }
            string = i.getString(i2);
        }
        string.getClass();
        return new r54(string, z, z2, Boolean.valueOf(k24Var.b.c).equals(Boolean.TRUE));
    }
}
