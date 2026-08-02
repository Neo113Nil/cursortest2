package com.vk.im.ui.components.chat_profile;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.AppBarShadowView;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.account.main.vc.AccountAvatarAction;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.chat_profile.ProfileLinkActionChooser;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.utils.AppBarLayoutStateListener;
import com.vk.im.ui.views.WriteBarDisabledMoveToMaxBanner;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer;
import com.vk.im.video.d;
import com.vk.movika.sdk.base.observable.c;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.completable.h;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.subjects.f;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a1w;
import xsna.abg0;
import xsna.ais;
import xsna.ayb;
import xsna.bpn0;
import xsna.bwt0;
import xsna.byb;
import xsna.bzb0;
import xsna.cn70;
import xsna.cwb0;
import xsna.dhd0;
import xsna.dhr0;
import xsna.dxb;
import xsna.dyb;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.exb;
import xsna.eyb;
import xsna.f4m;
import xsna.f66;
import xsna.fb;
import xsna.fot;
import xsna.fxb;
import xsna.fyb;
import xsna.gxb;
import xsna.gyb;
import xsna.h2q0;
import xsna.hyb;
import xsna.hzb0;
import xsna.ify;
import xsna.il1;
import xsna.iyb;
import xsna.jjc;
import xsna.jy;
import xsna.jyb;
import xsna.kkm;
import xsna.kp5;
import xsna.kyb;
import xsna.lis;
import xsna.ll0;
import xsna.lxb;
import xsna.lyb;
import xsna.m33;
import xsna.msy;
import xsna.mwb;
import xsna.myb;
import xsna.nwb;
import xsna.o25;
import xsna.o90;
import xsna.oxb;
import xsna.pj0;
import xsna.pj8;
import xsna.q1w;
import xsna.qu;
import xsna.qxb;
import xsna.r7;
import xsna.rew;
import xsna.rxb;
import xsna.ry0;
import xsna.swe0;
import xsna.tgh0;
import xsna.u0e0;
import xsna.uxd0;
import xsna.w8m;
import xsna.wub;
import xsna.x2s;
import xsna.x7;
import xsna.xds;
import xsna.xxb;
import xsna.ye7;
import xsna.yxb;
import xsna.za;
import xsna.zf1;
import xsna.zk70;
import xsna.zxd0;

/* compiled from: ChatProfileVc.kt */
/* loaded from: classes2.dex */
public final class a implements u0e0, xds, AppBarLayoutStateListener.a, oxb.a.InterfaceC3477a, fxb.a.InterfaceC2898a, wub.a.InterfaceC3959a, uxd0.a.InterfaceC3848a, NestedVerticalRecyclerViewContainer.a, ify.a {
    public NestedVerticalRecyclerViewContainer A;
    public View B;
    public TextView C;
    public mwb D;
    public final com.vk.im.popup.b F;
    public final rxb H;
    public final f<zxd0> I;
    public final f J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final Activity N;
    public final boolean O;
    public int P;
    public float Q;
    public float R;
    public final ValueAnimator S;
    public boolean T;
    public int U;
    public boolean V;
    public WriteBarDisabledMoveToMaxBanner W;
    public final Context b;
    public final kkm c;
    public CoordinatorLayout d;
    public Toolbar e;
    public AppBarLayout f;
    public View g;
    public ConstraintLayout h;
    public VkImAvatar i;
    public ChatProfileActionsView j;
    public FrameLayout k;
    public boolean l;
    public TextView m;
    public View n;
    public View o;
    public TextView p;
    public TextView q;
    public TextView r;
    public CollapsingToolbarLayout s;
    public ViewGroup t;
    public ViewGroup u;
    public View v;
    public View w;
    public TextView x;
    public TextView y;
    public AppBarShadowView z;
    public final Object E = msy.a(LazyThreadSafetyMode.NONE, new il1(this, 12));
    public final AppBarLayoutStateListener G = new AppBarLayoutStateListener(this);

    /* compiled from: ChatProfileVc.kt */
    /* renamed from: com.vk.im.ui.components.chat_profile.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1143a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[AppBarLayoutStateListener.AppBarState.values().length];
            try {
                iArr[AppBarLayoutStateListener.AppBarState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppBarLayoutStateListener.AppBarState.TRANSFORMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppBarLayoutStateListener.AppBarState.COLLAPSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NestedVerticalRecyclerViewContainer.NestedScrollingHostState.values().length];
            try {
                iArr2[NestedVerticalRecyclerViewContainer.NestedScrollingHostState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NestedVerticalRecyclerViewContainer.NestedScrollingHostState.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImStoryState.values().length];
            try {
                iArr3[ImStoryState.SEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ImStoryState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ProfileLinkActionChooser.LinkAction.values().length];
            try {
                iArr4[ProfileLinkActionChooser.LinkAction.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ProfileLinkActionChooser.LinkAction.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[AccountAvatarAction.values().length];
            try {
                iArr5[AccountAvatarAction.OPEN_STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[AccountAvatarAction.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* compiled from: ChatProfileVc.kt */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            TextView textView = a.this.r;
            if (textView == null) {
                textView = null;
            }
            textView.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            TextView textView = a.this.r;
            if (textView == null) {
                textView = null;
            }
            textView.setAlpha(1.0f);
        }
    }

    public a(Context context, kkm kkmVar) {
        this.b = context;
        this.c = kkmVar;
        this.F = new com.vk.im.popup.b(context);
        this.H = new rxb(context);
        f<zxd0> fVar = new f<>();
        this.I = fVar;
        this.J = fVar;
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        this.N = h;
        this.O = o90.a(h);
        this.Q = 1.0f;
        this.R = 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(500L);
        duration.addUpdateListener(new yxb(this, 0));
        duration.addListener(new b());
        this.S = duration;
        this.V = true;
    }

    public static void v(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }

    @Override // com.vk.im.ui.views.nested_recyclerview.NestedVerticalRecyclerViewContainer.a
    public final void a(NestedVerticalRecyclerViewContainer.NestedScrollingHostState nestedScrollingHostState) {
        int i = C1143a.$EnumSwitchMapping$1[nestedScrollingHostState.ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = C1143a.$EnumSwitchMapping$0[this.G.c.ordinal()];
            if (i3 != 1 && i3 != 2) {
                i2 = 0;
            }
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AppBarShadowView appBarShadowView = this.z;
        if (appBarShadowView == null) {
            appBarShadowView = null;
        }
        appBarShadowView.setForceMode(Integer.valueOf(i2));
    }

    @Override // xsna.u0e0
    public final void b(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect2.left - rect.left, rect2.top - rect.top, rect2.right - rect.right, rect2.bottom - rect.bottom);
        CoordinatorLayout coordinatorLayout = this.d;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        f4m.y(rect3.top, coordinatorLayout);
    }

    @Override // xsna.u0e0
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.vkim_chat_profile_fragment, viewGroup, false);
        this.d = coordinatorLayout;
        this.g = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__loading);
        CoordinatorLayout coordinatorLayout2 = this.d;
        if (coordinatorLayout2 == null) {
            coordinatorLayout2 = null;
        }
        this.i = (VkImAvatar) coordinatorLayout2.findViewById(R.id.vkim_chat_profile_fragment__avatar);
        CoordinatorLayout coordinatorLayout3 = this.d;
        if (coordinatorLayout3 == null) {
            coordinatorLayout3 = null;
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout3.findViewById(R.id.avatarContainer);
        int b2 = cn70.b(8);
        frameLayout.setPadding(b2, b2, b2, b2);
        this.k = frameLayout;
        VkImAvatar vkImAvatar = this.i;
        if (vkImAvatar == null) {
            vkImAvatar = null;
        }
        vkImAvatar.setVisibility(0);
        VkImAvatar vkImAvatar2 = this.i;
        if (vkImAvatar2 == null) {
            vkImAvatar2 = null;
        }
        jjc.g(vkImAvatar2, new qu(this, 19));
        CoordinatorLayout coordinatorLayout4 = this.d;
        if (coordinatorLayout4 == null) {
            coordinatorLayout4 = null;
        }
        this.n = coordinatorLayout4.findViewById(R.id.vkim_chat_profile_fragment__collapsed_container);
        CoordinatorLayout coordinatorLayout5 = this.d;
        if (coordinatorLayout5 == null) {
            coordinatorLayout5 = null;
        }
        this.o = coordinatorLayout5.findViewById(R.id.vkim_chat_profile_fragment__collapsed_text_container);
        CoordinatorLayout coordinatorLayout6 = this.d;
        if (coordinatorLayout6 == null) {
            coordinatorLayout6 = null;
        }
        this.p = (TextView) coordinatorLayout6.findViewById(R.id.vkim_chat_profile_fragment__collapsed_title_trimmed);
        CoordinatorLayout coordinatorLayout7 = this.d;
        if (coordinatorLayout7 == null) {
            coordinatorLayout7 = null;
        }
        this.q = (TextView) coordinatorLayout7.findViewById(R.id.vkim_chat_profile_fragment__collapsed_title);
        CoordinatorLayout coordinatorLayout8 = this.d;
        if (coordinatorLayout8 == null) {
            coordinatorLayout8 = null;
        }
        this.r = (TextView) coordinatorLayout8.findViewById(R.id.vkim_chat_profile_fragment__collapsed_subtitle);
        CoordinatorLayout coordinatorLayout9 = this.d;
        if (coordinatorLayout9 == null) {
            coordinatorLayout9 = null;
        }
        this.s = (CollapsingToolbarLayout) coordinatorLayout9.findViewById(R.id.vkim_chat_profile_fragment_collapsing_toolbar);
        CoordinatorLayout coordinatorLayout10 = this.d;
        if (coordinatorLayout10 == null) {
            coordinatorLayout10 = null;
        }
        this.m = (TextView) coordinatorLayout10.findViewById(R.id.vkim_chat_profile_fragment__title);
        CoordinatorLayout coordinatorLayout11 = this.d;
        if (coordinatorLayout11 == null) {
            coordinatorLayout11 = null;
        }
        this.w = coordinatorLayout11.findViewById(R.id.vkim_chat_profile_fragment__title_container);
        CoordinatorLayout coordinatorLayout12 = this.d;
        if (coordinatorLayout12 == null) {
            coordinatorLayout12 = null;
        }
        this.x = (TextView) coordinatorLayout12.findViewById(R.id.vkim_chat_profile_fragment__link);
        CoordinatorLayout coordinatorLayout13 = this.d;
        if (coordinatorLayout13 == null) {
            coordinatorLayout13 = null;
        }
        this.y = (TextView) coordinatorLayout13.findViewById(R.id.vkim_chat_profile_fragment__subtitle);
        this.h = (ConstraintLayout) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__header_container);
        this.u = (ViewGroup) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__header_info_wrapper);
        this.t = (ViewGroup) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__header_info_container);
        this.v = coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__opacity_gradient);
        TextView textView = this.x;
        if (textView == null) {
            textView = null;
        }
        final fot fotVar = new fot(textView.getContext(), new myb(textView, this), null);
        fotVar.a.setIsLongpressEnabled(true);
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.zxb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return fot.this.a.onTouchEvent(motionEvent);
            }
        });
        textView.setOnClickListener(new pj8(this, 2));
        CoordinatorLayout coordinatorLayout14 = this.d;
        if (coordinatorLayout14 == null) {
            coordinatorLayout14 = null;
        }
        ChatProfileActionsView chatProfileActionsView = (ChatProfileActionsView) coordinatorLayout14.findViewById(R.id.vkim_chat_profile_fragment__actions);
        chatProfileActionsView.setListener(new dyb(this));
        this.j = chatProfileActionsView;
        RecyclerView recyclerView = (RecyclerView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__rv_content);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        mwb mwbVar = new mwb();
        kkm kkmVar = this.c;
        mwbVar.y0(new dxb(kkmVar));
        mwbVar.y0(new gxb());
        mwbVar.y0(new oxb(kkmVar, this));
        mwbVar.y0(new fxb(kkmVar, this));
        mwbVar.y0(new xxb(kkmVar));
        mwbVar.y0(new lxb(kkmVar));
        mwbVar.y0(new wub(kkmVar, this));
        mwbVar.x0(nwb.f.class, new r7(this, 21));
        mwbVar.x0(nwb.d.class, new za(this, 25));
        mwbVar.setHasStableIds(true);
        mwbVar.registerAdapterDataObserver(new tgh0(recyclerView, new pj0(mwbVar)));
        this.D = mwbVar;
        recyclerView.setAdapter(mwbVar);
        int b3 = cn70.b(12);
        recyclerView.addItemDecoration(new exb(b3, b3, cn70.b(8), mwbVar));
        Toolbar toolbar = (Toolbar) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__toolbar);
        toolbar.l(R.menu.vkim_chat_profile_menu);
        toolbar.setNavigationIcon(e3m.e(R.attr.im_ic_back_toolbar, toolbar.getContext()));
        toolbar.setNavigationOnClickListener(new d(this, 2));
        toolbar.getMenu();
        bwt0.l0(toolbar, new c(this, 22));
        this.e = toolbar;
        AppBarLayout appBarLayout = (AppBarLayout) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__appbar);
        AppBarLayoutStateListener appBarLayoutStateListener = this.G;
        appBarLayoutStateListener.getClass();
        appBarLayout.a(appBarLayoutStateListener);
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) appBarLayout.getLayoutParams();
        CoordinatorLayout.c cVar = fVar.a;
        AppBarLayout.Behavior behavior = cVar instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) cVar : null;
        if (behavior == null) {
            behavior = new AppBarLayout.Behavior();
        }
        behavior.p = new lyb(this);
        fVar.c(behavior);
        TextView textView2 = this.m;
        if (textView2 == null) {
            textView2 = null;
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = textView2.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = textView2.getMeasuredHeight();
        f4m.a(textView2, new eyb(textView2, ref$IntRef, ref$IntRef2, this));
        TextView textView3 = this.y;
        TextView textView4 = textView3 == null ? null : textView3;
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        ref$IntRef3.element = textView4.getMeasuredWidth();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        ref$IntRef4.element = textView4.getMeasuredHeight();
        f4m.a(textView4, new fyb(textView4, ref$IntRef3, ref$IntRef4, this, 0));
        TextView textView5 = this.x;
        if (textView5 == null) {
            textView5 = null;
        }
        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
        ref$IntRef5.element = textView5.getMeasuredWidth();
        Ref$IntRef ref$IntRef6 = new Ref$IntRef();
        ref$IntRef6.element = textView5.getMeasuredHeight();
        f4m.a(textView5, new gyb(textView5, ref$IntRef5, ref$IntRef6, this));
        TextView textView6 = this.p;
        if (textView6 == null) {
            textView6 = null;
        }
        Ref$IntRef ref$IntRef7 = new Ref$IntRef();
        ref$IntRef7.element = textView6.getMeasuredWidth();
        Ref$IntRef ref$IntRef8 = new Ref$IntRef();
        ref$IntRef8.element = textView6.getMeasuredHeight();
        f4m.a(textView6, new hyb(textView6, ref$IntRef7, ref$IntRef8, this));
        TextView textView7 = this.q;
        if (textView7 == null) {
            textView7 = null;
        }
        Ref$IntRef ref$IntRef9 = new Ref$IntRef();
        ref$IntRef9.element = textView7.getMeasuredWidth();
        Ref$IntRef ref$IntRef10 = new Ref$IntRef();
        ref$IntRef10.element = textView7.getMeasuredHeight();
        f4m.a(textView7, new iyb(textView7, ref$IntRef9, ref$IntRef10, this));
        TextView textView8 = this.r;
        if (textView8 == null) {
            textView8 = null;
        }
        Ref$IntRef ref$IntRef11 = new Ref$IntRef();
        ref$IntRef11.element = textView8.getMeasuredWidth();
        Ref$IntRef ref$IntRef12 = new Ref$IntRef();
        ref$IntRef12.element = textView8.getMeasuredHeight();
        f4m.a(textView8, new jyb(textView8, ref$IntRef11, ref$IntRef12, this));
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        Ref$IntRef ref$IntRef13 = new Ref$IntRef();
        ref$IntRef13.element = frameLayout2.getMeasuredWidth();
        Ref$IntRef ref$IntRef14 = new Ref$IntRef();
        ref$IntRef14.element = frameLayout2.getMeasuredHeight();
        f4m.a(frameLayout2, new kyb(frameLayout2, ref$IntRef13, ref$IntRef14, this));
        this.f = appBarLayout;
        AppBarShadowView appBarShadowView = (AppBarShadowView) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__shadow);
        appBarShadowView.setForceMode(1);
        this.z = appBarShadowView;
        NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer = (NestedVerticalRecyclerViewContainer) coordinatorLayout.findViewById(R.id.vkim_chat_profile_fragment__nested_rv_container);
        nestedVerticalRecyclerViewContainer.setListener(this);
        AppBarLayout appBarLayout2 = this.f;
        if (appBarLayout2 == null) {
            appBarLayout2 = null;
        }
        appBarLayout2.a(nestedVerticalRecyclerViewContainer);
        this.A = nestedVerticalRecyclerViewContainer;
        CoordinatorLayout coordinatorLayout15 = this.d;
        if (coordinatorLayout15 == null) {
            coordinatorLayout15 = null;
        }
        this.B = coordinatorLayout15.findViewById(R.id.vkim_chat_profile_fragment_toolbar_background);
        CoordinatorLayout coordinatorLayout16 = this.d;
        if (coordinatorLayout16 == null) {
            coordinatorLayout16 = null;
        }
        TextView textView9 = (TextView) coordinatorLayout16.findViewById(R.id.vkim_chat_profile_fragment__not_disturb);
        Drawable drawable = textView9.getContext().getDrawable(R.drawable.vk_icon_notification_disable_outline_28);
        if (drawable != null) {
            int b4 = cn70.b(14);
            drawable.setBounds(0, 0, b4, b4);
            textView9.setCompoundDrawables(drawable, null, null, null);
        }
        this.C = textView9;
        if (o25.b(o25.a())) {
            TextView textView10 = this.y;
            if (textView10 == null) {
                textView10 = null;
            }
            textView10.setMaxLines(2);
            TextView textView11 = this.y;
            if (textView11 == null) {
                textView11 = null;
            }
            f4m.l(cn70.b(8), cn70.b(8), textView11);
        } else {
            TextView textView12 = this.y;
            if (textView12 == null) {
                textView12 = null;
            }
            textView12.setLines(1);
        }
        if (BuildInfo.t()) {
            TextView textView13 = this.x;
            if (textView13 == null) {
                textView13 = null;
            }
            textView13.setVisibility(8);
            AppBarShadowView appBarShadowView2 = this.z;
            if (appBarShadowView2 == null) {
                appBarShadowView2 = null;
            }
            appBarShadowView2.setVisibility(8);
            VkImAvatar vkImAvatar3 = this.i;
            if (vkImAvatar3 == null) {
                vkImAvatar3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vkImAvatar3.getLayoutParams();
            marginLayoutParams.topMargin = cn70.b(52);
            marginLayoutParams.setMarginStart(cn70.b(20));
            marginLayoutParams.setMarginEnd(cn70.b(20));
            View view = this.w;
            if (view == null) {
                view = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.setMarginStart(cn70.b(24));
            marginLayoutParams2.setMarginEnd(cn70.b(24));
            View view2 = this.B;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
        }
        m();
        if (BuildInfo.t()) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_text_accent_themed), PorterDuff.Mode.SRC_IN);
            Toolbar toolbar2 = this.e;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            Menu menu = toolbar2.getMenu();
            while (i < menu.size()) {
                int i2 = i + 1;
                MenuItem item = menu.getItem(i);
                if (item == null) {
                    throw new IndexOutOfBoundsException();
                }
                Drawable icon = item.getIcon();
                if (icon != null) {
                    icon.setColorFilter(porterDuffColorFilter);
                }
                i = i2;
            }
            Toolbar toolbar3 = this.e;
            Drawable navigationIcon = (toolbar3 != null ? toolbar3 : null).getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.setColorFilter(porterDuffColorFilter);
            }
        } else {
            Toolbar toolbar4 = this.e;
            if (toolbar4 == null) {
                toolbar4 = null;
            }
            kkmVar.b(toolbar4, R.attr.vk_ui_text_accent_themed);
            TextView textView14 = this.x;
            kkmVar.c(textView14 != null ? textView14 : null, R.attr.vk_ui_text_link);
        }
        ChatProfileActionsView chatProfileActionsView2 = this.j;
        if (chatProfileActionsView2 != null) {
            chatProfileActionsView2.setTint(R.attr.vk_ui_text_accent_themed);
        }
        return coordinatorLayout;
    }

    @Override // xsna.u0e0
    public final void d(Rect rect) {
        CoordinatorLayout coordinatorLayout = this.d;
        if (coordinatorLayout == null) {
            coordinatorLayout = null;
        }
        f4m.y(rect.top, coordinatorLayout);
        rect.top = 0;
    }

    @Override // xsna.wub.a.InterfaceC3959a
    public final void e(EduAchievement eduAchievement) {
        t(new zxd0.h(eduAchievement));
    }

    @Override // xsna.u0e0
    public final void e0() {
        View view = this.g;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
    }

    @Override // xsna.oxb.a.InterfaceC3477a
    public final void f(qxb qxbVar) {
        t(new zxd0.n(qxbVar));
    }

    @Override // xsna.u0e0
    public final void g(Throwable th) {
        zk70.e(th);
    }

    @Override // xsna.u0e0
    public final void h() {
        if (BuildInfo.t()) {
            int i = ify.a;
            ify.a(this);
        }
        z(this.M);
    }

    @Override // com.vk.im.ui.utils.AppBarLayoutStateListener.a
    public final void i(AppBarLayoutStateListener.AppBarState appBarState) {
        y(appBarState);
        x(appBarState);
        AppBarLayoutStateListener.AppBarState appBarState2 = this.G.c;
        NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer = this.A;
        if (nestedVerticalRecyclerViewContainer == null) {
            nestedVerticalRecyclerViewContainer = null;
        }
        if (nestedVerticalRecyclerViewContainer.getScrollableHostState() == NestedVerticalRecyclerViewContainer.NestedScrollingHostState.ACTIVE) {
            int i = C1143a.$EnumSwitchMapping$0[appBarState2.ordinal()];
            int i2 = 1;
            if (i != 1 && i != 2) {
                i2 = 0;
            }
            AppBarShadowView appBarShadowView = this.z;
            (appBarShadowView != null ? appBarShadowView : null).setForceMode(Integer.valueOf(i2));
        }
    }

    @Override // xsna.fxb.a.InterfaceC2898a
    public final void j(ChatProfileListItem.c cVar) {
        t(new zxd0.n(cVar));
    }

    @Override // xsna.u0e0
    public final void k() {
        z(this.O);
        if (BuildInfo.t()) {
            int i = ify.a;
            ify.g(this);
        }
    }

    @Override // xsna.u0e0
    public final void l() {
        View view = this.g;
        if (view == null) {
            view = null;
        }
        f4m.j(view);
    }

    @Override // xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_background_content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    @Override // xsna.u0e0
    public final void m() {
        if (!BuildInfo.t()) {
            int c = dhr0.t.c(R.attr.vk_ui_background_content);
            CoordinatorLayout coordinatorLayout = this.d;
            if (coordinatorLayout == null) {
                coordinatorLayout = null;
            }
            coordinatorLayout.setBackgroundColor(c);
            CollapsingToolbarLayout collapsingToolbarLayout = this.s;
            CollapsingToolbarLayout collapsingToolbarLayout2 = collapsingToolbarLayout != null ? collapsingToolbarLayout : null;
            collapsingToolbarLayout2.setContentScrimColor(c);
            collapsingToolbarLayout2.setBackgroundColor(c);
            return;
        }
        abg0 abg0Var = dhr0.t;
        int c2 = abg0Var.c(R.attr.im_background_secondary_additional);
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.s;
        if (collapsingToolbarLayout3 == null) {
            collapsingToolbarLayout3 = null;
        }
        collapsingToolbarLayout3.setContentScrimColor(abg0Var.c(R.attr.vk_ui_background_content));
        collapsingToolbarLayout3.setBackgroundColor(c2);
        NestedVerticalRecyclerViewContainer nestedVerticalRecyclerViewContainer = this.A;
        if (nestedVerticalRecyclerViewContainer == null) {
            nestedVerticalRecyclerViewContainer = null;
        }
        nestedVerticalRecyclerViewContainer.setBackgroundColor(c2);
        ?? r0 = this.g;
        (r0 != 0 ? r0 : null).setBackgroundColor(c2);
    }

    @Override // xsna.oxb.a.InterfaceC3477a
    public final void n(qxb qxbVar) {
        t(new zxd0.o(qxbVar));
    }

    @Override // xsna.uxd0.a.InterfaceC3848a
    public final h o(l0 l0Var) {
        return hzb0.a(l0Var, s(), cwb0.j0.e);
    }

    @Override // xsna.u0e0
    public final void onDestroyView() {
        s().a();
        this.F.dismiss();
        this.H.a();
    }

    @Override // xsna.u0e0
    public final f p() {
        return this.J;
    }

    @Override // com.vk.im.ui.utils.AppBarLayoutStateListener.a
    public final void q(float f) {
        if (f >= this.Q) {
            if (this.L) {
                float f2 = this.R;
                ValueAnimator valueAnimator = this.S;
                if (f >= f2) {
                    ViewGroup viewGroup = this.u;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    viewGroup.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    View view = this.n;
                    if (view == null) {
                        view = null;
                    }
                    view.setAlpha(1.0f);
                    TextView textView = this.q;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    TextView textView2 = this.p;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setAlpha(1.0f);
                    View view2 = this.n;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setTranslationZ(3.0f);
                    Toolbar toolbar = this.e;
                    if (toolbar == null) {
                        toolbar = null;
                    }
                    toolbar.setTranslationZ(2.0f);
                    if (!this.T) {
                        valueAnimator.start();
                        this.T = true;
                    }
                } else {
                    this.T = false;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    ViewGroup viewGroup2 = this.u;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    viewGroup2.setAlpha(1.0f);
                    View view3 = this.n;
                    if (view3 == null) {
                        view3 = null;
                    }
                    view3.setAlpha(1.0f);
                    if (this.K) {
                        TextView textView3 = this.q;
                        if (textView3 == null) {
                            textView3 = null;
                        }
                        textView3.setAlpha(1.0f);
                        TextView textView4 = this.p;
                        if (textView4 == null) {
                            textView4 = null;
                        }
                        textView4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        TextView textView5 = this.q;
                        if (textView5 == null) {
                            textView5 = null;
                        }
                        textView5.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        TextView textView6 = this.p;
                        if (textView6 == null) {
                            textView6 = null;
                        }
                        textView6.setAlpha(1.0f);
                    }
                    TextView textView7 = this.r;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    textView7.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    View view4 = this.n;
                    if (view4 == null) {
                        view4 = null;
                    }
                    view4.setTranslationZ(1.0f);
                    Toolbar toolbar2 = this.e;
                    if (toolbar2 == null) {
                        toolbar2 = null;
                    }
                    toolbar2.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                View view5 = this.v;
                if (view5 == null) {
                    view5 = null;
                }
                view5.setAlpha(1.0f);
            } else {
                View view6 = this.n;
                if (view6 == null) {
                    view6 = null;
                }
                view6.setAlpha(1.0f);
                TextView textView8 = this.q;
                if (textView8 == null) {
                    textView8 = null;
                }
                textView8.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                TextView textView9 = this.p;
                if (textView9 == null) {
                    textView9 = null;
                }
                textView9.setAlpha(1.0f);
                TextView textView10 = this.r;
                if (textView10 == null) {
                    textView10 = null;
                }
                textView10.setAlpha(1.0f);
                ViewGroup viewGroup3 = this.t;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                viewGroup3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                View view7 = this.n;
                if (view7 == null) {
                    view7 = null;
                }
                view7.setTranslationZ(3.0f);
                Toolbar toolbar3 = this.e;
                if (toolbar3 == null) {
                    toolbar3 = null;
                }
                toolbar3.setTranslationZ(2.0f);
            }
            float f3 = this.P;
            int i = ((int) (f3 - (this.Q * f3))) - ((int) (f3 - (f3 * f)));
            ViewGroup viewGroup4 = this.t;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            viewGroup4.setScrollY(-i);
        } else {
            this.T = false;
            ViewGroup viewGroup5 = this.t;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            viewGroup5.setScrollY(0);
            ViewGroup viewGroup6 = this.u;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            viewGroup6.setAlpha(1.0f);
            ViewGroup viewGroup7 = this.t;
            if (viewGroup7 == null) {
                viewGroup7 = null;
            }
            viewGroup7.setAlpha(1.0f);
            View view8 = this.n;
            if (view8 == null) {
                view8 = null;
            }
            view8.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            TextView textView11 = this.q;
            if (textView11 == null) {
                textView11 = null;
            }
            textView11.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            TextView textView12 = this.p;
            if (textView12 == null) {
                textView12 = null;
            }
            textView12.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            TextView textView13 = this.r;
            if (textView13 == null) {
                textView13 = null;
            }
            textView13.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view9 = this.v;
            if (view9 == null) {
                view9 = null;
            }
            view9.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view10 = this.n;
            if (view10 == null) {
                view10 = null;
            }
            view10.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Toolbar toolbar4 = this.e;
            if (toolbar4 == null) {
                toolbar4 = null;
            }
            toolbar4.setTranslationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float f4 = this.Q;
        float f5 = f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? swe0.f(f / f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) : 1.0f;
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            frameLayout = null;
        }
        float f6 = 1;
        float f7 = f6 - f5;
        frameLayout.setAlpha(f7);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        v(frameLayout2, f7);
        float f8 = f6 - (0.1764706f * f5);
        TextView textView14 = this.m;
        if (textView14 == null) {
            textView14 = null;
        }
        v(textView14, f8);
        TextView textView15 = this.p;
        if (textView15 == null) {
            textView15 = null;
        }
        v(textView15, f8);
        TextView textView16 = this.q;
        if (textView16 == null) {
            textView16 = null;
        }
        v(textView16, f8);
        View view11 = this.v;
        if (view11 == null) {
            view11 = null;
        }
        view11.setScaleX(f8);
        TextView textView17 = this.y;
        if (textView17 == null) {
            textView17 = null;
        }
        float f9 = f6 - (0.071428575f * f5);
        v(textView17, f9);
        TextView textView18 = this.y;
        if (textView18 == null) {
            textView18 = null;
        }
        float f10 = -f5;
        textView18.setTranslationY(this.U * f10);
        TextView textView19 = this.r;
        if (textView19 == null) {
            textView19 = null;
        }
        TextView textView20 = this.y;
        if (textView20 == null) {
            textView20 = null;
        }
        v(textView19, textView20.getScaleX());
        TextView textView21 = this.x;
        if (textView21 == null) {
            textView21 = null;
        }
        v(textView21, f9);
        TextView textView22 = this.x;
        if (textView22 == null) {
            textView22 = null;
        }
        textView22.setTranslationY(f10 * this.U);
        TextView textView23 = this.x;
        (textView23 != null ? textView23 : null).setEnabled(f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [T, xsna.dw20] */
    @Override // xsna.u0e0
    public final void r(uxd0 uxd0Var) {
        if (uxd0Var instanceof uxd0.e0) {
            boolean z = ((uxd0.e0) uxd0Var).a;
            this.H.a();
            Context context = this.b;
            ChatProfileBottomSheetBuilder.b(context, new fb(this, 20), z).a(context, null);
            return;
        }
        if (uxd0Var instanceof uxd0.k) {
            Context context2 = this.b;
            ChatProfileBottomSheetBuilder.a(context2, new x7(this, 24)).a(context2, null);
            return;
        }
        if (uxd0Var instanceof uxd0.f0) {
            int i = ((uxd0.f0) uxd0Var).a;
            bzb0 s = s();
            Context context3 = this.b;
            a1w a1wVar = q1w.a;
            bzb0.d(s, new cwb0.q0(context3, i, (a1wVar != null ? a1wVar : null).r().h), null, null, null, 30);
            return;
        }
        if (uxd0Var instanceof uxd0.g) {
            uxd0.g gVar = (uxd0.g) uxd0Var;
            bzb0.d(s(), new ye7(this.b, gVar.a), gVar.b, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.h0) {
            uxd0.h0 h0Var = (uxd0.h0) uxd0Var;
            bzb0.d(s(), new h2q0(this.b, h0Var.a), h0Var.b, null, null, 28);
            return;
        }
        int i2 = 0;
        if (uxd0Var instanceof uxd0.u) {
            uxd0.u uVar = (uxd0.u) uxd0Var;
            w(uVar.a, uVar.b, false);
            return;
        }
        if (uxd0Var instanceof uxd0.t) {
            uxd0.t tVar = (uxd0.t) uxd0Var;
            w(tVar.a, tVar.b, true);
            return;
        }
        if (uxd0Var instanceof uxd0.v) {
            uxd0.v vVar = (uxd0.v) uxd0Var;
            s().c(new cwb0.p(vVar.a), vVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.r) {
            bzb0.d(s(), new cwb0.v(this.b), new ry0(this, 13), null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.s) {
            uxd0.s sVar = (uxd0.s) uxd0Var;
            s().c(new cwb0.w(sVar.a), sVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.l) {
            uxd0.l lVar = (uxd0.l) uxd0Var;
            bzb0.d(s(), new ll0(R.string.vkim_chat_profile_friends_cancel_add_confirm_title, null, 0, this.b.getString(R.string.vkim_chat_profile_friends_cancel_add_confirm_msg, lVar.a), R.string.vkim_yes, null, R.string.vkim_cancel, null, null, null, 934), lVar.b, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.m) {
            uxd0.m mVar = (uxd0.m) uxd0Var;
            bzb0.d(s(), new x2s(R.string.vkim_chat_profile_friends_cancel_follow_confirm_title, null, 0, this.b.getString(R.string.vkim_chat_profile_friends_cancel_follow_confirm_msg, mVar.a), R.string.vkim_chat_profile_friends_cancel_follow_confirm_positive, null, R.string.vkim_cancel, null, null, null, 934), mVar.b, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.f) {
            uxd0.f fVar = (uxd0.f) uxd0Var;
            this.F.b(fVar.a ? new dhd0(false) : new ais(false), fVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.o0) {
            s().c(cwb0.r0.e, ((uxd0.o0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.g0) {
            this.F.b(new lis(false), ((uxd0.g0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.p0) {
            s().c(cwb0.r0.e, ((uxd0.p0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.e) {
            uxd0.e eVar = (uxd0.e) uxd0Var;
            bzb0.d(s(), new cwb0.d0(this.b, eVar.a), eVar.b, eVar.c, null, 24);
            return;
        }
        if (uxd0Var instanceof uxd0.d) {
            s().c(cwb0.b.e, ((uxd0.d) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.i0) {
            uxd0.i0 i0Var = (uxd0.i0) uxd0Var;
            s().c(new cwb0.g0(i0Var.a), i0Var.b);
            return;
        }
        if (uxd0Var instanceof uxd0.b0) {
            uxd0.b0 b0Var = (uxd0.b0) uxd0Var;
            bzb0.e(s(), new cwb0.h0(this.b, b0Var.a), new ayb(0, b0Var.b));
            return;
        }
        if (uxd0Var instanceof uxd0.c0) {
            uxd0.c0 c0Var = (uxd0.c0) uxd0Var;
            s().c(new cwb0.g0(c0Var.a), c0Var.b);
            return;
        }
        if (uxd0Var instanceof uxd0.d0) {
            uxd0.d0 d0Var = (uxd0.d0) uxd0Var;
            List<MemberAction> list = d0Var.a;
            boolean z2 = d0Var.b;
            kp5 kp5Var = d0Var.c;
            ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_REDESIGN;
            imFeatures.getClass();
            if (!com.vk.toggle.b.A.a(imFeatures)) {
                s().b(new cwb0.k0(list, true, z2), kp5Var, null);
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Context context4 = this.b;
            int i3 = w8m.a;
            ref$ObjectRef.element = new rew(context4, w8m.d(new cwb0.k0(list, true, z2)), new zf1(4, kp5Var, ref$ObjectRef), null).c.b(context4, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
            return;
        }
        if (uxd0Var instanceof uxd0.y) {
            bzb0.d(s(), cwb0.f0.l, ((uxd0.y) uxd0Var).a, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.k0) {
            bzb0.d(s(), cwb0.z0.l, ((uxd0.k0) uxd0Var).a, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.z) {
            s().c(cwb0.e0.e, ((uxd0.z) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.l0) {
            s().c(cwb0.y0.e, ((uxd0.l0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.j0) {
            s().c(cwb0.d.e, ((uxd0.j0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.n0) {
            s().c(cwb0.c.e, ((uxd0.n0) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.w) {
            zk70.e(((uxd0.w) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.x) {
            uxd0.x xVar = (uxd0.x) uxd0Var;
            s().f(xVar.a, xVar.b);
            return;
        }
        if (uxd0Var instanceof uxd0.c) {
            s().a();
            this.F.dismiss();
            return;
        }
        if (uxd0Var instanceof uxd0.o) {
            bzb0.d(s(), new cwb0.s(this.b), ((uxd0.o) uxd0Var).a, null, null, 28);
            return;
        }
        if (uxd0Var instanceof uxd0.p) {
            s().c(cwb0.t.e, ((uxd0.p) uxd0Var).a);
            return;
        }
        if (uxd0Var instanceof uxd0.q0) {
            this.H.b((uxd0.q0) uxd0Var);
            return;
        }
        if (uxd0Var instanceof uxd0.a) {
            ((uxd0.a) uxd0Var).a.invoke(this).invoke();
            return;
        }
        if (uxd0Var instanceof uxd0.i) {
            s().b(new cwb0.i(0), new byb(((uxd0.i) uxd0Var).a, i2), null);
            return;
        }
        if (uxd0Var instanceof uxd0.j) {
            s().c(new cwb0.s0(null, 0, 7), ((uxd0.j) uxd0Var).a);
        } else if (uxd0Var instanceof uxd0.m0) {
            s().c(new cwb0.s0(null, 0, 7), ((uxd0.m0) uxd0Var).a);
        } else if (uxd0Var.equals(uxd0.h.a)) {
            s().b(new cwb0.a(e43.l(AccountAvatarAction.OPEN_STORY, AccountAvatarAction.OPEN)), new jy(this, 27), null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final bzb0 s() {
        return (bzb0) this.E.getValue();
    }

    public final void t(zxd0 zxd0Var) {
        this.I.onNext(zxd0Var);
    }

    public final void u(boolean z) {
        Drawable a;
        int i = z ? -1 : -2;
        AppBarLayout appBarLayout = this.f;
        AppBarLayout appBarLayout2 = appBarLayout == null ? null : appBarLayout;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        layoutParams.height = i;
        appBarLayout2.setLayoutParams(layoutParams);
        this.V = !z;
        if (z) {
            View view = this.B;
            if (view == null) {
                view = null;
            }
            a = new ColorDrawable(dhr0.Y(R.attr.vk_ui_background_content, view.getContext()));
        } else {
            View view2 = this.B;
            if (view2 == null) {
                view2 = null;
            }
            Context context = view2.getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(R.drawable.bg_rounded_corners_bottom_20, context);
        }
        View view3 = this.B;
        (view3 != null ? view3 : null).setBackground(a);
    }

    public final void w(DialogExt dialogExt, CharSequence charSequence, boolean z) {
        Dialog Cb = dialogExt.Cb();
        if (Cb == null) {
            return;
        }
        bzb0.e(s(), new cwb0.q(this.b, Cb, charSequence), new f66(this, z, 1));
    }

    public final void x(AppBarLayoutStateListener.AppBarState appBarState) {
        ChatProfileActionsView chatProfileActionsView = this.j;
        if (chatProfileActionsView == null || !chatProfileActionsView.Q4()) {
            ChatProfileActionsView chatProfileActionsView2 = this.j;
            if (chatProfileActionsView2 != null) {
                f4m.j(chatProfileActionsView2);
                return;
            }
            return;
        }
        int i = C1143a.$EnumSwitchMapping$0[appBarState.ordinal()];
        if (i == 1) {
            ChatProfileActionsView chatProfileActionsView3 = this.j;
            if (chatProfileActionsView3 != null) {
                chatProfileActionsView3.setVisibility(0);
            }
            ChatProfileActionsView chatProfileActionsView4 = this.j;
            if (chatProfileActionsView4 != null) {
                int childCount = chatProfileActionsView4.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    chatProfileActionsView4.getChildAt(i2).setClickable(true);
                }
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChatProfileActionsView chatProfileActionsView5 = this.j;
            if (chatProfileActionsView5 != null) {
                chatProfileActionsView5.setVisibility(4);
                return;
            }
            return;
        }
        ChatProfileActionsView chatProfileActionsView6 = this.j;
        if (chatProfileActionsView6 != null) {
            chatProfileActionsView6.setVisibility(0);
        }
        ChatProfileActionsView chatProfileActionsView7 = this.j;
        if (chatProfileActionsView7 != null) {
            int childCount2 = chatProfileActionsView7.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                chatProfileActionsView7.getChildAt(i3).setClickable(false);
            }
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        AppBarLayout appBarLayout = this.f;
        if (appBarLayout == null) {
            appBarLayout = null;
        }
        appBarLayout.setExpanded(false);
    }

    public final void y(AppBarLayoutStateListener.AppBarState appBarState) {
        int i = C1143a.$EnumSwitchMapping$0[appBarState.ordinal()];
        if (i == 1) {
            VkImAvatar vkImAvatar = this.i;
            if (vkImAvatar == null) {
                vkImAvatar = null;
            }
            vkImAvatar.setVisibility(0);
            VkImAvatar vkImAvatar2 = this.i;
            (vkImAvatar2 != null ? vkImAvatar2 : null).setClickable(this.l);
            return;
        }
        if (i == 2) {
            VkImAvatar vkImAvatar3 = this.i;
            if (vkImAvatar3 == null) {
                vkImAvatar3 = null;
            }
            vkImAvatar3.setVisibility(0);
            VkImAvatar vkImAvatar4 = this.i;
            (vkImAvatar4 != null ? vkImAvatar4 : null).setClickable(false);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        VkImAvatar vkImAvatar5 = this.i;
        if (vkImAvatar5 == null) {
            vkImAvatar5 = null;
        }
        vkImAvatar5.setVisibility(4);
        VkImAvatar vkImAvatar6 = this.i;
        (vkImAvatar6 != null ? vkImAvatar6 : null).setClickable(this.l);
    }

    public final void z(boolean z) {
        Activity activity = this.N;
        if (activity.getIntent().getBooleanExtra("app_content_hidden", false)) {
            return;
        }
        if (z) {
            activity.getWindow().addFlags(8192);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            activity.getWindow().clearFlags(8192);
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
