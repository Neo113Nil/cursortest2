package com.vk.music.snippet.ui.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.a750;
import xsna.ao50;
import xsna.b750;
import xsna.bgy;
import xsna.bzj;
import xsna.bzw;
import xsna.c2u;
import xsna.c63;
import xsna.ca50;
import xsna.f5z;
import xsna.g650;
import xsna.gm50;
import xsna.j650;
import xsna.k840;
import xsna.km50;
import xsna.l650;
import xsna.lx4;
import xsna.mk50;
import xsna.msy;
import xsna.nhl;
import xsna.nly;
import xsna.owv;
import xsna.oz50;
import xsna.q010;
import xsna.qz40;
import xsna.s750;
import xsna.u750;
import xsna.uj40;
import xsna.v3n;
import xsna.vds;
import xsna.vex;
import xsna.vk50;
import xsna.w950;
import xsna.xn50;
import xsna.z650;

/* compiled from: MusicSnippetsFragment.kt */
/* loaded from: classes3.dex */
public final class MusicSnippetsFragment extends MviImplFragment<l650, b750, g650> implements vds {
    public static final /* synthetic */ int Y = 0;
    public j650 Q;
    public final u750 R;
    public final Object S;
    public final Object T;
    public final Object U;
    public boolean V;
    public final c W;
    public final b X;

    /* compiled from: MusicSnippetsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(MusicSnippetsFragment.class, null, null);
        }
    }

    /* compiled from: MusicSnippetsFragment.kt */
    public static final class c extends c63.b {
        public c() {
        }

        @Override // xsna.c63.b
        public final void u() {
            MusicSnippetsFragment.this.V = true;
        }
    }

    public MusicSnippetsFragment() {
        s750 s750Var = k840.a.e;
        this.R = s750Var == null ? null : s750Var;
        vex vexVar = new vex(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, vexVar);
        this.T = msy.a(lazyThreadSafetyMode, new nly(this, 11));
        this.U = msy.a(lazyThreadSafetyMode, new bzj(this, 29));
        this.W = new c();
        this.X = new b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        j650 j650Var = new j650(getViewLifecycleOwner(), requireContext(), new bgy(this, 13), getFeature().j);
        v3n v3nVar = new v3n(this, 22);
        q010 q010Var = new q010(this, 5);
        View view = j650Var.f;
        if (view instanceof uj40) {
            ((uj40) view).d(v3nVar, q010Var);
        }
        this.Q = j650Var;
        return new mk50.c(j650Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        b750 b750Var = (b750) ao50Var;
        j650 j650Var = this.Q;
        if (j650Var == null) {
            j650Var = null;
        }
        j650Var.getClass();
        gm50.a.b(j650Var, b750Var.a, new qz40(j650Var, 1));
        gm50.a.b(j650Var, b750Var.b, new bzw(j650Var, 10));
        gm50.a.b(j650Var, b750Var.c, new c2u(j650Var, 22));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 7;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        Lifecycle lifecycle;
        l650 l650Var = (l650) vk50Var;
        this.R.T0();
        c63 c63Var = c63.a;
        c63.a(this.W);
        FragmentActivity activity = getActivity();
        if (activity != null && (lifecycle = activity.getLifecycle()) != null) {
            lifecycle.addObserver(this.X);
        }
        l650Var.g.a(new owv(this, 11), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        xn50.a.c(this, new g650.d.a(true, false));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, new g650.d.a(false, false));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new l650(new z650(new a750(0)), (w950) this.S.getValue(), (lx4) this.T.getValue(), (ca50) this.U.getValue());
    }

    /* compiled from: MusicSnippetsFragment.kt */
    public static final class b implements nhl {
        public b() {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
            MusicSnippetsFragment musicSnippetsFragment = MusicSnippetsFragment.this;
            xn50.a.c(musicSnippetsFragment, new g650.d.a(false, musicSnippetsFragment.V && !musicSnippetsFragment.isHidden()));
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }
}
