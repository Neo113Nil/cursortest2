package com.vk.newsfeed.impl.writebar.overlay;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.b33;
import xsna.bwt0;
import xsna.c3g0;
import xsna.dc6;
import xsna.fcn;
import xsna.fpf0;
import xsna.g420;
import xsna.gd60;
import xsna.gzs;
import xsna.hd60;
import xsna.ify;
import xsna.k1y0;
import xsna.k7m;
import xsna.m3g0;
import xsna.m7m;
import xsna.mhy;
import xsna.n1y0;
import xsna.oz50;
import xsna.s200;
import xsna.s3q0;
import xsna.u3g0;
import xsna.w8i;
import xsna.ww50;
import xsna.xgy;
import xsna.y550;

/* compiled from: WriteBarOverlayFragment.kt */
/* loaded from: classes4.dex */
public final class WriteBarOverlayFragment extends BaseMvpFragment<Object> implements dc6, w8i, ify.a {
    public static final /* synthetic */ int a0 = 0;
    public u3g0 T;
    public g420 U;
    public ViewGroup V;
    public ViewGroup W;
    public View X;
    public final n1y0 Y = new n1y0(this, ((CommunityStrikesComponent) ((k7m) m7m.f(this)).a(fpf0.a(CommunityStrikesComponent.class))).ge());
    public final c Z = new c();

    /* compiled from: WriteBarOverlayFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: WriteBarOverlayFragment.kt */
    public final class b extends GestureDetector.SimpleOnGestureListener {
        public final int b;

        public b(Context context) {
            this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float abs = Math.abs(f2);
            boolean z = abs > Math.abs(f) && abs > ((float) this.b);
            if (z) {
                WriteBarOverlayFragment.this.dismiss();
            }
            return z;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            WriteBarOverlayFragment.this.dismiss();
            return true;
        }
    }

    /* compiled from: WriteBarOverlayFragment.kt */
    public static final class c implements fcn {
        public c() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            WriteBarOverlayFragment.this.dismiss();
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: WriteBarOverlayFragment.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            c3g0.gg((u3g0) this.receiver, null, 3);
            return s3q0.a;
        }
    }

    public final void Ic(boolean z) {
        u3g0 u3g0Var = this.T;
        if (u3g0Var != null) {
            u3g0Var.Ic(false);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        u3g0 u3g0Var = this.T;
        if (u3g0Var != null) {
            u3g0Var.j(false);
        }
        Ic(false);
    }

    @Override // xsna.ify.a
    public final void Y0() {
        u3g0 u3g0Var = this.T;
        if (u3g0Var == null || !u3g0Var.m()) {
            dismiss();
        }
    }

    public final void d0() {
        u3g0 u3g0Var = this.T;
        if (u3g0Var != null) {
            mhy.d(u3g0Var.e);
        }
        u3g0 u3g0Var2 = this.T;
        if (u3g0Var2 != null) {
            u3g0Var2.clearFocus();
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final Object io() {
        return this.Y;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Target target;
        m3g0 m3g0Var;
        super.onActivityResult(i, i2, intent);
        u3g0 u3g0Var = this.T;
        if (u3g0Var == null) {
            return;
        }
        if (i > 10000) {
            u3g0Var.n(i, i2, intent);
        }
        if (i != 4331 || i2 != -1 || intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null || (m3g0Var = u3g0Var.c) == null) {
            return;
        }
        m3g0Var.f0(target);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ww50 v;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (v = s200.v(activity)) != null) {
            v.S(this.Z);
        }
        if (bundle != null) {
            tn();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_writebar_overlay, viewGroup, false);
        View findViewById = viewGroup2.findViewById(R.id.touch_outside);
        View findViewById2 = viewGroup2.findViewById(R.id.container);
        final GestureDetector gestureDetector = new GestureDetector(getActivity(), new b(requireContext()));
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: xsna.i1y0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = WriteBarOverlayFragment.a0;
                return gestureDetector.onTouchEvent(motionEvent);
            }
        };
        findViewById.setOnTouchListener(onTouchListener);
        findViewById2.setOnTouchListener(onTouchListener);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.comments_mentions_layout);
        gd60 a2 = hd60.a();
        n1y0 n1y0Var = this.Y;
        g420 D0 = a2.D0(n1y0Var);
        viewGroup3.addView(D0.d(viewGroup3, null));
        this.U = D0;
        u3g0 u3g0Var = new u3g0(null);
        u3g0Var.c = new m3g0(n1y0Var, u3g0Var, this.U);
        this.T = u3g0Var;
        this.W = (ViewGroup) viewGroup2.findViewById(R.id.bottom_sheet_container);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(R.id.wrapper);
        viewGroup4.addOnAttachStateChangeListener(new k1y0(viewGroup4));
        this.V = viewGroup4;
        this.X = viewGroup2.findViewById(R.id.bottom_navigation_shadow);
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        u3g0 u3g0Var = this.T;
        if (u3g0Var != null) {
            u3g0Var.onDestroyView();
        }
        this.T = null;
        g420 g420Var = this.U;
        if (g420Var != null) {
            g420Var.onDestroyView();
        }
        this.U = null;
        this.X = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50 v;
        Rn();
        FragmentActivity activity = getActivity();
        if (activity != null && (v = s200.v(activity)) != null) {
            v.H(this.Z);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        int i = ify.a;
        ify.g(this);
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i = ify.a;
        ify.a(this);
        u3g0 u3g0Var = this.T;
        if (u3g0Var == null || u3g0Var.m()) {
            return;
        }
        ho(200L, new d(0, u3g0Var, u3g0.class, "showKeyboard", "showKeyboard(Landroid/os/ResultReceiver;Z)V", 0));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u3g0 u3g0Var = this.T;
        Bundle o = u3g0Var != null ? u3g0Var.o() : null;
        if (o != null) {
            bundle.putBundle("state_reply_bar_view", o);
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        m3g0 m3g0Var;
        UserId userId;
        super.onViewCreated(view, bundle);
        n1y0 n1y0Var = this.Y;
        if (n1y0Var != null) {
            Bundle arguments = getArguments();
            if (arguments == null || (userId = (UserId) arguments.getParcelable("owner_id")) == null) {
                userId = UserId.d;
            }
            n1y0Var.d = userId;
            boolean z = false;
            n1y0Var.e = arguments != null ? arguments.getInt("item_id") : 0;
            n1y0Var.f = arguments != null ? arguments.getInt("type") : 0;
            if (arguments != null && arguments.getBoolean("can_group_comment")) {
                z = true;
            }
            n1y0Var.g = z;
            n1y0Var.h = arguments != null ? arguments.getString("track_code") : null;
            n1y0Var.i = arguments != null ? arguments.getString("access_key") : null;
            n1y0Var.j = arguments != null ? arguments.getString("ref") : null;
        }
        ViewGroup viewGroup = this.V;
        u3g0 u3g0Var = this.T;
        Bundle bundle2 = bundle != null ? bundle.getBundle("state_reply_bar_view") : null;
        Dialog dialog = this.s;
        u3g0Var.p(viewGroup, bundle2, dialog != null ? dialog.getWindow() : null);
        u3g0Var.v();
        ViewGroup viewGroup2 = this.W;
        if (viewGroup2 != null) {
            u3g0Var.u(viewGroup2);
        }
        Bundle arguments2 = getArguments();
        NewsComment newsComment = arguments2 != null ? (NewsComment) arguments2.getParcelable("payload") : null;
        if (newsComment != null && (m3g0Var = u3g0Var.c) != null) {
            m3g0Var.i0(newsComment);
        }
        xgy xgyVar = u3g0Var.k;
        if (xgyVar != null) {
            xgyVar.l = true;
        }
        if (xgyVar != null) {
            xgyVar.k = true;
        }
        WriteBar writeBar = u3g0Var.e;
        if (writeBar != null) {
            writeBar.setDisallowParentInterceptTouchEvent(true);
        }
        WriteBar writeBar2 = u3g0Var.e;
        if (writeBar2 != null) {
            writeBar2.setUseLongtapStickerScreenSize(true);
        }
        WriteBar writeBar3 = u3g0Var.e;
        if (writeBar3 != null) {
            bwt0.p0(writeBar3, true);
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        Ic(false);
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        b33 b33Var = new b33(requireContext(), R.style.WriteBarOverlayDialog);
        b33Var.setCancelable(true);
        b33Var.setCanceledOnTouchOutside(true);
        b33Var.m(1);
        Window window = b33Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.WriteBarDialogAnimation);
            window.clearFlags(2);
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
            window.setGravity(0);
            window.setSoftInputMode(16);
        }
        b33Var.setOnShowListener(new y550(this, 1));
        return b33Var;
    }
}
