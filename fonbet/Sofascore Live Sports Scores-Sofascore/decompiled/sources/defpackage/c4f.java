package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sofascore.model.database.VoteType;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c4f extends h6b {
    public final z3f d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public yda i;
    public final joa j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4f(final int i, final int i2, final hx5 hx5Var, final jx5 jx5Var, final kx5 kx5Var, final Context context, final Integer num, final Integer num2, final Integer num3, final Integer num4) {
        super(context, null, 0);
        context.getClass();
        int i3 = 0;
        View root = getRoot();
        int i4 = R.id.predictions_view_pager;
        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.predictions_view_pager, root);
        if (viewPager2 != null) {
            i4 = R.id.tab_layout;
            TabLayout tabLayout = (TabLayout) nq8.B(R.id.tab_layout, root);
            if (tabLayout != null) {
                this.d = new z3f(i3, tabLayout, (LinearLayout) root, viewPager2);
                this.j = ypa.a(ysa.c, new Function0() { // from class: a4f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kx5 kx5Var2 = kx5Var;
                        Context context2 = context;
                        return new g4f(context2, i, i2, num, num2, num3, num4, jx5Var, hx5Var, new gme(11, kx5Var2, context2));
                    }
                });
                setVisibility(8);
                viewPager2.setUserInputEnabled(true);
                viewPager2.setOffscreenPageLimit(3);
                RecyclerView c = wrf.c(viewPager2);
                if (c != null) {
                    c.setNestedScrollingEnabled(false);
                }
                viewPager2.setAdapter(getPredictionsAdapter());
                new osi(tabLayout, viewPager2, new pvd(9)).a();
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i4)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g4f getPredictionsAdapter() {
        return (g4f) this.j.getValue();
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        this.i = xw3.L(wca.x(u6bVar.getLifecycle()), null, null, new gje(u6bVar, this, null, 8), 3);
    }

    @Override // defpackage.rq4
    public final void g(u6b u6bVar) {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        yda ydaVar = this.i;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.predictions_pager_layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (defpackage.nwb.b(r2, r0.q, r5, r4) != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(List list, VoteType voteType) {
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        w3f w3fVar = (w3f) CollectionsKt.Y(list);
        Context context = getContext();
        context.getClass();
        int i = w3fVar.q;
        String str = w3fVar.k;
        boolean z = w3fVar.j;
        if (nwb.a(context, i, z, str) == null) {
            Context context2 = getContext();
            context2.getClass();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((w3f) obj).b == y3f.e) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            list = arrayList;
        }
        z3f z3fVar = this.d;
        ((TabLayout) z3fVar.d).setVisibility(list.size() > 1 ? 0 : 8);
        getPredictionsAdapter().F(list);
        if (this.h) {
            return;
        }
        this.h = true;
        if (voteType != null) {
            int i2 = b4f.a[voteType.ordinal()];
            Integer num = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : 2 : 1 : 0;
            if (num != null) {
                Integer num2 = num.intValue() < list.size() ? num : null;
                if (num2 != null) {
                    ((ViewPager2) z3fVar.c).post(new pn0(this, num2.intValue(), 14));
                }
            }
        }
    }
}
