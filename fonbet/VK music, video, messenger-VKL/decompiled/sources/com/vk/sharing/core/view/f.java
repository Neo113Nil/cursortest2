package com.vk.sharing.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.grid.AutoGridLayoutManager;
import com.vk.sharing.core.view.grid.LayoutMode;
import com.vk.sharing.core.view.k;
import com.vk.sharing.core.view.l;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.aj6;
import xsna.ajd0;
import xsna.akd0;
import xsna.an10;
import xsna.awt0;
import xsna.b0u0;
import xsna.b1z;
import xsna.b290;
import xsna.b410;
import xsna.b990;
import xsna.bbb0;
import xsna.bi80;
import xsna.bj6;
import xsna.bwt0;
import xsna.by20;
import xsna.c3r0;
import xsna.c5g;
import xsna.cn;
import xsna.d3j0;
import xsna.da50;
import xsna.dbj0;
import xsna.dhr0;
import xsna.dqg;
import xsna.e550;
import xsna.epx;
import xsna.f4m;
import xsna.f540;
import xsna.f550;
import xsna.fm20;
import xsna.fnj;
import xsna.gax0;
import xsna.gd40;
import xsna.gzs;
import xsna.gzw;
import xsna.h440;
import xsna.he30;
import xsna.hk70;
import xsna.hod;
import xsna.hp30;
import xsna.hv1;
import xsna.iah0;
import xsna.ieg;
import xsna.ify;
import xsna.in60;
import xsna.io60;
import xsna.iri0;
import xsna.iut0;
import xsna.j5b0;
import xsna.j5g;
import xsna.jaa0;
import xsna.jw5;
import xsna.k5j0;
import xsna.kbj0;
import xsna.kcj0;
import xsna.kr50;
import xsna.lva0;
import xsna.mcj0;
import xsna.mhy;
import xsna.mk5;
import xsna.mqe0;
import xsna.msy;
import xsna.ncj0;
import xsna.nid0;
import xsna.nlf0;
import xsna.o25;
import xsna.oa01;
import xsna.oa6;
import xsna.obj0;
import xsna.odc0;
import xsna.ofc0;
import xsna.owi;
import xsna.p6n;
import xsna.pj8;
import xsna.pvh0;
import xsna.pwh0;
import xsna.pxp;
import xsna.q9i0;
import xsna.qcj0;
import xsna.qfq;
import xsna.qno0;
import xsna.r;
import xsna.rcj0;
import xsna.re40;
import xsna.rf20;
import xsna.rj60;
import xsna.rme0;
import xsna.rny;
import xsna.s3q0;
import xsna.sa6;
import xsna.scj0;
import xsna.su80;
import xsna.swe0;
import xsna.t01;
import xsna.tu80;
import xsna.u11;
import xsna.u110;
import xsna.u1u0;
import xsna.u210;
import xsna.u74;
import xsna.uh40;
import xsna.ux40;
import xsna.v16;
import xsna.vk9;
import xsna.w16;
import xsna.w1u0;
import xsna.w74;
import xsna.w88;
import xsna.wf40;
import xsna.wgr;
import xsna.wm80;
import xsna.wmd0;
import xsna.wq20;
import xsna.wt30;
import xsna.x1e0;
import xsna.x550;
import xsna.x750;
import xsna.x850;
import xsna.yhu;
import xsna.yzs;
import xsna.ze6;
import xsna.zh0;
import xsna.zmp0;

/* compiled from: SharingV2View.kt */
@SuppressLint({"ClickableViewAccessibility", "ViewConstructor", Command.HTTP_HEADER_RANGE})
/* loaded from: classes5.dex */
public final class f extends CoordinatorLayout implements l {
    public static final Object g1 = new Object();
    public static final int h1 = iah0.a(512);
    public static final int i1 = iah0.a(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
    public static final float j1 = iah0.a(48);
    public final boolean A;
    public final Object A0;
    public final boolean B;
    public final Object B0;
    public final Boolean C;
    public final Object C0;
    public l.a D;
    public final Object D0;
    public l.a E;
    public final Object E0;
    public w74 F;
    public ValueAnimator F0;
    public final Object G;
    public boolean G0;
    public final InterceptingBottomSheetBehavior<?> H;
    public int H0;
    public final Object I;
    public final scj0 I0;
    public final Object J;
    public final LinearLayoutManager J0;
    public final Object K;
    public final AutoGridLayoutManager K0;
    public final Object L;
    public final pxp L0;
    public final Object M;
    public final e M0;
    public final Object N;
    public final k N0;
    public final Object O;
    public final io.reactivex.rxjava3.disposables.c O0;
    public final Object P;
    public List<Target> P0;
    public final Object Q;
    public String Q0;
    public final Object R;
    public boolean R0;
    public final Object S;
    public final int S0;
    public final obj0 T;
    public boolean T0;
    public final Object U;
    public final int U0;
    public final Object V;
    public final int V0;
    public final Object W;
    public final int W0;
    public final int X0;
    public boolean Y0;
    public boolean Z0;
    public final Object a0;
    public final float a1;
    public final Object b0;
    public final float b1;
    public final Object c0;
    public boolean c1;
    public final Object d0;
    public boolean d1;
    public final Object e0;
    public boolean e1;
    public final Object f0;
    public ze6 f1;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final Object p0;
    public final Object q0;
    public final Object r0;
    public final Object s0;
    public final Object t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public final Object x0;
    public View y0;
    public final boolean z;
    public final gax0 z0;

    /* compiled from: SharingV2View.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutMode.values().length];
            try {
                iArr[LayoutMode.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SchemeStat$TypeShareItem.ShareType.values().length];
            try {
                iArr2[SchemeStat$TypeShareItem.ShareType.CREATE_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SchemeStat$TypeShareItem.ShareType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SchemeStat$TypeShareItem.ShareType.COMMUNITY_WALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Boolean.valueOf(((Target) t2).g), Boolean.valueOf(((Target) t).g));
        }
    }

    public f(ContextWrapper contextWrapper, boolean z, k.a aVar, Integer num, boolean z2, boolean z3, Boolean bool) {
        super(contextWrapper, null, 0);
        this.z = z;
        this.A = z2;
        this.B = z3;
        this.C = bool;
        f550 f550Var = new f550(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, f550Var);
        this.I = msy.a(lazyThreadSafetyMode, new wt30(this, 18));
        this.J = msy.a(lazyThreadSafetyMode, new iri0(this, 1));
        this.K = msy.a(lazyThreadSafetyMode, new by20(this, 29));
        this.L = msy.a(lazyThreadSafetyMode, new pwh0(this, 5));
        this.M = msy.a(lazyThreadSafetyMode, new da50(this, 22));
        this.N = msy.a(lazyThreadSafetyMode, new bbb0(this, 16));
        this.O = msy.a(lazyThreadSafetyMode, new u210(this, 27));
        this.P = msy.a(lazyThreadSafetyMode, new nid0(this, 6));
        this.Q = msy.a(lazyThreadSafetyMode, new x1e0(this, 7));
        this.R = msy.a(lazyThreadSafetyMode, new io60(this, 28));
        this.S = msy.a(lazyThreadSafetyMode, new d3j0(this, 1));
        this.U = msy.a(lazyThreadSafetyMode, new akd0(this, 10));
        this.V = msy.a(lazyThreadSafetyMode, new fm20(this, 27));
        this.W = msy.a(lazyThreadSafetyMode, new hp30(this, 20));
        this.a0 = msy.a(lazyThreadSafetyMode, new x850(this, 26));
        this.b0 = msy.a(lazyThreadSafetyMode, new odc0(this, 13));
        this.c0 = msy.a(lazyThreadSafetyMode, new wf40(this, 26));
        this.d0 = msy.a(lazyThreadSafetyMode, new pvh0(this, 2));
        int i = 6;
        this.e0 = msy.a(lazyThreadSafetyMode, new rme0(this, i));
        this.f0 = msy.a(lazyThreadSafetyMode, new ajd0(this, i));
        this.g0 = msy.a(lazyThreadSafetyMode, new f540(this, 27));
        this.h0 = msy.a(lazyThreadSafetyMode, new x550(this, 23));
        this.i0 = msy.a(lazyThreadSafetyMode, new b1z(this, 27));
        this.j0 = msy.a(lazyThreadSafetyMode, new u110(this, 18));
        this.k0 = msy.a(lazyThreadSafetyMode, new b290(this, 19));
        this.l0 = msy.a(lazyThreadSafetyMode, new in60(this, 15));
        this.m0 = msy.a(lazyThreadSafetyMode, new lva0(this, 17));
        int i2 = 19;
        this.n0 = msy.a(lazyThreadSafetyMode, new su80(this, i2));
        this.o0 = msy.a(lazyThreadSafetyMode, new wm80(this, i2));
        this.p0 = msy.a(lazyThreadSafetyMode, new jaa0(this, 14));
        this.q0 = msy.a(lazyThreadSafetyMode, new b990(this, 15));
        this.r0 = msy.a(lazyThreadSafetyMode, new tu80(this, 23));
        this.s0 = msy.a(lazyThreadSafetyMode, new bi80(this, 19));
        this.t0 = msy.a(lazyThreadSafetyMode, new wmd0(this, 7));
        this.u0 = msy.a(lazyThreadSafetyMode, new kr50(this, 25));
        this.v0 = msy.a(lazyThreadSafetyMode, new gd40(this, 24));
        this.w0 = msy.a(lazyThreadSafetyMode, new re40(this, 23));
        this.x0 = msy.a(lazyThreadSafetyMode, new rf20(this, 29));
        this.A0 = msy.a(lazyThreadSafetyMode, new hk70(this, 19));
        this.B0 = msy.a(lazyThreadSafetyMode, new b410(this, 29));
        this.C0 = msy.a(lazyThreadSafetyMode, new mqe0(this, 8));
        this.D0 = msy.a(lazyThreadSafetyMode, new e550(this, 28));
        this.E0 = msy.a(lazyThreadSafetyMode, new r(26));
        this.I0 = new scj0(contextWrapper);
        this.P0 = EmptyList.b;
        this.R0 = true;
        this.T0 = true;
        this.a1 = 0.9f;
        float f = 3;
        this.b1 = (((1 - 0.9f) / f) * 2) + 0.9f;
        View.inflate(contextWrapper, R.layout.layout_sharing_v2_view, this);
        this.V0 = (int) contextWrapper.getResources().getDimension(R.dimen.sharing_target_item_height);
        int dimension = x1() ? i1 : (int) contextWrapper.getResources().getDimension(R.dimen.sharing_default_peek_height);
        this.U0 = (int) contextWrapper.getResources().getDimension(R.dimen.sharing_target_list_bottom_padding);
        this.W0 = (int) contextWrapper.getResources().getDimension(R.dimen.sharing_header_row_vertical_margin_top);
        this.X0 = (int) contextWrapper.getResources().getDimension(R.dimen.sharing_header_row_vertical_margin_bottom);
        this.S0 = contextWrapper.getColor(R.color.picker_semi_transparent_background);
        setBackgroundColor(0);
        e1();
        this.z0 = new gax0(getSettingsLayout());
        yhu yhuVar = new yhu(this, 29);
        obj0 obj0Var = new obj0();
        obj0Var.d = new ArrayList<>();
        obj0Var.c = yhuVar;
        this.T = obj0Var;
        getExternalAppsList().setAdapter(obj0Var);
        getBackButton().setOnClickListener(new zh0(this, 5));
        k kVar = new k(this, aVar, num, A1(), x1() ? LayoutMode.GRID : LayoutMode.LIST);
        this.N0 = kVar;
        RecyclerView list = getList();
        list.setAdapter(kVar);
        list.setHasFixedSize(false);
        list.setItemAnimator(null);
        awt0.g(list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setOrientation(1);
        this.J0 = linearLayoutManager;
        float f2 = 82;
        AutoGridLayoutManager autoGridLayoutManager = new AutoGridLayoutManager(contextWrapper, iah0.a(f2));
        this.K0 = autoGridLayoutManager;
        autoGridLayoutManager.x = new d(this);
        pxp pxpVar = new pxp(iah0.a(f2), iah0.a(f));
        this.L0 = pxpVar;
        if (x1()) {
            float f3 = 16;
            getList().setPadding(iah0.a(f3), iah0.a(f), iah0.a(f3), getList().getPaddingBottom());
        }
        getList().setLayoutManager(x1() ? autoGridLayoutManager : linearLayoutManager);
        if (x1()) {
            getList().setItemAnimator(new rny());
            getList().addItemDecoration(pxpVar);
        }
        findViewById(R.id.retry_button).setOnClickListener(new pj8(this, 9));
        this.M0 = new e(this);
        getActionsView().setListener(new nlf0(this, 1));
        getActionsView().setRedesignEnabled(A1());
        bwt0.i0(getSendButton(), new h440(this, 19));
        bwt0.i0(getSendButtonRedesign(), new ux40(this, 28));
        bwt0.i0(getCreateChatButtonRedesign(), new wq20(aVar, 29));
        bwt0.i0(getSendFromCommentButtonRedesign(), new uh40(this, 27));
        getTitleView().setOnClickListener(new v16(this, 8));
        getSettingsButton().setOnClickListener(new w16(this, 11));
        getBottomControlsContainer().setVisibility(8);
        awt0.u(getBottomContainerSeparator(), A1());
        getFooterContainer().setBackgroundColor(dhr0.Y(A1() ? R.attr.vk_ui_background_contrast_themed : R.attr.vk_ui_background_secondary, contextWrapper));
        f4m.y(A1() ? 0 : iah0.a(8), getFooterContainer());
        boolean A1 = A1();
        int i3 = R.attr.vk_ui_background_content;
        getBottomSheet().setBackgroundTintList(ColorStateList.valueOf(dhr0.Y(A1 ? R.attr.vk_ui_background_modal : R.attr.vk_ui_background_content, contextWrapper)));
        f4m.a(getBottomSheet(), new ofc0(this, 8));
        g gVar = new g(this);
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) getBottomSheet().getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar.a;
        InterceptingBottomSheetBehavior<?> interceptingBottomSheetBehavior = new InterceptingBottomSheetBehavior<>(contextWrapper, null);
        interceptingBottomSheetBehavior.L = !z;
        interceptingBottomSheetBehavior.V(true);
        interceptingBottomSheetBehavior.T(true);
        interceptingBottomSheetBehavior.W(dimension, false);
        interceptingBottomSheetBehavior.X(5);
        interceptingBottomSheetBehavior.U(bottomSheetBehavior.G);
        interceptingBottomSheetBehavior.K = bottomSheetBehavior.K;
        interceptingBottomSheetBehavior.k0 = o1();
        interceptingBottomSheetBehavior.l0 = new x750(this, 24);
        interceptingBottomSheetBehavior.D(gVar);
        this.H = interceptingBottomSheetBehavior;
        fVar.c(interceptingBottomSheetBehavior);
        getBottomSheet().requestLayout();
        getSearchInputView().X4(false);
        getSearchInputView().setOnBackClickListener(new kcj0(this, 0));
        getSearchInputView().getEditView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.lcj0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                if (z4) {
                    com.vk.sharing.core.view.f fVar2 = com.vk.sharing.core.view.f.this;
                    l.a aVar2 = fVar2.D;
                    if (aVar2 != null) {
                        aVar2.O2(fVar2.A1());
                    }
                    if (fVar2.x1()) {
                        fVar2.X1(LayoutMode.LIST);
                    }
                }
            }
        });
        int i4 = 10;
        getSearchInputView().getEditView().setOnClickListener(new oa6(this, i4));
        getSearchInputView().setActionClickListener(new aj6(this, i4));
        getSearchInputView().getEditView().setImeOptions(268435459);
        this.O0 = new gzw.a(new qno0(getSearchInputView().getEditView())).z(100L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k5j0(new mcj0(this, 0), 1));
        getCommentInputCommonClearButtonView().setOnClickListener(new bj6(this, 7));
        oa01.a(getCommentInputCommonView(), new j5b0(this, 11));
        getCommentInputCommonView().setOnTouchListener(new ncj0());
        getCommentInputCommonView().setBackgroundColor(dhr0.Y(A1() ? i3 : R.attr.vk_ui_background_modal, contextWrapper));
        f4m.x(contextWrapper.getResources().getDimensionPixelSize(A1() ? R.dimen.vk_ui_spacing_size2_xl : R.dimen.sharing_comment_margin_left), getCommentInputCommonView());
        getCommentInputWallPostClearButtonView().setOnClickListener(new sa6(this, 10));
        oa01.a(getCommentInputWallPostView(), new q9i0(this, 4));
        bwt0.R(getHeaderContainer(), new yzs() { // from class: xsna.ocj0
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                com.vk.sharing.core.view.f.this.c2(false);
                return s3q0.a;
            }
        });
        bwt0.R(getBottomControlsContainer(), new he30(this, 1));
        bwt0.R(getContentAnimator(), new dqg(this, 2));
        if (z3) {
            VKAvatarView avatarView = getAvatarView();
            cn o = o25.a().o();
            avatarView.setVisibility(0);
            VKAvatarView.Z0(avatarView, o.c, new com.vk.im.ui.views.avatars.b(contextWrapper, true).f(), null, null, 12);
            bwt0.i0(avatarView, new rj60(this, 20));
            avatarView.setAccessibilityDelegate(new c(contextWrapper, o));
        }
        setOnClickListener(new t01(this, 9));
    }

    public static void J0(f fVar) {
        fVar.Y0 = true;
        fVar.setBackground(fVar.S0);
    }

    public static s3q0 K0(f fVar) {
        fVar.getList().setPadding(fVar.getList().getPaddingLeft(), fVar.getList().getPaddingTop(), fVar.getList().getPaddingRight(), fVar.getBottomControlsContainer().getHeight() + fVar.U0);
        fVar.c2(false);
        return s3q0.a;
    }

    public static void Q0(f fVar) {
        fVar.getCommentInputCommonView().getText().clear();
    }

    public static s3q0 S0(f fVar, CharSequence charSequence) {
        String str;
        awt0.v(fVar.getCommentInputCommonClearButtonView(), (fVar.A1() || fVar.x1() || charSequence.length() == 0 || ((str = fVar.Q0) != null && str.length() != 0)) ? false : true);
        return s3q0.a;
    }

    public static void T0(f fVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) fVar.getCreateChatButtonRedesign().getLayoutParams();
        layoutParams.weight = floatValue;
        fVar.getCreateChatButtonRedesign().setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) fVar.getSendButtonRedesign().getLayoutParams();
        layoutParams2.weight = 2.0f - floatValue;
        layoutParams2.setMarginStart((int) u11.b(1, floatValue, iah0.a(4), iah0.a(12)));
        fVar.getSendButtonRedesign().setLayoutParams(layoutParams2);
    }

    public static void U0(f fVar) {
        fVar.getCommentInputWallPostView().getText().clear();
    }

    public static s3q0 W0(f fVar) {
        if (fVar.w1()) {
            fVar.getSearchInputView().getEditView().setEnabled(false);
            fVar.getSearchInputView().V4();
            fVar.getListOverlay().setVisibility(0);
            f4m.j(fVar.getCommentContainer());
            f4m.j(fVar.getSharingSendRedesignContainer());
            fVar.getSendingLoaderRedesign().setVisibility(0);
        }
        l.a aVar = fVar.D;
        if (aVar != null) {
            aVar.E2(!fVar.w1());
        }
        return s3q0.a;
    }

    public static void X0(f fVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) fVar.getCreateChatButtonRedesign().getLayoutParams();
        layoutParams.weight = floatValue;
        fVar.getCreateChatButtonRedesign().setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) fVar.getSendButtonRedesign().getLayoutParams();
        layoutParams2.weight = 2.0f - floatValue;
        layoutParams2.setMarginStart((int) ((iah0.a(-4) * floatValue) + iah0.a(16)));
        fVar.getSendButtonRedesign().setLayoutParams(layoutParams2);
    }

    public static final void c1(f fVar, float f) {
        int i = fVar.S0;
        if (fVar.Y0) {
            fVar.Z1();
            fVar.getBottomControlsContainer().setTranslationY(Math.max(fVar.getBottomControlsContainer().getHeight() + (fVar.getBottomSheet().getTop() - fVar.getHeight()), 0));
            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fVar.setBackgroundColor(i);
            } else {
                fVar.setBackground(c3r0.b(-swe0.f(f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), i, 0));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SharingActionsView getActionsView() {
        return (SharingActionsView) this.e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getAttachmentContainer() {
        return (FrameLayout) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKAvatarView getAvatarView() {
        return (VKAvatarView) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatImageView getBackButton() {
        return (AppCompatImageView) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getBottomContainerSeparator() {
        return (View) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getBottomControlsContainer() {
        return (ViewGroup) this.b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getBottomSheet() {
        return (FrameLayout) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getCommentContainer() {
        return (View) this.x0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageButton getCommentInputCommonClearButtonView() {
        return (ImageButton) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatImageView getCommentInputCommonIconView() {
        return (AppCompatImageView) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getCommentInputCommonTopShadowView() {
        return (View) this.k0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final EditText getCommentInputCommonView() {
        return (EditText) this.h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ImageButton getCommentInputWallPostClearButtonView() {
        return (ImageButton) this.m0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final EditText getCommentInputWallPostView() {
        return (EditText) this.l0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewAnimator getContentAnimator() {
        return (ViewAnimator) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getContentContainer() {
        return (View) this.O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getCreateChatButtonRedesign() {
        return (View) this.u0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getDisabledHintView() {
        return (View) this.n0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getEmptyView() {
        return (TextView) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getErrorView() {
        return (TextView) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getExternalAppsDivider() {
        return (View) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getExternalAppsList() {
        return (RecyclerView) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewAnimator getFooterAnimator() {
        return (ViewAnimator) this.a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewGroup getFooterContainer() {
        return (ViewGroup) this.d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getHeaderContainer() {
        return (FrameLayout) this.J.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getHeaderShadow() {
        return (View) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getList() {
        return (RecyclerView) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getListOverlay() {
        return (View) this.r0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkSearchView getSearchInputView() {
        return (VkSearchView) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSendButton() {
        return (View) this.o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getSendButtonRedesign() {
        return (VkButton) this.t0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getSendButtonTitle() {
        return (TextView) this.p0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getSendContainer() {
        return (LinearLayout) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSendFromCommentButtonRedesign() {
        return (View) this.q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSendingLoaderRedesign() {
        return (View) this.v0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LottieAnimationView getSendingSuccessAnimation() {
        return (LottieAnimationView) this.w0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSettingsButton() {
        return (View) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSettingsLayout() {
        return (View) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSharingSendRedesignContainer() {
        return (View) this.s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTitleView() {
        return (TextView) this.L.getValue();
    }

    private final void setBackground(int i) {
        setBackgroundColor(i);
        if (getContext() instanceof AppCompatActivity) {
            u1u0.h(((AppCompatActivity) getContext()).getWindow(), i);
        }
    }

    public static s3q0 w0(f fVar, CharSequence charSequence) {
        String str;
        awt0.v(fVar.getCommentInputWallPostClearButtonView(), charSequence.length() != 0 && ((str = fVar.Q0) == null || str.length() == 0));
        return s3q0.a;
    }

    public static void y0(f fVar, ValueAnimator valueAnimator) {
        fVar.setBackground(c3r0.b(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0, fVar.S0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean A1() {
        return ((Boolean) this.B0.getValue()).booleanValue();
    }

    public final void B1() {
        if (o1()) {
            W1();
            return;
        }
        l.a aVar = this.D;
        if (aVar != null) {
            aVar.h2();
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void D0(int i) {
        this.N0.notifyItemChanged(i);
    }

    @Override // com.vk.sharing.core.view.l
    public final void Dj() {
        getSettingsButton().setVisibility(0);
        getAvatarView().setVisibility(8);
    }

    public final void E1(ActionsInfo actionsInfo, ze6 ze6Var, int i) {
        String str = actionsInfo.c;
        if (actionsInfo.e) {
            getActionsView().c(actionsInfo, i);
        } else {
            getActionsView().b(actionsInfo, i);
        }
        this.f1 = ze6Var;
        if (str.isEmpty()) {
            return;
        }
        this.Q0 = str;
        this.R0 = (actionsInfo.b & 131072) > 0;
        if (!actionsInfo.a(A1())) {
            Gg();
        } else {
            G1(getCommentInputWallPostView(), getCommentInputWallPostClearButtonView(), this.Q0);
            G1(getCommentInputCommonView(), getCommentInputCommonClearButtonView(), this.Q0);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void E9() {
        getSearchInputView().X4(true);
    }

    public final void G1(EditText editText, ImageButton imageButton, String str) {
        String str2;
        if (str == null || str.length() == 0) {
            if (A1()) {
                return;
            }
            editText.post(new vk9(editText, 10));
            return;
        }
        editText.setText(str);
        if (this.R0 && (str2 = this.Q0) != null && str2.length() != 0) {
            editText.setKeyListener(null);
            editText.setFocusable(false);
            editText.setCursorVisible(false);
        }
        f4m.j(imageButton);
    }

    @Override // com.vk.sharing.core.view.l
    public final void Gf() {
        this.Z0 = true;
        getBackButton().setImageResource(R.drawable.vk_icon_arrow_left_outline_28);
        Z1();
    }

    @Override // com.vk.sharing.core.view.l
    public final void Gg() {
        getCommentInputCommonTopShadowView().setVisibility(8);
        getCommentContainer().setVisibility(8);
    }

    @Override // com.vk.sharing.core.view.l
    public final void I1() {
        getFooterAnimator().setVisibility(8);
    }

    public final void J1(boolean z) {
        boolean z2 = this.z;
        int i = (z || z2) ? 3 : 4;
        if (z2) {
            z = true;
        }
        this.c1 = z;
        InterceptingBottomSheetBehavior<?> interceptingBottomSheetBehavior = this.H;
        int i2 = interceptingBottomSheetBehavior.M;
        if (i2 != i && i2 != 3) {
            interceptingBottomSheetBehavior.X(i);
        }
        getBottomControlsContainer().setTranslationY(getBottomControlsContainer().getHeight());
        getBottomControlsContainer().setVisibility(0);
        getBottomControlsContainer().animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.pcj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.vk.sharing.core.view.f.y0(com.vk.sharing.core.view.f.this, valueAnimator);
            }
        }).withEndAction(new hv1(this, 17)).start();
    }

    public final void K1() {
        getExternalAppsDivider().setVisibility(0);
        getExternalAppsList().setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void L1(int i, boolean z) {
        if (i == 3 && ((Boolean) this.D0.getValue()).booleanValue()) {
            getFooterAnimator().setInAnimation(getContext(), R.anim.slide_up_enter);
        } else {
            getFooterAnimator().setInAnimation(null);
        }
        getFooterAnimator().setDisplayedChild(i);
        O1(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    @Override // com.vk.sharing.core.view.l
    public final void Mh(List<Target> list, boolean z) {
        boolean z2 = z && this.A && !x1();
        k kVar = this.N0;
        kVar.h = z2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Target target = (Target) obj;
            if (target.zb() && target.c != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Target target2 = (Target) it.next();
            l.a delegate = getDelegate();
            if (delegate != null) {
                target2.g = delegate.h(target2);
            }
            arrayList2.add(target2);
        }
        ArrayList arrayList3 = arrayList2;
        if (A1()) {
            arrayList3 = j5g.D0(new b(), arrayList2);
        }
        m.a(new k.b(this.P0, arrayList3), true).b(kVar);
        this.P0 = arrayList3;
        if (list.isEmpty() || this.H.M == 3) {
            return;
        }
        c2(false);
    }

    @Override // com.vk.sharing.core.view.l
    public final void Nj() {
        getSettingsLayout().setVisibility(0);
    }

    public final void O1(boolean z) {
        l.a aVar;
        if (!z && ((aVar = this.D) == null || !aVar.I2())) {
            getFooterAnimator().setVisibility(0);
        } else {
            if (this.d1) {
                return;
            }
            getFooterAnimator().setVisibility(0);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void O8() {
        this.T0 = false;
        getSearchInputView().U4();
    }

    @Override // com.vk.sharing.core.view.l
    public final void Pg() {
        getSendButton().setEnabled(false);
    }

    @Override // com.vk.sharing.core.view.l
    public final void Pk() {
        this.Z0 = false;
        getBackButton().setImageResource(R.drawable.vk_icon_cancel_outline_28);
        Z1();
    }

    @Override // com.vk.sharing.core.view.l
    public final int S1(Target target) {
        Iterator<Target> it = this.P0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (target == it.next()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.vk.sharing.core.view.l
    public final void Sb() {
        getList().addItemDecoration(this.L0);
        this.N0.getClass();
    }

    public final void U1(int i) {
        O1(false);
        L1(i, false);
        (i == 3 ? getSendButtonRedesign() : getSendButton()).setVisibility(0);
        r1(i == 3);
        G1(getCommentInputWallPostView(), getCommentInputWallPostClearButtonView(), this.Q0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void Ul(kbj0.a aVar) {
        int i = a.$EnumSwitchMapping$1[aVar.b.ordinal()];
        if (i == 1) {
            this.G0 = true;
            this.H.k0 = o1();
            t1(null);
            Long l = aVar.c;
            if (l != null) {
                postDelayed(new wgr(this, l.longValue(), 1), 500L);
                return;
            }
            return;
        }
        if (i == 2 || i == 3) {
            this.G0 = true;
            this.H.k0 = o1();
            f4m.j(getSendingLoaderRedesign());
            getSendingSuccessAnimation().setVisibility(0);
            getSendingSuccessAnimation().m0();
            getSendingSuccessAnimation().U(new rcj0(this));
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void V5() {
        getDisabledHintView().setVisibility(8);
        getSendButton().setEnabled(true);
        EditText commentInputWallPostView = getCommentInputWallPostView();
        commentInputWallPostView.setVisibility(0);
        String str = this.Q0;
        if (str == null || str.length() == 0) {
            return;
        }
        commentInputWallPostView.setKeyListener(null);
        commentInputWallPostView.setFocusable(false);
        commentInputWallPostView.setCursorVisible(false);
    }

    @Override // com.vk.sharing.core.view.l
    public final boolean Vg() {
        return !TextUtils.isGraphic(getSearchInputView().getQuery());
    }

    @Override // com.vk.sharing.core.view.l
    public final void Vm() {
        mk5 mk5Var = new mk5();
        mk5Var.e(100L);
        mk5Var.excludeTarget(R.id.content_animator, true);
        zmp0.a(this, mk5Var.excludeTarget(R.id.targets_recycler, true));
        getDisabledHintView().setVisibility(0);
    }

    public final void W1() {
        VkTooltip.a aVar = new VkTooltip.a(getContext());
        aVar.b = getResources().getString(R.string.sharing_send_tooltip_title);
        aVar.e = VkTooltip.Appearance.Inversion;
        aVar.f = VkTooltip.TooltipGravity.BOTTOM;
        aVar.a(bwt0.F(getSendButtonRedesign()));
        this.G0 = true;
        this.H.k0 = o1();
        scj0 scj0Var = this.I0;
        int i = scj0Var.a.getInt("send_help_tooltip_shown_count", 0) + 1;
        SharedPreferences.Editor edit = scj0Var.a.edit();
        edit.putInt("send_help_tooltip_shown_count", i);
        edit.apply();
    }

    public final void X1(LayoutMode layoutMode) {
        RecyclerView.l itemAnimator = getList().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.k();
        }
        getList().removeItemDecoration(this.L0);
        int i = a.$EnumSwitchMapping$0[layoutMode.ordinal()];
        if (i == 1) {
            float f = 16;
            getList().setPadding(iah0.a(f), iah0.a(3), iah0.a(f), getList().getPaddingBottom());
            getList().setLayoutManager(this.K0);
            getList().setItemAnimator(new rny());
            getList().addItemDecoration(this.L0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getList().setPadding(0, 0, 0, getList().getPaddingBottom());
            getList().setLayoutManager(this.J0);
            getList().setItemAnimator(null);
        }
        k kVar = this.N0;
        if (kVar.g != layoutMode) {
            kVar.g = layoutMode;
            kVar.notifyItemRangeChanged(0, kVar.getItemCount());
            kVar.c.getView().postDelayed(new hod(kVar, 16), 300L);
        }
        this.H.k0 = o1();
    }

    @Override // xsna.ify.a
    public final void Y0() {
        if (this.d1) {
            this.d1 = false;
            l.a aVar = this.D;
            if (aVar != null) {
                aVar.x2(false);
            }
            l.a aVar2 = this.D;
            if (aVar2 != null && aVar2.I2()) {
                O1(false);
            }
            if (A1() || x1()) {
                f4m.j(getSendFromCommentButtonRedesign());
            }
        }
        this.H.k0 = o1();
    }

    public final void Y1() {
        ((ViewGroup.MarginLayoutParams) getContentContainer().getLayoutParams()).topMargin = (f4m.h(getHeaderContainer()) ? this.W0 : 0) + (f4m.h(getSearchInputView()) ? this.X0 : 0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void Ye() {
        getSettingsLayout().setVisibility(8);
    }

    public final void Z1() {
        boolean z = this.Z0;
        float f = j1;
        if (z || this.z) {
            if (getBackButton().getVisibility() == 0 && getBackButton().getAlpha() == 1.0f) {
                return;
            }
            getBackButton().setAlpha(1.0f);
            getBackButton().setVisibility(0);
            getTitleView().setTranslationX(f);
            getBackButton().setScaleX(1.0f);
            getBackButton().setScaleY(1.0f);
            return;
        }
        float bottom = getMeasuredHeight() == 0 ? 0.0f : (getBottom() - getBottomSheet().getTop()) / getMeasuredHeight();
        float f2 = this.b1;
        if (bottom < f2) {
            if (!this.Z0 && this.H.M == 4) {
                getBackButton().setVisibility(4);
                getTitleView().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            } else {
                getBackButton().setScaleX(0.6f);
                getBackButton().setScaleY(0.6f);
                getBackButton().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                getBackButton().setVisibility(4);
            }
        }
        float f3 = this.a1;
        if (bottom < f3) {
            getTitleView().setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        float f4 = 1;
        float f5 = (bottom - f3) / (f4 - f3);
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        float f6 = (bottom - f2) / (f4 - f2);
        float f7 = f6 <= 1.0f ? f6 : 1.0f;
        if (f7 >= 0.6f) {
            getBackButton().setScaleX(f7);
            getBackButton().setScaleY(f7);
        }
        getBackButton().setAlpha(f7);
        getBackButton().setVisibility(f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 4 : 0);
        getTitleView().setTranslationX(f * f5);
    }

    @Override // com.vk.sharing.core.view.l
    public final void ae(ActionsInfo actionsInfo, int i) {
        if (actionsInfo.e) {
            getActionsView().c(actionsInfo, i);
        } else {
            getActionsView().b(actionsInfo, i);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void b6() {
        boolean z = false;
        L1(0, true);
        if (!A1() && !x1()) {
            z = true;
        }
        r1(z);
    }

    public final void c2(boolean z) {
        int i;
        int i2;
        if (this.z) {
            return;
        }
        InterceptingBottomSheetBehavior<?> interceptingBottomSheetBehavior = this.H;
        if (interceptingBottomSheetBehavior.M != 3) {
            l.a aVar = this.D;
            if (aVar == null || !aVar.q2()) {
                if ((z || !this.c1) && getMeasuredHeight() != 0) {
                    int b2 = an10.b(getMeasuredHeight() * this.a1) - getHeaderContainer().getHeight();
                    if (getBottomControlsContainer().getVisibility() == 0) {
                        i = getBottomControlsContainer().getHeight() - (f4m.h(getCommentInputCommonTopShadowView()) ? getCommentInputCommonTopShadowView().getHeight() : 0);
                    } else {
                        i = 0;
                    }
                    int size = (getContentContainer().getVisibility() == 0 && getList().getVisibility() == 0) ? this.P0.size() * this.V0 : 0;
                    int height = getHeaderContainer().getVisibility() == 0 ? getHeaderContainer().getHeight() + size : size;
                    if (getSearchInputView().getVisibility() == 0) {
                        height += getSearchInputView().getHeight();
                    }
                    if (getContentAnimator().getVisibility() == 0 && ((getContentAnimator().getDisplayedChild() != 2 || size == 0) && getContentAnimator().getDisplayedChild() != 0)) {
                        height += getContentAnimator().getHeight();
                    }
                    int i3 = height + i;
                    if (i3 <= b2) {
                        interceptingBottomSheetBehavior.X(4);
                        b2 = i3 + (size > 0 ? this.U0 : 0);
                        interceptingBottomSheetBehavior.L = this.D.w2();
                    } else if (iah0.r(getContext()) && fnj.c(getContext())) {
                        interceptingBottomSheetBehavior.X(3);
                        interceptingBottomSheetBehavior.L = false;
                    } else {
                        if (!this.c1) {
                            interceptingBottomSheetBehavior.X(4);
                        }
                        interceptingBottomSheetBehavior.L = true;
                    }
                    if (this.c1) {
                        return;
                    }
                    if (x1() && b2 > (i2 = i1)) {
                        b2 = i2;
                    }
                    interceptingBottomSheetBehavior.W(b2, true);
                }
            }
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void d0() {
        mhy.d(getRootView());
    }

    public final void d2(int i, int i2, boolean z) {
        this.H0 = i;
        this.H.k0 = o1();
        if (A1() && w1()) {
            getSendButtonRedesign().setCount(i == 0 ? null : Integer.valueOf(i));
            ValueAnimator valueAnimator = this.F0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i3 = 2;
            if (!z && i2 == i) {
                int i4 = 1;
                if (i2 > 1) {
                    if (getCreateChatButtonRedesign().getVisibility() == 0) {
                        return;
                    }
                    getCreateChatButtonRedesign().setVisibility(0);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    this.F0 = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(100L);
                    }
                    ValueAnimator valueAnimator2 = this.F0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addUpdateListener(new p6n(this, i4));
                    }
                    ValueAnimator valueAnimator3 = this.F0;
                    if (valueAnimator3 != null) {
                        valueAnimator3.start();
                        return;
                    }
                    return;
                }
            }
            if (getCreateChatButtonRedesign().getVisibility() == 8) {
                return;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.F0 = ofFloat2;
            if (ofFloat2 != null) {
                ofFloat2.setDuration(100L);
            }
            ValueAnimator valueAnimator4 = this.F0;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new w88(this, i3));
            }
            ValueAnimator valueAnimator5 = this.F0;
            if (valueAnimator5 != null) {
                valueAnimator5.addListener(new qcj0(this));
            }
            ValueAnimator valueAnimator6 = this.F0;
            if (valueAnimator6 != null) {
                valueAnimator6.start();
            }
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void e0() {
        owi.a(g1, 300L, new dbj0(this, 1));
    }

    public final void e1() {
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = h1;
        if (i > i2) {
            getBottomSheet().getLayoutParams().width = i2;
            getBottomControlsContainer().getLayoutParams().width = i2;
        } else {
            getBottomSheet().getLayoutParams().width = -1;
            getBottomControlsContainer().getLayoutParams().width = -1;
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void ee() {
        f4m.j(getSearchInputView());
        Y1();
    }

    @Override // com.vk.sharing.core.view.l
    public final void f0() {
        owi.b(g1);
        if (w1()) {
            this.N0.y0(false);
        }
        if (this.P0.isEmpty()) {
            if (getContentAnimator().getDisplayedChild() != 2) {
                getContentAnimator().setDisplayedChild(2);
            }
        } else if (getContentAnimator().getDisplayedChild() != 0) {
            getContentAnimator().setDisplayedChild(0);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void g0() {
        owi.b(g1);
        if (w1()) {
            this.N0.y0(false);
        }
        if (getContentAnimator().getDisplayedChild() != 3) {
            getContentAnimator().setDisplayedChild(3);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public String getCommentText() {
        return getCommentInputCommonView().getVisibility() == 0 ? getCommentInputCommonView().getText().toString() : getCommentInputWallPostView().getText().toString();
    }

    @Override // com.vk.sharing.core.view.l
    public l.a getDelegate() {
        return this.E;
    }

    @Override // com.vk.sharing.core.view.l
    public boolean getFullScreen() {
        return this.H.M == 3;
    }

    @Override // com.vk.sharing.core.view.l
    public l.a getPresenter() {
        return this.D;
    }

    @Override // com.vk.sharing.core.view.l
    public List<Target> getTargets() {
        return this.P0;
    }

    @Override // com.vk.sharing.core.view.l
    public gax0 getWallPostSettingsView() {
        return this.z0;
    }

    @Override // com.vk.sharing.core.view.l
    public final void h0(final boolean z) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (isAttachedToWindow()) {
            J1(z);
            return;
        }
        Runnable runnable = new Runnable() { // from class: xsna.jcj0
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.sharing.core.view.f.this.J1(z);
            }
        };
        int[] iArr = u1u0.a;
        getViewTreeObserver().addOnPreDrawListener(new w1u0(this, runnable));
    }

    @Override // com.vk.sharing.core.view.l
    public final void hide() {
        t1(null);
    }

    @Override // com.vk.sharing.core.view.l
    public final void hideTitle() {
        f4m.j(getHeaderContainer());
        Y1();
    }

    @Override // com.vk.sharing.core.view.l
    public final void i0() {
        getContentContainer().setVisibility(0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void il() {
        w74 w74Var = this.F;
        if (w74Var == null) {
            return;
        }
        u74.e eVar = (u74.e) w74Var;
        View b2 = eVar.b(getContext(), getSendContainer());
        Bundle bundle = eVar.a;
        if (bundle != null) {
            eVar.a(bundle);
        }
        this.y0 = b2;
        FrameLayout attachmentContainer = getAttachmentContainer();
        attachmentContainer.removeAllViews();
        attachmentContainer.addView(this.y0);
        attachmentContainer.setVisibility(0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void j7() {
        getHeaderContainer().setVisibility(0);
        Y1();
    }

    @Override // com.vk.sharing.core.view.l
    public final void mh(boolean z) {
        if (z) {
            U1(1);
        } else {
            u1();
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void n8() {
        if (x1()) {
            X1(LayoutMode.GRID);
        } else {
            X1(LayoutMode.LIST);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void nk() {
        if (this.y0 == null) {
            return;
        }
        FrameLayout attachmentContainer = getAttachmentContainer();
        attachmentContainer.removeView(this.y0);
        attachmentContainer.setVisibility(8);
        this.y0 = null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean o1() {
        return ((Boolean) this.D0.getValue()).booleanValue() && (!this.G0 && this.I0.a.getInt("send_help_tooltip_shown_count", 0) < 3) && (this.H0 > 0 && this.N0.g == LayoutMode.GRID && !this.d1);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getList().addOnScrollListener(this.M0);
        int i = ify.a;
        ify.a(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e1();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getBottomSheet().clearAnimation();
        getList().removeOnScrollListener(this.M0);
        int i = ify.a;
        ify.g(this);
        super.onDetachedFromWindow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SharingV2ViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SharingV2ViewSavedState sharingV2ViewSavedState = (SharingV2ViewSavedState) parcelable;
        super.onRestoreInstanceState(sharingV2ViewSavedState.getSuperState());
        this.G0 = sharingV2ViewSavedState.b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final Parcelable onSaveInstanceState() {
        SharingV2ViewSavedState sharingV2ViewSavedState = new SharingV2ViewSavedState(super.onSaveInstanceState());
        sharingV2ViewSavedState.b = this.G0;
        return sharingV2ViewSavedState;
    }

    @Override // com.vk.sharing.core.view.l
    public final void p3() {
        getContentContainer().setVisibility(8);
    }

    public final void r1(boolean z) {
        awt0.v(getCommentInputCommonIconView(), !A1() && z);
        awt0.v(getSendFromCommentButtonRedesign(), A1() && this.d1 && z);
        awt0.v(getCommentInputCommonClearButtonView(), (A1() || epx.f(getCommentInputCommonView().getText().toString(), "") || !z) ? false : true);
        awt0.v(getCommentInputCommonTopShadowView(), !A1() && z);
        if (z && getCommentInputCommonView().getVisibility() != 0) {
            getCommentInputCommonView().setVisibility(0);
            getCommentInputCommonView().setText(getCommentInputWallPostView().getText());
        } else {
            if (z || getCommentInputCommonView().getVisibility() == 8) {
                return;
            }
            if (getCommentInputCommonView().hasFocus()) {
                d0();
            }
            getCommentInputCommonView().setVisibility(8);
            getCommentInputWallPostView().setText(getCommentInputCommonView().getText());
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void se() {
        getList().scrollToPosition(0);
    }

    @Override // com.vk.sharing.core.view.l
    public void setAttachmentViewHolder(w74 w74Var) {
        this.F = w74Var;
    }

    @Override // com.vk.sharing.core.view.l
    public void setCommentHint(boolean z) {
        getCommentInputCommonView().setHint(getResources().getString(z ? R.string.sharing_hint_comment_add_message : R.string.sharing_hint_comment_add_comment));
        getCommentInputCommonIconView().setImageResource(z ? R.drawable.vk_icon_message_outline_28 : R.drawable.vk_icon_comment_outline_28);
    }

    @Override // com.vk.sharing.core.view.l
    public void setDelegatePresenter(l.a aVar) {
        this.E = aVar;
    }

    @Override // com.vk.sharing.core.view.l
    public void setEmptyText(String str) {
        getEmptyView().setText(str);
    }

    @Override // com.vk.sharing.core.view.l
    public void setErrorMessage(String str) {
        getErrorView().setText(str);
    }

    @Override // com.vk.sharing.core.view.l
    public void setExternalApps(List<? extends qfq> list) {
        obj0 obj0Var = this.T;
        ArrayList<qfq> arrayList = obj0Var.d;
        arrayList.clear();
        arrayList.addAll(list);
        obj0Var.notifyDataSetChanged();
    }

    @Override // com.vk.sharing.core.view.l
    public void setFullScreen(boolean z) {
        if (this.z) {
            return;
        }
        this.c1 = z;
        this.H.X(z ? 3 : 4);
    }

    @Override // com.vk.sharing.core.view.l
    public void setPostForFriendsOnlyHint(boolean z) {
        getSendButtonTitle().setText(getResources().getString(z ? R.string.sharing_send_button_for_friends_only_label : R.string.sharing_send_button_label));
    }

    @Override // com.vk.sharing.core.view.l
    public void setPresenter(l.a aVar) {
        this.D = aVar;
        if (w1()) {
            aVar.z2();
        }
    }

    @Override // com.vk.sharing.core.view.l
    public void setSearchHint(String str) {
        getSearchInputView().setHint(str);
    }

    @Override // com.vk.sharing.core.view.l
    public void setSearchQuery(String str) {
        getSearchInputView().setQuery(str);
    }

    @Override // com.vk.sharing.core.view.l
    public void setToggleFaveActionIsEnabled(boolean z) {
        getActionsView().setToggleFaveActionIsEnabled(z);
    }

    @Override // com.vk.sharing.core.view.l
    public final void showTitle() {
        getHeaderContainer().setVisibility(0);
        getList().requestFocus();
        Y1();
    }

    public final void t1(gzs<s3q0> gzsVar) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (isAttachedToWindow()) {
            ify.g(this);
            this.H.X(5);
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        } else {
            ieg iegVar = new ieg(2, this, gzsVar);
            int[] iArr = u1u0.a;
            getViewTreeObserver().addOnPreDrawListener(new w1u0(this, iegVar));
        }
        io.reactivex.rxjava3.disposables.c cVar = this.O0;
        if (cVar.h()) {
            return;
        }
        cVar.dispose();
    }

    @Override // com.vk.sharing.core.view.l
    public final void t3(String str) {
        L1(2, true);
        r1(!A1());
        ((TextView) getDisabledHintView().findViewById(R.id.title)).setText(str);
    }

    @Override // com.vk.sharing.core.view.l
    public final void ta() {
        if (this.N0.getItemCount() <= 0 || ((LinearLayoutManager) getList().getLayoutManager()).s() == 0) {
            return;
        }
        getList().smoothScrollToPosition(0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void tg() {
        getList().removeItemDecoration(this.L0);
        this.N0.getClass();
    }

    @Override // com.vk.sharing.core.view.l
    public final void tm() {
        getSearchInputView().X4(false);
    }

    @Override // com.vk.sharing.core.view.l
    public final void u0(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            getTitleView().setVisibility(8);
            return;
        }
        getTitleView().setVisibility(0);
        getTitleView().setText(str);
        if (A1()) {
            return;
        }
        com.vk.typography.b.k(getTitleView(), FontFamily.MEDIUM, Float.valueOf(z ? 23.0f : 20.0f), 4);
    }

    public final void u1() {
        getFooterAnimator().setVisibility(8);
        r1((A1() || x1()) ? false : true);
        G1(getCommentInputCommonView(), getCommentInputCommonClearButtonView(), this.Q0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void ug(boolean z) {
        if (z) {
            U1(3);
        } else {
            u1();
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void uk() {
        getSearchInputView().setVisibility(0);
        Y1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean w1() {
        return ((Boolean) this.E0.getValue()).booleanValue();
    }

    @Override // com.vk.sharing.core.view.l
    public final void w7() {
        getSettingsButton().setVisibility(8);
        if (this.B) {
            getAvatarView().setVisibility(0);
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        boolean z = i > 0;
        if (this.d1 != z) {
            this.d1 = z;
            l.a aVar = this.D;
            if (aVar != null && aVar.I2()) {
                I1();
            }
            if ((A1() || x1()) && f4m.h(getCommentInputCommonView())) {
                getSendFromCommentButtonRedesign().setVisibility(0);
            }
            l.a aVar2 = this.D;
            if (aVar2 != null) {
                aVar2.x2(this.d1);
            }
        }
        this.H.k0 = o1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean x1() {
        return ((Boolean) this.C0.getValue()).booleanValue();
    }

    @Override // com.vk.sharing.core.view.l
    public final void x4() {
        awt0.v(getCommentInputCommonTopShadowView(), !A1());
        getCommentContainer().setVisibility(0);
    }

    @Override // com.vk.sharing.core.view.l
    public final void xa() {
        if (w1()) {
            this.N0.y0(true);
        } else if (getContentAnimator().getDisplayedChild() != 1) {
            getContentAnimator().setDisplayedChild(1);
        }
        c2(false);
    }

    @Override // com.vk.sharing.core.view.l
    public final void xm() {
        owi.b(g1);
        if (w1()) {
            this.N0.y0(false);
        }
        if (getContentAnimator().getDisplayedChild() != 0) {
            getContentAnimator().setDisplayedChild(0);
        }
    }

    @Override // com.vk.sharing.core.view.l
    public final void z8(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        L1(2, true);
        r1(!A1());
        ((TextView) getDisabledHintView().findViewById(R.id.subtitle)).setText(str);
    }

    @Override // com.vk.sharing.core.view.l
    public View getView() {
        return this;
    }
}
