package com.vk.newsfeed.impl.fragments;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.newsfeed.impl.views.NoSwipePaginatedView;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import defpackage.g;
import io.reactivex.rxjava3.disposables.c;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.ac5;
import xsna.awt0;
import xsna.b0u0;
import xsna.b25;
import xsna.bhu;
import xsna.bo8;
import xsna.bqx0;
import xsna.bwt0;
import xsna.c9c0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.e88;
import xsna.enj;
import xsna.ey50;
import xsna.f4m;
import xsna.fcn;
import xsna.fnj;
import xsna.fxc0;
import xsna.g620;
import xsna.h4x;
import xsna.h88;
import xsna.hbt0;
import xsna.hv;
import xsna.iah0;
import xsna.ify;
import xsna.iut0;
import xsna.j4;
import xsna.ji0;
import xsna.jj3;
import xsna.k6s0;
import xsna.l6s0;
import xsna.mdg;
import xsna.mh;
import xsna.mhy;
import xsna.msy;
import xsna.mzp0;
import xsna.nzl;
import xsna.o25;
import xsna.o78;
import xsna.ojf0;
import xsna.p78;
import xsna.pc3;
import xsna.r78;
import xsna.ry0;
import xsna.s4;
import xsna.s78;
import xsna.t78;
import xsna.tbu0;
import xsna.tj2;
import xsna.u080;
import xsna.u11;
import xsna.u3g0;
import xsna.ucp;
import xsna.xgy;
import xsna.z4;

/* compiled from: BottomSheetCommentsFragment.kt */
/* loaded from: classes4.dex */
public class BottomSheetCommentsFragment extends PostViewFragment implements fcn, e88, ify.a {
    public static final nzl.a f1 = new nzl.a(0.75f);
    public static final int g1 = iah0.a(16);
    public final t78 V0;
    public s78 W0;
    public final Object X0;
    public ModalBottomSheetBehavior<View> Y0;
    public c Z0;
    public final Object a1;
    public final Object b1;
    public final Object c1;
    public final b d1;
    public final a e1;

    /* compiled from: BottomSheetCommentsFragment.kt */
    public static final class a implements b25.a {
        public a() {
        }

        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            com.vk.lists.c cVar;
            BottomSheetCommentsFragment bottomSheetCommentsFragment = BottomSheetCommentsFragment.this;
            mdg mdgVar = bottomSheetCommentsFragment.S;
            if (mdgVar != null && (cVar = mdgVar.P) != null) {
                cVar.p(false);
            }
            u3g0 u3g0Var = bottomSheetCommentsFragment.X;
            if (u3g0Var != null) {
                u3g0Var.setActive(tbu0Var.b());
            }
        }
    }

    /* compiled from: BottomSheetCommentsFragment.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            float height = view.getHeight();
            nzl.a aVar = BottomSheetCommentsFragment.f1;
            float a = (1.0f - BottomSheetCommentsFragment.f1.a(view.getContext())) * height;
            RecyclerPaginatedView recyclerPaginatedView = BottomSheetCommentsFragment.this.W;
            if (recyclerPaginatedView != null) {
                f4m.q((int) a, recyclerPaginatedView);
            }
        }
    }

    public BottomSheetCommentsFragment() {
        mzp0 mzp0Var = this.J;
        ry0 ry0Var = new ry0(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        t78 t78Var = new t78(this, mzp0Var, msy.a(lazyThreadSafetyMode, ry0Var));
        Ho(t78Var);
        this.V0 = t78Var;
        this.X0 = msy.a(lazyThreadSafetyMode, new ji0(this, 11));
        this.a1 = msy.a(lazyThreadSafetyMode, new tj2(2));
        this.b1 = msy.a(lazyThreadSafetyMode, new z4(this, 13));
        this.c1 = msy.a(lazyThreadSafetyMode, new mh(this, 14));
        this.d1 = new b();
        this.e1 = new a();
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final hbt0 Ao() {
        return null;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final boolean Bo() {
        return false;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public c9c0 Co() {
        return this.V0;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Fo(View view, Bundle bundle) {
        Bundle arguments;
        Parcelable parcelable;
        String Ab;
        Object parcelable2;
        super.Fo(view, bundle);
        if (!fxc0.B().J().h0() || (arguments = getArguments()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = arguments.getParcelable("entry", Videos.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = arguments.getParcelable("entry");
            if (!(parcelable3 instanceof Videos)) {
                parcelable3 = null;
            }
            parcelable = (Videos) parcelable3;
        }
        Videos videos = (Videos) parcelable;
        if (videos == null || (Ab = videos.Ab()) == null) {
            return;
        }
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            j4 j4Var = new j4(3, this, Ab);
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                writeBar.T(true, j4Var);
            }
        }
        ((VideoChannelComponent) this.X0.getValue()).p8();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Ko(RecyclerPaginatedView recyclerPaginatedView) {
        Context context;
        int c;
        Integer d;
        Integer d2;
        Integer num = null;
        NoSwipePaginatedView noSwipePaginatedView = recyclerPaginatedView instanceof NoSwipePaginatedView ? (NoSwipePaginatedView) recyclerPaginatedView : null;
        if (noSwipePaginatedView != null) {
            noSwipePaginatedView.setCloseListener(new s4(this, 13));
        }
        Bundle arguments = getArguments();
        if (!(arguments != null ? arguments.getBoolean("BottomSheetCommentsFragment.is_back_button_enabled", false) : false) || (context = recyclerPaginatedView.getContext()) == null) {
            return;
        }
        Bundle arguments2 = getArguments();
        int intValue = (arguments2 == null || (d2 = bo8.d(arguments2, "BottomSheetCommentsFragment.iconBackButton")) == null) ? R.drawable.vk_icon_back_24 : d2.intValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (d = bo8.d(arguments3, "BottomSheetCommentsFragment.iconColorBackButton")) != null) {
            int intValue2 = d.intValue();
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                e3m.a aVar = e3m.a;
                num = Integer.valueOf(mo2getContext.getColor(intValue2));
            }
            if (num != null) {
                c = num.intValue();
                Drawable c2 = enj.c(intValue, c, context);
                if (noSwipePaginatedView == null) {
                    noSwipePaginatedView.setIcon(c2);
                    return;
                }
                return;
            }
        }
        c = dhr0.t.c(R.attr.vk_ui_icon_accent_themed);
        Drawable c22 = enj.c(intValue, c, context);
        if (noSwipePaginatedView == null) {
        }
    }

    public void Lo(RecyclerPaginatedView recyclerPaginatedView) {
        bwt0.d(recyclerPaginatedView, iah0.b(12.0f), (r4 & 2) != 0, (r4 & 4) != 0);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public com.vk.core.ui.bottomsheet.internal.b Mo() {
        nzl nzlVar = new nzl(requireContext(), f1);
        h88 h88Var = (h88) this.c1.getValue();
        return h88Var != null ? h88Var.c(requireContext(), nzlVar) : nzlVar;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    public final void No() {
        c9c0 Co = Co();
        String str = null;
        Integer valueOf = Co != null ? Integer.valueOf(((com.vk.newsfeed.impl.presenters.b) Co).g0()) : null;
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            if (valueOf != null && (valueOf.intValue() > 0 || !o25.a().b())) {
                str = requireContext().getString(R.string.disable_comment_video_text);
            }
            u3g0Var.c(str);
        }
    }

    public final int Oo() {
        Bundle arguments;
        if (!iah0.r(requireContext()) || (arguments = getArguments()) == null) {
            return 81;
        }
        return arguments.getInt("BottomSheetCommentsFragment.landscape_gravity", 81);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Size Po() {
        h88 h88Var = (h88) this.c1.getValue();
        Integer a2 = h88Var != null ? h88Var.a() : null;
        return new Size(a2 != null ? a2.intValue() : iah0.r(requireContext()) ? iah0.a(360) : -1, -1);
    }

    public View.OnLayoutChangeListener Qo() {
        return this.d1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final l6s0 Ro() {
        return (l6s0) this.b1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public ColorDrawable So() {
        return (ColorDrawable) this.a1.getValue();
    }

    public void Uo() {
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.d = new g(this, 13);
            u3g0Var.E(new pc3(u3g0Var, 2));
            xgy xgyVar = u3g0Var.k;
            if (xgyVar != null) {
                xgyVar.l = true;
            }
            u3g0Var.A(u3g0Var.h());
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
                writeBar3.setLongtapStickerPopupGravity(85);
            }
            int width = Po().getWidth();
            WriteBar writeBar4 = u3g0Var.e;
            if (writeBar4 != null) {
                bwt0.r0(width, writeBar4);
            }
            int Oo = Oo();
            WriteBar writeBar5 = u3g0Var.e;
            if (writeBar5 != null) {
                f4m.m(Oo, writeBar5);
            }
            ViewGroup viewGroup = this.U;
            if (viewGroup != null) {
                ojf0 ojf0Var = new ojf0(cn70.b(64), true, 102);
                WriteBar writeBar6 = u3g0Var.e;
                if (writeBar6 != null) {
                    writeBar6.setBottomSheetParams(ojf0Var);
                }
                WriteBar writeBar7 = u3g0Var.e;
                if (writeBar7 != null) {
                    writeBar7.setUpdateBottomSheet(true);
                }
                u3g0Var.u(viewGroup);
            }
        }
    }

    public void Vo(View view) {
        if (fnj.d(kn())) {
            awt0.t(view, new jj3(view, 1));
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.A(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            bwt0.n0(recyclerPaginatedView, Po());
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        s78 s78Var;
        k6s0 Y4 = Ro().Y4();
        if (Y4 != null) {
            Y4.d();
        }
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null && u3g0Var.m()) {
            Ic(true);
            return true;
        }
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior = this.Y0;
        if (modalBottomSheetBehavior == null || modalBottomSheetBehavior.k != 2) {
            if (modalBottomSheetBehavior == null || modalBottomSheetBehavior.k != 5) {
                RecyclerPaginatedView recyclerPaginatedView = this.W;
                if (recyclerPaginatedView != null) {
                    ModalBottomSheetBehavior.H(recyclerPaginatedView).O(5);
                }
                u3g0 u3g0Var2 = this.X;
                if (u3g0Var2 != null) {
                    u3g0Var2.j(true);
                }
            } else {
                u3g0 u3g0Var3 = this.X;
                if (u3g0Var3 != null) {
                    u3g0Var3.j(true);
                }
                RecyclerPaginatedView recyclerPaginatedView2 = this.W;
                if (recyclerPaginatedView2 != null && (s78Var = this.W0) != null) {
                    s78Var.b(5, recyclerPaginatedView2);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void d0() {
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            mhy.d(u3g0Var.e);
        }
        u3g0 u3g0Var2 = this.X;
        if (u3g0Var2 != null) {
            u3g0Var2.A(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        u3g0 u3g0Var3 = this.X;
        if (u3g0Var3 != null) {
            u3g0Var3.clearFocus();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        Intent intent = new Intent();
        c9c0 Co = Co();
        intent.putExtra("VideoFileController_commented", Co != null ? ((com.vk.newsfeed.impl.presenters.b) Co).k : false);
        setResult(-1, intent);
        ModalBottomSheetBehavior<View> modalBottomSheetBehavior = this.Y0;
        if (modalBottomSheetBehavior != null) {
            modalBottomSheetBehavior.O(5);
        }
        Context mo2getContext = mo2getContext();
        ComponentCallbacks2 h = mo2getContext != null ? e3m.h(mo2getContext) : null;
        if (h instanceof ey50) {
            ((ey50) h).Y().H(this);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void hk(int i) {
        Bundle arguments;
        CharSequence charSequence;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        NoSwipePaginatedView noSwipePaginatedView = recyclerPaginatedView instanceof NoSwipePaginatedView ? (NoSwipePaginatedView) recyclerPaginatedView : null;
        if (noSwipePaginatedView == null || (arguments = getArguments()) == null || (charSequence = arguments.getCharSequence("custom_title")) == null) {
            return;
        }
        noSwipePaginatedView.setTitle(bhu.c(i, charSequence));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final long jo() {
        return 550L;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final int lo() {
        View view;
        h4x i;
        int i2 = 0;
        if (BuildInfo.q() && (view = getView()) != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            bqx0 a2 = iut0.e.a(view);
            Integer valueOf = (a2 == null || (i = a2.a.i(2)) == null) ? null : Integer.valueOf(i.d);
            if (valueOf != null) {
                i2 = valueOf.intValue();
            }
        }
        return ify.d(3, null) - i2;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d0();
        Size Po = Po();
        int Oo = Oo();
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            bwt0.n0(recyclerPaginatedView, Po);
            f4m.m(Oo, recyclerPaginatedView);
            recyclerPaginatedView.requestLayout();
        }
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            int width = Po.getWidth();
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                bwt0.r0(width, writeBar);
            }
            WriteBar writeBar2 = u3g0Var.e;
            if (writeBar2 != null) {
                f4m.m(Oo, writeBar2);
            }
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c cVar = this.Z0;
        if (cVar != null) {
            cVar.dispose();
        }
        View view = getView();
        if (view != null) {
            view.removeOnLayoutChangeListener(Qo());
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        int i = ify.a;
        ify.g(this);
        super.onPause();
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i = ify.a;
        ify.a(this);
        if (ify.e(ify.c)) {
            x0(lo());
        } else {
            Y0();
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.requestLayout();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        o25.a().b0(this.e1);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        o25.a().B(this.e1);
        int i = ify.a;
        if (ify.e(ify.c)) {
            Y0();
        }
        super.onStop();
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Context mo2getContext = mo2getContext();
        ComponentCallbacks2 h = mo2getContext != null ? e3m.h(mo2getContext) : null;
        if (h instanceof ey50) {
            ((ey50) h).Y().S(this);
        }
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.o = 4;
        }
        super.onViewCreated(view, bundle);
        this.U = (ViewGroup) view.findViewById(R.id.bottom_sheet_container);
        View findViewById = view.findViewById(R.id.comment_bottom_sheet_background);
        Bundle arguments = getArguments();
        int i = 0;
        if (!(arguments != null ? arguments.getBoolean("BottomSheetCommentsFragment.is_without_background", false) : false)) {
            findViewById.setBackground(So());
        }
        findViewById.setContentDescription(getString(R.string.accessibility_comments));
        bwt0.i0(findViewById, new com.vk.movika.sdk.base.observable.a(this, 10));
        Uo();
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnCancelListener(new ac5(this, 1));
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.q78
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    nzl.a aVar = BottomSheetCommentsFragment.f1;
                    if (i2 != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    BottomSheetCommentsFragment.this.a0();
                    return true;
                }
            });
        }
        Dialog dialog2 = this.s;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setGravity(80);
            u11.h(-1, -1, window.getDecorView());
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            f4m.m(Oo(), recyclerPaginatedView);
            recyclerPaginatedView.setOnApplyWindowInsetsListener(new o78());
            Lo(recyclerPaginatedView);
            bwt0.n0(recyclerPaginatedView, Po());
            if (recyclerPaginatedView instanceof NoSwipePaginatedView) {
                NoSwipePaginatedView noSwipePaginatedView = (NoSwipePaginatedView) recyclerPaginatedView;
                Bundle arguments2 = getArguments();
                noSwipePaginatedView.x(arguments2 != null ? arguments2.getBoolean("BottomSheetCommentsFragment.show_close_icon", false) : false ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) recyclerPaginatedView.getLayoutParams();
            ModalBottomSheetBehavior modalBottomSheetBehavior = new ModalBottomSheetBehavior(Mo(), null);
            modalBottomSheetBehavior.b = view;
            fVar.c(modalBottomSheetBehavior);
            RecyclerView recyclerView = getRecyclerView();
            RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            ModalBottomSheetBehavior<View> H = ModalBottomSheetBehavior.H(recyclerPaginatedView);
            H.M(true);
            H.O(5);
            Ko(recyclerPaginatedView);
            go(new p78(H, this, (LinearLayoutManager) layoutManager, i));
            this.Y0 = H;
        }
        Vo(view);
        y2();
        u3g0 u3g0Var2 = this.X;
        if (u3g0Var2 != null) {
            u3g0Var2.setActive(o25.a().b());
        }
        Bundle arguments3 = getArguments();
        if (!(arguments3 != null ? arguments3.getBoolean("BottomSheetCommentsFragment.can_comment", true) : true)) {
            No();
        }
        View view2 = getView();
        while (view2 != null) {
            view2.setFitsSystemWindows(false);
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        View requireView = requireView();
        u080 u080Var = new u080() { // from class: xsna.n78
            @Override // xsna.u080
            public final bqx0 b(View view3, bqx0 bqx0Var) {
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                int i2 = bqx0Var.a.i(8).d;
                BottomSheetCommentsFragment bottomSheetCommentsFragment = BottomSheetCommentsFragment.this;
                u3g0 u3g0Var3 = bottomSheetCommentsFragment.X;
                if (u3g0Var3 != null) {
                    u3g0Var3.A(-i2);
                }
                g420 g420Var = bottomSheetCommentsFragment.Z;
                if (g420Var != null) {
                    g420Var.n(-i2);
                }
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(requireView, u080Var);
        view.addOnLayoutChangeListener(Qo());
        c cVar = this.Z0;
        if (cVar != null) {
            cVar.dispose();
        }
        ucp ucpVar = ucp.a;
        this.Z0 = ucp.a().subscribe(new hv(new r78(view, i), 6));
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_comment_bottom_sheet_view, viewGroup, false);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final boolean t2() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        if (g620.f().k0().a(activity)) {
            return false;
        }
        o25.a().getClass();
        return true;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void to(int i) {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            f4m.v(i, recyclerPaginatedView);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void ua(boolean z) {
        WriteBar writeBar;
        if (!z) {
            No();
            return;
        }
        u3g0 u3g0Var = this.X;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        writeBar.n0();
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFullScreenBottomSheetTheme_NoAnim;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final boolean wo(int i) {
        return true;
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        int lo = lo();
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.A(-lo);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            bwt0.c0(recyclerPaginatedView.getHeight() - lo, recyclerPaginatedView);
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
            window.clearFlags(2);
            window.setNavigationBarColor(-16777216);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8209));
        }
        return yn;
    }

    public void To() {
    }
}
