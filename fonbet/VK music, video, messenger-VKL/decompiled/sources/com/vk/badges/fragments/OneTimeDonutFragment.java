package com.vk.badges.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.badges.Badgeable;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.aeg0;
import xsna.cqm0;
import xsna.drm0;
import xsna.f540;
import xsna.gl30;
import xsna.hg1;
import xsna.hms;
import xsna.hvz;
import xsna.izs;
import xsna.jgn0;
import xsna.maz;
import xsna.msy;
import xsna.oz50;
import xsna.qi00;
import xsna.rj80;
import xsna.s3q0;
import xsna.tb0;
import xsna.x550;
import xsna.xwk;
import xsna.yp80;

/* compiled from: OneTimeDonutFragment.kt */
/* loaded from: classes15.dex */
public final class OneTimeDonutFragment extends BaseFragment implements tb0 {
    public static final /* synthetic */ int V = 0;
    public final Object S;
    public final Object T;
    public final Object U;

    /* compiled from: OneTimeDonutFragment.kt */
    public static final class a extends oz50 {
        public a(Badgeable badgeable) {
            super(OneTimeDonutFragment.class, null, null);
            this.j.putParcelable("badgeable", badgeable);
        }
    }

    /* compiled from: OneTimeDonutFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public OneTimeDonutFragment() {
        hvz hvzVar = new hvz(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, hvzVar);
        this.T = msy.a(lazyThreadSafetyMode, new f540(this, 8));
        this.U = msy.a(lazyThreadSafetyMode, new x550(this, 9));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
        Bundle arguments = getArguments();
        Long valueOf = arguments != null ? Long.valueOf(arguments.getLong("app_id")) : null;
        if (valueOf != null) {
            jgn0.b().remove(valueOf.longValue());
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(2, 0);
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        String ca = ((Badgeable) requireArguments().getParcelable("badgeable")).ca();
        if (ca == null) {
            ca = "";
        }
        String str = ca;
        int K = drm0.K(0, 6, str, MBridgeConstans.DYNAMIC_VIEW_WX_APP, false);
        int K2 = drm0.K(0, 6, str, "#", false);
        if (K2 == -1) {
            K2 = str.length();
        }
        long l = K == -1 ? 0L : cqm0.l(str.subSequence(K + 3, K2).toString());
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putLong("app_id", l);
        }
        eo(new i0(rj80.a(), new hg1.x2()).subscribe(new hms(new qi00(this, 15), 19), new gl30(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 9)));
        if (bundle == null) {
            maz.c(xwk.d().e(), requireContext(), str, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, 424, null, null, null, false, false, null, null, null, 66977791), null, new c(), 8);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        super.onDestroy();
    }

    /* compiled from: OneTimeDonutFragment.kt */
    public static final class c implements yp80 {
        public c() {
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
            OneTimeDonutFragment oneTimeDonutFragment = OneTimeDonutFragment.this;
            oneTimeDonutFragment.finish();
            Bundle arguments = oneTimeDonutFragment.getArguments();
            Long valueOf = arguments != null ? Long.valueOf(arguments.getLong("app_id")) : null;
            if (valueOf != null) {
                jgn0.b().remove(valueOf.longValue());
            }
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void U() {
        }

        @Override // xsna.yp80
        public final void onSuccess() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }
    }
}
