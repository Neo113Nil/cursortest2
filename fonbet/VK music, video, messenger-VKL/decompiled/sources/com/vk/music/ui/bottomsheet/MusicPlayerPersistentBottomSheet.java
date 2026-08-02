package com.vk.music.ui.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.player.presentation.main.SwipeBlockingViewPager;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.music.view.player.MusicBigPlayerParams;
import com.vk.popupmanager.api.PopupPriority;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import defpackage.m;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.bqx0;
import xsna.cvk;
import xsna.d220;
import xsna.e3m;
import xsna.ec40;
import xsna.ey40;
import xsna.f2l;
import xsna.f4m;
import xsna.fnj;
import xsna.fy40;
import xsna.gy40;
import xsna.iah0;
import xsna.ic40;
import xsna.ij2;
import xsna.izs;
import xsna.jjb0;
import xsna.k840;
import xsna.lq40;
import xsna.lyd;
import xsna.mb40;
import xsna.msy;
import xsna.nuj;
import xsna.ozl;
import xsna.p630;
import xsna.qb40;
import xsna.qy90;
import xsna.rv40;
import xsna.s3q0;
import xsna.s750;
import xsna.se50;
import xsna.tb40;
import xsna.u2b0;
import xsna.u750;
import xsna.uv6;
import xsna.vb;
import xsna.wb40;
import xsna.wf;
import xsna.x5v0;
import xsna.ywb0;

/* compiled from: MusicPlayerPersistentBottomSheet.kt */
@ozl
/* loaded from: classes3.dex */
public final class MusicPlayerPersistentBottomSheet extends qy90 implements wf, View.OnClickListener {
    public static final int u0 = iah0.a(24.0f);
    public final MusicPlayerPersistentBottomSheet V;
    public final MusicPlayerPersistentBottomSheet W;
    public ywb0 a0;
    public rv40 b0;
    public final u2b0 c0;
    public final lq40 d0;
    public final u750 e0;
    public final io.reactivex.rxjava3.disposables.b f0;
    public final b g0;
    public final Handler h0;
    public final ij2 i0;
    public final FrameLayout j0;
    public final vb k0;
    public final tb40 l0;
    public boolean m0;
    public izs<? super wf, s3q0> n0;
    public ec40.a<MusicTrack> o0;
    public final p630 p0;
    public final LinkedList<Runnable> q0;
    public final Object r0;
    public final MusicBigPlayerParams s0;
    public wb40 t0;

    /* compiled from: MusicPlayerPersistentBottomSheet.kt */
    public final class a extends qy90.a {
        public a() {
        }

        @Override // xsna.qy90.a, com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void a(View view, float f) {
            View view2;
            MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = MusicPlayerPersistentBottomSheet.this;
            p630 mo94getModernSmallPlayerView = musicPlayerPersistentBottomSheet.mo94getModernSmallPlayerView();
            float heightToStartRoundingToolbar = musicPlayerPersistentBottomSheet.getHeightToStartRoundingToolbar();
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (heightToStartRoundingToolbar == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = f - 1;
            } else if (f < musicPlayerPersistentBottomSheet.getHeightToStartRoundingToolbar()) {
                f2 = (f / musicPlayerPersistentBottomSheet.getHeightToStartRoundingToolbar()) - 1;
            }
            mo94getModernSmallPlayerView.setAlpha(Math.abs(f2));
            wb40 wb40Var = musicPlayerPersistentBottomSheet.t0;
            if (wb40Var != null) {
                wb40Var.B0(f);
            }
            wb40 wb40Var2 = musicPlayerPersistentBottomSheet.t0;
            if (wb40Var2 != null && (view2 = wb40Var2.itemView) != null) {
                view2.setAlpha(((double) f) < 0.5d ? f - 0.2f : f);
            }
            musicPlayerPersistentBottomSheet.i0.setCollapse(f <= musicPlayerPersistentBottomSheet.getHeightToStartRoundingToolbar() + 0.1f);
            wb40 wb40Var3 = musicPlayerPersistentBottomSheet.t0;
            if (wb40Var3 != null) {
                com.vk.music.player.domain.state.a aVar = musicPlayerPersistentBottomSheet.l0.b;
                int i = se50.m;
                wb40Var3.V5("", false, -1, aVar);
            }
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void b(int i, View view) {
            SwipeBlockingViewPager swipeBlockingViewPager;
            MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = MusicPlayerPersistentBottomSheet.this;
            LinkedList<Runnable> linkedList = musicPlayerPersistentBottomSheet.q0;
            u750 u750Var = musicPlayerPersistentBottomSheet.e0;
            ij2 ij2Var = musicPlayerPersistentBottomSheet.i0;
            if (i == 3) {
                p630 mo94getModernSmallPlayerView = musicPlayerPersistentBottomSheet.mo94getModernSmallPlayerView();
                mo94getModernSmallPlayerView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                mo94getModernSmallPlayerView.setEnabled(false);
                mo94getModernSmallPlayerView.setClickable(false);
                mo94getModernSmallPlayerView.setLongClickable(false);
                musicPlayerPersistentBottomSheet.setHideable(false);
                ij2Var.setCollapse(false);
                musicPlayerPersistentBottomSheet.k0.run();
                u750Var.i(true);
                wb40 wb40Var = musicPlayerPersistentBottomSheet.t0;
                if (wb40Var != null) {
                    com.vk.music.player.domain.state.a aVar = musicPlayerPersistentBottomSheet.l0.b;
                    int i2 = se50.m;
                    wb40Var.V5("", false, -1, aVar);
                }
                while (!linkedList.isEmpty()) {
                    linkedList.pop().run();
                }
                rv40 rv40Var = musicPlayerPersistentBottomSheet.b0;
                if (rv40Var != null) {
                    rv40Var.l(ParentBottomSheetState.EXPANDED);
                    return;
                }
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                musicPlayerPersistentBottomSheet.setHideable(true);
                musicPlayerPersistentBottomSheet.setVisible(false);
                ywb0 popupManager = musicPlayerPersistentBottomSheet.getPopupManager();
                if (popupManager != null) {
                    popupManager.b(musicPlayerPersistentBottomSheet);
                }
                rv40 rv40Var2 = musicPlayerPersistentBottomSheet.b0;
                if (rv40Var2 != null) {
                    rv40Var2.l(ParentBottomSheetState.HIDDEN);
                    return;
                }
                return;
            }
            p630 mo94getModernSmallPlayerView2 = musicPlayerPersistentBottomSheet.mo94getModernSmallPlayerView();
            mo94getModernSmallPlayerView2.setAlpha(1.0f);
            mo94getModernSmallPlayerView2.setEnabled(true);
            mo94getModernSmallPlayerView2.setClickable(true);
            mo94getModernSmallPlayerView2.setLongClickable(true);
            musicPlayerPersistentBottomSheet.setHideable(false);
            ij2Var.setCollapse(true);
            u750Var.i(false);
            wb40 wb40Var2 = musicPlayerPersistentBottomSheet.t0;
            if (wb40Var2 != null && (swipeBlockingViewPager = wb40Var2.F) != null) {
                int i3 = wb40.I;
                com.vk.music.view.player.a aVar2 = wb40Var2.w;
                swipeBlockingViewPager.setCurrentItem((aVar2 != null ? aVar2.l.size() : 0) % 2);
            }
            ywb0 popupManager2 = musicPlayerPersistentBottomSheet.getPopupManager();
            if (popupManager2 != null) {
                popupManager2.a(musicPlayerPersistentBottomSheet, PopupPriority.HIGH);
            }
            rv40 rv40Var3 = musicPlayerPersistentBottomSheet.b0;
            if (rv40Var3 != null) {
                rv40Var3.l(ParentBottomSheetState.COLLAPSED);
            }
        }
    }

    /* compiled from: MusicPlayerPersistentBottomSheet.kt */
    public final class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            a();
        }

        public final void a() {
            MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = MusicPlayerPersistentBottomSheet.this;
            Handler handler = musicPlayerPersistentBottomSheet.h0;
            vb vbVar = musicPlayerPersistentBottomSheet.k0;
            handler.removeCallbacks(vbVar);
            handler.postDelayed(vbVar, 300L);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            a();
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void z3() {
            a();
        }
    }

    /* compiled from: MusicPlayerPersistentBottomSheet.kt */
    public static final class c implements p630.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ MusicPlayerPersistentBottomSheet b;

        /* compiled from: MusicPlayerPersistentBottomSheet.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MusicBigPlayerParams.FeatureSet.values().length];
                try {
                    iArr[MusicBigPlayerParams.FeatureSet.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MusicBigPlayerParams.FeatureSet.LIMITED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MusicBigPlayerParams.FeatureSet.MESSENGER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(Context context, MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet) {
            this.a = context;
            this.b = musicPlayerPersistentBottomSheet;
        }

        @Override // xsna.p630.a
        public final void a() {
            PlayerTrack o0;
            MusicBottomSheetLaunchPoint full;
            AudioBook audioBook;
            MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = this.b;
            u2b0 u2b0Var = musicPlayerPersistentBottomSheet.c0;
            Activity h = e3m.h(this.a);
            if (h == null || (o0 = u2b0Var.o0()) == null || o0.b.Ub()) {
                return;
            }
            if (o0.b.Mb()) {
                StartPlaySource j = u2b0Var.j();
                StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
                if (startPlayAudioBookSource == null || (audioBook = startPlayAudioBookSource.c) == null) {
                    return;
                }
                lyd.g().w().o(h, audioBook, AudioBookBottomSheetLaunchPoint.SmallPlayer.b, u2b0Var.x0(), false);
                return;
            }
            int i = a.$EnumSwitchMapping$0[musicPlayerPersistentBottomSheet.s0.j.ordinal()];
            if (i == 1) {
                full = new MusicBottomSheetLaunchPoint.Player.Full(o0);
            } else if (i == 2) {
                full = new MusicBottomSheetLaunchPoint.Player.Limited(o0);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                full = new MusicBottomSheetLaunchPoint.Player.Messenger(o0);
            }
            ic40.r(lyd.g().w(), h, full, o0.b, u2b0Var.x0(), null, false, false, null, null, 496);
        }

        @Override // xsna.p630.a
        public final void b() {
            MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = this.b;
            if (musicPlayerPersistentBottomSheet.c0.x1() != PlayerMode.LOADING) {
                musicPlayerPersistentBottomSheet.setState(3);
            } else {
                cvk.u(R.string.music_player_loading_message, false);
            }
        }
    }

    public MusicPlayerPersistentBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final CoordinatorLayout.f getContentLayoutParams() {
        return fnj.d(getContext()) ? getTabletLayoutParams() : getMatchParentLayoutParams();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.music.podcast.api.di.a getPodcastViewHolderFactory() {
        return (com.vk.music.podcast.api.di.a) this.r0.getValue();
    }

    private final CoordinatorLayout.f getTabletLayoutParams() {
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(iah0.a(360.0f), -1);
        fVar.c = 8388613;
        return fVar;
    }

    @Override // xsna.wf
    public final void N0(String str) {
        if (str != null) {
            this.q0.add(new f2l(2, this, str));
        }
    }

    @Override // xsna.qy90, xsna.too0
    public final void Ng() {
        super.Ng();
        wb40 wb40Var = this.t0;
        if (wb40Var != null) {
            wb40Var.Ng();
        }
    }

    @Override // xsna.qy90.c
    public final void c() {
        setState(3);
    }

    @Override // xsna.wf
    public CoordinatorLayout getCoordinatorLayout() {
        return this.W;
    }

    @Override // xsna.wf
    /* renamed from: getModernSmallPlayerView */
    public p630 mo94getModernSmallPlayerView() {
        return this.p0;
    }

    public final ec40.a<MusicTrack> getMusicBottomSheetActionListener() {
        return this.o0;
    }

    public final ywb0 getPopupManager() {
        return this.a0;
    }

    @Override // xsna.pel0
    public View getView() {
        return this.V;
    }

    @Override // xsna.qy90.c
    public final void hide() {
        setState(5);
    }

    @Override // xsna.wf
    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // xsna.wf
    public final boolean k4() {
        return false;
    }

    @Override // xsna.qy90, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.music_close_container) {
            setState(4);
            return;
        }
        u2b0 u2b0Var = this.c0;
        if (valueOf != null && valueOf.intValue() == R.id.repeat) {
            u2b0Var.V0();
        } else if (valueOf != null && valueOf.intValue() == R.id.shuffle) {
            u2b0Var.o();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        wb40 wb40Var = this.t0;
        if (wb40Var != null) {
            wb40Var.onConfigurationChanged(configuration);
        }
    }

    @Override // xsna.wf
    public final void onDestroy() {
        this.c0.n0(this.g0);
        this.f0.e();
        wb40 wb40Var = this.t0;
        if (wb40Var != null) {
            wb40Var.n.c.n0(wb40Var.H);
            wb40Var.m6();
            com.vk.music.view.player.a aVar = wb40Var.w;
            mb40 mb40Var = aVar.p;
            if (mb40Var != null) {
                mb40Var.v.e();
                qb40 qb40Var = mb40Var.n.f;
                qb40Var.g.b(null);
                qb40Var.h.b(null);
                qb40Var.i.b(null);
                qb40Var.a.n0(qb40Var.j);
                mb40Var.s = null;
            }
            aVar.p = null;
            aVar.o = null;
            aVar.m.clear();
        }
        this.t0 = null;
        this.m0 = false;
    }

    @Override // xsna.wf
    public final void onPause() {
        this.c0.n0(this.g0);
        wb40 wb40Var = this.t0;
        if (wb40Var != null) {
            MusicBigPlayerParams musicBigPlayerParams = wb40Var.n;
            musicBigPlayerParams.c.n0(wb40Var.H);
            jjb0.a.b("podcast_background", musicBigPlayerParams.c);
            wb40Var.m6();
        }
        this.m0 = false;
    }

    @Override // xsna.wf
    public final void onResume() {
        this.m0 = true;
        b bVar = this.g0;
        u2b0 u2b0Var = this.c0;
        u2b0Var.P0(bVar, true);
        wb40 wb40Var = this.t0;
        if (wb40Var != null) {
            MusicBigPlayerParams musicBigPlayerParams = wb40Var.n;
            musicBigPlayerParams.c.P0(wb40Var.H, true);
            jjb0.a.b("podcast_fullscreen", musicBigPlayerParams.c);
            wb40Var.l6();
        }
        if (u2b0Var.m0().i()) {
            setHideable(true);
            setState(5);
        }
        izs<? super wf, s3q0> izsVar = this.n0;
        if (izsVar != null) {
            y1(izsVar);
        }
    }

    @Override // xsna.qy90.c
    public final void q() {
        setState(4);
    }

    public final void setMusicBottomSheetActionListener(ec40.a<MusicTrack> aVar) {
        this.o0 = aVar;
    }

    public final void setPopupManager(ywb0 ywb0Var) {
        this.a0 = ywb0Var;
    }

    @Override // xsna.wf
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    @Override // xsna.qy90
    public final void w0(FrameLayout frameLayout) {
        wb40 wb40Var = new wb40(frameLayout, this.s0, getPodcastViewHolderFactory());
        wb40Var.p = new fy40(this);
        this.t0 = wb40Var;
        this.l0.a = new m(25, this, wb40Var);
        wb40Var.G = new ey40(this, frameLayout);
        View view = wb40Var.itemView;
        view.setClipToOutline(true);
        CoordinatorLayout.f contentLayoutParams = getContentLayoutParams();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        contentLayoutParams.c(fVar != null ? fVar.a : null);
        frameLayout.setLayoutParams(contentLayoutParams);
        frameLayout.addView(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = iah0.a(6.0f);
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(this.j0, marginLayoutParams);
        if (!k840.a.i.b()) {
            int a2 = iah0.a(8);
            rv40 rv40Var = new rv40(getContext());
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = rv40Var.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = rv40Var.getMeasuredHeight();
            f4m.a(rv40Var, new gy40(rv40Var, ref$IntRef, ref$IntRef2, rv40Var, this, a2));
            this.b0 = rv40Var;
            addView(rv40Var, new CoordinatorLayout.f(-2, -2));
        }
        frameLayout.addView(mo94getModernSmallPlayerView(), -1, -2);
    }

    @Override // xsna.wf
    public final void y1(izs<? super wf, s3q0> izsVar) {
        if (!this.m0) {
            this.n0 = izsVar;
            return;
        }
        this.n0 = null;
        PersistentBottomSheetBehavior bottomSheetBehavior = getBottomSheetBehavior();
        uv6 uv6Var = new uv6(6, izsVar, this);
        ArrayDeque arrayDeque = bottomSheetBehavior.x;
        arrayDeque.offer(uv6Var);
        Reference reference = bottomSheetBehavior.p;
        if (reference == null || reference.get() == null) {
            return;
        }
        while (true) {
            Runnable runnable = (Runnable) arrayDeque.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    public MusicPlayerPersistentBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MusicBigPlayerParams.FeatureSet featureSet;
        this.V = this;
        this.W = this;
        u2b0 b2 = k840.a.g().b();
        this.c0 = b2;
        lq40 d = k840.a.d();
        this.d0 = d;
        com.vk.music.track.a aVar = new com.vk.music.track.a();
        s750 s750Var = k840.a.e;
        s750 s750Var2 = s750Var != null ? s750Var : null;
        this.e0 = s750Var2;
        com.vk.music.notifications.restriction.a aVar2 = k840.a.d;
        com.vk.music.notifications.restriction.a aVar3 = aVar2 != null ? aVar2 : null;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f0 = bVar;
        x5v0 x5v0Var = new x5v0();
        this.g0 = new b();
        this.h0 = new Handler(Looper.getMainLooper());
        ij2 ij2Var = new ij2(context);
        this.i0 = ij2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.music_close_container);
        int i2 = u0;
        frameLayout.addView(ij2Var, new FrameLayout.LayoutParams(i2, i2, 17));
        frameLayout.setOnClickListener(this);
        this.j0 = frameLayout;
        this.k0 = new vb(this, 13);
        tb40 tb40Var = new tb40();
        tb40Var.a = new d220(5);
        tb40Var.b = new com.vk.music.player.domain.state.a();
        this.l0 = tb40Var;
        if (!BuildInfo.g()) {
            BuildInfo.t();
        }
        p630 p630Var = new p630(context);
        p630Var.setId(R.id.modern_small_player);
        p630Var.setListener(new c(context, this));
        p630Var.setVisibility(0);
        this.p0 = p630Var;
        this.q0 = new LinkedList<>();
        this.r0 = msy.a(LazyThreadSafetyMode.NONE, new nuj(this, 24));
        z3(new a());
        setHeightToStartRoundingToolbar(0.5f);
        if (BuildInfo.t()) {
            ImFeatures imFeatures = ImFeatures.MUSIC_IN_VKME;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                featureSet = MusicBigPlayerParams.FeatureSet.MESSENGER;
                this.s0 = new MusicBigPlayerParams(tb40Var, d, b2, aVar, s750Var2, aVar3, bVar, x5v0Var, this, featureSet);
            }
        }
        featureSet = (BuildInfo.t() || BuildInfo.g()) ? MusicBigPlayerParams.FeatureSet.LIMITED : MusicBigPlayerParams.FeatureSet.ALL;
        this.s0 = new MusicBigPlayerParams(tb40Var, d, b2, aVar, s750Var2, aVar3, bVar, x5v0Var, this, featureSet);
    }

    @Override // xsna.dwb0
    public final void e() {
    }

    @Override // xsna.dwb0
    public final void n() {
    }

    @Override // xsna.wf
    public final void b0(bqx0 bqx0Var) {
    }
}
