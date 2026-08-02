package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.base.BaseActivity;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class i01 implements kpd {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ i01(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.kpd
    public final x9l L(View view, x9l x9lVar) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = BaseActivity.H;
                int i2 = x9lVar.a.i(519).d;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i2);
                    view2.setLayoutParams(marginLayoutParams);
                    break;
                }
            case 1:
                view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), view2.getPaddingEnd(), x9lVar.a.i(519).d);
                break;
            default:
                view.getClass();
                u4a i3 = x9lVar.a.i(647);
                i3.getClass();
                view2.setPadding(i3.a, i3.b, i3.c, i3.d);
                break;
        }
        return x9lVar;
    }
}
