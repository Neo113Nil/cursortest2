package com.vk.onboardingpromo.impl.ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.onboardingpromo.impl.ui.entity.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.c63;
import xsna.fh80;
import xsna.fpf0;
import xsna.hue;
import xsna.izs;
import xsna.jai;
import xsna.jb5;
import xsna.kai;
import xsna.kg80;
import xsna.mg80;
import xsna.msy;
import xsna.nef;
import xsna.obh;
import xsna.oz50;
import xsna.qcy;
import xsna.qf80;
import xsna.qz40;
import xsna.r37;
import xsna.rf80;
import xsna.tci;
import xsna.u1h0;
import xsna.uf80;
import xsna.wcy;
import xsna.xg80;
import xsna.yr00;
import xsna.yzs;
import xsna.zzs;

/* compiled from: OnboardingPromoFragment.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final Object N;
    public final u1h0 O;
    public final Object P;

    /* compiled from: OnboardingPromoFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(OnboardingPromoFragment.class, null, null);
            s(true);
        }
    }

    /* compiled from: OnboardingPromoFragment.kt */
    public static final class b extends c63.b {
        public b() {
        }

        @Override // xsna.c63.b
        public final void u() {
            qcy<Object>[] qcyVarArr = OnboardingPromoFragment.Q;
            OnboardingPromoFragment onboardingPromoFragment = OnboardingPromoFragment.this;
            onboardingPromoFragment.fo().b(new a.b(((OnboardingPromoState) tci.l(onboardingPromoFragment.fo()).c.invoke()).d));
        }

        @Override // xsna.c63.b
        public final void w() {
            qcy<Object>[] qcyVarArr = OnboardingPromoFragment.Q;
            OnboardingPromoFragment onboardingPromoFragment = OnboardingPromoFragment.this;
            onboardingPromoFragment.fo().b(new a.C1448a(((OnboardingPromoState) tci.l(onboardingPromoFragment.fo()).c.invoke()).d));
        }
    }

    /* compiled from: OnboardingPromoFragment.kt */
    public static final class c implements kg80 {
        public final FragmentActivity a;
        public final OnboardingPromoArgumentsImpl b;
        public final mg80 c;
        public final xg80 d;

        public c(OnboardingPromoFragment onboardingPromoFragment) {
            Parcelable parcelable;
            Object parcelable2;
            rf80 rf80Var = new rf80();
            FragmentActivity kn = onboardingPromoFragment.kn();
            this.a = kn;
            Bundle requireArguments = onboardingPromoFragment.requireArguments();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable("arguments", OnboardingPromoArgumentsImpl.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable("arguments");
                parcelable = (OnboardingPromoArgumentsImpl) (parcelable3 instanceof OnboardingPromoArgumentsImpl ? parcelable3 : null);
            }
            this.b = (OnboardingPromoArgumentsImpl) parcelable;
            this.c = new mg80(new xg80(kn, rf80Var));
            this.d = new xg80(kn, rf80Var);
        }

        @Override // xsna.kg80
        public final FragmentActivity a() {
            return this.a;
        }

        @Override // xsna.kg80
        public final mg80 b() {
            return this.c;
        }

        @Override // xsna.kg80
        public final xg80 c() {
            return this.d;
        }

        @Override // xsna.kg80
        public final OnboardingPromoArgumentsImpl d() {
            return this.b;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OnboardingPromoFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    public OnboardingPromoFragment() {
        obh obhVar = new obh(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, obhVar);
        yr00 yr00Var = new yr00(this, 13);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(OnboardingPromoState.class)), wcy.a.a(fpf0.d(OnboardingPromoState.class)), wcy.a.a(fpf0.d(com.vk.onboardingpromo.impl.ui.entity.a.class)), wcy.a.a(fpf0.d(qf80.class))).toString(), this, this, yr00Var);
        this.P = msy.a(lazyThreadSafetyMode, new nef(this, 27));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Un(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 24 && keyEvent.getAction() == 0) {
            fo().b(new a.e(false));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo().b(new a.c(((OnboardingPromoState) tci.l(fo()).c.invoke()).d.b, 6));
        return false;
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1032017763);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1032017763, i2, -1, "com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment.ScreenContent (OnboardingPromoFragment.kt:125)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new qz40(this, 6);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new uf80(this, null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, kai.c(-470861824, new zzs() { // from class: xsna.sf80
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    fh80 fh80Var = (fh80) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    qcy<Object>[] qcyVarArr = OnboardingPromoFragment.Q;
                    if ((intValue & 48) == 0) {
                        intValue |= aVar2.J(fh80Var) ? 32 : 16;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 145) != 144)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-470861824, intValue, -1, "com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment.ScreenContent.<anonymous> (OnboardingPromoFragment.kt:133)");
                        }
                        if (!(fh80Var instanceof fh80.a)) {
                            throw alb0.c(-1526645625, aVar2);
                        }
                        aVar2.K(-1526642140);
                        hh80 hh80Var = ((fh80.a) fh80Var).b;
                        bn50<OnboardingPromoState, OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, qf80> fo = OnboardingPromoFragment.this.fo();
                        boolean y = aVar2.y(fo);
                        Object x3 = aVar2.x();
                        if (y || x3 == a.C0011a.a) {
                            ee8 ee8Var = new ee8(1, fo, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0, 12);
                            aVar2.R(ee8Var);
                            x3 = ee8Var;
                        }
                        df80.a(hh80Var, (izs) ((fcy) x3), aVar2, 0);
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new jb5(this, i, 11);
        }
    }

    public final bn50<OnboardingPromoState, OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, qf80> fo() {
        qcy<Object> qcyVar = Q[0];
        return (bn50) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c63 c63Var = c63.a;
        c63.a((b) this.P.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(1905959288, new hue(this, 10), true));
        return composeView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        c63 c63Var = c63.a;
        c63.c((b) this.P.getValue());
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo().b(a.g.b);
    }
}
