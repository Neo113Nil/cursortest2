package com.vk.catalog.mvi.section.screen.impl.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.core.fragments.FragmentImpl;
import com.vk.movika.sdk.base.observable.e;
import com.vk.movika.tools.controls.seekbar.s;
import com.vk.movika.tools.controls.seekbar.t;
import com.vk.movika.tools.controls.seekbar.u;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bfa;
import xsna.bn50;
import xsna.cea;
import xsna.dfa;
import xsna.eu1;
import xsna.fpf0;
import xsna.jai;
import xsna.kai;
import xsna.msy;
import xsna.oz50;
import xsna.q;
import xsna.qcy;
import xsna.rrv0;
import xsna.u1h0;
import xsna.wcy;
import xsna.yg;
import xsna.zg;
import xsna.zy;

/* compiled from: CatalogSectionScreenFragment.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionScreenFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] T;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final u1h0 S;

    /* compiled from: CatalogSectionScreenFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogSectionScreenFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        T = new qcy[]{propertyReference1Impl};
    }

    public CatalogSectionScreenFragment() {
        eu1 eu1Var = new eu1(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, eu1Var);
        int i = 11;
        this.O = msy.a(lazyThreadSafetyMode, new q(this, i));
        this.P = msy.a(lazyThreadSafetyMode, new zy(this, 17));
        this.Q = msy.a(lazyThreadSafetyMode, new yg(this, i));
        this.R = msy.a(lazyThreadSafetyMode, new zg(this, 12));
        e eVar = new e(this, 18);
        int i2 = wcy.c;
        this.S = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(CatalogSectionScreenState.class)), wcy.a.a(fpf0.d(CatalogSectionScreenState.class)), wcy.a.a(fpf0.d(bfa.class)), wcy.a.a(fpf0.d(dfa.class))).toString(), this, this, eVar);
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(893016637);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(893016637, i2, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment.ScreenContent (CatalogSectionScreenFragment.kt:96)");
            }
            rrv0.d(null, null, null, null, kai.c(814848226, new t(this, 1), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new u(this, i, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cea fo() {
        return (cea) this.O.getValue();
    }

    public final bn50<CatalogSectionScreenState, CatalogSectionScreenState, bfa, dfa> go() {
        qcy<Object> qcyVar = T[0];
        return (bn50) this.S.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-1418852286, new s(this, 3), true));
        return composeView;
    }
}
