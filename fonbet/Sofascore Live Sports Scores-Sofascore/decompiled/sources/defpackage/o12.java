package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.view.InformationView;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o12 extends g7 {
    public final String l;
    public final yzc m;
    public final mt5 n;
    public final k43 o;
    public final LayoutInflater p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o12(Context context, String str, yzc yzcVar, mt5 mt5Var, k43 k43Var) {
        super(context);
        context.getClass();
        str.getClass();
        yzcVar.getClass();
        this.l = str;
        this.m = yzcVar;
        this.n = mt5Var;
        this.o = k43Var;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.p = from;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        if (i == 2) {
            return dti.e(this.l);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewAttachedToWindow(u uVar) {
        HashMap hashMap;
        Integer num;
        int intValue;
        HashMap hashMap2;
        Integer num2;
        int intValue2;
        HashMap hashMap3;
        Integer num3;
        int intValue3;
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        super.onViewAttachedToWindow(p8Var);
        Object obj = this.i.get(p8Var.getBindingAdapterPosition());
        boolean z = obj instanceof m22;
        yzc yzcVar = this.m;
        if (z) {
            p12 a = p12.a(((am2) p8Var).itemView);
            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) a.g;
            hf9 hf9Var = (hf9) yzcVar.d();
            if (hf9Var == null || (hashMap3 = hf9Var.d) == null || (num3 = (Integer) hashMap3.get(((m22) obj).a)) == null || scrollInterceptorHorizontalScrollView.getScrollX() == (intValue3 = num3.intValue())) {
                return;
            }
            scrollInterceptorHorizontalScrollView.post(new pn0(a, intValue3, 2));
            return;
        }
        if (obj instanceof i22) {
            j22 a2 = j22.a(((dse) p8Var).itemView);
            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) a2.p;
            hf9 hf9Var2 = (hf9) yzcVar.d();
            if (hf9Var2 == null || (hashMap2 = hf9Var2.d) == null || (num2 = (Integer) hashMap2.get(((i22) obj).m.a)) == null || scrollInterceptorHorizontalScrollView2.getScrollX() == (intValue2 = num2.intValue())) {
                return;
            }
            scrollInterceptorHorizontalScrollView2.post(new pn0(a2, intValue2, 3));
            return;
        }
        if (obj instanceof zm1) {
            ez0 a3 = ez0.a(((cn1) p8Var).itemView);
            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView3 = (ScrollInterceptorHorizontalScrollView) a3.d;
            hf9 hf9Var3 = (hf9) yzcVar.d();
            if (hf9Var3 == null || (hashMap = hf9Var3.d) == null || (num = (Integer) hashMap.get(((zm1) obj).m.a)) == null || scrollInterceptorHorizontalScrollView3.getScrollX() == (intValue = num.intValue())) {
                return;
            }
            scrollInterceptorHorizontalScrollView3.post(new pn0(a3, intValue, 4));
        }
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 2);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof m22) {
            return 1;
        }
        if (obj instanceof i22) {
            return 2;
        }
        if (obj instanceof zm1) {
            return 3;
        }
        if (obj instanceof CustomizableDivider) {
            return 5;
        }
        if (obj instanceof ds1) {
            return 6;
        }
        if (obj instanceof j29) {
            return 7;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        String str = this.l;
        LayoutInflater layoutInflater = this.p;
        switch (i) {
            case 1:
                View inflate = layoutInflater.inflate(R.layout.box_score_category_item, viewGroup, false);
                inflate.getClass();
                str.getClass();
                return new am2(inflate, str.equals(Sports.VOLLEYBALL) ? 4 : 3, !str.equals(Sports.VOLLEYBALL), (str.equals(Sports.VOLLEYBALL) || str.equals(Sports.BASEBALL)) ? Integer.valueOf(R.string.legend) : null, this.m, this.o, new ox1(this, 9));
            case 2:
                View inflate2 = layoutInflater.inflate(R.layout.box_score_player_item, viewGroup, false);
                inflate2.getClass();
                str.getClass();
                return new dse(inflate2, str, this.i, str.equals(Sports.VOLLEYBALL) ? 4 : 3, this.m, new yj1(this, 15));
            case 3:
                View inflate3 = layoutInflater.inflate(R.layout.box_score_total_item, viewGroup, false);
                inflate3.getClass();
                return new cn1(inflate3, this.m);
            case 4:
                View inflate4 = layoutInflater.inflate(R.layout.box_score_baseball_additional_item, viewGroup, false);
                inflate4.getClass();
                r71 r71Var = new r71(0, inflate4);
                int i2 = R.id.stats_lower;
                if (((TextView) nq8.B(R.id.stats_lower, inflate4)) != null) {
                    i2 = R.id.stats_upper;
                    if (((TextView) nq8.B(R.id.stats_upper, inflate4)) != null) {
                        return r71Var;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i2)));
                return null;
            case 5:
                return new wh(new SofaDivider(this.b, null, 6));
            case 6:
                View inflate5 = layoutInflater.inflate(R.layout.lineups_rating_info_row, viewGroup, false);
                if (inflate5 != null) {
                    InformationView informationView = (InformationView) inflate5;
                    return new wh(new ed(informationView, 14, informationView));
                }
                yhk.s("rootView");
                return null;
            case 7:
                ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(layoutInflater, viewGroup).b;
                constraintLayout.getClass();
                return new wh(constraintLayout);
            default:
                ilg.c();
                return null;
        }
    }
}
