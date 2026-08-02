package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.base.BaseActivity;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class j01 implements kpd, qdb, pdb, lqi {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j01(ji3 ji3Var, jv0 jv0Var, int i) {
        this.a = 3;
        this.c = ji3Var;
        this.d = jv0Var;
        this.b = i;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        View view2 = (View) this.c;
        BaseActivity baseActivity = (BaseActivity) this.d;
        KProperty[] kPropertyArr = BaseActivity.H;
        int i = x9lVar.a.i(519).b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ao2.s(this.b, baseActivity) + i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view2.setLayoutParams(marginLayoutParams);
        return x9lVar;
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i2 = this.b;
        switch (i) {
            case 1:
                wke wkeVar = (wke) obj;
                int i3 = vg6.r0;
                wkeVar.onPositionDiscontinuity(i2);
                wkeVar.onPositionDiscontinuity((yke) obj3, (yke) obj2, i2);
                break;
            default:
                ((vke) obj).p((xke) obj3, (xke) obj2, i2);
                break;
        }
    }

    @Override // defpackage.lqi
    public Object v() {
        ji3 ji3Var = (ji3) this.c;
        ((sx2) ji3Var.e).J((jv0) this.d, this.b + 1, false);
        return null;
    }

    public /* synthetic */ j01(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ j01(View view, int i, BaseActivity baseActivity) {
        this.a = 0;
        this.c = view;
        this.b = i;
        this.d = baseActivity;
    }
}
