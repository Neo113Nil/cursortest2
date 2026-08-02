package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xt extends o8 {
    public final ed d;
    public final hp e;
    public final h8l f;
    public final gh5 g;
    public boolean h;
    public ut i;
    public Event j;
    public EventGraphResponse k;
    public EventGraphResponse l;
    public List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(Context context) {
        super(context, null, 0);
        context.getClass();
        int i = 0;
        View root = getRoot();
        int i2 = R.id.graphs_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.graphs_container, root);
        if (linearLayout != null) {
            i2 = R.id.tabs_view;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.tabs_view, root);
            if (typeHeaderView != null) {
                this.d = new ed(1, linearLayout, (LinearLayout) root, typeHeaderView);
                hp hpVar = new hp(context);
                this.e = hpVar;
                h8l h8lVar = new h8l(context);
                this.f = h8lVar;
                gh5 c = gh5.c(LayoutInflater.from(context).inflate(R.layout.legend_item_layout, (ViewGroup) null, false));
                View view = c.b;
                c.c.setVisibility(0);
                c.d.setText(context.getString(R.string.am_football_score_graph_description));
                this.g = c;
                this.h = true;
                this.m = km5.a;
                o8.d(this, 0, 7);
                setVisibility(8);
                linearLayout.addView(view);
                linearLayout.addView(hpVar);
                linearLayout.addView(h8lVar);
                view.getClass();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    throw null;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = ao2.s(48, context);
                view.setLayoutParams(layoutParams2);
                g5k g5kVar = new g5k(typeHeaderView);
                g5kVar.d = new vt(context, i);
                g5kVar.a();
                g5kVar.m = new wt(i, this, context);
                g5kVar.b();
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.american_football_graph_view;
    }

    public final void j(Event event, EventGraphResponse eventGraphResponse, EventGraphResponse eventGraphResponse2, List list) {
        SharedPreferences d;
        list.getClass();
        if (eventGraphResponse2 == null && eventGraphResponse == null) {
            setVisibility(8);
            return;
        }
        this.j = event;
        this.k = eventGraphResponse;
        this.l = eventGraphResponse2;
        this.m = list;
        setVisibility(0);
        xbb b = a.b();
        if (eventGraphResponse != null) {
            b.add(ut.c);
        }
        if (eventGraphResponse2 != null) {
            b.add(ut.d);
        }
        xbb a = a.a(b);
        if (this.h) {
            Context context = getContext();
            context.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            String string = sharedPreferences.getString("PREF_AM_FOOTBALL_DETAILS_GRAPH", "WIN_PROBABILITY_GRAPH");
            if (string == null) {
                string = "WIN_PROBABILITY_GRAPH";
            }
            ut.b.getClass();
            ut q = q1f.q(string);
            this.i = q;
            if (q == null) {
                Intrinsics.i("currentGraphType");
                throw null;
            }
            if (!a.contains(q)) {
                this.i = (ut) CollectionsKt.Y(a);
            }
            TypeHeaderView typeHeaderView = (TypeHeaderView) this.d.c;
            ArrayList arrayList = new ArrayList(k13.r(a, 10));
            ListIterator listIterator = a.listIterator(0);
            while (true) {
                hc9 hc9Var = (hc9) listIterator;
                if (!hc9Var.hasNext()) {
                    break;
                } else {
                    arrayList.add(((ut) hc9Var.next()).name());
                }
            }
            ut utVar = this.i;
            if (utVar == null) {
                Intrinsics.i("currentGraphType");
                throw null;
            }
            TypeHeaderView.z(typeHeaderView, arrayList, utVar.name(), 4);
        } else {
            TypeHeaderView typeHeaderView2 = (TypeHeaderView) this.d.c;
            ArrayList arrayList2 = new ArrayList(k13.r(a, 10));
            ListIterator listIterator2 = a.listIterator(0);
            while (true) {
                hc9 hc9Var2 = (hc9) listIterator2;
                if (!hc9Var2.hasNext()) {
                    break;
                } else {
                    arrayList2.add(((ut) hc9Var2.next()).name());
                }
            }
            TypeHeaderView.z(typeHeaderView2, arrayList2, null, 6);
        }
        l(event, eventGraphResponse, eventGraphResponse2, list);
        this.h = false;
    }

    public final void l(Event event, EventGraphResponse eventGraphResponse, EventGraphResponse eventGraphResponse2, List list) {
        ut utVar = this.i;
        if (utVar == null) {
            Intrinsics.i("currentGraphType");
            throw null;
        }
        int ordinal = utVar.ordinal();
        h8l h8lVar = this.f;
        hp hpVar = this.e;
        gh5 gh5Var = this.g;
        if (ordinal == 0) {
            LinearLayout linearLayout = gh5Var.b;
            linearLayout.getClass();
            linearLayout.setVisibility(8);
            hpVar.setVisibility(8);
            h8lVar.setVisibility(0);
            if (eventGraphResponse != null) {
                h8lVar.j(event, eventGraphResponse, list, true, false);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            zzl.b();
            return;
        }
        LinearLayout linearLayout2 = gh5Var.b;
        linearLayout2.getClass();
        linearLayout2.setVisibility(0);
        hpVar.setVisibility(0);
        h8lVar.setVisibility(8);
        if (eventGraphResponse2 != null) {
            hpVar.j(event, eventGraphResponse2, list, true, false);
        }
    }
}
