package com.sofascore.results.main.favorites;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.model.DateSection;
import com.sofascore.results.R;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.service.FavoriteWorker;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a52;
import defpackage.ad2;
import defpackage.ao2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.cd5;
import defpackage.cs7;
import defpackage.d17;
import defpackage.duf;
import defpackage.e52;
import defpackage.e6b;
import defpackage.fc6;
import defpackage.fdi;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.gl7;
import defpackage.go8;
import defpackage.hkg;
import defpackage.hpo;
import defpackage.is7;
import defpackage.joa;
import defpackage.jrh;
import defpackage.km5;
import defpackage.krk;
import defpackage.l07;
import defpackage.l27;
import defpackage.ltd;
import defpackage.md4;
import defpackage.mha;
import defpackage.mqi;
import defpackage.nf6;
import defpackage.nh3;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qs7;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.sr7;
import defpackage.tr7;
import defpackage.u6b;
import defpackage.ur1;
import defpackage.us7;
import defpackage.vs7;
import defpackage.vxd;
import defpackage.wca;
import defpackage.wr7;
import defpackage.x42;
import defpackage.xr7;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.yr7;
import defpackage.ysa;
import defpackage.z07;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zqb;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/favorites/FavoriteEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lgo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteEventsFragment extends Hilt_FavoriteEventsFragment<go8> {
    public int A;
    public int B;
    public int C;
    public final otk r;
    public final otk s;
    public final mqi t;
    public cs7 u;
    public final mqi v;
    public final mqi w;
    public final xr7 x;
    public boolean y;
    public boolean z;

    public FavoriteEventsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new yr7(this, 0), new yr7(this, 2), new yr7(this, 1));
        joa a = ypa.a(ysa.c, new l07(new yr7(this, 3), 29));
        this.s = new otk(fufVar.getOrCreateKotlinClass(is7.class), new l27(a, 25), new z07(16, this, a), new l27(a, 26));
        this.t = ypa.b(new tr7(this, 3));
        this.v = ypa.b(new tr7(this, 4));
        this.w = ypa.b(new tr7(this, 5));
        this.x = new xr7(this);
        this.y = true;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    public static void F(vs7 vs7Var, List list) {
        List L0 = CollectionsKt.L0(list, vs7Var.getItemCount() == 0 ? 3 : vs7Var.getItemCount() + (-1) == list.size() ? vs7Var.getItemCount() - 1 : vs7Var.getItemCount() - 2);
        if (L0.isEmpty()) {
            L0 = null;
        }
        List x0 = L0 != null ? L0.size() < list.size() ? CollectionsKt.x0(L0, new us7()) : L0 : null;
        if (x0 == null) {
            x0 = km5.a;
        }
        vs7Var.F(x0);
    }

    public final vs7 C() {
        return (vs7) this.w.getValue();
    }

    public final vs7 D() {
        return (vs7) this.v.getValue();
    }

    public final is7 E() {
        return (is7) this.s.getValue();
    }

    public final void G() {
        krk krkVar = this.l;
        krkVar.getClass();
        t(((go8) krkVar).c, new sr7(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[EDGE_INSN: B:17:0x0072->B:18:0x0072 BREAK  A[LOOP:0: B:2:0x000b->B:24:0x0070], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(List list, boolean z) {
        boolean z2;
        this.B = -1;
        this.A = -1;
        int i = 0;
        for (Object obj : list) {
            if (obj instanceof DateSection) {
                long timestamp = ((DateSection) obj).getTimestamp();
                if (fc6.B(fc6.t(Instant.ofEpochSecond(timestamp)))) {
                    this.A = i;
                    this.C = i;
                    i++;
                    int size = list.size();
                    int i2 = i;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (list.get(i2) instanceof DateSection) {
                            this.B = i2;
                            break;
                        }
                        i2++;
                    }
                } else {
                    ZoneId systemDefault = ZoneId.systemDefault();
                    if (Instant.ofEpochSecond(timestamp).atZone(systemDefault).toLocalDate().isBefore(LocalDate.now(systemDefault))) {
                        this.C = 0;
                        z2 = false;
                        if (!z2) {
                            break;
                        }
                    } else {
                        this.A = -1;
                        this.C = i;
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            i++;
        }
        if (z) {
            G();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_favorite_events, (ViewGroup) null, false);
        int i = R.id.back_to_live_button;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.back_to_live_button, inflate);
        if (extendedFloatingActionButton != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                i = R.id.sport_selector;
                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.sport_selector, inflate);
                if (typeHeaderView != null) {
                    return new go8(swipeRefreshLayout, extendedFloatingActionButton, recyclerView, swipeRefreshLayout, typeHeaderView);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        krk krkVar = this.l;
        krkVar.getClass();
        ((go8) krkVar).c.removeOnScrollListener(this.x);
        super.onDestroyView();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        krk krkVar = this.l;
        krkVar.getClass();
        ((go8) krkVar).d.setEnabled(false);
        super.onPause();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        MenuItem menuItem;
        super.onResume();
        List list = (List) E().q.d();
        this.i.e = list != null ? Integer.valueOf(list.size()) : null;
        krk krkVar = this.l;
        krkVar.getClass();
        ((go8) krkVar).d.setEnabled(true);
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity == null || (menuItem = mainActivity.Q) == null) {
            return;
        }
        menuItem.setVisible(true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FavoriteEditEventsNestedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((go8) krkVar).d;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        int i = 6;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        int i2 = 1;
        ((go8) krkVar2).b.y(1);
        View findViewById = requireActivity().findViewById(R.id.bottom_tabs_view);
        int i3 = 0;
        if (findViewById != null) {
            t(findViewById, new sr7(this, i3));
        } else {
            krk krkVar3 = this.l;
            krkVar3.getClass();
            hkg.s(24, ((go8) krkVar3).b);
        }
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new wr7(viewLifecycleOwner, (b1d) obj, this, null, this, 1), 3);
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(x42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new wr7(viewLifecycleOwner2, (b1d) obj2, this, null, this, 2), 3);
        Context requireContext = requireContext();
        requireContext.getClass();
        this.u = new cs7(requireContext);
        int color = requireContext().getColor(R.color.surface_0);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((go8) krkVar4).e.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color, color, 0}));
        krk krkVar5 = this.l;
        krkVar5.getClass();
        g5k g5kVar = new g5k(((go8) krkVar5).e);
        jrh jrhVar = jrh.m;
        jrhVar.getClass();
        g5kVar.e = jrhVar;
        g5kVar.i = new gl7(7);
        g5kVar.m = new ur1(this, i);
        g5kVar.b();
        krk krkVar6 = this.l;
        krkVar6.getClass();
        RecyclerView recyclerView = ((go8) krkVar6).c;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        z8e.b0(recyclerView, requireContext2, false, false, null, 30);
        qs7 qs7Var = (qs7) this.t.getValue();
        cs7 cs7Var = this.u;
        if (cs7Var == null) {
            Intrinsics.i("eventsAdapter");
            throw null;
        }
        int i4 = 2;
        recyclerView.setAdapter(new nh3(new l[]{qs7Var, cs7Var, D(), C()}));
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(52, requireContext3), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        hkg.t(48, recyclerView);
        recyclerView.addOnScrollListener(this.x);
        E().q.e(getViewLifecycleOwner(), new z1(13, new sr7(this, i2)));
        krk krkVar7 = this.l;
        krkVar7.getClass();
        ((go8) krkVar7).b.setOnClickListener(new cd5(this, 7));
        e6b e6bVar2 = e6b.a;
        u6b viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(e52.class);
        Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(viewLifecycleOwner3.getLifecycle()), null, null, new wr7(viewLifecycleOwner3, (b1d) obj3, this, null, this, 0), 3);
        E().p.e(getViewLifecycleOwner(), new z1(13, new sr7(this, i4)));
        u6b viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        xw3.L(wca.x(viewLifecycleOwner4.getLifecycle()), null, null, new d17(this, rq3Var, 14), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        Context applicationContext;
        fdi fdiVar = E().l;
        Boolean bool = Boolean.TRUE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        n();
        FragmentActivity activity = getActivity();
        if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
            return;
        }
        Pair[] pairArr = {new Pair("ACTION", "REFRESH_FAVORITES")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        vxd.h(applicationContext).b("FavoriteWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(FavoriteWorker.class, l).a());
    }
}
