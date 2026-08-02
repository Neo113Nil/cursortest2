package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.e;
import com.sofascore.model.util.MonthWithYear;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zoc extends o8 {
    public final joa d;
    public final gg2 e;
    public final e1d f;
    public final e1d g;
    public Function1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoc(Context context) {
        super(context, null, 0);
        context.getClass();
        final int i = 0;
        this.d = ypa.a(ysa.c, new xxb(this, 4));
        final xoc xocVar = new xoc(this, 0);
        this.e = new gg2("MMM yyyy");
        this.f = e.f(km5.a);
        this.g = e.f(null);
        getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: yoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                xoc xocVar2 = xocVar;
                switch (i2) {
                    case 0:
                        xocVar2.invoke(view);
                        break;
                    default:
                        xocVar2.invoke(view);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().b.setOnClickListener(new View.OnClickListener() { // from class: yoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                xoc xocVar2 = xocVar;
                switch (i22) {
                    case 0:
                        xocVar2.invoke(view);
                        break;
                    default:
                        xocVar2.invoke(view);
                        break;
                }
            }
        });
        getBinding().d.setContent(new tc3(-314422387, new faa(this, 25), true));
    }

    private final apc getBinding() {
        return (apc) this.d.getValue();
    }

    private final List<MonthWithYear> getMonthsList() {
        return (List) ((eoh) this.f).getValue();
    }

    private final MonthWithYear getSelectedMonth() {
        return (MonthWithYear) ((eoh) this.g).getValue();
    }

    public static final Unit j(zoc zocVar, of3 of3Var, int i) {
        Object obj;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            List<MonthWithYear> monthsList = zocVar.getMonthsList();
            ArrayList arrayList = new ArrayList(k13.r(monthsList, 10));
            for (MonthWithYear monthWithYear : monthsList) {
                arrayList.add(new oxh(monthWithYear, zocVar.e.a(new fg2(monthWithYear.getYear(), monthWithYear.getMonth(), 0)), null, null, null, false, 252));
            }
            gv9 W = l6g.W(arrayList);
            Iterator<E> it = W.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((oxh) obj).a, zocVar.getSelectedMonth())) {
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean i2 = av8Var.i(zocVar);
            Object O = av8Var.O();
            if (i2 || O == nf3.a) {
                O = new xoc(zocVar, 1);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit n(zoc zocVar, View view) {
        view.getClass();
        MonthWithYear monthWithYear = zocVar.getMonthsList().get(llf.c(CollectionsKt.c0(zocVar.getMonthsList(), zocVar.getSelectedMonth()) + (view.equals(zocVar.getBinding().b) ? -1 : 1), 0, b.i(zocVar.getMonthsList())));
        zocVar.o(monthWithYear);
        zocVar.setSelectedMonth(monthWithYear);
        return Unit.a;
    }

    private final void setMonthsList(List<MonthWithYear> list) {
        ((eoh) this.f).setValue(list);
    }

    private final void setSelectedMonth(MonthWithYear monthWithYear) {
        ((eoh) this.g).setValue(monthWithYear);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_monthly_calendar_view;
    }

    public final void l(List list, Function1 function1) {
        function1.getClass();
        this.h = function1;
        setMonthsList(list);
        MonthWithYear monthWithYear = (MonthWithYear) CollectionsKt.firstOrNull(getMonthsList());
        if (monthWithYear != null) {
            o(monthWithYear);
        } else {
            monthWithYear = null;
        }
        setSelectedMonth(monthWithYear);
    }

    public final void o(MonthWithYear monthWithYear) {
        setSelectedMonth(monthWithYear);
        Function1 function1 = this.h;
        if (function1 != null) {
            function1.invoke(monthWithYear);
        }
        boolean z = getMonthsList().indexOf(monthWithYear) > 0;
        getBinding().b.setEnabled(z);
        getBinding().b.setAlpha(z ? 1.0f : 0.3f);
        boolean z2 = getMonthsList().indexOf(monthWithYear) < b.i(getMonthsList());
        getBinding().c.setEnabled(z2);
        getBinding().c.setAlpha(z2 ? 1.0f : 0.3f);
    }
}
