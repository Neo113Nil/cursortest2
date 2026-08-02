package com.vk.clips.interests.impl.ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.interests.AvatarWithStepProgress;
import com.vk.clips.design.view.interests.NextButton;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.interests.impl.ui.a;
import com.vk.clips.interests.impl.ui.button.ButtonStyle;
import com.vk.clips.interests.impl.ui.recycler.ClipsInterestsRecyclerView;
import com.vk.dto.common.Image;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.ui.s0;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.ar;
import xsna.ar5;
import xsna.bpn0;
import xsna.bwt0;
import xsna.byt;
import xsna.cfh0;
import xsna.dhr0;
import xsna.e43;
import xsna.eaa;
import xsna.f4m;
import xsna.fnj;
import xsna.fr5;
import xsna.g6;
import xsna.g620;
import xsna.ha;
import xsna.hvt0;
import xsna.iah0;
import xsna.ifx;
import xsna.jq;
import xsna.km50;
import xsna.lwu;
import xsna.mbl;
import xsna.mk50;
import xsna.mp8;
import xsna.mqj;
import xsna.msy;
import xsna.n1d;
import xsna.nds;
import xsna.nf1;
import xsna.ns1;
import xsna.omp0;
import xsna.oo;
import xsna.oz50;
import xsna.pkn0;
import xsna.qe3;
import xsna.s3q0;
import xsna.s6;
import xsna.t9;
import xsna.t9e;
import xsna.tge;
import xsna.u40;
import xsna.ucp;
import xsna.uds;
import xsna.v40;
import xsna.vds;
import xsna.vk50;
import xsna.we0;
import xsna.wka;
import xsna.wm1;
import xsna.wvx;
import xsna.xn50;

/* compiled from: ClipsInterestsFragment.kt */
/* loaded from: classes.dex */
public final class ClipsInterestsFragment extends MviImplFragment<com.vk.clips.interests.impl.feature.a, ClipsInterestsViewState, com.vk.clips.interests.impl.ui.a> implements vds, nds, uds {
    public static final /* synthetic */ int Y = 0;
    public final Object Q;
    public mqj R;
    public final bpn0 S;
    public final Object T;
    public tge U;
    public final Object V;
    public io.reactivex.rxjava3.disposables.c W;
    public boolean X;

    /* compiled from: ClipsInterestsFragment.kt */
    /* loaded from: classes16.dex */
    public static final class a extends oz50 {
        public a() {
            super(ClipsInterestsFragment.class, null, null);
            s(true);
            dhr0.a.getClass();
            w(dhr0.u().c);
        }
    }

    /* compiled from: ClipsInterestsFragment.kt */
    /* loaded from: classes16.dex */
    public static final class b {
        public final View a;
        public final CoordinatorLayout b;
        public final ClipsInterestsRecyclerView c;
        public final ImageView d;
        public final NonBouncedAppBarLayout e;
        public final AvatarWithStepProgress f;
        public final NextButton g;
        public final ViewGroup h;
        public final ProgressBar i;
        public final ConstraintLayout j;

        public b(View view) {
            this.a = view;
            this.b = (CoordinatorLayout) view.findViewById(R.id.clips_interests_coordinator_host);
            this.c = (ClipsInterestsRecyclerView) view.findViewById(R.id.clips_interests_recycler);
            this.d = (ImageView) view.findViewById(R.id.clips_interests_back);
            this.e = (NonBouncedAppBarLayout) view.findViewById(R.id.clips_interests_appbar);
            this.f = (AvatarWithStepProgress) view.findViewById(R.id.clips_interests_avatar);
            this.g = (NextButton) view.findViewById(R.id.clips_interests_next);
            this.h = (ViewGroup) view.findViewById(R.id.clips_interests_titles_area);
            this.i = (ProgressBar) view.findViewById(R.id.clips_interests_progress_bar);
            this.j = (ConstraintLayout) view.findViewById(R.id.clips_interests_error_area);
        }

        public final NonBouncedAppBarLayout a() {
            return this.e;
        }

        public final AvatarWithStepProgress b() {
            return this.f;
        }

        public final ImageView c() {
            return this.d;
        }

        public final CoordinatorLayout d() {
            return this.b;
        }

        public final ConstraintLayout e() {
            return this.j;
        }

        public final NextButton f() {
            return this.g;
        }

        public final ClipsInterestsRecyclerView g() {
            return this.c;
        }

        public final ViewGroup h() {
            return this.h;
        }

        public final View i() {
            return this.a;
        }
    }

    /* compiled from: ClipsInterestsFragment.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsInterestsViewState.UIScreenStep.values().length];
            try {
                iArr[ClipsInterestsViewState.UIScreenStep.MAIN_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsInterestsViewState.UIScreenStep.SUB_CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsInterestsViewState.UIScreenStep.FINISH_RESET_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsInterestsViewState.UIScreenStep.FINISH_KEEP_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipsInterestsFragment() {
        oo ooVar = new oo(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, ooVar);
        this.S = new bpn0(new qe3(11));
        this.T = msy.a(lazyThreadSafetyMode, new wm1(this, 20));
        this.V = msy.a(lazyThreadSafetyMode, new j(this, 24));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_interests_fragment);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ClipsInterestsViewState clipsInterestsViewState = (ClipsInterestsViewState) ao50Var;
        ucp ucpVar = ucp.a;
        this.W = ucp.a().subscribe(new nf1(new t9e(view, 1), 14));
        final b bVar = new b(view);
        bVar.i().getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        this.U = new tge(new t9(this, 29), bVar.b(), go());
        bVar.g().setLayoutManager(gridLayoutManager);
        bVar.g().setAdapter(this.U);
        int a2 = jq.a(getResources().getDimensionPixelSize(R.dimen.interest_icon_size), 3, iah0.f().widthPixels, 8);
        bVar.g().setPadding(a2, iah0.a(16), a2, 0);
        int i = 22;
        bVar.g().addItemDecoration(new ifx(new we0(bVar, i)));
        bVar.f().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.lge
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = ClipsInterestsFragment.Y;
                ClipsInterestsFragment.b.this.g().setFadingEdgeLength(iah0.a(40) + (i5 - i3));
            }
        });
        bVar.g().setItemAnimator(new wka(go(), new u40(bVar, 19), new v40(bVar, 21)));
        ImageView c2 = bVar.c();
        Bundle arguments = getArguments();
        bwt0.p0(c2, arguments != null ? arguments.getBoolean("BACK_ARROW_KEY", true) : true);
        bwt0.i0(bVar.c(), new ns1(this, i));
        NextButton f = bVar.f();
        Bundle arguments2 = getArguments();
        ButtonStyle buttonStyle = null;
        Integer valueOf = arguments2 != null ? Integer.valueOf(arguments2.getInt("NEXT_BUTTON_KEY")) : null;
        ButtonStyle[] values = ButtonStyle.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            ButtonStyle buttonStyle2 = values[i2];
            int h = buttonStyle2.h();
            if (valueOf != null && h == valueOf.intValue()) {
                buttonStyle = buttonStyle2;
                break;
            }
            i2++;
        }
        if (buttonStyle == null) {
            buttonStyle = ButtonStyle.NEXT_ONLY;
        }
        f.setButtonStyle(buttonStyle);
        bVar.f().setButtonClickListener(new com.vk.clips.interests.impl.ui.b(this));
        f4m.q(bVar.f().getSkipButtonArea(), bVar.d());
        int i3 = 5;
        bwt0.i0(hvt0.c(R.id.clips_interests_retry_button, bVar.e()), new n1d(this, i3));
        bVar.h().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.mge
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i4 = ClipsInterestsFragment.Y;
                ClipsInterestsFragment.b bVar2 = ClipsInterestsFragment.b.this;
                bVar2.h().setPivotY(bVar2.h().getHeight());
                bVar2.h().setPivotX(bVar2.h().getWidth() / 2.0f);
            }
        });
        bVar.a().a(new NonBouncedAppBarLayout.d() { // from class: xsna.nge
            @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
            public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i4) {
                float f2;
                ClipsInterestsFragment.b bVar2 = ClipsInterestsFragment.b.this;
                ViewGroup viewGroup = bVar2.h;
                int i5 = ClipsInterestsFragment.Y;
                int height = nonBouncedAppBarLayout.getHeight();
                float abs = Math.abs(i4);
                float f3 = height;
                float f4 = 1.5f * f3;
                float f5 = 0.6f * f3;
                float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f7 = 1.0f;
                if (abs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = 1.0f;
                } else {
                    f2 = 1.0f - (abs / f4);
                    if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = 0.0f;
                    }
                }
                if (abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f8 = 1.0f - (abs / f5);
                    if (f8 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f6 = f8;
                    }
                    f7 = f6;
                }
                viewGroup.setScaleX(f2);
                viewGroup.setScaleY(f2);
                viewGroup.setAlpha(f7);
                f4m.v((int) (f3 - abs), bVar2.c);
            }
        });
        this.R = new mqj(this, e43.l(new wvx(this.U, go()), new lwu(bVar.i(), go()), new mp8(bVar.f(), go()), new ar5(bVar.b(), ((Number) this.V.getValue()).intValue(), go()), new cfh0(bVar.g(), go())), go());
        xn50.a.b(this, clipsInterestsViewState.a(), new s0(7, bVar, this));
        xn50.a.b(this, clipsInterestsViewState.c(), new eaa(i3, bVar, this));
        xn50.a.b(this, clipsInterestsViewState.b(), new g6(i3, bVar, this));
    }

    @Override // xsna.vds
    public final int Q0() {
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        return fnj.d(kn) ? -1 : 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.clips.interests.impl.feature.a aVar = (com.vk.clips.interests.impl.feature.a) vk50Var;
        aVar.W().a(new s6(this, 22), this);
        aVar.V().a(new ha(this, 17), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.c.C0622a.b);
        return true;
    }

    public final void fo(int i) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("REQUEST_ARG_KEY") : null;
        if (string == null || !isAdded()) {
            finish();
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle b2 = ar.b(i, string);
        s3q0 s3q0Var = s3q0.a;
        parentFragmentManager.k0(b2, string);
        if (this.X) {
            finish();
        }
    }

    public final pkn0 go() {
        return (pkn0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return ((Number) this.T.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.woo0
    public final int o7() {
        return ((Number) this.T.getValue()).intValue();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setExitTransition(omp0.c(requireContext()).d());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = this.W;
        if (cVar != null) {
            cVar.dispose();
        }
        this.W = null;
        this.U = null;
        go().a();
        this.R = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, a.e.b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("AVATAR_KEY", Image.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            parcelable = bundle.getParcelable("AVATAR_KEY");
        }
        Image image = (Image) parcelable;
        this.X = bundle.getBoolean("FINISH_ON_RESULT_KEY");
        fr5 bytVar = image != null ? new byt(image) : new mbl(g620.f().k0());
        ?? r0 = this.Q;
        return new com.vk.clips.interests.impl.feature.a(((ClipsInterestsComponentImpl) r0.getValue()).Df(), bytVar, new com.vk.clips.interests.impl.feature.c(new com.vk.clips.interests.impl.ui.c(iah0.b(24.0f))), ((ClipsInterestsComponentImpl) r0.getValue()).Ef());
    }
}
