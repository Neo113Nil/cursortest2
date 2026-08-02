package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import android.os.Bundle;
import android.view.View;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.e;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.androidx.MviImplFragment;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.dlv0;
import xsna.dw20;
import xsna.f4z;
import xsna.j47;
import xsna.k47;
import xsna.k97;
import xsna.km50;
import xsna.kzb0;
import xsna.lg;
import xsna.mg;
import xsna.mk50;
import xsna.msy;
import xsna.n47;
import xsna.p97;
import xsna.q87;
import xsna.r57;
import xsna.r7;
import xsna.rt0;
import xsna.ug5;
import xsna.vds;
import xsna.vk50;
import xsna.w8i;
import xsna.wj50;

/* compiled from: BiometricsLockSettingsFragment.kt */
/* loaded from: classes.dex */
public final class BiometricsLockSettingsFragment extends MviImplFragment<b, k97, a> implements w8i, n47, vds {
    public static final /* synthetic */ int Y = 0;
    public final /* synthetic */ kzb0 Q = new kzb0();
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public g W;
    public dw20 X;

    public BiometricsLockSettingsFragment() {
        com.vk.movika.sdk.base.logic.processor.actions.f fVar = new com.vk.movika.sdk.base.logic.processor.actions.f(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, fVar);
        this.S = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 8));
        this.T = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 9));
        this.U = msy.a(lazyThreadSafetyMode, new lg(5));
        this.V = msy.a(lazyThreadSafetyMode, new mg(2));
    }

    @Override // xsna.n47
    public final void Bb() {
        getFeature().C(new a.f(true));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        wj50<f> U = getFeature().U();
        ?? r3 = this.S;
        boolean k = ((p97) r3.getValue()).k();
        boolean b = fo().b(requireContext());
        long h = ((p97) r3.getValue()).h();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        g gVar = new g((f4z) U, new e.b.a(k, b, h == timeUnit.toMillis(0L) ? ug5.b.b : h == timeUnit.toMillis(1L) ? ug5.c.b : h == timeUnit.toMillis(5L) ? ug5.a.b : h == timeUnit.toMillis(30L) ? ug5.d.b : ug5.a.b), (dlv0) this.V.getValue(), getViewLifecycleOwner(), requireContext());
        this.W = gVar;
        return new mk50.c(gVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        k97 k97Var = (k97) ao50Var;
        g gVar = this.W;
        if (gVar != null) {
            gVar.f(k97Var, new q87(getFeature()));
        }
        ((f4z) getFeature().U()).a(new r7(this, 11), this);
    }

    @Override // xsna.vds
    public final int Q0() {
        return this.Q.Q0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final k47 fo() {
        return (k47) this.T.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.W = null;
        this.X = null;
        super.onDestroyView();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getParentFragmentManager().l0("biometricsLockPinChanged", getViewLifecycleOwner(), new rt0(this, 3));
    }

    @Override // xsna.n47
    public final void pd(j47 j47Var) {
        if (j47Var instanceof j47.b) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"BiometricsLock: error is " + j47Var});
            }
            getFeature().C(a.b.C0431b.b);
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
                getFeature().C(a.b.c.b);
            }
            Object obj = r57.a;
            int a = aVar2.a();
            if (a == 1 || a == 8 || a == 11 || a == 12) {
                getFeature().C(a.b.C0431b.b);
            }
        }
        getFeature().C(new a.f(false));
    }

    @Override // xsna.n47
    public final void pm() {
        L.G("BiometricsLock: error is fail");
        getFeature().C(new a.f(false));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((p97) this.S.getValue(), fo().b(requireContext()), r57.b().a());
    }

    @Override // xsna.n47
    public final void zg() {
    }
}
