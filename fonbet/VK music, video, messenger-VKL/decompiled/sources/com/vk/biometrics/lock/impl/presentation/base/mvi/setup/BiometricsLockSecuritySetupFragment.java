package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import android.os.Bundle;
import android.view.View;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.e87;
import xsna.f4z;
import xsna.j47;
import xsna.ka;
import xsna.km50;
import xsna.kzb0;
import xsna.mk50;
import xsna.msy;
import xsna.n47;
import xsna.no;
import xsna.p87;
import xsna.p97;
import xsna.r57;
import xsna.rj1;
import xsna.vds;
import xsna.vk50;
import xsna.w8i;
import xsna.y6;

/* compiled from: BiometricsLockSecuritySetupFragment.kt */
/* loaded from: classes.dex */
public final class BiometricsLockSecuritySetupFragment extends MviImplFragment<b, p87, a> implements n47, w8i, vds {
    public static final /* synthetic */ int W = 0;
    public final /* synthetic */ kzb0 Q = new kzb0();
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public g V;

    public BiometricsLockSecuritySetupFragment() {
        y6 y6Var = new y6(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, y6Var);
        this.S = msy.a(lazyThreadSafetyMode, new rj1(this, 7));
        this.T = msy.a(lazyThreadSafetyMode, new no(this, 8));
        this.U = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.g(5));
    }

    @Override // xsna.n47
    public final void Bb() {
        L.G("BiometricsLock: is success authenticated");
        getFeature().C(new a.d(true));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        g gVar = new g((f4z) getFeature().U(), getViewLifecycleOwner(), requireContext());
        this.V = gVar;
        return new mk50.c(gVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        p87 p87Var = (p87) ao50Var;
        g gVar = this.V;
        if (gVar != null) {
            gVar.f(p87Var, new e87(getFeature()));
        }
        ((f4z) getFeature().U()).a(new ka(this, 7), this);
    }

    @Override // xsna.vds
    public final int Q0() {
        return this.Q.Q0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        super.onDestroyView();
    }

    @Override // xsna.n47
    public final void pd(j47 j47Var) {
        if (j47Var instanceof j47.b) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"BiometricsLock: error is " + j47Var});
            }
            getFeature().C(a.e.b);
        }
        if (j47Var instanceof j47.a) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.LogType logType = L.LogType.w;
                StringBuilder sb = new StringBuilder("BiometricsLock: error is ");
                sb.append(j47Var);
                sb.append(", code=");
                j47.a aVar = (j47.a) j47Var;
                sb.append(aVar.a());
                sb.append("\n msg=");
                sb.append(aVar.b());
                L.u(l2, logType, new Object[]{sb.toString()});
            }
            j47.a aVar2 = (j47.a) j47Var;
            if (aVar2.a() == 7) {
                getFeature().C(a.f.b);
            }
            Object obj = r57.a;
            int a = aVar2.a();
            if (a == 1 || a == 8 || a == 11 || a == 12) {
                getFeature().C(a.e.b);
            }
        }
        getFeature().C(new a.d(false));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((p97) this.T.getValue(), r57.b().a());
    }

    @Override // xsna.n47
    public final void pm() {
    }

    @Override // xsna.n47
    public final void zg() {
    }
}
