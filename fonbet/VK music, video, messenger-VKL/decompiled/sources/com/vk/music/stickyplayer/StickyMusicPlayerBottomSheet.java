package com.vk.music.stickyplayer;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.informer.mvi.f;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.music.player.api.PlayerBottomSheetStateHolder;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.mvi.MviLazyViewContainer;
import com.vk.popupmanager.api.PopupPriority;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.akd0;
import xsna.anr;
import xsna.bpn0;
import xsna.bqx0;
import xsna.cfl0;
import xsna.e3m;
import xsna.e6;
import xsna.f3b0;
import xsna.f4m;
import xsna.fnj;
import xsna.gzs;
import xsna.h4x;
import xsna.i0q0;
import xsna.iah0;
import xsna.izs;
import xsna.jfl0;
import xsna.jw40;
import xsna.k840;
import xsna.l35;
import xsna.m0q0;
import xsna.msy;
import xsna.oqx0;
import xsna.p630;
import xsna.qx6;
import xsna.qy90;
import xsna.rv40;
import xsna.s3q0;
import xsna.s4b0;
import xsna.s750;
import xsna.stg0;
import xsna.swe0;
import xsna.tn9;
import xsna.u2b0;
import xsna.u750;
import xsna.vak0;
import xsna.wf;
import xsna.wp40;
import xsna.wqx0;
import xsna.x2b0;
import xsna.xyp0;
import xsna.ye80;
import xsna.yei0;
import xsna.yel0;
import xsna.ywb0;
import xsna.zak0;
import xsna.zel0;

/* compiled from: StickyMusicPlayerBottomSheet.kt */
/* loaded from: classes3.dex */
public final class StickyMusicPlayerBottomSheet extends CoordinatorLayout implements wf, m0q0 {
    public static final /* synthetic */ int c0 = 0;
    public final StickyMusicPlayerBottomSheet A;
    public final Object B;
    public final jfl0 C;
    public final rv40 D;
    public final f E;
    public boolean F;
    public PlayerBottomSheetStateHolder.State G;
    public int H;
    public final StickyMusicPlayerBottomSheet I;
    public gzs<? extends View> J;
    public final u2b0 K;
    public final u750 L;
    public final io.reactivex.rxjava3.disposables.b M;
    public boolean N;
    public izs<? super wf, s3q0> O;
    public final bpn0 P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public int T;
    public final LinkedHashSet U;
    public final StickyMusicPlayerBottomSheetBehavior V;
    public final View W;
    public final Object a0;
    public final xyp0 b0;
    public final boolean z;

    /* compiled from: StickyMusicPlayerBottomSheet.kt */
    public final class a extends qy90.a {
        public a() {
        }

        @Override // xsna.qy90.a, com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void a(View view, float f) {
            cfl0 cfl0Var;
            StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet = StickyMusicPlayerBottomSheet.this;
            jfl0 jfl0Var = stickyMusicPlayerBottomSheet.C;
            if (jfl0Var != null && (cfl0Var = jfl0Var.w) != null) {
                ((vak0) cfl0Var.i.b).g(swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            }
            jw40 edgeToEdgeController = stickyMusicPlayerBottomSheet.getEdgeToEdgeController();
            edgeToEdgeController.getClass();
            if (f == 1.0f) {
                edgeToEdgeController.c(true);
                oqx0 oqx0Var = edgeToEdgeController.d;
                if (oqx0Var != null) {
                    oqx0Var.b(false);
                    oqx0Var.a(false);
                    return;
                }
                return;
            }
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                edgeToEdgeController.a();
                return;
            }
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) {
                return;
            }
            edgeToEdgeController.c(true);
            Boolean bool = edgeToEdgeController.g;
            Boolean bool2 = edgeToEdgeController.h;
            if (bool == null || bool2 == null) {
                return;
            }
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool.booleanValue();
            oqx0 oqx0Var2 = edgeToEdgeController.d;
            if (oqx0Var2 != null) {
                oqx0Var2.b(booleanValue2);
                oqx0Var2.a(booleanValue);
            }
        }

        @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
        public final void b(int i, View view) {
            StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet = StickyMusicPlayerBottomSheet.this;
            u750 u750Var = stickyMusicPlayerBottomSheet.L;
            xyp0 xyp0Var = stickyMusicPlayerBottomSheet.b0;
            PlayerBottomSheetStateHolder.State state = stickyMusicPlayerBottomSheet.getPlayerBottomSheetStateHolder().getState();
            PlayerBottomSheetStateHolder.State state2 = PlayerBottomSheetStateHolder.State.STATE_COLLAPSED;
            if (state != state2 && state != PlayerBottomSheetStateHolder.State.STATE_EXPANDED) {
                state = null;
            }
            if (state != null) {
                stickyMusicPlayerBottomSheet.G = state;
            }
            stickyMusicPlayerBottomSheet.getPlayerBottomSheetStateHolder().setState(i);
            if (i == 1) {
                stickyMusicPlayerBottomSheet.F = true;
                return;
            }
            if (i == 3) {
                StickyMusicPlayerBottomSheet.L0(stickyMusicPlayerBottomSheet, state2, CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_GOTO_MINI_PLAYER);
                stickyMusicPlayerBottomSheet.setHideable(false);
                u750Var.i(true);
                stickyMusicPlayerBottomSheet.getEdgeToEdgeController().b(true);
                xyp0Var.d();
                jfl0 jfl0Var = stickyMusicPlayerBottomSheet.C;
                if (jfl0Var != null) {
                    jfl0Var.m(ParentBottomSheetState.EXPANDED);
                }
                rv40 rv40Var = stickyMusicPlayerBottomSheet.D;
                if (rv40Var != null) {
                    rv40Var.l(ParentBottomSheetState.EXPANDED);
                }
                f fVar = stickyMusicPlayerBottomSheet.E;
                if (fVar != null) {
                    fVar.l(ParentBottomSheetState.EXPANDED);
                    return;
                }
                return;
            }
            if (i == 4) {
                stickyMusicPlayerBottomSheet.setHideable(false);
                u750Var.i(false);
                stickyMusicPlayerBottomSheet.getPopupManager().a(stickyMusicPlayerBottomSheet, PopupPriority.HIGH);
                stickyMusicPlayerBottomSheet.getEdgeToEdgeController().a();
                xyp0Var.c();
                jfl0 jfl0Var2 = stickyMusicPlayerBottomSheet.C;
                if (jfl0Var2 != null) {
                    jfl0Var2.m(ParentBottomSheetState.COLLAPSED);
                }
                rv40 rv40Var2 = stickyMusicPlayerBottomSheet.D;
                if (rv40Var2 != null) {
                    rv40Var2.l(ParentBottomSheetState.COLLAPSED);
                }
                f fVar2 = stickyMusicPlayerBottomSheet.E;
                if (fVar2 != null) {
                    fVar2.l(ParentBottomSheetState.COLLAPSED);
                }
                StickyMusicPlayerBottomSheet.L0(stickyMusicPlayerBottomSheet, PlayerBottomSheetStateHolder.State.STATE_EXPANDED, CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_MINIPLAYER);
                return;
            }
            if (i != 5) {
                return;
            }
            stickyMusicPlayerBottomSheet.setHideable(true);
            stickyMusicPlayerBottomSheet.setVisible(false);
            stickyMusicPlayerBottomSheet.getPopupManager().b(stickyMusicPlayerBottomSheet);
            stickyMusicPlayerBottomSheet.getEdgeToEdgeController().a();
            xyp0Var.c();
            jfl0 jfl0Var3 = stickyMusicPlayerBottomSheet.C;
            if (jfl0Var3 != null) {
                jfl0Var3.m(ParentBottomSheetState.HIDDEN);
            }
            rv40 rv40Var3 = stickyMusicPlayerBottomSheet.D;
            if (rv40Var3 != null) {
                rv40Var3.l(ParentBottomSheetState.HIDDEN);
            }
            f fVar3 = stickyMusicPlayerBottomSheet.E;
            if (fVar3 != null) {
                fVar3.l(ParentBottomSheetState.HIDDEN);
            }
        }
    }

    /* compiled from: StickyMusicPlayerBottomSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerBottomSheetStateHolder.State.values().length];
            try {
                iArr[PlayerBottomSheetStateHolder.State.STATE_EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerBottomSheetStateHolder.State.STATE_COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StickyMusicPlayerBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void L0(StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet, PlayerBottomSheetStateHolder.State state, CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType) {
        u2b0 u2b0Var = stickyMusicPlayerBottomSheet.K;
        if (stickyMusicPlayerBottomSheet.G == state && u2b0Var.x1() == PlayerMode.AUDIO) {
            if (stickyMusicPlayerBottomSheet.F) {
                stickyMusicPlayerBottomSheet.L.k0(eventType, u2b0Var.x1());
                int i = b.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    stickyMusicPlayerBottomSheet.getPlayerNavigationAnalyticsTracker().a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
                    x2b0 playerNavigationAnalyticsTracker = stickyMusicPlayerBottomSheet.getPlayerNavigationAnalyticsTracker();
                    UiTracker uiTracker = UiTracker.a;
                    x2b0.c(playerNavigationAnalyticsTracker, null, UiTracker.c(), 13);
                } else if (i == 2) {
                    x2b0 playerNavigationAnalyticsTracker2 = stickyMusicPlayerBottomSheet.getPlayerNavigationAnalyticsTracker();
                    UiTracker uiTracker2 = UiTracker.a;
                    playerNavigationAnalyticsTracker2.a(UiTracker.c(), CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
                    x2b0.c(stickyMusicPlayerBottomSheet.getPlayerNavigationAnalyticsTracker(), null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, 13);
                }
            } else {
                x2b0 playerNavigationAnalyticsTracker3 = stickyMusicPlayerBottomSheet.getPlayerNavigationAnalyticsTracker();
                UiTracker uiTracker3 = UiTracker.a;
                x2b0.c(playerNavigationAnalyticsTracker3, null, UiTracker.c(), 5);
            }
        }
        stickyMusicPlayerBottomSheet.F = false;
    }

    private final CoordinatorLayout.f getContentLayoutParams() {
        return getMatchParentLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final jw40 getEdgeToEdgeController() {
        return (jw40) this.a0.getValue();
    }

    private final CoordinatorLayout.f getMatchParentLayoutParams() {
        return new CoordinatorLayout.f(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PlayerBottomSheetStateHolder getPlayerBottomSheetStateHolder() {
        return (PlayerBottomSheetStateHolder) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final x2b0 getPlayerNavigationAnalyticsTracker() {
        return (x2b0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PlayerUIComponent getPlayerUiComponent() {
        return (PlayerUIComponent) this.R.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ywb0 getPopupManager() {
        return (ywb0) this.P.getValue();
    }

    public static void w0(StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet) {
        jfl0 jfl0Var = stickyMusicPlayerBottomSheet.C;
        if (jfl0Var != null) {
            CoordinatorLayout.f contentLayoutParams = stickyMusicPlayerBottomSheet.getContentLayoutParams();
            contentLayoutParams.c(stickyMusicPlayerBottomSheet.getBottomSheetBehavior());
            jfl0Var.setLayoutParams(contentLayoutParams);
            jfl0Var.requestLayout();
        }
    }

    @Override // xsna.wf
    public final boolean a0() {
        if (getState() != 3) {
            return false;
        }
        setState(4);
        u2b0 u2b0Var = this.K;
        if (u2b0Var.x1() != PlayerMode.AUDIO) {
            return true;
        }
        this.L.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MINIPLAYER_BACK_BUTTON, u2b0Var.x1());
        getPlayerNavigationAnalyticsTracker().a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        return true;
    }

    @Override // xsna.wf
    public final void b0(bqx0 bqx0Var) {
        cfl0 cfl0Var;
        bqx0.q qVar = bqx0Var.a;
        jfl0 jfl0Var = this.C;
        if (jfl0Var != null && (cfl0Var = jfl0Var.w) != null) {
            h4x i = qVar.i(11);
            f3b0 f3b0Var = cfl0Var.i;
            int i2 = i.a;
            int i3 = i.b;
            if (i3 == 0) {
                Context context = cfl0Var.c;
                HashSet hashSet = iah0.a;
                i3 = fnj.a(context);
            }
            ((zak0) f3b0Var.a).setValue(new anr(i2, i3, i.c, i.d));
        }
        f4m.k(wqx0.a(bqx0Var), this.W);
        this.H = qVar.i(2).d;
        if (getState() == 3) {
            getEdgeToEdgeController().b(false);
        }
    }

    @Override // xsna.qy90.c
    public final void c() {
        setState(3);
    }

    @Override // xsna.wf
    public PersistentBottomSheetBehavior getBottomSheetBehavior() {
        return this.V;
    }

    public boolean getCanInteract() {
        return true;
    }

    @Override // xsna.wf
    public FrameLayout getContentLayout() {
        return this.C;
    }

    @Override // xsna.wf
    public CoordinatorLayout getCoordinatorLayout() {
        return this.I;
    }

    public gzs<View> getDecorViewProvider() {
        return this.J;
    }

    public int getMaxHeightBottomSheet() {
        return -1;
    }

    public Void getModernSmallPlayerView() {
        return null;
    }

    public int getPeekHeight() {
        PersistentBottomSheetBehavior bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior.d) {
            return -1;
        }
        return bottomSheetBehavior.c;
    }

    public final int getSmallPlayerSize() {
        return this.T;
    }

    @Override // xsna.wf
    public int getState() {
        return getBottomSheetBehavior().j;
    }

    @Override // xsna.pel0
    public View getView() {
        return this.A;
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
        return this.z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i0q0.d(1500L, new tn9(this, 18));
    }

    @Override // xsna.wf
    public final void onDestroy() {
        this.M.e();
        f fVar = this.E;
        if (fVar != null) {
            MviLazyViewContainer.a aVar = fVar.e;
            aVar.getClass();
            aVar.b(Lifecycle.State.DESTROYED, true);
        }
        rv40 rv40Var = this.D;
        if (rv40Var != null) {
            MviLazyViewContainer.a aVar2 = rv40Var.e;
            aVar2.getClass();
            aVar2.b(Lifecycle.State.DESTROYED, true);
        }
        jfl0 jfl0Var = this.C;
        if (jfl0Var != null) {
            MviLazyViewContainer.a aVar3 = jfl0Var.e;
            aVar3.getClass();
            aVar3.b(Lifecycle.State.DESTROYED, true);
        }
        jw40 edgeToEdgeController = getEdgeToEdgeController();
        s4b0 s4b0Var = edgeToEdgeController.a;
        if (s4b0Var.c()) {
            edgeToEdgeController.a();
        }
        edgeToEdgeController.b = null;
        edgeToEdgeController.d = null;
        edgeToEdgeController.c = null;
        s4b0Var.a();
        this.N = false;
    }

    @Override // xsna.wf
    public final void onPause() {
        this.N = false;
    }

    @Override // xsna.wf
    public final void onResume() {
        this.N = true;
        if (this.K.m0().i()) {
            setHideable(true);
            setState(5);
        }
        izs<? super wf, s3q0> izsVar = this.O;
        if (izsVar != null) {
            y1(izsVar);
        }
        if (getState() == 3) {
            getEdgeToEdgeController().b(false);
        }
    }

    @Override // xsna.qy90.c
    public final void q() {
        setState(4);
    }

    @Override // xsna.wf
    public void setDecorViewProvider(gzs<? extends View> gzsVar) {
        this.J = gzsVar;
    }

    @Override // xsna.wf
    public void setHideable(boolean z) {
        getBottomSheetBehavior().h = z;
    }

    @Override // xsna.wf
    public void setPeekHeight(int i) {
        getBottomSheetBehavior().I(i + this.H);
    }

    public final void setSmallPlayerSize(int i) {
        this.T = i;
    }

    @Override // xsna.wf
    public void setState(int i) {
        getBottomSheetBehavior().J(i);
    }

    @Override // xsna.wf
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS;
    }

    @Override // xsna.wf
    public final void y1(izs<? super wf, s3q0> izsVar) {
        if (!this.N) {
            this.O = izsVar;
            return;
        }
        this.O = null;
        PersistentBottomSheetBehavior bottomSheetBehavior = getBottomSheetBehavior();
        e6 e6Var = new e6(6, izsVar, this);
        ArrayDeque arrayDeque = bottomSheetBehavior.x;
        arrayDeque.offer(e6Var);
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

    @Override // xsna.wf
    public final void z3(CustomisableBottomSheetBehavior.b bVar) {
        this.U.add(bVar);
    }

    public StickyMusicPlayerBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Window window;
        this.z = true;
        this.A = this;
        l35 l35Var = new l35(29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, l35Var);
        this.B = a2;
        this.I = this;
        this.J = new qx6(context, 1);
        this.K = k840.a.g().b();
        s750 s750Var = k840.a.e;
        this.L = s750Var == null ? null : s750Var;
        this.M = new io.reactivex.rxjava3.disposables.b();
        this.P = new bpn0(new wp40(this, 24));
        this.Q = msy.a(lazyThreadSafetyMode, new ye80(this, 20));
        this.R = msy.a(lazyThreadSafetyMode, new akd0(this, 11));
        this.S = msy.a(lazyThreadSafetyMode, new stg0(this, 7));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.U = linkedHashSet;
        qy90.b bVar = new qy90.b(linkedHashSet);
        StickyMusicPlayerBottomSheetBehavior stickyMusicPlayerBottomSheetBehavior = new StickyMusicPlayerBottomSheetBehavior(context);
        stickyMusicPlayerBottomSheetBehavior.r = bVar;
        stickyMusicPlayerBottomSheetBehavior.I(qy90.U);
        stickyMusicPlayerBottomSheetBehavior.h = false;
        stickyMusicPlayerBottomSheetBehavior.J(4);
        this.V = stickyMusicPlayerBottomSheetBehavior;
        View view = new View(context);
        this.W = view;
        this.a0 = msy.a(lazyThreadSafetyMode, new yei0(this, 4));
        this.b0 = new xyp0(this, true);
        z3(new a());
        addView(view, new CoordinatorLayout.f(-1, 0));
        CoordinatorLayout.f contentLayoutParams = getContentLayoutParams();
        contentLayoutParams.c(getBottomSheetBehavior());
        boolean b2 = k840.a.i.b();
        int generateViewId = View.generateViewId();
        if (!b2) {
            int a3 = iah0.a(12);
            rv40 rv40Var = new rv40(getContext());
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = rv40Var.getMeasuredWidth();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = rv40Var.getMeasuredHeight();
            f4m.a(rv40Var, new yel0(rv40Var, ref$IntRef, ref$IntRef2, rv40Var, a3));
            this.D = rv40Var;
            CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
            fVar.b(generateViewId);
            fVar.d = 80;
            s3q0 s3q0Var = s3q0.a;
            addView(rv40Var, fVar);
        }
        if (((Boolean) a2.getValue()).booleanValue()) {
            f fVar2 = new f(getContext());
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            ref$IntRef3.element = fVar2.getMeasuredWidth();
            Ref$IntRef ref$IntRef4 = new Ref$IntRef();
            ref$IntRef4.element = fVar2.getMeasuredHeight();
            f4m.a(fVar2, new zel0(fVar2, ref$IntRef3, ref$IntRef4, fVar2));
            this.E = fVar2;
            CoordinatorLayout.f fVar3 = new CoordinatorLayout.f(-1, -2);
            fVar3.b(generateViewId);
            fVar3.d = 80;
            s3q0 s3q0Var2 = s3q0.a;
            addView(fVar2, fVar3);
            if (getPlayerUiComponent().Ra().a == BottomPlayerAppearance.LARGE) {
                View view2 = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.music_bottom_navigation_gradient, (ViewGroup) null, false);
                CoordinatorLayout.f fVar4 = new CoordinatorLayout.f(-1, -2);
                fVar4.b(generateViewId);
                fVar4.d = 80;
                addView(view2, fVar4);
            }
        }
        jfl0 jfl0Var = new jfl0(getContext());
        jfl0Var.setId(generateViewId);
        jfl0Var.setController(this);
        this.C = jfl0Var;
        addView(jfl0Var, contentLayoutParams);
        Activity h = e3m.h(context);
        if (h == null || (window = h.getWindow()) == null) {
            return;
        }
        jw40 edgeToEdgeController = getEdgeToEdgeController();
        edgeToEdgeController.b = window;
        edgeToEdgeController.c = view;
        edgeToEdgeController.d = new oqx0(window, window.getDecorView());
        edgeToEdgeController.a.a();
    }

    @Override // xsna.wf
    /* renamed from: getModernSmallPlayerView, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ p630 mo94getModernSmallPlayerView() {
        return (p630) getModernSmallPlayerView();
    }

    @Override // xsna.dwb0
    public final void e() {
    }

    @Override // xsna.dwb0
    public final void n() {
    }

    @Override // xsna.wf
    public final void N0(String str) {
    }

    @Override // xsna.wf
    public void setCanInteract(boolean z) {
    }

    @Override // xsna.wf
    public void setMaxHeightBottomSheet(int i) {
    }
}
