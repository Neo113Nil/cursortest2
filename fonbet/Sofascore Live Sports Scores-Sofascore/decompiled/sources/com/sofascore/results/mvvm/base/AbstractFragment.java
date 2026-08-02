package com.sofascore.results.mvvm.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.matches.redesign.MainMatchesSwitcherFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.b05;
import defpackage.e58;
import defpackage.g9i;
import defpackage.hx5;
import defpackage.j58;
import defpackage.krk;
import defpackage.l0;
import defpackage.l98;
import defpackage.n9e;
import defpackage.nv;
import defpackage.o3;
import defpackage.p1f;
import defpackage.p2g;
import defpackage.p3;
import defpackage.q3;
import defpackage.r3;
import defpackage.rq3;
import defpackage.s38;
import defpackage.su;
import defpackage.t3;
import defpackage.u2g;
import defpackage.u6b;
import defpackage.u8f;
import defpackage.w2g;
import defpackage.wca;
import defpackage.xw3;
import defpackage.y05;
import defpackage.yda;
import defpackage.yea;
import defpackage.z8e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lkrk;", "VB", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractFragment<VB extends krk> extends Fragment {
    public g9i a;
    public yda c;
    public SwipeRefreshLayout d;
    public boolean f;
    public long h;
    public p1f k;
    public krk l;
    public yda b = r();
    public boolean e = true;
    public boolean g = true;
    public final su i = new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null);
    public final ArrayList j = new ArrayList();

    public static void v(AbstractFragment abstractFragment, SwipeRefreshLayout swipeRefreshLayout, Integer num, hx5 hx5Var, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            hx5Var = null;
        }
        abstractFragment.getClass();
        swipeRefreshLayout.getClass();
        abstractFragment.d = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new o3(0, abstractFragment, hx5Var));
        swipeRefreshLayout.setOnChildScrollUpCallback(new u8f(3));
        Context requireContext = abstractFragment.requireContext();
        requireContext.getClass();
        z8e.X(swipeRefreshLayout, requireContext, num);
    }

    public final void j(Menu menu) {
        menu.getClass();
        ArrayList arrayList = this.j;
        arrayList.clear();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            item.getClass();
            arrayList.add(item);
        }
    }

    public abstract krk k();

    public final void l() {
        this.g = false;
        this.b.e(null);
    }

    public final void m() {
        this.g = true;
        this.b.e(null);
        this.b = r();
    }

    public final void n() {
        this.c = wca.x(getLifecycle()).b(new q3(this, null, 0));
    }

    public final void o() {
        this.b.e(null);
        this.b = r();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        krk k = k();
        this.l = k;
        return k.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.l = null;
        this.d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SwipeRefreshLayout swipeRefreshLayout = this.d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        g9i g9iVar = this.a;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        y(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L16;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        Object u2gVar;
        Object u2gVar2;
        super.onResume();
        if (!this.f) {
            q();
        }
        SwipeRefreshLayout swipeRefreshLayout = this.d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(this.e);
        }
        this.h = System.currentTimeMillis();
        FragmentActivity requireActivity = requireActivity();
        Object obj = null;
        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
        if (baseActivity != null) {
            baseActivity.C = p();
        }
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("app_survey");
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(SurveyConfigData.INSTANCE.serializer()), g);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                s38.a().c(a);
            }
        }
        u2gVar = null;
        SurveyConfigData surveyConfigData = (SurveyConfigData) u2gVar;
        yea yeaVar2 = j58.a;
        e58 f2 = e58.f();
        f2.getClass();
        String g2 = f2.g("survey");
        if (g2.length() != 0) {
            try {
                p2g p2gVar3 = w2g.b;
                yeaVar2.getClass();
                u2gVar2 = yeaVar2.b(l98.W(SurveyConfigData.INSTANCE.serializer()), g2);
            } catch (Throwable th2) {
                p2g p2gVar4 = w2g.b;
                u2gVar2 = new u2g(th2);
            }
            Throwable a2 = w2g.a(u2gVar2);
            if (a2 != null) {
                s38.a().c(a2);
            }
            if (!(u2gVar2 instanceof u2g)) {
                obj = u2gVar2;
            }
        }
        SurveyConfigData surveyConfigData2 = (SurveyConfigData) obj;
        if (surveyConfigData != null && x(surveyConfigData, true)) {
            z(surveyConfigData, true);
        } else {
            if (surveyConfigData2 == null || !x(surveyConfigData2, false)) {
                return;
            }
            z(surveyConfigData2, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        view.setLayoutDirection(3);
        s(view, bundle);
        view.setContentDescription(p());
        view.setImportantForAccessibility(2);
    }

    public abstract String p();

    public void q() {
        if (this.f) {
            return;
        }
        int i = 1;
        this.f = true;
        rq3 rq3Var = null;
        r3 r3Var = new r3(this, rq3Var, 0);
        if (Intrinsics.c(y05.b, Boolean.TRUE)) {
            wca.x(getLifecycle()).b(new l0(this, r3Var, rq3Var, 5));
        } else {
            wca.x(getLifecycle()).a(new q3(r3Var, rq3Var, i));
        }
    }

    public final yda r() {
        return wca.x(getLifecycle()).b(new l0(this, null, 6));
    }

    public abstract void s(View view, Bundle bundle);

    public final void t(View view, Function1 function1) {
        view.getClass();
        view.post(new p3(0, this, function1, view));
    }

    public abstract void u();

    public boolean w() {
        return !(this instanceof MainMatchesSwitcherFragment);
    }

    public final boolean x(SurveyConfigData surveyConfigData, boolean z) {
        FragmentActivity requireActivity = requireActivity();
        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
        String u = baseActivity != null ? baseActivity.u() : null;
        Context requireContext = requireContext();
        requireContext.getClass();
        String p = p();
        p.getClass();
        return ((Boolean) n9e.x(requireContext, new b05(6, surveyConfigData, requireContext, u, p, z))).booleanValue();
    }

    public final void y(boolean z) {
        if (w() || z) {
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            su suVar = ((BaseActivity) requireActivity).x;
            FragmentActivity requireActivity2 = requireActivity();
            requireActivity2.getClass();
            String p = p();
            long currentTimeMillis = System.currentTimeMillis() - this.h;
            su suVar2 = this.i;
            suVar2.a(suVar);
            nv.U((BaseActivity) requireActivity2, p, currentTimeMillis, suVar2);
        }
    }

    public final void z(SurveyConfigData surveyConfigData, boolean z) {
        g9i g9iVar = this.a;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        this.a = xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new t3(surveyConfigData, this, z, rq3Var, 0), 3);
    }
}
