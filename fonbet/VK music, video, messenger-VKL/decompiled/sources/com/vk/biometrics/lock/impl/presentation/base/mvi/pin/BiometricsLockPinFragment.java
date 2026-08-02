package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.vk.biometrics.lock.api.domain.model.PinLockLaunchMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.f;
import com.vk.log.L;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import defpackage.r;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.b77;
import xsna.d77;
import xsna.dhr0;
import xsna.epx;
import xsna.f4z;
import xsna.f5;
import xsna.fc;
import xsna.g5;
import xsna.i70;
import xsna.iut0;
import xsna.j47;
import xsna.km50;
import xsna.kzb0;
import xsna.lz0;
import xsna.mk50;
import xsna.msy;
import xsna.n47;
import xsna.n67;
import xsna.oqx0;
import xsna.p97;
import xsna.r57;
import xsna.too0;
import xsna.ux5;
import xsna.vds;
import xsna.vk50;
import xsna.wj50;
import xsna.wla0;
import xsna.x77;
import xsna.yh;

/* compiled from: BiometricsLockPinFragment.kt */
/* loaded from: classes.dex */
public final class BiometricsLockPinFragment extends MviImplFragment<b, x77, com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a> implements n47, vds, too0 {
    public static final /* synthetic */ int c0 = 0;
    public i R;
    public final Object U;
    public final Object V;
    public final Object W;
    public final n67 X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final /* synthetic */ kzb0 Q = new kzb0();
    public int S = -1;
    public long T = System.currentTimeMillis();

    /* compiled from: BiometricsLockPinFragment.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinLockLaunchMode.values().length];
            try {
                iArr[PinLockLaunchMode.ENTER_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinLockLaunchMode.OLD_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PinLockLaunchMode.NEW_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PinLockLaunchMode.DISABLE_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BiometricsLockPinFragment() {
        com.vk.movika.sdk.android.defaultplayer.interactive.a aVar = new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, aVar);
        this.V = msy.a(lazyThreadSafetyMode, new f5(this, 10));
        this.W = msy.a(lazyThreadSafetyMode, new g5(this, 7));
        this.X = r57.b();
        this.Y = msy.a(lazyThreadSafetyMode, new i70(this, 10));
        this.Z = msy.a(lazyThreadSafetyMode, new fc(1));
        this.a0 = msy.a(lazyThreadSafetyMode, new r(this, 10));
        this.b0 = msy.a(lazyThreadSafetyMode, new yh(this, 7));
    }

    public static c fo(Bundle bundle) {
        if (bundle == null) {
            return c.f.a;
        }
        PinLockLaunchMode.a aVar = PinLockLaunchMode.Companion;
        int i = bundle.getInt("PIN_LOCK_LAUNCH_MODE_KEY", PinLockLaunchMode.DEFAULT.h());
        aVar.getClass();
        int i2 = a.$EnumSwitchMapping$0[PinLockLaunchMode.a.a(i).ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? c.f.a : c.d.a : c.b.a : c.g.a : c.e.a;
    }

    @Override // xsna.n47
    public final void Bb() {
        getFeature().C(new a.C0425a(true));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        ux5 b = ((p97) this.V.getValue()).b();
        Object obj = r57.a;
        long a2 = (r57.a(b.b()) + b.a()) - System.currentTimeMillis();
        wj50<g> U = getFeature().U();
        boolean z = false;
        d77 d77Var = new d77(new wla0(b.b(), a2 > 0, a2), 23);
        c fo = fo(getArguments());
        if (((Boolean) this.a0.getValue()).booleanValue() && epx.f((c) this.b0.getValue(), c.e.a) && a2 <= 0) {
            z = true;
        }
        i iVar = new i((f4z) U, new f.b.a(d77Var, fo, z), getViewLifecycleOwner(), requireContext());
        this.R = iVar;
        return new mk50.c(iVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        x77 x77Var = (x77) ao50Var;
        i iVar = this.R;
        if (iVar != null) {
            iVar.f(x77Var, new b77(getFeature()));
        }
        ((f4z) getFeature().U()).a(new lz0(this, 8), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        Window window;
        Window window2;
        Window window3;
        View decorView;
        oqx0 i;
        int c = dhr0.t.c(R.attr.vk_ui_header_background);
        Dialog dialog = this.s;
        if (dialog != null && (window3 = dialog.getWindow()) != null && (decorView = window3.getDecorView()) != null && (i = iut0.i(decorView)) != null) {
            i.b(!dhr0.M());
        }
        Dialog dialog2 = this.s;
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setStatusBarColor(c);
        }
        Dialog dialog3 = this.s;
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(c);
    }

    @Override // xsna.vds
    public final int Q0() {
        return this.Q.Q0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return ((c) this.b0.getValue()) instanceof c.e;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.S = kn().getRequestedOrientation();
        if (epx.f((c) this.b0.getValue(), c.e.a)) {
            Bn(0, R.style.FullScreenDialogTheme);
            kn().setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.R = null;
        super.onDestroy();
        kn().setRequestedOrientation(this.S);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getFeature().C(new a.m(this.T, System.currentTimeMillis()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.T = System.currentTimeMillis();
    }

    @Override // xsna.n47
    public final void pd(j47 j47Var) {
        j47.a aVar = (j47.a) j47Var;
        int a2 = aVar.a();
        L.G("BiometricsLock: error is " + j47Var + ", code=" + a2 + " \n msg=" + aVar.b());
        if (aVar.a() == 7) {
            getFeature().C(a.l.b);
        }
        Object obj = r57.a;
        if (a2 == 10 || a2 == 13) {
            return;
        }
        getFeature().C(new a.C0425a(false));
    }

    @Override // xsna.n47
    public final void pm() {
        L.G("BiometricsLock: error is fail");
        getFeature().C(new a.C0425a(false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((p97) this.V.getValue(), (c) this.b0.getValue(), ((Boolean) this.a0.getValue()).booleanValue(), this.X.a());
    }

    @Override // xsna.n47
    public final void zg() {
        getFeature().C(a.b.b);
    }
}
