package com.vk.music.player;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.BaseFragment;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.music.player.e;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.b0u0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.ies;
import xsna.iia0;
import xsna.iut0;
import xsna.lbc0;
import xsna.m67;
import xsna.mqe0;
import xsna.msy;
import xsna.nq4;
import xsna.oz50;
import xsna.pro0;
import xsna.qy90;
import xsna.rka0;
import xsna.u080;
import xsna.u2b0;
import xsna.wf;
import xsna.ywb0;

/* compiled from: StandalonePlayerFragment.kt */
/* loaded from: classes3.dex */
public final class StandalonePlayerFragment extends BaseFragment implements ies {
    public static final /* synthetic */ int a0 = 0;
    public wf S;
    public final Object T;
    public final Object U;
    public b V;
    public final Handler W;
    public final d X;
    public final bpn0 Y;
    public final c Z;

    /* compiled from: StandalonePlayerFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(StandalonePlayerFragment.class, StandalonePlayerActivity.class, null);
            x();
        }

        @Override // xsna.oz50
        public final Intent n(Context context) {
            Intent n = super.n(context);
            n.setFlags(603979776);
            n.putExtra("com.vk.music.common.FLAG_SECURE", this.j.getBoolean("com.vk.music.common.FLAG_SECURE", false));
            return n;
        }

        public final void y(boolean z) {
            this.j.putBoolean("com.vk.music.common.FLAG_SECURE", z);
        }

        public final void z(String str) {
            this.j.putString("com.vk.music.common.EXTRA_POSITION", str);
        }
    }

    /* compiled from: StandalonePlayerFragment.kt */
    public interface b {
        void onDismiss();
    }

    /* compiled from: StandalonePlayerFragment.kt */
    public static final class c extends qy90.a {
        public c() {
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void b(int i, View view) {
            if (i == 4) {
                StandalonePlayerFragment.this.tn();
            }
        }
    }

    /* compiled from: StandalonePlayerFragment.kt */
    public static final class d extends e.a {
        public d() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            if (playState == null || !playState.i()) {
                return;
            }
            StandalonePlayerFragment.this.finish();
        }
    }

    public StandalonePlayerFragment() {
        rka0 rka0Var = new rka0(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, rka0Var);
        this.U = msy.a(lazyThreadSafetyMode, new iia0(this, 20));
        this.W = new Handler(Looper.getMainLooper());
        this.X = new d();
        this.Y = new bpn0(new lbc0(this, 17));
        this.Z = new c();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        b bVar = this.V;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bn(1, dhr0.C().c);
        super.onCreate(bundle);
        ((u2b0) this.Y.getValue()).P0(this.X, true);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final boolean z = (BuildInfo.g() || BuildInfo.t()) ? false : true;
        View inflate = layoutInflater.inflate(z ? R.layout.standalone_player_fragment_redesign : R.layout.standalone_player_fragment, viewGroup, false);
        wf wfVar = (wf) inflate.findViewById(R.id.music_player);
        this.S = wfVar;
        if (wfVar == null) {
            wfVar = null;
        }
        if (wfVar instanceof MusicPlayerPersistentBottomSheet) {
            ((MusicPlayerPersistentBottomSheet) wfVar).setPopupManager((ywb0) this.T.getValue());
        }
        wf wfVar2 = this.S;
        if (wfVar2 == null) {
            wfVar2 = null;
        }
        wfVar2.setPeekHeight(0);
        wf wfVar3 = this.S;
        if (wfVar3 == null) {
            wfVar3 = null;
        }
        wfVar3.q();
        wf wfVar4 = this.S;
        if (wfVar4 == null) {
            wfVar4 = null;
        }
        wfVar4.z3(this.Z);
        wf wfVar5 = this.S;
        if (wfVar5 == null) {
            wfVar5 = null;
        }
        wfVar5.setDecorViewProvider(new mqe0(this, 12));
        inflate.findViewById(R.id.player_container).setFitsSystemWindows(false);
        wf wfVar6 = this.S;
        View view = (wfVar6 != null ? wfVar6 : null).getView();
        u080 u080Var = new u080() { // from class: xsna.epk0
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                Application application;
                int a2;
                boolean z2 = z;
                StandalonePlayerFragment standalonePlayerFragment = this;
                if (z2) {
                    wf wfVar7 = standalonePlayerFragment.S;
                    if (wfVar7 == null) {
                        wfVar7 = null;
                    }
                    wfVar7.setMaxHeightBottomSheet(-1);
                    wf wfVar8 = standalonePlayerFragment.S;
                    (wfVar8 != null ? wfVar8 : null).b0(bqx0Var);
                    return bqx0.b;
                }
                int i = StandalonePlayerFragment.a0;
                Handler handler = x93.a;
                c63 c63Var = c63.a;
                Activity b2 = c63.b();
                if (b2 == null || (application = b2.getApplication()) == null) {
                    return bqx0.b;
                }
                int p = iah0.p(standalonePlayerFragment.mo2getContext()) - ((!oen.a() || (iah0.i(application) == 2)) ? wqx0.a(bqx0Var) : 0);
                wf wfVar9 = standalonePlayerFragment.S;
                if (wfVar9 == null) {
                    wfVar9 = null;
                }
                boolean d2 = fnj.d(wfVar9.getView().getContext());
                wf wfVar10 = standalonePlayerFragment.S;
                wf wfVar11 = wfVar10 != null ? wfVar10 : null;
                if (d2 && (a2 = iah0.a(720.0f)) <= p) {
                    p = a2;
                }
                wfVar11.setMaxHeightBottomSheet(p);
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, u080Var);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.V = null;
        ((u2b0) this.Y.getValue()).n0(this.X);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        b bVar = this.V;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        wf wfVar = this.S;
        if (wfVar == null) {
            wfVar = null;
        }
        wfVar.onPause();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wf wfVar = this.S;
        if (wfVar == null) {
            wfVar = null;
        }
        wfVar.onResume();
        pro0.c(new m67(this, 11));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void tn() {
        super.tn();
        b bVar = this.V;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = yn.getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        if (bundle != null) {
            this.W.postDelayed(new nq4(this, 9), 100L);
        }
        return yn;
    }
}
