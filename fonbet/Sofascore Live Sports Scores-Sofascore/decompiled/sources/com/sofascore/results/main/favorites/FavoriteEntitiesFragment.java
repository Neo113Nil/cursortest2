package com.sofascore.results.main.favorites;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.ao2;
import defpackage.bn1;
import defpackage.ct7;
import defpackage.duf;
import defpackage.fdi;
import defpackage.fu3;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.gl7;
import defpackage.hkg;
import defpackage.ho8;
import defpackage.joa;
import defpackage.jrh;
import defpackage.krk;
import defpackage.l07;
import defpackage.l27;
import defpackage.mqi;
import defpackage.nh3;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qa7;
import defpackage.qs7;
import defpackage.rq3;
import defpackage.rr7;
import defpackage.uq7;
import defpackage.ur1;
import defpackage.vq7;
import defpackage.vs7;
import defpackage.wq7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zqb;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/favorites/FavoriteEntitiesFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lho8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteEntitiesFragment extends Hilt_FavoriteEntitiesFragment<ho8> {
    public final mqi r = ypa.b(new uq7(this, 0));
    public final mqi s = ypa.b(new uq7(this, 1));
    public final otk t;
    public final otk u;
    public boolean v;
    public final mqi w;

    public FavoriteEntitiesFragment() {
        fuf fufVar = duf.a;
        this.t = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new wq7(this, 0), new wq7(this, 2), new wq7(this, 1));
        joa a = ypa.a(ysa.c, new l07(new wq7(this, 3), 28));
        this.u = new otk(fufVar.getOrCreateKotlinClass(rr7.class), new l27(a, 23), new z07(15, this, a), new l27(a, 24));
        this.w = ypa.b(new uq7(this, 2));
    }

    public final rr7 C() {
        return (rr7) this.u.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_favorites_layout, (ViewGroup) null, false);
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
        if (recyclerView != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.sport_selector, inflate);
            if (typeHeaderView != null) {
                return new ho8(swipeRefreshLayout, recyclerView, swipeRefreshLayout, typeHeaderView);
            }
            i = R.id.sport_selector;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        MenuItem menuItem;
        List list;
        super.onResume();
        fu3 fu3Var = C().p;
        this.i.e = (fu3Var == null || (list = (List) fu3Var.d()) == null) ? null : Integer.valueOf(list.size());
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity == null || (menuItem = mainActivity.Q) == null) {
            return;
        }
        menuItem.setVisible(false);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        mqi mqiVar = this.w;
        int ordinal = ((ct7) mqiVar.getValue()).ordinal();
        if (ordinal == 1) {
            return "FavoriteEditTeamsNestedTab";
        }
        if (ordinal == 2) {
            return "FavoriteEditCompetitionsNestedTab";
        }
        if (ordinal == 3) {
            return "FavoriteEditPlayersNestedTab";
        }
        zzl.i((ct7) mqiVar.getValue(), "Illegal tabType=");
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((ho8) krkVar).c;
        swipeRefreshLayout.getClass();
        rq3 rq3Var = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        l();
        getContext();
        final int i = 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.g = new vq7(this);
        int color = requireContext().getColor(R.color.surface_0);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        final int i2 = 0;
        ((ho8) krkVar2).d.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{color, color, color, 0}));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((ho8) krkVar3).d.setVisibility(8);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        g5k g5kVar = new g5k(((ho8) krkVar4).d);
        jrh jrhVar = jrh.m;
        jrhVar.getClass();
        g5kVar.e = jrhVar;
        g5kVar.i = new gl7(6);
        g5kVar.d = new Function1(this) { // from class: tq7
            public final /* synthetic */ FavoriteEntitiesFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
            
                if (r2.size() > 1) goto L13;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                boolean z;
                int i3 = i2;
                FavoriteEntitiesFragment favoriteEntitiesFragment = this.b;
                switch (i3) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        if (!Sports.INSTANCE.getEntries().contains(str)) {
                            String string = favoriteEntitiesFragment.getString(R.string.all_sports);
                            string.getClass();
                            break;
                        } else {
                            Context requireContext = favoriteEntitiesFragment.requireContext();
                            requireContext.getClass();
                            break;
                        }
                    case 1:
                        ft7 ft7Var = (ft7) obj;
                        if (!ft7Var.a.isEmpty() || !favoriteEntitiesFragment.v) {
                            ((qs7) favoriteEntitiesFragment.r.getValue()).G((String) favoriteEntitiesFragment.C().m.getValue(), ft7Var.a);
                            ((vs7) favoriteEntitiesFragment.s.getValue()).F(ft7Var.b);
                            break;
                        } else {
                            favoriteEntitiesFragment.v = false;
                            break;
                        }
                    default:
                        List list = (List) obj;
                        List c = a.c("");
                        list.getClass();
                        ArrayList w0 = CollectionsKt.w0(list, c);
                        su suVar = favoriteEntitiesFragment.i;
                        if (suVar.e == null) {
                            suVar.e = Integer.valueOf(list.size());
                        }
                        int size = w0.size();
                        krk krkVar5 = favoriteEntitiesFragment.l;
                        krkVar5.getClass();
                        if (size < ((ho8) krkVar5).d.getHeaderTypes().size()) {
                            z = true;
                            break;
                        }
                        z = false;
                        favoriteEntitiesFragment.v = z;
                        rr7 C = favoriteEntitiesFragment.C();
                        iz2 z2 = un0.z(C);
                        hs4 hs4Var = z45.a;
                        xw3.L(z2, hq4.c, null, new l0(C, w0, null, 23), 2);
                        int size2 = w0.size();
                        krk krkVar6 = favoriteEntitiesFragment.l;
                        if (size2 > 2) {
                            krkVar6.getClass();
                            ((ho8) krkVar6).d.setVisibility(0);
                            krk krkVar7 = favoriteEntitiesFragment.l;
                            krkVar7.getClass();
                            RecyclerView recyclerView = ((ho8) krkVar7).b;
                            Context requireContext2 = favoriteEntitiesFragment.requireContext();
                            requireContext2.getClass();
                            int s = ao2.s(4, requireContext2);
                            Context requireContext3 = favoriteEntitiesFragment.requireContext();
                            requireContext3.getClass();
                            int s2 = ao2.s(52, requireContext3);
                            if (recyclerView.computeVerticalScrollOffset() == 0) {
                                favoriteEntitiesFragment.t(recyclerView, new w47(20, recyclerView, favoriteEntitiesFragment));
                            }
                            recyclerView.setPaddingRelative(s, s2, s, recyclerView.getPaddingBottom());
                        } else {
                            krkVar6.getClass();
                            ((ho8) krkVar6).d.setVisibility(8);
                            fdi fdiVar = favoriteEntitiesFragment.C().m;
                            fdiVar.getClass();
                            fdiVar.m(null, "");
                            krk krkVar8 = favoriteEntitiesFragment.l;
                            krkVar8.getClass();
                            RecyclerView recyclerView2 = ((ho8) krkVar8).b;
                            Context requireContext4 = favoriteEntitiesFragment.requireContext();
                            requireContext4.getClass();
                            int s3 = ao2.s(4, requireContext4);
                            recyclerView2.setPaddingRelative(s3, s3, s3, recyclerView2.getPaddingBottom());
                        }
                        break;
                }
                return Unit.a;
            }
        };
        g5kVar.m = new ur1(this, 5);
        g5kVar.b();
        krk krkVar5 = this.l;
        krkVar5.getClass();
        RecyclerView recyclerView = ((ho8) krkVar5).b;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int s = ao2.s(4, requireContext2);
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        recyclerView.setPaddingRelative(s, ao2.s(52, requireContext3), s, recyclerView.getPaddingBottom());
        hkg.t(48, recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        final int i3 = 1;
        recyclerView.setAdapter(new nh3(new l[]{(qs7) this.r.getValue(), (vs7) this.s.getValue()}));
        recyclerView.setOnScrollChangeListener(new bn1(i3, this, recyclerView));
        C().o.e(getViewLifecycleOwner(), new z1(12, new Function1(this) { // from class: tq7
            public final /* synthetic */ FavoriteEntitiesFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
            
                if (r2.size() > 1) goto L13;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                boolean z;
                int i32 = i3;
                FavoriteEntitiesFragment favoriteEntitiesFragment = this.b;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        if (!Sports.INSTANCE.getEntries().contains(str)) {
                            String string = favoriteEntitiesFragment.getString(R.string.all_sports);
                            string.getClass();
                            break;
                        } else {
                            Context requireContext4 = favoriteEntitiesFragment.requireContext();
                            requireContext4.getClass();
                            break;
                        }
                    case 1:
                        ft7 ft7Var = (ft7) obj;
                        if (!ft7Var.a.isEmpty() || !favoriteEntitiesFragment.v) {
                            ((qs7) favoriteEntitiesFragment.r.getValue()).G((String) favoriteEntitiesFragment.C().m.getValue(), ft7Var.a);
                            ((vs7) favoriteEntitiesFragment.s.getValue()).F(ft7Var.b);
                            break;
                        } else {
                            favoriteEntitiesFragment.v = false;
                            break;
                        }
                    default:
                        List list = (List) obj;
                        List c = a.c("");
                        list.getClass();
                        ArrayList w0 = CollectionsKt.w0(list, c);
                        su suVar = favoriteEntitiesFragment.i;
                        if (suVar.e == null) {
                            suVar.e = Integer.valueOf(list.size());
                        }
                        int size = w0.size();
                        krk krkVar52 = favoriteEntitiesFragment.l;
                        krkVar52.getClass();
                        if (size < ((ho8) krkVar52).d.getHeaderTypes().size()) {
                            z = true;
                            break;
                        }
                        z = false;
                        favoriteEntitiesFragment.v = z;
                        rr7 C = favoriteEntitiesFragment.C();
                        iz2 z2 = un0.z(C);
                        hs4 hs4Var = z45.a;
                        xw3.L(z2, hq4.c, null, new l0(C, w0, null, 23), 2);
                        int size2 = w0.size();
                        krk krkVar6 = favoriteEntitiesFragment.l;
                        if (size2 > 2) {
                            krkVar6.getClass();
                            ((ho8) krkVar6).d.setVisibility(0);
                            krk krkVar7 = favoriteEntitiesFragment.l;
                            krkVar7.getClass();
                            RecyclerView recyclerView2 = ((ho8) krkVar7).b;
                            Context requireContext22 = favoriteEntitiesFragment.requireContext();
                            requireContext22.getClass();
                            int s2 = ao2.s(4, requireContext22);
                            Context requireContext32 = favoriteEntitiesFragment.requireContext();
                            requireContext32.getClass();
                            int s22 = ao2.s(52, requireContext32);
                            if (recyclerView2.computeVerticalScrollOffset() == 0) {
                                favoriteEntitiesFragment.t(recyclerView2, new w47(20, recyclerView2, favoriteEntitiesFragment));
                            }
                            recyclerView2.setPaddingRelative(s2, s22, s2, recyclerView2.getPaddingBottom());
                        } else {
                            krkVar6.getClass();
                            ((ho8) krkVar6).d.setVisibility(8);
                            fdi fdiVar = favoriteEntitiesFragment.C().m;
                            fdiVar.getClass();
                            fdiVar.m(null, "");
                            krk krkVar8 = favoriteEntitiesFragment.l;
                            krkVar8.getClass();
                            RecyclerView recyclerView22 = ((ho8) krkVar8).b;
                            Context requireContext42 = favoriteEntitiesFragment.requireContext();
                            requireContext42.getClass();
                            int s3 = ao2.s(4, requireContext42);
                            recyclerView22.setPaddingRelative(s3, s3, s3, recyclerView22.getPaddingBottom());
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        fu3 fu3Var = C().p;
        if (fu3Var != null) {
            fu3Var.e(getViewLifecycleOwner(), new z1(12, new Function1(this) { // from class: tq7
                public final /* synthetic */ FavoriteEntitiesFragment b;

                {
                    this.b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
                
                    if (r2.size() > 1) goto L13;
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    boolean z;
                    int i32 = i;
                    FavoriteEntitiesFragment favoriteEntitiesFragment = this.b;
                    switch (i32) {
                        case 0:
                            String str = (String) obj;
                            str.getClass();
                            if (!Sports.INSTANCE.getEntries().contains(str)) {
                                String string = favoriteEntitiesFragment.getString(R.string.all_sports);
                                string.getClass();
                                break;
                            } else {
                                Context requireContext4 = favoriteEntitiesFragment.requireContext();
                                requireContext4.getClass();
                                break;
                            }
                        case 1:
                            ft7 ft7Var = (ft7) obj;
                            if (!ft7Var.a.isEmpty() || !favoriteEntitiesFragment.v) {
                                ((qs7) favoriteEntitiesFragment.r.getValue()).G((String) favoriteEntitiesFragment.C().m.getValue(), ft7Var.a);
                                ((vs7) favoriteEntitiesFragment.s.getValue()).F(ft7Var.b);
                                break;
                            } else {
                                favoriteEntitiesFragment.v = false;
                                break;
                            }
                        default:
                            List list = (List) obj;
                            List c = a.c("");
                            list.getClass();
                            ArrayList w0 = CollectionsKt.w0(list, c);
                            su suVar = favoriteEntitiesFragment.i;
                            if (suVar.e == null) {
                                suVar.e = Integer.valueOf(list.size());
                            }
                            int size = w0.size();
                            krk krkVar52 = favoriteEntitiesFragment.l;
                            krkVar52.getClass();
                            if (size < ((ho8) krkVar52).d.getHeaderTypes().size()) {
                                z = true;
                                break;
                            }
                            z = false;
                            favoriteEntitiesFragment.v = z;
                            rr7 C = favoriteEntitiesFragment.C();
                            iz2 z2 = un0.z(C);
                            hs4 hs4Var = z45.a;
                            xw3.L(z2, hq4.c, null, new l0(C, w0, null, 23), 2);
                            int size2 = w0.size();
                            krk krkVar6 = favoriteEntitiesFragment.l;
                            if (size2 > 2) {
                                krkVar6.getClass();
                                ((ho8) krkVar6).d.setVisibility(0);
                                krk krkVar7 = favoriteEntitiesFragment.l;
                                krkVar7.getClass();
                                RecyclerView recyclerView2 = ((ho8) krkVar7).b;
                                Context requireContext22 = favoriteEntitiesFragment.requireContext();
                                requireContext22.getClass();
                                int s2 = ao2.s(4, requireContext22);
                                Context requireContext32 = favoriteEntitiesFragment.requireContext();
                                requireContext32.getClass();
                                int s22 = ao2.s(52, requireContext32);
                                if (recyclerView2.computeVerticalScrollOffset() == 0) {
                                    favoriteEntitiesFragment.t(recyclerView2, new w47(20, recyclerView2, favoriteEntitiesFragment));
                                }
                                recyclerView2.setPaddingRelative(s2, s22, s2, recyclerView2.getPaddingBottom());
                            } else {
                                krkVar6.getClass();
                                ((ho8) krkVar6).d.setVisibility(8);
                                fdi fdiVar = favoriteEntitiesFragment.C().m;
                                fdiVar.getClass();
                                fdiVar.m(null, "");
                                krk krkVar8 = favoriteEntitiesFragment.l;
                                krkVar8.getClass();
                                RecyclerView recyclerView22 = ((ho8) krkVar8).b;
                                Context requireContext42 = favoriteEntitiesFragment.requireContext();
                                requireContext42.getClass();
                                int s3 = ao2.s(4, requireContext42);
                                recyclerView22.setPaddingRelative(s3, s3, s3, recyclerView22.getPaddingBottom());
                            }
                            break;
                    }
                    return Unit.a;
                }
            }));
        }
        z8e.y(this, C().h, new qa7(this, rq3Var, 11));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        fdi fdiVar = C().n;
        Boolean bool = Boolean.TRUE;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        n();
    }
}
