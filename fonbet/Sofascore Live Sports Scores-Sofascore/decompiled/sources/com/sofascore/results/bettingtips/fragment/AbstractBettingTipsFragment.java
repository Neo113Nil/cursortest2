package com.sofascore.results.bettingtips.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a1;
import defpackage.duf;
import defpackage.dv1;
import defpackage.eo8;
import defpackage.g7;
import defpackage.iz8;
import defpackage.j29;
import defpackage.krk;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.otk;
import defpackage.skd;
import defpackage.v2g;
import defpackage.v82;
import defpackage.x2g;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z0;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/results/bettingtips/fragment/AbstractBettingTipsFragment;", "T", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Leo8;", "Lskd;", "Lx2g;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractBettingTipsFragment<T> extends AbstractFragment<eo8> implements skd {
    public final otk m;
    public boolean n;
    public final j29 o = new j29(Integer.valueOf(R.drawable.check_back_later), null, Integer.valueOf(R.string.no_odds_available), 501);
    public final mqi p;

    public AbstractBettingTipsFragment() {
        int i = 0;
        this.m = new otk(duf.a.getOrCreateKotlinClass(dv1.class), new a1(this, i), new a1(this, 2), new a1(this, 1));
        this.p = ypa.b(new z0(this, i));
    }

    public final dv1 A() {
        return (dv1) this.m.getValue();
    }

    /* renamed from: B, reason: from getter */
    public j29 getO() {
        return this.o;
    }

    public final GambleRegulationFooterView C() {
        return (GambleRegulationFooterView) this.p.getValue();
    }

    public abstract void D();

    /* renamed from: E, reason: from getter */
    public boolean getN() {
        return this.n;
    }

    @Override // defpackage.skd
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void h(x2g x2gVar) {
        x2gVar.getClass();
        if (x2gVar instanceof v2g) {
            C().setVisibility(0);
            krk krkVar = this.l;
            krkVar.getClass();
            ((eo8) krkVar).c.setVisibility(8);
            H(((v2g) x2gVar).a);
            this.n = true;
        } else if (!getN()) {
            krk krkVar2 = this.l;
            krkVar2.getClass();
            ((eo8) krkVar2).c.setVisibility(0);
            C().setVisibility(8);
            G();
        }
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((eo8) krkVar3).e.setRefreshing(false);
    }

    public abstract void G();

    public abstract void H(Object obj);

    public void I() {
        this.n = false;
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_dropping_odds, (ViewGroup) null, false);
        int i = R.id.app_bar;
        if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
            i = R.id.empty_state;
            View B = nq8.B(R.id.empty_state, inflate);
            if (B != null) {
                v82 d = v82.d(B);
                i = R.id.empty_state_container;
                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.empty_state_container, inflate);
                if (frameLayout != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                        i = R.id.streaks_spinner;
                        ComposeView composeView = (ComposeView) nq8.B(R.id.streaks_spinner, inflate);
                        if (composeView != null) {
                            i = R.id.type_header_holder;
                            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.type_header_holder, inflate);
                            if (typeHeaderView != null) {
                                return new eo8(swipeRefreshLayout, d, frameLayout, recyclerView, swipeRefreshLayout, composeView, typeHeaderView);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public void s(View view, Bundle bundle) {
        D();
        krk krkVar = this.l;
        krkVar.getClass();
        l adapter = ((eo8) krkVar).d.getAdapter();
        g7 g7Var = adapter instanceof g7 ? (g7) adapter : null;
        if (g7Var != null) {
            View view2 = new View(getContext());
            view2.setLayoutParams(new ViewGroup.LayoutParams(1, 0));
            g7Var.p(g7Var.g.size(), view2);
        }
        Integer num = getO().a;
        if (num != null) {
            int intValue = num.intValue();
            krk krkVar2 = this.l;
            krkVar2.getClass();
            iz8.E(((eo8) krkVar2).b, requireContext().getDrawable(intValue));
        }
        Integer num2 = getO().b;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            krk krkVar3 = this.l;
            krkVar3.getClass();
            v82 v82Var = ((eo8) krkVar3).b;
            String string = getString(intValue2);
            string.getClass();
            iz8.G(v82Var, string);
        }
        Integer num3 = getO().c;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            krk krkVar4 = this.l;
            krkVar4.getClass();
            v82 v82Var2 = ((eo8) krkVar4).b;
            String string2 = getString(intValue3);
            string2.getClass();
            iz8.F(v82Var2, string2);
        }
    }
}
